package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class o45 implements q45 {

    /* JADX INFO: renamed from: a */
    public final int f53824a;

    public o45(int i) {
        this.f53824a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o45) && this.f53824a == ((o45) obj).f53824a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53824a);
    }

    public final String toString() {
        return ux5.m22989l("Save(lessonId=", this.f53824a, ")");
    }
}
