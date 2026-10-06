package p000;

import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotParams;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnl implements ech, edi {

    /* JADX INFO: renamed from: a */
    private static final nbh f25747a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/MemoryReservationProcessor");

    /* JADX INFO: renamed from: b */
    private final fem f25748b;

    /* JADX INFO: renamed from: c */
    private final HashMap f25749c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final jwn f25750d;

    /* JADX INFO: renamed from: e */
    private final bko f25751e;

    public gnl(bko bkoVar, fem femVar, jwn jwnVar, byte[] bArr) {
        this.f25751e = bkoVar;
        this.f25748b = femVar;
        this.f25750d = jwnVar;
    }

    /* JADX INFO: renamed from: j */
    private final synchronized void m9558j(eem eemVar) {
        kba kbaVar = (kba) this.f25749c.remove(eemVar);
        if (kbaVar != null) {
            kbaVar.close();
        } else {
            ((nbe) ((nbe) f25747a.m17252c()).mo17276G(3047)).mo17291p("Couldn't find in-flight shotId=%s", eemVar.m7218a());
        }
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: b */
    public final void mo7057b(eem eemVar, hkc hkcVar, ebp ebpVar) {
        eemVar.m7218a();
        m9558j(eemVar);
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: c */
    public final void mo7058c(eem eemVar, edc edcVar) {
        eemVar.m7218a();
        m9558j(eemVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gyh, java.lang.Object] */
    @Override // p000.ech
    /* JADX INFO: renamed from: d */
    public final synchronized void mo7111d(gyu gyuVar) {
        eem eemVar;
        ((nbe) ((nbe) f25747a.m17252c()).mo17276G((char) 3042)).mo17293r("AbortShot for shotId=%s", gyuVar);
        Iterator it = this.f25749c.keySet().iterator();
        do {
            if (!it.hasNext()) {
                eemVar = null;
                break;
            }
            eemVar = (eem) it.next();
        } while (!eemVar.f13675v.f25502c.mo9902h().equals(gyuVar));
        if (eemVar != null) {
            eemVar.m7218a();
            m9558j(eemVar);
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: e */
    public final void mo7112e(eem eemVar, key keyVar) {
        keyVar.close();
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: f */
    public final synchronized void mo7113f(eem eemVar, BurstSpec burstSpec, kpp kppVar) {
        knt kntVarM14604a;
        if (this.f25749c.containsKey(eemVar)) {
            return;
        }
        eemVar.m7218a();
        float fMax = Math.max(1.0f, ((Float) this.f25750d.mo3831be()).floatValue());
        ShotParams shotParamsM7219b = eemVar.m7219b();
        float f = true != GcamModuleJNI.ShotParams_allow_spatial_rgb_get(shotParamsM7219b.f8358a, shotParamsM7219b) ? 2.0f : 6.0f;
        Float fValueOf = Float.valueOf(f);
        fem femVar = this.f25748b;
        if (fMax <= 0.0f) {
            ((nbe) ((nbe) fem.f21535a.m17252c()).mo17276G(2150)).mo17271B("Invalid input value. count=%d, bytesPerPixel=%f, zoomCropFactor=%f (Must be > 0)", 1, fValueOf, Float.valueOf(fMax));
            kntVarM14604a = null;
        } else {
            double dM13905b = femVar.f21537c.m9083b().m13905b();
            double dPow = Math.pow(fMax, 2.0d);
            Double.isNaN(dM13905b);
            double d = dM13905b / dPow;
            double d2 = f;
            knx knxVar = femVar.f21536b;
            Double.isNaN(d2);
            kntVarM14604a = knxVar.m14604a((long) (d * d2));
        }
        if (kntVarM14604a != null) {
            this.f25749c.put(eemVar, kntVarM14604a);
        } else {
            ((nbe) ((nbe) f25747a.m17252c()).mo17276G(3046)).mo17291p("Not able to reserve memory immediately for shotId=%s", eemVar.m7218a());
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: g */
    public final void mo7114g(gyu gyuVar) {
        this.f25751e.m2622p(gyuVar).m7226f(this);
        int i = gyuVar.f26874a;
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: h */
    public final void mo7115h(eem eemVar) {
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo7116i(eem eemVar) {
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: p */
    public final synchronized void mo7059p(eem eemVar) {
        eemVar.m7218a();
        m9558j(eemVar);
    }
}
