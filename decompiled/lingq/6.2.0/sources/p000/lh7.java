package p000;

import com.lingq.core.domain.model.token.TokenMeaning;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lh7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49669a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f49670b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TokenMeaning f49671c;

    public /* synthetic */ lh7(vi3 vi3Var, TokenMeaning tokenMeaning, int i) {
        this.f49669a = i;
        this.f49670b = vi3Var;
        this.f49671c = tokenMeaning;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f49669a;
        xfa xfaVar = xfa.f68157a;
        TokenMeaning tokenMeaning = this.f49671c;
        vi3 vi3Var = this.f49670b;
        switch (i) {
            case 0:
                vi3Var.invoke(tokenMeaning);
                break;
            case 1:
                vi3Var.invoke(tokenMeaning);
                break;
            default:
                vi3Var.invoke(tokenMeaning);
                break;
        }
        return xfaVar;
    }
}
