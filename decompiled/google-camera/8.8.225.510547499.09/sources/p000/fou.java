package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fou implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22970a;

    /* JADX INFO: renamed from: b */
    private final oju f22971b;

    /* JADX INFO: renamed from: c */
    private final oju f22972c;

    /* JADX INFO: renamed from: d */
    private final oju f22973d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f22974e;

    public fou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i) {
        this.f22974e = i;
        this.f22970a = ojuVar;
        this.f22971b = ojuVar2;
        this.f22972c = ojuVar3;
        this.f22973d = ojuVar4;
    }

    public fou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr) {
        this.f22974e = i;
        this.f22973d = ojuVar;
        this.f22971b = ojuVar2;
        this.f22970a = ojuVar3;
        this.f22972c = ojuVar4;
    }

    public fou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[] cArr) {
        this.f22974e = i;
        this.f22970a = ojuVar;
        this.f22972c = ojuVar2;
        this.f22971b = ojuVar3;
        this.f22973d = ojuVar4;
    }

    public fou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[] iArr) {
        this.f22974e = i;
        this.f22970a = ojuVar;
        this.f22971b = ojuVar2;
        this.f22973d = ojuVar3;
        this.f22972c = ojuVar4;
    }

    public fou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[] sArr) {
        this.f22974e = i;
        this.f22971b = ojuVar;
        this.f22972c = ojuVar2;
        this.f22973d = ojuVar3;
        this.f22970a = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static fou m8641a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        return new fou(ojuVar, ojuVar2, ojuVar3, ojuVar4, 4, (int[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f22974e) {
            case 0:
                gtd gtdVar = (gtd) this.f22970a.get();
                oju ojuVar = this.f22971b;
                kms kmsVar = (kms) this.f22972c.get();
                kby kbyVar = new kby((kbz) this.f22973d.get(), "SlowMotionModeModule#provideVideoHfrAgent");
                try {
                    Object objM16829i = kmsVar.mo13864k() ? mrm.m16829i(new gtd(gtdVar, ojuVar, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null)) : mqu.f41450a;
                    kbyVar.close();
                    return objM16829i;
                } catch (Throwable th) {
                    try {
                        kbyVar.close();
                        break;
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            break;
                        } catch (Exception e) {
                        }
                    }
                    throw th;
                }
            case 1:
                return new glk((kms) this.f22973d.get(), ((eme) this.f22971b).get(), (dnn) this.f22970a.get(), (dhv) this.f22972c.get());
            case 2:
                boolean zBooleanValue = ((cde) this.f22970a).m3490a().booleanValue();
                gtd gtdVar2 = (gtd) this.f22972c.get();
                oju ojuVar2 = this.f22971b;
                kby kbyVar2 = new kby((kbz) this.f22973d.get(), "TimelapseModeModule#provideTimelapseAgent");
                try {
                    Object objM16829i2 = zBooleanValue ? mrm.m16829i(new gtd(gtdVar2, ojuVar2, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null)) : mqu.f41450a;
                    kbyVar2.close();
                    return objM16829i2;
                } catch (Throwable th3) {
                    try {
                        kbyVar2.close();
                        break;
                    } catch (Throwable th4) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            break;
                        } catch (Exception e2) {
                        }
                    }
                    throw th3;
                }
            case 3:
                return new fpp((elx) this.f22971b.get(), ((dws) this.f22972c).m6830a(), (jvd) this.f22973d.get(), (jww) this.f22970a.get());
            default:
                return ((fpt) this.f22970a).get().m9741f(((ohl) ohl.m18489b(this.f22971b)).get(), ((frc) this.f22973d).get(), (fqi) this.f22972c.get());
        }
    }
}
