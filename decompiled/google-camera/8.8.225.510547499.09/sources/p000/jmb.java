package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jmb implements mrp {

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f34349d;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jmb f34348c = new jmb(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ jmb f34347b = new jmb(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ jmb f34346a = new jmb(0);

    private /* synthetic */ jmb(int i) {
        this.f34349d = i;
    }

    @Override // p000.mrp
    /* JADX INFO: renamed from: a */
    public final boolean mo8324a(Object obj) {
        switch (this.f34349d) {
            case 0:
                pbn pbnVar = (pbn) obj;
                return pbnVar.m19308d() && !"Fallback-Cronet-Provider".equals(pbnVar.m19306a());
            case 1:
                return ((kiq) obj).m14361e();
            default:
                return ksh.m14809o((mom) obj, "http://ns.adobe.com/xmp/extension/\u0000");
        }
    }
}
