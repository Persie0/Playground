package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sh7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f60866b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hqa f60867c;

    public /* synthetic */ sh7(vi3 vi3Var, hqa hqaVar, int i) {
        this.f60865a = i;
        this.f60866b = vi3Var;
        this.f60867c = hqaVar;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f60865a;
        j2c j2cVar = xa7.f67999e;
        ua7 ua7Var = ua7.f63643e;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f60866b;
        hqa hqaVar = this.f60867c;
        switch (i) {
            case 0:
                long j = hqaVar.f42793a - 5000;
                vi3Var.invoke(new ora(new fb7((int) (j >= 0 ? j : 0L))));
                break;
            case 1:
                if (hqaVar.f42795c) {
                    j2cVar = ua7Var;
                }
                vi3Var.invoke(new ora(j2cVar));
                break;
            case 2:
                long j2 = hqaVar.f42793a + 5000;
                long j3 = hqaVar.f42794b;
                if (j2 > j3) {
                    j2 = j3;
                }
                vi3Var.invoke(new ora(new fb7((int) j2)));
                break;
            case 3:
                long j4 = hqaVar.f42793a - 5000;
                vi3Var.invoke(new ora(new fb7((int) (j4 >= 0 ? j4 : 0L))));
                break;
            case 4:
                if (hqaVar.f42795c) {
                    j2cVar = ua7Var;
                }
                vi3Var.invoke(new ora(j2cVar));
                break;
            default:
                long j5 = hqaVar.f42793a + 5000;
                long j6 = hqaVar.f42794b;
                if (j5 > j6) {
                    j5 = j6;
                }
                vi3Var.invoke(new ora(new fb7((int) j5)));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ sh7(hqa hqaVar, vi3 vi3Var, int i) {
        this.f60865a = i;
        this.f60867c = hqaVar;
        this.f60866b = vi3Var;
    }
}
