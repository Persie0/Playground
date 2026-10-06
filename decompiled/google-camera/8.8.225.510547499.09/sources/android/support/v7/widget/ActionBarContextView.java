package android.support.v7.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.AbstractC0199fx;
import p000.AbstractC0248hs;
import p000.C0193fr;
import p000.C0225gw;
import p000.C0259ic;
import p000.C0864nw;
import p000.InterfaceC0241hl;
import p000.ViewOnClickListenerC0250hu;
import p000.afb;
import p000.afq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0248hs {

    /* JADX INFO: renamed from: g */
    public CharSequence f947g;

    /* JADX INFO: renamed from: h */
    public CharSequence f948h;

    /* JADX INFO: renamed from: i */
    public View f949i;

    /* JADX INFO: renamed from: j */
    public boolean f950j;

    /* JADX INFO: renamed from: k */
    private View f951k;

    /* JADX INFO: renamed from: l */
    private View f952l;

    /* JADX INFO: renamed from: m */
    private LinearLayout f953m;

    /* JADX INFO: renamed from: n */
    private TextView f954n;

    /* JADX INFO: renamed from: o */
    private TextView f955o;

    /* JADX INFO: renamed from: p */
    private int f956p;

    /* JADX INFO: renamed from: q */
    private int f957q;

    /* JADX INFO: renamed from: r */
    private int f958r;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: o */
    private final void m1042o() {
        if (this.f953m == null) {
            LayoutInflater.from(getContext()).inflate(C0100R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f953m = linearLayout;
            this.f954n = (TextView) linearLayout.findViewById(C0100R.id.action_bar_title);
            this.f955o = (TextView) this.f953m.findViewById(C0100R.id.action_bar_subtitle);
            if (this.f956p != 0) {
                this.f954n.setTextAppearance(getContext(), this.f956p);
            }
            if (this.f957q != 0) {
                this.f955o.setTextAppearance(getContext(), this.f957q);
            }
        }
        this.f954n.setText(this.f947g);
        this.f955o.setText(this.f948h);
        boolean z = !TextUtils.isEmpty(this.f947g);
        boolean zIsEmpty = TextUtils.isEmpty(this.f948h);
        boolean z2 = !zIsEmpty;
        int i = 8;
        this.f955o.setVisibility(true != zIsEmpty ? 0 : 8);
        LinearLayout linearLayout2 = this.f953m;
        if (z || z2) {
            i = 0;
        }
        linearLayout2.setVisibility(i);
        if (this.f953m.getParent() == null) {
            addView(this.f953m);
        }
    }

    @Override // p000.AbstractC0248hs
    /* JADX INFO: renamed from: c */
    public final void mo1043c(int i) {
        this.f29381e = i;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public final void m1044h(AbstractC0199fx abstractC0199fx) {
        View view = this.f949i;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f958r, (ViewGroup) this, false);
            this.f949i = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f949i);
        }
        View viewFindViewById = this.f949i.findViewById(C0100R.id.action_mode_close_button);
        this.f951k = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0250hu(abstractC0199fx, 0));
        Menu menuMo8643a = abstractC0199fx.mo8643a();
        C0259ic c0259ic = this.f29380d;
        if (c0259ic != null) {
            c0259ic.m11039n();
        }
        this.f29380d = new C0259ic(getContext());
        this.f29380d.m11041p();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        ((C0225gw) menuMo8643a).m9828h(this.f29380d, this.f29378b);
        C0259ic c0259ic2 = this.f29380d;
        InterfaceC0241hl interfaceC0241hl = c0259ic2.f25576f;
        if (c0259ic2.f25576f == null) {
            c0259ic2.f25576f = (InterfaceC0241hl) c0259ic2.f25574d.inflate(C0100R.layout.abc_action_menu_layout, (ViewGroup) this, false);
            c0259ic2.f25576f.mo1036a(c0259ic2.f25573c);
            c0259ic2.mo9491i();
        }
        InterfaceC0241hl interfaceC0241hl2 = c0259ic2.f25576f;
        if (interfaceC0241hl != interfaceC0241hl2) {
            ((ActionMenuView) interfaceC0241hl2).m1078k(c0259ic2);
        }
        this.f29379c = (ActionMenuView) interfaceC0241hl2;
        afb.m432m(this.f29379c, null);
        addView(this.f29379c, layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final void m1045i() {
        removeAllViews();
        this.f952l = null;
        this.f29379c = null;
        this.f29380d = null;
        View view = this.f951k;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1046j(View view) {
        LinearLayout linearLayout;
        View view2 = this.f952l;
        if (view2 != null) {
            removeView(view2);
        }
        this.f952l = view;
        if (view != null && (linearLayout = this.f953m) != null) {
            removeView(linearLayout);
            this.f953m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: k */
    public final void m1047k(CharSequence charSequence) {
        this.f948h = charSequence;
        m1042o();
    }

    /* JADX INFO: renamed from: l */
    public final void m1048l(CharSequence charSequence) {
        this.f947g = charSequence;
        m1042o();
        afq.m548h(this, charSequence);
    }

    /* JADX INFO: renamed from: m */
    public final void m1049m(boolean z) {
        if (z != this.f950j) {
            requestLayout();
        }
        this.f950j = z;
    }

    /* JADX INFO: renamed from: n */
    public final void m1050n() {
        C0259ic c0259ic = this.f29380d;
        if (c0259ic != null) {
            c0259ic.m11038m();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0259ic c0259ic = this.f29380d;
        if (c0259ic != null) {
            c0259ic.m11036k();
            this.f29380d.m11042q();
        }
    }

    @Override // p000.AbstractC0248hs, android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zM17748a = C0864nw.m17748a(this);
        int paddingRight = zM17748a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f949i;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f949i.getLayoutParams();
            int i5 = zM17748a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM17748a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iA = m10676a(paddingRight, i5, zM17748a);
            paddingRight = m10676a(iA + m10680f(this.f949i, iA, paddingTop, paddingTop2, zM17748a), i6, zM17748a);
        }
        LinearLayout linearLayout = this.f953m;
        if (linearLayout != null && this.f952l == null && linearLayout.getVisibility() != 8) {
            paddingRight += m10680f(this.f953m, paddingRight, paddingTop, paddingTop2, zM17748a);
        }
        View view2 = this.f952l;
        if (view2 != null) {
            m10680f(view2, paddingRight, paddingTop, paddingTop2, zM17748a);
        }
        int paddingLeft = zM17748a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f29379c;
        if (actionMenuView != null) {
            m10680f(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM17748a);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f29381e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f949i;
        if (view != null) {
            int iE = m10679e(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f949i.getLayoutParams();
            paddingLeft = iE - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f29379c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m10679e(this.f29379c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f953m;
        if (linearLayout != null && this.f952l == null) {
            if (this.f950j) {
                this.f953m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f953m.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f953m.setVisibility(true != z ? 8 : 0);
            } else {
                paddingLeft = m10679e(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f952l;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            int i4 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            if (layoutParams.height >= 0) {
                iMin = Math.min(layoutParams.height, iMin);
            }
            this.f952l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(iMin, i4));
        }
        if (this.f29381e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            int measuredHeight = getChildAt(i6).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i5) {
                i5 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i5);
    }

    @Override // p000.AbstractC0248hs, android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(context, attributeSet, C0193fr.f23260d, i, 0);
        afb.m432m(this, ambientDelegateM1568D.m1618u(0));
        this.f956p = ambientDelegateM1568D.m1616s(5, 0);
        this.f957q = ambientDelegateM1568D.m1616s(4, 0);
        this.f29381e = ambientDelegateM1568D.m1615r(3, 0);
        this.f958r = ambientDelegateM1568D.m1616s(2, C0100R.layout.abc_action_mode_close_item_material);
        ambientDelegateM1568D.m1622y();
    }
}
