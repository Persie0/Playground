package p000;

import androidx.compose.p002ui.state.ToggleableState;

/* JADX INFO: loaded from: classes.dex */
public final class z1a implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w34 f70758a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ToggleableState f70759b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f70760c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uh8 f70761d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f70762e;

    public z1a(w34 w34Var, ToggleableState toggleableState, boolean z, uh8 uh8Var, ui3 ui3Var) {
        this.f70758a = w34Var;
        this.f70759b = toggleableState;
        this.f70760c = z;
        this.f70761d = uh8Var;
        this.f70762e = ui3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        tj3 tj3Var = (tj3) ((ye1) obj2);
        tj3Var.m22111b0(-1525724089);
        Object objM22097O = tj3Var.m22097O();
        if (objM22097O == we1.f66679a) {
            objM22097O = AbstractC3393o1.m17729d(tj3Var);
        }
        v56 v56Var = (v56) objM22097O;
        e16 e16VarMo3161g = s34.m21046a(b16.f7762a, v56Var, this.f70758a).mo3161g(new uba(this.f70759b, v56Var, null, this.f70760c, this.f70761d, this.f70762e));
        tj3Var.m22139q(false);
        return e16VarMo3161g;
    }
}
