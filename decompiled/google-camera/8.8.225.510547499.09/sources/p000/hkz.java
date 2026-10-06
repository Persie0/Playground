package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hkz extends hlc {

    /* JADX INFO: renamed from: a */
    public kcc f28229a;

    /* JADX INFO: renamed from: b */
    private final kbz f28230b;

    public hkz(ksc kscVar, kbz kbzVar) {
        super(kscVar, hky.values());
        this.f28230b = kbzVar;
    }

    /* JADX INFO: renamed from: c */
    public final long m10428c() {
        return m10436g(hky.SHUTTER_BUTTON_DOWN);
    }

    /* JADX INFO: renamed from: d */
    public final long m10429d() {
        return m10436g(hky.SHUTTER_BUTTON_UP);
    }

    /* JADX INFO: renamed from: e */
    public final void m10430e() {
        m10437h(hky.SHUTTER_BUTTON_DOWN);
    }

    /* JADX INFO: renamed from: f */
    public final void m10431f() {
        m10437h(hky.SHUTTER_BUTTON_UP);
        this.f28229a = this.f28230b.mo13957a("Shutter.FramesTaken");
    }
}
