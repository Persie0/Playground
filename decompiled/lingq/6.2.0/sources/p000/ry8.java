package p000;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class ry8 {
    public static final qy8 Companion = new qy8();

    /* JADX INFO: renamed from: a */
    public final Boolean f60044a;

    /* JADX INFO: renamed from: b */
    public final Double f60045b;

    /* JADX INFO: renamed from: c */
    public final Integer f60046c;

    /* JADX INFO: renamed from: d */
    public final Integer f60047d;

    /* JADX INFO: renamed from: e */
    public final Long f60048e;

    public /* synthetic */ ry8(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            n3c.m17204b(i, 31, py8.f56999a.getDescriptor());
            throw null;
        }
        this.f60044a = bool;
        this.f60045b = d;
        this.f60046c = num;
        this.f60047d = num2;
        this.f60048e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry8)) {
            return false;
        }
        ry8 ry8Var = (ry8) obj;
        return fa4.m11650l(this.f60044a, ry8Var.f60044a) && fa4.m11650l(this.f60045b, ry8Var.f60045b) && fa4.m11650l(this.f60046c, ry8Var.f60046c) && fa4.m11650l(this.f60047d, ry8Var.f60047d) && fa4.m11650l(this.f60048e, ry8Var.f60048e);
    }

    public final int hashCode() {
        Boolean bool = this.f60044a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f60045b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.f60046c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f60047d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f60048e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f60044a + ", sessionSamplingRate=" + this.f60045b + ", sessionTimeoutSeconds=" + this.f60046c + ", cacheDurationSeconds=" + this.f60047d + ", cacheUpdatedTimeSeconds=" + this.f60048e + ')';
    }

    public ry8(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.f60044a = bool;
        this.f60045b = d;
        this.f60046c = num;
        this.f60047d = num2;
        this.f60048e = l;
    }
}
