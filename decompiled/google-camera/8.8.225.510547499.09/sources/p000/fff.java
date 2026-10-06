package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fff implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f21612a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f21613b;

    public /* synthetic */ fff(Context context, int i) {
        this.f21613b = i;
        this.f21612a = context;
    }

    public /* synthetic */ fff(ckw ckwVar, int i) {
        this.f21613b = i;
        this.f21612a = ckwVar;
    }

    public /* synthetic */ fff(ffh ffhVar, int i) {
        this.f21613b = i;
        this.f21612a = ffhVar;
    }

    public /* synthetic */ fff(hjb hjbVar, int i) {
        this.f21613b = i;
        this.f21612a = hjbVar;
    }

    public /* synthetic */ fff(hje hjeVar, int i) {
        this.f21613b = i;
        this.f21612a = hjeVar;
    }

    public /* synthetic */ fff(hto htoVar, int i) {
        this.f21613b = i;
        this.f21612a = htoVar;
    }

    public /* synthetic */ fff(icr icrVar, int i) {
        this.f21613b = i;
        this.f21612a = icrVar;
    }

    public /* synthetic */ fff(iga igaVar, int i) {
        this.f21613b = i;
        this.f21612a = igaVar;
    }

    public /* synthetic */ fff(ite iteVar, int i) {
        this.f21613b = i;
        this.f21612a = iteVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        kym kymVarMo3740i;
        boolean z = false;
        switch (this.f21613b) {
            case 0:
                return Boolean.valueOf(!((ffh) this.f21612a).f21616b.get());
            case 1:
                ckw ckwVar = (ckw) this.f21612a;
                return Boolean.valueOf(((Boolean) ((jwf) ckwVar.f6046e).f34942d).booleanValue() && ((Boolean) ckwVar.f6050i.mo3831be()).booleanValue());
            case 2:
                return Long.valueOf(hcf.m10102b((Context) this.f21612a));
            case 3:
                return Boolean.valueOf(((hjb) this.f21612a).m10370j());
            case 4:
                return Boolean.valueOf(((hje) this.f21612a).m10374j());
            case 5:
                Object obj = this.f21612a;
                try {
                    int iA = ((hto) obj).f29538b.mo3728a();
                    chp chpVarB = ((hto) obj).f29538b.mo3729b();
                    DisplayMetrics displayMetrics = ((hto) obj).f29539c.getDisplayMetrics();
                    double d = displayMetrics.widthPixels;
                    double d2 = displayMetrics.heightPixels;
                    Double.isNaN(d2);
                    double d3 = d2 * 0.7d;
                    if (chpVarB != null) {
                        Double.isNaN(d);
                        kymVarMo3740i = chpVarB.mo3740i((int) (d * 0.7d), (int) d3);
                    } else {
                        kymVarMo3740i = null;
                    }
                    if (kymVarMo3740i != null) {
                        Object obj2 = kymVarMo3740i.f37734b;
                        if (((mrm) obj2).mo16813g()) {
                            Bitmap bitmap = (Bitmap) ((mrm) obj2).mo16809c();
                            new kbc(bitmap.getWidth(), bitmap.getHeight());
                            return new htk(bitmap, kymVarMo3740i.f37733a);
                        }
                    }
                    return iA == 0 ? htk.m10745a() : new htk(null, 0);
                } catch (RuntimeException e) {
                    ((nbe) ((nbe) ((nbe) hto.f29537a.m17252c()).mo17283h(e)).mo17276G((char) 3951)).mo17290o("exception generating thumbnail");
                    return htk.m10745a();
                }
            case 6:
                icr icrVar = (icr) this.f21612a;
                int iM13088X = icrVar.f30389r.m13088X("TRANSLATE_TOOLTIP");
                boolean z2 = iM13088X <= 6 && iM13088X % 3 == 0;
                if (z2 || iM13088X >= 6) {
                    z = z2;
                } else {
                    icrVar.f30389r.m13090Z("TRANSLATE_TOOLTIP");
                }
                return Boolean.valueOf(z);
            case 7:
                return new IllegalStateException("Could not find longest duration among animators ".concat(String.valueOf(String.valueOf(((iga) this.f21612a).f30716q))));
            default:
                ite iteVar = (ite) this.f21612a;
                return Boolean.valueOf(iteVar.f32055F == kmq.f36557a && iteVar.f32087ak.m13088X("wide_selfie_tooltip_display_count") == 2);
        }
    }
}
