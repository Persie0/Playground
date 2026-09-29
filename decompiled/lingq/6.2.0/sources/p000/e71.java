package p000;

/* JADX INFO: loaded from: classes.dex */
public final class e71 {

    /* JADX INFO: renamed from: a */
    public final int f36791a;

    /* JADX INFO: renamed from: b */
    public final int f36792b;

    public e71(int i, int i2) {
        this.f36791a = i;
        this.f36792b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e71)) {
            return false;
        }
        e71 e71Var = (e71) obj;
        return this.f36791a == e71Var.f36791a && this.f36792b == e71Var.f36792b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36792b) + (Integer.hashCode(this.f36791a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.f36791a);
        sb.append(", columnCount=");
        return wq1.m24122r(sb, this.f36792b, ')');
    }
}
