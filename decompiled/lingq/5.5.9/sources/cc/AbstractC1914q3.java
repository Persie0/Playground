package cc;

/* JADX INFO: renamed from: cc.q3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1914q3 extends C1940t2 {

    /* JADX INFO: renamed from: b */
    public boolean f10143b;

    public AbstractC1914q3(C1897o4 c1897o4) {
        super(c1897o4);
        ((C1897o4) this.f10430a).f10075Z++;
    }

    /* JADX INFO: renamed from: h */
    public final void m5851h() {
        if (!this.f10143b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5852j() {
        if (this.f10143b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (!mo5519k()) {
            ((C1897o4) this.f10430a).m5778a();
            this.f10143b = true;
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo5519k();
}
