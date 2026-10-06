package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evy implements hte {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ chw f20491a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f20492b;

    public evy(eus eusVar, int i) {
        this.f20492b = i;
        this.f20491a = eusVar;
    }

    public evy(ewa ewaVar, int i) {
        this.f20492b = i;
        this.f20491a = ewaVar;
    }

    @Override // p000.hte
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3803b() {
        int i = this.f20492b;
    }

    @Override // p000.hte
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean mo3804c() {
        int i = this.f20492b;
        return false;
    }

    @Override // p000.hte
    /* JADX INFO: renamed from: a */
    public final void mo3802a() {
        switch (this.f20492b) {
            case 0:
                ((ewa) this.f20491a).f20559q.m6561c();
                break;
            default:
                ((eus) this.f20491a).f20203u.m6561c();
                break;
        }
    }
}
