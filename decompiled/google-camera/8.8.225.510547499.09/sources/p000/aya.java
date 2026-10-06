package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aya extends C0139dr {

    /* JADX INFO: renamed from: a */
    public final axt f2704a;

    public aya() {
        this(axt.f2689a);
    }

    public aya(axt axtVar) {
        this.f2704a = axtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f2704a.equals(((aya) obj).f2704a);
    }

    public final int hashCode() {
        return (aya.class.getName().hashCode() * 31) + this.f2704a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f2704a + '}';
    }
}
