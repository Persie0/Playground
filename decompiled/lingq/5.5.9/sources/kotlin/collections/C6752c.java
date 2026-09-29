package kotlin.collections;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.random.Random;
import p249lo.C7416i;
import p260m8.C7499b;
import p349qo.C8656b;
import p385sf.C9000b;
import tl.C9322j;
import tl.C9325m;
import tl.C9326n;
import tl.C9327o;
import tl.C9328p;
import tl.C9329q;
import tl.C9330r;
import tl.C9332t;

/* JADX INFO: renamed from: kotlin.collections.c */
/* JADX INFO: loaded from: classes2.dex */
public class C6752c extends C9328p {
    /* JADX INFO: renamed from: A0 */
    public static final ArrayList m13412A0(List list, Iterable iterable) {
        C5207g.m11111f(list, "<this>");
        C5207g.m11111f(iterable, "other");
        Iterator it = list.iterator();
        Iterator it2 = iterable.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C9325m.m17681z(list, 10), C9325m.m17681z(iterable, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public static final C9329q m13413G(Iterable iterable) {
        C5207g.m11111f(iterable, "<this>");
        return new C9329q(iterable);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: H */
    public static final ArrayList m13414H(Iterable iterable, int i10) {
        ArrayList arrayList;
        Iterator it;
        C5207g.m11111f(iterable, "<this>");
        if (!(i10 > 0 && i10 > 0)) {
            throw new IllegalArgumentException(C0166e.m762h("size ", i10, " must be greater than zero.").toString());
        }
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            arrayList = new ArrayList((size / i10) + (size % i10 == 0 ? 0 : 1));
            int i11 = 0;
            while (true) {
                if (!(i11 >= 0 && i11 < size)) {
                    break;
                }
                int i12 = size - i11;
                if (i10 <= i12) {
                    i12 = i10;
                }
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 < i12; i13++) {
                    arrayList2.add(list.get(i13 + i11));
                }
                arrayList.add(arrayList2);
                i11 += i10;
            }
        } else {
            arrayList = new ArrayList();
            Iterator it2 = iterable.iterator();
            C5207g.m11111f(it2, "iterator");
            if (it2.hasNext()) {
                SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(i10, i10, it2, false, true, null);
                C7416i c7416i = new C7416i();
                c7416i.f41257d = C8656b.m16908p(slidingWindowKt$windowedIterator$1, c7416i, c7416i);
                it = c7416i;
            } else {
                it = C9330r.f48065a;
            }
            while (it.hasNext()) {
                arrayList.add((List) it.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: I */
    public static final <T> boolean m13415I(Iterable<? extends T> iterable, T t10) {
        C5207g.m11111f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t10);
        }
        return m13427U(iterable, t10) >= 0;
    }

    /* JADX INFO: renamed from: J */
    public static final <T> List<T> m13416J(Iterable<? extends T> iterable) {
        C5207g.m11111f(iterable, "<this>");
        return m13453u0(m13456x0(iterable));
    }

    /* JADX INFO: renamed from: K */
    public static final List m13417K(List list, int i10) {
        C5207g.m11111f(list, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m762h("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return m13453u0(list);
        }
        int size = list.size() - i10;
        if (size <= 0) {
            return EmptyList.f38032a;
        }
        if (size == 1) {
            return C9000b.m17251q(m13431Y(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i10 < size2) {
                arrayList.add(list.get(i10));
                i10++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public static final List m13418L(List list) {
        C5207g.m11111f(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return m13448p0(list, size);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: M */
    public static final Object m13419M(Collection collection, final int i10) {
        C5207g.m11111f(collection, "<this>");
        boolean z10 = collection instanceof List;
        if (z10) {
            return ((List) collection).get(i10);
        }
        InterfaceC2052l<Integer, Object> interfaceC2052l = new InterfaceC2052l<Integer, Object>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$elementAt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Object mo528n(Integer num) {
                num.intValue();
                throw new IndexOutOfBoundsException(C0204c.m853l(new StringBuilder("Collection doesn't contain element at index "), i10, '.'));
            }
        };
        if (z10) {
            List list = (List) collection;
            if (i10 >= 0 && i10 <= C9000b.m17249o(list)) {
                return list.get(i10);
            }
            interfaceC2052l.mo528n(Integer.valueOf(i10));
            throw null;
        }
        if (i10 < 0) {
            interfaceC2052l.mo528n(Integer.valueOf(i10));
            throw null;
        }
        int i11 = 0;
        for (Object obj : collection) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return obj;
            }
            i11 = i12;
        }
        interfaceC2052l.mo528n(Integer.valueOf(i10));
        throw null;
    }

    /* JADX INFO: renamed from: N */
    public static final ArrayList m13420N(Iterable iterable, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) interfaceC2052l.mo528n(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public static final ArrayList m13421O(Iterable iterable) {
        C5207g.m11111f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: P */
    public static final <T> T m13422P(Iterable<? extends T> iterable) {
        C5207g.m11111f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m13423Q((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX INFO: renamed from: Q */
    public static final <T> T m13423Q(List<? extends T> list) {
        C5207g.m11111f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: R */
    public static final <T> T m13424R(Iterable<? extends T> iterable) {
        C5207g.m11111f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    public static final <T> T m13425S(List<? extends T> list) {
        C5207g.m11111f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: T */
    public static final Object m13426T(int i10, List list) {
        C5207g.m11111f(list, "<this>");
        if (i10 < 0 || i10 > C9000b.m17249o(list)) {
            return null;
        }
        return list.get(i10);
    }

    /* JADX INFO: renamed from: U */
    public static final <T> int m13427U(Iterable<? extends T> iterable, T t10) {
        C5207g.m11111f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                C9000b.m17257w();
                throw null;
            }
            if (C5207g.m11106a(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: V */
    public static final void m13428V(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC2052l interfaceC2052l) throws IOException {
        C5207g.m11111f(iterable, "<this>");
        C5207g.m11111f(appendable, "buffer");
        C5207g.m11111f(charSequence, "separator");
        C5207g.m11111f(charSequence2, "prefix");
        C5207g.m11111f(charSequence3, "postfix");
        C5207g.m11111f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            C0062b.m288M(appendable, obj, interfaceC2052l);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m13429W(Iterable iterable, Appendable appendable, String str, String str2, String str3, InterfaceC2052l interfaceC2052l, int i10) throws IOException {
        if ((i10 & 2) != 0) {
            str = ", ";
        }
        m13428V(iterable, appendable, str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? -1 : 0, (i10 & 32) != 0 ? "..." : null, (i10 & 64) != 0 ? null : interfaceC2052l);
    }

    /* JADX INFO: renamed from: X */
    public static String m13430X(Iterable iterable, String str, String str2, String str3, InterfaceC2052l interfaceC2052l, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        int i11 = (i10 & 8) != 0 ? -1 : 0;
        CharSequence charSequence = (i10 & 16) != 0 ? "..." : null;
        InterfaceC2052l interfaceC2052l2 = (i10 & 32) != 0 ? null : interfaceC2052l;
        C5207g.m11111f(iterable, "<this>");
        C5207g.m11111f(str4, "separator");
        C5207g.m11111f(str5, "prefix");
        C5207g.m11111f(str6, "postfix");
        C5207g.m11111f(charSequence, "truncated");
        StringBuilder sb2 = new StringBuilder();
        m13428V(iterable, sb2, str4, str5, str6, i11, charSequence, interfaceC2052l2);
        String string = sb2.toString();
        C5207g.m11110e(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    /* JADX INFO: renamed from: Y */
    public static final Object m13431Y(Collection collection) {
        C5207g.m11111f(collection, "<this>");
        if (collection instanceof List) {
            return m13432Z((List) collection);
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (true) {
            Object obj = next;
            if (!it.hasNext()) {
                return obj;
            }
            next = it.next();
        }
    }

    /* JADX INFO: renamed from: Z */
    public static final <T> T m13432Z(List<? extends T> list) {
        C5207g.m11111f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C9000b.m17249o(list));
    }

    /* JADX INFO: renamed from: a0 */
    public static final <T> T m13433a0(List<? extends T> list) {
        C5207g.m11111f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: b0 */
    public static final Comparable m13434b0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (true) {
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
            }
            return comparable;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final ArrayList m13435c0(Iterable iterable, Object obj) {
        C5207g.m11111f(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && C5207g.m11106a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d0 */
    public static final ArrayList m13436d0(Iterable iterable, Iterable iterable2) {
        C5207g.m11111f(iterable, "<this>");
        C5207g.m11111f(iterable2, "elements");
        if (iterable instanceof Collection) {
            return m13438f0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        C9327o.m17684D(iterable, arrayList);
        C9327o.m17684D(iterable2, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: e0 */
    public static final ArrayList m13437e0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return m13439g0(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        C9327o.m17684D(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public static final ArrayList m13438f0(Iterable iterable, Collection collection) {
        C5207g.m11111f(collection, "<this>");
        C5207g.m11111f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C9327o.m17684D(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: g0 */
    public static final ArrayList m13439g0(Object obj, Collection collection) {
        C5207g.m11111f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h0 */
    public static final Object m13440h0(List list, Random.Default r10) {
        C5207g.m11111f(list, "<this>");
        C5207g.m11111f(r10, "random");
        if (list.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return m13419M(list, r10.mo12511c(list.size()));
    }

    /* JADX INFO: renamed from: i0 */
    public static final List m13441i0(List list) {
        C5207g.m11111f(list, "<this>");
        if (list.size() <= 1) {
            return m13453u0(list);
        }
        List listM13455w0 = m13455w0(list);
        Collections.reverse(listM13455w0);
        return listM13455w0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j0 */
    public static final Object m13442j0(Collection collection) {
        C5207g.m11111f(collection, "<this>");
        if (collection instanceof List) {
            return m13443k0((List) collection);
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* JADX INFO: renamed from: k0 */
    public static final <T> T m13443k0(List<? extends T> list) {
        C5207g.m11111f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* JADX INFO: renamed from: l0 */
    public static final Object m13444l0(Collection collection) {
        C5207g.m11111f(collection, "<this>");
        if (collection instanceof List) {
            List list = (List) collection;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* JADX INFO: renamed from: m0 */
    public static final <T> T m13445m0(List<? extends T> list) {
        C5207g.m11111f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public static final List m13446n0(AbstractList abstractList) {
        if (abstractList.size() <= 1) {
            return m13453u0(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        C5207g.m11111f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return C9322j.m17670X(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public static final <T> List<T> m13447o0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C5207g.m11111f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listM13455w0 = m13455w0(iterable);
            C9326n.m17682B(listM13455w0, comparator);
            return listM13455w0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m13453u0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C5207g.m11111f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return C9322j.m17670X(array);
    }

    /* JADX INFO: renamed from: p0 */
    public static final <T> List<T> m13448p0(Iterable<? extends T> iterable, int i10) {
        C5207g.m11111f(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m762h("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f38032a;
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return m13453u0(iterable);
            }
            if (i10 == 1) {
                return C9000b.m17251q(m13422P(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return C9000b.m17255u(arrayList);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q0 */
    public static final List m13449q0(int i10, List list) {
        C5207g.m11111f(list, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m762h("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return EmptyList.f38032a;
        }
        int size = list.size();
        if (i10 >= size) {
            return m13453u0(list);
        }
        if (i10 == 1) {
            return C9000b.m17251q(m13432Z(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m13450r0(Iterable iterable, java.util.AbstractCollection abstractCollection) {
        C5207g.m11111f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static final HashSet m13451s0(ArrayList arrayList) {
        HashSet hashSet = new HashSet(C7499b.m14941g0(C9325m.m17681z(arrayList, 12)));
        m13450r0(arrayList, hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: t0 */
    public static final int[] m13452t0(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: u0 */
    public static final <T> List<T> m13453u0(Iterable<? extends T> iterable) {
        C5207g.m11111f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C9000b.m17255u(m13455w0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.f38032a;
        }
        if (size != 1) {
            return m13454v0(collection);
        }
        return C9000b.m17251q(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* JADX INFO: renamed from: v0 */
    public static final ArrayList m13454v0(Collection collection) {
        C5207g.m11111f(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX INFO: renamed from: w0 */
    public static final <T> List<T> m13455w0(Iterable<? extends T> iterable) {
        C5207g.m11111f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m13454v0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m13450r0(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: x0 */
    public static final <T> Set<T> m13456x0(Iterable<? extends T> iterable) {
        C5207g.m11111f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m13450r0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: y0 */
    public static final <T> Set<T> m13457y0(Iterable<? extends T> iterable) {
        C5207g.m11111f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            m13450r0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : C7499b.m14972w0(linkedHashSet.iterator().next());
            }
            return EmptySet.f38034a;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return EmptySet.f38034a;
        }
        if (size2 == 1) {
            return C7499b.m14972w0(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(C7499b.m14941g0(collection.size()));
        m13450r0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    /* JADX INFO: renamed from: z0 */
    public static final C9332t m13458z0(final Iterable iterable) {
        C5207g.m11111f(iterable, "<this>");
        return new C9332t(new InterfaceC2041a<Iterator<Object>>() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Iterator<Object> mo807E() {
                return iterable.iterator();
            }
        });
    }
}
