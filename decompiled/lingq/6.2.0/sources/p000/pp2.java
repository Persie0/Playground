package p000;

import com.lingq.core.analytics.embedded.EmbeddedMessage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pp2 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56622a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EmbeddedMessage f56623b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f56624c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e16 f56625d;

    public /* synthetic */ pp2(EmbeddedMessage embeddedMessage, vi3 vi3Var, e16 e16Var, int i, int i2) {
        this.f56622a = i2;
        this.f56623b = embeddedMessage;
        this.f56624c = vi3Var;
        this.f56625d = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f56622a;
        xfa xfaVar = xfa.f68157a;
        e16 e16Var = this.f56625d;
        vi3 vi3Var = this.f56624c;
        EmbeddedMessage embeddedMessage = this.f56623b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bcd.m3619a(embeddedMessage, vi3Var, e16Var, ye1Var, pk9.m19383z(1));
                break;
            case 1:
                dcd.m10287a(embeddedMessage, vi3Var, e16Var, ye1Var, pk9.m19383z(1));
                break;
            case 2:
                ecd.m11039a(embeddedMessage, vi3Var, e16Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                hcd.m13199a(embeddedMessage, vi3Var, e16Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
