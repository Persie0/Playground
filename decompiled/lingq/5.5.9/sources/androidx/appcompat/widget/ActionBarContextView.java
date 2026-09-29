package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0224f;
import androidx.appcompat.view.menu.InterfaceC0229k;
import com.linguist.R;
import java.util.WeakHashMap;
import p058d.C4999a;
import p104f.C5452a;
import p164i.AbstractC6100a;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0295a {

    /* JADX INFO: renamed from: H */
    public View f797H;

    /* JADX INFO: renamed from: I */
    public LinearLayout f798I;

    /* JADX INFO: renamed from: J */
    public TextView f799J;

    /* JADX INFO: renamed from: K */
    public TextView f800K;

    /* JADX INFO: renamed from: L */
    public final int f801L;

    /* JADX INFO: renamed from: M */
    public final int f802M;

    /* JADX INFO: renamed from: N */
    public boolean f803N;

    /* JADX INFO: renamed from: O */
    public final int f804O;

    /* JADX INFO: renamed from: i */
    public CharSequence f805i;

    /* JADX INFO: renamed from: j */
    public CharSequence f806j;

    /* JADX INFO: renamed from: k */
    public View f807k;

    /* JADX INFO: renamed from: l */
    public View f808l;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class ViewOnClickListenerC0232a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC6100a f809a;

        public ViewOnClickListenerC0232a(AbstractC6100a abstractC6100a) {
            this.f809a = abstractC6100a;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f809a.mo11416c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4999a.f32590d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : C5452a.m11672a(context, resourceId);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18680q(this, drawable);
        this.f801L = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f802M = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1122e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f804O = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: f */
    public final void m956f(AbstractC6100a abstractC6100a) {
        View view = this.f807k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f804O, (ViewGroup) this, false);
            this.f807k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f807k);
        }
        View viewFindViewById = this.f807k.findViewById(R.id.action_mode_close_button);
        this.f808l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0232a(abstractC6100a));
        C0224f c0224fMo11418e = abstractC6100a.mo11418e();
        ActionMenuPresenter actionMenuPresenter = this.f1121d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m979b();
            ActionMenuPresenter.C0239a c0239a = actionMenuPresenter.f849P;
            if (c0239a != null && c0239a.m951b()) {
                c0239a.f759j.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f1121d = actionMenuPresenter2;
        actionMenuPresenter2.f841H = true;
        actionMenuPresenter2.f842I = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0224fMo11418e.m918b(this.f1121d, this.f1119b);
        ActionMenuPresenter actionMenuPresenter3 = this.f1121d;
        InterfaceC0229k interfaceC0229k = actionMenuPresenter3.f640h;
        if (interfaceC0229k == null) {
            InterfaceC0229k interfaceC0229k2 = (InterfaceC0229k) actionMenuPresenter3.f636d.inflate(actionMenuPresenter3.f638f, (ViewGroup) this, false);
            actionMenuPresenter3.f640h = interfaceC0229k2;
            interfaceC0229k2.mo237b(actionMenuPresenter3.f635c);
            actionMenuPresenter3.mo896d(true);
        }
        InterfaceC0229k interfaceC0229k3 = actionMenuPresenter3.f640h;
        if (interfaceC0229k != interfaceC0229k3) {
            ((ActionMenuView) interfaceC0229k3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0229k3;
        this.f1120c = actionMenuView;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18680q(actionMenuView, null);
        addView(this.f1120c, layoutParams);
    }

    /* JADX INFO: renamed from: g */
    public final void m957g() {
        if (this.f798I == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f798I = linearLayout;
            this.f799J = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f800K = (TextView) this.f798I.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f801L;
            if (i10 != 0) {
                this.f799J.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f802M;
            if (i11 != 0) {
                this.f800K.setTextAppearance(getContext(), i11);
            }
        }
        this.f799J.setText(this.f805i);
        this.f800K.setText(this.f806j);
        boolean z10 = !TextUtils.isEmpty(this.f805i);
        boolean z11 = !TextUtils.isEmpty(this.f806j);
        int i12 = 0;
        this.f800K.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f798I;
        if (!z10 && !z11) {
            i12 = 8;
        }
        linearLayout2.setVisibility(i12);
        if (this.f798I.getParent() == null) {
            addView(this.f798I);
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

    @Override // androidx.appcompat.widget.AbstractC0295a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0295a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f806j;
    }

    public CharSequence getTitle() {
        return this.f805i;
    }

    /* JADX INFO: renamed from: h */
    public final void m958h() {
        removeAllViews();
        this.f797H = null;
        this.f1120c = null;
        this.f1121d = null;
        View view = this.f808l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1121d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m979b();
            ActionMenuPresenter.C0239a c0239a = this.f1121d.f849P;
            if (c0239a != null && c0239a.m951b()) {
                c0239a.f759j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zM1200a = C0318h1.m1200a(this);
        int paddingRight = zM1200a ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f807k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f807k.getLayoutParams();
            int i14 = zM1200a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zM1200a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = zM1200a ? paddingRight - i14 : paddingRight + i14;
            int iM1076d = AbstractC0295a.m1076d(i16, paddingTop, paddingTop2, this.f807k, zM1200a) + i16;
            paddingRight = zM1200a ? iM1076d - i15 : iM1076d + i15;
        }
        LinearLayout linearLayout = this.f798I;
        if (linearLayout != null && this.f797H == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC0295a.m1076d(paddingRight, paddingTop, paddingTop2, this.f798I, zM1200a);
        }
        View view2 = this.f797H;
        if (view2 != null) {
            AbstractC0295a.m1076d(paddingRight, paddingTop, paddingTop2, view2, zM1200a);
        }
        int paddingLeft = zM1200a ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1120c;
        if (actionMenuView != null) {
            AbstractC0295a.m1076d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !zM1200a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f1122e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f807k;
        if (view != null) {
            int iM1075c = AbstractC0295a.m1075c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f807k.getLayoutParams();
            paddingLeft = iM1075c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1120c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbstractC0295a.m1075c(this.f1120c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f798I;
        if (linearLayout != null && this.f797H == null) {
            if (this.f803N) {
                this.f798I.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f798I.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f798I.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = AbstractC0295a.m1075c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f797H;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f797H.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f1122e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbstractC0295a
    public void setContentHeight(int i10) {
        this.f1122e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f797H;
        if (view2 != null) {
            removeView(view2);
        }
        this.f797H = view;
        if (view != null && (linearLayout = this.f798I) != null) {
            removeView(linearLayout);
            this.f798I = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f806j = charSequence;
        m957g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f805i = charSequence;
        m957g();
        C10029b0.m18659o(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f803N) {
            requestLayout();
        }
        this.f803N = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC0295a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
