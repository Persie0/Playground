package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjr implements bjo {

    /* JADX INFO: renamed from: a */
    public final boolean f3511a;

    /* JADX INFO: renamed from: b */
    public final int f3512b;

    public bjr(int i, boolean z) {
        this.f3512b = i;
        this.f3511a = z;
    }

    @Override // p000.bjo
    /* JADX INFO: renamed from: a */
    public final bhi mo2528a(bgv bgvVar, bkc bkcVar) {
        if (bgvVar.f3212h) {
            return new bhr(this);
        }
        blx.m2680a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        switch (this.f3512b) {
            case 1:
                str = "MERGE";
                break;
            case 2:
                str = "ADD";
                break;
            case 3:
                str = "SUBTRACT";
                break;
            case 4:
                str = "INTERSECT";
                break;
            case 5:
                str = "EXCLUDE_INTERSECTIONS";
                break;
            default:
                str = "null";
                break;
        }
        return "MergePaths{mode=" + str + "}";
    }
}
