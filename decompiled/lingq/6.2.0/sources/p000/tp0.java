package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tp0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yp0 f62652b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f62653c;

    public /* synthetic */ tp0(yp0 yp0Var, List list, int i) {
        this.f62651a = i;
        this.f62652b = yp0Var;
        this.f62653c = list;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f62651a;
        List list = this.f62653c;
        yp0 yp0Var = this.f62652b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                return yp0Var.f70235M.m3843Y(bk8Var, list);
            default:
                bk8Var.getClass();
                yp0Var.f70238P.m3840V(bk8Var, list);
                return xfa.f68157a;
        }
    }
}
