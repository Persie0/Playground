package p000;

import android.opengl.GLES20;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fn3 implements nt8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39332a;

    /* JADX INFO: renamed from: b */
    public int f39333b;

    /* JADX INFO: renamed from: c */
    public Object f39334c;

    /* JADX INFO: renamed from: d */
    public Object f39335d;

    /* JADX INFO: renamed from: e */
    public Object f39336e;

    /* JADX INFO: renamed from: f */
    public Object f39337f;

    public fn3(int i) throws GlUtil$GlException {
        this.f39332a = i;
        switch (i) {
            case 1:
                break;
            default:
                int iGlCreateProgram = GLES20.glCreateProgram();
                this.f39333b = iGlCreateProgram;
                oed.m17953a();
                m11948d(iGlCreateProgram, "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", 35633);
                m11948d(iGlCreateProgram, "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n", 35632);
                GLES20.glLinkProgram(iGlCreateProgram);
                int[] iArr = {0};
                GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                oed.m17954b("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
                GLES20.glUseProgram(iGlCreateProgram);
                this.f39336e = new HashMap();
                int[] iArr2 = new int[1];
                GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
                this.f39334c = new bw8[iArr2[0]];
                for (int i2 = 0; i2 < iArr2[0]; i2++) {
                    int i3 = this.f39333b;
                    int[] iArr3 = new int[1];
                    GLES20.glGetProgramiv(i3, 35722, iArr3, 0);
                    int i4 = iArr3[0];
                    byte[] bArr = new byte[i4];
                    GLES20.glGetActiveAttrib(i3, i2, i4, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
                    for (int i5 = 0; i5 < i4; i5++) {
                        i4 = bArr[i5] == 0 ? i5 : i4;
                        break;
                    }
                    String str = new String(bArr, 0, i4);
                    GLES20.glGetAttribLocation(i3, str);
                    bw8 bw8Var = new bw8();
                    ((bw8[]) this.f39334c)[i2] = bw8Var;
                    ((HashMap) this.f39336e).put(str, bw8Var);
                }
                this.f39337f = new HashMap();
                int[] iArr4 = new int[1];
                GLES20.glGetProgramiv(this.f39333b, 35718, iArr4, 0);
                this.f39335d = new gna[iArr4[0]];
                for (int i6 = 0; i6 < iArr4[0]; i6++) {
                    int i7 = this.f39333b;
                    int[] iArr5 = new int[1];
                    GLES20.glGetProgramiv(i7, 35719, iArr5, 0);
                    int i8 = iArr5[0];
                    byte[] bArr2 = new byte[i8];
                    GLES20.glGetActiveUniform(i7, i6, i8, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
                    for (int i9 = 0; i9 < i8; i9++) {
                        i8 = bArr2[i9] == 0 ? i9 : i8;
                        break;
                    }
                    String str2 = new String(bArr2, 0, i8);
                    GLES20.glGetUniformLocation(i7, str2);
                    gna gnaVar = new gna();
                    ((gna[]) this.f39335d)[i6] = gnaVar;
                    ((HashMap) this.f39337f).put(str2, gnaVar);
                }
                oed.m17953a();
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m11948d(int i, String str, int i2) throws GlUtil$GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        oed.m17954b(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        oed.m17953a();
    }

    /* JADX INFO: renamed from: a */
    public void m11949a(double d, float f) {
        int length = ((float[]) this.f39334c).length + 1;
        int iBinarySearch = Arrays.binarySearch((double[]) this.f39335d, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f39335d = Arrays.copyOf((double[]) this.f39335d, length);
        this.f39334c = Arrays.copyOf((float[]) this.f39334c, length);
        this.f39336e = new double[length];
        double[] dArr = (double[]) this.f39335d;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        ((double[]) this.f39335d)[iBinarySearch] = d;
        ((float[]) this.f39334c)[iBinarySearch] = f;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0211  */
    /* JADX WARN: Code duplicated, block: B:105:0x0215  */
    /* JADX WARN: Code duplicated, block: B:108:0x0228  */
    /* JADX WARN: Code duplicated, block: B:123:0x0322  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    @Override // p000.nt8
    /* JADX INFO: renamed from: b */
    public void mo11950b(k47 k47Var) {
        SparseArray sparseArray;
        so0 so0Var;
        int i;
        Object b87Var;
        Object b87Var2;
        Object b87Var3;
        SparseArray sparseArray2;
        SparseArray sparseArray3 = (SparseArray) this.f39335d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f39336e;
        so0 so0Var2 = (so0) this.f39334c;
        kca kcaVar = (kca) this.f39337f;
        SparseArray sparseArray4 = kcaVar.f47040g;
        SparseBooleanArray sparseBooleanArray = kcaVar.f47041h;
        if (k47Var.m14842z() != 2) {
            return;
        }
        int i2 = 0;
        g1a g1aVar = (g1a) kcaVar.f47035b.get(0);
        if ((k47Var.m14842z() & 128) == 0) {
            return;
        }
        k47Var.m14819N(1);
        int iM14812G = k47Var.m14812G();
        int i3 = 3;
        k47Var.m14819N(3);
        k47Var.m14827k(so0Var2.f61083b, 0, 2);
        so0Var2.m21509m(0);
        so0Var2.m21511o(3);
        int i4 = 13;
        kcaVar.f47050q = so0Var2.m21503g(13);
        k47Var.m14827k(so0Var2.f61083b, 0, 2);
        so0Var2.m21509m(0);
        so0Var2.m21511o(4);
        k47Var.m14819N(so0Var2.m21503g(12));
        sparseArray3.clear();
        sparseIntArray.clear();
        int iM14820a = k47Var.m14820a();
        while (iM14820a > 0) {
            k47Var.m14827k(so0Var2.f61083b, i2, 5);
            so0Var2.m21509m(i2);
            int iM21503g = so0Var2.m21503g(8);
            so0Var2.m21511o(i3);
            int iM21503g2 = so0Var2.m21503g(i4);
            so0Var2.m21511o(4);
            int iM21503g3 = so0Var2.m21503g(12);
            int i5 = k47Var.f46701b;
            int i6 = i5 + iM21503g3;
            int i7 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            int iM14842z = 0;
            while (true) {
                so0Var = so0Var2;
                if (k47Var.f46701b < i6) {
                    int iM14842z2 = k47Var.m14842z();
                    int iM14842z3 = k47Var.f46701b + k47Var.m14842z();
                    if (iM14842z3 <= i6) {
                        int i8 = iM14820a;
                        if (iM14842z2 == 5) {
                            long jM14807B = k47Var.m14807B();
                            if (jM14807B == 1094921523) {
                                i7 = 129;
                            } else if (jM14807B == 1161904947) {
                                i7 = 135;
                            } else if (jM14807B == 1094921524) {
                                i7 = 172;
                            } else if (jM14807B == 1212503619) {
                                i7 = 36;
                            }
                            sparseArray2 = sparseArray4;
                        } else if (iM14842z2 == 106) {
                            iM14842z3 = iM14842z3;
                            sparseArray2 = sparseArray4;
                            i7 = 129;
                        } else if (iM14842z2 == 122) {
                            i7 = 135;
                            sparseArray2 = sparseArray4;
                        } else if (iM14842z2 == 127) {
                            int iM14842z4 = k47Var.m14842z();
                            if (iM14842z4 == 21) {
                                i7 = 172;
                            } else if (iM14842z4 == 14) {
                                i7 = 136;
                            } else if (iM14842z4 == 33) {
                                i7 = 139;
                            }
                            sparseArray2 = sparseArray4;
                        } else if (iM14842z2 == 123) {
                            iM14842z3 = iM14842z3;
                            sparseArray2 = sparseArray4;
                            i7 = 138;
                        } else if (iM14842z2 == 10) {
                            strTrim = k47Var.m14840x(3, StandardCharsets.UTF_8).trim();
                            iM14842z3 = iM14842z3;
                            sparseArray2 = sparseArray4;
                            iM14842z = k47Var.m14842z();
                        } else {
                            int i9 = 3;
                            if (iM14842z2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (k47Var.f46701b < iM14842z3) {
                                    String strTrim2 = k47Var.m14840x(i9, StandardCharsets.UTF_8).trim();
                                    k47Var.m14842z();
                                    int i10 = iM14842z3;
                                    byte[] bArr = new byte[4];
                                    k47Var.m14827k(bArr, 0, 4);
                                    arrayList2.add(new lca(strTrim2, bArr));
                                    iM14842z3 = i10;
                                    sparseArray4 = sparseArray4;
                                    i9 = 3;
                                }
                                iM14842z3 = iM14842z3;
                                sparseArray2 = sparseArray4;
                                arrayList = arrayList2;
                                i7 = 89;
                            } else {
                                iM14842z3 = iM14842z3;
                                sparseArray2 = sparseArray4;
                                if (iM14842z2 == 111) {
                                    i7 = 257;
                                }
                            }
                        }
                        k47Var.m14819N(iM14842z3 - k47Var.f46701b);
                        so0Var2 = so0Var;
                        sparseArray4 = sparseArray2;
                        iM14820a = i8;
                    }
                }
            }
            SparseArray sparseArray5 = sparseArray4;
            int i11 = iM14820a;
            k47Var.m14818M(i6);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(k47Var.f46700a, i5, i6);
            C3299li c3299li = new C3299li();
            c3299li.f49690a = iM14842z;
            c3299li.f49691b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
            c3299li.f49692c = bArrCopyOfRange;
            if (iM21503g == 6 || iM21503g == 5) {
                iM21503g = i7;
            }
            iM14820a = i11 - (iM21503g3 + 5);
            if (sparseBooleanArray.get(iM21503g2)) {
                i = 3;
            } else {
                d40 d40Var = kcaVar.f47038e;
                i = 3;
                if (iM21503g == 2) {
                    b87Var = new b87(new kq3(new eu8(1, d40Var.m10082b(c3299li)), "video/mp2t"));
                } else if (iM21503g == 3 || iM21503g == 4) {
                    b87Var = new b87(new l46(strTrim, c3299li.m16228f(), "video/mp2t"));
                } else {
                    if (iM21503g != 21) {
                        if (iM21503g == 27) {
                            b87Var3 = new b87(new qq3(new eu8(0, d40Var.m10082b(c3299li)), false, false));
                        } else if (iM21503g == 36) {
                            b87Var3 = new b87(new sq3(new eu8(0, d40Var.m10082b(c3299li))));
                        } else if (iM21503g == 45) {
                            b87Var2 = new b87(new n46());
                        } else if (iM21503g == 89) {
                            b87Var = new b87(new rn2((List) c3299li.f49691b));
                        } else if (iM21503g == 172) {
                            b87Var = new b87(new C3097i2(strTrim, c3299li.m16228f(), "video/mp2t", 1));
                        } else if (iM21503g == 257) {
                            b87Var2 = new ot8(new gv5("application/vnd.dvb.ait", 28));
                        } else if (iM21503g == 138) {
                            b87Var = new b87(new an2(strTrim, c3299li.m16228f(), 4096));
                        } else if (iM21503g != 139) {
                            switch (iM21503g) {
                                case 15:
                                    b87Var = new b87(new C3327m9(strTrim, c3299li.m16228f(), "video/mp2t", false));
                                    break;
                                case 16:
                                    b87Var3 = new b87(new nq3(new eu8(1, d40Var.m10082b(c3299li))));
                                    break;
                                case 17:
                                    b87Var = new b87(new sp4(strTrim, c3299li.m16228f()));
                                    break;
                                default:
                                    switch (iM21503g) {
                                        case 128:
                                            b87Var = new b87(new kq3(new eu8(1, d40Var.m10082b(c3299li)), "video/mp2t"));
                                            break;
                                        case 129:
                                            b87Var = new b87(new C3097i2(strTrim, c3299li.m16228f(), "video/mp2t", 0));
                                            break;
                                        case 130:
                                            b87Var = null;
                                            break;
                                        default:
                                            switch (iM21503g) {
                                                case 134:
                                                    b87Var2 = new ot8(new gv5("application/x-scte35", 28));
                                                    break;
                                                case 135:
                                                    b87Var = new b87(new C3097i2(strTrim, c3299li.m16228f(), "video/mp2t", 0));
                                                    break;
                                                case 136:
                                                    b87Var = new b87(new an2(strTrim, c3299li.m16228f(), 4096));
                                                    break;
                                                default:
                                                    b87Var = null;
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            b87Var = new b87(new an2(strTrim, c3299li.m16228f(), 5408));
                        }
                        b87Var = b87Var3;
                    } else {
                        b87Var2 = new b87(new rn2());
                    }
                    b87Var = b87Var2;
                }
                sparseIntArray.put(iM21503g2, iM21503g2);
                sparseArray3.put(iM21503g2, b87Var);
            }
            i3 = i;
            so0Var2 = so0Var;
            sparseArray4 = sparseArray5;
            i2 = 0;
            i4 = 13;
        }
        SparseArray sparseArray6 = sparseArray4;
        int size = sparseIntArray.size();
        int i12 = 0;
        while (i12 < size) {
            int iKeyAt = sparseIntArray.keyAt(i12);
            int iValueAt = sparseIntArray.valueAt(i12);
            sparseBooleanArray.put(iKeyAt, true);
            kcaVar.f47042i.put(iValueAt, true);
            nca ncaVar = (nca) sparseArray3.valueAt(i12);
            if (ncaVar != null) {
                ncaVar.mo3476c(g1aVar, kcaVar.f47045l, new mca(iM14812G, iKeyAt, 8192));
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, ncaVar);
            } else {
                sparseArray = sparseArray6;
            }
            i12++;
            sparseArray6 = sparseArray;
        }
        sparseArray6.remove(this.f39333b);
        kcaVar.f47046m = 0;
        kcaVar.f47045l.mo2551j();
        kcaVar.f47047n = true;
    }

    @Override // p000.nt8
    /* JADX INFO: renamed from: c */
    public void mo11951c(g1a g1aVar, jy2 jy2Var, mca mcaVar) {
    }

    /* JADX INFO: renamed from: e */
    public mn7 m11952e(pu5 pu5Var) {
        pu5Var.f56811b.getClass();
        i02 i02Var = (i02) this.f39334c;
        dw6 dw6Var = (dw6) this.f39335d;
        ((c62) this.f39336e).getClass();
        pu5Var.f56811b.getClass();
        pu5Var.f56811b.getClass();
        return new mn7(pu5Var, i02Var, dw6Var, (my5) this.f39337f, this.f39333b);
    }

    public String toString() {
        switch (this.f39332a) {
            case 1:
                return "pos =" + Arrays.toString((double[]) this.f39335d) + " period=" + Arrays.toString((float[]) this.f39334c);
            default:
                return super.toString();
        }
    }

    public fn3(i02 i02Var, i62 i62Var) {
        this.f39332a = 2;
        dw6 dw6Var = new dw6(i62Var, 3);
        c62 c62Var = new c62(0);
        my5 my5Var = new my5(6);
        this.f39334c = i02Var;
        this.f39335d = dw6Var;
        this.f39336e = c62Var;
        this.f39337f = my5Var;
        this.f39333b = 1048576;
    }

    public fn3(m46 m46Var, nha nhaVar, byte[] bArr, l34[] l34VarArr, int i) {
        this.f39332a = 4;
        this.f39334c = m46Var;
        this.f39335d = nhaVar;
        this.f39336e = bArr;
        this.f39337f = l34VarArr;
        this.f39333b = i;
    }

    public fn3(kca kcaVar, int i) {
        this.f39332a = 3;
        this.f39337f = kcaVar;
        this.f39334c = new so0(5, new byte[5]);
        this.f39335d = new SparseArray();
        this.f39336e = new SparseIntArray();
        this.f39333b = i;
    }
}
