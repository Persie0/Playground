package p000;

import androidx.compose.foundation.lazy.layout.C0135d;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fw4 implements du4 {

    /* JADX INFO: renamed from: a */
    public final int f39785a;

    /* JADX INFO: renamed from: b */
    public final Object f39786b;

    /* JADX INFO: renamed from: c */
    public final List f39787c;

    /* JADX INFO: renamed from: d */
    public final boolean f39788d;

    /* JADX INFO: renamed from: e */
    public final int f39789e;

    /* JADX INFO: renamed from: f */
    public final int f39790f;

    /* JADX INFO: renamed from: g */
    public final int f39791g;

    /* JADX INFO: renamed from: h */
    public final int f39792h;

    /* JADX INFO: renamed from: i */
    public final Object f39793i;

    /* JADX INFO: renamed from: j */
    public final C0135d f39794j;

    /* JADX INFO: renamed from: k */
    public final long f39795k;

    /* JADX INFO: renamed from: l */
    public boolean f39796l = true;

    /* JADX INFO: renamed from: m */
    public final int f39797m;

    /* JADX INFO: renamed from: n */
    public final int f39798n;

    /* JADX INFO: renamed from: o */
    public final int f39799o;

    /* JADX INFO: renamed from: p */
    public final int f39800p;

    /* JADX INFO: renamed from: q */
    public final int f39801q;

    /* JADX INFO: renamed from: r */
    public int f39802r;

    /* JADX INFO: renamed from: s */
    public int f39803s;

    /* JADX INFO: renamed from: t */
    public int f39804t;

    /* JADX INFO: renamed from: u */
    public boolean f39805u;

    /* JADX INFO: renamed from: v */
    public final long f39806v;

    /* JADX INFO: renamed from: w */
    public long f39807w;

    public fw4(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, C0135d c0135d, long j) {
        int i7;
        int i8;
        this.f39785a = i;
        this.f39786b = obj;
        this.f39787c = list;
        this.f39788d = z;
        this.f39789e = i3;
        this.f39790f = i4;
        this.f39791g = i5;
        this.f39792h = i6;
        this.f39793i = obj2;
        this.f39794j = c0135d;
        this.f39795k = j;
        int i9 = 1;
        if (!list.isEmpty()) {
            l87 l87Var = (l87) list.get(0);
            i7 = z ? l87Var.f49302b : l87Var.f49301a;
            int size = list.size() - 1;
            if (1 <= size) {
                int i10 = 1;
                while (true) {
                    l87 l87Var2 = (l87) list.get(i10);
                    int i11 = this.f39788d ? l87Var2.f49302b : l87Var2.f49301a;
                    i7 = i11 > i7 ? i11 : i7;
                    if (i10 == size) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            i7 = 0;
        }
        this.f39797m = i7;
        List list2 = this.f39787c;
        if (!list2.isEmpty()) {
            l87 l87Var3 = (l87) list2.get(0);
            i8 = this.f39788d ? l87Var3.f49301a : l87Var3.f49302b;
            int size2 = list2.size() - 1;
            if (1 <= size2) {
                while (true) {
                    l87 l87Var4 = (l87) list2.get(i9);
                    int i12 = this.f39788d ? l87Var4.f49301a : l87Var4.f49302b;
                    i8 = i12 > i8 ? i12 : i8;
                    if (i9 == size2) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        } else {
            i8 = 0;
        }
        this.f39802r = Integer.MIN_VALUE;
        boolean z2 = this.f39788d;
        if (z2) {
            this.f39801q = i2;
            this.f39799o = this.f39797m;
            this.f39798n = i8;
            this.f39800p = 0;
        } else {
            this.f39801q = 0;
            this.f39799o = i8;
            this.f39798n = this.f39797m;
            this.f39800p = i2;
        }
        int i13 = this.f39797m;
        this.f39806v = z2 ? (((long) i13) & 4294967295L) | (((long) i8) << 32) : (((long) i13) << 32) | (((long) i8) & 4294967295L);
        this.f39807w = 0L;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: a */
    public final int mo10667a() {
        return this.f39800p;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: b */
    public final int mo10668b() {
        return this.f39790f;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: c */
    public final int mo10669c() {
        return this.f39799o;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: d */
    public final long mo10670d() {
        return this.f39795k;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: e */
    public final List mo10671e() {
        return this.f39787c;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: f */
    public final int mo10672f() {
        return this.f39801q;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: g */
    public final long mo10673g(int i) {
        return this.f39807w;
    }

    @Override // p000.du4
    public final int getIndex() {
        return this.f39785a;
    }

    @Override // p000.du4
    public final Object getKey() {
        return this.f39786b;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: h */
    public final int mo10674h() {
        return this.f39789e;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: i */
    public final int mo10675i() {
        return this.f39798n;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: j */
    public final void mo10676j() {
        this.f39805u = true;
    }

    @Override // p000.du4
    /* JADX INFO: renamed from: k */
    public final void mo10677k(int i, int i2, int i3, int i4) {
        if (this.f39788d) {
            i3 = i4;
        }
        m12236o(i, i2, i3);
    }

    /* JADX INFO: renamed from: l */
    public final int m12233l(long j) {
        return (int) (this.f39788d ? j & 4294967295L : j >> 32);
    }

    /* JADX INFO: renamed from: m */
    public final int m12234m() {
        long j = this.f39807w;
        return (int) (!this.f39788d ? j >> 32 : j & 4294967295L);
    }

    /* JADX INFO: renamed from: n */
    public final int m12235n() {
        int i;
        int i2;
        if (this.f39788d) {
            i = this.f39799o;
            i2 = this.f39801q;
        } else {
            i = this.f39798n;
            i2 = this.f39800p;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    /* JADX INFO: renamed from: o */
    public final void m12236o(int i, int i2, int i3) {
        long j;
        this.f39802r = i3;
        this.f39803s = -this.f39791g;
        this.f39804t = i3 + this.f39792h;
        if (this.f39788d) {
            j = (((long) i2) << 32) | (4294967295L & ((long) i));
        } else {
            j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        this.f39807w = j;
    }
}
