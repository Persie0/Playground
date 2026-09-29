package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class daa implements Cloneable {

    /* JADX INFO: renamed from: a0 */
    public static final Animator[] f35306a0 = new Animator[0];

    /* JADX INFO: renamed from: b0 */
    public static final int[] f35307b0 = {2, 1, 3, 4};

    /* JADX INFO: renamed from: c0 */
    public static final q9a f35308c0 = new q9a();

    /* JADX INFO: renamed from: d0 */
    public static final ThreadLocal f35309d0 = new ThreadLocal();

    /* JADX INFO: renamed from: H */
    public ny8 f35310H;

    /* JADX INFO: renamed from: I */
    public raa f35311I;

    /* JADX INFO: renamed from: J */
    public final int[] f35312J;

    /* JADX INFO: renamed from: K */
    public ArrayList f35313K;

    /* JADX INFO: renamed from: L */
    public ArrayList f35314L;

    /* JADX INFO: renamed from: M */
    public caa[] f35315M;

    /* JADX INFO: renamed from: N */
    public final ArrayList f35316N;

    /* JADX INFO: renamed from: O */
    public Animator[] f35317O;

    /* JADX INFO: renamed from: P */
    public int f35318P;

    /* JADX INFO: renamed from: Q */
    public boolean f35319Q;

    /* JADX INFO: renamed from: R */
    public boolean f35320R;

    /* JADX INFO: renamed from: S */
    public daa f35321S;

    /* JADX INFO: renamed from: T */
    public ArrayList f35322T;

    /* JADX INFO: renamed from: U */
    public ArrayList f35323U;

    /* JADX INFO: renamed from: V */
    public qxc f35324V;

    /* JADX INFO: renamed from: W */
    public k57 f35325W;

    /* JADX INFO: renamed from: X */
    public long f35326X;

    /* JADX INFO: renamed from: Y */
    public y9a f35327Y;

    /* JADX INFO: renamed from: Z */
    public long f35328Z;

    /* JADX INFO: renamed from: a */
    public final String f35329a;

    /* JADX INFO: renamed from: b */
    public long f35330b;

    /* JADX INFO: renamed from: c */
    public long f35331c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f35332d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f35333e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f35334f;

    /* JADX INFO: renamed from: g */
    public ArrayList f35335g;

    /* JADX INFO: renamed from: h */
    public ArrayList f35336h;

    /* JADX INFO: renamed from: i */
    public ArrayList f35337i;

    /* JADX INFO: renamed from: j */
    public ArrayList f35338j;

    /* JADX INFO: renamed from: k */
    public ArrayList f35339k;

    /* JADX INFO: renamed from: l */
    public ny8 f35340l;

    public daa(Context context, AttributeSet attributeSet) {
        this.f35329a = getClass().getName();
        this.f35330b = -1L;
        this.f35331c = -1L;
        this.f35332d = null;
        this.f35333e = new ArrayList();
        this.f35334f = new ArrayList();
        this.f35335g = null;
        this.f35336h = null;
        this.f35337i = null;
        this.f35338j = null;
        this.f35339k = null;
        this.f35340l = new ny8(15);
        this.f35310H = new ny8(15);
        this.f35311I = null;
        int[] iArr = f35307b0;
        this.f35312J = iArr;
        this.f35316N = new ArrayList();
        this.f35317O = f35306a0;
        this.f35318P = 0;
        this.f35319Q = false;
        this.f35320R = false;
        this.f35321S = null;
        this.f35322T = null;
        this.f35323U = new ArrayList();
        this.f35325W = f35308c0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ywc.f70604b);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM17380d = nda.m17380d(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jM17380d >= 0) {
            mo10194O(jM17380d);
        }
        long j = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j > 0) {
            mo10199T(j);
        }
        int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            mo10196Q(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strM17381e = nda.m17381e(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM17381e != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strM17381e, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr2[i] = 4;
                } else {
                    if (!strTrim.isEmpty()) {
                        throw new InflateException(wq1.m24118n("Unknown match type in matchOrder: '", strTrim, "'"));
                    }
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i);
                    i--;
                    iArr2 = iArr3;
                }
                i++;
            }
            if (iArr2.length == 0) {
                this.f35312J = iArr;
            } else {
                for (int i2 = 0; i2 < iArr2.length; i2++) {
                    int i3 = iArr2[i2];
                    if (i3 < 1 || i3 > 4) {
                        C3386nv.m17626m("matches contains invalid value");
                        throw null;
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        if (iArr2[i4] == i3) {
                            C3386nv.m17626m("matches contains a duplicate value");
                            throw null;
                        }
                    }
                }
                this.f35312J = (int[]) iArr2.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: E */
    public static boolean m10180E(waa waaVar, waa waaVar2, String str) {
        Object obj = waaVar.f66570a.get(str);
        Object obj2 = waaVar2.f66570a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: f */
    public static void m10181f(ny8 ny8Var, View view, waa waaVar) {
        C3275kv c3275kv = (C3275kv) ny8Var.f53414b;
        C3275kv c3275kv2 = (C3275kv) ny8Var.f53417e;
        SparseArray sparseArray = (SparseArray) ny8Var.f53415c;
        tk5 tk5Var = (tk5) ny8Var.f53416d;
        c3275kv.put(view, waaVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = dta.f36217a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (c3275kv2.containsKey(transitionName)) {
                c3275kv2.put(transitionName, null);
            } else {
                c3275kv2.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tk5Var.m22177c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    tk5Var.m22180f(view, itemIdAtPosition);
                    return;
                }
                View view2 = (View) tk5Var.m22176b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    tk5Var.m22180f(null, itemIdAtPosition);
                }
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static C3275kv m10182x() {
        ThreadLocal threadLocal = f35309d0;
        C3275kv c3275kv = (C3275kv) threadLocal.get();
        if (c3275kv != null) {
            return c3275kv;
        }
        C3275kv c3275kv2 = new C3275kv(0);
        threadLocal.set(c3275kv2);
        return c3275kv2;
    }

    /* JADX INFO: renamed from: A */
    public boolean mo10183A() {
        return !this.f35316N.isEmpty();
    }

    /* JADX INFO: renamed from: B */
    public boolean mo3530B() {
        return this instanceof kt0;
    }

    /* JADX INFO: renamed from: C */
    public boolean mo10184C(waa waaVar, waa waaVar2) {
        if (waaVar != null && waaVar2 != null) {
            String[] strArrMo3045y = mo3045y();
            if (strArrMo3045y != null) {
                for (String str : strArrMo3045y) {
                    if (m10180E(waaVar, waaVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = waaVar.f66570a.keySet().iterator();
                while (it.hasNext()) {
                    if (m10180E(waaVar, waaVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0 A[LOOP:1: B:48:0x0099->B:53:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: D */
    public final boolean m10185D(View view) {
        int size;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int id = view.getId();
        ArrayList arrayList4 = this.f35337i;
        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
            ArrayList arrayList5 = this.f35338j;
            if (arrayList5 != null) {
                int size2 = arrayList5.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (!((Class) this.f35338j.get(i2)).isInstance(view)) {
                    }
                }
                if (this.f35339k != null) {
                    WeakHashMap weakHashMap = dta.f36217a;
                    if (view.getTransitionName() != null || !this.f35339k.contains(view.getTransitionName())) {
                        ArrayList arrayList6 = this.f35333e;
                        size = arrayList6.size();
                        ArrayList arrayList7 = this.f35334f;
                        if ((size != 0 && arrayList7.size() == 0 && (((arrayList2 = this.f35336h) == null || arrayList2.isEmpty()) && ((arrayList3 = this.f35335g) == null || arrayList3.isEmpty()))) || arrayList6.contains(Integer.valueOf(id)) || arrayList7.contains(view)) {
                            return true;
                        }
                        arrayList = this.f35335g;
                        if (arrayList != null) {
                            WeakHashMap weakHashMap2 = dta.f36217a;
                            if (arrayList.contains(view.getTransitionName())) {
                                return true;
                            }
                        }
                        if (this.f35336h != null) {
                            for (i = 0; i < this.f35336h.size(); i++) {
                                if (((Class) this.f35336h.get(i)).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayList8 = this.f35333e;
                    size = arrayList8.size();
                    ArrayList arrayList9 = this.f35334f;
                    if (size != 0) {
                    }
                    arrayList = this.f35335g;
                    if (arrayList != null) {
                        WeakHashMap weakHashMap3 = dta.f36217a;
                        if (arrayList.contains(view.getTransitionName())) {
                            return true;
                        }
                    }
                    if (this.f35336h != null) {
                        while (i < this.f35336h.size()) {
                            if (((Class) this.f35336h.get(i)).isInstance(view)) {
                                return true;
                            }
                        }
                    }
                }
            } else if (this.f35339k != null) {
                WeakHashMap weakHashMap4 = dta.f36217a;
                if (view.getTransitionName() != null) {
                    ArrayList arrayList10 = this.f35333e;
                    size = arrayList10.size();
                    ArrayList arrayList11 = this.f35334f;
                    if (size != 0) {
                    }
                    arrayList = this.f35335g;
                    if (arrayList != null) {
                        WeakHashMap weakHashMap5 = dta.f36217a;
                        if (arrayList.contains(view.getTransitionName())) {
                            return true;
                        }
                    }
                    if (this.f35336h != null) {
                        while (i < this.f35336h.size()) {
                            if (((Class) this.f35336h.get(i)).isInstance(view)) {
                                return true;
                            }
                        }
                    }
                } else {
                    ArrayList arrayList12 = this.f35333e;
                    size = arrayList12.size();
                    ArrayList arrayList13 = this.f35334f;
                    if (size != 0) {
                    }
                    arrayList = this.f35335g;
                    if (arrayList != null) {
                        WeakHashMap weakHashMap6 = dta.f36217a;
                        if (arrayList.contains(view.getTransitionName())) {
                            return true;
                        }
                    }
                    if (this.f35336h != null) {
                        while (i < this.f35336h.size()) {
                            if (((Class) this.f35336h.get(i)).isInstance(view)) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                ArrayList arrayList14 = this.f35333e;
                size = arrayList14.size();
                ArrayList arrayList15 = this.f35334f;
                if (size != 0) {
                }
                arrayList = this.f35335g;
                if (arrayList != null) {
                    WeakHashMap weakHashMap7 = dta.f36217a;
                    if (arrayList.contains(view.getTransitionName())) {
                        return true;
                    }
                }
                if (this.f35336h != null) {
                    while (i < this.f35336h.size()) {
                        if (((Class) this.f35336h.get(i)).isInstance(view)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public final void m10186F(daa daaVar, uk9 uk9Var, boolean z) {
        daa daaVar2 = this.f35321S;
        if (daaVar2 != null) {
            daaVar2.m10186F(daaVar, uk9Var, z);
        }
        ArrayList arrayList = this.f35322T;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f35322T.size();
        caa[] caaVarArr = this.f35315M;
        if (caaVarArr == null) {
            caaVarArr = new caa[size];
        }
        this.f35315M = null;
        caa[] caaVarArr2 = (caa[]) this.f35322T.toArray(caaVarArr);
        for (int i = 0; i < size; i++) {
            caa caaVar = caaVarArr2[i];
            switch (uk9Var.f64032a) {
                case 3:
                    caaVar.mo4477d(daaVar);
                    break;
                case 4:
                    caaVar.mo4478e(daaVar);
                    break;
                case 5:
                    caaVar.mo4480g(daaVar);
                    break;
                case 6:
                    caaVar.mo4475b();
                    break;
                default:
                    caaVar.mo4479f();
                    break;
            }
            caaVarArr2[i] = null;
        }
        this.f35315M = caaVarArr2;
    }

    /* JADX INFO: renamed from: G */
    public void mo10187G(View view) {
        if (this.f35320R) {
            return;
        }
        ArrayList arrayList = this.f35316N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f35317O);
        this.f35317O = f35306a0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f35317O = animatorArr;
        m10186F(this, uk9.f64030e, false);
        this.f35319Q = true;
    }

    /* JADX INFO: renamed from: H */
    public void mo10188H() {
        C3275kv c3275kvM10182x = m10182x();
        this.f35326X = 0L;
        int i = 0;
        while (true) {
            int size = this.f35323U.size();
            ArrayList arrayList = this.f35323U;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = (Animator) arrayList.get(i);
            s9a s9aVar = (s9a) c3275kvM10182x.get(animator);
            if (animator != null && s9aVar != null) {
                Animator animator2 = s9aVar.f60570f;
                long j = this.f35331c;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.f35330b;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.f35332d;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f35316N.add(animator);
                this.f35326X = Math.max(this.f35326X, w9a.m23818a(animator));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: I */
    public daa mo10189I(caa caaVar) {
        daa daaVar;
        ArrayList arrayList = this.f35322T;
        if (arrayList != null) {
            if (!arrayList.remove(caaVar) && (daaVar = this.f35321S) != null) {
                daaVar.mo10189I(caaVar);
            }
            if (this.f35322T.size() == 0) {
                this.f35322T = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: K */
    public void mo10190K(View view) {
        this.f35334f.remove(view);
    }

    /* JADX INFO: renamed from: L */
    public void mo10191L(View view) {
        if (this.f35319Q) {
            if (!this.f35320R) {
                ArrayList arrayList = this.f35316N;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f35317O);
                this.f35317O = f35306a0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f35317O = animatorArr;
                m10186F(this, uk9.f64031f, false);
            }
            this.f35319Q = false;
        }
    }

    /* JADX INFO: renamed from: M */
    public void mo10192M() {
        m10200U();
        C3275kv c3275kvM10182x = m10182x();
        for (Animator animator : this.f35323U) {
            if (c3275kvM10182x.containsKey(animator)) {
                m10200U();
                if (animator != null) {
                    animator.addListener(new r9a(this, c3275kvM10182x));
                    long j = this.f35331c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f35330b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f35332d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C3172k5(this, 1));
                    animator.start();
                }
            }
        }
        this.f35323U.clear();
        m10213q();
    }

    /* JADX INFO: renamed from: N */
    public void mo10193N(long j, long j2) {
        long j3 = this.f35326X;
        int i = 0;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.f35320R = false;
            m10186F(this, uk9.f64027b, z);
        }
        ArrayList arrayList = this.f35316N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f35317O);
        this.f35317O = f35306a0;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            w9a.m23819b(animator, Math.min(Math.max(0L, j), w9a.m23818a(animator)));
            i++;
            j3 = j3;
        }
        long j4 = j3;
        this.f35317O = animatorArr;
        if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j4) {
            this.f35320R = true;
        }
        m10186F(this, uk9.f64028c, z);
    }

    /* JADX INFO: renamed from: O */
    public void mo10194O(long j) {
        this.f35331c = j;
    }

    /* JADX INFO: renamed from: P */
    public void mo10195P(j8d j8dVar) {
    }

    /* JADX INFO: renamed from: Q */
    public void mo10196Q(TimeInterpolator timeInterpolator) {
        this.f35332d = timeInterpolator;
    }

    /* JADX INFO: renamed from: R */
    public void mo10197R(k57 k57Var) {
        if (k57Var == null) {
            this.f35325W = f35308c0;
        } else {
            this.f35325W = k57Var;
        }
    }

    /* JADX INFO: renamed from: S */
    public void mo10198S(qxc qxcVar) {
        this.f35324V = qxcVar;
    }

    /* JADX INFO: renamed from: T */
    public void mo10199T(long j) {
        this.f35330b = j;
    }

    /* JADX INFO: renamed from: U */
    public final void m10200U() {
        if (this.f35318P == 0) {
            m10186F(this, uk9.f64027b, false);
            this.f35320R = false;
        }
        this.f35318P++;
    }

    /* JADX INFO: renamed from: V */
    public String mo10201V(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f35331c != -1) {
            sb.append("dur(");
            sb.append(this.f35331c);
            sb.append(") ");
        }
        if (this.f35330b != -1) {
            sb.append("dly(");
            sb.append(this.f35330b);
            sb.append(") ");
        }
        if (this.f35332d != null) {
            sb.append("interp(");
            sb.append(this.f35332d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f35333e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f35334f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m10202a(caa caaVar) {
        if (this.f35322T == null) {
            this.f35322T = new ArrayList();
        }
        this.f35322T.add(caaVar);
    }

    /* JADX INFO: renamed from: b */
    public void mo10203b(int i) {
        if (i != 0) {
            this.f35333e.add(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo10204c(View view) {
        this.f35334f.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f35316N;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f35317O);
        this.f35317O = f35306a0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f35317O = animatorArr;
        m10186F(this, uk9.f64029d, false);
    }

    /* JADX INFO: renamed from: d */
    public void mo10205d(Class cls) {
        if (this.f35336h == null) {
            this.f35336h = new ArrayList();
        }
        this.f35336h.add(cls);
    }

    /* JADX INFO: renamed from: e */
    public void mo10206e(String str) {
        if (this.f35335g == null) {
            this.f35335g = new ArrayList();
        }
        this.f35335g.add(str);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo3042g(waa waaVar);

    /* JADX INFO: renamed from: h */
    public final void m10207h(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f35337i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f35338j;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    if (((Class) this.f35338j.get(i)).isInstance(view)) {
                        return;
                    }
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                waa waaVar = new waa(view);
                if (z) {
                    mo3043j(waaVar);
                } else {
                    mo3042g(waaVar);
                }
                waaVar.f66572c.add(this);
                mo10208i(waaVar);
                if (z) {
                    m10181f(this.f35340l, view, waaVar);
                } else {
                    m10181f(this.f35310H, view, waaVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    m10207h(viewGroup.getChildAt(i2), z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo10208i(waa waaVar) {
        HashMap map = waaVar.f66570a;
        if (this.f35324V == null || map.isEmpty()) {
            return;
        }
        this.f35324V.getClass();
        for (int i = 0; i < 2; i++) {
            if (!map.containsKey(qxc.f58358a[i])) {
                this.f35324V.getClass();
                qxc.m20195a(waaVar);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo3043j(waa waaVar);

    /* JADX INFO: renamed from: k */
    public final void m10209k(ViewGroup viewGroup, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        m10210l(z);
        ArrayList arrayList3 = this.f35333e;
        int size = arrayList3.size();
        ArrayList arrayList4 = this.f35334f;
        if ((size <= 0 && arrayList4.size() <= 0) || (((arrayList = this.f35335g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f35336h) != null && !arrayList2.isEmpty()))) {
            m10207h(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList3.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList3.get(i)).intValue());
            if (viewFindViewById != null) {
                waa waaVar = new waa(viewFindViewById);
                if (z) {
                    mo3043j(waaVar);
                } else {
                    mo3042g(waaVar);
                }
                waaVar.f66572c.add(this);
                mo10208i(waaVar);
                if (z) {
                    m10181f(this.f35340l, viewFindViewById, waaVar);
                } else {
                    m10181f(this.f35310H, viewFindViewById, waaVar);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
            View view = (View) arrayList4.get(i2);
            waa waaVar2 = new waa(view);
            if (z) {
                mo3043j(waaVar2);
            } else {
                mo3042g(waaVar2);
            }
            waaVar2.f66572c.add(this);
            mo10208i(waaVar2);
            if (z) {
                m10181f(this.f35340l, view, waaVar2);
            } else {
                m10181f(this.f35310H, view, waaVar2);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m10210l(boolean z) {
        if (z) {
            ((C3275kv) this.f35340l.f53414b).clear();
            ((SparseArray) this.f35340l.f53415c).clear();
            ((tk5) this.f35340l.f53416d).m22175a();
        } else {
            ((C3275kv) this.f35310H.f53414b).clear();
            ((SparseArray) this.f35310H.f53415c).clear();
            ((tk5) this.f35310H.f53416d).m22175a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public daa clone() {
        try {
            daa daaVar = (daa) super.clone();
            daaVar.f35323U = new ArrayList();
            daaVar.f35340l = new ny8(15);
            daaVar.f35310H = new ny8(15);
            daaVar.f35313K = null;
            daaVar.f35314L = null;
            daaVar.f35327Y = null;
            daaVar.f35321S = this;
            daaVar.f35322T = null;
            return daaVar;
        } catch (CloneNotSupportedException e) {
            v63.m23141s(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public Animator mo3044o(ViewGroup viewGroup, waa waaVar, waa waaVar2) {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public void mo10212p(ViewGroup viewGroup, ny8 ny8Var, ny8 ny8Var2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorMo3044o;
        int i;
        View view;
        waa waaVar;
        Animator animator;
        waa waaVar2;
        C3275kv c3275kvM10182x = m10182x();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z = m10218w().f35327Y != null;
        long jMin = Long.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            waa waaVar3 = (waa) arrayList.get(i2);
            waa waaVar4 = (waa) arrayList2.get(i2);
            if (waaVar3 != null && !waaVar3.f66572c.contains(this)) {
                waaVar3 = null;
            }
            if (waaVar4 != null && !waaVar4.f66572c.contains(this)) {
                waaVar4 = null;
            }
            if (!(waaVar3 == null && waaVar4 == null) && ((waaVar3 == null || waaVar4 == null || mo10184C(waaVar3, waaVar4)) && (animatorMo3044o = mo3044o(viewGroup, waaVar3, waaVar4)) != null)) {
                String str = this.f35329a;
                if (waaVar4 != null) {
                    View view2 = waaVar4.f66571b;
                    String[] strArrMo3045y = mo3045y();
                    if (strArrMo3045y != null && strArrMo3045y.length > 0) {
                        waaVar2 = new waa(view2);
                        i = i2;
                        waa waaVar5 = (waa) ((C3275kv) ny8Var2.f53414b).get(view2);
                        if (waaVar5 != null) {
                            int i3 = 0;
                            while (i3 < strArrMo3045y.length) {
                                String str2 = strArrMo3045y[i3];
                                waaVar2.f66570a.put(str2, waaVar5.f66570a.get(str2));
                                i3++;
                                strArrMo3045y = strArrMo3045y;
                            }
                        }
                        int i4 = c3275kvM10182x.f49254c;
                        for (int i5 = 0; i5 < i4; i5++) {
                            s9a s9aVar = (s9a) c3275kvM10182x.get((Animator) c3275kvM10182x.m15974f(i5));
                            if (s9aVar.f60567c != null && s9aVar.f60565a == view2 && s9aVar.f60566b.equals(str) && s9aVar.f60567c.equals(waaVar2)) {
                                animatorMo3044o = null;
                                break;
                            }
                        }
                    } else {
                        i = i2;
                        waaVar2 = null;
                    }
                    view = view2;
                    waaVar = waaVar2;
                    animator = animatorMo3044o;
                } else {
                    i = i2;
                    view = waaVar3.f66571b;
                    waaVar = null;
                }
                if (animator != null) {
                    animator = animatorMo3044o;
                    qxc qxcVar = this.f35324V;
                    if (qxcVar != null) {
                        long jMo17263b = qxcVar.mo17263b(viewGroup, this, waaVar3, waaVar4);
                        sparseIntArray.put(this.f35323U.size(), (int) jMo17263b);
                        jMin = Math.min(jMo17263b, jMin);
                    }
                    WindowId windowId = viewGroup.getWindowId();
                    s9a s9aVar2 = new s9a();
                    s9aVar2.f60565a = view;
                    s9aVar2.f60566b = str;
                    s9aVar2.f60567c = waaVar;
                    s9aVar2.f60568d = windowId;
                    s9aVar2.f60569e = this;
                    s9aVar2.f60570f = animator;
                    Object obj = animator;
                    if (z != 0) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        obj = animatorSet;
                    }
                    c3275kvM10182x.put(obj, s9aVar2);
                    this.f35323U.add(obj);
                } else {
                    animator = animatorMo3044o;
                }
            } else {
                size = size;
                z = z;
                i = i2;
            }
            i2 = i + 1;
            size = size;
            z = z;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                s9a s9aVar3 = (s9a) c3275kvM10182x.get((Animator) this.f35323U.get(sparseIntArray.keyAt(i6)));
                s9aVar3.f60570f.setStartDelay(s9aVar3.f60570f.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - jMin));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10213q() {
        int i = this.f35318P - 1;
        this.f35318P = i;
        if (i == 0) {
            m10186F(this, uk9.f64028c, false);
            for (int i2 = 0; i2 < ((tk5) this.f35340l.f53416d).m22182h(); i2++) {
                View view = (View) ((tk5) this.f35340l.f53416d).m22183i(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((tk5) this.f35310H.f53416d).m22182h(); i3++) {
                View view2 = (View) ((tk5) this.f35310H.f53416d).m22183i(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f35320R = true;
        }
    }

    /* JADX INFO: renamed from: s */
    public void mo10214s(int i) {
        ArrayList arrayListM21911a = this.f35337i;
        if (i > 0) {
            arrayListM21911a = t9a.m21911a(arrayListM21911a, Integer.valueOf(i));
        }
        this.f35337i = arrayListM21911a;
    }

    /* JADX INFO: renamed from: t */
    public void mo10215t(Class cls) {
        this.f35338j = t9a.m21911a(this.f35338j, cls);
    }

    public final String toString() {
        return mo10201V("");
    }

    /* JADX INFO: renamed from: u */
    public void mo10216u(String str) {
        this.f35339k = t9a.m21911a(this.f35339k, str);
    }

    /* JADX INFO: renamed from: v */
    public final waa m10217v(View view, boolean z) {
        raa raaVar = this.f35311I;
        if (raaVar != null) {
            return raaVar.m10217v(view, z);
        }
        ArrayList arrayList = z ? this.f35313K : this.f35314L;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            waa waaVar = (waa) arrayList.get(i);
            if (waaVar == null) {
                return null;
            }
            if (waaVar.f66571b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (waa) (z ? this.f35314L : this.f35313K).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final daa m10218w() {
        raa raaVar = this.f35311I;
        return raaVar != null ? raaVar.m10218w() : this;
    }

    /* JADX INFO: renamed from: y */
    public String[] mo3045y() {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final waa m10219z(View view, boolean z) {
        raa raaVar = this.f35311I;
        if (raaVar != null) {
            return raaVar.m10219z(view, z);
        }
        return (waa) ((C3275kv) (z ? this.f35340l : this.f35310H).f53414b).get(view);
    }

    public daa() {
        this.f35329a = getClass().getName();
        this.f35330b = -1L;
        this.f35331c = -1L;
        this.f35332d = null;
        this.f35333e = new ArrayList();
        this.f35334f = new ArrayList();
        this.f35335g = null;
        this.f35336h = null;
        this.f35337i = null;
        this.f35338j = null;
        this.f35339k = null;
        this.f35340l = new ny8(15);
        this.f35310H = new ny8(15);
        this.f35311I = null;
        this.f35312J = f35307b0;
        this.f35316N = new ArrayList();
        this.f35317O = f35306a0;
        this.f35318P = 0;
        this.f35319Q = false;
        this.f35320R = false;
        this.f35321S = null;
        this.f35322T = null;
        this.f35323U = new ArrayList();
        this.f35325W = f35308c0;
    }
}
