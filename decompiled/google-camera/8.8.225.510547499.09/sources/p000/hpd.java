package p000;

import android.content.Context;
import android.location.Location;
import android.media.ImageWriter;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class hpd implements jxe {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hpg f28762a;

    public hpd(hpg hpgVar) {
        this.f28762a = hpgVar;
    }

    @Override // p000.jxe
    /* JADX INFO: renamed from: a */
    public final void mo10569a(Exception exc) {
        ((nbe) ((nbe) hpg.f28767a.m17251b()).mo17276G((char) 3824)).mo17293r("Camcorder.onError(): %s", exc);
        synchronized (this.f28762a.f28820m) {
            this.f28762a.f28769B.clear();
            hpl hplVar = this.f28762a.f28800ag;
            hplVar.getClass();
            ((nbe) ((nbe) hpm.f28881a.m17251b()).mo17276G((char) 3839)).mo17293r("onRecordingError() %s", exc);
            hplVar.f28880e.f28925j.mo3415bf(hor.STATE_RECORDING_ERROR);
            elx elxVar = hplVar.f28878c;
            Context context = hplVar.f28879d;
            elxVar.mo7482d(jpd.m13426g(false, 3000, null, null, context.getString(C0100R.string.vid_chip_err), context, false, -1, 12));
            hplVar.f28880e.m10589g(true);
        }
    }

    @Override // p000.jxe
    /* JADX INFO: renamed from: b */
    public final void mo10570b() {
        hpl hplVar = this.f28762a.f28800ag;
        hplVar.getClass();
        hplVar.f28880e.f28925j.mo3415bf(hor.STATE_RECORDING_PAUSE);
    }

    @Override // p000.jxe
    /* JADX INFO: renamed from: c */
    public final void mo10571c() {
        hpl hplVar = this.f28762a.f28800ag;
        hplVar.getClass();
        hplVar.f28880e.f28925j.mo3415bf(hor.STATE_RECORDING);
        hplVar.f28880e.m10586d();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x013e A[Catch: all -> 0x0167, TryCatch #2 {, blocks: (B:4:0x0005, B:6:0x0013, B:7:0x0025, B:11:0x002e, B:12:0x0082, B:38:0x0115, B:40:0x013e, B:41:0x0162, B:29:0x00cf, B:32:0x00d2, B:33:0x00d3, B:34:0x00e5, B:37:0x00eb, B:45:0x0166, B:9:0x0027, B:10:0x002d, B:35:0x00e6, B:36:0x00ea, B:13:0x0083, B:14:0x008b, B:21:0x00af, B:22:0x00c8, B:26:0x00cc), top: B:53:0x0005, inners: #0, #1, #4 }] */
    @Override // p000.jxe
    /* JADX INFO: renamed from: d */
    public final void mo10572d() {
        hpl hplVar;
        Surface surface;
        synchronized (this.f28762a.f28820m) {
            boolean z = true;
            if (this.f28762a.f28811d.mo6184l(diy.f11747d)) {
                hpg hpgVar = this.f28762a;
                hpa hpaVar = hpgVar.f28828u;
                jxj jxjVar = hpgVar.f28799af;
                hqm hqmVar = hpgVar.f28791X;
                hqq hqqVar = (hqq) hpgVar.f28769B.get(0);
                synchronized (hpaVar.f28750t) {
                    hpaVar.f28729C = null;
                    hpaVar.f28754x = null;
                    hpaVar.f28753w = null;
                }
                hpaVar.f28736f.set(0L);
                hpaVar.f28737g.set(0L);
                hpaVar.f28738h.set(0L);
                hpaVar.f28732b.set(false);
                hpaVar.f28739i.set(0L);
                hpaVar.f28741k.set(0L);
                hpaVar.f28740j.set(0L);
                hpaVar.f28742l.set(0L);
                hpaVar.f28744n.set(0L);
                hpaVar.f28743m.set(0L);
                hpaVar.f28733c.set(false);
                hpaVar.f28734d.set(false);
                hpaVar.f28747q.set(0L);
                hpaVar.f28746p.set(0L);
                hpaVar.f28745o.set(0L);
                hpaVar.f28734d.set(true);
                synchronized (hpaVar.f28750t) {
                    hpaVar.f28729C = jxjVar;
                    hpaVar.f28754x = hqqVar;
                    hpaVar.f28753w = hqmVar;
                    synchronized (jxjVar.f35023d) {
                        if (jxjVar.f35024e == jxi.f35018d) {
                            z = false;
                        }
                        lku.m15614I(z, "Camcorder is closed already");
                        mrm mrmVarMo13744c = jxjVar.f35020a.mo13744c();
                        lku.m15670x(mrmVarMo13744c.mo16813g(), "Input surface is not available.");
                        surface = (Surface) mrmVarMo13744c.mo16809c();
                    }
                    hpaVar.f28728B = new klx(ImageWriter.newInstance(surface, 5));
                    hqmVar.getClass();
                    hqmVar.m10611f(hpaVar.f28727A);
                    hqmVar.m10609d(hpaVar.f28727A);
                }
                jxj jxjVar2 = this.f28762a.f28799af;
                jxjVar2.getClass();
                jxjVar2.f35020a.mo13756o(dzk.TIMELAPSE.m6969d());
                hplVar = this.f28762a.f28800ag;
                hplVar.getClass();
                if (!((hor) hplVar.f28880e.f28925j.f34942d).equals(hor.STATE_RECORDING_ERROR)) {
                    hplVar.f28880e.f28925j.mo3415bf(hor.STATE_RECORDING);
                    jvd jvdVar = hplVar.f28876a;
                    hqb hqbVar = hplVar.f28877b;
                    hqbVar.getClass();
                    jvdVar.m13541c(new hpi(hqbVar, 17));
                    hplVar.f28880e.m10588f(false);
                    hplVar.f28880e.m10586d();
                }
            } else {
                hpg hpgVar2 = this.f28762a;
                hoj hojVar = hpgVar2.f28817j;
                hqq hqqVar2 = (hqq) hpgVar2.f28769B.get(0);
                hqm hqmVar2 = this.f28762a.f28791X;
                synchronized (hojVar.f28613w) {
                    hojVar.f28580D = hqmVar2;
                    hojVar.f28581E = hqqVar2;
                }
                hojVar.f28605o.set(hojVar.f28584H.f29162h);
                hojVar.f28585I = new Timer();
                hojVar.f28585I.scheduleAtFixedRate(new hoi(hojVar), 0L, TimeUnit.SECONDS.toMillis(1L));
                hojVar.f28593c.set(true);
                jxj jxjVar3 = this.f28762a.f28799af;
                jxjVar3.getClass();
                jxjVar3.f35020a.mo13756o(dzk.TIMELAPSE.m6969d());
                hplVar = this.f28762a.f28800ag;
                hplVar.getClass();
                if (!((hor) hplVar.f28880e.f28925j.f34942d).equals(hor.STATE_RECORDING_ERROR)) {
                    hplVar.f28880e.f28925j.mo3415bf(hor.STATE_RECORDING);
                    jvd jvdVar2 = hplVar.f28876a;
                    hqb hqbVar2 = hplVar.f28877b;
                    hqbVar2.getClass();
                    jvdVar2.m13541c(new hpi(hqbVar2, 17));
                    hplVar.f28880e.m10588f(false);
                    hplVar.f28880e.m10586d();
                }
            }
        }
    }

    @Override // p000.jxe
    /* JADX INFO: renamed from: e */
    public final void mo10573e() {
        final ArrayList arrayList;
        hqr hqrVarM10620a;
        Iterator it;
        Duration durationOfSeconds;
        MediaFormat trackFormat;
        int i;
        hqr hqrVar;
        hqr hqrVarM10620a2;
        hpg hpgVar = this.f28762a;
        synchronized (hpgVar.f28820m) {
            if (hpgVar.f28811d.mo6184l(diy.f11747d)) {
                hpgVar.m10579f();
            }
            ArrayList arrayList2 = (ArrayList) hpgVar.f28769B.clone();
            hpgVar.f28769B.clear();
            ArrayList arrayList3 = new ArrayList();
            int i2 = 0;
            hqr hqrVar2 = null;
            while (i2 < arrayList2.size()) {
                if (i2 == 0) {
                    hqrVarM10620a2 = ((hqq) arrayList2.get(0)).m10620a();
                    hqrVar = hqrVarM10620a2;
                } else {
                    hqq hqqVar = (hqq) arrayList2.get(i2);
                    hqrVar2.getClass();
                    hqqVar.m10634o(hqrVar2.f29179a);
                    hqqVar.m10621b(hqrVar2.f29180b);
                    hqqVar.m10626g(hqrVar2.f29189k);
                    hqqVar.m10625f(hqrVar2.f29183e);
                    hqqVar.m10631l(hqrVar2.f29184f);
                    hqr hqrVarM10620a3 = hqqVar.m10620a();
                    hqrVar = hqrVar2;
                    hqrVarM10620a2 = hqrVarM10620a3;
                }
                hpgVar.f28811d.mo6175c();
                hqrVarM10620a2.f29182d.close();
                arrayList3.add(hqrVarM10620a2);
                i2++;
                hqrVar2 = hqrVar;
            }
            if (hpgVar.f28828u.m10568m()) {
                long jM10563h = hpgVar.f28828u.m10563h();
                if (jM10563h == 1) {
                    ctp ctpVar = hpgVar.f28788U;
                    if (ctpVar != null) {
                        ctpVar.mo5503g();
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                    }
                } else {
                    ctp ctpVar2 = hpgVar.f28788U;
                    ctpVar2.getClass();
                    hpa hpaVar = hpgVar.f28828u;
                    jyl jylVar = new jyl();
                    long andSet = hpaVar.f28744n.getAndSet(0L) / jM10563h;
                    synchronized (hpaVar.f28750t) {
                        hqm hqmVar = hpaVar.f28753w;
                        hqmVar.getClass();
                        hqn hqnVar = hpaVar.f28727A;
                        synchronized (hqmVar.f29135a) {
                            if (!hqmVar.f29141g.containsKey(hqnVar)) {
                                throw new IllegalArgumentException("unsupported speed up ratio");
                            }
                            hqmVar.f29141g.put(hqnVar, 0L);
                        }
                    }
                    try {
                        kqa kqaVarMo5570a = jylVar.mo5570a(ctpVar2.mo5502f(), 0);
                        Iterator it2 = arrayList3.iterator();
                        boolean z = false;
                        hoz hozVar = null;
                        while (it2.hasNext()) {
                            hqr hqrVar3 = (hqr) it2.next();
                            try {
                                ctp ctpVar3 = hqrVar3.f29182d;
                                ctpVar3.close();
                                ctpVar3.mo5499c();
                                FileInputStream fileInputStreamMo14684d = ((gyj) ((mrq) ctpVar3.mo5499c()).f41482a).f26832a.mo14684d();
                                FileDescriptor fd = fileInputStreamMo14684d.getFD();
                                MediaExtractor mediaExtractor = new MediaExtractor();
                                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                                Object obj = new Object();
                                try {
                                    mediaExtractor.setDataSource(fd);
                                    try {
                                        if (z) {
                                            it = it2;
                                        } else {
                                            int i3 = hqrVar3.f29189k;
                                            mrm mrmVar = hqrVar3.f29183e;
                                            kqaVarMo5570a.mo14521e(i3);
                                            if (mrmVar.mo16813g()) {
                                                kqaVarMo5570a.mo14520d((float) ((Location) mrmVar.mo16809c()).getLatitude(), (float) ((Location) mrmVar.mo16809c()).getLongitude());
                                            }
                                            String str = PMZiHihxLGEy.uNjqDdTYGv;
                                            synchronized (obj) {
                                                int trackCount = mediaExtractor.getTrackCount();
                                                int i4 = 0;
                                                while (true) {
                                                    if (i4 >= trackCount) {
                                                        it = it2;
                                                        trackFormat = null;
                                                        break;
                                                    }
                                                    trackFormat = mediaExtractor.getTrackFormat(i4);
                                                    it = it2;
                                                    String string = trackFormat.getString("mime");
                                                    if (string != null && string.startsWith(str)) {
                                                        break;
                                                    }
                                                    i4++;
                                                    it2 = it;
                                                }
                                            }
                                            if (trackFormat == null) {
                                                ((nbe) ((nbe) hpa.f28726a.m17252c()).mo17276G((char) 3811)).mo17290o("Input file doesn't have a video track.");
                                                i = -1;
                                            } else {
                                                int iMo14517a = kqaVarMo5570a.mo14517a(trackFormat);
                                                kqaVarMo5570a.mo14522f();
                                                i = iMo14517a;
                                            }
                                            if (i != -1) {
                                                hozVar = new hoz(hpaVar, kqaVarMo5570a, i, andSet);
                                            } else {
                                                z = z;
                                                hozVar = hozVar;
                                                it2 = it;
                                            }
                                        }
                                        fileInputStreamMo14684d.close();
                                        z = true;
                                        hozVar = hozVar;
                                        it2 = it;
                                        hpgVar = hpgVar;
                                        arrayList3 = arrayList3;
                                        kqaVarMo5570a = kqaVarMo5570a;
                                    } catch (IOException e) {
                                        ((nbe) ((nbe) hpa.f28726a.m17251b()).mo17276G((char) 3813)).mo17293r(gBCSQzBeB.aPxVFfyJYg, e.getMessage());
                                        arrayList = arrayList3;
                                        hqrVarM10620a = null;
                                    }
                                    hozVar.getClass();
                                    concurrentLinkedQueue.add(hozVar);
                                    int iRound = hpaVar.m10568m() ? Math.round(((Float) hpaVar.f28748r.mo6180h(diy.f11752i).get()).floatValue() * 524288.0f) : 524288;
                                    synchronized (hpaVar.f28750t) {
                                        if (jM10563h > 4) {
                                            double d = jM10563h;
                                            double d2 = hpaVar.f28756z.f29162h;
                                            Double.isNaN(d);
                                            Double.isNaN(d2);
                                            double d3 = d / d2;
                                            if (d3 >= 9.223372036854776E18d) {
                                                durationOfSeconds = nnd.f43935c;
                                            } else {
                                                if (d3 <= nnd.f43934b) {
                                                    durationOfSeconds = nnd.f43933a;
                                                } else {
                                                    long jM17513a = nmx.m17513a(d3, RoundingMode.FLOOR);
                                                    double d4 = jM17513a;
                                                    Double.isNaN(d4);
                                                    durationOfSeconds = Duration.ofSeconds(jM17513a, nmx.m17513a((d3 - d4) * 1.0E9d, RoundingMode.FLOOR));
                                                }
                                                nnd.m17517a(durationOfSeconds);
                                                hqp.m10618a(hqp.m10619b(mediaExtractor, obj), mqu.f41450a, mrm.m16829i(durationOfSeconds), mediaExtractor, concurrentLinkedQueue, obj, iRound);
                                            }
                                            nnd.m17517a(durationOfSeconds);
                                            hqp.m10618a(hqp.m10619b(mediaExtractor, obj), mqu.f41450a, mrm.m16829i(durationOfSeconds), mediaExtractor, concurrentLinkedQueue, obj, iRound);
                                        } else {
                                            arrayList3 = arrayList3;
                                            kqaVarMo5570a = kqaVarMo5570a;
                                            hqp.m10618a(hqp.m10619b(mediaExtractor, obj), mrm.m16829i(Long.valueOf(jM10563h)), mqu.f41450a, mediaExtractor, concurrentLinkedQueue, obj, iRound);
                                        }
                                    }
                                    synchronized (obj) {
                                        mediaExtractor.release();
                                    }
                                } catch (IOException e2) {
                                    throw new IllegalArgumentException("Unable to open file descriptor", e2);
                                }
                            } catch (IOException e3) {
                                hpgVar = hpgVar;
                                ((nbe) ((nbe) hpa.f28726a.m17251b()).mo17276G((char) 3814)).mo17293r("Can't open input file descriptor: %s", e3.getMessage());
                                arrayList = arrayList3;
                                hqrVarM10620a = null;
                            }
                        }
                        hpgVar = hpgVar;
                        ArrayList arrayList4 = arrayList3;
                        kqa kqaVar = kqaVarMo5570a;
                        kqaVar.mo14523g();
                        kqaVar.mo14519c();
                        synchronized (hpaVar.f28750t) {
                            hpaVar.f28747q.set(TimeUnit.SECONDS.toMillis(hpaVar.f28744n.get()) / ((long) hpaVar.f28756z.f29162h));
                            hpaVar.m10567l();
                        }
                        arrayList = arrayList4;
                        hqr hqrVar4 = (hqr) arrayList.get(0);
                        hqq hqqVar2 = new hqq(null);
                        hqqVar2.m10634o(hqrVar4.f29179a);
                        hqqVar2.m10621b(hqrVar4.f29180b);
                        hqqVar2.m10633n(hqrVar4.f29181c);
                        hqqVar2.m10628i(hqrVar4.f29182d);
                        hqqVar2.m10625f(hqrVar4.f29183e);
                        hqqVar2.m10631l(hqrVar4.f29184f);
                        hqqVar2.m10629j(hqrVar4.f29185g);
                        hqqVar2.m10627h(hqrVar4.f29186h);
                        hqqVar2.m10622c(hqrVar4.f29187i);
                        hqqVar2.m10623d(hqrVar4.f29188j);
                        hqqVar2.m10632m(hqrVar4.f29190l);
                        hqqVar2.m10626g(hqrVar4.f29189k);
                        hqqVar2.m10624e(hqrVar4.f29191m);
                        hqqVar2.m10630k(hqrVar4.f29192n);
                        hqqVar2.m10629j(hpaVar.m10562g());
                        hqqVar2.m10627h(hpaVar.m10564i());
                        hqqVar2.m10622c(hpaVar.m10561f());
                        hqqVar2.m10623d(hpaVar.m10560e());
                        hqqVar2.m10628i(ctpVar2);
                        hqqVar2.m10633n(mqu.f41450a);
                        hqrVarM10620a = hqqVar2.m10620a();
                    } catch (jyp e4) {
                        hpgVar = hpgVar;
                        arrayList = arrayList3;
                        ((nbe) ((nbe) hpa.f28726a.m17251b()).mo17276G((char) 3815)).mo17293r("Can't create MediaMuxerProxy: %s", e4.getMessage());
                        hqrVarM10620a = null;
                    }
                    if (hqrVarM10620a == null) {
                        ((nbe) ((nbe) hpg.f28767a.m17251b()).mo17276G((char) 3836)).mo17290o("Failed to reselect frames. Save the video(s) without frame reselection instead.");
                        hpgVar = hpgVar;
                    } else {
                        ctpVar2.close();
                        hpgVar = hpgVar;
                        hpgVar.f28811d.mo6175c();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            ((hqr) it3.next()).f29182d.mo5503g();
                        }
                        arrayList.clear();
                        arrayList.add(hqrVarM10620a);
                    }
                }
            } else {
                arrayList = arrayList3;
            }
            hpl hplVar = hpgVar.f28800ag;
            hplVar.getClass();
            final hqm hqmVar2 = hpgVar.f28791X;
            final hpm hpmVar = hplVar.f28880e;
            hpmVar.f28927l.execute(new Runnable() { // from class: hpj
                /* JADX WARN: Bottom block not found for handler: all -> 0x01f8 */
                /* JADX WARN: Bottom block not found for handler: all -> 0x01ff */
                /* JADX WARN: Bottom block not found for handler: all -> 0x0206 */
                /* JADX WARN: Bottom block not found for handler: all -> 0x020d */
                /* JADX WARN: Bottom block not found for handler: all -> 0x0214 */
                /* JADX WARN: Bottom block not found for handler: all -> 0x021b */
                /* JADX WARN: Bottom block not found for handler: all -> 0x0222 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() throws Throwable {
                    nma nmaVar;
                    long j;
                    long j2;
                    boolean z2;
                    mwx mwxVarM17118m;
                    mwx mwxVar;
                    long j3;
                    mwx mwxVarM17118m2;
                    hqm hqmVar3;
                    Object obj2;
                    nma[] nmaVarArr;
                    mwx mwxVar2;
                    mwx mwxVar3;
                    nma[] nmaVarArr2;
                    long j4;
                    nma[] nmaVarArr3;
                    hpm hpmVar2 = hpmVar;
                    List list = arrayList;
                    hqm hqmVar4 = hqmVar2;
                    Object obj3 = hpmVar2.f28932q;
                    synchronized (obj3) {
                        for (int i5 = 0; i5 < list.size(); i5++) {
                            try {
                                cvr cvrVar = hpmVar2.f28921f;
                                cvrVar.f9822c.execute(new dcr(cvrVar, (hqr) list.get(i5), System.currentTimeMillis(), 1));
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                        synchronized (hpmVar2.f28932q) {
                            try {
                                try {
                                    list.clear();
                                    hpmVar2.f28925j.mo3415bf(hor.STATE_IDLE);
                                    jvd jvdVar = hpmVar2.f28931p;
                                    hqb hqbVar = hpmVar2.f28884C;
                                    hqbVar.getClass();
                                    jvdVar.m13541c(new hpi(hqbVar, 12));
                                } catch (Throwable th2) {
                                    th = th2;
                                    while (true) {
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        }
                        hpmVar2.f28931p.m13541c(new hpi(hpmVar2, 15));
                        dhv dhvVar = hpmVar2.f28929n;
                        dhw dhwVar = diy.f11744a;
                        dhvVar.mo6175c();
                        fcp fcpVar = hpmVar2.f28887F;
                        synchronized (hqmVar4.f29135a) {
                            try {
                                String str2 = hqmVar4.f29136b;
                            } catch (Throwable th5) {
                                th = th5;
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        kmq kmqVar = hpmVar2.f28892K;
                        mrm mrmVar2 = hpmVar2.f28933r;
                        mrm mrmVarM16829i = mrmVar2.mo16813g() ? mrm.m16829i(((gmh) mrmVar2.mo16809c()).mo9505c()) : mqu.f41450a;
                        nim nimVarM6249y = hpmVar2.f28903V.m6249y();
                        synchronized (hqmVar4.f29135a) {
                            try {
                                nmaVar = hqmVar4.f29142h;
                            } catch (Throwable th6) {
                                th = th6;
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        synchronized (hqmVar4.f29135a) {
                            try {
                                j = hqmVar4.f29144j;
                            } catch (Throwable th7) {
                                th = th7;
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        synchronized (hqmVar4.f29135a) {
                            try {
                                j2 = hqmVar4.f29145k;
                            } catch (Throwable th8) {
                                th = th8;
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        synchronized (hqmVar4.f29135a) {
                            try {
                                z2 = hqmVar4.f29143i;
                            } catch (Throwable th9) {
                                th = th9;
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        boolean z3 = hqmVar4.f29138d;
                        synchronized (hqmVar4.f29135a) {
                            try {
                                HashMap map = new HashMap();
                                nma[] nmaVarArrValues = nma.values();
                                int length = nmaVarArrValues.length;
                                int i6 = 0;
                                while (i6 < length) {
                                    nma nmaVar2 = nmaVarArrValues[i6];
                                    try {
                                        hqn hqnVarM10606a = hqmVar4.m10606a(nmaVar2);
                                        nmaVarArr3 = nmaVarArrValues;
                                        try {
                                            if (!hqmVar4.f29139e.containsKey(hqnVarM10606a)) {
                                                throw new IllegalArgumentException();
                                            }
                                            map.put(nmaVar2, (Integer) hqmVar4.f29139e.get(hqnVarM10606a));
                                        } catch (IllegalArgumentException e5) {
                                            nmaVar2.name();
                                        }
                                    } catch (IllegalArgumentException e6) {
                                        nmaVarArr3 = nmaVarArrValues;
                                    }
                                    i6++;
                                    nmaVarArrValues = nmaVarArr3;
                                }
                                mwxVarM17118m = mwx.m17118m(map);
                            } catch (Throwable th10) {
                                th = th10;
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        synchronized (hqmVar4.f29135a) {
                            try {
                                HashMap map2 = new HashMap();
                                nma[] nmaVarArrValues2 = nma.values();
                                int length2 = nmaVarArrValues2.length;
                                int i7 = 0;
                                while (i7 < length2) {
                                    int i8 = length2;
                                    nma nmaVar3 = nmaVarArrValues2[i7];
                                    try {
                                        hqn hqnVarM10606a2 = hqmVar4.m10606a(nmaVar3);
                                        nmaVarArr2 = nmaVarArrValues2;
                                        try {
                                            if (!hqmVar4.f29140f.containsKey(hqnVarM10606a2)) {
                                                mwxVar3 = mwxVarM17118m;
                                                j4 = j;
                                                throw new IllegalArgumentException();
                                            }
                                            mwxVar3 = mwxVarM17118m;
                                            try {
                                                j4 = j;
                                                try {
                                                    map2.put(nmaVar3, Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) hqmVar4.f29140f.get(hqnVarM10606a2)).longValue()) / ((long) hqmVar4.f29137c)));
                                                } catch (IllegalArgumentException e7) {
                                                    nmaVar3.name();
                                                }
                                            } catch (IllegalArgumentException e8) {
                                                j4 = j;
                                                nmaVar3.name();
                                            }
                                            i7++;
                                            length2 = i8;
                                            nmaVarArrValues2 = nmaVarArr2;
                                            mwxVarM17118m = mwxVar3;
                                            j = j4;
                                        } catch (IllegalArgumentException e9) {
                                            mwxVar3 = mwxVarM17118m;
                                        }
                                    } catch (IllegalArgumentException e10) {
                                        mwxVar3 = mwxVarM17118m;
                                        nmaVarArr2 = nmaVarArrValues2;
                                    }
                                    nmaVar3.name();
                                    i7++;
                                    length2 = i8;
                                    nmaVarArrValues2 = nmaVarArr2;
                                    mwxVarM17118m = mwxVar3;
                                    j = j4;
                                }
                                mwxVar = mwxVarM17118m;
                                j3 = j;
                                mwxVarM17118m2 = mwx.m17118m(map2);
                            } catch (Throwable th11) {
                                th = th11;
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        synchronized (hqmVar4.f29135a) {
                            try {
                                HashMap map3 = new HashMap();
                                nma[] nmaVarArrValues3 = nma.values();
                                int length3 = nmaVarArrValues3.length;
                                int i9 = 0;
                                while (i9 < length3) {
                                    nma nmaVar4 = nmaVarArrValues3[i9];
                                    try {
                                        hqn hqnVarM10606a3 = hqmVar4.m10606a(nmaVar4);
                                        if (!hqmVar4.f29141g.containsKey(hqnVarM10606a3)) {
                                            hqmVar3 = hqmVar4;
                                            obj2 = obj3;
                                            nmaVarArr = nmaVarArrValues3;
                                            mwxVar2 = mwxVarM17118m2;
                                            throw new IllegalArgumentException();
                                        }
                                        nmaVarArr = nmaVarArrValues3;
                                        try {
                                            mwxVar2 = mwxVarM17118m2;
                                            try {
                                                hqmVar3 = hqmVar4;
                                                obj2 = obj3;
                                                try {
                                                    try {
                                                        map3.put(nmaVar4, Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) hqmVar4.f29141g.get(hqnVarM10606a3)).longValue()) / ((long) hqmVar4.f29137c)));
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        throw th;
                                                    }
                                                } catch (IllegalArgumentException e11) {
                                                    nmaVar4.name();
                                                }
                                            } catch (IllegalArgumentException e12) {
                                                hqmVar3 = hqmVar4;
                                                obj2 = obj3;
                                                nmaVar4.name();
                                            }
                                        } catch (IllegalArgumentException e13) {
                                            mwxVar2 = mwxVarM17118m2;
                                        }
                                        i9++;
                                        mwxVarM17118m2 = mwxVar2;
                                        nmaVarArrValues3 = nmaVarArr;
                                        hqmVar4 = hqmVar3;
                                        obj3 = obj2;
                                    } catch (IllegalArgumentException e14) {
                                        hqmVar3 = hqmVar4;
                                        obj2 = obj3;
                                        nmaVarArr = nmaVarArrValues3;
                                        mwxVar2 = mwxVarM17118m2;
                                    }
                                    nmaVar4.name();
                                    i9++;
                                    mwxVarM17118m2 = mwxVar2;
                                    nmaVarArrValues3 = nmaVarArr;
                                    hqmVar4 = hqmVar3;
                                    obj3 = obj2;
                                }
                                Object obj4 = obj3;
                                fcpVar.mo8145T(kmqVar, mrmVarM16829i, nimVarM6249y, nmaVar, j3, j2, z2, z3, mwxVar, mwxVarM17118m2, mwx.m17118m(map3));
                                return;
                            } catch (Throwable th13) {
                                th = th13;
                            }
                        }
                    }
                    throw th;
                }
            });
        }
    }
}
