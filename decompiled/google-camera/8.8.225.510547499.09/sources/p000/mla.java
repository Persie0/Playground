package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mla extends mkv {
    @Override // p000.mkv
    /* JADX INFO: renamed from: a */
    public final void mo16492a(mlk mlkVar, float f, float f2) {
        mlkVar.m16608f(f2 * f, 180.0f, 90.0f);
        float f3 = (f2 + f2) * f;
        mlg mlgVar = new mlg(0.0f, 0.0f, f3, f3);
        mlgVar.f40978e = 180.0f;
        mlgVar.f40979f = 90.0f;
        mlkVar.f40988f.add(mlgVar);
        mlkVar.m16604b(new mlj(), 180.0f, 270.0f);
        float f4 = f3 + 0.0f;
        float f5 = f4 / 2.0f;
        float f6 = f4 * 0.5f;
        mlkVar.f40984b = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f6;
        mlkVar.f40985c = f6 + (f5 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
