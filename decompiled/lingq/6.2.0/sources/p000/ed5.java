package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ed5 extends x90 {

    /* JADX INFO: renamed from: q */
    public int f37057q;

    /* JADX INFO: renamed from: r */
    public int f37058r;

    /* JADX INFO: renamed from: s */
    public boolean f37059s;

    /* JADX INFO: renamed from: t */
    public int f37060t;

    /* JADX INFO: renamed from: u */
    public Integer f37061u;

    /* JADX INFO: renamed from: v */
    public int f37062v;

    /* JADX INFO: renamed from: w */
    public float f37063w;

    /* JADX INFO: renamed from: x */
    public boolean f37064x;

    /* JADX INFO: renamed from: y */
    public boolean f37065y;

    @Override // p000.x90
    /* JADX INFO: renamed from: c */
    public final boolean mo11062c() {
        return super.mo11062c() && m11064e() == m24411a();
    }

    @Override // p000.x90
    /* JADX INFO: renamed from: d */
    public final void mo11063d() {
        super.mo11063d();
        if (this.f37060t < 0) {
            C3386nv.m17626m("Stop indicator size must be >= 0.");
            return;
        }
        if (this.f37057q == 0) {
            if ((m24411a() > 0 || (this.f37065y && m11064e() > 0)) && this.f67952i == 0) {
                C3386nv.m17626m("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.f67948e.length >= 3) {
                    return;
                }
                C3386nv.m17626m("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m11064e() {
        if (this.f37065y) {
            return this.f37064x ? (int) (this.f67944a * this.f37063w) : this.f37062v;
        }
        return m24411a();
    }
}
