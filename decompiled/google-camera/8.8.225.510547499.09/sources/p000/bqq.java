package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bqq {

    /* JADX INFO: renamed from: e */
    private static final bqp f4193e = new bqo();

    /* JADX INFO: renamed from: a */
    public final Object f4194a;

    /* JADX INFO: renamed from: b */
    public final bqp f4195b;

    /* JADX INFO: renamed from: c */
    public final String f4196c;

    /* JADX INFO: renamed from: d */
    public volatile byte[] f4197d;

    private bqq(String str, Object obj, bqp bqpVar) {
        bzq.m3275o(str);
        this.f4196c = str;
        this.f4194a = obj;
        bzq.m3278r(bqpVar);
        this.f4195b = bqpVar;
    }

    /* JADX INFO: renamed from: a */
    public static bqq m2924a(String str, Object obj, bqp bqpVar) {
        return new bqq(str, obj, bqpVar);
    }

    /* JADX INFO: renamed from: b */
    public static bqq m2925b(String str) {
        return new bqq(str, null, f4193e);
    }

    /* JADX INFO: renamed from: c */
    public static bqq m2926c(String str, Object obj) {
        return new bqq(str, obj, f4193e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bqq) {
            return this.f4196c.equals(((bqq) obj).f4196c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4196c.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.f4196c + "'}";
    }
}
