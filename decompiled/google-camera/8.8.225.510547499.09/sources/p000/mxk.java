package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class mxk extends mwj implements Set {

    /* JADX INFO: renamed from: a */
    private transient mws f41765a;

    /* JADX INFO: renamed from: B */
    static int m17131B(int i) {
        double d;
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            lku.m15670x(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
            d = iHighestOneBit;
            Double.isNaN(d);
        } while (d * 0.7d < iMax);
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: D */
    public static mxi m17132D() {
        return new mxi();
    }

    /* JADX INFO: renamed from: F */
    public static mxk m17134F(Collection collection) {
        if ((collection instanceof mxk) && !(collection instanceof SortedSet)) {
            mxk mxkVar = (mxk) collection;
            if (!mxkVar.mo17014cs()) {
                return mxkVar;
            }
        }
        Object[] array = collection.toArray();
        return m17133E(array.length, array);
    }

    /* JADX INFO: renamed from: G */
    public static mxk m17135G(Object[] objArr) {
        int length = objArr.length;
        switch (length) {
            case 0:
                return mzx.f41874a;
            case 1:
                return m17136H(objArr[0]);
            default:
                return m17133E(length, (Object[]) objArr.clone());
        }
    }

    /* JADX INFO: renamed from: H */
    public static mxk m17136H(Object obj) {
        return new nad(obj);
    }

    /* JADX INFO: renamed from: I */
    public static mxk m17137I(Object obj, Object obj2) {
        return m17133E(2, obj, obj2);
    }

    /* JADX INFO: renamed from: J */
    public static mxk m17138J(Object obj, Object obj2, Object obj3) {
        return m17133E(3, obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: K */
    public static mxk m17139K(Object obj, Object obj2, Object obj3, Object obj4) {
        return m17133E(4, obj, obj2, obj3, obj4);
    }

    /* JADX INFO: renamed from: L */
    public static mxk m17140L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m17133E(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: M */
    public static mxk m17141M(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        lku.m15670x(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return m17133E(i, objArr2);
    }

    /* JADX INFO: renamed from: N */
    public static boolean m17142N(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: C */
    public mws mo17143C() {
        return mws.m17092g(toArray());
    }

    @Override // p000.mwj, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: cr, reason: merged with bridge method [inline-methods] */
    public abstract naz listIterator();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof mxk) && mo17026w() && ((mxk) obj).mo17026w() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException e) {
            } catch (NullPointerException e2) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return mpw.m16787z(this);
    }

    @Override // p000.mwj
    /* JADX INFO: renamed from: v */
    public mws mo17025v() {
        mws mwsVar = this.f41765a;
        if (mwsVar != null) {
            return mwsVar;
        }
        mws mwsVarMo17143C = mo17143C();
        this.f41765a = mwsVarMo17143C;
        return mwsVarMo17143C;
    }

    /* JADX INFO: renamed from: w */
    public boolean mo17026w() {
        return false;
    }

    @Override // p000.mwj
    Object writeReplace() {
        return new mxj(toArray());
    }

    /* JADX INFO: renamed from: E */
    public static mxk m17133E(int i, Object... objArr) {
        switch (i) {
            case 0:
                return mzx.f41874a;
            case 1:
                Object obj = objArr[0];
                obj.getClass();
                return m17136H(obj);
            default:
                int iM17131B = m17131B(i);
                Object[] objArr2 = new Object[iM17131B];
                int i2 = iM17131B - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj2 = objArr[i5];
                    mkv.m16551p(obj2, i5);
                    int iHashCode = obj2.hashCode();
                    int iM16522ad = mkv.m16522ad(iHashCode);
                    while (true) {
                        int i6 = iM16522ad & i2;
                        Object obj3 = objArr2[i6];
                        if (obj3 == null) {
                            objArr[i4] = obj2;
                            objArr2[i6] = obj2;
                            i3 += iHashCode;
                            i4++;
                        }
                        if (obj3.equals(obj2)) {
                        }
                        iM16522ad++;
                        break;
                        break;
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj4 = objArr[0];
                    obj4.getClass();
                    return new nad(obj4);
                }
                if (m17131B(i4) < iM17131B / 2) {
                    return m17133E(i4, objArr);
                }
                if (m17142N(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new mzx(objArr, i3, objArr2, i2, i4);
        }
    }
}
