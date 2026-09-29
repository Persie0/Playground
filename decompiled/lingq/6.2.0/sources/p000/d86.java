package p000;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle$State;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class d86 {

    /* JADX INFO: renamed from: a */
    public final jj5 f35164a;

    /* JADX INFO: renamed from: b */
    public final C3244l f35165b;

    /* JADX INFO: renamed from: c */
    public final C3244l f35166c;

    /* JADX INFO: renamed from: d */
    public boolean f35167d;

    /* JADX INFO: renamed from: e */
    public final c18 f35168e;

    /* JADX INFO: renamed from: f */
    public final c18 f35169f;

    /* JADX INFO: renamed from: g */
    public final kj6 f35170g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ud6 f35171h;

    public d86(ud6 ud6Var, kj6 kj6Var) {
        kj6Var.getClass();
        this.f35171h = ud6Var;
        this.f35164a = new jj5(16);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(EmptyList.f47638a);
        this.f35165b = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(EmptySet.f47640a);
        this.f35166c = c3244lM17114d2;
        this.f35168e = AbstractC3224d.m15524c(c3244lM17114d);
        this.f35169f = AbstractC3224d.m15524c(c3244lM17114d2);
        this.f35170g = kj6Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m10153a(y76 y76Var) {
        y76Var.getClass();
        synchronized (this.f35164a) {
            C3244l c3244l = this.f35165b;
            ArrayList arrayListM22604V0 = u91.m22604V0((Collection) c3244l.getValue(), y76Var);
            c3244l.getClass();
            c3244l.m15572j(null, arrayListM22604V0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final y76 m10154b(r86 r86Var, Bundle bundle) {
        h86 h86Var = this.f35171h.f63760b;
        h86Var.getClass();
        return s46.m21060g(h86Var.f41946a.f63761c, r86Var, bundle, h86Var.m13129h(), h86Var.f41959n);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX INFO: renamed from: c */
    public final void m10155c(y76 y76Var) {
        i86 i86Var;
        cua cuaVar;
        y76Var.getClass();
        h86 h86Var = this.f35171h.f63760b;
        C3244l c3244l = h86Var.f41953h;
        String str = y76Var.f69413f;
        LinkedHashMap linkedHashMap = h86Var.f41967v;
        boolean zM11650l = fa4.m11650l(linkedHashMap.get(y76Var), Boolean.TRUE);
        C3244l c3244l2 = this.f35166c;
        c3244l2.m15572j(null, AbstractC3489q9.m19793w((Set) c3244l2.getValue(), y76Var));
        linkedHashMap.remove(y76Var);
        C0825bv c0825bv = h86Var.f41951f;
        if (c0825bv.contains(y76Var)) {
            if (this.f35167d) {
                return;
            }
            h86Var.m13140t();
            C3244l c3244l3 = h86Var.f41952g;
            ArrayList arrayList = new ArrayList(c0825bv);
            c3244l3.getClass();
            c3244l3.m15572j(null, arrayList);
            ArrayList arrayListM13136p = h86Var.m13136p();
            c3244l.getClass();
            c3244l.m15572j(null, arrayListM13136p);
            return;
        }
        h86Var.m13139s(y76Var);
        if (y76Var.f69415h.f347j.f66586d.isAtLeast(Lifecycle$State.CREATED)) {
            y76Var.m24978a(Lifecycle$State.DESTROYED);
        }
        if (!c0825bv.isEmpty()) {
            Iterator it = c0825bv.iterator();
            while (it.hasNext()) {
                if (fa4.m11650l(((y76) it.next()).f69413f, str)) {
                }
            }
            if (!zM11650l) {
                str.getClass();
                cuaVar = (cua) i86Var.f43688b.remove(str);
                if (cuaVar != null) {
                    cuaVar.m9899a();
                }
            }
        } else if (!zM11650l && (i86Var = h86Var.f41959n) != null) {
            str.getClass();
            cuaVar = (cua) i86Var.f43688b.remove(str);
            if (cuaVar != null) {
                cuaVar.m9899a();
            }
        }
        h86Var.m13140t();
        ArrayList arrayListM13136p2 = h86Var.m13136p();
        c3244l.getClass();
        c3244l.m15572j(null, arrayListM13136p2);
    }

    /* JADX INFO: renamed from: d */
    public final void m10156d(y76 y76Var) {
        int iNextIndex;
        synchronized (this.f35164a) {
            try {
                ArrayList arrayListM22624p1 = u91.m22624p1((Collection) ((C3244l) this.f35168e.f9311a).getValue());
                ListIterator listIterator = arrayListM22624p1.listIterator(arrayListM22624p1.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (fa4.m11650l(((y76) listIterator.previous()).f69413f, y76Var.f69413f)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                arrayListM22624p1.set(iNextIndex, y76Var);
                C3244l c3244l = this.f35165b;
                c3244l.getClass();
                c3244l.m15572j(null, arrayListM22624p1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10157e(y76 y76Var, boolean z) {
        h86 h86Var = this.f35171h.f63760b;
        C3006fm c3006fm = new C3006fm(this, y76Var, z);
        h86Var.getClass();
        kj6 kj6VarM16259b = h86Var.f41963r.m16259b(y76Var.f69409b.f58880a);
        h86Var.f41967v.put(y76Var, Boolean.valueOf(z));
        if (!kj6VarM16259b.equals(this.f35170g)) {
            Object obj = h86Var.f41964s.get(kj6VarM16259b);
            obj.getClass();
            ((d86) obj).m10157e(y76Var, z);
            return;
        }
        f86 f86Var = h86Var.f41966u;
        if (f86Var != null) {
            f86Var.invoke(y76Var);
            c3006fm.mo0a();
            return;
        }
        C0825bv c0825bv = h86Var.f41951f;
        int iIndexOf = c0825bv.indexOf(y76Var);
        if (iIndexOf < 0) {
            nmb.m17499a("Ignoring pop of " + y76Var + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != c0825bv.f9041c) {
            h86Var.m13134m(((y76) c0825bv.get(i)).f69409b.f58881b.f57368b, true, false);
        }
        h86.m13122o(h86Var, y76Var);
        c3006fm.mo0a();
        h86Var.f41947b.mo0a();
        h86Var.m13124b();
    }

    /* JADX INFO: renamed from: f */
    public final void m10158f(y76 y76Var, boolean z) {
        Object objPrevious;
        C3244l c3244l = this.f35166c;
        Iterable iterable = (Iterable) c3244l.getValue();
        boolean z2 = iterable instanceof Collection;
        c18 c18Var = this.f35168e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((y76) it.next()) == y76Var) {
                    Iterable iterable2 = (Iterable) ((C3244l) c18Var.f9311a).getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((y76) it2.next()) == y76Var) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        c3244l.m15572j(null, AbstractC3489q9.m19765B((Set) c3244l.getValue(), y76Var));
        u66 u66Var = c18Var.f9311a;
        u66 u66Var2 = c18Var.f9311a;
        List list = (List) ((C3244l) u66Var).getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            y76 y76Var2 = (y76) objPrevious;
            if (!fa4.m11650l(y76Var2, y76Var) && ((List) ((C3244l) u66Var2).getValue()).lastIndexOf(y76Var2) < ((List) ((C3244l) u66Var2).getValue()).lastIndexOf(y76Var)) {
                break;
            }
        }
        y76 y76Var3 = (y76) objPrevious;
        if (y76Var3 != null) {
            c3244l.m15572j(null, AbstractC3489q9.m19765B((Set) c3244l.getValue(), y76Var3));
        }
        m10157e(y76Var, z);
    }

    /* JADX INFO: renamed from: g */
    public final void m10159g(y76 y76Var) {
        y76Var.getClass();
        h86 h86Var = this.f35171h.f63760b;
        h86Var.getClass();
        kj6 kj6VarM16259b = h86Var.f41963r.m16259b(y76Var.f69409b.f58880a);
        if (!kj6VarM16259b.equals(this.f35170g)) {
            Object obj = h86Var.f41964s.get(kj6VarM16259b);
            if (obj != null) {
                ((d86) obj).m10159g(y76Var);
                return;
            } else {
                gm5.m12751g(AbstractC3393o1.m17738m(new StringBuilder("NavigatorBackStack for "), y76Var.f69409b.f58880a, " should already be created"));
                return;
            }
        }
        vi3 vi3Var = h86Var.f41965t;
        if (vi3Var != null) {
            vi3Var.invoke(y76Var);
            m10153a(y76Var);
        } else {
            nmb.m17499a("Ignoring add of destination " + y76Var.f69409b + " outside of the call to navigate(). ");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10160h(y76 y76Var) {
        C3244l c3244l = this.f35166c;
        Iterable iterable = (Iterable) c3244l.getValue();
        boolean z = iterable instanceof Collection;
        c18 c18Var = this.f35168e;
        if (!z || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((y76) it.next()) == y76Var) {
                    Iterable iterable2 = (Iterable) ((C3244l) c18Var.f9311a).getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((y76) it2.next()) == y76Var) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        y76 y76Var2 = (y76) u91.m22598P0((List) ((C3244l) c18Var.f9311a).getValue());
        if (y76Var2 != null) {
            LinkedHashSet linkedHashSetM19765B = AbstractC3489q9.m19765B((Set) c3244l.getValue(), y76Var2);
            c3244l.getClass();
            c3244l.m15572j(null, linkedHashSetM19765B);
        }
        LinkedHashSet linkedHashSetM19765B2 = AbstractC3489q9.m19765B((Set) c3244l.getValue(), y76Var);
        c3244l.getClass();
        c3244l.m15572j(null, linkedHashSetM19765B2);
        m10159g(y76Var);
    }
}
