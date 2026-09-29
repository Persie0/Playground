package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class sx8 {

    /* JADX INFO: renamed from: a */
    public final String f61555a;

    /* JADX INFO: renamed from: b */
    public final int f61556b;

    /* JADX INFO: renamed from: c */
    public int f61557c;

    public sx8(String str, int i, int i2) {
        str.getClass();
        this.f61555a = str;
        this.f61556b = i;
        this.f61557c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx8)) {
            return false;
        }
        sx8 sx8Var = (sx8) obj;
        return fa4.m11650l(this.f61555a, sx8Var.f61555a) && this.f61556b == sx8Var.f61556b && this.f61557c == sx8Var.f61557c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f61557c) + wq1.m24106b(this.f61556b, this.f61555a.hashCode() * 31, 31);
    }

    public final String toString() {
        return wq1.m24123s(AbstractC3393o1.m17741p(this.f61556b, "SentenceWord(text=", this.f61555a, ", index=", ", viewIndex="), this.f61557c, ")");
    }
}
