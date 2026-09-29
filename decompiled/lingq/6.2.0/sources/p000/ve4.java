package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ve4 implements ze4 {

    /* JADX INFO: renamed from: a */
    public final String f65271a;

    public ve4(String str) {
        this.f65271a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve4) && fa4.m11650l(this.f65271a, ((ve4) obj).f65271a);
    }

    public final int hashCode() {
        String str = this.f65271a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("AlreadyJoined(teamName=", this.f65271a, ")");
    }
}
