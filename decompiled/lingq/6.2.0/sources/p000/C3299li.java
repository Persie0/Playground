package p000;

import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: li */
/* JADX INFO: loaded from: classes2.dex */
public final class C3299li implements wc0 {

    /* JADX INFO: renamed from: a */
    public int f49690a;

    /* JADX INFO: renamed from: b */
    public Object f49691b;

    /* JADX INFO: renamed from: c */
    public Object f49692c;

    public C3299li(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f49692c = string;
        this.f49691b = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.f49691b, i)) {
            i++;
        }
        this.f49690a = i;
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: E */
    public void mo16222E() {
        k47 k47Var = (k47) this.f49692c;
        byte[] bArr = uma.f64081b;
        k47Var.getClass();
        k47Var.m14816K(bArr.length, bArr);
    }

    /* JADX INFO: renamed from: a */
    public void m16223a(float f, long j) {
        int i = (this.f49690a + 1) % 20;
        this.f49690a = i;
        ((long[]) this.f49691b)[i] = j;
        ((float[]) this.f49692c)[i] = f;
    }

    /* JADX INFO: renamed from: b */
    public float m16224b() {
        float[] fArr = (float[]) this.f49692c;
        long[] jArr = (long[]) this.f49691b;
        int i = this.f49690a;
        long j = Long.MIN_VALUE;
        float f = 0.0f;
        if (i != 0 || jArr[i] != Long.MIN_VALUE) {
            long j2 = jArr[i];
            int i2 = 0;
            long j3 = j2;
            while (true) {
                long j4 = jArr[i];
                if (j4 == j) {
                    break;
                }
                float f2 = j2 - j4;
                float fAbs = Math.abs(j4 - j3);
                if (f2 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                j3 = j4;
                j = Long.MIN_VALUE;
            }
            if (i2 >= 2) {
                int i3 = this.f49690a;
                float f3 = 1000.0f;
                if (i2 != 2) {
                    int i4 = ((i3 - i2) + 21) % 20;
                    int i5 = (i3 + 21) % 20;
                    long j5 = jArr[i4];
                    float f4 = fArr[i4];
                    int i6 = i4 + 1;
                    int i7 = i6 % 20;
                    float f5 = 0.0f;
                    while (i7 != i5) {
                        long j6 = jArr[i7];
                        float f6 = f3;
                        float f7 = f4;
                        float f8 = j6 - j5;
                        if (f8 == f) {
                            f4 = f7;
                        } else {
                            f4 = fArr[i7];
                            float f9 = (f4 - f7) / f8;
                            float fAbs2 = (Math.abs(f9) * (f9 - ((float) (Math.sqrt(2.0f * Math.abs(f5)) * ((double) Math.signum(f5)))))) + f5;
                            if (i7 == i6) {
                                fAbs2 *= 0.5f;
                            }
                            f5 = fAbs2;
                            j5 = j6;
                        }
                        i7 = (i7 + 1) % 20;
                        f = 0.0f;
                        f3 = f6;
                    }
                    return ((float) (Math.sqrt(Math.abs(f5) * 2.0f) * ((double) Math.signum(f5)))) * f3;
                }
                int i8 = i3 == 0 ? 19 : i3 - 1;
                float f10 = jArr[i3] - jArr[i8];
                if (f10 != 0.0f) {
                    return ((fArr[i3] - fArr[i8]) / f10) * 1000.0f;
                }
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public Object m16225c(int i) {
        SparseArray sparseArray = (SparseArray) this.f49691b;
        if (this.f49690a == -1) {
            this.f49690a = 0;
        }
        while (true) {
            int i2 = this.f49690a;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f49690a--;
        }
        while (this.f49690a < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f49690a + 1)) {
            this.f49690a++;
        }
        return sparseArray.valueAt(this.f49690a);
    }

    /* JADX INFO: renamed from: d */
    public List m16226d() {
        return (ArrayList) this.f49691b;
    }

    /* JADX INFO: renamed from: e */
    public int m16227e() {
        return this.f49690a;
    }

    /* JADX INFO: renamed from: f */
    public int m16228f() {
        int i = this.f49690a;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    @Override // p000.wc0
    /* JADX INFO: renamed from: g */
    public vc0 mo14881g(iy2 iy2Var, long j) {
        long j2;
        long position = iy2Var.getPosition();
        int iMin = (int) Math.min(112800L, iy2Var.getLength() - position);
        k47 k47Var = (k47) this.f49692c;
        k47Var.m14815J(iMin);
        iy2Var.mo13085o(k47Var.f46700a, 0, iMin);
        int i = k47Var.f46702c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (k47Var.m14820a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = k47Var.f46700a;
            int i2 = k47Var.f46701b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long jM4433b = c9d.m4433b(k47Var, i2, this.f49690a);
            if (jM4433b != j2) {
                long jM12280b = ((g1a) this.f49691b).m12280b(jM4433b);
                if (jM12280b > j) {
                    return j5 == j2 ? new vc0(-1, jM12280b, position) : new vc0(0, -9223372036854775807L, position + j4);
                }
                j5 = jM12280b;
                if (100000 + j5 > j) {
                    return new vc0(0, -9223372036854775807L, position + ((long) i2));
                }
                j4 = i2;
            }
            k47Var.m14818M(i3);
            j3 = i3;
        }
        return j5 != j2 ? new vc0(-2, j5, position + j3) : vc0.f65176d;
    }

    /* JADX INFO: renamed from: h */
    public byte[] m16229h() {
        q41 q41Var = q41.f57245f;
        a34 a34Var = (a34) this.f49691b;
        ((p29) this.f49692c).f55497i = false;
        p29 p29Var = (p29) this.f49692c;
        p29Var.f55495g = Boolean.FALSE;
        a34Var.f173a = new iid(p29Var);
        try {
            wkd.m24042f();
            t8d t8dVar = new t8d(a34Var);
            gv5 gv5Var = new gv5(3);
            q41Var.m19639i(gv5Var);
            HashMap map = new HashMap((HashMap) gv5Var.f41392b);
            HashMap map2 = new HashMap((HashMap) gv5Var.f41393c);
            rlb rlbVar = (rlb) gv5Var.f41394d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                uvb uvbVar = new uvb(byteArrayOutputStream, map, map2, rlbVar);
                fp6 fp6Var = (fp6) map.get(t8d.class);
                if (fp6Var == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(t8d.class)));
                }
                fp6Var.mo24a(t8dVar, uvbVar);
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public C3299li(a34 a34Var, int i) {
        this.f49692c = new p29();
        this.f49691b = a34Var;
        wkd.m24042f();
        this.f49690a = i;
    }

    public C3299li(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f49690a = i;
        this.f49692c = str;
        this.f49691b = arrayList;
    }

    public C3299li(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.f49691b = arrayList;
        this.f49690a = i;
        this.f49692c = motionEvent;
        if (arrayList.isEmpty()) {
            C3386nv.m17626m("changes cannot be empty");
            throw null;
        }
    }

    public C3299li() {
        long[] jArr = new long[20];
        this.f49691b = jArr;
        this.f49692c = new float[20];
        this.f49690a = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }
}
