package p000;

import android.view.KeyEvent;
import androidx.compose.material3.AbstractC0226d0;

/* JADX INFO: loaded from: classes2.dex */
public final class ua9 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f63645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h41 f63646b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f63647c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f63648d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f63649e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f63650f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ vi3 f63651g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float f63652h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ui3 f63653i;

    public ua9(boolean z, h41 h41Var, int i, boolean z2, boolean z3, float f, vi3 vi3Var, float f2, ui3 ui3Var) {
        this.f63645a = z;
        this.f63646b = h41Var;
        this.f63647c = i;
        this.f63648d = z2;
        this.f63649e = z3;
        this.f63650f = f;
        this.f63651g = vi3Var;
        this.f63652h = f2;
        this.f63653i = ui3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((bi4) obj).f8562a;
        h41 h41Var = this.f63646b;
        float f = h41Var.f41765a;
        float f2 = h41Var.f41766b;
        if (!this.f63645a) {
            return Boolean.FALSE;
        }
        int iM4668b = chd.m4668b(keyEvent);
        if (iM4668b != 2) {
            if (iM4668b != 1) {
                return Boolean.FALSE;
            }
            long jM10397a = dhd.m10397a(keyEvent.getKeyCode());
            if (!rh4.m20661a(jM10397a, rh4.f59287g) && !rh4.m20661a(jM10397a, rh4.f59286f) && !rh4.m20661a(jM10397a, rh4.f59302v) && !rh4.m20661a(jM10397a, rh4.f59303w) && !rh4.m20661a(jM10397a, rh4.f59268C) && !rh4.m20661a(jM10397a, rh4.f59269D)) {
                return Boolean.FALSE;
            }
            this.f63653i.mo0a();
            return Boolean.TRUE;
        }
        float fAbs = Math.abs(f2 - f);
        int i = this.f63647c;
        int i2 = i > 0 ? i + 1 : 100;
        float f3 = fAbs / i2;
        int i3 = this.f63648d ? -1 : 1;
        boolean z = this.f63649e;
        float f4 = this.f63652h;
        float f5 = this.f63650f;
        vi3 vi3Var = this.f63651g;
        if (z) {
            h41 h41Var2 = new h41(f, f5);
            long jM10397a2 = dhd.m10397a(keyEvent.getKeyCode());
            if (rh4.m20661a(jM10397a2, rh4.f59287g)) {
                vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(((Number) l70.m15948k(Float.valueOf((i3 * f3) + f4), h41Var2)).floatValue(), f5)));
                return Boolean.TRUE;
            }
            if (rh4.m20661a(jM10397a2, rh4.f59286f)) {
                vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(((Number) l70.m15948k(Float.valueOf(f4 - (i3 * f3)), h41Var2)).floatValue(), f5)));
                return Boolean.TRUE;
            }
            if (rh4.m20661a(jM10397a2, rh4.f59268C)) {
                vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(((Number) l70.m15948k(Float.valueOf((l70.m15945h(i2 / 10, 1, 10) * f3) + f4), h41Var2)).floatValue(), f5)));
                return Boolean.TRUE;
            }
            if (rh4.m20661a(jM10397a2, rh4.f59269D)) {
                vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(((Number) l70.m15948k(Float.valueOf(f4 - (l70.m15945h(i2 / 10, 1, 10) * f3)), h41Var2)).floatValue(), f5)));
                return Boolean.TRUE;
            }
            if (rh4.m20661a(jM10397a2, rh4.f59302v)) {
                vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(f, f5)));
                return Boolean.TRUE;
            }
            if (!rh4.m20661a(jM10397a2, rh4.f59303w)) {
                return Boolean.FALSE;
            }
            vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(f5, f5)));
            return Boolean.TRUE;
        }
        h41 h41Var3 = new h41(f4, f2);
        long jM10397a3 = dhd.m10397a(keyEvent.getKeyCode());
        if (rh4.m20661a(jM10397a3, rh4.f59287g)) {
            vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(f4, ((Number) l70.m15948k(Float.valueOf((i3 * f3) + f5), h41Var3)).floatValue())));
            return Boolean.TRUE;
        }
        if (rh4.m20661a(jM10397a3, rh4.f59286f)) {
            vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(f4, ((Number) l70.m15948k(Float.valueOf(f5 - (i3 * f3)), h41Var3)).floatValue())));
            return Boolean.TRUE;
        }
        if (rh4.m20661a(jM10397a3, rh4.f59268C)) {
            vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(f4, ((Number) l70.m15948k(Float.valueOf((l70.m15945h(i2 / 10, 1, 10) * f3) + f5), h41Var3)).floatValue())));
            return Boolean.TRUE;
        }
        if (rh4.m20661a(jM10397a3, rh4.f59269D)) {
            vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(f4, ((Number) l70.m15948k(Float.valueOf(f5 - (l70.m15945h(i2 / 10, 1, 10) * f3)), h41Var3)).floatValue())));
            return Boolean.TRUE;
        }
        if (rh4.m20661a(jM10397a3, rh4.f59302v)) {
            vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(f4, f4)));
            return Boolean.TRUE;
        }
        if (!rh4.m20661a(jM10397a3, rh4.f59303w)) {
            return Boolean.FALSE;
        }
        vi3Var.invoke(new wa9(AbstractC0226d0.m1136g(f4, f2)));
        return Boolean.TRUE;
    }
}
