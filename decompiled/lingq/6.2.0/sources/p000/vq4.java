package p000;

import androidx.compose.p002ui.layout.AbstractC0337d;
import androidx.compose.p002ui.layout.C0339f;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vq4 implements it5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65781a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ it5 f65782b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0339f f65783c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f65784d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ it5 f65785e;

    public /* synthetic */ vq4(it5 it5Var, C0339f c0339f, int i, it5 it5Var2, int i2) {
        this.f65781a = i2;
        this.f65783c = c0339f;
        this.f65784d = i;
        this.f65785e = it5Var2;
        this.f65782b = it5Var;
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: a */
    public final int mo10623a() {
        switch (this.f65781a) {
            case 0:
                break;
        }
        return this.f65782b.mo10623a();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: b */
    public final Map mo10624b() {
        switch (this.f65781a) {
            case 0:
                break;
        }
        return this.f65782b.mo10624b();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[LOOP:0: B:11:0x002f->B:30:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[SYNTHETIC] */
    @Override // p000.it5
    /* JADX INFO: renamed from: c */
    public final void mo10625c() {
        int i = this.f65781a;
        it5 it5Var = this.f65785e;
        int i2 = this.f65784d;
        C0339f c0339f = this.f65783c;
        switch (i) {
            case 0:
                c0339f.f4197e = i2;
                it5Var.mo10625c();
                x66 x66Var = c0339f.f4189H;
                n66 n66Var = c0339f.f4204l;
                long[] jArr = n66Var.f52399a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = n66Var.f52400b[i6];
                                    pm9 pm9Var = (pm9) n66Var.f52401c[i6];
                                    int iM24312j = x66Var.m24312j(obj);
                                    if (iM24312j < 0 || iM24312j >= c0339f.f4197e) {
                                        if (iM24312j >= 0) {
                                            Object[] objArr = x66Var.f67830a;
                                            Object obj2 = objArr[iM24312j];
                                            objArr[iM24312j] = AbstractC0337d.f4188b;
                                        }
                                        if (c0339f.f4202j.m17250b(obj)) {
                                            pm9Var.mo19394a();
                                        }
                                        n66Var.m17260l(i6);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 == 8) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        } else if (i3 != length) {
                            i3++;
                        }
                    }
                }
                c0339f.m1500g(c0339f.f4196d);
                break;
            default:
                c0339f.f4196d = i2;
                it5Var.mo10625c();
                if (c0339f.f4193a.f4348h == null) {
                    c0339f.m1500g(c0339f.f4196d);
                }
                break;
        }
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: d */
    public final int mo10626d() {
        switch (this.f65781a) {
            case 0:
                break;
        }
        return this.f65782b.mo10626d();
    }

    @Override // p000.it5
    /* JADX INFO: renamed from: e */
    public final vi3 mo10691e() {
        switch (this.f65781a) {
            case 0:
                break;
        }
        return this.f65782b.mo10691e();
    }
}
