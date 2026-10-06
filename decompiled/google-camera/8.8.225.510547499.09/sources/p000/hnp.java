package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum hnp {
    OFF(0),
    AUTO(1),
    ON(2);


    /* JADX INFO: renamed from: d */
    public final int f28521d;

    hnp(int i) {
        this.f28521d = i;
    }

    /* JADX INFO: renamed from: a */
    public static hnp m10514a(boolean z) {
        return !z ? OFF : AUTO;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10515b(hnp hnpVar) {
        return !hnpVar.equals(OFF);
    }
}
