package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ba1 {

    /* JADX INFO: renamed from: a */
    public final int f8203a;

    /* JADX INFO: renamed from: b */
    public int f8204b;

    /* JADX INFO: renamed from: c */
    public int f8205c;

    /* JADX INFO: renamed from: d */
    public int f8206d;

    /* JADX INFO: renamed from: e */
    public int f8207e;

    /* JADX INFO: renamed from: f */
    public int f8208f;

    /* JADX INFO: renamed from: g */
    public int f8209g;

    /* JADX INFO: renamed from: h */
    public int f8210h;

    /* JADX INFO: renamed from: i */
    public int f8211i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ca1 f8212j;

    public ba1(ca1 ca1Var, int i, int i2) {
        this.f8212j = ca1Var;
        this.f8203a = i;
        this.f8204b = i2;
        m3501a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3501a() {
        ca1 ca1Var = this.f8212j;
        int[] iArr = (int[]) ca1Var.f9781a;
        int[] iArr2 = (int[]) ca1Var.f9782b;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = this.f8203a; i8 <= this.f8204b; i8++) {
            int i9 = iArr[i8];
            i4 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i7) {
                i7 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i2) {
                i2 = i11;
            }
            if (i11 < i5) {
                i5 = i11;
            }
            if (i12 > i3) {
                i3 = i12;
            }
            if (i12 < i6) {
                i6 = i12;
            }
        }
        this.f8206d = i;
        this.f8207e = i7;
        this.f8208f = i5;
        this.f8209g = i2;
        this.f8210h = i6;
        this.f8211i = i3;
        this.f8205c = i4;
    }

    /* JADX INFO: renamed from: b */
    public final int m3502b() {
        return ((this.f8211i - this.f8210h) + 1) * ((this.f8209g - this.f8208f) + 1) * ((this.f8207e - this.f8206d) + 1);
    }
}
