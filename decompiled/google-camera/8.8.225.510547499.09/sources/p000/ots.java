package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ots extends ott {

    /* JADX INFO: renamed from: a */
    public final Throwable f46544a;

    public ots(Throwable th) {
        this.f46544a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ots) && ooc.m18737c(this.f46544a, ((ots) obj).f46544a);
    }

    public final int hashCode() {
        Throwable th = this.f46544a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p000.ott
    public final String toString() {
        return "Closed(" + this.f46544a + ")";
    }
}
