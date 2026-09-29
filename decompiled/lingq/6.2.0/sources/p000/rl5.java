package p000;

import com.airbnb.lottie.C0868b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rl5 implements ul5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59472a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0868b f59473b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f59474c;

    public /* synthetic */ rl5(C0868b c0868b, float f, int i) {
        this.f59472a = i;
        this.f59473b = c0868b;
        this.f59474c = f;
    }

    @Override // p000.ul5
    public final void run() {
        int i = this.f59472a;
        float f = this.f59474c;
        C0868b c0868b = this.f59473b;
        switch (i) {
            case 0:
                gl5 gl5Var = c0868b.f10620a;
                if (gl5Var != null) {
                    dm5 dm5Var = c0868b.f10622b;
                    dm5Var.m10481i(dm5Var.f35835j, f06.m11425f(gl5Var.f40968l, gl5Var.f40969m, f));
                } else {
                    c0868b.f10632g.add(new rl5(c0868b, f, 0));
                }
                break;
            case 1:
                gl5 gl5Var2 = c0868b.f10620a;
                if (gl5Var2 != null) {
                    c0868b.m4990D((int) f06.m11425f(gl5Var2.f40968l, gl5Var2.f40969m, f));
                } else {
                    c0868b.f10632g.add(new rl5(c0868b, f, 1));
                }
                break;
            default:
                c0868b.m4993G(f);
                break;
        }
    }
}
