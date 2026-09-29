package p000;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle$State;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.sequences.AbstractC3204c;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C3229i;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class h86 {

    /* JADX INFO: renamed from: a */
    public final ud6 f41946a;

    /* JADX INFO: renamed from: b */
    public final c86 f41947b;

    /* JADX INFO: renamed from: c */
    public u86 f41948c;

    /* JADX INFO: renamed from: d */
    public Bundle f41949d;

    /* JADX INFO: renamed from: e */
    public Bundle[] f41950e;

    /* JADX INFO: renamed from: f */
    public final C0825bv f41951f = new C0825bv();

    /* JADX INFO: renamed from: g */
    public final C3244l f41952g;

    /* JADX INFO: renamed from: h */
    public final C3244l f41953h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f41954i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f41955j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap f41956k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashMap f41957l;

    /* JADX INFO: renamed from: m */
    public ub5 f41958m;

    /* JADX INFO: renamed from: n */
    public i86 f41959n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f41960o;

    /* JADX INFO: renamed from: p */
    public Lifecycle$State f41961p;

    /* JADX INFO: renamed from: q */
    public final oe3 f41962q;

    /* JADX INFO: renamed from: r */
    public final lj6 f41963r;

    /* JADX INFO: renamed from: s */
    public final LinkedHashMap f41964s;

    /* JADX INFO: renamed from: t */
    public vi3 f41965t;

    /* JADX INFO: renamed from: u */
    public f86 f41966u;

    /* JADX INFO: renamed from: v */
    public final LinkedHashMap f41967v;

    /* JADX INFO: renamed from: w */
    public int f41968w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f41969x;

    /* JADX INFO: renamed from: y */
    public final C3229i f41970y;

    public h86(ud6 ud6Var, c86 c86Var) {
        this.f41946a = ud6Var;
        this.f41947b = c86Var;
        EmptyList emptyList = EmptyList.f47638a;
        this.f41952g = AbstractC3352my.m17114d(emptyList);
        this.f41953h = AbstractC3352my.m17114d(emptyList);
        this.f41954i = new LinkedHashMap();
        this.f41955j = new LinkedHashMap();
        this.f41956k = new LinkedHashMap();
        this.f41957l = new LinkedHashMap();
        this.f41960o = new ArrayList();
        this.f41961p = Lifecycle$State.INITIALIZED;
        this.f41962q = new oe3(this, 1);
        this.f41963r = new lj6();
        this.f41964s = new LinkedHashMap();
        this.f41967v = new LinkedHashMap();
        this.f41969x = new ArrayList();
        this.f41970y = pb1.m19034d(2, BufferOverflow.DROP_OLDEST);
    }

    /* JADX INFO: renamed from: d */
    public static r86 m13121d(int i, r86 r86Var, r86 r86Var2, boolean z) {
        if (r86Var.f58881b.f57368b == i && (r86Var2 == null || (r86Var.equals(r86Var2) && fa4.m11650l(r86Var.f58882c, r86Var2.f58882c)))) {
            return r86Var;
        }
        u86 u86Var = r86Var instanceof u86 ? (u86) r86Var : null;
        if (u86Var == null) {
            u86Var = r86Var.f58882c;
            u86Var.getClass();
        }
        return u86Var.f63589g.m21353e(i, u86Var, r86Var2, z);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13122o(h86 h86Var, y76 y76Var) {
        h86Var.m13135n(y76Var, false, new C0825bv());
    }

    /* JADX INFO: renamed from: a */
    public final void m13123a(r86 r86Var, Bundle bundle, y76 y76Var, List list) {
        Object objPrevious;
        Object objPrevious2;
        C3002fi c3002fi = this.f41946a.f63761c;
        r86 r86Var2 = y76Var.f69409b;
        boolean z = r86Var2 instanceof de2;
        C0825bv c0825bv = this.f41951f;
        if (!z) {
            while (!c0825bv.isEmpty() && (((y76) c0825bv.last()).f69409b instanceof de2) && m13134m(((y76) c0825bv.last()).f69409b.f58881b.f57368b, true, false)) {
            }
        }
        C0825bv<y76> c0825bv2 = new C0825bv();
        Object obj = null;
        if (r86Var instanceof u86) {
            r86 r86Var3 = r86Var2;
            do {
                r86Var3.getClass();
                r86Var3 = r86Var3.f58882c;
                if (r86Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!fa4.m11650l(((y76) objPrevious2).f69409b, r86Var3));
                    y76 y76VarM21060g = (y76) objPrevious2;
                    if (y76VarM21060g == null) {
                        y76VarM21060g = s46.m21060g(c3002fi, r86Var3, bundle, m13129h(), this.f41959n);
                    }
                    c0825bv2.addFirst(y76VarM21060g);
                    if (!c0825bv.isEmpty() && ((y76) c0825bv.last()).f69409b == r86Var3) {
                        m13122o(this, (y76) c0825bv.last());
                    }
                }
                if (r86Var3 == null) {
                    break;
                }
            } while (r86Var3 != r86Var);
        }
        r86 r86Var4 = c0825bv2.isEmpty() ? r86Var2 : ((y76) c0825bv2.first()).f69409b;
        while (r86Var4 != null && m13125c(r86Var4.f58881b.f57368b, r86Var4) != r86Var4) {
            r86Var4 = r86Var4.f58882c;
            if (r86Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!fa4.m11650l(((y76) objPrevious).f69409b, r86Var4));
                y76 y76VarM21060g2 = (y76) objPrevious;
                if (y76VarM21060g2 == null) {
                    y76VarM21060g2 = s46.m21060g(c3002fi, r86Var4, r86Var4.m20439d(bundle2), m13129h(), this.f41959n);
                }
                c0825bv2.addFirst(y76VarM21060g2);
            }
        }
        if (!c0825bv2.isEmpty()) {
            r86Var2 = ((y76) c0825bv2.first()).f69409b;
        }
        while (!c0825bv.isEmpty() && (((y76) c0825bv.last()).f69409b instanceof u86)) {
            r86 r86Var5 = ((y76) c0825bv.last()).f69409b;
            r86Var5.getClass();
            if (((pe9) ((u86) r86Var5).f63589g.f60818d).m19078b(r86Var2.f58881b.f57368b) != null) {
                break;
            } else {
                m13122o(this, (y76) c0825bv.last());
            }
        }
        y76 y76Var2 = (y76) c0825bv.m4186i();
        if (y76Var2 == null) {
            y76Var2 = (y76) c0825bv2.m4186i();
        }
        if (!fa4.m11650l(y76Var2 != null ? y76Var2.f69409b : null, this.f41948c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                r86 r86Var6 = ((y76) objPrevious3).f69409b;
                u86 u86Var = this.f41948c;
                u86Var.getClass();
                if (fa4.m11650l(r86Var6, u86Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            y76 y76VarM21060g3 = (y76) obj;
            if (y76VarM21060g3 == null) {
                u86 u86Var2 = this.f41948c;
                u86Var2.getClass();
                u86 u86Var3 = this.f41948c;
                u86Var3.getClass();
                y76VarM21060g3 = s46.m21060g(c3002fi, u86Var2, u86Var3.m20439d(bundle), m13129h(), this.f41959n);
            }
            c0825bv2.addFirst(y76VarM21060g3);
        }
        for (y76 y76Var3 : c0825bv2) {
            Object obj2 = this.f41964s.get(this.f41963r.m16259b(y76Var3.f69409b.f58880a));
            if (obj2 == null) {
                gm5.m12751g(AbstractC3393o1.m17738m(new StringBuilder("NavigatorBackStack for "), r86Var.f58880a, " should already be created"));
                return;
            }
            ((d86) obj2).m10153a(y76Var3);
        }
        c0825bv.addAll(c0825bv2);
        c0825bv.addLast(y76Var);
        for (y76 y76Var4 : u91.m22604V0(c0825bv2, y76Var)) {
            u86 u86Var4 = y76Var4.f69409b.f58882c;
            if (u86Var4 != null) {
                m13131j(y76Var4, m13126e(u86Var4.f58881b.f57368b));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13124b() {
        C0825bv c0825bv;
        while (true) {
            c0825bv = this.f41951f;
            if (c0825bv.isEmpty() || !(((y76) c0825bv.last()).f69409b instanceof u86)) {
                break;
            }
            m13122o(this, (y76) c0825bv.last());
        }
        y76 y76Var = (y76) c0825bv.m4188k();
        ArrayList arrayList = this.f41969x;
        if (y76Var != null) {
            arrayList.add(y76Var);
        }
        this.f41968w++;
        m13140t();
        int i = this.f41968w - 1;
        this.f41968w = i;
        if (i == 0) {
            ArrayList<y76> arrayListM22624p1 = u91.m22624p1(arrayList);
            arrayList.clear();
            for (y76 y76Var2 : arrayListM22624p1) {
                for (e86 e86Var : u91.m22622n1(this.f41960o)) {
                    r86 r86Var = y76Var2.f69409b;
                    y76Var2.f69415h.m170a();
                    e86Var.mo10921a(this.f41946a, r86Var);
                }
                this.f41970y.m15558p(y76Var2);
            }
            ArrayList arrayList2 = new ArrayList(c0825bv);
            C3244l c3244l = this.f41952g;
            c3244l.getClass();
            c3244l.m15572j(null, arrayList2);
            ArrayList arrayListM13136p = m13136p();
            C3244l c3244l2 = this.f41953h;
            c3244l2.getClass();
            c3244l2.m15572j(null, arrayListM13136p);
        }
        return y76Var != null;
    }

    /* JADX INFO: renamed from: c */
    public final r86 m13125c(int i, r86 r86Var) {
        r86 r86Var2;
        u86 u86Var = this.f41948c;
        if (u86Var == null) {
            return null;
        }
        if (u86Var.f58881b.f57368b == i) {
            if (r86Var == null) {
                return u86Var;
            }
            if (fa4.m11650l(u86Var, r86Var) && r86Var.f58882c == null) {
                return this.f41948c;
            }
        }
        y76 y76Var = (y76) this.f41951f.m4188k();
        if (y76Var == null || (r86Var2 = y76Var.f69409b) == null) {
            r86Var2 = this.f41948c;
            r86Var2.getClass();
        }
        return m13121d(i, r86Var2, r86Var, false);
    }

    /* JADX INFO: renamed from: e */
    public final y76 m13126e(int i) {
        Object objPrevious;
        C0825bv c0825bv = this.f41951f;
        ListIterator<E> listIterator = c0825bv.listIterator(c0825bv.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((y76) objPrevious).f69409b.f58881b.f57368b != i);
        y76 y76Var = (y76) objPrevious;
        if (y76Var != null) {
            return y76Var;
        }
        StringBuilder sbM22998u = ux5.m22998u("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        sbM22998u.append(m13127f());
        throw new IllegalArgumentException(sbM22998u.toString().toString());
    }

    /* JADX INFO: renamed from: f */
    public final r86 m13127f() {
        y76 y76Var = (y76) this.f41951f.m4188k();
        if (y76Var != null) {
            return y76Var.f69409b;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final u86 m13128g() {
        u86 u86Var = this.f41948c;
        if (u86Var != null) {
            u86Var.getClass();
            return u86Var;
        }
        C3386nv.m17633t("You must call setGraph() before calling getGraph()");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final Lifecycle$State m13129h() {
        return this.f41958m == null ? Lifecycle$State.CREATED : this.f41961p;
    }

    /* JADX INFO: renamed from: i */
    public final u86 m13130i() {
        r86 r86Var;
        y76 y76Var = (y76) this.f41951f.m4188k();
        if (y76Var == null || (r86Var = y76Var.f69409b) == null) {
            r86Var = this.f41948c;
            r86Var.getClass();
        }
        u86 u86Var = r86Var instanceof u86 ? (u86) r86Var : null;
        if (u86Var != null) {
            return u86Var;
        }
        u86 u86Var2 = r86Var.f58882c;
        u86Var2.getClass();
        return u86Var2;
    }

    /* JADX INFO: renamed from: j */
    public final void m13131j(y76 y76Var, y76 y76Var2) {
        this.f41954i.put(y76Var, y76Var2);
        LinkedHashMap linkedHashMap = this.f41955j;
        if (linkedHashMap.get(y76Var2) == null) {
            linkedHashMap.put(y76Var2, new C3277kx());
        }
        Object obj = linkedHashMap.get(y76Var2);
        obj.getClass();
        ((C3277kx) obj).f48532a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116 A[LOOP:4: B:50:0x010f->B:52:0x0116, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x017d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0196 A[LOOP:6: B:61:0x0190->B:63:0x0196, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01af  */
    /* JADX WARN: Code duplicated, block: B:90:0x0188 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public final void m13132k(r86 r86Var, Bundle bundle, wd6 wd6Var) {
        int i;
        boolean zM13134m;
        lj6 lj6Var;
        LinkedHashMap linkedHashMap;
        boolean z;
        int iNextIndex;
        r86 r86Var2;
        C0825bv<y76> c0825bv;
        u86 u86Var;
        r86Var.getClass();
        C3488q8 c3488q8 = r86Var.f58881b;
        LinkedHashMap linkedHashMap2 = this.f41964s;
        Iterator it = linkedHashMap2.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                ((d86) it.next()).f35167d = true;
            }
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (wd6Var != null) {
            boolean z2 = wd6Var.f66653e;
            boolean z3 = wd6Var.f66652d;
            int i2 = wd6Var.f66651c;
            if (i2 != -1) {
                zM13134m = m13134m(i2, z3, z2);
            } else {
                zM13134m = false;
            }
        } else {
            zM13134m = false;
        }
        Bundle bundleM20439d = r86Var.m20439d(bundle);
        if (wd6Var == null || !wd6Var.f66650b) {
            lj6Var = this.f41963r;
            if (wd6Var == null && wd6Var.f66649a) {
                C0825bv c0825bv2 = this.f41951f;
                y76 y76Var = (y76) c0825bv2.m4188k();
                ListIterator listIterator = c0825bv2.listIterator(c0825bv2.mo4182d());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((y76) listIterator.previous()).f69409b == r86Var) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else if (r86Var instanceof u86) {
                    int i3 = u86.f63588h;
                    List listM15421q0 = AbstractC3204c.m15421q0(new bl3(AbstractC3204c.m15418n0((u86) r86Var, new lz5(11)), new tf4(23), 1));
                    if (c0825bv2.f9041c - iNextIndex == listM15421q0.size()) {
                        List listSubList = c0825bv2.subList(iNextIndex, c0825bv2.f9041c);
                        ArrayList arrayList = new ArrayList(v91.m23189q0(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((y76) it2.next()).f69409b.f58881b.f57368b));
                        }
                        if (arrayList.equals(listM15421q0)) {
                            c0825bv = new C0825bv();
                            for (i = 1; c0825bv2.size() - i >= iNextIndex; i = 1) {
                                y76 y76Var2 = (y76) u91.m22608Z0(c0825bv2);
                                m13139s(y76Var2);
                                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                y76 y76Var3 = new y76(y76Var2.f69408a, y76Var2.f69409b, y76Var2.f69409b.m20439d(bundle), y76Var2.f69411d, y76Var2.f69412e, y76Var2.f69413f, y76Var2.f69414g);
                                Lifecycle$State lifecycle$State = y76Var2.f69411d;
                                a86 a86Var = y76Var3.f69415h;
                                a86Var.getClass();
                                lifecycle$State.getClass();
                                a86Var.f341d = lifecycle$State;
                                Lifecycle$State lifecycle$State2 = y76Var2.f69415h.f348k;
                                lifecycle$State2.getClass();
                                a86Var.f348k = lifecycle$State2;
                                a86Var.m171b();
                                c0825bv.addFirst(y76Var3);
                                linkedHashMap2 = linkedHashMap3;
                            }
                            linkedHashMap = linkedHashMap2;
                            for (y76 y76Var4 : c0825bv) {
                                u86Var = y76Var4.f69409b.f58882c;
                                if (u86Var != null) {
                                    m13131j(y76Var4, m13126e(u86Var.f58881b.f57368b));
                                }
                                c0825bv2.addLast(y76Var4);
                            }
                            for (y76 y76Var5 : c0825bv) {
                                lj6Var.m16259b(y76Var5.f69409b.f58880a).mo11797f(y76Var5);
                            }
                            z = true;
                        }
                    }
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else if (y76Var == null || (r86Var2 = y76Var.f69409b) == null || c3488q8.f57368b != r86Var2.f58881b.f57368b) {
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else {
                    c0825bv = new C0825bv();
                    while (c0825bv2.size() - i >= iNextIndex) {
                        y76 y76Var6 = (y76) u91.m22608Z0(c0825bv2);
                        m13139s(y76Var6);
                        LinkedHashMap linkedHashMap4 = linkedHashMap2;
                        y76 y76Var7 = new y76(y76Var6.f69408a, y76Var6.f69409b, y76Var6.f69409b.m20439d(bundle), y76Var6.f69411d, y76Var6.f69412e, y76Var6.f69413f, y76Var6.f69414g);
                        Lifecycle$State lifecycle$State3 = y76Var6.f69411d;
                        a86 a86Var2 = y76Var7.f69415h;
                        a86Var2.getClass();
                        lifecycle$State3.getClass();
                        a86Var2.f341d = lifecycle$State3;
                        Lifecycle$State lifecycle$State4 = y76Var6.f69415h.f348k;
                        lifecycle$State4.getClass();
                        a86Var2.f348k = lifecycle$State4;
                        a86Var2.m171b();
                        c0825bv.addFirst(y76Var7);
                        linkedHashMap2 = linkedHashMap4;
                    }
                    linkedHashMap = linkedHashMap2;
                    while (r4.hasNext()) {
                        u86Var = y76Var4.f69409b.f58882c;
                        if (u86Var != null) {
                            m13131j(y76Var4, m13126e(u86Var.f58881b.f57368b));
                        }
                        c0825bv2.addLast(y76Var4);
                    }
                    while (r3.hasNext()) {
                        lj6Var.m16259b(y76Var5.f69409b.f58880a).mo11797f(y76Var5);
                    }
                    z = true;
                }
            } else {
                linkedHashMap = linkedHashMap2;
                z = false;
            }
            if (!z) {
                y76 y76VarM21060g = s46.m21060g(this.f41946a.f63761c, r86Var, bundleM20439d, m13129h(), this.f41959n);
                kj6 kj6VarM16259b = lj6Var.m16259b(r86Var.f58880a);
                List listM23604J = vz1.m23604J(y76VarM21060g);
                this.f41965t = new C3615tl(ref$BooleanRef, this, r86Var, bundleM20439d);
                kj6VarM16259b.mo11795d(listM23604J, wd6Var);
                this.f41965t = null;
            }
        } else if (this.f41956k.containsKey(Integer.valueOf(c3488q8.f57368b))) {
            ref$BooleanRef.f47713a = m13137q(c3488q8.f57368b, bundleM20439d, wd6Var);
            linkedHashMap = linkedHashMap2;
            z = false;
        } else {
            lj6Var = this.f41963r;
            if (wd6Var == null) {
                linkedHashMap = linkedHashMap2;
                z = false;
            } else {
                linkedHashMap = linkedHashMap2;
                z = false;
            }
            if (!z) {
                y76 y76VarM21060g2 = s46.m21060g(this.f41946a.f63761c, r86Var, bundleM20439d, m13129h(), this.f41959n);
                kj6 kj6VarM16259b2 = lj6Var.m16259b(r86Var.f58880a);
                List listM23604J2 = vz1.m23604J(y76VarM21060g2);
                this.f41965t = new C3615tl(ref$BooleanRef, this, r86Var, bundleM20439d);
                kj6VarM16259b2.mo11795d(listM23604J2, wd6Var);
                this.f41965t = null;
            }
        }
        this.f41947b.mo0a();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((d86) it3.next()).f35167d = false;
        }
        if (zM13134m || ref$BooleanRef.f47713a || z) {
            m13124b();
        } else {
            m13140t();
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m13133l(int i, boolean z) {
        return m13134m(i, z, false) && m13124b();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m13134m(int i, boolean z, boolean z2) {
        r86 r86Var;
        final h86 h86Var;
        boolean z3;
        C3488q8 c3488q8;
        C0825bv c0825bv = this.f41951f;
        final int i2 = 0;
        if (c0825bv.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = u91.m22610b1(c0825bv).iterator();
        do {
            if (!it.hasNext()) {
                r86Var = null;
                break;
            }
            r86Var = ((y76) it.next()).f69409b;
            String str = r86Var.f58880a;
            c3488q8 = r86Var.f58881b;
            kj6 kj6VarM16259b = this.f41963r.m16259b(str);
            if (z || c3488q8.f57368b != i) {
                arrayList.add(kj6VarM16259b);
            }
        } while (c3488q8.f57368b != i);
        if (r86Var == null) {
            int i3 = r86.f58879f;
            nmb.m17499a("Ignoring popBackStack to destination " + bna.m3931T(this.f41946a.f63761c, i) + " as it was not found on the current back stack");
            return false;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        C0825bv c0825bv2 = new C0825bv();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                h86Var = this;
                z3 = z2;
                break;
            }
            kj6 kj6Var = (kj6) it2.next();
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            y76 y76Var = (y76) c0825bv.last();
            h86Var = this;
            z3 = z2;
            f86 f86Var = new f86(ref$BooleanRef2, ref$BooleanRef, h86Var, z3, c0825bv2);
            kj6Var.getClass();
            y76Var.getClass();
            h86Var.f41966u = f86Var;
            kj6Var.mo11798i(y76Var, z3);
            h86Var.f41966u = null;
            if (!ref$BooleanRef2.f47713a) {
                break;
            }
            this = h86Var;
            z2 = z3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = h86Var.f41956k;
            if (!z) {
                Iterator it3 = new kr9(AbstractC3204c.m15418n0(r86Var, new tf4(21)), new vi3(h86Var) { // from class: g86

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ h86 f40388b;

                    {
                        this.f40388b = h86Var;
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        int i4 = i2;
                        h86 h86Var2 = this.f40388b;
                        r86 r86Var2 = (r86) obj;
                        switch (i4) {
                            case 0:
                                r86Var2.getClass();
                                zContainsKey = h86Var2.f41956k.containsKey(Integer.valueOf(r86Var2.f58881b.f57368b));
                                break;
                            default:
                                r86Var2.getClass();
                                zContainsKey = h86Var2.f41956k.containsKey(Integer.valueOf(r86Var2.f58881b.f57368b));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }).iterator();
                while (true) {
                    jr9 jr9Var = (jr9) it3;
                    if (!jr9Var.hasNext()) {
                        break;
                    }
                    Integer numValueOf = Integer.valueOf(((r86) jr9Var.next()).f58881b.f57368b);
                    b86 b86Var = (b86) c0825bv2.m4186i();
                    linkedHashMap.put(numValueOf, b86Var != null ? (String) b86Var.f8109a.f60817c : null);
                }
            }
            if (!c0825bv2.isEmpty()) {
                sg3 sg3Var = ((b86) c0825bv2.first()).f8109a;
                final int i4 = 1;
                Iterator it4 = new kr9(AbstractC3204c.m15418n0(h86Var.m13125c(sg3Var.f60816b, null), new tf4(22)), new vi3(h86Var) { // from class: g86

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ h86 f40388b;

                    {
                        this.f40388b = h86Var;
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        int i5 = i4;
                        h86 h86Var2 = this.f40388b;
                        r86 r86Var2 = (r86) obj;
                        switch (i5) {
                            case 0:
                                r86Var2.getClass();
                                zContainsKey = h86Var2.f41956k.containsKey(Integer.valueOf(r86Var2.f58881b.f57368b));
                                break;
                            default:
                                r86Var2.getClass();
                                zContainsKey = h86Var2.f41956k.containsKey(Integer.valueOf(r86Var2.f58881b.f57368b));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }).iterator();
                while (true) {
                    jr9 jr9Var2 = (jr9) it4;
                    if (!jr9Var2.hasNext()) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((r86) jr9Var2.next()).f58881b.f57368b), (String) sg3Var.f60817c);
                }
                if (linkedHashMap.values().contains((String) sg3Var.f60817c)) {
                    h86Var.f41957l.put((String) sg3Var.f60817c, c0825bv2);
                }
            }
        }
        h86Var.f41947b.mo0a();
        return ref$BooleanRef.f47713a;
    }

    /* JADX INFO: renamed from: n */
    public final void m13135n(y76 y76Var, boolean z, C0825bv c0825bv) {
        i86 i86Var;
        c18 c18Var;
        Set set;
        y76Var.getClass();
        C0825bv c0825bv2 = this.f41951f;
        y76 y76Var2 = (y76) c0825bv2.last();
        if (!fa4.m11650l(y76Var2, y76Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(y76Var.f69409b);
            r86 r86Var = y76Var2.f69409b;
            sb.append(", which is not the top of the back stack (");
            sb.append(r86Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        u91.m22608Z0(c0825bv2);
        d86 d86Var = (d86) this.f41964s.get(this.f41963r.m16259b(y76Var2.f69409b.f58880a));
        boolean z2 = true;
        if ((d86Var == null || (c18Var = d86Var.f35169f) == null || (set = (Set) ((C3244l) c18Var.f9311a).getValue()) == null || !set.contains(y76Var2)) && !this.f41955j.containsKey(y76Var2)) {
            z2 = false;
        }
        Lifecycle$State lifecycle$State = y76Var2.f69415h.f347j.f66586d;
        Lifecycle$State lifecycle$State2 = Lifecycle$State.CREATED;
        if (lifecycle$State.isAtLeast(lifecycle$State2)) {
            if (z) {
                y76Var2.m24978a(lifecycle$State2);
                c0825bv.addFirst(new b86(y76Var2));
            }
            if (z2) {
                y76Var2.m24978a(lifecycle$State2);
            } else {
                y76Var2.m24978a(Lifecycle$State.DESTROYED);
                m13139s(y76Var2);
            }
        }
        if (z || z2 || (i86Var = this.f41959n) == null) {
            return;
        }
        String str = y76Var2.f69413f;
        str.getClass();
        cua cuaVar = (cua) i86Var.f43688b.remove(str);
        if (cuaVar != null) {
            cuaVar.m9899a();
        }
    }

    /* JADX INFO: renamed from: p */
    public final ArrayList m13136p() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f41964s.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((C3244l) ((d86) it.next()).f35169f.f9311a).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                y76 y76Var = (y76) obj;
                if (!arrayList.contains(y76Var) && !y76Var.f69415h.f348k.isAtLeast(Lifecycle$State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            u91.m22630w0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f41951f) {
            y76 y76Var2 = (y76) obj2;
            if (!arrayList.contains(y76Var2) && y76Var2.f69415h.f348k.isAtLeast(Lifecycle$State.STARTED)) {
                arrayList3.add(obj2);
            }
        }
        u91.m22630w0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((y76) obj3).f69409b instanceof u86)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m13137q(int i, Bundle bundle, wd6 wd6Var) {
        r86 r86VarM13128g;
        y76 y76Var;
        r86 r86Var;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.f41956k;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (fa4.m11650l((String) it.next(), str)) {
                it.remove();
            }
        }
        C0825bv<b86> c0825bv = (C0825bv) lda.m16118d(this.f41957l).remove(str);
        C3002fi c3002fi = this.f41946a.f63761c;
        ArrayList arrayList = new ArrayList();
        y76 y76Var2 = (y76) this.f41951f.m4188k();
        if (y76Var2 == null || (r86VarM13128g = y76Var2.f69409b) == null) {
            r86VarM13128g = m13128g();
        }
        if (c0825bv != null) {
            for (b86 b86Var : c0825bv) {
                sg3 sg3Var = b86Var.f8109a;
                sg3 sg3Var2 = b86Var.f8109a;
                r86 r86VarM13121d = m13121d(sg3Var.f60816b, r86VarM13128g, null, true);
                if (r86VarM13121d == null) {
                    int i2 = r86.f58879f;
                    ij6.m13955m("Restore State failed: destination ", bna.m3931T(c3002fi, sg3Var2.f60816b), " cannot be found from the current destination ", r86VarM13128g);
                    return false;
                }
                Lifecycle$State lifecycle$StateM13129h = m13129h();
                i86 i86Var = this.f41959n;
                c3002fi.getClass();
                lifecycle$StateM13129h.getClass();
                Bundle bundle3 = (Bundle) sg3Var2.f60818d;
                if (bundle3 != null) {
                    bundle3.setClassLoader(c3002fi.f39115a.getClassLoader());
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = (String) sg3Var2.f60817c;
                Bundle bundle4 = (Bundle) sg3Var2.f60819e;
                str2.getClass();
                arrayList.add(new y76(c3002fi, r86VarM13121d, bundle2, lifecycle$StateM13129h, i86Var, str2, bundle4));
                r86VarM13128g = r86VarM13121d;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<y76> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((y76) obj).f69409b instanceof u86)) {
                arrayList3.add(obj);
            }
        }
        for (y76 y76Var3 : arrayList3) {
            List list = (List) u91.m22598P0(arrayList2);
            if (fa4.m11650l((list == null || (y76Var = (y76) u91.m22597O0(list)) == null || (r86Var = y76Var.f69409b) == null) ? null : r86Var.f58880a, y76Var3.f69409b.f58880a)) {
                list.add(y76Var3);
            } else {
                arrayList2.add(vz1.m23608N(y76Var3));
            }
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        for (List list2 : arrayList2) {
            kj6 kj6VarM16259b = this.f41963r.m16259b(((y76) u91.m22589G0(list2)).f69409b.f58880a);
            ArrayList arrayList4 = arrayList;
            this.f41965t = new C3537ri(ref$BooleanRef, arrayList4, new Ref$IntRef(), this, bundle, 6);
            kj6VarM16259b.mo11795d(list2, wd6Var);
            this.f41965t = null;
            arrayList = arrayList4;
        }
        return ref$BooleanRef.f47713a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: r */
    public final void m13138r(u86 u86Var, Bundle bundle) {
        Activity activity;
        sg3 sg3Var = u86Var.f63589g;
        C0825bv<y76> c0825bv = this.f41951f;
        if (!c0825bv.isEmpty() && m13129h() == Lifecycle$State.DESTROYED) {
            C3386nv.m17633t("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            return;
        }
        int i = 0;
        if (fa4.m11650l(this.f41948c, u86Var)) {
            int iM19081e = ((pe9) sg3Var.f60818d).m19081e();
            while (i < iM19081e) {
                r86 r86Var = (r86) ((pe9) sg3Var.f60818d).m19082f(i);
                u86 u86Var2 = this.f41948c;
                u86Var2.getClass();
                int iM19079c = ((pe9) u86Var2.f63589g.f60818d).m19079c(i);
                u86 u86Var3 = this.f41948c;
                u86Var3.getClass();
                pe9 pe9Var = (pe9) u86Var3.f63589g.f60818d;
                if (pe9Var.f56013a) {
                    AbstractC3122is.m14091e(pe9Var);
                }
                int iM18260j = AbstractC3423or.m18260j(pe9Var.f56016d, iM19079c, pe9Var.f56014b);
                if (iM18260j >= 0) {
                    Object[] objArr = pe9Var.f56015c;
                    Object obj = objArr[iM18260j];
                    objArr[iM18260j] = r86Var;
                }
                i++;
            }
            for (y76 y76Var : c0825bv) {
                int i2 = r86.f58879f;
                r86 r86Var2 = y76Var.f69409b;
                r86Var2.getClass();
                u98 u98Var = new u98(AbstractC3204c.m15421q0(AbstractC3204c.m15418n0(r86Var2, new tf4(25))));
                r86 r86VarM22538m = this.f41948c;
                r86VarM22538m.getClass();
                Iterator it = u98Var.iterator();
                while (true) {
                    s98 s98Var = (s98) it;
                    if (s98Var.hasNext()) {
                        r86 r86Var3 = (r86) s98Var.next();
                        if (!fa4.m11650l(r86Var3, this.f41948c) || !r86VarM22538m.equals(u86Var)) {
                            if (r86VarM22538m instanceof u86) {
                                r86VarM22538m = ((u86) r86VarM22538m).m22538m(r86Var3.f58881b.f57368b);
                                r86VarM22538m.getClass();
                            }
                        }
                    }
                }
                y76Var.f69409b = r86VarM22538m;
            }
            return;
        }
        u86 u86Var4 = this.f41948c;
        LinkedHashMap linkedHashMap = this.f41964s;
        r86 r86Var4 = null;
        if (u86Var4 != null) {
            for (Integer num : new ArrayList(this.f41956k.keySet())) {
                num.getClass();
                int iIntValue = num.intValue();
                Iterator it2 = linkedHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((d86) it2.next()).f35167d = true;
                }
                boolean zM13137q = m13137q(iIntValue, null, xqb.m24650a(new lz5(8)));
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    ((d86) it3.next()).f35167d = false;
                }
                if (zM13137q) {
                    m13134m(iIntValue, true, false);
                }
            }
            m13134m(u86Var4.f58881b.f57368b, true, false);
        }
        this.f41948c = u86Var;
        ud6 ud6Var = this.f41946a;
        C3002fi c3002fi = ud6Var.f63761c;
        Bundle bundle2 = this.f41949d;
        lj6 lj6Var = this.f41963r;
        if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
            if (stringArrayList == null) {
                syc.m21782a("android-support-nav:controller:navigatorState:names");
                throw null;
            }
            for (String str : stringArrayList) {
                kj6 kj6VarM16259b = lj6Var.m16259b(str);
                if (bundle2.containsKey(str)) {
                    Bundle bundle3 = bundle2.getBundle(str);
                    if (bundle3 == null) {
                        syc.m21782a(str);
                        throw null;
                    }
                    kj6VarM16259b.mo15274g(bundle3);
                }
            }
        }
        Bundle[] bundleArr = this.f41950e;
        if (bundleArr != null) {
            int length = bundleArr.length;
            while (i < length) {
                Bundle bundle4 = bundleArr[i];
                bundle4.getClass();
                bundle4.setClassLoader(b86.class.getClassLoader());
                String string = bundle4.getString("nav-entry-state:id");
                if (string == null) {
                    ?? r16 = r86Var4;
                    syc.m21782a("nav-entry-state:id");
                    throw r16;
                }
                int iM22007u = te1.m22007u("nav-entry-state:destination-id", bundle4);
                Bundle bundle5 = bundle4.getBundle("nav-entry-state:args");
                if (bundle5 == null) {
                    ?? r17 = r86Var4;
                    syc.m21782a("nav-entry-state:args");
                    throw r17;
                }
                Bundle bundle6 = bundle4.getBundle("nav-entry-state:saved-state");
                if (bundle6 == null) {
                    ?? r18 = r86Var4;
                    syc.m21782a("nav-entry-state:saved-state");
                    throw r18;
                }
                r86 r86VarM13125c = m13125c(iM22007u, r86Var4);
                if (r86VarM13125c == null) {
                    int i3 = r86.f58879f;
                    v63.m23138p(AbstractC3393o1.m17742q("Restoring the Navigation back stack failed: destination ", bna.m3931T(c3002fi, iM22007u), " cannot be found from the current destination "), m13127f());
                    return;
                }
                Lifecycle$State lifecycle$StateM13129h = m13129h();
                i86 i86Var = this.f41959n;
                c3002fi.getClass();
                lifecycle$StateM13129h.getClass();
                r86 r86Var5 = r86Var4;
                bundle5.setClassLoader(c3002fi.f39115a.getClassLoader());
                int i4 = length;
                y76 y76Var2 = new y76(c3002fi, r86VarM13125c, bundle5, lifecycle$StateM13129h, i86Var, string, bundle6);
                kj6 kj6VarM16259b2 = lj6Var.m16259b(r86VarM13125c.f58880a);
                Object d86Var = linkedHashMap.get(kj6VarM16259b2);
                if (d86Var == null) {
                    d86Var = new d86(ud6Var, kj6VarM16259b2);
                    linkedHashMap.put(kj6VarM16259b2, d86Var);
                }
                c0825bv.addLast(y76Var2);
                ((d86) d86Var).m10153a(y76Var2);
                u86 u86Var5 = y76Var2.f69409b.f58882c;
                if (u86Var5 != null) {
                    m13131j(y76Var2, m13126e(u86Var5.f58881b.f57368b));
                }
                i++;
                length = i4;
                r86Var4 = r86Var5;
            }
            this.f41947b.mo0a();
            this.f41950e = r86Var4;
        }
        Collection collectionValues = AbstractC3194a.m15371X(lj6Var.f49742a).values();
        ArrayList<kj6> arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!((kj6) obj2).f47396b) {
                arrayList.add(obj2);
            }
        }
        for (kj6 kj6Var : arrayList) {
            Object d86Var2 = linkedHashMap.get(kj6Var);
            if (d86Var2 == null) {
                kj6Var.getClass();
                d86Var2 = new d86(ud6Var, kj6Var);
                linkedHashMap.put(kj6Var, d86Var2);
            }
            kj6Var.mo11796e((d86) d86Var2);
        }
        if (this.f41948c == null || !c0825bv.isEmpty()) {
            m13124b();
            return;
        }
        if (ud6Var.f63763e || (activity = ud6Var.f63762d) == null || !ud6Var.m22686c(activity.getIntent())) {
            u86 u86Var6 = this.f41948c;
            u86Var6.getClass();
            m13132k(u86Var6, bundle, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m13139s(y76 y76Var) {
        y76Var.getClass();
        y76 y76Var2 = (y76) this.f41954i.remove(y76Var);
        if (y76Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f41955j;
        C3277kx c3277kx = (C3277kx) linkedHashMap.get(y76Var2);
        Integer numValueOf = c3277kx != null ? Integer.valueOf(c3277kx.f48532a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            d86 d86Var = (d86) this.f41964s.get(this.f41963r.m16259b(y76Var2.f69409b.f58880a));
            if (d86Var != null) {
                d86Var.m10155c(y76Var2);
            }
            linkedHashMap.remove(y76Var2);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m13140t() {
        C3277kx c3277kx;
        c18 c18Var;
        Set set;
        ArrayList<y76> arrayListM22624p1 = u91.m22624p1(this.f41951f);
        if (arrayListM22624p1.isEmpty()) {
            return;
        }
        ArrayList arrayListM23608N = vz1.m23608N(((y76) u91.m22597O0(arrayListM22624p1)).f69409b);
        ArrayList arrayList = new ArrayList();
        if (u91.m22597O0(arrayListM23608N) instanceof de2) {
            Iterator it = u91.m22610b1(arrayListM22624p1).iterator();
            while (it.hasNext()) {
                r86 r86Var = ((y76) it.next()).f69409b;
                arrayList.add(r86Var);
                if (!(r86Var instanceof de2) && !(r86Var instanceof u86)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (y76 y76Var : u91.m22610b1(arrayListM22624p1)) {
            Lifecycle$State lifecycle$State = y76Var.f69415h.f348k;
            r86 r86Var2 = y76Var.f69409b;
            r86 r86Var3 = (r86) u91.m22591I0(arrayListM23608N);
            if (r86Var3 != null && r86Var3.f58881b.f57368b == r86Var2.f58881b.f57368b) {
                Lifecycle$State lifecycle$State2 = Lifecycle$State.RESUMED;
                if (lifecycle$State != lifecycle$State2) {
                    d86 d86Var = (d86) this.f41964s.get(this.f41963r.m16259b(y76Var.f69409b.f58880a));
                    if (fa4.m11650l((d86Var == null || (c18Var = d86Var.f35169f) == null || (set = (Set) ((C3244l) c18Var.f9311a).getValue()) == null) ? null : Boolean.valueOf(set.contains(y76Var)), Boolean.TRUE) || ((c3277kx = (C3277kx) this.f41955j.get(y76Var)) != null && c3277kx.f48532a.get() == 0)) {
                        map.put(y76Var, Lifecycle$State.STARTED);
                    } else {
                        map.put(y76Var, lifecycle$State2);
                    }
                }
                r86 r86Var4 = (r86) u91.m22591I0(arrayList);
                if (r86Var4 != null && r86Var4.f58881b.f57368b == r86Var2.f58881b.f57368b) {
                    u91.m22607Y0(arrayList);
                }
                u91.m22607Y0(arrayListM23608N);
                u86 u86Var = r86Var2.f58882c;
                if (u86Var != null) {
                    arrayListM23608N.add(u86Var);
                }
            } else if (arrayList.isEmpty() || r86Var2.f58881b.f57368b != ((r86) u91.m22589G0(arrayList)).f58881b.f57368b) {
                y76Var.m24978a(Lifecycle$State.CREATED);
            } else {
                r86 r86Var5 = (r86) u91.m22607Y0(arrayList);
                if (lifecycle$State == Lifecycle$State.RESUMED) {
                    y76Var.m24978a(Lifecycle$State.STARTED);
                } else {
                    Lifecycle$State lifecycle$State3 = Lifecycle$State.STARTED;
                    if (lifecycle$State != lifecycle$State3) {
                        map.put(y76Var, lifecycle$State3);
                    }
                }
                u86 u86Var2 = r86Var5.f58882c;
                if (u86Var2 != null && !arrayList.contains(u86Var2)) {
                    arrayList.add(u86Var2);
                }
            }
        }
        for (y76 y76Var2 : arrayListM22624p1) {
            Lifecycle$State lifecycle$State4 = (Lifecycle$State) map.get(y76Var2);
            if (lifecycle$State4 != null) {
                y76Var2.m24978a(lifecycle$State4);
            } else {
                y76Var2.f69415h.m171b();
            }
        }
    }
}
