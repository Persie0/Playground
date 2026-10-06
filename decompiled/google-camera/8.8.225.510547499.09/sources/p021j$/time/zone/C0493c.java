package p021j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import p021j$.nio.file.attribute.AbstractC0359Y;
import p021j$.time.C0459g;
import p021j$.time.C0461i;
import p021j$.time.C0468p;
import p021j$.time.Clock;
import p021j$.time.Instant;
import p021j$.util.Objects;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.zone.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0493c implements Serializable {

    /* JADX INFO: renamed from: i */
    private static final long[] f33093i = new long[0];

    /* JADX INFO: renamed from: j */
    private static final AbstractC0492b[] f33094j = new AbstractC0492b[0];

    /* JADX INFO: renamed from: k */
    private static final C0461i[] f33095k = new C0461i[0];

    /* JADX INFO: renamed from: l */
    private static final C0491a[] f33096l = new C0491a[0];

    /* JADX INFO: renamed from: a */
    private final long[] f33097a;

    /* JADX INFO: renamed from: b */
    private final C0468p[] f33098b;

    /* JADX INFO: renamed from: c */
    private final long[] f33099c;

    /* JADX INFO: renamed from: d */
    private final C0461i[] f33100d;

    /* JADX INFO: renamed from: e */
    private final C0468p[] f33101e;

    /* JADX INFO: renamed from: f */
    private final AbstractC0492b[] f33102f;

    /* JADX INFO: renamed from: g */
    private final TimeZone f33103g;

    /* JADX INFO: renamed from: h */
    private final transient ConcurrentHashMap f33104h = new ConcurrentHashMap();

    private C0493c(C0468p c0468p) {
        C0468p[] c0468pArr = {c0468p};
        this.f33098b = c0468pArr;
        long[] jArr = f33093i;
        this.f33097a = jArr;
        this.f33099c = jArr;
        this.f33100d = f33095k;
        this.f33101e = c0468pArr;
        this.f33102f = f33094j;
        this.f33103g = null;
    }

    /* JADX INFO: renamed from: a */
    private static Object m12484a(C0461i c0461i, C0491a c0491a) {
        C0461i c0461iM12477c = c0491a.m12477c();
        boolean zM12482j = c0491a.m12482j();
        boolean zM12355D = c0461i.m12355D(c0461iM12477c);
        if (zM12482j) {
            if (zM12355D) {
                return c0491a.m12480h();
            }
            return c0461i.m12355D(c0491a.m12476a()) ? c0491a : c0491a.m12479f();
        }
        if (zM12355D) {
            return c0461i.m12355D(c0491a.m12476a()) ? c0491a.m12480h() : c0491a;
        }
        return c0491a.m12479f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private C0491a[] m12485b(int i) {
        long j;
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap concurrentHashMap = this.f33104h;
        C0491a[] c0491aArr = (C0491a[]) concurrentHashMap.get(numValueOf);
        if (c0491aArr != null) {
            return c0491aArr;
        }
        TimeZone timeZone = this.f33103g;
        if (timeZone == null) {
            AbstractC0492b[] abstractC0492bArr = this.f33102f;
            C0491a[] c0491aArr2 = new C0491a[abstractC0492bArr.length];
            if (abstractC0492bArr.length > 0) {
                AbstractC0492b abstractC0492b = abstractC0492bArr[0];
                throw null;
            }
            if (i < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, c0491aArr2);
            }
            return c0491aArr2;
        }
        C0491a[] c0491aArr3 = f33096l;
        if (i < 1800) {
            return c0491aArr3;
        }
        long jM12358K = C0461i.m12346E(i - 1).m12358K(this.f33098b[0]);
        int offset = timeZone.getOffset(jM12358K * 1000);
        long j2 = 31968000 + jM12358K;
        while (jM12358K < j2) {
            long j3 = 7776000 + jM12358K;
            long j4 = jM12358K;
            if (offset != timeZone.getOffset(j3 * 1000)) {
                jM12358K = j4;
                while (j3 - jM12358K > 1) {
                    int i2 = offset;
                    long j5 = j2;
                    long jM12154c = AbstractC0359Y.m12154c(j3 + jM12358K, 2L);
                    if (timeZone.getOffset(jM12154c * 1000) == i2) {
                        jM12358K = jM12154c;
                    } else {
                        j3 = jM12154c;
                    }
                    offset = i2;
                    j2 = j5;
                }
                j = j2;
                int i3 = offset;
                if (timeZone.getOffset(jM12358K * 1000) == i3) {
                    jM12358K = j3;
                }
                C0468p c0468pM12489k = m12489k(i3);
                offset = timeZone.getOffset(jM12358K * 1000);
                C0468p c0468pM12489k2 = m12489k(offset);
                if (m12486c(jM12358K, c0468pM12489k2) == i) {
                    c0491aArr3 = (C0491a[]) Arrays.copyOf(c0491aArr3, c0491aArr3.length + 1);
                    c0491aArr3[c0491aArr3.length - 1] = new C0491a(jM12358K, c0468pM12489k, c0468pM12489k2);
                }
            } else {
                j = j2;
                jM12358K = j3;
            }
            j2 = j;
        }
        if (1916 <= i && i < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, c0491aArr3);
        }
        return c0491aArr3;
    }

    /* JADX INFO: renamed from: c */
    private static int m12486c(long j, C0468p c0468p) {
        return C0459g.m12323J(AbstractC0359Y.m12154c(j + ((long) c0468p.m12402z()), 86400)).m12329D();
    }

    /* JADX INFO: renamed from: e */
    private Object m12487e(C0461i c0461i) {
        Object obj = null;
        C0468p[] c0468pArr = this.f33098b;
        int i = 0;
        TimeZone timeZone = this.f33103g;
        if (timeZone != null) {
            C0491a[] c0491aArrM12485b = m12485b(c0461i.m12353B());
            if (c0491aArrM12485b.length == 0) {
                return m12489k(timeZone.getOffset(c0461i.m12358K(c0468pArr[0]) * 1000));
            }
            int length = c0491aArrM12485b.length;
            while (i < length) {
                C0491a c0491a = c0491aArrM12485b[i];
                Object objM12484a = m12484a(c0461i, c0491a);
                if ((objM12484a instanceof C0491a) || objM12484a.equals(c0491a.m12480h())) {
                    return objM12484a;
                }
                i++;
                obj = objM12484a;
            }
            return obj;
        }
        if (this.f33099c.length == 0) {
            return c0468pArr[0];
        }
        int length2 = this.f33102f.length;
        C0461i[] c0461iArr = this.f33100d;
        if (length2 > 0 && c0461i.m12354C(c0461iArr[c0461iArr.length - 1])) {
            C0491a[] c0491aArrM12485b2 = m12485b(c0461i.m12353B());
            int length3 = c0491aArrM12485b2.length;
            while (i < length3) {
                C0491a c0491a2 = c0491aArrM12485b2[i];
                Object objM12484a2 = m12484a(c0461i, c0491a2);
                if ((objM12484a2 instanceof C0491a) || objM12484a2.equals(c0491a2.m12480h())) {
                    return objM12484a2;
                }
                i++;
                obj = objM12484a2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(c0461iArr, c0461i);
        C0468p[] c0468pArr2 = this.f33101e;
        if (iBinarySearch == -1) {
            return c0468pArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < c0461iArr.length - 1) {
            int i2 = iBinarySearch + 1;
            if (c0461iArr[iBinarySearch].equals(c0461iArr[i2])) {
                iBinarySearch = i2;
            }
        }
        if ((iBinarySearch & 1) != 0) {
            return c0468pArr2[(iBinarySearch / 2) + 1];
        }
        C0461i c0461i2 = c0461iArr[iBinarySearch];
        C0461i c0461i3 = c0461iArr[iBinarySearch + 1];
        int i3 = iBinarySearch / 2;
        C0468p c0468p = c0468pArr2[i3];
        C0468p c0468p2 = c0468pArr2[i3 + 1];
        return c0468p2.m12402z() > c0468p.m12402z() ? new C0491a(c0461i2, c0468p, c0468p2) : new C0491a(c0461i3, c0468p, c0468p2);
    }

    /* JADX INFO: renamed from: j */
    public static C0493c m12488j(C0468p c0468p) {
        if (c0468p != null) {
            return new C0493c(c0468p);
        }
        throw new NullPointerException("offset");
    }

    /* JADX INFO: renamed from: k */
    private static C0468p m12489k(int i) {
        return C0468p.m12399C(i / 1000);
    }

    /* JADX INFO: renamed from: d */
    public final C0468p m12490d(Instant instant) {
        TimeZone timeZone = this.f33103g;
        if (timeZone != null) {
            return m12489k(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f33099c;
        if (jArr.length == 0) {
            return this.f33098b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f33102f.length;
        C0468p[] c0468pArr = this.f33101e;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return c0468pArr[iBinarySearch + 1];
        }
        C0491a[] c0491aArrM12485b = m12485b(m12486c(epochSecond, c0468pArr[c0468pArr.length - 1]));
        C0491a c0491a = null;
        for (int i = 0; i < c0491aArrM12485b.length; i++) {
            c0491a = c0491aArrM12485b[i];
            if (epochSecond < c0491a.m12483k()) {
                return c0491a.m12480h();
            }
        }
        return c0491a.m12479f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0493c)) {
            return false;
        }
        C0493c c0493c = (C0493c) obj;
        return Objects.equals(this.f33103g, c0493c.f33103g) && Arrays.equals(this.f33097a, c0493c.f33097a) && Arrays.equals(this.f33098b, c0493c.f33098b) && Arrays.equals(this.f33099c, c0493c.f33099c) && Arrays.equals(this.f33101e, c0493c.f33101e) && Arrays.equals(this.f33102f, c0493c.f33102f);
    }

    /* JADX INFO: renamed from: f */
    public final C0491a m12491f(C0461i c0461i) {
        Object objM12487e = m12487e(c0461i);
        if (objM12487e instanceof C0491a) {
            return (C0491a) objM12487e;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final List m12492g(C0461i c0461i) {
        Object objM12487e = m12487e(c0461i);
        return objM12487e instanceof C0491a ? ((C0491a) objM12487e).m12481i() : Collections.singletonList((C0468p) objM12487e);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12493h(Instant instant) {
        C0468p c0468pM12489k;
        TimeZone timeZone = this.f33103g;
        if (timeZone != null) {
            c0468pM12489k = m12489k(timeZone.getRawOffset());
        } else {
            int length = this.f33099c.length;
            C0468p[] c0468pArr = this.f33098b;
            if (length == 0) {
                c0468pM12489k = c0468pArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.f33097a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                c0468pM12489k = c0468pArr[iBinarySearch + 1];
            }
        }
        return !c0468pM12489k.equals(m12490d(instant));
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f33103g) ^ Arrays.hashCode(this.f33097a)) ^ Arrays.hashCode(this.f33098b)) ^ Arrays.hashCode(this.f33099c)) ^ Arrays.hashCode(this.f33101e)) ^ Arrays.hashCode(this.f33102f);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00db A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public final boolean m12494i() {
        C0491a c0491a;
        TimeZone timeZone = this.f33103g;
        if (timeZone == null) {
            return this.f33099c.length == 0;
        }
        if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
            return false;
        }
        Instant instantNow = Instant.now();
        long epochSecond = instantNow.getEpochSecond();
        if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
            epochSecond++;
        }
        int iM12486c = m12486c(epochSecond, m12490d(instantNow));
        C0491a[] c0491aArrM12485b = m12485b(iM12486c);
        for (int length = c0491aArrM12485b.length - 1; length >= 0; length--) {
            if (epochSecond > c0491aArrM12485b[length].m12483k()) {
                c0491a = c0491aArrM12485b[length];
                if (c0491a == null) {
                    return true;
                }
                return false;
            }
        }
        if (iM12486c > 1800) {
            C0491a[] c0491aArrM12485b2 = m12485b(iM12486c - 1);
            for (int length2 = c0491aArrM12485b2.length - 1; length2 >= 0; length2--) {
                if (epochSecond > c0491aArrM12485b2[length2].m12483k()) {
                    c0491a = c0491aArrM12485b2[length2];
                }
            }
            int offset = timeZone.getOffset((epochSecond - 1) * 1000);
            long jM12337P = C0459g.m12322I(1800, 1, 1).m12337P() * 86400;
            for (long jMin = Math.min(epochSecond - 31104000, (Clock.systemUTC().mo12233a() / 1000) + 31968000); jM12337P <= jMin; jMin -= 7776000) {
                int offset2 = timeZone.getOffset(jMin * 1000);
                if (offset != offset2) {
                    int iM12486c2 = m12486c(jMin, m12489k(offset2));
                    C0491a[] c0491aArrM12485b3 = m12485b(iM12486c2 + 1);
                    for (int length3 = c0491aArrM12485b3.length - 1; length3 >= 0; length3--) {
                        if (epochSecond > c0491aArrM12485b3[length3].m12483k()) {
                            c0491a = c0491aArrM12485b3[length3];
                        }
                    }
                    C0491a[] c0491aArrM12485b4 = m12485b(iM12486c2);
                    c0491a = c0491aArrM12485b4[c0491aArrM12485b4.length - 1];
                }
            }
            c0491a = null;
        } else {
            c0491a = null;
        }
        if (c0491a == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb;
        TimeZone timeZone = this.f33103g;
        if (timeZone != null) {
            strValueOf = timeZone.getID();
            sb = new StringBuilder("ZoneRules[timeZone=");
        } else {
            C0468p[] c0468pArr = this.f33098b;
            strValueOf = String.valueOf(c0468pArr[c0468pArr.length - 1]);
            sb = new StringBuilder("ZoneRules[currentStandardOffset=");
        }
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    C0493c(TimeZone timeZone) {
        C0468p[] c0468pArr = {m12489k(timeZone.getRawOffset())};
        this.f33098b = c0468pArr;
        long[] jArr = f33093i;
        this.f33097a = jArr;
        this.f33099c = jArr;
        this.f33100d = f33095k;
        this.f33101e = c0468pArr;
        this.f33102f = f33094j;
        this.f33103g = timeZone;
    }
}
