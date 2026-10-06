package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqy {

    /* JADX INFO: renamed from: a */
    public static final nqy f44110a;

    /* JADX INFO: renamed from: b */
    public static final nqy f44111b;

    /* JADX INFO: renamed from: c */
    public static final nqy f44112c;

    /* JADX INFO: renamed from: d */
    public static final nqy f44113d;

    /* JADX INFO: renamed from: e */
    public static final nqy f44114e;

    /* JADX INFO: renamed from: f */
    public static final nqy f44115f;

    /* JADX INFO: renamed from: g */
    public static final nqy f44116g;

    /* JADX INFO: renamed from: h */
    public static final nqy[] f44117h;

    /* JADX INFO: renamed from: i */
    public final int f44118i;

    /* JADX INFO: renamed from: j */
    private final String f44119j;

    static {
        nqy nqyVar = new nqy("kUnknown", -1);
        f44110a = nqyVar;
        nqy nqyVar2 = new nqy("kInactive", 0);
        f44111b = nqyVar2;
        nqy nqyVar3 = new nqy("kSearching", 1);
        f44112c = nqyVar3;
        nqy nqyVar4 = new nqy("kConverged", 2);
        f44113d = nqyVar4;
        nqy nqyVar5 = new nqy("kLocked", 3);
        f44114e = nqyVar5;
        nqy nqyVar6 = new nqy("kFlashRequired", 4);
        f44115f = nqyVar6;
        nqy nqyVar7 = new nqy("kPrecapture", 5);
        f44116g = nqyVar7;
        f44117h = new nqy[]{nqyVar, nqyVar2, nqyVar3, nqyVar4, nqyVar5, nqyVar6, nqyVar7};
    }

    private nqy(String str, int i) {
        this.f44119j = str;
        this.f44118i = i;
    }

    public final String toString() {
        return this.f44119j;
    }
}
