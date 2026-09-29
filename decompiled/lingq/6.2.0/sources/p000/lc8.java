package p000;

import com.lingq.feature.review.AbstractC2752c;
import com.lingq.feature.review.components.AbstractC2753a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lc8 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49476a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qc8 f49477b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f49478c;

    public /* synthetic */ lc8(qc8 qc8Var, vi3 vi3Var, int i, int i2) {
        this.f49476a = i2;
        this.f49477b = qc8Var;
        this.f49478c = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f49476a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f49478c;
        qc8 qc8Var = this.f49477b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC2753a.m9588b(qc8Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
            case 1:
                AbstractC2753a.m9590d(qc8Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
            case 2:
                AbstractC2753a.m9592f(qc8Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
            case 3:
                AbstractC2753a.m9591e(qc8Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                AbstractC2752c.m9579b(qc8Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
