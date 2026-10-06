package p000;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mun extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Object f41645a = new Object();

    /* JADX INFO: renamed from: b */
    transient int[] f41646b;

    /* JADX INFO: renamed from: c */
    transient Object[] f41647c;

    /* JADX INFO: renamed from: d */
    transient Object[] f41648d;

    /* JADX INFO: renamed from: e */
    public transient int f41649e;

    /* JADX INFO: renamed from: f */
    public transient int f41650f;

    /* JADX INFO: renamed from: g */
    private transient Object f41651g;

    /* JADX INFO: renamed from: h */
    private transient Set f41652h;

    /* JADX INFO: renamed from: i */
    private transient Set f41653i;

    /* JADX INFO: renamed from: j */
    private transient Collection f41654j;

    public mun() {
        m16956m(3);
    }

    /* JADX INFO: renamed from: e */
    public static mun m16942e(int i) {
        return new mun(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Invalid size: " + i);
        }
        m16956m(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: renamed from: t */
    private final int m16943t(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objM16531am = mkv.m16531am(i2);
        if (i4 != 0) {
            mkv.m16533ao(objM16531am, i3 & i5, i4 + 1);
        }
        Object objM16951h = m16951h();
        int[] iArrM16960q = m16960q();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM16529ak = mkv.m16529ak(objM16951h, i6);
            while (iM16529ak != 0) {
                int i7 = iM16529ak - 1;
                int i8 = iArrM16960q[i7];
                int iM16525ag = mkv.m16525ag(i8, i) | i6;
                int i9 = iM16525ag & i5;
                int iM16529ak2 = mkv.m16529ak(objM16531am, i9);
                mkv.m16533ao(objM16531am, i9, iM16529ak);
                iArrM16960q[i7] = mkv.m16526ah(iM16525ag, iM16529ak2, i5);
                iM16529ak = i8 & i;
            }
        }
        this.f41651g = objM16531am;
        m16944u(i5);
        return i5;
    }

    /* JADX INFO: renamed from: u */
    private final void m16944u(int i) {
        this.f41649e = mkv.m16526ah(this.f41649e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator itM16953j = m16953j();
        while (itM16953j.hasNext()) {
            Map.Entry entry = (Map.Entry) itM16953j.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: a */
    final int m16945a() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: renamed from: b */
    final int m16946b(int i) {
        int i2 = i + 1;
        if (i2 < this.f41650f) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m16947c() {
        return (1 << (this.f41649e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m16959p()) {
            return;
        }
        m16955l();
        Map mapM16954k = m16954k();
        if (mapM16954k != null) {
            this.f41649e = kxk.m14978X(size(), 3, 1073741823);
            mapM16954k.clear();
            this.f41651g = null;
            this.f41650f = 0;
            return;
        }
        Arrays.fill(m16961r(), 0, this.f41650f, (Object) null);
        Arrays.fill(m16962s(), 0, this.f41650f, (Object) null);
        mkv.m16532an(m16951h());
        Arrays.fill(m16960q(), 0, this.f41650f, 0);
        this.f41650f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM16954k = m16954k();
        if (mapM16954k != null) {
            return mapM16954k.containsKey(obj);
        }
        return m16948d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM16954k = m16954k();
        if (mapM16954k != null) {
            return mapM16954k.containsValue(obj);
        }
        for (int i = 0; i < this.f41650f; i++) {
            if (mpw.m16768g(obj, m16952i(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m16948d(Object obj) {
        if (m16959p()) {
            return -1;
        }
        int iM16523ae = mkv.m16523ae(obj);
        int iM16947c = m16947c();
        int iM16529ak = mkv.m16529ak(m16951h(), iM16523ae & iM16947c);
        if (iM16529ak == 0) {
            return -1;
        }
        int iM16525ag = mkv.m16525ag(iM16523ae, iM16947c);
        do {
            int i = iM16529ak - 1;
            int i2 = m16960q()[i];
            if (mkv.m16525ag(i2, iM16947c) == iM16525ag && mpw.m16768g(obj, m16949f(i))) {
                return i;
            }
            iM16529ak = i2 & iM16947c;
        } while (iM16529ak != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f41653i;
        if (set != null) {
            return set;
        }
        mui muiVar = new mui(this);
        this.f41653i = muiVar;
        return muiVar;
    }

    /* JADX INFO: renamed from: f */
    public final Object m16949f(int i) {
        return m16961r()[i];
    }

    /* JADX INFO: renamed from: g */
    public final Object m16950g(Object obj) {
        if (m16959p()) {
            return f41645a;
        }
        int iM16947c = m16947c();
        int iM16528aj = mkv.m16528aj(obj, null, iM16947c, m16951h(), m16960q(), m16961r(), null);
        if (iM16528aj == -1) {
            return f41645a;
        }
        Object objM16952i = m16952i(iM16528aj);
        m16957n(iM16528aj, iM16947c);
        this.f41650f--;
        m16955l();
        return objM16952i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM16954k = m16954k();
        if (mapM16954k != null) {
            return mapM16954k.get(obj);
        }
        int iM16948d = m16948d(obj);
        if (iM16948d == -1) {
            return null;
        }
        return m16952i(iM16948d);
    }

    /* JADX INFO: renamed from: h */
    public final Object m16951h() {
        Object obj = this.f41651g;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public final Object m16952i(int i) {
        return m16962s()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    final Iterator m16953j() {
        Map mapM16954k = m16954k();
        return mapM16954k != null ? mapM16954k.entrySet().iterator() : new mug(this);
    }

    /* JADX INFO: renamed from: k */
    final Map m16954k() {
        Object obj = this.f41651g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f41652h;
        if (set != null) {
            return set;
        }
        muk mukVar = new muk(this);
        this.f41652h = mukVar;
        return mukVar;
    }

    /* JADX INFO: renamed from: l */
    final void m16955l() {
        this.f41649e += 32;
    }

    /* JADX INFO: renamed from: m */
    final void m16956m(int i) {
        lku.m15670x(i >= 0, "Expected size must be >= 0");
        this.f41649e = kxk.m14978X(i, 1, 1073741823);
    }

    /* JADX INFO: renamed from: n */
    final void m16957n(int i, int i2) {
        Object objM16951h = m16951h();
        int[] iArrM16960q = m16960q();
        Object[] objArrM16961r = m16961r();
        Object[] objArrM16962s = m16962s();
        int size = size() - 1;
        if (i >= size) {
            objArrM16961r[i] = null;
            objArrM16962s[i] = null;
            iArrM16960q[i] = 0;
            return;
        }
        Object obj = objArrM16961r[size];
        objArrM16961r[i] = obj;
        objArrM16962s[i] = objArrM16962s[size];
        objArrM16961r[size] = null;
        objArrM16962s[size] = null;
        iArrM16960q[i] = iArrM16960q[size];
        iArrM16960q[size] = 0;
        int iM16523ae = mkv.m16523ae(obj) & i2;
        int iM16529ak = mkv.m16529ak(objM16951h, iM16523ae);
        int i3 = size + 1;
        if (iM16529ak == i3) {
            mkv.m16533ao(objM16951h, iM16523ae, i + 1);
            return;
        }
        while (true) {
            int i4 = iM16529ak - 1;
            int i5 = iArrM16960q[i4];
            int i6 = i5 & i2;
            if (i6 == i3) {
                iArrM16960q[i4] = mkv.m16526ah(i5, i + 1, i2);
                return;
            }
            iM16529ak = i6;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m16958o(int i, Object obj) {
        m16962s()[i] = obj;
    }

    /* JADX INFO: renamed from: p */
    final boolean m16959p() {
        return this.f41651g == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (m16959p()) {
            lku.m15614I(m16959p(), "Arrays already allocated");
            int i = this.f41649e;
            int iM16530al = mkv.m16530al(i);
            this.f41651g = mkv.m16531am(iM16530al);
            m16944u(iM16530al - 1);
            this.f41646b = new int[i];
            this.f41647c = new Object[i];
            this.f41648d = new Object[i];
        }
        Map mapM16954k = m16954k();
        if (mapM16954k != null) {
            return mapM16954k.put(obj, obj2);
        }
        int[] iArrM16960q = m16960q();
        Object[] objArrM16961r = m16961r();
        Object[] objArrM16962s = m16962s();
        int i2 = this.f41650f;
        int i3 = i2 + 1;
        int iM16523ae = mkv.m16523ae(obj);
        int iM16947c = m16947c();
        int i4 = iM16523ae & iM16947c;
        int iM16529ak = mkv.m16529ak(m16951h(), i4);
        if (iM16529ak != 0) {
            int iM16525ag = mkv.m16525ag(iM16523ae, iM16947c);
            int i5 = 0;
            while (true) {
                int i6 = iM16529ak - 1;
                int i7 = iArrM16960q[i6];
                if (mkv.m16525ag(i7, iM16947c) == iM16525ag && mpw.m16768g(obj, objArrM16961r[i6])) {
                    Object obj3 = objArrM16962s[i6];
                    objArrM16962s[i6] = obj2;
                    return obj3;
                }
                int i8 = i7 & iM16947c;
                i5++;
                if (i8 == 0) {
                    if (i5 < 9) {
                        if (i3 <= iM16947c) {
                            iArrM16960q[i6] = mkv.m16526ah(i7, i3, iM16947c);
                            break;
                        }
                        iM16947c = m16943t(iM16947c, mkv.m16527ai(iM16947c), iM16523ae, i2);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m16947c() + 1, 1.0f);
                    int iM16945a = m16945a();
                    while (iM16945a >= 0) {
                        linkedHashMap.put(m16949f(iM16945a), m16952i(iM16945a));
                        iM16945a = m16946b(iM16945a);
                    }
                    this.f41651g = linkedHashMap;
                    this.f41646b = null;
                    this.f41647c = null;
                    this.f41648d = null;
                    m16955l();
                    return linkedHashMap.put(obj, obj2);
                }
                iM16529ak = i8;
            }
        } else if (i3 > iM16947c) {
            iM16947c = m16943t(iM16947c, mkv.m16527ai(iM16947c), iM16523ae, i2);
        } else {
            mkv.m16533ao(m16951h(), i4, i3);
        }
        int length = m16960q().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f41646b = Arrays.copyOf(m16960q(), iMin);
            this.f41647c = Arrays.copyOf(m16961r(), iMin);
            this.f41648d = Arrays.copyOf(m16962s(), iMin);
        }
        m16960q()[i2] = mkv.m16526ah(iM16523ae, 0, iM16947c);
        m16961r()[i2] = obj;
        m16958o(i2, obj2);
        this.f41650f = i3;
        m16955l();
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final int[] m16960q() {
        int[] iArr = this.f41646b;
        iArr.getClass();
        return iArr;
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m16961r() {
        Object[] objArr = this.f41647c;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM16954k = m16954k();
        if (mapM16954k != null) {
            return mapM16954k.remove(obj);
        }
        Object objM16950g = m16950g(obj);
        if (objM16950g == f41645a) {
            return null;
        }
        return objM16950g;
    }

    /* JADX INFO: renamed from: s */
    public final Object[] m16962s() {
        Object[] objArr = this.f41648d;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM16954k = m16954k();
        return mapM16954k != null ? mapM16954k.size() : this.f41650f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f41654j;
        if (collection != null) {
            return collection;
        }
        mum mumVar = new mum(this);
        this.f41654j = mumVar;
        return mumVar;
    }

    public mun(int i) {
        m16956m(i);
    }
}
