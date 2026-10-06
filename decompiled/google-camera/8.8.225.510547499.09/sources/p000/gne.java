package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gne implements gyq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f25697a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f25698b;

    public gne(jvb jvbVar, int i) {
        this.f25698b = i;
        this.f25697a = jvbVar;
    }

    public gne(jwf jwfVar, int i) {
        this.f25698b = i;
        this.f25697a = jwfVar;
    }

    @Override // p000.gyq
    /* JADX INFO: renamed from: b */
    public final void mo9547b() {
        switch (this.f25698b) {
            case 0:
                ((jwf) this.f25697a).mo3415bf(false);
                break;
        }
    }

    @Override // p000.gyq
    /* JADX INFO: renamed from: c */
    public final void mo9548c() {
        switch (this.f25698b) {
            case 0:
                ((jwf) this.f25697a).mo3415bf(true);
                break;
        }
    }

    @Override // p000.gyq
    /* JADX INFO: renamed from: a */
    public final void mo9546a() {
        switch (this.f25698b) {
            case 0:
                ((jwf) this.f25697a).mo3415bf(false);
                break;
            default:
                ((jvb) this.f25697a).close();
                break;
        }
    }
}
