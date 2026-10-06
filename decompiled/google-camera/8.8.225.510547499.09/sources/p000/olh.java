package p000;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class olh implements Map, Serializable {

    /* JADX INFO: renamed from: a */
    public Object[] f46243a;

    /* JADX INFO: renamed from: b */
    public Object[] f46244b;

    /* JADX INFO: renamed from: c */
    public int[] f46245c;

    /* JADX INFO: renamed from: d */
    public int f46246d;

    /* JADX INFO: renamed from: e */
    public int f46247e;

    /* JADX INFO: renamed from: f */
    public boolean f46248f;

    /* JADX INFO: renamed from: g */
    private int[] f46249g;

    /* JADX INFO: renamed from: h */
    private int f46250h;

    /* JADX INFO: renamed from: i */
    private int f46251i;

    /* JADX INFO: renamed from: j */
    private olj f46252j;

    /* JADX INFO: renamed from: k */
    private oli f46253k;

    /* JADX INFO: renamed from: l */
    private okp f46254l;

    public olh() {
        this(8);
    }

    /* JADX INFO: renamed from: m */
    private final int m18618m() {
        return this.f46243a.length;
    }

    /* JADX INFO: renamed from: n */
    private final int m18619n() {
        return this.f46249g.length;
    }

    /* JADX INFO: renamed from: o */
    private final int m18620o(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f46251i;
    }

    /* JADX INFO: renamed from: p */
    private final void m18621p(int i) {
        int i2 = this.f46246d + i;
        if (i2 < 0) {
            throw new OutOfMemoryError();
        }
        if (i2 <= m18618m()) {
            if ((this.f46246d + i2) - this.f46247e > m18618m()) {
                m18622q(m18619n());
                return;
            }
            return;
        }
        int iM18618m = m18618m() * 3;
        Object[] objArr = this.f46243a;
        int i3 = iM18618m / 2;
        if (i2 <= i3) {
            i2 = i3;
        }
        this.f46243a = omn.m18716u(objArr, i2);
        Object[] objArr2 = this.f46244b;
        this.f46244b = objArr2 != null ? omn.m18716u(objArr2, i2) : null;
        int[] iArrCopyOf = Arrays.copyOf(this.f46245c, i2);
        iArrCopyOf.getClass();
        this.f46245c = iArrCopyOf;
        int iM18712q = omn.m18712q(i2);
        if (iM18712q > m18619n()) {
            m18622q(iM18712q);
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m18622q(int i) {
        int[] iArr;
        int i2;
        int i3 = 0;
        if (this.f46246d > this.f46247e) {
            Object[] objArr = this.f46244b;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i2 = this.f46246d;
                if (i4 >= i2) {
                    break;
                }
                if (this.f46245c[i4] >= 0) {
                    Object[] objArr2 = this.f46243a;
                    objArr2[i5] = objArr2[i4];
                    if (objArr != null) {
                        objArr[i5] = objArr[i4];
                    }
                    i5++;
                }
                i4++;
            }
            omn.m18715t(this.f46243a, i5, i2);
            if (objArr != null) {
                omn.m18715t(objArr, i5, this.f46246d);
            }
            this.f46246d = i5;
        }
        if (i != m18619n()) {
            this.f46249g = new int[i];
            this.f46251i = omn.m18713r(i);
        } else {
            int[] iArr2 = this.f46249g;
            int iM18619n = m18619n();
            iArr2.getClass();
            Arrays.fill(iArr2, 0, iM18619n, 0);
        }
        while (i3 < this.f46246d) {
            int i6 = i3 + 1;
            int iM18620o = m18620o(this.f46243a[i3]);
            int i7 = this.f46250h;
            while (true) {
                iArr = this.f46249g;
                if (iArr[iM18620o] == 0) {
                    break;
                }
                i7--;
                if (i7 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM18620o = iM18620o == 0 ? m18619n() - 1 : iM18620o - 1;
            }
            iArr[iM18620o] = i6;
            this.f46245c[i3] = iM18620o;
            i3 = i6;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m18623a(Object obj) {
        m18628f();
        while (true) {
            int iM18620o = m18620o(obj);
            int i = this.f46250h;
            int i2 = i + i;
            int iM18619n = m18619n() >> 1;
            int i3 = 0;
            while (true) {
                int i4 = this.f46249g[iM18620o];
                if (i4 <= 0) {
                    if (this.f46246d >= m18618m()) {
                        m18621p(1);
                        break;
                    }
                    int i5 = this.f46246d;
                    int i6 = i5 + 1;
                    this.f46246d = i6;
                    this.f46243a[i5] = obj;
                    this.f46245c[i5] = iM18620o;
                    this.f46249g[iM18620o] = i6;
                    this.f46247e++;
                    if (i3 > this.f46250h) {
                        this.f46250h = i3;
                    }
                    return i5;
                }
                if (ooc.m18737c(this.f46243a[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > ook.m18790d(i2, iM18619n)) {
                    int iM18619n2 = m18619n();
                    m18622q(iM18619n2 + iM18619n2);
                    break;
                }
                iM18620o = iM18620o == 0 ? m18619n() - 1 : iM18620o - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m18624b(Object obj) {
        int iM18620o = m18620o(obj);
        int i = this.f46250h;
        while (true) {
            int i2 = this.f46249g[iM18620o];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (ooc.m18737c(this.f46243a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM18620o = iM18620o == 0 ? m18619n() - 1 : iM18620o - 1;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m18625c(Object obj) {
        int i = this.f46246d;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f46245c[i] >= 0) {
                Object[] objArr = this.f46244b;
                objArr.getClass();
                if (ooc.m18737c(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m18628f();
        okz it = new oot(0, this.f46246d - 1).iterator();
        while (it.f46220a) {
            int iM18604a = it.m18604a();
            int[] iArr = this.f46245c;
            int i = iArr[iM18604a];
            if (i >= 0) {
                this.f46249g[i] = 0;
                iArr[iM18604a] = -1;
            }
        }
        omn.m18715t(this.f46243a, 0, this.f46246d);
        Object[] objArr = this.f46244b;
        if (objArr != null) {
            omn.m18715t(objArr, 0, this.f46246d);
        }
        this.f46247e = 0;
        this.f46246d = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m18624b(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m18625c(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m18626d(Object obj) {
        m18628f();
        int iM18624b = m18624b(obj);
        if (iM18624b < 0) {
            return -1;
        }
        m18629g(iM18624b);
        return iM18624b;
    }

    /* JADX INFO: renamed from: e */
    public final old m18627e() {
        return new old(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        oli oliVar = this.f46253k;
        if (oliVar != null) {
            return oliVar;
        }
        oli oliVar2 = new oli(this);
        this.f46253k = oliVar2;
        return oliVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f46247e == map.size() && m18630h(map.entrySet());
    }

    /* JADX INFO: renamed from: f */
    public final void m18628f() {
        if (this.f46248f) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18629g(int i) {
        omn.m18714s(this.f46243a, i);
        int iM18619n = this.f46245c[i];
        int i2 = this.f46250h;
        int iM18790d = ook.m18790d(i2 + i2, m18619n() >> 1);
        int i3 = 0;
        int i4 = iM18619n;
        do {
            iM18619n = iM18619n == 0 ? m18619n() - 1 : iM18619n - 1;
            i3++;
            if (i3 > this.f46250h) {
                this.f46249g[i4] = 0;
            } else {
                int[] iArr = this.f46249g;
                int i5 = iArr[iM18619n];
                if (i5 == 0) {
                    iArr[i4] = 0;
                } else {
                    if (i5 < 0) {
                        iArr[i4] = -1;
                        i4 = iM18619n;
                        i3 = 0;
                    } else {
                        int i6 = i5 - 1;
                        if (((m18620o(this.f46243a[i6]) - iM18619n) & (m18619n() - 1)) >= i3) {
                            this.f46249g[i4] = i5;
                            this.f46245c[i6] = i4;
                            i4 = iM18619n;
                            i3 = 0;
                        }
                    }
                    iM18790d--;
                }
            }
            this.f46245c[i] = -1;
            this.f46247e--;
        } while (iM18790d >= 0);
        this.f46249g[i4] = -1;
        this.f46245c[i] = -1;
        this.f46247e--;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM18624b = m18624b(obj);
        if (iM18624b < 0) {
            return null;
        }
        Object[] objArr = this.f46244b;
        objArr.getClass();
        return objArr[iM18624b];
    }

    /* JADX INFO: renamed from: h */
    public final boolean m18630h(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m18631i((Map.Entry) obj)) {
                    }
                } catch (ClassCastException e) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        old oldVarM18627e = m18627e();
        int i = 0;
        while (oldVarM18627e.hasNext()) {
            int i2 = oldVarM18627e.f46240b;
            olh olhVar = oldVarM18627e.f46239a;
            if (i2 >= olhVar.f46246d) {
                throw new NoSuchElementException();
            }
            oldVarM18627e.f46240b = i2 + 1;
            oldVarM18627e.f46241c = i2;
            Object obj = olhVar.f46243a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = oldVarM18627e.f46239a.f46244b;
            objArr.getClass();
            Object obj2 = objArr[oldVarM18627e.f46241c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            oldVarM18627e.m18617a();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m18631i(Map.Entry entry) {
        int iM18624b = m18624b(entry.getKey());
        if (iM18624b < 0) {
            return false;
        }
        Object[] objArr = this.f46244b;
        objArr.getClass();
        return ooc.m18737c(objArr[iM18624b], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f46247e == 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object[] m18632j() {
        Object[] objArr = this.f46244b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArr2 = new Object[m18618m()];
        this.f46244b = objArr2;
        return objArr2;
    }

    /* JADX INFO: renamed from: k */
    public final void m18633k() {
        m18628f();
        this.f46248f = true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        olj oljVar = this.f46252j;
        if (oljVar != null) {
            return oljVar;
        }
        olj oljVar2 = new olj(this);
        this.f46252j = oljVar2;
        return oljVar2;
    }

    /* JADX INFO: renamed from: l */
    public final olg m18634l() {
        return new olg(this, 1, null);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m18628f();
        int iM18623a = m18623a(obj);
        Object[] objArrM18632j = m18632j();
        if (iM18623a >= 0) {
            objArrM18632j[iM18623a] = obj2;
            return null;
        }
        int i = (-iM18623a) - 1;
        Object obj3 = objArrM18632j[i];
        objArrM18632j[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        m18628f();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m18621p(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM18623a = m18623a(entry.getKey());
            Object[] objArrM18632j = m18632j();
            if (iM18623a >= 0) {
                objArrM18632j[iM18623a] = entry.getValue();
            } else {
                int i = (-iM18623a) - 1;
                if (!ooc.m18737c(entry.getValue(), objArrM18632j[i])) {
                    objArrM18632j[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        int iM18626d = m18626d(obj);
        if (iM18626d < 0) {
            return null;
        }
        Object[] objArr = this.f46244b;
        objArr.getClass();
        Object obj2 = objArr[iM18626d];
        omn.m18714s(objArr, iM18626d);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f46247e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f46247e * 3) + 2);
        sb.append("{");
        old oldVarM18627e = m18627e();
        int i = 0;
        while (oldVarM18627e.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = oldVarM18627e.f46240b;
            olh olhVar = oldVarM18627e.f46239a;
            if (i2 >= olhVar.f46246d) {
                throw new NoSuchElementException();
            }
            oldVarM18627e.f46240b = i2 + 1;
            oldVarM18627e.f46241c = i2;
            Object obj = olhVar.f46243a[i2];
            if (ooc.m18737c(obj, olhVar)) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            olh olhVar2 = oldVarM18627e.f46239a;
            Object[] objArr = olhVar2.f46244b;
            objArr.getClass();
            Object obj2 = objArr[oldVarM18627e.f46241c];
            if (ooc.m18737c(obj2, olhVar2)) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            oldVarM18627e.m18617a();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        okp okpVar = this.f46254l;
        if (okpVar != null) {
            return okpVar;
        }
        okp okpVar2 = new okp(this);
        this.f46254l = okpVar2;
        return okpVar2;
    }

    public olh(int i) {
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int[] iArr2 = new int[omn.m18712q(i)];
        this.f46243a = objArr;
        this.f46244b = null;
        this.f46245c = iArr;
        this.f46249g = iArr2;
        this.f46250h = 2;
        this.f46246d = 0;
        this.f46251i = omn.m18713r(m18619n());
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f46248f) {
            return new oll(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }
}
