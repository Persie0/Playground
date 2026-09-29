package p000;

import com.lingq.feature.lessoninfo.AbstractC2131b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dp4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f35997b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f35998c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f35999d;

    public /* synthetic */ dp4(String str, String str2, ui3 ui3Var, int i, int i2) {
        this.f35996a = i2;
        this.f35997b = str;
        this.f35998c = str2;
        this.f35999d = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f35996a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f35999d;
        String str = this.f35998c;
        String str2 = this.f35997b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                cid.m4758i(str2, str, ui3Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                AbstractC2131b.m9043b(str2, str, ui3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
