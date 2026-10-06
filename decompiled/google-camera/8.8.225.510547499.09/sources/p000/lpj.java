package p000;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpj {

    /* JADX INFO: renamed from: a */
    public static final Object f38889a = new Object();

    /* JADX INFO: renamed from: b */
    public static Context f38890b = null;

    /* JADX INFO: renamed from: d */
    private static volatile lpj f38891d = null;

    /* JADX INFO: renamed from: e */
    private static volatile lpj f38892e = null;

    /* JADX INFO: renamed from: f */
    private static final msi f38893f = lku.m15663q(ffw.f21765k);

    /* JADX INFO: renamed from: c */
    public final Context f38894c;

    /* JADX INFO: renamed from: g */
    private final msi f38895g;

    /* JADX INFO: renamed from: h */
    private final msi f38896h;

    /* JADX INFO: renamed from: i */
    private final mrm f38897i;

    /* JADX INFO: renamed from: j */
    private final msi f38898j;

    public lpj(Context context) {
        msi msiVar = f38893f;
        msi msiVarM15663q = lku.m15663q(new dfg(context, 20));
        mrm mrmVarM16829i = mrm.m16829i(new lqq(msiVar));
        msi msiVarM15663q2 = lku.m15663q(new lpm(context, 1));
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        msiVar.getClass();
        msiVarM15663q.getClass();
        msiVarM15663q2.getClass();
        this.f38894c = applicationContext;
        this.f38895g = lku.m15663q(msiVar);
        this.f38896h = lku.m15663q(msiVarM15663q);
        this.f38897i = mrmVarM16829i;
        this.f38898j = lku.m15663q(msiVarM15663q2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static lpj m15824a(Context context) {
        lpi lpiVar;
        lpj lpjVar = f38891d;
        if (lpjVar == null) {
            synchronized (f38889a) {
                lpjVar = f38891d;
                if (lpjVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    try {
                        Object applicationContext2 = applicationContext.getApplicationContext();
                        if (!(applicationContext2 instanceof ohd)) {
                            throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(String.valueOf(applicationContext2.getClass()))));
                        }
                        try {
                            lpiVar = (lpi) lpi.class.cast(((ohd) applicationContext2).m18483a());
                            mrm mrmVarM15823a = mqu.f41450a;
                            if (lpiVar != null) {
                                mrmVarM15823a = lpiVar.m15823a();
                            } else if (applicationContext instanceof lpi) {
                                mrmVarM15823a = ((lpi) applicationContext).m15823a();
                            }
                            lpj lpjVar2 = mrmVarM15823a.mo16813g() ? (lpj) mrmVarM15823a.mo16809c() : new lpj(applicationContext);
                            f38891d = lpjVar2;
                            lpjVar = lpjVar2;
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e);
                        }
                    } catch (IllegalStateException e2) {
                        lpiVar = null;
                    }
                }
            }
        }
        return lpjVar;
    }

    /* JADX INFO: renamed from: c */
    public static void m15825c() {
        lpl.m15830a();
        if (f38890b == null && lpl.f38899a == null) {
            lpl.f38899a = new lpk();
        }
    }

    /* JADX INFO: renamed from: b */
    public final npv m15826b() {
        return (npv) this.f38895g.mo6051a();
    }

    /* JADX INFO: renamed from: d */
    public final lqq m15827d() {
        return (lqq) ((mrq) this.f38897i).f41482a;
    }

    /* JADX INFO: renamed from: e */
    public final liv m15828e() {
        return (liv) this.f38896h.mo6051a();
    }

    /* JADX INFO: renamed from: f */
    public final C1058va m15829f() {
        return (C1058va) this.f38898j.mo6051a();
    }
}
