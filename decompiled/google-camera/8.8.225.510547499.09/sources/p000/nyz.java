package p000;

import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nyz implements nzm {

    /* JADX INFO: renamed from: a */
    private static final int[] f45038a = new int[0];

    /* JADX INFO: renamed from: b */
    private static final Unsafe f45039b = oag.m18362j();

    /* JADX INFO: renamed from: c */
    private final int[] f45040c;

    /* JADX INFO: renamed from: d */
    private final Object[] f45041d;

    /* JADX INFO: renamed from: e */
    private final int f45042e;

    /* JADX INFO: renamed from: f */
    private final int f45043f;

    /* JADX INFO: renamed from: g */
    private final nyw f45044g;

    /* JADX INFO: renamed from: h */
    private final boolean f45045h;

    /* JADX INFO: renamed from: i */
    private final boolean f45046i;

    /* JADX INFO: renamed from: j */
    private final boolean f45047j;

    /* JADX INFO: renamed from: k */
    private final int[] f45048k;

    /* JADX INFO: renamed from: l */
    private final int f45049l;

    /* JADX INFO: renamed from: m */
    private final int f45050m;

    /* JADX INFO: renamed from: n */
    private final nym f45051n;

    /* JADX INFO: renamed from: o */
    private final lij f45052o;

    private nyz(int[] iArr, Object[] objArr, int i, int i2, nyw nywVar, boolean z, int[] iArr2, int i3, int i4, nym nymVar, lij lijVar, ntw ntwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f45040c = iArr;
        this.f45041d = objArr;
        this.f45042e = i;
        this.f45043f = i2;
        this.f45046i = nywVar instanceof nxq;
        this.f45047j = z;
        boolean z2 = false;
        if (ntwVar != null && (nywVar instanceof nxo)) {
            z2 = true;
        }
        this.f45045h = z2;
        this.f45048k = iArr2;
        this.f45049l = i3;
        this.f45050m = i4;
        this.f45051n = nymVar;
        this.f45052o = lijVar;
        this.f45044g = nywVar;
    }

    /* JADX INFO: renamed from: A */
    private static long m18200A(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: B */
    private static long m18201B(Object obj, long j) {
        return ((Long) oag.m18360h(obj, j)).longValue();
    }

    /* JADX INFO: renamed from: C */
    private final nxu m18202C(int i) {
        int i2 = i / 3;
        return (nxu) this.f45041d[i2 + i2 + 1];
    }

    /* JADX INFO: renamed from: D */
    private final nzm m18203D(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        nzm nzmVar = (nzm) this.f45041d[i3];
        if (nzmVar != null) {
            return nzmVar;
        }
        nzm nzmVarM18259a = nzf.f45060a.m18259a((Class) this.f45041d[i3 + 1]);
        this.f45041d[i3] = nzmVarM18259a;
        return nzmVarM18259a;
    }

    /* JADX INFO: renamed from: E */
    private final Object m18204E(int i) {
        int i2 = i / 3;
        return this.f45041d[i2 + i2];
    }

    /* JADX INFO: renamed from: F */
    private final Object m18205F(Object obj, int i) {
        nzm nzmVarM18203D = m18203D(i);
        long jM18200A = m18200A(m18245z(i));
        if (!m18219T(obj, i)) {
            return nzmVarM18203D.mo18249e();
        }
        Object object = f45039b.getObject(obj, jM18200A);
        if (m18222W(object)) {
            return object;
        }
        Object objMo18249e = nzmVarM18203D.mo18249e();
        if (object != null) {
            nzmVarM18203D.mo18251g(objMo18249e, object);
        }
        return objMo18249e;
    }

    /* JADX INFO: renamed from: G */
    private final Object m18206G(Object obj, int i, int i2) {
        nzm nzmVarM18203D = m18203D(i2);
        if (!m18223X(obj, i, i2)) {
            return nzmVarM18203D.mo18249e();
        }
        Object object = f45039b.getObject(obj, m18200A(m18245z(i2)));
        if (m18222W(object)) {
            return object;
        }
        Object objMo18249e = nzmVarM18203D.mo18249e();
        if (object != null) {
            nzmVarM18203D.mo18251g(objMo18249e, object);
        }
        return objMo18249e;
    }

    /* JADX INFO: renamed from: H */
    private static Field m18207H(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX INFO: renamed from: I */
    private static List m18208I(Object obj, long j) {
        return (List) oag.m18360h(obj, j);
    }

    /* JADX INFO: renamed from: J */
    private static void m18209J(Object obj) {
        if (!m18222W(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m18210K(Object obj, Object obj2, int i) {
        if (m18219T(obj2, i)) {
            long jM18200A = m18200A(m18245z(i));
            Unsafe unsafe = f45039b;
            Object object = unsafe.getObject(obj2, jM18200A);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m18235p(i) + " is present but null: " + obj2.toString());
            }
            nzm nzmVarM18203D = m18203D(i);
            if (!m18219T(obj, i)) {
                if (m18222W(object)) {
                    Object objMo18249e = nzmVarM18203D.mo18249e();
                    nzmVarM18203D.mo18251g(objMo18249e, object);
                    unsafe.putObject(obj, jM18200A, objMo18249e);
                } else {
                    unsafe.putObject(obj, jM18200A, object);
                }
                m18213N(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM18200A);
            if (!m18222W(object2)) {
                Object objMo18249e2 = nzmVarM18203D.mo18249e();
                nzmVarM18203D.mo18251g(objMo18249e2, object2);
                unsafe.putObject(obj, jM18200A, objMo18249e2);
                object2 = objMo18249e2;
            }
            nzmVarM18203D.mo18251g(object2, object);
        }
    }

    /* JADX INFO: renamed from: L */
    private final void m18211L(Object obj, Object obj2, int i) {
        int iM18235p = m18235p(i);
        if (m18223X(obj2, iM18235p, i)) {
            long jM18200A = m18200A(m18245z(i));
            Unsafe unsafe = f45039b;
            Object object = unsafe.getObject(obj2, jM18200A);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m18235p(i) + " is present but null: " + obj2.toString());
            }
            nzm nzmVarM18203D = m18203D(i);
            if (!m18223X(obj, iM18235p, i)) {
                if (m18222W(object)) {
                    Object objMo18249e = nzmVarM18203D.mo18249e();
                    nzmVarM18203D.mo18251g(objMo18249e, object);
                    unsafe.putObject(obj, jM18200A, objMo18249e);
                } else {
                    unsafe.putObject(obj, jM18200A, object);
                }
                m18214O(obj, iM18235p, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM18200A);
            if (!m18222W(object2)) {
                Object objMo18249e2 = nzmVarM18203D.mo18249e();
                nzmVarM18203D.mo18251g(objMo18249e2, object2);
                unsafe.putObject(obj, jM18200A, objMo18249e2);
                object2 = objMo18249e2;
            }
            nzmVarM18203D.mo18251g(object2, object);
        }
    }

    /* JADX INFO: renamed from: M */
    private final void m18212M(Object obj, int i, nzi nziVar) {
        if (m18218S(i)) {
            oag.m18373u(obj, m18200A(i), nziVar.mo17922v());
        } else if (this.f45046i) {
            oag.m18373u(obj, m18200A(i), nziVar.mo17921u());
        } else {
            oag.m18373u(obj, m18200A(i), nziVar.mo17916o());
        }
    }

    /* JADX INFO: renamed from: N */
    private final void m18213N(Object obj, int i) {
        int iM18242w = m18242w(i);
        long j = 1048575 & iM18242w;
        if (j == 1048575) {
            return;
        }
        oag.m18371s(obj, j, (1 << (iM18242w >>> 20)) | oag.m18356d(obj, j));
    }

    /* JADX INFO: renamed from: O */
    private final void m18214O(Object obj, int i, int i2) {
        oag.m18371s(obj, m18242w(i2) & 1048575, i);
    }

    /* JADX INFO: renamed from: P */
    private final void m18215P(Object obj, int i, Object obj2) {
        f45039b.putObject(obj, m18200A(m18245z(i)), obj2);
        m18213N(obj, i);
    }

    /* JADX INFO: renamed from: Q */
    private final void m18216Q(Object obj, int i, int i2, Object obj2) {
        f45039b.putObject(obj, m18200A(m18245z(i2)), obj2);
        m18214O(obj, i, i2);
    }

    /* JADX INFO: renamed from: R */
    private final boolean m18217R(Object obj, Object obj2, int i) {
        return m18219T(obj, i) == m18219T(obj2, i);
    }

    /* JADX INFO: renamed from: S */
    private static boolean m18218S(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX INFO: renamed from: T */
    private final boolean m18219T(Object obj, int i) {
        int iM18242w = m18242w(i);
        long j = 1048575 & iM18242w;
        if (j != 1048575) {
            return (oag.m18356d(obj, j) & (1 << (iM18242w >>> 20))) != 0;
        }
        int iM18245z = m18245z(i);
        long jM18200A = m18200A(iM18245z);
        switch (m18244y(iM18245z)) {
            case 0:
                return Double.doubleToRawLongBits(oag.m18354b(obj, jM18200A)) != 0;
            case 1:
                return Float.floatToRawIntBits(oag.m18355c(obj, jM18200A)) != 0;
            case 2:
                return oag.m18358f(obj, jM18200A) != 0;
            case 3:
                return oag.m18358f(obj, jM18200A) != 0;
            case 4:
                return oag.m18356d(obj, jM18200A) != 0;
            case 5:
                return oag.m18358f(obj, jM18200A) != 0;
            case 6:
                return oag.m18356d(obj, jM18200A) != 0;
            case 7:
                return oag.m18375w(obj, jM18200A);
            case 8:
                Object objM18360h = oag.m18360h(obj, jM18200A);
                if (objM18360h instanceof String) {
                    return !((String) objM18360h).isEmpty();
                }
                if (objM18360h instanceof nwr) {
                    return !nwr.f44839b.equals(objM18360h);
                }
                throw new IllegalArgumentException();
            case 9:
                return oag.m18360h(obj, jM18200A) != null;
            case 10:
                return !nwr.f44839b.equals(oag.m18360h(obj, jM18200A));
            case 11:
                return oag.m18356d(obj, jM18200A) != 0;
            case 12:
                return oag.m18356d(obj, jM18200A) != 0;
            case 13:
                return oag.m18356d(obj, jM18200A) != 0;
            case 14:
                return oag.m18358f(obj, jM18200A) != 0;
            case 15:
                return oag.m18356d(obj, jM18200A) != 0;
            case 16:
                return oag.m18358f(obj, jM18200A) != 0;
            case 17:
                return oag.m18360h(obj, jM18200A) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: U */
    private final boolean m18220U(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m18219T(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX INFO: renamed from: V */
    private static boolean m18221V(Object obj, int i, nzm nzmVar) {
        return nzmVar.mo18255k(oag.m18360h(obj, m18200A(i)));
    }

    /* JADX INFO: renamed from: W */
    private static boolean m18222W(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof nxq) {
            return ((nxq) obj).m18142ac();
        }
        return true;
    }

    /* JADX INFO: renamed from: X */
    private final boolean m18223X(Object obj, int i, int i2) {
        return oag.m18356d(obj, (long) (m18242w(i2) & 1048575)) == i;
    }

    /* JADX INFO: renamed from: Y */
    private static boolean m18224Y(Object obj, long j) {
        return ((Boolean) oag.m18360h(obj, j)).booleanValue();
    }

    /* JADX INFO: renamed from: Z */
    private static final int m18225Z(byte[] bArr, int i, int i2, oaj oajVar, Class cls, nwh nwhVar) {
        oaj oajVar2 = oaj.DOUBLE;
        switch (oajVar) {
            case DOUBLE:
                nwhVar.f44828c = Double.valueOf(ntw.m17739y(bArr, i));
                return i + 8;
            case FLOAT:
                nwhVar.f44828c = Float.valueOf(ntw.m17740z(bArr, i));
                return i + 4;
            case f45133c:
            case UINT64:
                int iM17704M = ntw.m17704M(bArr, i, nwhVar);
                nwhVar.f44828c = Long.valueOf(nwhVar.f44827b);
                return iM17704M;
            case INT32:
            case UINT32:
            case ENUM:
                int iM17701J = ntw.m17701J(bArr, i, nwhVar);
                nwhVar.f44828c = Integer.valueOf(nwhVar.f44826a);
                return iM17701J;
            case FIXED64:
            case SFIXED64:
                nwhVar.f44828c = Long.valueOf(ntw.m17708Q(bArr, i));
                return i + 8;
            case FIXED32:
            case SFIXED32:
                nwhVar.f44828c = Integer.valueOf(ntw.m17693B(bArr, i));
                return i + 4;
            case BOOL:
                int iM17704M2 = ntw.m17704M(bArr, i, nwhVar);
                nwhVar.f44828c = Boolean.valueOf(nwhVar.f44827b != 0);
                return iM17704M2;
            case STRING:
                return ntw.m17699H(bArr, i, nwhVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case f45141k:
                return ntw.m17695D(nzf.f45060a.m18259a(cls), bArr, i, i2, nwhVar);
            case BYTES:
                return ntw.m17692A(bArr, i, nwhVar);
            case f45147q:
                int iM17701J2 = ntw.m17701J(bArr, i, nwhVar);
                nwhVar.f44828c = Integer.valueOf(nww.m17873F(nwhVar.f44826a));
                return iM17701J2;
            case SINT64:
                int iM17704M3 = ntw.m17704M(bArr, i, nwhVar);
                nwhVar.f44828c = Long.valueOf(nww.m17875H(nwhVar.f44827b));
                return iM17704M3;
        }
    }

    /* JADX INFO: renamed from: aa */
    private static final int m18226aa(Object obj) {
        return lij.m15423af(obj).m18330a();
    }

    /* JADX INFO: renamed from: ab */
    private final Object m18227ab(Object obj, int i, Object obj2, Object obj3) {
        nxu nxuVarM18202C;
        int iM18235p = m18235p(i);
        Object objM18360h = oag.m18360h(obj, m18200A(m18245z(i)));
        if (objM18360h == null || (nxuVarM18202C = m18202C(i)) == null) {
            return obj2;
        }
        ktz ktzVarM17713V = ntw.m17713V(m18204E(i));
        Iterator it = ((nyr) objM18360h).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!nxuVarM18202C.mo11803a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = lij.m15425ah(obj3);
                }
                int iM15472C = liv.m15472C(ktzVarM17713V, entry.getKey(), entry.getValue());
                nwr nwrVar = nwr.f44839b;
                byte[] bArr = new byte[iM15472C];
                nxb nxbVarM17988ag = nxb.m17988ag(bArr);
                try {
                    liv.m15473D(nxbVarM17988ag, ktzVarM17713V, entry.getKey(), entry.getValue());
                    lij.m15421ad(obj2, iM18235p, ntw.m17738x(nxbVarM17988ag, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: ac */
    private final void m18228ac(liv livVar, int i, Object obj, int i2) {
        if (obj != null) {
            ktz ktzVarM17713V = ntw.m17713V(m18204E(i2));
            Object obj2 = livVar.f38339a;
            Iterator it = ((nyr) obj).entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                ((nxb) livVar.f38339a).mo17929A(i, 2);
                ((nxb) livVar.f38339a).mo17931C(liv.m15472C(ktzVarM17713V, entry.getKey(), entry.getValue()));
                liv.m15473D((nxb) livVar.f38339a, ktzVarM17713V, entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: ad */
    private static final void m18229ad(int i, Object obj, liv livVar) {
        if (obj instanceof String) {
            livVar.m15503z(i, (String) obj);
        } else {
            livVar.m15488k(i, (nwr) obj);
        }
    }

    /* JADX INFO: renamed from: ae */
    private static final void m18230ae(Object obj, liv livVar) {
        lij.m15423af(obj).m18335g(livVar);
    }

    /* JADX INFO: renamed from: d */
    static nzy m18231d(Object obj) {
        nxq nxqVar = (nxq) obj;
        nzy nzyVar = nxqVar.f44981aJ;
        if (nzyVar != nzy.f45105a) {
            return nzyVar;
        }
        nzy nzyVarM18329b = nzy.m18329b();
        nxqVar.f44981aJ = nzyVarM18329b;
        return nzyVarM18329b;
    }

    /* JADX INFO: renamed from: m */
    static nyz m18232m(nyt nytVar, nym nymVar, lij lijVar, ntw ntwVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        Object[] objArr;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Field fieldM18207H;
        int i20;
        char cCharAt9;
        int i21;
        Field fieldM18207H2;
        Field fieldM18207H3;
        int i22;
        char cCharAt10;
        int i23;
        char cCharAt11;
        int i24;
        char cCharAt12;
        int i25;
        char cCharAt13;
        if (!(nytVar instanceof nzh)) {
            throw null;
        }
        nzh nzhVar = (nzh) nytVar;
        int iMo18196c = nzhVar.mo18196c();
        String str = nzhVar.f45067b;
        int length = str.length();
        int i26 = 0;
        int i27 = 55296;
        if (str.charAt(0) >= 55296) {
            int i28 = 1;
            while (true) {
                i = i28 + 1;
                if (str.charAt(i28) < 55296) {
                    break;
                }
                i28 = i;
            }
        } else {
            i = 1;
        }
        int i29 = i + 1;
        int iCharAt3 = str.charAt(i);
        if (iCharAt3 >= 55296) {
            int i30 = iCharAt3 & 8191;
            int i31 = 13;
            while (true) {
                i25 = i29 + 1;
                cCharAt13 = str.charAt(i29);
                if (cCharAt13 < 55296) {
                    break;
                }
                i30 |= (cCharAt13 & 8191) << i31;
                i31 += 13;
                i29 = i25;
            }
            iCharAt3 = i30 | (cCharAt13 << i31);
            i29 = i25;
        }
        if (iCharAt3 == 0) {
            iArr = f45038a;
            i2 = 0;
            i3 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i5 = 0;
            i4 = 0;
        } else {
            int i32 = i29 + 1;
            int iCharAt4 = str.charAt(i29);
            if (iCharAt4 >= 55296) {
                int i33 = iCharAt4 & 8191;
                int i34 = 13;
                while (true) {
                    i13 = i32 + 1;
                    cCharAt8 = str.charAt(i32);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt8 & 8191) << i34;
                    i34 += 13;
                    i32 = i13;
                }
                iCharAt4 = i33 | (cCharAt8 << i34);
                i32 = i13;
            }
            int i35 = i32 + 1;
            int iCharAt5 = str.charAt(i32);
            if (iCharAt5 >= 55296) {
                int i36 = iCharAt5 & 8191;
                int i37 = 13;
                while (true) {
                    i12 = i35 + 1;
                    cCharAt7 = str.charAt(i35);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt7 & 8191) << i37;
                    i37 += 13;
                    i35 = i12;
                }
                iCharAt5 = i36 | (cCharAt7 << i37);
                i35 = i12;
            }
            int i38 = i35 + 1;
            int iCharAt6 = str.charAt(i35);
            if (iCharAt6 >= 55296) {
                int i39 = iCharAt6 & 8191;
                int i40 = 13;
                while (true) {
                    i11 = i38 + 1;
                    cCharAt6 = str.charAt(i38);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt6 & 8191) << i40;
                    i40 += 13;
                    i38 = i11;
                }
                iCharAt6 = i39 | (cCharAt6 << i40);
                i38 = i11;
            }
            int i41 = i38 + 1;
            int iCharAt7 = str.charAt(i38);
            if (iCharAt7 >= 55296) {
                int i42 = iCharAt7 & 8191;
                int i43 = 13;
                while (true) {
                    i10 = i41 + 1;
                    cCharAt5 = str.charAt(i41);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt5 & 8191) << i43;
                    i43 += 13;
                    i41 = i10;
                }
                iCharAt7 = i42 | (cCharAt5 << i43);
                i41 = i10;
            }
            int i44 = i41 + 1;
            iCharAt = str.charAt(i41);
            if (iCharAt >= 55296) {
                int i45 = iCharAt & 8191;
                int i46 = 13;
                while (true) {
                    i9 = i44 + 1;
                    cCharAt4 = str.charAt(i44);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt4 & 8191) << i46;
                    i46 += 13;
                    i44 = i9;
                }
                iCharAt = i45 | (cCharAt4 << i46);
                i44 = i9;
            }
            int i47 = i44 + 1;
            iCharAt2 = str.charAt(i44);
            if (iCharAt2 >= 55296) {
                int i48 = iCharAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i8 = i47 + 1;
                    cCharAt3 = str.charAt(i47);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt3 & 8191) << i49;
                    i49 += 13;
                    i47 = i8;
                }
                iCharAt2 = i48 | (cCharAt3 << i49);
                i47 = i8;
            }
            int i50 = i47 + 1;
            int iCharAt8 = str.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i7 = i50 + 1;
                    cCharAt2 = str.charAt(i50);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt2 & 8191) << i52;
                    i52 += 13;
                    i50 = i7;
                }
                iCharAt8 = i51 | (cCharAt2 << i52);
                i50 = i7;
            }
            int i53 = i50 + 1;
            int iCharAt9 = str.charAt(i50);
            if (iCharAt9 >= 55296) {
                int i54 = iCharAt9 & 8191;
                int i55 = i53;
                int i56 = 13;
                while (true) {
                    i6 = i55 + 1;
                    cCharAt = str.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i54 |= (cCharAt & 8191) << i56;
                    i56 += 13;
                    i55 = i6;
                }
                iCharAt9 = i54 | (cCharAt << i56);
                i53 = i6;
            }
            int i57 = iCharAt9 + iCharAt2 + iCharAt8;
            int i58 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[i57];
            i26 = iCharAt4;
            iArr = iArr2;
            i2 = iCharAt6;
            i3 = i58;
            i4 = iCharAt9;
            i29 = i53;
            i5 = iCharAt7;
        }
        Unsafe unsafe = f45039b;
        Object[] objArr2 = nzhVar.f45068c;
        Class<?> cls = nzhVar.f45066a.getClass();
        int i59 = i4 + iCharAt2;
        int i60 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i60];
        int i61 = i4;
        int i62 = i59;
        int i63 = 0;
        int i64 = 0;
        while (true) {
            boolean z = iMo18196c == 2;
            if (i29 >= length) {
                return new nyz(iArr3, objArr3, i2, i5, nzhVar.f45066a, z, iArr, i4, i59, nymVar, lijVar, ntwVar, null, null, null, null);
            }
            int i65 = i29 + 1;
            int iCharAt10 = str.charAt(i29);
            if (iCharAt10 >= i27) {
                int i66 = iCharAt10 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i24 = i67 + 1;
                    cCharAt12 = str.charAt(i67);
                    i14 = iMo18196c;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i24;
                    iMo18196c = i14;
                }
                iCharAt10 = i66 | (cCharAt12 << i68);
                i15 = i24;
            } else {
                i14 = iMo18196c;
                i15 = i65;
            }
            int i69 = i15 + 1;
            int iCharAt11 = str.charAt(i15);
            int i70 = length;
            char c = 55296;
            if (iCharAt11 >= 55296) {
                int i71 = iCharAt11 & 8191;
                int i72 = 13;
                while (true) {
                    i23 = i69 + 1;
                    cCharAt11 = str.charAt(i69);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i72;
                    i72 += 13;
                    i69 = i23;
                    c = 55296;
                }
                iCharAt11 = i71 | (cCharAt11 << i72);
                i69 = i23;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i64;
                i63++;
            }
            int i73 = iCharAt11 & 255;
            int i74 = i5;
            if (i73 >= 51) {
                int i75 = i69 + 1;
                int iCharAt12 = str.charAt(i69);
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i22 = i77 + 1;
                        cCharAt10 = str.charAt(i77);
                        i16 = i2;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i76 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i77 = i22;
                        i2 = i16;
                    }
                    iCharAt12 = i76 | (cCharAt10 << i78);
                    i21 = i22;
                } else {
                    i16 = i2;
                    i21 = i75;
                }
                int i79 = i73 - 51;
                int i80 = i21;
                if (i79 == 9 || i79 == 17) {
                    int i81 = i64 / 3;
                    objArr3[i81 + i81 + 1] = objArr2[i3];
                    i3++;
                } else if (i79 == 12 && !z) {
                    int i82 = i64 / 3;
                    objArr3[i82 + i82 + 1] = objArr2[i3];
                    i3++;
                }
                int i83 = iCharAt12 + iCharAt12;
                Object obj = objArr2[i83];
                if (obj instanceof Field) {
                    fieldM18207H2 = (Field) obj;
                } else {
                    fieldM18207H2 = m18207H(cls, (String) obj);
                    objArr2[i83] = fieldM18207H2;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM18207H2);
                int i84 = i83 + 1;
                Object obj2 = objArr2[i84];
                if (obj2 instanceof Field) {
                    fieldM18207H3 = (Field) obj2;
                } else {
                    fieldM18207H3 = m18207H(cls, (String) obj2);
                    objArr2[i84] = fieldM18207H3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM18207H3);
                str = str;
                i19 = i3;
                objArr = objArr2;
                i17 = i80;
                i18 = 0;
            } else {
                i16 = i2;
                int i85 = i3 + 1;
                Field fieldM18207H4 = m18207H(cls, (String) objArr2[i3]);
                if (i73 == 9 || i73 == 17) {
                    int i86 = i64 / 3;
                    objArr3[i86 + i86 + 1] = fieldM18207H4.getType();
                } else if (i73 == 27 || i73 == 49) {
                    int i87 = i64 / 3;
                    objArr3[i87 + i87 + 1] = objArr2[i85];
                    i85++;
                } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                    if (!z) {
                        int i88 = i64 / 3;
                        objArr3[i88 + i88 + 1] = objArr2[i85];
                        i85++;
                    }
                } else if (i73 == 50) {
                    int i89 = i61 + 1;
                    iArr[i61] = i64;
                    int i90 = i64 / 3;
                    int i91 = i85 + 1;
                    int i92 = i90 + i90;
                    objArr3[i92] = objArr2[i85];
                    if ((iCharAt11 & 2048) != 0) {
                        i85 = i91 + 1;
                        objArr3[i92 + 1] = objArr2[i91];
                        i61 = i89;
                    } else {
                        i85 = i91;
                        i61 = i89;
                    }
                }
                objArr = objArr2;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM18207H4);
                int iObjectFieldOffset4 = 1048575;
                if ((iCharAt11 & 4096) != 4096 || i73 > 17) {
                    i17 = i69;
                    i18 = 0;
                } else {
                    i17 = i69 + 1;
                    int iCharAt13 = str.charAt(i69);
                    if (iCharAt13 >= 55296) {
                        int i93 = iCharAt13 & 8191;
                        int i94 = 13;
                        while (true) {
                            i20 = i17 + 1;
                            cCharAt9 = str.charAt(i17);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i93 |= (cCharAt9 & 8191) << i94;
                            i94 += 13;
                            i17 = i20;
                        }
                        iCharAt13 = i93 | (cCharAt9 << i94);
                        i17 = i20;
                    }
                    int i95 = i26 + i26 + (iCharAt13 / 32);
                    Object obj3 = objArr[i95];
                    if (obj3 instanceof Field) {
                        fieldM18207H = (Field) obj3;
                    } else {
                        fieldM18207H = m18207H(cls, (String) obj3);
                        objArr[i95] = fieldM18207H;
                    }
                    i18 = iCharAt13 % 32;
                    iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM18207H);
                }
                if (i73 < 18 || i73 > 49) {
                    i19 = i85;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                } else {
                    iArr[i62] = iObjectFieldOffset3;
                    i62++;
                    i19 = i85;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    iObjectFieldOffset2 = iObjectFieldOffset4;
                }
            }
            int i96 = i64 + 1;
            iArr3[i64] = iCharAt10;
            int i97 = i96 + 1;
            iArr3[i96] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i73 << 20) | iObjectFieldOffset;
            i64 = i97 + 1;
            iArr3[i97] = (i18 << 20) | iObjectFieldOffset2;
            i29 = i17;
            objArr2 = objArr;
            length = i70;
            i5 = i74;
            iMo18196c = i14;
            i2 = i16;
            i27 = 55296;
            i3 = i19;
            str = str;
        }
    }

    /* JADX INFO: renamed from: n */
    private static double m18233n(Object obj, long j) {
        return ((Double) oag.m18360h(obj, j)).doubleValue();
    }

    /* JADX INFO: renamed from: o */
    private static float m18234o(Object obj, long j) {
        return ((Float) oag.m18360h(obj, j)).floatValue();
    }

    /* JADX INFO: renamed from: p */
    private final int m18235p(int i) {
        return this.f45040c[i];
    }

    /* JADX INFO: renamed from: q */
    private static int m18236q(Object obj, long j) {
        return ((Integer) oag.m18360h(obj, j)).intValue();
    }

    /* JADX INFO: renamed from: r */
    private final int m18237r(Object obj, byte[] bArr, int i, int i2, int i3, long j, nwh nwhVar) throws nyb {
        Unsafe unsafe = f45039b;
        Object objM18204E = m18204E(i3);
        Object object = unsafe.getObject(obj, j);
        if (ntw.m17730p(object)) {
            Object objM17732r = ntw.m17732r();
            ntw.m17731q(objM17732r, object);
            unsafe.putObject(obj, j, objM17732r);
            object = objM17732r;
        }
        ktz ktzVarM17713V = ntw.m17713V(objM18204E);
        nyr nyrVar = (nyr) object;
        int iM17701J = ntw.m17701J(bArr, i, nwhVar);
        int i4 = nwhVar.f44826a;
        if (i4 < 0 || i4 > i2 - iM17701J) {
            throw nyb.m18167i();
        }
        int i5 = iM17701J + i4;
        Object obj2 = ktzVarM17713V.f37200c;
        Object obj3 = ktzVarM17713V.f37199b;
        while (iM17701J < i5) {
            int iM17702K = iM17701J + 1;
            int i6 = bArr[iM17701J];
            if (i6 < 0) {
                iM17702K = ntw.m17702K(i6, bArr, iM17702K, nwhVar);
                i6 = nwhVar.f44826a;
            }
            int i7 = i6 & 7;
            switch (i6 >>> 3) {
                case 1:
                    oaj oajVar = (oaj) ktzVarM17713V.f37201d;
                    if (i7 != oajVar.f45151t) {
                        iM17701J = ntw.m17707P(i6, bArr, iM17702K, i2, nwhVar);
                    } else {
                        iM17701J = m18225Z(bArr, iM17702K, i2, oajVar, null, nwhVar);
                        obj2 = nwhVar.f44828c;
                    }
                    break;
                case 2:
                    oaj oajVar2 = (oaj) ktzVarM17713V.f37198a;
                    if (i7 != oajVar2.f45151t) {
                        iM17701J = ntw.m17707P(i6, bArr, iM17702K, i2, nwhVar);
                    } else {
                        iM17701J = m18225Z(bArr, iM17702K, i2, oajVar2, ktzVarM17713V.f37199b.getClass(), nwhVar);
                        obj3 = nwhVar.f44828c;
                    }
                    break;
                default:
                    iM17701J = ntw.m17707P(i6, bArr, iM17702K, i2, nwhVar);
                    break;
            }
        }
        if (iM17701J != i5) {
            throw nyb.m18165g();
        }
        nyrVar.put(obj2, obj3);
        return i5;
    }

    /* JADX INFO: renamed from: s */
    private final int m18238s(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, nwh nwhVar) throws nyb {
        Unsafe unsafe = f45039b;
        long j2 = this.f45040c[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(ntw.m17739y(bArr, i)));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(ntw.m17740z(bArr, i)));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iM17704M = ntw.m17704M(bArr, i, nwhVar);
                unsafe.putObject(obj, j, Long.valueOf(nwhVar.f44827b));
                unsafe.putInt(obj, j2, i4);
                return iM17704M;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iM17701J = ntw.m17701J(bArr, i, nwhVar);
                unsafe.putObject(obj, j, Integer.valueOf(nwhVar.f44826a));
                unsafe.putInt(obj, j2, i4);
                return iM17701J;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(ntw.m17708Q(bArr, i)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(ntw.m17693B(bArr, i)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iM17704M2 = ntw.m17704M(bArr, i, nwhVar);
                unsafe.putObject(obj, j, Boolean.valueOf(nwhVar.f44827b != 0));
                unsafe.putInt(obj, j2, i4);
                return iM17704M2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iM17701J2 = ntw.m17701J(bArr, i, nwhVar);
                int i13 = nwhVar.f44826a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, hsSUWRJfoeC.LqreK);
                } else {
                    if ((i6 & 536870912) != 0 && !oai.m18385g(bArr, iM17701J2, iM17701J2 + i13)) {
                        throw nyb.m18162d();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iM17701J2, i13, nxz.f44985a));
                    iM17701J2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iM17701J2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objM18206G = m18206G(obj, i4, i8);
                int iM17706O = ntw.m17706O(objM18206G, m18203D(i8), bArr, i, i2, nwhVar);
                m18216Q(obj, i4, i8, objM18206G);
                return iM17706O;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iM17692A = ntw.m17692A(bArr, i, nwhVar);
                unsafe.putObject(obj, j, nwhVar.f44828c);
                unsafe.putInt(obj, j2, i4);
                return iM17692A;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iM17701J3 = ntw.m17701J(bArr, i, nwhVar);
                int i14 = nwhVar.f44826a;
                nxu nxuVarM18202C = m18202C(i8);
                if (nxuVarM18202C == null || nxuVarM18202C.mo11803a(i14)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i14));
                    unsafe.putInt(obj, j2, i4);
                } else {
                    m18231d(obj).m18334f(i3, Long.valueOf(i14));
                }
                return iM17701J3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iM17701J4 = ntw.m17701J(bArr, i, nwhVar);
                unsafe.putObject(obj, j, Integer.valueOf(nww.m17873F(nwhVar.f44826a)));
                unsafe.putInt(obj, j2, i4);
                return iM17701J4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iM17704M3 = ntw.m17704M(bArr, i, nwhVar);
                unsafe.putObject(obj, j, Long.valueOf(nww.m17875H(nwhVar.f44827b)));
                unsafe.putInt(obj, j2, i4);
                return iM17704M3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                Object objM18206G2 = m18206G(obj, i4, i8);
                int iM17705N = ntw.m17705N(objM18206G2, m18203D(i8), bArr, i, i2, (i3 & (-8)) | 4, nwhVar);
                m18216Q(obj, i4, i8, objM18206G2);
                return iM17705N;
            default:
                return i;
        }
    }

    /* JADX INFO: renamed from: t */
    private final int m18239t(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, nwh nwhVar) throws nyb {
        int iM17703L;
        int iM17701J = i;
        Unsafe unsafe = f45039b;
        nxy nxyVarMo17775e = (nxy) unsafe.getObject(obj, j2);
        if (!nxyVarMo17775e.mo17770c()) {
            int size = nxyVarMo17775e.size();
            nxyVarMo17775e = nxyVarMo17775e.mo17775e(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, nxyVarMo17775e);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    nxc nxcVar = (nxc) nxyVarMo17775e;
                    int iM17701J2 = ntw.m17701J(bArr, iM17701J, nwhVar);
                    int i8 = nwhVar.f44826a + iM17701J2;
                    while (iM17701J2 < i8) {
                        nxcVar.m18010d(ntw.m17739y(bArr, iM17701J2));
                        iM17701J2 += 8;
                    }
                    if (iM17701J2 == i8) {
                        return iM17701J2;
                    }
                    throw nyb.m18167i();
                }
                if (i5 == 1) {
                    nxc nxcVar2 = (nxc) nxyVarMo17775e;
                    nxcVar2.m18010d(ntw.m17739y(bArr, i));
                    int i9 = iM17701J + 8;
                    while (i9 < i2) {
                        int iM17701J3 = ntw.m17701J(bArr, i9, nwhVar);
                        if (i3 != nwhVar.f44826a) {
                            return i9;
                        }
                        nxcVar2.m18010d(ntw.m17739y(bArr, iM17701J3));
                        i9 = iM17701J3 + 8;
                    }
                    return i9;
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    nxj nxjVar = (nxj) nxyVarMo17775e;
                    int iM17701J4 = ntw.m17701J(bArr, iM17701J, nwhVar);
                    int i10 = nwhVar.f44826a + iM17701J4;
                    while (iM17701J4 < i10) {
                        nxjVar.mo18034g(ntw.m17740z(bArr, iM17701J4));
                        iM17701J4 += 4;
                    }
                    if (iM17701J4 == i10) {
                        return iM17701J4;
                    }
                    throw nyb.m18167i();
                }
                if (i5 == 5) {
                    nxj nxjVar2 = (nxj) nxyVarMo17775e;
                    nxjVar2.mo18034g(ntw.m17740z(bArr, i));
                    int i11 = iM17701J + 4;
                    while (i11 < i2) {
                        int iM17701J5 = ntw.m17701J(bArr, i11, nwhVar);
                        if (i3 != nwhVar.f44826a) {
                            return i11;
                        }
                        nxjVar2.mo18034g(ntw.m17740z(bArr, iM17701J5));
                        i11 = iM17701J5 + 4;
                    }
                    return i11;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    nyn nynVar = (nyn) nxyVarMo17775e;
                    int iM17701J6 = ntw.m17701J(bArr, iM17701J, nwhVar);
                    int i12 = nwhVar.f44826a + iM17701J6;
                    while (iM17701J6 < i12) {
                        iM17701J6 = ntw.m17704M(bArr, iM17701J6, nwhVar);
                        nynVar.mo18151f(nwhVar.f44827b);
                    }
                    if (iM17701J6 == i12) {
                        return iM17701J6;
                    }
                    throw nyb.m18167i();
                }
                if (i5 == 0) {
                    nyn nynVar2 = (nyn) nxyVarMo17775e;
                    int iM17704M = ntw.m17704M(bArr, iM17701J, nwhVar);
                    nynVar2.mo18151f(nwhVar.f44827b);
                    while (iM17704M < i2) {
                        int iM17701J7 = ntw.m17701J(bArr, iM17704M, nwhVar);
                        if (i3 != nwhVar.f44826a) {
                            return iM17704M;
                        }
                        iM17704M = ntw.m17704M(bArr, iM17701J7, nwhVar);
                        nynVar2.mo18151f(nwhVar.f44827b);
                    }
                    return iM17704M;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return ntw.m17697F(bArr, iM17701J, nxyVarMo17775e, nwhVar);
                }
                if (i5 == 0) {
                    return ntw.m17703L(i3, bArr, i, i2, nxyVarMo17775e, nwhVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    nyn nynVar3 = (nyn) nxyVarMo17775e;
                    int iM17701J8 = ntw.m17701J(bArr, iM17701J, nwhVar);
                    int i13 = nwhVar.f44826a + iM17701J8;
                    while (iM17701J8 < i13) {
                        nynVar3.mo18151f(ntw.m17708Q(bArr, iM17701J8));
                        iM17701J8 += 8;
                    }
                    if (iM17701J8 == i13) {
                        return iM17701J8;
                    }
                    throw nyb.m18167i();
                }
                if (i5 == 1) {
                    nyn nynVar4 = (nyn) nxyVarMo17775e;
                    nynVar4.mo18151f(ntw.m17708Q(bArr, i));
                    int i14 = iM17701J + 8;
                    while (i14 < i2) {
                        int iM17701J9 = ntw.m17701J(bArr, i14, nwhVar);
                        if (i3 != nwhVar.f44826a) {
                            return i14;
                        }
                        nynVar4.mo18151f(ntw.m17708Q(bArr, iM17701J9));
                        i14 = iM17701J9 + 8;
                    }
                    return i14;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    nxr nxrVar = (nxr) nxyVarMo17775e;
                    int iM17701J10 = ntw.m17701J(bArr, iM17701J, nwhVar);
                    int i15 = nwhVar.f44826a + iM17701J10;
                    while (iM17701J10 < i15) {
                        nxrVar.mo18148g(ntw.m17693B(bArr, iM17701J10));
                        iM17701J10 += 4;
                    }
                    if (iM17701J10 == i15) {
                        return iM17701J10;
                    }
                    throw nyb.m18167i();
                }
                if (i5 == 5) {
                    nxr nxrVar2 = (nxr) nxyVarMo17775e;
                    nxrVar2.mo18148g(ntw.m17693B(bArr, i));
                    int i16 = iM17701J + 4;
                    while (i16 < i2) {
                        int iM17701J11 = ntw.m17701J(bArr, i16, nwhVar);
                        if (i3 != nwhVar.f44826a) {
                            return i16;
                        }
                        nxrVar2.mo18148g(ntw.m17693B(bArr, iM17701J11));
                        i16 = iM17701J11 + 4;
                    }
                    return i16;
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    nwj nwjVar = (nwj) nxyVarMo17775e;
                    int iM17701J12 = ntw.m17701J(bArr, iM17701J, nwhVar);
                    int i17 = nwhVar.f44826a + iM17701J12;
                    while (iM17701J12 < i17) {
                        iM17701J12 = ntw.m17704M(bArr, iM17701J12, nwhVar);
                        nwjVar.mo17776f(nwhVar.f44827b != 0);
                    }
                    if (iM17701J12 == i17) {
                        return iM17701J12;
                    }
                    throw nyb.m18167i();
                }
                if (i5 == 0) {
                    nwj nwjVar2 = (nwj) nxyVarMo17775e;
                    int iM17704M2 = ntw.m17704M(bArr, iM17701J, nwhVar);
                    nwjVar2.mo17776f(nwhVar.f44827b != 0);
                    while (iM17704M2 < i2) {
                        int iM17701J13 = ntw.m17701J(bArr, iM17704M2, nwhVar);
                        if (i3 != nwhVar.f44826a) {
                            return iM17704M2;
                        }
                        iM17704M2 = ntw.m17704M(bArr, iM17701J13, nwhVar);
                        nwjVar2.mo17776f(nwhVar.f44827b != 0);
                    }
                    return iM17704M2;
                }
                break;
            case 26:
                if (i5 == 2) {
                    long j3 = j & 536870912;
                    String str = JrxsYuVZZqnFC.UdcEbL;
                    if (j3 == 0) {
                        iM17701J = ntw.m17701J(bArr, iM17701J, nwhVar);
                        int i18 = nwhVar.f44826a;
                        if (i18 < 0) {
                            throw nyb.m18164f();
                        }
                        if (i18 == 0) {
                            nxyVarMo17775e.add(str);
                        } else {
                            nxyVarMo17775e.add(new String(bArr, iM17701J, i18, nxz.f44985a));
                            iM17701J += i18;
                        }
                        while (iM17701J < i2) {
                            int iM17701J14 = ntw.m17701J(bArr, iM17701J, nwhVar);
                            if (i3 != nwhVar.f44826a) {
                                break;
                            } else {
                                iM17701J = ntw.m17701J(bArr, iM17701J14, nwhVar);
                                int i19 = nwhVar.f44826a;
                                if (i19 < 0) {
                                    throw nyb.m18164f();
                                }
                                if (i19 == 0) {
                                    nxyVarMo17775e.add(str);
                                } else {
                                    nxyVarMo17775e.add(new String(bArr, iM17701J, i19, nxz.f44985a));
                                    iM17701J += i19;
                                }
                            }
                        }
                    } else {
                        iM17701J = ntw.m17701J(bArr, iM17701J, nwhVar);
                        int i20 = nwhVar.f44826a;
                        if (i20 < 0) {
                            throw nyb.m18164f();
                        }
                        if (i20 == 0) {
                            nxyVarMo17775e.add(str);
                        } else {
                            int i21 = iM17701J + i20;
                            if (!oai.m18385g(bArr, iM17701J, i21)) {
                                throw nyb.m18162d();
                            }
                            nxyVarMo17775e.add(new String(bArr, iM17701J, i20, nxz.f44985a));
                            iM17701J = i21;
                        }
                        while (iM17701J < i2) {
                            int iM17701J15 = ntw.m17701J(bArr, iM17701J, nwhVar);
                            if (i3 != nwhVar.f44826a) {
                                break;
                            } else {
                                iM17701J = ntw.m17701J(bArr, iM17701J15, nwhVar);
                                int i22 = nwhVar.f44826a;
                                if (i22 < 0) {
                                    throw nyb.m18164f();
                                }
                                if (i22 == 0) {
                                    nxyVarMo17775e.add(str);
                                } else {
                                    int i23 = iM17701J + i22;
                                    if (!oai.m18385g(bArr, iM17701J, i23)) {
                                        throw nyb.m18162d();
                                    }
                                    nxyVarMo17775e.add(new String(bArr, iM17701J, i22, nxz.f44985a));
                                    iM17701J = i23;
                                }
                            }
                        }
                    }
                }
                break;
            case 27:
                if (i5 == 2) {
                    return ntw.m17696E(m18203D(i6), i3, bArr, i, i2, nxyVarMo17775e, nwhVar);
                }
                break;
            case 28:
                if (i5 == 2) {
                    int iM17701J16 = ntw.m17701J(bArr, iM17701J, nwhVar);
                    int i24 = nwhVar.f44826a;
                    if (i24 < 0) {
                        throw nyb.m18164f();
                    }
                    if (i24 > bArr.length - iM17701J16) {
                        throw nyb.m18167i();
                    }
                    if (i24 == 0) {
                        nxyVarMo17775e.add(nwr.f44839b);
                    } else {
                        nxyVarMo17775e.add(nwr.m17800v(bArr, iM17701J16, i24));
                        iM17701J16 += i24;
                    }
                    while (iM17701J16 < i2) {
                        int iM17701J17 = ntw.m17701J(bArr, iM17701J16, nwhVar);
                        if (i3 != nwhVar.f44826a) {
                            return iM17701J16;
                        }
                        iM17701J16 = ntw.m17701J(bArr, iM17701J17, nwhVar);
                        int i25 = nwhVar.f44826a;
                        if (i25 < 0) {
                            throw nyb.m18164f();
                        }
                        if (i25 > bArr.length - iM17701J16) {
                            throw nyb.m18167i();
                        }
                        if (i25 == 0) {
                            nxyVarMo17775e.add(nwr.f44839b);
                        } else {
                            nxyVarMo17775e.add(nwr.m17800v(bArr, iM17701J16, i25));
                            iM17701J16 += i25;
                        }
                    }
                    return iM17701J16;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    iM17703L = ntw.m17697F(bArr, iM17701J, nxyVarMo17775e, nwhVar);
                } else if (i5 == 0) {
                    iM17703L = ntw.m17703L(i3, bArr, i, i2, nxyVarMo17775e, nwhVar);
                }
                nzn.m18289V(obj, i4, nxyVarMo17775e, m18202C(i6), null, this.f45052o);
                return iM17703L;
            case 33:
            case 47:
                if (i5 == 2) {
                    nxr nxrVar3 = (nxr) nxyVarMo17775e;
                    int iM17701J18 = ntw.m17701J(bArr, iM17701J, nwhVar);
                    int i26 = nwhVar.f44826a + iM17701J18;
                    while (iM17701J18 < i26) {
                        iM17701J18 = ntw.m17701J(bArr, iM17701J18, nwhVar);
                        nxrVar3.mo18148g(nww.m17873F(nwhVar.f44826a));
                    }
                    if (iM17701J18 == i26) {
                        return iM17701J18;
                    }
                    throw nyb.m18167i();
                }
                if (i5 == 0) {
                    nxr nxrVar4 = (nxr) nxyVarMo17775e;
                    int iM17701J19 = ntw.m17701J(bArr, iM17701J, nwhVar);
                    nxrVar4.mo18148g(nww.m17873F(nwhVar.f44826a));
                    while (iM17701J19 < i2) {
                        int iM17701J20 = ntw.m17701J(bArr, iM17701J19, nwhVar);
                        if (i3 != nwhVar.f44826a) {
                            return iM17701J19;
                        }
                        iM17701J19 = ntw.m17701J(bArr, iM17701J20, nwhVar);
                        nxrVar4.mo18148g(nww.m17873F(nwhVar.f44826a));
                    }
                    return iM17701J19;
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    nyn nynVar5 = (nyn) nxyVarMo17775e;
                    int iM17701J21 = ntw.m17701J(bArr, iM17701J, nwhVar);
                    int i27 = nwhVar.f44826a + iM17701J21;
                    while (iM17701J21 < i27) {
                        iM17701J21 = ntw.m17704M(bArr, iM17701J21, nwhVar);
                        nynVar5.mo18151f(nww.m17875H(nwhVar.f44827b));
                    }
                    if (iM17701J21 == i27) {
                        return iM17701J21;
                    }
                    throw nyb.m18167i();
                }
                if (i5 == 0) {
                    nyn nynVar6 = (nyn) nxyVarMo17775e;
                    int iM17704M3 = ntw.m17704M(bArr, iM17701J, nwhVar);
                    nynVar6.mo18151f(nww.m17875H(nwhVar.f44827b));
                    while (iM17704M3 < i2) {
                        int iM17701J22 = ntw.m17701J(bArr, iM17704M3, nwhVar);
                        if (i3 != nwhVar.f44826a) {
                            return iM17704M3;
                        }
                        iM17704M3 = ntw.m17704M(bArr, iM17701J22, nwhVar);
                        nynVar6.mo18151f(nww.m17875H(nwhVar.f44827b));
                    }
                    return iM17704M3;
                }
                break;
            default:
                if (i5 == 3) {
                    nzm nzmVarM18203D = m18203D(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int iM17694C = ntw.m17694C(nzmVarM18203D, bArr, i, i2, i28, nwhVar);
                    nxyVarMo17775e.add(nwhVar.f44828c);
                    while (iM17694C < i2) {
                        int iM17701J23 = ntw.m17701J(bArr, iM17694C, nwhVar);
                        if (i3 != nwhVar.f44826a) {
                            return iM17694C;
                        }
                        iM17694C = ntw.m17694C(nzmVarM18203D, bArr, iM17701J23, i2, i28, nwhVar);
                        nxyVarMo17775e.add(nwhVar.f44828c);
                    }
                    return iM17694C;
                }
                break;
        }
        return iM17701J;
    }

    /* JADX INFO: renamed from: u */
    private final int m18240u(int i) {
        if (i < this.f45042e || i > this.f45043f) {
            return -1;
        }
        return m18243x(i, 0);
    }

    /* JADX INFO: renamed from: v */
    private final int m18241v(int i, int i2) {
        if (i < this.f45042e || i > this.f45043f) {
            return -1;
        }
        return m18243x(i, i2);
    }

    /* JADX INFO: renamed from: w */
    private final int m18242w(int i) {
        return this.f45040c[i + 2];
    }

    /* JADX INFO: renamed from: x */
    private final int m18243x(int i, int i2) {
        int length = (this.f45040c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iM18235p = m18235p(i4);
            if (i == iM18235p) {
                return i4;
            }
            if (i < iM18235p) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    private static int m18244y(int i) {
        return (i >>> 20) & 255;
    }

    /* JADX INFO: renamed from: z */
    private final int m18245z(int i) {
        return this.f45040c[i + 1];
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: b */
    public final int mo18247b(Object obj) {
        int length = this.f45040c.length;
        int iM18153b = 0;
        for (int i = 0; i < length; i += 3) {
            int iM18245z = m18245z(i);
            int iM18235p = m18235p(i);
            long jM18200A = m18200A(iM18245z);
            switch (m18244y(iM18245z)) {
                case 0:
                    iM18153b = (iM18153b * 53) + nxz.m18153b(Double.doubleToLongBits(oag.m18354b(obj, jM18200A)));
                    break;
                case 1:
                    iM18153b = (iM18153b * 53) + Float.floatToIntBits(oag.m18355c(obj, jM18200A));
                    break;
                case 2:
                    iM18153b = (iM18153b * 53) + nxz.m18153b(oag.m18358f(obj, jM18200A));
                    break;
                case 3:
                    iM18153b = (iM18153b * 53) + nxz.m18153b(oag.m18358f(obj, jM18200A));
                    break;
                case 4:
                    iM18153b = (iM18153b * 53) + oag.m18356d(obj, jM18200A);
                    break;
                case 5:
                    iM18153b = (iM18153b * 53) + nxz.m18153b(oag.m18358f(obj, jM18200A));
                    break;
                case 6:
                    iM18153b = (iM18153b * 53) + oag.m18356d(obj, jM18200A);
                    break;
                case 7:
                    iM18153b = (iM18153b * 53) + nxz.m18152a(oag.m18375w(obj, jM18200A));
                    break;
                case 8:
                    iM18153b = (iM18153b * 53) + ((String) oag.m18360h(obj, jM18200A)).hashCode();
                    break;
                case 9:
                    Object objM18360h = oag.m18360h(obj, jM18200A);
                    iM18153b = (iM18153b * 53) + (objM18360h != null ? objM18360h.hashCode() : 37);
                    break;
                case 10:
                    iM18153b = (iM18153b * 53) + oag.m18360h(obj, jM18200A).hashCode();
                    break;
                case 11:
                    iM18153b = (iM18153b * 53) + oag.m18356d(obj, jM18200A);
                    break;
                case 12:
                    iM18153b = (iM18153b * 53) + oag.m18356d(obj, jM18200A);
                    break;
                case 13:
                    iM18153b = (iM18153b * 53) + oag.m18356d(obj, jM18200A);
                    break;
                case 14:
                    iM18153b = (iM18153b * 53) + nxz.m18153b(oag.m18358f(obj, jM18200A));
                    break;
                case 15:
                    iM18153b = (iM18153b * 53) + oag.m18356d(obj, jM18200A);
                    break;
                case 16:
                    iM18153b = (iM18153b * 53) + nxz.m18153b(oag.m18358f(obj, jM18200A));
                    break;
                case 17:
                    Object objM18360h2 = oag.m18360h(obj, jM18200A);
                    iM18153b = (iM18153b * 53) + (objM18360h2 != null ? objM18360h2.hashCode() : 37);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    iM18153b = (iM18153b * 53) + oag.m18360h(obj, jM18200A).hashCode();
                    break;
                case 50:
                    iM18153b = (iM18153b * 53) + oag.m18360h(obj, jM18200A).hashCode();
                    break;
                case 51:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + nxz.m18153b(Double.doubleToLongBits(m18233n(obj, jM18200A)));
                    }
                    break;
                case 52:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + Float.floatToIntBits(m18234o(obj, jM18200A));
                    }
                    break;
                case 53:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + nxz.m18153b(m18201B(obj, jM18200A));
                    }
                    break;
                case 54:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + nxz.m18153b(m18201B(obj, jM18200A));
                    }
                    break;
                case 55:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + m18236q(obj, jM18200A);
                    }
                    break;
                case 56:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + nxz.m18153b(m18201B(obj, jM18200A));
                    }
                    break;
                case 57:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + m18236q(obj, jM18200A);
                    }
                    break;
                case 58:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + nxz.m18152a(m18224Y(obj, jM18200A));
                    }
                    break;
                case 59:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + ((String) oag.m18360h(obj, jM18200A)).hashCode();
                    }
                    break;
                case 60:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + oag.m18360h(obj, jM18200A).hashCode();
                    }
                    break;
                case 61:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + oag.m18360h(obj, jM18200A).hashCode();
                    }
                    break;
                case 62:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + m18236q(obj, jM18200A);
                    }
                    break;
                case 63:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + m18236q(obj, jM18200A);
                    }
                    break;
                case 64:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + m18236q(obj, jM18200A);
                    }
                    break;
                case 65:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + nxz.m18153b(m18201B(obj, jM18200A));
                    }
                    break;
                case 66:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + m18236q(obj, jM18200A);
                    }
                    break;
                case 67:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + nxz.m18153b(m18201B(obj, jM18200A));
                    }
                    break;
                case 68:
                    if (m18223X(obj, iM18235p, i)) {
                        iM18153b = (iM18153b * 53) + oag.m18360h(obj, jM18200A).hashCode();
                    }
                    break;
            }
        }
        int iHashCode = (iM18153b * 53) + lij.m15423af(obj).hashCode();
        return this.f45045h ? (iHashCode * 53) + ntw.m17734t(obj).hashCode() : iHashCode;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17561. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: c */
    public final int m18248c(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, p000.nwh r36) {
        /*
            Method dump skipped, instruction units count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.nyz.m18248c(java.lang.Object, byte[], int, int, int, nwh):int");
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: e */
    public final Object mo18249e() {
        return ((nxq) this.f45044g).m18138P();
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: f */
    public final void mo18250f(Object obj) {
        if (m18222W(obj)) {
            if (obj instanceof nxq) {
                nxq nxqVar = (nxq) obj;
                nxqVar.f44980aI = (nxqVar.f44980aI & Integer.MIN_VALUE) | Integer.MAX_VALUE;
                nxqVar.f44820aG = 0;
                nxqVar.m18141Z();
            }
            int length = this.f45040c.length;
            for (int i = 0; i < length; i += 3) {
                int iM18245z = m18245z(i);
                long jM18200A = m18200A(iM18245z);
                switch (m18244y(iM18245z)) {
                    case 9:
                    case 17:
                        if (m18219T(obj, i)) {
                            m18203D(i).mo18250f(f45039b.getObject(obj, jM18200A));
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f45051n.mo18182c(obj, jM18200A);
                        break;
                    case 50:
                        Unsafe unsafe = f45039b;
                        Object object = unsafe.getObject(obj, jM18200A);
                        if (object != null) {
                            ((nyr) object).m18193c();
                            unsafe.putObject(obj, jM18200A, object);
                        }
                        break;
                }
            }
            lij.m15426ai(obj);
            if (this.f45045h) {
                ntw.m17737w(obj);
            }
        }
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: g */
    public final void mo18251g(Object obj, Object obj2) {
        m18209J(obj);
        if (obj2 == null) {
            throw null;
        }
        for (int i = 0; i < this.f45040c.length; i += 3) {
            int iM18245z = m18245z(i);
            long jM18200A = m18200A(iM18245z);
            int iM18235p = m18235p(i);
            switch (m18244y(iM18245z)) {
                case 0:
                    if (m18219T(obj2, i)) {
                        oag.m18369q(obj, jM18200A, oag.m18354b(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 1:
                    if (m18219T(obj2, i)) {
                        oag.m18370r(obj, jM18200A, oag.m18355c(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 2:
                    if (m18219T(obj2, i)) {
                        oag.m18372t(obj, jM18200A, oag.m18358f(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 3:
                    if (m18219T(obj2, i)) {
                        oag.m18372t(obj, jM18200A, oag.m18358f(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 4:
                    if (m18219T(obj2, i)) {
                        oag.m18371s(obj, jM18200A, oag.m18356d(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 5:
                    if (m18219T(obj2, i)) {
                        oag.m18372t(obj, jM18200A, oag.m18358f(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 6:
                    if (m18219T(obj2, i)) {
                        oag.m18371s(obj, jM18200A, oag.m18356d(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 7:
                    if (m18219T(obj2, i)) {
                        oag.m18365m(obj, jM18200A, oag.m18375w(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 8:
                    if (m18219T(obj2, i)) {
                        oag.m18373u(obj, jM18200A, oag.m18360h(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 9:
                    m18210K(obj, obj2, i);
                    break;
                case 10:
                    if (m18219T(obj2, i)) {
                        oag.m18373u(obj, jM18200A, oag.m18360h(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 11:
                    if (m18219T(obj2, i)) {
                        oag.m18371s(obj, jM18200A, oag.m18356d(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 12:
                    if (m18219T(obj2, i)) {
                        oag.m18371s(obj, jM18200A, oag.m18356d(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 13:
                    if (m18219T(obj2, i)) {
                        oag.m18371s(obj, jM18200A, oag.m18356d(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 14:
                    if (m18219T(obj2, i)) {
                        oag.m18372t(obj, jM18200A, oag.m18358f(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 15:
                    if (m18219T(obj2, i)) {
                        oag.m18371s(obj, jM18200A, oag.m18356d(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 16:
                    if (m18219T(obj2, i)) {
                        oag.m18372t(obj, jM18200A, oag.m18358f(obj2, jM18200A));
                        m18213N(obj, i);
                    }
                    break;
                case 17:
                    m18210K(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f45051n.mo18183d(obj, obj2, jM18200A);
                    break;
                case 50:
                    Class cls = nzn.f45081a;
                    oag.m18373u(obj, jM18200A, ntw.m17731q(oag.m18360h(obj, jM18200A), oag.m18360h(obj2, jM18200A)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m18223X(obj2, iM18235p, i)) {
                        oag.m18373u(obj, jM18200A, oag.m18360h(obj2, jM18200A));
                        m18214O(obj, iM18235p, i);
                    }
                    break;
                case 60:
                    m18211L(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m18223X(obj2, iM18235p, i)) {
                        oag.m18373u(obj, jM18200A, oag.m18360h(obj2, jM18200A));
                        m18214O(obj, iM18235p, i);
                    }
                    break;
                case 68:
                    m18211L(obj, obj2, i);
                    break;
            }
        }
        nzn.m18269B(obj, obj2);
        if (this.f45045h) {
            nzn.m18268A(obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0429  */
    /* JADX WARN: Code duplicated, block: B:273:0x08f1 A[LOOP:5: B:271:0x08ed->B:273:0x08f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:277:0x0901  */
    /* JADX WARN: Code duplicated, block: B:285:0x0911 A[LOOP:6: B:283:0x090d->B:285:0x0911, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:287:0x091e  */
    /* JADX WARN: Code duplicated, block: B:298:0x08e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x08eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x0431 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0185 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:65:0x0186 A[Catch: all -> 0x0909, TryCatch #9 {all -> 0x0909, blocks: (B:5:0x0012, B:16:0x003b, B:22:0x004b, B:23:0x004f, B:25:0x0057, B:26:0x005f, B:62:0x017a, B:63:0x0182, B:68:0x01a2, B:65:0x0186, B:67:0x0190, B:28:0x0064, B:29:0x006e, B:30:0x0078, B:31:0x0082, B:32:0x008c, B:33:0x0093, B:34:0x0094, B:35:0x009e, B:36:0x00a4, B:38:0x00b0, B:40:0x00bf, B:42:0x00d0, B:43:0x00d5, B:44:0x00e1, B:46:0x00ed, B:48:0x00fc, B:50:0x010d, B:51:0x0112, B:52:0x012c, B:53:0x0131, B:54:0x013a, B:55:0x0143, B:56:0x014c, B:57:0x0155, B:58:0x015e, B:59:0x0167, B:60:0x0170, B:69:0x01ab, B:70:0x01ae, B:72:0x01b1, B:19:0x0041, B:83:0x01d4, B:84:0x01d8, B:89:0x01e4, B:91:0x01ea, B:92:0x01fe, B:93:0x0214, B:94:0x022a, B:95:0x0240, B:96:0x0256, B:98:0x0260, B:101:0x0267, B:102:0x026d, B:103:0x027f, B:104:0x0295, B:105:0x02a7, B:106:0x02bb, B:107:0x02c5, B:108:0x02db, B:109:0x02f1, B:110:0x0307, B:111:0x031d, B:112:0x0333, B:113:0x0349, B:114:0x035f, B:115:0x0375, B:117:0x0387, B:121:0x03a0, B:154:0x043c, B:159:0x044b, B:160:0x0454, B:118:0x038f, B:120:0x0395, B:161:0x0455, B:163:0x0470, B:165:0x0485, B:167:0x048c, B:169:0x0497, B:170:0x049e, B:171:0x04a2, B:172:0x04a3, B:173:0x04b4, B:174:0x04c5, B:175:0x04d6, B:176:0x04e7, B:177:0x0507, B:178:0x0518, B:179:0x0529, B:180:0x053a, B:181:0x054b, B:182:0x055c, B:183:0x056d, B:184:0x057e, B:185:0x058f, B:186:0x05a0, B:187:0x05b1, B:188:0x05c2, B:189:0x05d3, B:190:0x05e4, B:191:0x0604, B:192:0x0615, B:194:0x062c, B:196:0x0641, B:198:0x0651, B:199:0x0658, B:200:0x065c, B:201:0x065d, B:203:0x0678, B:205:0x068d, B:207:0x0694, B:209:0x069f, B:210:0x06a6, B:211:0x06aa, B:212:0x06ab, B:214:0x06b3, B:215:0x06c6, B:216:0x06d9, B:217:0x06ea, B:218:0x06fb, B:219:0x070c, B:220:0x071d, B:221:0x072e, B:222:0x073f, B:223:0x0750, B:224:0x0761, B:225:0x0775, B:226:0x0787, B:227:0x0799, B:228:0x07ab, B:229:0x07bd, B:231:0x07c9, B:234:0x07d0, B:235:0x07d9, B:236:0x07e5, B:237:0x07f7, B:238:0x0809, B:239:0x081d, B:240:0x0827, B:241:0x0839, B:242:0x084a, B:243:0x085b, B:244:0x086c, B:245:0x087d, B:246:0x088e, B:247:0x089f), top: B:303:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0190 A[Catch: all -> 0x0909, TryCatch #9 {all -> 0x0909, blocks: (B:5:0x0012, B:16:0x003b, B:22:0x004b, B:23:0x004f, B:25:0x0057, B:26:0x005f, B:62:0x017a, B:63:0x0182, B:68:0x01a2, B:65:0x0186, B:67:0x0190, B:28:0x0064, B:29:0x006e, B:30:0x0078, B:31:0x0082, B:32:0x008c, B:33:0x0093, B:34:0x0094, B:35:0x009e, B:36:0x00a4, B:38:0x00b0, B:40:0x00bf, B:42:0x00d0, B:43:0x00d5, B:44:0x00e1, B:46:0x00ed, B:48:0x00fc, B:50:0x010d, B:51:0x0112, B:52:0x012c, B:53:0x0131, B:54:0x013a, B:55:0x0143, B:56:0x014c, B:57:0x0155, B:58:0x015e, B:59:0x0167, B:60:0x0170, B:69:0x01ab, B:70:0x01ae, B:72:0x01b1, B:19:0x0041, B:83:0x01d4, B:84:0x01d8, B:89:0x01e4, B:91:0x01ea, B:92:0x01fe, B:93:0x0214, B:94:0x022a, B:95:0x0240, B:96:0x0256, B:98:0x0260, B:101:0x0267, B:102:0x026d, B:103:0x027f, B:104:0x0295, B:105:0x02a7, B:106:0x02bb, B:107:0x02c5, B:108:0x02db, B:109:0x02f1, B:110:0x0307, B:111:0x031d, B:112:0x0333, B:113:0x0349, B:114:0x035f, B:115:0x0375, B:117:0x0387, B:121:0x03a0, B:154:0x043c, B:159:0x044b, B:160:0x0454, B:118:0x038f, B:120:0x0395, B:161:0x0455, B:163:0x0470, B:165:0x0485, B:167:0x048c, B:169:0x0497, B:170:0x049e, B:171:0x04a2, B:172:0x04a3, B:173:0x04b4, B:174:0x04c5, B:175:0x04d6, B:176:0x04e7, B:177:0x0507, B:178:0x0518, B:179:0x0529, B:180:0x053a, B:181:0x054b, B:182:0x055c, B:183:0x056d, B:184:0x057e, B:185:0x058f, B:186:0x05a0, B:187:0x05b1, B:188:0x05c2, B:189:0x05d3, B:190:0x05e4, B:191:0x0604, B:192:0x0615, B:194:0x062c, B:196:0x0641, B:198:0x0651, B:199:0x0658, B:200:0x065c, B:201:0x065d, B:203:0x0678, B:205:0x068d, B:207:0x0694, B:209:0x069f, B:210:0x06a6, B:211:0x06aa, B:212:0x06ab, B:214:0x06b3, B:215:0x06c6, B:216:0x06d9, B:217:0x06ea, B:218:0x06fb, B:219:0x070c, B:220:0x071d, B:221:0x072e, B:222:0x073f, B:223:0x0750, B:224:0x0761, B:225:0x0775, B:226:0x0787, B:227:0x0799, B:228:0x07ab, B:229:0x07bd, B:231:0x07c9, B:234:0x07d0, B:235:0x07d9, B:236:0x07e5, B:237:0x07f7, B:238:0x0809, B:239:0x081d, B:240:0x0827, B:241:0x0839, B:242:0x084a, B:243:0x085b, B:244:0x086c, B:245:0x087d, B:246:0x088e, B:247:0x089f), top: B:303:0x0012 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.nzm
    /* JADX INFO: renamed from: h */
    public final void mo18252h(Object obj, nzi nziVar, nxf nxfVar) throws Throwable {
        Throwable th;
        int i;
        ktz ktzVarMo18013c;
        ktz ktzVar;
        Object objMo17920t;
        Object objM18028k;
        nxh nxhVar;
        int i2;
        nxh nxhVar2;
        Throwable th2 = null;
        if (nxfVar == null) {
            throw null;
        }
        m18209J(obj);
        lij lijVar = this.f45052o;
        Object objM18227ab = null;
        nxh nxhVarM17735u = null;
        while (true) {
            try {
                int iMo17904c = nziVar.mo17904c();
                int iM18240u = m18240u(iMo17904c);
                int i3 = Integer.MAX_VALUE;
                if (iM18240u >= 0) {
                    int iM18245z = m18245z(iM18240u);
                    try {
                        switch (m18244y(iM18245z)) {
                            case 0:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18369q(obj, m18200A(iM18245z), nziVar.mo17902a());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 1:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18370r(obj, m18200A(iM18245z), nziVar.mo17903b());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 2:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18372t(obj, m18200A(iM18245z), nziVar.mo17912k());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 3:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18372t(obj, m18200A(iM18245z), nziVar.mo17915n());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 4:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18371s(obj, m18200A(iM18245z), nziVar.mo17907f());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 5:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18372t(obj, m18200A(iM18245z), nziVar.mo17911j());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 6:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18371s(obj, m18200A(iM18245z), nziVar.mo17906e());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 7:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18365m(obj, m18200A(iM18245z), nziVar.mo17900O());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 8:
                                nxhVarM17735u = nxhVarM17735u;
                                m18212M(obj, iM18245z, nziVar);
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 9:
                                nxhVarM17735u = nxhVarM17735u;
                                nyw nywVar = (nyw) m18205F(obj, iM18240u);
                                nziVar.mo17924x(nywVar, m18203D(iM18240u), nxfVar);
                                m18215P(obj, iM18240u, nywVar);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 10:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18373u(obj, m18200A(iM18245z), nziVar.mo17916o());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 11:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18371s(obj, m18200A(iM18245z), nziVar.mo17910i());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 12:
                                nxhVarM17735u = nxhVarM17735u;
                                int iMo17905d = nziVar.mo17905d();
                                nxu nxuVarM18202C = m18202C(iM18240u);
                                if (nxuVarM18202C == null || nxuVarM18202C.mo11803a(iMo17905d)) {
                                    oag.m18371s(obj, m18200A(iM18245z), iMo17905d);
                                    m18213N(obj, iM18240u);
                                    nxhVarM17735u = nxhVarM17735u;
                                    th2 = null;
                                } else {
                                    objM18227ab = nzn.m18270C(obj, iMo17904c, iMo17905d, objM18227ab);
                                    nxhVarM17735u = nxhVarM17735u;
                                    th2 = null;
                                }
                                break;
                            case 13:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18371s(obj, m18200A(iM18245z), nziVar.mo17908g());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 14:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18372t(obj, m18200A(iM18245z), nziVar.mo17913l());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 15:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18371s(obj, m18200A(iM18245z), nziVar.mo17909h());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 16:
                                nxhVarM17735u = nxhVarM17735u;
                                oag.m18372t(obj, m18200A(iM18245z), nziVar.mo17914m());
                                m18213N(obj, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 17:
                                nxhVarM17735u = nxhVarM17735u;
                                nyw nywVar2 = (nyw) m18205F(obj, iM18240u);
                                nziVar.mo17923w(nywVar2, m18203D(iM18240u), nxfVar);
                                m18215P(obj, iM18240u, nywVar2);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 18:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17926z(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 19:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17889D(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 20:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17891F(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 21:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17898M(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 22:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17890E(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 23:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17888C(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 24:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17887B(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 25:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17925y(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 26:
                                nxhVarM17735u = nxhVarM17735u;
                                if (m18218S(iM18245z)) {
                                    ((nwx) nziVar).m17896K(this.f45051n.mo18181b(obj, m18200A(iM18245z)), true);
                                } else {
                                    ((nwx) nziVar).m17896K(this.f45051n.mo18181b(obj, m18200A(iM18245z)), false);
                                }
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 27:
                                nxhVarM17735u = nxhVarM17735u;
                                nzm nzmVarM18203D = m18203D(iM18240u);
                                List listMo18181b = this.f45051n.mo18181b(obj, m18200A(iM18245z));
                                int i4 = ((nwx) nziVar).f44881b;
                                if (oal.m18387b(i4) != 2) {
                                    throw nyb.m18159a();
                                }
                                while (true) {
                                    listMo18181b.add(((nwx) nziVar).m17919s(nzmVarM18203D, nxfVar));
                                    if (!((nwx) nziVar).f44880a.mo17811C() && ((nwx) nziVar).f44882c == 0) {
                                        int iMo17826m = ((nwx) nziVar).f44880a.mo17826m();
                                        if (iMo17826m != i4) {
                                            ((nwx) nziVar).f44882c = iMo17826m;
                                        }
                                    }
                                }
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                                break;
                            case 28:
                                nxhVarM17735u = nxhVarM17735u;
                                List listMo18181b2 = this.f45051n.mo18181b(obj, m18200A(iM18245z));
                                if (oal.m18387b(((nwx) nziVar).f44881b) != 2) {
                                    throw nyb.m18159a();
                                }
                                while (true) {
                                    listMo18181b2.add(((nwx) nziVar).mo17916o());
                                    if (!((nwx) nziVar).f44880a.mo17811C()) {
                                        int iMo17826m2 = ((nwx) nziVar).f44880a.mo17826m();
                                        if (iMo17826m2 != ((nwx) nziVar).f44881b) {
                                            ((nwx) nziVar).f44882c = iMo17826m2;
                                        }
                                    }
                                }
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                                break;
                            case 29:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17897L(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 30:
                                List listMo18181b3 = this.f45051n.mo18181b(obj, m18200A(iM18245z));
                                nziVar.mo17886A(listMo18181b3);
                                objM18227ab = nzn.m18289V(obj, iMo17904c, listMo18181b3, m18202C(iM18240u), objM18227ab, lijVar);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 31:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17892G(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 32:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17893H(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 33:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17894I(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 34:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17895J(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 35:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17926z(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 36:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17889D(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 37:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17891F(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 38:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17898M(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 39:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17890E(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 40:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17888C(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 41:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17887B(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 42:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17925y(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 43:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17897L(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 44:
                                List listMo18181b4 = this.f45051n.mo18181b(obj, m18200A(iM18245z));
                                nziVar.mo17886A(listMo18181b4);
                                objM18227ab = nzn.m18289V(obj, iMo17904c, listMo18181b4, m18202C(iM18240u), objM18227ab, lijVar);
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 45:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17892G(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 46:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17893H(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 47:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17894I(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 48:
                                nxhVarM17735u = nxhVarM17735u;
                                nziVar.mo17895J(this.f45051n.mo18181b(obj, m18200A(iM18245z)));
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 49:
                                nxhVarM17735u = nxhVarM17735u;
                                long jM18200A = m18200A(iM18245z);
                                nzm nzmVarM18203D2 = m18203D(iM18240u);
                                List listMo18181b5 = this.f45051n.mo18181b(obj, jM18200A);
                                int i5 = ((nwx) nziVar).f44881b;
                                if (oal.m18387b(i5) != 3) {
                                    throw nyb.m18159a();
                                }
                                while (true) {
                                    listMo18181b5.add(((nwx) nziVar).m17918r(nzmVarM18203D2, nxfVar));
                                    if (!((nwx) nziVar).f44880a.mo17811C() && ((nwx) nziVar).f44882c == 0) {
                                        int iMo17826m3 = ((nwx) nziVar).f44880a.mo17826m();
                                        if (iMo17826m3 != i5) {
                                            ((nwx) nziVar).f44882c = iMo17826m3;
                                        }
                                    }
                                }
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                                break;
                            case 50:
                                Object objM18204E = m18204E(iM18240u);
                                long jM18200A2 = m18200A(m18245z(iM18240u));
                                Object objM18360h = oag.m18360h(obj, jM18200A2);
                                if (objM18360h == null) {
                                    objM18360h = ntw.m17732r();
                                    oag.m18373u(obj, jM18200A2, objM18360h);
                                } else if (ntw.m17730p(objM18360h)) {
                                    Object objM17732r = ntw.m17732r();
                                    ntw.m17731q(objM17732r, objM18360h);
                                    oag.m18373u(obj, jM18200A2, objM17732r);
                                    objM18360h = objM17732r;
                                }
                                nyr nyrVar = (nyr) objM18360h;
                                ktz ktzVarM17713V = ntw.m17713V(objM18204E);
                                ((nwx) nziVar).m17899N(2);
                                int iMo17818e = ((nwx) nziVar).f44880a.mo17818e(((nwx) nziVar).f44880a.mo17827n());
                                Object objM17917q = ktzVarM17713V.f37200c;
                                Object objM17917q2 = ktzVarM17713V.f37199b;
                                while (true) {
                                    try {
                                        int iMo17904c2 = ((nwx) nziVar).mo17904c();
                                        if (iMo17904c2 != i3 && !((nwx) nziVar).f44880a.mo17811C()) {
                                            switch (iMo17904c2) {
                                                case 1:
                                                    objM17917q = ((nwx) nziVar).m17917q((oaj) ktzVarM17713V.f37201d, null, null);
                                                    nxhVarM17735u = nxhVarM17735u;
                                                    i3 = Integer.MAX_VALUE;
                                                    break;
                                                case 2:
                                                    try {
                                                        objM17917q2 = ((nwx) nziVar).m17917q((oaj) ktzVarM17713V.f37198a, ktzVarM17713V.f37199b.getClass(), nxfVar);
                                                        nxhVarM17735u = nxhVarM17735u;
                                                        i3 = Integer.MAX_VALUE;
                                                    } catch (nya e) {
                                                        nxhVar2 = nxhVarM17735u;
                                                        if (((nwx) nziVar).mo17901P()) {
                                                            throw new nyb("Unable to parse map entry.");
                                                        }
                                                        nxhVarM17735u = nxhVar2;
                                                        i3 = Integer.MAX_VALUE;
                                                    }
                                                    break;
                                                default:
                                                    nxhVar2 = nxhVarM17735u;
                                                    try {
                                                        if (!((nwx) nziVar).mo17901P()) {
                                                            throw new nyb("Unable to parse map entry.");
                                                        }
                                                    } catch (nya e2) {
                                                        if (((nwx) nziVar).mo17901P()) {
                                                            throw new nyb("Unable to parse map entry.");
                                                        }
                                                    }
                                                    nxhVarM17735u = nxhVar2;
                                                    i3 = Integer.MAX_VALUE;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                                try {
                                    nyrVar.put(objM17917q, objM17917q2);
                                    ((nwx) nziVar).f44880a.mo17809A(iMo17818e);
                                    nxhVarM17735u = nxhVarM17735u;
                                    th2 = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    Throwable th5 = th;
                                    ((nwx) nziVar).f44880a.mo17809A(iMo17818e);
                                    throw th5;
                                }
                                break;
                            case 51:
                                oag.m18373u(obj, m18200A(iM18245z), Double.valueOf(nziVar.mo17902a()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 52:
                                oag.m18373u(obj, m18200A(iM18245z), Float.valueOf(nziVar.mo17903b()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 53:
                                oag.m18373u(obj, m18200A(iM18245z), Long.valueOf(nziVar.mo17912k()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 54:
                                oag.m18373u(obj, m18200A(iM18245z), Long.valueOf(nziVar.mo17915n()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 55:
                                oag.m18373u(obj, m18200A(iM18245z), Integer.valueOf(nziVar.mo17907f()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 56:
                                oag.m18373u(obj, m18200A(iM18245z), Long.valueOf(nziVar.mo17911j()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 57:
                                oag.m18373u(obj, m18200A(iM18245z), Integer.valueOf(nziVar.mo17906e()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 58:
                                oag.m18373u(obj, m18200A(iM18245z), Boolean.valueOf(nziVar.mo17900O()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 59:
                                m18212M(obj, iM18245z, nziVar);
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 60:
                                nyw nywVar3 = (nyw) m18206G(obj, iMo17904c, iM18240u);
                                nziVar.mo17924x(nywVar3, m18203D(iM18240u), nxfVar);
                                m18216Q(obj, iMo17904c, iM18240u, nywVar3);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 61:
                                oag.m18373u(obj, m18200A(iM18245z), nziVar.mo17916o());
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 62:
                                oag.m18373u(obj, m18200A(iM18245z), Integer.valueOf(nziVar.mo17910i()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 63:
                                int iMo17905d2 = nziVar.mo17905d();
                                nxu nxuVarM18202C2 = m18202C(iM18240u);
                                if (nxuVarM18202C2 == null || nxuVarM18202C2.mo11803a(iMo17905d2)) {
                                    oag.m18373u(obj, m18200A(iM18245z), Integer.valueOf(iMo17905d2));
                                    m18214O(obj, iMo17904c, iM18240u);
                                    nxhVarM17735u = nxhVarM17735u;
                                    nxhVarM17735u = nxhVarM17735u;
                                    th2 = null;
                                } else {
                                    objM18227ab = nzn.m18270C(obj, iMo17904c, iMo17905d2, objM18227ab);
                                }
                                break;
                            case 64:
                                oag.m18373u(obj, m18200A(iM18245z), Integer.valueOf(nziVar.mo17908g()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 65:
                                oag.m18373u(obj, m18200A(iM18245z), Long.valueOf(nziVar.mo17913l()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 66:
                                oag.m18373u(obj, m18200A(iM18245z), Integer.valueOf(nziVar.mo17909h()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 67:
                                oag.m18373u(obj, m18200A(iM18245z), Long.valueOf(nziVar.mo17914m()));
                                m18214O(obj, iMo17904c, iM18240u);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            case 68:
                                nyw nywVar4 = (nyw) m18206G(obj, iMo17904c, iM18240u);
                                nziVar.mo17923w(nywVar4, m18203D(iM18240u), nxfVar);
                                m18216Q(obj, iMo17904c, iM18240u, nywVar4);
                                nxhVarM17735u = nxhVarM17735u;
                                nxhVarM17735u = nxhVarM17735u;
                                th2 = null;
                                break;
                            default:
                                nxhVar = nxhVarM17735u;
                                if (objM18227ab == null) {
                                    try {
                                        objM18227ab = lij.m15425ah(obj);
                                    } catch (nya e3) {
                                        if (objM18227ab == null) {
                                            try {
                                                objM18227ab = lij.m15425ah(obj);
                                            } catch (Throwable th6) {
                                                th = th6;
                                                for (i = this.f45049l; i < this.f45050m; i++) {
                                                    objM18227ab = m18227ab(obj, this.f45048k[i], objM18227ab, obj);
                                                }
                                                if (objM18227ab == null) {
                                                    throw th;
                                                }
                                                lij.m15424ag(obj, (nzy) objM18227ab);
                                                throw th;
                                            }
                                        }
                                        if (!lijVar.m15458ac(objM18227ab, nziVar)) {
                                            for (i2 = this.f45049l; i2 < this.f45050m; i2++) {
                                                objM18227ab = m18227ab(obj, this.f45048k[i2], objM18227ab, obj);
                                            }
                                            if (objM18227ab == null) {
                                                return;
                                            }
                                            lij.m15424ag(obj, (nzy) objM18227ab);
                                        }
                                        nxhVarM17735u = nxhVar;
                                        th2 = null;
                                    }
                                }
                                try {
                                    if (lijVar.m15458ac(objM18227ab, nziVar)) {
                                        nxhVarM17735u = nxhVar;
                                        th2 = null;
                                    } else {
                                        for (int i6 = this.f45049l; i6 < this.f45050m; i6++) {
                                            objM18227ab = m18227ab(obj, this.f45048k[i6], objM18227ab, obj);
                                        }
                                        if (objM18227ab == null) {
                                            return;
                                        }
                                    }
                                } catch (nya e4) {
                                    if (objM18227ab == null) {
                                        objM18227ab = lij.m15425ah(obj);
                                    }
                                    if (!lijVar.m15458ac(objM18227ab, nziVar)) {
                                        while (i2 < this.f45050m) {
                                            objM18227ab = m18227ab(obj, this.f45048k[i2], objM18227ab, obj);
                                        }
                                        if (objM18227ab == null) {
                                            return;
                                        }
                                        lij.m15424ag(obj, (nzy) objM18227ab);
                                    }
                                    nxhVarM17735u = nxhVar;
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th = th7;
                                    while (i < this.f45050m) {
                                        objM18227ab = m18227ab(obj, this.f45048k[i], objM18227ab, obj);
                                    }
                                    if (objM18227ab == null) {
                                        throw th;
                                    }
                                    lij.m15424ag(obj, (nzy) objM18227ab);
                                    throw th;
                                }
                                break;
                        }
                    } catch (nya e5) {
                        nxhVar = nxhVarM17735u;
                    }
                } else if (iMo17904c == Integer.MAX_VALUE) {
                    for (int i7 = this.f45049l; i7 < this.f45050m; i7++) {
                        objM18227ab = m18227ab(obj, this.f45048k[i7], objM18227ab, obj);
                    }
                    if (objM18227ab == null) {
                        return;
                    }
                } else {
                    if (this.f45045h) {
                        ktzVarMo18013c = nxfVar.mo18013c(this.f45044g, iMo17904c);
                    } else {
                        ktzVar = th2;
                    }
                    if (ktzVar != 0) {
                        ktzVar = ktzVarMo18013c;
                        if (nxhVarM17735u == null) {
                            nxhVarM17735u = ntw.m17735u(obj);
                        }
                        if (ktzVar.m14854f() == oaj.ENUM) {
                            nziVar.mo17907f();
                            throw th2;
                        }
                        switch (ktzVar.m14854f()) {
                            case DOUBLE:
                                objMo17920t = Double.valueOf(nziVar.mo17902a());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case FLOAT:
                                objMo17920t = Float.valueOf(nziVar.mo17903b());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset2 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case f45133c:
                                objMo17920t = Long.valueOf(nziVar.mo17912k());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset3 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case UINT64:
                                objMo17920t = Long.valueOf(nziVar.mo17915n());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset4 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case INT32:
                                objMo17920t = Integer.valueOf(nziVar.mo17907f());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset5 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case FIXED64:
                                objMo17920t = Long.valueOf(nziVar.mo17911j());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset6 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case FIXED32:
                                objMo17920t = Integer.valueOf(nziVar.mo17906e());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset7 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case BOOL:
                                objMo17920t = Boolean.valueOf(nziVar.mo17900O());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset8 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case STRING:
                                objMo17920t = nziVar.mo17921u();
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset9 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case GROUP:
                                Object objM18028k2 = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                if (objM18028k2 instanceof nxq) {
                                    nzm nzmVarM18260b = nzf.f45060a.m18260b(objM18028k2);
                                    if (!((nxq) objM18028k2).m18142ac()) {
                                        Object objMo18249e = nzmVarM18260b.mo18249e();
                                        nzmVarM18260b.mo18251g(objMo18249e, objM18028k2);
                                        nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo18249e);
                                        objM18028k2 = objMo18249e;
                                    }
                                    nziVar.mo17923w(objM18028k2, nzmVarM18260b, nxfVar);
                                } else {
                                    Class<?> cls = ktzVar.f37200c.getClass();
                                    ((nwx) nziVar).m17899N(3);
                                    objMo17920t = ((nwx) nziVar).m17918r(nzf.f45060a.m18259a(cls), nxfVar);
                                    switch (ktzVar.m14854f().ordinal()) {
                                        case 9:
                                        case 10:
                                            objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                            if (objM18028k != null) {
                                                Charset charset10 = nxz.f44985a;
                                                objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                            }
                                            break;
                                    }
                                    nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                }
                                break;
                            case f45141k:
                                Object objM18028k3 = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                if (objM18028k3 instanceof nxq) {
                                    nzm nzmVarM18260b2 = nzf.f45060a.m18260b(objM18028k3);
                                    if (!((nxq) objM18028k3).m18142ac()) {
                                        Object objMo18249e2 = nzmVarM18260b2.mo18249e();
                                        nzmVarM18260b2.mo18251g(objMo18249e2, objM18028k3);
                                        nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo18249e2);
                                        objM18028k3 = objMo18249e2;
                                    }
                                    nziVar.mo17924x(objM18028k3, nzmVarM18260b2, nxfVar);
                                } else {
                                    objMo17920t = nziVar.mo17920t(ktzVar.f37200c.getClass(), nxfVar);
                                    switch (ktzVar.m14854f().ordinal()) {
                                        case 9:
                                        case 10:
                                            objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                            if (objM18028k != null) {
                                                Charset charset11 = nxz.f44985a;
                                                objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                            }
                                            break;
                                    }
                                    nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                }
                                break;
                            case BYTES:
                                objMo17920t = nziVar.mo17916o();
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset12 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case UINT32:
                                objMo17920t = Integer.valueOf(nziVar.mo17910i());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset13 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case ENUM:
                                throw new IllegalStateException("Shouldn't reach here.");
                            case SFIXED32:
                                objMo17920t = Integer.valueOf(nziVar.mo17908g());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset14 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case SFIXED64:
                                objMo17920t = Long.valueOf(nziVar.mo17913l());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset15 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case f45147q:
                                objMo17920t = Integer.valueOf(nziVar.mo17909h());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset16 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            case SINT64:
                                objMo17920t = Long.valueOf(nziVar.mo17914m());
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset17 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                            default:
                                objMo17920t = th2;
                                switch (ktzVar.m14854f().ordinal()) {
                                    case 9:
                                    case 10:
                                        objM18028k = nxhVarM17735u.m18028k((nxp) ktzVar.f37201d);
                                        if (objM18028k != null) {
                                            Charset charset18 = nxz.f44985a;
                                            objMo17920t = ((nyw) objM18028k).mo17763cl().mo17752c((nyw) objMo17920t).mo18104m();
                                        }
                                        break;
                                }
                                nxhVarM17735u.m18029l((nxp) ktzVar.f37201d, objMo17920t);
                                break;
                        }
                    } else {
                        ktzVar = ktzVarMo18013c;
                        if (objM18227ab == null) {
                            objM18227ab = lij.m15425ah(obj);
                        }
                        try {
                            if (!lijVar.m15458ac(objM18227ab, nziVar)) {
                                for (int i8 = this.f45049l; i8 < this.f45050m; i8++) {
                                    objM18227ab = m18227ab(obj, this.f45048k[i8], objM18227ab, obj);
                                }
                                if (objM18227ab == null) {
                                    return;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            while (i < this.f45050m) {
                                objM18227ab = m18227ab(obj, this.f45048k[i], objM18227ab, obj);
                            }
                            if (objM18227ab == null) {
                                throw th;
                            }
                            lij.m15424ag(obj, (nzy) objM18227ab);
                            throw th;
                        }
                    }
                }
            } catch (Throwable th9) {
                th = th9;
            }
        }
        lij.m15424ag(obj, (nzy) objM18227ab);
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: i */
    public final void mo18253i(Object obj, byte[] bArr, int i, int i2, nwh nwhVar) throws nyb {
        int i3;
        int iM17702K;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        nyz nyzVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        i2 = i2;
        nwh nwhVar2 = nwhVar;
        if (!nyzVar.f45047j) {
            m18248c(obj, bArr, i, i2, 0, nwhVar);
            return;
        }
        m18209J(obj);
        Unsafe unsafe2 = f45039b;
        int i12 = -1;
        int iM17700I = i;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (iM17700I < i2) {
            int i17 = iM17700I + 1;
            byte b = bArr2[iM17700I];
            if (b < 0) {
                iM17702K = ntw.m17702K(b, bArr2, i17, nwhVar2);
                i3 = nwhVar2.f44826a;
            } else {
                i3 = b;
                iM17702K = i17;
            }
            int i18 = i3 >>> 3;
            int iM18241v = i18 > i13 ? nyzVar.m18241v(i18, i14 / 3) : nyzVar.m18240u(i18);
            if (iM18241v == i12) {
                i4 = iM17702K;
                i5 = i18;
                unsafe = unsafe2;
                i6 = 0;
            } else {
                int i19 = i3 & 7;
                int[] iArr = nyzVar.f45040c;
                int i20 = iArr[iM18241v + 1];
                int iM18244y = m18244y(i20);
                int i21 = iM17702K;
                long jM18200A = m18200A(i20);
                if (iM18244y <= 17) {
                    int i22 = iArr[iM18241v + 2];
                    int i23 = 1 << (i22 >>> 20);
                    int i24 = i22 & 1048575;
                    if (i24 != i16) {
                        if (i16 != 1048575) {
                            unsafe2.putInt(obj2, i16, i15);
                        }
                        if (i24 != 1048575) {
                            i15 = unsafe2.getInt(obj2, i24);
                        }
                        i16 = i24;
                    } else {
                        i20 = i20;
                        iM18241v = iM18241v;
                    }
                    switch (iM18244y) {
                        case 0:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 1) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                oag.m18369q(obj2, jM18200A, ntw.m17739y(bArr2, i7));
                                iM17700I = i7 + 8;
                                i15 |= i23;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 1:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 5) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                oag.m18370r(obj2, jM18200A, ntw.m17740z(bArr2, i7));
                                iM17700I = i7 + 4;
                                i15 |= i23;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                int iM17704M = ntw.m17704M(bArr2, i7, nwhVar2);
                                unsafe2.putLong(obj, jM18200A, nwhVar2.f44827b);
                                i15 |= i23;
                                iM17700I = iM17704M;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 4:
                        case 11:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                iM17700I = ntw.m17701J(bArr2, i7, nwhVar2);
                                unsafe2.putInt(obj2, jM18200A, nwhVar2.f44826a);
                                i15 |= i23;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 1) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                unsafe2.putLong(obj, jM18200A, ntw.m17708Q(bArr2, i7));
                                iM17700I = i7 + 8;
                                i15 |= i23;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 5) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                unsafe2.putInt(obj2, jM18200A, ntw.m17693B(bArr2, i7));
                                iM17700I = i7 + 4;
                                i15 |= i23;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 7:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                iM17700I = ntw.m17704M(bArr2, i7, nwhVar2);
                                oag.m18365m(obj2, jM18200A, nwhVar2.f44827b != 0);
                                i15 |= i23;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 8:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 2) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                iM17700I = (i20 & 536870912) == 0 ? ntw.m17698G(bArr2, i7, nwhVar2) : ntw.m17699H(bArr2, i7, nwhVar2);
                                unsafe2.putObject(obj2, jM18200A, nwhVar2.f44828c);
                                i15 |= i23;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 9:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 2) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                Object objM18205F = nyzVar.m18205F(obj2, i8);
                                iM17700I = ntw.m17706O(objM18205F, nyzVar.m18203D(i8), bArr, i7, i2, nwhVar);
                                nyzVar.m18215P(obj2, i8, objM18205F);
                                i15 |= i23;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 10:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 2) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                iM17700I = ntw.m17692A(bArr2, i7, nwhVar2);
                                unsafe2.putObject(obj2, jM18200A, nwhVar2.f44828c);
                                i15 |= i23;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 12:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                iM17700I = ntw.m17701J(bArr2, i7, nwhVar2);
                                unsafe2.putInt(obj2, jM18200A, nwhVar2.f44826a);
                                i15 |= i23;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 15:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            if (i19 != 0) {
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                iM17700I = ntw.m17701J(bArr2, i7, nwhVar2);
                                unsafe2.putInt(obj2, jM18200A, nww.m17873F(nwhVar2.f44826a));
                                i15 |= i23;
                                i14 = i8;
                                i13 = i5;
                                i12 = -1;
                            }
                            break;
                        case 16:
                            if (i19 != 0) {
                                i7 = i21;
                                i8 = iM18241v;
                                i5 = i18;
                                i4 = i7;
                                unsafe = unsafe2;
                                i6 = i8;
                            } else {
                                int iM17704M2 = ntw.m17704M(bArr2, i21, nwhVar2);
                                unsafe2.putLong(obj, jM18200A, nww.m17875H(nwhVar2.f44827b));
                                i15 |= i23;
                                iM17700I = iM17704M2;
                                i14 = iM18241v;
                                i13 = i18;
                                i12 = -1;
                            }
                            break;
                        default:
                            i7 = i21;
                            i8 = iM18241v;
                            i5 = i18;
                            i4 = i7;
                            unsafe = unsafe2;
                            i6 = i8;
                            break;
                    }
                } else {
                    int i25 = iM18241v;
                    i5 = i18;
                    if (iM18244y == 27) {
                        if (i19 == 2) {
                            nxy nxyVarMo17775e = (nxy) unsafe2.getObject(obj2, jM18200A);
                            if (!nxyVarMo17775e.mo17770c()) {
                                int size = nxyVarMo17775e.size();
                                nxyVarMo17775e = nxyVarMo17775e.mo17775e(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, jM18200A, nxyVarMo17775e);
                            }
                            iM17700I = ntw.m17696E(nyzVar.m18203D(i25), i3, bArr, i21, i2, nxyVarMo17775e, nwhVar);
                            i15 = i15;
                            i14 = i25;
                            i13 = i5;
                            i12 = -1;
                        } else {
                            i9 = i16;
                            i10 = i15;
                            unsafe = unsafe2;
                            i11 = i21;
                            i6 = i25;
                            i4 = i11;
                            i16 = i9;
                            i15 = i10;
                        }
                    } else if (iM18244y <= 49) {
                        int i26 = i15;
                        int i27 = i16;
                        unsafe = unsafe2;
                        i6 = i25;
                        iM17700I = m18239t(obj, bArr, i21, i2, i3, i5, i19, i25, i20, iM18244y, jM18200A, nwhVar);
                        if (iM17700I != i21) {
                            nyzVar = this;
                            obj2 = obj;
                            bArr2 = bArr;
                            nwhVar2 = nwhVar;
                            i13 = i5;
                            i16 = i27;
                            i14 = i6;
                            i15 = i26;
                            unsafe2 = unsafe;
                            i12 = -1;
                        } else {
                            i4 = iM17700I;
                            i16 = i27;
                            i15 = i26;
                        }
                    } else {
                        i10 = i15;
                        i9 = i16;
                        unsafe = unsafe2;
                        i11 = i21;
                        i6 = i25;
                        if (iM18244y != 50) {
                            iM17700I = m18238s(obj, bArr, i11, i2, i3, i5, i19, i20, iM18244y, jM18200A, i6, nwhVar);
                            if (iM17700I != i11) {
                                nyzVar = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                nwhVar2 = nwhVar;
                                i13 = i5;
                                i16 = i9;
                                i14 = i6;
                                i15 = i10;
                                unsafe2 = unsafe;
                                i12 = -1;
                            } else {
                                i4 = iM17700I;
                                i16 = i9;
                                i15 = i10;
                            }
                        } else if (i19 == 2) {
                            iM17700I = m18237r(obj, bArr, i11, i2, i6, jM18200A, nwhVar);
                            if (iM17700I != i11) {
                                nyzVar = this;
                                obj2 = obj;
                                bArr2 = bArr;
                                nwhVar2 = nwhVar;
                                i13 = i5;
                                i16 = i9;
                                i14 = i6;
                                i15 = i10;
                                unsafe2 = unsafe;
                                i12 = -1;
                            } else {
                                i4 = iM17700I;
                                i16 = i9;
                                i15 = i10;
                            }
                        } else {
                            i4 = i11;
                            i16 = i9;
                            i15 = i10;
                        }
                    }
                }
            }
            iM17700I = ntw.m17700I(i3, bArr, i4, i2, m18231d(obj), nwhVar);
            nyzVar = this;
            obj2 = obj;
            bArr2 = bArr;
            nwhVar2 = nwhVar;
            i13 = i5;
            i14 = i6;
            unsafe2 = unsafe;
            i12 = -1;
        }
        int i28 = i15;
        Unsafe unsafe3 = unsafe2;
        if (i16 != 1048575) {
            unsafe3.putInt(obj, i16, i28);
        }
        if (iM17700I != i2) {
            throw nyb.m18165g();
        }
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: j */
    public final boolean mo18254j(Object obj, Object obj2) {
        boolean zM18306p;
        int length = this.f45040c.length;
        for (int i = 0; i < length; i += 3) {
            int iM18245z = m18245z(i);
            long jM18200A = m18200A(iM18245z);
            switch (m18244y(iM18245z)) {
                case 0:
                    if (!m18217R(obj, obj2, i) || Double.doubleToLongBits(oag.m18354b(obj, jM18200A)) != Double.doubleToLongBits(oag.m18354b(obj2, jM18200A))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!m18217R(obj, obj2, i) || Float.floatToIntBits(oag.m18355c(obj, jM18200A)) != Float.floatToIntBits(oag.m18355c(obj2, jM18200A))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!m18217R(obj, obj2, i) || oag.m18358f(obj, jM18200A) != oag.m18358f(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!m18217R(obj, obj2, i) || oag.m18358f(obj, jM18200A) != oag.m18358f(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!m18217R(obj, obj2, i) || oag.m18356d(obj, jM18200A) != oag.m18356d(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!m18217R(obj, obj2, i) || oag.m18358f(obj, jM18200A) != oag.m18358f(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!m18217R(obj, obj2, i) || oag.m18356d(obj, jM18200A) != oag.m18356d(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!m18217R(obj, obj2, i) || oag.m18375w(obj, jM18200A) != oag.m18375w(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!m18217R(obj, obj2, i) || !nzn.m18306p(oag.m18360h(obj, jM18200A), oag.m18360h(obj2, jM18200A))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!m18217R(obj, obj2, i) || !nzn.m18306p(oag.m18360h(obj, jM18200A), oag.m18360h(obj2, jM18200A))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!m18217R(obj, obj2, i) || !nzn.m18306p(oag.m18360h(obj, jM18200A), oag.m18360h(obj2, jM18200A))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!m18217R(obj, obj2, i) || oag.m18356d(obj, jM18200A) != oag.m18356d(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!m18217R(obj, obj2, i) || oag.m18356d(obj, jM18200A) != oag.m18356d(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!m18217R(obj, obj2, i) || oag.m18356d(obj, jM18200A) != oag.m18356d(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!m18217R(obj, obj2, i) || oag.m18358f(obj, jM18200A) != oag.m18358f(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!m18217R(obj, obj2, i) || oag.m18356d(obj, jM18200A) != oag.m18356d(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!m18217R(obj, obj2, i) || oag.m18358f(obj, jM18200A) != oag.m18358f(obj2, jM18200A)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!m18217R(obj, obj2, i) || !nzn.m18306p(oag.m18360h(obj, jM18200A), oag.m18360h(obj2, jM18200A))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zM18306p = nzn.m18306p(oag.m18360h(obj, jM18200A), oag.m18360h(obj2, jM18200A));
                    break;
                case 50:
                    zM18306p = nzn.m18306p(oag.m18360h(obj, jM18200A), oag.m18360h(obj2, jM18200A));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jM18242w = m18242w(i) & 1048575;
                    if (oag.m18356d(obj, jM18242w) != oag.m18356d(obj2, jM18242w) || !nzn.m18306p(oag.m18360h(obj, jM18200A), oag.m18360h(obj2, jM18200A))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zM18306p) {
                return false;
            }
        }
        if (!lij.m15423af(obj).equals(lij.m15423af(obj2))) {
            return false;
        }
        if (this.f45045h) {
            return ntw.m17734t(obj).equals(ntw.m17734t(obj2));
        }
        return true;
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: k */
    public final boolean mo18255k(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f45049l) {
            int i6 = this.f45048k[i5];
            int iM18235p = m18235p(i6);
            int iM18245z = m18245z(i6);
            int i7 = this.f45040c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i3) {
                i = i3;
                i2 = i4;
            } else if (i8 != 1048575) {
                i2 = f45039b.getInt(obj, i8);
                i = i8;
            } else {
                i2 = i4;
                i = i8;
            }
            if ((268435456 & iM18245z) != 0 && !m18220U(obj, i6, i, i2, i9)) {
                return false;
            }
            switch (m18244y(iM18245z)) {
                case 9:
                case 17:
                    if (m18220U(obj, i6, i, i2, i9) && !m18221V(obj, iM18245z, m18203D(i6))) {
                        return false;
                    }
                    break;
                    break;
                case 27:
                case 49:
                    List list = (List) oag.m18360h(obj, m18200A(iM18245z));
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        nzm nzmVarM18203D = m18203D(i6);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (!nzmVarM18203D.mo18255k(list.get(i10))) {
                                return false;
                            }
                        }
                    }
                    break;
                case 50:
                    nyr nyrVar = (nyr) oag.m18360h(obj, m18200A(iM18245z));
                    if (!nyrVar.isEmpty() && ((oaj) ntw.m17713V(m18204E(i6)).f37198a).f45150s == oak.MESSAGE) {
                        nzm nzmVarM18259a = null;
                        for (Object obj2 : nyrVar.values()) {
                            if (nzmVarM18259a == null) {
                                nzmVarM18259a = nzf.f45060a.m18259a(obj2.getClass());
                            }
                            if (!nzmVarM18259a.mo18255k(obj2)) {
                                return false;
                            }
                        }
                    }
                    break;
                case 60:
                case 68:
                    if (m18223X(obj, iM18235p, i6) && !m18221V(obj, iM18245z, m18203D(i6))) {
                        return false;
                    }
                    break;
                    break;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.f45045h || ntw.m17734t(obj).m18027i();
    }

    /* JADX WARN: Code duplicated, block: B:177:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // p000.nzm
    /* JADX INFO: renamed from: l */
    public final void mo18256l(Object obj, liv livVar) {
        Iterator itM18023d;
        Map.Entry entry;
        int i;
        int i2;
        Iterator itM18023d2;
        Map.Entry entry2;
        if (this.f45047j) {
            if (this.f45045h) {
                nxh nxhVarM17734t = ntw.m17734t(obj);
                if (nxhVarM17734t.m18026h()) {
                    itM18023d2 = null;
                    entry2 = null;
                } else {
                    itM18023d2 = nxhVarM17734t.m18023d();
                    entry2 = (Map.Entry) itM18023d2.next();
                }
            } else {
                itM18023d2 = null;
                entry2 = null;
            }
            int length = this.f45040c.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int iM18245z = m18245z(i3);
                int iM18235p = m18235p(i3);
                while (entry2 != null && ntw.m17733s(entry2) <= iM18235p) {
                    ntw.m17714W(livVar, entry2);
                    entry2 = itM18023d2.hasNext() ? (Map.Entry) itM18023d2.next() : null;
                }
                switch (m18244y(iM18245z)) {
                    case 0:
                        if (m18219T(obj, i3)) {
                            livVar.m15489l(iM18235p, oag.m18354b(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 1:
                        if (m18219T(obj, i3)) {
                            livVar.m15493p(iM18235p, oag.m18355c(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 2:
                        if (m18219T(obj, i3)) {
                            livVar.m15496s(iM18235p, oag.m18358f(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 3:
                        if (m18219T(obj, i3)) {
                            livVar.m15477B(iM18235p, oag.m18358f(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 4:
                        if (m18219T(obj, i3)) {
                            livVar.m15495r(iM18235p, oag.m18356d(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 5:
                        if (m18219T(obj, i3)) {
                            livVar.m15492o(iM18235p, oag.m18358f(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 6:
                        if (m18219T(obj, i3)) {
                            livVar.m15491n(iM18235p, oag.m18356d(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 7:
                        if (m18219T(obj, i3)) {
                            livVar.m15487j(iM18235p, oag.m18375w(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 8:
                        if (m18219T(obj, i3)) {
                            m18229ad(iM18235p, oag.m18360h(obj, m18200A(iM18245z)), livVar);
                        }
                        break;
                    case 9:
                        if (m18219T(obj, i3)) {
                            livVar.m15497t(iM18235p, oag.m18360h(obj, m18200A(iM18245z)), m18203D(i3));
                        }
                        break;
                    case 10:
                        if (m18219T(obj, i3)) {
                            livVar.m15488k(iM18235p, (nwr) oag.m18360h(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 11:
                        if (m18219T(obj, i3)) {
                            livVar.m15476A(iM18235p, oag.m18356d(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 12:
                        if (m18219T(obj, i3)) {
                            livVar.m15490m(iM18235p, oag.m18356d(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 13:
                        if (m18219T(obj, i3)) {
                            livVar.m15499v(iM18235p, oag.m18356d(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 14:
                        if (m18219T(obj, i3)) {
                            livVar.m15500w(iM18235p, oag.m18358f(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 15:
                        if (m18219T(obj, i3)) {
                            livVar.m15501x(iM18235p, oag.m18356d(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 16:
                        if (m18219T(obj, i3)) {
                            livVar.m15502y(iM18235p, oag.m18358f(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 17:
                        if (m18219T(obj, i3)) {
                            livVar.m15494q(iM18235p, oag.m18360h(obj, m18200A(iM18245z)), m18203D(i3));
                        }
                        break;
                    case 18:
                        nzn.m18273F(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 19:
                        nzn.m18277J(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 20:
                        nzn.m18280M(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 21:
                        nzn.m18288U(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 22:
                        nzn.m18279L(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 23:
                        nzn.m18276I(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 24:
                        nzn.m18275H(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 25:
                        nzn.m18271D(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 26:
                        nzn.m18286S(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar);
                        break;
                    case 27:
                        nzn.m18281N(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, m18203D(i3));
                        break;
                    case 28:
                        nzn.m18272E(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar);
                        break;
                    case 29:
                        nzn.m18287T(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 30:
                        nzn.m18274G(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 31:
                        nzn.m18282O(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 32:
                        nzn.m18283P(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 33:
                        nzn.m18284Q(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 34:
                        nzn.m18285R(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, false);
                        break;
                    case 35:
                        nzn.m18273F(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 36:
                        nzn.m18277J(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 37:
                        nzn.m18280M(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 38:
                        nzn.m18288U(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 39:
                        nzn.m18279L(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 40:
                        nzn.m18276I(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 41:
                        nzn.m18275H(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 42:
                        nzn.m18271D(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 43:
                        nzn.m18287T(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 44:
                        nzn.m18274G(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 45:
                        nzn.m18282O(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 46:
                        nzn.m18283P(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 47:
                        nzn.m18284Q(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 48:
                        nzn.m18285R(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, true);
                        break;
                    case 49:
                        nzn.m18278K(m18235p(i3), (List) oag.m18360h(obj, m18200A(iM18245z)), livVar, m18203D(i3));
                        break;
                    case 50:
                        m18228ac(livVar, iM18235p, oag.m18360h(obj, m18200A(iM18245z)), i3);
                        break;
                    case 51:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15489l(iM18235p, m18233n(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 52:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15493p(iM18235p, m18234o(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 53:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15496s(iM18235p, m18201B(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 54:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15477B(iM18235p, m18201B(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 55:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15495r(iM18235p, m18236q(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 56:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15492o(iM18235p, m18201B(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 57:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15491n(iM18235p, m18236q(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 58:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15487j(iM18235p, m18224Y(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 59:
                        if (m18223X(obj, iM18235p, i3)) {
                            m18229ad(iM18235p, oag.m18360h(obj, m18200A(iM18245z)), livVar);
                        }
                        break;
                    case 60:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15497t(iM18235p, oag.m18360h(obj, m18200A(iM18245z)), m18203D(i3));
                        }
                        break;
                    case 61:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15488k(iM18235p, (nwr) oag.m18360h(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 62:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15476A(iM18235p, m18236q(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 63:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15490m(iM18235p, m18236q(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 64:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15499v(iM18235p, m18236q(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 65:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15500w(iM18235p, m18201B(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 66:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15501x(iM18235p, m18236q(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 67:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15502y(iM18235p, m18201B(obj, m18200A(iM18245z)));
                        }
                        break;
                    case 68:
                        if (m18223X(obj, iM18235p, i3)) {
                            livVar.m15494q(iM18235p, oag.m18360h(obj, m18200A(iM18245z)), m18203D(i3));
                        }
                        break;
                }
            }
            while (entry2 != null) {
                ntw.m17714W(livVar, entry2);
                entry2 = itM18023d2.hasNext() ? (Map.Entry) itM18023d2.next() : null;
            }
            m18230ae(obj, livVar);
            return;
        }
        if (this.f45045h) {
            nxh nxhVarM17734t2 = ntw.m17734t(obj);
            if (nxhVarM17734t2.m18026h()) {
                itM18023d = null;
                entry = null;
            } else {
                itM18023d = nxhVarM17734t2.m18023d();
                entry = (Map.Entry) itM18023d.next();
            }
        } else {
            itM18023d = null;
            entry = null;
        }
        int length2 = this.f45040c.length;
        Unsafe unsafe = f45039b;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i5 < length2) {
            int iM18245z2 = m18245z(i5);
            int iM18235p2 = m18235p(i5);
            int iM18244y = m18244y(iM18245z2);
            if (iM18244y <= 17) {
                int i8 = this.f45040c[i5 + 2];
                int i9 = i8 & i4;
                if (i9 != i6) {
                    i7 = unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            while (entry != null && ntw.m17733s(entry) <= iM18235p2) {
                ntw.m17714W(livVar, entry);
                entry = itM18023d.hasNext() ? (Map.Entry) itM18023d.next() : null;
            }
            int i10 = i5;
            long jM18200A = m18200A(iM18245z2);
            switch (iM18244y) {
                case 0:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15489l(iM18235p2, oag.m18354b(obj, jM18200A));
                    }
                    break;
                case 1:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15493p(iM18235p2, oag.m18355c(obj, jM18200A));
                    }
                    break;
                case 2:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15496s(iM18235p2, unsafe.getLong(obj, jM18200A));
                    }
                    break;
                case 3:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15477B(iM18235p2, unsafe.getLong(obj, jM18200A));
                    }
                    break;
                case 4:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15495r(iM18235p2, unsafe.getInt(obj, jM18200A));
                    }
                    break;
                case 5:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15492o(iM18235p2, unsafe.getLong(obj, jM18200A));
                    }
                    break;
                case 6:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15491n(iM18235p2, unsafe.getInt(obj, jM18200A));
                    }
                    break;
                case 7:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15487j(iM18235p2, oag.m18375w(obj, jM18200A));
                    }
                    break;
                case 8:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        m18229ad(iM18235p2, unsafe.getObject(obj, jM18200A), livVar);
                    }
                    break;
                case 9:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15497t(iM18235p2, unsafe.getObject(obj, jM18200A), m18203D(i2));
                    }
                    break;
                case 10:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15488k(iM18235p2, (nwr) unsafe.getObject(obj, jM18200A));
                    }
                    break;
                case 11:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15476A(iM18235p2, unsafe.getInt(obj, jM18200A));
                    }
                    break;
                case 12:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15490m(iM18235p2, unsafe.getInt(obj, jM18200A));
                    }
                    break;
                case 13:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15499v(iM18235p2, unsafe.getInt(obj, jM18200A));
                    }
                    break;
                case 14:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15500w(iM18235p2, unsafe.getLong(obj, jM18200A));
                    }
                    break;
                case 15:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15501x(iM18235p2, unsafe.getInt(obj, jM18200A));
                    }
                    break;
                case 16:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15502y(iM18235p2, unsafe.getLong(obj, jM18200A));
                    }
                    break;
                case 17:
                    i2 = i10;
                    if ((i & i7) != 0) {
                        livVar.m15494q(iM18235p2, unsafe.getObject(obj, jM18200A), m18203D(i2));
                    }
                    break;
                case 18:
                    i2 = i10;
                    nzn.m18273F(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 19:
                    i2 = i10;
                    nzn.m18277J(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 20:
                    i2 = i10;
                    nzn.m18280M(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 21:
                    i2 = i10;
                    nzn.m18288U(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 22:
                    i2 = i10;
                    nzn.m18279L(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 23:
                    i2 = i10;
                    nzn.m18276I(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 24:
                    i2 = i10;
                    nzn.m18275H(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 25:
                    i2 = i10;
                    nzn.m18271D(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 26:
                    i2 = i10;
                    nzn.m18286S(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar);
                    break;
                case 27:
                    i2 = i10;
                    nzn.m18281N(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, m18203D(i2));
                    break;
                case 28:
                    i2 = i10;
                    nzn.m18272E(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar);
                    break;
                case 29:
                    i2 = i10;
                    nzn.m18287T(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 30:
                    i2 = i10;
                    nzn.m18274G(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 31:
                    i2 = i10;
                    nzn.m18282O(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 32:
                    i2 = i10;
                    nzn.m18283P(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 33:
                    i2 = i10;
                    nzn.m18284Q(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 34:
                    i2 = i10;
                    nzn.m18285R(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, false);
                    break;
                case 35:
                    i2 = i10;
                    nzn.m18273F(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 36:
                    i2 = i10;
                    nzn.m18277J(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 37:
                    i2 = i10;
                    nzn.m18280M(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 38:
                    i2 = i10;
                    nzn.m18288U(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 39:
                    i2 = i10;
                    nzn.m18279L(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 40:
                    i2 = i10;
                    nzn.m18276I(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 41:
                    i2 = i10;
                    nzn.m18275H(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 42:
                    i2 = i10;
                    nzn.m18271D(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 43:
                    i2 = i10;
                    nzn.m18287T(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 44:
                    i2 = i10;
                    nzn.m18274G(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 45:
                    i2 = i10;
                    nzn.m18282O(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 46:
                    i2 = i10;
                    nzn.m18283P(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 47:
                    i2 = i10;
                    nzn.m18284Q(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 48:
                    i2 = i10;
                    nzn.m18285R(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, true);
                    break;
                case 49:
                    i2 = i10;
                    nzn.m18278K(m18235p(i2), (List) unsafe.getObject(obj, jM18200A), livVar, m18203D(i2));
                    break;
                case 50:
                    i2 = i10;
                    m18228ac(livVar, iM18235p2, unsafe.getObject(obj, jM18200A), i2);
                    break;
                case 51:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15489l(iM18235p2, m18233n(obj, jM18200A));
                    }
                    break;
                case 52:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15493p(iM18235p2, m18234o(obj, jM18200A));
                    }
                    break;
                case 53:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15496s(iM18235p2, m18201B(obj, jM18200A));
                    }
                    break;
                case 54:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15477B(iM18235p2, m18201B(obj, jM18200A));
                    }
                    break;
                case 55:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15495r(iM18235p2, m18236q(obj, jM18200A));
                    }
                    break;
                case 56:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15492o(iM18235p2, m18201B(obj, jM18200A));
                    }
                    break;
                case 57:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15491n(iM18235p2, m18236q(obj, jM18200A));
                    }
                    break;
                case 58:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15487j(iM18235p2, m18224Y(obj, jM18200A));
                    }
                    break;
                case 59:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        m18229ad(iM18235p2, unsafe.getObject(obj, jM18200A), livVar);
                    }
                    break;
                case 60:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15497t(iM18235p2, unsafe.getObject(obj, jM18200A), m18203D(i2));
                    }
                    break;
                case 61:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15488k(iM18235p2, (nwr) unsafe.getObject(obj, jM18200A));
                    }
                    break;
                case 62:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15476A(iM18235p2, m18236q(obj, jM18200A));
                    }
                    break;
                case 63:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15490m(iM18235p2, m18236q(obj, jM18200A));
                    }
                    break;
                case 64:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15499v(iM18235p2, m18236q(obj, jM18200A));
                    }
                    break;
                case 65:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15500w(iM18235p2, m18201B(obj, jM18200A));
                    }
                    break;
                case 66:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15501x(iM18235p2, m18236q(obj, jM18200A));
                    }
                    break;
                case 67:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15502y(iM18235p2, m18201B(obj, jM18200A));
                    }
                    break;
                case 68:
                    i2 = i10;
                    if (m18223X(obj, iM18235p2, i2)) {
                        livVar.m15494q(iM18235p2, unsafe.getObject(obj, jM18200A), m18203D(i2));
                    }
                    break;
                default:
                    i2 = i10;
                    break;
            }
            i5 = i2 + 3;
            i4 = 1048575;
        }
        while (entry != null) {
            ntw.m17714W(livVar, entry);
            entry = itM18023d.hasNext() ? (Map.Entry) itM18023d.next() : null;
        }
        m18230ae(obj, livVar);
    }

    @Override // p000.nzm
    /* JADX INFO: renamed from: a */
    public final int mo18246a(Object obj) {
        int i;
        int i2 = 0;
        if (this.f45047j) {
            Unsafe unsafe = f45039b;
            int iM17991au = 0;
            while (i2 < this.f45040c.length) {
                int iM18245z = m18245z(i2);
                int iM18244y = m18244y(iM18245z);
                int iM18235p = m18235p(i2);
                long jM18200A = m18200A(iM18245z);
                if (iM18244y >= nxi.DOUBLE_LIST_PACKED.f44967Z && iM18244y <= nxi.SINT64_LIST_PACKED.f44967Z) {
                    int i3 = this.f45040c[i2 + 2];
                }
                switch (iM18244y) {
                    case 0:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17991au(iM18235p);
                        }
                        break;
                    case 1:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17994ax(iM18235p);
                        }
                        break;
                    case 2:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17968M(iM18235p, oag.m18358f(obj, jM18200A));
                        }
                        break;
                    case 3:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17984ac(iM18235p, oag.m18358f(obj, jM18200A));
                        }
                        break;
                    case 4:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17966K(iM18235p, oag.m18356d(obj, jM18200A));
                        }
                        break;
                    case 5:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17993aw(iM18235p);
                        }
                        break;
                    case 6:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17992av(iM18235p);
                        }
                        break;
                    case 7:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17990at(iM18235p);
                        }
                        break;
                    case 8:
                        if (m18219T(obj, i2)) {
                            Object objM18360h = oag.m18360h(obj, jM18200A);
                            iM17991au = objM18360h instanceof nwr ? iM17991au + nxb.m17962G(iM18235p, (nwr) objM18360h) : iM17991au + nxb.m17979X(iM18235p, (String) objM18360h);
                        }
                        break;
                    case 9:
                        if (m18219T(obj, i2)) {
                            iM17991au += nzn.m18299i(iM18235p, oag.m18360h(obj, jM18200A), m18203D(i2));
                        }
                        break;
                    case 10:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17962G(iM18235p, (nwr) oag.m18360h(obj, jM18200A));
                        }
                        break;
                    case 11:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17982aa(iM18235p, oag.m18356d(obj, jM18200A));
                        }
                        break;
                    case 12:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17964I(iM18235p, oag.m18356d(obj, jM18200A));
                        }
                        break;
                    case 13:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17995ay(iM18235p);
                        }
                        break;
                    case 14:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17996az(iM18235p);
                        }
                        break;
                    case 15:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17975T(iM18235p, oag.m18356d(obj, jM18200A));
                        }
                        break;
                    case 16:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17977V(iM18235p, oag.m18358f(obj, jM18200A));
                        }
                        break;
                    case 17:
                        if (m18219T(obj, i2)) {
                            iM17991au += nxb.m17965J(iM18235p, (nyw) oag.m18360h(obj, jM18200A), m18203D(i2));
                        }
                        break;
                    case 18:
                        iM17991au += nzn.m18310t(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 19:
                        iM17991au += nzn.m18309s(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 20:
                        iM17991au += nzn.m18312v(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 21:
                        iM17991au += nzn.m18316z(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 22:
                        iM17991au += nzn.m18311u(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 23:
                        iM17991au += nzn.m18310t(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 24:
                        iM17991au += nzn.m18309s(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 25:
                        iM17991au += nzn.m18307q(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 26:
                        iM17991au += nzn.m18303m(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 27:
                        iM17991au += nzn.m18300j(iM18235p, m18208I(obj, jM18200A), m18203D(i2));
                        break;
                    case 28:
                        iM17991au += nzn.m18292b(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 29:
                        iM17991au += nzn.m18315y(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 30:
                        iM17991au += nzn.m18308r(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 31:
                        iM17991au += nzn.m18309s(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 32:
                        iM17991au += nzn.m18310t(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 33:
                        iM17991au += nzn.m18313w(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 34:
                        iM17991au += nzn.m18314x(iM18235p, m18208I(obj, jM18200A));
                        break;
                    case 35:
                        int iM18295e = nzn.m18295e((List) unsafe.getObject(obj, jM18200A));
                        if (iM18295e > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18295e) + iM18295e;
                        }
                        break;
                    case 36:
                        int iM18294d = nzn.m18294d((List) unsafe.getObject(obj, jM18200A));
                        if (iM18294d > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18294d) + iM18294d;
                        }
                        break;
                    case 37:
                        int iM18298h = nzn.m18298h((List) unsafe.getObject(obj, jM18200A));
                        if (iM18298h > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18298h) + iM18298h;
                        }
                        break;
                    case 38:
                        int iM18305o = nzn.m18305o((List) unsafe.getObject(obj, jM18200A));
                        if (iM18305o > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18305o) + iM18305o;
                        }
                        break;
                    case 39:
                        int iM18297g = nzn.m18297g((List) unsafe.getObject(obj, jM18200A));
                        if (iM18297g > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18297g) + iM18297g;
                        }
                        break;
                    case 40:
                        int iM18295e2 = nzn.m18295e((List) unsafe.getObject(obj, jM18200A));
                        if (iM18295e2 > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18295e2) + iM18295e2;
                        }
                        break;
                    case 41:
                        int iM18294d2 = nzn.m18294d((List) unsafe.getObject(obj, jM18200A));
                        if (iM18294d2 > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18294d2) + iM18294d2;
                        }
                        break;
                    case 42:
                        int iM18291a = nzn.m18291a((List) unsafe.getObject(obj, jM18200A));
                        if (iM18291a > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18291a) + iM18291a;
                        }
                        break;
                    case 43:
                        int iM18304n = nzn.m18304n((List) unsafe.getObject(obj, jM18200A));
                        if (iM18304n > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18304n) + iM18304n;
                        }
                        break;
                    case 44:
                        int iM18293c = nzn.m18293c((List) unsafe.getObject(obj, jM18200A));
                        if (iM18293c > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18293c) + iM18293c;
                        }
                        break;
                    case 45:
                        int iM18294d3 = nzn.m18294d((List) unsafe.getObject(obj, jM18200A));
                        if (iM18294d3 > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18294d3) + iM18294d3;
                        }
                        break;
                    case 46:
                        int iM18295e3 = nzn.m18295e((List) unsafe.getObject(obj, jM18200A));
                        if (iM18295e3 > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18295e3) + iM18295e3;
                        }
                        break;
                    case 47:
                        int iM18301k = nzn.m18301k((List) unsafe.getObject(obj, jM18200A));
                        if (iM18301k > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18301k) + iM18301k;
                        }
                        break;
                    case 48:
                        int iM18302l = nzn.m18302l((List) unsafe.getObject(obj, jM18200A));
                        if (iM18302l > 0) {
                            iM17991au += nxb.m17981Z(iM18235p) + nxb.m17983ab(iM18302l) + iM18302l;
                        }
                        break;
                    case 49:
                        iM17991au += nzn.m18296f(iM18235p, m18208I(obj, jM18200A), m18203D(i2));
                        break;
                    case 50:
                        iM17991au += ntw.m17729o(iM18235p, oag.m18360h(obj, jM18200A), m18204E(i2));
                        break;
                    case 51:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17991au(iM18235p);
                        }
                        break;
                    case 52:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17994ax(iM18235p);
                        }
                        break;
                    case 53:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17968M(iM18235p, m18201B(obj, jM18200A));
                        }
                        break;
                    case 54:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17984ac(iM18235p, m18201B(obj, jM18200A));
                        }
                        break;
                    case 55:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17966K(iM18235p, m18236q(obj, jM18200A));
                        }
                        break;
                    case 56:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17993aw(iM18235p);
                        }
                        break;
                    case 57:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17992av(iM18235p);
                        }
                        break;
                    case 58:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17990at(iM18235p);
                        }
                        break;
                    case 59:
                        if (m18223X(obj, iM18235p, i2)) {
                            Object objM18360h2 = oag.m18360h(obj, jM18200A);
                            iM17991au = objM18360h2 instanceof nwr ? iM17991au + nxb.m17962G(iM18235p, (nwr) objM18360h2) : iM17991au + nxb.m17979X(iM18235p, (String) objM18360h2);
                        }
                        break;
                    case 60:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nzn.m18299i(iM18235p, oag.m18360h(obj, jM18200A), m18203D(i2));
                        }
                        break;
                    case 61:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17962G(iM18235p, (nwr) oag.m18360h(obj, jM18200A));
                        }
                        break;
                    case 62:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17982aa(iM18235p, m18236q(obj, jM18200A));
                        }
                        break;
                    case 63:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17964I(iM18235p, m18236q(obj, jM18200A));
                        }
                        break;
                    case 64:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17995ay(iM18235p);
                        }
                        break;
                    case 65:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17996az(iM18235p);
                        }
                        break;
                    case 66:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17975T(iM18235p, m18236q(obj, jM18200A));
                        }
                        break;
                    case 67:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17977V(iM18235p, m18201B(obj, jM18200A));
                        }
                        break;
                    case 68:
                        if (m18223X(obj, iM18235p, i2)) {
                            iM17991au += nxb.m17965J(iM18235p, (nyw) oag.m18360h(obj, jM18200A), m18203D(i2));
                        }
                        break;
                }
                i2 += 3;
            }
            return iM17991au + m18226aa(obj);
        }
        Unsafe unsafe2 = f45039b;
        int iM17991au2 = 0;
        int i4 = 1048575;
        int i5 = 0;
        for (int i6 = 0; i6 < this.f45040c.length; i6 += 3) {
            int iM18245z2 = m18245z(i6);
            int iM18235p2 = m18235p(i6);
            int iM18244y2 = m18244y(iM18245z2);
            if (iM18244y2 <= 17) {
                int i7 = this.f45040c[i6 + 2];
                int i8 = i7 & 1048575;
                int i9 = i7 >>> 20;
                if (i8 != i4) {
                    i5 = unsafe2.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << i9;
            } else {
                i = 0;
            }
            long jM18200A2 = m18200A(iM18245z2);
            switch (iM18244y2) {
                case 0:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17991au(iM18235p2);
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17994ax(iM18235p2);
                    }
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17968M(iM18235p2, unsafe2.getLong(obj, jM18200A2));
                    }
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17984ac(iM18235p2, unsafe2.getLong(obj, jM18200A2));
                    }
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17966K(iM18235p2, unsafe2.getInt(obj, jM18200A2));
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17993aw(iM18235p2);
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17992av(iM18235p2);
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17990at(iM18235p2);
                    }
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        Object object = unsafe2.getObject(obj, jM18200A2);
                        iM17991au2 = object instanceof nwr ? iM17991au2 + nxb.m17962G(iM18235p2, (nwr) object) : iM17991au2 + nxb.m17979X(iM18235p2, (String) object);
                    }
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nzn.m18299i(iM18235p2, unsafe2.getObject(obj, jM18200A2), m18203D(i6));
                    }
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17962G(iM18235p2, (nwr) unsafe2.getObject(obj, jM18200A2));
                    }
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17982aa(iM18235p2, unsafe2.getInt(obj, jM18200A2));
                    }
                    break;
                case 12:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17964I(iM18235p2, unsafe2.getInt(obj, jM18200A2));
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17995ay(iM18235p2);
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17996az(iM18235p2);
                    }
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17975T(iM18235p2, unsafe2.getInt(obj, jM18200A2));
                    }
                    break;
                case 16:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17977V(iM18235p2, unsafe2.getLong(obj, jM18200A2));
                    }
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        iM17991au2 += nxb.m17965J(iM18235p2, (nyw) unsafe2.getObject(obj, jM18200A2), m18203D(i6));
                    }
                    break;
                case 18:
                    iM17991au2 += nzn.m18310t(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 19:
                    iM17991au2 += nzn.m18309s(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 20:
                    iM17991au2 += nzn.m18312v(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 21:
                    iM17991au2 += nzn.m18316z(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 22:
                    iM17991au2 += nzn.m18311u(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 23:
                    iM17991au2 += nzn.m18310t(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 24:
                    iM17991au2 += nzn.m18309s(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 25:
                    iM17991au2 += nzn.m18307q(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 26:
                    iM17991au2 += nzn.m18303m(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 27:
                    iM17991au2 += nzn.m18300j(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2), m18203D(i6));
                    break;
                case 28:
                    iM17991au2 += nzn.m18292b(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 29:
                    iM17991au2 += nzn.m18315y(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 30:
                    iM17991au2 += nzn.m18308r(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 31:
                    iM17991au2 += nzn.m18309s(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 32:
                    iM17991au2 += nzn.m18310t(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 33:
                    iM17991au2 += nzn.m18313w(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 34:
                    iM17991au2 += nzn.m18314x(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2));
                    break;
                case 35:
                    int iM18295e4 = nzn.m18295e((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18295e4 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18295e4) + iM18295e4;
                    }
                    break;
                case 36:
                    int iM18294d4 = nzn.m18294d((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18294d4 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18294d4) + iM18294d4;
                    }
                    break;
                case 37:
                    int iM18298h2 = nzn.m18298h((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18298h2 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18298h2) + iM18298h2;
                    }
                    break;
                case 38:
                    int iM18305o2 = nzn.m18305o((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18305o2 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18305o2) + iM18305o2;
                    }
                    break;
                case 39:
                    int iM18297g2 = nzn.m18297g((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18297g2 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18297g2) + iM18297g2;
                    }
                    break;
                case 40:
                    int iM18295e5 = nzn.m18295e((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18295e5 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18295e5) + iM18295e5;
                    }
                    break;
                case 41:
                    int iM18294d5 = nzn.m18294d((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18294d5 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18294d5) + iM18294d5;
                    }
                    break;
                case 42:
                    int iM18291a2 = nzn.m18291a((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18291a2 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18291a2) + iM18291a2;
                    }
                    break;
                case 43:
                    int iM18304n2 = nzn.m18304n((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18304n2 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18304n2) + iM18304n2;
                    }
                    break;
                case 44:
                    int iM18293c2 = nzn.m18293c((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18293c2 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18293c2) + iM18293c2;
                    }
                    break;
                case 45:
                    int iM18294d6 = nzn.m18294d((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18294d6 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18294d6) + iM18294d6;
                    }
                    break;
                case 46:
                    int iM18295e6 = nzn.m18295e((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18295e6 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18295e6) + iM18295e6;
                    }
                    break;
                case 47:
                    int iM18301k2 = nzn.m18301k((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18301k2 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18301k2) + iM18301k2;
                    }
                    break;
                case 48:
                    int iM18302l2 = nzn.m18302l((List) unsafe2.getObject(obj, jM18200A2));
                    if (iM18302l2 > 0) {
                        iM17991au2 += nxb.m17981Z(iM18235p2) + nxb.m17983ab(iM18302l2) + iM18302l2;
                    }
                    break;
                case 49:
                    iM17991au2 += nzn.m18296f(iM18235p2, (List) unsafe2.getObject(obj, jM18200A2), m18203D(i6));
                    break;
                case 50:
                    iM17991au2 += ntw.m17729o(iM18235p2, unsafe2.getObject(obj, jM18200A2), m18204E(i6));
                    break;
                case 51:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17991au(iM18235p2);
                    }
                    break;
                case 52:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17994ax(iM18235p2);
                    }
                    break;
                case 53:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17968M(iM18235p2, m18201B(obj, jM18200A2));
                    }
                    break;
                case 54:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17984ac(iM18235p2, m18201B(obj, jM18200A2));
                    }
                    break;
                case 55:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17966K(iM18235p2, m18236q(obj, jM18200A2));
                    }
                    break;
                case 56:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17993aw(iM18235p2);
                    }
                    break;
                case 57:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17992av(iM18235p2);
                    }
                    break;
                case 58:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17990at(iM18235p2);
                    }
                    break;
                case 59:
                    if (m18223X(obj, iM18235p2, i6)) {
                        Object object2 = unsafe2.getObject(obj, jM18200A2);
                        iM17991au2 = object2 instanceof nwr ? iM17991au2 + nxb.m17962G(iM18235p2, (nwr) object2) : iM17991au2 + nxb.m17979X(iM18235p2, (String) object2);
                    }
                    break;
                case 60:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nzn.m18299i(iM18235p2, unsafe2.getObject(obj, jM18200A2), m18203D(i6));
                    }
                    break;
                case 61:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17962G(iM18235p2, (nwr) unsafe2.getObject(obj, jM18200A2));
                    }
                    break;
                case 62:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17982aa(iM18235p2, m18236q(obj, jM18200A2));
                    }
                    break;
                case 63:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17964I(iM18235p2, m18236q(obj, jM18200A2));
                    }
                    break;
                case 64:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17995ay(iM18235p2);
                    }
                    break;
                case 65:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17996az(iM18235p2);
                    }
                    break;
                case 66:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17975T(iM18235p2, m18236q(obj, jM18200A2));
                    }
                    break;
                case 67:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17977V(iM18235p2, m18201B(obj, jM18200A2));
                    }
                    break;
                case 68:
                    if (m18223X(obj, iM18235p2, i6)) {
                        iM17991au2 += nxb.m17965J(iM18235p2, (nyw) unsafe2.getObject(obj, jM18200A2), m18203D(i6));
                    }
                    break;
            }
        }
        int iM18226aa = iM17991au2 + m18226aa(obj);
        if (!this.f45045h) {
            return iM18226aa;
        }
        nxh nxhVarM17734t = ntw.m17734t(obj);
        int iM18018j = 0;
        while (i2 < nxhVarM17734t.f44911b.m18322a()) {
            Map.Entry entryM18326f = nxhVarM17734t.f44911b.m18326f(i2);
            iM18018j += nxh.m18018j((nxp) entryM18326f.getKey(), entryM18326f.getValue());
            i2++;
        }
        for (Map.Entry entry : nxhVarM17734t.f44911b.m18323c()) {
            iM18018j += nxh.m18018j((nxp) entry.getKey(), entry.getValue());
        }
        return iM18226aa + iM18018j;
    }
}
