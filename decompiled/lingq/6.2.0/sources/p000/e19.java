package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class e19 extends g19 {

    /* JADX INFO: renamed from: a */
    public final String f36577a;

    public e19(String str) {
        this.f36577a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e19) && this.f36577a.equals(((e19) obj).f36577a);
    }

    public final int hashCode() {
        return this.f36577a.hashCode();
    }

    public final String toString() {
        return wq1.m24118n("OnTopicToggled(value=", this.f36577a, ")");
    }
}
