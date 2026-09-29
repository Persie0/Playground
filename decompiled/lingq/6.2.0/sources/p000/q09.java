package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class q09 extends g19 {

    /* JADX INFO: renamed from: a */
    public final String f57108a;

    public q09(String str) {
        str.getClass();
        this.f57108a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q09) && fa4.m11650l(this.f57108a, ((q09) obj).f57108a);
    }

    public final int hashCode() {
        return this.f57108a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnCustomGoalInputChanged(value=", this.f57108a, ")");
    }
}
