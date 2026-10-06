package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class fla implements fle {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f22448a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f22449b;

    public fla(fkx fkxVar, int i) {
        this.f22449b = i;
        this.f22448a = fkxVar;
    }

    public fla(flb flbVar, int i) {
        this.f22449b = i;
        this.f22448a = flbVar;
    }

    @Override // p000.fle
    /* JADX INFO: renamed from: a */
    public final void mo8368a(fkv fkvVar) {
        switch (this.f22449b) {
            case 0:
                ((flb) this.f22448a).m8539b();
                return;
            default:
                synchronized (this.f22448a) {
                    Object obj = this.f22448a;
                    ((fkx) obj).f22431d = true;
                    ((fkx) obj).f22432e = mrm.m16829i(fkvVar);
                    ((fkx) this.f22448a).m8532c();
                    break;
                }
                return;
        }
    }

    @Override // p000.fle
    /* JADX INFO: renamed from: b */
    public final void mo8369b(long j, fli fliVar) {
        switch (this.f22449b) {
            case 0:
                ((flb) this.f22448a).m8539b();
                return;
            default:
                synchronized (this.f22448a) {
                    Object obj = this.f22448a;
                    ((fkx) obj).f22429b = true;
                    ((fkx) obj).f22430c = mrm.m16829i(fliVar);
                    Object obj2 = this.f22448a;
                    ((fkx) obj2).f22433f = j;
                    ((fkx) obj2).m8532c();
                    break;
                }
                return;
        }
    }
}
