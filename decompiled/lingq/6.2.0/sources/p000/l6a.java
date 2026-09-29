package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l6a implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49203b;

    public /* synthetic */ l6a(Object obj, int i) {
        this.f49202a = i;
        this.f49203b = obj;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f49202a;
        Object obj2 = this.f49203b;
        switch (i) {
            case 0:
                e28 e28Var = (e28) obj2;
                ((fb2) obj).getClass();
                int iM21693T = ss5.m21693T(e28Var.f36620a);
                return new f84((((long) ss5.m21693T(e28Var.f36621b)) & 4294967295L) | (((long) iM21693T) << 32));
            default:
                fv4 fv4Var = (fv4) obj2;
                return fv4Var.m12210E(((Integer) obj).intValue(), fv4Var.f39740d);
        }
    }
}
