package p081e0;

import androidx.compose.runtime.ComposerKt;
import dm.C5207g;

/* JADX INFO: renamed from: e0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5316i0<N> implements InterfaceC5299c<N> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5299c<N> f33587a;

    /* JADX INFO: renamed from: b */
    public final int f33588b;

    /* JADX INFO: renamed from: c */
    public int f33589c;

    public C5316i0(InterfaceC5299c<N> interfaceC5299c, int i10) {
        C5207g.m11111f(interfaceC5299c, "applier");
        this.f33587a = interfaceC5299c;
        this.f33588b = i10;
    }

    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: a */
    public final void mo11443a(int i10, N n10) {
        this.f33587a.mo11443a(i10 + (this.f33589c == 0 ? this.f33588b : 0), n10);
    }

    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: b */
    public final void mo11430b(N n10) {
        this.f33589c++;
        this.f33587a.mo11430b(n10);
    }

    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: c */
    public final void mo11444c(int i10, int i11, int i12) {
        int i13 = this.f33589c == 0 ? this.f33588b : 0;
        this.f33587a.mo11444c(i10 + i13, i11 + i13, i12);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.InterfaceC5299c
    public final void clear() {
        ComposerKt.m1687c("Clear is not valid on OffsetApplier".toString());
        throw null;
    }

    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: d */
    public final void mo11445d(int i10, int i11) {
        this.f33587a.mo11445d(i10 + (this.f33589c == 0 ? this.f33588b : 0), i11);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: e */
    public final void mo11431e() {
        int i10 = this.f33589c;
        if (!(i10 > 0)) {
            ComposerKt.m1687c("OffsetApplier up called with no corresponding down".toString());
            throw null;
        }
        this.f33589c = i10 - 1;
        this.f33587a.mo11431e();
    }

    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: f */
    public final void mo11446f(int i10, N n10) {
        this.f33587a.mo11446f(i10 + (this.f33589c == 0 ? this.f33588b : 0), n10);
    }

    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: h */
    public final N mo11432h() {
        return this.f33587a.mo11432h();
    }
}
