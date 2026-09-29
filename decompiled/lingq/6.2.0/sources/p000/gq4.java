package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class gq4 {

    /* JADX INFO: renamed from: a */
    public final int f41185a;

    public gq4(int i) {
        this.f41185a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq4) && this.f41185a == ((gq4) obj).f41185a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41185a);
    }

    public final String toString() {
        return wq1.m24122r(new StringBuilder("LayoutInfo(layoutId="), this.f41185a, ')');
    }
}
