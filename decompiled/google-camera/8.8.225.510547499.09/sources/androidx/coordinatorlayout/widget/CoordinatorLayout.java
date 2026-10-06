package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000.C1117xf;
import p000.C1143ye;
import p000.aag;
import p000.aah;
import p000.aai;
import p000.aaj;
import p000.aak;
import p000.aal;
import p000.aam;
import p000.aan;
import p000.aed;
import p000.aef;
import p000.aem;
import p000.aet;
import p000.aeu;
import p000.aev;
import p000.aew;
import p000.afb;
import p000.afc;
import p000.afe;
import p000.aff;
import p000.afh;
import p000.afn;
import p000.afq;
import p000.ago;
import p000.bbo;
import p000.iwk;
import p000.mfx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements aet, aeu {

    /* JADX INFO: renamed from: a */
    public static final String f1445a;

    /* JADX INFO: renamed from: b */
    public static final Class[] f1446b;

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal f1447c;

    /* JADX INFO: renamed from: d */
    static final Comparator f1448d;

    /* JADX INFO: renamed from: i */
    private static final aed f1449i;

    /* JADX INFO: renamed from: e */
    public ago f1450e;

    /* JADX INFO: renamed from: f */
    public boolean f1451f;

    /* JADX INFO: renamed from: g */
    public ViewGroup.OnHierarchyChangeListener f1452g;

    /* JADX INFO: renamed from: h */
    public final bbo f1453h;

    /* JADX INFO: renamed from: j */
    private final List f1454j;

    /* JADX INFO: renamed from: k */
    private final List f1455k;

    /* JADX INFO: renamed from: l */
    private final int[] f1456l;

    /* JADX INFO: renamed from: m */
    private final int[] f1457m;

    /* JADX INFO: renamed from: n */
    private boolean f1458n;

    /* JADX INFO: renamed from: o */
    private boolean f1459o;

    /* JADX INFO: renamed from: p */
    private int[] f1460p;

    /* JADX INFO: renamed from: q */
    private View f1461q;

    /* JADX INFO: renamed from: r */
    private View f1462r;

    /* JADX INFO: renamed from: s */
    private boolean f1463s;

    /* JADX INFO: renamed from: t */
    private Drawable f1464t;

    /* JADX INFO: renamed from: u */
    private aew f1465u;

    /* JADX INFO: renamed from: v */
    private final aev f1466v;

    /* JADX INFO: renamed from: w */
    private iwk f1467w;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f1445a = r0 != null ? r0.getName() : null;
        f1448d = new C1143ye(2);
        f1446b = new Class[]{Context.class, AttributeSet.class};
        f1447c = new ThreadLocal();
        f1449i = new aef(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: A */
    private static final MotionEvent m1406A(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    /* JADX INFO: renamed from: B */
    private static final void m1407B(View view, int i) {
        aal aalVar = (aal) view.getLayoutParams();
        int i2 = aalVar.f22i;
        if (i2 != i) {
            int[] iArr = afq.f274a;
            view.offsetLeftAndRight(i - i2);
            aalVar.f22i = i;
        }
    }

    /* JADX INFO: renamed from: C */
    private static final void m1408C(View view, int i) {
        aal aalVar = (aal) view.getLayoutParams();
        int i2 = aalVar.f23j;
        if (i2 != i) {
            int[] iArr = afq.f274a;
            view.offsetTopAndBottom(i - i2);
            aalVar.f23j = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    static final aal m1409l(View view) {
        aal aalVar = (aal) view.getLayoutParams();
        if (!aalVar.f15b) {
            if (view instanceof aah) {
                aai aaiVarMo1a = ((aah) view).mo1a();
                if (aaiVarMo1a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                aalVar.m24b(aaiVarMo1a);
                aalVar.f15b = true;
            } else {
                aaj aajVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    aajVar = (aaj) superclass.getAnnotation(aaj.class);
                    if (aajVar != null) {
                        break;
                    }
                }
                if (aajVar != null) {
                    try {
                        aalVar.m24b((aai) aajVar.m22a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + aajVar.m22a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                aalVar.f15b = true;
            }
        }
        return aalVar;
    }

    /* JADX INFO: renamed from: n */
    private final int m1410n() {
        int height = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            aal aalVar = (aal) childAt.getLayoutParams();
            height += childAt.getHeight() + aalVar.topMargin + aalVar.bottomMargin;
        }
        return height;
    }

    /* JADX INFO: renamed from: o */
    private final int m1411o(int i) {
        int[] iArr = this.f1460p;
        if (iArr == null) {
            Log.e("CoordinatorLayout", voNZjxiJou.JRPtxzVTbZSJP + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    /* JADX INFO: renamed from: p */
    private static int m1412p(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* JADX INFO: renamed from: q */
    private static int m1413q(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* JADX INFO: renamed from: r */
    private static Rect m1414r() {
        Rect rect = (Rect) f1449i.mo320a();
        return rect == null ? new Rect() : rect;
    }

    /* JADX INFO: renamed from: s */
    private final void m1415s(aal aalVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + aalVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - aalVar.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + aalVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - aalVar.bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    /* JADX INFO: renamed from: u */
    private static void m1416u(Rect rect) {
        rect.setEmpty();
        f1449i.mo321b(rect);
    }

    /* JADX INFO: renamed from: v */
    private final void m1417v() {
        View view = this.f1461q;
        if (view != null) {
            aai aaiVar = ((aal) view.getLayoutParams()).f14a;
            if (aaiVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                aaiVar.mo10g(this, this.f1461q, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.f1461q = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((aal) getChildAt(i).getLayoutParams()).f26m = false;
        }
        this.f1458n = false;
    }

    /* JADX INFO: renamed from: w */
    private final void m1418w() {
        if (!afb.m435p(this)) {
            afh.m483n(this, null);
            return;
        }
        if (this.f1465u == null) {
            this.f1465u = new mfx(this, 1);
        }
        afh.m483n(this, this.f1465u);
        setSystemUiVisibility(1280);
    }

    /* JADX INFO: renamed from: x */
    private final boolean m1419x(aai aaiVar, View view, MotionEvent motionEvent, int i) {
        switch (i) {
            case 0:
                return aaiVar.mo7d(this, view, motionEvent);
            default:
                return aaiVar.mo10g(this, view, motionEvent);
        }
    }

    /* JADX INFO: renamed from: y */
    private final boolean m1420y(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f1455k;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator comparator = f1448d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventM1406A = null;
        boolean zM1419x = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            aal aalVar = (aal) view.getLayoutParams();
            aai aaiVar = aalVar.f14a;
            if (!zM1419x || actionMasked == 0) {
                if (!zM1419x && aaiVar != null && (zM1419x = m1419x(aaiVar, view, motionEvent, i))) {
                    this.f1461q = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = (View) list.get(i4);
                            aai aaiVar2 = ((aal) view2.getLayoutParams()).f14a;
                            if (aaiVar2 != null) {
                                if (motionEventM1406A == null) {
                                    motionEventM1406A = m1406A(motionEvent);
                                }
                                m1419x(aaiVar2, view2, motionEventM1406A, i);
                            }
                        }
                    }
                }
                if (aalVar.f14a == null) {
                    aalVar.f26m = false;
                }
                boolean z = aalVar.f26m;
            } else if (aaiVar != null) {
                if (motionEventM1406A == null) {
                    motionEventM1406A = m1406A(motionEvent);
                }
                m1419x(aaiVar, view, motionEventM1406A, i);
            }
        }
        list.clear();
        if (motionEventM1406A != null) {
            motionEventM1406A.recycle();
        }
        return zM1419x;
    }

    /* JADX INFO: renamed from: z */
    private static final void m1421z(int i, Rect rect, Rect rect2, aal aalVar, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = aalVar.f16c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(m1412p(aalVar.f17d), i);
        int i7 = absoluteGravity2 & 7;
        int i8 = absoluteGravity2 & 112;
        switch (i7) {
            case 1:
                iWidth = rect.left + (rect.width() / 2);
                break;
            case 5:
                iWidth = rect.right;
                break;
            default:
                iWidth = rect.left;
                break;
        }
        switch (i8) {
            case 16:
                iHeight = rect.top + (rect.height() / 2);
                break;
            case 80:
                iHeight = rect.bottom;
                break;
            default:
                iHeight = rect.top;
                break;
        }
        switch (i5) {
            case 1:
                iWidth -= i2 / 2;
                break;
            case 5:
                break;
            default:
                iWidth -= i2;
                break;
        }
        switch (i6) {
            case 16:
                iHeight -= i3 / 2;
                break;
            case 80:
                break;
            default:
                iHeight -= i3;
                break;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX INFO: renamed from: a */
    public final List m1422a(View view) {
        bbo bboVar = this.f1453h;
        int i = ((C1117xf) bboVar.f2907a).f48004d;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((C1117xf) bboVar.f2907a).m19560g(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((C1117xf) bboVar.f2907a).m19559d(i2));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final void m1423b(View view) {
        ArrayList arrayListM2181a = this.f1453h.m2181a(view);
        if (arrayListM2181a == null || arrayListM2181a.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayListM2181a.size(); i++) {
            View view2 = (View) arrayListM2181a.get(i);
            aai aaiVar = ((aal) view2.getLayoutParams()).f14a;
            if (aaiVar != null) {
                aaiVar.mo12i(this, view2, view);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    final void m1424c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            aan.m27a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof aal) && super.checkLayoutParams(layoutParams);
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: d */
    public final void mo392d(View view, int i, int i2, int[] iArr, int i3) {
        aai aaiVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                aal aalVar = (aal) childAt.getLayoutParams();
                if (aalVar.m26d(i3) && (aaiVar = aalVar.f14a) != null) {
                    int[] iArr2 = this.f1456l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aaiVar.mo16m(this, childAt, view, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, this.f1456l[0]) : Math.min(iMax, this.f1456l[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, this.f1456l[1]) : Math.min(iMax2, this.f1456l[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            m1425i(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int height;
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (zDispatchKeyEvent || keyEvent.getAction() != 0) {
            return zDispatchKeyEvent;
        }
        switch (keyEvent.getKeyCode()) {
            case 19:
            case 20:
            case 62:
                if (keyEvent.getKeyCode() == 62) {
                    height = keyEvent.isShiftPressed() ? -m1410n() : m1410n() - getHeight();
                } else {
                    height = keyEvent.isAltPressed() ? getHeight() : (int) (getHeight() * 0.1f);
                }
                View focusedChild = this;
                while (true) {
                    if (focusedChild == null) {
                        focusedChild = null;
                    } else if (!focusedChild.isFocused()) {
                        focusedChild = focusedChild instanceof ViewGroup ? ((ViewGroup) focusedChild).getFocusedChild() : null;
                    }
                }
                if (keyEvent.getKeyCode() == 19) {
                    height = -height;
                }
                mo396t(this, focusedChild, 2, 1);
                mo397f(focusedChild, 0, 0, 0, height, 1, this.f1456l);
                mo395h(focusedChild, 1);
                return this.f1456l[1] > 0;
            default:
                return zDispatchKeyEvent;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        aai aaiVar = ((aal) view.getLayoutParams()).f14a;
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1464t;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: e */
    public final void mo393e(View view, int i, int i2, int i3, int i4, int i5) {
        mo397f(view, i, i2, i3, i4, 0, this.f1457m);
    }

    @Override // p000.aeu
    /* JADX INFO: renamed from: f */
    public final void mo397f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        aai aaiVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                aal aalVar = (aal) childAt.getLayoutParams();
                if (aalVar.m26d(i5) && (aaiVar = aalVar.f14a) != null) {
                    int[] iArr2 = this.f1456l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aaiVar.mo17n(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, this.f1456l[0]) : Math.min(iMax, this.f1456l[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, this.f1456l[1]) : Math.min(iMax2, this.f1456l[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            m1425i(1);
        }
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: g */
    public final void mo394g(View view, View view2, int i, int i2) {
        this.f1466v.m399b(i, i2);
        this.f1462r = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            aal aalVar = (aal) getChildAt(i3).getLayoutParams();
            if (aalVar.m26d(i2)) {
                aai aaiVar = aalVar.f14a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aal();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aal(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.f1466v.m398a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: h */
    public final void mo395h(View view, int i) {
        this.f1466v.m400c(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            aal aalVar = (aal) childAt.getLayoutParams();
            if (aalVar.m26d(i)) {
                aai aaiVar = aalVar.f14a;
                if (aaiVar != null) {
                    aaiVar.mo6c(this, childAt, view, i);
                }
                aalVar.m25c(i, false);
                aalVar.m23a();
            }
        }
        this.f1462r = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m1425i(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int height;
        int i5;
        aai aaiVar;
        int iM442c = afc.m442c(this);
        int size = this.f1454j.size();
        Rect rectM1414r = m1414r();
        Rect rectM1414r2 = m1414r();
        Rect rectM1414r3 = m1414r();
        int i6 = 0;
        while (i6 < size) {
            View view = (View) this.f1454j.get(i6);
            aal aalVar = (aal) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = rectM1414r3;
                i2 = i6;
            } else {
                int i7 = 0;
                while (i7 < i6) {
                    if (aalVar.f25l == ((View) this.f1454j.get(i7))) {
                        aal aalVar2 = (aal) view.getLayoutParams();
                        if (aalVar2.f24k != null) {
                            Rect rectM1414r4 = m1414r();
                            Rect rectM1414r5 = m1414r();
                            Rect rectM1414r6 = m1414r();
                            aan.m27a(this, aalVar2.f24k, rectM1414r4);
                            m1424c(view, false, rectM1414r5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            m1421z(iM442c, rectM1414r4, rectM1414r6, aalVar2, measuredWidth, measuredHeight);
                            boolean z4 = (rectM1414r6.left == rectM1414r5.left && rectM1414r6.top == rectM1414r5.top) ? false : true;
                            m1415s(aalVar2, rectM1414r6, measuredWidth, measuredHeight);
                            int i8 = rectM1414r6.left - rectM1414r5.left;
                            int i9 = rectM1414r6.top - rectM1414r5.top;
                            if (i8 != 0) {
                                view.offsetLeftAndRight(i8);
                            }
                            if (i9 != 0) {
                                view.offsetTopAndBottom(i9);
                            }
                            if (z4 && (aaiVar = aalVar2.f14a) != null) {
                                aaiVar.mo12i(this, view, aalVar2.f24k);
                            }
                            m1416u(rectM1414r4);
                            m1416u(rectM1414r5);
                            m1416u(rectM1414r6);
                        }
                    }
                    i7++;
                    size = size;
                    i6 = i6;
                    rectM1414r3 = rectM1414r3;
                    aalVar = aalVar;
                }
                aal aalVar3 = aalVar;
                int i10 = size;
                Rect rect2 = rectM1414r3;
                i2 = i6;
                m1424c(view, true, rectM1414r2);
                if (aalVar3.f20g != 0 && !rectM1414r2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(aalVar3.f20g, iM442c);
                    switch (absoluteGravity & 112) {
                        case 48:
                            rectM1414r.top = Math.max(rectM1414r.top, rectM1414r2.bottom);
                            break;
                        case 80:
                            rectM1414r.bottom = Math.max(rectM1414r.bottom, getHeight() - rectM1414r2.top);
                            break;
                    }
                    switch (absoluteGravity & 7) {
                        case 3:
                            rectM1414r.left = Math.max(rectM1414r.left, rectM1414r2.right);
                            break;
                        case 5:
                            rectM1414r.right = Math.max(rectM1414r.right, getWidth() - rectM1414r2.left);
                            break;
                    }
                }
                if (aalVar3.f21h != 0 && view.getVisibility() == 0 && afe.m462f(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    aal aalVar4 = (aal) view.getLayoutParams();
                    aai aaiVar2 = aalVar4.f14a;
                    Rect rectM1414r7 = m1414r();
                    Rect rectM1414r8 = m1414r();
                    rectM1414r8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (aaiVar2 == null || !aaiVar2.mo21r(view, rectM1414r7)) {
                        rectM1414r7.set(rectM1414r8);
                    } else if (!rectM1414r8.contains(rectM1414r7)) {
                        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectM1414r7.toShortString() + " | Bounds:" + rectM1414r8.toShortString());
                    }
                    m1416u(rectM1414r8);
                    if (rectM1414r7.isEmpty()) {
                        m1416u(rectM1414r7);
                    } else {
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(aalVar4.f21h, iM442c);
                        if ((absoluteGravity2 & 48) != 48 || (i5 = (rectM1414r7.top - aalVar4.topMargin) - aalVar4.f23j) >= rectM1414r.top) {
                            z2 = false;
                        } else {
                            m1408C(view, rectM1414r.top - i5);
                            z2 = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectM1414r7.bottom) - aalVar4.bottomMargin) + aalVar4.f23j) < rectM1414r.bottom) {
                            m1408C(view, height - rectM1414r.bottom);
                        } else if (!z2) {
                            m1408C(view, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i4 = (rectM1414r7.left - aalVar4.leftMargin) - aalVar4.f22i) >= rectM1414r.left) {
                            z3 = false;
                        } else {
                            m1407B(view, rectM1414r.left - i4);
                            z3 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectM1414r7.right) - aalVar4.rightMargin) + aalVar4.f22i) < rectM1414r.right) {
                            m1407B(view, width - rectM1414r.right);
                        } else if (!z3) {
                            m1407B(view, 0);
                        }
                        m1416u(rectM1414r7);
                    }
                }
                if (i != 2) {
                    rect = rect2;
                    rect.set(((aal) view.getLayoutParams()).f29p);
                    if (rect.equals(rectM1414r2)) {
                        i3 = i10;
                    } else {
                        ((aal) view.getLayoutParams()).f29p.set(rectM1414r2);
                    }
                } else {
                    rect = rect2;
                }
                int i11 = i2 + 1;
                while (true) {
                    i3 = i10;
                    if (i11 < i3) {
                        View view2 = (View) this.f1454j.get(i11);
                        aal aalVar5 = (aal) view2.getLayoutParams();
                        aai aaiVar3 = aalVar5.f14a;
                        if (aaiVar3 != null && aaiVar3.mo11h(view)) {
                            if (i == 0 && aalVar5.f28o) {
                                aalVar5.m23a();
                            } else {
                                switch (i) {
                                    case 2:
                                        aaiVar3.mo13j(this, view);
                                        z = true;
                                        break;
                                    default:
                                        aaiVar3.mo12i(this, view2, view);
                                        z = false;
                                        break;
                                }
                                if (i == 1) {
                                    aalVar5.f28o = z;
                                }
                            }
                        }
                        i11++;
                        i10 = i3;
                    }
                }
            }
            i6 = i2 + 1;
            size = i3;
            rectM1414r3 = rect;
        }
        m1416u(rectM1414r);
        m1416u(rectM1414r2);
        m1416u(rectM1414r3);
    }

    /* JADX INFO: renamed from: j */
    public final void m1426j(View view, int i) {
        int i2;
        aal aalVar = (aal) view.getLayoutParams();
        View view2 = aalVar.f24k;
        if (view2 == null && aalVar.f19f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            Rect rectM1414r = m1414r();
            Rect rectM1414r2 = m1414r();
            try {
                aan.m27a(this, view2, rectM1414r);
                aal aalVar2 = (aal) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m1421z(i, rectM1414r, rectM1414r2, aalVar2, measuredWidth, measuredHeight);
                m1415s(aalVar2, rectM1414r2, measuredWidth, measuredHeight);
                view.layout(rectM1414r2.left, rectM1414r2.top, rectM1414r2.right, rectM1414r2.bottom);
                return;
            } finally {
                m1416u(rectM1414r);
                m1416u(rectM1414r2);
            }
        }
        int i3 = aalVar.f18e;
        if (i3 < 0) {
            aal aalVar3 = (aal) view.getLayoutParams();
            Rect rectM1414r3 = m1414r();
            rectM1414r3.set(getPaddingLeft() + aalVar3.leftMargin, getPaddingTop() + aalVar3.topMargin, (getWidth() - getPaddingRight()) - aalVar3.rightMargin, (getHeight() - getPaddingBottom()) - aalVar3.bottomMargin);
            if (this.f1450e != null && afb.m435p(this) && !afb.m435p(view)) {
                rectM1414r3.left += this.f1450e.m604b();
                rectM1414r3.top += this.f1450e.m606d();
                rectM1414r3.right -= this.f1450e.m605c();
                rectM1414r3.bottom -= this.f1450e.m603a();
            }
            Rect rectM1414r4 = m1414r();
            aem.m350a(m1412p(aalVar3.f16c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectM1414r3, rectM1414r4, i);
            view.layout(rectM1414r4.left, rectM1414r4.top, rectM1414r4.right, rectM1414r4.bottom);
            m1416u(rectM1414r3);
            m1416u(rectM1414r4);
            return;
        }
        aal aalVar4 = (aal) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(m1413q(aalVar4.f16c), i);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int iM1411o = m1411o(i3) - measuredWidth2;
        switch (i4) {
            case 1:
                iM1411o += measuredWidth2 / 2;
                break;
            case 5:
                iM1411o += measuredWidth2;
                break;
        }
        switch (i5) {
            case 16:
                i2 = measuredHeight2 / 2;
                break;
            case 80:
                i2 = measuredHeight2;
                break;
            default:
                i2 = 0;
                break;
        }
        int iMax = Math.max(getPaddingLeft() + aalVar4.leftMargin, Math.min(iM1411o, ((width - getPaddingRight()) - measuredWidth2) - aalVar4.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + aalVar4.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - aalVar4.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1427k(View view, int i, int i2) {
        Rect rectM1414r = m1414r();
        aan.m27a(this, view, rectM1414r);
        try {
            return rectM1414r.contains(i, i2);
        } finally {
            m1416u(rectM1414r);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1428m(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1417v();
        if (this.f1463s) {
            if (this.f1467w == null) {
                this.f1467w = new iwk(this, 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1467w);
        }
        if (this.f1450e == null && afb.m435p(this)) {
            aff.m467c(this);
        }
        this.f1459o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1417v();
        if (this.f1463s && this.f1467w != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1467w);
        }
        View view = this.f1462r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1459o = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1451f || this.f1464t == null) {
            return;
        }
        ago agoVar = this.f1450e;
        int iM606d = agoVar != null ? agoVar.m606d() : 0;
        if (iM606d > 0) {
            this.f1464t.setBounds(0, 0, getWidth(), iM606d);
            this.f1464t.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1417v();
            actionMasked = 0;
        }
        boolean zM1420y = m1420y(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1461q = null;
            m1417v();
        }
        return zM1420y;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        aai aaiVar;
        int iM442c = afc.m442c(this);
        int size = this.f1454j.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f1454j.get(i5);
            if (view.getVisibility() != 8 && ((aaiVar = ((aal) view.getLayoutParams()).f14a) == null || !aaiVar.mo8e(this, view, iM442c))) {
                m1426j(view, iM442c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Type inference failed for: r4v36, types: [aed, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v27, types: [aed, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:38:0x009f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.view.View
    protected final void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                aal aalVar = (aal) childAt.getLayoutParams();
                if (aalVar.f27n) {
                    aai aaiVar = aalVar.f14a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        aai aaiVar;
        int childCount = getChildCount();
        boolean zMo15l = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                aal aalVar = (aal) childAt.getLayoutParams();
                if (aalVar.f27n && (aaiVar = aalVar.f14a) != null) {
                    zMo15l |= aaiVar.mo15l(view);
                }
            }
        }
        return zMo15l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo392d(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo393e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo394g(view, view2, i, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof aam)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aam aamVar = (aam) parcelable;
        super.onRestoreInstanceState(aamVar.f394d);
        SparseArray sparseArray = aamVar.f31a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            aai aaiVar = m1409l(childAt).f14a;
            if (id != -1 && aaiVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aaiVar.mo18o(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableMo19p;
        aam aamVar = new aam(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            aai aaiVar = ((aal) childAt.getLayoutParams()).f14a;
            if (id != -1 && aaiVar != null && (parcelableMo19p = aaiVar.mo19p(childAt)) != null) {
                sparseArray.append(id, parcelableMo19p);
            }
        }
        aamVar.f31a = sparseArray;
        return aamVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo396t(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo395h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM1420y;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f1461q;
        boolean z = false;
        if (view != null) {
            aai aaiVar = ((aal) view.getLayoutParams()).f14a;
            zM1420y = aaiVar != null ? aaiVar.mo10g(this, this.f1461q, motionEvent) : false;
        } else {
            zM1420y = m1420y(motionEvent, 1);
            if (actionMasked != 0 && zM1420y) {
                z = true;
            }
        }
        if (this.f1461q == null || actionMasked == 3) {
            zM1420y |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventM1406A = m1406A(motionEvent);
            super.onTouchEvent(motionEventM1406A);
            motionEventM1406A.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1461q = null;
            m1417v();
        }
        return zM1420y;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        aai aaiVar = ((aal) view.getLayoutParams()).f14a;
        if (aaiVar == null || !aaiVar.mo9f(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f1458n) {
            return;
        }
        if (this.f1461q == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                aai aaiVar = ((aal) childAt.getLayoutParams()).f14a;
                if (aaiVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    aaiVar.mo7d(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        m1417v();
        this.f1458n = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1418w();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1452g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.f1464t;
        if (drawable != null) {
            boolean z = i == 0;
            if (drawable.isVisible() != z) {
                this.f1464t.setVisible(z, false);
            }
        }
    }

    @Override // p000.aet
    /* JADX INFO: renamed from: t */
    public final boolean mo396t(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                aal aalVar = (aal) childAt.getLayoutParams();
                aai aaiVar = aalVar.f14a;
                if (aaiVar != null) {
                    boolean zMo20q = aaiVar.mo20q(this, childAt, view, i, i2);
                    z |= zMo20q;
                    aalVar.m25c(i2, zMo20q);
                } else {
                    aalVar.m25c(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1464t;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof aal) {
            return new aal((aal) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new aal((ViewGroup.MarginLayoutParams) layoutParams) : new aal(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i);
        this.f1454j = new ArrayList();
        this.f1453h = new bbo((byte[]) null);
        this.f1455k = new ArrayList();
        this.f1456l = new int[2];
        this.f1457m = new int[2];
        this.f1466v = new aev();
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aag.f11a, 0, C0100R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aag.f11a, i, 0);
        }
        if (i == 0) {
            afn.m536c(this, context, aag.f11a, attributeSet, typedArrayObtainStyledAttributes, 0, C0100R.style.Widget_Support_CoordinatorLayout);
        } else {
            afn.m536c(this, context, aag.f11a, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1460p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1460p.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f1460p;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.f1464t = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        m1418w();
        super.setOnHierarchyChangeListener(new aak(this));
        if (afb.m420a(this) == 0) {
            afb.m434o(this, 1);
        }
    }
}
