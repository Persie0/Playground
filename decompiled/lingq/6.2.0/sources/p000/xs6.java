package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class xs6 {

    /* JADX INFO: renamed from: a */
    public final String f68650a = cx6.f34682a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xs6) && fa4.m11650l(this.f68650a, ((xs6) obj).f68650a);
    }

    public final int hashCode() {
        return this.f68650a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnboardingAchieveState(languageCode=", this.f68650a, ")");
    }
}
