package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zu6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f72189a;

    public zu6(String str) {
        str.getClass();
        this.f72189a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m25792a() {
        return this.f72189a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu6) && fa4.m11650l(this.f72189a, ((zu6) obj).f72189a);
    }

    public final int hashCode() {
        return this.f72189a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("FamiliaritySelected(familiarity=", this.f72189a, ")");
    }
}
