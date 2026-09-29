package p000;

import com.google.android.gms.internal.measurement.zzacr;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hdd implements gj3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ hdd f42230a = new hdd();

    @Override // p000.gj3
    public final Object apply(Object obj) {
        g1d g1dVar = (g1d) obj;
        rdd rddVarM22702y = udd.m22702y();
        if (g1dVar == null) {
            return (udd) rddVarM22702y.m22741d();
        }
        for (o1d o1dVar : g1dVar.m12295w()) {
            xdd xddVarM322y = aed.m322y();
            String strM17763s = o1dVar.m17763s();
            xddVarM322y.m22739b();
            ((aed) xddVarM322y.f63950b).m336z(strM17763s);
            int iM17762G = o1dVar.m17762G();
            int i = iM17762G - 1;
            if (iM17762G == 0) {
                throw null;
            }
            if (i == 0) {
                long jM17764t = o1dVar.m17764t();
                xddVarM322y.m22739b();
                ((aed) xddVarM322y.f63950b).m323A(jM17764t);
            } else if (i == 1) {
                boolean zM17765u = o1dVar.m17765u();
                xddVarM322y.m22739b();
                ((aed) xddVarM322y.f63950b).m324B(zM17765u);
            } else if (i == 2) {
                double dM17766v = o1dVar.m17766v();
                xddVarM322y.m22739b();
                ((aed) xddVarM322y.f63950b).m325C(dM17766v);
            } else if (i == 3) {
                String strM17767w = o1dVar.m17767w();
                xddVarM322y.m22739b();
                ((aed) xddVarM322y.f63950b).m326D(strM17767w);
            } else {
                if (i != 4) {
                    C3386nv.m17633t("No known flag type");
                    return null;
                }
                zzacr zzacrVarM17768x = o1dVar.m17768x();
                xddVarM322y.m22739b();
                ((aed) xddVarM322y.f63950b).m327E(zzacrVarM17768x);
            }
            aed aedVar = (aed) xddVarM322y.m22741d();
            rddVarM22702y.m22739b();
            ((udd) rddVarM22702y.f63950b).m22708E(aedVar);
        }
        String strM12294v = g1dVar.m12294v();
        rddVarM22702y.m22739b();
        ((udd) rddVarM22702y.f63950b).m22706C(strM12294v);
        String strM12291s = g1dVar.m12291s();
        rddVarM22702y.m22739b();
        ((udd) rddVarM22702y.f63950b).m22704A(strM12291s);
        long jM12296x = g1dVar.m12296x();
        rddVarM22702y.m22739b();
        ((udd) rddVarM22702y.f63950b).m22707D(jM12296x);
        if (g1dVar.m12292t()) {
            zzacr zzacrVarM12293u = g1dVar.m12293u();
            rddVarM22702y.m22739b();
            ((udd) rddVarM22702y.f63950b).m22705B(zzacrVarM12293u);
        }
        return (udd) rddVarM22702y.m22741d();
    }
}
