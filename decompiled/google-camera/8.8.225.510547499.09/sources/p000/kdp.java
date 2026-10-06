package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdp {

    /* JADX INFO: renamed from: a */
    public static final kdo f35660a = kdo.m13999a(false);

    /* JADX INFO: renamed from: b */
    public final Object f35661b = new Object();

    /* JADX INFO: renamed from: c */
    public final kbo f35662c;

    /* JADX INFO: renamed from: d */
    public jvb f35663d;

    /* JADX INFO: renamed from: e */
    private final ScheduledExecutorService f35664e;

    /* JADX INFO: renamed from: f */
    private final kdo f35665f;

    /* JADX INFO: renamed from: g */
    private jut f35666g;

    public kdp(ScheduledExecutorService scheduledExecutorService, kbo kboVar, mrm mrmVar) {
        this.f35664e = scheduledExecutorService;
        kbo kboVarMo6314a = kboVar.mo6314a("CamDeviceWakelock");
        this.f35662c = kboVarMo6314a;
        kdo kdoVar = (kdo) mrmVar.mo16811e(f35660a);
        this.f35665f = kdoVar;
        jvb jvbVar = new jvb();
        this.f35663d = jvbVar;
        this.f35666g = m14000c(jvbVar);
        kboVarMo6314a.mo13940b("Configured: ".concat(kdoVar.toString()));
    }

    /* JADX INFO: renamed from: a */
    public final jvb m14001a() {
        jvb jvbVarM13536c;
        synchronized (this.f35661b) {
            jvbVarM13536c = this.f35663d.m13536c();
        }
        return jvbVarM13536c;
    }

    /* JADX INFO: renamed from: b */
    public final kba m14002b(String str) {
        fjl fjlVar;
        synchronized (this.f35661b) {
            kba kbaVarM13527a = this.f35666g.m13527a();
            if (kbaVarM13527a == null) {
                this.f35662c.mo13944f("Failed to acquire token requested by:" + str + "; creating new wakelock");
                jvb jvbVar = new jvb();
                this.f35663d = jvbVar;
                jut jutVarM14000c = m14000c(jvbVar);
                this.f35666g = jutVarM14000c;
                kbaVarM13527a = jutVarM14000c.m13527a();
                kbaVarM13527a.getClass();
            }
            this.f35662c.mo13940b("Acquired by " + str);
            fjlVar = new fjl(this, str, kbaVarM13527a, 3);
        }
        return fjlVar;
    }

    /* JADX INFO: renamed from: c */
    private final jut m14000c(jvb jvbVar) {
        synchronized (this.f35661b) {
            if (this.f35665f.f35659a) {
                return new jut(jvbVar, not.INSTANCE, null);
            }
            return new jut(jvbVar, not.INSTANCE, new jvt(new jvs(this.f35664e, 1000L, TimeUnit.MILLISECONDS)));
        }
    }
}
