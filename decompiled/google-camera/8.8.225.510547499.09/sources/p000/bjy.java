package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjy implements bjo {

    /* JADX INFO: renamed from: a */
    public final bjh f3545a;

    /* JADX INFO: renamed from: b */
    public final boolean f3546b;

    /* JADX INFO: renamed from: c */
    private final String f3547c;

    /* JADX INFO: renamed from: d */
    private final int f3548d;

    public bjy(String str, int i, bjh bjhVar, boolean z) {
        this.f3547c = str;
        this.f3548d = i;
        this.f3545a = bjhVar;
        this.f3546b = z;
    }

    @Override // p000.bjo
    /* JADX INFO: renamed from: a */
    public final bhi mo2528a(bgv bgvVar, bkc bkcVar) {
        return new bhw(bgvVar, bkcVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.f3547c + ", index=" + this.f3548d + "}";
    }
}
