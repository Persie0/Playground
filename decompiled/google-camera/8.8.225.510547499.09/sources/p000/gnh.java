package p000;

import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.BurstSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnh implements ech, ecy, edi {

    /* JADX INFO: renamed from: a */
    public static final nbh f25718a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/AfDebugMetadataProcessor");

    /* JADX INFO: renamed from: b */
    private final HashMap f25719b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final kfk f25720c;

    /* JADX INFO: renamed from: d */
    private final Executor f25721d;

    /* JADX INFO: renamed from: e */
    private final kbz f25722e;

    /* JADX INFO: renamed from: f */
    private final bko f25723f;

    public gnh(kfk kfkVar, bko bkoVar, Executor executor, kbz kbzVar, byte[] bArr) {
        this.f25723f = bkoVar;
        this.f25721d = executor;
        this.f25722e = kbzVar;
        this.f25720c = kfkVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [gyh, java.lang.Object] */
    @Override // p000.ecy
    /* JADX INFO: renamed from: a */
    public final void mo7052a(eem eemVar, int i, long j, kpp kppVar) {
        eemVar.m7218a();
        new HashMap();
        synchronized (this) {
            HashMap map = (HashMap) this.f25719b.remove(eemVar);
            if (map == null) {
                ((nbe) ((nbe) f25718a.m17252c()).mo17276G(3021)).mo17291p("3A_DEBUG shotId=%d hasn't been started yet!", eemVar.m7218a());
                return;
            }
            this.f25722e.mo13961e("AfDebugMetadataProcessor#onBaseFrameSelected");
            Long lValueOf = Long.valueOf(j);
            if (map.containsKey(lValueOf)) {
                eemVar.m7218a();
                kpp kppVar2 = (kpp) map.get(lValueOf);
                kppVar2.getClass();
                boolean z = (kppVar2.mo9517d(ivt.f32354h) == null && kppVar2.mo9517d(ivt.f32355i) == null && kppVar2.mo9517d(ivt.f32356j) == null) ? false : true;
                long jB = kppVar2.mo9515b();
                if (z) {
                    eemVar.m7218a();
                    eemVar.f13675v.f25502c.mo9882N(kppVar2, true);
                } else if (ivy.f32453a != null) {
                    this.f25721d.execute(new dcr(this.f25720c, (gyh) eemVar.f13675v.f25502c, jB, 12));
                } else {
                    ((nbe) ((nbe) f25718a.m17252c()).mo17276G(3020)).mo17271B("3A_DEBUG shotId=%d base frame=%d (timestamp=%d) metadata does not contain debug data! Request for base frame metadata not supported!", Integer.valueOf(eemVar.m7218a()), Long.valueOf(jB), lValueOf);
                }
            } else {
                ((nbe) ((nbe) f25718a.m17252c()).mo17276G(3017)).mo17295t("3A_DEBUG shotId=%d payload does not contain base frame timestamp %d", eemVar.m7218a(), j);
            }
            this.f25722e.mo13963g("clear");
            map.clear();
            this.f25722e.mo13962f();
        }
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo7057b(eem eemVar, hkc hkcVar, ebp ebpVar) {
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: c */
    public final void mo7058c(eem eemVar, edc edcVar) {
        ((nbe) ((nbe) ((nbe) f25718a.m17252c()).mo17283h(edcVar)).mo17276G(3023)).mo17291p("3A_DEBUG onShotError for shotId=%d, shot AF metadata will be cleared.", eemVar.m7218a());
        m9549j(eemVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [gyh, java.lang.Object] */
    @Override // p000.ech
    /* JADX INFO: renamed from: d */
    public final synchronized void mo7111d(gyu gyuVar) {
        eem eemVar;
        Iterator it = this.f25719b.keySet().iterator();
        do {
            if (!it.hasNext()) {
                eemVar = null;
                break;
            }
            eemVar = (eem) it.next();
        } while (!eemVar.f13675v.f25502c.mo9902h().equals(gyuVar));
        if (eemVar != null) {
            eemVar.m7218a();
            m9549j(eemVar);
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: e */
    public final synchronized void mo7112e(eem eemVar, key keyVar) {
        kpp kppVarMo7042c = keyVar.mo7042c();
        keyVar.close();
        if (kppVarMo7042c != null && this.f25719b.containsKey(eemVar)) {
            Long l = (Long) kppVarMo7042c.mo9517d(CaptureResult.SENSOR_TIMESTAMP);
            kppVarMo7042c.mo9515b();
            if (l != null) {
                ((HashMap) this.f25719b.get(eemVar)).put(l, kppVarMo7042c);
                eemVar.m7218a();
            }
        }
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: f */
    public final synchronized void mo7113f(eem eemVar, BurstSpec burstSpec, kpp kppVar) {
        this.f25719b.put(eemVar, new HashMap());
        eemVar.m7218a();
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: g */
    public final void mo7114g(gyu gyuVar) {
        een eenVarM2622p = this.f25723f.m2622p(gyuVar);
        eenVarM2622p.m7221a(this);
        eenVarM2622p.m7226f(this);
        int i = gyuVar.f26874a;
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: h */
    public final void mo7115h(eem eemVar) {
        eemVar.m7218a();
    }

    @Override // p000.ech
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo7116i(eem eemVar) {
    }

    /* JADX INFO: renamed from: j */
    protected final synchronized void m9549j(eem eemVar) {
        HashMap map = (HashMap) this.f25719b.remove(eemVar);
        if (map != null) {
            map.clear();
        }
    }

    @Override // p000.edi
    /* JADX INFO: renamed from: p */
    public final synchronized void mo7059p(eem eemVar) {
        ((nbe) ((nbe) f25718a.m17252c()).mo17276G(3022)).mo17291p("3A_DEBUG onShotAborted for shotId=%d, shot AF metadata will be cleared.", eemVar.m7218a());
        m9549j(eemVar);
    }
}
