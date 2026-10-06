package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: km */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0773km extends ListView {

    /* JADX INFO: renamed from: a */
    public boolean f36511a;

    /* JADX INFO: renamed from: b */
    public RunnableC0059be f36512b;

    /* JADX INFO: renamed from: c */
    private final Rect f36513c;

    /* JADX INFO: renamed from: d */
    private int f36514d;

    /* JADX INFO: renamed from: e */
    private int f36515e;

    /* JADX INFO: renamed from: f */
    private int f36516f;

    /* JADX INFO: renamed from: g */
    private int f36517g;

    /* JADX INFO: renamed from: h */
    private int f36518h;

    /* JADX INFO: renamed from: i */
    private C0772kl f36519i;

    /* JADX INFO: renamed from: j */
    private final boolean f36520j;

    /* JADX INFO: renamed from: k */
    private boolean f36521k;

    /* JADX INFO: renamed from: l */
    private ahf f36522l;

    public C0773km(Context context, boolean z) {
        super(context, null, C0100R.attr.dropDownListViewStyle);
        this.f36513c = new Rect();
        this.f36514d = 0;
        this.f36515e = 0;
        this.f36516f = 0;
        this.f36517g = 0;
        this.f36520j = z;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: c */
    private final void m14527c(boolean z) {
        C0772kl c0772kl = this.f36519i;
        if (c0772kl != null) {
            c0772kl.f36451a = z;
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m14528d() {
        Drawable selector = getSelector();
        if (selector != null && this.f36521k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:55:0x0115  */
    /* JADX INFO: renamed from: a */
    public final boolean m14529a(MotionEvent motionEvent, int i) {
        boolean z;
        int iFindPointerIndex;
        int x;
        int y;
        int iPointToPosition;
        View childAt;
        float f;
        float f2;
        int i2;
        Drawable selector;
        int i3;
        boolean z2;
        boolean zM14403b;
        Drawable selector2;
        boolean z3;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        switch (actionMasked) {
            case 1:
                z = false;
                iFindPointerIndex = motionEvent.findPointerIndex(i);
                if (iFindPointerIndex < 0) {
                    x = (int) motionEvent.getX(iFindPointerIndex);
                    y = (int) motionEvent.getY(iFindPointerIndex);
                    iPointToPosition = pointToPosition(x, y);
                    if (iPointToPosition == -1) {
                        childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                        f = x;
                        f2 = y;
                        this.f36521k = true;
                        C0769ki.m14305a(this, f, f2);
                        if (!isPressed()) {
                            setPressed(true);
                        }
                        layoutChildren();
                        i2 = this.f36518h;
                        if (i2 != -1 && (childAt2 = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt2 != childAt && childAt2.isPressed()) {
                            childAt2.setPressed(false);
                        }
                        this.f36518h = iPointToPosition;
                        C0769ki.m14305a(childAt, f - childAt.getLeft(), f2 - childAt.getTop());
                        if (!childAt.isPressed()) {
                            childAt.setPressed(true);
                        }
                        selector = getSelector();
                        if (selector != null) {
                            if (iPointToPosition != -1) {
                                i3 = iPointToPosition;
                                z2 = true;
                            } else {
                                iPointToPosition = -1;
                                i3 = -1;
                            }
                            if (z2) {
                                selector.setVisible(false, false);
                            }
                            Rect rect = this.f36513c;
                            rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            rect.left -= this.f36514d;
                            rect.top -= this.f36515e;
                            rect.right += this.f36516f;
                            rect.bottom += this.f36517g;
                            int i4 = adg.f162a;
                            zM14403b = C0771kk.m14403b(this);
                            if (childAt.isEnabled() != zM14403b) {
                                C0771kk.m14402a(this, !zM14403b);
                                if (iPointToPosition != -1) {
                                    refreshDrawableState();
                                }
                            }
                            if (z2) {
                                Rect rect2 = this.f36513c;
                                float fExactCenterX = rect2.exactCenterX();
                                float fExactCenterY = rect2.exactCenterY();
                                if (getVisibility() == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                selector.setVisible(z3, false);
                                acv.m235d(selector, fExactCenterX, fExactCenterY);
                            }
                            selector2 = getSelector();
                            if (selector2 != null && i3 != -1) {
                                acv.m235d(selector2, f, f2);
                            }
                            m14527c(false);
                            refreshDrawableState();
                            if (actionMasked == 1) {
                                performItemClick(childAt, i3, getItemIdAtPosition(i3));
                            }
                            z4 = false;
                            z = true;
                        } else {
                            i3 = iPointToPosition;
                        }
                        z2 = false;
                        if (z2) {
                            selector.setVisible(false, false);
                        }
                        Rect rect3 = this.f36513c;
                        rect3.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        rect3.left -= this.f36514d;
                        rect3.top -= this.f36515e;
                        rect3.right += this.f36516f;
                        rect3.bottom += this.f36517g;
                        int i5 = adg.f162a;
                        zM14403b = C0771kk.m14403b(this);
                        if (childAt.isEnabled() != zM14403b) {
                            C0771kk.m14402a(this, !zM14403b);
                            if (iPointToPosition != -1) {
                                refreshDrawableState();
                            }
                        }
                        if (z2) {
                            Rect rect4 = this.f36513c;
                            float fExactCenterX2 = rect4.exactCenterX();
                            float fExactCenterY2 = rect4.exactCenterY();
                            if (getVisibility() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            selector.setVisible(z3, false);
                            acv.m235d(selector, fExactCenterX2, fExactCenterY2);
                        }
                        selector2 = getSelector();
                        if (selector2 != null) {
                            acv.m235d(selector2, f, f2);
                        }
                        m14527c(false);
                        refreshDrawableState();
                        if (actionMasked == 1) {
                            performItemClick(childAt, i3, getItemIdAtPosition(i3));
                        }
                        z4 = false;
                        z = true;
                    } else {
                        z4 = true;
                    }
                } else {
                    z = false;
                }
                break;
            case 2:
                z = true;
                iFindPointerIndex = motionEvent.findPointerIndex(i);
                if (iFindPointerIndex < 0) {
                    x = (int) motionEvent.getX(iFindPointerIndex);
                    y = (int) motionEvent.getY(iFindPointerIndex);
                    iPointToPosition = pointToPosition(x, y);
                    if (iPointToPosition == -1) {
                        childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                        f = x;
                        f2 = y;
                        this.f36521k = true;
                        C0769ki.m14305a(this, f, f2);
                        if (!isPressed()) {
                            setPressed(true);
                        }
                        layoutChildren();
                        i2 = this.f36518h;
                        if (i2 != -1) {
                            childAt2.setPressed(false);
                        }
                        this.f36518h = iPointToPosition;
                        C0769ki.m14305a(childAt, f - childAt.getLeft(), f2 - childAt.getTop());
                        if (!childAt.isPressed()) {
                            childAt.setPressed(true);
                        }
                        selector = getSelector();
                        if (selector != null) {
                            if (iPointToPosition != -1) {
                                i3 = iPointToPosition;
                                z2 = true;
                            } else {
                                iPointToPosition = -1;
                                i3 = -1;
                            }
                            if (z2) {
                                selector.setVisible(false, false);
                            }
                            Rect rect5 = this.f36513c;
                            rect5.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            rect5.left -= this.f36514d;
                            rect5.top -= this.f36515e;
                            rect5.right += this.f36516f;
                            rect5.bottom += this.f36517g;
                            int i6 = adg.f162a;
                            zM14403b = C0771kk.m14403b(this);
                            if (childAt.isEnabled() != zM14403b) {
                                C0771kk.m14402a(this, !zM14403b);
                                if (iPointToPosition != -1) {
                                    refreshDrawableState();
                                }
                            }
                            if (z2) {
                                Rect rect6 = this.f36513c;
                                float fExactCenterX3 = rect6.exactCenterX();
                                float fExactCenterY3 = rect6.exactCenterY();
                                if (getVisibility() == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                selector.setVisible(z3, false);
                                acv.m235d(selector, fExactCenterX3, fExactCenterY3);
                            }
                            selector2 = getSelector();
                            if (selector2 != null) {
                                acv.m235d(selector2, f, f2);
                            }
                            m14527c(false);
                            refreshDrawableState();
                            if (actionMasked == 1) {
                                performItemClick(childAt, i3, getItemIdAtPosition(i3));
                            }
                            z4 = false;
                            z = true;
                        } else {
                            i3 = iPointToPosition;
                        }
                        z2 = false;
                        if (z2) {
                            selector.setVisible(false, false);
                        }
                        Rect rect7 = this.f36513c;
                        rect7.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                        rect7.left -= this.f36514d;
                        rect7.top -= this.f36515e;
                        rect7.right += this.f36516f;
                        rect7.bottom += this.f36517g;
                        int i7 = adg.f162a;
                        zM14403b = C0771kk.m14403b(this);
                        if (childAt.isEnabled() != zM14403b) {
                            C0771kk.m14402a(this, !zM14403b);
                            if (iPointToPosition != -1) {
                                refreshDrawableState();
                            }
                        }
                        if (z2) {
                            Rect rect8 = this.f36513c;
                            float fExactCenterX4 = rect8.exactCenterX();
                            float fExactCenterY4 = rect8.exactCenterY();
                            if (getVisibility() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            selector.setVisible(z3, false);
                            acv.m235d(selector, fExactCenterX4, fExactCenterY4);
                        }
                        selector2 = getSelector();
                        if (selector2 != null) {
                            acv.m235d(selector2, f, f2);
                        }
                        m14527c(false);
                        refreshDrawableState();
                        if (actionMasked == 1) {
                            performItemClick(childAt, i3, getItemIdAtPosition(i3));
                        }
                        z4 = false;
                        z = true;
                    } else {
                        z4 = true;
                    }
                } else {
                    z = false;
                }
                break;
            case 3:
                z = false;
                break;
            default:
                z4 = false;
                z = true;
                break;
        }
        if (!z || z4) {
            this.f36521k = false;
            setPressed(false);
            drawableStateChanged();
            View childAt3 = getChildAt(this.f36518h - getFirstVisiblePosition());
            if (childAt3 != null) {
                childAt3.setPressed(false);
            }
        }
        if (z) {
            if (this.f36522l == null) {
                this.f36522l = new ahf(this);
            }
            this.f36522l.m664c(true);
            this.f36522l.onTouch(this, motionEvent);
        } else {
            ahf ahfVar = this.f36522l;
            if (ahfVar != null) {
                ahfVar.m664c(false);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final int m14530b(int i, int i2) {
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
        View view = null;
        int i3 = 0;
        int i4 = 0;
        while (i3 < count) {
            int itemViewType = adapter.getItemViewType(i3);
            int i5 = itemViewType != i4 ? itemViewType : i4;
            if (itemViewType != i4) {
                view = null;
            }
            view = adapter.getView(i3, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i3 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
            i3++;
            i4 = i5;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f36513c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f36513c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f36512b != null) {
            return;
        }
        super.drawableStateChanged();
        m14527c(true);
        m14528d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f36520j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f36520j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f36520j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f36520j && this.f36511a) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.f36512b = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10) {
            if (this.f36512b == null) {
                RunnableC0059be runnableC0059be = new RunnableC0059be(this, 13);
                this.f36512b = runnableC0059be;
                ((C0773km) runnableC0059be.f3018a).post(runnableC0059be);
                actionMasked = 10;
            } else {
                actionMasked = 10;
            }
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (C0770kj.f36234d) {
                        try {
                            Method method = C0770kj.f36231a;
                            Integer numValueOf = Integer.valueOf(iPointToPosition);
                            method.invoke(this, numValueOf, childAt, false, -1, -1);
                            C0770kj.f36232b.invoke(this, numValueOf);
                            C0770kj.f36233c.invoke(this, numValueOf);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    }
                }
                m14528d();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f36518h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        RunnableC0059be runnableC0059be = this.f36512b;
        if (runnableC0059be != null) {
            C0773km c0773km = (C0773km) runnableC0059be.f3018a;
            c0773km.f36512b = null;
            c0773km.removeCallbacks(runnableC0059be);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public final void setSelector(Drawable drawable) {
        C0772kl c0772kl = drawable != null ? new C0772kl(drawable) : null;
        this.f36519i = c0772kl;
        super.setSelector(c0772kl);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f36514d = rect.left;
        this.f36515e = rect.top;
        this.f36516f = rect.right;
        this.f36517g = rect.bottom;
    }
}
