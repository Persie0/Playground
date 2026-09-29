package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bj7 implements cj7 {

    /* JADX INFO: renamed from: a */
    public final String f8612a;

    public bj7(String str) {
        this.f8612a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m3786a() {
        return this.f8612a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj7) && fa4.m11650l(this.f8612a, ((bj7) obj).f8612a);
    }

    public final int hashCode() {
        String str = this.f8612a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Loaded(voiceName=", this.f8612a, ")");
    }
}
