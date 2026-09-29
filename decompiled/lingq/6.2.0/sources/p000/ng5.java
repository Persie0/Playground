package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ng5 extends og5 {

    /* JADX INFO: renamed from: a */
    public final sz1 f52706a;

    public ng5(sz1 sz1Var) {
        this.f52706a = sz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ng5.class != obj.getClass()) {
            return false;
        }
        return this.f52706a.equals(((ng5) obj).f52706a);
    }

    public final int hashCode() {
        return this.f52706a.hashCode() + (ng5.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f52706a + '}';
    }
}
