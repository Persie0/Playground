package p000;

import com.lingq.core.domain.model.status.TokenStatus;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sy4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zi3 f61614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f61615c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f61616d;

    public /* synthetic */ sy4(zi3 zi3Var, String str, t66 t66Var, int i) {
        this.f61613a = i;
        this.f61614b = zi3Var;
        this.f61615c = str;
        this.f61616d = t66Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f61613a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f61616d;
        String str = this.f61615c;
        zi3 zi3Var = this.f61614b;
        TokenStatus tokenStatus = (TokenStatus) obj;
        switch (i) {
            case 0:
                tokenStatus.getClass();
                t66Var.setValue(Boolean.FALSE);
                zi3Var.invoke(str, Integer.valueOf(y7d.m24986e(tokenStatus)));
                break;
            case 1:
                tokenStatus.getClass();
                t66Var.setValue(Boolean.FALSE);
                zi3Var.invoke(str, tokenStatus);
                break;
            default:
                tokenStatus.getClass();
                t66Var.setValue(Boolean.FALSE);
                zi3Var.invoke(str, tokenStatus);
                break;
        }
        return xfaVar;
    }
}
