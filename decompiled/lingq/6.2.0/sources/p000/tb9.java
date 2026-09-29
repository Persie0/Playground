package p000;

import androidx.compose.material3.SnackbarResult;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tb9 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62115a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sb9 f62116b;

    public /* synthetic */ tb9(sb9 sb9Var, int i) {
        this.f62115a = i;
        this.f62116b = sb9Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f62115a;
        sb9 sb9Var = this.f62116b;
        switch (i) {
            case 0:
                ((vb9) sb9Var).m23217a();
                return Boolean.TRUE;
            default:
                sm0 sm0Var = ((vb9) sb9Var).f65170b;
                if (sm0Var.m21467t() instanceof dm6) {
                    sm0Var.resumeWith(SnackbarResult.ActionPerformed);
                }
                return xfa.f68157a;
        }
    }
}
