package p000;

import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlinx.coroutines.CoroutineStart;
import p000.wfb;
import p000.xm1;

/* JADX INFO: loaded from: classes.dex */
public final class faa {

    /* JADX INFO: renamed from: a */
    public final w66 f38735a;

    /* JADX INFO: renamed from: b */
    public final faa f38736b;

    /* JADX INFO: renamed from: c */
    public final String f38737c;

    /* JADX INFO: renamed from: d */
    public final t66 f38738d = AbstractC0278f.m1260j(m11669c());

    /* JADX INFO: renamed from: e */
    public final t66 f38739e = AbstractC0278f.m1260j(new aaa(m11669c(), m11669c()));

    /* JADX INFO: renamed from: f */
    public final uc9 f38740f = AbstractC0278f.m1258h(0);

    /* JADX INFO: renamed from: g */
    public final uc9 f38741g = AbstractC0278f.m1258h(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h */
    public final t66 f38742h;

    /* JADX INFO: renamed from: i */
    public final SnapshotStateList f38743i;

    /* JADX INFO: renamed from: j */
    public final SnapshotStateList f38744j;

    /* JADX INFO: renamed from: k */
    public final t66 f38745k;

    public faa(w66 w66Var, faa faaVar, String str) {
        this.f38735a = w66Var;
        this.f38736b = faaVar;
        this.f38737c = str;
        Boolean bool = Boolean.FALSE;
        this.f38742h = AbstractC0278f.m1260j(bool);
        this.f38743i = new SnapshotStateList();
        this.f38744j = new SnapshotStateList();
        this.f38745k = AbstractC0278f.m1260j(bool);
        AbstractC0278f.m1254d(new u73(this, 2));
        w66Var.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m11667a(Object obj, ye1 ye1Var, int i) {
        int i2;
        Object obj2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tj3Var.m22120g(obj) : tj3Var.m22124i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(this) ? 32 : 16;
        }
        int i3 = 1;
        if (!tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22102U();
        } else if (m11673g()) {
            tj3Var.m22111b0(467722849);
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22111b0(466062241);
            m11677k(obj);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            Object obj3 = objM22097O;
            if (z || objM22097O == p84Var) {
                gc2 gc2VarM1254d = AbstractC0278f.m1254d(new u73(this, i3));
                tj3Var.m22131l0(gc2VarM1254d);
                obj3 = gc2VarM1254d;
            }
            if (((Boolean) ((dh9) obj3).getValue()).booleanValue()) {
                tj3Var.m22111b0(466470356);
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    obj2 = objM22097O2;
                    un1 un1VarM10013K = d32.m10013K(tj3Var);
                    tj3Var.m22131l0(un1VarM10013K);
                    obj2 = un1VarM10013K;
                }
                obj2 = objM22097O2;
                final un1 un1Var = (un1) obj2;
                int i5 = (tj3Var.m22124i(un1Var) ? 1 : 0) | (i4 != 32 ? 0 : 1);
                Object objM22097O3 = tj3Var.m22097O();
                Object obj4 = objM22097O3;
                if (i5 != 0 || objM22097O3 == p84Var) {
                    vi3 vi3Var = new vi3() { // from class: androidx.compose.animation.core.f
                        @Override // p000.vi3
                        public final Object invoke(Object obj5) {
                            wfb.m23926u(un1Var, null, CoroutineStart.UNDISPATCHED, new Transition$animateTo$1$1$1(this, null), 1);
                            return new xm1(1);
                        }
                    };
                    tj3Var.m22131l0(vi3Var);
                    obj4 = vi3Var;
                }
                d32.m10043i(un1Var, this, (vi3) obj4, tj3Var);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(467712929);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3504qn(this, i, 14, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final long m11668b() {
        SnapshotStateList snapshotStateList = this.f38743i;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((baa) snapshotStateList.get(i)).f8249j.m22673h());
        }
        SnapshotStateList snapshotStateList2 = this.f38744j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((faa) snapshotStateList2.get(i2)).m11668b());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: c */
    public final Object m11669c() {
        return ((xc9) this.f38735a.f66457b).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final boolean m11670d() {
        SnapshotStateList snapshotStateList = this.f38743i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((baa) snapshotStateList.get(i)).getClass();
        }
        SnapshotStateList snapshotStateList2 = this.f38744j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((faa) snapshotStateList2.get(i2)).m11670d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final long m11671e() {
        faa faaVar = this.f38736b;
        return faaVar != null ? faaVar.m11671e() : this.f38740f.m22673h();
    }

    /* JADX INFO: renamed from: f */
    public final z9a m11672f() {
        return (z9a) ((xc9) this.f38739e).getValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11673g() {
        return ((Boolean) ((xc9) this.f38745k).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m11674h(long j, boolean z) {
        uc9 uc9Var = this.f38741g;
        long jM22673h = uc9Var.m22673h();
        w66 w66Var = this.f38735a;
        if (jM22673h == Long.MIN_VALUE) {
            uc9Var.m22674i(j);
            ((xc9) w66Var.f66456a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((xc9) w66Var.f66456a).getValue()).booleanValue()) {
            ((xc9) w66Var.f66456a).setValue(Boolean.TRUE);
        }
        ((xc9) this.f38742h).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.f38743i;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            baa baaVar = (baa) snapshotStateList.get(i);
            t66 t66Var = baaVar.f8244e;
            t66 t66Var2 = baaVar.f8244e;
            if (!((Boolean) ((xc9) t66Var).getValue()).booleanValue()) {
                long jMo10818c = z ? baaVar.m3533c().mo10818c() : j;
                ((xc9) baaVar.f8247h).setValue(baaVar.m3533c().mo10821g(jMo10818c));
                baaVar.f8248i = baaVar.m3533c().mo10820e(jMo10818c);
                if (baaVar.m3533c().m21452f(jMo10818c)) {
                    ((xc9) t66Var2).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((xc9) t66Var2).getValue()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.f38744j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            faa faaVar = (faa) snapshotStateList2.get(i2);
            if (!fa4.m11650l(((xc9) faaVar.f38738d).getValue(), faaVar.m11669c())) {
                faaVar.m11674h(j, z);
            }
            if (!fa4.m11650l(((xc9) faaVar.f38738d).getValue(), faaVar.m11669c())) {
                z2 = false;
            }
        }
        if (z2) {
            m11675i();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11675i() {
        this.f38741g.m22674i(Long.MIN_VALUE);
        w66 w66Var = this.f38735a;
        if (w66Var instanceof w66) {
            ((xc9) w66Var.f66457b).setValue(((xc9) this.f38738d).getValue());
        }
        if (this.f38736b == null) {
            this.f38740f.m22674i(0L);
        }
        ((xc9) w66Var.f66456a).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.f38744j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((faa) snapshotStateList.get(i)).m11675i();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m11676j(Object obj, Object obj2) {
        this.f38741g.m22674i(Long.MIN_VALUE);
        w66 w66Var = this.f38735a;
        ((xc9) w66Var.f66456a).setValue(Boolean.FALSE);
        boolean zM11673g = m11673g();
        t66 t66Var = this.f38738d;
        if (!zM11673g || !fa4.m11650l(m11669c(), obj) || !fa4.m11650l(((xc9) t66Var).getValue(), obj2)) {
            if (!fa4.m11650l(m11669c(), obj) && (w66Var instanceof w66)) {
                ((xc9) w66Var.f66457b).setValue(obj);
            }
            ((xc9) t66Var).setValue(obj2);
            ((xc9) this.f38745k).setValue(Boolean.TRUE);
            ((xc9) this.f38739e).setValue(new aaa(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.f38744j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            faa faaVar = (faa) snapshotStateList.get(i);
            faaVar.getClass();
            if (faaVar.m11673g()) {
                faaVar.m11676j(faaVar.m11669c(), ((xc9) faaVar.f38738d).getValue());
            }
        }
        SnapshotStateList snapshotStateList2 = this.f38743i;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((baa) snapshotStateList2.get(i2)).m3535e();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11677k(Object obj) {
        t66 t66Var = this.f38738d;
        xc9 xc9Var = (xc9) t66Var;
        if (fa4.m11650l(xc9Var.getValue(), obj)) {
            return;
        }
        ((xc9) this.f38739e).setValue(new aaa(xc9Var.getValue(), obj));
        if (!fa4.m11650l(m11669c(), xc9Var.getValue())) {
            ((xc9) this.f38735a.f66457b).setValue(xc9Var.getValue());
        }
        ((xc9) t66Var).setValue(obj);
        if (this.f38741g.m22673h() == Long.MIN_VALUE) {
            ((xc9) this.f38742h).setValue(Boolean.TRUE);
        }
        SnapshotStateList snapshotStateList = this.f38743i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((baa) snapshotStateList.get(i)).f8245f.m19862i(-2.0f);
        }
    }

    public final String toString() {
        SnapshotStateList snapshotStateList = this.f38743i;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((baa) snapshotStateList.get(i)) + ", ";
        }
        return str;
    }
}
