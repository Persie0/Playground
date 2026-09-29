package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gn6 {

    /* JADX INFO: renamed from: a */
    public final String f41049a;

    public gn6(String str) {
        str.getClass();
        this.f41049a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn6) && fa4.m11650l(this.f41049a, ((gn6) obj).f41049a);
    }

    public final int hashCode() {
        return this.f41049a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("NotificationSettingsContentState(languageCode=", this.f41049a, ")");
    }
}
