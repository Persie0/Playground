package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcj {

    /* JADX INFO: renamed from: a */
    public final String f2946a;

    /* JADX INFO: renamed from: b */
    public final int f2947b;

    public bcj(String str, int i) {
        str.getClass();
        this.f2946a = str;
        this.f2947b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcj)) {
            return false;
        }
        bcj bcjVar = (bcj) obj;
        return ooc.m18737c(this.f2946a, bcjVar.f2946a) && this.f2947b == bcjVar.f2947b;
    }

    public final int hashCode() {
        return (this.f2946a.hashCode() * 31) + this.f2947b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f2946a + ", generation=" + this.f2947b + ')';
    }
}
