package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import p021j$.time.Clock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbk implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f10382a;

    public dbk(int i) {
        this.f10382a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final Executor m5874a() {
        return new jvi(dnr.m6444c());
    }

    /* JADX INFO: renamed from: b */
    public static final npv m5875b() {
        npv npvVarM14955A = kxk.m14955A(dnr.m6444c());
        npvVarM14955A.getClass();
        return npvVarM14955A;
    }

    /* JADX INFO: renamed from: c */
    public static Clock m5876c() {
        Clock clockSystemUTC = Clock.systemUTC();
        clockSystemUTC.getClass();
        return clockSystemUTC;
    }

    /* JADX INFO: renamed from: d */
    public static dni m5877d() {
        return new dni();
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f10382a) {
            case 0:
                return new djm((byte[]) null);
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return new ddx();
            case 4:
                ExecutorService executorServiceM13824l = jzn.m13824l("cvk-ex");
                executorServiceM13824l.getClass();
                return executorServiceM13824l;
            case 5:
                return new dfj();
            case 6:
                return new ejr(null);
            case 7:
                return new dge();
            case 8:
                return new dkj().mo6311a("Generic");
            case 9:
                return new dkp();
            case 10:
                return new dlj((byte[]) null);
            case 11:
                return new dlg();
            case 12:
                throw null;
            case 13:
                throw null;
            case 14:
                throw null;
            case 15:
                return new kbw();
            case 16:
                return m5877d();
            case 17:
                return new Semaphore(1, true);
            case 18:
                return kdo.m13999a(true);
            case 19:
                dnr.m6442a();
                return dnr.class;
            default:
                return new dny();
        }
    }
}
