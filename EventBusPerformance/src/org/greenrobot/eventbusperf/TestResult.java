package org.greenrobot.eventbusperf;


public class TestResult {
    protected long primaryResultMicros;
    protected int primaryResultCount;
    protected String otherTestResults;
    public TestResult(long primaryResultMicros, int primaryResultCount, String otherTestResults){
        this.primaryResultMicros = primaryResultMicros;
        this.primaryResultCount = primaryResultCount;
        this.otherTestResults = otherTestResults;
    }

    public TestResult() {
    }

    public long getPrimaryResultMicros () {
        return primaryResultMicros;
    }
    public double getPrimaryResultRate () {
        return primaryResultCount / (primaryResultMicros / 1000000d);
    }
    public String getOtherTestResults() {
        return otherTestResults;
    }
}
