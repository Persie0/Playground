package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rza implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f60095b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f60096c;

    public /* synthetic */ rza(vi3 vi3Var, t66 t66Var, int i) {
        this.f60094a = i;
        this.f60095b = vi3Var;
        this.f60096c = t66Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f60094a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f60096c;
        vi3 vi3Var = this.f60095b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                t66Var.setValue(str);
                vi3Var.invoke((String) t66Var.getValue());
                break;
            case 1:
                Integer num = (Integer) obj;
                num.getClass();
                t66Var.setValue(Boolean.FALSE);
                vi3Var.invoke(num);
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                t66Var.setValue(Boolean.FALSE);
                vi3Var.invoke(new xwa(iIntValue));
                break;
            case 3:
                p0b p0bVar = (p0b) obj;
                p0bVar.getClass();
                if (!(p0bVar instanceof n0b)) {
                    vi3Var.invoke(p0bVar);
                } else {
                    t66Var.setValue(Boolean.valueOf(((n0b) p0bVar).f52149b > 1));
                }
                break;
            case 4:
                fxa fxaVar = (fxa) obj;
                fxaVar.getClass();
                t66Var.setValue(Boolean.FALSE);
                vi3Var.invoke(fxaVar);
                break;
            default:
                p0b p0bVar2 = (p0b) obj;
                p0bVar2.getClass();
                t66Var.setValue(Boolean.FALSE);
                vi3Var.invoke(p0bVar2);
                break;
        }
        return xfaVar;
    }
}
