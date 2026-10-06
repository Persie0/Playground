package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.Arrays;

/* JADX INFO: renamed from: ah */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0008ah {

    /* JADX INFO: renamed from: h */
    public final AmbientDelegate f363h;

    /* JADX INFO: renamed from: i */
    private final C0009ai f364i;

    /* JADX INFO: renamed from: a */
    public int f356a = 0;

    /* JADX INFO: renamed from: j */
    private int f365j = 8;

    /* JADX INFO: renamed from: b */
    public int[] f357b = new int[8];

    /* JADX INFO: renamed from: c */
    public int[] f358c = new int[8];

    /* JADX INFO: renamed from: d */
    public float[] f359d = new float[8];

    /* JADX INFO: renamed from: e */
    public int f360e = -1;

    /* JADX INFO: renamed from: f */
    public int f361f = -1;

    /* JADX INFO: renamed from: g */
    public boolean f362g = false;

    public C0008ah(C0009ai c0009ai, AmbientDelegate ambientDelegate, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f364i = c0009ai;
        this.f363h = ambientDelegate;
    }

    /* JADX INFO: renamed from: a */
    public final float m647a(C0012al c0012al) {
        int i = this.f360e;
        for (int i2 = 0; i != -1 && i2 < this.f356a; i2++) {
            if (this.f357b[i] == c0012al.f611a) {
                return this.f359d[i];
            }
            i = this.f358c[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final float m649c(C0012al c0012al) {
        int i = this.f360e;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f356a) {
                int i4 = this.f357b[i];
                if (i4 == c0012al.f611a) {
                    if (i == this.f360e) {
                        this.f360e = this.f358c[i];
                    } else {
                        int[] iArr = this.f358c;
                        iArr[i3] = iArr[i];
                    }
                    ((C0012al[]) this.f363h.f1685a)[i4].m891a(this.f364i);
                    this.f356a--;
                    this.f357b[i] = -1;
                    if (this.f362g) {
                        this.f361f = i;
                    }
                    return this.f359d[i];
                }
                i2++;
                i3 = i;
                i = this.f358c[i];
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public final void m652f(C0012al c0012al, float f) {
        if (f == 0.0f) {
            m649c(c0012al);
            return;
        }
        int i = this.f360e;
        if (i == -1) {
            this.f360e = 0;
            this.f359d[0] = f;
            this.f357b[0] = c0012al.f611a;
            this.f358c[0] = -1;
            this.f356a++;
            if (this.f362g) {
                return;
            }
            this.f361f++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.f356a; i3++) {
            int i4 = this.f357b[i];
            int i5 = c0012al.f611a;
            if (i4 == i5) {
                this.f359d[i] = f;
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.f358c[i];
        }
        int length = this.f361f;
        int i6 = length + 1;
        if (this.f362g) {
            int[] iArr = this.f357b;
            if (iArr[length] != -1) {
                length = iArr.length;
            }
        } else {
            length = i6;
        }
        int length2 = this.f357b.length;
        if (length >= length2 && this.f356a < length2) {
            int i7 = 0;
            while (true) {
                int[] iArr2 = this.f357b;
                if (i7 >= iArr2.length) {
                    break;
                }
                if (iArr2[i7] == -1) {
                    length = i7;
                    break;
                }
                i7++;
            }
        }
        int length3 = this.f357b.length;
        if (length >= length3) {
            int i8 = this.f365j;
            int i9 = i8 + i8;
            this.f365j = i9;
            this.f362g = false;
            this.f361f = length3 - 1;
            this.f359d = Arrays.copyOf(this.f359d, i9);
            this.f357b = Arrays.copyOf(this.f357b, this.f365j);
            this.f358c = Arrays.copyOf(this.f358c, this.f365j);
            length = length3;
        }
        int[] iArr3 = this.f357b;
        iArr3[length] = c0012al.f611a;
        this.f359d[length] = f;
        if (i2 != -1) {
            int[] iArr4 = this.f358c;
            iArr4[length] = iArr4[i2];
            iArr4[i2] = length;
        } else {
            this.f358c[length] = this.f360e;
            this.f360e = length;
        }
        int i10 = this.f356a + 1;
        this.f356a = i10;
        if (!this.f362g) {
            this.f361f++;
        }
        if (i10 >= iArr3.length) {
            this.f362g = true;
        }
    }

    /* JADX INFO: renamed from: g */
    final void m653g(C0009ai c0009ai, C0009ai c0009ai2) {
        int i = this.f360e;
        int i2 = 0;
        while (i != -1 && i2 < this.f356a) {
            int i3 = this.f357b[i];
            C0012al c0012al = c0009ai2.f396a;
            if (i3 == c0012al.f611a) {
                float f = this.f359d[i];
                m649c(c0012al);
                C0008ah c0008ah = c0009ai2.f399d;
                int i4 = c0008ah.f360e;
                for (int i5 = 0; i4 != -1 && i5 < c0008ah.f356a; i5++) {
                    m651e(((C0012al[]) this.f363h.f1685a)[c0008ah.f357b[i4]], c0008ah.f359d[i4] * f);
                    i4 = c0008ah.f358c[i4];
                }
                c0009ai.f397b += c0009ai2.f397b * f;
                c0009ai2.f396a.m891a(c0009ai);
                i = this.f360e;
                i2 = 0;
            } else {
                i = this.f358c[i];
                i2++;
            }
        }
    }

    public final String toString() {
        int i = this.f360e;
        String strConcat = "";
        for (int i2 = 0; i != -1 && i2 < this.f356a; i2++) {
            String str = strConcat.concat(" -> ") + this.f359d[i] + " : ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            C0012al c0012al = ((C0012al[]) this.f363h.f1685a)[this.f357b[i]];
            sb.append(c0012al);
            strConcat = str.concat(String.valueOf(c0012al));
            i = this.f358c[i];
        }
        return strConcat;
    }

    /* JADX INFO: renamed from: b */
    final float m648b(int i) {
        int i2 = this.f360e;
        for (int i3 = 0; i2 != -1 && i3 < this.f356a; i3++) {
            if (i3 == i) {
                return this.f359d[i2];
            }
            i2 = this.f358c[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    final C0012al m650d(int i) {
        int i2 = this.f360e;
        for (int i3 = 0; i2 != -1 && i3 < this.f356a; i3++) {
            if (i3 == i) {
                return ((C0012al[]) this.f363h.f1685a)[this.f357b[i2]];
            }
            i2 = this.f358c[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m651e(C0012al c0012al, float f) {
        if (f == 0.0f) {
            return;
        }
        int i = this.f360e;
        if (i == -1) {
            this.f360e = 0;
            this.f359d[0] = f;
            this.f357b[0] = c0012al.f611a;
            this.f358c[0] = -1;
            this.f356a++;
            if (this.f362g) {
                return;
            }
            this.f361f++;
            return;
        }
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.f356a; i3++) {
            int i4 = this.f357b[i];
            int i5 = c0012al.f611a;
            if (i4 == i5) {
                float[] fArr = this.f359d;
                float f2 = fArr[i] + f;
                fArr[i] = f2;
                if (f2 == 0.0f) {
                    if (i == this.f360e) {
                        this.f360e = this.f358c[i];
                    } else {
                        int[] iArr = this.f358c;
                        iArr[i2] = iArr[i];
                    }
                    ((C0012al[]) this.f363h.f1685a)[i4].m891a(this.f364i);
                    if (this.f362g) {
                        this.f361f = i;
                    }
                    this.f356a--;
                    return;
                }
                return;
            }
            if (i4 < i5) {
                i2 = i;
            }
            i = this.f358c[i];
        }
        int length = this.f361f;
        int i6 = length + 1;
        if (this.f362g) {
            int[] iArr2 = this.f357b;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i6;
        }
        int length2 = this.f357b.length;
        if (length >= length2 && this.f356a < length2) {
            int i7 = 0;
            while (true) {
                int[] iArr3 = this.f357b;
                if (i7 >= iArr3.length) {
                    break;
                }
                if (iArr3[i7] == -1) {
                    length = i7;
                    break;
                }
                i7++;
            }
        }
        int length3 = this.f357b.length;
        if (length >= length3) {
            int i8 = this.f365j;
            int i9 = i8 + i8;
            this.f365j = i9;
            this.f362g = false;
            this.f361f = length3 - 1;
            this.f359d = Arrays.copyOf(this.f359d, i9);
            this.f357b = Arrays.copyOf(this.f357b, this.f365j);
            this.f358c = Arrays.copyOf(this.f358c, this.f365j);
            length = length3;
        }
        int[] iArr4 = this.f357b;
        iArr4[length] = c0012al.f611a;
        this.f359d[length] = f;
        if (i2 != -1) {
            int[] iArr5 = this.f358c;
            iArr5[length] = iArr5[i2];
            iArr5[i2] = length;
        } else {
            this.f358c[length] = this.f360e;
            this.f360e = length;
        }
        this.f356a++;
        if (!this.f362g) {
            this.f361f++;
        }
        int i10 = this.f361f;
        int length4 = iArr4.length;
        if (i10 >= length4) {
            this.f362g = true;
            this.f361f = length4 - 1;
        }
    }
}
