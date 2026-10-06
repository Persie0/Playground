package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fjs implements eaq {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f22296a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22297b;

    public /* synthetic */ fjs(enj enjVar, int i) {
        this.f22297b = i;
        this.f22296a = enjVar;
    }

    public /* synthetic */ fjs(fhq fhqVar, int i) {
        this.f22297b = i;
        this.f22296a = fhqVar;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [enj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [fhq, java.lang.Object] */
    @Override // p000.eaq
    /* JADX INFO: renamed from: a */
    public final void mo7004a(long j, float f, float f2, String str) {
        switch (this.f22297b) {
            case 0:
                this.f22296a.mo8447c(j, f, f2, str);
                break;
            default:
                this.f22296a.mo7561c(j, f, f2);
                break;
        }
    }
}
