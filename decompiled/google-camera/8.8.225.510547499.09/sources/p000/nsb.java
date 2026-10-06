package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nsb {

    /* JADX INFO: renamed from: a */
    public static final nsb f44349a;

    /* JADX INFO: renamed from: b */
    public static final nsb f44350b;

    /* JADX INFO: renamed from: c */
    public static final nsb f44351c;

    /* JADX INFO: renamed from: d */
    public static final nsb[] f44352d;

    /* JADX INFO: renamed from: e */
    public final int f44353e;

    /* JADX INFO: renamed from: f */
    private final String f44354f;

    static {
        nsb nsbVar = new nsb("RELIGHTING_NONE", 0);
        f44349a = nsbVar;
        nsb nsbVar2 = new nsb("RELIGHTING_PR_DEFAULT", 1);
        f44350b = nsbVar2;
        nsb nsbVar3 = new nsb("RELIGHTING_PR_OPT_IN", 2);
        f44351c = nsbVar3;
        f44352d = new nsb[]{nsbVar, nsbVar2, nsbVar3};
    }

    private nsb(String str, int i) {
        this.f44354f = str;
        this.f44353e = i;
    }

    public final String toString() {
        return this.f44354f;
    }
}
