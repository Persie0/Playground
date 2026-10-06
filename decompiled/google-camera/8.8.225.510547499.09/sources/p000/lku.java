package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class lku {

    /* JADX INFO: renamed from: a */
    public static volatile long f38516a;

    /* JADX INFO: renamed from: A */
    public static void m15606A(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(m15665s(str, Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m15607B(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(m15665s(str, obj));
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m15608C(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(m15665s(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m15609D(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new IllegalArgumentException(m15665s(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m15610E(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(m15665s(str, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m15611F(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(m15665s(str, obj, obj2, obj3));
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m15612G(int i, int i2, int i3) {
        String strM15646ao;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM15646ao = m15646ao(i, i3, "start index");
            } else {
                strM15646ao = (i2 < 0 || i2 > i3) ? m15646ao(i2, i3, "end index") : m15665s("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM15646ao);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m15613H(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m15614I(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m15615J(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(m15665s(str, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: K */
    public static void m15616K(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(m15665s(str, obj));
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m15617L(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(m15665s(str, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m15618M(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(m15665s(str, obj, obj2, obj3));
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m15619N(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalStateException(m15665s(str, obj, obj2, obj3, obj4));
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m15620O(int i, int i2) {
        String strM15665s;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM15665s = m15665s("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException("negative size: " + i2);
                }
                strM15665s = m15665s("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM15665s);
        }
    }

    /* JADX INFO: renamed from: P */
    public static void m15621P(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m15646ao(i, i2, "index"));
        }
    }

    /* JADX INFO: renamed from: Q */
    public static mbb m15622Q(Set set) {
        return new mbb(set);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: R */
    public static void m15623R(mbb mbbVar, Set set) {
        Iterator it = mbbVar.f39760a.iterator();
        while (it.hasNext()) {
            set.add(Integer.valueOf(((Integer) it.next()).intValue()));
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m15624S(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m15625T(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: U */
    public static byte[] m15626U(String str) {
        byte[] bytes = str.getBytes(oph.f46377a);
        bytes.getClass();
        return bytes;
    }

    /* JADX INFO: renamed from: W */
    public static long m15627W(pau pauVar) {
        return pauVar.f47299b / 4;
    }

    /* JADX INFO: renamed from: X */
    public static paw m15628X(pbg pbgVar) {
        return new pbc(pbgVar);
    }

    /* JADX INFO: renamed from: Y */
    public static int m15629Y(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static int m15630Z(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static float[] m15631a(float f, float f2) {
        float[] fArr = new float[8];
        int i = 0;
        int i2 = 0;
        float f3 = 1.0f;
        while (true) {
            float f4 = i;
            if (f4 > 0.0f) {
                return fArr;
            }
            if (i > 0) {
                int i3 = i2 + 1;
                fArr[i2] = fArr[i3 - 3];
                int i4 = i3 + 1;
                fArr[i3] = fArr[i4 - 3];
                int i5 = i4 + 1;
                fArr[i4] = f;
                i2 = i5 + 1;
                fArr[i5] = f3;
            }
            float f5 = (-1.0f) + f2;
            float f6 = f4 == 0.0f ? f2 : f3 + f5;
            float f7 = f;
            for (int i6 = 0; i6 <= 1; i6++) {
                int i7 = i2 + 1;
                fArr[i2] = f7;
                int i8 = i7 + 1;
                fArr[i7] = f3;
                int i9 = i8 + 1;
                fArr[i8] = f7;
                i2 = i9 + 1;
                fArr[i9] = f6;
                f7 += 1.0f - f;
            }
            f3 += f5;
            i++;
        }
    }

    /* JADX INFO: renamed from: aa */
    public static int m15632aa(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: ab */
    public static int m15633ab(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: ac */
    public static Object m15634ac(jpp jppVar, ols olsVar) throws Exception {
        if (!jppVar.mo13451d()) {
            opy opyVar = new opy(omn.m18701f(olsVar), 1);
            opyVar.m18898x();
            jppVar.mo13455h(caz.f4940a, new oyv(opyVar));
            Object objM18887m = opyVar.m18887m();
            return objM18887m == oma.COROUTINE_SUSPENDED ? objM18887m : objM18887m;
        }
        Exception excMo13449b = jppVar.mo13449b();
        if (excMo13449b != null) {
            throw excMo13449b;
        }
        if (!((jpt) jppVar).f34565c) {
            return jppVar.mo13450c();
        }
        throw new CancellationException("Task " + jppVar + " was cancelled normally.");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ols, omg] */
    /* JADX INFO: renamed from: ad */
    public static Object m15635ad(oxw oxwVar, Object obj, onm onmVar) throws Throwable {
        Object oqgVar;
        try {
            ook.m18788b(onmVar, 2);
            oqgVar = onmVar.mo560a(obj, oxwVar);
        } catch (Throwable th) {
            oqgVar = new oqg(th);
        }
        oma omaVar = oma.COROUTINE_SUSPENDED;
        if (oqgVar == omaVar) {
            return omaVar;
        }
        Object objM19011cW = oxwVar.m19011cW(oqgVar);
        if (objM19011cW == osh.f46491b) {
            return oma.COROUTINE_SUSPENDED;
        }
        if (!(objM19011cW instanceof oqg)) {
            return osh.m19017b(objM19011cW);
        }
        Throwable th2 = ((oqg) objM19011cW).f46421b;
        ?? r1 = oxwVar.f46797e;
        if (oqu.f46433b && (r1 instanceof omg)) {
            throw oxy.m19156a(th2, r1);
        }
        throw th2;
    }

    /* JADX INFO: renamed from: ae */
    public static /* synthetic */ void m15636ae(onm onmVar, Object obj, ols olsVar) {
        try {
            oxg.m19129a(omn.m18701f(omn.m18700e(onmVar, obj, olsVar)), oki.f46196a);
        } catch (Throwable th) {
            olsVar.mo18640e(lkm.m15591r(th));
            throw th;
        }
    }

    /* JADX INFO: renamed from: af */
    public static int m15637af(String str, int i, int i2, int i3) {
        return (int) m15638ag(str, i, i2, i3);
    }

    /* JADX INFO: renamed from: ag */
    public static long m15638ag(String str, long j, long j2, long j3) {
        String strM19163a = oya.m19163a(str);
        if (strM19163a == null) {
            return j;
        }
        Long lM18799m = ook.m18799m(strM19163a);
        if (lM18799m == null) {
            throw new IllegalStateException("System property '" + str + "' has unrecognized value '" + strM19163a + "'");
        }
        long jLongValue = lM18799m.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + "'");
    }

    /* JADX INFO: renamed from: ah */
    public static boolean m15639ah(String str, boolean z) {
        String strM19163a = oya.m19163a(str);
        return strM19163a != null ? Boolean.parseBoolean(strM19163a) : z;
    }

    /* JADX INFO: renamed from: ai */
    public static /* synthetic */ int m15640ai(String str, int i, int i2, int i3, int i4) {
        int i5 = i2 | (((i4 & 4) != 0 ? 0 : 1) ^ 1);
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return m15637af(str, i, i5, i3);
    }

    /* JADX INFO: renamed from: ak */
    public static long m15642ak(long j, long j2) {
        return j & (j2 ^ (-1));
    }

    /* JADX INFO: renamed from: al */
    public static long m15643al(long j, int i) {
        return m15642ak(j, 1073741823L) | ((long) i);
    }

    /* JADX INFO: renamed from: am */
    public static Object m15644am(nps npsVar, ols olsVar) throws Throwable {
        try {
            if (npsVar.isDone()) {
                return ntw.m17727m(npsVar);
            }
            opy opyVar = new opy(omn.m18701f(olsVar), 1);
            opyVar.m18898x();
            npsVar.mo2282d(new bek(npsVar, opyVar, 7), not.INSTANCE);
            opyVar.mo18870a(new avu(npsVar, 11));
            Object objM18887m = opyVar.m18887m();
            oma omaVar = oma.COROUTINE_SUSPENDED;
            return objM18887m;
        } catch (ExecutionException e) {
            throw m15645an(e);
        }
    }

    /* JADX INFO: renamed from: an */
    public static Throwable m15645an(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    /* JADX INFO: renamed from: ao */
    private static String m15646ao(int i, int i2, String str) {
        if (i < 0) {
            return m15665s("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return m15665s("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }

    /* JADX INFO: renamed from: ap */
    public static Object m15647ap(oly olyVar, Object obj, Object obj2, onm onmVar, ols olsVar) {
        Object objM19165b = oyb.m19165b(olyVar, obj2);
        try {
            ows owsVar = new ows(olsVar, olyVar);
            ook.m18788b(onmVar, 2);
            Object objMo560a = onmVar.mo560a(obj, owsVar);
            oyb.m19166c(olyVar, objM19165b);
            oma omaVar = oma.COROUTINE_SUSPENDED;
            return objMo560a;
        } catch (Throwable th) {
            oyb.m19166c(olyVar, objM19165b);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static StringBuilder m15649c(int i) {
        m15655i(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }

    /* JADX INFO: renamed from: d */
    public static Collection m15650d(Collection collection, mrp mrpVar) {
        collection.getClass();
        mrpVar.getClass();
        return new mud(collection, mrpVar);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m15651e(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m15652f(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m15653g(Object obj, Object obj2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("null key in entry: null=");
            sb.append(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: renamed from: h */
    public static void m15654h(boolean z) {
        m15614I(z, "no calls to next() since the last call to remove()");
    }

    /* JADX INFO: renamed from: i */
    public static void m15655i(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX INFO: renamed from: j */
    public static int m15656j(boolean z) {
        return z ? 2 : 1;
    }

    /* JADX INFO: renamed from: k */
    public static void m15657k(boolean z) {
        if (!z) {
            throw new mso();
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m15658l(boolean z, String str, Object obj) {
        if (!z) {
            throw new mso(m15665s(str, obj));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m15659m(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new mso(m15665s(str, objArr));
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m15660n(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new mso(m15665s(str, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m15661o(Object obj, String str, Object... objArr) {
        if (obj == null) {
            throw new mso(m15665s(str, objArr));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m15662p(Object obj) {
        m15661o(obj, "expected a non-null reference", new Object[0]);
    }

    /* JADX INFO: renamed from: q */
    public static msi m15663q(msi msiVar) {
        if ((msiVar instanceof msk) || (msiVar instanceof msj)) {
            return msiVar;
        }
        return msiVar instanceof Serializable ? new msj(msiVar) : new msk(msiVar);
    }

    /* JADX INFO: renamed from: r */
    public static msi m15664r(Object obj) {
        return new msl(obj);
    }

    /* JADX INFO: renamed from: s */
    public static String m15665s(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    string = "<" + str2 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: t */
    public static String m15666t(String str, int i) {
        str.getClass();
        if (str.length() >= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int length = str.length(); length < i; length++) {
            sb.append('0');
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public static void m15667u(int i, Set set) {
        set.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: v */
    public static void m15668v(int i, int i2, Set set) {
        while (i <= i2) {
            set.add(Integer.valueOf(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m15669w(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m15670x(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m15671y(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(m15665s(str, Character.valueOf(c)));
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m15672z(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(m15665s(str, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m15673V(long j, pau pauVar, int i, List list, int i2, int i3, List list2) {
        int iIntValue;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((pax) list.get(i8)).mo19280b() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        pax paxVar = (pax) list.get(i2);
        pax paxVar2 = (pax) list.get(i3 - 1);
        if (i7 == paxVar.mo19280b()) {
            int i9 = i2 + 1;
            i4 = i9;
            iIntValue = ((Number) list2.get(i2)).intValue();
            paxVar = (pax) list.get(i9);
        } else {
            iIntValue = -1;
            i4 = i2;
        }
        if (paxVar.mo19279a(i7) == paxVar2.mo19279a(i7)) {
            int iMin = Math.min(paxVar.mo19280b(), paxVar2.mo19280b());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && paxVar.mo19279a(i11) == paxVar2.mo19279a(i11); i11++) {
                i10++;
            }
            long jM15627W = j + m15627W(pauVar) + 2;
            long j2 = i10;
            pauVar.m19275r(-i10);
            pauVar.m19275r(iIntValue);
            int i12 = i7 + i10;
            while (i7 < i12) {
                pauVar.m19275r(paxVar.mo19279a(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 != ((pax) list.get(i4)).mo19280b()) {
                    throw new IllegalStateException("Check failed.");
                }
                pauVar.m19275r(((Number) list2.get(i4)).intValue());
                return;
            } else {
                long j3 = jM15627W + j2 + 1;
                pau pauVar2 = new pau();
                pauVar.m19275r(-((int) (m15627W(pauVar2) + j3)));
                m15673V(j3, pauVar2, i12, list, i4, i3, list2);
                pauVar.m19272o(pauVar2);
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((pax) list.get(i14 - 1)).mo19279a(i7) != ((pax) list.get(i14)).mo19279a(i7)) {
                i13++;
            }
        }
        long jM15627W2 = j + m15627W(pauVar) + 2;
        int i15 = i13 + i13;
        pauVar.m19275r(i13);
        pauVar.m19275r(iIntValue);
        for (int i16 = i4; i16 < i3; i16++) {
            byte bMo19279a = ((pax) list.get(i16)).mo19279a(i7);
            if (i16 == i4 || bMo19279a != ((pax) list.get(i16 - 1)).mo19279a(i7)) {
                pauVar.m19275r(bMo19279a & 255);
            }
        }
        pau pauVar3 = new pau();
        int i17 = i4;
        while (i17 < i3) {
            byte bMo19279a2 = ((pax) list.get(i17)).mo19279a(i7);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i3) {
                    i5 = i3;
                    break;
                } else {
                    if (bMo19279a2 != ((pax) list.get(i19)).mo19279a(i7)) {
                        i5 = i19;
                        break;
                    }
                    i19++;
                }
            }
            if (i18 == i5 && i7 + 1 == ((pax) list.get(i17)).mo19280b()) {
                pauVar.m19275r(((Number) list2.get(i17)).intValue());
                i6 = i5;
            } else {
                long j4 = jM15627W2 + ((long) i15);
                pauVar.m19275r(-((int) (m15627W(pauVar3) + j4)));
                i6 = i5;
                m15673V(j4, pauVar3, i7 + 1, list, i17, i6, list2);
            }
            pauVar3 = pauVar3;
            i15 = i15;
            i17 = i6;
            jM15627W2 = jM15627W2;
        }
        pauVar.m19272o(pauVar3);
    }
}
