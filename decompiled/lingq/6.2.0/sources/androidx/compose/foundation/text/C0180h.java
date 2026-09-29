package androidx.compose.foundation.text;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.AbstractC3393o1;
import p000.C3042gl;
import p000.C3186kj;
import p000.C3304ln;
import p000.C3341mn;
import p000.C3378nn;
import p000.C3419on;
import p000.b16;
import p000.bq1;
import p000.d32;
import p000.dfc;
import p000.dx9;
import p000.e16;
import p000.fe5;
import p000.gd1;
import p000.he5;
import p000.he9;
import p000.ib0;
import p000.ig7;
import p000.nv8;
import p000.p84;
import p000.qh0;
import p000.r41;
import p000.rw9;
import p000.sc9;
import p000.t66;
import p000.tj3;
import p000.u91;
import p000.ui3;
import p000.ui5;
import p000.uw9;
import p000.v56;
import p000.vi3;
import p000.w46;
import p000.we1;
import p000.ww9;
import p000.wx8;
import p000.x18;
import p000.xfa;
import p000.xwc;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.text.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0180h {

    /* JADX INFO: renamed from: a */
    public final t66 f2907a = AbstractC0278f.m1260j(null);

    /* JADX INFO: renamed from: b */
    public C3419on f2908b;

    /* JADX INFO: renamed from: c */
    public final SnapshotStateList f2909c;

    public C0180h(C3419on c3419on) {
        wx8 wx8Var = new wx8(16);
        c3419on.getClass();
        C3341mn c3341mn = new C3341mn(c3419on);
        ArrayList arrayList = c3341mn.f51545c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) wx8Var.invoke(((C3304ln) arrayList.get(i)).m16392a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C3378nn c3378nn = (C3378nn) list.get(i2);
                arrayList3.add(new C3304ln(c3378nn.f52979a, c3378nn.f52980b, c3378nn.f52981c, c3378nn.f52982d));
            }
            u91.m22630w0(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f2908b = c3341mn.m16933h();
        this.f2909c = new SnapshotStateList();
    }

    /* JADX INFO: renamed from: c */
    public static C3378nn m1076c(C3378nn c3378nn, rw9 rw9Var) {
        w46 w46Var = rw9Var.f59976b;
        int iM23742c = w46Var.m23742c(w46Var.f66381f - 1, false);
        if (c3378nn.f52980b < iM23742c) {
            return C3378nn.m17501a(c3378nn, null, Math.min(c3378nn.f52981c, iM23742c), 11);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m1077a(ye1 ye1Var, int i) {
        boolean z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1154651354);
        char c = 2;
        int i2 = (tj3Var.m22124i(this) ? 4 : 2) | i;
        boolean z2 = false;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            C3042gl c3042gl = (C3042gl) tj3Var.m22128k(AbstractC0402n.f4828t);
            C3419on c3419on = this.f2908b;
            List listM18171a = c3419on.m18171a(c3419on.f54604b.length());
            int size = listM18171a.size();
            int i3 = 0;
            while (i3 < size) {
                C3378nn c3378nn = (C3378nn) listM18171a.get(i3);
                int i4 = c3378nn.f52980b;
                Object obj = c3378nn.f52979a;
                if (i4 != c3378nn.f52981c) {
                    tj3Var.m22111b0(725478935);
                    Object objM22097O = tj3Var.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC3393o1.m17729d(tj3Var);
                    }
                    v56 v56Var = (v56) objM22097O;
                    int i5 = 17;
                    e16 e16VarM1406a = AbstractC0309d.m1406a(b16.f7762a, new ui5(i5, this, c3378nn));
                    Object objM22097O2 = tj3Var.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new wx8(i5);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    e16 e16VarM24734G = xwc.m24734G(nv8.m17643c(e16VarM1406a, z2, (vi3) objM22097O2).mo3161g(new dx9(new r41(10, this, c3378nn))), v56Var);
                    ig7.f44091a.getClass();
                    e16 e16VarM10323a = dfc.m10323a(e16VarM24734G, bq1.f8857f);
                    boolean zM22124i = tj3Var.m22124i(this) | tj3Var.m22120g(c3378nn) | tj3Var.m22124i(c3042gl);
                    Object objM22097O3 = tj3Var.m22097O();
                    if (zM22124i || objM22097O3 == p84Var) {
                        objM22097O3 = new uw9(this, c3378nn, c3042gl);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    qh0.m19963a(AbstractC0080f.m816c(e16VarM10323a, v56Var, null, null, (ui3) objM22097O3, 508), tj3Var, 0);
                    fe5 fe5Var = (fe5) obj;
                    ww9 ww9VarMo10312b = fe5Var.mo10312b();
                    if (ww9VarMo10312b == null || (ww9VarMo10312b.f67431a == null && ww9VarMo10312b.f67432b == null && ww9VarMo10312b.f67433c == null && ww9VarMo10312b.f67434d == null)) {
                        z = false;
                        tj3Var.m22111b0(728331710);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(726303039);
                        Object objM22097O4 = tj3Var.m22097O();
                        if (objM22097O4 == p84Var) {
                            objM22097O4 = new he5(v56Var);
                            tj3Var.m22131l0(objM22097O4);
                        }
                        he5 he5Var = (he5) objM22097O4;
                        Object objM22097O5 = tj3Var.m22097O();
                        if (objM22097O5 == p84Var) {
                            objM22097O5 = new TextLinkScope$LinksComposables$1$3$1(he5Var, null);
                            tj3Var.m22131l0(objM22097O5);
                        }
                        d32.m10047k(tj3Var, (zi3) objM22097O5, xfa.f68157a);
                        sc9 sc9Var = he5Var.f42258b;
                        sc9 sc9Var2 = he5Var.f42258b;
                        Boolean boolValueOf = Boolean.valueOf((sc9Var.m21222h() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((sc9Var2.m21222h() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((sc9Var2.m21222h() & 4) != 0);
                        ww9 ww9VarMo10312b2 = fe5Var.mo10312b();
                        he9 he9Var = ww9VarMo10312b2 != null ? ww9VarMo10312b2.f67431a : null;
                        ww9 ww9VarMo10312b3 = fe5Var.mo10312b();
                        he9 he9Var2 = ww9VarMo10312b3 != null ? ww9VarMo10312b3.f67432b : null;
                        ww9 ww9VarMo10312b4 = fe5Var.mo10312b();
                        he9 he9Var3 = ww9VarMo10312b4 != null ? ww9VarMo10312b4.f67433c : null;
                        ww9 ww9VarMo10312b5 = fe5Var.mo10312b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, he9Var, he9Var2, he9Var3, ww9VarMo10312b5 != null ? ww9VarMo10312b5.f67434d : null};
                        boolean zM22124i2 = tj3Var.m22124i(this) | tj3Var.m22120g(c3378nn);
                        Object objM22097O6 = tj3Var.m22097O();
                        if (zM22124i2 || objM22097O6 == p84Var) {
                            objM22097O6 = new ui5(this, c3378nn, he5Var, 18);
                            tj3Var.m22131l0(objM22097O6);
                        }
                        m1078b(objArr, (vi3) objM22097O6, tj3Var, (i2 << 6) & 896);
                        z = false;
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(z);
                } else {
                    z = z2;
                    tj3Var.m22111b0(728345598);
                    tj3Var.m22139q(z);
                }
                i3++;
                z2 = z;
                c = c;
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3186kj(this, i, 23);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1078b(Object[] objArr, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2083052099);
        int i2 = (i & 48) == 0 ? (tj3Var.m22124i(vi3Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(this) ? 256 : 128;
        }
        tj3Var.m22106Y(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (tj3Var.m22116e(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= tj3Var.m22124i(obj) ? 4 : 0;
        }
        tj3Var.m22139q(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(vi3Var);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zM22124i = tj3Var.m22124i(this) | ((i3 & 112) == 32);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ib0(this, vi3Var, i4);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10045j(array, (vi3) objM22097O, tj3Var);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gd1(i, 6, this, objArr, vi3Var);
        }
    }
}
