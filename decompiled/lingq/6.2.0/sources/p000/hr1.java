package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hr1 extends jr1 {

    /* JADX INFO: renamed from: a */
    public final int f42820a;

    public hr1(int i) {
        this.f42820a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hr1) && this.f42820a == ((hr1) obj).f42820a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42820a);
    }

    public final String toString() {
        return ux5.m22989l("Started(chatId=", this.f42820a, ")");
    }
}
