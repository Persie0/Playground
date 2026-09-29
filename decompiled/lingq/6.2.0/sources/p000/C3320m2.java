package p000;

/* JADX INFO: renamed from: m2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3320m2 {

    /* JADX INFO: renamed from: a */
    public final String f50441a;

    public C3320m2(String str) {
        str.getClass();
        this.f50441a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3320m2) && fa4.m11650l(this.f50441a, ((C3320m2) obj).f50441a);
    }

    public final int hashCode() {
        return this.f50441a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnAccentSelected(accent=", this.f50441a, ")");
    }
}
