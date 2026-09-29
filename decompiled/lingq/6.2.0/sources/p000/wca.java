package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wca implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zca f66622b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f66623c;

    public /* synthetic */ wca(zca zcaVar, ArrayList arrayList, int i) {
        this.f66621a = i;
        this.f66622b = zcaVar;
        this.f66623c = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f66621a;
        ArrayList arrayList = this.f66623c;
        zca zcaVar = this.f66622b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                return zcaVar.f71370L.m3843Y(bk8Var, arrayList);
            default:
                bk8Var.getClass();
                zcaVar.f71373O.m3840V(bk8Var, arrayList);
                return xfa.f68157a;
        }
    }
}
