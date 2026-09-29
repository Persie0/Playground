package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hp5 extends AbstractC3102i7 {

    /* JADX INFO: renamed from: a */
    public final C3137j7 f42736a;

    public hp5(C3137j7 c3137j7) {
        this.f42736a = c3137j7;
    }

    @Override // p000.AbstractC3102i7
    /* JADX INFO: renamed from: a */
    public final void mo276a(Object obj) {
        C3399o7 c3399o7 = this.f42736a.f45128a;
        if (c3399o7 != null) {
            c3399o7.mo276a(obj);
        } else {
            C3386nv.m17633t("Launcher has not been initialized");
        }
    }
}
