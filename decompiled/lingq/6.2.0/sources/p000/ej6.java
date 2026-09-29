package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes.dex */
public final class ej6 {

    /* JADX INFO: renamed from: a */
    public final C3244l f37327a = AbstractC3352my.m17114d(fj6.f39197m);

    /* JADX INFO: renamed from: b */
    public final C3244l f37328b;

    /* JADX INFO: renamed from: c */
    public final c18 f37329c;

    /* JADX INFO: renamed from: d */
    public final C0825bv f37330d;

    /* JADX INFO: renamed from: e */
    public final C0825bv f37331e;

    /* JADX INFO: renamed from: f */
    public bj6 f37332f;

    /* JADX INFO: renamed from: g */
    public int f37333g;

    /* JADX INFO: renamed from: h */
    public dj6 f37334h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f37335i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f37336j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashSet f37337k;

    /* JADX INFO: renamed from: l */
    public boolean f37338l;

    /* JADX INFO: renamed from: m */
    public boolean f37339m;

    /* JADX INFO: renamed from: n */
    public boolean f37340n;

    public ej6() {
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new cj6());
        this.f37328b = c3244lM17114d;
        this.f37329c = AbstractC3224d.m15524c(c3244lM17114d);
        this.f37330d = new C0825bv();
        this.f37331e = new C0825bv();
        this.f37335i = new LinkedHashSet();
        this.f37336j = new LinkedHashSet();
        this.f37337k = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public final void m11173a(ny8 ny8Var, dj6 dj6Var, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        ny8Var.getClass();
        if (dj6Var.f35721a != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(dj6Var);
            ny8 ny8Var2 = dj6Var.f35721a;
            sb.append("' is already added to dispatcher ");
            sb.append(ny8Var2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            linkedHashSet = i != 1 ? this.f37335i : this.f37336j;
        } else {
            linkedHashSet = this.f37337k;
        }
        linkedHashSet.add(dj6Var);
        dj6Var.f35721a = ny8Var;
        ((cj6) ((C3244l) this.f37329c.f9311a).getValue()).getClass();
        if (i != 0) {
            z = i != 1 ? this.f37340n : this.f37338l;
        } else {
            z = this.f37339m;
        }
        dj6Var.mo10415b(z);
    }

    /* JADX INFO: renamed from: b */
    public final void m11174b() {
        boolean z;
        boolean z2;
        cj6 cj6Var;
        C0825bv c0825bv = this.f37330d;
        if (c0825bv != null && c0825bv.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = c0825bv.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((bj6) it.next()).f8610b) {
                z = true;
                break;
            }
        }
        C0825bv c0825bv2 = this.f37331e;
        if (c0825bv2 != null && c0825bv2.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = c0825bv2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            } else if (((bj6) it2.next()).f8610b) {
                z2 = true;
                break;
            }
        }
        boolean z3 = z || z2;
        boolean z4 = this.f37339m != z;
        boolean z5 = this.f37338l != z2;
        boolean z6 = this.f37340n != z3;
        LinkedHashSet linkedHashSet = this.f37337k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((dj6) it3.next()).mo10415b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.f37336j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((dj6) it4.next()).mo10415b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f37335i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((dj6) it5.next()).mo10415b(z3);
            }
        }
        this.f37339m = z;
        this.f37338l = z2;
        this.f37340n = z3;
        bj6 bj6VarM11175c = this.f37332f;
        if (bj6VarM11175c == null) {
            bj6VarM11175c = m11175c(0);
        }
        bj6 bj6VarM11175c2 = this.f37332f;
        if (bj6VarM11175c2 == null) {
            bj6VarM11175c2 = m11175c(0);
        }
        if (fa4.m11650l(bj6VarM11175c2, bj6VarM11175c)) {
            if (bj6VarM11175c2 == null) {
                cj6Var = new cj6();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = c0825bv.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((bj6) it6.next()).f8610b;
                }
                Iterator<E> it7 = c0825bv2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((bj6) it7.next()).f8610b;
                }
                omd omdVar = bj6VarM11175c2.f8609a;
                ListBuilder listBuilderM23650t = vz1.m23650t();
                u91.m22630w0(arrayList, listBuilderM23650t);
                listBuilderM23650t.add(omdVar);
                u91.m22630w0(EmptyList.f47638a, listBuilderM23650t);
                cj6Var = new cj6(arrayList.size(), vz1.m23635i(listBuilderM23650t));
            }
            C3244l c3244l = this.f37328b;
            if (fa4.m11650l((cj6) c3244l.getValue(), cj6Var)) {
                return;
            }
            c3244l.m15572j(null, cj6Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((dj6) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((dj6) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((dj6) it10.next()).getClass();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final bj6 m11175c(int i) {
        Object next;
        Object next2;
        C0825bv c0825bv = this.f37331e;
        C0825bv c0825bv2 = this.f37330d;
        Object obj = null;
        if (i == -1) {
            Iterator it = c0825bv2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((bj6) next).f8610b);
            bj6 bj6Var = (bj6) next;
            if (bj6Var != null) {
                return bj6Var;
            }
            for (Object obj2 : c0825bv) {
                if (((bj6) obj2).f8610b) {
                    obj = obj2;
                    break;
                }
            }
            return (bj6) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = c0825bv2.iterator();
            while (it2.hasNext()) {
                ((bj6) it2.next()).getClass();
            }
            Iterator it3 = c0825bv.iterator();
            while (it3.hasNext()) {
                ((bj6) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = c0825bv2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((bj6) next2).f8610b);
        bj6 bj6Var2 = (bj6) next2;
        if (bj6Var2 != null) {
            return bj6Var2;
        }
        for (Object obj3 : c0825bv) {
            if (((bj6) obj3).f8610b) {
                obj = obj3;
                break;
            }
        }
        return (bj6) obj;
    }
}
