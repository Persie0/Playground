package p000;

import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kb1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0205f f46957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0282a f46958c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f46959d;

    public /* synthetic */ kb1(C0205f c0205f, C0282a c0282a, int i, int i2) {
        this.f46956a = i2;
        this.f46957b = c0205f;
        this.f46958c = c0282a;
        this.f46959d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f46956a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f46959d;
        C0282a c0282a = this.f46958c;
        C0205f c0205f = this.f46957b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fa4.m11640a(c0205f, c0282a, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                AbstractC3122is.m14087a(c0205f, c0282a, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
