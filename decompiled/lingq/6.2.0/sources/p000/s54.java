package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s54 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60370a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f60371b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qc9 f60372c;

    public /* synthetic */ s54(int i, vi3 vi3Var, qc9 qc9Var) {
        this.f60370a = i;
        this.f60371b = vi3Var;
        this.f60372c = qc9Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f60370a;
        xfa xfaVar = xfa.f68157a;
        qc9 qc9Var = this.f60372c;
        vi3 vi3Var = this.f60371b;
        Float f = (Float) obj;
        switch (i) {
            case 0:
                qc9Var.m19862i(f.floatValue());
                vi3Var.invoke(f);
                break;
            default:
                float fFloatValue = f.floatValue();
                qc9Var.m19862i(fFloatValue);
                vi3Var.invoke(new jt7(fFloatValue));
                break;
        }
        return xfaVar;
    }
}
