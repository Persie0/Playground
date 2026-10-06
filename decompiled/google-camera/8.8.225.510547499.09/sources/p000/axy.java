package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axy extends C0139dr {

    /* JADX INFO: renamed from: a */
    public final axt f2698a = axt.f2689a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f2698a.equals(((axy) obj).f2698a);
    }

    public final int hashCode() {
        return (axy.class.getName().hashCode() * 31) + this.f2698a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f2698a + '}';
    }
}
