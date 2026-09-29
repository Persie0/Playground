package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class lg5 extends og5 {

    /* JADX INFO: renamed from: a */
    public final sz1 f49631a = sz1.f61645b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lg5.class != obj.getClass()) {
            return false;
        }
        return this.f49631a.equals(((lg5) obj).f49631a);
    }

    public final int hashCode() {
        return this.f49631a.hashCode() + (lg5.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f49631a + '}';
    }
}
