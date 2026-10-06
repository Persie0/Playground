package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpw implements kba, crg, cre, cuo, cbu {

    /* JADX INFO: renamed from: a */
    public static final nbh f8674a = nbh.m17259h("com/google/android/apps/camera/camcorder/Video2ActiveCamcorderCaptureSession");

    /* JADX INFO: renamed from: A */
    public cva f8675A;

    /* JADX INFO: renamed from: B */
    public final cwd f8676B;

    /* JADX INFO: renamed from: C */
    public final djm f8677C;

    /* JADX INFO: renamed from: D */
    public final ljf f8678D;

    /* JADX INFO: renamed from: E */
    private final ggm f8679E;

    /* JADX INFO: renamed from: F */
    private final iey f8680F;

    /* JADX INFO: renamed from: G */
    private final cso f8681G;

    /* JADX INFO: renamed from: H */
    private final cqe f8682H;

    /* JADX INFO: renamed from: I */
    private long f8683I;

    /* JADX INFO: renamed from: J */
    private final jfs f8684J;

    /* JADX INFO: renamed from: K */
    private final cwd f8685K;

    /* JADX INFO: renamed from: b */
    public final kmq f8686b;

    /* JADX INFO: renamed from: c */
    public final jvd f8687c;

    /* JADX INFO: renamed from: d */
    public final cqm f8688d;

    /* JADX INFO: renamed from: g */
    public final csl f8691g;

    /* JADX INFO: renamed from: h */
    public final cbz f8692h;

    /* JADX INFO: renamed from: i */
    public final hmp f8693i;

    /* JADX INFO: renamed from: j */
    public final cwj f8694j;

    /* JADX INFO: renamed from: k */
    public final cvr f8695k;

    /* JADX INFO: renamed from: l */
    public final dhv f8696l;

    /* JADX INFO: renamed from: m */
    public final cur f8697m;

    /* JADX INFO: renamed from: n */
    public final ScheduledExecutorService f8698n;

    /* JADX INFO: renamed from: o */
    public final hlg f8699o;

    /* JADX INFO: renamed from: p */
    public final oju f8700p;

    /* JADX INFO: renamed from: q */
    public final ohb f8701q;

    /* JADX INFO: renamed from: r */
    public final crj f8702r;

    /* JADX INFO: renamed from: s */
    public final csn f8703s;

    /* JADX INFO: renamed from: t */
    public final int f8704t;

    /* JADX INFO: renamed from: u */
    public final csx f8705u;

    /* JADX INFO: renamed from: w */
    public ScheduledFuture f8707w;

    /* JADX INFO: renamed from: x */
    public cqg f8708x;

    /* JADX INFO: renamed from: y */
    public cpv f8709y;

    /* JADX INFO: renamed from: z */
    public final fup f8710z;

    /* JADX INFO: renamed from: e */
    public final Object f8689e = new Object();

    /* JADX INFO: renamed from: f */
    public final List f8690f = new ArrayList();

    /* JADX INFO: renamed from: v */
    public boolean f8706v = false;

    public cpw(jvd jvdVar, ggm ggmVar, iey ieyVar, ljf ljfVar, cqm cqmVar, cso csoVar, cwd cwdVar, cqe cqeVar, cwd cwdVar2, csm csmVar, dbr dbrVar, cbz cbzVar, fup fupVar, djm djmVar, hmp hmpVar, cwj cwjVar, cvr cvrVar, dhv dhvVar, cur curVar, ScheduledExecutorService scheduledExecutorService, hlg hlgVar, oju ojuVar, ohb ohbVar, jfs jfsVar, crj crjVar, csx csxVar, csn csnVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f8692h = cbzVar;
        this.f8710z = fupVar;
        this.f8677C = djmVar;
        this.f8686b = dbrVar.mo5895d();
        this.f8687c = jvdVar;
        this.f8679E = ggmVar;
        this.f8680F = ieyVar;
        this.f8678D = ljfVar;
        this.f8688d = cqmVar;
        this.f8681G = csoVar;
        this.f8685K = cwdVar;
        this.f8682H = cqeVar;
        this.f8691g = csmVar.m5464a();
        this.f8676B = cwdVar2;
        this.f8694j = cwjVar;
        this.f8693i = hmpVar;
        this.f8695k = cvrVar;
        this.f8696l = dhvVar;
        this.f8697m = curVar;
        this.f8698n = scheduledExecutorService;
        this.f8699o = hlgVar;
        this.f8700p = ojuVar;
        this.f8701q = ohbVar;
        this.f8684J = jfsVar;
        this.f8702r = crjVar;
        this.f8705u = csxVar;
        this.f8703s = csnVar;
        this.f8704t = csnVar.f9361z;
    }

    @Override // p000.jzg
    /* JADX INFO: renamed from: a */
    public final void mo5259a(jzf jzfVar) {
        if (!jzfVar.f35278l) {
            this.f8688d.mo5259a(jzfVar);
        } else {
            dhx dhxVar = dhh.f11074a;
            m5272n(new cgl(this, jzfVar, 11), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [hht, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final void m5260b() {
        this.f8676B.m5658e(cum.RECORDING_SESSION);
        this.f8679E.mo9214b(cpw.class);
        this.f8681G.m5468d();
        this.f8680F.mo11165i();
        this.f8680F.mo11163f();
        this.f8685K.f9866a.mo10316b(C0100R.raw.video_stop);
        this.f8684J.m13070A();
        this.f8702r.mo5418g();
        this.f8705u.mo5487f();
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: bR */
    public final void mo5261bR() {
    }

    @Override // p000.cbu
    /* JADX INFO: renamed from: bh */
    public final cdj mo3409bh(bko bkoVar) {
        return this.f8694j.mo5685f(bkoVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f8689e) {
            if (this.f8709y == cpv.CLOSED) {
                ((nbe) ((nbe) f8674a.m17251b()).mo17276G(446)).mo17290o("Capture session has been closed.");
                return;
            }
            this.f8681G.close();
            if (this.f8709y == cpv.STARTING_RECORDING) {
                this.f8687c.execute(new cmd(this, 14));
            }
            if (this.f8709y == cpv.RECORDING) {
                try {
                    m5271m(true, 7).get();
                } catch (InterruptedException | ExecutionException e) {
                    ((nbe) ((nbe) f8674a.m17251b()).mo17276G(445)).mo17293r("failed to close current recording: %s", e);
                }
            }
            cpv cpvVar = this.f8709y;
            if (cpvVar == cpv.STARTING_RECORDING || cpvVar == cpv.STOPPING_RECORDING) {
                this.f8687c.execute(new cmd(this, 15));
            }
            this.f8690f.clear();
            this.f8693i.m10463a();
            this.f8697m.m5539d();
            m5269k(cpv.CLOSED);
            this.f8676B.m5658e(cum.RECORDING_SESSION);
            this.f8676B.m5658e(cum.CAPTURE_SESSION);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5262d() {
        m5271m(false, 2);
        this.f8688d.m5370k(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m5263e() {
        this.f8694j.mo5683d();
        this.f8683I = System.currentTimeMillis();
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: f */
    public final void mo5264f() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: g */
    public final void mo5265g() {
    }

    @Override // p000.cre
    /* JADX INFO: renamed from: h */
    public final void mo5266h() {
    }

    /* JADX WARN: Code duplicated, block: B:94:0x0273 A[Catch: all -> 0x02bf, TryCatch #6 {, blocks: (B:58:0x01d2, B:59:0x01d8, B:79:0x0214, B:82:0x021d, B:94:0x0273, B:96:0x0287, B:97:0x0297, B:85:0x0234, B:87:0x0248, B:92:0x0261, B:95:0x027f, B:106:0x02be, B:60:0x01d9, B:62:0x01dd, B:64:0x01df, B:66:0x01e3, B:67:0x01ea, B:69:0x01ec, B:70:0x01f0, B:75:0x01f5, B:76:0x0210), top: B:126:0x01d2, outer: #2, inners: #4 }] */
    /* JADX WARN: Type inference failed for: r1v22, types: [hht, java.lang.Object] */
    @Override // p000.cre
    /* JADX INFO: renamed from: i */
    public final void mo5267i(boolean z) {
        cuu cuuVarM5358a;
        nps npsVarM14964J;
        jvd.m13538a();
        synchronized (this.f8689e) {
            if (this.f8709y == cpv.RECORDING) {
                m5271m(z, 1);
            } else if (this.f8709y == cpv.NO_RECORDING) {
                synchronized (this.f8689e) {
                    if (m5270l()) {
                        ((nbe) ((nbe) f8674a.m17252c()).mo17276G(460)).mo17290o(EArqVBjecl.FQfyWs);
                    } else {
                        hmq hmqVar = this.f8693i.f28347b;
                        if (hmqVar == hmq.f28351a) {
                            ((nbe) ((nbe) f8674a.m17252c()).mo17276G((char) 462)).mo17290o("Can't get current device storage.");
                        } else if (!hmqVar.m10467c()) {
                            ((nbe) ((nbe) f8674a.m17252c()).mo17276G(459)).mo17290o("Not starting recording since the device storage is low.");
                            m5268j(false);
                        }
                        if (this.f8706v) {
                            this.f8706v = false;
                        } else {
                            m5269k(cpv.STARTING_RECORDING);
                            this.f8699o.mo4304a();
                            this.f8699o.m10437h(hlf.RECORD_STARTING);
                            this.f8680F.mo11164g();
                            this.f8679E.mo9213a(cpw.class);
                            this.f8681G.m5467c();
                            this.f8685K.f9866a.mo10316b(C0100R.raw.video_start);
                            cqm cqmVar = this.f8688d;
                            hxw hxwVar = cqmVar.f8949d;
                            boolean z2 = cqmVar.f8971z.f9338c.m13655a() > 1;
                            boolean z3 = !cqmVar.f8971z.f9343h.mo16813g();
                            hxu hxuVarM10847a = hxv.m10847a();
                            hxuVarM10847a.m10845e(z2);
                            hxuVarM10847a.m10843c(cqmVar.f8959n);
                            hxuVarM10847a.m10842b(cqmVar.f8960o);
                            hxuVarM10847a.m10844d(z3);
                            hxuVarM10847a.m10846f(cqmVar.f8958m.mo5419h());
                            hxwVar.mo10851d(hxuVarM10847a.m10841a());
                            cqmVar.f8949d.mo10853f();
                            cqmVar.f8964s.m10699d(true);
                            cqmVar.f8970y.mo5723c();
                            cqmVar.f8946a.mo10738f(true);
                            cqmVar.f8955j.mo5794f(false);
                            cqmVar.f8955j.mo5792d(true);
                            hzo hzoVar = ((hzp) cqmVar.f8967v.mo6051a()).f30074a;
                            if (cxk.DEFAULT.equals(cqmVar.f8956k.m5716a()) && cqm.m5361n(cqmVar.f8969x) && bzq.m3253Z(hzoVar.f30073i, hzoVar.f30071g)) {
                                cqmVar.f8950e.mo11747ab();
                            }
                            this.f8680F.mo11162e();
                            this.f8684J.m13116z();
                            this.f8702r.mo5417f();
                            this.f8705u.mo5486d();
                            ScheduledFuture scheduledFuture = this.f8707w;
                            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                                this.f8707w.cancel(true);
                                m5263e();
                            }
                            long j = 500;
                            if (System.currentTimeMillis() - this.f8683I >= 500) {
                                j = 300;
                            }
                            final cqg cqgVarMo5345a = this.f8682H.mo5345a(this, this.f8703s);
                            this.f8708x = cqgVarMo5345a;
                            synchronized (cqgVarMo5345a.f8854f) {
                                if (cqgVarMo5345a.f8830E != cqf.READY) {
                                    npsVarM14964J = kxk.m14964J(new IllegalStateException("Trying to start recording with state=" + String.valueOf(cqgVarMo5345a.f8830E)));
                                } else {
                                    cqgVarMo5345a.f8833H = cqgVarMo5345a.f8874z.mo13957a("Recording Started: " + bzq.m3252Y(cqgVarMo5345a.f8860l, cqgVarMo5345a.m5347c(), ((Float) cqgVarMo5345a.f8861m.f9272b.mo3831be()).floatValue()));
                                    synchronized (cqgVarMo5345a.f8854f) {
                                        cqj cqjVar = cqgVarMo5345a.f8857i;
                                        csn csnVar = cqgVarMo5345a.f8860l;
                                        synchronized (cqjVar.f8909d) {
                                            cuuVarM5358a = cqjVar.f8908c;
                                            if (cuuVarM5358a == null) {
                                                try {
                                                    nps npsVar = cqjVar.f8907b;
                                                    cuuVarM5358a = npsVar != null ? (cuu) npsVar.get() : cqjVar.m5358a(csnVar);
                                                } catch (InterruptedException e) {
                                                    e = e;
                                                    ((nbe) ((nbe) ((nbe) cqj.f8906a.m17251b()).mo17283h(e)).mo17276G(483)).mo17290o("Error creating video recorder: ");
                                                    cuuVarM5358a = null;
                                                } catch (ExecutionException e2) {
                                                    e = e2;
                                                    ((nbe) ((nbe) ((nbe) cqj.f8906a.m17251b()).mo17283h(e)).mo17276G(483)).mo17290o("Error creating video recorder: ");
                                                    cuuVarM5358a = null;
                                                }
                                            }
                                        }
                                        if (cuuVarM5358a == null || cuuVarM5358a.f9691c.get()) {
                                            cuuVarM5358a = cqgVarMo5345a.f8857i.m5358a(cqgVarMo5345a.f8860l);
                                        } else if (cuuVarM5358a.f9689a.mo13742a() == ((Integer) ((jwf) cqgVarMo5345a.f8861m.f9284n).f34942d).intValue() && ((gzn) cqgVarMo5345a.f8861m.f9291u.f26912a.mo3831be()).equals(cuuVarM5358a.f9692d)) {
                                            if (((Boolean) cqgVarMo5345a.f8871w.mo10031c(gzy.f27036at)).booleanValue() != (cuuVarM5358a.f9693e == gyx.MARS_STORE) || !((gzo) cqgVarMo5345a.f8861m.f9286p.mo3831be()).equals(cuuVarM5358a.f9694f)) {
                                                cuuVarM5358a.close();
                                                cuuVarM5358a = cqgVarMo5345a.f8857i.m5358a(cqgVarMo5345a.f8860l);
                                            }
                                        } else {
                                            cuuVarM5358a.close();
                                            cuuVarM5358a = cqgVarMo5345a.f8857i.m5358a(cqgVarMo5345a.f8860l);
                                        }
                                        cuuVarM5358a.getClass();
                                        cqgVarMo5345a.f8831F = cuuVarM5358a;
                                        cqgVarMo5345a.f8835J.m5657d(cum.RECORDING_SESSION).m13537d(cuuVarM5358a);
                                    }
                                    cqgVarMo5345a.m5354j(cqf.STARTING_RECORDING);
                                    final nqf nqfVarM17621g = nqf.m17621g();
                                    cqgVarMo5345a.f8866r.schedule(new Runnable() { // from class: cqa
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            cqg cqgVar = cqgVarMo5345a;
                                            nqf nqfVar = nqfVarM17621g;
                                            synchronized (cqgVar.f8854f) {
                                                if (cqgVar.f8830E != cqf.STARTING_RECORDING) {
                                                    nqfVar.mo8566a(new IllegalStateException("Trying to delayedStart recording with state=" + String.valueOf(cqgVar.f8830E)));
                                                }
                                                cuu cuuVar = cqgVar.f8831F;
                                                cuuVar.getClass();
                                                jyx jyxVar = cuuVar.f9689a;
                                                cqgVar.f8868t.m10437h(hlh.VIDEO_RECORDER_STARTING);
                                                nps npsVarM14972R = kxk.m14972R(jyxVar.mo13751j(cqgVar), 3000L, TimeUnit.MILLISECONDS, cqgVar.f8866r);
                                                kxk.m14975U(npsVarM14972R, new cou(cqgVar, jyxVar, 3), not.INSTANCE);
                                                kxk.m14975U(npsVarM14972R, new cqd(cqgVar, jyxVar, nqfVar), cqgVar.f8851c);
                                            }
                                        }
                                    }, j, TimeUnit.MILLISECONDS);
                                    npsVarM14964J = nqfVarM17621g;
                                }
                            }
                            kxk.m14975U(npsVarM14964J, new cmo(this, 5), not.INSTANCE);
                        }
                    }
                }
            } else {
                ((nbe) ((nbe) f8674a.m17252c()).mo17276G(453)).mo17293r("Shutter button click ignored with state = %s", this.f8709y);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5268j(boolean z) {
        this.f8687c.execute(new bnp(this, z, 4));
    }

    /* JADX INFO: renamed from: k */
    public final void m5269k(cpv cpvVar) {
        synchronized (this.f8689e) {
            this.f8709y = cpvVar;
            cva cvaVar = this.f8675A;
            if (cvaVar != null) {
                cvaVar.f9753g = cpvVar.equals(cpv.RECORDING);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m5270l() {
        cur curVar = this.f8697m;
        return curVar.m5536a().m10520a(curVar.f9668c.f9682b);
    }

    /* JADX INFO: renamed from: m */
    public final nps m5271m(boolean z, int i) {
        synchronized (this.f8689e) {
            if (this.f8709y != cpv.RECORDING) {
                ((nbe) ((nbe) f8674a.m17252c()).mo17276G(443)).mo17293r("Trying to stop recording but state is: %s", this.f8709y);
                return kxk.m14965K(new fta(new ArrayList(), new ArrayList(), (Bitmap) null, i));
            }
            m5269k(cpv.STOPPING_RECORDING);
            this.f8699o.m10437h(hlf.RECORD_STOPPING);
            ArrayList arrayList = new ArrayList(this.f8690f);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((cre) it.next()).mo5261bR();
            }
            cqg cqgVar = this.f8708x;
            cqgVar.getClass();
            nps npsVarM5356l = cqgVar.m5356l(z, i);
            this.f8708x = null;
            kxk.m14975U(npsVarM5356l, new cou(this, arrayList, 2), this.f8687c);
            return npsVarM5356l;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5272n(Runnable runnable, int i) {
        kxk.m14975U(m5271m(false, i), new cmo(runnable, 4), this.f8687c);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v35, types: [crh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v57, types: [hnw, java.lang.Object] */
    @Override // p000.cre
    /* JADX INFO: renamed from: o */
    public final void mo5273o(fta ftaVar) {
        int i;
        Iterator it = ftaVar.f23538d.iterator();
        while (it.hasNext()) {
            ctj ctjVar = (ctj) it.next();
            ljf ljfVar = this.f8678D;
            kmq kmqVar = this.f8686b;
            int i2 = ftaVar.f23535a;
            int iM10442c = ((hlg) ljfVar.f38371c).m10442c(hlf.RECORD_STARTING, hlf.RECORD_STARTED);
            int iM10442c2 = ((hlg) ljfVar.f38371c).m10442c(hlf.RECORD_STOPPING, hlf.RECORD_STOPPED);
            nxl nxlVarM18137O = nmi.f43795D.m18137O();
            float seconds = TimeUnit.MILLISECONDS.toSeconds(ctjVar.f9453d);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmi nmiVar = (nmi) nxlVarM18137O.f44974b;
            nmiVar.f43800a |= 1;
            nmiVar.f43801b = seconds;
            int i3 = ctjVar.m5496b().m13661b().f35517a;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmi nmiVar2 = (nmi) nxlVarM18137O.f44974b;
            nmiVar2.f43800a |= 8;
            nmiVar2.f43804e = i3;
            int i4 = ctjVar.m5496b().m13661b().f35518b;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmi nmiVar3 = (nmi) nxlVarM18137O.f44974b;
            nmiVar3.f43800a |= 4;
            nmiVar3.f43803d = i4;
            long jM5495a = ctjVar.m5495a();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar = nxlVarM18137O.f44974b;
            nmi nmiVar4 = (nmi) nxqVar;
            nmiVar4.f43800a |= 2;
            nmiVar4.f43802c = jM5495a;
            jxn jxnVar = ctjVar.f9451b.f35099c;
            int i5 = jxnVar == jxn.FPS_AUTO ? -1 : jxnVar.f35058i;
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar2 = nxlVarM18137O.f44974b;
            nmi nmiVar5 = (nmi) nxqVar2;
            nmiVar5.f43800a |= 16;
            nmiVar5.f43805f = i5;
            int i6 = ctjVar.f9451b.f35101e;
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar3 = nxlVarM18137O.f44974b;
            nmi nmiVar6 = (nmi) nxqVar3;
            nmiVar6.f43800a |= 128;
            nmiVar6.f43808i = i6;
            int i7 = ctjVar.f9451b.f35102f;
            if (!nxqVar3.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmi nmiVar7 = (nmi) nxlVarM18137O.f44974b;
            nmiVar7.f43800a |= 256;
            nmiVar7.f43809j = i7;
            boolean zM6240o = ((djm) ljfVar.f38372d).m6240o();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar4 = nxlVarM18137O.f44974b;
            nmi nmiVar8 = (nmi) nxqVar4;
            nmiVar8.f43800a |= 32;
            nmiVar8.f43806g = zM6240o;
            int i8 = ctjVar.f9455f;
            if (!nxqVar4.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar5 = nxlVarM18137O.f44974b;
            nmi nmiVar9 = (nmi) nxqVar5;
            nmiVar9.f43800a |= 64;
            nmiVar9.f43807h = i8;
            int i9 = ctjVar.f9456g;
            if (!nxqVar5.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar6 = nxlVarM18137O.f44974b;
            nmi nmiVar10 = (nmi) nxqVar6;
            nmiVar10.f43800a |= 2048;
            nmiVar10.f43812m = i9;
            long j = ctjVar.f9460k;
            if (!nxqVar6.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmi nmiVar11 = (nmi) nxlVarM18137O.f44974b;
            nmiVar11.f43800a |= 512;
            nmiVar11.f43810k = j;
            Map map = ctjVar.f9461l;
            nxl nxlVarM18137O2 = nmh.f43783k.m18137O();
            for (jzf jzfVar : map.keySet()) {
                Integer num = (Integer) map.get(jzfVar);
                if (num != null) {
                    cxk cxkVar = cxk.OFF;
                    jzf jzfVar2 = jzf.VIDEO_BUFFER_DELAY;
                    ikw ikwVar = ikw.UNINITIALIZED;
                    switch (jzfVar) {
                        case VIDEO_BUFFER_DELAY:
                            int iIntValue = num.intValue();
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nmh nmhVar = (nmh) nxlVarM18137O2.f44974b;
                            nmhVar.f43785a |= 1;
                            nmhVar.f43786b = iIntValue;
                            break;
                        case AUDIO_BUFFER_DELAY:
                            int iIntValue2 = num.intValue();
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nmh nmhVar2 = (nmh) nxlVarM18137O2.f44974b;
                            nmhVar2.f43785a |= 2;
                            nmhVar2.f43787c = iIntValue2;
                            break;
                        case VIDEO_TRACK_FAIL_TO_START:
                            int iIntValue3 = num.intValue();
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nmh nmhVar3 = (nmh) nxlVarM18137O2.f44974b;
                            nmhVar3.f43785a |= 4;
                            nmhVar3.f43788d = iIntValue3;
                            break;
                        case AUDIO_TRACK_FAIL_TO_START:
                            int iIntValue4 = num.intValue();
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nmh nmhVar4 = (nmh) nxlVarM18137O2.f44974b;
                            nmhVar4.f43785a |= 8;
                            nmhVar4.f43789e = iIntValue4;
                            break;
                        case AUDIO_RECORD_ERROR:
                            int iIntValue5 = num.intValue();
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nmh nmhVar5 = (nmh) nxlVarM18137O2.f44974b;
                            nmhVar5.f43785a |= 16;
                            nmhVar5.f43790f = iIntValue5;
                            break;
                        case MUXER_STOP_ERROR:
                            int iIntValue6 = num.intValue();
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nmh nmhVar6 = (nmh) nxlVarM18137O2.f44974b;
                            nmhVar6.f43785a |= 32;
                            nmhVar6.f43791g = iIntValue6;
                            break;
                        case MEDIA_CODEC_ERROR_AUDIO:
                        case MEDIA_CODEC_ERROR_VIDEO:
                            int iIntValue7 = num.intValue();
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nmh nmhVar7 = (nmh) nxlVarM18137O2.f44974b;
                            nmhVar7.f43785a |= 64;
                            nmhVar7.f43792h = iIntValue7;
                            break;
                        case FILE_LOST:
                            int iIntValue8 = num.intValue();
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nmh nmhVar8 = (nmh) nxlVarM18137O2.f44974b;
                            nmhVar8.f43785a |= 128;
                            nmhVar8.f43793i = iIntValue8;
                            break;
                        case OTHER:
                            int iIntValue9 = num.intValue();
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            nmh nmhVar9 = (nmh) nxlVarM18137O2.f44974b;
                            nmhVar9.f43785a |= 256;
                            nmhVar9.f43794j = iIntValue9;
                            break;
                    }
                }
            }
            nmh nmhVar10 = (nmh) nxlVarM18137O2.mo18103l();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar7 = nxlVarM18137O.f44974b;
            nmi nmiVar12 = (nmi) nxqVar7;
            nmhVar10.getClass();
            nmiVar12.f43811l = nmhVar10;
            nmiVar12.f43800a |= 1024;
            int i10 = ctjVar.f9457h;
            if (!nxqVar7.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar8 = nxlVarM18137O.f44974b;
            nmi nmiVar13 = (nmi) nxqVar8;
            nmiVar13.f43800a |= 4096;
            nmiVar13.f43813n = i10;
            int i11 = ctjVar.f9458i;
            if (!nxqVar8.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar9 = nxlVarM18137O.f44974b;
            nmi nmiVar14 = (nmi) nxqVar9;
            nmiVar14.f43800a |= 8192;
            nmiVar14.f43814o = i11;
            int i12 = ctjVar.f9459j;
            if (!nxqVar9.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar10 = nxlVarM18137O.f44974b;
            nmi nmiVar15 = (nmi) nxqVar10;
            nmiVar15.f43800a |= 16384;
            nmiVar15.f43815p = i12;
            int iM5659f = ctjVar.f9475z.m5659f(1);
            if (!nxqVar10.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar11 = nxlVarM18137O.f44974b;
            nmi nmiVar16 = (nmi) nxqVar11;
            nmiVar16.f43800a |= 32768;
            nmiVar16.f43816q = iM5659f;
            int iM5659f2 = ctjVar.f9475z.m5659f(2);
            if (!nxqVar11.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar12 = nxlVarM18137O.f44974b;
            nmi nmiVar17 = (nmi) nxqVar12;
            nmiVar17.f43800a |= 65536;
            nmiVar17.f43817r = iM5659f2;
            if (!nxqVar12.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar13 = nxlVarM18137O.f44974b;
            nmi nmiVar18 = (nmi) nxqVar13;
            nmiVar18.f43800a |= 131072;
            nmiVar18.f43818s = iM10442c;
            if (!nxqVar13.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmi nmiVar19 = (nmi) nxlVarM18137O.f44974b;
            nmiVar19.f43800a |= 262144;
            nmiVar19.f43819t = iM10442c2;
            Iterator it2 = it;
            Iterable iterable = (Iterable) Collection$EL.stream(ctjVar.f9463n).map(new gei(ljfVar, kmqVar, 1, null, null, null)).collect(Collectors.toList());
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmi nmiVar20 = (nmi) nxlVarM18137O.f44974b;
            nxw nxwVar = nmiVar20.f43820u;
            if (!nxwVar.mo17770c()) {
                nmiVar20.f43820u = nxq.m18125S(nxwVar);
            }
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                nmiVar20.f43820u.mo18148g(((nmk) it3.next()).f43841g);
            }
            int i13 = ctjVar.f9464o;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar14 = nxlVarM18137O.f44974b;
            nmi nmiVar21 = (nmi) nxqVar14;
            nmiVar21.f43800a |= 524288;
            nmiVar21.f43821v = i13;
            float f = ctjVar.f9466q;
            if (!nxqVar14.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar15 = nxlVarM18137O.f44974b;
            nmi nmiVar22 = (nmi) nxqVar15;
            nmiVar22.f43800a |= 1048576;
            nmiVar22.f43822w = f;
            long j2 = ctjVar.f9467r;
            if (!nxqVar15.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar16 = nxlVarM18137O.f44974b;
            nmi nmiVar23 = (nmi) nxqVar16;
            nmiVar23.f43800a |= 2097152;
            nmiVar23.f43823x = j2;
            long j3 = ctjVar.f9468s;
            if (!nxqVar16.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar17 = nxlVarM18137O.f44974b;
            nmi nmiVar24 = (nmi) nxqVar17;
            nmiVar24.f43800a |= 4194304;
            nmiVar24.f43824y = j3;
            boolean z = ctjVar.f9471v;
            if (!nxqVar17.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmi nmiVar25 = (nmi) nxlVarM18137O.f44974b;
            nmiVar25.f43800a |= 8388608;
            nmiVar25.f43825z = z;
            cxk cxkVar2 = cxk.OFF;
            jzf jzfVar3 = jzf.VIDEO_BUFFER_DELAY;
            ikw ikwVar2 = ikw.UNINITIALIZED;
            switch (i2 - 1) {
                case 0:
                    i = 2;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 6;
                    break;
                case 5:
                    i = 7;
                    break;
                default:
                    i = 8;
                    break;
            }
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nmi nmiVar26 = (nmi) nxlVarM18137O.f44974b;
            nmiVar26.f43798B = i - 1;
            nmiVar26.f43800a |= 33554432;
            mrm mrmVar = ctjVar.f9472w;
            if (mrmVar.mo16813g()) {
                crm crmVar = (crm) mrmVar.mo16809c();
                nxl nxlVarM18137O3 = nls.f43586h.m18137O();
                boolean z2 = crmVar.f9141a;
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nxq nxqVar18 = nxlVarM18137O3.f44974b;
                nls nlsVar = (nls) nxqVar18;
                nlsVar.f43588a |= 1;
                nlsVar.f43589b = z2;
                boolean z3 = crmVar.f9142b;
                if (!nxqVar18.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nxq nxqVar19 = nxlVarM18137O3.f44974b;
                nls nlsVar2 = (nls) nxqVar19;
                nlsVar2.f43588a |= 2;
                nlsVar2.f43590c = z3;
                long j4 = crmVar.f9143c;
                if (!nxqVar19.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nxq nxqVar20 = nxlVarM18137O3.f44974b;
                nls nlsVar3 = (nls) nxqVar20;
                nlsVar3.f43588a |= 4;
                nlsVar3.f43591d = j4;
                int i14 = crmVar.f9144d;
                if (!nxqVar20.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nxq nxqVar21 = nxlVarM18137O3.f44974b;
                nls nlsVar4 = (nls) nxqVar21;
                nlsVar4.f43588a |= 8;
                nlsVar4.f43592e = i14;
                int i15 = crmVar.f9145e;
                if (!nxqVar21.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nxq nxqVar22 = nxlVarM18137O3.f44974b;
                nls nlsVar5 = (nls) nxqVar22;
                nlsVar5.f43588a |= 16;
                nlsVar5.f43593f = i15;
                float f2 = crmVar.f9146f;
                if (!nxqVar22.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nls nlsVar6 = (nls) nxlVarM18137O3.f44974b;
                nlsVar6.f43588a |= 32;
                nlsVar6.f43594g = f2;
                nls nlsVar7 = (nls) nxlVarM18137O3.mo18103l();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nmi nmiVar27 = (nmi) nxlVarM18137O.f44974b;
                nlsVar7.getClass();
                nmiVar27.f43797A = nlsVar7;
                nmiVar27.f43800a |= 16777216;
            }
            mrm mrmVar2 = ctjVar.f9474y;
            if (mrmVar2.mo16813g()) {
                nmg nmgVar = (nmg) mrmVar2.mo16809c();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nmi nmiVar28 = (nmi) nxlVarM18137O.f44974b;
                nmiVar28.f43799C = nmgVar;
                nmiVar28.f43800a |= 67108864;
            }
            ljfVar.f38374f.mo8174as(ljf.m15524n(ljfVar.f38369a.mo5395a(), false), kmqVar, ctjVar.f9452c, ((Integer) ((djm) ljfVar.f38372d).f11789c.mo10031c(gzy.f27045d)).intValue() != hyn.OFF.f29942e, (nmi) nxlVarM18137O.mo18103l(), ljfVar.f38370b.mo10518e().f28545j, ctjVar.f9450a.mo5498b() == gyx.MARS_STORE, ctjVar.f9473x, ((djm) ljfVar.f38375g).m6249y());
            it = it2;
        }
        Iterator it4 = ftaVar.f23536b.iterator();
        while (it4.hasNext()) {
            this.f8678D.m15536m((cti) it4.next(), this.f8686b);
        }
    }
}
