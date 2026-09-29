package p000;

import android.content.Context;
import android.widget.Toast;
import com.facebook.login.C0939m;
import com.lingq.feature.onboarding.auth.registration.OnboardingRegistrationFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bw6 implements yr6, InterfaceC2991f7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ OnboardingRegistrationFragment f9096a;

    public /* synthetic */ bw6(OnboardingRegistrationFragment onboardingRegistrationFragment) {
        this.f9096a = onboardingRegistrationFragment;
    }

    @Override // p000.InterfaceC2991f7
    /* JADX INFO: renamed from: c */
    public void mo2125c(Object obj) {
        cm0 cm0Var = (cm0) obj;
        cm0Var.getClass();
        OnboardingRegistrationFragment onboardingRegistrationFragment = this.f9096a;
        ((C0939m) onboardingRegistrationFragment.f27116C0.getValue()).m5259c(cm0Var.f10258b, cm0Var.f10259c, onboardingRegistrationFragment.f27120G0);
    }

    @Override // p000.yr6
    /* JADX INFO: renamed from: m */
    public void mo321m(Exception exc) {
        Context contextM2090R = this.f9096a.m2090R();
        String message = exc.getMessage();
        if (message == null) {
            message = "Google sign-in failed";
        }
        Toast.makeText(contextM2090R, message, 0).show();
    }
}
