package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class iqa {

    /* JADX INFO: renamed from: a */
    public final int f44436a;

    /* JADX INFO: renamed from: b */
    public final int f44437b;

    /* JADX INFO: renamed from: c */
    public final double f44438c;

    /* JADX INFO: renamed from: d */
    public final double f44439d;

    public iqa(int i, int i2, double d, double d2) {
        this.f44436a = i;
        this.f44437b = i2;
        this.f44438c = d;
        this.f44439d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqa)) {
            return false;
        }
        iqa iqaVar = (iqa) obj;
        return this.f44436a == iqaVar.f44436a && this.f44437b == iqaVar.f44437b && Double.compare(this.f44438c, iqaVar.f44438c) == 0 && Double.compare(this.f44439d, iqaVar.f44439d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f44439d) + g9a.m12424a(this.f44438c, wq1.m24106b(this.f44437b, Integer.hashCode(this.f44436a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f44436a, this.f44437b, "TimedSentence(paragraphIndex=", ", sentenceIndex=", ", startTimestamp=");
        sbM22994q.append(this.f44438c);
        sbM22994q.append(", endTimestamp=");
        sbM22994q.append(this.f44439d);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
