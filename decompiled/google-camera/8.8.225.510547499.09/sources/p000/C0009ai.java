package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;

/* JADX INFO: renamed from: ai */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0009ai {

    /* JADX INFO: renamed from: d */
    public final C0008ah f399d;

    /* JADX INFO: renamed from: a */
    public C0012al f396a = null;

    /* JADX INFO: renamed from: b */
    public float f397b = 0.0f;

    /* JADX INFO: renamed from: c */
    boolean f398c = false;

    /* JADX INFO: renamed from: e */
    boolean f400e = false;

    public C0009ai(AmbientDelegate ambientDelegate, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f399d = new C0008ah(this, ambientDelegate, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m717a(C0012al c0012al) {
        C0012al c0012al2 = this.f396a;
        if (c0012al2 != null) {
            this.f399d.m652f(c0012al2, -1.0f);
            this.f396a = null;
        }
        float f = -this.f399d.m649c(c0012al);
        this.f396a = c0012al;
        if (f == 1.0f) {
            return;
        }
        this.f397b /= f;
        C0008ah c0008ah = this.f399d;
        int i = c0008ah.f360e;
        for (int i2 = 0; i != -1 && i2 < c0008ah.f356a; i2++) {
            float[] fArr = c0008ah.f359d;
            fArr[i] = fArr[i] / f;
            i = c0008ah.f358c[i];
        }
    }

    /* JADX INFO: renamed from: b */
    final void m718b() {
        C0008ah c0008ah = this.f399d;
        int i = c0008ah.f360e;
        for (int i2 = 0; i != -1 && i2 < c0008ah.f356a; i2++) {
            C0012al c0012al = ((C0012al[]) c0008ah.f363h.f1685a)[c0008ah.f357b[i]];
            int i3 = 0;
            while (true) {
                int i4 = c0012al.f617g;
                if (i3 >= i4) {
                    C0009ai[] c0009aiArr = c0012al.f616f;
                    int length = c0009aiArr.length;
                    if (i4 >= length) {
                        c0012al.f616f = (C0009ai[]) Arrays.copyOf(c0009aiArr, length + length);
                    }
                    C0009ai[] c0009aiArr2 = c0012al.f616f;
                    int i5 = c0012al.f617g;
                    c0009aiArr2[i5] = this;
                    c0012al.f617g = i5 + 1;
                    break;
                }
                if (c0012al.f616f[i3] == this) {
                    break;
                } else {
                    i3++;
                }
            }
            i = c0008ah.f358c[i];
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m719c(C0012al c0012al, C0012al c0012al2) {
        this.f399d.m652f(c0012al, 1.0f);
        this.f399d.m652f(c0012al2, -1.0f);
    }

    /* JADX INFO: renamed from: d */
    final void m720d(C0012al c0012al, C0012al c0012al2, int i, float f, C0012al c0012al3, C0012al c0012al4, int i2) {
        if (c0012al2 == c0012al3) {
            this.f399d.m652f(c0012al, 1.0f);
            this.f399d.m652f(c0012al4, 1.0f);
            this.f399d.m652f(c0012al2, -2.0f);
            return;
        }
        if (f == 0.5f) {
            this.f399d.m652f(c0012al, 1.0f);
            this.f399d.m652f(c0012al2, -1.0f);
            this.f399d.m652f(c0012al3, -1.0f);
            this.f399d.m652f(c0012al4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f397b = (-i) + i2;
                return;
            }
            return;
        }
        if (f <= 0.0f) {
            this.f399d.m652f(c0012al, -1.0f);
            this.f399d.m652f(c0012al2, 1.0f);
            this.f397b = i;
            return;
        }
        if (f >= 1.0f) {
            this.f399d.m652f(c0012al3, -1.0f);
            this.f399d.m652f(c0012al4, 1.0f);
            this.f397b = i2;
            return;
        }
        float f2 = 1.0f - f;
        this.f399d.m652f(c0012al, f2);
        this.f399d.m652f(c0012al2, -f2);
        this.f399d.m652f(c0012al3, -f);
        this.f399d.m652f(c0012al4, f);
        if (i > 0 || i2 > 0) {
            this.f397b = ((-i) * f2) + (i2 * f);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m721e(C0012al c0012al, C0012al c0012al2, C0012al c0012al3, C0012al c0012al4, float f) {
        this.f399d.m652f(c0012al, -1.0f);
        this.f399d.m652f(c0012al2, 1.0f);
        this.f399d.m652f(c0012al3, f);
        this.f399d.m652f(c0012al4, -f);
    }

    /* JADX INFO: renamed from: f */
    public final void m722f(float f, float f2, float f3, C0012al c0012al, int i, C0012al c0012al2, int i2, C0012al c0012al3, int i3, C0012al c0012al4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f397b = ((-i) - i2) + i3 + i4;
            this.f399d.m652f(c0012al, 1.0f);
            this.f399d.m652f(c0012al2, -1.0f);
            this.f399d.m652f(c0012al4, 1.0f);
            this.f399d.m652f(c0012al3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.f397b = ((-i) - i2) + (i3 * f4) + (i4 * f4);
        this.f399d.m652f(c0012al, 1.0f);
        this.f399d.m652f(c0012al2, -1.0f);
        this.f399d.m652f(c0012al4, f4);
        this.f399d.m652f(c0012al3, -f4);
    }

    /* JADX INFO: renamed from: g */
    public final void m723g(C0012al c0012al, int i) {
        if (i < 0) {
            this.f397b = -i;
            this.f399d.m652f(c0012al, 1.0f);
        } else {
            this.f397b = i;
            this.f399d.m652f(c0012al, -1.0f);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m724h(C0012al c0012al, C0012al c0012al2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f397b = i;
            if (z) {
                this.f399d.m652f(c0012al, 1.0f);
                this.f399d.m652f(c0012al2, -1.0f);
                return;
            }
        }
        this.f399d.m652f(c0012al, -1.0f);
        this.f399d.m652f(c0012al2, 1.0f);
    }

    /* JADX INFO: renamed from: i */
    public final void m725i(C0012al c0012al, C0012al c0012al2, C0012al c0012al3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f397b = i;
            if (z) {
                this.f399d.m652f(c0012al, 1.0f);
                this.f399d.m652f(c0012al2, -1.0f);
                this.f399d.m652f(c0012al3, -1.0f);
                return;
            }
        }
        this.f399d.m652f(c0012al, -1.0f);
        this.f399d.m652f(c0012al2, 1.0f);
        this.f399d.m652f(c0012al3, 1.0f);
    }

    /* JADX INFO: renamed from: j */
    public final void m726j(C0012al c0012al, C0012al c0012al2, C0012al c0012al3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f397b = i;
            if (z) {
                this.f399d.m652f(c0012al, 1.0f);
                this.f399d.m652f(c0012al2, -1.0f);
                this.f399d.m652f(c0012al3, 1.0f);
                return;
            }
        }
        this.f399d.m652f(c0012al, -1.0f);
        this.f399d.m652f(c0012al2, 1.0f);
        this.f399d.m652f(c0012al3, -1.0f);
    }

    /* JADX INFO: renamed from: k */
    public final void m727k(C0009ai c0009ai) {
        this.f399d.m653g(this, c0009ai);
    }

    public final String toString() {
        String strConcat;
        boolean z;
        String str;
        if (this.f396a == null) {
            strConcat = "0";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            C0012al c0012al = this.f396a;
            sb.append(c0012al);
            strConcat = "".concat(String.valueOf(c0012al));
        }
        float f = this.f397b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.f397b;
            z = true;
        } else {
            z = false;
        }
        int i = this.f399d.f356a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f399d.m650d(i2) != null) {
                float fM648b = this.f399d.m648b(i2);
                if (z) {
                    if (fM648b > 0.0f) {
                        str = " + ";
                    } else {
                        fM648b = -fM648b;
                        str = " - ";
                    }
                    strConcat2 = strConcat2.concat(str);
                } else if (fM648b < 0.0f) {
                    fM648b = -fM648b;
                    strConcat2 = strConcat2.concat("- ");
                }
                strConcat2 = fM648b == 1.0f ? strConcat2.concat("null") : strConcat2 + fM648b + " null";
                z = true;
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }
}
