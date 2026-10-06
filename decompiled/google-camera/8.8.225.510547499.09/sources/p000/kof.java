package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kof implements oju {

    /* JADX INFO: renamed from: n */
    private final /* synthetic */ int f36693n;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ kof f36692m = new kof(12);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ kof f36691l = new kof(11);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ kof f36690k = new kof(10);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ kof f36689j = new kof(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ kof f36688i = new kof(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ kof f36687h = new kof(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ kof f36686g = new kof(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ kof f36685f = new kof(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ kof f36684e = new kof(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ kof f36683d = new kof(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ kof f36682c = new kof(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ kof f36681b = new kof(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ kof f36680a = new kof(0);

    private /* synthetic */ kof(int i) {
        this.f36693n = i;
    }

    @Override // p000.oju
    public final Object get() {
        switch (this.f36693n) {
            case 0:
                return new kog();
            case 1:
                return new kob();
            case 2:
                lna lnaVarM15543c = ljq.m15543c();
                lnaVarM15543c.m15763d(false);
                return lnaVarM15543c.m15762c();
            case 3:
                lih lihVarM15392c = lii.m15392c();
                lihVarM15392c.m15385b(false);
                return lihVarM15392c.m15384a();
            case 4:
                lmv lmvVarM15745c = lmw.m15745c();
                lmvVarM15745c.m15737b(false);
                return lmvVarM15745c.m15736a();
            case 5:
                return new lld(null);
            case 6:
                return new lki(null);
            case 7:
                llw llwVar = new llw(mqu.f41450a);
                lku.m15670x(true, "only one of auto url auto sanitization and custom url sanitizer can be enabled.");
                return llwVar;
            case 8:
                lng lngVarM15767c = lnh.m15767c();
                lngVarM15767c.m15766b(false);
                return lngVarM15767c.m15765a();
            case 9:
                lna lnaVarM15764c = lnb.m15764c();
                lnaVarM15764c.m15761b(false);
                return lnaVarM15764c.m15760a();
            case 10:
                return new ljl(null);
            case 11:
                return new lne(new lku(), mqu.f41450a, null, null);
            default:
                llh llhVarM15707c = lli.m15707c();
                llhVarM15707c.m15705b(false);
                return llhVarM15707c.m15704a();
        }
    }
}
