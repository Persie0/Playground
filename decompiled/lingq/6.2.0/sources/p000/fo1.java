package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fo1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39358a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ io1 f39359b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f39360c;

    public /* synthetic */ fo1(io1 io1Var, ArrayList arrayList, int i) {
        this.f39358a = i;
        this.f39359b = io1Var;
        this.f39360c = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f39358a;
        ArrayList arrayList = this.f39360c;
        io1 io1Var = this.f39359b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                io1Var.f44348P.m3840V(bk8Var, arrayList);
                return xfa.f68157a;
            default:
                bk8Var.getClass();
                return io1Var.f44344L.m3843Y(bk8Var, arrayList);
        }
    }
}
