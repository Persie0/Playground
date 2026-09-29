package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yr9 extends rr9 {

    /* JADX INFO: renamed from: c */
    public final Runnable f70352c;

    public yr9(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f70352c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f70352c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f70352c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(d32.m10016N(runnable));
        sb.append(", ");
        sb.append(this.f59742a);
        sb.append(", ");
        return ux5.m22992o(sb, this.f59743b ? "Blocking" : "Non-blocking", ']');
    }
}
