package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: renamed from: xe */
/* JADX INFO: loaded from: classes2.dex */
public final class C3756xe implements ph7 {

    /* JADX INFO: renamed from: a */
    public final gc0 f68112a;

    /* JADX INFO: renamed from: b */
    public final long f68113b;

    public C3756xe(gc0 gc0Var, long j) {
        this.f68112a = gc0Var;
        this.f68113b = j;
    }

    @Override // p000.ph7
    /* JADX INFO: renamed from: f */
    public final long mo12788f(j84 j84Var, long j, LayoutDirection layoutDirection, long j2) {
        long jM14324d = (((long) j84Var.m14324d()) << 32) | (((long) j84Var.m14322b()) & 4294967295L);
        gc0 gc0Var = this.f68112a;
        long jMo10276a = gc0Var.mo10276a(0L, jM14324d, layoutDirection);
        long jMo10276a2 = gc0Var.mo10276a(0L, j2, layoutDirection);
        long j3 = (((long) (-((int) (jMo10276a2 >> 32)))) << 32) | (((long) (-((int) (jMo10276a2 & 4294967295L)))) & 4294967295L);
        long j4 = this.f68113b;
        return f84.m11595d(f84.m11595d(f84.m11595d(j84Var.m14323c(), jMo10276a), j3), (((long) (((int) (j4 >> 32)) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1))) << 32) | (((long) ((int) (j4 & 4294967295L))) & 4294967295L));
    }
}
