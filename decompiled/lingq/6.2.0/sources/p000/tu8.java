package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class tu8 extends uu8 {

    /* JADX INFO: renamed from: a */
    public final b39 f62915a;

    public tu8(b39 b39Var) {
        this.f62915a = b39Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu8) && this.f62915a.equals(((tu8) obj).f62915a);
    }

    public final int hashCode() {
        return this.f62915a.hashCode();
    }

    public final String toString() {
        return "OnTopicSelected(topic=" + this.f62915a + ")";
    }
}
