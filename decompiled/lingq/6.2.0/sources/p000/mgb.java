package p000;

import com.google.android.gms.internal.measurement.C0957a;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mgb extends AbstractMap {

    /* JADX INFO: renamed from: f */
    public static final es6 f51308f = new es6(6);

    /* JADX INFO: renamed from: a */
    public final Object[] f51309a;

    /* JADX INFO: renamed from: b */
    public final int[] f51310b;

    /* JADX INFO: renamed from: c */
    public final lgb f51311c;

    /* JADX INFO: renamed from: d */
    public Integer f51312d;

    /* JADX INFO: renamed from: e */
    public String f51313e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, mgb] */
    /* JADX WARN: Type inference failed for: r0v1, types: [mgb] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public mgb(mgb mgbVar, mgb mgbVar2) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.f51311c = new lgb(abstractMap, -1);
        abstractMap.f51312d = null;
        abstractMap.f51313e = null;
        int size = mgbVar2.size() + mgbVar.size();
        int i = mgbVar.f51310b[mgbVar.size()] + mgbVar2.f51310b[mgbVar2.size()];
        int i2 = size + 1;
        Object[] objArr2 = new Object[i];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryM16830c = mgbVar.m16830c(0);
        Map.Entry entryM16830c2 = mgbVar2.m16830c(0);
        int i4 = 0;
        int i5 = 0;
        int iM16829a = size;
        int i6 = 0;
        while (true) {
            if (entryM16830c == null && entryM16830c2 == null) {
                break;
            }
            i6++;
            if (entryM16830c != null) {
                if (entryM16830c2 != null) {
                    int iCompareTo = ((String) entryM16830c.getKey()).compareTo((String) entryM16830c2.getKey());
                    if (iCompareTo == 0) {
                        int i7 = i4 + 1;
                        int i8 = i5 + 1;
                        objArr2[i6] = new AbstractMap.SimpleImmutableEntry((String) entryM16830c.getKey(), new lgb(abstractMap, i6));
                        lgb lgbVar = (lgb) entryM16830c.getValue();
                        lgb lgbVar2 = (lgb) entryM16830c2.getValue();
                        int i9 = 0;
                        int i10 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iM16183f = lgbVar.m16183f();
                            mgb mgbVar3 = lgbVar.f49648b;
                            if (i9 >= iM16183f - lgbVar.m16182d() && i10 >= lgbVar2.m16183f() - lgbVar2.m16182d()) {
                                break;
                            }
                            int iCompare = i9 == lgbVar.m16183f() - lgbVar.m16182d() ? 1 : i10 == lgbVar2.m16183f() - lgbVar2.m16182d() ? -1 : 0;
                            if (iCompare == 0) {
                                C0957a c0957a = ngb.f52716b;
                                iCompare = ngb.f52716b.compare(mgbVar3.f51309a[lgbVar.m16182d() + i9], lgbVar2.f49648b.f51309a[lgbVar2.m16182d() + i10]);
                            }
                            if (iCompare < 0) {
                                i9++;
                                obj = mgbVar3.f51309a[lgbVar.m16182d() + i9];
                            } else {
                                int i11 = i10 + 1;
                                Object obj2 = lgbVar2.f49648b.f51309a[lgbVar2.m16182d() + i10];
                                if (iCompare == 0) {
                                    i10 = i11;
                                    obj = obj2;
                                    i9++;
                                } else {
                                    i10 = i11;
                                    obj = obj2;
                                    i9 = i9;
                                }
                            }
                            objArr2[iM16829a] = obj;
                            abstractMap = this;
                            iM16829a++;
                        }
                        iArr[i6] = iM16829a;
                        entryM16830c = mgbVar.m16830c(i8);
                        entryM16830c2 = mgbVar2.m16830c(i7);
                        i5 = i8;
                        i4 = i7;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iM16829a = m16829a(entryM16830c, i6, iM16829a, objArr2, iArr);
                entryM16830c = mgbVar.m16830c(i5);
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryM16830c;
            i4++;
            int iM16829a2 = m16829a(entryM16830c2, i6, iM16829a, objArr2, iArr);
            entryM16830c2 = mgbVar2.m16830c(i4);
            iM16829a = iM16829a2;
            entryM16830c = entry;
            i3 = 0;
            abstractMap = this;
        }
        int i12 = iArr[i3];
        int i13 = i12 - i6;
        if (i13 != 0) {
            for (int i14 = i3; i14 <= i6; i14++) {
                iArr[i14] = iArr[i14] - i13;
            }
            int i15 = iArr[i6];
            int i16 = i15 - i6;
            if (m16828b(i, i15)) {
                objArr = new Object[i15];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i12, objArr, i6, i16);
            objArr2 = objArr;
        }
        abstractMap.f51309a = objArr2;
        int i17 = iArr[i3] + 1;
        abstractMap.f51310b = m16828b(i2, i17) ? Arrays.copyOf(iArr, i17) : iArr;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16828b(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    /* JADX INFO: renamed from: a */
    public final int m16829a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        lgb lgbVar = (lgb) entry.getValue();
        int iM16183f = lgbVar.m16183f() - lgbVar.m16182d();
        System.arraycopy(lgbVar.f49648b.f51309a, lgbVar.m16182d(), objArr, i2, iM16183f);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new lgb(this, i));
        int i3 = i2 + iM16183f;
        iArr[i + 1] = i3;
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m16830c(int i) {
        if (i < this.f51310b[0]) {
            return (Map.Entry) this.f51309a[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f51311c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f51312d == null) {
            this.f51312d = Integer.valueOf(super.hashCode());
        }
        return this.f51312d.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f51313e == null) {
            this.f51313e = super.toString();
        }
        return this.f51313e;
    }

    public mgb() {
        List list = Collections.EMPTY_LIST;
        this.f51311c = new lgb(this, -1);
        this.f51312d = null;
        this.f51313e = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.f51309a = m16828b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.f51310b = iArr;
                return;
            }
            throw wq1.m24110f(it2);
        }
        throw wq1.m24110f(it);
    }
}
