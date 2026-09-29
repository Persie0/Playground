package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcw;

/* JADX INFO: loaded from: classes2.dex */
public final class ric implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final ric f59379a = new ric();

    /* JADX INFO: renamed from: b */
    public static final c33 f59380b = new c33("imageFormat", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(1, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: c */
    public static final c33 f59381c = new c33("originalImageSize", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(2, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: d */
    public static final c33 f59382d = new c33("compressedImageSize", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(3, zzcw.DEFAULT))));

    /* JADX INFO: renamed from: e */
    public static final c33 f59383e = new c33("isOdmlImage", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(4, zzcw.DEFAULT))));

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        v6d v6dVar = (v6d) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12789a(f59380b, v6dVar.f64953a);
        gp6Var.mo12789a(f59381c, v6dVar.f64954b);
        gp6Var.mo12789a(f59382d, null);
        gp6Var.mo12789a(f59383e, null);
    }
}
