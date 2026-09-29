package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class ooc extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public boolean f54663b;

    public ooc(kjc kjcVar) {
        super(kjcVar);
        ((kjc) this.f60774a).f47428V++;
    }

    /* JADX INFO: renamed from: E */
    public abstract boolean mo12250E();

    /* JADX INFO: renamed from: F */
    public final void m18192F() {
        if (this.f54663b) {
            return;
        }
        C3386nv.m17633t("Not initialized");
    }

    /* JADX INFO: renamed from: G */
    public final void m18193G() {
        if (this.f54663b) {
            C3386nv.m17633t("Can't initialize twice");
        } else {
            if (mo12250E()) {
                return;
            }
            ((kjc) this.f60774a).f47430X.incrementAndGet();
            this.f54663b = true;
        }
    }
}
