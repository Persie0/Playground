package p000;

import androidx.media3.common.C0713b;
import com.google.common.collect.AbstractC1104t;
import com.google.common.collect.ImmutableList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class h92 extends g92 {

    /* JADX INFO: renamed from: H */
    public final int f42015H;

    /* JADX INFO: renamed from: I */
    public final int f42016I;

    /* JADX INFO: renamed from: J */
    public final int f42017J;

    /* JADX INFO: renamed from: K */
    public final int f42018K;

    /* JADX INFO: renamed from: L */
    public final boolean f42019L;

    /* JADX INFO: renamed from: M */
    public final int f42020M;

    /* JADX INFO: renamed from: N */
    public final boolean f42021N;

    /* JADX INFO: renamed from: O */
    public final int f42022O;

    /* JADX INFO: renamed from: P */
    public final boolean f42023P;

    /* JADX INFO: renamed from: Q */
    public final boolean f42024Q;

    /* JADX INFO: renamed from: R */
    public final int f42025R;

    /* JADX INFO: renamed from: e */
    public final boolean f42026e;

    /* JADX INFO: renamed from: f */
    public final d92 f42027f;

    /* JADX INFO: renamed from: g */
    public final boolean f42028g;

    /* JADX INFO: renamed from: h */
    public final boolean f42029h;

    /* JADX INFO: renamed from: i */
    public final boolean f42030i;

    /* JADX INFO: renamed from: j */
    public final int f42031j;

    /* JADX INFO: renamed from: k */
    public final int f42032k;

    /* JADX INFO: renamed from: l */
    public final int f42033l;

    /* JADX WARN: Code duplicated, block: B:124:0x0176  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    public h92(int i, j8a j8aVar, int i2, d92 d92Var, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iM13729g;
        int i6;
        int i7;
        C0713b c0713b;
        int i8;
        int i9;
        int i10;
        C0713b c0713b2;
        int i11;
        int i12;
        int i13;
        super(i, j8aVar, i2);
        this.f42027f = d92Var;
        boolean z4 = d92Var.f35204x;
        ImmutableList immutableList = d92Var.f60527i;
        ImmutableList immutableList2 = d92Var.f60529k;
        int i14 = z4 ? 24 : 16;
        int i15 = 0;
        this.f42021N = false;
        if (!z || (((i11 = (c0713b2 = this.f40418d).f6413v) != -1 && i11 > d92Var.f60519a) || ((i12 = c0713b2.f6414w) != -1 && i12 > d92Var.f60520b))) {
            z2 = false;
        } else {
            float f = c0713b2.f6417z;
            if ((f == -1.0f || f <= d92Var.f60521c) && ((i13 = c0713b2.f6401j) == -1 || i13 <= d92Var.f60522d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f42026e = z2;
        if (!z || (((i8 = (c0713b = this.f40418d).f6413v) != -1 && i8 < 0) || ((i9 = c0713b.f6414w) != -1 && i9 < 0))) {
            z3 = false;
        } else {
            float f2 = c0713b.f6417z;
            if ((f2 == -1.0f || f2 >= 0.0f) && ((i10 = c0713b.f6401j) == -1 || i10 >= 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f42028g = z3;
        this.f42029h = y90.m24989n(i3, false);
        C0713b c0713b3 = this.f40418d;
        float f3 = c0713b3.f6417z;
        this.f42030i = f3 != -1.0f && f3 >= 10.0f;
        this.f42031j = c0713b3.f6401j;
        int i16 = c0713b3.f6413v;
        this.f42032k = (i16 == -1 || (i7 = c0713b3.f6414w) == -1) ? -1 : i16 * i7;
        int i17 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i17 >= immutableList2.size()) {
                iM13729g = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iM13729g = i92.m13729g(this.f40418d, (String) immutableList2.get(i17), false);
                if (iM13729g > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f42015H = i17;
        this.f42016I = iM13729g;
        int i18 = this.f40418d.f6397f;
        AbstractC1104t abstractC1104t = i92.f43726k;
        this.f42017J = (i18 == 0 || i18 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i19 = this.f40418d.f6397f;
        this.f42019L = i19 == 0 || (i19 & 1) != 0;
        this.f42020M = i92.m13729g(this.f40418d, str, i92.m13730i(str) == null);
        for (int i20 = 0; i20 < immutableList.size(); i20++) {
            String str2 = this.f40418d.f6406o;
            if (str2 != null && str2.equals(immutableList.get(i20))) {
                i5 = i20;
                break;
            }
        }
        this.f42033l = i5;
        this.f42018K = i92.m13723a(this.f40418d, d92Var.f60528j);
        this.f42023P = (i3 & 384) == 128;
        this.f42024Q = (i3 & 64) == 64;
        C0713b c0713b4 = this.f40418d;
        String str3 = c0713b4.f6406o;
        if (str3 != null) {
            i6 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.f42025R = i6;
        boolean z5 = this.f42026e;
        d92 d92Var2 = this.f42027f;
        if ((c0713b4.f6397f & 16384) == 0 && y90.m24989n(i3, d92Var2.f35199B) && (z5 || d92Var2.f35203w)) {
            i15 = (y90.m24989n(i3, false) && this.f42028g && z5 && c0713b4.f6401j != -1 && (i14 & i3) != 0) ? 2 : 1;
        }
        this.f42022O = i15;
    }

    /* JADX INFO: renamed from: c */
    public static int m13146c(h92 h92Var, h92 h92Var2) {
        tb1 tb1VarMo20565b = tb1.f62090a.mo20566c(h92Var.f42029h, h92Var2.f42029h).mo20565b(Integer.valueOf(h92Var.f42015H), Integer.valueOf(h92Var2.f42015H), AbstractC1104t.m6350c().mo6319e()).mo20564a(h92Var.f42016I, h92Var2.f42016I).mo20564a(h92Var.f42017J, h92Var2.f42017J).mo20565b(Integer.valueOf(h92Var.f42018K), Integer.valueOf(h92Var2.f42018K), AbstractC1104t.m6350c().mo6319e()).mo20566c(h92Var.f42019L, h92Var2.f42019L).mo20564a(h92Var.f42020M, h92Var2.f42020M).mo20566c(h92Var.f42030i, h92Var2.f42030i).mo20566c(h92Var.f42026e, h92Var2.f42026e).mo20566c(h92Var.f42028g, h92Var2.f42028g).mo20565b(Integer.valueOf(h92Var.f42033l), Integer.valueOf(h92Var2.f42033l), AbstractC1104t.m6350c().mo6319e());
        boolean z = h92Var.f42023P;
        tb1 tb1VarMo20566c = tb1VarMo20565b.mo20566c(z, h92Var2.f42023P);
        boolean z2 = h92Var.f42024Q;
        tb1 tb1VarMo20566c2 = tb1VarMo20566c.mo20566c(z2, h92Var2.f42024Q);
        if (z && z2) {
            tb1VarMo20566c2 = tb1VarMo20566c2.mo20564a(h92Var.f42025R, h92Var2.f42025R);
        }
        return tb1VarMo20566c2.mo20568e();
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    public final int mo186a() {
        return this.f42022O;
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final boolean mo187b(g92 g92Var) {
        h92 h92Var = (h92) g92Var;
        if (!this.f42021N && !Objects.equals(this.f40418d.f6406o, h92Var.f40418d.f6406o)) {
            return false;
        }
        this.f42027f.getClass();
        return this.f42023P == h92Var.f42023P && this.f42024Q == h92Var.f42024Q;
    }
}
