package p000;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.feature.dictionary.C2064h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class za4 extends w28 implements a38 {

    /* JADX INFO: renamed from: A */
    public long f71260A;

    /* JADX INFO: renamed from: d */
    public float f71264d;

    /* JADX INFO: renamed from: e */
    public float f71265e;

    /* JADX INFO: renamed from: f */
    public float f71266f;

    /* JADX INFO: renamed from: g */
    public float f71267g;

    /* JADX INFO: renamed from: h */
    public float f71268h;

    /* JADX INFO: renamed from: i */
    public float f71269i;

    /* JADX INFO: renamed from: j */
    public float f71270j;

    /* JADX INFO: renamed from: k */
    public float f71271k;

    /* JADX INFO: renamed from: m */
    public final gld f71273m;

    /* JADX INFO: renamed from: o */
    public int f71275o;

    /* JADX INFO: renamed from: q */
    public RecyclerView f71277q;

    /* JADX INFO: renamed from: s */
    public VelocityTracker f71279s;

    /* JADX INFO: renamed from: t */
    public ArrayList f71280t;

    /* JADX INFO: renamed from: u */
    public ArrayList f71281u;

    /* JADX INFO: renamed from: w */
    public GestureDetector f71283w;

    /* JADX INFO: renamed from: x */
    public xa4 f71284x;

    /* JADX INFO: renamed from: z */
    public Rect f71286z;

    /* JADX INFO: renamed from: a */
    public final ArrayList f71261a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final float[] f71262b = new float[2];

    /* JADX INFO: renamed from: c */
    public o38 f71263c = null;

    /* JADX INFO: renamed from: l */
    public int f71272l = -1;

    /* JADX INFO: renamed from: n */
    public int f71274n = 0;

    /* JADX INFO: renamed from: p */
    public final ArrayList f71276p = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final RunnableC3468pp f71278r = new RunnableC3468pp(this, 8);

    /* JADX INFO: renamed from: v */
    public View f71282v = null;

    /* JADX INFO: renamed from: y */
    public final ua4 f71285y = new ua4(this);

    public za4(gld gldVar) {
        this.f71273m = gldVar;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m25519n(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // p000.a38
    /* JADX INFO: renamed from: b */
    public final void mo74b(View view) {
        if (view == this.f71282v) {
            this.f71282v = null;
        }
        o38 o38VarM2719M = this.f71277q.m2719M(view);
        if (o38VarM2719M == null) {
            return;
        }
        o38 o38Var = this.f71263c;
        if (o38Var != null && o38VarM2719M == o38Var) {
            m25526p(null, 0);
            return;
        }
        m25522k(o38VarM2719M, false);
        if (this.f71261a.remove(o38VarM2719M.f53781a)) {
            this.f71273m.m12740a(this.f71277q, o38VarM2719M);
        }
    }

    @Override // p000.a38
    /* JADX INFO: renamed from: c */
    public final void mo75c(View view) {
    }

    @Override // p000.w28
    /* JADX INFO: renamed from: f */
    public final void mo17638f(Rect rect, View view, RecyclerView recyclerView, k38 k38Var) {
        rect.setEmpty();
    }

    @Override // p000.w28
    /* JADX INFO: renamed from: g */
    public final void mo17639g(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.f71263c != null) {
            float[] fArr = this.f71262b;
            m25524m(fArr);
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        o38 o38Var = this.f71263c;
        this.f71273m.getClass();
        ArrayList arrayList = this.f71276p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            va4 va4Var = (va4) arrayList.get(i);
            o38 o38Var2 = va4Var.f65126e;
            float f3 = va4Var.f65122a;
            float f4 = va4Var.f65124c;
            if (f3 == f4) {
                va4Var.f65130i = o38Var2.f53781a.getTranslationX();
            } else {
                va4Var.f65130i = AbstractC3393o1.m17726a(f4, f3, va4Var.f65134m, f3);
            }
            float f5 = va4Var.f65123b;
            float f6 = va4Var.f65125d;
            if (f5 == f6) {
                va4Var.f65131j = o38Var2.f53781a.getTranslationY();
            } else {
                va4Var.f65131j = AbstractC3393o1.m17726a(f6, f5, va4Var.f65134m, f5);
            }
            int iSave = canvas.save();
            gld.m12738f(recyclerView, va4Var.f65126e, va4Var.f65130i, va4Var.f65131j, false);
            canvas.restoreToCount(iSave);
        }
        if (o38Var != null) {
            int iSave2 = canvas.save();
            gld.m12738f(recyclerView, o38Var, f, f2, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // p000.w28
    /* JADX INFO: renamed from: h */
    public final void mo12779h(Canvas canvas, RecyclerView recyclerView, k38 k38Var) {
        boolean z = false;
        if (this.f71263c != null) {
            float[] fArr = this.f71262b;
            m25524m(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        o38 o38Var = this.f71263c;
        this.f71273m.getClass();
        ArrayList arrayList = this.f71276p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            va4 va4Var = (va4) arrayList.get(i);
            int iSave = canvas.save();
            View view = va4Var.f65126e.f53781a;
            canvas.restoreToCount(iSave);
        }
        if (o38Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            va4 va4Var2 = (va4) arrayList.get(i2);
            boolean z2 = va4Var2.f65133l;
            if (z2 && !va4Var2.f65129h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m25520i(int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f71268h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f71279s;
        gld gldVar = this.f71273m;
        if (velocityTracker != null && this.f71272l > -1) {
            float f = this.f71267g;
            gldVar.getClass();
            velocityTracker.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, f);
            float xVelocity = this.f71279s.getXVelocity(this.f71272l);
            float yVelocity = this.f71279s.getYVelocity(this.f71272l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f71266f && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f71277q.getWidth();
        gldVar.getClass();
        float f2 = width * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f71268h) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public final int m25521j(int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f71269i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f71279s;
        gld gldVar = this.f71273m;
        if (velocityTracker != null && this.f71272l > -1) {
            float f = this.f71267g;
            gldVar.getClass();
            velocityTracker.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE, f);
            float xVelocity = this.f71279s.getXVelocity(this.f71272l);
            float yVelocity = this.f71279s.getYVelocity(this.f71272l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f71266f && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f71277q.getHeight();
        gldVar.getClass();
        float f2 = height * 0.5f;
        if ((i & i2) == 0 || Math.abs(this.f71269i) <= f2) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: k */
    public final void m25522k(o38 o38Var, boolean z) {
        ArrayList arrayList = this.f71276p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            va4 va4Var = (va4) arrayList.get(size);
            if (va4Var.f65126e == o38Var) {
                va4Var.f65132k |= z;
                if (!va4Var.f65133l) {
                    va4Var.f65128g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final View m25523l(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        o38 o38Var = this.f71263c;
        if (o38Var != null) {
            View view = o38Var.f53781a;
            if (m25519n(view, x, y, this.f71270j + this.f71268h, this.f71271k + this.f71269i)) {
                return view;
            }
        }
        ArrayList arrayList = this.f71276p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            va4 va4Var = (va4) arrayList.get(size);
            View view2 = va4Var.f65126e.f53781a;
            if (m25519n(view2, x, y, va4Var.f65130i, va4Var.f65131j)) {
                return view2;
            }
        }
        RecyclerView recyclerView = this.f71277q;
        for (int iM22544e = recyclerView.f6653f.m22544e() - 1; iM22544e >= 0; iM22544e--) {
            View viewM22543d = recyclerView.f6653f.m22543d(iM22544e);
            float translationX = viewM22543d.getTranslationX();
            float translationY = viewM22543d.getTranslationY();
            if (x >= viewM22543d.getLeft() + translationX && x <= viewM22543d.getRight() + translationX && y >= viewM22543d.getTop() + translationY && y <= viewM22543d.getBottom() + translationY) {
                return viewM22543d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m25524m(float[] fArr) {
        if ((this.f71275o & 12) != 0) {
            fArr[0] = (this.f71270j + this.f71268h) - this.f71263c.f53781a.getLeft();
        } else {
            fArr[0] = this.f71263c.f53781a.getTranslationX();
        }
        if ((this.f71275o & 3) != 0) {
            fArr[1] = (this.f71271k + this.f71269i) - this.f71263c.f53781a.getTop();
        } else {
            fArr[1] = this.f71263c.f53781a.getTranslationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final void m25525o(o38 o38Var) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        if (!this.f71277q.isLayoutRequested() && this.f71274n == 2) {
            gld gldVar = this.f71273m;
            gldVar.getClass();
            int i2 = (int) (this.f71270j + this.f71268h);
            int i3 = (int) (this.f71271k + this.f71269i);
            View view = o38Var.f53781a;
            if (Math.abs(i3 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i2 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList = this.f71280t;
                if (arrayList == null) {
                    this.f71280t = new ArrayList();
                    this.f71281u = new ArrayList();
                } else {
                    arrayList.clear();
                    this.f71281u.clear();
                }
                int iRound = Math.round(this.f71270j + this.f71268h);
                int iRound2 = Math.round(this.f71271k + this.f71269i);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                y28 layoutManager = this.f71277q.getLayoutManager();
                int iM24906v = layoutManager.m24906v();
                int i6 = 0;
                while (i6 < iM24906v) {
                    View viewM24904u = layoutManager.m24904u(i6);
                    if (viewM24904u == view) {
                        i = i6;
                    } else {
                        i = i6;
                        if (viewM24904u.getBottom() >= iRound2 && viewM24904u.getTop() <= height && viewM24904u.getRight() >= iRound && viewM24904u.getLeft() <= width) {
                            o38 o38VarM2719M = this.f71277q.m2719M(viewM24904u);
                            int iAbs5 = Math.abs(i4 - ((viewM24904u.getRight() + viewM24904u.getLeft()) / 2));
                            int iAbs6 = Math.abs(i5 - ((viewM24904u.getBottom() + viewM24904u.getTop()) / 2));
                            int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = this.f71280t.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i8 < size) {
                                int i10 = size;
                                if (i7 <= ((Integer) this.f71281u.get(i8)).intValue()) {
                                    break;
                                }
                                i9++;
                                i8++;
                                size = i10;
                            }
                            this.f71280t.add(i9, o38VarM2719M);
                            this.f71281u.add(i9, Integer.valueOf(i7));
                        }
                        i6 = i + 1;
                        i2 = i2;
                        i3 = i3;
                    }
                    i6 = i + 1;
                    i2 = i2;
                    i3 = i3;
                }
                int i11 = i2;
                int i12 = i3;
                ArrayList arrayList2 = this.f71280t;
                if (arrayList2.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i11;
                int height2 = view.getHeight() + i12;
                int left2 = i11 - view.getLeft();
                int top2 = i12 - view.getTop();
                int size2 = arrayList2.size();
                o38 o38Var2 = null;
                int i13 = -1;
                for (int i14 = 0; i14 < size2; i14++) {
                    o38 o38Var3 = (o38) arrayList2.get(i14);
                    if (left2 > 0 && (right = o38Var3.f53781a.getRight() - width2) < 0 && o38Var3.f53781a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i13) {
                        i13 = iAbs4;
                        o38Var2 = o38Var3;
                    }
                    if (left2 < 0 && (left = o38Var3.f53781a.getLeft() - i11) > 0 && o38Var3.f53781a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i13) {
                        i13 = iAbs3;
                        o38Var2 = o38Var3;
                    }
                    if (top2 < 0 && (top = o38Var3.f53781a.getTop() - i12) > 0 && o38Var3.f53781a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i13) {
                        i13 = iAbs2;
                        o38Var2 = o38Var3;
                    }
                    if (top2 > 0 && (bottom = o38Var3.f53781a.getBottom() - height2) < 0 && o38Var3.f53781a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i13) {
                        i13 = iAbs;
                        o38Var2 = o38Var3;
                    }
                }
                if (o38Var2 == null) {
                    this.f71280t.clear();
                    this.f71281u.clear();
                    return;
                }
                View view2 = o38Var2.f53781a;
                int iM17782b = o38Var2.m17782b();
                o38Var.m17782b();
                this.f71277q.getClass();
                ((C2064h) gldVar.f40985b).m8979m(o38Var.m17783c(), o38Var2.m17783c());
                RecyclerView recyclerView = this.f71277q;
                y28 layoutManager2 = recyclerView.getLayoutManager();
                if (!(layoutManager2 instanceof ya4)) {
                    if (layoutManager2.mo2679d()) {
                        if (y28.m24873A(view2) <= recyclerView.getPaddingLeft()) {
                            recyclerView.m2742i0(iM17782b);
                        }
                        if (y28.m24876D(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.m2742i0(iM17782b);
                        }
                    }
                    if (layoutManager2.mo2680e()) {
                        if (y28.m24877E(view2) <= recyclerView.getPaddingTop()) {
                            recyclerView.m2742i0(iM17782b);
                        }
                        if (y28.m24884y(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.m2742i0(iM17782b);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((ya4) layoutManager2);
                linearLayoutManager.mo2677c("Cannot drop a view during a scroll or layout calculation");
                linearLayoutManager.m2662P0();
                linearLayoutManager.m2684h1();
                int iM24878K = y28.m24878K(view);
                int iM24878K2 = y28.m24878K(view2);
                byte b = iM24878K < iM24878K2 ? (byte) 1 : (byte) -1;
                boolean z = linearLayoutManager.f6586u;
                lq2 lq2Var = linearLayoutManager.f6583r;
                if (z) {
                    if (b == 1) {
                        linearLayoutManager.m2689j1(iM24878K2, lq2Var.mo16451i() - (linearLayoutManager.f6583r.mo16447e(view) + linearLayoutManager.f6583r.mo16449g(view2)));
                        return;
                    } else {
                        linearLayoutManager.m2689j1(iM24878K2, lq2Var.mo16451i() - linearLayoutManager.f6583r.mo16446d(view2));
                        return;
                    }
                }
                if (b == -1) {
                    linearLayoutManager.m2689j1(iM24878K2, lq2Var.mo16449g(view2));
                } else {
                    linearLayoutManager.m2689j1(iM24878K2, lq2Var.mo16446d(view2) - linearLayoutManager.f6583r.mo16447e(view));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [gld, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [o38] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [gld, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [gld] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p */
    public final void m25526p(o38 o38Var, int i) {
        ?? r3;
        ?? r12;
        boolean z;
        ?? r13;
        ?? r14;
        o38 o38Var2;
        boolean z2;
        ?? r4;
        int iM25521j;
        char c;
        float fSignum;
        Object obj;
        long j;
        if (o38Var == this.f71263c && i == this.f71274n) {
            return;
        }
        this.f71260A = Long.MIN_VALUE;
        int i2 = this.f71274n;
        m25522k(o38Var, true);
        this.f71274n = i;
        if (i == 2) {
            if (o38Var == null) {
                C3386nv.m17626m("Must pass a ViewHolder when dragging");
                return;
            }
            this.f71282v = o38Var.f53781a;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.f71263c;
        ?? r0 = this.f71273m;
        if (r2 != 0) {
            View view = r2.f53781a;
            if (view.getParent() != null) {
                if (i2 == 2 || this.f71274n == 2) {
                    iM25521j = 0;
                } else {
                    int iM12741d = r0.m12741d(this.f71277q, r2);
                    int iM12736b = (gld.m12736b(iM12741d, this.f71277q.getLayoutDirection()) & 65280) >> 8;
                    if (iM12736b == 0) {
                        iM25521j = 0;
                    } else {
                        int i4 = (iM12741d & 65280) >> 8;
                        if (Math.abs(this.f71268h) > Math.abs(this.f71269i)) {
                            iM25521j = m25520i(iM12736b);
                            if (iM25521j <= 0) {
                                iM25521j = m25521j(iM12736b);
                                if (iM25521j <= 0) {
                                    iM25521j = 0;
                                }
                            } else if ((i4 & iM25521j) == 0) {
                                iM25521j = gld.m12737c(iM25521j, this.f71277q.getLayoutDirection());
                            }
                        } else {
                            iM25521j = m25521j(iM12736b);
                            if (iM25521j <= 0) {
                                iM25521j = m25520i(iM12736b);
                                if (iM25521j <= 0) {
                                    iM25521j = 0;
                                } else if ((i4 & iM25521j) == 0) {
                                    iM25521j = gld.m12737c(iM25521j, this.f71277q.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f71279s;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f71279s = null;
                }
                char c2 = 4;
                float fSignum2 = 0.0f;
                if (iM25521j == 1 || iM25521j == 2) {
                    c = 0;
                    fSignum = Math.signum(this.f71269i) * this.f71277q.getHeight();
                    obj = null;
                } else if (iM25521j == 4 || iM25521j == 8 || iM25521j == 16 || iM25521j == 32) {
                    c = 0;
                    obj = null;
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f71268h) * this.f71277q.getWidth();
                } else {
                    obj = null;
                    c = 0;
                    fSignum = 0.0f;
                }
                if (i2 == 2) {
                    c2 = '\b';
                } else if (iM25521j > 0) {
                    c2 = 2;
                }
                float[] fArr = this.f71262b;
                m25524m(fArr);
                char c3 = c2;
                ?? r15 = c;
                va4 va4Var = new va4(this, r2, i2, fArr[c], fArr[1], fSignum2, fSignum, iM25521j, r2);
                RecyclerView recyclerView = this.f71277q;
                r0.getClass();
                v28 itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator == null) {
                    j = c3 == '\b' ? 200L : 250L;
                } else {
                    j = c3 == '\b' ? itemAnimator.f64746e : itemAnimator.f64745d;
                }
                ValueAnimator valueAnimator = va4Var.f65128g;
                valueAnimator.setDuration(j);
                this.f71276p.add(va4Var);
                r2.m17796p(r15);
                valueAnimator.start();
                r4 = r0;
                z2 = true;
                o38Var2 = null;
                r14 = r15;
            } else {
                r14 = 0;
                if (view == this.f71282v) {
                    o38Var2 = null;
                    this.f71282v = null;
                } else {
                    o38Var2 = null;
                }
                ?? r5 = r0;
                r5.m12740a(this.f71277q, r2);
                z2 = false;
                r4 = r5;
            }
            this.f71263c = o38Var2;
            z = z2;
            r3 = r4;
            r12 = r14;
        } else {
            r3 = r0;
            r12 = 0;
            z = false;
        }
        if (o38Var != null) {
            View view2 = o38Var.f53781a;
            RecyclerView recyclerView2 = this.f71277q;
            this.f71275o = (gld.m12736b(r3.m12741d(recyclerView2, o38Var), recyclerView2.getLayoutDirection()) & i3) >> (this.f71274n * 8);
            this.f71270j = view2.getLeft();
            this.f71271k = view2.getTop();
            this.f71263c = o38Var;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        ?? parent = this.f71277q.getParent();
        if (parent != 0) {
            if (this.f71263c != null) {
                r13 = r12;
                r13 = 1;
            }
            r13 = r12;
            parent.requestDisallowInterceptTouchEvent(r13);
        }
        if (!z) {
            this.f71277q.getLayoutManager().f69176f = true;
        }
        r3.getClass();
        this.f71277q.invalidate();
    }

    /* JADX INFO: renamed from: q */
    public final void m25527q(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f71264d;
        this.f71268h = f;
        this.f71269i = y - this.f71265e;
        if ((i & 4) == 0) {
            this.f71268h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.f71268h = Math.min(0.0f, this.f71268h);
        }
        if ((i & 1) == 0) {
            this.f71269i = Math.max(0.0f, this.f71269i);
        }
        if ((i & 2) == 0) {
            this.f71269i = Math.min(0.0f, this.f71269i);
        }
    }
}
