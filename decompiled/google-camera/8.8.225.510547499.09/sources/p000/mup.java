package p000;

import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mup extends AbstractSet implements Serializable {

    /* JADX INFO: renamed from: a */
    transient Object[] f41659a;

    /* JADX INFO: renamed from: b */
    public transient int f41660b;

    /* JADX INFO: renamed from: c */
    private transient Object f41661c;

    /* JADX INFO: renamed from: d */
    private transient int[] f41662d;

    /* JADX INFO: renamed from: e */
    private transient int f41663e;

    mup() {
        m16975f(3);
    }

    /* JADX INFO: renamed from: h */
    private final int m16964h() {
        return (1 << (this.f41660b & 31)) - 1;
    }

    /* JADX INFO: renamed from: i */
    private final int m16965i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objM16531am = mkv.m16531am(i2);
        if (i4 != 0) {
            mkv.m16533ao(objM16531am, i3 & i5, i4 + 1);
        }
        Object objM16966j = m16966j();
        int[] iArrM16968l = m16968l();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM16529ak = mkv.m16529ak(objM16966j, i6);
            while (iM16529ak != 0) {
                int i7 = iM16529ak - 1;
                int i8 = iArrM16968l[i7];
                int iM16525ag = mkv.m16525ag(i8, i) | i6;
                int i9 = iM16525ag & i5;
                int iM16529ak2 = mkv.m16529ak(objM16531am, i9);
                mkv.m16533ao(objM16531am, i9, iM16529ak);
                iArrM16968l[i7] = mkv.m16526ah(iM16525ag, iM16529ak2, i5);
                iM16529ak = i8 & i;
            }
        }
        this.f41661c = objM16531am;
        m16967k(i5);
        return i5;
    }

    /* JADX INFO: renamed from: j */
    private final Object m16966j() {
        Object obj = this.f41661c;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: renamed from: k */
    private final void m16967k(int i) {
        this.f41660b = mkv.m16526ah(this.f41660b, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* JADX INFO: renamed from: l */
    private final int[] m16968l() {
        int[] iArr = this.f41662d;
        iArr.getClass();
        return iArr;
    }

    /* JADX INFO: renamed from: m */
    private final Object[] m16969m() {
        Object[] objArr = this.f41659a;
        objArr.getClass();
        return objArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(hsSUWRJfoeC.bpGddzYHgXM + i);
        }
        m16975f(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    final int m16970a() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        if (m16976g()) {
            lku.m15614I(m16976g(), "Arrays already allocated");
            int i = this.f41660b;
            int iM16530al = mkv.m16530al(i);
            this.f41661c = mkv.m16531am(iM16530al);
            m16967k(iM16530al - 1);
            this.f41662d = new int[i];
            this.f41659a = new Object[i];
        }
        Set setM16973d = m16973d();
        if (setM16973d != null) {
            return setM16973d.add(obj);
        }
        int[] iArrM16968l = m16968l();
        Object[] objArrM16969m = m16969m();
        int i2 = this.f41663e;
        int i3 = i2 + 1;
        int iM16523ae = mkv.m16523ae(obj);
        int iM16964h = m16964h();
        int i4 = iM16523ae & iM16964h;
        int iM16529ak = mkv.m16529ak(m16966j(), i4);
        if (iM16529ak != 0) {
            int iM16525ag = mkv.m16525ag(iM16523ae, iM16964h);
            int i5 = 0;
            while (true) {
                int i6 = iM16529ak - 1;
                int i7 = iArrM16968l[i6];
                if (mkv.m16525ag(i7, iM16964h) == iM16525ag && mpw.m16768g(obj, objArrM16969m[i6])) {
                    return false;
                }
                int i8 = i7 & iM16964h;
                i5++;
                if (i8 == 0) {
                    if (i5 < 9) {
                        if (i3 <= iM16964h) {
                            iArrM16968l[i6] = mkv.m16526ah(i7, i3, iM16964h);
                            break;
                        }
                        iM16964h = m16965i(iM16964h, mkv.m16527ai(iM16964h), iM16523ae, i2);
                        break;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(m16964h() + 1, 1.0f);
                    int iM16970a = m16970a();
                    while (iM16970a >= 0) {
                        linkedHashSet.add(m16972c(iM16970a));
                        iM16970a = m16971b(iM16970a);
                    }
                    this.f41661c = linkedHashSet;
                    this.f41662d = null;
                    this.f41659a = null;
                    m16974e();
                    return linkedHashSet.add(obj);
                }
                iM16529ak = i8;
            }
        } else if (i3 > iM16964h) {
            iM16964h = m16965i(iM16964h, mkv.m16527ai(iM16964h), iM16523ae, i2);
        } else {
            mkv.m16533ao(m16966j(), i4, i3);
        }
        int length = m16968l().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f41662d = Arrays.copyOf(m16968l(), iMin);
            this.f41659a = Arrays.copyOf(m16969m(), iMin);
        }
        m16968l()[i2] = mkv.m16526ah(iM16523ae, 0, iM16964h);
        m16969m()[i2] = obj;
        this.f41663e = i3;
        m16974e();
        return true;
    }

    /* JADX INFO: renamed from: b */
    final int m16971b(int i) {
        int i2 = i + 1;
        if (i2 < this.f41663e) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final Object m16972c(int i) {
        return m16969m()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (m16976g()) {
            return;
        }
        m16974e();
        Set setM16973d = m16973d();
        if (setM16973d != null) {
            this.f41660b = kxk.m14978X(size(), 3, 1073741823);
            setM16973d.clear();
            this.f41661c = null;
            this.f41663e = 0;
            return;
        }
        Arrays.fill(m16969m(), 0, this.f41663e, (Object) null);
        mkv.m16532an(m16966j());
        Arrays.fill(m16968l(), 0, this.f41663e, 0);
        this.f41663e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (m16976g()) {
            return false;
        }
        Set setM16973d = m16973d();
        if (setM16973d != null) {
            return setM16973d.contains(obj);
        }
        int iM16523ae = mkv.m16523ae(obj);
        int iM16964h = m16964h();
        int iM16529ak = mkv.m16529ak(m16966j(), iM16523ae & iM16964h);
        if (iM16529ak == 0) {
            return false;
        }
        int iM16525ag = mkv.m16525ag(iM16523ae, iM16964h);
        do {
            int i = iM16529ak - 1;
            int i2 = m16968l()[i];
            if (mkv.m16525ag(i2, iM16964h) == iM16525ag && mpw.m16768g(obj, m16972c(i))) {
                return true;
            }
            iM16529ak = i2 & iM16964h;
        } while (iM16529ak != 0);
        return false;
    }

    /* JADX INFO: renamed from: d */
    final Set m16973d() {
        Object obj = this.f41661c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    final void m16974e() {
        this.f41660b += 32;
    }

    /* JADX INFO: renamed from: f */
    final void m16975f(int i) {
        lku.m15670x(true, "Expected size must be >= 0");
        this.f41660b = kxk.m14978X(i, 1, 1073741823);
    }

    /* JADX INFO: renamed from: g */
    final boolean m16976g() {
        return this.f41661c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setM16973d = m16973d();
        return setM16973d != null ? setM16973d.iterator() : new muo(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (m16976g()) {
            return false;
        }
        Set setM16973d = m16973d();
        if (setM16973d != null) {
            return setM16973d.remove(obj);
        }
        int iM16964h = m16964h();
        int iM16528aj = mkv.m16528aj(obj, null, iM16964h, m16966j(), m16968l(), m16969m(), null);
        if (iM16528aj == -1) {
            return false;
        }
        Object objM16966j = m16966j();
        int[] iArrM16968l = m16968l();
        Object[] objArrM16969m = m16969m();
        int size = size() - 1;
        if (iM16528aj < size) {
            Object obj2 = objArrM16969m[size];
            objArrM16969m[iM16528aj] = obj2;
            objArrM16969m[size] = null;
            iArrM16968l[iM16528aj] = iArrM16968l[size];
            iArrM16968l[size] = 0;
            int iM16523ae = mkv.m16523ae(obj2) & iM16964h;
            int iM16529ak = mkv.m16529ak(objM16966j, iM16523ae);
            int i3 = size + 1;
            if (iM16529ak == i3) {
                mkv.m16533ao(objM16966j, iM16523ae, iM16528aj + 1);
            } else {
                while (true) {
                    i = iM16529ak - 1;
                    i2 = iArrM16968l[i];
                    int i4 = i2 & iM16964h;
                    if (i4 == i3) {
                        break;
                    }
                    iM16529ak = i4;
                }
                iArrM16968l[i] = mkv.m16526ah(i2, iM16528aj + 1, iM16964h);
            }
        } else {
            objArrM16969m[iM16528aj] = null;
            iArrM16968l[iM16528aj] = 0;
        }
        this.f41663e--;
        m16974e();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setM16973d = m16973d();
        return setM16973d != null ? setM16973d.size() : this.f41663e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (m16976g()) {
            return new Object[0];
        }
        Set setM16973d = m16973d();
        return setM16973d != null ? setM16973d.toArray() : Arrays.copyOf(m16969m(), this.f41663e);
    }

    public mup(int i) {
        m16975f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (m16976g()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setM16973d = m16973d();
        if (setM16973d != null) {
            return setM16973d.toArray(objArr);
        }
        Object[] objArrM16969m = m16969m();
        int i = this.f41663e;
        lku.m15612G(0, i, objArrM16969m.length);
        int length = objArr.length;
        if (length < i) {
            objArr = mpw.m16759K(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArrM16969m, 0, objArr, 0, i);
        return objArr;
    }
}
