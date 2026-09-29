package p000;

import com.lingq.feature.onboarding.p014v2.OnboardingPage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ex6 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38041a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ld9 f38042b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lx6 f38043c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f38044d;

    public /* synthetic */ ex6(ld9 ld9Var, lx6 lx6Var, vi3 vi3Var, int i) {
        this.f38041a = i;
        this.f38042b = ld9Var;
        this.f38043c = lx6Var;
        this.f38044d = vi3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f38041a;
        xfa xfaVar = xfa.f68157a;
        vu6 vu6Var = vu6.f65943a;
        av6 av6Var = av6.f7573a;
        vi3 vi3Var = this.f38044d;
        lx6 lx6Var = this.f38043c;
        ld9 ld9Var = this.f38042b;
        switch (i) {
            case 0:
                if (ld9Var != null) {
                    ((pa2) ld9Var).m19004a();
                }
                if (!lx6Var.f50250i) {
                    vi3Var.invoke(vu6Var);
                } else {
                    vi3Var.invoke(av6Var);
                }
                break;
            default:
                if (ld9Var != null) {
                    ((pa2) ld9Var).m19004a();
                }
                if (lx6Var.f50242a != OnboardingPage.PERSONALIZING.getIndex()) {
                    if (!lx6Var.f50250i) {
                        vi3Var.invoke(vu6Var);
                    } else {
                        vi3Var.invoke(av6Var);
                    }
                }
                break;
        }
        return xfaVar;
    }
}
