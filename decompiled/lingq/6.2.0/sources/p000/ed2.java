package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ed2 extends kd2 {

    /* JADX INFO: renamed from: a */
    public final md2 f37040a;

    public ed2(md2 md2Var) {
        this.f37040a = md2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed2) && this.f37040a.equals(((ed2) obj).f37040a);
    }

    public final int hashCode() {
        return this.f37040a.hashCode();
    }

    public final String toString() {
        return "AppendEvent(event=" + this.f37040a + ')';
    }
}
