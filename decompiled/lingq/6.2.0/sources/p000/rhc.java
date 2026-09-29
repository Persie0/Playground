package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcw;

/* JADX INFO: loaded from: classes2.dex */
public final class rhc implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final rhc f59327a = new rhc();

    /* JADX INFO: renamed from: b */
    public static final c33 f59328b = new c33("maxMs", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(1, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: c */
    public static final c33 f59329c = new c33("minMs", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(2, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: d */
    public static final c33 f59330d = new c33("avgMs", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(3, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: e */
    public static final c33 f59331e = new c33("firstQuartileMs", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(4, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: f */
    public static final c33 f59332f = new c33("medianMs", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(5, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: g */
    public static final c33 f59333g = new c33("thirdQuartileMs", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(6, zzcw.DEFAULT))));

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        y5d y5dVar = (y5d) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12789a(f59328b, y5dVar.f69332a);
        gp6Var.mo12789a(f59329c, y5dVar.f69333b);
        gp6Var.mo12789a(f59330d, y5dVar.f69334c);
        gp6Var.mo12789a(f59331e, y5dVar.f69335d);
        gp6Var.mo12789a(f59332f, y5dVar.f69336e);
        gp6Var.mo12789a(f59333g, y5dVar.f69337f);
    }
}
