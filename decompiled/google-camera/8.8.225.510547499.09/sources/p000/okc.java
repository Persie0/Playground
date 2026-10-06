package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class okc implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f46188a;

    public okc(Throwable th) {
        this.f46188a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof okc) && ooc.m18737c(this.f46188a, ((okc) obj).f46188a);
    }

    public final int hashCode() {
        return this.f46188a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f46188a + ')';
    }
}
