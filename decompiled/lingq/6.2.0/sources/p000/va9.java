package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class va9 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f65145a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h41 f65146b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f65147c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f65148d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f65149e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f65150f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ float f65151g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ui3 f65152h;

    public va9(boolean z, h41 h41Var, int i, boolean z2, vi3 vi3Var, boolean z3, float f, ui3 ui3Var) {
        this.f65145a = z;
        this.f65146b = h41Var;
        this.f65147c = i;
        this.f65148d = z2;
        this.f65149e = vi3Var;
        this.f65150f = z3;
        this.f65151g = f;
        this.f65152h = ui3Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((bi4) obj).f8562a;
        if (!this.f65145a) {
            return Boolean.FALSE;
        }
        int iM4668b = chd.m4668b(keyEvent);
        boolean z = this.f65150f;
        if (iM4668b != 2) {
            if (iM4668b != 1) {
                return Boolean.FALSE;
            }
            ui3 ui3Var = this.f65152h;
            if (z) {
                long jM10397a = dhd.m10397a(keyEvent.getKeyCode());
                if (!rh4.m20661a(jM10397a, rh4.f59284d) && !rh4.m20661a(jM10397a, rh4.f59285e) && !rh4.m20661a(jM10397a, rh4.f59302v) && !rh4.m20661a(jM10397a, rh4.f59303w) && !rh4.m20661a(jM10397a, rh4.f59268C) && !rh4.m20661a(jM10397a, rh4.f59269D)) {
                    return Boolean.FALSE;
                }
                if (ui3Var != null) {
                    ui3Var.mo0a();
                }
                return Boolean.TRUE;
            }
            long jM10397a2 = dhd.m10397a(keyEvent.getKeyCode());
            if (!rh4.m20661a(jM10397a2, rh4.f59287g) && !rh4.m20661a(jM10397a2, rh4.f59286f) && !rh4.m20661a(jM10397a2, rh4.f59302v) && !rh4.m20661a(jM10397a2, rh4.f59303w) && !rh4.m20661a(jM10397a2, rh4.f59268C) && !rh4.m20661a(jM10397a2, rh4.f59269D)) {
                return Boolean.FALSE;
            }
            if (ui3Var != null) {
                ui3Var.mo0a();
            }
            return Boolean.TRUE;
        }
        h41 h41Var = this.f65146b;
        float f = h41Var.f41766b;
        float f2 = h41Var.f41765a;
        float fAbs = Math.abs(f - f2);
        int i = this.f65147c;
        int i2 = i > 0 ? i + 1 : 100;
        float f3 = fAbs / i2;
        int i3 = this.f65148d ? -1 : 1;
        boolean zM20661a = rh4.m20661a(dhd.m10397a(keyEvent.getKeyCode()), rh4.f59302v);
        vi3 vi3Var = this.f65149e;
        if (zM20661a) {
            vi3Var.invoke(Float.valueOf(f2));
            return Boolean.TRUE;
        }
        if (rh4.m20661a(dhd.m10397a(keyEvent.getKeyCode()), rh4.f59303w)) {
            vi3Var.invoke(Float.valueOf(h41Var.f41766b));
            return Boolean.TRUE;
        }
        float f4 = this.f65151g;
        if (z) {
            long jM10397a3 = dhd.m10397a(keyEvent.getKeyCode());
            if (rh4.m20661a(jM10397a3, rh4.f59284d)) {
                vi3Var.invoke(l70.m15948k(Float.valueOf(f4 - (i3 * f3)), h41Var));
                return Boolean.TRUE;
            }
            if (rh4.m20661a(jM10397a3, rh4.f59285e)) {
                vi3Var.invoke(l70.m15948k(Float.valueOf((i3 * f3) + f4), h41Var));
                return Boolean.TRUE;
            }
            if (rh4.m20661a(jM10397a3, rh4.f59268C)) {
                vi3Var.invoke(l70.m15948k(Float.valueOf(f4 - ((l70.m15945h(i2 / 10, 1, 10) * i3) * f3)), h41Var));
                return Boolean.TRUE;
            }
            if (!rh4.m20661a(jM10397a3, rh4.f59269D)) {
                return Boolean.FALSE;
            }
            vi3Var.invoke(l70.m15948k(Float.valueOf((l70.m15945h(i2 / 10, 1, 10) * i3 * f3) + f4), h41Var));
            return Boolean.TRUE;
        }
        long jM10397a4 = dhd.m10397a(keyEvent.getKeyCode());
        if (rh4.m20661a(jM10397a4, rh4.f59287g)) {
            vi3Var.invoke(l70.m15948k(Float.valueOf((i3 * f3) + f4), h41Var));
            return Boolean.TRUE;
        }
        if (rh4.m20661a(jM10397a4, rh4.f59286f)) {
            vi3Var.invoke(l70.m15948k(Float.valueOf(f4 - (i3 * f3)), h41Var));
            return Boolean.TRUE;
        }
        if (rh4.m20661a(jM10397a4, rh4.f59268C)) {
            vi3Var.invoke(l70.m15948k(Float.valueOf((l70.m15945h(i2 / 10, 1, 10) * f3) + f4), h41Var));
            return Boolean.TRUE;
        }
        if (!rh4.m20661a(jM10397a4, rh4.f59269D)) {
            return Boolean.FALSE;
        }
        vi3Var.invoke(l70.m15948k(Float.valueOf(f4 - (l70.m15945h(i2 / 10, 1, 10) * f3)), h41Var));
        return Boolean.TRUE;
    }
}
