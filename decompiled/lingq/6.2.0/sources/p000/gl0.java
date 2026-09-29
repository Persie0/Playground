package p000;

import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gl0 {

    /* JADX INFO: renamed from: n */
    public static final gl0 f40924n = new gl0(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: o */
    public static final gl0 f40925o;

    /* JADX INFO: renamed from: a */
    public final boolean f40926a;

    /* JADX INFO: renamed from: b */
    public final boolean f40927b;

    /* JADX INFO: renamed from: c */
    public final int f40928c;

    /* JADX INFO: renamed from: d */
    public final int f40929d;

    /* JADX INFO: renamed from: e */
    public final boolean f40930e;

    /* JADX INFO: renamed from: f */
    public final boolean f40931f;

    /* JADX INFO: renamed from: g */
    public final boolean f40932g;

    /* JADX INFO: renamed from: h */
    public final int f40933h;

    /* JADX INFO: renamed from: i */
    public final int f40934i;

    /* JADX INFO: renamed from: j */
    public final boolean f40935j;

    /* JADX INFO: renamed from: k */
    public final boolean f40936k;

    /* JADX INFO: renamed from: l */
    public final boolean f40937l;

    /* JADX INFO: renamed from: m */
    public String f40938m;

    static {
        iy5 iy5Var = cn2.f10315b;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long jM4890h = cn2.m4890h(AbstractC3352my.m17117e0(Integer.MAX_VALUE, durationUnit), durationUnit);
        if (jM4890h >= 0) {
            f40925o = new gl0(false, false, -1, -1, false, false, false, jM4890h <= 2147483647L ? (int) jM4890h : Integer.MAX_VALUE, -1, true, false, false, null);
        } else {
            C3386nv.m17624j(wq1.m24116l("maxStale < 0: ", jM4890h));
        }
    }

    public gl0(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f40926a = z;
        this.f40927b = z2;
        this.f40928c = i;
        this.f40929d = i2;
        this.f40930e = z3;
        this.f40931f = z4;
        this.f40932g = z5;
        this.f40933h = i3;
        this.f40934i = i4;
        this.f40935j = z6;
        this.f40936k = z7;
        this.f40937l = z8;
        this.f40938m = str;
    }

    public final String toString() {
        String str = this.f40938m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f40926a) {
            sb.append("no-cache, ");
        }
        if (this.f40927b) {
            sb.append("no-store, ");
        }
        int i = this.f40928c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f40929d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f40930e) {
            sb.append("private, ");
        }
        if (this.f40931f) {
            sb.append("public, ");
        }
        if (this.f40932g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f40933h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f40934i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f40935j) {
            sb.append("only-if-cached, ");
        }
        if (this.f40936k) {
            sb.append("no-transform, ");
        }
        if (this.f40937l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String string = sb.toString();
        this.f40938m = string;
        return string;
    }
}
