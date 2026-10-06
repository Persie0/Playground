package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oky {

    /* JADX INFO: renamed from: a */
    public final int f46218a;

    /* JADX INFO: renamed from: b */
    public final Object f46219b;

    public oky(int i, Object obj) {
        this.f46218a = i;
        this.f46219b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oky)) {
            return false;
        }
        oky okyVar = (oky) obj;
        return this.f46218a == okyVar.f46218a && ooc.m18737c(this.f46219b, okyVar.f46219b);
    }

    public final int hashCode() {
        int i = this.f46218a * 31;
        Object obj = this.f46219b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f46218a + ", value=" + this.f46219b + ')';
    }
}
