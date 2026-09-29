package p000;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.C0713b;
import com.google.common.collect.AbstractC1104t;
import com.google.common.collect.ImmutableList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class z82 extends g92 implements Comparable {

    /* JADX INFO: renamed from: H */
    public final int f71043H;

    /* JADX INFO: renamed from: I */
    public final boolean f71044I;

    /* JADX INFO: renamed from: J */
    public final boolean f71045J;

    /* JADX INFO: renamed from: K */
    public final int f71046K;

    /* JADX INFO: renamed from: L */
    public final int f71047L;

    /* JADX INFO: renamed from: M */
    public final boolean f71048M;

    /* JADX INFO: renamed from: N */
    public final int f71049N;

    /* JADX INFO: renamed from: O */
    public final int f71050O;

    /* JADX INFO: renamed from: P */
    public final int f71051P;

    /* JADX INFO: renamed from: Q */
    public final int f71052Q;

    /* JADX INFO: renamed from: R */
    public final boolean f71053R;

    /* JADX INFO: renamed from: S */
    public final boolean f71054S;

    /* JADX INFO: renamed from: T */
    public final boolean f71055T;

    /* JADX INFO: renamed from: e */
    public final int f71056e;

    /* JADX INFO: renamed from: f */
    public final boolean f71057f;

    /* JADX INFO: renamed from: g */
    public final String f71058g;

    /* JADX INFO: renamed from: h */
    public final d92 f71059h;

    /* JADX INFO: renamed from: i */
    public final boolean f71060i;

    /* JADX INFO: renamed from: j */
    public final int f71061j;

    /* JADX INFO: renamed from: k */
    public final int f71062k;

    /* JADX INFO: renamed from: l */
    public final int f71063l;

    /* JADX WARN: Code duplicated, block: B:109:0x0179  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    public z82(int i, j8a j8aVar, int i2, d92 d92Var, int i3, boolean z, w82 w82Var, int i4) {
        int i5;
        int iM13729g;
        boolean z2;
        int iM13729g2;
        boolean z3;
        boolean z4;
        boolean z5;
        q8a q8aVar;
        super(i, j8aVar, i2);
        this.f71059h = d92Var;
        boolean z6 = d92Var.f35206z;
        ImmutableList immutableList = d92Var.f60534p;
        ImmutableList immutableList2 = d92Var.f60530l;
        int i6 = z6 ? 24 : 16;
        int i7 = 0;
        this.f71044I = false;
        this.f71058g = i92.m13730i(this.f40418d.f6395d);
        this.f71060i = y90.m24989n(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= immutableList2.size()) {
                iM13729g = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iM13729g = i92.m13729g(this.f40418d, (String) immutableList2.get(i8), false);
                if (iM13729g > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f71062k = i8;
        this.f71061j = iM13729g;
        int i9 = this.f40418d.f6397f;
        this.f71063l = (i9 == 0 || i9 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.f71043H = i92.m13723a(this.f40418d, d92Var.f60531m);
        C0713b c0713b = this.f40418d;
        int i10 = c0713b.f6397f;
        this.f71045J = i10 == 0 || (i10 & 1) != 0;
        this.f71048M = (c0713b.f6396e & 1) != 0;
        String str = c0713b.f6406o;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z2 = true;
                    break;
                default:
                    z2 = false;
                    break;
            }
        } else {
            z2 = false;
        }
        this.f71055T = z2;
        int i11 = c0713b.f6381G;
        this.f71049N = i11;
        this.f71050O = c0713b.f6382H;
        int i12 = c0713b.f6401j;
        this.f71051P = i12;
        this.f71057f = (i12 == -1 || i12 <= d92Var.f60533o) && (i11 == -1 || i11 <= d92Var.f60532n) && w82Var.apply(c0713b);
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i13 = 0; i13 < strArrSplit.length; i13++) {
            strArrSplit[i13] = uma.m22798C(strArrSplit[i13]);
        }
        int i14 = 0;
        while (true) {
            if (i14 < strArrSplit.length) {
                iM13729g2 = i92.m13729g(this.f40418d, strArrSplit[i14], false);
                if (iM13729g2 <= 0) {
                    i14++;
                }
            } else {
                iM13729g2 = 0;
                i14 = Integer.MAX_VALUE;
            }
        }
        this.f71046K = i14;
        this.f71047L = iM13729g2;
        for (int i15 = 0; i15 < immutableList.size(); i15++) {
            String str2 = this.f40418d.f6406o;
            if (str2 != null && str2.equals(immutableList.get(i15))) {
                i5 = i15;
                this.f71052Q = i5;
                if ((i3 & 384) == 128) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f71053R = z3;
                if ((i3 & 64) == 64) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f71054S = z4;
                boolean z7 = this.f71057f;
                d92 d92Var2 = this.f71059h;
                z5 = d92Var2.f35199B;
                q8aVar = d92Var2.f60535q;
                if (y90.m24989n(i3, z5) && (z7 || d92Var2.f35205y)) {
                    q8aVar.getClass();
                    if (y90.m24989n(i3, false) || !z7 || this.f40418d.f6401j == -1 || ((!d92Var2.f35200C && z) || (i6 & i3) == 0)) {
                        i7 = 1;
                    } else {
                        i7 = 2;
                    }
                }
                this.f71056e = i7;
            }
        }
        this.f71052Q = i5;
        if ((i3 & 384) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f71053R = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f71054S = z4;
        boolean z8 = this.f71057f;
        d92 d92Var3 = this.f71059h;
        z5 = d92Var3.f35199B;
        q8aVar = d92Var3.f60535q;
        if (y90.m24989n(i3, z5)) {
            q8aVar.getClass();
            if (y90.m24989n(i3, false)) {
                i7 = 1;
            } else {
                i7 = 1;
            }
        }
        this.f71056e = i7;
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    public final int mo186a() {
        return this.f71056e;
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final boolean mo187b(g92 g92Var) {
        int i;
        String str;
        z82 z82Var = (z82) g92Var;
        C0713b c0713b = z82Var.f40418d;
        this.f71059h.getClass();
        C0713b c0713b2 = this.f40418d;
        int i2 = c0713b2.f6381G;
        if (i2 == -1 || i2 != c0713b.f6381G) {
            return false;
        }
        return (this.f71044I || ((str = c0713b2.f6406o) != null && TextUtils.equals(str, c0713b.f6406o))) && (i = c0713b2.f6382H) != -1 && i == c0713b.f6382H && this.f71053R == z82Var.f71053R && this.f71054S == z82Var.f71054S;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z82 z82Var) {
        boolean z = this.f71060i;
        boolean z2 = this.f71057f;
        AbstractC1104t abstractC1104tMo6319e = (z2 && z) ? i92.f43726k : i92.f43726k.mo6319e();
        boolean z3 = z82Var.f71060i;
        int i = z82Var.f71051P;
        tb1 tb1VarMo20565b = tb1.f62090a.mo20566c(z, z3).mo20565b(Integer.valueOf(this.f71062k), Integer.valueOf(z82Var.f71062k), AbstractC1104t.m6350c().mo6319e()).mo20564a(this.f71061j, z82Var.f71061j).mo20564a(this.f71063l, z82Var.f71063l).mo20565b(Integer.valueOf(this.f71043H), Integer.valueOf(z82Var.f71043H), AbstractC1104t.m6350c().mo6319e()).mo20566c(this.f71048M, z82Var.f71048M).mo20566c(this.f71045J, z82Var.f71045J).mo20565b(Integer.valueOf(this.f71046K), Integer.valueOf(z82Var.f71046K), AbstractC1104t.m6350c().mo6319e()).mo20564a(this.f71047L, z82Var.f71047L).mo20566c(z2, z82Var.f71057f).mo20565b(Integer.valueOf(this.f71052Q), Integer.valueOf(z82Var.f71052Q), AbstractC1104t.m6350c().mo6319e());
        this.f71059h.getClass();
        tb1 tb1VarMo20565b2 = tb1VarMo20565b.mo20566c(this.f71053R, z82Var.f71053R).mo20566c(this.f71054S, z82Var.f71054S).mo20566c(this.f71055T, z82Var.f71055T).mo20565b(Integer.valueOf(this.f71049N), Integer.valueOf(z82Var.f71049N), abstractC1104tMo6319e).mo20565b(Integer.valueOf(this.f71050O), Integer.valueOf(z82Var.f71050O), abstractC1104tMo6319e);
        if (Objects.equals(this.f71058g, z82Var.f71058g)) {
            tb1VarMo20565b2 = tb1VarMo20565b2.mo20565b(Integer.valueOf(this.f71051P), Integer.valueOf(i), abstractC1104tMo6319e);
        }
        return tb1VarMo20565b2.mo20568e();
    }
}
