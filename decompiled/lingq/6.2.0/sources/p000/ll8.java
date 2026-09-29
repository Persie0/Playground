package p000;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ll8 implements il8, vl8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jl8 f49801a;

    /* JADX INFO: renamed from: b */
    public wb5 f49802b;

    /* JADX INFO: renamed from: c */
    public fs6 f49803c;

    public ll8(jl8 jl8Var) {
        this.f49801a = jl8Var;
        Object objMo10402e = jl8Var.mo10402e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objMo10402e instanceof Bundle ? (Bundle) objMo10402e : null;
        if (bundle != null && this.f49803c == null) {
            fs6 fs6Var = new fs6(new lb4(this, new y47(this, 8)));
            this.f49803c = fs6Var;
            fs6Var.m12091F(bundle);
        }
        jl8Var.mo10399a("androidx.savedstate.SavedStateRegistry", new y47(this, 6));
    }

    @Override // p000.ub5
    /* JADX INFO: renamed from: K */
    public final AbstractC3572sf mo256K() {
        wb5 wb5Var = this.f49802b;
        if (wb5Var != null) {
            return wb5Var;
        }
        wb5 wb5Var2 = new wb5(this, false);
        this.f49802b = wb5Var2;
        return wb5Var2;
    }

    @Override // p000.il8
    /* JADX INFO: renamed from: a */
    public final hl8 mo10399a(String str, ui3 ui3Var) {
        return this.f49801a.mo10399a(str, ui3Var);
    }

    @Override // p000.il8
    /* JADX INFO: renamed from: b */
    public final boolean mo10400b(Object obj) {
        return this.f49801a.mo10400b(obj);
    }

    @Override // p000.il8
    /* JADX INFO: renamed from: d */
    public final Map mo10401d() {
        return this.f49801a.mo10401d();
    }

    @Override // p000.il8
    /* JADX INFO: renamed from: e */
    public final Object mo10402e(String str) {
        return this.f49801a.mo10402e(str);
    }

    @Override // p000.vl8
    /* JADX INFO: renamed from: t */
    public final fs6 mo2118t() {
        fs6 fs6Var = this.f49803c;
        if (fs6Var == null) {
            fs6 fs6Var2 = new fs6(new lb4(this, new y47(this, 8)));
            this.f49803c = fs6Var2;
            fs6Var2.m12091F(null);
            fs6Var = fs6Var2;
        }
        return (fs6) fs6Var.f39591c;
    }
}
