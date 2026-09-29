package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p083e2.C5359g;
import p083e2.C5362j;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintAnchor {

    /* JADX INFO: renamed from: b */
    public int f4827b;

    /* JADX INFO: renamed from: c */
    public boolean f4828c;

    /* JADX INFO: renamed from: d */
    public final ConstraintWidget f4829d;

    /* JADX INFO: renamed from: e */
    public final Type f4830e;

    /* JADX INFO: renamed from: f */
    public ConstraintAnchor f4831f;

    /* JADX INFO: renamed from: i */
    public SolverVariable f4834i;

    /* JADX INFO: renamed from: a */
    public HashSet<ConstraintAnchor> f4826a = null;

    /* JADX INFO: renamed from: g */
    public int f4832g = 0;

    /* JADX INFO: renamed from: h */
    public int f4833h = Integer.MIN_VALUE;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.ConstraintAnchor$a */
    public static /* synthetic */ class C0728a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4835a;

        static {
            int[] iArr = new int[Type.values().length];
            f4835a = iArr;
            try {
                iArr[Type.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4835a[Type.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4835a[Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4835a[Type.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4835a[Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4835a[Type.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4835a[Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4835a[Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4835a[Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f4829d = constraintWidget;
        this.f4830e = type;
    }

    /* JADX INFO: renamed from: a */
    public final void m2686a(ConstraintAnchor constraintAnchor, int i10) {
        m2687b(constraintAnchor, i10, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2687b(ConstraintAnchor constraintAnchor, int i10, int i11, boolean z10) {
        if (constraintAnchor == null) {
            m2695j();
            return true;
        }
        if (!z10 && !m2694i(constraintAnchor)) {
            return false;
        }
        this.f4831f = constraintAnchor;
        if (constraintAnchor.f4826a == null) {
            constraintAnchor.f4826a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f4831f.f4826a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f4832g = i10;
        this.f4833h = i11;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m2688c(int i10, C5362j c5362j, ArrayList arrayList) {
        HashSet<ConstraintAnchor> hashSet = this.f4826a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                C5359g.m11496a(it.next().f4829d, i10, arrayList, c5362j);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2689d() {
        if (this.f4828c) {
            return this.f4827b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m2690e() {
        ConstraintAnchor constraintAnchor;
        if (this.f4829d.f4881j0 == 8) {
            return 0;
        }
        int i10 = this.f4833h;
        return (i10 == Integer.MIN_VALUE || (constraintAnchor = this.f4831f) == null || constraintAnchor.f4829d.f4881j0 != 8) ? this.f4832g : i10;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public final ConstraintAnchor m2691f() {
        int[] iArr = C0728a.f4835a;
        Type type = this.f4830e;
        int i10 = iArr[type.ordinal()];
        ConstraintWidget constraintWidget = this.f4829d;
        switch (i10) {
            case 1:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                return null;
            case 2:
                return constraintWidget.f4848M;
            case 3:
                return constraintWidget.f4846K;
            case 4:
                return constraintWidget.f4849N;
            case 5:
                return constraintWidget.f4847L;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2692g() {
        HashSet<ConstraintAnchor> hashSet = this.f4826a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m2691f().m2693h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2693h() {
        return this.f4831f != null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m2694i(ConstraintAnchor constraintAnchor) {
        boolean z10 = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type type = this.f4830e;
        ConstraintWidget constraintWidget = constraintAnchor.f4829d;
        Type type2 = constraintAnchor.f4830e;
        if (type2 == type) {
            return type != Type.BASELINE || (constraintWidget.f4841F && this.f4829d.f4841F);
        }
        switch (C0728a.f4835a[type.ordinal()]) {
            case 1:
                if (type2 != Type.BASELINE && type2 != Type.CENTER_X && type2 != Type.CENTER_Y) {
                    z10 = true;
                }
                return z10;
            case 2:
            case 3:
                boolean z11 = type2 == Type.LEFT || type2 == Type.RIGHT;
                if (constraintWidget instanceof C0740f) {
                    z11 = z11 || type2 == Type.CENTER_X;
                }
                return z11;
            case 4:
            case 5:
                boolean z12 = type2 == Type.TOP || type2 == Type.BOTTOM;
                if (constraintWidget instanceof C0740f) {
                    z12 = z12 || type2 == Type.CENTER_Y;
                }
                return z12;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return (type2 == Type.LEFT || type2 == Type.RIGHT) ? false : true;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2695j() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f4831f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f4826a) != null) {
            hashSet.remove(this);
            if (this.f4831f.f4826a.size() == 0) {
                this.f4831f.f4826a = null;
            }
        }
        this.f4826a = null;
        this.f4831f = null;
        this.f4832g = 0;
        this.f4833h = Integer.MIN_VALUE;
        this.f4828c = false;
        this.f4827b = 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m2696k() {
        SolverVariable solverVariable = this.f4834i;
        if (solverVariable == null) {
            this.f4834i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.m2641g();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2697l(int i10) {
        this.f4827b = i10;
        this.f4828c = true;
    }

    public final String toString() {
        return this.f4829d.f4885l0 + ":" + this.f4830e.toString();
    }
}
