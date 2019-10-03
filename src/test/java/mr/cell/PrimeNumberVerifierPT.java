package mr.cell;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import java.math.BigInteger;

public class PrimeNumberVerifierPT implements JavaSamplerClient {

    @Override
    public void setupTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {
        String var1 = javaSamplerContext.getParameter("var1");
        SampleResult sampleResult = new SampleResult();
        sampleResult.setSampleLabel("isPrime");
        PrimeNumberVerifier primeNumberVerifier = new PrimeNumberVerifier();
        sampleResult.sampleStart();
        boolean isPrime = primeNumberVerifier.isPrime(new BigInteger(var1));
        sampleResult.sampleEnd();
        sampleResult.setResponseData(isPrime ? "true" : "false", "UTF-8");
        sampleResult.setSuccessful(true);
        return sampleResult;
    }

    @Override
    public void teardownTest(JavaSamplerContext javaSamplerContext) {

    }

    @Override
    public Arguments getDefaultParameters() {
        Arguments defaultArguments = new Arguments();
        defaultArguments.addArgument("var1", "1");
        return defaultArguments;
    }
}
