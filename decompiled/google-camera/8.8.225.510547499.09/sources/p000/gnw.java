package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gnw implements ecy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f25816a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f25817b;

    public /* synthetic */ gnw(gni gniVar, int i) {
        this.f25817b = i;
        this.f25816a = gniVar;
    }

    public /* synthetic */ gnw(gnx gnxVar, int i) {
        this.f25817b = i;
        this.f25816a = gnxVar;
    }

    @Override // p000.ecy
    /* JADX INFO: renamed from: a */
    public final void mo7052a(eem eemVar, int i, long j, kpp kppVar) {
        switch (this.f25817b) {
            case 0:
                ((gnx) this.f25816a).mo7052a(eemVar, i, j, kppVar);
                break;
            default:
                ((gni) this.f25816a).mo7052a(eemVar, i, j, kppVar);
                break;
        }
    }
}
