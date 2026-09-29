package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hn6 {

    /* JADX INFO: renamed from: a */
    public final int f42659a;

    public hn6(int i) {
        this.f42659a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hn6) && this.f42659a == ((hn6) obj).f42659a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42659a);
    }

    public final String toString() {
        return ux5.m22989l("NotificationSettingsHeaderState(header=", this.f42659a, ")");
    }
}
