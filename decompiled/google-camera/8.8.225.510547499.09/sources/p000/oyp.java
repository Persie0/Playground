package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyp extends oyn {

    /* JADX INFO: renamed from: a */
    public final Runnable f46848a;

    public oyp(Runnable runnable, long j, oyo oyoVar) {
        super(j, oyoVar);
        this.f46848a = runnable;
    }

    public final String toString() {
        return "Task[" + oqv.m18920a(this.f46848a) + "@" + oqv.m18921b(this.f46848a) + ", " + this.f46844g + ", " + this.f46845h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46848a.run();
    }
}
