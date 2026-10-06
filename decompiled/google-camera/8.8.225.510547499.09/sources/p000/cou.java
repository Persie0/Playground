package p000;

import android.app.job.JobParameters;
import com.google.android.apps.camera.brella.mediastore.MediaListeningService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cou implements nph {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f8501a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f8502b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f8503c;

    public cou(cni cniVar, JobParameters jobParameters, int i) {
        this.f8503c = i;
        this.f8502b = cniVar;
        this.f8501a = jobParameters;
    }

    public cou(MediaListeningService mediaListeningService, JobParameters jobParameters, int i) {
        this.f8503c = i;
        this.f8502b = mediaListeningService;
        this.f8501a = jobParameters;
    }

    public cou(cpw cpwVar, List list, int i) {
        this.f8503c = i;
        this.f8501a = cpwVar;
        this.f8502b = list;
    }

    public cou(cqg cqgVar, gyv gyvVar, int i) {
        this.f8503c = i;
        this.f8501a = cqgVar;
        this.f8502b = gyvVar;
    }

    public cou(cqg cqgVar, jyx jyxVar, int i) {
        this.f8503c = i;
        this.f8501a = cqgVar;
        this.f8502b = jyxVar;
    }

    public cou(esl eslVar, ikw ikwVar, int i) {
        this.f8503c = i;
        this.f8501a = eslVar;
        this.f8502b = ikwVar;
    }

    public cou(hio hioVar, kcc kccVar, int i) {
        this.f8503c = i;
        this.f8501a = hioVar;
        this.f8502b = kccVar;
    }

    public cou(hpm hpmVar, kcc kccVar, int i) {
        this.f8503c = i;
        this.f8501a = hpmVar;
        this.f8502b = kccVar;
    }

    public cou(ibq ibqVar, ikw ikwVar, int i) {
        this.f8503c = i;
        this.f8501a = ibqVar;
        this.f8502b = ikwVar;
    }

    public cou(jlh jlhVar, JobParameters jobParameters, int i) {
        this.f8503c = i;
        this.f8502b = jlhVar;
        this.f8501a = jobParameters;
    }

    /* JADX INFO: renamed from: c */
    private final void m5215c() {
        synchronized (((cpw) this.f8501a).f8689e) {
            ((cpw) this.f8501a).m5260b();
            if (((cpw) this.f8501a).f8709y == cpv.CLOSED) {
                return;
            }
            lku.m15613H(((cpw) this.f8501a).f8709y == cpv.STOPPING_RECORDING);
            ((cpw) this.f8501a).m5269k(cpv.NO_RECORDING);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kcc] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, kcc] */
    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f8503c) {
            case 0:
                int i = MediaListeningService.f6571c;
                MediaListeningService.m4069a(((MediaListeningService) this.f8502b).getApplicationContext());
                ((MediaListeningService) this.f8502b).jobFinished((JobParameters) this.f8501a, false);
                return;
            case 1:
                return;
            case 2:
                ((nbe) ((nbe) ((nbe) cpw.f8674a.m17251b()).mo17283h(th)).mo17276G((char) 440)).mo17290o("Failed to stop recording.");
                m5215c();
                return;
            case 3:
                return;
            case 4:
                ((nbe) ((nbe) cqg.f8825a.m17251b()).mo17276G((char) 466)).mo17293r("CamcorderSnapshot is not available: %s", th);
                cpw cpwVar = (cpw) ((cqg) this.f8501a).f8850b;
                cpwVar.f8678D.m15535l(th, cpwVar.f8686b);
                ((cqg) this.f8501a).f8872x.mo6357e(((gyv) this.f8502b).f26876b);
                ((cqg) this.f8501a).f8827B.remove(this.f8502b);
                ((cqg) this.f8501a).f8852d.m5371l(true);
                return;
            case 5:
                ((nbe) ((nbe) ((nbe) esl.f15318a.m17252c()).mo17283h(th)).mo17276G((char) 1872)).mo17290o("Failure disconnecting camera device");
                return;
            case 6:
                this.f8502b.mo13952a();
                throw new mso(th, null);
            case 7:
                this.f8502b.mo13952a();
                return;
            case 8:
                ((nbe) ((nbe) ibq.f30215a.m17252c()).mo17276G(4082)).mo17293r("Unable to launch mode for: %s", this.f8502b);
                return;
            default:
                if (th instanceof jlo) {
                    return;
                }
                jlh jlhVar = (jlh) this.f8502b;
                jlhVar.mo4713a(jlhVar.getApplicationContext()).f37199b.execute(new ith(th, 16));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, jyx] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, jyx] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, jyx] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v52, types: [java.lang.Object, kcc] */
    /* JADX WARN: Type inference failed for: r8v63, types: [java.lang.Object, kcc] */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        byte[] bArr = null;
        switch (this.f8503c) {
            case 0:
                int i = MediaListeningService.f6571c;
                MediaListeningService.m4069a(((MediaListeningService) this.f8502b).getApplicationContext());
                ((MediaListeningService) this.f8502b).jobFinished((JobParameters) this.f8501a, false);
                return;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    long j = cni.f6345e;
                }
                ((cni) this.f8502b).jobFinished((JobParameters) this.f8501a, false);
                return;
            case 2:
                fta ftaVar = (fta) obj;
                ((cpw) this.f8501a).f8699o.m10437h(hlf.RECORD_STOPPED);
                Iterator it = this.f8502b.iterator();
                while (it.hasNext()) {
                    ((cre) it.next()).mo5273o(ftaVar);
                }
                if (!ftaVar.f23538d.isEmpty()) {
                    cqm cqmVar = ((cpw) this.f8501a).f8688d;
                    cqmVar.f8946a.mo10739g(ilj.VIDEO);
                    cqmVar.f8946a.mo10741i(cqmVar.f8947b);
                }
                m5215c();
                return;
            case 3:
                synchronized (((cqg) this.f8501a).f8854f) {
                    if (((cqg) this.f8501a).f8830E == cqf.STOPPED) {
                        return;
                    }
                    cqg cqgVar = (cqg) this.f8501a;
                    cqgVar.m5348d();
                    cqgVar.f8828C = cqgVar.f8873y.scheduleAtFixedRate(new cmd(cqgVar, 17), dlt.f11991a.getSeconds(), dlt.f11991a.getSeconds(), TimeUnit.SECONDS);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(((cqg) this.f8501a).f8865q);
                    cqg cqgVar2 = (cqg) this.f8501a;
                    if (cqgVar2.f8860l.f9329A) {
                        if (cqgVar2.f8858j.mo6184l(dhh.f11065R)) {
                            arrayList.add(new cud(this.f8502b));
                        }
                        if (((cqg) this.f8501a).f8860l.f9338c == jxn.FPS_AUTO) {
                            ?? r1 = this.f8502b;
                            r1.getClass();
                            arrayList.add(new cuc(r1));
                            if (((cqg) this.f8501a).f8869u.mo16813g()) {
                                arrayList.add((kfv) ((cqg) this.f8501a).f8869u.mo16809c());
                            }
                        }
                        mrm mrmVarM6966c = dzk.m6966c(((cqg) this.f8501a).f8860l.f9360y);
                        if (mrmVarM6966c.mo16813g()) {
                            this.f8502b.mo13756o(((dzk) mrmVarM6966c.mo16809c()).m6969d());
                        }
                    }
                    ((cqg) this.f8501a).f8863o.mo5684e(arrayList);
                    return;
                }
            case 4:
                ((cqg) this.f8501a).f8853e.add((cti) obj);
                ((cqg) this.f8501a).f8852d.m5371l(true);
                return;
            case 5:
                jvd.m13538a();
                ((esl) this.f8501a).f15407k.mo13961e("doSelectMode " + String.valueOf(this.f8502b) + " second half");
                ((esl) this.f8501a).m7780C((ikw) this.f8502b);
                if (!((esl) this.f8501a).f15412p.mo3787v()) {
                    ((esl) this.f8501a).f15404h.m11368g();
                }
                esl eslVar = (esl) this.f8501a;
                chw chwVar = eslVar.f15412p;
                if (!eslVar.f15422z) {
                    chwVar.m3771bW();
                    chwVar.m3779m();
                    kba kbaVar = eslVar.f15325G;
                    if (kbaVar != null) {
                        kbaVar.close();
                        eslVar.f15325G = null;
                    }
                    int iM7782E = eslVar.m7782E();
                    if (iM7782E == 2 || iM7782E == 9) {
                        AtomicReference atomicReference = new AtomicReference();
                        atomicReference.set(jwr.m13642l(((ciq) eslVar.f15411o).f5842h.getClickEnabledObservable(), new esk(eslVar, iM7782E, atomicReference)));
                        eslVar.f15325G = (kba) atomicReference.get();
                        jvb jvbVarM3530j = eslVar.f15339U.m3530j();
                        kba kbaVar2 = eslVar.f15325G;
                        kbaVar2.getClass();
                        jvbVarM3530j.m13537d(kbaVar2);
                    } else {
                        eslVar.f15416t.mo8151Z(eslVar.m7782E(), 2);
                    }
                    eslVar.m7781D();
                }
                ((esl) this.f8501a).f15407k.mo13962f();
                return;
            case 6:
                this.f8502b.mo13952a();
                hio.m10344k(new hfr(this, 14, bArr), ((hio) this.f8501a).f27926d);
                synchronized (((hio) this.f8501a).f27927e) {
                    ((hio) this.f8501a).f27930h = hin.PREINITIALIZED;
                    break;
                }
                return;
            case 7:
                ihw ihwVar = (ihw) obj;
                if (((hpm) this.f8501a).f28894M.mo16813g()) {
                    ((ipp) ((hpm) this.f8501a).f28894M.mo16809c()).mo11592c(ihwVar.f31016a, ihwVar.f31017b, ihwVar.f31018c);
                    hpm hpmVar = (hpm) this.f8501a;
                    hpg hpgVar = hpmVar.f28883B;
                    ipp ippVar = (ipp) hpmVar.f28894M.mo16809c();
                    kgg kggVar = hpgVar.f28785R;
                    kggVar.getClass();
                    kfc kfcVar = hpgVar.f28781N;
                    kfcVar.getClass();
                    ippVar.mo11590a(kfcVar, kggVar);
                } else {
                    kgg kggVar2 = ((hpm) this.f8501a).f28883B.f28785R;
                    kggVar2.getClass();
                    kggVar2.mo14194d(ihwVar.f31016a);
                }
                this.f8502b.mo13952a();
                return;
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    ((ibq) this.f8501a).mo11011j((ikw) this.f8502b, true);
                    return;
                }
                return;
            default:
                ((jlh) this.f8502b).jobFinished((JobParameters) this.f8501a, false);
                return;
        }
    }
}
