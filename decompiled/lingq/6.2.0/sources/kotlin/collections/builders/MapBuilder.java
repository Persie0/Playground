package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p000.C3386nv;
import p000.bq1;
import p000.fa4;
import p000.ij6;
import p000.op5;
import p000.q77;
import p000.qp5;
import p000.rp5;
import p000.uk9;
import p000.xg4;

/* JADX INFO: loaded from: classes.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, xg4 {

    /* JADX INFO: renamed from: I */
    public static final MapBuilder f47659I;

    /* JADX INFO: renamed from: H */
    public boolean f47660H;

    /* JADX INFO: renamed from: a */
    public Object[] f47661a;

    /* JADX INFO: renamed from: b */
    public Object[] f47662b;

    /* JADX INFO: renamed from: c */
    public int[] f47663c;

    /* JADX INFO: renamed from: d */
    public int[] f47664d;

    /* JADX INFO: renamed from: e */
    public int f47665e;

    /* JADX INFO: renamed from: f */
    public int f47666f;

    /* JADX INFO: renamed from: g */
    public int f47667g;

    /* JADX INFO: renamed from: h */
    public int f47668h;

    /* JADX INFO: renamed from: i */
    public int f47669i;

    /* JADX INFO: renamed from: j */
    public qp5 f47670j;

    /* JADX INFO: renamed from: k */
    public rp5 f47671k;

    /* JADX INFO: renamed from: l */
    public q77 f47672l;

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.f47660H = true;
        f47659I = mapBuilder;
    }

    public MapBuilder(int i) {
        if (i < 0) {
            C3386nv.m17626m("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f47661a = objArr;
        this.f47662b = null;
        this.f47663c = iArr;
        this.f47664d = new int[iHighestOneBit];
        this.f47665e = 2;
        this.f47666f = 0;
        this.f47667g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f47660H) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* JADX INFO: renamed from: a */
    public final int m15391a(Object obj) {
        m15393c();
        while (true) {
            int iM15399i = m15399i(obj);
            int i = this.f47665e * 2;
            int length = this.f47664d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f47664d;
                int i3 = iArr[iM15399i];
                if (i3 == 0) {
                    int i4 = this.f47666f;
                    Object[] objArr = this.f47661a;
                    if (i4 >= objArr.length) {
                        m15396f(1);
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f47666f = i5;
                    objArr[i4] = obj;
                    this.f47663c[i4] = iM15399i;
                    iArr[iM15399i] = i5;
                    this.f47669i++;
                    this.f47668h++;
                    if (i2 > this.f47665e) {
                        this.f47665e = i2;
                    }
                    return i4;
                }
                if (fa4.m11650l(this.f47661a[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > i) {
                    m15400j(this.f47664d.length * 2);
                    break;
                }
                iM15399i = iM15399i == 0 ? this.f47664d.length - 1 : iM15399i - 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final MapBuilder m15392b() {
        m15393c();
        this.f47660H = true;
        if (this.f47669i > 0) {
            return this;
        }
        MapBuilder mapBuilder = f47659I;
        mapBuilder.getClass();
        return mapBuilder;
    }

    /* JADX INFO: renamed from: c */
    public final void m15393c() {
        if (this.f47660H) {
            ij6.m13946b();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m15393c();
        int i = this.f47666f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f47663c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f47664d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        bq1.m4068u0(this.f47661a, 0, this.f47666f);
        Object[] objArr = this.f47662b;
        if (objArr != null) {
            bq1.m4068u0(objArr, 0, this.f47666f);
        }
        this.f47669i = 0;
        this.f47666f = 0;
        this.f47668h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m15397g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m15398h(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m15394d(boolean z) {
        int i;
        Object[] objArr = this.f47662b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f47666f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f47663c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f47661a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f47664d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        bq1.m4068u0(this.f47661a, i3, i);
        if (objArr != null) {
            bq1.m4068u0(objArr, i3, this.f47666f);
        }
        this.f47666f = i3;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15395e(Collection collection) {
        boolean zM11650l;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM15397g = m15397g(entry.getKey());
                    if (iM15397g < 0) {
                        zM11650l = false;
                    } else {
                        Object[] objArr = this.f47662b;
                        objArr.getClass();
                        zM11650l = fa4.m11650l(objArr[iM15397g], entry.getValue());
                    }
                    if (!zM11650l) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        q77 q77Var = this.f47672l;
        if (q77Var != null) {
            return q77Var;
        }
        q77 q77Var2 = new q77(this, 2);
        this.f47672l = q77Var2;
        return q77Var2;
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
        return this.f47669i == map.size() && m15395e(map.entrySet());
    }

    /* JADX INFO: renamed from: f */
    public final void m15396f(int i) {
        Object[] objArr = this.f47661a;
        int length = objArr.length;
        int i2 = this.f47666f;
        int i3 = length - i2;
        int i4 = i2 - this.f47669i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m15394d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f47661a = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f47662b;
            this.f47662b = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f47663c = Arrays.copyOf(this.f47663c, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f47664d.length) {
                m15400j(iHighestOneBit);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m15397g(Object obj) {
        int iM15399i = m15399i(obj);
        int i = this.f47665e;
        while (true) {
            int i2 = this.f47664d[iM15399i];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (fa4.m11650l(this.f47661a[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM15399i = iM15399i == 0 ? this.f47664d.length - 1 : iM15399i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM15397g = m15397g(obj);
        if (iM15397g < 0) {
            return null;
        }
        Object[] objArr = this.f47662b;
        objArr.getClass();
        return objArr[iM15397g];
    }

    /* JADX INFO: renamed from: h */
    public final int m15398h(Object obj) {
        int i = this.f47666f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f47663c[i] >= 0) {
                Object[] objArr = this.f47662b;
                objArr.getClass();
                if (fa4.m11650l(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        op5 op5Var = new op5(this, 0);
        int i = 0;
        while (op5Var.hasNext()) {
            int i2 = op5Var.f54684b;
            MapBuilder mapBuilder = op5Var.f54683a;
            if (i2 >= mapBuilder.f47666f) {
                uk9.m22784s();
                return 0;
            }
            op5Var.f54684b = i2 + 1;
            op5Var.f54685c = i2;
            Object obj = mapBuilder.f47661a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = mapBuilder.f47662b;
            objArr.getClass();
            Object obj2 = objArr[op5Var.f54685c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            op5Var.m18195b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final int m15399i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f47667g;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f47669i == 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m15400j(int i) {
        int[] iArr;
        this.f47668h++;
        int i2 = 0;
        if (this.f47666f > this.f47669i) {
            m15394d(false);
        }
        this.f47664d = new int[i];
        this.f47667g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f47666f) {
            int i3 = i2 + 1;
            int iM15399i = m15399i(this.f47661a[i2]);
            int i4 = this.f47665e;
            while (true) {
                iArr = this.f47664d;
                if (iArr[iM15399i] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    C3386nv.m17633t("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iM15399i = iM15399i == 0 ? iArr.length - 1 : iM15399i - 1;
            }
            iArr[iM15399i] = i3;
            this.f47663c[i2] = iM15399i;
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m15401k(int i) {
        int i2;
        int i3;
        int iM15399i;
        int[] iArr;
        Object[] objArr = this.f47661a;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.f47662b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.f47663c[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f47664d.length - 1 : length - 1;
                int[] iArr2 = this.f47664d;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f47665e) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM15399i = m15399i(this.f47661a[i3]) - length;
                    iArr = this.f47664d;
                }
            } while ((iM15399i & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f47663c[i3] = i4;
        }
        this.f47663c[i] = -1;
        this.f47669i--;
        this.f47668h++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        qp5 qp5Var = this.f47670j;
        if (qp5Var != null) {
            return qp5Var;
        }
        qp5 qp5Var2 = new qp5(this);
        this.f47670j = qp5Var2;
        return qp5Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m15393c();
        int iM15391a = m15391a(obj);
        Object[] objArr = this.f47662b;
        if (objArr == null) {
            int length = this.f47661a.length;
            if (length < 0) {
                C3386nv.m17626m("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f47662b = objArr;
        }
        if (iM15391a >= 0) {
            objArr[iM15391a] = obj2;
            return null;
        }
        int i = (-iM15391a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        m15393c();
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m15396f(setEntrySet.size());
        for (Map.Entry<K, V> entry : setEntrySet) {
            int iM15391a = m15391a(entry.getKey());
            Object[] objArr = this.f47662b;
            if (objArr == null) {
                int length = this.f47661a.length;
                if (length < 0) {
                    C3386nv.m17626m("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f47662b = objArr;
                }
            }
            if (iM15391a >= 0) {
                objArr[iM15391a] = entry.getValue();
            } else {
                int i = (-iM15391a) - 1;
                if (!fa4.m11650l(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m15393c();
        int iM15397g = m15397g(obj);
        if (iM15397g < 0) {
            return null;
        }
        Object[] objArr = this.f47662b;
        objArr.getClass();
        Object obj2 = objArr[iM15397g];
        m15401k(iM15397g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f47669i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f47669i * 3) + 2);
        sb.append("{");
        int i = 0;
        op5 op5Var = new op5(this, 0);
        while (op5Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = op5Var.f54684b;
            MapBuilder mapBuilder = op5Var.f54683a;
            if (i2 >= mapBuilder.f47666f) {
                uk9.m22784s();
                return null;
            }
            op5Var.f54684b = i2 + 1;
            op5Var.f54685c = i2;
            Object obj = mapBuilder.f47661a[i2];
            if (obj == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = mapBuilder.f47662b;
            objArr.getClass();
            Object obj2 = objArr[op5Var.f54685c];
            if (obj2 == mapBuilder) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            op5Var.m18195b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        rp5 rp5Var = this.f47671k;
        if (rp5Var != null) {
            return rp5Var;
        }
        rp5 rp5Var2 = new rp5(this, 0);
        this.f47671k = rp5Var2;
        return rp5Var2;
    }

    public MapBuilder() {
        this(8);
    }
}
