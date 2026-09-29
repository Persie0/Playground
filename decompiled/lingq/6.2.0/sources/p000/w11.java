package p000;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class w11 {

    /* JADX INFO: renamed from: a */
    public final k60 f66201a;

    /* JADX INFO: renamed from: b */
    public final n8a f66202b;

    /* JADX INFO: renamed from: c */
    public final int f66203c;

    /* JADX INFO: renamed from: d */
    public final int f66204d;

    /* JADX INFO: renamed from: e */
    public final long f66205e;

    /* JADX INFO: renamed from: f */
    public int f66206f;

    /* JADX INFO: renamed from: g */
    public int f66207g;

    /* JADX INFO: renamed from: h */
    public int f66208h;

    /* JADX INFO: renamed from: i */
    public int f66209i;

    /* JADX INFO: renamed from: j */
    public int f66210j;

    /* JADX INFO: renamed from: k */
    public int f66211k;

    /* JADX INFO: renamed from: l */
    public long f66212l;

    /* JADX INFO: renamed from: m */
    public long[] f66213m;

    /* JADX INFO: renamed from: n */
    public int[] f66214n;

    public w11(int i, k60 k60Var, n8a n8aVar) {
        int i2 = k60Var.f46753d;
        this.f66201a = k60Var;
        int iM14879a = k60Var.m14879a();
        boolean z = true;
        if (iM14879a != 1 && iM14879a != 2) {
            z = false;
        }
        bna.m3969q(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f66203c = (iM14879a == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) k60Var.f46751b) * 1000000;
        long j2 = k60Var.f46752c;
        String str = uma.f64080a;
        this.f66205e = uma.m22803H(i2, j, j2, RoundingMode.DOWN);
        this.f66202b = n8aVar;
        this.f66204d = iM14879a == 2 ? i3 | 1650720768 : -1;
        this.f66212l = -1L;
        this.f66213m = new long[512];
        this.f66214n = new int[512];
        this.f66206f = i2;
    }

    /* JADX INFO: renamed from: a */
    public final ut8 m23672a(int i) {
        return new ut8((this.f66205e / ((long) this.f66206f)) * ((long) this.f66214n[i]), this.f66213m[i]);
    }

    /* JADX INFO: renamed from: b */
    public final rt8 m23673b(long j) {
        if (this.f66211k == 0) {
            ut8 ut8Var = new ut8(0L, this.f66212l);
            return new rt8(ut8Var, ut8Var);
        }
        int i = (int) (j / (this.f66205e / ((long) this.f66206f)));
        int iM22808c = uma.m22808c(this.f66214n, i, true, true);
        if (this.f66214n[iM22808c] == i) {
            ut8 ut8VarM23672a = m23672a(iM22808c);
            return new rt8(ut8VarM23672a, ut8VarM23672a);
        }
        ut8 ut8VarM23672a2 = m23672a(iM22808c);
        int i2 = iM22808c + 1;
        return i2 < this.f66213m.length ? new rt8(ut8VarM23672a2, m23672a(i2)) : new rt8(ut8VarM23672a2, ut8VarM23672a2);
    }
}
