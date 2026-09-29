package p000;

import com.lingq.core.domain.model.status.TokenStatus;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pw4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f56902b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TokenStatus f56903c;

    public /* synthetic */ pw4(vi3 vi3Var, TokenStatus tokenStatus, int i) {
        this.f56901a = i;
        this.f56902b = vi3Var;
        this.f56903c = tokenStatus;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f56901a;
        xfa xfaVar = xfa.f68157a;
        TokenStatus tokenStatus = this.f56903c;
        vi3 vi3Var = this.f56902b;
        switch (i) {
            case 0:
                vi3Var.invoke(tokenStatus);
                break;
            case 1:
                vi3Var.invoke(tokenStatus);
                break;
            default:
                vi3Var.invoke(tokenStatus);
                break;
        }
        return xfaVar;
    }
}
