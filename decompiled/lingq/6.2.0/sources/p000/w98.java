package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class w98 extends cb8 {

    /* JADX INFO: renamed from: a */
    public final int f66547a;

    public w98(int i) {
        this.f66547a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w98) && this.f66547a == ((w98) obj).f66547a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66547a);
    }

    public final String toString() {
        return ux5.m22989l("OnCardStatusChanged(status=", this.f66547a, ")");
    }
}
