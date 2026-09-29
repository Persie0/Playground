package p000;

import androidx.compose.foundation.AbstractC0075a;

/* JADX INFO: renamed from: v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3667v implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64634a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0075a f64635b;

    public /* synthetic */ C3667v(AbstractC0075a abstractC0075a, int i) {
        this.f64634a = i;
        this.f64635b = abstractC0075a;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        ea2 ea2Var;
        int i = this.f64634a;
        AbstractC0075a abstractC0075a = this.f64635b;
        switch (i) {
            case 0:
                w34 w34Var = (w34) thb.m22050i(abstractC0075a, s34.f60229a);
                if (!(w34Var instanceof w34)) {
                    l54.m15814a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + w34Var);
                }
                w34 w34Var2 = abstractC0075a.f1725T;
                w34 w34Var3 = w34Var;
                abstractC0075a.f1725T = w34Var3;
                if (w34Var2 != null && !fa4.m11650l(w34Var3, w34Var2) && ((ea2Var = abstractC0075a.f1728W) != null || !abstractC0075a.f1735d0)) {
                    if (ea2Var != null) {
                        abstractC0075a.m11625a1(ea2Var);
                    }
                    abstractC0075a.f1728W = null;
                    abstractC0075a.m798k1();
                }
                return xfa.f68157a;
            default:
                abstractC0075a.f1723R.mo0a();
                return Boolean.TRUE;
        }
    }
}
