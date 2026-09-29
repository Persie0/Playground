package p361ra;

import android.text.Layout;

/* JADX INFO: renamed from: ra.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8758f {

    /* JADX INFO: renamed from: a */
    public String f46453a;

    /* JADX INFO: renamed from: b */
    public int f46454b;

    /* JADX INFO: renamed from: c */
    public boolean f46455c;

    /* JADX INFO: renamed from: d */
    public int f46456d;

    /* JADX INFO: renamed from: e */
    public boolean f46457e;

    /* JADX INFO: renamed from: k */
    public float f46463k;

    /* JADX INFO: renamed from: l */
    public String f46464l;

    /* JADX INFO: renamed from: o */
    public Layout.Alignment f46467o;

    /* JADX INFO: renamed from: p */
    public Layout.Alignment f46468p;

    /* JADX INFO: renamed from: r */
    public C8754b f46470r;

    /* JADX INFO: renamed from: f */
    public int f46458f = -1;

    /* JADX INFO: renamed from: g */
    public int f46459g = -1;

    /* JADX INFO: renamed from: h */
    public int f46460h = -1;

    /* JADX INFO: renamed from: i */
    public int f46461i = -1;

    /* JADX INFO: renamed from: j */
    public int f46462j = -1;

    /* JADX INFO: renamed from: m */
    public int f46465m = -1;

    /* JADX INFO: renamed from: n */
    public int f46466n = -1;

    /* JADX INFO: renamed from: q */
    public int f46469q = -1;

    /* JADX INFO: renamed from: s */
    public float f46471s = Float.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final void m17010a(C8758f c8758f) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c8758f != null) {
            if (!this.f46455c && c8758f.f46455c) {
                this.f46454b = c8758f.f46454b;
                this.f46455c = true;
            }
            if (this.f46460h == -1) {
                this.f46460h = c8758f.f46460h;
            }
            if (this.f46461i == -1) {
                this.f46461i = c8758f.f46461i;
            }
            if (this.f46453a == null && (str = c8758f.f46453a) != null) {
                this.f46453a = str;
            }
            if (this.f46458f == -1) {
                this.f46458f = c8758f.f46458f;
            }
            if (this.f46459g == -1) {
                this.f46459g = c8758f.f46459g;
            }
            if (this.f46466n == -1) {
                this.f46466n = c8758f.f46466n;
            }
            if (this.f46467o == null && (alignment2 = c8758f.f46467o) != null) {
                this.f46467o = alignment2;
            }
            if (this.f46468p == null && (alignment = c8758f.f46468p) != null) {
                this.f46468p = alignment;
            }
            if (this.f46469q == -1) {
                this.f46469q = c8758f.f46469q;
            }
            if (this.f46462j == -1) {
                this.f46462j = c8758f.f46462j;
                this.f46463k = c8758f.f46463k;
            }
            if (this.f46470r == null) {
                this.f46470r = c8758f.f46470r;
            }
            if (this.f46471s == Float.MAX_VALUE) {
                this.f46471s = c8758f.f46471s;
            }
            if (!this.f46457e && c8758f.f46457e) {
                this.f46456d = c8758f.f46456d;
                this.f46457e = true;
            }
            if (this.f46465m != -1 || (i10 = c8758f.f46465m) == -1) {
                return;
            }
            this.f46465m = i10;
        }
    }
}
