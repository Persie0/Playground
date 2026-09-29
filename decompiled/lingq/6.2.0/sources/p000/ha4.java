package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ha4 implements jt5, aa4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aa4 f42088a;

    /* JADX INFO: renamed from: b */
    public final LayoutDirection f42089b;

    public ha4(aa4 aa4Var, LayoutDirection layoutDirection) {
        this.f42088a = aa4Var;
        this.f42089b = layoutDirection;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: B */
    public final float mo901B(long j) {
        return this.f42088a.mo901B(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: D0 */
    public final long mo902D0(long j) {
        return this.f42088a.mo902D0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: F0 */
    public final float mo903F0(long j) {
        return this.f42088a.mo903F0(j);
    }

    @Override // p000.jt5
    /* JADX INFO: renamed from: M */
    public final it5 mo1623M(int i, int i2, Map map, vi3 vi3Var, vi3 vi3Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            i54.m13663b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new ga4(i, i2, map, vi3Var);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: N */
    public final long mo904N(float f) {
        return this.f42088a.mo904N(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: T */
    public final float mo905T(int i) {
        return this.f42088a.mo905T(i);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: W */
    public final float mo906W(float f) {
        return this.f42088a.mo906W(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f42088a.mo594a();
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f42088a.mo597d0();
    }

    @Override // p000.aa4
    /* JADX INFO: renamed from: f0 */
    public final boolean mo211f0() {
        return this.f42088a.mo211f0();
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: g0 */
    public final float mo912g0(float f) {
        return this.f42088a.mo912g0(f);
    }

    @Override // p000.aa4
    public final LayoutDirection getLayoutDirection() {
        return this.f42089b;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: q0 */
    public final int mo913q0(long j) {
        return this.f42088a.mo913q0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: u */
    public final long mo914u(float f) {
        return this.f42088a.mo914u(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: v */
    public final long mo915v(long j) {
        return this.f42088a.mo915v(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: w0 */
    public final int mo916w0(float f) {
        return this.f42088a.mo916w0(f);
    }
}
