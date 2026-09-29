package p000;

import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class tp4 {

    /* JADX INFO: renamed from: a */
    public final List f62671a;

    /* JADX INFO: renamed from: b */
    public final gl5 f62672b;

    /* JADX INFO: renamed from: c */
    public final String f62673c;

    /* JADX INFO: renamed from: d */
    public final long f62674d;

    /* JADX INFO: renamed from: e */
    public final Layer$LayerType f62675e;

    /* JADX INFO: renamed from: f */
    public final long f62676f;

    /* JADX INFO: renamed from: g */
    public final String f62677g;

    /* JADX INFO: renamed from: h */
    public final List f62678h;

    /* JADX INFO: renamed from: i */
    public final C0852cm f62679i;

    /* JADX INFO: renamed from: j */
    public final int f62680j;

    /* JADX INFO: renamed from: k */
    public final int f62681k;

    /* JADX INFO: renamed from: l */
    public final int f62682l;

    /* JADX INFO: renamed from: m */
    public final float f62683m;

    /* JADX INFO: renamed from: n */
    public final float f62684n;

    /* JADX INFO: renamed from: o */
    public final float f62685o;

    /* JADX INFO: renamed from: p */
    public final float f62686p;

    /* JADX INFO: renamed from: q */
    public final C3726wl f62687q;

    /* JADX INFO: renamed from: r */
    public final C3156jq f62688r;

    /* JADX INFO: renamed from: s */
    public final C3763xl f62689s;

    /* JADX INFO: renamed from: t */
    public final List f62690t;

    /* JADX INFO: renamed from: u */
    public final Layer$MatteType f62691u;

    /* JADX INFO: renamed from: v */
    public final boolean f62692v;

    /* JADX INFO: renamed from: w */
    public final hi8 f62693w;

    /* JADX INFO: renamed from: x */
    public final ca1 f62694x;

    /* JADX INFO: renamed from: y */
    public final LBlendMode f62695y;

    public tp4(List list, gl5 gl5Var, String str, long j, Layer$LayerType layer$LayerType, long j2, String str2, List list2, C0852cm c0852cm, int i, int i2, int i3, float f, float f2, float f3, float f4, C3726wl c3726wl, C3156jq c3156jq, List list3, Layer$MatteType layer$MatteType, C3763xl c3763xl, boolean z, hi8 hi8Var, ca1 ca1Var, LBlendMode lBlendMode) {
        this.f62671a = list;
        this.f62672b = gl5Var;
        this.f62673c = str;
        this.f62674d = j;
        this.f62675e = layer$LayerType;
        this.f62676f = j2;
        this.f62677g = str2;
        this.f62678h = list2;
        this.f62679i = c0852cm;
        this.f62680j = i;
        this.f62681k = i2;
        this.f62682l = i3;
        this.f62683m = f;
        this.f62684n = f2;
        this.f62685o = f3;
        this.f62686p = f4;
        this.f62687q = c3726wl;
        this.f62688r = c3156jq;
        this.f62690t = list3;
        this.f62691u = layer$MatteType;
        this.f62689s = c3763xl;
        this.f62692v = z;
        this.f62693w = hi8Var;
        this.f62694x = ca1Var;
        this.f62695y = lBlendMode;
    }

    /* JADX INFO: renamed from: a */
    public final String m22263a(String str) {
        int i;
        StringBuilder sbM22997t = ux5.m22997t(str);
        sbM22997t.append(this.f62673c);
        sbM22997t.append("\n");
        long j = this.f62676f;
        gl5 gl5Var = this.f62672b;
        tp4 tp4Var = (tp4) gl5Var.f40965i.m22176b(j);
        if (tp4Var != null) {
            sbM22997t.append("\t\tParents: ");
            sbM22997t.append(tp4Var.f62673c);
            for (tp4 tp4Var2 = (tp4) gl5Var.f40965i.m22176b(tp4Var.f62676f); tp4Var2 != null; tp4Var2 = (tp4) gl5Var.f40965i.m22176b(tp4Var2.f62676f)) {
                sbM22997t.append("->");
                sbM22997t.append(tp4Var2.f62673c);
            }
            sbM22997t.append(str);
            sbM22997t.append("\n");
        }
        List list = this.f62678h;
        if (!list.isEmpty()) {
            sbM22997t.append(str);
            sbM22997t.append("\tMasks: ");
            sbM22997t.append(list.size());
            sbM22997t.append("\n");
        }
        int i2 = this.f62680j;
        if (i2 != 0 && (i = this.f62681k) != 0) {
            sbM22997t.append(str);
            sbM22997t.append("\tBackground: ");
            sbM22997t.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f62682l)));
        }
        List list2 = this.f62671a;
        if (!list2.isEmpty()) {
            sbM22997t.append(str);
            sbM22997t.append("\tShapes:\n");
            for (Object obj : list2) {
                sbM22997t.append(str);
                sbM22997t.append("\t\t");
                sbM22997t.append(obj);
                sbM22997t.append("\n");
            }
        }
        return sbM22997t.toString();
    }

    public final String toString() {
        return m22263a("");
    }
}
