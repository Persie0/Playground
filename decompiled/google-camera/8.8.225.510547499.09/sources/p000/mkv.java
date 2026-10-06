package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.tabs.TabLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mkv {
    /* JADX INFO: renamed from: A */
    public static HashMap m16493A(int i) {
        return new HashMap(m16557v(i));
    }

    /* JADX INFO: renamed from: B */
    public static Iterator m16494B(Iterator it) {
        return new myn(it);
    }

    /* JADX INFO: renamed from: C */
    public static Iterator m16495C(Iterator it) {
        return new myo(it);
    }

    /* JADX INFO: renamed from: D */
    public static Map.Entry m16496D(Object obj, Object obj2) {
        return new mwk(obj, obj2);
    }

    /* JADX INFO: renamed from: E */
    public static Map.Entry m16497E(Map.Entry entry) {
        entry.getClass();
        return new myp(entry);
    }

    /* JADX INFO: renamed from: F */
    public static ArrayList m16498F() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: G */
    public static ArrayList m16499G(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? new ArrayList((Collection) iterable) : m16500H(iterable.iterator());
    }

    /* JADX INFO: renamed from: H */
    public static ArrayList m16500H(Iterator it) {
        ArrayList arrayListM16498F = m16498F();
        m16512T(arrayListM16498F, it);
        return arrayListM16498F;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: I */
    public static ArrayList m16501I(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        lku.m15655i(length, "arraySize");
        ArrayList arrayList = new ArrayList(kxk.m14984ab(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public static ArrayList m16502J(int i) {
        lku.m15655i(i, "initialArraySize");
        return new ArrayList(i);
    }

    /* JADX INFO: renamed from: K */
    public static List m16503K(List list) {
        if (list instanceof mws) {
            return ((mws) list).mo17088a();
        }
        if (list instanceof myi) {
            return ((myi) list).f41811a;
        }
        return list instanceof RandomAccess ? new myg(list) : new myi(list);
    }

    /* JADX INFO: renamed from: L */
    public static List m16504L(List list, mrf mrfVar) {
        return list instanceof RandomAccess ? new myk(list, mrfVar) : new mym(list, mrfVar);
    }

    /* JADX INFO: renamed from: M */
    public static boolean m16505M(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!mpw.m16768g(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (it2.hasNext() && mpw.m16768g(it.next(), it2.next())) {
            }
        }
        return !it2.hasNext();
    }

    /* JADX INFO: renamed from: N */
    public static int m16506N(Iterator it, int i) {
        it.getClass();
        int i2 = 0;
        lku.m15670x(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: O */
    public static naz m16507O(Iterator it) {
        it.getClass();
        return it instanceof naz ? (naz) it : new mxz(it);
    }

    /* JADX INFO: renamed from: P */
    public static Object m16508P(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: renamed from: Q */
    public static Object m16509Q(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    /* JADX INFO: renamed from: R */
    public static Iterator m16510R(Iterator it, mrf mrfVar) {
        mrfVar.getClass();
        return new mya(it, mrfVar);
    }

    /* JADX INFO: renamed from: S */
    public static void m16511S(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m16512T(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: U */
    public static Object m16513U(Iterable iterable, int i) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        Iterator it = iterable.iterator();
        int iM16506N = m16506N(it, i);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException("position (" + i + ") must be less than the number of elements that remained (" + iM16506N + ")");
    }

    /* JADX INFO: renamed from: V */
    public static Object m16514V(Iterable iterable, Object obj) {
        return m16509Q(iterable.iterator(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public static Object m16515W(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return m16508P(iterable.iterator());
        }
        if (iterable.isEmpty()) {
            throw new NoSuchElementException();
        }
        return m16534ap(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public static Object m16516X(Iterable iterable, Object obj) {
        if (iterable.isEmpty()) {
            return obj;
        }
        if (iterable instanceof List) {
            return m16534ap((List) iterable);
        }
        Iterator it = iterable.iterator();
        return it.hasNext() ? m16508P(it) : obj;
    }

    /* JADX INFO: renamed from: Y */
    public static Object m16517Y(Iterable iterable) {
        Iterator it = iterable.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m16518Z(Iterable iterable, mrp mrpVar) {
        Iterator it = iterable.iterator();
        mrpVar.getClass();
        int i = 0;
        while (it.hasNext()) {
            if (!mrpVar.mo8324a(it.next())) {
                i++;
            } else if (i != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: aa */
    public static Object[] m16519aa(Iterable iterable) {
        return m16535aq(iterable).toArray();
    }

    /* JADX INFO: renamed from: ab */
    public static Object[] m16520ab(Iterable iterable, Class cls) {
        return m16535aq(iterable).toArray((Object[]) Array.newInstance((Class<?>) cls, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ac */
    public static void m16521ac(Iterable iterable, mrp mrpVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            mrpVar.getClass();
            m16537as(iterable, mrpVar);
            return;
        }
        Iterator it = iterable.iterator();
        mrpVar.getClass();
        while (it.hasNext()) {
            if (mrpVar.mo8324a(it.next())) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ad */
    public static int m16522ad(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: ae */
    public static int m16523ae(Object obj) {
        return m16522ad(obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: af */
    public static int m16524af(int i) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= iHighestOneBit) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit + iHighestOneBit;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* JADX INFO: renamed from: ag */
    public static int m16525ag(int i, int i2) {
        return i & (i2 ^ (-1));
    }

    /* JADX INFO: renamed from: ah */
    public static int m16526ah(int i, int i2, int i3) {
        return (i & (i3 ^ (-1))) | (i2 & i3);
    }

    /* JADX INFO: renamed from: ai */
    public static int m16527ai(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX INFO: renamed from: aj */
    public static int m16528aj(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM16523ae = m16523ae(obj);
        int i2 = iM16523ae & i;
        int iM16529ak = m16529ak(obj3, i2);
        if (iM16529ak == 0) {
            return -1;
        }
        int iM16525ag = m16525ag(iM16523ae, i);
        int i3 = -1;
        while (true) {
            int i4 = iM16529ak - 1;
            int i5 = iArr[i4];
            if (m16525ag(i5, i) == iM16525ag && mpw.m16768g(obj, objArr[i4]) && (objArr2 == null || mpw.m16768g(obj2, objArr2[i4]))) {
                int i6 = i5 & i;
                if (i3 == -1) {
                    m16533ao(obj3, i2, i6);
                } else {
                    iArr[i3] = m16526ah(iArr[i3], i6, i);
                }
                return i4;
            }
            int i7 = i5 & i;
            if (i7 == 0) {
                return -1;
            }
            i3 = i4;
            iM16529ak = i7;
        }
    }

    /* JADX INFO: renamed from: ak */
    public static int m16529ak(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    /* JADX INFO: renamed from: al */
    public static int m16530al(int i) {
        return Math.max(4, m16524af(i + 1));
    }

    /* JADX INFO: renamed from: am */
    public static Object m16531am(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            return i <= 65536 ? new short[i] : new int[i];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    /* JADX INFO: renamed from: an */
    public static void m16532an(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: renamed from: ao */
    public static void m16533ao(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ap */
    private static Object m16534ap(List list) {
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: aq */
    private static Collection m16535aq(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : m16500H(iterable.iterator());
    }

    /* JADX INFO: renamed from: ar */
    private static void m16536ar(List list, mrp mrpVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (mrpVar.mo8324a(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    /* JADX INFO: renamed from: as */
    private static void m16537as(List list, mrp mrpVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!mrpVar.mo8324a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException e) {
                        m16536ar(list, mrpVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException e2) {
                        m16536ar(list, mrpVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m16538b(Configuration configuration, Typeface typeface) {
        if (configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, aax.m69d(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    /* JADX INFO: renamed from: c */
    public static int m16539c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m16540d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM171c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM171c = abx.m171c(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM171c;
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m16541e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM8752a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM8752a = C0194fs.m8752a(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM8752a;
    }

    /* JADX INFO: renamed from: f */
    public static RectF m16542f(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f8215v || !(view instanceof mmd)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        mmd mmdVar = (mmd) view;
        View[] viewArr = {mmdVar.f41022a, mmdVar.f41023b, null};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view2 = viewArr[i];
            if (view2 != null && view2.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view2.getLeft()) : view2.getLeft();
                iMax = z ? Math.max(iMax, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i2 = iMax - iMin;
        View[] viewArr2 = {mmdVar.f41022a, mmdVar.f41023b, null};
        int iMax2 = 0;
        int iMin2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view3 = viewArr2[i3];
            if (view3 != null && view3.getVisibility() == 0) {
                iMin2 = z2 ? Math.min(iMin2, view3.getTop()) : view3.getTop();
                iMax2 = z2 ? Math.max(iMax2, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i4 = iMax2 - iMin2;
        int iM15399G = (int) lij.m15399G(mmdVar.getContext(), 24);
        if (i2 < iM15399G) {
            i2 = iM15399G;
        }
        int left = mmdVar.getLeft() + mmdVar.getRight();
        int top = (mmdVar.getTop() + mmdVar.getBottom()) / 2;
        int i5 = left / 2;
        int i6 = i2 / 2;
        return new RectF(i5 - i6, top - (i4 / 2), i5 + i6, (i5 / 2) + top);
    }

    /* JADX INFO: renamed from: h */
    public static mkv m16543h() {
        return new mkv();
    }

    /* JADX INFO: renamed from: i */
    public static void m16544i(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof mkx) {
            ((mkx) background).m16578h(f);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m16545j(View view) {
        Drawable background = view.getBackground();
        if (background instanceof mkx) {
            m16546k(view, (mkx) background);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m16546k(View view, mkx mkxVar) {
        mhu mhuVar = mkxVar.f40893a.f40871b;
        if (mhuVar == null || !mhuVar.f40546a) {
            return;
        }
        float fM470a = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fM470a += afh.m470a((View) parent);
        }
        mkw mkwVar = mkxVar.f40893a;
        if (mkwVar.f40883n != fM470a) {
            mkwVar.f40883n = fM470a;
            mkxVar.m16583m();
        }
    }

    /* JADX INFO: renamed from: l */
    public static mkt m16547l(mkt mktVar, float f) {
        return mktVar instanceof mkz ? mktVar : new mks(f, mktVar);
    }

    /* JADX INFO: renamed from: m */
    public static mkv m16548m(int i) {
        switch (i) {
            case 0:
                return new mla();
            case 1:
                return new mku();
            default:
                return m16549n();
        }
    }

    /* JADX INFO: renamed from: n */
    public static mkv m16549n() {
        return new mla();
    }

    /* JADX INFO: renamed from: o */
    public static Object[] m16550o(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = mpw.m16759K(objArr, size);
        }
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: p */
    public static void m16551p(Object obj, int i) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("at index " + i);
    }

    /* JADX INFO: renamed from: q */
    public static void m16552q(Object... objArr) {
        m16553r(objArr, objArr.length);
    }

    /* JADX INFO: renamed from: r */
    public static void m16553r(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m16551p(objArr[i2], i2);
        }
    }

    /* JADX INFO: renamed from: s */
    public static myx m16554s(Object obj, int i) {
        return new mzd(obj, i);
    }

    /* JADX INFO: renamed from: t */
    public static naf m16555t(naf nafVar) {
        nafVar.getClass();
        return new nbb(nafVar);
    }

    /* JADX INFO: renamed from: u */
    public static Iterator m16556u(myy myyVar) {
        return new mze(myyVar, myyVar.mo16921g().iterator());
    }

    /* JADX INFO: renamed from: v */
    public static int m16557v(int i) {
        if (i < 3) {
            lku.m15655i(i, "expectedSize");
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        double d = i;
        Double.isNaN(d);
        return (int) Math.ceil(d / 0.75d);
    }

    /* JADX INFO: renamed from: w */
    public static mwx m16558w(Map map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return mzw.f41870a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum r1 = (Enum) entry.getKey();
        Object value = entry.getValue();
        lku.m15653g(r1, value);
        EnumMap enumMap = new EnumMap(r1.getDeclaringClass());
        enumMap.put(r1, value);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum r2 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            lku.m15653g(r2, value2);
            enumMap.put(r2, value2);
        }
        switch (enumMap.size()) {
            case 0:
                return mzw.f41870a;
            case 1:
                Map.Entry entry3 = (Map.Entry) m16517Y(enumMap.entrySet());
                return mwx.m17119n((Enum) entry3.getKey(), entry3.getValue());
            default:
                return new mwm(enumMap);
        }
    }

    /* JADX INFO: renamed from: x */
    public static mwx m16559x(Iterator it, mrf mrfVar, mwt mwtVar) {
        while (it.hasNext()) {
            Object next = it.next();
            mwtVar.mo17110e(mrfVar.apply(next), next);
        }
        try {
            return mwtVar.mo17059b();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    /* JADX INFO: renamed from: y */
    public static Object m16560y(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    /* JADX INFO: renamed from: z */
    public static Object m16561z(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo16492a(mlk mlkVar, float f, float f2) {
    }

    /* JADX INFO: renamed from: g */
    public void mo16562g(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFM16542f = m16542f(tabLayout, view);
        RectF rectFM16542f2 = m16542f(tabLayout, view2);
        drawable.setBounds(mfs.m16341b((int) rectFM16542f.left, (int) rectFM16542f2.left, f), drawable.getBounds().top, mfs.m16341b((int) rectFM16542f.right, (int) rectFM16542f2.right, f), drawable.getBounds().bottom);
    }
}
