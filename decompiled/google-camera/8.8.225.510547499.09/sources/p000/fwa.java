package p000;

import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.stats.ViewfinderJankSession;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwa implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23731a;

    /* JADX INFO: renamed from: b */
    private final oju f23732b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f23733c;

    public fwa(oju ojuVar, oju ojuVar2, int i) {
        this.f23733c = i;
        this.f23731a = ojuVar;
        this.f23732b = ojuVar2;
    }

    public fwa(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f23733c = i;
        this.f23732b = ojuVar;
        this.f23731a = ojuVar2;
    }

    public fwa(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f23733c = i;
        this.f23732b = ojuVar;
        this.f23731a = ojuVar2;
    }

    public fwa(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f23733c = i;
        this.f23732b = ojuVar;
        this.f23731a = ojuVar2;
    }

    public fwa(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f23733c = i;
        this.f23732b = ojuVar;
        this.f23731a = ojuVar2;
    }

    public fwa(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f23733c = i;
        this.f23732b = ojuVar;
        this.f23731a = ojuVar2;
    }

    public fwa(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f23733c = i;
        this.f23732b = ojuVar;
        this.f23731a = ojuVar2;
    }

    public fwa(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f23733c = i;
        this.f23732b = ojuVar;
        this.f23731a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static fwa m8844a(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 0);
    }

    /* JADX INFO: renamed from: b */
    public static fwa m8845b(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 1, (byte[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static fwa m8846c(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 2, (char[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static fwa m8847d(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 3);
    }

    /* JADX INFO: renamed from: e */
    public static fwa m8848e(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 4, (short[]) null);
    }

    /* JADX INFO: renamed from: f */
    public static fwa m8849f(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 5, (int[]) null);
    }

    /* JADX INFO: renamed from: g */
    public static fwa m8850g(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 6, (boolean[]) null);
    }

    /* JADX INFO: renamed from: h */
    public static fwa m8851h(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 7, (float[]) null);
    }

    /* JADX INFO: renamed from: i */
    public static fwa m8852i(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 8);
    }

    /* JADX INFO: renamed from: j */
    public static fwa m8853j(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 9, (byte[][]) null);
    }

    /* JADX INFO: renamed from: k */
    public static fwa m8854k(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 10);
    }

    /* JADX INFO: renamed from: l */
    public static fwa m8855l(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 12);
    }

    /* JADX INFO: renamed from: m */
    public static fwa m8856m(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 13);
    }

    /* JADX INFO: renamed from: n */
    public static fwa m8857n(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 15);
    }

    /* JADX INFO: renamed from: o */
    public static fwa m8858o(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 16);
    }

    /* JADX INFO: renamed from: p */
    public static fwa m8859p(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 18);
    }

    /* JADX INFO: renamed from: q */
    public static fwa m8860q(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 19);
    }

    /* JADX INFO: renamed from: r */
    public static fwa m8861r(oju ojuVar, oju ojuVar2) {
        return new fwa(ojuVar, ojuVar2, 20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, oju] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f23733c) {
            case 0:
                jvb jvbVar = (jvb) this.f23731a.get();
                jvb jvbVar2 = (jvb) this.f23732b.get();
                ScheduledExecutorService scheduledExecutorServiceM13827o = jzn.m13827o(NptsKnlVczSZ.YTPP, 1);
                jvbVar.m13537d(new ezc(scheduledExecutorServiceM13827o, 13));
                jvbVar2.m13537d(new ezc(scheduledExecutorServiceM13827o, 14));
                return scheduledExecutorServiceM13827o;
            case 1:
                jwn jwnVarM13640j = jwr.m13640j(jwr.m13634d(jwr.m13640j(((fup) this.f23731a.get()).f23601a, new cev(2)), ((bkn) this.f23732b.get()).f3651a), new cev(3));
                jwnVarM13640j.getClass();
                return jwnVarM13640j;
            case 2:
                fvu fvuVarM8922a = ((fxj) this.f23732b).m8922a();
                dhv dhvVar = (dhv) this.f23731a.get();
                dhx dhxVar = did.f11416a;
                dhvVar.mo6175c();
                return fxo.m8928b(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, dhvVar.mo6184l(dib.f11291ay) ? inr.m11536h(fvuVarM8922a.mo14568u(), false) : inr.m11536h(fvuVarM8922a.mo14568u(), true));
            case 3:
                fvd fvdVar = (fvd) this.f23731a.get();
                mrm mrmVar = (mrm) this.f23732b.get();
                if (mrmVar.mo16813g()) {
                    fvdVar = (fvd) mrmVar.mo16809c();
                }
                jwn jwnVarM8932f = fxo.m8932f(CaptureRequest.CONTROL_AWB_MODE, fvdVar.f23623a);
                jwnVarM8932f.getClass();
                return jwnVarM8932f;
            case 4:
                return new cke((Executor) this.f23732b.get(), (nps) this.f23731a.get());
            case 5:
                return nod.m17553i(kxk.m14962H((nps) this.f23732b.get(), (nps) this.f23731a.get()), fod.f22903h, not.INSTANCE);
            case 6:
                return new cke((Executor) this.f23732b.get(), (nps) this.f23731a.get());
            case 7:
                return new gbd((gbi) this.f23732b.get(), (jwl) this.f23731a.get(), 1, null);
            case 8:
                return new gbd((gbi) this.f23731a.get(), (kbg) this.f23732b.get(), 0);
            case 9:
                ggs ggsVar = (ggs) this.f23732b.get();
                gbt gbtVar = (gbt) this.f23731a.get();
                ggsVar.m9230n(kfi.m14106a(gbtVar));
                gbtVar.getClass();
                return gbtVar;
            case 10:
                return ((dhv) this.f23732b.get()).mo6184l(did.f11424ac) ? mrm.m16829i((gnm) this.f23731a.get()) : mqu.f41450a;
            case 11:
                mca mcaVar = ((epl) this.f23731a).get();
                gbi gbiVar = (gbi) this.f23732b.get();
                gof gofVar = (gof) mcaVar.f39915c.get();
                gofVar.getClass();
                jwn jwnVar = (jwn) mcaVar.f39919g.get();
                jwnVar.getClass();
                jvb jvbVar3 = (jvb) mcaVar.f39914b.get();
                jvbVar3.getClass();
                mrm mrmVarM7866a = ((etl) mcaVar.f39916d).m7866a();
                Object obj = mcaVar.f39917e.get();
                jwn jwnVarM7519a = ((emf) mcaVar.f39918f).m7519a();
                jwn jwnVar2 = (jwn) mcaVar.f39920h.get();
                jwnVar2.getClass();
                ?? r10 = mcaVar.f39913a;
                ecj ecjVar = (ecj) mcaVar.f39921i.get();
                ecjVar.getClass();
                gbiVar.getClass();
                return new epk(gofVar, jwnVar, jvbVar3, mrmVarM7866a, (epf) obj, jwnVarM7519a, jwnVar2, r10, ecjVar, gbiVar);
            case 12:
                Object gifVar = ((fxj) this.f23732b).m8922a().mo14558k() == kmq.f36557a ? (gib) this.f23731a.get() : new gif();
                gifVar.getClass();
                return gifVar;
            case 13:
                Map map = (Map) this.f23731a.get();
                dhv dhvVar2 = (dhv) this.f23732b.get();
                EnumMap enumMap = new EnumMap(gnf.class);
                for (gnf gnfVar : map.keySet()) {
                    kgg kggVar = (kgg) map.get(gnfVar);
                    if (kggVar != null) {
                        kmg kmgVarMo14193c = kggVar.mo14193c();
                        if (dhvVar2.mo6184l(dht.f11186n)) {
                            if (gnfVar == gnf.RAW_WIDE_UPPER) {
                                kmgVarMo14193c = kmg.m14575b(dht.f11173a);
                            } else if (gnfVar == gnf.RAW_WIDE_ZOOM_UPPER) {
                                kmgVarMo14193c = kmg.m14575b(dht.f11174b);
                            }
                        }
                        enumMap.put(gnfVar, kmgVarMo14193c);
                    }
                }
                return enumMap;
            case 14:
                gtd gtdVar = ((gbc) this.f23731a).get();
                gbi gbiVar2 = (gbi) this.f23732b.get();
                gdt gdtVar = (gdt) gtdVar.f26335b.get();
                gdtVar.getClass();
                Object obj2 = gtdVar.f26334a.get();
                gbiVar2.getClass();
                return new gbb(gdtVar, (mca) obj2, gbiVar2, null, null, null);
            case 15:
                Object objM9232a = ((fxj) this.f23732b).m8922a().mo14558k() == kmq.f36557a ? (gib) this.f23731a.get() : ggv.m9232a();
                objM9232a.getClass();
                return objM9232a;
            case 16:
                Object objM9232a2 = ((fxj) this.f23732b).m8922a().mo14558k() == kmq.f36557a ? (gib) this.f23731a.get() : ggv.m9232a();
                objM9232a2.getClass();
                return objM9232a2;
            case 17:
                ihk ihkVar = ((haj) this.f23731a).get();
                dhv dhvVar3 = (dhv) this.f23732b.get();
                gdb gdbVar = gcv.f24243a;
                return dhvVar3.mo6184l(did.f11414Y) ? new gdc(jwv.m13644a(gcv.f24243a.f24268d), gcv.f24243a) : new gdc(ihkVar.m11351s("pref_camera_hdr_plus_key", gcv.f24243a.f24268d), gcv.f24243a);
            case 18:
                return new gdn((fcp) this.f23731a.get(), (jvd) this.f23732b.get());
            case 19:
                hkx hkxVar = (hkx) this.f23731a.get();
                jvb jvbVar4 = (jvb) this.f23732b.get();
                ViewfinderJankSession viewfinderJankSession = (ViewfinderJankSession) hkxVar.mo10394a();
                jvbVar4.m13537d(viewfinderJankSession);
                return viewfinderJankSession;
            default:
                return new gdq(((dki) this.f23731a).get(), (dlc) this.f23732b.get());
        }
    }
}
