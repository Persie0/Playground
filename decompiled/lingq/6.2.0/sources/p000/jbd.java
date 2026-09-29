package p000;

import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.TraversableNode$Companion$TraverseDescendantsAction;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jbd {

    /* JADX INFO: renamed from: a */
    public static p04 f45390a;

    /* JADX INFO: renamed from: a */
    public static final boolean m14379a(ik2 ik2Var, long j) {
        if (!ik2Var.f34837a.f34836I) {
            return false;
        }
        C0353c c0353c = (C0353c) te1.m21979L(ik2Var).f4335a0.f46676d;
        if (!c0353c.f4307n0.f34836I) {
            return false;
        }
        long jMo1671R = c0353c.mo1671R(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo1671R >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo1671R & 4294967295L));
        long j2 = ik2Var.f44220L;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    /* JADX INFO: renamed from: b */
    public static final void m14380b(ik2 ik2Var, hi8 hi8Var) {
        ik2Var.m13987a1(hi8Var);
        ik2Var.m13989c1(hi8Var);
    }

    /* JADX INFO: renamed from: c */
    public static final void m14381c(pba pbaVar, vi3 vi3Var) {
        if (vi3Var.invoke(pbaVar) != TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        qba.m19855g(pbaVar, vi3Var);
    }
}
