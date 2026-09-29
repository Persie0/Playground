package p000;

import com.facebook.login.C0939m;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import com.lingq.feature.onboarding.auth.registration.C2193b;
import com.lingq.feature.onboarding.auth.registration.OnboardingRegistrationFragment;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cw6 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OnboardingRegistrationFragment f34636b;

    public /* synthetic */ cw6(OnboardingRegistrationFragment onboardingRegistrationFragment, int i) {
        this.f34635a = i;
        this.f34636b = onboardingRegistrationFragment;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f34635a;
        xfa xfaVar = xfa.f68157a;
        OnboardingRegistrationFragment onboardingRegistrationFragment = this.f34636b;
        switch (i) {
            case 0:
                return new eeb(onboardingRegistrationFragment.m2090R(), new deb());
            case 1:
                ((C0939m) onboardingRegistrationFragment.f27116C0.getValue()).m5258b();
                onboardingRegistrationFragment.f27121H0.mo276a(vz1.m23604J("email"));
                return xfaVar;
            default:
                new geb(onboardingRegistrationFragment.m2090R(), new afb()).m12517d();
                List listM23605K = vz1.m23605K(new Scope(1, "openid"), new Scope(1, "email"), new Scope(1, "profile"));
                lda.m16124j("requestedScopes cannot be null or empty", !listM23605K.isEmpty());
                ob1 ob1Var = onboardingRegistrationFragment.f27119F0;
                if (ob1Var == null) {
                    fa4.m11636J("commonUtils");
                    throw null;
                }
                tld tldVarM11081d = ((eeb) onboardingRegistrationFragment.f27117D0.getValue()).m11081d(new AuthorizationRequest(listM23605K, ob1Var.m17892f("google_client_id"), true, false, null, null, null, false, null, false, 0));
                dw6 dw6Var = new dw6(new C2193b(onboardingRegistrationFragment), 0);
                tldVarM11081d.getClass();
                tldVarM11081d.mo5963e(xr9.f68587a, dw6Var);
                tldVarM11081d.mo5961c(new bw6(onboardingRegistrationFragment));
                return xfaVar;
        }
    }
}
