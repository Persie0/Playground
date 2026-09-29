package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes3.dex */
public final class y4a implements ph7 {

    /* JADX INFO: renamed from: a */
    public final e28 f69287a;

    /* JADX INFO: renamed from: b */
    public final float f69288b;

    /* JADX INFO: renamed from: c */
    public final float f69289c;

    /* JADX INFO: renamed from: d */
    public final boolean f69290d;

    public y4a(e28 e28Var, float f, float f2, boolean z) {
        e28Var.getClass();
        this.f69287a = e28Var;
        this.f69288b = f;
        this.f69289c = f2;
        this.f69290d = z;
    }

    @Override // p000.ph7
    /* JADX INFO: renamed from: f */
    public final long mo12788f(j84 j84Var, long j, LayoutDirection layoutDirection, long j2) {
        j84Var.getClass();
        layoutDirection.getClass();
        float f = this.f69288b;
        boolean z = this.f69290d;
        e28 e28Var = this.f69287a;
        return (((long) ((int) (z ? e28Var.f36623d + f : (e28Var.f36621b - f) - ((int) (j2 & 4294967295L))))) & 4294967295L) | (((long) ((int) this.f69289c)) << 32);
    }
}
