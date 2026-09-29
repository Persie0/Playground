package cc;

/* JADX INFO: renamed from: cc.a5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1772a5 extends C1995z4 {

    /* JADX INFO: renamed from: b */
    public boolean f9672b;

    public AbstractC1772a5(C1897o4 c1897o4) {
        super(c1897o4);
        ((C1897o4) this.f10430a).f10075Z++;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo5491h();

    /* JADX INFO: renamed from: j */
    public final void m5492j() {
        if (!this.f9672b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5493k() {
        if (this.f9672b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo5491h()) {
            return;
        }
        ((C1897o4) this.f10430a).m5778a();
        this.f9672b = true;
    }
}
