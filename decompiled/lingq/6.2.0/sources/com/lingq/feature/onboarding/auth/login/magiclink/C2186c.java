package com.lingq.feature.onboarding.auth.login.magiclink;

import androidx.compose.runtime.AbstractC0278f;
import p000.dp2;
import p000.ep2;
import p000.fp2;
import p000.gm5;
import p000.jp2;
import p000.km7;
import p000.lda;
import p000.t66;
import p000.wfb;
import p000.wm5;
import p000.wta;
import p000.xc9;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.auth.login.magiclink.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2186c extends wta {

    /* JADX INFO: renamed from: b */
    public final km7 f27112b;

    /* JADX INFO: renamed from: c */
    public final t66 f27113c;

    public C2186c(km7 km7Var) {
        km7Var.getClass();
        this.f27112b = km7Var;
        this.f27113c = AbstractC0278f.m1260j(new jp2((3 & 1) != 0 ? wm5.f67054a : null, false));
    }

    /* JADX INFO: renamed from: V2 */
    public final jp2 m9117V2() {
        return (jp2) ((xc9) this.f27113c).getValue();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9118W2(fp2 fp2Var) {
        fp2Var.getClass();
        if (fp2Var instanceof dp2) {
            wfb.m23926u(lda.m16103C(this), null, null, new EmailLoginViewModel$requestEmailLogin$1(this, ((dp2) fp2Var).f35987a, null), 3);
        } else if (!fp2Var.equals(ep2.f37658a)) {
            gm5.m12750e();
        } else {
            ((xc9) this.f27113c).setValue(jp2.m14578a(m9117V2(), wm5.f67054a, false, 2));
        }
    }
}
