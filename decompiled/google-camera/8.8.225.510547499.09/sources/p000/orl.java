package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class orl extends orm {

    /* JADX INFO: renamed from: a */
    private final Runnable f46457a;

    public orl(long j, Runnable runnable) {
        super(j);
        this.f46457a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46457a.run();
    }

    @Override // p000.orm
    public final String toString() {
        String string = super.toString();
        Runnable runnable = this.f46457a;
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(runnable);
        return string.concat(runnable.toString());
    }
}
