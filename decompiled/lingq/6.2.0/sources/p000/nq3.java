package p000;

import androidx.media3.common.C0713b;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class nq3 implements yo2 {

    /* JADX INFO: renamed from: l */
    public static final float[] f53116l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final eu8 f53117a;

    /* JADX INFO: renamed from: b */
    public final k47 f53118b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f53119c = new boolean[4];

    /* JADX INFO: renamed from: d */
    public final lq3 f53120d;

    /* JADX INFO: renamed from: e */
    public final e76 f53121e;

    /* JADX INFO: renamed from: f */
    public mq3 f53122f;

    /* JADX INFO: renamed from: g */
    public long f53123g;

    /* JADX INFO: renamed from: h */
    public String f53124h;

    /* JADX INFO: renamed from: i */
    public n8a f53125i;

    /* JADX INFO: renamed from: j */
    public boolean f53126j;

    /* JADX INFO: renamed from: k */
    public long f53127k;

    public nq3(eu8 eu8Var) {
        this.f53117a = eu8Var;
        lq3 lq3Var = new lq3();
        lq3Var.f50005e = new byte[128];
        this.f53120d = lq3Var;
        this.f53127k = -9223372036854775807L;
        this.f53121e = new e76(178);
        this.f53118b = new k47();
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0235  */
    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final void mo609b(k47 k47Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        this.f53122f.getClass();
        this.f53125i.getClass();
        int i5 = k47Var.f46701b;
        int i6 = k47Var.f46702c;
        byte[] bArr = k47Var.f46700a;
        this.f53123g += (long) k47Var.m14820a();
        this.f53125i.mo2535e(k47Var.m14820a(), k47Var);
        while (true) {
            int iM25794b = zuc.m25794b(bArr, i5, i6, this.f53119c);
            lq3 lq3Var = this.f53120d;
            e76 e76Var = this.f53121e;
            if (iM25794b == i6) {
                if (!this.f53126j) {
                    lq3Var.m16465a(bArr, i5, i6);
                }
                this.f53122f.m16995a(bArr, i5, i6);
                if (e76Var != null) {
                    e76Var.m10906a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i7 = iM25794b + 3;
            byte b = k47Var.f46700a[i7];
            int i8 = b & 255;
            int i9 = iM25794b - i5;
            if (this.f53126j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    lq3Var.m16465a(bArr, i5, iM25794b);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = lq3Var.f50002b;
                if (i11 != 0) {
                    i = i6;
                    if (i11 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            ss5.m21707d0("H263Reader", "Unexpected start code value");
                            lq3Var.f50001a = false;
                            lq3Var.f50003c = 0;
                            lq3Var.f50002b = 0;
                        } else {
                            lq3Var.f50002b = 2;
                        }
                    } else if (i11 != 2) {
                        i2 = i7;
                        if (i11 != 3) {
                            if (i11 != 4) {
                                uk9.m22770c();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                lq3Var.f50003c -= i10;
                                lq3Var.f50001a = false;
                                n8a n8aVar = this.f53125i;
                                int i12 = lq3Var.f50004d;
                                String str = this.f53124h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(lq3Var.f50005e, lq3Var.f50003c);
                                so0 so0Var = new so0(bArrCopyOf.length, bArrCopyOf);
                                so0Var.m21512p(i12);
                                so0Var.m21512p(4);
                                so0Var.m21510n();
                                so0Var.m21511o(8);
                                if (so0Var.m21502f()) {
                                    so0Var.m21511o(4);
                                    so0Var.m21511o(3);
                                }
                                int iM21503g = so0Var.m21503g(4);
                                if (iM21503g == 15) {
                                    int iM21503g2 = so0Var.m21503g(8);
                                    int iM21503g3 = so0Var.m21503g(8);
                                    if (iM21503g3 == 0) {
                                        ss5.m21707d0("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = iM21503g2 / iM21503g3;
                                    }
                                } else if (iM21503g < 7) {
                                    f = f53116l[iM21503g];
                                } else {
                                    ss5.m21707d0("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (so0Var.m21502f()) {
                                    so0Var.m21511o(2);
                                    so0Var.m21511o(1);
                                    if (so0Var.m21502f()) {
                                        so0Var.m21511o(15);
                                        so0Var.m21510n();
                                        so0Var.m21511o(15);
                                        so0Var.m21510n();
                                        so0Var.m21511o(15);
                                        so0Var.m21510n();
                                        so0Var.m21511o(3);
                                        so0Var.m21511o(11);
                                        so0Var.m21510n();
                                        so0Var.m21511o(15);
                                        so0Var.m21510n();
                                    }
                                }
                                if (so0Var.m21503g(2) != 0) {
                                    ss5.m21707d0("H263Reader", "Unhandled video object layer shape");
                                }
                                so0Var.m21510n();
                                int iM21503g4 = so0Var.m21503g(16);
                                so0Var.m21510n();
                                if (so0Var.m21502f()) {
                                    if (iM21503g4 == 0) {
                                        ss5.m21707d0("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i13 = 0;
                                        for (int i14 = iM21503g4 - 1; i14 > 0; i14 >>= 1) {
                                            i13++;
                                        }
                                        so0Var.m21511o(i13);
                                    }
                                }
                                so0Var.m21510n();
                                int iM21503g5 = so0Var.m21503g(13);
                                so0Var.m21510n();
                                int iM21503g6 = so0Var.m21503g(13);
                                so0Var.m21510n();
                                so0Var.m21510n();
                                lc3 lc3Var = new lc3();
                                lc3Var.f49440a = str;
                                lc3Var.f49452m = ez5.m11402l("video/mp2t");
                                lc3Var.f49453n = ez5.m11402l("video/mp4v-es");
                                lc3Var.f49460u = iM21503g5;
                                lc3Var.f49461v = iM21503g6;
                                lc3Var.f49425A = f;
                                lc3Var.f49456q = Collections.singletonList(bArrCopyOf);
                                n8aVar.mo2537g(new C0713b(lc3Var));
                                this.f53126j = true;
                            } else {
                                i4 = 0;
                            }
                        } else if ((b & 240) != 32) {
                            ss5.m21707d0("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            lq3Var.f50001a = false;
                            lq3Var.f50003c = 0;
                            lq3Var.f50002b = 0;
                        } else {
                            i4 = 0;
                            lq3Var.f50004d = lq3Var.f50003c;
                            lq3Var.f50002b = 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            ss5.m21707d0("H263Reader", "Unexpected start code value");
                            lq3Var.f50001a = false;
                            lq3Var.f50003c = 0;
                            lq3Var.f50002b = 0;
                        } else {
                            lq3Var.f50002b = 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        lq3Var.f50002b = 1;
                        lq3Var.f50001a = true;
                    }
                }
                lq3Var.m16465a(lq3.f50000f, i4, 3);
            }
            this.f53122f.m16995a(bArr, i5, iM25794b);
            if (e76Var == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    e76Var.m10906a(bArr, i5, iM25794b);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (e76Var.m10907b(i3)) {
                    int iM25806n = zuc.m25806n(e76Var.f36815e, e76Var.f36814d);
                    String str2 = uma.f64080a;
                    byte[] bArr2 = e76Var.f36814d;
                    k47 k47Var2 = this.f53118b;
                    k47Var2.m14816K(iM25806n, bArr2);
                    this.f53117a.m11344a(this.f53127k, k47Var2);
                }
                if (i8 == 178) {
                    z = true;
                    if (k47Var.f46700a[iM25794b + 2] == 1) {
                        e76Var.m10909d(i8);
                    }
                } else {
                    z = true;
                }
            }
            int i15 = i - iM25794b;
            this.f53122f.m16996b(i15, this.f53123g - ((long) i15), this.f53126j);
            mq3 mq3Var = this.f53122f;
            long j = this.f53127k;
            mq3Var.f51722e = i8;
            mq3Var.f51721d = false;
            mq3Var.f51719b = (i8 == 182 || i8 == 179) ? z : false;
            mq3Var.f51720c = i8 == 182 ? z : false;
            mq3Var.f51723f = 0;
            mq3Var.f51725h = j;
            i6 = i;
            i5 = i2;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final void mo611d() {
        zuc.m25793a(this.f53119c);
        lq3 lq3Var = this.f53120d;
        lq3Var.f50001a = false;
        lq3Var.f50003c = 0;
        lq3Var.f50002b = 0;
        mq3 mq3Var = this.f53122f;
        if (mq3Var != null) {
            mq3Var.f51719b = false;
            mq3Var.f51720c = false;
            mq3Var.f51721d = false;
            mq3Var.f51722e = -1;
        }
        e76 e76Var = this.f53121e;
        if (e76Var != null) {
            e76Var.m10908c();
        }
        this.f53123g = 0L;
        this.f53127k = -9223372036854775807L;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final void mo612e(boolean z) {
        this.f53122f.getClass();
        if (z) {
            this.f53122f.m16996b(0, this.f53123g, this.f53126j);
            mq3 mq3Var = this.f53122f;
            mq3Var.f51719b = false;
            mq3Var.f51720c = false;
            mq3Var.f51721d = false;
            mq3Var.f51722e = -1;
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final void mo613f(int i, long j) {
        this.f53127k = j;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: g */
    public final void mo614g(jy2 jy2Var, mca mcaVar) {
        mcaVar.m16767a();
        mcaVar.m16768b();
        this.f53124h = mcaVar.f51087e;
        mcaVar.m16768b();
        n8a n8aVarMo2555n = jy2Var.mo2555n(mcaVar.f51086d, 2);
        this.f53125i = n8aVarMo2555n;
        this.f53122f = new mq3(n8aVarMo2555n);
        this.f53117a.m11345b(jy2Var, mcaVar);
    }
}
