package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jm5 {

    /* JADX INFO: renamed from: a */
    public final int f45825a;

    /* JADX INFO: renamed from: b */
    public final String f45826b;

    /* JADX INFO: renamed from: c */
    public final List f45827c;

    public jm5(int i, String str, List list) {
        this.f45825a = i;
        this.f45826b = str;
        this.f45827c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm5)) {
            return false;
        }
        jm5 jm5Var = (jm5) obj;
        return this.f45825a == jm5Var.f45825a && this.f45826b.equals(jm5Var.f45826b) && this.f45827c.equals(jm5Var.f45827c);
    }

    public final int hashCode() {
        return this.f45827c.hashCode() + ux5.m22980c(Integer.hashCode(this.f45825a) * 31, this.f45826b, 31);
    }

    public final String toString() {
        return hn1.m13356f(ux5.m22995r(this.f45825a, "LqAnalyticsExperiment(experimentId=", ", experimentName=", this.f45826b, ", variants="), this.f45827c, ")");
    }
}
