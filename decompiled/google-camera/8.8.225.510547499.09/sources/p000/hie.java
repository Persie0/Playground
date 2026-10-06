package p000;

import android.app.Activity;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.OneCameraTiming;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hie implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f27891a;

    /* JADX INFO: renamed from: b */
    private final oju f27892b;

    /* JADX INFO: renamed from: c */
    private final oju f27893c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f27894d;

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i) {
        this.f27894d = i;
        this.f27891a = ojuVar;
        this.f27892b = ojuVar2;
        this.f27893c = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[] bArr) {
        this.f27894d = i;
        this.f27891a = ojuVar;
        this.f27893c = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[] cArr) {
        this.f27894d = i;
        this.f27891a = ojuVar;
        this.f27893c = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[] fArr) {
        this.f27894d = i;
        this.f27892b = ojuVar;
        this.f27891a = ojuVar2;
        this.f27893c = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[] iArr) {
        this.f27894d = i;
        this.f27893c = ojuVar;
        this.f27891a = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[] sArr) {
        this.f27894d = i;
        this.f27893c = ojuVar;
        this.f27891a = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[] zArr) {
        this.f27894d = i;
        this.f27893c = ojuVar;
        this.f27891a = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][] bArr) {
        this.f27894d = i;
        this.f27893c = ojuVar;
        this.f27892b = ojuVar2;
        this.f27891a = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][] cArr) {
        this.f27894d = i;
        this.f27893c = ojuVar;
        this.f27891a = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, float[][] fArr) {
        this.f27894d = i;
        this.f27893c = ojuVar;
        this.f27891a = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][] iArr) {
        this.f27894d = i;
        this.f27893c = ojuVar;
        this.f27891a = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][] sArr) {
        this.f27894d = i;
        this.f27891a = ojuVar;
        this.f27893c = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][] zArr) {
        this.f27894d = i;
        this.f27893c = ojuVar;
        this.f27892b = ojuVar2;
        this.f27891a = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, byte[][][] bArr) {
        this.f27894d = i;
        this.f27891a = ojuVar;
        this.f27893c = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, char[][][] cArr) {
        this.f27894d = i;
        this.f27893c = ojuVar;
        this.f27891a = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, int[][][] iArr) {
        this.f27894d = i;
        this.f27891a = ojuVar;
        this.f27893c = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, short[][][] sArr) {
        this.f27894d = i;
        this.f27891a = ojuVar;
        this.f27893c = ojuVar2;
        this.f27892b = ojuVar3;
    }

    public hie(oju ojuVar, oju ojuVar2, oju ojuVar3, int i, boolean[][][] zArr) {
        this.f27894d = i;
        this.f27892b = ojuVar;
        this.f27893c = ojuVar2;
        this.f27891a = ojuVar3;
    }

    /* JADX INFO: renamed from: a */
    public static hie m10333a(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new hie(ojuVar, ojuVar2, ojuVar3, 9, (char[][]) null);
    }

    /* JADX INFO: renamed from: b */
    public static hie m10334b(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new hie(ojuVar, ojuVar2, ojuVar3, 14, (float[][]) null);
    }

    /* JADX INFO: renamed from: c */
    public static hie m10335c(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new hie(ojuVar, ojuVar2, ojuVar3, 15);
    }

    /* JADX INFO: renamed from: d */
    public static hie m10336d(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        return new hie(ojuVar, ojuVar2, ojuVar3, 19, (int[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        final int i = 1;
        switch (this.f27894d) {
            case 0:
                return true != ((dhv) this.f27891a.get()).mo6184l(dis.f11709e) ? ((hjf) this.f27892b).get() : ((hjc) this.f27893c).get();
            case 1:
                return new hha((ihk) this.f27891a.get(), (had) this.f27893c.get(), (hah) this.f27892b.get(), null, null, null);
            case 2:
                return new hio(((dws) this.f27891a).m6830a(), (dhv) this.f27893c.get(), (kbz) this.f27892b.get());
            case 3:
                final Instrumentation instrumentation = (Instrumentation) this.f27893c.get();
                final ksa ksaVar = (ksa) this.f27891a.get();
                final kbz kbzVar = (kbz) this.f27892b.get();
                return new hkx() { // from class: hkm
                    @Override // p000.hkx
                    /* JADX INFO: renamed from: a */
                    public final Object mo10394a() {
                        switch (i) {
                            case 0:
                                Instrumentation instrumentation2 = instrumentation;
                                hkz hkzVar = new hkz(ksaVar, kbzVar);
                                instrumentation2.m4300f(hkzVar);
                                return hkzVar;
                            case 1:
                                Instrumentation instrumentation3 = instrumentation;
                                hku hkuVar = new hku(ksaVar, kbzVar);
                                instrumentation3.m4300f(hkuVar);
                                return hkuVar;
                            default:
                                Instrumentation instrumentation4 = instrumentation;
                                OneCameraTiming oneCameraTiming = new OneCameraTiming(ksaVar, kbzVar);
                                instrumentation4.m4300f(oneCameraTiming);
                                return oneCameraTiming;
                        }
                    }
                };
            case 4:
                final Instrumentation instrumentation2 = (Instrumentation) this.f27893c.get();
                final ksa ksaVar2 = (ksa) this.f27891a.get();
                final kbz kbzVar2 = (kbz) this.f27892b.get();
                final int i2 = 2;
                return new hkx() { // from class: hkm
                    @Override // p000.hkx
                    /* JADX INFO: renamed from: a */
                    public final Object mo10394a() {
                        switch (i2) {
                            case 0:
                                Instrumentation instrumentation3 = instrumentation2;
                                hkz hkzVar = new hkz(ksaVar2, kbzVar2);
                                instrumentation3.m4300f(hkzVar);
                                return hkzVar;
                            case 1:
                                Instrumentation instrumentation4 = instrumentation2;
                                hku hkuVar = new hku(ksaVar2, kbzVar2);
                                instrumentation4.m4300f(hkuVar);
                                return hkuVar;
                            default:
                                Instrumentation instrumentation5 = instrumentation2;
                                OneCameraTiming oneCameraTiming = new OneCameraTiming(ksaVar2, kbzVar2);
                                instrumentation5.m4300f(oneCameraTiming);
                                return oneCameraTiming;
                        }
                    }
                };
            case 5:
                final Instrumentation instrumentation3 = (Instrumentation) this.f27893c.get();
                final ksa ksaVar3 = (ksa) this.f27891a.get();
                final kbz kbzVar3 = (kbz) this.f27892b.get();
                final int i3 = 0;
                return new hkx() { // from class: hkm
                    @Override // p000.hkx
                    /* JADX INFO: renamed from: a */
                    public final Object mo10394a() {
                        switch (i3) {
                            case 0:
                                Instrumentation instrumentation4 = instrumentation3;
                                hkz hkzVar = new hkz(ksaVar3, kbzVar3);
                                instrumentation4.m4300f(hkzVar);
                                return hkzVar;
                            case 1:
                                Instrumentation instrumentation5 = instrumentation3;
                                hku hkuVar = new hku(ksaVar3, kbzVar3);
                                instrumentation5.m4300f(hkuVar);
                                return hkuVar;
                            default:
                                Instrumentation instrumentation6 = instrumentation3;
                                OneCameraTiming oneCameraTiming = new OneCameraTiming(ksaVar3, kbzVar3);
                                instrumentation6.m4300f(oneCameraTiming);
                                return oneCameraTiming;
                        }
                    }
                };
            case 6:
                lqc lqcVar = (lqc) this.f27892b.get();
                ((dws) this.f27891a).m6830a();
                return new ihk(lqcVar, (byte[]) null);
            case 7:
                hmy hmyVar = ((hmz) this.f27893c).get();
                fdh.m8265e((jvd) this.f27892b.get(), ((eru) this.f27891a).get(), hmyVar);
                return hmyVar;
            case 8:
                Object objM17136H = ((dhv) this.f27891a.get()).mo6184l(dib.f11351ce) ? mxk.m17136H(new ets(ohh.m18485a(this.f27893c), (AmbientModeSupport.AmbientController) this.f27892b.get(), 5, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null)) : mzx.f41874a;
                objM17136H.getClass();
                return objM17136H;
            case 9:
                hna hnaVar = (hna) this.f27893c.get();
                kmd kmdVar = ((fxk) this.f27891a).get();
                dhv dhvVar = (dhv) this.f27892b.get();
                nbh nbhVar = hni.f28479a;
                Object objM17136H2 = (dhvVar.mo6184l(dib.f11351ce) && kmdVar.mo14558k() == kmq.BACK) ? mxk.m17136H(hnaVar) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 10:
                return new hoa((Executor) this.f27891a.get(), (jww) this.f27893c.get(), ((hog) this.f27892b).m10532a());
            case 11:
                return new hpp(((dww) this.f27893c).m6836a(), (fly) this.f27891a.get(), (jfs) this.f27892b.get(), null, null, null);
            case 12:
                return new hrp((hru) this.f27893c.get(), ((hfb) this.f27892b).m10179a(), (kbz) this.f27891a.get());
            case 13:
                return new djm(((dws) this.f27891a).m6830a(), (kbz) this.f27892b.get(), (dhv) this.f27893c.get());
            case 14:
                return new eat((kni) this.f27893c.get(), (drj) this.f27891a.get(), (eav) this.f27892b.get(), 1, 1, 1, null, null, null, null);
            case 15:
                return new hse((eat) this.f27891a.get(), (dyf) this.f27892b.get(), (dxx) this.f27893c.get());
            case 16:
                nps npsVar = (nps) this.f27891a.get();
                Executor executor = (Executor) this.f27893c.get();
                ((dki) this.f27892b).get().mo6314a("BitmapEncoder");
                return new hlv(npsVar, executor);
            case 17:
                return new hvc((huf) this.f27893c.get(), (hua) this.f27891a.get(), (cyu) this.f27892b.get());
            case 18:
                return new hwi((jww) this.f27891a.get(), (cyu) this.f27893c.get(), (cyy) this.f27892b.get());
            case 19:
                return new hyg((Activity) this.f27891a.get(), (fba) this.f27893c.get(), (jvd) this.f27892b.get());
            default:
                return new idf((dhv) this.f27893c.get(), ((dws) this.f27891a).m6830a());
        }
    }
}
