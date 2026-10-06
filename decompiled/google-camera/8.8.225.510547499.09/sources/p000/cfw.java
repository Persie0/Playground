package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfw extends jxd {

    /* JADX INFO: renamed from: a */
    public final String f5543a;

    /* JADX INFO: renamed from: b */
    private final dhv f5544b;

    public cfw(String str, jww jwwVar, dhv dhvVar) {
        super(jwwVar);
        this.f5543a = str;
        this.f5544b = dhvVar;
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3609b(Object obj) {
        dhv dhvVar = this.f5544b;
        dhx dhxVar = dhf.f11040a;
        dhvVar.mo6178f();
        cga cgaVar = new cga();
        for (String str : ((String) obj).split("\\|")) {
            try {
                cgaVar.m3617c(Float.parseFloat(str));
            } catch (NumberFormatException e) {
            }
        }
        return cgaVar;
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: c */
    protected final /* bridge */ /* synthetic */ Object mo3610c(Object obj) {
        cga cgaVar = (cga) obj;
        dhv dhvVar = this.f5544b;
        dhx dhxVar = dhf.f11040a;
        dhvVar.mo6178f();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cgaVar.m3616b(); i++) {
            sb.append(cgaVar.m3615a(i));
            sb.append("|");
        }
        return sb.toString();
    }
}
