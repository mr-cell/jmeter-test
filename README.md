# jmeter-test

To run performance test via Apache JMeter do the following:
1. `$ mvn install`
2. `$ mvn -Pptest jmeter:jmeter jmeter:results`
3. The results file will be located in `target/jmeter/results/`, in CSV format
4. The results file in CSV format can be viewed using JMeter's listeners in GUI mode 