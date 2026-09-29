package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s26 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60204a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f60205b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f60206c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e16 f60207d;

    public /* synthetic */ s26(e16 e16Var, String str, ui3 ui3Var, int i) {
        this.f60207d = e16Var;
        this.f60205b = str;
        this.f60206c = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f60204a;
        xfa xfaVar = xfa.f68157a;
        e16 e16Var = this.f60207d;
        ui3 ui3Var = this.f60206c;
        String str = this.f60205b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                cqb.m9851a(pk9.m19383z(1), ye1Var, ui3Var, e16Var, str);
                break;
            default:
                jsb.m14639a(pk9.m19383z(1), ye1Var, ui3Var, e16Var, str);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ s26(String str, ui3 ui3Var, e16 e16Var, int i) {
        this.f60205b = str;
        this.f60206c = ui3Var;
        this.f60207d = e16Var;
    }
}
