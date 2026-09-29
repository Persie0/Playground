package p000;

/* JADX INFO: loaded from: classes.dex */
public final class re1 {

    /* JADX INFO: renamed from: a */
    public final int f59153a;

    /* JADX INFO: renamed from: b */
    public final Integer f59154b;

    public re1(int i, w3d w3dVar, Integer num) {
        this.f59153a = i;
        this.f59154b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re1)) {
            return false;
        }
        re1 re1Var = (re1) obj;
        return this.f59153a == re1Var.f59153a && fa4.m11650l(null, null) && fa4.m11650l(this.f59154b, re1Var.f59154b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f59153a) * 31) + 0) * 31;
        Integer num = this.f59154b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f59153a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f59154b + ')';
    }
}
