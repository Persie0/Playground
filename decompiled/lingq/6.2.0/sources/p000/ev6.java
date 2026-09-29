package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ev6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final String f37937a;

    public ev6(String str) {
        str.getClass();
        this.f37937a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m11365a() {
        return this.f37937a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ev6) && fa4.m11650l(this.f37937a, ((ev6) obj).f37937a);
    }

    public final int hashCode() {
        return this.f37937a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("LifeEventSelected(lifeEvent=", this.f37937a, ")");
    }
}
