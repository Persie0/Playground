package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.linguist.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p024b3.C1300g;
import p125g.C5630a;
import p329q2.C8488a;
import p389t2.C9182a;

/* JADX INFO: renamed from: androidx.appcompat.widget.g0 */
/* JADX INFO: loaded from: classes.dex */
public class C0314g0 extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f1189a;

    /* JADX INFO: renamed from: b */
    public int f1190b;

    /* JADX INFO: renamed from: c */
    public int f1191c;

    /* JADX INFO: renamed from: d */
    public int f1192d;

    /* JADX INFO: renamed from: e */
    public int f1193e;

    /* JADX INFO: renamed from: f */
    public int f1194f;

    /* JADX INFO: renamed from: g */
    public d f1195g;

    /* JADX INFO: renamed from: h */
    public boolean f1196h;

    /* JADX INFO: renamed from: i */
    public final boolean f1197i;

    /* JADX INFO: renamed from: j */
    public boolean f1198j;

    /* JADX INFO: renamed from: k */
    public C1300g f1199k;

    /* JADX INFO: renamed from: l */
    public f f1200l;

    /* JADX INFO: renamed from: androidx.appcompat.widget.g0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m1195a(View view, float f3, float f10) {
            view.drawableHotspotChanged(f3, f10);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.g0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final Method f1201a;

        /* JADX INFO: renamed from: b */
        public static final Method f1202b;

        /* JADX INFO: renamed from: c */
        public static final Method f1203c;

        /* JADX INFO: renamed from: d */
        public static final boolean f1204d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1201a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1202b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1203c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1204d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.g0$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static boolean m1196a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* JADX INFO: renamed from: b */
        public static void m1197b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.g0$d */
    public static class d extends C5630a {

        /* JADX INFO: renamed from: b */
        public boolean f1205b;

        public d(Drawable drawable) {
            super(drawable);
            this.f1205b = true;
        }

        @Override // p125g.C5630a, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f1205b) {
                super.draw(canvas);
            }
        }

        @Override // p125g.C5630a, android.graphics.drawable.Drawable
        public final void setHotspot(float f3, float f10) {
            if (this.f1205b) {
                super.setHotspot(f3, f10);
            }
        }

        @Override // p125g.C5630a, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1205b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // p125g.C5630a, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f1205b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p125g.C5630a, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f1205b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.g0$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public static final Field f1206a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f1206a = declaredField;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.g0$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0314g0 c0314g0 = C0314g0.this;
            c0314g0.f1200l = null;
            c0314g0.drawableStateChanged();
        }
    }

    public C0314g0(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1189a = new Rect();
        this.f1190b = 0;
        this.f1191c = 0;
        this.f1192d = 0;
        this.f1193e = 0;
        this.f1197i = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f1195g;
        if (dVar != null) {
            dVar.f1205b = z10;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m1193a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    /* JADX WARN: Code duplicated, block: B:78:0x014e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0165  */
    /* JADX WARN: Code duplicated, block: B:82:0x016a  */
    /* JADX WARN: Code duplicated, block: B:84:0x016e  */
    /* JADX WARN: Code duplicated, block: B:86:0x017f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0183  */
    /* JADX WARN: Code duplicated, block: B:90:0x0187  */
    /* JADX INFO: renamed from: b */
    public final boolean m1194b(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean zM1196a;
        boolean z11;
        View childAt;
        View childAt2;
        C1300g c1300g;
        int actionMasked = motionEvent.getActionMasked();
        boolean z12 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z10 = true;
            } else if (actionMasked != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || z12) {
                this.f1198j = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f1194f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z10) {
                if (this.f1199k == null) {
                    this.f1199k = new C1300g(this);
                }
                C1300g c1300g2 = this.f1199k;
                boolean z13 = c1300g2.f8013K;
                c1300g2.f8013K = true;
                c1300g2.onTouch(this, motionEvent);
            } else {
                c1300g = this.f1199k;
                if (c1300g != null) {
                    if (c1300g.f8013K) {
                        c1300g.m4801d();
                    }
                    c1300g.f8013K = false;
                }
            }
            return z10;
        }
        z10 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z12 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f3 = x10;
                float f10 = y10;
                this.f1198j = true;
                a.m1195a(this, f3, f10);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f1194f;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f1194f = iPointToPosition;
                a.m1195a(childAt3, f3 - childAt3.getLeft(), f10 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z14 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z14) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f1189a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f1190b;
                rect.top -= this.f1191c;
                rect.right += this.f1192d;
                rect.bottom += this.f1193e;
                if (C9182a.m17515a()) {
                    zM1196a = c.m1196a(this);
                } else {
                    Field field = e.f1206a;
                    if (field != null) {
                        try {
                            zM1196a = field.getBoolean(this);
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                            zM1196a = false;
                        }
                    } else {
                        zM1196a = false;
                    }
                }
                if (childAt3.isEnabled() != zM1196a) {
                    boolean z15 = !zM1196a;
                    if (C9182a.m17515a()) {
                        c.m1197b(this, z15);
                    } else {
                        Field field2 = e.f1206a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z15));
                            } catch (IllegalAccessException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z14) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    z11 = false;
                    selector.setVisible(getVisibility() == 0, false);
                    C8488a.b.m16567e(selector, fExactCenterX, fExactCenterY);
                } else {
                    z11 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    C8488a.b.m16567e(selector2, f3, f10);
                }
                setSelectorEnabled(z11);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z10 = true;
                z12 = false;
            }
        }
        if (z10) {
            this.f1198j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1194f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f1198j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1194f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z10) {
            if (this.f1199k == null) {
                this.f1199k = new C1300g(this);
            }
            C1300g c1300g3 = this.f1199k;
            boolean z16 = c1300g3.f8013K;
            c1300g3.f8013K = true;
            c1300g3.onTouch(this, motionEvent);
        } else {
            c1300g = this.f1199k;
            if (c1300g != null) {
                if (c1300g.f8013K) {
                    c1300g.m4801d();
                }
                c1300g.f8013K = false;
            }
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1189a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f1200l != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f1198j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f1197i && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f1197i && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f1197i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if (!this.f1197i || !this.f1196h) {
            if (!super.isInTouchMode()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f1200l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1200l == null) {
            f fVar = new f();
            this.f1200l = fVar;
            post(fVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.f1204d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            b.f1201a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            b.f1202b.invoke(this, Integer.valueOf(iPointToPosition));
                            b.f1203c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f1198j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1194f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f1200l;
        if (fVar != null) {
            C0314g0 c0314g0 = C0314g0.this;
            c0314g0.f1200l = null;
            c0314g0.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f1196h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f1195g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1190b = rect.left;
        this.f1191c = rect.top;
        this.f1192d = rect.right;
        this.f1193e = rect.bottom;
    }
}
