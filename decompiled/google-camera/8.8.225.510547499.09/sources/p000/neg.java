package p000;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class neg extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public static final Comparator f42095a = new ned(2);

    /* JADX INFO: renamed from: b */
    public final Object[] f42096b;

    /* JADX INFO: renamed from: c */
    public final int[] f42097c;

    /* JADX INFO: renamed from: d */
    public final Set f42098d = new nef(this, -1);

    /* JADX INFO: renamed from: e */
    private Integer f42099e = null;

    /* JADX INFO: renamed from: f */
    private String f42100f = null;

    public neg(neg negVar, neg negVar2) {
        int i;
        Object objM17409c;
        Object[] objArr;
        int size = negVar.size() + negVar2.size();
        int iM17411b = negVar.m17411b() + negVar2.m17411b();
        int i2 = size + 1;
        Object[] objArr2 = new Object[iM17411b];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        int iM17410a = size;
        Map.Entry entryM17412c = negVar.m17412c(0);
        Map.Entry entryM17412c2 = negVar2.m17412c(0);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (entryM17412c == null && entryM17412c2 == null) {
                break;
            }
            int iCompareTo = entryM17412c == null ? 1 : entryM17412c2 == null ? -1 : 0;
            if (iCompareTo == 0 && (iCompareTo = ((String) entryM17412c.getKey()).compareTo((String) entryM17412c2.getKey())) == 0) {
                objArr2[i4] = m17413d((String) entryM17412c.getKey(), i4);
                int i7 = i4 + 1;
                nef nefVar = (nef) entryM17412c.getValue();
                nef nefVar2 = (nef) entryM17412c2.getValue();
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (i8 >= nefVar.size() && i9 >= nefVar2.size()) {
                        break;
                    }
                    int iCompare = i8 == nefVar.size() ? 1 : i9 == nefVar2.size() ? -1 : 0;
                    iCompare = iCompare == 0 ? nei.f42106a.compare(nefVar.m17409c(i8), nefVar2.m17409c(i9)) : iCompare;
                    if (iCompare < 0) {
                        i = i8 + 1;
                        objM17409c = nefVar.m17409c(i8);
                    } else {
                        int i10 = i9 + 1;
                        Object objM17409c2 = nefVar2.m17409c(i9);
                        i = iCompare == 0 ? i8 + 1 : i8;
                        i9 = i10;
                        objM17409c = objM17409c2;
                    }
                    objArr2[iM17410a] = objM17409c;
                    i8 = i;
                    iM17410a++;
                    i3 = 0;
                }
                iArr[i7] = iM17410a;
                int i11 = i5 + 1;
                entryM17412c = negVar.m17412c(i11);
                int i12 = i6 + 1;
                entryM17412c2 = negVar2.m17412c(i12);
                i5 = i11;
                i6 = i12;
                i4 = i7;
            } else if (iCompareTo < 0) {
                iM17410a = m17410a(entryM17412c, i4, iM17410a, objArr2, iArr);
                int i13 = i5 + 1;
                entryM17412c = negVar.m17412c(i13);
                i5 = i13;
                i4++;
                i3 = 0;
            } else {
                iM17410a = m17410a(entryM17412c2, i4, iM17410a, objArr2, iArr);
                int i14 = i6 + 1;
                entryM17412c2 = negVar2.m17412c(i14);
                i6 = i14;
                i4++;
                i3 = 0;
            }
        }
        int i15 = iArr[i3];
        int i16 = i15 - i4;
        if (i16 != 0) {
            for (int i17 = 0; i17 <= i4; i17++) {
                iArr[i17] = iArr[i17] - i16;
            }
            int i18 = iArr[i4];
            int i19 = i18 - i4;
            if (m17414e(iM17411b, i18)) {
                objArr = new Object[i18];
                System.arraycopy(objArr2, i3, objArr, i3, i4);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i15, objArr, i4, i19);
            objArr2 = objArr;
        }
        this.f42096b = objArr2;
        int i20 = iArr[i3] + 1;
        this.f42097c = m17414e(i2, i20) ? Arrays.copyOf(iArr, i20) : iArr;
    }

    /* JADX INFO: renamed from: a */
    private final int m17410a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        nef nefVar = (nef) entry.getValue();
        int iM17407a = nefVar.m17407a() - nefVar.m17408b();
        System.arraycopy(nefVar.f42094b.f42096b, nefVar.m17408b(), objArr, i2, iM17407a);
        objArr[i] = m17413d((String) entry.getKey(), i);
        int i3 = i2 + iM17407a;
        iArr[i + 1] = i3;
        return i3;
    }

    /* JADX INFO: renamed from: b */
    private final int m17411b() {
        return this.f42097c[size()];
    }

    /* JADX INFO: renamed from: c */
    private final Map.Entry m17412c(int i) {
        if (i < this.f42097c[0]) {
            return (Map.Entry) this.f42096b[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final Map.Entry m17413d(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new nef(this, i));
    }

    /* JADX INFO: renamed from: e */
    private static boolean m17414e(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f42098d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f42099e == null) {
            this.f42099e = Integer.valueOf(super.hashCode());
        }
        return this.f42099e.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f42100f == null) {
            this.f42100f = super.toString();
        }
        return this.f42100f;
    }

    public neg(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            int[] iArr = new int[1];
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                Object obj = ((mav) it2.next()).f39742a;
                throw null;
            }
            iArr[0] = 0;
            this.f42096b = m17414e(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
            this.f42097c = iArr;
            return;
        }
        Object obj2 = ((mav) it.next()).f39742a;
        throw null;
    }
}
