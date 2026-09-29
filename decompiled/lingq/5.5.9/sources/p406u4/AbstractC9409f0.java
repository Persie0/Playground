package p406u4;

import ae.C0062b;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v4.media.AbstractC0140a;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import p003a2.C0009a;
import p028b7.AbstractC1324b;
import p286o2.C7911k;
import p326q.C8446b;
import p326q.C8449e;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: u4.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9409f0 implements Cloneable {

    /* JADX INFO: renamed from: V */
    public static final int[] f48274V = {2, 1, 3, 4};

    /* JADX INFO: renamed from: W */
    public static final a f48275W = new a();

    /* JADX INFO: renamed from: X */
    public static final ThreadLocal<C8446b<Animator, b>> f48276X = new ThreadLocal<>();

    /* JADX INFO: renamed from: H */
    public C9427o0 f48277H;

    /* JADX INFO: renamed from: I */
    public C9421l0 f48278I;

    /* JADX INFO: renamed from: J */
    public int[] f48279J;

    /* JADX INFO: renamed from: K */
    public ArrayList<C9425n0> f48280K;

    /* JADX INFO: renamed from: L */
    public ArrayList<C9425n0> f48281L;

    /* JADX INFO: renamed from: M */
    public final ArrayList<Animator> f48282M;

    /* JADX INFO: renamed from: N */
    public int f48283N;

    /* JADX INFO: renamed from: O */
    public boolean f48284O;

    /* JADX INFO: renamed from: P */
    public boolean f48285P;

    /* JADX INFO: renamed from: Q */
    public ArrayList<e> f48286Q;

    /* JADX INFO: renamed from: R */
    public ArrayList<Animator> f48287R;

    /* JADX INFO: renamed from: S */
    public AbstractC0140a f48288S;

    /* JADX INFO: renamed from: T */
    public d f48289T;

    /* JADX INFO: renamed from: U */
    public AbstractC9446y f48290U;

    /* JADX INFO: renamed from: a */
    public final String f48291a;

    /* JADX INFO: renamed from: b */
    public long f48292b;

    /* JADX INFO: renamed from: c */
    public long f48293c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f48294d;

    /* JADX INFO: renamed from: e */
    public final ArrayList<Integer> f48295e;

    /* JADX INFO: renamed from: f */
    public final ArrayList<View> f48296f;

    /* JADX INFO: renamed from: g */
    public ArrayList<String> f48297g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Class<?>> f48298h;

    /* JADX INFO: renamed from: i */
    public ArrayList<Integer> f48299i;

    /* JADX INFO: renamed from: j */
    public ArrayList<Class<?>> f48300j;

    /* JADX INFO: renamed from: k */
    public ArrayList<String> f48301k;

    /* JADX INFO: renamed from: l */
    public C9427o0 f48302l;

    /* JADX INFO: renamed from: u4.f0$a */
    public class a extends AbstractC9446y {
        @Override // p406u4.AbstractC9446y
        /* JADX INFO: renamed from: a */
        public final Path mo17757a(float f3, float f10, float f11, float f12) {
            Path path = new Path();
            path.moveTo(f3, f10);
            path.lineTo(f11, f12);
            return path;
        }
    }

    /* JADX INFO: renamed from: u4.f0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final View f48303a;

        /* JADX INFO: renamed from: b */
        public final String f48304b;

        /* JADX INFO: renamed from: c */
        public final C9425n0 f48305c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC9399a1 f48306d;

        /* JADX INFO: renamed from: e */
        public final AbstractC9409f0 f48307e;

        public b(View view, String str, AbstractC9409f0 abstractC9409f0, C9449z0 c9449z0, C9425n0 c9425n0) {
            this.f48303a = view;
            this.f48304b = str;
            this.f48305c = c9425n0;
            this.f48306d = c9449z0;
            this.f48307e = abstractC9409f0;
        }
    }

    /* JADX INFO: renamed from: u4.f0$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static ArrayList m17808a(Object obj, ArrayList arrayList) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: u4.f0$d */
    public static abstract class d {
        /* JADX INFO: renamed from: a */
        public abstract Rect mo17809a();
    }

    /* JADX INFO: renamed from: u4.f0$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo17765a();

        /* JADX INFO: renamed from: b */
        void mo17810b(AbstractC9409f0 abstractC9409f0);

        /* JADX INFO: renamed from: c */
        void mo17766c();

        /* JADX INFO: renamed from: d */
        void mo17767d();

        /* JADX INFO: renamed from: e */
        void mo17768e(AbstractC9409f0 abstractC9409f0);
    }

    public AbstractC9409f0() {
        this.f48291a = getClass().getName();
        this.f48292b = -1L;
        this.f48293c = -1L;
        this.f48294d = null;
        this.f48295e = new ArrayList<>();
        this.f48296f = new ArrayList<>();
        this.f48297g = null;
        this.f48298h = null;
        this.f48299i = null;
        this.f48300j = null;
        this.f48301k = null;
        this.f48302l = new C9427o0();
        this.f48277H = new C9427o0();
        this.f48278I = null;
        this.f48279J = f48274V;
        this.f48282M = new ArrayList<>();
        this.f48283N = 0;
        this.f48284O = false;
        this.f48285P = false;
        this.f48286Q = null;
        this.f48287R = new ArrayList<>();
        this.f48290U = f48275W;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @SuppressLint({"RestrictedApi"})
    public AbstractC9409f0(Context context, AttributeSet attributeSet) {
        boolean z10;
        this.f48291a = getClass().getName();
        this.f48292b = -1L;
        this.f48293c = -1L;
        this.f48294d = null;
        this.f48295e = new ArrayList<>();
        this.f48296f = new ArrayList<>();
        this.f48297g = null;
        this.f48298h = null;
        this.f48299i = null;
        this.f48300j = null;
        this.f48301k = null;
        this.f48302l = new C9427o0();
        this.f48277H = new C9427o0();
        this.f48278I = null;
        int[] iArr = f48274V;
        this.f48279J = iArr;
        this.f48282M = new ArrayList<>();
        this.f48283N = 0;
        this.f48284O = false;
        this.f48285P = false;
        this.f48286Q = null;
        this.f48287R = new ArrayList<>();
        this.f48290U = f48275W;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9407e0.f48261b);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM15688f = C7911k.m15688f(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jM15688f >= 0) {
            mo17783J(jM15688f);
        }
        long jM15688f2 = C7911k.m15688f(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jM15688f2 > 0) {
            mo17788O(jM15688f2);
        }
        int iM15689g = C7911k.m15689g(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0);
        if (iM15689g > 0) {
            mo17785L(AnimationUtils.loadInterpolator(context, iM15689g));
        }
        String strM15690h = C7911k.m15690h(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM15690h != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strM15690h, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i10 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr2[i10] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr2[i10] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr2[i10] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr2[i10] = 4;
                } else {
                    if (!strTrim.isEmpty()) {
                        throw new InflateException(C0141b.m611g("Unknown match type in matchOrder: '", strTrim, "'"));
                    }
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i10);
                    i10--;
                    iArr2 = iArr3;
                }
                i10++;
            }
            if (iArr2.length == 0) {
                this.f48279J = iArr;
            } else {
                for (int i11 = 0; i11 < iArr2.length; i11++) {
                    int i12 = iArr2[i11];
                    if (!(i12 >= 1 && i12 <= 4)) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i11) {
                            z10 = false;
                            break;
                        } else {
                            if (iArr2[i13] == i12) {
                                z10 = true;
                                break;
                            }
                            i13++;
                        }
                    }
                    if (z10) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                }
                this.f48279J = (int[]) iArr2.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: D */
    public static boolean m17773D(C9425n0 c9425n0, C9425n0 c9425n1, String str) {
        Object obj = c9425n0.f48372a.get(str);
        Object obj2 = c9425n1.f48372a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static void m17774g(C9427o0 c9427o0, View view, C9425n0 c9425n0) {
        ((C8446b) c9427o0.f48376a).put(view, c9425n0);
        int id2 = view.getId();
        if (id2 >= 0) {
            SparseArray sparseArray = (SparseArray) c9427o0.f48378c;
            if (sparseArray.indexOfKey(id2) >= 0) {
                sparseArray.put(id2, null);
            } else {
                sparseArray.put(id2, view);
            }
        }
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        String strM18717k = C10029b0.i.m18717k(view);
        if (strM18717k != null) {
            C8446b c8446b = (C8446b) c9427o0.f48377b;
            if (c8446b.containsKey(strM18717k)) {
                c8446b.put(strM18717k, null);
            } else {
                c8446b.put(strM18717k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C8449e c8449e = (C8449e) c9427o0.f48379d;
                if (c8449e.f45589a) {
                    c8449e.m16509d();
                }
                if (C0062b.m324Y(c8449e.f45590b, c8449e.f45592d, itemIdAtPosition) >= 0) {
                    View view2 = (View) c8449e.m16510e(itemIdAtPosition, null);
                    if (view2 != null) {
                        C10029b0.d.m18681r(view2, false);
                        c8449e.m16512g(itemIdAtPosition, null);
                    }
                } else {
                    C10029b0.d.m18681r(view, true);
                    c8449e.m16512g(itemIdAtPosition, view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static C8446b<Animator, b> m17775x() {
        ThreadLocal<C8446b<Animator, b>> threadLocal = f48276X;
        C8446b<Animator, b> c8446b = threadLocal.get();
        if (c8446b == null) {
            c8446b = new C8446b<>();
            threadLocal.set(c8446b);
        }
        return c8446b;
    }

    /* JADX INFO: renamed from: A */
    public boolean mo17776A(C9425n0 c9425n0, C9425n0 c9425n1) {
        boolean z10 = false;
        if (c9425n0 != null && c9425n1 != null) {
            String[] strArrMo17764y = mo17764y();
            if (strArrMo17764y == null) {
                Iterator it = c9425n0.f48372a.keySet().iterator();
                while (it.hasNext()) {
                    if (m17773D(c9425n0, c9425n1, (String) it.next())) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                for (String str : strArrMo17764y) {
                    if (m17773D(c9425n0, c9425n1, str)) {
                        z10 = true;
                        break;
                    }
                }
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m17777B(View view) {
        ArrayList<Class<?>> arrayList;
        int id2 = view.getId();
        ArrayList<Integer> arrayList2 = this.f48299i;
        if (arrayList2 != null && arrayList2.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<Class<?>> arrayList3 = this.f48300j;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f48300j.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f48301k != null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.i.m18717k(view) != null && this.f48301k.contains(C10029b0.i.m18717k(view))) {
                return false;
            }
        }
        ArrayList<Integer> arrayList4 = this.f48295e;
        int size2 = arrayList4.size();
        ArrayList<View> arrayList5 = this.f48296f;
        if (size2 == 0 && arrayList5.size() == 0 && ((arrayList = this.f48298h) == null || arrayList.isEmpty())) {
            ArrayList<String> arrayList6 = this.f48297g;
            if (arrayList6 == null || arrayList6.isEmpty()) {
                return true;
            }
        }
        if (arrayList4.contains(Integer.valueOf(id2)) || arrayList5.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList7 = this.f48297g;
        if (arrayList7 != null) {
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            if (arrayList7.contains(C10029b0.i.m18717k(view))) {
                return true;
            }
        }
        if (this.f48298h != null) {
            for (int i11 = 0; i11 < this.f48298h.size(); i11++) {
                if (this.f48298h.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public void mo17778E(View view) {
        if (!this.f48285P) {
            ArrayList<Animator> arrayList = this.f48282M;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).pause();
            }
            ArrayList<e> arrayList2 = this.f48286Q;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = (ArrayList) this.f48286Q.clone();
                int size2 = arrayList3.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((e) arrayList3.get(i10)).mo17765a();
                }
            }
            this.f48284O = true;
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo17779F(e eVar) {
        ArrayList<e> arrayList = this.f48286Q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(eVar);
        if (this.f48286Q.size() == 0) {
            this.f48286Q = null;
        }
    }

    /* JADX INFO: renamed from: G */
    public void mo17780G(View view) {
        this.f48296f.remove(view);
    }

    /* JADX INFO: renamed from: H */
    public void mo17781H(ViewGroup viewGroup) {
        if (this.f48284O) {
            if (!this.f48285P) {
                ArrayList<Animator> arrayList = this.f48282M;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        arrayList.get(size).resume();
                    }
                }
                ArrayList<e> arrayList2 = this.f48286Q;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.f48286Q.clone();
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((e) arrayList3.get(i10)).mo17767d();
                    }
                }
            }
            this.f48284O = false;
        }
    }

    /* JADX INFO: renamed from: I */
    public void mo17782I() {
        m17789P();
        C8446b<Animator, b> c8446bM17775x = m17775x();
        for (Animator animator : this.f48287R) {
            if (c8446bM17775x.containsKey(animator)) {
                m17789P();
                if (animator != null) {
                    animator.addListener(new C9411g0(this, c8446bM17775x));
                    long j10 = this.f48293c;
                    if (j10 >= 0) {
                        animator.setDuration(j10);
                    }
                    long j11 = this.f48292b;
                    if (j11 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f48294d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C9413h0(this));
                    animator.start();
                }
            }
        }
        this.f48287R.clear();
        m17802s();
    }

    /* JADX INFO: renamed from: J */
    public void mo17783J(long j10) {
        this.f48293c = j10;
    }

    /* JADX INFO: renamed from: K */
    public void mo17784K(d dVar) {
        this.f48289T = dVar;
    }

    /* JADX INFO: renamed from: L */
    public void mo17785L(TimeInterpolator timeInterpolator) {
        this.f48294d = timeInterpolator;
    }

    /* JADX INFO: renamed from: M */
    public void mo17786M(AbstractC9446y abstractC9446y) {
        if (abstractC9446y == null) {
            this.f48290U = f48275W;
        } else {
            this.f48290U = abstractC9446y;
        }
    }

    /* JADX INFO: renamed from: N */
    public void mo17787N(AbstractC0140a abstractC0140a) {
        this.f48288S = abstractC0140a;
    }

    /* JADX INFO: renamed from: O */
    public void mo17788O(long j10) {
        this.f48292b = j10;
    }

    /* JADX INFO: renamed from: P */
    public final void m17789P() {
        if (this.f48283N == 0) {
            ArrayList<e> arrayList = this.f48286Q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f48286Q.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((e) arrayList2.get(i10)).mo17810b(this);
                }
            }
            this.f48285P = false;
        }
        this.f48283N++;
    }

    /* JADX INFO: renamed from: R */
    public String mo17790R(String str) {
        StringBuilder sbM771r = C0166e.m771r(str);
        sbM771r.append(getClass().getSimpleName());
        sbM771r.append("@");
        sbM771r.append(Integer.toHexString(hashCode()));
        sbM771r.append(": ");
        String string = sbM771r.toString();
        if (this.f48293c != -1) {
            StringBuilder sbM26o = C0009a.m26o(string, "dur(");
            sbM26o.append(this.f48293c);
            sbM26o.append(") ");
            string = sbM26o.toString();
        }
        if (this.f48292b != -1) {
            StringBuilder sbM26o2 = C0009a.m26o(string, "dly(");
            sbM26o2.append(this.f48292b);
            sbM26o2.append(") ");
            string = sbM26o2.toString();
        }
        if (this.f48294d != null) {
            StringBuilder sbM26o3 = C0009a.m26o(string, "interp(");
            sbM26o3.append(this.f48294d);
            sbM26o3.append(") ");
            string = sbM26o3.toString();
        }
        ArrayList<Integer> arrayList = this.f48295e;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f48296f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strM765k = C0166e.m765k(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 > 0) {
                    strM765k = C0166e.m765k(strM765k, ", ");
                }
                StringBuilder sbM771r2 = C0166e.m771r(strM765k);
                sbM771r2.append(arrayList.get(i10));
                strM765k = sbM771r2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (i11 > 0) {
                    strM765k = C0166e.m765k(strM765k, ", ");
                }
                StringBuilder sbM771r3 = C0166e.m771r(strM765k);
                sbM771r3.append(arrayList2.get(i11));
                strM765k = sbM771r3.toString();
            }
        }
        return C0166e.m765k(strM765k, ")");
    }

    /* JADX INFO: renamed from: b */
    public void mo17791b(e eVar) {
        if (this.f48286Q == null) {
            this.f48286Q = new ArrayList<>();
        }
        this.f48286Q.add(eVar);
    }

    /* JADX INFO: renamed from: c */
    public void mo17792c(int i10) {
        if (i10 != 0) {
            this.f48295e.add(Integer.valueOf(i10));
        }
    }

    public void cancel() {
        ArrayList<Animator> arrayList = this.f48282M;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                arrayList.get(size).cancel();
            }
        }
        ArrayList<e> arrayList2 = this.f48286Q;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.f48286Q.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((e) arrayList3.get(i10)).mo17766c();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo17793d(View view) {
        this.f48296f.add(view);
    }

    /* JADX INFO: renamed from: e */
    public void mo17794e(Class cls) {
        if (this.f48298h == null) {
            this.f48298h = new ArrayList<>();
        }
        this.f48298h.add(cls);
    }

    /* JADX INFO: renamed from: f */
    public void mo17795f(String str) {
        if (this.f48297g == null) {
            this.f48297g = new ArrayList<>();
        }
        this.f48297g.add(str);
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo17761h(C9425n0 c9425n0);

    /* JADX INFO: renamed from: i */
    public final void m17796i(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f48299i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<Class<?>> arrayList2 = this.f48300j;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f48300j.get(i10).isInstance(view)) {
                        return;
                    }
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                C9425n0 c9425n0 = new C9425n0(view);
                if (z10) {
                    mo17762k(c9425n0);
                } else {
                    mo17761h(c9425n0);
                }
                c9425n0.f48374c.add(this);
                mo17797j(c9425n0);
                if (z10) {
                    m17774g(this.f48302l, view, c9425n0);
                } else {
                    m17774g(this.f48277H, view, c9425n0);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    m17796i(viewGroup.getChildAt(i11), z10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo17797j(C9425n0 c9425n0) {
        if (this.f48288S != null) {
            HashMap map = c9425n0.f48372a;
            if (!map.isEmpty()) {
                this.f48288S.mo574L();
                String[] strArr = AbstractC1324b.f8082a;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 >= 2) {
                        z10 = true;
                        break;
                    } else if (!map.containsKey(strArr[i10])) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (!z10) {
                    this.f48288S.mo600j(c9425n0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo17762k(C9425n0 c9425n0);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.isEmpty() == false) goto L16;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m17798m(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        m17799n(z10);
        ArrayList<Integer> arrayList2 = this.f48295e;
        int size = arrayList2.size();
        ArrayList<View> arrayList3 = this.f48296f;
        if ((size > 0 || arrayList3.size() > 0) && ((arrayList = this.f48297g) == null || arrayList.isEmpty())) {
            ArrayList<Class<?>> arrayList4 = this.f48298h;
            if (arrayList4 == null) {
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(arrayList2.get(i10).intValue());
                if (viewFindViewById != null) {
                    C9425n0 c9425n0 = new C9425n0(viewFindViewById);
                    if (z10) {
                        mo17762k(c9425n0);
                    } else {
                        mo17761h(c9425n0);
                    }
                    c9425n0.f48374c.add(this);
                    mo17797j(c9425n0);
                    if (z10) {
                        m17774g(this.f48302l, viewFindViewById, c9425n0);
                    } else {
                        m17774g(this.f48277H, viewFindViewById, c9425n0);
                    }
                }
            }
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                View view = arrayList3.get(i11);
                C9425n0 c9425n1 = new C9425n0(view);
                if (z10) {
                    mo17762k(c9425n1);
                } else {
                    mo17761h(c9425n1);
                }
                c9425n1.f48374c.add(this);
                mo17797j(c9425n1);
                if (z10) {
                    m17774g(this.f48302l, view, c9425n1);
                } else {
                    m17774g(this.f48277H, view, c9425n1);
                }
            }
            return;
        }
        m17796i(viewGroup, z10);
    }

    /* JADX INFO: renamed from: n */
    public final void m17799n(boolean z10) {
        if (z10) {
            ((C8446b) this.f48302l.f48376a).clear();
            ((SparseArray) this.f48302l.f48378c).clear();
            ((C8449e) this.f48302l.f48379d).m16507b();
        } else {
            ((C8446b) this.f48277H.f48376a).clear();
            ((SparseArray) this.f48277H.f48378c).clear();
            ((C8449e) this.f48277H.f48379d).m16507b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC9409f0 clone() {
        try {
            AbstractC9409f0 abstractC9409f0 = (AbstractC9409f0) super.clone();
            abstractC9409f0.f48287R = new ArrayList<>();
            abstractC9409f0.f48302l = new C9427o0();
            abstractC9409f0.f48277H = new C9427o0();
            abstractC9409f0.f48280K = null;
            abstractC9409f0.f48281L = null;
            return abstractC9409f0;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public Animator mo17763p(ViewGroup viewGroup, C9425n0 c9425n0, C9425n0 c9425n1) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public void mo17801r(ViewGroup viewGroup, C9427o0 c9427o0, C9427o0 c9427o1, ArrayList<C9425n0> arrayList, ArrayList<C9425n0> arrayList2) {
        Animator animatorMo17763p;
        int i10;
        View view;
        Animator animator;
        C9425n0 c9425n0;
        Animator animator2;
        C9425n0 c9425n1;
        C8446b<Animator, b> c8446bM17775x = m17775x();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            C9425n0 c9425n2 = arrayList.get(i11);
            C9425n0 c9425n3 = arrayList2.get(i11);
            if (c9425n2 != null && !c9425n2.f48374c.contains(this)) {
                c9425n2 = null;
            }
            if (c9425n3 != null && !c9425n3.f48374c.contains(this)) {
                c9425n3 = null;
            }
            if (c9425n2 == null && c9425n3 == null) {
                i10 = size;
            } else if (!(c9425n2 == null || c9425n3 == null || mo17776A(c9425n2, c9425n3)) || (animatorMo17763p = mo17763p(viewGroup, c9425n2, c9425n3)) == null) {
                i10 = size;
            } else {
                if (c9425n3 != null) {
                    String[] strArrMo17764y = mo17764y();
                    view = c9425n3.f48373b;
                    if (strArrMo17764y != null && strArrMo17764y.length > 0) {
                        C9425n0 c9425n4 = new C9425n0(view);
                        i10 = size;
                        C9425n0 c9425n5 = (C9425n0) ((C8446b) c9427o1.f48376a).getOrDefault(view, null);
                        if (c9425n5 != null) {
                            int i12 = 0;
                            while (i12 < strArrMo17764y.length) {
                                HashMap map = c9425n4.f48372a;
                                String str = strArrMo17764y[i12];
                                map.put(str, c9425n5.f48372a.get(str));
                                i12++;
                                strArrMo17764y = strArrMo17764y;
                            }
                        }
                        int i13 = c8446bM17775x.f45619c;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= i13) {
                                c9425n1 = c9425n4;
                                animator2 = animatorMo17763p;
                                break;
                            }
                            b orDefault = c8446bM17775x.getOrDefault(c8446bM17775x.m16529h(i14), null);
                            if (orDefault.f48305c != null && orDefault.f48303a == view && orDefault.f48304b.equals(this.f48291a) && orDefault.f48305c.equals(c9425n4)) {
                                c9425n1 = c9425n4;
                                animator2 = null;
                                break;
                            }
                            i14++;
                        }
                    } else {
                        i10 = size;
                        animator2 = animatorMo17763p;
                        c9425n1 = null;
                    }
                    animator = animator2;
                    c9425n0 = c9425n1;
                } else {
                    i10 = size;
                    view = c9425n2.f48373b;
                    animator = animatorMo17763p;
                    c9425n0 = null;
                }
                if (animator != null) {
                    AbstractC0140a abstractC0140a = this.f48288S;
                    if (abstractC0140a != null) {
                        long jMo579Q = abstractC0140a.mo579Q(viewGroup, this, c9425n2, c9425n3);
                        sparseIntArray.put(this.f48287R.size(), (int) jMo579Q);
                        jMin = Math.min(jMo579Q, jMin);
                    }
                    long j10 = jMin;
                    String str2 = this.f48291a;
                    C9441v0 c9441v0 = C9433r0.f48403a;
                    c8446bM17775x.put(animator, new b(view, str2, this, new C9449z0(viewGroup), c9425n0));
                    this.f48287R.add(animator);
                    jMin = j10;
                }
            }
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                Animator animator3 = this.f48287R.get(sparseIntArray.keyAt(i15));
                animator3.setStartDelay(animator3.getStartDelay() + (((long) sparseIntArray.valueAt(i15)) - jMin));
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m17802s() {
        int i10 = this.f48283N - 1;
        this.f48283N = i10;
        if (i10 == 0) {
            ArrayList<e> arrayList = this.f48286Q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f48286Q.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((e) arrayList2.get(i11)).mo17768e(this);
                }
            }
            for (int i12 = 0; i12 < ((C8449e) this.f48302l.f48379d).m16514i(); i12++) {
                View view = (View) ((C8449e) this.f48302l.f48379d).m16515j(i12);
                if (view != null) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    C10029b0.d.m18681r(view, false);
                }
            }
            for (int i13 = 0; i13 < ((C8449e) this.f48277H.f48379d).m16514i(); i13++) {
                View view2 = (View) ((C8449e) this.f48277H.f48379d).m16515j(i13);
                if (view2 != null) {
                    WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                    C10029b0.d.m18681r(view2, false);
                }
            }
            this.f48285P = true;
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo17803t(int i10) {
        ArrayList<Integer> arrayListM17808a = this.f48299i;
        if (i10 > 0) {
            arrayListM17808a = c.m17808a(Integer.valueOf(i10), arrayListM17808a);
        }
        this.f48299i = arrayListM17808a;
    }

    public final String toString() {
        return mo17790R("");
    }

    /* JADX INFO: renamed from: u */
    public void mo17804u(Class cls) {
        this.f48300j = c.m17808a(cls, this.f48300j);
    }

    /* JADX INFO: renamed from: v */
    public void mo17805v(String str) {
        this.f48301k = c.m17808a(str, this.f48301k);
    }

    /* JADX INFO: renamed from: w */
    public final C9425n0 m17806w(View view, boolean z10) {
        C9421l0 c9421l0 = this.f48278I;
        if (c9421l0 != null) {
            return c9421l0.m17806w(view, z10);
        }
        ArrayList<C9425n0> arrayList = z10 ? this.f48280K : this.f48281L;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            C9425n0 c9425n0 = arrayList.get(i10);
            if (c9425n0 == null) {
                return null;
            }
            if (c9425n0.f48373b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f48281L : this.f48280K).get(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public String[] mo17764y() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public final C9425n0 m17807z(View view, boolean z10) {
        C9421l0 c9421l0 = this.f48278I;
        if (c9421l0 != null) {
            return c9421l0.m17807z(view, z10);
        }
        return (C9425n0) ((C8446b) (z10 ? this.f48302l : this.f48277H).f48376a).getOrDefault(view, null);
    }
}
