package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mca {

    /* JADX INFO: renamed from: a */
    public final String f51083a;

    /* JADX INFO: renamed from: b */
    public final int f51084b;

    /* JADX INFO: renamed from: c */
    public final int f51085c;

    /* JADX INFO: renamed from: d */
    public int f51086d;

    /* JADX INFO: renamed from: e */
    public String f51087e;

    public mca(int i, int i2, int i3) {
        this.f51083a = i != Integer.MIN_VALUE ? AbstractC3393o1.m17732g(i, "/") : "";
        this.f51084b = i2;
        this.f51085c = i3;
        this.f51086d = Integer.MIN_VALUE;
        this.f51087e = "";
    }

    /* JADX INFO: renamed from: a */
    public final void m16767a() {
        int i = this.f51086d;
        this.f51086d = i == Integer.MIN_VALUE ? this.f51084b : i + this.f51085c;
        this.f51087e = this.f51083a + this.f51086d;
    }

    /* JADX INFO: renamed from: b */
    public final void m16768b() {
        if (this.f51086d != Integer.MIN_VALUE) {
            return;
        }
        C3386nv.m17633t("generateNewId() must be called before retrieving ids.");
    }

    public mca(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }
}
