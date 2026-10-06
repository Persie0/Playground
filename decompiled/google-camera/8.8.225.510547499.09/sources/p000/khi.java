package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class khi implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f36018a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f36019b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f36020c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f36021d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f36022e;

    public /* synthetic */ khi(hwx hwxVar, boolean z, boolean z2, boolean z3, int i) {
        this.f36022e = i;
        this.f36021d = hwxVar;
        this.f36018a = z;
        this.f36019b = z2;
        this.f36020c = z3;
    }

    public /* synthetic */ khi(khj khjVar, boolean z, boolean z2, boolean z3, int i) {
        this.f36022e = i;
        this.f36021d = khjVar;
        this.f36018a = z;
        this.f36019b = z2;
        this.f36020c = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        throw r1;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.f36022e) {
            case 0:
                Object obj = this.f36021d;
                boolean z = this.f36018a;
                boolean z2 = this.f36019b;
                boolean z3 = this.f36020c;
                try {
                    khf khfVar = ((khj) obj).f36024b;
                    try {
                        kic kicVarM14322a = khfVar.f36014b.m14322a();
                        try {
                            kicVarM14322a.m14310d(z, z2, z3, true);
                            kicVarM14322a.close();
                            synchronized (khfVar) {
                                kir kirVarM14364c = kir.m14364c(khfVar.f36013a);
                                kis kisVar = khfVar.f36013a;
                                kirVarM14364c.f36200f = kisVar.f36206a;
                                kirVarM14364c.f36201g = kisVar.f36207b;
                                kirVarM14364c.f36202h = kisVar.f36208c;
                                if (z) {
                                    kirVarM14364c.f36200f = false;
                                }
                                if (z2) {
                                    kirVarM14364c.f36201g = false;
                                }
                                if (z3) {
                                    kirVarM14364c.f36202h = false;
                                }
                                khfVar.m14261c(kirVarM14364c.m14365d());
                                break;
                            }
                            return;
                        } catch (Throwable th) {
                            try {
                                kicVarM14322a.close();
                                break;
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        synchronized (khfVar) {
                            kir kirVarM14364c2 = kir.m14364c(khfVar.f36013a);
                            kis kisVar2 = khfVar.f36013a;
                            kirVarM14364c2.f36200f = kisVar2.f36206a;
                            kirVarM14364c2.f36201g = kisVar2.f36207b;
                            kirVarM14364c2.f36202h = kisVar2.f36208c;
                            if (z) {
                                kirVarM14364c2.f36200f = false;
                            }
                            if (z2) {
                                kirVarM14364c2.f36201g = false;
                            }
                            if (z3) {
                                kirVarM14364c2.f36202h = false;
                            }
                            khfVar.m14261c(kirVarM14364c2.m14365d());
                            throw th3;
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((khj) obj).f36023a.mo13941c("Interrupted when calling unlock3A.", e);
                    return;
                } catch (kec e2) {
                    ((khj) obj).f36023a.mo13941c("FrameServer was closed when calling unlock3A.", e2);
                    return;
                }
            default:
                Object obj2 = this.f36021d;
                hwx hwxVar = (hwx) obj2;
                hwxVar.m10789b(this.f36018a, hwxVar.f29756o, this.f36019b, this.f36020c);
                return;
        }
    }
}
