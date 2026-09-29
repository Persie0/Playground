package p000;

import java.util.AbstractCollection;
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
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.AbstractC3195b;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.random.Random$Default;

/* JADX INFO: loaded from: classes.dex */
public abstract class u91 extends x91 {
    /* JADX INFO: renamed from: A0 */
    public static List m22583A0(Iterable iterable) {
        iterable.getClass();
        return m22622n1(m22626r1(iterable));
    }

    /* JADX INFO: renamed from: B0 */
    public static List m22584B0(Iterable iterable, int i) {
        ArrayList arrayList;
        Object objM22597O0;
        iterable.getClass();
        if (i < 0) {
            C3386nv.m17624j(ux5.m22989l("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return m22622n1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return EmptyList.f47638a;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objM22597O0 = m22597O0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        uk9.m22775i("Collection is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objM22597O0 = next;
                }
                return vz1.m23604J(objM22597O0);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return vz1.m23611Q(arrayList);
    }

    /* JADX INFO: renamed from: C0 */
    public static List m22585C0(List list) {
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return m22615g1(list2, size);
    }

    /* JADX INFO: renamed from: D0 */
    public static Object m22586D0(Iterable iterable, int i) {
        iterable.getClass();
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        int i2 = 0;
        y91 y91Var = new y91(i, i2);
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            y91Var.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            y91Var.invoke(Integer.valueOf(i));
            throw null;
        }
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        y91Var.invoke(Integer.valueOf(i));
        throw null;
    }

    /* JADX INFO: renamed from: E0 */
    public static ArrayList m22587E0(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F0 */
    public static Object m22588F0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return m22589G0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        uk9.m22775i("Collection is empty.");
        return null;
    }

    /* JADX INFO: renamed from: G0 */
    public static Object m22589G0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        uk9.m22775i("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: H0 */
    public static Object m22590H0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    public static Object m22591I0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: J0 */
    public static Object m22592J0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    /* JADX INFO: renamed from: K0 */
    public static int m22593K0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                vz1.m23628e0();
                throw null;
            }
            if (fa4.m11650l(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m22594L0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, vi3 vi3Var) {
        iterable.getClass();
        charSequence2.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            x74.m24349f(sb, obj, vi3Var);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m22595M0(List list, StringBuilder sb, String str, vi3 vi3Var, int i) {
        CharSequence charSequence = (i & 4) != 0 ? "" : "Errors: ";
        if ((i & 64) != 0) {
            vi3Var = null;
        }
        m22594L0(list, sb, str, charSequence, "", "...", vi3Var);
    }

    /* JADX INFO: renamed from: N0 */
    public static String m22596N0(Iterable iterable, String str, String str2, String str3, vi3 vi3Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            vi3Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        m22594L0(iterable, sb, str4, str5, str6, "...", vi3Var);
        return sb.toString();
    }

    /* JADX INFO: renamed from: O0 */
    public static Object m22597O0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        uk9.m22775i("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: P0 */
    public static Object m22598P0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: Q0 */
    public static Comparable m22599Q0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: R0 */
    public static Comparable m22600R0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            uk9.m22784s();
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: S0 */
    public static Comparable m22601S0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            uk9.m22784s();
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: T0 */
    public static ArrayList m22602T0(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(v91.m23189q0(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && fa4.m11650l(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: U0 */
    public static ArrayList m22603U0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            m22630w0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: V0 */
    public static ArrayList m22604V0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: W0 */
    public static Object m22605W0(Collection collection) {
        Random$Default random$Default = jq7.f46010a;
        collection.getClass();
        if (collection.isEmpty()) {
            uk9.m22775i("Collection is empty.");
            return null;
        }
        return m22586D0(collection, jq7.f46011b.m14247e(collection.size()));
    }

    /* JADX INFO: renamed from: X0 */
    public static void m22606X0(vi3 vi3Var, List list) {
        int size;
        list.getClass();
        vi3Var.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof tg4) && !(list instanceof ug4)) {
                lda.m16113M(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Boolean) vi3Var.invoke(it.next())).booleanValue()) {
                        it.remove();
                    }
                }
                return;
            } catch (ClassCastException e) {
                fa4.m11634H(e, lda.class.getName());
                throw e;
            }
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) vi3Var.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public static Object m22607Y0(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        uk9.m22775i("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    public static Object m22608Z0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        uk9.m22775i("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public static Object m22609a1(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    /* JADX INFO: renamed from: b1 */
    public static List m22610b1(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m22622n1(iterable);
        }
        List listM22625q1 = m22625q1(iterable);
        Collections.reverse(listM22625q1);
        return listM22625q1;
    }

    /* JADX INFO: renamed from: c1 */
    public static Object m22611c1(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            uk9.m22775i("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        C3386nv.m17626m("List has more than one element.");
        return null;
    }

    /* JADX INFO: renamed from: d1 */
    public static List m22612d1(List list, i84 i84Var) {
        list.getClass();
        return i84Var.isEmpty() ? EmptyList.f47638a : m22622n1(list.subList(i84Var.f40379a, i84Var.f40380b + 1));
    }

    /* JADX INFO: renamed from: e1 */
    public static List m22613e1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listM22625q1 = m22625q1(iterable);
            x91.m24413s0(listM22625q1);
            return listM22625q1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m22622n1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: f1 */
    public static List m22614f1(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listM22625q1 = m22625q1(iterable);
            x91.m24414t0(listM22625q1, comparator);
            return listM22625q1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m22622n1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: g1 */
    public static List m22615g1(Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            C3386nv.m17624j(ux5.m22989l("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return EmptyList.f47638a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return m22622n1(iterable);
            }
            if (i == 1) {
                return vz1.m23604J(m22588F0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return vz1.m23611Q(arrayList);
    }

    /* JADX INFO: renamed from: h1 */
    public static List m22616h1(int i, List list) {
        if (i < 0) {
            C3386nv.m17624j(ux5.m22989l("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return EmptyList.f47638a;
        }
        int size = list.size();
        if (i >= size) {
            return m22622n1(list);
        }
        if (i == 1) {
            return vz1.m23604J(m22597O0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i1 */
    public static boolean[] m22617i1(Collection collection) {
        collection.getClass();
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    /* JADX INFO: renamed from: j1 */
    public static final void m22618j1(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static float[] m22619k1(Collection collection) {
        collection.getClass();
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: l1 */
    public static HashSet m22620l1(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet(AbstractC3194a.m15363P(v91.m23189q0(iterable, 12)));
        m22618j1(iterable, hashSet);
        return hashSet;
    }

    /* JADX INFO: renamed from: m1 */
    public static int[] m22621m1(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: n1 */
    public static List m22622n1(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return vz1.m23611Q(m22625q1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.f47638a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return vz1.m23604J(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: o1 */
    public static long[] m22623o1(Collection collection) {
        collection.getClass();
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: p1 */
    public static ArrayList m22624p1(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    /* JADX INFO: renamed from: q1 */
    public static final List m22625q1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m22618j1(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: r1 */
    public static Set m22626r1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m22618j1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: s1 */
    public static Set m22627s1(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return AbstractC3489q9.m19766C(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3194a.m15363P(collection.size()));
                m22618j1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m22618j1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : AbstractC3489q9.m19766C(linkedHashSet2.iterator().next());
            }
        }
        return EmptySet.f47640a;
    }

    /* JADX INFO: renamed from: u0 */
    public static final int m22628u0(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbM22998u = ux5.m22998u("Element index ", i, " must be in range [");
        sbM22998u.append(new i84(0, list.size() - 1, 1));
        sbM22998u.append("].");
        throw new IndexOutOfBoundsException(sbM22998u.toString());
    }

    /* JADX INFO: renamed from: v0 */
    public static final int m22629v0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbM22998u = ux5.m22998u("Position index ", i, " must be in range [");
        sbM22998u.append(new i84(0, list.size(), 1));
        sbM22998u.append("].");
        throw new IndexOutOfBoundsException(sbM22998u.toString());
    }

    /* JADX INFO: renamed from: w0 */
    public static void m22630w0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static double m22631x0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                vz1.m23626d0();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    /* JADX INFO: renamed from: y0 */
    public static ArrayList m22632y0(Iterable iterable, int i) {
        iterable.getClass();
        AbstractC3195b.m15373a(i, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itM15374b = AbstractC3195b.m15374b(iterable.iterator(), i, i);
            while (itM15374b.hasNext()) {
                arrayList.add((List) itM15374b.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m22633z0(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return m22593K0(iterable, obj) >= 0;
    }
}
