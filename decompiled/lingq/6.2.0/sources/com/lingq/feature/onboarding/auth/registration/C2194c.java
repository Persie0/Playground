package com.lingq.feature.onboarding.auth.registration;

import android.widget.Toast;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import java.util.Date;
import p000.lda;
import p000.my2;
import p000.wfb;
import p000.x74;
import p000.zj5;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.auth.registration.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2194c implements my2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ OnboardingRegistrationFragment f27152a;

    public C2194c(OnboardingRegistrationFragment onboardingRegistrationFragment) {
        this.f27152a = onboardingRegistrationFragment;
    }

    @Override // p000.my2
    /* JADX INFO: renamed from: n */
    public final void mo9121n(zj5 zj5Var) {
        Date date = AccessToken.f11306l;
        AccessToken accessTokenM24363t = x74.m24363t();
        String str = accessTokenM24363t != null ? accessTokenM24363t.f11311e : null;
        C2196e c2196e = (C2196e) this.f27152a.f27115B0.getValue();
        c2196e.getClass();
        wfb.m23926u(lda.m16103C(c2196e), null, null, new OnboardingRegistrationViewModel$registerFacebook$1(c2196e, str, null), 3);
    }

    @Override // p000.my2
    /* JADX INFO: renamed from: r */
    public final void mo9122r(FacebookException facebookException) {
        Toast.makeText(this.f27152a.m2090R(), facebookException.getMessage(), 0).show();
    }
}
