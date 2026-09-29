package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R$attr;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class nm2 extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f52943a;

    /* JADX INFO: renamed from: b */
    public int f52944b;

    /* JADX INFO: renamed from: c */
    public int f52945c;

    /* JADX INFO: renamed from: d */
    public int f52946d;

    /* JADX INFO: renamed from: e */
    public int f52947e;

    /* JADX INFO: renamed from: f */
    public int f52948f;

    /* JADX INFO: renamed from: g */
    public lm2 f52949g;

    /* JADX INFO: renamed from: h */
    public boolean f52950h;

    /* JADX INFO: renamed from: i */
    public final boolean f52951i;

    /* JADX INFO: renamed from: j */
    public boolean f52952j;

    /* JADX INFO: renamed from: k */
    public ig5 f52953k;

    /* JADX INFO: renamed from: l */
    public RunnableC3468pp f52954l;

    public nm2(Context context, boolean z) {
        super(context, null, R$attr.dropDownListViewStyle);
        this.f52943a = new Rect();
        this.f52944b = 0;
        this.f52945c = 0;
        this.f52946d = 0;
        this.f52947e = 0;
        this.f52951i = z;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m17494a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x017a  */
    /* JADX WARN: Code duplicated, block: B:90:0x017c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0180  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    /* JADX INFO: renamed from: b */
    public final boolean m17495b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM15335a;
        View childAt;
        View childAt2;
        ig5 ig5Var;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.f52952j = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f52948f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            ig5Var = this.f52953k;
            if (z) {
                if (ig5Var == null) {
                    this.f52953k = new ig5(this);
                }
                ig5 ig5Var2 = this.f52953k;
                boolean z3 = ig5Var2.f44075K;
                ig5Var2.f44075K = true;
                ig5Var2.onTouch(this, motionEvent);
            } else if (ig5Var != null) {
                if (ig5Var.f44075K) {
                    ig5Var.m13898d();
                }
                ig5Var.f44075K = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f52952j = true;
                im2.m14015a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f52948f;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f52948f = iPointToPosition;
                im2.m14015a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f52943a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f52944b;
                rect.top -= this.f52945c;
                rect.right += this.f52946d;
                rect.bottom += this.f52947e;
                if (Build.VERSION.SDK_INT >= 33) {
                    zM15335a = km2.m15335a(this);
                } else {
                    Field field = mm2.f51512a;
                    if (field != null) {
                        try {
                            zM15335a = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zM15335a = false;
                        }
                    } else {
                        zM15335a = false;
                    }
                }
                if (childAt3.isEnabled() != zM15335a) {
                    boolean z5 = !zM15335a;
                    if (Build.VERSION.SDK_INT >= 33) {
                        km2.m15336b(this, z5);
                    } else {
                        Field field2 = mm2.f51512a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                lm2 lm2Var = this.f52949g;
                if (lm2Var != null) {
                    lm2Var.f49831b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.f52952j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f52948f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f52952j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f52948f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        ig5Var = this.f52953k;
        if (z) {
            if (ig5Var == null) {
                this.f52953k = new ig5(this);
            }
            ig5 ig5Var3 = this.f52953k;
            boolean z6 = ig5Var3.f44075K;
            ig5Var3.f44075K = true;
            ig5Var3.onTouch(this, motionEvent);
        } else if (ig5Var != null) {
            if (ig5Var.f44075K) {
                ig5Var.m13898d();
            }
            ig5Var.f44075K = false;
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f52943a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f52954l != null) {
            return;
        }
        super.drawableStateChanged();
        lm2 lm2Var = this.f52949g;
        if (lm2Var != null) {
            lm2Var.f49831b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f52952j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f52951i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f52951i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f52951i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f52951i && this.f52950h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f52954l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f52954l == null) {
            RunnableC3468pp runnableC3468pp = new RunnableC3468pp(this, 5);
            this.f52954l = runnableC3468pp;
            post(runnableC3468pp);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !jm2.f45822d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        jm2.f45819a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        jm2.f45820b.invoke(this, Integer.valueOf(iPointToPosition));
                        jm2.f45821c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f52952j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f52948f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC3468pp runnableC3468pp = this.f52954l;
        if (runnableC3468pp != null) {
            nm2 nm2Var = (nm2) runnableC3468pp.f56618b;
            nm2Var.f52954l = null;
            nm2Var.removeCallbacks(runnableC3468pp);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f52950h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        lm2 lm2Var = null;
        if (drawable != null) {
            lm2 lm2Var2 = new lm2();
            Drawable drawable2 = lm2Var2.f49830a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            lm2Var2.f49830a = drawable;
            drawable.setCallback(lm2Var2);
            lm2Var2.f49831b = true;
            lm2Var = lm2Var2;
        }
        this.f52949g = lm2Var;
        super.setSelector(lm2Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f52944b = rect.left;
        this.f52945c = rect.top;
        this.f52946d = rect.right;
        this.f52947e = rect.bottom;
    }
}
