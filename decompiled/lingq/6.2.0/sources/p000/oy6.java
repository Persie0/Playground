package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oy6 extends gz6 {

    /* JADX INFO: renamed from: c */
    public static final oy6 f55307c = new oy6(0, 3, 1);

    @Override // p000.gz6
    /* JADX INFO: renamed from: a */
    public final void mo3126a(pj3 pj3Var, InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        fs6 fs6Var;
        cb9 cb9Var = (cb9) pj3Var.m19200f(1);
        oj3 oj3Var = (oj3) pj3Var.m19200f(0);
        j63 j63Var = (j63) pj3Var.m19200f(2);
        fb9 fb9VarM4492h = cb9Var.m4492h();
        if (hz6Var != null) {
            try {
                fs6Var = new fs6(3, hz6Var, fb9Var);
            } catch (Throwable th) {
                fb9VarM4492h.m11731e(false);
                throw th;
            }
        } else {
            fs6Var = null;
        }
        if (!j63Var.f45109A.m15736U()) {
            cf1.m4605a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        j63Var.f45110z.m15735T(interfaceC3510qt, fb9VarM4492h, v48Var, fs6Var);
        fb9VarM4492h.m11731e(true);
        fb9Var.m11730d();
        oj3Var.getClass();
        fb9Var.m11706A(cb9Var, cb9Var.m4489d(oj3Var));
        fb9Var.m11736k();
    }
}
