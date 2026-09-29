package p000;

/* JADX INFO: loaded from: classes.dex */
public class ju5 {

    /* JADX INFO: renamed from: a */
    public final long f46161a;

    static {
        new ju5(new e41(13));
        uma.m22828w(0);
        uma.m22828w(1);
        uma.m22828w(2);
        uma.m22828w(3);
        uma.m22828w(4);
        uma.m22828w(5);
        uma.m22828w(6);
        uma.m22828w(7);
    }

    public ju5(e41 e41Var) {
        String str = uma.f64080a;
        this.f46161a = Long.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju5) && this.f46161a == ((ju5) obj).f46161a;
    }

    public final int hashCode() {
        long j = this.f46161a;
        return ((int) (j ^ (j >>> 32))) * 923521;
    }
}
