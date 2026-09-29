package kotlin.collections;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p249lo.C7411d;
import p249lo.InterfaceC7415h;
import p260m8.C7499b;
import p385sf.C9000b;
import tl.C9319g;
import tl.C9322j;
import tl.C9332t;

/* JADX INFO: renamed from: kotlin.collections.b */
/* JADX INFO: loaded from: classes2.dex */
public class C6744b extends C9322j {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.b$a */
    public static final class a<T> implements InterfaceC7415h<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object[] f38048a;

        public a(Object[] objArr) {
            this.f38048a = objArr;
        }

        @Override // p249lo.InterfaceC7415h
        public final Iterator<T> iterator() {
            return C7499b.m14931b0(this.f38048a);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final <T> InterfaceC7415h<T> m13376h0(T[] tArr) {
        return tArr.length == 0 ? C7411d.f41235a : new a(tArr);
    }

    /* JADX INFO: renamed from: i0 */
    public static final boolean m13377i0(Object obj, Object[] objArr) {
        C5207g.m11111f(objArr, "<this>");
        return m13384p0(obj, objArr) >= 0;
    }

    /* JADX INFO: renamed from: j0 */
    public static final ArrayList m13378j0(Object[] objArr) {
        C5207g.m11111f(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k0 */
    public static final <T> T m13379k0(T[] tArr) {
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    /* JADX INFO: renamed from: l0 */
    public static final <T> T m13380l0(T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    /* JADX INFO: renamed from: m0 */
    public static final <T> int m13381m0(T[] tArr) {
        C5207g.m11111f(tArr, "<this>");
        return tArr.length - 1;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Integer m13382n0(int[] iArr, int i10) {
        C5207g.m11111f(iArr, "<this>");
        if (i10 < 0 || i10 > iArr.length - 1) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    /* JADX INFO: renamed from: o0 */
    public static final Object m13383o0(int i10, Object[] objArr) {
        C5207g.m11111f(objArr, "<this>");
        if (i10 < 0 || i10 > objArr.length - 1) {
            return null;
        }
        return objArr[i10];
    }

    /* JADX INFO: renamed from: p0 */
    public static final int m13384p0(Object obj, Object[] objArr) {
        C5207g.m11111f(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
        } else {
            int length2 = objArr.length;
            while (i10 < length2) {
                if (C5207g.m11106a(obj, objArr[i10])) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: q0 */
    public static String m13385q0(Object[] objArr, String str, String str2, String str3, InterfaceC2052l interfaceC2052l, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        int i11 = (i10 & 8) != 0 ? -1 : 0;
        String str4 = (i10 & 16) != 0 ? "..." : null;
        if ((i10 & 32) != 0) {
            interfaceC2052l = null;
        }
        C5207g.m11111f(str, "separator");
        C5207g.m11111f(str2, "prefix");
        C5207g.m11111f(str3, "postfix");
        C5207g.m11111f(str4, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i12 = 0;
        for (Object obj : objArr) {
            i12++;
            if (i12 > 1) {
                sb2.append((CharSequence) str);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            C0062b.m288M(sb2, obj, interfaceC2052l);
        }
        if (i11 >= 0 && i12 > i11) {
            sb2.append((CharSequence) str4);
        }
        sb2.append((CharSequence) str3);
        String string = sb2.toString();
        C5207g.m11110e(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r0 */
    public static final <T> T m13386r0(T[] tArr) {
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[tArr.length - 1];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: s0 */
    public static final char m13387s0(char[] cArr) {
        C5207g.m11111f(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t0 */
    public static final <T> T m13388t0(T[] tArr) {
        C5207g.m11111f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX INFO: renamed from: u0 */
    public static final <T> List<T> m13389u0(T[] tArr, Comparator<? super T> comparator) {
        C5207g.m11111f(tArr, "<this>");
        if (!(tArr.length == 0)) {
            tArr = (T[]) Arrays.copyOf(tArr, tArr.length);
            C5207g.m11110e(tArr, "copyOf(this, size)");
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        return C9322j.m17670X(tArr);
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m13390v0(HashSet hashSet, Object[] objArr) {
        C5207g.m11111f(objArr, "<this>");
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static final <T> List<T> m13391w0(T[] tArr) {
        C5207g.m11111f(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new C9319g(tArr, false)) : C9000b.m17251q(tArr[0]);
        }
        return EmptyList.f38032a;
    }

    /* JADX INFO: renamed from: x0 */
    public static final ArrayList m13392x0(int[] iArr) {
        C5207g.m11111f(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y0 */
    public static final <T> Set<T> m13393y0(T[] tArr) {
        C5207g.m11111f(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return EmptySet.f38034a;
        }
        if (length == 1) {
            return C7499b.m14972w0(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C7499b.m14941g0(tArr.length));
        m13390v0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: z0 */
    public static final C9332t m13394z0(final Object[] objArr) {
        return new C9332t(new InterfaceC2041a<Iterator<Object>>() { // from class: kotlin.collections.ArraysKt___ArraysKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Iterator<Object> mo807E() {
                return C7499b.m14931b0(objArr);
            }
        });
    }
}
