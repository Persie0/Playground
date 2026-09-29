package p000;

import androidx.compose.p002ui.layout.C0339f;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0361k;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class rq4 implements qm9, jt5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uq4 f59717a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0339f f59718b;

    public rq4(C0339f c0339f) {
        this.f59718b = c0339f;
        this.f59717a = c0339f.f4200h;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: B */
    public final float mo901B(long j) {
        return this.f59717a.mo901B(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: D0 */
    public final long mo902D0(long j) {
        return this.f59717a.mo902D0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: F0 */
    public final float mo903F0(long j) {
        return this.f59717a.mo903F0(j);
    }

    @Override // p000.qm9
    /* JADX INFO: renamed from: J */
    public final List mo20032J(Object obj, zi3 zi3Var) {
        C0339f c0339f = this.f59718b;
        C0357g c0357g = c0339f.f4193a;
        n66 n66Var = c0339f.f4199g;
        C0357g c0357g2 = (C0357g) n66Var.m17255g(obj);
        if (c0357g2 != null && ((x66) ((f66) c0357g.m1603p()).f38520b).m24312j(c0357g2) < c0339f.f4196d) {
            return c0357g2.m1601n();
        }
        n66 n66Var2 = c0339f.f4204l;
        n66 n66Var3 = c0339f.f4202j;
        x66 x66Var = c0339f.f4189H;
        if (x66Var.f67832c < c0339f.f4197e) {
            i54.m13662a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        C0357g c0357g3 = (C0357g) n66Var.m17255g(obj);
        int i = x66Var.f67832c;
        int i2 = c0339f.f4197e;
        if (i == i2) {
            x66Var.m24305c(obj);
        } else {
            Object[] objArr = x66Var.f67830a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        c0339f.f4197e++;
        boolean zM17250b = n66Var3.m17250b(obj);
        if (zM17250b || c0357g3 != null) {
            if (!zM17250b && c0357g3 != null) {
                c0339f.m1504k(((x66) ((f66) c0357g.m1603p()).f38520b).m24312j(c0357g3), ((x66) ((f66) c0357g.m1603p()).f38520b).f67832c);
                c0339f.f4191J++;
                n66Var.m17259k(obj);
                n66Var3.m17261m(obj, c0357g3);
                n66Var2.m17261m(obj, c0339f.m1499f(obj));
                if (c0357g.m1569L()) {
                    c0339f.m1501h();
                }
            }
            C0357g c0357g4 = (C0357g) n66Var3.m17255g(obj);
            sq4 sq4Var = c0357g4 != null ? (sq4) c0339f.f4198f.m17255g(c0357g4) : null;
            if (sq4Var != null && sq4Var.f61240d) {
                c0339f.m1507n(c0357g4, obj, false, zi3Var);
            }
            if ((sq4Var != null ? sq4Var.f61242f : null) != null) {
                c0339f.m1498d(sq4Var, true);
            }
        } else {
            c0339f.m1505l(obj, zi3Var, false);
            n66Var2.m17261m(obj, c0339f.m1499f(obj));
        }
        C0357g c0357g5 = (C0357g) n66Var3.m17255g(obj);
        if (c0357g5 == null) {
            return EmptyList.f47638a;
        }
        List listM1656p0 = c0357g5.f4337b0.f58070p.m1656p0();
        int size = listM1656p0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0361k) ((f66) listM1656p0).get(i3)).f4417f.f58056b = true;
        }
        return listM1656p0;
    }

    @Override // p000.jt5
    /* JADX INFO: renamed from: M */
    public final it5 mo1623M(int i, int i2, Map map, vi3 vi3Var, vi3 vi3Var2) {
        return this.f59717a.mo1623M(i, i2, map, vi3Var, vi3Var2);
    }

    @Override // p000.jt5
    /* JADX INFO: renamed from: M0 */
    public final it5 mo9895M0(int i, int i2, Map map, vi3 vi3Var) {
        return this.f59717a.mo1623M(i, i2, map, null, vi3Var);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: N */
    public final long mo904N(float f) {
        return this.f59717a.mo904N(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: T */
    public final float mo905T(int i) {
        return this.f59717a.mo905T(i);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: W */
    public final float mo906W(float f) {
        return f / this.f59717a.mo594a();
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f59717a.f64211b;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f59717a.f64212c;
    }

    @Override // p000.aa4
    /* JADX INFO: renamed from: f0 */
    public final boolean mo211f0() {
        return this.f59717a.mo211f0();
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: g0 */
    public final float mo912g0(float f) {
        return this.f59717a.mo594a() * f;
    }

    @Override // p000.aa4
    public final LayoutDirection getLayoutDirection() {
        return this.f59717a.f64210a;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: q0 */
    public final int mo913q0(long j) {
        return this.f59717a.mo913q0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: u */
    public final long mo914u(float f) {
        return this.f59717a.mo914u(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: v */
    public final long mo915v(long j) {
        return this.f59717a.mo915v(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: w0 */
    public final int mo916w0(float f) {
        return this.f59717a.mo916w0(f);
    }
}
