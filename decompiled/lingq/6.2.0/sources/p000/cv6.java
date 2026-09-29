package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class cv6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f34608a;

    public cv6(String str) {
        str.getClass();
        this.f34608a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m9911a() {
        return this.f34608a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cv6) && fa4.m11650l(this.f34608a, ((cv6) obj).f34608a);
    }

    public final int hashCode() {
        return this.f34608a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("LearningStyleSelected(style=", this.f34608a, ")");
    }
}
