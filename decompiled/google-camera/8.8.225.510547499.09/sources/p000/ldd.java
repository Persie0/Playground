package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldd {

    /* JADX INFO: renamed from: a */
    public static final lgi f37973a = lgi.m15312a(33321, 36756, 33325, 33326, 33330, 33329, 33332, 33331, 33334, 33333, 33323, 36757, 33327, 33328, 33336, 33335, 33338, 33337, 33340, 33339, 32849, 35905, 36194, 36758, 35898, 35901, 34843, 34837, 36221, 36239, 36215, 36233, 36209, 36227, 32856, 35907, 36759, 32855, 32854, 32857, 34842, 34836, 36220, 36238, 36975, 36214, 36232, 36226, 36208);

    /* JADX INFO: renamed from: b */
    public static final lgi f37974b;

    /* JADX INFO: renamed from: c */
    public final int f37975c;

    static {
        lgi.m15312a(33321, 33330, 33329, 33332, 33331, 33334, 33333, 33323, 33336, 33335, 33338, 33337, 33340, 33339, 32849, 36194, 32856, 35907, 32855, 32854, 32857, 36220, 36238, 36975, 36214, 36232, 36226, 36208);
        f37974b = lgi.m15312a(33321, 36756, 33325, 33323, 36757, 33327, 32849, 35905, 36194, 36758, 35898, 35901, 34843, 32856, 35907, 36759, 32855, 32854, 32857, 34842);
    }

    private ldd() {
        lku.m15670x(f37973a.m15313b(), "Not a valid GL sized format: 32856");
        this.f37975c = 32856;
    }

    /* JADX INFO: renamed from: a */
    public static ldd m15198a() {
        return new ldd();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m15199b() {
        return f37974b.m15313b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldd)) {
            return false;
        }
        int i = ((ldd) obj).f37975c;
        return true;
    }

    public final int hashCode() {
        return 32856;
    }

    public final String toString() {
        return "GLFormat[32856]";
    }
}
