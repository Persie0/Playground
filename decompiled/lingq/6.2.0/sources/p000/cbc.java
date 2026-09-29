package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcw;

/* JADX INFO: loaded from: classes2.dex */
public final class cbc implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final cbc f9859a = new cbc();

    /* JADX INFO: renamed from: b */
    public static final c33 f9860b = new c33("errorCode", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(1, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: c */
    public static final c33 f9861c = new c33("hasResult", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(2, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: d */
    public static final c33 f9862d = new c33("isColdCall", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(3, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: e */
    public static final c33 f9863e = new c33("imageInfo", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(4, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: f */
    public static final c33 f9864f = new c33("recognizerOptions", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(5, zzcw.DEFAULT))));

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        b3c b3cVar = (b3c) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12789a(f9860b, b3cVar.f7882a);
        gp6Var.mo12789a(f9861c, null);
        gp6Var.mo12789a(f9862d, b3cVar.f7883b);
        gp6Var.mo12789a(f9863e, null);
        gp6Var.mo12789a(f9864f, b3cVar.f7884c);
    }
}
