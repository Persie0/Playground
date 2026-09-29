package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class fx9 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39903a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jk8 f39904b;

    public /* synthetic */ fx9(jk8 jk8Var, int i) {
        this.f39903a = i;
        this.f39904b = jk8Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f39903a;
        xfa xfaVar = xfa.f68157a;
        jk8 jk8Var = this.f39904b;
        switch (i) {
            case 0:
                jk8Var.resumeWith(((js9) obj).f46082a);
                break;
            default:
                jk8Var.resumeWith(((js9) obj).f46082a);
                break;
        }
        return xfaVar;
    }
}
