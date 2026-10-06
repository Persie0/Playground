package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.camera.facedeblur.deeprestore.jni.DeepRestoreNative;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dev implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10750a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f10751b;

    public /* synthetic */ dev(dep depVar, int i) {
        this.f10751b = i;
        this.f10750a = depVar;
    }

    public /* synthetic */ dev(dex dexVar, int i) {
        this.f10751b = i;
        this.f10750a = dexVar;
    }

    public /* synthetic */ dev(dfb dfbVar, int i) {
        this.f10751b = i;
        this.f10750a = dfbVar;
    }

    public /* synthetic */ dev(dgb dgbVar, int i) {
        this.f10751b = i;
        this.f10750a = dgbVar;
    }

    public /* synthetic */ dev(dge dgeVar, int i) {
        this.f10751b = i;
        this.f10750a = dgeVar;
    }

    public /* synthetic */ dev(dgi dgiVar, int i) {
        this.f10751b = i;
        this.f10750a = dgiVar;
    }

    public /* synthetic */ dev(dgu dguVar, int i) {
        this.f10751b = i;
        this.f10750a = dguVar;
    }

    public /* synthetic */ dev(dgz dgzVar, int i) {
        this.f10751b = i;
        this.f10750a = dgzVar;
    }

    public /* synthetic */ dev(drl drlVar, int i) {
        this.f10751b = i;
        this.f10750a = drlVar;
    }

    public /* synthetic */ dev(dtc dtcVar, int i) {
        this.f10751b = i;
        this.f10750a = dtcVar;
    }

    public /* synthetic */ dev(eal ealVar, int i) {
        this.f10751b = i;
        this.f10750a = ealVar;
    }

    public /* synthetic */ dev(ebw ebwVar, int i) {
        this.f10751b = i;
        this.f10750a = ebwVar;
    }

    public /* synthetic */ dev(ExecutorService executorService, int i) {
        this.f10751b = i;
        this.f10750a = executorService;
    }

    public /* synthetic */ dev(ScheduledFuture scheduledFuture, int i) {
        this.f10751b = i;
        this.f10750a = scheduledFuture;
    }

    public /* synthetic */ dev(jww jwwVar, int i) {
        this.f10751b = i;
        this.f10750a = jwwVar;
    }

    public /* synthetic */ dev(lby lbyVar, int i) {
        this.f10751b = i;
        this.f10750a = lbyVar;
    }

    public /* synthetic */ dev(nps npsVar, int i) {
        this.f10751b = i;
        this.f10750a = npsVar;
    }

    public /* synthetic */ dev(oju ojuVar, int i) {
        this.f10751b = i;
        this.f10750a = ojuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kos] */
    /* JADX WARN: Type inference failed for: r0v11, types: [dgz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kos] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kos] */
    /* JADX WARN: Type inference failed for: r0v14, types: [dgz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kyx] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
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
        ScheduledFuture scheduledFuture = null;
        switch (this.f10751b) {
            case 0:
                Object obj = this.f10750a;
                synchronized (obj) {
                    ((dex) obj).f10754c = dex.f10752a;
                    ScheduledFuture scheduledFuture2 = ((dex) obj).f10755d;
                    if (scheduledFuture2 != null) {
                        ((dex) obj).f10755d = null;
                        scheduledFuture = scheduledFuture2;
                    }
                    break;
                }
                dex.m6028b(scheduledFuture);
                return;
            case 1:
                ((dep) this.f10750a).f10683b.mo5996b();
                return;
            case 2:
                ((dfb) this.f10750a).f10758a = null;
                return;
            case 3:
                this.f10750a.cancel(false);
                return;
            case 4:
                ((dge) this.f10750a).m6099b();
                return;
            case 5:
                ?? r0 = this.f10750a;
                ((dgb) r0).f10842c.mo9218h(r0);
                return;
            case 6:
                this.f10750a.mo6134b();
                return;
            case 7:
                ?? r1 = this.f10750a;
                ((dgi) r1).f10893f.mo9218h(r1);
                return;
            case 8:
                ?? r2 = this.f10750a;
                ((dgu) r2).f10976b.mo9218h(r2);
                return;
            case 9:
                this.f10750a.mo6134b();
                return;
            case 10:
                this.f10750a.cancel(false);
                return;
            case 11:
                this.f10750a.cancel(false);
                return;
            case 12:
                this.f10750a.cancel(false);
                return;
            case 13:
                this.f10750a.close();
                return;
            case 14:
                Object obj2 = this.f10750a;
                synchronized (obj2) {
                    if (((drl) obj2).f12403c.mo16813g()) {
                        DeepRestoreNative.releaseHandle(((Long) ((drl) obj2).f12403c.mo16809c()).longValue());
                    }
                    ((drl) obj2).f12403c = mqu.f41450a;
                    break;
                }
                return;
            case 15:
                ?? r3 = this.f10750a;
                mxk mxkVar = dsw.f12520a;
                ((bko) ((cvy) r3.get()).f9845b).m2630x();
                return;
            case 16:
                this.f10750a.shutdown();
                return;
            case 17:
                ((dtc) this.f10750a).m6717b();
                return;
            case 18:
                new Handler(Looper.getMainLooper()).postDelayed(new drs((eal) this.f10750a, 16), 20000L);
                return;
            case 19:
                this.f10750a.mo3415bf(Float.valueOf(-999.0f));
                return;
            default:
                ((ebw) this.f10750a).m7087a();
                return;
        }
    }
}
