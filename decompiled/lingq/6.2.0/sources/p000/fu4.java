package p000;

import androidx.compose.foundation.pager.AbstractC0150d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39641a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0150d f39642b;

    public /* synthetic */ fu4(AbstractC0150d abstractC0150d, int i) {
        this.f39641a = i;
        this.f39642b = abstractC0150d;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int iMo1039n;
        int iM1036k;
        int i = this.f39641a;
        AbstractC0150d abstractC0150d = this.f39642b;
        switch (i) {
            case 0:
                iMo1039n = abstractC0150d.mo1039n();
                break;
            case 1:
                iMo1039n = abstractC0150d.mo1039n();
                break;
            case 2:
                return Integer.valueOf(abstractC0150d.f2681k.mo863a() ? abstractC0150d.f2688r.m21222h() : abstractC0150d.m1036k());
            case 3:
                boolean zMo863a = abstractC0150d.f2681k.mo863a();
                sc9 sc9Var = abstractC0150d.f2687q;
                if (!zMo863a) {
                    iM1036k = abstractC0150d.m1036k();
                } else if (sc9Var.m21222h() != -1) {
                    iM1036k = sc9Var.m21222h();
                } else {
                    float fAbs = Math.abs(abstractC0150d.m1037l());
                    fb2 fb2Var = abstractC0150d.f2684n;
                    u27 u27Var = v27.f64740a;
                    if (fAbs >= Math.abs(Math.min(fb2Var.mo912g0(56.0f), abstractC0150d.m1040o() / 2.0f) / abstractC0150d.m1040o())) {
                        boolean zBooleanValue = ((Boolean) ((xc9) abstractC0150d.f2669F).getValue()).booleanValue();
                        int i2 = abstractC0150d.f2675e;
                        iM1036k = zBooleanValue ? i2 + 1 : i2;
                    } else {
                        iM1036k = abstractC0150d.m1036k();
                    }
                }
                iMo1039n = abstractC0150d.m1035j(iM1036k);
                break;
            default:
                iMo1039n = abstractC0150d.mo1039n();
                break;
        }
        return Integer.valueOf(iMo1039n);
    }
}
