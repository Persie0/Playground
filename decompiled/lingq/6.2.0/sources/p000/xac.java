package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcw;

/* JADX INFO: loaded from: classes2.dex */
public final class xac implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final xac f68012a = new xac();

    /* JADX INFO: renamed from: b */
    public static final c33 f68013b = new c33("logEventKey", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(1, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: c */
    public static final c33 f68014c = new c33("eventCount", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(2, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: d */
    public static final c33 f68015d = new c33("inferenceDurationStats", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(3, zzcw.DEFAULT))));

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        h3c h3cVar = (h3c) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12789a(f68013b, h3cVar.f41761a);
        gp6Var.mo12789a(f68014c, h3cVar.f41762b);
        gp6Var.mo12789a(f68015d, h3cVar.f41763c);
    }
}
