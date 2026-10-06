package p000;

import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.PostviewParams;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkb implements gnn {

    /* JADX INFO: renamed from: a */
    private static final nbh f25228a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckSecondaryHdrPlusProcessor");

    /* JADX INFO: renamed from: b */
    private final ecq f25229b;

    /* JADX INFO: renamed from: c */
    private final kmd f25230c;

    /* JADX INFO: renamed from: d */
    private final kbz f25231d;

    /* JADX INFO: renamed from: e */
    private final gjj f25232e;

    /* JADX INFO: renamed from: f */
    private final gdz f25233f;

    /* JADX INFO: renamed from: g */
    private final gva f25234g;

    public gkb(ecq ecqVar, kmd kmdVar, gdz gdzVar, kbz kbzVar, gjj gjjVar, gva gvaVar, byte[] bArr) {
        this.f25229b = ecqVar;
        this.f25230c = kmdVar;
        this.f25233f = gdzVar;
        this.f25231d = kbzVar;
        this.f25232e = gjjVar;
        this.f25234g = gvaVar;
    }

    /* JADX INFO: renamed from: c */
    private static void m9353c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((key) it.next()).close();
        }
    }

    @Override // p000.gnn
    /* JADX INFO: renamed from: a */
    public final void mo9354a(kmg kmgVar, List list, gbh gbhVar, glk glkVar, int i, kpp kppVar, ebn ebnVar, mrm mrmVar) throws doi {
        lku.m15669w(true);
        m9355b(list, glkVar, i, kppVar, ebnVar, null, mqu.f41450a, mrmVar, 1);
    }

    /* JADX WARN: Type inference failed for: r3v22, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final void m9355b(List list, glk glkVar, int i, kpp kppVar, ebn ebnVar, BurstSpec burstSpec, mrm mrmVar, mrm mrmVar2, int i2) throws doi {
        kmg kmgVarMo14193c;
        int i3;
        eem eemVar;
        list.size();
        if (list.isEmpty()) {
            ((nbe) ((nbe) f25228a.m17252c()).mo17276G((char) 2777)).mo17290o("Zero frames to process.");
            throw new doi("Zero frames to process.");
        }
        gmc gmcVarM9784a = this.f25234g.m9784a((key) list.get(0));
        if (gmcVarM9784a.m9493b() != null) {
            kgg kggVarM9493b = gmcVarM9784a.m9493b();
            kggVarM9493b.getClass();
            kmgVarMo14193c = kggVarM9493b.mo14193c();
        } else {
            kmgVarMo14193c = gmcVarM9784a.m9492a().mo14193c();
        }
        try {
            PostviewParams postviewParamsM7070b = ebq.m7070b(this.f25230c, this.f25233f);
            this.f25231d.mo13961e("pckHdrZsl#startShot");
            try {
                try {
                    i3 = 0;
                    try {
                        eem eemVarMo7132G = this.f25229b.mo7132G(kmgVarMo14193c, glkVar, postviewParamsM7070b, ebnVar.f13252g, kppVar, i, true, i2, mrmVar, egm.f13973a);
                        this.f25231d.mo13962f();
                        eemVar = eemVarMo7132G;
                    } catch (kec e) {
                        e = e;
                        ((nbe) ((nbe) ((nbe) f25228a.m17251b()).mo17283h(e)).mo17276G(2772)).mo17290o("Unable to start PSL shot ");
                        this.f25231d.mo13962f();
                        eemVar = null;
                    }
                } catch (kec e2) {
                    e = e2;
                    i3 = 0;
                }
                if (eemVar == null) {
                    ((nbe) ((nbe) f25228a.m17252c()).mo17276G(2776)).mo17290o("Failed to initiate HDR+ shot capture.");
                    throw new doi("Invalid shot received from HdrPlusSession.");
                }
                if (burstSpec == null) {
                    ((nbe) ((nbe) f25228a.m17252c()).mo17276G(2775)).mo17290o("Missing burst spec.");
                    throw new doi("Burst spec not provided.");
                }
                gji gjiVarM9335c = this.f25232e.m9335c(null, glkVar, null);
                FrameRequestVector frameRequestVectorM4911b = burstSpec.m4911b();
                int iM4967a = (int) frameRequestVectorM4911b.m4967a();
                this.f25229b.mo7151r(eemVar, burstSpec);
                kpp kppVar2 = kppVar;
                int i4 = 0;
                while (i4 < list.size()) {
                    int i5 = i4;
                    int i6 = iM4967a;
                    FrameRequestVector frameRequestVector = frameRequestVectorM4911b;
                    kpp kppVarM9330a = gjiVarM9335c.m9330a(eemVar, i3, iM4967a, (key) list.get(i4), ((long) i4) < frameRequestVectorM4911b.m4967a() ? frameRequestVectorM4911b.m4968b(i4).m4965a() : nre.f44163c, false, mrmVar2, kppVar2, new gas());
                    if (kppVarM9330a != null) {
                        i3++;
                        kppVar2 = kppVarM9330a;
                    }
                    i4 = i5 + 1;
                    iM4967a = i6;
                    frameRequestVectorM4911b = frameRequestVector;
                }
                if (gjiVarM9335c.m9332c(eemVar, i3, iM4967a, kppVar2, glkVar.f25502c.mo9905k(), false)) {
                    m9353c(list);
                    return;
                }
                String str = "Error finishing the HDR+ payload, aborting shot " + eemVar.m7218a();
                ((nbe) ((nbe) f25228a.m17251b()).mo17276G(2774)).mo17293r("%s", str);
                this.f25229b.mo7147n(eemVar);
                throw new dop(str);
            } catch (Throwable th) {
                this.f25231d.mo13962f();
                throw th;
            }
        } catch (Throwable th2) {
            m9353c(list);
            throw th2;
        }
    }
}
