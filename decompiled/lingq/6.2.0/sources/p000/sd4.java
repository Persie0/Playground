package p000;

import kotlinx.coroutines.C3213d;

/* JADX INFO: loaded from: classes.dex */
public class sd4 extends C3213d {

    /* JADX INFO: renamed from: e */
    public final boolean f60708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd4(cd4 cd4Var) {
        super(true);
        boolean z = true;
        m15502U(cd4Var);
        q01 q01VarM15499P = m15499P();
        r01 r01Var = q01VarM15499P instanceof r01 ? (r01) q01VarM15499P : null;
        if (r01Var == null) {
            z = false;
            break;
        }
        C3213d c3213dM3668q = r01Var.m3668q();
        while (!c3213dM3668q.mo15496M()) {
            q01 q01VarM15499P2 = c3213dM3668q.m15499P();
            r01 r01Var2 = q01VarM15499P2 instanceof r01 ? (r01) q01VarM15499P2 : null;
            if (r01Var2 == null) {
                z = false;
                break;
            }
            c3213dM3668q = r01Var2.m3668q();
        }
        this.f60708e = z;
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: M */
    public final boolean mo15496M() {
        return this.f60708e;
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: N */
    public final boolean mo15497N() {
        return true;
    }
}
