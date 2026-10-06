package p000;

import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jyk {

    /* JADX INFO: renamed from: b */
    public final jxp f35177b;

    /* JADX INFO: renamed from: j */
    public jyg f35185j;

    /* JADX INFO: renamed from: a */
    public final mrm f35176a = mqu.f41450a;

    /* JADX INFO: renamed from: k */
    private final boolean f35186k = false;

    /* JADX INFO: renamed from: c */
    public boolean f35178c = false;

    /* JADX INFO: renamed from: d */
    public final int f35179d = 5;

    /* JADX INFO: renamed from: e */
    public final int f35180e = 1;

    /* JADX INFO: renamed from: f */
    public final int f35181f = 65536;

    /* JADX INFO: renamed from: g */
    public final int f35182g = 2;

    /* JADX INFO: renamed from: h */
    public final int f35183h = 8;

    /* JADX INFO: renamed from: i */
    public final int f35184i = 32768;

    /* JADX INFO: renamed from: l */
    private final boolean f35187l = false;

    /* JADX INFO: renamed from: m */
    private final int f35188m = 3;

    /* JADX INFO: renamed from: n */
    private final int f35189n = 2;

    /* JADX INFO: renamed from: o */
    private final int f35190o = 192000;

    /* JADX INFO: renamed from: p */
    private final int f35191p = 48000;

    public jyk(jxp jxpVar) {
        this.f35177b = jxpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyk)) {
            return false;
        }
        jyk jykVar = (jyk) obj;
        if (this.f35178c == jykVar.f35178c) {
            int i = jykVar.f35179d;
            int i2 = jykVar.f35180e;
            int i3 = jykVar.f35181f;
            int i4 = jykVar.f35182g;
            int i5 = jykVar.f35183h;
            int i6 = jykVar.f35184i;
            boolean z = jykVar.f35187l;
            int i7 = jykVar.f35188m;
            int i8 = jykVar.f35189n;
            int i9 = jykVar.f35190o;
            int i10 = jykVar.f35191p;
            if (Objects.equals(this.f35176a, jykVar.f35176a) && Objects.equals(this.f35185j, jykVar.f35185j) && this.f35177b == jykVar.f35177b) {
                boolean z2 = jykVar.f35186k;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f35176a, this.f35185j, this.f35177b, Boolean.valueOf(this.f35178c), 5, 1, 65536, 2, 8, 32768, false, 3, 2, 192000, 48000, false);
    }
}
