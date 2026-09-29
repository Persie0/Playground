package p000;

import androidx.constraintlayout.core.SolverVariable$Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bj1 {

    /* JADX INFO: renamed from: b */
    public int f8578b;

    /* JADX INFO: renamed from: c */
    public boolean f8579c;

    /* JADX INFO: renamed from: d */
    public final vj1 f8580d;

    /* JADX INFO: renamed from: e */
    public final ConstraintAnchor$Type f8581e;

    /* JADX INFO: renamed from: f */
    public bj1 f8582f;

    /* JADX INFO: renamed from: i */
    public rd9 f8585i;

    /* JADX INFO: renamed from: a */
    public HashSet f8577a = null;

    /* JADX INFO: renamed from: g */
    public int f8583g = 0;

    /* JADX INFO: renamed from: h */
    public int f8584h = Integer.MIN_VALUE;

    public bj1(vj1 vj1Var, ConstraintAnchor$Type constraintAnchor$Type) {
        this.f8580d = vj1Var;
        this.f8581e = constraintAnchor$Type;
    }

    /* JADX INFO: renamed from: a */
    public final void m3757a(bj1 bj1Var, int i) {
        m3758b(bj1Var, i, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3758b(bj1 bj1Var, int i, int i2, boolean z) {
        if (bj1Var == null) {
            m3766j();
            return true;
        }
        if (!z && !m3765i(bj1Var)) {
            return false;
        }
        this.f8582f = bj1Var;
        if (bj1Var.f8577a == null) {
            bj1Var.f8577a = new HashSet();
        }
        HashSet hashSet = this.f8582f.f8577a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f8583g = i;
        this.f8584h = i2;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m3759c(int i, k4b k4bVar, ArrayList arrayList) {
        HashSet hashSet = this.f8577a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                bna.m3923L(((bj1) it.next()).f8580d, i, arrayList, k4bVar);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m3760d() {
        if (this.f8579c) {
            return this.f8578b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m3761e() {
        bj1 bj1Var;
        if (this.f8580d.f65473h0 == 8) {
            return 0;
        }
        int i = this.f8584h;
        return (i == Integer.MIN_VALUE || (bj1Var = this.f8582f) == null || bj1Var.f8580d.f65473h0 != 8) ? this.f8583g : i;
    }

    /* JADX INFO: renamed from: f */
    public final bj1 m3762f() {
        ConstraintAnchor$Type constraintAnchor$Type = this.f8581e;
        int iOrdinal = constraintAnchor$Type.ordinal();
        vj1 vj1Var = this.f8580d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return vj1Var.f65442K;
            case 2:
                return vj1Var.f65443L;
            case 3:
                return vj1Var.f65440I;
            case 4:
                return vj1Var.f65441J;
            default:
                throw new AssertionError(constraintAnchor$Type.name());
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3763g() {
        HashSet hashSet = this.f8577a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((bj1) it.next()).m3762f().m3764h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3764h() {
        return this.f8582f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x0072 A[RETURN] */
    /* JADX INFO: renamed from: i */
    public final boolean m3765i(bj1 bj1Var) {
        if (bj1Var != null) {
            vj1 vj1Var = bj1Var.f8580d;
            ConstraintAnchor$Type constraintAnchor$Type = bj1Var.f8581e;
            ConstraintAnchor$Type constraintAnchor$Type2 = this.f8581e;
            if (constraintAnchor$Type != constraintAnchor$Type2) {
                switch (constraintAnchor$Type2) {
                    case NONE:
                    case CENTER_X:
                    case CENTER_Y:
                        break;
                    case LEFT:
                    case RIGHT:
                        boolean z = constraintAnchor$Type == ConstraintAnchor$Type.LEFT || constraintAnchor$Type == ConstraintAnchor$Type.RIGHT;
                        if (!(vj1Var instanceof gq3)) {
                            return z;
                        }
                        if (z || constraintAnchor$Type == ConstraintAnchor$Type.CENTER_X) {
                            return true;
                        }
                        break;
                    case TOP:
                    case BOTTOM:
                        boolean z2 = constraintAnchor$Type == ConstraintAnchor$Type.TOP || constraintAnchor$Type == ConstraintAnchor$Type.BOTTOM;
                        if (!(vj1Var instanceof gq3)) {
                            return z2;
                        }
                        if (z2 || constraintAnchor$Type == ConstraintAnchor$Type.CENTER_Y) {
                            return true;
                        }
                        break;
                    case BASELINE:
                        if (constraintAnchor$Type != ConstraintAnchor$Type.LEFT && constraintAnchor$Type != ConstraintAnchor$Type.RIGHT) {
                            return true;
                        }
                        break;
                    case CENTER:
                        if (constraintAnchor$Type != ConstraintAnchor$Type.BASELINE && constraintAnchor$Type != ConstraintAnchor$Type.CENTER_X && constraintAnchor$Type != ConstraintAnchor$Type.CENTER_Y) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(constraintAnchor$Type2.name());
                }
            } else if (constraintAnchor$Type2 != ConstraintAnchor$Type.BASELINE || (vj1Var.f65436E && this.f8580d.f65436E)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m3766j() {
        HashSet hashSet;
        bj1 bj1Var = this.f8582f;
        if (bj1Var != null && (hashSet = bj1Var.f8577a) != null) {
            hashSet.remove(this);
            if (this.f8582f.f8577a.size() == 0) {
                this.f8582f.f8577a = null;
            }
        }
        this.f8577a = null;
        this.f8582f = null;
        this.f8583g = 0;
        this.f8584h = Integer.MIN_VALUE;
        this.f8579c = false;
        this.f8578b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m3767k() {
        rd9 rd9Var = this.f8585i;
        if (rd9Var == null) {
            this.f8585i = new rd9(SolverVariable$Type.UNRESTRICTED);
        } else {
            rd9Var.m20591c();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3768l(int i) {
        this.f8578b = i;
        this.f8579c = true;
    }

    public final String toString() {
        return this.f8580d.f65477j0 + ":" + this.f8581e.toString();
    }
}
