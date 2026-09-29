package p000;

import com.facebook.login.C0939m;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import com.lingq.feature.onboarding.auth.login.OnboardingLoginFragment;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zt6 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OnboardingLoginFragment f72151b;

    public /* synthetic */ zt6(OnboardingLoginFragment onboardingLoginFragment, int i) {
        this.f72150a = i;
        this.f72151b = onboardingLoginFragment;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f72150a;
        xfa xfaVar = xfa.f68157a;
        OnboardingLoginFragment onboardingLoginFragment = this.f72151b;
        switch (i) {
            case 0:
                return new eeb(onboardingLoginFragment.m2090R(), new deb());
            case 1:
                ((C0939m) onboardingLoginFragment.f27024D0.getValue()).m5258b();
                onboardingLoginFragment.f27027G0.mo276a(vz1.m23604J("email"));
                return xfaVar;
            default:
                new geb(onboardingLoginFragment.m2090R(), new afb()).m12517d();
                List listM23605K = vz1.m23605K(new Scope(1, "openid"), new Scope(1, "email"), new Scope(1, "profile"));
                lda.m16124j("requestedScopes cannot be null or empty", !listM23605K.isEmpty());
                ob1 ob1Var = onboardingLoginFragment.f27022B0;
                if (ob1Var == null) {
                    fa4.m11636J("commonUtils");
                    throw null;
                }
                tld tldVarM11081d = ((eeb) onboardingLoginFragment.f27025E0.getValue()).m11081d(new AuthorizationRequest(listM23605K, ob1Var.m17892f("google_client_id"), true, false, null, null, null, false, null, false, 0));
                C3440oy c3440oy = new C3440oy(new fy4(onboardingLoginFragment, 24), 28);
                tldVarM11081d.getClass();
                tldVarM11081d.mo5963e(xr9.f68587a, c3440oy);
                tldVarM11081d.mo5961c(new C3440oy(onboardingLoginFragment, 27));
                return xfaVar;
        }
    }
}
