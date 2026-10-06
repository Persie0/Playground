package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kif implements kiy {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kig f36144a;

    public kif(kig kigVar) {
        this.f36144a = kigVar;
    }

    @Override // p000.kiy
    /* JADX INFO: renamed from: a */
    public final void mo14324a() {
        synchronized (kig.f36145a) {
            this.f36144a.f36149e = 1;
        }
    }

    @Override // p000.kiy
    /* JADX INFO: renamed from: b */
    public final void mo14325b() {
        boolean z;
        synchronized (kig.f36145a) {
            kig kigVar = this.f36144a;
            if (kigVar.f36149e == 2) {
                kigVar.f36149e = 3;
                z = true;
                kigVar.f36146b = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f36144a.m14328b();
        }
    }
}
