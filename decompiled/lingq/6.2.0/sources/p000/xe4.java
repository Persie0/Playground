package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class xe4 implements ze4 {

    /* JADX INFO: renamed from: a */
    public final String f68127a;

    public xe4(String str) {
        this.f68127a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe4) && fa4.m11650l(this.f68127a, ((xe4) obj).f68127a);
    }

    public final int hashCode() {
        String str = this.f68127a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Joined(teamName=", this.f68127a, ")");
    }
}
