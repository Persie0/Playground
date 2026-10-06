package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class omn {
    /* JADX INFO: renamed from: A */
    public static Map m18661A(okb okbVar) {
        okbVar.getClass();
        Map mapSingletonMap = Collections.singletonMap(okbVar.f46186a, okbVar.f46187b);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: B */
    public static Map m18662B(Map map, okb okbVar) {
        if (map.isEmpty()) {
            return m18661A(okbVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(okbVar.f46186a, okbVar.f46187b);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public static Map m18663C(Iterable iterable) {
        switch (iterable.size()) {
            case 0:
                return okw.f46216a;
            case 1:
                return m18661A((okb) iterable.get(0));
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap(m18721z(iterable.size()));
                m18664D(linkedHashMap, iterable);
                return linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m18664D(Map map, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            okb okbVar = (okb) it.next();
            map.put(okbVar.f46186a, okbVar.f46187b);
        }
    }

    /* JADX INFO: renamed from: E */
    public static List m18665E() {
        return new olc(10);
    }

    /* JADX INFO: renamed from: F */
    public static List m18666F(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX INFO: renamed from: G */
    public static int m18667G(List list) {
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: H */
    public static List m18668H(Object obj) {
        return obj != null ? m18666F(obj) : okv.f46215a;
    }

    /* JADX INFO: renamed from: I */
    public static List m18669I(Object... objArr) {
        objArr.getClass();
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new oks(objArr, true));
    }

    /* JADX INFO: renamed from: J */
    public static void m18670J() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: K */
    public static Object m18671K(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: L */
    public static Object m18672L(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public static List m18673M(Iterable iterable) {
        iterable.getClass();
        switch (iterable.size()) {
            case 0:
                return okv.f46215a;
            case 1:
                return m18666F(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            default:
                return m18674N(iterable);
        }
    }

    /* JADX INFO: renamed from: N */
    public static List m18674N(Collection collection) {
        return new ArrayList(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public static Set m18675O(Iterable iterable) {
        iterable.getClass();
        switch (iterable.size()) {
            case 0:
                return okx.f46217a;
            case 1:
                return m18718w(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            default:
                LinkedHashSet linkedHashSet = new LinkedHashSet(m18721z(iterable.size()));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next());
                }
                return linkedHashSet;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public static boolean m18676P(Iterable iterable, Object obj) {
        return iterable.contains(obj);
    }

    /* JADX INFO: renamed from: Q */
    public static void m18677Q(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        collection.addAll(iterable);
    }

    /* JADX INFO: renamed from: R */
    public static int m18678R(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    /* JADX INFO: renamed from: S */
    public static void m18679S(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, oni oniVar) throws IOException {
        charSequence2.getClass();
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            ook.m18797k(appendable, obj, oniVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ String m18680T(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, oni oniVar, int i) throws IOException {
        iterable.getClass();
        CharSequence charSequence4 = (i & 2) != 0 ? "" : charSequence2;
        charSequence4.getClass();
        CharSequence charSequence5 = (i & 4) != 0 ? "" : charSequence3;
        charSequence5.getClass();
        CharSequence charSequence6 = (i & 16) != 0 ? "..." : null;
        charSequence6.getClass();
        StringBuilder sb = new StringBuilder();
        oni oniVar2 = (i & 32) != 0 ? null : oniVar;
        int i2 = (i & 8) != 0 ? -1 : 0;
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        m18679S(iterable, sb, charSequence, charSequence4, charSequence5, i2, charSequence6, oniVar2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: U */
    public static void m18681U(List list) {
        olc olcVar = (olc) list;
        if (olcVar.f46235e != null) {
            throw new IllegalStateException();
        }
        olcVar.m18616c();
        olcVar.f46234d = true;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m18682V(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, int i) throws IOException {
        if ((i & 4) != 0) {
            charSequence2 = "";
        }
        CharSequence charSequence3 = charSequence2;
        if ((i & 2) != 0) {
            charSequence = ", ";
        }
        m18679S(iterable, appendable, charSequence, charSequence3, "", -1, "...", null);
    }

    /* JADX INFO: renamed from: W */
    public static List m18683W(Object[] objArr) {
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX INFO: renamed from: X */
    public static void m18684X(Object[] objArr, Object obj, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    /* JADX INFO: renamed from: Y */
    public static Object[] m18685Y(Object[] objArr, int i, int i2) {
        objArr.getClass();
        int length = objArr.length;
        if (i2 <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException(gBCSQzBeB.eKy + i2 + ") is greater than size (" + length + ").");
    }

    /* JADX INFO: renamed from: Z */
    public static int m18686Z(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    /* JADX INFO: renamed from: ab */
    public static List m18688ab(Object[] objArr) {
        return new ArrayList(new oks(objArr, false));
    }

    /* JADX INFO: renamed from: ac */
    public static Set m18689ac(Object[] objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(m18721z(objArr.length));
        m18697ak(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ad */
    public static boolean m18690ad(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ae */
    public static void m18691ae(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: af */
    public static void m18692af(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: ag */
    public static void m18693ag(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: aj */
    public static /* synthetic */ void m18696aj(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        int i5 = i4 & 4;
        int i6 = i4 & 2;
        if (i5 != 0) {
            i2 = 0;
        }
        if (i6 != 0) {
            i = 0;
        }
        m18693ag(objArr, objArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ak */
    public static void m18697ak(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Double m18698c(double d) {
        return new Double(d);
    }

    /* JADX INFO: renamed from: d */
    public static Long m18699d(long j) {
        return new Long(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static ols m18700e(onm onmVar, Object obj, ols olsVar) {
        if (onmVar instanceof omd) {
            return ((omd) onmVar).mo562c(obj, olsVar);
        }
        oly olyVarMo18639d = olsVar.mo18639d();
        return olyVarMo18639d == olz.f46282a ? new omb(olsVar, onmVar, obj) : new omc(olsVar, olyVarMo18639d, onmVar, obj);
    }

    /* JADX INFO: renamed from: f */
    public static ols m18701f(ols olsVar) {
        olsVar.getClass();
        omf omfVar = olsVar instanceof omf ? (omf) olsVar : null;
        if (omfVar != null && (olsVar = omfVar.f46313n) == null) {
            olu oluVar = (olu) omfVar.mo18639d().get(olu.f46271a);
            olsVar = oluVar != null ? oluVar.mo18642cD(omfVar) : omfVar;
            omfVar.f46313n = olsVar;
        }
        return olsVar;
    }

    /* JADX INFO: renamed from: g */
    public static Object m18702g(olv olvVar, Object obj, onm onmVar) {
        onmVar.getClass();
        return onmVar.mo560a(obj, olvVar);
    }

    /* JADX INFO: renamed from: h */
    public static olv m18703h(olv olvVar, olw olwVar) {
        olwVar.getClass();
        if (!ooc.m18737c(olvVar.getKey(), olwVar)) {
            return null;
        }
        olvVar.getClass();
        return olvVar;
    }

    /* JADX INFO: renamed from: i */
    public static oly m18704i(olv olvVar, olw olwVar) {
        olwVar.getClass();
        return ooc.m18737c(olvVar.getKey(), olwVar) ? olz.f46282a : olvVar;
    }

    /* JADX INFO: renamed from: j */
    public static oly m18705j(olv olvVar, oly olyVar) {
        olyVar.getClass();
        return m18710o(olvVar, olyVar);
    }

    /* JADX INFO: renamed from: k */
    public static Class m18706k(oov oovVar) {
        String name;
        oovVar.getClass();
        Class clsMo18730a = ((onx) oovVar).mo18730a();
        if (!clsMo18730a.isPrimitive() || (name = clsMo18730a.getName()) == null) {
            return clsMo18730a;
        }
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : clsMo18730a;
            case 104431:
                return name.equals("int") ? Integer.class : clsMo18730a;
            case 3039496:
                return name.equals(BcwGDRhrTsnlj.bBJEfvGbhXE) ? Byte.class : clsMo18730a;
            case 3052374:
                return name.equals("char") ? Character.class : clsMo18730a;
            case 3327612:
                return name.equals("long") ? Long.class : clsMo18730a;
            case 3625364:
                return name.equals("void") ? Void.class : clsMo18730a;
            case 64711720:
                return name.equals(TVkaNXnfP.xdMnfmFKhbvh) ? Boolean.class : clsMo18730a;
            case 97526364:
                return name.equals("float") ? Float.class : clsMo18730a;
            case 109413500:
                return name.equals("short") ? Short.class : clsMo18730a;
            default:
                return clsMo18730a;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m18707l(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                lkm.m15595v(th, th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX INFO: renamed from: m */
    public static File m18708m(File file, String str) {
        int length;
        String string;
        File file2;
        int iM18807u;
        File file3 = new File(str);
        String path = file3.getPath();
        path.getClass();
        int iM18807u2 = ook.m18807u(path, File.separatorChar, 0, 4);
        if (iM18807u2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != File.separatorChar || (iM18807u = ook.m18807u(path, File.separatorChar, 2, 4)) < 0) {
                return file3;
            }
            int iM18807u3 = ook.m18807u(path, File.separatorChar, iM18807u + 1, 4);
            length = iM18807u3 >= 0 ? iM18807u3 + 1 : path.length();
        } else {
            if (iM18807u2 <= 0 || path.charAt(iM18807u2 - 1) != ':') {
                if (iM18807u2 == -1 && ook.m18805s(path, ':')) {
                    length = path.length();
                }
                string = file.toString();
                string.getClass();
                if (string.length() == 0 && !ook.m18805s(string, File.separatorChar)) {
                    file2 = new File(string + File.separatorChar + file3);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(file3);
                    file2 = new File(string.concat(file3.toString()));
                }
                return file2;
            }
            length = iM18807u2 + 1;
        }
        if (length > 0) {
            return file3;
        }
        string = file.toString();
        string.getClass();
        if (string.length() == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(file3);
            file2 = new File(string.concat(file3.toString()));
        } else {
            file2 = new File(string + File.separatorChar + file3);
        }
        return file2;
    }

    /* JADX INFO: renamed from: n */
    public static void m18709n(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                lkm.m15595v(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static oly m18710o(oly olyVar, oly olyVar2) {
        olyVar2.getClass();
        return olyVar2 == olz.f46282a ? olyVar : (oly) olyVar2.fold(olyVar, olx.f46272a);
    }

    /* JADX INFO: renamed from: p */
    public static int m18711p(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: q */
    public static int m18712q(int i) {
        return Integer.highestOneBit(ook.m18789c(i, 1) * 3);
    }

    /* JADX INFO: renamed from: r */
    public static int m18713r(int i) {
        return Integer.numberOfLeadingZeros(i) + 1;
    }

    /* JADX INFO: renamed from: s */
    public static void m18714s(Object[] objArr, int i) {
        objArr.getClass();
        objArr[i] = null;
    }

    /* JADX INFO: renamed from: t */
    public static void m18715t(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            m18714s(objArr, i);
            i++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static Object[] m18716u(Object[] objArr, int i) {
        objArr.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: v */
    public static Set m18717v() {
        return new olm(new olh());
    }

    /* JADX INFO: renamed from: w */
    public static Set m18718w(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static Set m18719x(Set set, Iterable iterable) {
        if (iterable.isEmpty()) {
            return m18675O(set);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (!iterable.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: y */
    public static void m18720y(Set set) {
        ((olm) set).f46260a.m18633k();
    }

    /* JADX INFO: renamed from: z */
    public static int m18721z(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i / 0.75f) + 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public ooq mo18722a() {
        return new oon();
    }

    /* JADX INFO: renamed from: b */
    public void mo18723b(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Method method = omm.f46317a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* JADX INFO: renamed from: aa */
    public static List m18687aa(Object[] objArr) {
        switch (objArr.length) {
            case 0:
                return okv.f46215a;
            case 1:
                return m18666F(objArr[0]);
            default:
                return m18688ab(objArr);
        }
    }
}
