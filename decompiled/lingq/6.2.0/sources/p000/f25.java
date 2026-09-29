package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class f25 implements j25 {

    /* JADX INFO: renamed from: a */
    public final String f38307a;

    public f25(String str) {
        str.getClass();
        this.f38307a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f25) && fa4.m11650l(this.f38307a, ((f25) obj).f38307a);
    }

    public final int hashCode() {
        return this.f38307a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("LessonNotAvailableForUser(message=", this.f38307a, ")");
    }
}
