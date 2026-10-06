package p000;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class isz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ite f32042a;

    /* JADX INFO: renamed from: b */
    private float f32043b = -1.0f;

    public isz(ite iteVar) {
        this.f32042a = iteVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m11712a(float f, boolean z) {
        if (z) {
            this.f32042a.f32103h.mo3415bf(Float.valueOf(this.f32042a.f32062M.m4535d(f)));
            if (this.f32042a.f32099d.mo6184l(dib.f11317bX) && this.f32042a.f32071V) {
                float fFloatValue = new BigDecimal(f).setScale(2, RoundingMode.HALF_UP).floatValue();
                int i = (int) fFloatValue;
                if (fFloatValue == i) {
                    double d = fFloatValue;
                    ite iteVar = this.f32042a;
                    if (d != iteVar.f32084ah) {
                        if (iteVar.f32062M.f7398t.contains(Integer.valueOf(i))) {
                            this.f32042a.f32061L.performHapticFeedback(3);
                        } else {
                            this.f32042a.f32061L.performHapticFeedback(4);
                        }
                        this.f32042a.f32084ah = d;
                        this.f32043b = f;
                        return;
                    }
                }
                if (Math.abs(f - this.f32043b) > 0.2f) {
                    this.f32042a.f32084ah = -1.0d;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11713b() {
        this.f32042a.m11732M();
        this.f32042a.f32054E.mo11686p();
    }
}
