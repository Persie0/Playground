package p000;

import com.lingq.core.database.dao.C1318f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nf2 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1318f f52672b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jl4 f52673c;

    public /* synthetic */ nf2(C1318f c1318f, jl4 jl4Var, int i) {
        this.f52671a = i;
        this.f52672b = c1318f;
        this.f52673c = jl4Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f52671a;
        xfa xfaVar = xfa.f68157a;
        jl4 jl4Var = this.f52673c;
        C1318f c1318f = this.f52672b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                c1318f.f17024N.m3841W(bk8Var, jl4Var);
                break;
            default:
                bk8Var.getClass();
                c1318f.f17022L.m21729K(bk8Var, jl4Var);
                break;
        }
        return xfaVar;
    }
}
