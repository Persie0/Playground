package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckl implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5982a;

    /* JADX INFO: renamed from: b */
    private final oju f5983b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f5984c;

    public ckl(oju ojuVar, oju ojuVar2, int i) {
        this.f5984c = i;
        this.f5982a = ojuVar;
        this.f5983b = ojuVar2;
    }

    public ckl(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f5984c = i;
        this.f5983b = ojuVar;
        this.f5982a = ojuVar2;
    }

    public ckl(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f5984c = i;
        this.f5983b = ojuVar;
        this.f5982a = ojuVar2;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f5984c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return m3838a();
    }

    /* JADX INFO: renamed from: a */
    public final Executor m3838a() {
        switch (this.f5984c) {
            case 0:
                return ((grz) this.f5983b.get()).m9693b((Executor) this.f5982a.get());
            case 1:
                return new cke((ScheduledExecutorService) this.f5982a.get(), (nps) this.f5983b.get());
            case 2:
                return new dds(((kbm) this.f5983b).get(), (dhv) this.f5982a.get(), new jvi(jzn.m13824l("CameraFatalErrorTracker")));
            default:
                ckp ckpVar = (ckp) this.f5983b.get();
                grz grzVar = (grz) this.f5982a.get();
                jvm jvmVarM13583a = jvn.m13583a();
                jvmVarM13583a.f34893a = "FireflyProcMgr";
                jvmVarM13583a.m13581b(10);
                jvmVarM13583a.m13582c(1);
                jvi jviVar = new jvi(jzn.m13822j(jvmVarM13583a.m13580a()));
                ckpVar.getClass();
                jviVar.execute(new ghv(ckpVar, 12));
                return grzVar.m9693b(jviVar);
        }
    }
}
