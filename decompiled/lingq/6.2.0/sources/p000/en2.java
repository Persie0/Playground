package p000;

import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes.dex */
public abstract class en2 implements Comparable {
    /* JADX INFO: renamed from: a */
    public abstract long mo11268a(int i, long j);

    /* JADX INFO: renamed from: b */
    public abstract long mo11269b(long j, long j2);

    /* JADX INFO: renamed from: c */
    public abstract DurationFieldType mo11270c();

    /* JADX INFO: renamed from: d */
    public abstract long mo11271d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo11272e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo11273f();

    /* JADX INFO: renamed from: g */
    public final long m11274g(int i, long j) {
        if (i != Integer.MIN_VALUE) {
            return mo11268a(-i, j);
        }
        long j2 = i;
        if (j2 != Long.MIN_VALUE) {
            return mo11269b(j, -j2);
        }
        throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
    }
}
