package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xx6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final boolean m24791a(Comparable comparable) {
        double dDoubleValue = ((Number) comparable).doubleValue();
        return dDoubleValue >= 0.95d && dDoubleValue < 1.0d;
    }

    public final boolean equals(Object obj) {
        return obj instanceof xx6;
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + (Double.hashCode(0.95d) * 31);
    }

    public final String toString() {
        return "0.95..<1.0";
    }
}
