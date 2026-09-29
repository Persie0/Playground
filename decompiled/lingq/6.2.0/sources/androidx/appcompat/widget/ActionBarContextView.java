package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import p000.AbstractC0799b6;
import p000.C3386nv;
import p000.C3391o;
import p000.C3636u5;
import p000.ViewOnClickListenerC3135j5;
import p000.bna;
import p000.dta;
import p000.hw5;
import p000.ix5;
import p000.xua;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: H */
    public View f1056H;

    /* JADX INFO: renamed from: I */
    public LinearLayout f1057I;

    /* JADX INFO: renamed from: J */
    public TextView f1058J;

    /* JADX INFO: renamed from: K */
    public TextView f1059K;

    /* JADX INFO: renamed from: L */
    public final int f1060L;

    /* JADX INFO: renamed from: M */
    public final int f1061M;

    /* JADX INFO: renamed from: N */
    public boolean f1062N;

    /* JADX INFO: renamed from: O */
    public final int f1063O;

    /* JADX INFO: renamed from: a */
    public final C3391o f1064a;

    /* JADX INFO: renamed from: b */
    public final Context f1065b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f1066c;

    /* JADX INFO: renamed from: d */
    public C0035b f1067d;

    /* JADX INFO: renamed from: e */
    public int f1068e;

    /* JADX INFO: renamed from: f */
    public xua f1069f;

    /* JADX INFO: renamed from: g */
    public boolean f1070g;

    /* JADX INFO: renamed from: h */
    public boolean f1071h;

    /* JADX INFO: renamed from: i */
    public CharSequence f1072i;

    /* JADX INFO: renamed from: j */
    public CharSequence f1073j;

    /* JADX INFO: renamed from: k */
    public View f1074k;

    /* JADX INFO: renamed from: l */
    public View f1075l;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        this.f1064a = new C3391o(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R$attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1065b = context;
        } else {
            this.f1065b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionMode, i, 0);
        int i2 = R$styleable.ActionMode_background;
        setBackground((!typedArrayObtainStyledAttributes.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i2) : bna.m3932U(context, resourceId));
        this.f1060L = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ActionMode_titleTextStyle, 0);
        this.f1061M = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ActionMode_subtitleTextStyle, 0);
        this.f1068e = typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.ActionMode_height, 0);
        this.f1063O = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ActionMode_closeItemLayout, R$layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public static int m651f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: g */
    public static int m652g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: c */
    public final void m653c(AbstractC0799b6 abstractC0799b6) {
        View view = this.f1074k;
        int i = 0;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f1063O, (ViewGroup) this, false);
            this.f1074k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f1074k);
        }
        View viewFindViewById = this.f1074k.findViewById(R$id.action_mode_close_button);
        this.f1075l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC3135j5(abstractC0799b6, i));
        hw5 hw5VarMo3329c = abstractC0799b6.mo3329c();
        C0035b c0035b = this.f1067d;
        if (c0035b != null) {
            c0035b.m706f();
            C3636u5 c3636u5 = c0035b.f1209P;
            if (c3636u5 != null) {
                c3636u5.m24176a();
            }
        }
        C0035b c0035b2 = new C0035b(getContext());
        this.f1067d = c0035b2;
        c0035b2.f1201H = true;
        c0035b2.f1202I = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        hw5VarMo3329c.m13519b(this.f1067d, this.f1065b);
        C0035b c0035b3 = this.f1067d;
        ix5 ix5Var = c0035b3.f1221h;
        if (ix5Var == null) {
            ix5 ix5Var2 = (ix5) c0035b3.f1217d.inflate(c0035b3.f1219f, (ViewGroup) this, false);
            c0035b3.f1221h = ix5Var2;
            ix5Var2.mo648b(c0035b3.f1216c);
            c0035b3.mo703c(true);
        }
        ix5 ix5Var3 = c0035b3.f1221h;
        if (ix5Var != ix5Var3) {
            ((ActionMenuView) ix5Var3).setPresenter(c0035b3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) ix5Var3;
        this.f1066c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1066c, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final void m654d() {
        if (this.f1057I == null) {
            LayoutInflater.from(getContext()).inflate(R$layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1057I = linearLayout;
            this.f1058J = (TextView) linearLayout.findViewById(R$id.action_bar_title);
            this.f1059K = (TextView) this.f1057I.findViewById(R$id.action_bar_subtitle);
            int i = this.f1060L;
            if (i != 0) {
                this.f1058J.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1061M;
            if (i2 != 0) {
                this.f1059K.setTextAppearance(getContext(), i2);
            }
        }
        this.f1058J.setText(this.f1072i);
        this.f1059K.setText(this.f1073j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1072i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1073j);
        this.f1059K.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f1057I.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f1057I.getParent() == null) {
            addView(this.f1057I);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m655e() {
        removeAllViews();
        this.f1056H = null;
        this.f1066c = null;
        this.f1067d = null;
        View view = this.f1075l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f1069f != null ? this.f1064a.f53484b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1068e;
    }

    public CharSequence getSubtitle() {
        return this.f1073j;
    }

    public CharSequence getTitle() {
        return this.f1072i;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            xua xuaVar = this.f1069f;
            if (xuaVar != null) {
                xuaVar.m24704b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final xua m657i(int i, long j) {
        xua xuaVar = this.f1069f;
        if (xuaVar != null) {
            xuaVar.m24704b();
        }
        C3391o c3391o = this.f1064a;
        if (i != 0) {
            xua xuaVarM10630a = dta.m10630a(this);
            xuaVarM10630a.m24703a(0.0f);
            xuaVarM10630a.m24705c(j);
            c3391o.f53485c.f1069f = xuaVarM10630a;
            c3391o.f53484b = i;
            xuaVarM10630a.m24706d(c3391o);
            return xuaVarM10630a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        xua xuaVarM10630a2 = dta.m10630a(this);
        xuaVarM10630a2.m24703a(1.0f);
        xuaVarM10630a2.m24705c(j);
        c3391o.f53485c.f1069f = xuaVarM10630a2;
        c3391o.f53484b = i;
        xuaVarM10630a2.m24706d(c3391o);
        return xuaVarM10630a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.ActionBar, R$attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0035b c0035b = this.f1067d;
        if (c0035b != null) {
            Configuration configuration2 = c0035b.f1215b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            c0035b.f1205L = i;
            hw5 hw5Var = c0035b.f1216c;
            if (hw5Var != null) {
                hw5Var.m13533p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0035b c0035b = this.f1067d;
        if (c0035b != null) {
            c0035b.m706f();
            C3636u5 c3636u5 = this.f1067d.f1209P;
            if (c3636u5 != null) {
                c3636u5.m24176a();
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1071h = false;
        }
        if (!this.f1071h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1071h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1071h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1074k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1074k.getLayoutParams();
            int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z2 ? paddingRight - i5 : paddingRight + i5;
            int iM652g = m652g(this.f1074k, i7, paddingTop, paddingTop2, z2) + i7;
            paddingRight = z2 ? iM652g - i6 : iM652g + i6;
        }
        LinearLayout linearLayout = this.f1057I;
        if (linearLayout != null && this.f1056H == null && linearLayout.getVisibility() != 8) {
            paddingRight += m652g(this.f1057I, paddingRight, paddingTop, paddingTop2, z2);
        }
        View view2 = this.f1056H;
        if (view2 != null) {
            m652g(view2, paddingRight, paddingTop, paddingTop2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1066c;
        if (actionMenuView != null) {
            m652g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            C3386nv.m17633t(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            C3386nv.m17633t(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f1068e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f1074k;
        if (view != null) {
            int iM651f = m651f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1074k.getLayoutParams();
            paddingLeft = iM651f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1066c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m651f(this.f1066c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1057I;
        if (linearLayout != null && this.f1056H == null) {
            if (this.f1062N) {
                this.f1057I.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1057I.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f1057I.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m651f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f1056H;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f1056H.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f1068e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1070g = false;
        }
        if (!this.f1070g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1070g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1070g = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f1068e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1056H;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1056H = view;
        if (view != null && (linearLayout = this.f1057I) != null) {
            removeView(linearLayout);
            this.f1057I = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1073j = charSequence;
        m654d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1072i = charSequence;
        m654d();
        dta.m10641l(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1062N) {
            requestLayout();
        }
        this.f1062N = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
