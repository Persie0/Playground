package p267n0;

import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.NestedReadonlySnapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import sl.C9072e;

/* JADX INFO: renamed from: n0.a */
/* JADX INFO: loaded from: classes.dex */
public class C7670a extends AbstractC0497b {

    /* JADX INFO: renamed from: e */
    public final InterfaceC2052l<Object, C9072e> f42151e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2052l<Object, C9072e> f42152f;

    /* JADX INFO: renamed from: g */
    public Set<InterfaceC7690u> f42153g;

    /* JADX INFO: renamed from: h */
    public SnapshotIdSet f42154h;

    /* JADX INFO: renamed from: i */
    public int[] f42155i;

    /* JADX INFO: renamed from: j */
    public int f42156j;

    /* JADX INFO: renamed from: k */
    public boolean f42157k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7670a(int i10, SnapshotIdSet snapshotIdSet, InterfaceC2052l<Object, C9072e> interfaceC2052l, InterfaceC2052l<Object, C9072e> interfaceC2052l2) {
        super(i10, snapshotIdSet);
        C5207g.m11111f(snapshotIdSet, "invalid");
        this.f42151e = interfaceC2052l;
        this.f42152f = interfaceC2052l2;
        this.f42154h = SnapshotIdSet.f3249e;
        this.f42155i = new int[0];
        this.f42156j = 1;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: b */
    public final void mo1917b() {
        SnapshotKt.f3263d = SnapshotKt.f3263d.m1878f(mo1918d()).m1877a(this.f42154h);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: c */
    public void mo1866c() {
        if (!this.f3314c) {
            super.mo1866c();
            mo1868k(this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: f */
    public final InterfaceC2052l<Object, C9072e> mo1873f() {
        return this.f42151e;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: g */
    public boolean mo1874g() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: h */
    public final InterfaceC2052l<Object, C9072e> mo1875h() {
        return this.f42152f;
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: j */
    public void mo1867j(AbstractC0497b abstractC0497b) {
        C5207g.m11111f(abstractC0497b, "snapshot");
        this.f42156j++;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: k */
    public void mo1868k(AbstractC0497b abstractC0497b) {
        C5207g.m11111f(abstractC0497b, "snapshot");
        int i10 = this.f42156j;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i11 = i10 - 1;
        this.f42156j = i11;
        if (i11 != 0 || this.f42157k) {
            return;
        }
        Set<InterfaceC7690u> setMo15270u = mo15270u();
        if (setMo15270u != null) {
            if (!(true ^ this.f42157k)) {
                throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
            }
            mo15273x(null);
            int iMo1918d = mo1918d();
            Iterator<InterfaceC7690u> it = setMo15270u.iterator();
            while (it.hasNext()) {
                for (AbstractC7691v abstractC7691vMo1698l = it.next().mo1698l(); abstractC7691vMo1698l != null; abstractC7691vMo1698l = abstractC7691vMo1698l.f42189b) {
                    int i12 = abstractC7691vMo1698l.f42188a;
                    if (i12 == iMo1918d || C6752c.m13415I(this.f42154h, Integer.valueOf(i12))) {
                        abstractC7691vMo1698l.f42188a = 0;
                    }
                }
            }
        }
        m1916a();
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: l */
    public void mo1869l() {
        if (!this.f42157k) {
            if (this.f3314c) {
            } else {
                m15269s();
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: m */
    public void mo1876m(InterfaceC7690u interfaceC7690u) {
        C5207g.m11111f(interfaceC7690u, "state");
        HashSet hashSetMo15270u = mo15270u();
        if (hashSetMo15270u == null) {
            hashSetMo15270u = new HashSet();
            mo15273x(hashSetMo15270u);
        }
        hashSetMo15270u.add(interfaceC7690u);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: n */
    public final void mo1921n() {
        int length = this.f42155i.length;
        for (int i10 = 0; i10 < length; i10++) {
            SnapshotKt.m1901t(this.f42155i[i10]);
        }
        int i11 = this.f3315d;
        if (i11 >= 0) {
            SnapshotKt.m1901t(i11);
            this.f3315d = -1;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.compose.runtime.snapshots.AbstractC0497b
    /* JADX INFO: renamed from: r */
    public AbstractC0497b mo1870r(InterfaceC2052l<Object, C9072e> interfaceC2052l) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        if (!(!this.f3314c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        m15274z();
        int iMo1918d = mo1918d();
        m15272w(mo1918d());
        Object obj = SnapshotKt.f3262c;
        synchronized (obj) {
            try {
                int i10 = SnapshotKt.f3264e;
                SnapshotKt.f3264e = i10 + 1;
                SnapshotKt.f3263d = SnapshotKt.f3263d.m1881l(i10);
                nestedReadonlySnapshot = new NestedReadonlySnapshot(i10, SnapshotKt.m1886e(iMo1918d + 1, i10, mo1919e()), interfaceC2052l, this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f42157k && !this.f3314c) {
            int iMo1918d2 = mo1918d();
            synchronized (obj) {
                int i11 = SnapshotKt.f3264e;
                SnapshotKt.f3264e = i11 + 1;
                mo1922p(i11);
                SnapshotKt.f3263d = SnapshotKt.f3263d.m1881l(mo1918d());
                C9072e c9072e = C9072e.f47360a;
            }
            mo1923q(SnapshotKt.m1886e(iMo1918d2 + 1, mo1918d(), mo1919e()));
        }
        return nestedReadonlySnapshot;
    }

    /* JADX INFO: renamed from: s */
    public final void m15269s() {
        m15272w(mo1918d());
        C9072e c9072e = C9072e.f47360a;
        if (this.f42157k || this.f3314c) {
            return;
        }
        int iMo1918d = mo1918d();
        synchronized (SnapshotKt.f3262c) {
            try {
                int i10 = SnapshotKt.f3264e;
                SnapshotKt.f3264e = i10 + 1;
                mo1922p(i10);
                SnapshotKt.f3263d = SnapshotKt.f3263d.m1881l(mo1918d());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        mo1923q(SnapshotKt.m1886e(iMo1918d + 1, mo1918d(), mo1919e()));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t */
    public AbstractC7674e mo1871t() {
        HashMap mapM1884c;
        Pair pair;
        Set<InterfaceC7690u> setMo15270u = mo15270u();
        if (setMo15270u != null) {
            AtomicReference<GlobalSnapshot> atomicReference = SnapshotKt.f3268i;
            GlobalSnapshot globalSnapshot = atomicReference.get();
            C5207g.m11110e(globalSnapshot, "currentGlobalSnapshot.get()");
            mapM1884c = SnapshotKt.m1884c(globalSnapshot, this, SnapshotKt.f3263d.m1878f(atomicReference.get().f3313b));
        } else {
            mapM1884c = null;
        }
        synchronized (SnapshotKt.f3262c) {
            SnapshotKt.m1885d(this);
            boolean z10 = true;
            if (setMo15270u == null || setMo15270u.size() == 0) {
                mo1917b();
                GlobalSnapshot globalSnapshot2 = SnapshotKt.f3268i.get();
                C5207g.m11110e(globalSnapshot2, "previousGlobalSnapshot");
                SnapshotKt.m1902u(globalSnapshot2, SnapshotKt.f3260a);
                Set<InterfaceC7690u> set = globalSnapshot2.f42153g;
                pair = (set == null || !(set.isEmpty() ^ true)) ? new Pair(EmptyList.f38032a, null) : new Pair(C6752c.m13454v0(SnapshotKt.f3266g), set);
            } else {
                GlobalSnapshot globalSnapshot3 = SnapshotKt.f3268i.get();
                AbstractC7674e abstractC7674eM15271v = m15271v(SnapshotKt.f3264e, mapM1884c, SnapshotKt.f3263d.m1878f(globalSnapshot3.f3313b));
                if (!C5207g.m11106a(abstractC7674eM15271v, AbstractC7674e.b.f42162a)) {
                    return abstractC7674eM15271v;
                }
                mo1917b();
                SnapshotKt.m1902u(globalSnapshot3, SnapshotKt.f3260a);
                Set<InterfaceC7690u> set2 = globalSnapshot3.f42153g;
                mo15273x(null);
                globalSnapshot3.f42153g = null;
                pair = new Pair(C6752c.m13454v0(SnapshotKt.f3266g), set2);
            }
            List list = (List) pair.f38012a;
            Set set3 = (Set) pair.f38013b;
            this.f42157k = true;
            if (!(set3 == null || set3.isEmpty())) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC2056p) list.get(i10)).mo1337m0(set3, this);
                }
            }
            if (setMo15270u != null && !setMo15270u.isEmpty()) {
                z10 = false;
            }
            if (!z10) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((InterfaceC2056p) list.get(i11)).mo1337m0(setMo15270u, this);
                }
            }
            synchronized (SnapshotKt.f3262c) {
                try {
                    mo1921n();
                    if (set3 != null) {
                        Iterator it = set3.iterator();
                        while (it.hasNext()) {
                            SnapshotKt.m1897p((InterfaceC7690u) it.next());
                        }
                    }
                    if (setMo15270u != null) {
                        Iterator<T> it2 = setMo15270u.iterator();
                        while (it2.hasNext()) {
                            SnapshotKt.m1897p((InterfaceC7690u) it2.next());
                        }
                        C9072e c9072e = C9072e.f47360a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return AbstractC7674e.b.f42162a;
        }
    }

    /* JADX INFO: renamed from: u */
    public Set<InterfaceC7690u> mo15270u() {
        return this.f42153g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public final AbstractC7674e m15271v(int i10, HashMap map, SnapshotIdSet snapshotIdSet) {
        AbstractC7691v abstractC7691vM1899r;
        AbstractC7691v abstractC7691vMo11474C;
        C5207g.m11111f(snapshotIdSet, "invalidSnapshots");
        SnapshotIdSet snapshotIdSetM1880i = mo1919e().m1881l(mo1918d()).m1880i(this.f42154h);
        Set<InterfaceC7690u> setMo15270u = mo15270u();
        C5207g.m11108c(setMo15270u);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (InterfaceC7690u interfaceC7690u : setMo15270u) {
            AbstractC7691v abstractC7691vMo1698l = interfaceC7690u.mo1698l();
            AbstractC7691v abstractC7691vM1899r2 = SnapshotKt.m1899r(abstractC7691vMo1698l, i10, snapshotIdSet);
            if (abstractC7691vM1899r2 != null && (abstractC7691vM1899r = SnapshotKt.m1899r(abstractC7691vMo1698l, mo1918d(), snapshotIdSetM1880i)) != null && !C5207g.m11106a(abstractC7691vM1899r2, abstractC7691vM1899r)) {
                AbstractC7691v abstractC7691vM1899r3 = SnapshotKt.m1899r(abstractC7691vMo1698l, mo1918d(), mo1919e());
                if (abstractC7691vM1899r3 == null) {
                    SnapshotKt.m1898q();
                    throw null;
                }
                if (map == null || (abstractC7691vMo11474C = (AbstractC7691v) map.get(abstractC7691vM1899r2)) == null) {
                    abstractC7691vMo11474C = interfaceC7690u.mo11474C(abstractC7691vM1899r, abstractC7691vM1899r2, abstractC7691vM1899r3);
                }
                if (abstractC7691vMo11474C == null) {
                    return new AbstractC7674e.a(this);
                }
                if (!C5207g.m11106a(abstractC7691vMo11474C, abstractC7691vM1899r3)) {
                    if (C5207g.m11106a(abstractC7691vMo11474C, abstractC7691vM1899r2)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new Pair(interfaceC7690u, abstractC7691vM1899r2.mo1701b()));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(interfaceC7690u);
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(!C5207g.m11106a(abstractC7691vMo11474C, abstractC7691vM1899r) ? new Pair(interfaceC7690u, abstractC7691vMo11474C) : new Pair(interfaceC7690u, abstractC7691vM1899r.mo1701b()));
                    }
                }
            }
        }
        if (arrayList != null) {
            m15269s();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Pair pair = (Pair) arrayList.get(i11);
                InterfaceC7690u interfaceC7690u2 = (InterfaceC7690u) pair.f38012a;
                AbstractC7691v abstractC7691v = (AbstractC7691v) pair.f38013b;
                abstractC7691v.f42188a = mo1918d();
                synchronized (SnapshotKt.f3262c) {
                    abstractC7691v.f42189b = interfaceC7690u2.mo1698l();
                    interfaceC7690u2.mo1699q(abstractC7691v);
                    C9072e c9072e = C9072e.f47360a;
                }
            }
        }
        if (arrayList2 != null) {
            setMo15270u.removeAll(arrayList2);
        }
        return AbstractC7674e.b.f42162a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public final void m15272w(int i10) {
        synchronized (SnapshotKt.f3262c) {
            try {
                this.f42154h = this.f42154h.m1881l(i10);
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void mo15273x(HashSet hashSet) {
        this.f42153g = hashSet;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: y */
    public C7670a mo1872y(InterfaceC2052l<Object, C9072e> interfaceC2052l, InterfaceC2052l<Object, C9072e> interfaceC2052l2) {
        C7671b c7671b;
        if (!(!this.f3314c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
        m15274z();
        m15272w(mo1918d());
        Object obj = SnapshotKt.f3262c;
        synchronized (obj) {
            try {
                int i10 = SnapshotKt.f3264e;
                SnapshotKt.f3264e = i10 + 1;
                SnapshotKt.f3263d = SnapshotKt.f3263d.m1881l(i10);
                SnapshotIdSet snapshotIdSetMo1919e = mo1919e();
                mo1923q(snapshotIdSetMo1919e.m1881l(i10));
                c7671b = new C7671b(i10, SnapshotKt.m1886e(mo1918d() + 1, i10, snapshotIdSetMo1919e), SnapshotKt.m1892k(interfaceC2052l, this.f42151e, true), SnapshotKt.m1883b(interfaceC2052l2, this.f42152f), this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f42157k && !this.f3314c) {
            int iMo1918d = mo1918d();
            synchronized (obj) {
                try {
                    int i11 = SnapshotKt.f3264e;
                    SnapshotKt.f3264e = i11 + 1;
                    mo1922p(i11);
                    SnapshotKt.f3263d = SnapshotKt.f3263d.m1881l(mo1918d());
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            mo1923q(SnapshotKt.m1886e(iMo1918d + 1, mo1918d(), mo1919e()));
        }
        return c7671b;
    }

    /* JADX INFO: renamed from: z */
    public final void m15274z() {
        boolean z10 = true;
        if (this.f42157k) {
            if (!(this.f3315d >= 0)) {
                z10 = false;
            }
        }
        if (!z10) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }
}
