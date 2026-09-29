package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class s65 {

    /* JADX INFO: renamed from: a */
    public final vs3 f60407a;

    /* JADX INFO: renamed from: b */
    public final double f60408b;

    /* JADX INFO: renamed from: c */
    public final double f60409c;

    /* JADX INFO: renamed from: d */
    public final double f60410d;

    /* JADX INFO: renamed from: e */
    public final double f60411e;

    /* JADX INFO: renamed from: f */
    public final Integer f60412f;

    /* JADX INFO: renamed from: g */
    public final Integer f60413g;

    /* JADX INFO: renamed from: h */
    public final Integer f60414h;

    /* JADX INFO: renamed from: i */
    public final int f60415i;

    /* JADX INFO: renamed from: j */
    public final Double f60416j;

    /* JADX INFO: renamed from: k */
    public final Double f60417k;

    public s65(vs3 vs3Var, double d, double d2, double d3, double d4, Integer num, Integer num2, Integer num3, int i, Double d5, Double d6) {
        vs3Var.getClass();
        this.f60407a = vs3Var;
        this.f60408b = d;
        this.f60409c = d2;
        this.f60410d = d3;
        this.f60411e = d4;
        this.f60412f = num;
        this.f60413g = num2;
        this.f60414h = num3;
        this.f60415i = i;
        this.f60416j = d5;
        this.f60417k = d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s65)) {
            return false;
        }
        s65 s65Var = (s65) obj;
        return fa4.m11650l(this.f60407a, s65Var.f60407a) && Double.compare(this.f60408b, s65Var.f60408b) == 0 && Double.compare(this.f60409c, s65Var.f60409c) == 0 && Double.compare(this.f60410d, s65Var.f60410d) == 0 && Double.compare(this.f60411e, s65Var.f60411e) == 0 && fa4.m11650l(this.f60412f, s65Var.f60412f) && fa4.m11650l(this.f60413g, s65Var.f60413g) && fa4.m11650l(this.f60414h, s65Var.f60414h) && this.f60415i == s65Var.f60415i && fa4.m11650l(this.f60416j, s65Var.f60416j) && fa4.m11650l(this.f60417k, s65Var.f60417k);
    }

    public final int hashCode() {
        int iM12424a = g9a.m12424a(this.f60411e, g9a.m12424a(this.f60410d, g9a.m12424a(this.f60409c, g9a.m12424a(this.f60408b, this.f60407a.hashCode() * 31, 31), 31), 31), 31);
        Integer num = this.f60412f;
        int iHashCode = (iM12424a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f60413g;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f60414h;
        int iM24106b = wq1.m24106b(this.f60415i, (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31, 31);
        Double d = this.f60416j;
        int iHashCode3 = (iM24106b + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f60417k;
        return iHashCode3 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonStatsUiState(colorScheme=");
        sb.append(this.f60407a);
        sb.append(", readWords=");
        sb.append(this.f60408b);
        hn1.m13370t(sb, ", readTime=", this.f60409c, ", listeningTime=");
        sb.append(this.f60410d);
        hn1.m13370t(sb, ", listenTimes=", this.f60411e, ", lingqsCreated=");
        e65.m10883o(sb, this.f60412f, ", knownWords=", this.f60413g, ", coins=");
        sb.append(this.f60414h);
        sb.append(", activity=");
        sb.append(this.f60415i);
        sb.append(", studyTime=");
        sb.append(this.f60416j);
        sb.append(", wpm=");
        sb.append(this.f60417k);
        sb.append(")");
        return sb.toString();
    }
}
