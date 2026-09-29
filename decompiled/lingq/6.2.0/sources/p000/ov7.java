package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ov7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55035a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f55036b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qc9 f55037c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f55038d;

    public /* synthetic */ ov7(vi3 vi3Var, t66 t66Var, qc9 qc9Var) {
        this.f55036b = vi3Var;
        this.f55038d = t66Var;
        this.f55037c = qc9Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f55035a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f55038d;
        qc9 qc9Var = this.f55037c;
        vi3 vi3Var = this.f55036b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                t66Var.setValue(bool);
                vi3Var.invoke(new it7(qc9Var.m19861h(), zBooleanValue));
                break;
            default:
                float fFloatValue = ((Float) obj).floatValue();
                qc9Var.m19862i(fFloatValue);
                if (((Boolean) t66Var.getValue()).booleanValue()) {
                    vi3Var.invoke(new it7(fFloatValue, true));
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ov7(vi3 vi3Var, qc9 qc9Var, t66 t66Var) {
        this.f55036b = vi3Var;
        this.f55037c = qc9Var;
        this.f55038d = t66Var;
    }
}
