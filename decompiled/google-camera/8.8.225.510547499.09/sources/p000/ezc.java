package p000;

import android.hardware.SensorEventListener;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ezc implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f21030a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f21031b;

    public /* synthetic */ ezc(AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f21031b = i;
        this.f21030a = ambientController;
    }

    public /* synthetic */ ezc(ezi eziVar, int i) {
        this.f21031b = i;
        this.f21030a = eziVar;
    }

    public /* synthetic */ ezc(ezk ezkVar, int i) {
        this.f21031b = i;
        this.f21030a = ezkVar;
    }

    public /* synthetic */ ezc(ffo ffoVar, int i) {
        this.f21031b = i;
        this.f21030a = ffoVar;
    }

    public /* synthetic */ ezc(fhj fhjVar, int i) {
        this.f21031b = i;
        this.f21030a = fhjVar;
    }

    public /* synthetic */ ezc(fhq fhqVar, int i) {
        this.f21031b = i;
        this.f21030a = fhqVar;
    }

    public /* synthetic */ ezc(fkj fkjVar, int i) {
        this.f21031b = i;
        this.f21030a = fkjVar;
    }

    public /* synthetic */ ezc(frx frxVar, int i) {
        this.f21031b = i;
        this.f21030a = frxVar;
    }

    public /* synthetic */ ezc(fvy fvyVar, int i) {
        this.f21031b = i;
        this.f21030a = fvyVar;
    }

    public /* synthetic */ ezc(gfa gfaVar, int i) {
        this.f21031b = i;
        this.f21030a = gfaVar;
    }

    public /* synthetic */ ezc(gmn gmnVar, int i) {
        this.f21031b = i;
        this.f21030a = gmnVar;
    }

    public /* synthetic */ ezc(hrg hrgVar, int i) {
        this.f21031b = i;
        this.f21030a = hrgVar;
    }

    public /* synthetic */ ezc(ScheduledExecutorService scheduledExecutorService, int i) {
        this.f21031b = i;
        this.f21030a = scheduledExecutorService;
    }

    public /* synthetic */ ezc(kon konVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f21031b = i;
        this.f21030a = konVar;
    }

    public /* synthetic */ ezc(kpw kpwVar, int i) {
        this.f21031b = i;
        this.f21030a = kpwVar;
    }

    public /* synthetic */ ezc(lea leaVar, int i) {
        this.f21031b = i;
        this.f21030a = leaVar;
    }

    public /* synthetic */ ezc(ljf ljfVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f21031b = i;
        this.f21030a = ljfVar;
    }

    public /* synthetic */ ezc(nps npsVar, int i) {
        this.f21031b = i;
        this.f21030a = npsVar;
    }

    public /* synthetic */ ezc(oju ojuVar, int i) {
        this.f21031b = i;
        this.f21030a = ojuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v27, types: [fhq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.hardware.SensorEventListener, java.lang.Object, kos] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r0v44, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r0v7, types: [elw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [elx, java.lang.Object] */
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
        boolean z;
        switch (this.f21031b) {
            case 0:
                ((ezk) this.f21030a).f21093d = null;
                return;
            case 1:
                ((ezi) this.f21030a).mo3950a();
                return;
            case 2:
                ljf ljfVar = (ljf) this.f21030a;
                ljfVar.f38375g.mo7485g(ljfVar.f38373e);
                return;
            case 3:
                Object obj = this.f21030a;
                fhj fhjVar = (fhj) obj;
                synchronized (fhjVar.f22003d) {
                    z = !((fhj) obj).f22004e;
                    if (z) {
                        ((fhj) obj).f22004e = true;
                        for (fhi fhiVar : new ArrayList(((fhj) obj).f22005f)) {
                            if (!fhiVar.f21990b.m17184m()) {
                                fhiVar.mo8369b(((Long) fhiVar.f21990b.m17180i()).longValue() + 3000000, fli.COOKIE_CUTTER_SHUTTING_DOWN);
                            }
                        }
                    }
                    break;
                }
                if (z) {
                    fhjVar.f22001b.close();
                    if (fhjVar.f22002c.mo16813g()) {
                        ((fhh) fhjVar.f22002c.mo16809c()).close();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ffo) this.f21030a).f21709b.close();
                return;
            case 5:
                ((AmbientModeSupport.AmbientController) this.f21030a).m1655e();
                return;
            case 6:
                ((dyf) this.f21030a.get()).m6921j("microvideo-metadata");
                return;
            case 7:
                this.f21030a.mo8450f();
                return;
            case 8:
                ?? r0 = this.f21030a;
                synchronized (r0) {
                    ((fkj) r0).f22375a.unregisterListener((SensorEventListener) r0);
                    ((fkj) r0).f22378d.m14649c(r0);
                    break;
                }
                return;
            case 9:
                ((hrg) this.f21030a).mo7498g();
                return;
            case 10:
                ((lea) this.f21030a).close();
                return;
            case 11:
                frx frxVar = (frx) this.f21030a;
                frxVar.f23384h.post(new fnx(frxVar, 11));
                return;
            case 12:
                this.f21030a.cancel(true);
                return;
            case 13:
                this.f21030a.shutdown();
                return;
            case 14:
                this.f21030a.shutdownNow();
                return;
            case 15:
                Object obj2 = this.f21030a;
                synchronized (((fvy) obj2).f23727c) {
                    npu npuVar = ((fvy) obj2).f23728d;
                    if (npuVar != null) {
                        npuVar.shutdown();
                    }
                    ((fvy) obj2).f23729e = true;
                    break;
                }
                return;
            case 16:
                Object obj3 = this.f21030a;
                synchronized (((fvy) obj3).f23727c) {
                    npu npuVar2 = ((fvy) obj3).f23728d;
                    if (npuVar2 != null) {
                        npuVar2.shutdownNow();
                    }
                    ((fvy) obj3).f23728d = null;
                    ((fvy) obj3).f23729e = true;
                    break;
                }
                return;
            case 17:
                this.f21030a.mo9126l();
                return;
            case 18:
                ((gmn) this.f21030a).m9524c();
                return;
            case 19:
                this.f21030a.close();
                return;
            default:
                ((kon) this.f21030a).f36702b = null;
                return;
        }
    }
}
