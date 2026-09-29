package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class f42 extends tad {

    /* JADX INFO: renamed from: a */
    public final String f38388a;

    public f42(String str) {
        this.f38388a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f42) && this.f38388a.equals(((f42) obj).f38388a);
    }

    public final int hashCode() {
        return this.f38388a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("InviteFriends(language=", this.f38388a, ")");
    }
}
