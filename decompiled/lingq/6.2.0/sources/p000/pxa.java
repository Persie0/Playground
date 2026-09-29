package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pxa implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56959a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rxa f56960b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f56961c;

    public /* synthetic */ pxa(rxa rxaVar, List list, int i) {
        this.f56959a = i;
        this.f56960b = rxaVar;
        this.f56961c = list;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f56959a;
        List list = this.f56961c;
        rxa rxaVar = this.f56960b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                return rxaVar.f60015M.m3843Y(bk8Var, list);
            default:
                bk8Var.getClass();
                rxaVar.f60017O.m3840V(bk8Var, list);
                return xfa.f68157a;
        }
    }
}
