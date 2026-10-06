package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class orw extends opv {

    /* JADX INFO: renamed from: a */
    private final oni f46470a;

    public orw(oni oniVar) {
        this.f46470a = oniVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1803a(Object obj) {
        mo18869b((Throwable) obj);
        return oki.f46196a;
    }

    @Override // p000.opw
    /* JADX INFO: renamed from: b */
    public final void mo18869b(Throwable th) {
        this.f46470a.mo1803a(th);
    }

    public final String toString() {
        return "InvokeOnCancel[" + oqv.m18920a(this.f46470a) + "@" + oqv.m18921b(this) + "]";
    }
}
