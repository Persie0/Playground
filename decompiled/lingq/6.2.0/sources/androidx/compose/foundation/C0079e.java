package androidx.compose.foundation;

import p000.AbstractC3393o1;
import p000.aj3;
import p000.b16;
import p000.e16;
import p000.s34;
import p000.tj3;
import p000.ui3;
import p000.v56;
import p000.w34;
import p000.we1;
import p000.ye1;

/* JADX INFO: renamed from: androidx.compose.foundation.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0079e implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w34 f1751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f1752b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f1753c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f1754d;

    public C0079e(w34 w34Var, ui3 ui3Var, String str, ui3 ui3Var2) {
        this.f1751a = w34Var;
        this.f1752b = ui3Var;
        this.f1753c = str;
        this.f1754d = ui3Var2;
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
        e16 e16VarMo3161g = s34.m21046a(b16.f7762a, v56Var, this.f1751a).mo3161g(new CombinedClickableElement(v56Var, null, this.f1752b, this.f1753c, this.f1754d));
        tj3Var.m22139q(false);
        return e16VarMo3161g;
    }
}
