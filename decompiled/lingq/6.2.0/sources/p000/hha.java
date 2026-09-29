package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hha implements iha {

    /* JADX INFO: renamed from: a */
    public final int f42385a;

    public hha(int i) {
        this.f42385a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hha) && this.f42385a == ((hha) obj).f42385a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42385a);
    }

    public final String toString() {
        return ux5.m22989l("Remove(bookId=", this.f42385a, ")");
    }
}
