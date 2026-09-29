package p000;

import com.lingq.feature.onboarding.p014v2.OnboardingSelections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lx6 {

    /* JADX INFO: renamed from: a */
    public final int f50242a;

    /* JADX INFO: renamed from: b */
    public final List f50243b;

    /* JADX INFO: renamed from: c */
    public final OnboardingSelections f50244c;

    /* JADX INFO: renamed from: d */
    public final boolean f50245d;

    /* JADX INFO: renamed from: e */
    public final boolean f50246e;

    /* JADX INFO: renamed from: f */
    public final ut6 f50247f;

    /* JADX INFO: renamed from: g */
    public final List f50248g;

    /* JADX INFO: renamed from: h */
    public final boolean f50249h;

    /* JADX INFO: renamed from: i */
    public final boolean f50250i;

    public lx6(int i, List list, OnboardingSelections onboardingSelections, boolean z, boolean z2, ut6 ut6Var, List list2, boolean z3, boolean z4) {
        onboardingSelections.getClass();
        list2.getClass();
        this.f50242a = i;
        this.f50243b = list;
        this.f50244c = onboardingSelections;
        this.f50245d = z;
        this.f50246e = z2;
        this.f50247f = ut6Var;
        this.f50248g = list2;
        this.f50249h = z3;
        this.f50250i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx6)) {
            return false;
        }
        lx6 lx6Var = (lx6) obj;
        return this.f50242a == lx6Var.f50242a && this.f50243b.equals(lx6Var.f50243b) && fa4.m11650l(this.f50244c, lx6Var.f50244c) && this.f50245d == lx6Var.f50245d && this.f50246e == lx6Var.f50246e && fa4.m11650l(this.f50247f, lx6Var.f50247f) && fa4.m11650l(this.f50248g, lx6Var.f50248g) && this.f50249h == lx6Var.f50249h && this.f50250i == lx6Var.f50250i;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e((this.f50244c.hashCode() + ux5.m22979b(Integer.hashCode(this.f50242a) * 31, 31, this.f50243b)) * 31, 31, this.f50245d), 31, this.f50246e);
        ut6 ut6Var = this.f50247f;
        return Boolean.hashCode(this.f50250i) + g9a.m12428e(ux5.m22979b((iM12428e + (ut6Var == null ? 0 : ut6Var.hashCode())) * 31, 31, this.f50248g), 31, this.f50249h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingV2UiState(currentPage=");
        sb.append(this.f50242a);
        sb.append(", activePages=");
        sb.append(this.f50243b);
        sb.append(", selections=");
        sb.append(this.f50244c);
        sb.append(", canContinue=");
        sb.append(this.f50245d);
        sb.append(", isLoading=");
        sb.append(this.f50246e);
        sb.append(", error=");
        sb.append(this.f50247f);
        sb.append(", dictionaryLocales=");
        sb.append(this.f50248g);
        sb.append(", showTrialNoDiscountTestButton=");
        sb.append(this.f50249h);
        sb.append(", isDictionaryPickerOpen=");
        return AbstractC3393o1.m17740o(sb, this.f50250i, ")");
    }
}
