package p000;

import com.airbnb.lottie.C0868b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sl5 implements ul5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0868b f60977a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f60978b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f60979c;

    public /* synthetic */ sl5(C0868b c0868b, int i, int i2) {
        this.f60977a = c0868b;
        this.f60978b = i;
        this.f60979c = i2;
    }

    @Override // p000.ul5
    public final void run() {
        C0868b c0868b = this.f60977a;
        gl5 gl5Var = c0868b.f10620a;
        int i = this.f60978b;
        int i2 = this.f60979c;
        if (gl5Var == null) {
            c0868b.f10632g.add(new sl5(c0868b, i, i2));
        } else {
            c0868b.f10622b.m10481i(i, i2 + 0.99f);
        }
    }
}
