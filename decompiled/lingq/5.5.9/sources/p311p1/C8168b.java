package p311p1;

import androidx.compose.p017ui.text.font.C0695a;
import dm.C5207g;
import dm.C5212l;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import tl.C9322j;

/* JADX INFO: renamed from: p1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8168b<K, V> {

    /* JADX INFO: renamed from: a */
    public int[] f44297a;

    /* JADX INFO: renamed from: b */
    public Object[] f44298b;

    /* JADX INFO: renamed from: c */
    public int f44299c;

    public C8168b() {
        this(0);
    }

    public C8168b(int i10) {
        this.f44297a = C5212l.f33293l;
        this.f44298b = C5212l.f33279H;
        this.f44299c = 0;
    }

    /* JADX INFO: renamed from: a */
    public final V m16205a(K k10) {
        int iM16207c = k10 == null ? m16207c() : m16206b(k10.hashCode(), k10);
        if (iM16207c >= 0) {
            return (V) this.f44298b[(iM16207c << 1) + 1];
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m16206b(int i10, Object obj) {
        C5207g.m11111f(obj, "key");
        int i11 = this.f44299c;
        if (i11 == 0) {
            return -1;
        }
        int iM11176s = C5212l.m11176s(i11, i10, this.f44297a);
        if (iM11176s < 0 || C5207g.m11106a(obj, this.f44298b[iM11176s << 1])) {
            return iM11176s;
        }
        int i12 = iM11176s + 1;
        while (i12 < i11 && this.f44297a[i12] == i10) {
            if (C5207g.m11106a(obj, this.f44298b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iM11176s - 1; i13 >= 0 && this.f44297a[i13] == i10; i13--) {
            if (C5207g.m11106a(obj, this.f44298b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    /* JADX INFO: renamed from: c */
    public final int m16207c() {
        int i10 = this.f44299c;
        if (i10 == 0) {
            return -1;
        }
        int iM11176s = C5212l.m11176s(i10, 0, this.f44297a);
        if (iM11176s < 0 || this.f44298b[iM11176s << 1] == null) {
            return iM11176s;
        }
        int i11 = iM11176s + 1;
        while (i11 < i10 && this.f44297a[i11] == 0) {
            if (this.f44298b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iM11176s - 1; i12 >= 0 && this.f44297a[i12] == 0; i12--) {
            if (this.f44298b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final Object m16208d(C0695a.b bVar, C0695a.a aVar) {
        int iHashCode;
        int iM16206b;
        int i10 = this.f44299c;
        if (bVar == null) {
            iM16206b = m16207c();
            iHashCode = 0;
        } else {
            iHashCode = bVar.hashCode();
            iM16206b = m16206b(iHashCode, bVar);
        }
        if (iM16206b >= 0) {
            int i11 = (iM16206b << 1) + 1;
            Object[] objArr = this.f44298b;
            Object obj = objArr[i11];
            objArr[i11] = aVar;
            return obj;
        }
        int i12 = ~iM16206b;
        int[] iArr = this.f44297a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            C5207g.m11110e(iArrCopyOf, "copyOf(this, newSize)");
            this.f44297a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f44298b, i13 << 1);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
            this.f44298b = objArrCopyOf;
            if (i10 != this.f44299c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f44297a;
            int i14 = i12 + 1;
            C9322j.m17672Z(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f44298b;
            C9322j.m17673a0(i14 << 1, i12 << 1, this.f44299c << 1, objArr2, objArr2);
        }
        int i15 = this.f44299c;
        if (i10 == i15) {
            int[] iArr3 = this.f44297a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f44298b;
                int i16 = i12 << 1;
                objArr3[i16] = bVar;
                objArr3[i16 + 1] = aVar;
                this.f44299c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C8168b) {
                C8168b c8168b = (C8168b) obj;
                int i10 = this.f44299c;
                if (i10 != c8168b.f44299c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    Object[] objArr = this.f44298b;
                    int i12 = i11 << 1;
                    Object obj2 = objArr[i12];
                    Object obj3 = objArr[i12 + 1];
                    Object objM16205a = c8168b.m16205a(obj2);
                    if (obj3 == null) {
                        if (objM16205a == null) {
                            if (!((obj2 == null ? c8168b.m16207c() : c8168b.m16206b(obj2.hashCode(), obj2)) >= 0)) {
                            }
                        }
                        return false;
                    }
                    if (!C5207g.m11106a(obj3, objM16205a)) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof Map) {
                if (this.f44299c != ((Map) obj).size()) {
                    return false;
                }
                int i13 = this.f44299c;
                for (int i14 = 0; i14 < i13; i14++) {
                    Object[] objArr2 = this.f44298b;
                    int i15 = i14 << 1;
                    Object obj4 = objArr2[i15];
                    Object obj5 = objArr2[i15 + 1];
                    Object obj6 = ((Map) obj).get(obj4);
                    if (obj5 == null) {
                        if (obj6 == null && ((Map) obj).containsKey(obj4)) {
                        }
                        return false;
                    }
                    if (!C5207g.m11106a(obj5, obj6)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
        }
    }

    public final int hashCode() {
        int[] iArr = this.f44297a;
        Object[] objArr = this.f44298b;
        int i10 = this.f44299c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final String toString() {
        int i10 = this.f44299c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        int i11 = this.f44299c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            int i13 = i12 << 1;
            Object obj = this.f44298b[i13];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object obj2 = this.f44298b[i13 + 1];
            if (obj2 != this) {
                sb2.append(obj2);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        C5207g.m11110e(string, "buffer.toString()");
        return string;
    }
}
