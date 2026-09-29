package p000;

import com.lingq.feature.onboarding.p014v2.OnboardingSelections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class px6 {

    /* JADX INFO: renamed from: a */
    public final int f56945a;

    /* JADX INFO: renamed from: b */
    public final OnboardingSelections f56946b;

    /* JADX INFO: renamed from: c */
    public final boolean f56947c;

    /* JADX INFO: renamed from: d */
    public final ut6 f56948d;

    /* JADX INFO: renamed from: e */
    public final List f56949e;

    public px6(int i, OnboardingSelections onboardingSelections, boolean z, ut6 ut6Var, List list) {
        onboardingSelections.getClass();
        list.getClass();
        this.f56945a = i;
        this.f56946b = onboardingSelections;
        this.f56947c = z;
        this.f56948d = ut6Var;
        this.f56949e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px6)) {
            return false;
        }
        px6 px6Var = (px6) obj;
        return this.f56945a == px6Var.f56945a && fa4.m11650l(this.f56946b, px6Var.f56946b) && this.f56947c == px6Var.f56947c && fa4.m11650l(this.f56948d, px6Var.f56948d) && fa4.m11650l(this.f56949e, px6Var.f56949e);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e((this.f56946b.hashCode() + (Integer.hashCode(this.f56945a) * 31)) * 31, 31, this.f56947c);
        ut6 ut6Var = this.f56948d;
        return this.f56949e.hashCode() + ((iM12428e + (ut6Var == null ? 0 : ut6Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiStateInputs(page=");
        sb.append(this.f56945a);
        sb.append(", selections=");
        sb.append(this.f56946b);
        sb.append(", loading=");
        sb.append(this.f56947c);
        sb.append(", error=");
        sb.append(this.f56948d);
        sb.append(", dictionaryLocales=");
        return hn1.m13356f(sb, this.f56949e, ")");
    }
}
