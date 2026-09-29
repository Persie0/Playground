package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ok1 {

    /* JADX INFO: renamed from: a */
    public final int f54490a;

    public ok1(int i) {
        this.f54490a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok1) && this.f54490a == ((ok1) obj).f54490a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54490a);
    }

    public final String toString() {
        return wq1.m24122r(new StringBuilder("ContainerInfo(layoutId="), this.f54490a, ')');
    }
}
