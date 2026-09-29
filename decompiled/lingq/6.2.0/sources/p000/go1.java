package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class go1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41063a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ io1 f41064b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f41065c;

    public /* synthetic */ go1(io1 io1Var, List list, int i) {
        this.f41063a = i;
        this.f41064b = io1Var;
        this.f41065c = list;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f41063a;
        xfa xfaVar = xfa.f68157a;
        List list = this.f41065c;
        io1 io1Var = this.f41064b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                io1Var.f44346N.m3840V(bk8Var, list);
                break;
            default:
                bk8Var.getClass();
                io1Var.f44347O.m3840V(bk8Var, list);
                break;
        }
        return xfaVar;
    }
}
