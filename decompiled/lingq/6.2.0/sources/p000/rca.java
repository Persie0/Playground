package p000;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class rca {

    /* JADX INFO: renamed from: a */
    public String f59075a;

    /* JADX INFO: renamed from: b */
    public int f59076b;

    /* JADX INFO: renamed from: c */
    public boolean f59077c;

    /* JADX INFO: renamed from: d */
    public int f59078d;

    /* JADX INFO: renamed from: e */
    public boolean f59079e;

    /* JADX INFO: renamed from: k */
    public float f59085k;

    /* JADX INFO: renamed from: l */
    public String f59086l;

    /* JADX INFO: renamed from: o */
    public Layout.Alignment f59089o;

    /* JADX INFO: renamed from: p */
    public Layout.Alignment f59090p;

    /* JADX INFO: renamed from: r */
    public bu9 f59092r;

    /* JADX INFO: renamed from: t */
    public String f59094t;

    /* JADX INFO: renamed from: u */
    public String f59095u;

    /* JADX INFO: renamed from: f */
    public int f59080f = -1;

    /* JADX INFO: renamed from: g */
    public int f59081g = -1;

    /* JADX INFO: renamed from: h */
    public int f59082h = -1;

    /* JADX INFO: renamed from: i */
    public int f59083i = -1;

    /* JADX INFO: renamed from: j */
    public int f59084j = -1;

    /* JADX INFO: renamed from: m */
    public int f59087m = -1;

    /* JADX INFO: renamed from: n */
    public int f59088n = -1;

    /* JADX INFO: renamed from: q */
    public int f59091q = -1;

    /* JADX INFO: renamed from: s */
    public float f59093s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final void m20579a(rca rcaVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (rcaVar != null) {
            if (!this.f59077c && rcaVar.f59077c) {
                this.f59076b = rcaVar.f59076b;
                this.f59077c = true;
            }
            if (this.f59082h == -1) {
                this.f59082h = rcaVar.f59082h;
            }
            if (this.f59083i == -1) {
                this.f59083i = rcaVar.f59083i;
            }
            if (this.f59075a == null && (str = rcaVar.f59075a) != null) {
                this.f59075a = str;
            }
            if (this.f59080f == -1) {
                this.f59080f = rcaVar.f59080f;
            }
            if (this.f59081g == -1) {
                this.f59081g = rcaVar.f59081g;
            }
            if (this.f59088n == -1) {
                this.f59088n = rcaVar.f59088n;
            }
            if (this.f59089o == null && (alignment2 = rcaVar.f59089o) != null) {
                this.f59089o = alignment2;
            }
            if (this.f59090p == null && (alignment = rcaVar.f59090p) != null) {
                this.f59090p = alignment;
            }
            if (this.f59091q == -1) {
                this.f59091q = rcaVar.f59091q;
            }
            if (this.f59084j == -1) {
                this.f59084j = rcaVar.f59084j;
                this.f59085k = rcaVar.f59085k;
            }
            if (this.f59092r == null) {
                this.f59092r = rcaVar.f59092r;
            }
            if (this.f59093s == Float.MAX_VALUE) {
                this.f59093s = rcaVar.f59093s;
            }
            if (this.f59094t == null) {
                this.f59094t = rcaVar.f59094t;
            }
            if (this.f59095u == null) {
                this.f59095u = rcaVar.f59095u;
            }
            if (!this.f59079e && rcaVar.f59079e) {
                this.f59078d = rcaVar.f59078d;
                this.f59079e = true;
            }
            if (this.f59087m != -1 || (i = rcaVar.f59087m) == -1) {
                return;
            }
            this.f59087m = i;
        }
    }
}
