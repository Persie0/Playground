package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class xt3 {

    /* JADX INFO: renamed from: a */
    public final long f68698a;

    /* JADX INFO: renamed from: b */
    public final double f68699b;

    /* JADX INFO: renamed from: c */
    public final double f68700c;

    /* JADX INFO: renamed from: d */
    public final double f68701d;

    public xt3(long j, double d, double d2, double d3) {
        this.f68698a = j;
        this.f68699b = d;
        this.f68700c = d2;
        this.f68701d = d3;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m24672a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("count", this.f68698a);
        jSONObject.put("min", this.f68699b);
        jSONObject.put("max", this.f68700c);
        jSONObject.put("sum", this.f68701d);
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public final wt3 m24673b() {
        long j = this.f68698a;
        return new wt3(j, this.f68699b, this.f68700c, j > 0 ? this.f68701d / j : 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt3)) {
            return false;
        }
        xt3 xt3Var = (xt3) obj;
        return this.f68698a == xt3Var.f68698a && Double.compare(this.f68699b, xt3Var.f68699b) == 0 && Double.compare(this.f68700c, xt3Var.f68700c) == 0 && Double.compare(this.f68701d, xt3Var.f68701d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f68701d) + g9a.m12424a(this.f68700c, g9a.m12424a(this.f68699b, Long.hashCode(this.f68698a) * 31, 31), 31);
    }

    public final String toString() {
        return "HistogramSnapshot(count=" + this.f68698a + ", min=" + this.f68699b + ", max=" + this.f68700c + ", sum=" + this.f68701d + ')';
    }
}
