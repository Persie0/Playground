package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jzc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bzc f46442a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bzc f46443b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f46444c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f46445d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ j0d f46446e;

    public jzc(j0d j0dVar, bzc bzcVar, bzc bzcVar2, long j, boolean z) {
        this.f46442a = bzcVar;
        this.f46443b = bzcVar2;
        this.f46444c = j;
        this.f46445d = z;
        this.f46446e = j0dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46446e.m14239J(this.f46442a, this.f46443b, this.f46444c, this.f46445d, null);
    }
}
