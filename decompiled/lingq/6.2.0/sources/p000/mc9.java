package p000;

import com.facebook.login.C0939m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mc9 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51080a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f51081b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f51082c;

    public /* synthetic */ mc9(vi3 vi3Var, vi3 vi3Var2, int i) {
        this.f51080a = i;
        this.f51081b = vi3Var;
        this.f51082c = vi3Var2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f51080a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f51082c;
        vi3 vi3Var2 = this.f51081b;
        switch (i) {
            case 0:
                vi3Var2.invoke(obj);
                vi3Var.invoke(obj);
                break;
            case 1:
                vi3Var2.invoke(obj);
                vi3Var.invoke(obj);
                break;
            default:
                cm0 cm0Var = (cm0) obj;
                cm0Var.getClass();
                C0939m.f11517f.m5254a().m5259c(cm0Var.m4849b(), cm0Var.m4848a(), new p33(21, vi3Var2, vi3Var));
                break;
        }
        return xfaVar;
    }
}
