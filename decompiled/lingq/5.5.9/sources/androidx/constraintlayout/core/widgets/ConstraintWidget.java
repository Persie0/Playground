package androidx.constraintlayout.core.widgets;

import android.support.v4.media.session.C0166e;
import androidx.constraintlayout.core.C0725b;
import androidx.constraintlayout.core.C0726c;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.C0734c;
import androidx.constraintlayout.core.widgets.analyzer.C0735d;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p003a2.C0009a;
import p023b2.C1292a;
import p083e2.C5355c;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {

    /* JADX INFO: renamed from: A */
    public float f4836A;

    /* JADX INFO: renamed from: B */
    public int f4837B;

    /* JADX INFO: renamed from: C */
    public float f4838C;

    /* JADX INFO: renamed from: D */
    public int[] f4839D;

    /* JADX INFO: renamed from: E */
    public float f4840E;

    /* JADX INFO: renamed from: F */
    public boolean f4841F;

    /* JADX INFO: renamed from: G */
    public boolean f4842G;

    /* JADX INFO: renamed from: H */
    public boolean f4843H;

    /* JADX INFO: renamed from: I */
    public int f4844I;

    /* JADX INFO: renamed from: J */
    public int f4845J;

    /* JADX INFO: renamed from: K */
    public final ConstraintAnchor f4846K;

    /* JADX INFO: renamed from: L */
    public final ConstraintAnchor f4847L;

    /* JADX INFO: renamed from: M */
    public final ConstraintAnchor f4848M;

    /* JADX INFO: renamed from: N */
    public final ConstraintAnchor f4849N;

    /* JADX INFO: renamed from: O */
    public final ConstraintAnchor f4850O;

    /* JADX INFO: renamed from: P */
    public final ConstraintAnchor f4851P;

    /* JADX INFO: renamed from: Q */
    public final ConstraintAnchor f4852Q;

    /* JADX INFO: renamed from: R */
    public final ConstraintAnchor f4853R;

    /* JADX INFO: renamed from: S */
    public final ConstraintAnchor[] f4854S;

    /* JADX INFO: renamed from: T */
    public final ArrayList<ConstraintAnchor> f4855T;

    /* JADX INFO: renamed from: U */
    public final boolean[] f4856U;

    /* JADX INFO: renamed from: V */
    public DimensionBehaviour[] f4857V;

    /* JADX INFO: renamed from: W */
    public ConstraintWidget f4858W;

    /* JADX INFO: renamed from: X */
    public int f4859X;

    /* JADX INFO: renamed from: Y */
    public int f4860Y;

    /* JADX INFO: renamed from: Z */
    public float f4861Z;

    /* JADX INFO: renamed from: a0 */
    public int f4863a0;

    /* JADX INFO: renamed from: b */
    public C5355c f4864b;

    /* JADX INFO: renamed from: b0 */
    public int f4865b0;

    /* JADX INFO: renamed from: c */
    public C5355c f4866c;

    /* JADX INFO: renamed from: c0 */
    public int f4867c0;

    /* JADX INFO: renamed from: d0 */
    public int f4869d0;

    /* JADX INFO: renamed from: e0 */
    public int f4871e0;

    /* JADX INFO: renamed from: f0 */
    public int f4873f0;

    /* JADX INFO: renamed from: g0 */
    public float f4875g0;

    /* JADX INFO: renamed from: h0 */
    public float f4877h0;

    /* JADX INFO: renamed from: i0 */
    public Object f4879i0;

    /* JADX INFO: renamed from: j0 */
    public int f4881j0;

    /* JADX INFO: renamed from: k */
    public String f4882k;

    /* JADX INFO: renamed from: k0 */
    public boolean f4883k0;

    /* JADX INFO: renamed from: l */
    public boolean f4884l;

    /* JADX INFO: renamed from: l0 */
    public String f4885l0;

    /* JADX INFO: renamed from: m */
    public boolean f4886m;

    /* JADX INFO: renamed from: m0 */
    public String f4887m0;

    /* JADX INFO: renamed from: n */
    public boolean f4888n;

    /* JADX INFO: renamed from: n0 */
    public int f4889n0;

    /* JADX INFO: renamed from: o */
    public boolean f4890o;

    /* JADX INFO: renamed from: o0 */
    public int f4891o0;

    /* JADX INFO: renamed from: p */
    public int f4892p;

    /* JADX INFO: renamed from: p0 */
    public final float[] f4893p0;

    /* JADX INFO: renamed from: q */
    public int f4894q;

    /* JADX INFO: renamed from: q0 */
    public final ConstraintWidget[] f4895q0;

    /* JADX INFO: renamed from: r */
    public int f4896r;

    /* JADX INFO: renamed from: r0 */
    public final ConstraintWidget[] f4897r0;

    /* JADX INFO: renamed from: s */
    public int f4898s;

    /* JADX INFO: renamed from: s0 */
    public ConstraintWidget f4899s0;

    /* JADX INFO: renamed from: t */
    public int f4900t;

    /* JADX INFO: renamed from: t0 */
    public ConstraintWidget f4901t0;

    /* JADX INFO: renamed from: u */
    public final int[] f4902u;

    /* JADX INFO: renamed from: u0 */
    public int f4903u0;

    /* JADX INFO: renamed from: v */
    public int f4904v;

    /* JADX INFO: renamed from: v0 */
    public int f4905v0;

    /* JADX INFO: renamed from: w */
    public int f4906w;

    /* JADX INFO: renamed from: x */
    public float f4907x;

    /* JADX INFO: renamed from: y */
    public int f4908y;

    /* JADX INFO: renamed from: z */
    public int f4909z;

    /* JADX INFO: renamed from: a */
    public boolean f4862a = false;

    /* JADX INFO: renamed from: d */
    public C0734c f4868d = null;

    /* JADX INFO: renamed from: e */
    public C0735d f4870e = null;

    /* JADX INFO: renamed from: f */
    public final boolean[] f4872f = {true, true};

    /* JADX INFO: renamed from: g */
    public boolean f4874g = true;

    /* JADX INFO: renamed from: h */
    public final boolean f4876h = true;

    /* JADX INFO: renamed from: i */
    public int f4878i = -1;

    /* JADX INFO: renamed from: j */
    public int f4880j = -1;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$a */
    public static /* synthetic */ class C0729a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4910a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f4911b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            f4911b = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4911b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4911b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4911b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            f4910a = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4910a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4910a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4910a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4910a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4910a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4910a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4910a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4910a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        new HashMap();
        this.f4884l = false;
        this.f4886m = false;
        this.f4888n = false;
        this.f4890o = false;
        this.f4892p = -1;
        this.f4894q = -1;
        this.f4896r = 0;
        this.f4898s = 0;
        this.f4900t = 0;
        this.f4902u = new int[2];
        this.f4904v = 0;
        this.f4906w = 0;
        this.f4907x = 1.0f;
        this.f4908y = 0;
        this.f4909z = 0;
        this.f4836A = 1.0f;
        this.f4837B = -1;
        this.f4838C = 1.0f;
        this.f4839D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f4840E = 0.0f;
        this.f4841F = false;
        this.f4843H = false;
        this.f4844I = 0;
        this.f4845J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f4846K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.f4847L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.f4848M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.f4849N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.f4850O = constraintAnchor5;
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f4851P = constraintAnchor6;
        ConstraintAnchor constraintAnchor7 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        this.f4852Q = constraintAnchor7;
        ConstraintAnchor constraintAnchor8 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f4853R = constraintAnchor8;
        this.f4854S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor8};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.f4855T = arrayList;
        this.f4856U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f4857V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f4858W = null;
        this.f4859X = 0;
        this.f4860Y = 0;
        this.f4861Z = 0.0f;
        this.f4863a0 = -1;
        this.f4865b0 = 0;
        this.f4867c0 = 0;
        this.f4869d0 = 0;
        this.f4875g0 = 0.5f;
        this.f4877h0 = 0.5f;
        this.f4881j0 = 0;
        this.f4883k0 = false;
        this.f4885l0 = null;
        this.f4887m0 = null;
        this.f4889n0 = 0;
        this.f4891o0 = 0;
        this.f4893p0 = new float[]{-1.0f, -1.0f};
        this.f4895q0 = new ConstraintWidget[]{null, null};
        this.f4897r0 = new ConstraintWidget[]{null, null};
        this.f4899s0 = null;
        this.f4901t0 = null;
        this.f4903u0 = -1;
        this.f4905v0 = -1;
        arrayList.add(constraintAnchor);
        arrayList.add(constraintAnchor2);
        arrayList.add(constraintAnchor3);
        arrayList.add(constraintAnchor4);
        arrayList.add(constraintAnchor6);
        arrayList.add(constraintAnchor7);
        arrayList.add(constraintAnchor8);
        arrayList.add(constraintAnchor5);
    }

    /* JADX INFO: renamed from: K */
    public static void m2698K(int i10, int i11, String str, StringBuilder sb2) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    /* JADX INFO: renamed from: L */
    public static void m2699L(StringBuilder sb2, String str, float f3, float f10) {
        if (f3 == f10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f3);
        sb2.append(",\n");
    }

    /* JADX INFO: renamed from: s */
    public static void m2700s(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f3) {
        sb2.append(str);
        sb2.append(" :  {\n");
        m2698K(i10, 0, "      size", sb2);
        m2698K(i11, 0, "      min", sb2);
        m2698K(i12, Integer.MAX_VALUE, "      max", sb2);
        m2698K(i13, 0, "      matchMin", sb2);
        m2698K(i14, 0, "      matchDef", sb2);
        m2699L(sb2, "      matchPercent", f3, 1.0f);
        sb2.append("    },\n");
    }

    /* JADX INFO: renamed from: t */
    public static void m2701t(StringBuilder sb2, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f4831f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(constraintAnchor.f4831f);
        sb2.append("'");
        if (constraintAnchor.f4833h != Integer.MIN_VALUE || constraintAnchor.f4832g != 0) {
            sb2.append(",");
            sb2.append(constraintAnchor.f4832g);
            if (constraintAnchor.f4833h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(constraintAnchor.f4833h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    /* JADX INFO: renamed from: A */
    public final boolean m2702A(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i11 = i10 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f4854S;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i11];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4831f;
        return (constraintAnchor4 == null || constraintAnchor4.f4831f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i11 + 1]).f4831f) == null || constraintAnchor2.f4831f != constraintAnchor) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m2703B() {
        ConstraintAnchor constraintAnchor = this.f4846K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4831f;
        if (constraintAnchor2 == null || constraintAnchor2.f4831f != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.f4848M;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4831f;
            if (constraintAnchor4 == null || constraintAnchor4.f4831f != constraintAnchor3) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m2704C() {
        ConstraintAnchor constraintAnchor = this.f4847L;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4831f;
        if (constraintAnchor2 == null || constraintAnchor2.f4831f != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.f4849N;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4831f;
            if (constraintAnchor4 == null || constraintAnchor4.f4831f != constraintAnchor3) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m2705D() {
        return this.f4874g && this.f4881j0 != 8;
    }

    /* JADX INFO: renamed from: E */
    public boolean mo2706E() {
        if (!this.f4884l && (!this.f4846K.f4828c || !this.f4848M.f4828c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: F */
    public boolean mo2707F() {
        if (!this.f4886m && (!this.f4847L.f4828c || !this.f4849N.f4828c)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public void mo2708G() {
        this.f4846K.m2695j();
        this.f4847L.m2695j();
        this.f4848M.m2695j();
        this.f4849N.m2695j();
        this.f4850O.m2695j();
        this.f4851P.m2695j();
        this.f4852Q.m2695j();
        this.f4853R.m2695j();
        this.f4858W = null;
        this.f4840E = 0.0f;
        this.f4859X = 0;
        this.f4860Y = 0;
        this.f4861Z = 0.0f;
        this.f4863a0 = -1;
        this.f4865b0 = 0;
        this.f4867c0 = 0;
        this.f4869d0 = 0;
        this.f4871e0 = 0;
        this.f4873f0 = 0;
        this.f4875g0 = 0.5f;
        this.f4877h0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f4857V;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f4879i0 = null;
        this.f4881j0 = 0;
        this.f4887m0 = null;
        this.f4889n0 = 0;
        this.f4891o0 = 0;
        float[] fArr = this.f4893p0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4892p = -1;
        this.f4894q = -1;
        int[] iArr = this.f4839D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f4898s = 0;
        this.f4900t = 0;
        this.f4907x = 1.0f;
        this.f4836A = 1.0f;
        this.f4906w = Integer.MAX_VALUE;
        this.f4909z = Integer.MAX_VALUE;
        this.f4904v = 0;
        this.f4908y = 0;
        this.f4837B = -1;
        this.f4838C = 1.0f;
        boolean[] zArr = this.f4872f;
        zArr[0] = true;
        zArr[1] = true;
        this.f4843H = false;
        boolean[] zArr2 = this.f4856U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4874g = true;
        int[] iArr2 = this.f4902u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f4878i = -1;
        this.f4880j = -1;
    }

    /* JADX INFO: renamed from: H */
    public final void m2709H() {
        ConstraintWidget constraintWidget = this.f4858W;
        if (constraintWidget != null && (constraintWidget instanceof C0738d)) {
            ((C0738d) constraintWidget).getClass();
        }
        ArrayList<ConstraintAnchor> arrayList = this.f4855T;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).m2695j();
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m2710I() {
        this.f4884l = false;
        this.f4886m = false;
        this.f4888n = false;
        this.f4890o = false;
        ArrayList<ConstraintAnchor> arrayList = this.f4855T;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintAnchor constraintAnchor = arrayList.get(i10);
            constraintAnchor.f4828c = false;
            constraintAnchor.f4827b = 0;
        }
    }

    /* JADX INFO: renamed from: J */
    public void mo2711J(C1292a c1292a) {
        this.f4846K.m2696k();
        this.f4847L.m2696k();
        this.f4848M.m2696k();
        this.f4849N.m2696k();
        this.f4850O.m2696k();
        this.f4853R.m2696k();
        this.f4851P.m2696k();
        this.f4852Q.m2696k();
    }

    /* JADX INFO: renamed from: M */
    public final void m2712M(int i10, int i11) {
        if (this.f4884l) {
            return;
        }
        this.f4846K.m2697l(i10);
        this.f4848M.m2697l(i11);
        this.f4865b0 = i10;
        this.f4859X = i11 - i10;
        this.f4884l = true;
    }

    /* JADX INFO: renamed from: N */
    public final void m2713N(int i10, int i11) {
        if (this.f4886m) {
            return;
        }
        this.f4847L.m2697l(i10);
        this.f4849N.m2697l(i11);
        this.f4867c0 = i10;
        this.f4860Y = i11 - i10;
        if (this.f4841F) {
            this.f4850O.m2697l(i10 + this.f4869d0);
        }
        this.f4886m = true;
    }

    /* JADX INFO: renamed from: O */
    public final void m2714O(int i10) {
        this.f4860Y = i10;
        int i11 = this.f4873f0;
        if (i10 < i11) {
            this.f4860Y = i11;
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m2715P(DimensionBehaviour dimensionBehaviour) {
        this.f4857V[0] = dimensionBehaviour;
    }

    /* JADX INFO: renamed from: Q */
    public final void m2716Q(DimensionBehaviour dimensionBehaviour) {
        this.f4857V[1] = dimensionBehaviour;
    }

    /* JADX INFO: renamed from: R */
    public final void m2717R(int i10) {
        this.f4859X = i10;
        int i11 = this.f4871e0;
        if (i10 < i11) {
            this.f4859X = i11;
        }
    }

    /* JADX INFO: renamed from: S */
    public void mo2718S(boolean z10, boolean z11) {
        int i10;
        int i11;
        C0734c c0734c = this.f4868d;
        boolean z12 = z10 & c0734c.f4934g;
        C0735d c0735d = this.f4870e;
        boolean z13 = z11 & c0735d.f4934g;
        int i12 = c0734c.f4935h.f4922g;
        int i13 = c0735d.f4935h.f4922g;
        int i14 = c0734c.f4936i.f4922g;
        int i15 = c0735d.f4936i.f4922g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.f4865b0 = i12;
        }
        if (z13) {
            this.f4867c0 = i13;
        }
        if (this.f4881j0 == 8) {
            this.f4859X = 0;
            this.f4860Y = 0;
            return;
        }
        if (z12) {
            if (this.f4857V[0] == DimensionBehaviour.FIXED && i17 < (i11 = this.f4859X)) {
                i17 = i11;
            }
            this.f4859X = i17;
            int i19 = this.f4871e0;
            if (i17 < i19) {
                this.f4859X = i19;
            }
        }
        if (z13) {
            if (this.f4857V[1] == DimensionBehaviour.FIXED && i18 < (i10 = this.f4860Y)) {
                i18 = i10;
            }
            this.f4860Y = i18;
            int i20 = this.f4873f0;
            if (i18 < i20) {
                this.f4860Y = i20;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public void mo2719T(C0726c c0726c, boolean z10) {
        int i10;
        int i11;
        C0735d c0735d;
        C0734c c0734c;
        c0726c.getClass();
        int iM2664n = C0726c.m2664n(this.f4846K);
        int iM2664n2 = C0726c.m2664n(this.f4847L);
        int iM2664n3 = C0726c.m2664n(this.f4848M);
        int iM2664n4 = C0726c.m2664n(this.f4849N);
        if (z10 && (c0734c = this.f4868d) != null) {
            DependencyNode dependencyNode = c0734c.f4935h;
            if (dependencyNode.f4925j) {
                DependencyNode dependencyNode2 = c0734c.f4936i;
                if (dependencyNode2.f4925j) {
                    iM2664n = dependencyNode.f4922g;
                    iM2664n3 = dependencyNode2.f4922g;
                }
            }
        }
        if (z10 && (c0735d = this.f4870e) != null) {
            DependencyNode dependencyNode3 = c0735d.f4935h;
            if (dependencyNode3.f4925j) {
                DependencyNode dependencyNode4 = c0735d.f4936i;
                if (dependencyNode4.f4925j) {
                    iM2664n2 = dependencyNode3.f4922g;
                    iM2664n4 = dependencyNode4.f4922g;
                }
            }
        }
        int i12 = iM2664n4 - iM2664n2;
        if (iM2664n3 - iM2664n < 0 || i12 < 0 || iM2664n == Integer.MIN_VALUE || iM2664n == Integer.MAX_VALUE || iM2664n2 == Integer.MIN_VALUE || iM2664n2 == Integer.MAX_VALUE || iM2664n3 == Integer.MIN_VALUE || iM2664n3 == Integer.MAX_VALUE || iM2664n4 == Integer.MIN_VALUE || iM2664n4 == Integer.MAX_VALUE) {
            iM2664n = 0;
            iM2664n2 = 0;
            iM2664n3 = 0;
            iM2664n4 = 0;
        }
        int i13 = iM2664n3 - iM2664n;
        int i14 = iM2664n4 - iM2664n2;
        this.f4865b0 = iM2664n;
        this.f4867c0 = iM2664n2;
        if (this.f4881j0 == 8) {
            this.f4859X = 0;
            this.f4860Y = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f4857V;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i13 < (i11 = this.f4859X)) {
            i13 = i11;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i14 < (i10 = this.f4860Y)) {
            i14 = i10;
        }
        this.f4859X = i13;
        this.f4860Y = i14;
        int i15 = this.f4873f0;
        if (i14 < i15) {
            this.f4860Y = i15;
        }
        int i16 = this.f4871e0;
        if (i13 < i16) {
            this.f4859X = i16;
        }
        int i17 = this.f4906w;
        if (i17 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f4859X = Math.min(this.f4859X, i17);
        }
        int i18 = this.f4909z;
        if (i18 > 0 && this.f4857V[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f4860Y = Math.min(this.f4860Y, i18);
        }
        int i19 = this.f4859X;
        if (i13 != i19) {
            this.f4878i = i19;
        }
        int i20 = this.f4860Y;
        if (i14 != i20) {
            this.f4880j = i20;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2720d(C0738d c0738d, C0726c c0726c, HashSet<ConstraintWidget> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            C0741g.m2780a(c0738d, c0726c, this);
            hashSet.remove(this);
            mo2721e(c0726c, c0738d.m2768Z(64));
        }
        if (i10 == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.f4846K.f4826a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f4829d.m2720d(c0738d, c0726c, hashSet, i10, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.f4848M.f4826a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f4829d.m2720d(c0738d, c0726c, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.f4847L.f4826a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f4829d.m2720d(c0738d, c0726c, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.f4849N.f4826a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f4829d.m2720d(c0738d, c0726c, hashSet, i10, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.f4850O.f4826a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f4829d.m2720d(c0738d, c0726c, hashSet, i10, true);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: e */
    public void mo2721e(androidx.constraintlayout.core.C0726c r65, boolean r66) {
        /*
            Method dump skipped, instruction units count: 2134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo2721e(androidx.constraintlayout.core.c, boolean):void");
    }

    /* JADX INFO: renamed from: f */
    public boolean mo2722f() {
        return this.f4881j0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016b  */
    /* JADX WARN: Code duplicated, block: B:102:0x016e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0174  */
    /* JADX WARN: Code duplicated, block: B:108:0x0192  */
    /* JADX WARN: Code duplicated, block: B:111:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:233:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:239:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:241:0x041b  */
    /* JADX WARN: Code duplicated, block: B:244:0x0436  */
    /* JADX WARN: Code duplicated, block: B:250:0x0444  */
    /* JADX WARN: Code duplicated, block: B:252:0x0448 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:254:0x044b  */
    /* JADX WARN: Code duplicated, block: B:264:0x046f  */
    /* JADX WARN: Code duplicated, block: B:274:0x048b  */
    /* JADX WARN: Code duplicated, block: B:277:0x0493  */
    /* JADX WARN: Code duplicated, block: B:278:0x0495 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:281:0x049b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:288:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:291:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:293:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:295:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:296:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:299:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:305:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:306:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:309:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:311:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:312:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:314:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:316:0x04fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:324:0x0519  */
    /* JADX WARN: Code duplicated, block: B:338:0x0544 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:357:0x057c  */
    /* JADX WARN: Code duplicated, block: B:367:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:0x0115  */
    /* JADX WARN: Code duplicated, block: B:73:0x0118  */
    /* JADX WARN: Code duplicated, block: B:75:0x011b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0121  */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0130  */
    /* JADX WARN: Code duplicated, block: B:85:0x0135  */
    /* JADX WARN: Code duplicated, block: B:87:0x0138  */
    /* JADX WARN: Code duplicated, block: B:88:0x0140  */
    /* JADX WARN: Code duplicated, block: B:90:0x0147  */
    /* JADX WARN: Code duplicated, block: B:93:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0155  */
    /* JADX WARN: Code duplicated, block: B:97:0x015d  */
    /* JADX INFO: renamed from: g */
    public final void m2723g(C0726c c0726c, boolean z10, boolean z11, boolean z12, boolean z13, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z14, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10, int i11, int i12, int i13, float f3, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f10, boolean z20) {
        int i18;
        boolean z21;
        int i19;
        int i20;
        int i21;
        int iMin;
        int i22;
        int i23;
        int i24;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        SolverVariable solverVariableM2675k;
        SolverVariable solverVariableM2675k2;
        boolean z22;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable3;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        int i25;
        int i26;
        int i27;
        boolean z27;
        boolean z28;
        boolean z29;
        SolverVariable solverVariable4;
        boolean z30;
        SolverVariable solverVariable5;
        ConstraintWidget constraintWidget;
        int iMax;
        boolean z31;
        int i28;
        int i29;
        int iM2690e;
        int i30;
        int iMin2;
        int i31;
        HashSet<ConstraintAnchor> hashSet;
        boolean z32;
        int i32;
        boolean z33;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        boolean z34;
        boolean z35;
        char c10;
        int i42 = i16;
        int i43 = i17;
        SolverVariable solverVariableM2675k3 = c0726c.m2675k(constraintAnchor);
        SolverVariable solverVariableM2675k4 = c0726c.m2675k(constraintAnchor2);
        SolverVariable solverVariableM2675k5 = c0726c.m2675k(constraintAnchor.f4831f);
        SolverVariable solverVariableM2675k6 = c0726c.m2675k(constraintAnchor2.f4831f);
        boolean zM2693h = constraintAnchor.m2693h();
        boolean zM2693h2 = constraintAnchor2.m2693h();
        boolean zM2693h3 = this.f4853R.m2693h();
        int i44 = zM2693h2 ? (zM2693h ? 1 : 0) + 1 : zM2693h ? 1 : 0;
        if (zM2693h3) {
            i44++;
        }
        int i45 = i44;
        int i46 = z15 ? 3 : i14;
        int i47 = C0729a.f4911b[dimensionBehaviour.ordinal()];
        if (i47 != 1 && i47 != 2 && i47 != 3 && i47 == 4) {
            i18 = i46;
            z21 = i18 != 4;
            i19 = this.f4878i;
            if (i19 != -1 && z10) {
                this.f4878i = -1;
                i11 = i19;
                z21 = false;
            }
            i20 = this.f4880j;
            if (i20 != -1 || z10) {
                i20 = i11;
            } else {
                this.f4880j = -1;
                z21 = false;
            }
            i21 = i20;
            if (this.f4881j0 == 8) {
                iMin = 0;
                z21 = false;
            } else {
                iMin = i21;
            }
            if (!z20) {
                if (zM2693h && !zM2693h2 && !zM2693h3) {
                    c0726c.m2668d(solverVariableM2675k3, i10);
                } else if (zM2693h && !zM2693h2) {
                    i22 = 8;
                    c0726c.m2669e(solverVariableM2675k3, solverVariableM2675k5, constraintAnchor.m2690e(), 8);
                }
                i22 = 8;
            } else {
                i22 = 8;
            }
            if (!z21) {
                if (i45 != 2 || z15 || (i18 != 1 && i18 != 0)) {
                    if (i42 == -2) {
                        i42 = iMin;
                    }
                    if (i43 == -2) {
                        i43 = iMin;
                    }
                    if (iMin > 0 && i18 != 1) {
                        iMin = 0;
                    }
                    if (i42 > 0) {
                        c0726c.m2670f(solverVariableM2675k4, solverVariableM2675k3, i42, 8);
                        iMin = Math.max(iMin, i42);
                    }
                    if (i43 > 0) {
                        if (z11 || i18 != 1) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        if (z22) {
                            i23 = 8;
                            c0726c.m2671g(solverVariableM2675k4, solverVariableM2675k3, i43, 8);
                        } else {
                            i23 = 8;
                        }
                        iMin = Math.min(iMin, i43);
                    } else {
                        i23 = 8;
                    }
                    if (i18 == 1) {
                        if (z11) {
                            c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMin, i23);
                        } else if (z17) {
                            c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMin, 5);
                            c0726c.m2671g(solverVariableM2675k4, solverVariableM2675k3, iMin, i23);
                        } else {
                            c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMin, 5);
                            c0726c.m2671g(solverVariableM2675k4, solverVariableM2675k3, iMin, i23);
                        }
                    } else if (i18 == 2) {
                        type = ConstraintAnchor.Type.TOP;
                        type2 = constraintAnchor.f4830e;
                        if (type2 != type || type2 == ConstraintAnchor.Type.BOTTOM) {
                            solverVariableM2675k = c0726c.m2675k(this.f4858W.mo2729m(type));
                            solverVariableM2675k2 = c0726c.m2675k(this.f4858W.mo2729m(ConstraintAnchor.Type.BOTTOM));
                        } else {
                            solverVariableM2675k = c0726c.m2675k(this.f4858W.mo2729m(ConstraintAnchor.Type.LEFT));
                            solverVariableM2675k2 = c0726c.m2675k(this.f4858W.mo2729m(ConstraintAnchor.Type.RIGHT));
                        }
                        C0725b c0725bM2676l = c0726c.m2676l();
                        c0725bM2676l.f4801d.mo2647d(solverVariableM2675k4, -1.0f);
                        c0725bM2676l.f4801d.mo2647d(solverVariableM2675k3, 1.0f);
                        c0725bM2676l.f4801d.mo2647d(solverVariableM2675k2, f10);
                        c0725bM2676l.f4801d.mo2647d(solverVariableM2675k, -f10);
                        c0726c.m2667c(c0725bM2676l);
                        if (z11) {
                            z21 = false;
                        }
                        i24 = i42;
                    } else {
                        i45 = i45 == true ? 1 : 0;
                        i24 = i42;
                        z13 = true;
                    }
                    if (z20 || z17) {
                        boolean z36 = z13;
                        if (i45 >= 2 && z11 && z36) {
                            c0726c.m2670f(solverVariableM2675k3, solverVariable, 0, 8);
                            ConstraintAnchor constraintAnchor4 = this.f4850O;
                            boolean z37 = z10 || constraintAnchor4.f4831f == null;
                            if (!z10 && (constraintAnchor3 = constraintAnchor4.f4831f) != null) {
                                ConstraintWidget constraintWidget2 = constraintAnchor3.f4829d;
                                if (constraintWidget2.f4861Z != 0.0f) {
                                    DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.f4857V;
                                    DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                                    DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                                    if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                                        z37 = true;
                                    } else {
                                        z37 = false;
                                    }
                                } else {
                                    z37 = false;
                                }
                            }
                            if (z37) {
                                c0726c.m2670f(solverVariable2, solverVariableM2675k4, 0, 8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (zM2693h || zM2693h2 || zM2693h3) {
                        if (zM2693h && !zM2693h2) {
                            z30 = z11;
                            constraintAnchor2 = constraintAnchor2;
                            solverVariableM2675k4 = solverVariableM2675k4;
                            z13 = z13;
                            i29 = (z11 && (constraintAnchor.f4831f.f4829d instanceof C0730a)) ? 8 : 5;
                            solverVariable5 = solverVariableM2675k6;
                        } else if (zM2693h || !zM2693h2) {
                            solverVariable3 = solverVariableM2675k6;
                            if (zM2693h && zM2693h2) {
                                ConstraintWidget constraintWidget3 = constraintAnchor.f4831f.f4829d;
                                constraintAnchor2 = constraintAnchor2;
                                ConstraintWidget constraintWidget4 = constraintAnchor2.f4831f.f4829d;
                                ConstraintWidget constraintWidget5 = this.f4858W;
                                int i48 = 6;
                                if (z21) {
                                    if (i18 == 0) {
                                        if (i43 != 0 || i24 != 0) {
                                            i40 = 5;
                                            i41 = 5;
                                            z34 = true;
                                            z35 = false;
                                            z25 = true;
                                        } else if (solverVariableM2675k5.f4781f && solverVariable3.f4781f) {
                                            c0726c.m2669e(solverVariableM2675k3, solverVariableM2675k5, constraintAnchor.m2690e(), 8);
                                            c0726c.m2669e(solverVariableM2675k4, solverVariable3, -constraintAnchor2.m2690e(), 8);
                                            return;
                                        } else {
                                            i40 = 8;
                                            i41 = 8;
                                            z34 = false;
                                            z35 = true;
                                            z25 = false;
                                        }
                                        i27 = ((constraintWidget3 instanceof C0730a) || (constraintWidget4 instanceof C0730a)) ? 4 : i40;
                                        i26 = i41;
                                        z27 = z35;
                                        i18 = i18;
                                        z26 = z34;
                                        solverVariable2 = solverVariable2;
                                        i25 = 6;
                                    } else {
                                        if (i18 == 2) {
                                            i38 = ((constraintWidget3 instanceof C0730a) || (constraintWidget4 instanceof C0730a)) ? 4 : 5;
                                            i39 = 5;
                                        } else if (i18 == 1) {
                                            i38 = 4;
                                            i39 = 8;
                                        } else if (i18 == 3) {
                                            i18 = i18;
                                            if (this.f4837B == -1) {
                                                if (z18) {
                                                    i37 = z11 ? 5 : 4;
                                                } else {
                                                    i37 = 8;
                                                }
                                                i25 = i37;
                                                i26 = 8;
                                                i27 = 5;
                                            } else if (z15) {
                                                if (i15 == 2 || i15 == 1) {
                                                    i35 = 4;
                                                    i36 = 5;
                                                } else {
                                                    i35 = 5;
                                                    i36 = 8;
                                                }
                                                i27 = i35;
                                                i26 = i36;
                                                i25 = 6;
                                                z26 = true;
                                                z25 = true;
                                                z27 = true;
                                                solverVariable2 = solverVariable2;
                                            } else {
                                                if (i43 > 0) {
                                                    i34 = 5;
                                                } else if (i43 != 0 || i24 != 0) {
                                                    i34 = 4;
                                                } else if (z18) {
                                                    i26 = (constraintWidget3 == constraintWidget5 || constraintWidget4 == constraintWidget5) ? 5 : 4;
                                                    i25 = 6;
                                                    i27 = 4;
                                                } else {
                                                    i34 = 8;
                                                }
                                                i27 = i34;
                                                i25 = 6;
                                                i26 = 5;
                                            }
                                            z26 = true;
                                            z25 = true;
                                            z27 = true;
                                        } else {
                                            z23 = false;
                                            z24 = false;
                                        }
                                        i18 = i18;
                                        i25 = 6;
                                        z26 = true;
                                        z25 = true;
                                        z27 = false;
                                        solverVariable2 = solverVariable2;
                                        int i49 = i39;
                                        i27 = i38;
                                        i26 = i49;
                                    }
                                    if (z25 || solverVariableM2675k5 != solverVariable3 || constraintWidget3 == constraintWidget5) {
                                        z28 = z25;
                                        z29 = true;
                                    } else {
                                        z29 = false;
                                        z28 = false;
                                    }
                                    if (z26) {
                                        if (z21 && !z16 && !z18 && solverVariableM2675k5 == solverVariable && solverVariable3 == solverVariable2) {
                                            z30 = false;
                                            i32 = 8;
                                            i33 = 8;
                                            z33 = false;
                                        } else {
                                            i32 = i26;
                                            z33 = z29;
                                            i33 = i25;
                                            z30 = z11;
                                        }
                                        solverVariable4 = solverVariableM2675k4;
                                        c0726c.m2666b(solverVariableM2675k3, solverVariableM2675k5, constraintAnchor.m2690e(), f3, solverVariable3, solverVariableM2675k4, constraintAnchor2.m2690e(), i33);
                                        i26 = i32;
                                        z29 = z33;
                                    } else {
                                        solverVariable4 = solverVariableM2675k4;
                                        z30 = z11;
                                    }
                                    if (this.f4881j0 == 8) {
                                        hashSet = constraintAnchor2.f4826a;
                                        if (hashSet == null && hashSet.size() > 0) {
                                            z32 = true;
                                        } else {
                                            z32 = false;
                                        }
                                        if (!z32) {
                                            return;
                                        }
                                    }
                                    if (z28) {
                                        solverVariable5 = solverVariable3;
                                        if (z30 && solverVariableM2675k5 != solverVariable5 && !z21 && ((constraintWidget3 instanceof C0730a) || (constraintWidget4 instanceof C0730a))) {
                                            i26 = 6;
                                        }
                                        c0726c.m2670f(solverVariableM2675k3, solverVariableM2675k5, constraintAnchor.m2690e(), i26);
                                        solverVariableM2675k4 = solverVariable4;
                                        c0726c.m2671g(solverVariableM2675k4, solverVariable5, -constraintAnchor2.m2690e(), i26);
                                    } else {
                                        solverVariable5 = solverVariable3;
                                        solverVariableM2675k4 = solverVariable4;
                                    }
                                    if (z30 || !z19 || (constraintWidget3 instanceof C0730a) || (constraintWidget4 instanceof C0730a)) {
                                        constraintWidget = constraintWidget5;
                                    } else {
                                        constraintWidget = constraintWidget5;
                                        if (constraintWidget4 != constraintWidget) {
                                            i26 = 6;
                                            iMax = 6;
                                            z31 = true;
                                        }
                                        if (z31) {
                                            if (z27 && (!z18 || z12)) {
                                                if (constraintWidget3 != constraintWidget && constraintWidget4 != constraintWidget) {
                                                    i48 = iMax;
                                                }
                                                if ((constraintWidget3 instanceof C0740f) || (constraintWidget4 instanceof C0740f)) {
                                                    i48 = 5;
                                                }
                                                if ((constraintWidget3 instanceof C0730a) || (constraintWidget4 instanceof C0730a)) {
                                                    i48 = 5;
                                                }
                                                if (z18) {
                                                    i31 = 5;
                                                } else {
                                                    i31 = i48;
                                                }
                                                iMax = Math.max(i31, iMax);
                                            }
                                            if (z30) {
                                                iMin2 = Math.min(i26, iMax);
                                                if (z15 || z18 || !(constraintWidget3 == constraintWidget || constraintWidget4 == constraintWidget)) {
                                                    i30 = iMin2;
                                                } else {
                                                    i30 = 4;
                                                }
                                            } else {
                                                i30 = iMax;
                                            }
                                            c0726c.m2669e(solverVariableM2675k3, solverVariableM2675k5, constraintAnchor.m2690e(), i30);
                                            c0726c.m2669e(solverVariableM2675k4, solverVariable5, -constraintAnchor2.m2690e(), i30);
                                        }
                                        if (z30) {
                                            if (solverVariable == solverVariableM2675k5) {
                                                iM2690e = constraintAnchor.m2690e();
                                            } else {
                                                iM2690e = 0;
                                            }
                                            if (solverVariableM2675k5 != solverVariable) {
                                                c0726c.m2670f(solverVariableM2675k3, solverVariable, iM2690e, 5);
                                            }
                                        }
                                        if (z30 || !z21 || i12 != 0 || i24 != 0) {
                                            i28 = 5;
                                        } else if (z21 && i18 == 3) {
                                            c0726c.m2670f(solverVariableM2675k4, solverVariableM2675k3, 0, 8);
                                            i29 = 5;
                                        } else {
                                            i28 = 5;
                                            c0726c.m2670f(solverVariableM2675k4, solverVariableM2675k3, 0, 5);
                                        }
                                        i29 = i28;
                                    }
                                    iMax = i27;
                                    z31 = z29;
                                    if (z31) {
                                        if (z27) {
                                            if (constraintWidget3 != constraintWidget) {
                                                i48 = iMax;
                                            }
                                            if (constraintWidget3 instanceof C0740f) {
                                                i48 = 5;
                                            } else {
                                                i48 = 5;
                                            }
                                            if (constraintWidget3 instanceof C0730a) {
                                                i48 = 5;
                                            } else {
                                                i48 = 5;
                                            }
                                            if (z18) {
                                                i31 = 5;
                                            } else {
                                                i31 = i48;
                                            }
                                            iMax = Math.max(i31, iMax);
                                        }
                                        if (z30) {
                                            iMin2 = Math.min(i26, iMax);
                                            if (z15) {
                                                i30 = iMin2;
                                            } else {
                                                i30 = iMin2;
                                            }
                                        } else {
                                            i30 = iMax;
                                        }
                                        c0726c.m2669e(solverVariableM2675k3, solverVariableM2675k5, constraintAnchor.m2690e(), i30);
                                        c0726c.m2669e(solverVariableM2675k4, solverVariable5, -constraintAnchor2.m2690e(), i30);
                                    }
                                    if (z30) {
                                        if (solverVariable == solverVariableM2675k5) {
                                            iM2690e = constraintAnchor.m2690e();
                                        } else {
                                            iM2690e = 0;
                                        }
                                        if (solverVariableM2675k5 != solverVariable) {
                                            c0726c.m2670f(solverVariableM2675k3, solverVariable, iM2690e, 5);
                                        }
                                    }
                                    if (z30) {
                                        i28 = 5;
                                        i29 = i28;
                                    } else {
                                        i28 = 5;
                                        i29 = i28;
                                    }
                                } else {
                                    if (solverVariableM2675k5.f4781f && solverVariable3.f4781f) {
                                        c0726c.m2666b(solverVariableM2675k3, solverVariableM2675k5, constraintAnchor.m2690e(), f3, solverVariable3, solverVariableM2675k4, constraintAnchor2.m2690e(), 8);
                                        if (z11 && z13) {
                                            int iM2690e2 = constraintAnchor2.f4831f != null ? constraintAnchor2.m2690e() : 0;
                                            if (solverVariable3 != solverVariable2) {
                                                c0726c.m2670f(solverVariable2, solverVariableM2675k4, iM2690e2, 5);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    z23 = true;
                                    z24 = true;
                                }
                                z25 = z23;
                                z26 = z24;
                                i25 = 6;
                                i26 = 5;
                                i27 = 4;
                                z27 = false;
                                if (z25) {
                                    z28 = z25;
                                    z29 = true;
                                } else {
                                    z28 = z25;
                                    z29 = true;
                                }
                                if (z26) {
                                    if (z21) {
                                        i32 = i26;
                                        z33 = z29;
                                        i33 = i25;
                                        z30 = z11;
                                    } else {
                                        i32 = i26;
                                        z33 = z29;
                                        i33 = i25;
                                        z30 = z11;
                                    }
                                    solverVariable4 = solverVariableM2675k4;
                                    c0726c.m2666b(solverVariableM2675k3, solverVariableM2675k5, constraintAnchor.m2690e(), f3, solverVariable3, solverVariableM2675k4, constraintAnchor2.m2690e(), i33);
                                    i26 = i32;
                                    z29 = z33;
                                } else {
                                    solverVariable4 = solverVariableM2675k4;
                                    z30 = z11;
                                }
                                if (this.f4881j0 == 8) {
                                    hashSet = constraintAnchor2.f4826a;
                                    if (hashSet == null) {
                                        z32 = false;
                                    } else {
                                        z32 = true;
                                    }
                                    if (!z32) {
                                        return;
                                    }
                                }
                                if (z28) {
                                    solverVariable5 = solverVariable3;
                                    if (z30) {
                                        i26 = 6;
                                    }
                                    c0726c.m2670f(solverVariableM2675k3, solverVariableM2675k5, constraintAnchor.m2690e(), i26);
                                    solverVariableM2675k4 = solverVariable4;
                                    c0726c.m2671g(solverVariableM2675k4, solverVariable5, -constraintAnchor2.m2690e(), i26);
                                } else {
                                    solverVariable5 = solverVariable3;
                                    solverVariableM2675k4 = solverVariable4;
                                }
                                if (z30) {
                                    constraintWidget = constraintWidget5;
                                    iMax = i27;
                                    z31 = z29;
                                } else {
                                    constraintWidget = constraintWidget5;
                                    iMax = i27;
                                    z31 = z29;
                                }
                                if (z31) {
                                    if (z27) {
                                        if (constraintWidget3 != constraintWidget) {
                                            i48 = iMax;
                                        }
                                        if (constraintWidget3 instanceof C0740f) {
                                            i48 = 5;
                                        } else {
                                            i48 = 5;
                                        }
                                        if (constraintWidget3 instanceof C0730a) {
                                            i48 = 5;
                                        } else {
                                            i48 = 5;
                                        }
                                        if (z18) {
                                            i31 = 5;
                                        } else {
                                            i31 = i48;
                                        }
                                        iMax = Math.max(i31, iMax);
                                    }
                                    if (z30) {
                                        iMin2 = Math.min(i26, iMax);
                                        if (z15) {
                                            i30 = iMin2;
                                        } else {
                                            i30 = iMin2;
                                        }
                                    } else {
                                        i30 = iMax;
                                    }
                                    c0726c.m2669e(solverVariableM2675k3, solverVariableM2675k5, constraintAnchor.m2690e(), i30);
                                    c0726c.m2669e(solverVariableM2675k4, solverVariable5, -constraintAnchor2.m2690e(), i30);
                                }
                                if (z30) {
                                    if (solverVariable == solverVariableM2675k5) {
                                        iM2690e = constraintAnchor.m2690e();
                                    } else {
                                        iM2690e = 0;
                                    }
                                    if (solverVariableM2675k5 != solverVariable) {
                                        c0726c.m2670f(solverVariableM2675k3, solverVariable, iM2690e, 5);
                                    }
                                }
                                if (z30) {
                                    i28 = 5;
                                    i29 = i28;
                                } else {
                                    i28 = 5;
                                    i29 = i28;
                                }
                            }
                        } else {
                            c0726c.m2669e(solverVariableM2675k4, solverVariable3, -constraintAnchor2.m2690e(), 8);
                            if (z11) {
                                solverVariable3 = solverVariableM2675k6;
                                c0726c.m2670f(solverVariableM2675k3, solverVariable, 0, 5);
                                i28 = 5;
                                solverVariable5 = solverVariable3;
                            }
                            z30 = z11;
                            i29 = i28;
                        }
                        if (z30 || !z13) {
                            return;
                        }
                        int iM2690e3 = constraintAnchor2.f4831f != null ? constraintAnchor2.m2690e() : 0;
                        if (solverVariable5 != solverVariable2) {
                            c0726c.m2670f(solverVariable2, solverVariableM2675k4, iM2690e3, i29);
                            return;
                        }
                        return;
                    }
                    solverVariable3 = solverVariableM2675k6;
                    solverVariable3 = solverVariableM2675k6;
                    solverVariable5 = solverVariable3;
                    i28 = 5;
                    z30 = z11;
                    i29 = i28;
                    if (z30) {
                        return;
                    } else {
                        return;
                    }
                }
                int iMax2 = Math.max(i42, iMin);
                if (i43 > 0) {
                    iMax2 = Math.min(i43, iMax2);
                }
                c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMax2, 8);
                z21 = false;
            } else if (z14) {
                c10 = 3;
                c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, 0, 3);
                if (i12 > 0) {
                    c0726c.m2670f(solverVariableM2675k4, solverVariableM2675k3, i12, i22);
                }
                if (i13 < Integer.MAX_VALUE) {
                    c0726c.m2671g(solverVariableM2675k4, solverVariableM2675k3, i13, i22);
                }
            } else {
                c10 = 3;
                c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMin, i22);
            }
            i24 = i42;
            if (z20) {
            }
            boolean z38 = z13;
            if (i45 >= 2) {
            }
        }
        i18 = i46;
        i19 = this.f4878i;
        if (i19 != -1) {
            this.f4878i = -1;
            i11 = i19;
            z21 = false;
        }
        i20 = this.f4880j;
        if (i20 != -1) {
            i20 = i11;
        } else {
            i20 = i11;
        }
        i21 = i20;
        if (this.f4881j0 == 8) {
            iMin = 0;
            z21 = false;
        } else {
            iMin = i21;
        }
        if (!z20) {
            i22 = 8;
        } else if (zM2693h) {
            if (zM2693h) {
                i22 = 8;
            } else {
                i22 = 8;
            }
        } else if (zM2693h) {
            i22 = 8;
        } else {
            i22 = 8;
        }
        if (!z21) {
            if (i45 != 2) {
                if (i42 == -2) {
                    i42 = iMin;
                }
                if (i43 == -2) {
                    i43 = iMin;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i42 > 0) {
                    c0726c.m2670f(solverVariableM2675k4, solverVariableM2675k3, i42, 8);
                    iMin = Math.max(iMin, i42);
                }
                if (i43 > 0) {
                    if (z11) {
                        z22 = true;
                    } else {
                        z22 = true;
                    }
                    if (z22) {
                        i23 = 8;
                        c0726c.m2671g(solverVariableM2675k4, solverVariableM2675k3, i43, 8);
                    } else {
                        i23 = 8;
                    }
                    iMin = Math.min(iMin, i43);
                } else {
                    i23 = 8;
                }
                if (i18 == 1) {
                    if (z11) {
                        c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMin, i23);
                    } else if (z17) {
                        c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMin, 5);
                        c0726c.m2671g(solverVariableM2675k4, solverVariableM2675k3, iMin, i23);
                    } else {
                        c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMin, 5);
                        c0726c.m2671g(solverVariableM2675k4, solverVariableM2675k3, iMin, i23);
                    }
                } else if (i18 == 2) {
                    type = ConstraintAnchor.Type.TOP;
                    type2 = constraintAnchor.f4830e;
                    if (type2 != type) {
                        solverVariableM2675k = c0726c.m2675k(this.f4858W.mo2729m(type));
                        solverVariableM2675k2 = c0726c.m2675k(this.f4858W.mo2729m(ConstraintAnchor.Type.BOTTOM));
                    } else {
                        solverVariableM2675k = c0726c.m2675k(this.f4858W.mo2729m(type));
                        solverVariableM2675k2 = c0726c.m2675k(this.f4858W.mo2729m(ConstraintAnchor.Type.BOTTOM));
                    }
                    C0725b c0725bM2676l2 = c0726c.m2676l();
                    c0725bM2676l2.f4801d.mo2647d(solverVariableM2675k4, -1.0f);
                    c0725bM2676l2.f4801d.mo2647d(solverVariableM2675k3, 1.0f);
                    c0725bM2676l2.f4801d.mo2647d(solverVariableM2675k2, f10);
                    c0725bM2676l2.f4801d.mo2647d(solverVariableM2675k, -f10);
                    c0726c.m2667c(c0725bM2676l2);
                    if (z11) {
                        z21 = false;
                    }
                    i24 = i42;
                } else {
                    i45 = i45 == true ? 1 : 0;
                    i24 = i42;
                    z13 = true;
                }
            } else {
                if (i42 == -2) {
                    i42 = iMin;
                }
                if (i43 == -2) {
                    i43 = iMin;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i42 > 0) {
                    c0726c.m2670f(solverVariableM2675k4, solverVariableM2675k3, i42, 8);
                    iMin = Math.max(iMin, i42);
                }
                if (i43 > 0) {
                    if (z11) {
                        z22 = true;
                    } else {
                        z22 = true;
                    }
                    if (z22) {
                        i23 = 8;
                        c0726c.m2671g(solverVariableM2675k4, solverVariableM2675k3, i43, 8);
                    } else {
                        i23 = 8;
                    }
                    iMin = Math.min(iMin, i43);
                } else {
                    i23 = 8;
                }
                if (i18 == 1) {
                    if (z11) {
                        c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMin, i23);
                    } else if (z17) {
                        c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMin, 5);
                        c0726c.m2671g(solverVariableM2675k4, solverVariableM2675k3, iMin, i23);
                    } else {
                        c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMin, 5);
                        c0726c.m2671g(solverVariableM2675k4, solverVariableM2675k3, iMin, i23);
                    }
                } else if (i18 == 2) {
                    type = ConstraintAnchor.Type.TOP;
                    type2 = constraintAnchor.f4830e;
                    if (type2 != type) {
                        solverVariableM2675k = c0726c.m2675k(this.f4858W.mo2729m(type));
                        solverVariableM2675k2 = c0726c.m2675k(this.f4858W.mo2729m(ConstraintAnchor.Type.BOTTOM));
                    } else {
                        solverVariableM2675k = c0726c.m2675k(this.f4858W.mo2729m(type));
                        solverVariableM2675k2 = c0726c.m2675k(this.f4858W.mo2729m(ConstraintAnchor.Type.BOTTOM));
                    }
                    C0725b c0725bM2676l3 = c0726c.m2676l();
                    c0725bM2676l3.f4801d.mo2647d(solverVariableM2675k4, -1.0f);
                    c0725bM2676l3.f4801d.mo2647d(solverVariableM2675k3, 1.0f);
                    c0725bM2676l3.f4801d.mo2647d(solverVariableM2675k2, f10);
                    c0725bM2676l3.f4801d.mo2647d(solverVariableM2675k, -f10);
                    c0726c.m2667c(c0725bM2676l3);
                    if (z11) {
                        z21 = false;
                    }
                    i24 = i42;
                } else {
                    i45 = i45 == true ? 1 : 0;
                    i24 = i42;
                    z13 = true;
                }
            }
            if (z20) {
            }
            boolean z39 = z13;
            if (i45 >= 2) {
            }
        }
        if (z14) {
            c10 = 3;
            c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, 0, 3);
            if (i12 > 0) {
                c0726c.m2670f(solverVariableM2675k4, solverVariableM2675k3, i12, i22);
            }
            if (i13 < Integer.MAX_VALUE) {
                c0726c.m2671g(solverVariableM2675k4, solverVariableM2675k3, i13, i22);
            }
        } else {
            c10 = 3;
            c0726c.m2669e(solverVariableM2675k4, solverVariableM2675k3, iMin, i22);
        }
        i24 = i42;
        if (z20) {
        }
        boolean z310 = z13;
        if (i45 >= 2) {
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2724h(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z10;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 != type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                if (type2 == type6 || type2 == ConstraintAnchor.Type.RIGHT) {
                    m2724h(type6, constraintWidget, type2, 0);
                    m2724h(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                    mo2729m(type5).m2686a(constraintWidget.mo2729m(type2), 0);
                    return;
                }
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.TOP;
                if (type2 == type7 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    m2724h(type7, constraintWidget, type2, 0);
                    m2724h(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    mo2729m(type5).m2686a(constraintWidget.mo2729m(type2), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor constraintAnchorMo2729m = mo2729m(type8);
            ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor constraintAnchorMo2729m2 = mo2729m(type9);
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor constraintAnchorMo2729m3 = mo2729m(type10);
            ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor constraintAnchorMo2729m4 = mo2729m(type11);
            boolean z11 = true;
            if (constraintAnchorMo2729m != null && constraintAnchorMo2729m.m2693h()) {
                z10 = false;
            } else if (constraintAnchorMo2729m2 == null || !constraintAnchorMo2729m2.m2693h()) {
                m2724h(type8, constraintWidget, type8, 0);
                m2724h(type9, constraintWidget, type9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if (constraintAnchorMo2729m3 != null && constraintAnchorMo2729m3.m2693h()) {
                z11 = false;
            } else if (constraintAnchorMo2729m4 == null || !constraintAnchorMo2729m4.m2693h()) {
                m2724h(type10, constraintWidget, type10, 0);
                m2724h(type11, constraintWidget, type11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                mo2729m(type5).m2686a(constraintWidget.mo2729m(type5), 0);
                return;
            }
            if (z10) {
                ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
                mo2729m(type12).m2686a(constraintWidget.mo2729m(type12), 0);
                return;
            } else {
                if (z11) {
                    ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
                    mo2729m(type13).m2686a(constraintWidget.mo2729m(type13), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor constraintAnchorMo2729m5 = mo2729m(type4);
            ConstraintAnchor constraintAnchorMo2729m6 = constraintWidget.mo2729m(type2);
            ConstraintAnchor constraintAnchorMo2729m7 = mo2729m(ConstraintAnchor.Type.RIGHT);
            constraintAnchorMo2729m5.m2686a(constraintAnchorMo2729m6, 0);
            constraintAnchorMo2729m7.m2686a(constraintAnchorMo2729m6, 0);
            mo2729m(type14).m2686a(constraintAnchorMo2729m6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type != type15 || (type2 != (type3 = ConstraintAnchor.Type.TOP) && type2 != ConstraintAnchor.Type.BOTTOM)) {
            if (type == type14 && type2 == type14) {
                ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
                mo2729m(type16).m2686a(constraintWidget.mo2729m(type16), 0);
                ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
                mo2729m(type17).m2686a(constraintWidget.mo2729m(type17), 0);
                mo2729m(type14).m2686a(constraintWidget.mo2729m(type2), 0);
                return;
            }
            if (type == type15 && type2 == type15) {
                ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
                mo2729m(type18).m2686a(constraintWidget.mo2729m(type18), 0);
                ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
                mo2729m(type19).m2686a(constraintWidget.mo2729m(type19), 0);
                mo2729m(type15).m2686a(constraintWidget.mo2729m(type2), 0);
                return;
            }
            ConstraintAnchor constraintAnchorMo2729m8 = mo2729m(type);
            ConstraintAnchor constraintAnchorMo2729m9 = constraintWidget.mo2729m(type2);
            if (constraintAnchorMo2729m8.m2694i(constraintAnchorMo2729m9)) {
                ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
                if (type == type20) {
                    ConstraintAnchor constraintAnchorMo2729m10 = mo2729m(ConstraintAnchor.Type.TOP);
                    ConstraintAnchor constraintAnchorMo2729m11 = mo2729m(ConstraintAnchor.Type.BOTTOM);
                    if (constraintAnchorMo2729m10 != null) {
                        constraintAnchorMo2729m10.m2695j();
                    }
                    if (constraintAnchorMo2729m11 != null) {
                        constraintAnchorMo2729m11.m2695j();
                    }
                } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                    ConstraintAnchor constraintAnchorMo2729m12 = mo2729m(type20);
                    if (constraintAnchorMo2729m12 != null) {
                        constraintAnchorMo2729m12.m2695j();
                    }
                    ConstraintAnchor constraintAnchorMo2729m13 = mo2729m(type5);
                    if (constraintAnchorMo2729m13.f4831f != constraintAnchorMo2729m9) {
                        constraintAnchorMo2729m13.m2695j();
                    }
                    ConstraintAnchor constraintAnchorM2691f = mo2729m(type).m2691f();
                    ConstraintAnchor constraintAnchorMo2729m14 = mo2729m(type15);
                    if (constraintAnchorMo2729m14.m2693h()) {
                        constraintAnchorM2691f.m2695j();
                        constraintAnchorMo2729m14.m2695j();
                    }
                } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                    ConstraintAnchor constraintAnchorMo2729m15 = mo2729m(type5);
                    if (constraintAnchorMo2729m15.f4831f != constraintAnchorMo2729m9) {
                        constraintAnchorMo2729m15.m2695j();
                    }
                    ConstraintAnchor constraintAnchorM2691f2 = mo2729m(type).m2691f();
                    ConstraintAnchor constraintAnchorMo2729m16 = mo2729m(type14);
                    if (constraintAnchorMo2729m16.m2693h()) {
                        constraintAnchorM2691f2.m2695j();
                        constraintAnchorMo2729m16.m2695j();
                    }
                }
                constraintAnchorMo2729m8.m2686a(constraintAnchorMo2729m9, i10);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchorMo2729m17 = constraintWidget.mo2729m(type2);
        mo2729m(type3).m2686a(constraintAnchorMo2729m17, 0);
        mo2729m(ConstraintAnchor.Type.BOTTOM).m2686a(constraintAnchorMo2729m17, 0);
        mo2729m(type15).m2686a(constraintAnchorMo2729m17, 0);
    }

    /* JADX INFO: renamed from: i */
    public final void m2725i(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        if (constraintAnchor.f4829d == this) {
            m2724h(constraintAnchor.f4830e, constraintAnchor2.f4829d, constraintAnchor2.f4830e, i10);
        }
    }

    /* JADX INFO: renamed from: j */
    public void mo2726j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        this.f4892p = constraintWidget.f4892p;
        this.f4894q = constraintWidget.f4894q;
        this.f4898s = constraintWidget.f4898s;
        this.f4900t = constraintWidget.f4900t;
        int[] iArr = constraintWidget.f4902u;
        int i10 = iArr[0];
        int[] iArr2 = this.f4902u;
        iArr2[0] = i10;
        iArr2[1] = iArr[1];
        this.f4904v = constraintWidget.f4904v;
        this.f4906w = constraintWidget.f4906w;
        this.f4908y = constraintWidget.f4908y;
        this.f4909z = constraintWidget.f4909z;
        this.f4836A = constraintWidget.f4836A;
        this.f4837B = constraintWidget.f4837B;
        this.f4838C = constraintWidget.f4838C;
        int[] iArr3 = constraintWidget.f4839D;
        this.f4839D = Arrays.copyOf(iArr3, iArr3.length);
        this.f4840E = constraintWidget.f4840E;
        this.f4841F = constraintWidget.f4841F;
        this.f4842G = constraintWidget.f4842G;
        this.f4846K.m2695j();
        this.f4847L.m2695j();
        this.f4848M.m2695j();
        this.f4849N.m2695j();
        this.f4850O.m2695j();
        this.f4851P.m2695j();
        this.f4852Q.m2695j();
        this.f4853R.m2695j();
        this.f4857V = (DimensionBehaviour[]) Arrays.copyOf(this.f4857V, 2);
        ConstraintWidget constraintWidget2 = null;
        this.f4858W = this.f4858W == null ? null : map.get(constraintWidget.f4858W);
        this.f4859X = constraintWidget.f4859X;
        this.f4860Y = constraintWidget.f4860Y;
        this.f4861Z = constraintWidget.f4861Z;
        this.f4863a0 = constraintWidget.f4863a0;
        this.f4865b0 = constraintWidget.f4865b0;
        this.f4867c0 = constraintWidget.f4867c0;
        this.f4869d0 = constraintWidget.f4869d0;
        this.f4871e0 = constraintWidget.f4871e0;
        this.f4873f0 = constraintWidget.f4873f0;
        this.f4875g0 = constraintWidget.f4875g0;
        this.f4877h0 = constraintWidget.f4877h0;
        this.f4879i0 = constraintWidget.f4879i0;
        this.f4881j0 = constraintWidget.f4881j0;
        this.f4883k0 = constraintWidget.f4883k0;
        this.f4885l0 = constraintWidget.f4885l0;
        this.f4887m0 = constraintWidget.f4887m0;
        this.f4889n0 = constraintWidget.f4889n0;
        this.f4891o0 = constraintWidget.f4891o0;
        float[] fArr = constraintWidget.f4893p0;
        float f3 = fArr[0];
        float[] fArr2 = this.f4893p0;
        fArr2[0] = f3;
        fArr2[1] = fArr[1];
        ConstraintWidget[] constraintWidgetArr = constraintWidget.f4895q0;
        ConstraintWidget constraintWidget3 = constraintWidgetArr[0];
        ConstraintWidget[] constraintWidgetArr2 = this.f4895q0;
        constraintWidgetArr2[0] = constraintWidget3;
        constraintWidgetArr2[1] = constraintWidgetArr[1];
        ConstraintWidget[] constraintWidgetArr3 = constraintWidget.f4897r0;
        ConstraintWidget constraintWidget4 = constraintWidgetArr3[0];
        ConstraintWidget[] constraintWidgetArr4 = this.f4897r0;
        constraintWidgetArr4[0] = constraintWidget4;
        constraintWidgetArr4[1] = constraintWidgetArr3[1];
        ConstraintWidget constraintWidget5 = constraintWidget.f4899s0;
        this.f4899s0 = constraintWidget5 == null ? null : map.get(constraintWidget5);
        ConstraintWidget constraintWidget6 = constraintWidget.f4901t0;
        if (constraintWidget6 != null) {
            constraintWidget2 = map.get(constraintWidget6);
        }
        this.f4901t0 = constraintWidget2;
    }

    /* JADX INFO: renamed from: k */
    public final void m2727k(C0726c c0726c) {
        c0726c.m2675k(this.f4846K);
        c0726c.m2675k(this.f4847L);
        c0726c.m2675k(this.f4848M);
        c0726c.m2675k(this.f4849N);
        if (this.f4869d0 > 0) {
            c0726c.m2675k(this.f4850O);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2728l() {
        if (this.f4868d == null) {
            this.f4868d = new C0734c(this);
        }
        if (this.f4870e == null) {
            this.f4870e = new C0735d(this);
        }
    }

    /* JADX INFO: renamed from: m */
    public ConstraintAnchor mo2729m(ConstraintAnchor.Type type) {
        switch (C0729a.f4910a[type.ordinal()]) {
            case 1:
                return this.f4846K;
            case 2:
                return this.f4847L;
            case 3:
                return this.f4848M;
            case 4:
                return this.f4849N;
            case 5:
                return this.f4850O;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.f4853R;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.f4851P;
            case 8:
                return this.f4852Q;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* JADX INFO: renamed from: n */
    public final DimensionBehaviour m2730n(int i10) {
        if (i10 == 0) {
            return this.f4857V[0];
        }
        if (i10 == 1) {
            return this.f4857V[1];
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final int m2731o() {
        if (this.f4881j0 == 8) {
            return 0;
        }
        return this.f4860Y;
    }

    /* JADX INFO: renamed from: p */
    public final ConstraintWidget m2732p(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor3 = this.f4848M;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4831f;
            if (constraintAnchor4 != null && constraintAnchor4.f4831f == constraintAnchor3) {
                return constraintAnchor4.f4829d;
            }
        } else if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.f4849N).f4831f) != null && constraintAnchor2.f4831f == constraintAnchor) {
            return constraintAnchor2.f4829d;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final ConstraintWidget m2733q(int i10) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor3 = this.f4846K;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f4831f;
            if (constraintAnchor4 != null && constraintAnchor4.f4831f == constraintAnchor3) {
                return constraintAnchor4.f4829d;
            }
        } else if (i10 == 1 && (constraintAnchor2 = (constraintAnchor = this.f4847L).f4831f) != null && constraintAnchor2.f4831f == constraintAnchor) {
            return constraintAnchor2.f4829d;
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void mo2734r(StringBuilder sb2) {
        sb2.append("  " + this.f4882k + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.f4859X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f4860Y);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f4865b0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f4867c0);
        sb2.append("\n");
        m2701t(sb2, "left", this.f4846K);
        m2701t(sb2, "top", this.f4847L);
        m2701t(sb2, "right", this.f4848M);
        m2701t(sb2, "bottom", this.f4849N);
        m2701t(sb2, "baseline", this.f4850O);
        m2701t(sb2, "centerX", this.f4851P);
        m2701t(sb2, "centerY", this.f4852Q);
        int i10 = this.f4859X;
        int i11 = this.f4871e0;
        int i12 = this.f4839D[0];
        int i13 = this.f4904v;
        int i14 = this.f4898s;
        float f3 = this.f4907x;
        float[] fArr = this.f4893p0;
        float f10 = fArr[0];
        m2700s(sb2, "    width", i10, i11, i12, i13, i14, f3);
        int i15 = this.f4860Y;
        int i16 = this.f4873f0;
        int i17 = this.f4839D[1];
        int i18 = this.f4908y;
        int i19 = this.f4900t;
        float f11 = this.f4836A;
        float f12 = fArr[1];
        m2700s(sb2, "    height", i15, i16, i17, i18, i19, f11);
        float f13 = this.f4861Z;
        int i20 = this.f4863a0;
        if (f13 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f13);
            sb2.append(",");
            sb2.append(i20);
            sb2.append("");
            sb2.append("],\n");
        }
        m2699L(sb2, "    horizontalBias", this.f4875g0, 0.5f);
        m2699L(sb2, "    verticalBias", this.f4877h0, 0.5f);
        m2698K(this.f4889n0, 0, "    horizontalChainStyle", sb2);
        m2698K(this.f4891o0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4887m0 != null ? C0009a.m23l(new StringBuilder("type: "), this.f4887m0, " ") : "");
        sb2.append(this.f4885l0 != null ? C0009a.m23l(new StringBuilder("id: "), this.f4885l0, " ") : "");
        sb2.append("(");
        sb2.append(this.f4865b0);
        sb2.append(", ");
        sb2.append(this.f4867c0);
        sb2.append(") - (");
        sb2.append(this.f4859X);
        sb2.append(" x ");
        return C0166e.m768o(sb2, this.f4860Y, ")");
    }

    /* JADX INFO: renamed from: u */
    public final int m2735u() {
        if (this.f4881j0 == 8) {
            return 0;
        }
        return this.f4859X;
    }

    /* JADX INFO: renamed from: v */
    public final int m2736v() {
        ConstraintWidget constraintWidget = this.f4858W;
        return (constraintWidget == null || !(constraintWidget instanceof C0738d)) ? this.f4865b0 : ((C0738d) constraintWidget).f4965D0 + this.f4865b0;
    }

    /* JADX INFO: renamed from: w */
    public final int m2737w() {
        ConstraintWidget constraintWidget = this.f4858W;
        return (constraintWidget == null || !(constraintWidget instanceof C0738d)) ? this.f4867c0 : ((C0738d) constraintWidget).f4966E0 + this.f4867c0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m2738x(int i10) {
        if (i10 == 0) {
            return (this.f4846K.f4831f != null ? 1 : 0) + (this.f4848M.f4831f != null ? 1 : 0) < 2;
        }
        return ((this.f4847L.f4831f != null ? 1 : 0) + (this.f4849N.f4831f != null ? 1 : 0)) + (this.f4850O.f4831f != null ? 1 : 0) < 2;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m2739y(int i10, int i11) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (i10 == 0) {
            ConstraintAnchor constraintAnchor5 = this.f4846K;
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f4831f;
            if (constraintAnchor6 != null && constraintAnchor6.f4828c && (constraintAnchor4 = (constraintAnchor3 = this.f4848M).f4831f) != null && constraintAnchor4.f4828c) {
                return (constraintAnchor4.m2689d() - constraintAnchor3.m2690e()) - (constraintAnchor5.m2690e() + constraintAnchor5.f4831f.m2689d()) >= i11;
            }
        } else {
            ConstraintAnchor constraintAnchor7 = this.f4847L;
            ConstraintAnchor constraintAnchor8 = constraintAnchor7.f4831f;
            if (constraintAnchor8 != null && constraintAnchor8.f4828c && (constraintAnchor2 = (constraintAnchor = this.f4849N).f4831f) != null && constraintAnchor2.f4828c) {
                return (constraintAnchor2.m2689d() - constraintAnchor.m2690e()) - (constraintAnchor7.m2690e() + constraintAnchor7.f4831f.m2689d()) >= i11;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final void m2740z(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i10, int i11) {
        mo2729m(type).m2687b(constraintWidget.mo2729m(type2), i10, i11, true);
    }
}
