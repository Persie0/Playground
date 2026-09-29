package p000;

import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.ByteString;
import androidx.glance.appwidget.protobuf.C0677k;
import androidx.glance.appwidget.protobuf.C0681o;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h3d {
    /* JADX INFO: renamed from: c */
    public static int m13027c(byte[] bArr, int i, C0787av c0787av) {
        int iM13033i = m13033i(bArr, i, c0787av);
        int i2 = c0787av.f7540a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.m2271e();
        }
        if (i2 > bArr.length - iM13033i) {
            throw InvalidProtocolBufferException.m2273g();
        }
        if (i2 == 0) {
            c0787av.f7542c = ByteString.f6037b;
            return iM13033i;
        }
        c0787av.f7542c = ByteString.m2261g(bArr, iM13033i, i2);
        return iM13033i + i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m13028d(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: e */
    public static long m13029e(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: f */
    public static int m13030f(ym8 ym8Var, int i, byte[] bArr, int i2, int i3, n94 n94Var, C0787av c0787av) {
        AbstractC0675i abstractC0675iNewInstance = ym8Var.newInstance();
        ym8 ym8Var2 = ym8Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C0787av c0787av2 = c0787av;
        int iM13037m = m13037m(abstractC0675iNewInstance, ym8Var2, bArr2, i2, i4, c0787av2);
        ym8Var2.makeImmutable(abstractC0675iNewInstance);
        c0787av2.f7542c = abstractC0675iNewInstance;
        n94Var.add(abstractC0675iNewInstance);
        while (iM13037m < i4) {
            C0787av c0787av3 = c0787av2;
            int i5 = i4;
            int iM13033i = m13033i(bArr2, iM13037m, c0787av3);
            if (i != c0787av3.f7540a) {
                break;
            }
            byte[] bArr3 = bArr2;
            ym8 ym8Var3 = ym8Var2;
            AbstractC0675i abstractC0675iNewInstance2 = ym8Var3.newInstance();
            iM13037m = m13037m(abstractC0675iNewInstance2, ym8Var3, bArr3, iM13033i, i5, c0787av3);
            ym8Var2 = ym8Var3;
            bArr2 = bArr3;
            i4 = i5;
            c0787av2 = c0787av3;
            ym8Var2.makeImmutable(abstractC0675iNewInstance2);
            c0787av2.f7542c = abstractC0675iNewInstance2;
            n94Var.add(abstractC0675iNewInstance2);
        }
        return iM13037m;
    }

    /* JADX INFO: renamed from: g */
    public static int m13031g(int i, byte[] bArr, int i2, int i3, C0681o c0681o, C0787av c0787av) {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.m2267a();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM13035k = m13035k(bArr, i2, c0787av);
            c0681o.m2471d(i, Long.valueOf(c0787av.f7541b));
            return iM13035k;
        }
        if (i4 == 1) {
            c0681o.m2471d(i, Long.valueOf(m13029e(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM13033i = m13033i(bArr, i2, c0787av);
            int i5 = c0787av.f7540a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.m2271e();
            }
            if (i5 > bArr.length - iM13033i) {
                throw InvalidProtocolBufferException.m2273g();
            }
            if (i5 == 0) {
                c0681o.m2471d(i, ByteString.f6037b);
            } else {
                c0681o.m2471d(i, ByteString.m2261g(bArr, iM13033i, i5));
            }
            return iM13033i + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.m2267a();
            }
            c0681o.m2471d(i, Integer.valueOf(m13028d(bArr, i2)));
            return i2 + 4;
        }
        C0681o c0681oM2468c = C0681o.m2468c();
        int i6 = (i & (-8)) | 4;
        int i7 = c0787av.f7543d + 1;
        c0787av.f7543d = i7;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iM13033i2 = m13033i(bArr, i2, c0787av);
            i8 = c0787av.f7540a;
            if (i8 == i6) {
                i2 = iM13033i2;
                break;
            }
            i2 = m13031g(i8, bArr, iM13033i2, i3, c0681oM2468c, c0787av);
        }
        c0787av.f7543d--;
        if (i2 > i3 || i8 != i6) {
            throw InvalidProtocolBufferException.m2272f();
        }
        c0681o.m2471d(i, c0681oM2468c);
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public static int m13032h(int i, byte[] bArr, int i2, C0787av c0787av) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c0787av.f7540a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c0787av.f7540a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c0787av.f7540a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c0787av.f7540a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c0787av.f7540a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m13033i(byte[] bArr, int i, C0787av c0787av) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m13032h(b, bArr, i2, c0787av);
        }
        c0787av.f7540a = b;
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public static int m13034j(int i, byte[] bArr, int i2, int i3, n94 n94Var, C0787av c0787av) {
        v74 v74Var = (v74) n94Var;
        int iM13033i = m13033i(bArr, i2, c0787av);
        v74Var.addInt(c0787av.f7540a);
        while (iM13033i < i3) {
            int iM13033i2 = m13033i(bArr, iM13033i, c0787av);
            if (i != c0787av.f7540a) {
                break;
            }
            iM13033i = m13033i(bArr, iM13033i2, c0787av);
            v74Var.addInt(c0787av.f7540a);
        }
        return iM13033i;
    }

    /* JADX INFO: renamed from: k */
    public static int m13035k(byte[] bArr, int i, C0787av c0787av) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c0787av.f7541b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c0787av.f7541b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: l */
    public static int m13036l(Object obj, ym8 ym8Var, byte[] bArr, int i, int i2, int i3, C0787av c0787av) {
        C0677k c0677k = (C0677k) ym8Var;
        int i4 = c0787av.f7543d + 1;
        c0787av.f7543d = i4;
        if (i4 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM2401A = c0677k.m2401A(obj, bArr, i, i2, i3, c0787av);
        c0787av.f7543d--;
        c0787av.f7542c = obj;
        return iM2401A;
    }

    /* JADX INFO: renamed from: m */
    public static int m13037m(Object obj, ym8 ym8Var, byte[] bArr, int i, int i2, C0787av c0787av) {
        int iM13032h = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM13032h = m13032h(i3, bArr, iM13032h, c0787av);
            i3 = c0787av.f7540a;
        }
        int i4 = iM13032h;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.m2273g();
        }
        int i5 = c0787av.f7543d + 1;
        c0787av.f7543d = i5;
        if (i5 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        ym8Var.mo2419e(obj, bArr, i4, i6, c0787av);
        c0787av.f7543d--;
        c0787av.f7542c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: a */
    public ey5 m13038a(jy5 jy5Var) {
        ByteBuffer byteBuffer = jy5Var.f50500e;
        byteBuffer.getClass();
        bna.m3969q(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo13039b(jy5Var, byteBuffer);
    }

    /* JADX INFO: renamed from: b */
    public abstract ey5 mo13039b(jy5 jy5Var, ByteBuffer byteBuffer);
}
