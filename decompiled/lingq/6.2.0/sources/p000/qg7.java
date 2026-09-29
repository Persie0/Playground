package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qg7 {

    /* JADX INFO: renamed from: a */
    public final int f57764a;

    public /* synthetic */ qg7(int i) {
        this.f57764a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qg7) {
            return this.f57764a == ((qg7) obj).f57764a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57764a);
    }

    public final String toString() {
        return wq1.m24114j("PointerKeyboardModifiers(packedValue=", this.f57764a, ')');
    }
}
