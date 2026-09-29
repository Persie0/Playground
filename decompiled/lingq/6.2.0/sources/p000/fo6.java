package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class fo6 {

    /* JADX INFO: renamed from: a */
    public final qo6 f39386a;

    public fo6(qo6 qo6Var) {
        qo6Var.getClass();
        this.f39386a = qo6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fo6) && fa4.m11650l(this.f39386a, ((fo6) obj).f39386a);
    }

    public final int hashCode() {
        return this.f39386a.hashCode();
    }

    public final String toString() {
        return "NotificationsScreenState(uiState=" + this.f39386a + ")";
    }
}
