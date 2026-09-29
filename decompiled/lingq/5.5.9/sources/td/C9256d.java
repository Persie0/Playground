package td;

/* JADX INFO: renamed from: td.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9256d extends AbstractRunnableC9250a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9262j f47946b;

    public C9256d(C9262j c9262j) {
        this.f47946b = c9262j;
    }

    @Override // td.AbstractRunnableC9250a
    /* JADX INFO: renamed from: a */
    public final void mo16640a() {
        C9262j c9262j = this.f47946b;
        if (c9262j.f47965n != null) {
            c9262j.f47953b.m15814o("Unbind from service.", new Object[0]);
            c9262j.f47952a.unbindService(c9262j.f47964m);
            c9262j.f47958g = false;
            c9262j.f47965n = null;
            c9262j.f47964m = null;
        }
        c9262j.m17622d();
    }
}
