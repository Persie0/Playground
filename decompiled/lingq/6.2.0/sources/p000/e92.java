package p000;

import androidx.media3.common.C0713b;
import com.google.common.collect.AbstractC1104t;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes2.dex */
public final class e92 extends g92 implements Comparable {

    /* JADX INFO: renamed from: H */
    public final int f36860H;

    /* JADX INFO: renamed from: I */
    public final boolean f36861I;

    /* JADX INFO: renamed from: e */
    public final int f36862e;

    /* JADX INFO: renamed from: f */
    public final boolean f36863f;

    /* JADX INFO: renamed from: g */
    public final boolean f36864g;

    /* JADX INFO: renamed from: h */
    public final boolean f36865h;

    /* JADX INFO: renamed from: i */
    public final int f36866i;

    /* JADX INFO: renamed from: j */
    public final int f36867j;

    /* JADX INFO: renamed from: k */
    public final int f36868k;

    /* JADX INFO: renamed from: l */
    public final int f36869l;

    /* JADX WARN: Multi-variable type inference failed */
    public e92(int i, j8a j8aVar, int i2, d92 d92Var, int i3, String str, String str2) {
        int iM13729g;
        super(i, j8aVar, i2);
        int i4 = 0;
        this.f36863f = y90.m24989n(i3, false);
        int i5 = this.f40418d.f6396e;
        d92Var.getClass();
        ImmutableList immutableList = d92Var.f60536r;
        this.f36864g = (i5 & 1) != 0;
        this.f36865h = (i5 & 2) != 0;
        ImmutableList immutableListM6291y = str2 != null ? ImmutableList.m6291y(str2) : immutableList.isEmpty() ? ImmutableList.m6291y("") : immutableList;
        int i6 = 0;
        while (true) {
            if (i6 >= immutableListM6291y.size()) {
                iM13729g = 0;
                i6 = Integer.MAX_VALUE;
                break;
            } else {
                iM13729g = i92.m13729g(this.f40418d, (String) immutableListM6291y.get(i6), false);
                if (iM13729g > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.f36866i = i6;
        this.f36867j = iM13729g;
        int i7 = str2 != null ? 1088 : 0;
        int i8 = this.f40418d.f6397f;
        AbstractC1104t abstractC1104t = i92.f43726k;
        int iBitCount = (i8 == 0 || i8 != i7) ? Integer.bitCount(i7 & i8) : Integer.MAX_VALUE;
        this.f36868k = iBitCount;
        C0713b c0713b = this.f40418d;
        this.f36861I = (1088 & c0713b.f6397f) != 0;
        int iM13723a = i92.m13723a(c0713b, d92Var.f60537s);
        this.f36869l = iM13723a;
        int iM13729g2 = i92.m13729g(this.f40418d, str, i92.m13730i(str) == null);
        this.f36860H = iM13729g2;
        boolean z = iM13729g > 0 || (immutableList.isEmpty() && iBitCount > 0) || ((immutableList.isEmpty() && iM13723a != Integer.MAX_VALUE) || this.f36864g || (this.f36865h && iM13729g2 > 0));
        if (y90.m24989n(i3, d92Var.f35199B) && z) {
            i4 = 1;
        }
        this.f36862e = i4;
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    public final int mo186a() {
        return this.f36862e;
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo187b(g92 g92Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e92 e92Var) {
        tb1 tb1VarMo20565b = tb1.f62090a.mo20566c(this.f36863f, e92Var.f36863f).mo20565b(Integer.valueOf(this.f36866i), Integer.valueOf(e92Var.f36866i), AbstractC1104t.m6350c().mo6319e());
        int i = e92Var.f36867j;
        int i2 = this.f36867j;
        tb1 tb1VarMo20564a = tb1VarMo20565b.mo20564a(i2, i);
        int i3 = e92Var.f36868k;
        int i4 = this.f36868k;
        tb1 tb1VarMo20564a2 = tb1VarMo20564a.mo20564a(i4, i3).mo20565b(Integer.valueOf(this.f36869l), Integer.valueOf(e92Var.f36869l), AbstractC1104t.m6350c().mo6319e()).mo20566c(this.f36864g, e92Var.f36864g).mo20565b(Boolean.valueOf(this.f36865h), Boolean.valueOf(e92Var.f36865h), i2 == 0 ? AbstractC1104t.m6350c() : AbstractC1104t.m6350c().mo6319e()).mo20564a(this.f36860H, e92Var.f36860H);
        if (i4 == 0) {
            tb1VarMo20564a2 = tb1VarMo20564a2.mo20567d(this.f36861I, e92Var.f36861I);
        }
        return tb1VarMo20564a2.mo20568e();
    }
}
