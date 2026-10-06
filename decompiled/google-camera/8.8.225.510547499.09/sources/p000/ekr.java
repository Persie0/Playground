package p000;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.google.android.apps.camera.keepalive.ProcessGcService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekr implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f14489a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f14490b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f14491c;

    public /* synthetic */ ekr(ProcessGcService processGcService, JobParameters jobParameters, int i) {
        this.f14491c = i;
        this.f14489a = processGcService;
        this.f14490b = jobParameters;
    }

    public /* synthetic */ ekr(eik eikVar, kbg kbgVar, int i) {
        this.f14491c = i;
        this.f14490b = eikVar;
        this.f14489a = kbgVar;
    }

    public ekr(eks eksVar, mrf mrfVar, int i) {
        this.f14491c = i;
        this.f14490b = eksVar;
        this.f14489a = mrfVar;
    }

    public /* synthetic */ ekr(elv elvVar, elw elwVar, int i) {
        this.f14491c = i;
        this.f14490b = elvVar;
        this.f14489a = elwVar;
    }

    public /* synthetic */ ekr(elv elvVar, Runnable runnable, int i) {
        this.f14491c = i;
        this.f14490b = elvVar;
        this.f14489a = runnable;
    }

    public /* synthetic */ ekr(elv elvVar, oju ojuVar, int i) {
        this.f14491c = i;
        this.f14490b = elvVar;
        this.f14489a = ojuVar;
    }

    public /* synthetic */ ekr(eoq eoqVar, eop eopVar, int i) {
        this.f14491c = i;
        this.f14489a = eoqVar;
        this.f14490b = eopVar;
    }

    public /* synthetic */ ekr(epq epqVar, Runnable runnable, int i) {
        this.f14491c = i;
        this.f14490b = epqVar;
        this.f14489a = runnable;
    }

    public /* synthetic */ ekr(eqf eqfVar, ntv ntvVar, int i) {
        this.f14491c = i;
        this.f14490b = eqfVar;
        this.f14489a = ntvVar;
    }

    public /* synthetic */ ekr(eqh eqhVar, eem eemVar, int i) {
        this.f14491c = i;
        this.f14489a = eqhVar;
        this.f14490b = eemVar;
    }

    public /* synthetic */ ekr(eqh eqhVar, glk glkVar, int i, byte[] bArr, byte[] bArr2) {
        this.f14491c = i;
        this.f14490b = eqhVar;
        this.f14489a = glkVar;
    }

    public /* synthetic */ ekr(esl eslVar, ikw ikwVar, int i) {
        this.f14491c = i;
        this.f14490b = eslVar;
        this.f14489a = ikwVar;
    }

    public /* synthetic */ ekr(ety etyVar, kmq kmqVar, int i) {
        this.f14491c = i;
        this.f14490b = etyVar;
        this.f14489a = kmqVar;
    }

    public /* synthetic */ ekr(euf eufVar, kmq kmqVar, int i) {
        this.f14491c = i;
        this.f14490b = eufVar;
        this.f14489a = kmqVar;
    }

    public /* synthetic */ ekr(evg evgVar, Intent intent, int i) {
        this.f14491c = i;
        this.f14489a = evgVar;
        this.f14490b = intent;
    }

    public /* synthetic */ ekr(ewa ewaVar, nps npsVar, int i) {
        this.f14491c = i;
        this.f14490b = ewaVar;
        this.f14489a = npsVar;
    }

    public /* synthetic */ ekr(fan fanVar, ohb ohbVar, int i) {
        this.f14491c = i;
        this.f14490b = fanVar;
        this.f14489a = ohbVar;
    }

    public /* synthetic */ ekr(kpw kpwVar, kcc kccVar, int i) {
        this.f14491c = i;
        this.f14489a = kpwVar;
        this.f14490b = kccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mrf] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r0v6, types: [hze, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kcc] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v37, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [elw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [elw, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        switch (this.f14491c) {
            case 0:
                this.f14489a.apply(((eks) this.f14490b).f14495d.getPreview(2));
                return;
            case 1:
                Object obj = this.f14490b;
                ?? r1 = this.f14489a;
                eik eikVar = (eik) obj;
                eikVar.f14148c.f14152c.mo5711f();
                r1.mo3415bf(fnb.f22776b);
                eikVar.f14148c.f14155f.mo3415bf(true);
                return;
            case 2:
                ((iig) this.f14489a).get().f31066c.m4463d(this.f14490b, hzd.NONE);
                return;
            case 3:
                Object obj2 = this.f14490b;
                ?? r7 = this.f14489a;
                elv elvVar = (elv) obj2;
                r7.mo7508q(elvVar.f14685n, elvVar.f14679h, elvVar.f14680i, elvVar.f14681j, elvVar.f14682k);
                r7.mo7501j();
                return;
            case 4:
                Object obj3 = this.f14490b;
                ?? r2 = this.f14489a;
                synchronized (elv.f14672a) {
                    if (r2.equals(((elv) obj3).f14683l)) {
                        r2.mo7499h();
                    }
                    break;
                }
                return;
            case 5:
                Object obj4 = this.f14490b;
                Object obj5 = this.f14489a;
                synchronized (elv.f14672a) {
                    ((elv) obj4).f14675d.remove(obj5);
                    break;
                }
                return;
            case 6:
                Object obj6 = this.f14490b;
                ?? r3 = this.f14489a;
                synchronized (elv.f14672a) {
                    r3.run();
                    mrm mrmVarM7484f = ((elv) obj6).m7484f();
                    if (mrmVarM7484f.mo16813g()) {
                        ((elv) obj6).m7490l((elw) mrmVarM7484f.mo16809c());
                    } else {
                        ((elv) obj6).f14683l = null;
                    }
                    ((elv) obj6).f14678g = false;
                    break;
                }
                return;
            case 7:
                ((fba) this.f14490b).m8097e((ens) this.f14489a.get());
                return;
            case 8:
                Object obj7 = this.f14489a;
                Object obj8 = this.f14490b;
                ProcessGcService processGcService = (ProcessGcService) obj7;
                if (!processGcService.f6760c.m7571c()) {
                    processGcService.jobFinished((JobParameters) obj8, false);
                    processGcService.m4188a(2);
                    processGcService.f6761d.postDelayed(new elu(processGcService, 5), 500L);
                    return;
                } else {
                    ((nbe) ((nbe) ProcessGcService.f6758a.m17252c()).mo17276G((char) 1635)).mo17290o("Process is Alive! Rescheduling.");
                    processGcService.m4188a(3);
                    processGcService.jobFinished((JobParameters) obj8, true);
                    gtd.m9734o((Context) obj7);
                    return;
                }
            case 9:
                Object obj9 = this.f14489a;
                Object obj10 = this.f14490b;
                synchronized (((eoq) obj9).f14895e) {
                    ((eoq) obj9).f14892b.add(obj10);
                    break;
                }
                return;
            case 10:
                Object obj11 = this.f14489a;
                Object obj12 = this.f14490b;
                synchronized (((eoq) obj11).f14895e) {
                    ((eoq) obj11).f14892b.remove(obj12);
                    break;
                }
                return;
            case 11:
                ?? r0 = this.f14489a;
                ?? r4 = this.f14490b;
                r0.close();
                r4.mo13952a();
                return;
            case 12:
                Object obj13 = this.f14490b;
                this.f14489a.run();
                nbh nbhVar = epr.f15012a;
                ((epq) obj13).f15011i.f15016e.mo3415bf(true);
                return;
            case 13:
                Object obj14 = this.f14490b;
                Object obj15 = this.f14489a;
                eqf eqfVar = (eqf) obj14;
                if (eqfVar.f15125m) {
                    ((ntv) obj15).f44593d.run();
                    return;
                }
                eqfVar.f15118f.mo13961e("processPslFrame");
                eqfVar.f15115c.m7666h(eqfVar.f15116d, (ntv) obj15);
                eqfVar.f15118f.mo13962f();
                return;
            case 14:
                ((eqh) this.f14489a).m7685k((eem) this.f14490b, mqu.f41450a);
                return;
            case 15:
                Object obj16 = this.f14490b;
                glk glkVar = (glk) this.f14489a;
                glkVar.f25501b.mo9011d().mo3415bf(null);
                gyu gyuVarMo9902h = glkVar.f25502c.mo9902h();
                eqh eqhVar = (eqh) obj16;
                for (ept eptVar : eqhVar.f15138d.values()) {
                    if (gyuVarMo9902h.equals(eptVar.f15040b.f13675v.f25502c.mo9902h()) && (bitmap = eptVar.f15047i) != null) {
                        eqhVar.m7686l(eptVar, bitmap, false);
                        eptVar.f15047i = null;
                        return;
                    }
                }
                return;
            case 16:
                ((iqi) ((esl) this.f14490b).f15336R.get()).mo11607g(((ikw) this.f14489a).name());
                return;
            case 17:
                ((euf) this.f14490b).m7900y(true, (kmq) this.f14489a);
                return;
            case 18:
                ((ety) this.f14490b).f19894b.m7900y(false, (kmq) this.f14489a);
                return;
            case 19:
                ((evg) this.f14489a).f20392e.mo3700n((Intent) this.f14490b);
                return;
            default:
                Object obj17 = this.f14490b;
                Object obj18 = this.f14489a;
                ewa ewaVar = (ewa) obj17;
                synchronized (ewaVar.f20512O) {
                    ((ewa) obj17).f20512O.remove(obj18);
                    break;
                }
                ewaVar.f20513P = null;
                if (ewaVar.f20501D.mo16813g()) {
                    ((cld) ewaVar.f20501D.mo16809c()).mo3900d();
                }
                fmd fmdVar = ewaVar.f20517T;
                if (fmdVar != null) {
                    ewaVar.m7935w(((Boolean) fmdVar.m8568b().mo3831be()).booleanValue());
                }
                ewaVar.f20519V.m10148g();
                ewaVar.f20563u.m8582c();
                ewaVar.f20560r.mo11728I(true);
                ewaVar.f20560r.mo11765p();
                if (ewaVar.f20501D.mo16813g()) {
                    ((cld) ewaVar.f20501D.mo16809c()).mo3909m();
                }
                ewaVar.f20568z.mo11013l(true);
                ewaVar.f20547e.mo3693g().mo3716f();
                if (ewaVar.f20499B.mo16813g()) {
                    hms hmsVar = (hms) ewaVar.f20499B.mo16809c();
                    ewaVar.f20547e.mo3698l();
                    ewaVar.f20500C.m9469m();
                    hmsVar.m10470a();
                    return;
                }
                return;
        }
    }
}
