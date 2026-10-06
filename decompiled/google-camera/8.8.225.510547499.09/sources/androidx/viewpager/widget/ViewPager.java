package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;
import p000.RunnableC0852nk;
import p000.afb;
import p000.afh;
import p000.afq;
import p000.ahi;
import p000.ahy;
import p000.atv;
import p000.atw;
import p000.atx;
import p000.aty;
import p000.atz;
import p000.aua;
import p000.aub;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public static final int[] f1636a = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: f */
    private static final Interpolator f1637f = new ahy(2);

    /* JADX INFO: renamed from: A */
    private boolean f1638A;

    /* JADX INFO: renamed from: B */
    private int f1639B;

    /* JADX INFO: renamed from: C */
    private final Runnable f1640C;

    /* JADX INFO: renamed from: D */
    private int f1641D;

    /* JADX INFO: renamed from: b */
    public EdgeEffect f1642b;

    /* JADX INFO: renamed from: c */
    public EdgeEffect f1643c;

    /* JADX INFO: renamed from: d */
    public List f1644d;

    /* JADX INFO: renamed from: e */
    public List f1645e;

    /* JADX INFO: renamed from: g */
    private final ArrayList f1646g;

    /* JADX INFO: renamed from: h */
    private final atx f1647h;

    /* JADX INFO: renamed from: i */
    private final Rect f1648i;

    /* JADX INFO: renamed from: j */
    private Scroller f1649j;

    /* JADX INFO: renamed from: k */
    private final float f1650k;

    /* JADX INFO: renamed from: l */
    private final float f1651l;

    /* JADX INFO: renamed from: m */
    private boolean f1652m;

    /* JADX INFO: renamed from: n */
    private boolean f1653n;

    /* JADX INFO: renamed from: o */
    private boolean f1654o;

    /* JADX INFO: renamed from: p */
    private int f1655p;

    /* JADX INFO: renamed from: q */
    private int f1656q;

    /* JADX INFO: renamed from: r */
    private int f1657r;

    /* JADX INFO: renamed from: s */
    private final boolean f1658s;

    /* JADX INFO: renamed from: t */
    private float f1659t;

    /* JADX INFO: renamed from: u */
    private float f1660u;

    /* JADX INFO: renamed from: v */
    private float f1661v;

    /* JADX INFO: renamed from: w */
    private float f1662w;

    /* JADX INFO: renamed from: x */
    private int f1663x;

    /* JADX INFO: renamed from: y */
    private VelocityTracker f1664y;

    /* JADX INFO: renamed from: z */
    private boolean f1665z;

    public ViewPager(Context context) {
        super(context);
        this.f1646g = new ArrayList();
        this.f1647h = new atx();
        this.f1648i = new Rect();
        this.f1650k = -3.4028235E38f;
        this.f1651l = Float.MAX_VALUE;
        this.f1658s = true;
        this.f1663x = -1;
        this.f1665z = true;
        this.f1640C = new RunnableC0852nk(this, 19);
        this.f1641D = 0;
        m1553e(context);
    }

    /* JADX INFO: renamed from: i */
    private final int m1545i() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX INFO: renamed from: j */
    private final Rect m1546j(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX INFO: renamed from: k */
    private final boolean m1547k(int i) {
        int i2;
        if (this.f1646g.size() == 0) {
            if (this.f1665z) {
                return false;
            }
            this.f1638A = false;
            m1556h(0, 0.0f);
            if (this.f1638A) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        int iM1545i = m1545i();
        float scrollX = iM1545i > 0 ? getScrollX() / iM1545i : 0.0f;
        float f = iM1545i > 0 ? 0.0f / iM1545i : 0.0f;
        atx atxVar = null;
        int i3 = 0;
        boolean z = true;
        int i4 = -1;
        float f2 = 0.0f;
        while (i3 < this.f1646g.size()) {
            atx atxVar2 = (atx) this.f1646g.get(i3);
            if (!z && atxVar2.f2392b != (i2 = i4 + 1)) {
                atx atxVar3 = this.f1647h;
                atxVar3.f2395e = f2 + 0.0f + f;
                atxVar3.f2392b = i2;
                throw null;
            }
            f2 = atxVar2.f2395e;
            float f3 = atxVar2.f2394d;
            float f4 = f2 + 0.0f + f;
            if (!z && scrollX < f2) {
                break;
            }
            if (scrollX < f4 || i3 == this.f1646g.size() - 1) {
                atxVar = atxVar2;
                break;
            }
            i4 = atxVar2.f2392b;
            float f5 = atxVar2.f2394d;
            i3++;
            atxVar = atxVar2;
            z = false;
        }
        float fM1545i = m1545i();
        float f6 = 0.0f / fM1545i;
        int i5 = atxVar.f2392b;
        float f7 = (i / fM1545i) - atxVar.f2395e;
        float f8 = atxVar.f2394d;
        this.f1638A = false;
        m1556h(i5, f7 / (f6 + 0.0f));
        if (this.f1638A) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* JADX INFO: renamed from: l */
    private final void m1548l() {
        for (int i = 0; i < this.f1646g.size(); i++) {
            boolean z = ((atx) this.f1646g.get(i)).f2393c;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1549a(int i) {
        if (this.f1641D == i) {
            return;
        }
        this.f1641D = i;
        List list = this.f1644d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                aua auaVar = (aua) this.f1644d.get(i2);
                if (auaVar != null) {
                    auaVar.mo1399a(i);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3).getVisibility() == 0) {
                    m1554f();
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i).getVisibility() == 0) {
                m1554f();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        ((aty) layoutParams).f2396a |= view.getClass().getAnnotation(atw.class) != null;
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m1550b(boolean z) {
        if (this.f1652m != z) {
            this.f1652m = z;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1551c(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean zRequestFocus = false;
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i != 17 && i != 1 && i != 66) {
            }
        } else if (i == 17) {
            int i2 = m1546j(this.f1648i, viewFindNextFocus).left;
            int i3 = m1546j(this.f1648i, viewFindFocus).left;
            if (viewFindFocus == null || i2 < i3) {
                zRequestFocus = viewFindNextFocus.requestFocus();
            }
        } else if (i == 66) {
            int i4 = m1546j(this.f1648i, viewFindNextFocus).left;
            int i5 = m1546j(this.f1648i, viewFindFocus).left;
            if (viewFindFocus == null || i4 > i5) {
                zRequestFocus = viewFindNextFocus.requestFocus();
            }
        }
        if (zRequestFocus) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zRequestFocus;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof aty) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f1649j.isFinished() || !this.f1649j.computeScrollOffset()) {
            m1548l();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1649j.getCurrX();
        int currY = this.f1649j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m1547k(currX)) {
                this.f1649j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        afb.m426g(this);
    }

    /* JADX INFO: renamed from: d */
    protected final boolean m1552d(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && m1552d(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zM1551c;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                switch (keyEvent.getKeyCode()) {
                    case 21:
                        zM1551c = !keyEvent.hasModifiers(2) ? m1551c(17) : false;
                        break;
                    case 22:
                        zM1551c = !keyEvent.hasModifiers(2) ? m1551c(66) : false;
                        break;
                    case 61:
                        if (!keyEvent.hasNoModifiers()) {
                            zM1551c = !keyEvent.hasModifiers(1) ? false : m1551c(1);
                        } else {
                            zM1551c = m1551c(2);
                        }
                        break;
                    default:
                        zM1551c = false;
                        break;
                }
            } else {
                zM1551c = false;
            }
            if (!zM1551c) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() == 0) {
                m1554f();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zDraw;
        super.draw(canvas);
        if (getOverScrollMode() != 0) {
            this.f1642b.finish();
            this.f1643c.finish();
            return;
        }
        if (this.f1642b.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.f1650k * width);
            this.f1642b.setSize(height, width);
            zDraw = this.f1642b.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.f1643c.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.f1651l + 1.0f)) * width2);
            this.f1643c.setSize(height2, width2);
            zDraw |= this.f1643c.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            afb.m426g(this);
        }
    }

    /* JADX INFO: renamed from: e */
    final void m1553e(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.f1649j = new Scroller(context, f1637f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1657r = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1642b = new EdgeEffect(context);
        this.f1643c = new EdgeEffect(context);
        this.f1655p = (int) (f * 16.0f);
        afq.m547g(this, new atz());
        if (afb.m420a(this) == 0) {
            afb.m434o(this, 1);
        }
        afh.m483n(this, new atv(this));
    }

    /* JADX INFO: renamed from: f */
    final void m1554f() {
        if (this.f1646g.size() <= 0) {
            return;
        }
        Object obj = ((atx) this.f1646g.get(0)).f2391a;
        throw null;
    }

    /* JADX INFO: renamed from: g */
    final atx m1555g() {
        for (int i = 0; i < this.f1646g.size(); i++) {
            atx atxVar = (atx) this.f1646g.get(i);
            if (atxVar.f2392b == 0) {
                return atxVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aty();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aty(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    /* JADX INFO: renamed from: h */
    protected final void m1556h(int i, float f) {
        int width;
        if (this.f1639B > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                aty atyVar = (aty) childAt.getLayoutParams();
                if (atyVar.f2396a) {
                    switch (atyVar.f2397b & 7) {
                        case 1:
                            width = paddingLeft;
                            paddingLeft = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 2:
                        case 4:
                        default:
                            width = paddingLeft;
                            break;
                        case 3:
                            width = childAt.getWidth() + paddingLeft;
                            break;
                        case 5:
                            int measuredWidth = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            width = paddingLeft;
                            paddingLeft = measuredWidth;
                            break;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        List list = this.f1644d;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                aua auaVar = (aua) this.f1644d.get(i3);
                if (auaVar != null) {
                    auaVar.mo1400b(i, f);
                }
            }
        }
        this.f1638A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1665z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.f1640C);
        Scroller scroller = this.f1649j;
        if (scroller != null && !scroller.isFinished()) {
            this.f1649j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f1663x = -1;
            this.f1653n = false;
            this.f1654o = false;
            VelocityTracker velocityTracker = this.f1664y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1664y = null;
            }
            this.f1642b.onRelease();
            this.f1643c.onRelease();
            if (this.f1642b.isFinished()) {
                this.f1643c.isFinished();
            }
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f1661v = x;
            this.f1659t = x;
            float y = motionEvent.getY();
            this.f1662w = y;
            this.f1660u = y;
            this.f1663x = motionEvent.getPointerId(0);
            this.f1654o = false;
            this.f1649j.computeScrollOffset();
            if (ahi.m670a(this.f1642b) == 0.0f && ahi.m670a(this.f1643c) == 0.0f) {
                m1548l();
                this.f1653n = false;
            } else {
                this.f1653n = true;
                m1549a(1);
                if (ahi.m670a(this.f1642b) != 0.0f) {
                    ahi.m671b(this.f1642b, 0.0f, 1.0f - (this.f1660u / getHeight()));
                }
                if (ahi.m670a(this.f1643c) != 0.0f) {
                    ahi.m671b(this.f1643c, 0.0f, this.f1660u / getHeight());
                }
            }
        } else {
            if (this.f1653n) {
                return true;
            }
            if (this.f1654o) {
                return false;
            }
            switch (action) {
                case 2:
                    int i = this.f1663x;
                    if (i != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i);
                        float x2 = motionEvent.getX(iFindPointerIndex);
                        float f2 = x2 - this.f1659t;
                        float fAbs = Math.abs(f2);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y2 - this.f1662w);
                        if (f2 != 0.0f) {
                            float f3 = this.f1659t;
                            if (this.f1658s) {
                                f = y2;
                                if (m1552d(this, false, (int) f2, (int) x2, (int) y2)) {
                                    this.f1659t = x2;
                                    this.f1660u = f;
                                    this.f1654o = true;
                                    return false;
                                }
                            } else if (f3 < this.f1656q && f2 > 0.0f) {
                                f = y2;
                            } else if (f3 <= getWidth() - this.f1656q || f2 >= 0.0f) {
                                f = y2;
                                if (m1552d(this, false, (int) f2, (int) x2, (int) y2)) {
                                    this.f1659t = x2;
                                    this.f1660u = f;
                                    this.f1654o = true;
                                    return false;
                                }
                            } else {
                                f = y2;
                            }
                        } else {
                            f = y2;
                        }
                        float f4 = this.f1657r;
                        if (fAbs > f4 && fAbs * 0.5f > fAbs2) {
                            this.f1653n = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            m1549a(1);
                            this.f1659t = f2 > 0.0f ? this.f1661v + this.f1657r : this.f1661v - this.f1657r;
                            this.f1660u = f;
                            m1550b(true);
                        } else if (fAbs2 > f4) {
                            this.f1654o = true;
                        }
                        if (this.f1653n) {
                            float f5 = this.f1659t - x2;
                            this.f1659t = x2;
                            float height = f / getHeight();
                            float width = f5 / getWidth();
                            float fM671b = (ahi.m670a(this.f1642b) != 0.0f ? -ahi.m671b(this.f1642b, -width, 1.0f - height) : ahi.m670a(this.f1643c) != 0.0f ? ahi.m671b(this.f1643c, width, height) : 0.0f) * getWidth();
                            if (Math.abs(f5 - fM671b) >= 1.0E-4f) {
                                getScrollX();
                                m1545i();
                                atx atxVar = (atx) this.f1646g.get(0);
                                ArrayList arrayList = this.f1646g;
                                atx atxVar2 = (atx) arrayList.get(arrayList.size() - 1);
                                if (atxVar.f2392b != 0) {
                                    float f6 = atxVar.f2395e;
                                }
                                int i2 = atxVar2.f2392b;
                                throw null;
                            }
                            if (fM671b != 0.0f) {
                                afb.m426g(this);
                            }
                        }
                    }
                    break;
                case 6:
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.f1663x) {
                        int i3 = actionIndex == 0 ? 1 : 0;
                        this.f1659t = motionEvent.getX(i3);
                        this.f1663x = motionEvent.getPointerId(i3);
                        VelocityTracker velocityTracker2 = this.f1664y;
                        if (velocityTracker2 != null) {
                            velocityTracker2.clear();
                        }
                    }
                    break;
            }
        }
        if (this.f1664y == null) {
            this.f1664y = VelocityTracker.obtain();
        }
        this.f1664y.addMovement(motionEvent);
        return this.f1653n;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int measuredHeight;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = i4 - i2;
            int i8 = i3 - i;
            if (i5 >= childCount) {
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() != 8 && !((aty) childAt.getLayoutParams()).f2396a) {
                        m1554f();
                    }
                }
                this.f1639B = i6;
                if (this.f1665z) {
                    atx atxVarM1555g = m1555g();
                    int iM1545i = atxVarM1555g != null ? (int) (m1545i() * Math.max(this.f1650k, Math.min(atxVarM1555g.f2395e, this.f1651l))) : 0;
                    m1548l();
                    scrollTo(iM1545i, 0);
                    m1547k(iM1545i);
                }
                this.f1665z = false;
                return;
            }
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                aty atyVar = (aty) childAt2.getLayoutParams();
                if (atyVar.f2396a) {
                    int i10 = atyVar.f2397b;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    switch (i11) {
                        case 1:
                            int iMax = Math.max((i8 - childAt2.getMeasuredWidth()) / 2, paddingLeft);
                            measuredWidth = paddingLeft;
                            paddingLeft = iMax;
                            break;
                        case 2:
                        case 4:
                        default:
                            measuredWidth = paddingLeft;
                            break;
                        case 3:
                            measuredWidth = childAt2.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            int measuredWidth2 = (i8 - paddingRight) - childAt2.getMeasuredWidth();
                            paddingRight += childAt2.getMeasuredWidth();
                            measuredWidth = paddingLeft;
                            paddingLeft = measuredWidth2;
                            break;
                    }
                    switch (i12) {
                        case 16:
                            int iMax2 = Math.max((i7 - childAt2.getMeasuredHeight()) / 2, paddingTop);
                            measuredHeight = paddingTop;
                            paddingTop = iMax2;
                            break;
                        case 48:
                            measuredHeight = childAt2.getMeasuredHeight() + paddingTop;
                            break;
                        case 80:
                            int measuredHeight2 = (i7 - paddingBottom) - childAt2.getMeasuredHeight();
                            paddingBottom += childAt2.getMeasuredHeight();
                            measuredHeight = paddingTop;
                            paddingTop = measuredHeight2;
                            break;
                        default:
                            measuredHeight = paddingTop;
                            break;
                    }
                    int i13 = paddingLeft + scrollX;
                    childAt2.layout(i13, paddingTop, childAt2.getMeasuredWidth() + i13, childAt2.getMeasuredHeight() + paddingTop);
                    i6++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
            i5++;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        aty atyVar;
        aty atyVar2;
        int i3;
        int i4;
        int i5;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f1656q = Math.min(measuredWidth / 10, this.f1655p);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (atyVar2 = (aty) childAt.getLayoutParams()) != null && atyVar2.f2396a) {
                int i8 = atyVar2.f2397b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z = true;
                boolean z2 = i10 == 48 || i10 == 80;
                if (i9 != 3 && i9 != 5) {
                    z = false;
                }
                int i11 = Integer.MIN_VALUE;
                if (z2) {
                    i11 = 1073741824;
                    i3 = Integer.MIN_VALUE;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                if (atyVar2.width == -2) {
                    i4 = paddingLeft;
                } else if (atyVar2.width != -1) {
                    i4 = atyVar2.width;
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                    i11 = 1073741824;
                }
                if (atyVar2.height != -2) {
                    i5 = atyVar2.height != -1 ? atyVar2.height : measuredHeight;
                } else {
                    i5 = measuredHeight;
                    i7 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((atyVar = (aty) childAt2.getLayoutParams()) == null || !atyVar.f2396a)) {
                float f = atyVar.f2398c;
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        int i5 = i & 2;
        int childCount = getChildCount();
        if (i5 != 0) {
            i3 = 1;
            i4 = childCount;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i4) {
            if (getChildAt(i2).getVisibility() == 0) {
                m1554f();
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof aub)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aub aubVar = (aub) parcelable;
        super.onRestoreInstanceState(aubVar.f394d);
        int i = aubVar.f2402a;
        Parcelable parcelable2 = aubVar.f2403b;
        ClassLoader classLoader = aubVar.f2404e;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        aub aubVar = new aub(super.onSaveInstanceState());
        aubVar.f2402a = 0;
        return aubVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 <= 0 || this.f1646g.isEmpty()) {
                atx atxVarM1555g = m1555g();
                int iMin = (int) ((atxVarM1555g != null ? Math.min(atxVarM1555g.f2395e, this.f1651l) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
                if (iMin != getScrollX()) {
                    m1548l();
                    scrollTo(iMin, getScrollY());
                    return;
                }
                return;
            }
            if (this.f1649j.isFinished()) {
                scrollTo((int) ((getScrollX() / ((i3 - getPaddingLeft()) - getPaddingRight())) * ((i - getPaddingLeft()) - getPaddingRight())), getScrollY());
            } else {
                Scroller scroller = this.f1649j;
                m1545i();
                scroller.setFinalX(0);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1646g = new ArrayList();
        this.f1647h = new atx();
        this.f1648i = new Rect();
        this.f1650k = -3.4028235E38f;
        this.f1651l = Float.MAX_VALUE;
        this.f1658s = true;
        this.f1663x = -1;
        this.f1665z = true;
        this.f1640C = new RunnableC0852nk(this, 19);
        this.f1641D = 0;
        m1553e(context);
    }
}
