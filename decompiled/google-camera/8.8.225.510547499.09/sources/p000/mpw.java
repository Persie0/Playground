package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mpw {
    /* JADX INFO: renamed from: A */
    public static HashSet m16749A() {
        return new HashSet();
    }

    /* JADX INFO: renamed from: B */
    public static HashSet m16750B(int i) {
        return new HashSet(mkv.m16557v(i));
    }

    /* JADX INFO: renamed from: C */
    public static NavigableSet m16751C(NavigableSet navigableSet) {
        return ((navigableSet instanceof mwj) || (navigableSet instanceof nac)) ? navigableSet : new nac(navigableSet);
    }

    /* JADX INFO: renamed from: D */
    public static Set m16752D() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* JADX INFO: renamed from: E */
    public static boolean m16753E(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof myy) {
            collection = ((myy) collection).mo16920f();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return m16754F(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m16754F(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    /* JADX INFO: renamed from: G */
    public static void m16755G(Map map, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m16756H(myv myvVar, ObjectInputStream objectInputStream, int i) throws IOException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collectionMo16885b = myvVar.mo16885b(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collectionMo16885b.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m16757I(Map map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m16758J(myv myvVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(myvVar.mo16912q().size());
        for (Map.Entry entry : myvVar.mo16912q().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static Object[] m16759K(Object[] objArr, int i) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    /* JADX INFO: renamed from: L */
    public static lyz m16760L(Class cls, String str) {
        try {
            return new lyz(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: M */
    private static int m16761M(char c) {
        return (char) ((c | ' ') - 97);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m16762a(int i) {
        switch (i) {
            case 1:
                return "INITIALIZED";
            case 2:
                return "RUNNING";
            case 3:
                return "PAUSED";
            case 4:
                return "SHUTTING_DOWN";
            case 5:
                return "RELEASED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: d */
    public static mrl m16765d(Object obj) {
        return new mrl(obj.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: e */
    public static mrl m16766e(String str) {
        return new mrl(str);
    }

    /* JADX INFO: renamed from: f */
    public static Object m16767f(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16768g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static String m16769h(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m16772k(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m16772k(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m16770i(CharSequence charSequence, CharSequence charSequence2) {
        int iM16761M;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((iM16761M = m16761M(cCharAt)) >= 26 || iM16761M != m16761M(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m16771j(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16772k(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX INFO: renamed from: l */
    public static int m16773l(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* JADX INFO: renamed from: m */
    public static int m16774m(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m16775n(nbi nbiVar) {
        nea.m17397k(nbiVar, "lazy arg");
    }

    /* JADX INFO: renamed from: o */
    public static int m16776o(int i, naw nawVar) {
        switch (i - 1) {
            case 0:
                return nawVar.f41911b;
            default:
                return 1;
        }
    }

    /* JADX INFO: renamed from: p */
    public static long m16777p(int i, naw nawVar) {
        switch (i - 1) {
            case 0:
                if (nawVar == null) {
                    return 0L;
                }
                return nawVar.f41913d;
            default:
                if (nawVar == null) {
                    return 0L;
                }
                return nawVar.f41912c;
        }
    }

    /* JADX INFO: renamed from: q */
    public static Map.Entry m16778q(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new naj(entry, obj);
    }

    /* JADX INFO: renamed from: r */
    public static NavigableMap m16779r(NavigableMap navigableMap, Object obj) {
        return new nal(navigableMap, obj);
    }

    /* JADX INFO: renamed from: s */
    public static NavigableSet m16780s(NavigableSet navigableSet, Object obj) {
        return new nam(navigableSet, obj);
    }

    /* JADX INFO: renamed from: t */
    public static Set m16781t(Set set, Object obj) {
        return new nap(set, obj);
    }

    /* JADX INFO: renamed from: u */
    public static SortedMap m16782u(SortedMap sortedMap, Object obj) {
        return new naq(sortedMap, obj);
    }

    /* JADX INFO: renamed from: v */
    public static SortedSet m16783v(SortedSet sortedSet, Object obj) {
        return new nar(sortedSet, obj);
    }

    /* JADX INFO: renamed from: w */
    public static Object m16784w(myx myxVar) {
        if (myxVar == null) {
            return null;
        }
        return myxVar.mo17162b();
    }

    /* JADX INFO: renamed from: x */
    public static Object m16785x(myx myxVar) {
        if (myxVar != null) {
            return myxVar.mo17162b();
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m16786y(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = mzg.f41839a;
            }
        } else {
            if (!(iterable instanceof nae)) {
                return false;
            }
            comparator2 = ((nae) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    /* JADX INFO: renamed from: z */
    public static int m16787z(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: c */
    public static final our m16764c(our ourVar, int i, onm onmVar) {
        if (i > 0) {
            return ook.m18783U(new mph(i, ourVar, onmVar, null));
        }
        throw new IllegalArgumentException("concurrency must be at least 1 but was " + i);
    }
}
