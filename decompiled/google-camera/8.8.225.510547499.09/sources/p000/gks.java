package p000;

import com.google.googlex.gcam.PostviewParams;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gks implements gnn {

    /* JADX INFO: renamed from: c */
    private static final nbh f25345c = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckZslHdrPlusProcessor");

    /* JADX INFO: renamed from: a */
    public final ecq f25346a;

    /* JADX INFO: renamed from: b */
    public final eci f25347b;

    /* JADX INFO: renamed from: d */
    private final kmd f25348d;

    /* JADX INFO: renamed from: e */
    private final gdz f25349e;

    /* JADX INFO: renamed from: f */
    private final kbz f25350f;

    /* JADX INFO: renamed from: g */
    private final ecj f25351g;

    /* JADX INFO: renamed from: h */
    private final eby f25352h;

    /* JADX INFO: renamed from: i */
    private final ego f25353i;

    /* JADX INFO: renamed from: j */
    private final goj f25354j;

    /* JADX INFO: renamed from: k */
    private final inm f25355k;

    /* JADX INFO: renamed from: l */
    private final dhv f25356l;

    /* JADX INFO: renamed from: m */
    private final jwn f25357m;

    /* JADX INFO: renamed from: n */
    private final Integer f25358n;

    /* JADX INFO: renamed from: o */
    private final ewq f25359o;

    /* JADX INFO: renamed from: p */
    private final gva f25360p;

    /* JADX INFO: renamed from: q */
    private final gkz f25361q;

    /* JADX INFO: renamed from: r */
    private final bko f25362r;

    public gks(ecq ecqVar, kmd kmdVar, gdz gdzVar, ewq ewqVar, gkz gkzVar, eci eciVar, bko bkoVar, kbz kbzVar, gva gvaVar, ecj ecjVar, eby ebyVar, ego egoVar, goj gojVar, inm inmVar, dhv dhvVar, jwn jwnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f25346a = ecqVar;
        this.f25348d = kmdVar;
        this.f25349e = gdzVar;
        this.f25359o = ewqVar;
        this.f25361q = gkzVar;
        this.f25362r = bkoVar;
        this.f25347b = eciVar;
        this.f25350f = kbzVar;
        this.f25360p = gvaVar;
        this.f25351g = ecjVar;
        this.f25352h = ebyVar;
        this.f25353i = egoVar;
        this.f25354j = gojVar;
        this.f25355k = inmVar;
        this.f25356l = dhvVar;
        this.f25357m = jwnVar;
        this.f25358n = (Integer) dhvVar.mo6173a(did.f11468v).orElse(-1);
    }

    /* JADX INFO: renamed from: k */
    private static final void m9375k(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((key) it.next()).close();
        }
    }

    @Override // p000.gnn
    /* JADX INFO: renamed from: a */
    public final void mo9354a(kmg kmgVar, List list, gbh gbhVar, glk glkVar, int i, kpp kppVar, ebn ebnVar, mrm mrmVar) {
        m9384j(list, gbhVar, glkVar, i, false, kppVar, ebnVar, null, kmgVar, mrmVar);
    }

    /* JADX INFO: renamed from: b */
    public final int m9376b(key keyVar, eem eemVar, boolean z, int i, int i2, nre nreVar, mrm mrmVar) throws kec {
        kmg kmgVarMo14193c;
        kpw kpwVarM9496e;
        kpw kpwVarM9495d;
        int i3;
        this.f25350f.mo13961e("processFrame");
        try {
            try {
                this.f25350f.mo13961e("awaitComplete");
                kfv.m14171t(keyVar);
                this.f25350f.mo13962f();
                kfd kfdVarMo7041b = keyVar.mo7041b();
                kfdVarMo7041b.getClass();
                if (z) {
                    this.f25350f.mo13961e("hdrPlusPayloadProcessorManager.addPayloadFrame");
                    this.f25347b.mo7112e(eemVar, keyVar);
                    this.f25350f.mo13962f();
                }
                kpp kppVarMo7042c = keyVar.mo7042c();
                if (kppVarMo7042c == null) {
                    ((nbe) ((nbe) f25345c.m17251b()).mo17276G(2870)).mo17271B("Failure for frame %d @%d of %d, skipping.", Integer.valueOf(i + 1), Long.valueOf(kfdVarMo7041b.f35812c), Integer.valueOf(i2));
                    this.f25350f.mo13962f();
                    return i;
                }
                this.f25350f.mo13961e("pckHdrZsl#addPayloadFrame");
                gmc gmcVarM9784a = this.f25360p.m9784a(keyVar);
                if (z) {
                    kpwVarM9496e = gmcVarM9784a.m9496e();
                    kpwVarM9495d = gmcVarM9784a.m9495d();
                    kmgVarMo14193c = gmcVarM9784a.m9492a().mo14193c();
                } else {
                    kpw kpwVarM9497f = gmcVarM9784a.m9497f();
                    kgg kggVarM9493b = gmcVarM9784a.m9493b();
                    if (kggVarM9493b == null) {
                        ((nbe) ((nbe) f25345c.m17251b()).mo17276G((char) 2869)).mo17290o("Can't find the source camera for the secondary image.");
                        throw new kec("Can't find the source camera for the secondary image.");
                    }
                    kmgVarMo14193c = kggVarM9493b.mo14193c();
                    kpwVarM9496e = kpwVarM9497f;
                    kpwVarM9495d = null;
                }
                kpp kppVarM9557b = (!gmcVarM9784a.m9499h() || z) ? kppVarMo7042c : gnk.m9557b(kppVarMo7042c, kmgVarMo14193c.f36540a);
                keyVar.close();
                this.f25346a.mo7148o(eemVar, kmgVarMo14193c, i, kppVarM9557b, nreVar, kpwVarM9496e, kpwVarM9495d, mrmVar);
                if (kpwVarM9496e != null) {
                    eemVar.m7218a();
                    i3 = i + 1;
                } else {
                    ((nbe) ((nbe) f25345c.m17252c()).mo17276G(2867)).mo17273D("Ignoring missing raw frame %d of %d @%d (%d) for shot %d .", Integer.valueOf(i + 1), Integer.valueOf(i2), Long.valueOf(kfdVarMo7041b.f35812c), Long.valueOf(kfdVarMo7041b.f35811b), Integer.valueOf(eemVar.m7218a()));
                    if (kpwVarM9495d != null) {
                        kpwVarM9495d.close();
                    }
                    i3 = i;
                }
                this.f25350f.mo13962f();
                this.f25350f.mo13962f();
                return i3;
            } catch (InterruptedException e) {
                kfd kfdVarMo7041b2 = keyVar.mo7041b();
                ((nbe) ((nbe) ((nbe) f25345c.m17251b()).mo17283h(e)).mo17276G(2871)).mo17271B("Completion failure for frame %d @%d of %d, skipping.", Integer.valueOf(i + 1), Long.valueOf(kfdVarMo7041b2 != null ? kfdVarMo7041b2.f35812c : -1L), Integer.valueOf(i2));
                this.f25350f.mo13962f();
                this.f25350f.mo13962f();
                return i;
            }
        } catch (Throwable th) {
            this.f25350f.mo13962f();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    protected final int m9377c(List list, eem eemVar, boolean z, int i, mrm mrmVar) throws kec {
        this.f25350f.mo13961e("findFramesToOmitDueToTemporalBinning");
        Set setM9579a = this.f25354j.m9579a(list);
        this.f25350f.mo13963g("pckZslHdrPlusProcessor#processPayload");
        Iterator it = list.iterator();
        int iM9376b = 0;
        while (it.hasNext()) {
            key keyVar = (key) it.next();
            kfd kfdVarMo7041b = keyVar.mo7041b();
            if (kfdVarMo7041b == null) {
                ((nbe) ((nbe) f25345c.m17252c()).mo17276G(2873)).mo17291p("Skipping invalid frame at %d", iM9376b);
                keyVar.close();
            } else if (setM9579a.contains(kfdVarMo7041b)) {
                keyVar.close();
            } else {
                iM9376b = m9376b(keyVar, eemVar, z, iM9376b, i, nre.f44163c, mrmVar);
            }
        }
        this.f25350f.mo13962f();
        if (iM9376b > this.f25358n.intValue()) {
            return iM9376b;
        }
        throw new IllegalStateException("Payload size too low: " + iM9376b);
    }

    /* JADX INFO: renamed from: d */
    public final void m9378d(eem eemVar, kpp kppVar, boolean z) {
        this.f25346a.mo7150q(eemVar);
        if (z) {
            this.f25347b.mo7113f(eemVar, null, kppVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m9379e(key keyVar, eem eemVar, int i, int i2, nre nreVar) {
        return m9376b(keyVar, eemVar, true, i, i2, nreVar, mqu.f41450a);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    public final void m9380f(int i, glk glkVar, kpp kppVar, eem eemVar, boolean z) throws dop {
        this.f25350f.mo13961e("pckHdrZsl#endPayload");
        if (this.f25346a.mo7157x(eemVar)) {
            if (z) {
                this.f25347b.mo7115h(eemVar);
                glkVar.f25502c.mo9872D();
                hjy hjyVarMo9905k = glkVar.f25502c.mo9905k();
                hjyVarMo9905k.mo10401c(kppVar, true);
                int iIntValue = glkVar.f25502c.mo9903i() == gyw.NORMAL ? 1 : this.f25351g.mo6051a().intValue();
                nxl nxlVarM18137O = nmo.f43862d.m18137O();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                nmo nmoVar = (nmo) nxqVar;
                nmoVar.f43864a = 1 | nmoVar.f43864a;
                nmoVar.f43865b = iIntValue;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nmo nmoVar2 = (nmo) nxlVarM18137O.f44974b;
                nmoVar2.f43864a |= 2;
                nmoVar2.f43866c = i;
                ((hjz) hjyVarMo9905k).f28093s = (nmo) nxlVarM18137O.mo18103l();
            }
            if (this.f25346a.mo7158y(eemVar)) {
                this.f25350f.mo13962f();
                return;
            }
        }
        String str = "Error ending the HDR+ payload, aborting shot " + eemVar.m7218a();
        ((nbe) ((nbe) f25345c.m17251b()).mo17276G((char) 2878)).mo17293r("%s", str);
        if (z) {
            this.f25347b.mo7111d(eemVar.f13675v.f25502c.mo9902h());
        }
        this.f25346a.mo7147n(eemVar);
        throw new dop(str);
    }

    /* JADX INFO: renamed from: g */
    public final eem m9381g(kmg kmgVar, glk glkVar, int i, kpp kppVar, ebn ebnVar, boolean z, boolean z2) {
        egl eglVar;
        try {
            try {
                int iMo7135b = this.f25346a.mo7135b(this.f25346a.mo7145l(kppVar, kmgVar));
                this.f25350f.mo13961e("createPostviewParams");
                PostviewParams postviewParamsM7070b = ebq.m7070b(this.f25348d, this.f25349e);
                this.f25350f.mo13963g("detectFusionRequest");
                egm egmVarMo7294a = this.f25353i.mo7294a(kppVar, z);
                boolean z3 = egmVarMo7294a.f13975c == egn.NOT_REQUESTED || (eglVar = egmVarMo7294a.f13974b) == egl.DEBLUR || eglVar == egl.ZOOM;
                this.f25350f.mo13962f();
                if (z) {
                    this.f25350f.mo13961e("createPortraitShotParams");
                    gtd gtdVarM2606B = this.f25362r.m2606B(kppVar, iMo7135b);
                    this.f25350f.mo13963g("getJpegRotation");
                    int iM3564b = cem.m3564b(((fua) glkVar.f25503d).f23573a, this.f25355k, this.f25348d, this.f25357m, this.f25356l);
                    this.f25350f.mo13963g("populateShotConfig");
                    this.f25359o.m7955d(glkVar, gtdVarM2606B, ebnVar, iM3564b, true, egmVarMo7294a.f13974b);
                    this.f25350f.mo13962f();
                } else if (!z3) {
                    throw new doh("Not processing secondary payload, mode: " + String.valueOf(egmVarMo7294a));
                }
                int i2 = true != z2 ? -1 : 0;
                this.f25352h.m7104o(glkVar);
                this.f25350f.mo13961e("pckHdrZsl#startZslShot");
                eem eemVarMo7133H = this.f25346a.mo7133H(kmgVar, glkVar, postviewParamsM7070b, ebnVar.f13252g, kppVar, i2, i, !z, egmVarMo7294a);
                this.f25350f.mo13962f();
                return eemVarMo7133H;
            } catch (Throwable th) {
                this.f25350f.mo13962f();
                throw th;
            }
        } catch (IllegalArgumentException | IllegalStateException | InterruptedException | ExecutionException | kec e) {
            ((nbe) ((nbe) ((nbe) f25345c.m17251b()).mo17283h(e)).mo17276G(2876)).mo17290o("Unable to start ZSL shot.");
            this.f25350f.mo13962f();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, key] */
    /* JADX INFO: renamed from: h */
    public final void m9382h(List list, gbh gbhVar, glk glkVar, int i) throws dom, dod {
        kmg kmgVarMo14193c;
        kpp kppVar;
        if (list.isEmpty()) {
            throw new dod("No frames to process found.");
        }
        ebn ebnVarM9396a = this.f25361q.m9396a();
        int i2 = 0;
        kpp kppVar2 = null;
        while (true) {
            if (i2 >= ((mzr) list).f41859c) {
                kmgVarMo14193c = null;
                kppVar = kppVar2;
                break;
            }
            gmc gmcVarM9784a = this.f25360p.m9784a((key) list.get(i2));
            kpp kppVarMo7042c = gmcVarM9784a.f25581a.mo7042c();
            if (kppVarMo7042c != null) {
                kmgVarMo14193c = gmcVarM9784a.m9492a().mo14193c();
                kppVar = kppVarMo7042c;
                break;
            } else {
                i2++;
                kppVar2 = kppVarMo7042c;
            }
        }
        if (kppVar == null) {
            m9375k(list);
            throw new dom("No metadata found for the metering frame.");
        }
        kmgVarMo14193c.getClass();
        m9384j(list, gbhVar, glkVar, i, true, kppVar, ebnVarM9396a, null, kmgVarMo14193c, mqu.f41450a);
    }

    /* JADX INFO: renamed from: i */
    public final void m9383i(List list, gbh gbhVar, glk glkVar) throws dom, dod {
        m9382h(list, gbhVar, glkVar, -1);
    }

    /* JADX INFO: renamed from: j */
    public final void m9384j(List list, gbh gbhVar, glk glkVar, int i, boolean z, kpp kppVar, ebn ebnVar, eem eemVar, kmg kmgVar, mrm mrmVar) {
        eem eemVarM9381g;
        gbhVar.close();
        int size = list.size();
        if (size <= this.f25358n.intValue()) {
            throw new IllegalStateException("Payload size too low: " + size);
        }
        try {
            try {
                this.f25350f.mo13961e("pckHdrZsl#processFrames");
                eemVarM9381g = eemVar == null ? m9381g(kmgVar, glkVar, i, kppVar, ebnVar, z, false) : eemVar;
                try {
                    if (eemVarM9381g == null) {
                        ((nbe) ((nbe) f25345c.m17252c()).mo17276G(2883)).mo17290o("Failed to initiate HDR plus shot capture.");
                        this.f25350f.mo13962f();
                        throw new doi("Invalid shot received from HdrPlusSession.");
                    }
                    this.f25350f.mo13963g("pckHdrZsl#processPayload");
                    m9378d(eemVarM9381g, kppVar, z);
                    m9377c(list, eemVarM9381g, z, list.size(), mrmVar);
                    this.f25350f.mo13962f();
                    m9380f(list.size(), glkVar, kppVar, eemVarM9381g, z);
                    m9375k(list);
                    this.f25350f.mo13962f();
                } catch (kec e) {
                    e = e;
                    ((nbe) ((nbe) ((nbe) f25345c.m17251b()).mo17283h(e)).mo17276G(2882)).mo17290o("Error processing HDR+ payload.");
                    if (eemVarM9381g != null) {
                        this.f25346a.mo7147n(eemVarM9381g);
                    }
                    throw new dop(e, null);
                }
            } catch (kec e2) {
                e = e2;
                eemVarM9381g = eemVar;
            }
        } catch (Throwable th) {
            m9375k(list);
            this.f25350f.mo13962f();
            throw th;
        }
    }
}
