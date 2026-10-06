package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lqk implements msi {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f38965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f38966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f38967c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f38968d;

    public /* synthetic */ lqk(gbl gblVar, fvy fvyVar, boolean z, int i) {
        this.f38968d = i;
        this.f38967c = gblVar;
        this.f38966b = fvyVar;
        this.f38965a = z;
    }

    public /* synthetic */ lqk(lpj lpjVar, String str, boolean z, int i) {
        this.f38968d = i;
        this.f38966b = lpjVar;
        this.f38967c = str;
        this.f38965a = z;
    }

    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final Object mo6051a() {
        switch (this.f38968d) {
            case 0:
                return new lql((lpj) this.f38966b, (String) this.f38967c, this.f38965a);
            default:
                Object obj = this.f38967c;
                Object obj2 = this.f38966b;
                boolean z = this.f38965a;
                gbl gblVar = (gbl) obj;
                gbi gbiVar = (gbi) jvh.m13560h(gblVar.f24103a);
                int i = gblVar.f24107e.get();
                if (((fvy) obj2).m8842a() || i > 0) {
                    return jwr.m13637g(false);
                }
                return gbiVar == null ? jwr.m13637g(Boolean.valueOf(z)) : gbiVar.mo7626a();
        }
    }
}
