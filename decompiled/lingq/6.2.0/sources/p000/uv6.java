package p000;

import com.lingq.feature.onboarding.p014v2.OnboardingYesNoQuestion;

/* JADX INFO: loaded from: classes3.dex */
public final class uv6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final OnboardingYesNoQuestion f64406a;

    /* JADX INFO: renamed from: b */
    public final boolean f64407b;

    public uv6(OnboardingYesNoQuestion onboardingYesNoQuestion, boolean z) {
        onboardingYesNoQuestion.getClass();
        this.f64406a = onboardingYesNoQuestion;
        this.f64407b = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m22944a() {
        return this.f64407b;
    }

    /* JADX INFO: renamed from: b */
    public final OnboardingYesNoQuestion m22945b() {
        return this.f64406a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv6)) {
            return false;
        }
        uv6 uv6Var = (uv6) obj;
        return this.f64406a == uv6Var.f64406a && this.f64407b == uv6Var.f64407b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64407b) + (this.f64406a.hashCode() * 31);
    }

    public final String toString() {
        return "YesNoAnswered(question=" + this.f64406a + ", answer=" + this.f64407b + ")";
    }
}
