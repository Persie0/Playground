package com.lingq.feature.onboarding.auth.registration;

import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import p000.ad3;
import p000.lda;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.auth.registration.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2193b implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ OnboardingRegistrationFragment f27151a;

    public /* synthetic */ C2193b(OnboardingRegistrationFragment onboardingRegistrationFragment) {
        this.f27151a = onboardingRegistrationFragment;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        PendingIntent pendingIntent = authorizationResult.f11567f;
        OnboardingRegistrationFragment onboardingRegistrationFragment = this.f27151a;
        if (pendingIntent != null) {
            ad3 ad3Var = onboardingRegistrationFragment.f27122I0;
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            ad3Var.mo276a(new IntentSenderRequest(intentSender, null, 0, 0));
        } else {
            String str = authorizationResult.f11562a;
            if (str != null) {
                C2196e c2196e = (C2196e) onboardingRegistrationFragment.f27115B0.getValue();
                c2196e.getClass();
                wfb.m23926u(lda.m16103C(c2196e), null, null, new OnboardingRegistrationViewModel$registerGoogle$1(c2196e, str, null), 3);
            }
        }
        return xfa.f68157a;
    }
}
