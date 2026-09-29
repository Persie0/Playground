package p000;

/* JADX INFO: renamed from: gt */
/* JADX INFO: loaded from: classes2.dex */
public final class C3050gt implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41282a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f41283b;

    public /* synthetic */ C3050gt(Object obj, int i) {
        this.f41282a = i;
        this.f41283b = obj;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        switch (this.f41282a) {
            case 0:
                ((kl7) ((ll7) this.f41283b)).mo4677k(null);
                return xfa.f68157a;
            case 1:
                w84 w84Var = (w84) this.f41283b;
                synchronized (w84Var.f66516d) {
                    w84Var.f66517e = 5;
                    w84Var.f66519g = null;
                }
                return xfa.f68157a;
            case 2:
                ((sc9) this.f41283b).m21223i((int) (((n84) obj).f52482a >> 32));
                return xfa.f68157a;
            case 3:
                Object obj2 = ((Object[]) this.f41283b)[((Number) obj).intValue()];
                return null;
            default:
                ((ys2) this.f41283b).get(((Number) obj).intValue());
                return null;
        }
    }
}
