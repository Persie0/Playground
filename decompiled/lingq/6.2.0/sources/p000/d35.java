package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class d35 {

    /* JADX INFO: renamed from: a */
    public final int f34902a;

    /* JADX INFO: renamed from: b */
    public final int f34903b;

    /* JADX INFO: renamed from: c */
    public final int f34904c;

    /* JADX INFO: renamed from: d */
    public final int f34905d;

    /* JADX INFO: renamed from: e */
    public final int f34906e;

    /* JADX INFO: renamed from: f */
    public final boolean f34907f;

    /* JADX INFO: renamed from: g */
    public final boolean f34908g;

    public d35(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.f34902a = i;
        this.f34903b = i2;
        this.f34904c = i3;
        this.f34905d = i4;
        this.f34906e = i5;
        this.f34907f = z;
        this.f34908g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d35)) {
            return false;
        }
        d35 d35Var = (d35) obj;
        return this.f34902a == d35Var.f34902a && this.f34903b == d35Var.f34903b && this.f34904c == d35Var.f34904c && this.f34905d == d35Var.f34905d && this.f34906e == d35Var.f34906e && this.f34907f == d35Var.f34907f && this.f34908g == d35Var.f34908g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34908g) + g9a.m12428e(wq1.m24106b(this.f34906e, wq1.m24106b(this.f34905d, wq1.m24106b(this.f34904c, wq1.m24106b(this.f34903b, Integer.hashCode(this.f34902a) * 31, 31), 31), 31), 31), 31, this.f34907f);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f34902a, this.f34903b, "LessonInfoCounters(newWordsCount=", ", lingqsCount=", ", knownWordsCount=");
        hn1.m13360j(this.f34904c, this.f34905d, ", totalWordsCount=", ", uniqueWordsCount=", sbM22994q);
        hn1.m13368r(sbM22994q, this.f34906e, ", isLiked=", this.f34907f, ", isSaved=");
        return AbstractC3393o1.m17740o(sbM22994q, this.f34908g, ")");
    }
}
