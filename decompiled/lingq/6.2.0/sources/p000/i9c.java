package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class i9c extends g4c {

    /* JADX INFO: renamed from: b */
    public boolean f43749b;

    public i9c(kjc kjcVar) {
        super(kjcVar);
        ((kjc) this.f60774a).f47428V++;
    }

    /* JADX INFO: renamed from: E */
    public final void m13744E() {
        if (this.f43749b) {
            return;
        }
        C3386nv.m17633t("Not initialized");
    }

    /* JADX INFO: renamed from: F */
    public final void m13745F() {
        if (this.f43749b) {
            C3386nv.m17633t("Can't initialize twice");
        } else {
            if (mo5850G()) {
                return;
            }
            ((kjc) this.f60774a).f47430X.incrementAndGet();
            this.f43749b = true;
        }
    }

    /* JADX INFO: renamed from: G */
    public abstract boolean mo5850G();
}
