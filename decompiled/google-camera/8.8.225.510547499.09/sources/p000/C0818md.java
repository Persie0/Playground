package p000;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: md */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0818md {

    /* JADX INFO: renamed from: a */
    public final ArrayList f40021a;

    /* JADX INFO: renamed from: b */
    public ArrayList f40022b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f40023c;

    /* JADX INFO: renamed from: d */
    public final List f40024d;

    /* JADX INFO: renamed from: e */
    int f40025e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RecyclerView f40026f;

    /* JADX INFO: renamed from: g */
    ilo f40027g;

    public C0818md(RecyclerView recyclerView) {
        this.f40026f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f40021a = arrayList;
        this.f40022b = null;
        this.f40023c = new ArrayList();
        this.f40024d = Collections.unmodifiableList(arrayList);
        this.f40025e = 2;
    }

    /* JADX INFO: renamed from: a */
    public final int m16312a(int i) {
        if (i >= 0 && i < this.f40026f.f1075M.m16585a()) {
            RecyclerView recyclerView = this.f40026f;
            return !recyclerView.f1075M.f40922g ? i : recyclerView.f1082T.m13595b(i);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + DNTdN.aDCO + this.f40026f.f1075M.m16585a() + this.f40026f.m1257k());
    }

    /* JADX INFO: renamed from: b */
    public final View m16313b(int i) {
        return m16326o(i, Long.MAX_VALUE).f41155a;
    }

    /* JADX INFO: renamed from: c */
    final void m16314c(C0829mo c0829mo, boolean z) {
        RecyclerView.m1202r(c0829mo);
        View view = c0829mo.f41155a;
        C0831mq c0831mq = this.f40026f.f1079Q;
        if (c0831mq != null) {
            aei aeiVarMo1780j = c0831mq.mo1780j();
            afq.m547g(view, aeiVarMo1780j instanceof C0830mp ? (aei) ((C0830mp) aeiVarMo1780j).f41225b.remove(view) : null);
        }
        if (z) {
            int size = this.f40026f.f1125o.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC0819me) this.f40026f.f1125o.get(i)).m16333a();
            }
            RecyclerView recyclerView = this.f40026f;
            if (recyclerView.f1075M != null) {
                recyclerView.f1084V.m762g(c0829mo);
            }
        }
        c0829mo.f41172r = null;
        c0829mo.f41171q = null;
        ilo iloVarM16327p = m16327p();
        int i2 = c0829mo.f41160f;
        ArrayList arrayList = iloVarM16327p.m11446i(i2).f39909a;
        int i3 = ((C0817mc) ((SparseArray) iloVarM16327p.f31457c).get(i2)).f39910b;
        if (arrayList.size() >= 5) {
            abn.m143c(c0829mo.f41155a);
        } else {
            c0829mo.m16684k();
            arrayList.add(c0829mo);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16315d() {
        this.f40021a.clear();
        m16319h();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: e */
    public final void m16316e() {
        RecyclerView recyclerView;
        AbstractC0806ls abstractC0806ls;
        ilo iloVar = this.f40027g;
        if (iloVar == null || (abstractC0806ls = (recyclerView = this.f40026f).f1123m) == null || !recyclerView.f1129s) {
            return;
        }
        iloVar.f31456b.add(abstractC0806ls);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: f */
    public final void m16317f(AbstractC0806ls abstractC0806ls, boolean z) {
        ilo iloVar = this.f40027g;
        if (iloVar != null) {
            iloVar.f31456b.remove(abstractC0806ls);
            if (iloVar.f31456b.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < ((SparseArray) iloVar.f31457c).size(); i++) {
                SparseArray sparseArray = (SparseArray) iloVar.f31457c;
                ArrayList arrayList = ((C0817mc) sparseArray.get(sparseArray.keyAt(i))).f39909a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    abn.m143c(((C0829mo) arrayList.get(i2)).f41155a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    final void m16318g(View view) {
        C0829mo c0829moM1197h = RecyclerView.m1197h(view);
        c0829moM1197h.f41167m = null;
        c0829moM1197h.f41168n = false;
        c0829moM1197h.m16681h();
        m16322k(c0829moM1197h);
    }

    /* JADX INFO: renamed from: h */
    public final void m16319h() {
        for (int size = this.f40023c.size() - 1; size >= 0; size--) {
            m16320i(size);
        }
        this.f40023c.clear();
        if (RecyclerView.f1060c) {
            this.f40026f.f1074L.m14736b();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m16320i(int i) {
        m16314c((C0829mo) this.f40023c.get(i), true);
        this.f40023c.remove(i);
    }

    /* JADX INFO: renamed from: j */
    public final void m16321j(View view) {
        C0829mo c0829moM1197h = RecyclerView.m1197h(view);
        if (c0829moM1197h.m16696w()) {
            this.f40026f.removeDetachedView(view, false);
        }
        if (c0829moM1197h.m16695v()) {
            c0829moM1197h.m16688o();
        } else if (c0829moM1197h.m16673A()) {
            c0829moM1197h.m16681h();
        }
        m16322k(c0829moM1197h);
        if (this.f40026f.f1068F == null || c0829moM1197h.m16693t()) {
            return;
        }
        this.f40026f.f1068F.mo11859b(c0829moM1197h);
    }

    /* JADX INFO: renamed from: k */
    final void m16322k(C0829mo c0829mo) {
        boolean z;
        boolean z2 = true;
        boolean z3 = false;
        if (c0829mo.m16695v() || c0829mo.f41155a.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(hIAHJKEnGsNbz.Itjt);
            sb.append(c0829mo.m16695v());
            sb.append(" isAttached:");
            sb.append(c0829mo.f41155a.getParent() != null);
            sb.append(this.f40026f.m1257k());
            throw new IllegalArgumentException(sb.toString());
        }
        if (c0829mo.m16696w()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c0829mo + this.f40026f.m1257k());
        }
        if (c0829mo.m16699z()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(this.f40026f.m1257k()));
        }
        boolean z4 = (c0829mo.f41164j & 16) == 0 && afb.m437r(c0829mo.f41155a);
        if (c0829mo.m16693t()) {
            if (this.f40025e <= 0 || c0829mo.m16689p(526)) {
                z = false;
            } else {
                int size = this.f40023c.size();
                if (size >= this.f40025e && size > 0) {
                    m16320i(0);
                    size--;
                }
                if (RecyclerView.f1060c && size > 0 && !this.f40026f.f1074L.m14738d(c0829mo.f41157c)) {
                    int i = size - 1;
                    while (i >= 0) {
                        if (!this.f40026f.f1074L.m14738d(((C0829mo) this.f40023c.get(i)).f41157c)) {
                            break;
                        } else {
                            i--;
                        }
                    }
                    size = i + 1;
                }
                this.f40023c.add(size, c0829mo);
                z = true;
            }
            if (z) {
                z3 = z;
                z2 = false;
            } else {
                m16314c(c0829mo, true);
                z3 = z;
            }
        } else {
            z2 = false;
        }
        this.f40026f.f1084V.m762g(c0829mo);
        if (z3 || z2 || !z4) {
            return;
        }
        abn.m143c(c0829mo.f41155a);
        c0829mo.f41172r = null;
        c0829mo.f41171q = null;
    }

    /* JADX INFO: renamed from: l */
    final void m16323l(View view) {
        AbstractC0809lv abstractC0809lv;
        C0829mo c0829moM1197h = RecyclerView.m1197h(view);
        if (!c0829moM1197h.m16689p(12) && c0829moM1197h.m16697x() && (abstractC0809lv = this.f40026f.f1068F) != null && !abstractC0809lv.mo11862g(c0829moM1197h, c0829moM1197h.m16676c())) {
            if (this.f40022b == null) {
                this.f40022b = new ArrayList();
            }
            c0829moM1197h.m16687n(this, true);
            this.f40022b.add(c0829moM1197h);
            return;
        }
        if (c0829moM1197h.m16692s() && !c0829moM1197h.m16694u()) {
            RecyclerView recyclerView = this.f40026f;
            if (!recyclerView.f1123m.f39115b) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.m1257k()));
            }
        }
        c0829moM1197h.m16687n(this, false);
        this.f40021a.add(c0829moM1197h);
    }

    /* JADX INFO: renamed from: m */
    public final void m16324m(C0829mo c0829mo) {
        if (c0829mo.f41168n) {
            this.f40022b.remove(c0829mo);
        } else {
            this.f40021a.remove(c0829mo);
        }
        c0829mo.f41167m = null;
        c0829mo.f41168n = false;
        c0829mo.m16681h();
    }

    /* JADX INFO: renamed from: n */
    public final void m16325n() {
        AbstractC0812ly abstractC0812ly = this.f40026f.f1124n;
        this.f40025e = (abstractC0812ly != null ? abstractC0812ly.f39556w : 0) + 2;
        for (int size = this.f40023c.size() - 1; size >= 0 && this.f40023c.size() > this.f40025e; size--) {
            m16320i(size);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x020c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0217  */
    /* JADX WARN: Code duplicated, block: B:115:0x0222  */
    /* JADX WARN: Code duplicated, block: B:117:0x0228  */
    /* JADX WARN: Code duplicated, block: B:222:0x043e  */
    /* JADX INFO: renamed from: o */
    final C0829mo m16326o(int i, long j) {
        C0829mo c0829moM1197h;
        boolean z;
        boolean z2;
        ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        RecyclerView recyclerViewM1198i;
        C0829mo c0829mo;
        View view;
        int size;
        int iM13595b;
        if (i < 0 || i >= this.f40026f.f1075M.m16585a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + this.f40026f.f1075M.m16585a() + this.f40026f.m1257k());
        }
        boolean z3 = false;
        if (this.f40026f.f1075M.f40922g) {
            ArrayList arrayList = this.f40022b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        RecyclerView recyclerView = this.f40026f;
                        if (recyclerView.f1123m.f39115b && (iM13595b = recyclerView.f1082T.m13595b(i)) > 0 && iM13595b < this.f40026f.f1123m.mo1762a()) {
                            long jMo1764c = this.f40026f.f1123m.mo1764c(iM13595b);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    c0829moM1197h = null;
                                    break;
                                }
                                C0829mo c0829mo2 = (C0829mo) this.f40022b.get(i3);
                                if (!c0829mo2.m16673A() && c0829mo2.f41159e == jMo1764c) {
                                    c0829mo2.m16678e(32);
                                    c0829moM1197h = c0829mo2;
                                    break;
                                }
                                i3++;
                            }
                        } else {
                            c0829moM1197h = null;
                            break;
                        }
                    } else {
                        c0829moM1197h = (C0829mo) this.f40022b.get(i2);
                        if (!c0829moM1197h.m16673A() && c0829moM1197h.m16675b() == i) {
                            c0829moM1197h.m16678e(32);
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                c0829moM1197h = null;
            }
            z = c0829moM1197h != null;
        } else {
            c0829moM1197h = null;
            z = false;
        }
        if (c0829moM1197h == null) {
            int size2 = this.f40021a.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    C0756jw c0756jw = this.f40026f.f1118h;
                    int size3 = c0756jw.f34933b.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            view = null;
                            break;
                        }
                        view = (View) c0756jw.f34933b.get(i5);
                        AmbientMode.AmbientController ambientController = c0756jw.f34934c;
                        C0829mo c0829moM1197h2 = RecyclerView.m1197h(view);
                        if (c0829moM1197h2.m16675b() == i && !c0829moM1197h2.m16692s() && !c0829moM1197h2.m16694u()) {
                            break;
                        }
                        i5++;
                    }
                    if (view == null) {
                        int size4 = this.f40023c.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                c0829moM1197h = null;
                                break;
                            }
                            C0829mo c0829mo3 = (C0829mo) this.f40023c.get(i6);
                            if (!c0829mo3.m16692s() && c0829mo3.m16675b() == i && !c0829mo3.m16690q()) {
                                this.f40023c.remove(i6);
                                c0829moM1197h = c0829mo3;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        c0829moM1197h = RecyclerView.m1197h(view);
                        C0756jw c0756jw2 = this.f40026f.f1118h;
                        int iM1637j = c0756jw2.f34934c.m1637j(view);
                        if (iM1637j < 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("view is not a child, cannot hide ");
                            sb.append(view);
                            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
                        }
                        if (!c0756jw2.f34932a.m13534f(iM1637j)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("trying to unhide a view that was not hidden");
                            sb2.append(view);
                            throw new RuntimeException("trying to unhide a view that was not hidden".concat(view.toString()));
                        }
                        c0756jw2.f34932a.m13530b(iM1637j);
                        c0756jw2.m13620l(view);
                        int iM13612d = this.f40026f.f1118h.m13612d(view);
                        if (iM13612d != -1) {
                            this.f40026f.f1118h.m13617i(iM13612d);
                            m16323l(view);
                            c0829moM1197h.m16678e(8224);
                            break;
                        }
                        throw new IllegalStateException(wUzNh.lUavILxOGV + c0829moM1197h + this.f40026f.m1257k());
                    }
                } else {
                    C0829mo c0829mo4 = (C0829mo) this.f40021a.get(i4);
                    if (!c0829mo4.m16673A() && c0829mo4.m16675b() == i && !c0829mo4.m16692s() && (this.f40026f.f1075M.f40922g || !c0829mo4.m16694u())) {
                        c0829mo4.m16678e(32);
                        c0829moM1197h = c0829mo4;
                        break;
                    }
                    i4++;
                }
            }
            if (c0829moM1197h != null) {
                if (!c0829moM1197h.m16694u()) {
                    int i7 = c0829moM1197h.f41157c;
                    if (i7 < 0 || i7 >= this.f40026f.f1123m.mo1762a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c0829moM1197h + this.f40026f.m1257k());
                    }
                    RecyclerView recyclerView2 = this.f40026f;
                    if (recyclerView2.f1075M.f40922g || recyclerView2.f1123m.mo1763b(c0829moM1197h.f41157c) == c0829moM1197h.f41160f) {
                        AbstractC0806ls abstractC0806ls = this.f40026f.f1123m;
                        if (!abstractC0806ls.f39115b || c0829moM1197h.f41159e == abstractC0806ls.mo1764c(c0829moM1197h.f41157c)) {
                            z = true;
                        } else {
                            c0829moM1197h.m16678e(4);
                            if (c0829moM1197h.m16695v()) {
                                this.f40026f.removeDetachedView(c0829moM1197h.f41155a, false);
                                c0829moM1197h.m16688o();
                            } else if (c0829moM1197h.m16673A()) {
                                c0829moM1197h.m16681h();
                            }
                            m16322k(c0829moM1197h);
                            c0829moM1197h = null;
                        }
                    } else {
                        c0829moM1197h.m16678e(4);
                        if (c0829moM1197h.m16695v()) {
                            this.f40026f.removeDetachedView(c0829moM1197h.f41155a, false);
                            c0829moM1197h.m16688o();
                        } else if (c0829moM1197h.m16673A()) {
                            c0829moM1197h.m16681h();
                        }
                        m16322k(c0829moM1197h);
                        c0829moM1197h = null;
                    }
                } else if (this.f40026f.f1075M.f40922g) {
                    z = true;
                } else {
                    c0829moM1197h.m16678e(4);
                    if (c0829moM1197h.m16695v()) {
                        this.f40026f.removeDetachedView(c0829moM1197h.f41155a, false);
                        c0829moM1197h.m16688o();
                    } else if (c0829moM1197h.m16673A()) {
                        c0829moM1197h.m16681h();
                    }
                    m16322k(c0829moM1197h);
                    c0829moM1197h = null;
                }
            }
        }
        if (c0829moM1197h == null) {
            int iM13595b2 = this.f40026f.f1082T.m13595b(i);
            if (iM13595b2 < 0 || iM13595b2 >= this.f40026f.f1123m.mo1762a()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM13595b2 + ").state:" + this.f40026f.f1075M.m16585a() + this.f40026f.m1257k());
            }
            int iMo1763b = this.f40026f.f1123m.mo1763b(iM13595b2);
            AbstractC0806ls abstractC0806ls2 = this.f40026f.f1123m;
            if (abstractC0806ls2.f39115b) {
                long jMo1764c2 = abstractC0806ls2.mo1764c(iM13595b2);
                int size5 = this.f40021a.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        int size6 = this.f40023c.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                C0829mo c0829mo5 = (C0829mo) this.f40023c.get(size6);
                                if (c0829mo5.f41159e != jMo1764c2 || c0829mo5.m16690q()) {
                                    size6--;
                                } else {
                                    if (iMo1763b == c0829mo5.f41160f) {
                                        this.f40023c.remove(size6);
                                        c0829moM1197h = c0829mo5;
                                        break;
                                    }
                                    m16320i(size6);
                                }
                            }
                            c0829moM1197h = null;
                            break;
                        }
                    }
                    c0829moM1197h = (C0829mo) this.f40021a.get(size5);
                    if (c0829moM1197h.f41159e == jMo1764c2 && !c0829moM1197h.m16673A()) {
                        if (iMo1763b == c0829moM1197h.f41160f) {
                            c0829moM1197h.m16678e(32);
                            if (!c0829moM1197h.m16694u() || this.f40026f.f1075M.f40922g) {
                                break;
                                break;
                            }
                            c0829moM1197h.m16685l(2, 14);
                            break;
                        }
                        this.f40021a.remove(size5);
                        this.f40026f.removeDetachedView(c0829moM1197h.f41155a, false);
                        m16318g(c0829moM1197h.f41155a);
                    }
                    size5--;
                }
                if (c0829moM1197h != null) {
                    c0829moM1197h.f41157c = iM13595b2;
                    z = true;
                }
            }
            if (c0829moM1197h == null) {
                C0817mc c0817mc = (C0817mc) ((SparseArray) m16327p().f31457c).get(iMo1763b);
                if (c0817mc != null && !c0817mc.f39909a.isEmpty()) {
                    ArrayList arrayList2 = c0817mc.f39909a;
                    int size7 = arrayList2.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            c0829mo = null;
                            break;
                        }
                        if (!((C0829mo) arrayList2.get(size7)).m16690q()) {
                            c0829mo = (C0829mo) arrayList2.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    c0829mo = null;
                    break;
                }
                if (c0829mo != null) {
                    c0829mo.m16684k();
                }
                c0829moM1197h = c0829mo;
            }
            if (c0829moM1197h == null) {
                long jM1195aq = RecyclerView.m1195aq();
                if (j != Long.MAX_VALUE) {
                    long j2 = this.f40027g.m11446i(iMo1763b).f39911c;
                    if (j2 != 0 && j2 + jM1195aq >= j) {
                        return null;
                    }
                }
                RecyclerView recyclerView3 = this.f40026f;
                AbstractC0806ls abstractC0806ls3 = recyclerView3.f1123m;
                try {
                    adq.m303a("RV CreateView");
                    C0829mo c0829moMo1765d = abstractC0806ls3.mo1765d(recyclerView3, iMo1763b);
                    if (c0829moMo1765d.f41155a.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    c0829moMo1765d.f41160f = iMo1763b;
                    adq.m304b();
                    if (RecyclerView.f1060c && (recyclerViewM1198i = RecyclerView.m1198i(c0829moMo1765d.f41155a)) != null) {
                        c0829moMo1765d.f41156b = new WeakReference(recyclerViewM1198i);
                    }
                    long jM1195aq2 = RecyclerView.m1195aq() - jM1195aq;
                    C0817mc c0817mcM11446i = this.f40027g.m11446i(iMo1763b);
                    c0817mcM11446i.f39911c = ilo.m11436j(c0817mcM11446i.f39911c, jM1195aq2);
                    c0829moM1197h = c0829moMo1765d;
                } catch (Throwable th) {
                    adq.m304b();
                    throw th;
                }
            }
        }
        if (z && !this.f40026f.f1075M.f40922g && c0829moM1197h.m16689p(8192)) {
            c0829moM1197h.m16685l(0, 8192);
            if (this.f40026f.f1075M.f40925j) {
                AbstractC0809lv.m16073o(c0829moM1197h);
                c0829moM1197h.m16676c();
                this.f40026f.m1248ax(c0829moM1197h, AbstractC0809lv.m16075u(c0829moM1197h));
            }
        }
        if (this.f40026f.f1075M.f40922g && c0829moM1197h.m16691r()) {
            c0829moM1197h.f41161g = i;
            z2 = false;
        } else if (!c0829moM1197h.m16691r() || c0829moM1197h.m16698y() || c0829moM1197h.m16692s()) {
            int iM13595b3 = this.f40026f.f1082T.m13595b(i);
            c0829moM1197h.f41172r = null;
            c0829moM1197h.f41171q = this.f40026f;
            int i8 = c0829moM1197h.f41160f;
            long jM1195aq3 = RecyclerView.m1195aq();
            if (j != Long.MAX_VALUE) {
                long j3 = this.f40027g.m11446i(i8).f39912d;
                if (j3 != 0 && j3 + jM1195aq3 >= j) {
                    z2 = false;
                }
            }
            AbstractC0806ls abstractC0806ls4 = this.f40026f.f1123m;
            boolean z4 = c0829moM1197h.f41172r == null;
            if (z4) {
                c0829moM1197h.f41157c = iM13595b3;
                if (abstractC0806ls4.f39115b) {
                    c0829moM1197h.f41159e = abstractC0806ls4.mo1764c(iM13595b3);
                }
                c0829moM1197h.m16685l(1, 519);
                adq.m303a("RV OnBindView");
            }
            c0829moM1197h.f41172r = abstractC0806ls4;
            c0829moM1197h.m16676c();
            abstractC0806ls4.mo1766e(c0829moM1197h, iM13595b3);
            if (z4) {
                c0829moM1197h.m16680g();
                ViewGroup.LayoutParams layoutParams = c0829moM1197h.f41155a.getLayoutParams();
                if (layoutParams instanceof C0813lz) {
                    ((C0813lz) layoutParams).f39587e = true;
                }
                adq.m304b();
            }
            long jM1195aq4 = RecyclerView.m1195aq() - jM1195aq3;
            C0817mc c0817mcM11446i2 = this.f40027g.m11446i(c0829moM1197h.f41160f);
            c0817mcM11446i2.f39912d = ilo.m11436j(c0817mcM11446i2.f39912d, jM1195aq4);
            if (this.f40026f.m1239am()) {
                View view2 = c0829moM1197h.f41155a;
                if (afb.m420a(view2) == 0) {
                    afb.m434o(view2, 1);
                }
                C0831mq c0831mq = this.f40026f.f1079Q;
                if (c0831mq != null) {
                    aei aeiVarMo1780j = c0831mq.mo1780j();
                    if (aeiVarMo1780j instanceof C0830mp) {
                        C0830mp c0830mp = (C0830mp) aeiVarMo1780j;
                        aei aeiVarM541a = afq.m541a(view2);
                        if (aeiVarM541a != null && aeiVarM541a != c0830mp) {
                            c0830mp.f41225b.put(view2, aeiVarM541a);
                        }
                    }
                    afq.m547g(view2, aeiVarMo1780j);
                }
            }
            if (this.f40026f.f1075M.f40922g) {
                c0829moM1197h.f41161g = i;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        ViewGroup.LayoutParams layoutParams2 = c0829moM1197h.f41155a.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParamsGenerateLayoutParams = this.f40026f.generateDefaultLayoutParams();
            c0829moM1197h.f41155a.setLayoutParams(layoutParamsGenerateLayoutParams);
        } else if (this.f40026f.checkLayoutParams(layoutParams2)) {
            layoutParamsGenerateLayoutParams = (C0813lz) layoutParams2;
        } else {
            layoutParamsGenerateLayoutParams = this.f40026f.generateLayoutParams(layoutParams2);
            c0829moM1197h.f41155a.setLayoutParams(layoutParamsGenerateLayoutParams);
        }
        C0813lz c0813lz = (C0813lz) layoutParamsGenerateLayoutParams;
        c0813lz.f39585c = c0829moM1197h;
        if (z && z2) {
            z3 = true;
        }
        c0813lz.f39588f = z3;
        return c0829moM1197h;
    }

    /* JADX INFO: renamed from: p */
    public final ilo m16327p() {
        if (this.f40027g == null) {
            this.f40027g = new ilo();
            m16316e();
        }
        return this.f40027g;
    }
}
