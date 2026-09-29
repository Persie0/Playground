package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.AbstractC3393o1;
import p000.C2897cu;
import p000.RunnableC3468pp;
import p000.a34;
import p000.bj4;
import p000.cg9;
import p000.d36;
import p000.e36;
import p000.f36;
import p000.fo2;
import p000.g36;
import p000.gva;
import p000.h36;
import p000.i36;
import p000.ja0;
import p000.jc2;
import p000.jj1;
import p000.kj1;
import p000.lj1;
import p000.lua;
import p000.m36;
import p000.mv5;
import p000.n36;
import p000.q41;
import p000.qad;
import p000.sh9;
import p000.sj1;
import p000.th9;
import p000.tva;
import p000.uj6;
import p000.uva;
import p000.ux5;
import p000.vi9;
import p000.vj1;
import p000.w26;
import p000.web;
import p000.wi9;
import p000.wj1;
import p000.y26;
import p000.y7a;
import p000.z9d;
import p000.ztb;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0475b extends ConstraintLayout implements uj6 {

    /* JADX INFO: renamed from: S0 */
    public static boolean f5366S0;

    /* JADX INFO: renamed from: A0 */
    public int f5367A0;

    /* JADX INFO: renamed from: B0 */
    public int f5368B0;

    /* JADX INFO: renamed from: C0 */
    public int f5369C0;

    /* JADX INFO: renamed from: D0 */
    public int f5370D0;

    /* JADX INFO: renamed from: E0 */
    public int f5371E0;

    /* JADX INFO: renamed from: F0 */
    public float f5372F0;

    /* JADX INFO: renamed from: G0 */
    public final web f5373G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f5374H0;

    /* JADX INFO: renamed from: I0 */
    public C0474a f5375I0;

    /* JADX INFO: renamed from: J0 */
    public mv5 f5376J0;

    /* JADX INFO: renamed from: K0 */
    public final Rect f5377K0;

    /* JADX INFO: renamed from: L */
    public C0476c f5378L;

    /* JADX INFO: renamed from: L0 */
    public boolean f5379L0;

    /* JADX INFO: renamed from: M */
    public d36 f5380M;

    /* JADX INFO: renamed from: M0 */
    public MotionLayout$TransitionState f5381M0;

    /* JADX INFO: renamed from: N */
    public Interpolator f5382N;

    /* JADX INFO: renamed from: N0 */
    public final g36 f5383N0;

    /* JADX INFO: renamed from: O */
    public float f5384O;

    /* JADX INFO: renamed from: O0 */
    public boolean f5385O0;

    /* JADX INFO: renamed from: P */
    public int f5386P;

    /* JADX INFO: renamed from: P0 */
    public final RectF f5387P0;

    /* JADX INFO: renamed from: Q */
    public int f5388Q;

    /* JADX INFO: renamed from: Q0 */
    public View f5389Q0;

    /* JADX INFO: renamed from: R */
    public int f5390R;

    /* JADX INFO: renamed from: R0 */
    public Matrix f5391R0;

    /* JADX INFO: renamed from: S */
    public int f5392S;

    /* JADX INFO: renamed from: T */
    public int f5393T;

    /* JADX INFO: renamed from: U */
    public boolean f5394U;

    /* JADX INFO: renamed from: V */
    public final HashMap f5395V;

    /* JADX INFO: renamed from: W */
    public long f5396W;

    /* JADX INFO: renamed from: a0 */
    public float f5397a0;

    /* JADX INFO: renamed from: b0 */
    public float f5398b0;

    /* JADX INFO: renamed from: c0 */
    public float f5399c0;

    /* JADX INFO: renamed from: d0 */
    public long f5400d0;

    /* JADX INFO: renamed from: e0 */
    public float f5401e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f5402f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f5403g0;

    /* JADX INFO: renamed from: h0 */
    public int f5404h0;

    /* JADX INFO: renamed from: i0 */
    public f36 f5405i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f5406j0;

    /* JADX INFO: renamed from: k0 */
    public final vi9 f5407k0;

    /* JADX INFO: renamed from: l0 */
    public final e36 f5408l0;

    /* JADX INFO: renamed from: m0 */
    public jc2 f5409m0;

    /* JADX INFO: renamed from: n0 */
    public int f5410n0;

    /* JADX INFO: renamed from: o0 */
    public int f5411o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f5412p0;

    /* JADX INFO: renamed from: q0 */
    public float f5413q0;

    /* JADX INFO: renamed from: r0 */
    public float f5414r0;

    /* JADX INFO: renamed from: s0 */
    public long f5415s0;

    /* JADX INFO: renamed from: t0 */
    public float f5416t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f5417u0;

    /* JADX INFO: renamed from: v0 */
    public int f5418v0;

    /* JADX INFO: renamed from: w0 */
    public long f5419w0;

    /* JADX INFO: renamed from: x0 */
    public float f5420x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f5421y0;

    /* JADX INFO: renamed from: z0 */
    public int f5422z0;

    public AbstractC0475b(Context context, AttributeSet attributeSet, int i) {
        C0476c c0476c;
        super(context, attributeSet, i);
        this.f5382N = null;
        this.f5384O = 0.0f;
        this.f5386P = -1;
        this.f5388Q = -1;
        this.f5390R = -1;
        this.f5392S = 0;
        this.f5393T = 0;
        this.f5394U = true;
        this.f5395V = new HashMap();
        this.f5396W = 0L;
        this.f5397a0 = 1.0f;
        this.f5398b0 = 0.0f;
        this.f5399c0 = 0.0f;
        this.f5401e0 = 0.0f;
        this.f5403g0 = false;
        this.f5404h0 = 0;
        this.f5406j0 = false;
        vi9 vi9Var = new vi9();
        wi9 wi9Var = new wi9();
        wi9Var.f66872k = false;
        vi9Var.f65419a = wi9Var;
        vi9Var.f65421c = wi9Var;
        this.f5407k0 = vi9Var;
        this.f5408l0 = new e36(this);
        this.f5412p0 = false;
        this.f5417u0 = false;
        this.f5418v0 = 0;
        this.f5419w0 = -1L;
        this.f5420x0 = 0.0f;
        this.f5421y0 = false;
        this.f5373G0 = new web(15);
        this.f5374H0 = false;
        this.f5376J0 = null;
        new HashMap();
        this.f5377K0 = new Rect();
        this.f5379L0 = false;
        this.f5381M0 = MotionLayout$TransitionState.UNDEFINED;
        this.f5383N0 = new g36(this);
        this.f5385O0 = false;
        this.f5387P0 = new RectF();
        this.f5389Q0 = null;
        this.f5391R0 = null;
        new ArrayList();
        f5366S0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R$styleable.MotionLayout_layoutDescription) {
                    this.f5378L = new C0476c(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R$styleable.MotionLayout_currentState) {
                    this.f5388Q = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R$styleable.MotionLayout_motionProgress) {
                    this.f5401e0 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f5403g0 = true;
                } else if (index == R$styleable.MotionLayout_applyMotionScene) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == R$styleable.MotionLayout_showPaths) {
                    if (this.f5404h0 == 0) {
                        this.f5404h0 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == R$styleable.MotionLayout_motionDebug) {
                    this.f5404h0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f5378L == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f5378L = null;
            }
        }
        if (this.f5404h0 != 0) {
            C0476c c0476c2 = this.f5378L;
            if (c0476c2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iM1956g = c0476c2.m1956g();
                C0476c c0476c3 = this.f5378L;
                sj1 sj1VarM1952b = c0476c3.m1952b(c0476c3.m1956g());
                String strM19841c = qad.m19841c(getContext(), iM1956g);
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder sbM17742q = AbstractC3393o1.m17742q("CHECK: ", strM19841c, " ALL VIEWS SHOULD HAVE ID's ");
                        sbM17742q.append(childAt.getClass().getName());
                        sbM17742q.append(" does not!");
                        Log.w("MotionLayout", sbM17742q.toString());
                    }
                    if (sj1VarM1952b.m21412i(id) == null) {
                        StringBuilder sbM17742q2 = AbstractC3393o1.m17742q("CHECK: ", strM19841c, " NO CONSTRAINTS for ");
                        sbM17742q2.append(qad.m19842d(childAt));
                        Log.w("MotionLayout", sbM17742q2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) sj1VarM1952b.f60922g.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[i4] = numArr[i4].intValue();
                }
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = iArr[i5];
                    String strM19841c2 = qad.m19841c(getContext(), i6);
                    if (findViewById(iArr[i5]) == null) {
                        Log.w("MotionLayout", "CHECK: " + strM19841c + " NO View matches id " + strM19841c2);
                    }
                    if (sj1VarM1952b.m21411h(i6).f52823e.f54422d == -1) {
                        Log.w("MotionLayout", ux5.m22991n("CHECK: ", strM19841c, "(", strM19841c2, ") no LAYOUT_HEIGHT"));
                    }
                    if (sj1VarM1952b.m21411h(i6).f52823e.f54420c == -1) {
                        Log.w("MotionLayout", ux5.m22991n("CHECK: ", strM19841c, "(", strM19841c2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (n36 n36Var : this.f5378L.f5426d) {
                    if (n36Var == this.f5378L.f5425c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (n36Var.f52273d == n36Var.f52272c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i7 = n36Var.f52273d;
                    int i8 = n36Var.f52272c;
                    String strM19841c3 = qad.m19841c(getContext(), i7);
                    String strM19841c4 = qad.m19841c(getContext(), i8);
                    if (sparseIntArray.get(i7) == i8) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strM19841c3 + "->" + strM19841c4);
                    }
                    if (sparseIntArray2.get(i8) == i7) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strM19841c3 + "->" + strM19841c4);
                    }
                    sparseIntArray.put(i7, i8);
                    sparseIntArray2.put(i8, i7);
                    if (this.f5378L.m1952b(i7) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + strM19841c3);
                    }
                    if (this.f5378L.m1952b(i8) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + strM19841c3);
                    }
                }
            }
        }
        if (this.f5388Q != -1 || (c0476c = this.f5378L) == null) {
            return;
        }
        this.f5388Q = c0476c.m1956g();
        this.f5386P = this.f5378L.m1956g();
        n36 n36Var2 = this.f5378L.f5425c;
        this.f5390R = n36Var2 != null ? n36Var2.f52272c : -1;
    }

    /* JADX INFO: renamed from: o */
    public static Rect m1935o(AbstractC0475b abstractC0475b, vj1 vj1Var) {
        Rect rect = abstractC0475b.f5377K0;
        rect.top = vj1Var.m23328t();
        rect.left = vj1Var.m23327s();
        rect.right = vj1Var.m23326r() + rect.left;
        rect.bottom = vj1Var.m23322l() + rect.top;
        return rect;
    }

    /* JADX INFO: renamed from: A */
    public final void m1936A(int i, sj1 sj1Var) {
        C0476c c0476c = this.f5378L;
        if (c0476c != null) {
            c0476c.f5429g.put(i, sj1Var);
        }
        this.f5383N0.m12326e(this.f5378L.m1952b(this.f5386P), this.f5378L.m1952b(this.f5390R));
        m1945v();
        if (this.f5388Q == i) {
            sj1Var.m21408b(this);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m1937B(int i, View... viewArr) {
        C0476c c0476c = this.f5378L;
        if (c0476c == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        a34 a34Var = c0476c.f5439q;
        String str = (String) a34Var.f176d;
        ArrayList arrayList = new ArrayList();
        uva uvaVar = null;
        for (uva uvaVar2 : (ArrayList) a34Var.f174b) {
            if (uvaVar2.f64415a == i) {
                for (View view : viewArr) {
                    if (uvaVar2.m22948b(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    uvaVar = uvaVar2;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    AbstractC0475b abstractC0475b = (AbstractC0475b) a34Var.f173a;
                    int currentState = abstractC0475b.getCurrentState();
                    if (uvaVar2.f64419e != 2) {
                        if (currentState == -1) {
                            Log.w(str, "No support for ViewTransition within transition yet. Currently: ".concat(abstractC0475b.toString()));
                        } else {
                            C0476c c0476c2 = abstractC0475b.f5378L;
                            sj1 sj1VarM1952b = c0476c2 == null ? null : c0476c2.m1952b(currentState);
                            if (sj1VarM1952b != null) {
                                uvaVar = uvaVar2;
                                uvaVar.m22947a(a34Var, (AbstractC0475b) a34Var.f173a, currentState, sj1VarM1952b, viewArr2);
                            }
                        }
                        uvaVar = uvaVar2;
                    } else {
                        uvaVar = uvaVar2;
                        uvaVar.m22947a(a34Var, (AbstractC0475b) a34Var.f173a, currentState, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
        }
        if (uvaVar == null) {
            Log.e(str, " Could not find ViewTransition");
        }
    }

    @Override // p000.uj6
    /* JADX INFO: renamed from: c */
    public final void mo660c(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f5412p0 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f5412p0 = false;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: d */
    public final void mo661d(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        Paint paint;
        Paint paint2;
        int i4;
        Paint paint3;
        int i5;
        Paint paint4;
        float fMin;
        double dMo3907b;
        Paint paint5;
        String resourceEntryName;
        a34 a34Var;
        m1941r(false);
        C0476c c0476c = this.f5378L;
        if (c0476c != null && (a34Var = c0476c.f5439q) != null) {
            ArrayList arrayList2 = (ArrayList) a34Var.f178f;
            ArrayList arrayList3 = (ArrayList) a34Var.f177e;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((tva) it.next()).m22315a();
                }
                ((ArrayList) a34Var.f177e).removeAll(arrayList2);
                arrayList2.clear();
                if (((ArrayList) a34Var.f177e).isEmpty()) {
                    a34Var.f177e = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.f5378L == null) {
            return;
        }
        if ((this.f5404h0 & 1) == 1 && !isInEditMode()) {
            this.f5418v0++;
            long nanoTime = getNanoTime();
            long j = this.f5419w0;
            if (j != -1) {
                long j2 = nanoTime - j;
                if (j2 > 200000000) {
                    this.f5420x0 = ((int) ((this.f5418v0 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f5418v0 = 0;
                    this.f5419w0 = nanoTime;
                }
            } else {
                this.f5419w0 = nanoTime;
            }
            Paint paint6 = new Paint();
            paint6.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5420x0);
            sb.append(" fps ");
            int i6 = this.f5386P;
            StringBuilder sbM22997t = ux5.m22997t(AbstractC3393o1.m17738m(sb, i6 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i6), " -> "));
            int i7 = this.f5390R;
            sbM22997t.append(i7 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i7));
            sbM22997t.append(" (progress: ");
            sbM22997t.append(progress);
            sbM22997t.append(" ) state=");
            int i8 = this.f5388Q;
            if (i8 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i8 != -1 ? getContext().getResources().getResourceEntryName(i8) : "UNDEFINED";
            }
            sbM22997t.append(resourceEntryName);
            String string = sbM22997t.toString();
            paint6.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint6);
            paint6.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint6);
        }
        if (this.f5404h0 > 1) {
            if (this.f5405i0 == null) {
                this.f5405i0 = new f36(this);
            }
            f36 f36Var = this.f5405i0;
            C0476c c0476c2 = this.f5378L;
            n36 n36Var = c0476c2.f5425c;
            int i9 = n36Var != null ? n36Var.f52277h : c0476c2.f5432j;
            int i10 = this.f5404h0;
            Paint paint7 = f36Var.f38350g;
            Paint paint8 = f36Var.f38349f;
            Paint paint9 = f36Var.f38352i;
            int i11 = f36Var.f38356m;
            Paint paint10 = f36Var.f38348e;
            AbstractC0475b abstractC0475b = f36Var.f38357n;
            HashMap map = this.f5395V;
            if (map == null || map.size() == 0) {
                return;
            }
            canvas.save();
            if (!abstractC0475b.isInEditMode() && (i10 & 1) == 2) {
                String str = abstractC0475b.getContext().getResources().getResourceName(abstractC0475b.f5390R) + ":" + abstractC0475b.getProgress();
                canvas.drawText(str, 10.0f, abstractC0475b.getHeight() - 30, f36Var.f38351h);
                canvas.drawText(str, 11.0f, abstractC0475b.getHeight() - 29, paint10);
            }
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                y26 y26Var = (y26) it2.next();
                i36 i36Var = y26Var.f69146f;
                ArrayList arrayList4 = y26Var.f69161u;
                int iMax = i36Var.f43414b;
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    iMax = Math.max(iMax, ((i36) it3.next()).f43414b);
                }
                int iMax2 = Math.max(iMax, y26Var.f69147g.f43414b);
                if (i10 > 0 && iMax2 == 0) {
                    iMax2 = 1;
                }
                if (iMax2 != 0) {
                    float[] fArr = f36Var.f38346c;
                    int[] iArr = f36Var.f38345b;
                    if (fArr != null) {
                        double[] dArrMo9888f = y26Var.f69150j[0].mo9888f();
                        if (iArr != null) {
                            Iterator it4 = arrayList4.iterator();
                            int i12 = 0;
                            while (it4.hasNext()) {
                                iArr[i12] = ((i36) it4.next()).f43410J;
                                i12++;
                                arrayList4 = arrayList4;
                            }
                        }
                        arrayList = arrayList4;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < dArrMo9888f.length) {
                            float[] fArr2 = fArr;
                            double[] dArr = dArrMo9888f;
                            y26Var.f69150j[0].mo9885c(dArrMo9888f[i13], y26Var.f69156p);
                            y26Var.f69146f.m13640c(dArr[i13], y26Var.f69155o, y26Var.f69156p, fArr2, i14);
                            i14 += 2;
                            i13++;
                            fArr = fArr2;
                            i9 = i9;
                            dArrMo9888f = dArr;
                        }
                        i = i9;
                        i2 = i14 / 2;
                    } else {
                        arrayList = arrayList4;
                        i = i9;
                        i2 = 0;
                    }
                    f36Var.f38354k = i2;
                    if (iMax2 >= 1) {
                        int i15 = i / 16;
                        float[] fArr3 = f36Var.f38344a;
                        if (fArr3 == null || fArr3.length != i15 * 2) {
                            f36Var.f38344a = new float[i15 * 2];
                            f36Var.f38347d = new Path();
                        }
                        float f = i11;
                        canvas.translate(f, f);
                        paint10.setColor(1996488704);
                        paint9.setColor(1996488704);
                        paint8.setColor(1996488704);
                        paint7.setColor(1996488704);
                        float[] fArr4 = f36Var.f38344a;
                        float f2 = 1.0f / (i15 - 1);
                        HashMap map2 = y26Var.f69165y;
                        float f3 = 1.0f;
                        gva gvaVar = map2 == null ? null : (gva) map2.get("translationX");
                        HashMap map3 = y26Var.f69165y;
                        gva gvaVar2 = map3 == null ? null : (gva) map3.get("translationY");
                        i3 = i10;
                        HashMap map4 = y26Var.f69166z;
                        lua luaVar = map4 == null ? null : (lua) map4.get("translationX");
                        HashMap map5 = y26Var.f69166z;
                        lua luaVar2 = map5 == null ? null : (lua) map5.get("translationY");
                        int i16 = 0;
                        while (true) {
                            float f4 = Float.NaN;
                            float f5 = 0.0f;
                            if (i16 >= i15) {
                                break;
                            }
                            int i17 = i15;
                            float f6 = i16 * f2;
                            float f7 = y26Var.f69154n;
                            if (f7 != f3) {
                                float f8 = y26Var.f69153m;
                                fMin = f6 < f8 ? 0.0f : f6;
                                i5 = i16;
                                paint4 = paint7;
                                if (fMin > f8 && fMin < 1.0d) {
                                    fMin = Math.min((fMin - f8) * f7, f3);
                                }
                            } else {
                                i5 = i16;
                                paint4 = paint7;
                                fMin = f6;
                            }
                            double d = fMin;
                            fo2 fo2Var = i36Var.f43413a;
                            Iterator it5 = arrayList.iterator();
                            while (it5.hasNext()) {
                                Iterator it6 = it5;
                                i36 i36Var2 = (i36) it5.next();
                                i36 i36Var3 = i36Var;
                                fo2 fo2Var2 = i36Var2.f43413a;
                                if (fo2Var2 != null) {
                                    float f9 = i36Var2.f43415c;
                                    if (f9 < fMin) {
                                        f5 = f9;
                                        fo2Var = fo2Var2;
                                    } else if (Float.isNaN(f4)) {
                                        f4 = i36Var2.f43415c;
                                    }
                                }
                                it5 = it6;
                                i36Var = i36Var3;
                            }
                            i36 i36Var4 = i36Var;
                            if (fo2Var != null) {
                                if (Float.isNaN(f4)) {
                                    f4 = 1.0f;
                                }
                                float f10 = f4 - f5;
                                dMo3907b = (((float) fo2Var.mo3907b((fMin - f5) / f10)) * f10) + f5;
                            } else {
                                dMo3907b = d;
                            }
                            y26Var.f69150j[0].mo9885c(dMo3907b, y26Var.f69156p);
                            C2897cu c2897cu = y26Var.f69151k;
                            if (c2897cu != null) {
                                double[] dArr2 = y26Var.f69156p;
                                paint5 = paint9;
                                if (dArr2.length > 0) {
                                    c2897cu.mo9885c(dMo3907b, dArr2);
                                }
                            } else {
                                paint5 = paint9;
                            }
                            int i18 = i5 * 2;
                            y26Var.f69146f.m13640c(dMo3907b, y26Var.f69155o, y26Var.f69156p, fArr4, i18);
                            if (luaVar != null) {
                                fArr4[i18] = luaVar.m16547a(fMin) + fArr4[i18];
                            } else if (gvaVar != null) {
                                fArr4[i18] = gvaVar.m12918a(fMin) + fArr4[i18];
                            }
                            if (luaVar2 != null) {
                                int i19 = i18 + 1;
                                fArr4[i19] = luaVar2.m16547a(fMin) + fArr4[i19];
                            } else if (gvaVar2 != null) {
                                int i20 = i18 + 1;
                                fArr4[i20] = gvaVar2.m12918a(fMin) + fArr4[i20];
                            }
                            i16 = i5 + 1;
                            i15 = i17;
                            paint7 = paint4;
                            i36Var = i36Var4;
                            i11 = i11;
                            paint9 = paint5;
                            f3 = 1.0f;
                        }
                        i36 i36Var5 = i36Var;
                        Paint paint11 = paint7;
                        f36Var.m11519a(canvas, iMax2, f36Var.f38354k, y26Var);
                        paint10.setColor(-21965);
                        paint8.setColor(-2067046);
                        paint2 = paint9;
                        paint2.setColor(-2067046);
                        Paint paint12 = paint11;
                        paint12.setColor(-13391360);
                        int i21 = i11;
                        float f11 = -i21;
                        canvas.translate(f11, f11);
                        f36Var.m11519a(canvas, iMax2, f36Var.f38354k, y26Var);
                        char c = 5;
                        if (iMax2 == 5) {
                            float[] fArr5 = f36Var.f38353j;
                            f36Var.f38347d.reset();
                            int i22 = 0;
                            while (i22 <= 50) {
                                char c2 = c;
                                float[] fArr6 = fArr5;
                                y26Var.f69150j[0].mo9885c(y26Var.m24865a(i22 / 50.0f, null), y26Var.f69156p);
                                int[] iArr2 = y26Var.f69155o;
                                double[] dArr3 = y26Var.f69156p;
                                i36 i36Var6 = i36Var5;
                                float f12 = i36Var6.f43417e;
                                float fCos = i36Var6.f43418f;
                                float f13 = i36Var6.f43419g;
                                float f14 = i36Var6.f43420h;
                                int i23 = i21;
                                y26 y26Var2 = y26Var;
                                int i24 = 0;
                                while (true) {
                                    paint3 = paint12;
                                    if (i24 >= iArr2.length) {
                                        break;
                                    }
                                    int[] iArr3 = iArr2;
                                    float f15 = (float) dArr3[i24];
                                    int i25 = iArr3[i24];
                                    int i26 = i24;
                                    if (i25 == 1) {
                                        f12 = f15;
                                    } else if (i25 == 2) {
                                        fCos = f15;
                                    } else if (i25 == 3) {
                                        f13 = f15;
                                    } else if (i25 == 4) {
                                        f14 = f15;
                                    }
                                    i24 = i26 + 1;
                                    iArr2 = iArr3;
                                    paint12 = paint3;
                                }
                                if (i36Var6.f43408H != null) {
                                    double d2 = f12;
                                    double d3 = fCos;
                                    float fSin = (float) (((Math.sin(d3) * d2) + 0.0d) - ((double) (f13 / 2.0f)));
                                    fCos = (float) ((0.0d - (Math.cos(d3) * d2)) - ((double) (f14 / 2.0f)));
                                    f12 = fSin;
                                }
                                float f16 = f13 + f12;
                                float f17 = f14 + fCos;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f18 = f12 + 0.0f;
                                float f19 = fCos + 0.0f;
                                float f20 = f16 + 0.0f;
                                float f21 = f17 + 0.0f;
                                fArr6[0] = f18;
                                fArr6[1] = f19;
                                fArr6[2] = f20;
                                fArr6[3] = f19;
                                fArr6[4] = f20;
                                fArr6[c2] = f21;
                                fArr6[6] = f18;
                                fArr6[7] = f21;
                                f36Var.f38347d.moveTo(f18, f19);
                                f36Var.f38347d.lineTo(fArr6[2], fArr6[3]);
                                f36Var.f38347d.lineTo(fArr6[4], fArr6[c2]);
                                f36Var.f38347d.lineTo(fArr6[6], fArr6[7]);
                                f36Var.f38347d.close();
                                i22++;
                                i36Var5 = i36Var6;
                                fArr5 = fArr6;
                                c = c2;
                                y26Var = y26Var2;
                                paint12 = paint3;
                                i21 = i23;
                            }
                            i4 = i21;
                            paint = paint12;
                            paint10.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(f36Var.f38347d, paint10);
                            canvas.translate(-2.0f, -2.0f);
                            paint10.setColor(-65536);
                            canvas.drawPath(f36Var.f38347d, paint10);
                        } else {
                            i4 = i21;
                            paint = paint12;
                        }
                    } else {
                        i3 = i10;
                        paint = paint7;
                        paint2 = paint9;
                        i4 = i11;
                    }
                    paint9 = paint2;
                    it2 = it2;
                    i9 = i;
                    i10 = i3;
                    paint7 = paint;
                    i11 = i4;
                }
            }
            canvas.restore();
        }
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: e */
    public final boolean mo662e(View view, View view2, int i, int i2) {
        n36 n36Var;
        y7a y7aVar;
        C0476c c0476c = this.f5378L;
        return (c0476c == null || (n36Var = c0476c.f5425c) == null || (y7aVar = n36Var.f52281l) == null || (y7aVar.f69448w & 2) != 0) ? false : true;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: f */
    public final void mo663f(View view, View view2, int i, int i2) {
        this.f5415s0 = getNanoTime();
        this.f5416t0 = 0.0f;
        this.f5413q0 = 0.0f;
        this.f5414r0 = 0.0f;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: g */
    public final void mo664g(View view, int i) {
        y7a y7aVar;
        int i2;
        C0476c c0476c = this.f5378L;
        if (c0476c != null) {
            float f = this.f5416t0;
            if (f == 0.0f) {
                return;
            }
            float f2 = this.f5413q0 / f;
            float f3 = this.f5414r0 / f;
            n36 n36Var = c0476c.f5425c;
            if (n36Var == null || (y7aVar = n36Var.f52281l) == null) {
                return;
            }
            float[] fArr = y7aVar.f69439n;
            y7aVar.f69438m = false;
            AbstractC0475b abstractC0475b = y7aVar.f69443r;
            float progress = abstractC0475b.getProgress();
            y7aVar.f69443r.m1942s(y7aVar.f69429d, progress, y7aVar.f69433h, y7aVar.f69432g, fArr);
            float f4 = y7aVar.f69436k;
            float f5 = f4 != 0.0f ? (f2 * f4) / fArr[0] : (f3 * y7aVar.f69437l) / fArr[1];
            if (!Float.isNaN(f5)) {
                progress += f5 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i2 = y7aVar.f69428c) == 3) {
                return;
            }
            abstractC0475b.m1948y(((double) progress) >= 0.5d ? 1.0f : 0.0f, f5, i2);
        }
    }

    public int[] getConstraintSetIds() {
        C0476c c0476c = this.f5378L;
        if (c0476c == null) {
            return null;
        }
        SparseArray sparseArray = c0476c.f5429g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f5388Q;
    }

    public ArrayList<n36> getDefinedTransitions() {
        C0476c c0476c = this.f5378L;
        if (c0476c == null) {
            return null;
        }
        return c0476c.f5426d;
    }

    public jc2 getDesignTool() {
        if (this.f5409m0 == null) {
            this.f5409m0 = new jc2();
        }
        return this.f5409m0;
    }

    public int getEndState() {
        return this.f5390R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f5399c0;
    }

    public C0476c getScene() {
        return this.f5378L;
    }

    public int getStartState() {
        return this.f5386P;
    }

    public float getTargetPosition() {
        return this.f5401e0;
    }

    public Bundle getTransitionState() {
        if (this.f5375I0 == null) {
            this.f5375I0 = new C0474a(this);
        }
        C0474a c0474a = this.f5375I0;
        AbstractC0475b abstractC0475b = c0474a.f5365e;
        c0474a.f5364d = abstractC0475b.f5390R;
        c0474a.f5363c = abstractC0475b.f5386P;
        c0474a.f5362b = abstractC0475b.getVelocity();
        c0474a.f5361a = abstractC0475b.getProgress();
        C0474a c0474a2 = this.f5375I0;
        c0474a2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", c0474a2.f5361a);
        bundle.putFloat("motion.velocity", c0474a2.f5362b);
        bundle.putInt("motion.StartState", c0474a2.f5363c);
        bundle.putInt("motion.EndState", c0474a2.f5364d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        C0476c c0476c = this.f5378L;
        if (c0476c != null) {
            n36 n36Var = c0476c.f5425c;
            this.f5397a0 = (n36Var != null ? n36Var.f52277h : c0476c.f5432j) / 1000.0f;
        }
        return (long) (this.f5397a0 * 1000.0f);
    }

    public float getVelocity() {
        return this.f5384O;
    }

    @Override // p000.tj6
    /* JADX INFO: renamed from: h */
    public final void mo665h(View view, int i, int i2, int[] iArr, int i3) {
        n36 n36Var;
        boolean z;
        float f;
        y7a y7aVar;
        float f2;
        y7a y7aVar2;
        y7a y7aVar3;
        y7a y7aVar4;
        int i4;
        C0476c c0476c = this.f5378L;
        if (c0476c == null || (n36Var = c0476c.f5425c) == null || (z = n36Var.f52284o)) {
            return;
        }
        int i5 = -1;
        if (z || (y7aVar4 = n36Var.f52281l) == null || (i4 = y7aVar4.f69430e) == -1 || view.getId() == i4) {
            n36 n36Var2 = c0476c.f5425c;
            if ((n36Var2 == null || (y7aVar3 = n36Var2.f52281l) == null) ? false : y7aVar3.f69446u) {
                y7a y7aVar5 = n36Var.f52281l;
                if (y7aVar5 != null && (y7aVar5.f69448w & 4) != 0) {
                    i5 = i2;
                }
                float f3 = this.f5398b0;
                if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            y7a y7aVar6 = n36Var.f52281l;
            if (y7aVar6 == null || (y7aVar6.f69448w & 1) == 0) {
                f = 0.0f;
            } else {
                float f4 = i;
                float f5 = i2;
                n36 n36Var3 = c0476c.f5425c;
                if (n36Var3 == null || (y7aVar2 = n36Var3.f52281l) == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    float[] fArr = y7aVar2.f69439n;
                    f = 0.0f;
                    y7aVar2.f69443r.m1942s(y7aVar2.f69429d, y7aVar2.f69443r.getProgress(), y7aVar2.f69433h, y7aVar2.f69432g, fArr);
                    float f6 = y7aVar2.f69436k;
                    if (f6 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f2 = (f4 * f6) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f2 = (f5 * y7aVar2.f69437l) / fArr[1];
                    }
                }
                float f7 = this.f5399c0;
                if ((f7 <= f && f2 < f) || (f7 >= 1.0f && f2 > f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC3468pp((ViewGroup) view, 13));
                    return;
                }
            }
            float f8 = this.f5398b0;
            long nanoTime = getNanoTime();
            float f9 = i;
            this.f5413q0 = f9;
            float f10 = i2;
            this.f5414r0 = f10;
            this.f5416t0 = (float) ((nanoTime - this.f5415s0) * 1.0E-9d);
            this.f5415s0 = nanoTime;
            n36 n36Var4 = c0476c.f5425c;
            if (n36Var4 != null && (y7aVar = n36Var4.f52281l) != null) {
                float[] fArr2 = y7aVar.f69439n;
                AbstractC0475b abstractC0475b = y7aVar.f69443r;
                float progress = abstractC0475b.getProgress();
                if (!y7aVar.f69438m) {
                    y7aVar.f69438m = true;
                    abstractC0475b.setProgress(progress);
                }
                y7aVar.f69443r.m1942s(y7aVar.f69429d, progress, y7aVar.f69433h, y7aVar.f69432g, fArr2);
                if (Math.abs((y7aVar.f69437l * fArr2[1]) + (y7aVar.f69436k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f11 = y7aVar.f69436k;
                float fMax = Math.max(Math.min(progress + (f11 != f ? (f9 * f11) / fArr2[0] : (f10 * y7aVar.f69437l) / fArr2[1]), 1.0f), f);
                if (fMax != abstractC0475b.getProgress()) {
                    abstractC0475b.setProgress(fMax);
                }
            }
            if (f8 != this.f5398b0) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            m1941r(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f5412p0 = true;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* JADX INFO: renamed from: k */
    public final void mo1938k(int i) {
        this.f5459k = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        n36 n36Var;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        C0476c c0476c = this.f5378L;
        if (c0476c != null && (i = this.f5388Q) != -1) {
            sj1 sj1VarM1952b = c0476c.m1952b(i);
            C0476c c0476c2 = this.f5378L;
            SparseArray sparseArray = c0476c2.f5429g;
            loop0: for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                SparseIntArray sparseIntArray = c0476c2.f5431i;
                int i3 = sparseIntArray.get(iKeyAt);
                int size = sparseIntArray.size();
                while (true) {
                    if (i3 > 0) {
                        if (i3 != iKeyAt) {
                            int i4 = size - 1;
                            if (size >= 0) {
                                i3 = sparseIntArray.get(i3);
                                size = i4;
                            }
                        }
                        Log.e("MotionScene", "Cannot be derived from yourself");
                        break loop0;
                    }
                    c0476c2.m1961l(iKeyAt, this);
                }
            }
            if (sj1VarM1952b != null) {
                sj1VarM1952b.m21408b(this);
            }
            this.f5386P = this.f5388Q;
        }
        m1944u();
        C0474a c0474a = this.f5375I0;
        if (c0474a != null) {
            if (this.f5379L0) {
                post(new RunnableC3468pp(this, 14));
                return;
            } else {
                c0474a.m1934a();
                return;
            }
        }
        C0476c c0476c3 = this.f5378L;
        if (c0476c3 == null || (n36Var = c0476c3.f5425c) == null || n36Var.f52283n != 4) {
            return;
        }
        m1939p(1.0f);
        this.f5376J0 = null;
        setState(MotionLayout$TransitionState.SETUP);
        setState(MotionLayout$TransitionState.MOVING);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        y7a y7aVar;
        int i;
        RectF rectFM24980b;
        C0476c c0476c = this.f5378L;
        if (c0476c == null || !this.f5394U) {
            return false;
        }
        a34 a34Var = c0476c.f5439q;
        if (a34Var != null) {
            ArrayList<uva> arrayList = (ArrayList) a34Var.f174b;
            AbstractC0475b abstractC0475b = (AbstractC0475b) a34Var.f173a;
            int currentState = abstractC0475b.getCurrentState();
            if (currentState == -1) {
                z = false;
            } else {
                if (((HashSet) a34Var.f175c) == null) {
                    a34Var.f175c = new HashSet();
                    for (uva uvaVar : arrayList) {
                        int childCount = abstractC0475b.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = abstractC0475b.getChildAt(i2);
                            if (uvaVar.m22949c(childAt)) {
                                childAt.getId();
                                ((HashSet) a34Var.f175c).add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList arrayList2 = (ArrayList) a34Var.f177e;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    for (tva tvaVar : (ArrayList) a34Var.f177e) {
                        Rect rect2 = tvaVar.f62968l;
                        if (action != 1) {
                            if (action == 2) {
                                tvaVar.f62959c.f69142b.getHitRect(rect2);
                                if (!rect2.contains((int) x, (int) y) && !tvaVar.f62964h) {
                                    tvaVar.m22316b();
                                }
                            }
                        } else if (!tvaVar.f62964h) {
                            tvaVar.m22316b();
                        }
                    }
                }
                z = false;
                if (action == 0 || action == 1) {
                    C0476c c0476c2 = abstractC0475b.f5378L;
                    sj1 sj1VarM1952b = c0476c2 == null ? null : c0476c2.m1952b(currentState);
                    for (uva uvaVar2 : arrayList) {
                        int i3 = uvaVar2.f64416b;
                        if (i3 == 1) {
                            if (action == 0) {
                                for (View view : (HashSet) a34Var.f175c) {
                                    if (uvaVar2.m22949c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            uvaVar2.m22947a(a34Var, (AbstractC0475b) a34Var.f173a, currentState, sj1VarM1952b, view);
                                        }
                                    }
                                }
                            }
                        } else if (i3 == 2) {
                            if (action == 1) {
                                while (r2.hasNext()) {
                                    if (uvaVar2.m22949c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            uvaVar2.m22947a(a34Var, (AbstractC0475b) a34Var.f173a, currentState, sj1VarM1952b, view);
                                        }
                                    }
                                }
                            }
                        } else if (i3 == 3 && action == 0) {
                            while (r2.hasNext()) {
                                if (uvaVar2.m22949c(view)) {
                                    view.getHitRect(rect);
                                    if (rect.contains((int) x, (int) y)) {
                                        uvaVar2.m22947a(a34Var, (AbstractC0475b) a34Var.f173a, currentState, sj1VarM1952b, view);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            z = false;
        }
        n36 n36Var = this.f5378L.f5425c;
        if (n36Var == null || n36Var.f52284o || (y7aVar = n36Var.f52281l) == null) {
            return z;
        }
        if ((motionEvent.getAction() == 0 && (rectFM24980b = y7aVar.m24980b(this, new RectF())) != null && !rectFM24980b.contains(motionEvent.getX(), motionEvent.getY())) || (i = y7aVar.f69430e) == -1) {
            return z;
        }
        View view2 = this.f5389Q0;
        if (view2 == null || view2.getId() != i) {
            this.f5389Q0 = findViewById(i);
        }
        View view3 = this.f5389Q0;
        if (view3 == null) {
            return z;
        }
        float left = view3.getLeft();
        float top = this.f5389Q0.getTop();
        float right = this.f5389Q0.getRight();
        float bottom = this.f5389Q0.getBottom();
        RectF rectF = this.f5387P0;
        rectF.set(left, top, right, bottom);
        return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || m1943t((float) this.f5389Q0.getLeft(), (float) this.f5389Q0.getTop(), this.f5389Q0, motionEvent)) ? z : onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f5374H0 = true;
        try {
            if (this.f5378L == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f5410n0 != i5 || this.f5411o0 != i6) {
                m1945v();
                m1941r(true);
            }
            this.f5410n0 = i5;
            this.f5411o0 = i6;
        } finally {
            this.f5374H0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.f5378L == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.f5392S == i && this.f5393T == i2) ? false : true;
        if (this.f5385O0) {
            this.f5385O0 = false;
            m1944u();
            z3 = true;
        }
        if (this.f5456h) {
            z3 = true;
        }
        this.f5392S = i;
        this.f5393T = i2;
        int iM1956g = this.f5378L.m1956g();
        n36 n36Var = this.f5378L.f5425c;
        int i3 = n36Var == null ? -1 : n36Var.f52272c;
        g36 g36Var = this.f5383N0;
        if ((!z3 && iM1956g == g36Var.f40117e && i3 == g36Var.f40118f) || this.f5386P == -1) {
            if (z3) {
                super.onMeasure(i, i2);
            }
            z = true;
        } else {
            super.onMeasure(i, i2);
            g36Var.m12326e(this.f5378L.m1952b(iM1956g), this.f5378L.m1952b(i3));
            g36Var.m12327f();
            g36Var.f40117e = iM1956g;
            g36Var.f40118f = i3;
            z = false;
        }
        if (this.f5421y0 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            wj1 wj1Var = this.f5451c;
            int iM23326r = wj1Var.m23326r() + paddingRight;
            int iM23322l = wj1Var.m23322l() + paddingBottom;
            int i4 = this.f5370D0;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.f5422z0;
                iM23326r = (int) ((this.f5372F0 * (this.f5368B0 - i5)) + i5);
                requestLayout();
            }
            int i6 = this.f5371E0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.f5367A0;
                iM23322l = (int) ((this.f5372F0 * (this.f5369C0 - i7)) + i7);
                requestLayout();
            }
            setMeasuredDimension(iM23326r, iM23322l);
        }
        float fSignum = Math.signum(this.f5401e0 - this.f5399c0);
        long nanoTime = getNanoTime();
        d36 d36Var = this.f5380M;
        float interpolation = this.f5399c0 + (!(d36Var instanceof vi9) ? (((nanoTime - this.f5400d0) * fSignum) * 1.0E-9f) / this.f5397a0 : 0.0f);
        if (this.f5402f0) {
            interpolation = this.f5401e0;
        }
        if ((fSignum <= 0.0f || interpolation < this.f5401e0) && (fSignum > 0.0f || interpolation > this.f5401e0)) {
            z2 = false;
        } else {
            interpolation = this.f5401e0;
        }
        if (d36Var != null && !z2) {
            interpolation = this.f5406j0 ? d36Var.getInterpolation((nanoTime - this.f5396W) * 1.0E-9f) : d36Var.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f5401e0) || (fSignum <= 0.0f && interpolation <= this.f5401e0)) {
            interpolation = this.f5401e0;
        }
        this.f5372F0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f5382N;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f = interpolation;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            y26 y26Var = (y26) this.f5395V.get(childAt);
            if (y26Var != null) {
                y26Var.m24868d(f, nanoTime2, childAt, this.f5373G0);
            }
        }
        if (this.f5421y0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        y7a y7aVar;
        C0476c c0476c = this.f5378L;
        if (c0476c != null) {
            boolean zM1968j = m1968j();
            c0476c.f5438p = zM1968j;
            n36 n36Var = c0476c.f5425c;
            if (n36Var == null || (y7aVar = n36Var.f52281l) == null) {
                return;
            }
            y7aVar.m24981c(zM1968j);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: androidx.constraintlayout.motion.widget.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: androidx.constraintlayout.motion.widget.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v69 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v69 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v70 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v70 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v73 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v73 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v76 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v76 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v67 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instruction units count: 2025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.AbstractC0475b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    public final void m1939p(float f) {
        C0476c c0476c = this.f5378L;
        if (c0476c == null) {
            return;
        }
        float f2 = this.f5399c0;
        float f3 = this.f5398b0;
        if (f2 != f3 && this.f5402f0) {
            this.f5399c0 = f3;
        }
        float f4 = this.f5399c0;
        if (f4 == f) {
            return;
        }
        this.f5406j0 = false;
        this.f5401e0 = f;
        n36 n36Var = c0476c.f5425c;
        this.f5397a0 = (n36Var != null ? n36Var.f52277h : c0476c.f5432j) / 1000.0f;
        setProgress(f);
        this.f5380M = null;
        this.f5382N = this.f5378L.m1953d();
        this.f5402f0 = false;
        this.f5396W = getNanoTime();
        this.f5403g0 = true;
        this.f5398b0 = f4;
        this.f5399c0 = f4;
        invalidate();
    }

    /* JADX INFO: renamed from: q */
    public final void m1940q(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            y26 y26Var = (y26) this.f5395V.get(getChildAt(i));
            if (y26Var != null && "button".equals(qad.m19842d(y26Var.f69142b)) && y26Var.f69133A != null) {
                int i2 = 0;
                while (true) {
                    bj4[] bj4VarArr = y26Var.f69133A;
                    if (i2 < bj4VarArr.length) {
                        bj4VarArr[i2].m3774g(y26Var.f69142b, z ? -100.0f : 100.0f);
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:127:0x01da  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:143:0x020e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00db A[PHI: r3
      0x00db: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00a9, B:58:0x00cf, B:60:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0106  */
    /* JADX WARN: Code duplicated, block: B:74:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    /* JADX WARN: Code duplicated, block: B:93:0x014d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    /* JADX INFO: renamed from: r */
    public final void m1941r(boolean z) {
        boolean z2;
        char c;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        y26 y26Var;
        boolean z3;
        if (this.f5400d0 == -1) {
            this.f5400d0 = getNanoTime();
        }
        float f = this.f5399c0;
        if (f > 0.0f && f < 1.0f) {
            this.f5388Q = -1;
        }
        boolean z4 = false;
        if (this.f5417u0 || (this.f5403g0 && (z || this.f5401e0 != f))) {
            float fSignum = Math.signum(this.f5401e0 - f);
            long nanoTime2 = getNanoTime();
            d36 d36Var = this.f5380M;
            float f2 = d36Var == null ? (((nanoTime2 - this.f5400d0) * fSignum) * 1.0E-9f) / this.f5397a0 : 0.0f;
            float f3 = this.f5399c0 + f2;
            if (this.f5402f0) {
                f3 = this.f5401e0;
            }
            if ((fSignum <= 0.0f || f3 < this.f5401e0) && (fSignum > 0.0f || f3 > this.f5401e0)) {
                z2 = false;
            } else {
                f3 = this.f5401e0;
                this.f5403g0 = false;
                z2 = true;
            }
            this.f5399c0 = f3;
            this.f5398b0 = f3;
            this.f5400d0 = nanoTime2;
            if (d36Var == null || z2) {
                this.f5384O = f2;
            } else {
                if (this.f5406j0) {
                    float interpolation2 = d36Var.getInterpolation((nanoTime2 - this.f5396W) * 1.0E-9f);
                    d36 d36Var2 = this.f5380M;
                    vi9 vi9Var = this.f5407k0;
                    c = d36Var2 == vi9Var ? vi9Var.f65421c.mo4641a() ? (char) 2 : (char) 1 : (char) 0;
                    this.f5399c0 = interpolation2;
                    this.f5400d0 = nanoTime2;
                    d36 d36Var3 = this.f5380M;
                    if (d36Var3 != null) {
                        float fMo10074a = d36Var3.mo10074a();
                        this.f5384O = fMo10074a;
                        if (Math.abs(fMo10074a) * this.f5397a0 <= 1.0E-5f && c == 2) {
                            this.f5403g0 = false;
                        }
                        if (fMo10074a > 0.0f && interpolation2 >= 1.0f) {
                            this.f5399c0 = 1.0f;
                            this.f5403g0 = false;
                            interpolation2 = 1.0f;
                        }
                        if (fMo10074a >= 0.0f || interpolation2 > 0.0f) {
                            f3 = interpolation2;
                        } else {
                            this.f5399c0 = 0.0f;
                            this.f5403g0 = false;
                            f3 = 0.0f;
                        }
                    } else {
                        f3 = interpolation2;
                    }
                } else {
                    float interpolation3 = d36Var.getInterpolation(f3);
                    d36 d36Var4 = this.f5380M;
                    if (d36Var4 != null) {
                        this.f5384O = d36Var4.mo10074a();
                    } else {
                        this.f5384O = ((d36Var4.getInterpolation(f3 + f2) - interpolation3) * fSignum) / f2;
                    }
                    f3 = interpolation3;
                }
                if (Math.abs(this.f5384O) > 1.0E-5f) {
                    setState(MotionLayout$TransitionState.MOVING);
                }
                if (c != 1) {
                    if ((fSignum <= 0.0f && f3 >= this.f5401e0) || (fSignum <= 0.0f && f3 <= this.f5401e0)) {
                        f3 = this.f5401e0;
                        this.f5403g0 = false;
                    }
                    if (f3 < 1.0f || f3 <= 0.0f) {
                        this.f5403g0 = false;
                        setState(MotionLayout$TransitionState.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.f5417u0 = false;
                nanoTime = getNanoTime();
                this.f5372F0 = f3;
                interpolator = this.f5382N;
                if (interpolator == null) {
                    interpolation = f3;
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                }
                interpolator2 = this.f5382N;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f5397a0) + f3);
                    this.f5384O = interpolation4;
                    this.f5384O = interpolation4 - this.f5382N.getInterpolation(f3);
                }
                for (i = 0; i < childCount; i++) {
                    childAt = getChildAt(i);
                    y26Var = (y26) this.f5395V.get(childAt);
                    if (y26Var != null) {
                        this.f5417u0 = y26Var.m24868d(interpolation, nanoTime, childAt, this.f5373G0) | this.f5417u0;
                    }
                }
                boolean z5 = (fSignum <= 0.0f && f3 >= this.f5401e0) || (fSignum <= 0.0f && f3 <= this.f5401e0);
                if (!this.f5417u0 && !this.f5403g0 && z5) {
                    setState(MotionLayout$TransitionState.FINISHED);
                }
                if (this.f5421y0) {
                    requestLayout();
                }
                this.f5417u0 = (!z5) | this.f5417u0;
                if (f3 <= 0.0f && (i4 = this.f5386P) != -1 && this.f5388Q != i4) {
                    this.f5388Q = i4;
                    this.f5378L.m1952b(i4).m21407a(this);
                    setState(MotionLayout$TransitionState.FINISHED);
                    z4 = true;
                }
                if (f3 >= 1.0d) {
                    i2 = this.f5388Q;
                    i3 = this.f5390R;
                    if (i2 != i3) {
                        this.f5388Q = i3;
                        this.f5378L.m1952b(i3).m21407a(this);
                        setState(MotionLayout$TransitionState.FINISHED);
                        z4 = true;
                    }
                }
                if (!this.f5417u0 || this.f5403g0) {
                    invalidate();
                } else if ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f)) {
                    setState(MotionLayout$TransitionState.FINISHED);
                }
                if (!this.f5417u0 && !this.f5403g0 && ((fSignum > 0.0f && f3 == 1.0f) || (fSignum < 0.0f && f3 == 0.0f))) {
                    m1944u();
                }
            }
            c = 0;
            if (Math.abs(this.f5384O) > 1.0E-5f) {
                setState(MotionLayout$TransitionState.MOVING);
            }
            if (c != 1) {
                if (fSignum <= 0.0f) {
                    f3 = this.f5401e0;
                    this.f5403g0 = false;
                } else {
                    f3 = this.f5401e0;
                    this.f5403g0 = false;
                }
                if (f3 < 1.0f) {
                    this.f5403g0 = false;
                    setState(MotionLayout$TransitionState.FINISHED);
                } else {
                    this.f5403g0 = false;
                    setState(MotionLayout$TransitionState.FINISHED);
                }
            }
            childCount = getChildCount();
            this.f5417u0 = false;
            nanoTime = getNanoTime();
            this.f5372F0 = f3;
            interpolator = this.f5382N;
            if (interpolator == null) {
                interpolation = f3;
            } else {
                interpolation = interpolator.getInterpolation(f3);
            }
            interpolator2 = this.f5382N;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f5397a0) + f3);
                this.f5384O = interpolation5;
                this.f5384O = interpolation5 - this.f5382N.getInterpolation(f3);
            }
            while (i < childCount) {
                childAt = getChildAt(i);
                y26Var = (y26) this.f5395V.get(childAt);
                if (y26Var != null) {
                    this.f5417u0 = y26Var.m24868d(interpolation, nanoTime, childAt, this.f5373G0) | this.f5417u0;
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.f5417u0) {
                setState(MotionLayout$TransitionState.FINISHED);
            }
            if (this.f5421y0) {
                requestLayout();
            }
            this.f5417u0 = (!z5) | this.f5417u0;
            if (f3 <= 0.0f) {
                this.f5388Q = i4;
                this.f5378L.m1952b(i4).m21407a(this);
                setState(MotionLayout$TransitionState.FINISHED);
                z4 = true;
            }
            if (f3 >= 1.0d) {
                i2 = this.f5388Q;
                i3 = this.f5390R;
                if (i2 != i3) {
                    this.f5388Q = i3;
                    this.f5378L.m1952b(i3).m21407a(this);
                    setState(MotionLayout$TransitionState.FINISHED);
                    z4 = true;
                }
            }
            if (this.f5417u0) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f5417u0) {
                m1944u();
            }
        }
        float f4 = this.f5399c0;
        if (f4 < 1.0f) {
            if (f4 <= 0.0f) {
                int i5 = this.f5388Q;
                int i6 = this.f5386P;
                z3 = i5 == i6 ? z4 : true;
                this.f5388Q = i6;
            }
            this.f5385O0 |= z4;
            if (z4 && !this.f5374H0) {
                requestLayout();
            }
            this.f5398b0 = this.f5399c0;
        }
        int i7 = this.f5388Q;
        int i8 = this.f5390R;
        z3 = i7 == i8 ? z4 : true;
        this.f5388Q = i8;
        z4 = z3;
        this.f5385O0 |= z4;
        if (z4) {
            requestLayout();
        }
        this.f5398b0 = this.f5399c0;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        C0476c c0476c;
        n36 n36Var;
        if (!this.f5421y0 && this.f5388Q == -1 && (c0476c = this.f5378L) != null && (n36Var = c0476c.f5425c) != null) {
            int i = n36Var.f52286q;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ((y26) this.f5395V.get(getChildAt(i2))).f69144d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public final void m1942s(int i, float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        View view = (View) this.f5449a.get(i);
        y26 y26Var = (y26) this.f5395V.get(view);
        if (y26Var == null) {
            Log.w("MotionLayout", "WARNING could not find view id " + (view == null ? ux5.m22988k(i, "") : view.getContext().getResources().getResourceName(i)));
            return;
        }
        i36 i36Var = y26Var.f69146f;
        float[] fArr2 = y26Var.f69162v;
        float fM24865a = y26Var.m24865a(f, fArr2);
        z9d[] z9dVarArr = y26Var.f69150j;
        int i2 = 0;
        if (z9dVarArr != null) {
            double d = fM24865a;
            z9dVarArr[0].mo9887e(d, y26Var.f69157q);
            y26Var.f69150j[0].mo9885c(d, y26Var.f69156p);
            float f4 = fArr2[0];
            while (true) {
                dArr = y26Var.f69157q;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * ((double) f4);
                i2++;
            }
            C2897cu c2897cu = y26Var.f69151k;
            if (c2897cu != null) {
                double[] dArr2 = y26Var.f69156p;
                if (dArr2.length > 0) {
                    c2897cu.mo9885c(d, dArr2);
                    y26Var.f69151k.mo9887e(d, y26Var.f69157q);
                    int[] iArr = y26Var.f69155o;
                    double[] dArr3 = y26Var.f69157q;
                    double[] dArr4 = y26Var.f69156p;
                    i36Var.getClass();
                    i36.m13638e(f2, f3, fArr, iArr, dArr3, dArr4);
                }
            } else {
                int[] iArr2 = y26Var.f69155o;
                double[] dArr5 = y26Var.f69156p;
                i36Var.getClass();
                i36.m13638e(f2, f3, fArr, iArr2, dArr, dArr5);
            }
        } else {
            i36 i36Var2 = y26Var.f69147g;
            float f5 = i36Var2.f43417e - i36Var.f43417e;
            float f6 = i36Var2.f43418f - i36Var.f43418f;
            float f7 = i36Var2.f43419g - i36Var.f43419g;
            float f8 = (i36Var2.f43420h - i36Var.f43420h) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
        }
        view.getY();
    }

    public void setDebugMode(int i) {
        this.f5404h0 = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f5379L0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f5394U = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f5378L != null) {
            setState(MotionLayout$TransitionState.MOVING);
            Interpolator interpolatorM1953d = this.f5378L.m1953d();
            if (interpolatorM1953d != null) {
                setProgress(interpolatorM1953d.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
    }

    public void setOnShow(float f) {
    }

    public void setProgress(float f) {
        if (f < 0.0f || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f5375I0 == null) {
                this.f5375I0 = new C0474a(this);
            }
            this.f5375I0.f5361a = f;
            return;
        }
        if (f <= 0.0f) {
            if (this.f5399c0 == 1.0f && this.f5388Q == this.f5390R) {
                setState(MotionLayout$TransitionState.MOVING);
            }
            this.f5388Q = this.f5386P;
            if (this.f5399c0 == 0.0f) {
                setState(MotionLayout$TransitionState.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.f5399c0 == 0.0f && this.f5388Q == this.f5386P) {
                setState(MotionLayout$TransitionState.MOVING);
            }
            this.f5388Q = this.f5390R;
            if (this.f5399c0 == 1.0f) {
                setState(MotionLayout$TransitionState.FINISHED);
            }
        } else {
            this.f5388Q = -1;
            setState(MotionLayout$TransitionState.MOVING);
        }
        if (this.f5378L == null) {
            return;
        }
        this.f5402f0 = true;
        this.f5401e0 = f;
        this.f5398b0 = f;
        this.f5400d0 = -1L;
        this.f5396W = -1L;
        this.f5380M = null;
        this.f5403g0 = true;
        invalidate();
    }

    public void setScene(C0476c c0476c) {
        y7a y7aVar;
        this.f5378L = c0476c;
        boolean zM1968j = m1968j();
        c0476c.f5438p = zM1968j;
        n36 n36Var = c0476c.f5425c;
        if (n36Var != null && (y7aVar = n36Var.f52281l) != null) {
            y7aVar.m24981c(zM1968j);
        }
        m1945v();
    }

    public void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.f5388Q = i;
            return;
        }
        if (this.f5375I0 == null) {
            this.f5375I0 = new C0474a(this);
        }
        C0474a c0474a = this.f5375I0;
        c0474a.f5363c = i;
        c0474a.f5364d = i;
    }

    public void setState(MotionLayout$TransitionState motionLayout$TransitionState) {
        mv5 mv5Var;
        mv5 mv5Var2;
        MotionLayout$TransitionState motionLayout$TransitionState2 = MotionLayout$TransitionState.FINISHED;
        if (motionLayout$TransitionState == motionLayout$TransitionState2 && this.f5388Q == -1) {
            return;
        }
        MotionLayout$TransitionState motionLayout$TransitionState3 = this.f5381M0;
        this.f5381M0 = motionLayout$TransitionState;
        MotionLayout$TransitionState motionLayout$TransitionState4 = MotionLayout$TransitionState.UNDEFINED;
        int iOrdinal = motionLayout$TransitionState3.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (motionLayout$TransitionState != motionLayout$TransitionState2 || (mv5Var = this.f5376J0) == null) {
                return;
            }
            mv5Var.run();
            this.f5376J0 = null;
            return;
        }
        if (iOrdinal == 2 && motionLayout$TransitionState == motionLayout$TransitionState2 && (mv5Var2 = this.f5376J0) != null) {
            mv5Var2.run();
            this.f5376J0 = null;
        }
    }

    public void setTransition(int i) {
        n36 n36Var;
        float f;
        C0476c c0476c = this.f5378L;
        if (c0476c != null) {
            Iterator it = c0476c.f5426d.iterator();
            do {
                if (!it.hasNext()) {
                    n36Var = null;
                    break;
                }
                n36Var = (n36) it.next();
            } while (n36Var.f52270a != i);
            this.f5386P = n36Var.f52273d;
            this.f5390R = n36Var.f52272c;
            if (!isAttachedToWindow()) {
                if (this.f5375I0 == null) {
                    this.f5375I0 = new C0474a(this);
                }
                C0474a c0474a = this.f5375I0;
                c0474a.f5363c = this.f5386P;
                c0474a.f5364d = this.f5390R;
                return;
            }
            int i2 = this.f5388Q;
            if (i2 == this.f5386P) {
                f = 0.0f;
            } else {
                f = i2 == this.f5390R ? 1.0f : Float.NaN;
            }
            C0476c c0476c2 = this.f5378L;
            c0476c2.f5425c = n36Var;
            y7a y7aVar = n36Var.f52281l;
            if (y7aVar != null) {
                y7aVar.m24981c(c0476c2.f5438p);
            }
            this.f5383N0.m12326e(this.f5378L.m1952b(this.f5386P), this.f5378L.m1952b(this.f5390R));
            m1945v();
            if (this.f5399c0 != f) {
                if (f == 0.0f) {
                    m1940q(true);
                    this.f5378L.m1952b(this.f5386P).m21408b(this);
                } else if (f == 1.0f) {
                    m1940q(false);
                    this.f5378L.m1952b(this.f5390R).m21408b(this);
                }
            }
            this.f5399c0 = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
            } else {
                Log.v("MotionLayout", qad.m19840b().concat(" transitionToStart "));
                m1939p(0.0f);
            }
        }
    }

    public void setTransitionDuration(int i) {
        C0476c c0476c = this.f5378L;
        if (c0476c == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        n36 n36Var = c0476c.f5425c;
        if (n36Var != null) {
            n36Var.f52277h = Math.max(i, 8);
        } else {
            c0476c.f5432j = i;
        }
    }

    public void setTransitionListener(h36 h36Var) {
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f5375I0 == null) {
            this.f5375I0 = new C0474a(this);
        }
        C0474a c0474a = this.f5375I0;
        c0474a.getClass();
        c0474a.f5361a = bundle.getFloat("motion.progress");
        c0474a.f5362b = bundle.getFloat("motion.velocity");
        c0474a.f5363c = bundle.getInt("motion.StartState");
        c0474a.f5364d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f5375I0.m1934a();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1943t(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (m1943t((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), childAt, motionEvent)) {
                z = true;
                break;
            }
            childCount--;
        }
        if (!z) {
            float right = (view.getRight() + f) - view.getLeft();
            float bottom = (view.getBottom() + f2) - view.getTop();
            RectF rectF = this.f5387P0;
            rectF.set(f, f2, right, bottom);
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f3, f4);
                    if (this.f5391R0 == null) {
                        this.f5391R0 = new Matrix();
                    }
                    matrix.invert(this.f5391R0);
                    motionEventObtain.transform(this.f5391R0);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return qad.m19841c(context, this.f5386P) + "->" + qad.m19841c(context, this.f5390R) + " (pos:" + this.f5399c0 + " Dpos/Dt:" + this.f5384O;
    }

    /* JADX INFO: renamed from: u */
    public final void m1944u() {
        n36 n36Var;
        y7a y7aVar;
        View viewFindViewById;
        C0476c c0476c = this.f5378L;
        if (c0476c == null) {
            return;
        }
        if (c0476c.m1951a(this.f5388Q, this)) {
            requestLayout();
            return;
        }
        int i = this.f5388Q;
        if (i != -1) {
            C0476c c0476c2 = this.f5378L;
            ArrayList<n36> arrayList = c0476c2.f5428f;
            ArrayList<n36> arrayList2 = c0476c2.f5426d;
            for (n36 n36Var2 : arrayList2) {
                if (n36Var2.f52282m.size() > 0) {
                    Iterator it = n36Var2.f52282m.iterator();
                    while (it.hasNext()) {
                        ((m36) it.next()).m16612b(this);
                    }
                }
            }
            for (n36 n36Var3 : arrayList) {
                if (n36Var3.f52282m.size() > 0) {
                    Iterator it2 = n36Var3.f52282m.iterator();
                    while (it2.hasNext()) {
                        ((m36) it2.next()).m16612b(this);
                    }
                }
            }
            for (n36 n36Var4 : arrayList2) {
                if (n36Var4.f52282m.size() > 0) {
                    Iterator it3 = n36Var4.f52282m.iterator();
                    while (it3.hasNext()) {
                        ((m36) it3.next()).m16611a(this, i, n36Var4);
                    }
                }
            }
            for (n36 n36Var5 : arrayList) {
                if (n36Var5.f52282m.size() > 0) {
                    Iterator it4 = n36Var5.f52282m.iterator();
                    while (it4.hasNext()) {
                        ((m36) it4.next()).m16611a(this, i, n36Var5);
                    }
                }
            }
        }
        if (!this.f5378L.m1963n() || (n36Var = this.f5378L.f5425c) == null || (y7aVar = n36Var.f52281l) == null) {
            return;
        }
        AbstractC0475b abstractC0475b = y7aVar.f69443r;
        int i2 = y7aVar.f69429d;
        if (i2 != -1) {
            viewFindViewById = abstractC0475b.findViewById(i2);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + qad.m19841c(abstractC0475b.getContext(), y7aVar.f69429d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new ja0(2));
            nestedScrollView.setOnScrollChangeListener(new q41(12));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1945v() {
        this.f5383N0.m12327f();
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m1946w(int i) {
        setState(MotionLayout$TransitionState.SETUP);
        this.f5388Q = i;
        this.f5386P = -1;
        this.f5390R = -1;
        lj1 lj1Var = this.f5459k;
        if (lj1Var == null) {
            C0476c c0476c = this.f5378L;
            if (c0476c != null) {
                c0476c.m1952b(i).m21408b(this);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) lj1Var.f49733c;
        SparseArray sparseArray = (SparseArray) lj1Var.f49734d;
        int i2 = lj1Var.f49731a;
        if (i2 != i) {
            lj1Var.f49731a = i;
            jj1 jj1Var = (jj1) sparseArray.get(i);
            int iM14494b = jj1Var.m14494b(-1.0f, -1.0f);
            ArrayList arrayList = jj1Var.f45602b;
            sj1 sj1Var = iM14494b == -1 ? jj1Var.f45604d : ((kj1) arrayList.get(iM14494b)).f47369f;
            if (iM14494b != -1) {
                int i3 = ((kj1) arrayList.get(iM14494b)).f47368e;
            }
            if (sj1Var != null) {
                lj1Var.f49732b = iM14494b;
                sj1Var.m21408b(constraintLayout);
                return;
            } else {
                Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =-1.0, -1.0");
                return;
            }
        }
        jj1 jj1Var2 = i == -1 ? (jj1) sparseArray.valueAt(0) : (jj1) sparseArray.get(i2);
        int i4 = lj1Var.f49732b;
        if (i4 == -1 || !((kj1) jj1Var2.f45602b.get(i4)).m15267a(-1.0f, -1.0f)) {
            int iM14494b2 = jj1Var2.m14494b(-1.0f, -1.0f);
            ArrayList arrayList2 = jj1Var2.f45602b;
            if (lj1Var.f49732b == iM14494b2) {
                return;
            }
            sj1 sj1Var2 = iM14494b2 == -1 ? null : ((kj1) arrayList2.get(iM14494b2)).f47369f;
            if (iM14494b2 != -1) {
                int i5 = ((kj1) arrayList2.get(iM14494b2)).f47368e;
            }
            if (sj1Var2 == null) {
                return;
            }
            lj1Var.f49732b = iM14494b2;
            sj1Var2.m21408b(constraintLayout);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1947x(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f5375I0 == null) {
                this.f5375I0 = new C0474a(this);
            }
            C0474a c0474a = this.f5375I0;
            c0474a.f5363c = i;
            c0474a.f5364d = i2;
            return;
        }
        C0476c c0476c = this.f5378L;
        if (c0476c != null) {
            this.f5386P = i;
            this.f5390R = i2;
            c0476c.m1962m(i, i2);
            this.f5383N0.m12326e(this.f5378L.m1952b(i), this.f5378L.m1952b(i2));
            m1945v();
            this.f5399c0 = 0.0f;
            m1939p(0.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX INFO: renamed from: y */
    public final void m1948y(float f, float f2, int i) {
        float f3;
        y7a y7aVar;
        y7a y7aVar2;
        y7a y7aVar3;
        y7a y7aVar4;
        y7a y7aVar5;
        y7a y7aVar6;
        y7a y7aVar7;
        n36 n36Var;
        float f4;
        y7a y7aVar8;
        float f5 = f;
        if (this.f5378L == null || this.f5399c0 == f5) {
            return;
        }
        this.f5406j0 = true;
        this.f5396W = getNanoTime();
        C0476c c0476c = this.f5378L;
        n36 n36Var2 = c0476c.f5425c;
        float f6 = (n36Var2 != null ? n36Var2.f52277h : c0476c.f5432j) / 1000.0f;
        this.f5397a0 = f6;
        this.f5401e0 = f5;
        this.f5403g0 = true;
        vi9 vi9Var = this.f5407k0;
        float f7 = 0.0f;
        if (i != 0 && i != 1 && i != 2) {
            f3 = 1.0f;
            e36 e36Var = this.f5408l0;
            if (i == 4) {
                float f8 = this.f5399c0;
                float fM1955f = c0476c.m1955f();
                e36Var.f36648a = f2;
                e36Var.f36649b = f8;
                e36Var.f36650c = fM1955f;
                this.f5380M = e36Var;
            } else if (i == 5) {
                float f9 = this.f5399c0;
                float fM1955f2 = c0476c.m1955f();
                if (f2 > 0.0f) {
                    float f10 = f2 / fM1955f2;
                    if (((f2 * f10) - (((fM1955f2 * f10) * f10) / 2.0f)) + f9 > 1.0f) {
                        float f11 = this.f5399c0;
                        float fM1955f3 = this.f5378L.m1955f();
                        e36Var.f36648a = f2;
                        e36Var.f36649b = f11;
                        e36Var.f36650c = fM1955f3;
                        this.f5380M = e36Var;
                    } else {
                        float f12 = this.f5399c0;
                        float f13 = this.f5397a0;
                        float fM1955f4 = this.f5378L.m1955f();
                        n36Var = this.f5378L.f5425c;
                        if (n36Var != null || (y7aVar8 = n36Var.f52281l) == null) {
                            f4 = 0.0f;
                        } else {
                            f4 = y7aVar8.f69444s;
                        }
                        this.f5407k0.m23291b(f12, f5, f2, f13, fM1955f4, f4);
                        this.f5384O = 0.0f;
                        int i2 = this.f5388Q;
                        this.f5401e0 = f5;
                        this.f5388Q = i2;
                        this.f5380M = vi9Var;
                    }
                } else {
                    float f14 = (-f2) / fM1955f2;
                    if ((((fM1955f2 * f14) * f14) / 2.0f) + (f2 * f14) + f9 < 0.0f) {
                        float f15 = this.f5399c0;
                        float fM1955f5 = this.f5378L.m1955f();
                        e36Var.f36648a = f2;
                        e36Var.f36649b = f15;
                        e36Var.f36650c = fM1955f5;
                        this.f5380M = e36Var;
                    } else {
                        float f16 = this.f5399c0;
                        float f17 = this.f5397a0;
                        float fM1955f6 = this.f5378L.m1955f();
                        n36Var = this.f5378L.f5425c;
                        if (n36Var != null) {
                            f4 = 0.0f;
                        } else {
                            f4 = 0.0f;
                        }
                        this.f5407k0.m23291b(f16, f5, f2, f17, fM1955f6, f4);
                        this.f5384O = 0.0f;
                        int i3 = this.f5388Q;
                        this.f5401e0 = f5;
                        this.f5388Q = i3;
                        this.f5380M = vi9Var;
                    }
                }
            } else if (i == 6 || i == 7) {
            }
            this.f5402f0 = false;
            this.f5396W = getNanoTime();
            invalidate();
        }
        f3 = 1.0f;
        if (i == 1 || i == 7) {
            f5 = 0.0f;
        } else if (i == 2 || i == 6) {
            f5 = f3;
        }
        int i4 = (n36Var2 == null || (y7aVar7 = n36Var2.f52281l) == null) ? 0 : y7aVar7.f69425D;
        float f18 = this.f5399c0;
        int i5 = i4;
        vi9 vi9Var2 = this.f5407k0;
        if (i5 == 0) {
            float fM1955f7 = c0476c.m1955f();
            n36 n36Var3 = this.f5378L.f5425c;
            if (n36Var3 != null && (y7aVar6 = n36Var3.f52281l) != null) {
                f7 = y7aVar6.f69444s;
            }
            vi9Var2.m23291b(f18, f5, f2, f6, fM1955f7, f7);
        } else {
            float f19 = (n36Var2 == null || (y7aVar5 = n36Var2.f52281l) == null) ? 0.0f : y7aVar5.f69451z;
            float f20 = (n36Var2 == null || (y7aVar4 = n36Var2.f52281l) == null) ? 0.0f : y7aVar4.f69422A;
            float f21 = (n36Var2 == null || (y7aVar3 = n36Var2.f52281l) == null) ? 0.0f : y7aVar3.f69450y;
            float f22 = (n36Var2 == null || (y7aVar2 = n36Var2.f52281l) == null) ? 0.0f : y7aVar2.f69423B;
            int i6 = (n36Var2 == null || (y7aVar = n36Var2.f52281l) == null) ? 0 : y7aVar.f69424C;
            if (vi9Var2.f65420b == null) {
                cg9 cg9Var = new cg9();
                cg9Var.f10022a = 0.5d;
                cg9Var.f10030i = 0;
                vi9Var2.f65420b = cg9Var;
            }
            cg9 cg9Var2 = vi9Var2.f65420b;
            vi9Var2.f65421c = cg9Var2;
            cg9Var2.f10024c = f5;
            cg9Var2.f10022a = f21;
            cg9Var2.f10026e = f18;
            cg9Var2.f10023b = f20;
            cg9Var2.f10028g = f19;
            cg9Var2.f10029h = f22;
            cg9Var2.f10030i = i6;
            cg9Var2.f10025d = 0.0f;
        }
        int i7 = this.f5388Q;
        this.f5401e0 = f5;
        this.f5388Q = i7;
        this.f5380M = vi9Var;
        this.f5402f0 = false;
        this.f5396W = getNanoTime();
        invalidate();
    }

    /* JADX INFO: renamed from: z */
    public final void m1949z(int i) {
        ztb ztbVar;
        if (!isAttachedToWindow()) {
            if (this.f5375I0 == null) {
                this.f5375I0 = new C0474a(this);
            }
            this.f5375I0.f5364d = i;
            return;
        }
        C0476c c0476c = this.f5378L;
        if (c0476c != null && (ztbVar = c0476c.f5424b) != null) {
            int i2 = this.f5388Q;
            sh9 sh9Var = (sh9) ((SparseArray) ztbVar.f72162c).get(i);
            if (sh9Var != null) {
                ArrayList arrayList = sh9Var.f60869b;
                int i3 = sh9Var.f60870c;
                if (i3 != i2) {
                    Iterator it = arrayList.iterator();
                    do {
                        if (!it.hasNext()) {
                            i2 = i3;
                            break;
                        }
                    } while (i2 != ((th9) it.next()).f62299e);
                }
            } else {
                i2 = i;
            }
            if (i2 != -1) {
                i = i2;
            }
        }
        int i4 = this.f5388Q;
        if (i4 == i) {
            return;
        }
        if (this.f5386P == i) {
            m1939p(0.0f);
            return;
        }
        if (this.f5390R == i) {
            m1939p(1.0f);
            return;
        }
        this.f5390R = i;
        if (i4 != -1) {
            m1947x(i4, i);
            m1939p(1.0f);
            this.f5399c0 = 0.0f;
            m1939p(1.0f);
            this.f5376J0 = null;
            return;
        }
        this.f5406j0 = false;
        this.f5401e0 = 1.0f;
        this.f5398b0 = 0.0f;
        this.f5399c0 = 0.0f;
        this.f5400d0 = getNanoTime();
        this.f5396W = getNanoTime();
        this.f5402f0 = false;
        this.f5380M = null;
        C0476c c0476c2 = this.f5378L;
        n36 n36Var = c0476c2.f5425c;
        this.f5397a0 = (n36Var != null ? n36Var.f52277h : c0476c2.f5432j) / 1000.0f;
        this.f5386P = -1;
        c0476c2.m1962m(-1, this.f5390R);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap map = this.f5395V;
        map.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            map.put(childAt, new y26(childAt));
            sparseArray.put(childAt.getId(), (y26) map.get(childAt));
        }
        this.f5403g0 = true;
        sj1 sj1VarM1952b = this.f5378L.m1952b(i);
        g36 g36Var = this.f5383N0;
        g36Var.m12326e(null, sj1VarM1952b);
        m1945v();
        g36Var.m12324a();
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            y26 y26Var = (y26) map.get(childAt2);
            if (y26Var != null) {
                i36 i36Var = y26Var.f69146f;
                i36Var.f43415c = 0.0f;
                i36Var.f43416d = 0.0f;
                i36Var.m13641d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                w26 w26Var = y26Var.f69148h;
                w26Var.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                w26Var.f66296c = childAt2.getVisibility();
                w26Var.f66298e = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                w26Var.f66299f = childAt2.getElevation();
                w26Var.f66300g = childAt2.getRotation();
                w26Var.f66301h = childAt2.getRotationX();
                w26Var.f66294a = childAt2.getRotationY();
                w26Var.f66302i = childAt2.getScaleX();
                w26Var.f66303j = childAt2.getScaleY();
                w26Var.f66304k = childAt2.getPivotX();
                w26Var.f66305l = childAt2.getPivotY();
                w26Var.f66289H = childAt2.getTranslationX();
                w26Var.f66290I = childAt2.getTranslationY();
                w26Var.f66291J = childAt2.getTranslationZ();
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i7 = 0; i7 < childCount; i7++) {
            y26 y26Var2 = (y26) map.get(getChildAt(i7));
            if (y26Var2 != null) {
                this.f5378L.m1954e(y26Var2);
                y26Var2.m24870g(getNanoTime(), width, height);
            }
        }
        n36 n36Var2 = this.f5378L.f5425c;
        float f = n36Var2 != null ? n36Var2.f52278i : 0.0f;
        if (f != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i8 = 0; i8 < childCount; i8++) {
                i36 i36Var2 = ((y26) map.get(getChildAt(i8))).f69147g;
                float f2 = i36Var2.f43418f + i36Var2.f43417e;
                fMin = Math.min(fMin, f2);
                fMax = Math.max(fMax, f2);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                y26 y26Var3 = (y26) map.get(getChildAt(i9));
                i36 i36Var3 = y26Var3.f69147g;
                float f3 = i36Var3.f43417e;
                float f4 = i36Var3.f43418f;
                y26Var3.f69154n = 1.0f / (1.0f - f);
                y26Var3.f69153m = f - ((((f3 + f4) - fMin) * f) / (fMax - fMin));
            }
        }
        this.f5398b0 = 0.0f;
        this.f5399c0 = 0.0f;
        this.f5403g0 = true;
        invalidate();
    }

    public void setTransition(n36 n36Var) {
        y7a y7aVar;
        C0476c c0476c = this.f5378L;
        c0476c.f5425c = n36Var;
        if (n36Var != null && (y7aVar = n36Var.f52281l) != null) {
            y7aVar.m24981c(c0476c.f5438p);
        }
        setState(MotionLayout$TransitionState.SETUP);
        int i = this.f5388Q;
        n36 n36Var2 = this.f5378L.f5425c;
        if (i == (n36Var2 == null ? -1 : n36Var2.f52272c)) {
            this.f5399c0 = 1.0f;
            this.f5398b0 = 1.0f;
            this.f5401e0 = 1.0f;
        } else {
            this.f5399c0 = 0.0f;
            this.f5398b0 = 0.0f;
            this.f5401e0 = 0.0f;
        }
        this.f5400d0 = (n36Var.f52287r & 1) != 0 ? -1L : getNanoTime();
        int iM1956g = this.f5378L.m1956g();
        C0476c c0476c2 = this.f5378L;
        n36 n36Var3 = c0476c2.f5425c;
        int i2 = n36Var3 != null ? n36Var3.f52272c : -1;
        if (iM1956g == this.f5386P && i2 == this.f5390R) {
            return;
        }
        this.f5386P = iM1956g;
        this.f5390R = i2;
        c0476c2.m1962m(iM1956g, i2);
        sj1 sj1VarM1952b = this.f5378L.m1952b(this.f5386P);
        sj1 sj1VarM1952b2 = this.f5378L.m1952b(this.f5390R);
        g36 g36Var = this.f5383N0;
        g36Var.m12326e(sj1VarM1952b, sj1VarM1952b2);
        int i3 = this.f5386P;
        int i4 = this.f5390R;
        g36Var.f40117e = i3;
        g36Var.f40118f = i4;
        g36Var.m12327f();
        m1945v();
    }
}
