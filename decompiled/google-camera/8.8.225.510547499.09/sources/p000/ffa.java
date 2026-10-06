package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ffa implements mrp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f21594a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f21595b;

    public /* synthetic */ ffa(long j, int i) {
        this.f21595b = i;
        this.f21594a = j;
    }

    @Override // p000.mrp
    /* JADX INFO: renamed from: a */
    public final boolean mo8324a(Object obj) {
        switch (this.f21595b) {
            case 0:
                long j = this.f21594a;
                kiq kiqVar = (kiq) obj;
                kfd kfdVarM14358b = kiqVar.m14358b();
                if (!kiqVar.m14362f() || kfdVarM14358b == null || kfdVarM14358b.f35811b <= j) {
                    return false;
                }
                key keyVarM14357a = kiqVar.m14357a();
                if (keyVarM14357a == null) {
                    ((nbe) ((nbe) ffe.f21606a.m17252c()).mo17276G(2171)).mo17292q("The frame at %d is null!", kfdVarM14358b.f35811b);
                    return false;
                }
                keyVarM14357a.close();
                return true;
            case 1:
                long j2 = this.f21594a;
                kfd kfdVarM14358b2 = ((kiq) obj).m14358b();
                return kfdVarM14358b2 != null && kfdVarM14358b2.f35811b == j2;
            default:
                long j3 = this.f21594a;
                kfd kfdVarM14358b3 = ((kiq) obj).m14358b();
                return kfdVarM14358b3 != null && kfdVarM14358b3.f35811b == j3;
        }
    }
}
