package p000;

import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.token.TokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h4a implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41793a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f5a f41794b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f41795c;

    public /* synthetic */ h4a(vi3 vi3Var, f5a f5aVar) {
        this.f41793a = 2;
        this.f41795c = vi3Var;
        this.f41794b = f5aVar;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        TooltipStep tooltipStep;
        TokenMeaning tokenMeaning;
        int i = this.f41793a;
        xfa xfaVar = xfa.f68157a;
        f5a f5aVar = this.f41794b;
        vi3 vi3Var = this.f41795c;
        switch (i) {
            case 0:
                c7a c7aVar = f5aVar.f38464V;
                tooltipStep = c7aVar != null ? c7aVar.f9664a : null;
                if (tooltipStep != null) {
                    vi3Var.invoke(new m2a(tooltipStep));
                }
                break;
            case 1:
                c7a c7aVar2 = f5aVar.f38464V;
                tooltipStep = c7aVar2 != null ? c7aVar2.f9664a : null;
                if (tooltipStep != null && tooltipStep == TooltipStep.TapTranslation && (tokenMeaning = f5aVar.f38466X) != null) {
                    vi3Var.invoke(new m2a(tooltipStep));
                    vi3Var.invoke(new d2a(tokenMeaning));
                }
                break;
            default:
                vi3Var.invoke(new t2a(f5aVar.f38469a, f5aVar.f38476h));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ h4a(f5a f5aVar, vi3 vi3Var, int i) {
        this.f41793a = i;
        this.f41794b = f5aVar;
        this.f41795c = vi3Var;
    }
}
