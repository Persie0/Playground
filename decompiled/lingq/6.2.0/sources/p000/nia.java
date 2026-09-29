package p000;

import com.lingq.core.premium.AbstractC1839a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nia implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wia f52776b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f52777c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ via f52778d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f52779e;

    public /* synthetic */ nia(wia wiaVar, ui3 ui3Var, via viaVar, int i, int i2) {
        this.f52775a = i2;
        this.f52776b = wiaVar;
        this.f52777c = ui3Var;
        this.f52778d = viaVar;
        this.f52779e = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f52775a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f52779e;
        via viaVar = this.f52778d;
        ui3 ui3Var = this.f52777c;
        wia wiaVar = this.f52776b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC1839a.m8516B(wiaVar, ui3Var, viaVar, ye1Var, pk9.m19383z(i2 | 1));
                break;
            case 1:
                AbstractC1839a.m8516B(wiaVar, ui3Var, viaVar, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                AbstractC1839a.m8536n(wiaVar, ui3Var, viaVar, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
