package p000;

import com.lingq.feature.review.AbstractC2752c;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ee8 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ze8 f37130b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f37131c;

    public /* synthetic */ ee8(ze8 ze8Var, vi3 vi3Var, int i, int i2) {
        this.f37129a = i2;
        this.f37130b = ze8Var;
        this.f37131c = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f37129a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f37131c;
        ze8 ze8Var = this.f37130b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC2752c.m9586i(ze8Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                ywc.m25370c(ze8Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
