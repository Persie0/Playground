package p000;

import androidx.wear.ambient.AmbientModeSupport;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cft implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5520a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5521b;

    public /* synthetic */ cft(AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5521b = i;
        this.f5520a = ambientController;
    }

    public /* synthetic */ cft(cby cbyVar, int i) {
        this.f5521b = i;
        this.f5520a = cbyVar;
    }

    public /* synthetic */ cft(cfv cfvVar, int i) {
        this.f5521b = i;
        this.f5520a = cfvVar;
    }

    public /* synthetic */ cft(cgm cgmVar, int i) {
        this.f5521b = i;
        this.f5520a = cgmVar;
    }

    public /* synthetic */ cft(ckw ckwVar, int i) {
        this.f5521b = i;
        this.f5520a = ckwVar;
    }

    public /* synthetic */ cft(cmp cmpVar, int i) {
        this.f5521b = i;
        this.f5520a = cmpVar;
    }

    public /* synthetic */ cft(cpj cpjVar, int i) {
        this.f5521b = i;
        this.f5520a = cpjVar;
    }

    public /* synthetic */ cft(cra craVar, int i) {
        this.f5521b = i;
        this.f5520a = craVar;
    }

    public /* synthetic */ cft(cwc cwcVar, int i) {
        this.f5521b = i;
        this.f5520a = cwcVar;
    }

    public /* synthetic */ cft(czp czpVar, int i) {
        this.f5521b = i;
        this.f5520a = czpVar;
    }

    public /* synthetic */ cft(dav davVar, int i) {
        this.f5521b = i;
        this.f5520a = davVar;
    }

    public /* synthetic */ cft(den denVar, int i) {
        this.f5521b = i;
        this.f5520a = denVar;
    }

    public /* synthetic */ cft(dmy dmyVar, int i, byte[] bArr) {
        this.f5521b = i;
        this.f5520a = dmyVar;
    }

    public /* synthetic */ cft(fek fekVar, int i) {
        this.f5521b = i;
        this.f5520a = fekVar;
    }

    public /* synthetic */ cft(Future future, int i) {
        this.f5521b = i;
        this.f5520a = future;
    }

    public /* synthetic */ cft(ScheduledFuture scheduledFuture, int i) {
        this.f5521b = i;
        this.f5520a = scheduledFuture;
    }

    public /* synthetic */ cft(kfc kfcVar, int i) {
        this.f5521b = i;
        this.f5520a = kfcVar;
    }

    public /* synthetic */ cft(lby lbyVar, int i) {
        this.f5521b = i;
        this.f5520a = lbyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v20, types: [hjn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [gyi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kyx] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kfc] */
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
    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f5521b) {
            case 0:
                ((cfv) this.f5520a).f5528f = null;
                return;
            case 1:
                ((hrx) ((cby) this.f5520a).f4987c.mo16809c()).mo10672h(hrw.FACE_TRACKING);
                return;
            case 2:
                ((dmy) this.f5520a).m6418f();
                return;
            case 3:
                ((cgm) this.f5520a).m3647j();
                return;
            case 4:
                this.f5520a.cancel(false);
                return;
            case 5:
                Object obj = this.f5520a;
                ckw ckwVar = (ckw) obj;
                ckwVar.m3880k();
                ckwVar.m3886q(false);
                ckwVar.m3885p(false);
                ckwVar.m3878i(false, true);
                ckwVar.f6057p.m4482c();
                synchronized (obj) {
                    ((ckw) obj).f6063v = false;
                    break;
                }
                return;
            case 6:
                ((ckw) this.f5520a).f6061t.close();
                return;
            case 7:
                ckw ckwVar2 = (ckw) this.f5520a;
                ckwVar2.f6055n.mo10836z(ckwVar2.f6065x);
                return;
            case 8:
                this.f5520a.mo5712g();
                return;
            case 9:
                ?? r0 = this.f5520a;
                ((cmp) r0).f6262c.m9973h(r0);
                return;
            case 10:
                cpj cpjVar = (cpj) this.f5520a;
                cpjVar.f8600l.m7598b(cpjVar.f8601m);
                return;
            case 11:
                ((cra) this.f5520a).m5391c();
                return;
            case 12:
                this.f5520a.cancel(false);
                return;
            case 13:
                this.f5520a.cancel(false);
                return;
            case 14:
                this.f5520a.close();
                return;
            case 15:
                cwc cwcVar = (cwc) this.f5520a;
                jwc.m13621a(cwcVar.f9863d, cwcVar.f9861b, "OneCameraLifetime");
                return;
            case 16:
                ((AmbientModeSupport.AmbientController) this.f5520a).m1655e();
                return;
            case 17:
                Object obj2 = this.f5520a;
                synchronized (((czp) obj2).f10125b) {
                    ExecutorService executorService = ((czp) obj2).f10126c;
                    if (executorService != null) {
                        executorService.shutdown();
                        ((czp) obj2).f10126c = null;
                    }
                    break;
                }
                return;
            case 18:
                this.f5520a.close();
                return;
            case 19:
                dav davVar = (dav) this.f5520a;
                davVar.f10330k.mo9128n(davVar.f10331l);
                return;
            default:
                ((den) this.f5520a).f10662c = den.f10659a;
                return;
        }
    }
}
