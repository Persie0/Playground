package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g05 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40014a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q05 f40015b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f40016c;

    public /* synthetic */ g05(q05 q05Var, ArrayList arrayList, int i) {
        this.f40014a = i;
        this.f40015b = q05Var;
        this.f40016c = arrayList;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f40014a;
        xfa xfaVar = xfa.f68157a;
        ArrayList arrayList = this.f40016c;
        q05 q05Var = this.f40015b;
        bk8 bk8Var = (bk8) obj;
        switch (i) {
            case 0:
                bk8Var.getClass();
                q05Var.f57082V.m3840V(bk8Var, arrayList);
                break;
            case 1:
                bk8Var.getClass();
                q05Var.f57085Y.m3840V(bk8Var, arrayList);
                break;
            case 2:
                bk8Var.getClass();
                q05Var.f57079S.m3840V(bk8Var, arrayList);
                break;
            default:
                bk8Var.getClass();
                q05Var.f57087a0.m3840V(bk8Var, arrayList);
                break;
        }
        return xfaVar;
    }
}
