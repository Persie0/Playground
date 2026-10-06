package p000;

import android.animation.Animator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class asf implements Cloneable {

    /* JADX INFO: renamed from: g */
    public ArrayList f2234g;

    /* JADX INFO: renamed from: h */
    public ArrayList f2235h;

    /* JADX INFO: renamed from: l */
    public asn f2239l;

    /* JADX INFO: renamed from: n */
    private static final int[] f2225n = {2, 1, 3, 4};

    /* JADX INFO: renamed from: v */
    private static final ari f2227v = new ari();

    /* JADX INFO: renamed from: o */
    private static final ThreadLocal f2226o = new ThreadLocal();

    /* JADX INFO: renamed from: p */
    private final String f2241p = getClass().getName();

    /* JADX INFO: renamed from: a */
    public long f2228a = -1;

    /* JADX INFO: renamed from: b */
    long f2229b = -1;

    /* JADX INFO: renamed from: c */
    final ArrayList f2230c = new ArrayList();

    /* JADX INFO: renamed from: d */
    final ArrayList f2231d = new ArrayList();

    /* JADX INFO: renamed from: j */
    public bbo f2237j = new bbo();

    /* JADX INFO: renamed from: k */
    public bbo f2238k = new bbo();

    /* JADX INFO: renamed from: e */
    asm f2232e = null;

    /* JADX INFO: renamed from: f */
    public final int[] f2233f = f2225n;

    /* JADX INFO: renamed from: i */
    final ArrayList f2236i = new ArrayList();

    /* JADX INFO: renamed from: q */
    private int f2242q = 0;

    /* JADX INFO: renamed from: r */
    private boolean f2243r = false;

    /* JADX INFO: renamed from: s */
    private boolean f2244s = false;

    /* JADX INFO: renamed from: t */
    private ArrayList f2245t = null;

    /* JADX INFO: renamed from: u */
    private ArrayList f2246u = new ArrayList();

    /* JADX INFO: renamed from: m */
    public ari f2240m = f2227v;

    /* JADX INFO: renamed from: H */
    private static void m1927H(bbo bboVar, View view, asq asqVar) {
        ((C1117xf) bboVar.f2909c).put(view, asqVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) bboVar.f2908b).indexOfKey(id) >= 0) {
                ((SparseArray) bboVar.f2908b).put(id, null);
            } else {
                ((SparseArray) bboVar.f2908b).put(id, view);
            }
        }
        String strM477h = afh.m477h(view);
        if (strM477h != null) {
            if (((C1117xf) bboVar.f2907a).containsKey(strM477h)) {
                ((C1117xf) bboVar.f2907a).put(strM477h, null);
            } else {
                ((C1117xf) bboVar.f2907a).put(strM477h, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (((C1114xc) bboVar.f2910d).m19543a(itemIdAtPosition) < 0) {
                    afb.m433n(view, true);
                    ((C1114xc) bboVar.f2910d).m19549g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ((C1114xc) bboVar.f2910d).m19546d(itemIdAtPosition);
                if (view2 != null) {
                    afb.m433n(view2, false);
                    ((C1114xc) bboVar.f2910d).m19549g(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m1928e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            asq asqVar = new asq(view);
            if (z) {
                mo1901c(asqVar);
            } else {
                mo1900b(asqVar);
            }
            asqVar.f2262c.add(this);
            mo1943m(asqVar);
            if (z) {
                m1927H(this.f2237j, view, asqVar);
            } else {
                m1927H(this.f2238k, view, asqVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1928e(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m1929f(asq asqVar, asq asqVar2, String str) {
        Object obj = asqVar.f2260a.get(str);
        Object obj2 = asqVar2.f2260a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: g */
    public static C1109wy m1930g() {
        ThreadLocal threadLocal = f2226o;
        C1109wy c1109wy = (C1109wy) threadLocal.get();
        if (c1109wy != null) {
            return c1109wy;
        }
        C1109wy c1109wy2 = new C1109wy();
        threadLocal.set(c1109wy2);
        return c1109wy2;
    }

    /* JADX INFO: renamed from: A */
    public void mo1931A() {
    }

    /* JADX INFO: renamed from: B */
    public void mo1932B() {
    }

    /* JADX INFO: renamed from: C */
    public void mo1933C(long j) {
        this.f2228a = j;
    }

    /* JADX INFO: renamed from: D */
    public void mo1934D() {
        this.f2229b = 0L;
    }

    /* JADX INFO: renamed from: E */
    public void mo1935E(ViewGroup viewGroup, bbo bboVar, bbo bboVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorMo1899a;
        View view;
        Animator animator;
        asq asqVar;
        Animator animator2;
        asq asqVar2;
        C1109wy c1109wyM1930g = m1930g();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i = 0;
        for (int size = arrayList.size(); i < size; size = size) {
            asq asqVar3 = (asq) arrayList.get(i);
            asq asqVar4 = (asq) arrayList2.get(i);
            if (asqVar3 != null && !asqVar3.f2262c.contains(this)) {
                asqVar3 = null;
            }
            if (asqVar4 != null && !asqVar4.f2262c.contains(this)) {
                asqVar4 = null;
            }
            if ((asqVar3 != null || asqVar4 != null) && ((asqVar3 == null || asqVar4 == null || mo1951u(asqVar3, asqVar4)) && (animatorMo1899a = mo1899a(viewGroup, asqVar3, asqVar4)) != null)) {
                if (asqVar4 != null) {
                    View view2 = asqVar4.f2261b;
                    String[] strArrMo1902d = mo1902d();
                    if (strArrMo1902d != null) {
                        asq asqVar5 = new asq(view2);
                        asq asqVar6 = (asq) ((C1117xf) bboVar2.f2909c).get(view2);
                        if (asqVar6 != null) {
                            int i2 = 0;
                            while (i2 < strArrMo1902d.length) {
                                Map map = asqVar5.f2260a;
                                Animator animator3 = animatorMo1899a;
                                String str = strArrMo1902d[i2];
                                map.put(str, asqVar6.f2260a.get(str));
                                i2++;
                                animatorMo1899a = animator3;
                                strArrMo1902d = strArrMo1902d;
                            }
                        }
                        animator2 = animatorMo1899a;
                        int i3 = c1109wyM1930g.f48004d;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= i3) {
                                asqVar2 = asqVar5;
                                break;
                            }
                            drj drjVar = (drj) c1109wyM1930g.get((Animator) c1109wyM1930g.m19559d(i4));
                            if (drjVar.f12397c != null && drjVar.f12398d == view2) {
                                if (((String) drjVar.f12395a).equals(this.f2241p) && ((asq) drjVar.f12397c).equals(asqVar5)) {
                                    asqVar2 = asqVar5;
                                    animator2 = null;
                                    break;
                                }
                            }
                            i4++;
                        }
                    } else {
                        animator2 = animatorMo1899a;
                        asqVar2 = null;
                    }
                    view = view2;
                    asqVar = asqVar2;
                    animator = animator2;
                } else {
                    view = asqVar3.f2261b;
                    animator = animatorMo1899a;
                    asqVar = null;
                }
                if (animator != null) {
                    c1109wyM1930g.put(animator, new drj(view, this.f2241p, this, asu.m1973a(viewGroup), asqVar));
                    this.f2246u.add(animator);
                }
            }
            i++;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator4 = (Animator) this.f2246u.get(sparseIntArray.keyAt(i5));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i5)) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo1936F(asn asnVar) {
        this.f2239l = asnVar;
    }

    /* JADX INFO: renamed from: G */
    public void mo1937G(ari ariVar) {
        if (ariVar == null) {
            this.f2240m = f2227v;
        } else {
            this.f2240m = ariVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public Animator mo1899a(ViewGroup viewGroup, asq asqVar, asq asqVar2) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1900b(asq asqVar);

    /* JADX INFO: renamed from: c */
    public abstract void mo1901c(asq asqVar);

    /* JADX INFO: renamed from: d */
    public String[] mo1902d() {
        return null;
    }

    @Override // 
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public asf clone() {
        try {
            asf asfVar = (asf) super.clone();
            asfVar.f2246u = new ArrayList();
            asfVar.f2237j = new bbo();
            asfVar.f2238k = new bbo();
            asfVar.f2234g = null;
            asfVar.f2235h = null;
            return asfVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: i */
    final asq m1939i(View view, boolean z) {
        asm asmVar = this.f2232e;
        if (asmVar != null) {
            return asmVar.m1939i(view, z);
        }
        ArrayList arrayList = z ? this.f2234g : this.f2235h;
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
            asq asqVar = (asq) arrayList.get(i);
            if (asqVar == null) {
                return null;
            }
            if (asqVar.f2261b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (asq) (z ? this.f2235h : this.f2234g).get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final asq m1940j(View view, boolean z) {
        asm asmVar = this.f2232e;
        if (asmVar != null) {
            return asmVar.m1940j(view, z);
        }
        return (asq) ((C1117xf) (z ? this.f2237j : this.f2238k).f2909c).get(view);
    }

    /* JADX INFO: renamed from: k */
    public String mo1941k(String str) {
        String str2 = str + getClass().getSimpleName() + hIAHJKEnGsNbz.zBvbjSSKxMfSHh + Integer.toHexString(hashCode()) + ": ";
        if (this.f2229b != -1) {
            str2 = str2 + HEePJw.lFlyMxMio + this.f2229b + ") ";
        }
        if (this.f2228a != -1) {
            str2 = str2 + "dly(" + this.f2228a + ") ";
        }
        if (this.f2230c.size() <= 0 && this.f2231d.size() <= 0) {
            return str2;
        }
        int size = this.f2230c.size();
        String strConcat = str2.concat("tgts(");
        String str3 = VCYBIzY.DAgHynwqsCGgmo;
        if (size > 0) {
            for (int i = 0; i < this.f2230c.size(); i++) {
                if (i > 0) {
                    strConcat = strConcat.concat(str3);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(strConcat);
                Object obj = this.f2230c.get(i);
                sb.append(obj);
                strConcat = strConcat.concat(String.valueOf(obj));
            }
        }
        if (this.f2231d.size() > 0) {
            for (int i2 = 0; i2 < this.f2231d.size(); i2++) {
                if (i2 > 0) {
                    strConcat = strConcat.concat(str3);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strConcat);
                Object obj2 = this.f2231d.get(i2);
                sb2.append(obj2);
                strConcat = strConcat.concat(String.valueOf(obj2));
            }
        }
        return strConcat.concat(")");
    }

    /* JADX INFO: renamed from: l */
    protected void mo1942l() {
        for (int size = this.f2236i.size() - 1; size >= 0; size--) {
            ((Animator) this.f2236i.get(size)).cancel();
        }
        ArrayList arrayList = this.f2245t;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f2245t.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((ase) arrayList2.get(i)).mo1894b();
        }
    }

    /* JADX INFO: renamed from: m */
    public void mo1943m(asq asqVar) {
    }

    /* JADX INFO: renamed from: n */
    final void m1944n(ViewGroup viewGroup, boolean z) {
        m1945o(z);
        if (this.f2230c.size() <= 0 && this.f2231d.size() <= 0) {
            m1928e(viewGroup, z);
            return;
        }
        int i = 0;
        while (i < this.f2230c.size()) {
            View viewFindViewById = viewGroup.findViewById(((Integer) this.f2230c.get(i)).intValue());
            if (viewFindViewById != null) {
                asq asqVar = new asq(viewFindViewById);
                if (z) {
                    mo1901c(asqVar);
                } else {
                    mo1900b(asqVar);
                }
                asqVar.f2262c.add(this);
                mo1943m(asqVar);
                if (z) {
                    m1927H(this.f2237j, viewFindViewById, asqVar);
                } else {
                    m1927H(this.f2238k, viewFindViewById, asqVar);
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < this.f2231d.size(); i2++) {
            View view = (View) this.f2231d.get(i2);
            asq asqVar2 = new asq(view);
            if (z) {
                mo1901c(asqVar2);
            } else {
                mo1900b(asqVar2);
            }
            asqVar2.f2262c.add(this);
            mo1943m(asqVar2);
            if (z) {
                m1927H(this.f2237j, view, asqVar2);
            } else {
                m1927H(this.f2238k, view, asqVar2);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    final void m1945o(boolean z) {
        if (z) {
            ((C1117xf) this.f2237j.f2909c).clear();
            ((SparseArray) this.f2237j.f2908b).clear();
            ((C1114xc) this.f2237j.f2910d).m19548f();
        } else {
            ((C1117xf) this.f2238k.f2909c).clear();
            ((SparseArray) this.f2238k.f2908b).clear();
            ((C1114xc) this.f2238k.f2910d).m19548f();
        }
    }

    /* JADX INFO: renamed from: p */
    protected final void m1946p() {
        int i;
        int i2 = this.f2242q - 1;
        this.f2242q = i2;
        if (i2 == 0) {
            ArrayList arrayList = this.f2245t;
            if (arrayList == null || arrayList.size() <= 0) {
                i = 0;
            } else {
                ArrayList arrayList2 = (ArrayList) this.f2245t.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((ase) arrayList2.get(i3)).mo1893a(this);
                }
                i = 0;
            }
            while (i < ((C1114xc) this.f2237j.f2910d).m19544b()) {
                View view = (View) ((C1114xc) this.f2237j.f2910d).m19547e(i);
                if (view != null) {
                    afb.m433n(view, false);
                }
                i++;
            }
            for (int i4 = 0; i4 < ((C1114xc) this.f2238k.f2910d).m19544b(); i4++) {
                View view2 = (View) ((C1114xc) this.f2238k.f2910d).m19547e(i4);
                if (view2 != null) {
                    afb.m433n(view2, false);
                }
            }
            this.f2244s = true;
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo1947q(View view) {
        if (this.f2244s) {
            return;
        }
        for (int size = this.f2236i.size() - 1; size >= 0; size--) {
            ari.m1890b((Animator) this.f2236i.get(size));
        }
        ArrayList arrayList = this.f2245t;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f2245t.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((ase) arrayList2.get(i)).mo1895c();
            }
        }
        this.f2243r = true;
    }

    /* JADX INFO: renamed from: r */
    public void mo1948r(View view) {
        if (this.f2243r) {
            if (!this.f2244s) {
                for (int size = this.f2236i.size() - 1; size >= 0; size--) {
                    ari.m1891c((Animator) this.f2236i.get(size));
                }
                ArrayList arrayList = this.f2245t;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f2245t.clone();
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        ((ase) arrayList2.get(i)).mo1896d();
                    }
                }
            }
            this.f2243r = false;
        }
    }

    /* JADX INFO: renamed from: s */
    protected void mo1949s() {
        m1950t();
        C1109wy c1109wyM1930g = m1930g();
        ArrayList arrayList = this.f2246u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (c1109wyM1930g.containsKey(animator)) {
                m1950t();
                if (animator != null) {
                    animator.addListener(new asc(this, c1109wyM1930g));
                    if (this.f2229b >= 0) {
                        animator.setDuration(0L);
                    }
                    long j = this.f2228a;
                    if (j >= 0) {
                        animator.setStartDelay(j + animator.getStartDelay());
                    }
                    animator.addListener(new asd(this));
                    animator.start();
                }
            }
        }
        this.f2246u.clear();
        m1946p();
    }

    /* JADX INFO: renamed from: t */
    protected final void m1950t() {
        if (this.f2242q == 0) {
            ArrayList arrayList = this.f2245t;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2245t.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((ase) arrayList2.get(i)).mo1907e(this);
                }
            }
            this.f2244s = false;
        }
        this.f2242q++;
    }

    public final String toString() {
        return mo1941k("");
    }

    /* JADX INFO: renamed from: u */
    public boolean mo1951u(asq asqVar, asq asqVar2) {
        if (asqVar == null || asqVar2 == null) {
            return false;
        }
        String[] strArrMo1902d = mo1902d();
        if (strArrMo1902d == null) {
            Iterator it = asqVar.f2260a.keySet().iterator();
            while (it.hasNext()) {
                if (m1929f(asqVar, asqVar2, (String) it.next())) {
                    return true;
                }
            }
            return false;
        }
        for (String str : strArrMo1902d) {
            if (m1929f(asqVar, asqVar2, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    final boolean m1952v(View view) {
        return (this.f2230c.size() == 0 && this.f2231d.size() == 0) || this.f2230c.contains(Integer.valueOf(view.getId())) || this.f2231d.contains(view);
    }

    /* JADX INFO: renamed from: w */
    public final void m1953w(ase aseVar) {
        if (this.f2245t == null) {
            this.f2245t = new ArrayList();
        }
        this.f2245t.add(aseVar);
    }

    /* JADX INFO: renamed from: x */
    public void mo1954x(View view) {
        this.f2231d.add(view);
    }

    /* JADX INFO: renamed from: y */
    public final void m1955y(ase aseVar) {
        ArrayList arrayList = this.f2245t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(aseVar);
        if (this.f2245t.size() == 0) {
            this.f2245t = null;
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo1956z(View view) {
        this.f2231d.remove(view);
    }
}
