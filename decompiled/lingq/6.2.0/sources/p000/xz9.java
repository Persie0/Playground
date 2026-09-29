package p000;

import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.spatial.C0429a;

/* JADX INFO: loaded from: classes.dex */
public final class xz9 {

    /* JADX INFO: renamed from: a */
    public final int f69022a;

    /* JADX INFO: renamed from: b */
    public final long f69023b;

    /* JADX INFO: renamed from: c */
    public final d16 f69024c;

    /* JADX INFO: renamed from: d */
    public final vi3 f69025d;

    /* JADX INFO: renamed from: e */
    public xz9 f69026e;

    /* JADX INFO: renamed from: f */
    public long f69027f;

    /* JADX INFO: renamed from: g */
    public long f69028g;

    /* JADX INFO: renamed from: h */
    public long f69029h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public long f69030i = -1;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ yz9 f69031j;

    public xz9(yz9 yz9Var, int i, long j, d16 d16Var, vi3 vi3Var) {
        this.f69031j = yz9Var;
        this.f69022a = i;
        this.f69023b = j;
        this.f69024c = d16Var;
        this.f69025d = vi3Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m24799a(long j, long j2, long j3, long j4, float[] fArr) {
        r48 r48Var;
        r48 r48Var2;
        long j5 = this.f69031j.f70715f;
        d16 d16Var = this.f69024c;
        AbstractC0362l abstractC0362lM21976I = te1.m21976I(d16Var, 2);
        C0357g c0357gM21979L = te1.m21979L(d16Var);
        boolean zM1570M = c0357gM21979L.m1570M();
        k40 k40Var = c0357gM21979L.f4335a0;
        if (zM1570M) {
            if (((AbstractC0362l) k40Var.f46677e) != abstractC0362lM21976I) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = abstractC0362lM21976I.f49303c;
                AbstractC0362l abstractC0362l = (AbstractC0362l) k40Var.f46677e;
                abstractC0362l.getClass();
                long jM19495C = pvc.m19495C(abstractC0362l.mo1669P(abstractC0362lM21976I, jFloatToRawIntBits));
                r48Var = new r48(jM19495C, (4294967295L & ((long) (((int) (jM19495C & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jM19495C >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, d16Var);
            } else {
                r48Var = new r48(j, j2, j3, j4, j5, fArr, d16Var);
            }
            r48Var2 = r48Var;
        } else {
            r48Var2 = null;
        }
        if (r48Var2 == null) {
            return;
        }
        this.f69025d.invoke(r48Var2);
    }

    /* JADX INFO: renamed from: b */
    public final void m24800b() {
        yz9 yz9Var = this.f69031j;
        t56 t56Var = yz9Var.f70710a;
        int i = this.f69022a;
        xz9 xz9Var = (xz9) t56Var.m21848g(i);
        if (xz9Var != null) {
            if (xz9Var == this) {
                xz9 xz9Var2 = this.f69026e;
                this.f69026e = null;
                if (xz9Var2 != null) {
                    int iM21845d = t56Var.m21845d(i);
                    Object[] objArr = t56Var.f35145c;
                    Object obj = objArr[iM21845d];
                    t56Var.f35144b[iM21845d] = i;
                    objArr[iM21845d] = xz9Var2;
                    return;
                }
                C0357g c0357gM21979L = te1.m21979L(this.f69024c.f34837a);
                if (c0357gM21979L.m1569L()) {
                    C0429a rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357gM21979L)).getRectManager();
                    rectManager.getClass();
                    if (c0357gM21979L.f4346g != -4) {
                        C3047gq c3047gq = rectManager.f5031c;
                        int iM1876e = rectManager.m1876e(c0357gM21979L);
                        long[] jArr = (long[]) c3047gq.f41172c;
                        int i2 = iM1876e + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iM21845d2 = t56Var.m21845d(i);
            Object[] objArr2 = t56Var.f35145c;
            Object obj2 = objArr2[iM21845d2];
            t56Var.f35144b[iM21845d2] = i;
            objArr2[iM21845d2] = xz9Var;
            while (true) {
                xz9 xz9Var3 = xz9Var.f69026e;
                if (xz9Var3 == null) {
                    break;
                }
                if (xz9Var3 == this) {
                    xz9Var.f69026e = this.f69026e;
                    this.f69026e = null;
                    return;
                }
                xz9Var = xz9Var3;
            }
        }
        xz9 xz9Var4 = yz9Var.f70711b;
        if (xz9Var4 == this) {
            yz9Var.f70711b = xz9Var4.f69026e;
            this.f69026e = null;
            return;
        }
        xz9 xz9Var5 = xz9Var4 != null ? xz9Var4.f69026e : null;
        while (true) {
            xz9 xz9Var6 = xz9Var4;
            xz9Var4 = xz9Var5;
            if (xz9Var4 == null) {
                return;
            }
            if (xz9Var4 == this) {
                if (xz9Var6 != null) {
                    xz9Var6.f69026e = xz9Var4.f69026e;
                }
                this.f69026e = null;
                return;
            }
            xz9Var5 = xz9Var4.f69026e;
        }
    }
}
