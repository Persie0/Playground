package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class k83 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f46853b;

    public /* synthetic */ k83(Object obj, int i) {
        this.f46852a = i;
        this.f46853b = obj;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f46852a;
        Object obj2 = this.f46853b;
        switch (i) {
            case 0:
                q02 q02Var = (q02) obj;
                q02Var.getClass();
                return new q02(obj2, q02Var.f57066b);
            default:
                q02 q02Var2 = (q02) obj;
                q02Var2.getClass();
                return new q02(q02Var2.f57065a, obj2);
        }
    }
}
