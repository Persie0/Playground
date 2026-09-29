package cc;

/* JADX INFO: renamed from: cc.a7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1774a7 extends C1997z6 {

    /* JADX INFO: renamed from: c */
    public boolean f9675c;

    public AbstractC1774a7(C1846i7 c1846i7) {
        super(c1846i7);
        this.f10436b.f9876L++;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final void m5494h() {
        if (!this.f9675c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final void m5495j() {
        if (this.f9675c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo5496k();
        this.f10436b.f9877M++;
        this.f9675c = true;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo5496k();
}
