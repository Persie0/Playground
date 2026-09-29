package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class er1 extends jr1 {

    /* JADX INFO: renamed from: a */
    public final int f37740a;

    public er1(int i) {
        this.f37740a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er1) && this.f37740a == ((er1) obj).f37740a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37740a);
    }

    public final String toString() {
        return ux5.m22989l("Done(chatId=", this.f37740a, ")");
    }
}
