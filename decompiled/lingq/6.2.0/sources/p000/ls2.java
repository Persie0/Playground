package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ls2 {

    /* JADX INFO: renamed from: b */
    public static final ls2 f50068b;

    /* JADX INFO: renamed from: c */
    public static final ls2 f50069c;

    /* JADX INFO: renamed from: a */
    public final ks2 f50070a;

    static {
        int i = 10;
        f50068b = new ls2(new gz8(i));
        f50069c = new ls2(new u06(i));
        new ls2(new gr7(i));
        new ls2(new s46(i));
        new ls2(new e41(i));
        new ls2(new jj5(i));
        new ls2(new tr3(i));
    }

    public ls2(ns2 ns2Var) {
        if (i1a.m13628a()) {
            this.f50070a = new vj6(ns2Var, 13);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f50070a = new qn3(ns2Var);
        } else {
            this.f50070a = new hi8(ns2Var, 14);
        }
    }
}
