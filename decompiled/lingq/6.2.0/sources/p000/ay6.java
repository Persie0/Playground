package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ay6 extends gz6 {

    /* JADX INFO: renamed from: c */
    public static final ay6 f7670c = new ay6(0, 2, 1);

    @Override // p000.gz6
    /* JADX INFO: renamed from: a */
    public final void mo3126a(pj3 pj3Var, InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        k84 k84Var = (k84) pj3Var.m19200f(1);
        int i = k84Var != null ? k84Var.f46854a : 0;
        tt0 tt0Var = (tt0) pj3Var.m19200f(0);
        if (i > 0) {
            sq6 sq6Var = new sq6();
            sq6Var.f61255c = interfaceC3510qt;
            sq6Var.f61253a = i;
            interfaceC3510qt = sq6Var;
        }
        tt0Var.m22298I(interfaceC3510qt, fb9Var, v48Var, hz6Var != null ? new fs6(3, hz6Var, fb9Var) : null);
    }
}
