package androidx.compose.p002ui.graphics;

import p000.e16;
import p000.k9a;
import p000.o39;
import p000.q98;
import p000.rp3;
import p000.ss5;
import p000.up4;
import p000.vi3;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0309d {

    /* JADX INFO: renamed from: a */
    public static q98 f3955a;

    /* JADX INFO: renamed from: a */
    public static final e16 m1406a(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new C0305a(vi3Var));
    }

    /* JADX INFO: renamed from: b */
    public static e16 m1407b(e16 e16Var, float f, float f2, float f3, float f4, float f5, long j, o39 o39Var, boolean z, int i) {
        float f6 = (i & 1) != 0 ? 1.0f : f;
        float f7 = (i & 2) != 0 ? 1.0f : f2;
        float f8 = (i & 4) != 0 ? 1.0f : f3;
        float f9 = (i & 32) != 0 ? 0.0f : f4;
        float f10 = (i & 256) != 0 ? 0.0f : f5;
        long j2 = (i & 1024) != 0 ? k9a.f46915b : j;
        o39 o39Var2 = (i & 2048) != 0 ? ss5.f61356d : o39Var;
        boolean z2 = (i & 4096) != 0 ? false : z;
        long j3 = rp3.f59679a;
        return e16Var.mo3161g(new C0307c(f6, f7, f8, f9, f10, j2, o39Var2, z2, j3, j3, (i & 65536) == 0 ? 1 : 0, up4.f64170a));
    }
}
