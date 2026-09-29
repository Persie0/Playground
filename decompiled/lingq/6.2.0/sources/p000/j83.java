package p000;

/* JADX INFO: loaded from: classes.dex */
public final class j83 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45182a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45183b;

    public /* synthetic */ j83(Object obj, int i) {
        this.f45182a = i;
        this.f45183b = obj;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f45182a;
        Object obj2 = this.f45183b;
        switch (i) {
            case 0:
                p02 p02Var = (p02) obj;
                p02Var.getClass();
                return new p02(obj2, p02Var.f55353b);
            default:
                p02 p02Var2 = (p02) obj;
                p02Var2.getClass();
                return new p02(p02Var2.f55352a, obj2);
        }
    }
}
