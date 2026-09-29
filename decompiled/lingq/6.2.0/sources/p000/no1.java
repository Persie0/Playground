package p000;

import androidx.compose.p002ui.semantics.C0427g;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class no1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53041a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fb2 f53042b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f53043c;

    public /* synthetic */ no1(fb2 fb2Var, t66 t66Var, int i) {
        this.f53041a = i;
        this.f53042b = fb2Var;
        this.f53043c = t66Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f53041a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f53043c;
        fb2 fb2Var = this.f53042b;
        switch (i) {
            case 0:
                aq4 aq4Var = (aq4) obj;
                aq4Var.getClass();
                t66Var.setValue(new xj2(fb2Var.mo905T((int) (aq4Var.mo1687j() & 4294967295L))));
                return xfaVar;
            case 1:
                r48 r48Var = (r48) obj;
                r48Var.getClass();
                t66Var.setValue(new xj2(fb2Var.mo905T(((int) r48Var.f58697b) - ((int) r48Var.f58696a))));
                return xfaVar;
            case 2:
                gz8 gz8Var = gz8.f41566g;
                sy0 sy0Var = new sy0(7, (ui3) obj);
                no1 no1Var = new no1(fb2Var, t66Var, 3);
                C0427g c0427g = qo5.f58016a;
                return new oo5(sy0Var, no1Var, gz8Var);
            case 3:
                bk2 bk2Var = (bk2) obj;
                int iMo916w0 = fb2Var.mo916w0(bk2.m3806b(bk2Var.f8632a));
                t66Var.setValue(new n84((((long) fb2Var.mo916w0(bk2.m3805a(bk2Var.f8632a))) & 4294967295L) | (((long) iMo916w0) << 32)));
                return xfaVar;
            default:
                aq4 aq4Var2 = (aq4) obj;
                aq4Var2.getClass();
                t66Var.setValue(new xj2(fb2Var.mo905T((int) (aq4Var2.mo1687j() & 4294967295L))));
                return xfaVar;
        }
    }
}
