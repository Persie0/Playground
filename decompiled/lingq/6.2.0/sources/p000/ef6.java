package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ef6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f37184a;

    public ef6(String str) {
        this.f37184a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m11095a() {
        return this.f37184a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef6) && fa4.m11650l(this.f37184a, ((ef6) obj).f37184a);
    }

    public final int hashCode() {
        String str = this.f37184a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("Vocabulary(filter=", this.f37184a, ")");
    }
}
