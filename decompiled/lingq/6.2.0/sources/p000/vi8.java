package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class vi8 extends i9d {
    @Override // p000.i9d
    /* JADX INFO: renamed from: e */
    public final void mo13750e(l49 l49Var, float f, float f2) {
        float f3 = f2 * f;
        l49Var.m15800d(0.0f, f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        h49 h49Var = new h49(0.0f, 0.0f, f4, f4);
        h49.m13044b(h49Var, 180.0f);
        h49.m13045c(h49Var, 90.0f);
        l49Var.f49053g.add(h49Var);
        f49 f49Var = new f49(h49Var);
        l49Var.m15797a(180.0f);
        l49Var.f49054h.add(f49Var);
        l49Var.f49051e = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        l49Var.f49049c = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        l49Var.f49050d = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
