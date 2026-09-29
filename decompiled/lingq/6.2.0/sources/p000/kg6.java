package p000;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$integer;
import com.google.android.material.R$string;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.BaselineLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class kg6 extends FrameLayout implements ng6 {

    /* JADX INFO: renamed from: E0 */
    public static final int[] f47174E0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: F0 */
    public static final gr7 f47175F0;

    /* JADX INFO: renamed from: G0 */
    public static final jg6 f47176G0;

    /* JADX INFO: renamed from: A0 */
    public boolean f47177A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f47178B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f47179C0;

    /* JADX INFO: renamed from: D0 */
    public Rect f47180D0;

    /* JADX INFO: renamed from: H */
    public float f47181H;

    /* JADX INFO: renamed from: I */
    public int f47182I;

    /* JADX INFO: renamed from: J */
    public boolean f47183J;

    /* JADX INFO: renamed from: K */
    public final LinearLayout f47184K;

    /* JADX INFO: renamed from: L */
    public final LinearLayout f47185L;

    /* JADX INFO: renamed from: M */
    public final View f47186M;

    /* JADX INFO: renamed from: N */
    public final FrameLayout f47187N;

    /* JADX INFO: renamed from: O */
    public final ImageView f47188O;

    /* JADX INFO: renamed from: P */
    public final BaselineLayout f47189P;

    /* JADX INFO: renamed from: Q */
    public final TextView f47190Q;

    /* JADX INFO: renamed from: R */
    public final TextView f47191R;

    /* JADX INFO: renamed from: S */
    public final BaselineLayout f47192S;

    /* JADX INFO: renamed from: T */
    public final TextView f47193T;

    /* JADX INFO: renamed from: U */
    public final TextView f47194U;

    /* JADX INFO: renamed from: V */
    public BaselineLayout f47195V;

    /* JADX INFO: renamed from: W */
    public int f47196W;

    /* JADX INFO: renamed from: a */
    public boolean f47197a;

    /* JADX INFO: renamed from: a0 */
    public int f47198a0;

    /* JADX INFO: renamed from: b */
    public ColorStateList f47199b;

    /* JADX INFO: renamed from: b0 */
    public int f47200b0;

    /* JADX INFO: renamed from: c */
    public Drawable f47201c;

    /* JADX INFO: renamed from: c0 */
    public int f47202c0;

    /* JADX INFO: renamed from: d */
    public int f47203d;

    /* JADX INFO: renamed from: d0 */
    public int f47204d0;

    /* JADX INFO: renamed from: e */
    public int f47205e;

    /* JADX INFO: renamed from: e0 */
    public ColorStateList f47206e0;

    /* JADX INFO: renamed from: f */
    public int f47207f;

    /* JADX INFO: renamed from: f0 */
    public boolean f47208f0;

    /* JADX INFO: renamed from: g */
    public int f47209g;

    /* JADX INFO: renamed from: g0 */
    public mw5 f47210g0;

    /* JADX INFO: renamed from: h */
    public float f47211h;

    /* JADX INFO: renamed from: h0 */
    public ColorStateList f47212h0;

    /* JADX INFO: renamed from: i */
    public float f47213i;

    /* JADX INFO: renamed from: i0 */
    public Drawable f47214i0;

    /* JADX INFO: renamed from: j */
    public float f47215j;

    /* JADX INFO: renamed from: j0 */
    public Drawable f47216j0;

    /* JADX INFO: renamed from: k */
    public float f47217k;

    /* JADX INFO: renamed from: k0 */
    public ValueAnimator f47218k0;

    /* JADX INFO: renamed from: l */
    public float f47219l;

    /* JADX INFO: renamed from: l0 */
    public gr7 f47220l0;

    /* JADX INFO: renamed from: m0 */
    public float f47221m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f47222n0;

    /* JADX INFO: renamed from: o0 */
    public int f47223o0;

    /* JADX INFO: renamed from: p0 */
    public int f47224p0;

    /* JADX INFO: renamed from: q0 */
    public int f47225q0;

    /* JADX INFO: renamed from: r0 */
    public int f47226r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f47227s0;

    /* JADX INFO: renamed from: t0 */
    public int f47228t0;

    /* JADX INFO: renamed from: u0 */
    public int f47229u0;

    /* JADX INFO: renamed from: v0 */
    public x70 f47230v0;

    /* JADX INFO: renamed from: w0 */
    public int f47231w0;

    /* JADX INFO: renamed from: x0 */
    public int f47232x0;

    /* JADX INFO: renamed from: y0 */
    public int f47233y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f47234z0;

    static {
        int i = 13;
        f47175F0 = new gr7(i);
        f47176G0 = new jg6(i);
    }

    public kg6(Context context) {
        super(context);
        this.f47197a = false;
        this.f47196W = -1;
        this.f47198a0 = 0;
        this.f47200b0 = 0;
        this.f47202c0 = 0;
        this.f47204d0 = 0;
        this.f47208f0 = false;
        this.f47220l0 = f47175F0;
        this.f47221m0 = 0.0f;
        this.f47222n0 = false;
        this.f47223o0 = 0;
        this.f47224p0 = 0;
        this.f47225q0 = -2;
        this.f47226r0 = 0;
        this.f47227s0 = false;
        this.f47228t0 = 0;
        this.f47229u0 = 0;
        this.f47232x0 = 0;
        this.f47233y0 = 49;
        this.f47234z0 = false;
        this.f47177A0 = false;
        this.f47178B0 = false;
        this.f47179C0 = false;
        this.f47180D0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f47184K = (LinearLayout) findViewById(R$id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.navigation_bar_item_inner_content_container);
        this.f47185L = linearLayout;
        this.f47186M = findViewById(R$id.navigation_bar_item_active_indicator_view);
        this.f47187N = (FrameLayout) findViewById(R$id.navigation_bar_item_icon_container);
        this.f47188O = (ImageView) findViewById(R$id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(R$id.navigation_bar_item_labels_group);
        this.f47189P = baselineLayout;
        TextView textView = (TextView) findViewById(R$id.navigation_bar_item_small_label_view);
        this.f47190Q = textView;
        TextView textView2 = (TextView) findViewById(R$id.navigation_bar_item_large_label_view);
        this.f47191R = textView2;
        float dimension = getResources().getDimension(R$dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(R$dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext());
        this.f47192S = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.f47192S.setDuplicateParentStateEnabled(true);
        this.f47192S.setMeasurePaddingFromBaseline(this.f47178B0);
        TextView textView3 = new TextView(getContext());
        this.f47193T = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.f47193T;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f47193T.setDuplicateParentStateEnabled(true);
        this.f47193T.setIncludeFontPadding(false);
        this.f47193T.setGravity(16);
        this.f47193T.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.f47194U = textView5;
        textView5.setMaxLines(1);
        this.f47194U.setEllipsize(truncateAt);
        this.f47194U.setDuplicateParentStateEnabled(true);
        this.f47194U.setVisibility(4);
        this.f47194U.setIncludeFontPadding(false);
        this.f47194U.setGravity(16);
        this.f47194U.setTextSize(dimension2);
        this.f47192S.addView(this.f47193T);
        this.f47192S.addView(this.f47194U);
        this.f47195V = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f47203d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f47205e = baselineLayout.getPaddingBottom();
        this.f47207f = 0;
        this.f47209g = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.f47193T.setImportantForAccessibility(2);
        this.f47194U.setImportantForAccessibility(2);
        setFocusable(true);
        m15178a();
        this.f47226r0 = getResources().getDimensionPixelSize(R$dimen.m3_navigation_item_expanded_active_indicator_height_default);
        final cg0 cg0Var = (cg0) this;
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hg6
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                boolean z;
                x70 x70Var;
                cg0 cg0Var2 = cg0Var;
                View view2 = cg0Var2.f47186M;
                ImageView imageView = cg0Var2.f47188O;
                if (imageView.getVisibility() == 0 && (x70Var = cg0Var2.f47230v0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    x70Var.setBounds(rect);
                    x70Var.m24332i(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cg0Var2.f47185L.getLayoutParams();
                int i9 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i10 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z2 = true;
                if (cg0Var2.f47231w0 == 1 && cg0Var2.f47225q0 == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (cg0Var2.f47225q0 != -2 || view2.getMeasuredWidth() == i9) {
                        z = false;
                    } else {
                        layoutParams2.width = Math.max(i9, Math.min(cg0Var2.f47223o0, cg0Var2.getMeasuredWidth() - (cg0Var2.f47228t0 * 2)));
                        z = true;
                    }
                    if (view2.getMeasuredHeight() < i10) {
                        layoutParams2.height = i10;
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        view2.setLayoutParams(layoutParams2);
                    }
                }
            }
        });
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof kg6) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        x70 x70Var = this.f47230v0;
        int minimumWidth = x70Var == null ? 0 : x70Var.getMinimumWidth() - this.f47230v0.f67857e.f9687b.f12623R.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f47187N.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f47188O.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    /* JADX INFO: renamed from: i */
    public static void m15177i(View view, int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    /* JADX INFO: renamed from: a */
    public final void m15178a() {
        float textSize = this.f47190Q.getTextSize();
        float textSize2 = this.f47191R.getTextSize();
        this.f47211h = textSize - textSize2;
        this.f47213i = (textSize2 * 1.0f) / textSize;
        this.f47215j = (textSize * 1.0f) / textSize2;
        float textSize3 = this.f47193T.getTextSize();
        float textSize4 = this.f47194U.getTextSize();
        this.f47217k = textSize3 - textSize4;
        this.f47219l = (textSize4 * 1.0f) / textSize3;
        this.f47181H = (textSize3 * 1.0f) / textSize4;
    }

    /* JADX INFO: renamed from: b */
    public final void m15179b() {
        Drawable rippleDrawable = this.f47201c;
        Drawable drawable = null;
        drawable = null;
        drawable = null;
        drawable = null;
        boolean z = true;
        if (this.f47199b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f47222n0 && activeIndicatorDrawable != null) {
                RippleDrawable rippleDrawable2 = new RippleDrawable(do7.m10516C(this.f47199b), null, activeIndicatorDrawable);
                FocusRingDrawable.m6147f(getContext(), rippleDrawable2, activeIndicatorDrawable instanceof fs5 ? (fs5) activeIndicatorDrawable : null);
                drawable = rippleDrawable2;
                z = false;
            } else if (rippleDrawable == null) {
                ColorStateList colorStateList = this.f47199b;
                int[] iArr = do7.f35959h;
                int iM10539o = do7.m10539o(colorStateList, do7.f35958g);
                int[] iArr2 = do7.f35957f;
                rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iM10539o, do7.m10539o(colorStateList, iArr2), do7.m10539o(colorStateList, do7.f35956e)}), null, null);
                Context context = getContext();
                ColorDrawable colorDrawable = FocusRingDrawable.f12977K;
                if (xwc.m24749V(context.getTheme(), R$attr.focusRingsEnabled, false)) {
                    rippleDrawable = new FocusRingDrawable(context, rippleDrawable);
                }
            }
        }
        FrameLayout frameLayout = this.f47187N;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(drawable);
        setBackground(rippleDrawable);
        setDefaultFocusHighlightEnabled(z);
    }

    @Override // p000.hx5
    /* JADX INFO: renamed from: c */
    public final void mo643c(mw5 mw5Var) {
        this.f47210g0 = mw5Var;
        setCheckable(mw5Var.isCheckable());
        setChecked(mw5Var.isChecked());
        setEnabled(mw5Var.isEnabled());
        setIcon(mw5Var.getIcon());
        setTitle(mw5Var.f51946e);
        setId(mw5Var.f51942a);
        if (!TextUtils.isEmpty(mw5Var.f51958q)) {
            setContentDescription(mw5Var.f51958q);
        }
        a6a.m135a(this, !TextUtils.isEmpty(mw5Var.f51959r) ? mw5Var.f51959r : mw5Var.f51946e);
        m15188m();
        this.f47197a = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m15180d(float f, float f2) {
        gr7 gr7Var = this.f47220l0;
        gr7Var.getClass();
        float fM4878a = AbstractC0853cn.m4878a(0.4f, 1.0f, f);
        View view = this.f47186M;
        view.setScaleX(fM4878a);
        view.setScaleY(gr7Var.mo12854a(f));
        view.setAlpha(AbstractC0853cn.m4879b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        this.f47221m0 = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f47222n0) {
            this.f47187N.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public final void m15181e() {
        int i = this.f47188O.getLayoutParams().width > 0 ? this.f47209g : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f47192S.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15182f(TextView textView, TextView textView2, float f, float f2) {
        m15177i(this.f47184K, this.f47231w0 == 0 ? (int) (this.f47203d + f2) : 0, 0, this.f47233y0);
        int i = this.f47231w0;
        m15177i(this.f47185L, i == 0 ? 0 : this.f47180D0.top, i == 0 ? 0 : this.f47180D0.bottom, i == 0 ? 17 : 8388627);
        int i2 = this.f47205e;
        BaselineLayout baselineLayout = this.f47189P;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i2);
        this.f47195V.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f);
        textView2.setScaleY(f);
        textView2.setVisibility(4);
    }

    /* JADX INFO: renamed from: g */
    public final void m15183g() {
        int i = this.f47203d;
        m15177i(this.f47184K, i, i, this.f47231w0 == 0 ? 17 : this.f47233y0);
        m15177i(this.f47185L, 0, 0, 17);
        BaselineLayout baselineLayout = this.f47189P;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.f47195V.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.f47186M.getBackground();
    }

    public x70 getBadge() {
        return this.f47230v0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.f47192S;
    }

    public int getItemBackgroundResId() {
        return R$drawable.mtrl_navigation_bar_item_background;
    }

    @Override // p000.hx5
    public mw5 getItemData() {
        return this.f47210g0;
    }

    public int getItemDefaultMarginResId() {
        return R$dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f47196W;
    }

    public BaselineLayout getLabelGroup() {
        return this.f47189P;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.f47184K;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.f47231w0 == 1) {
            LinearLayout linearLayout = this.f47185L;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.f47189P;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: h */
    public final void m15184h(TextView textView, int i) {
        int iRound;
        if (this.f47179C0) {
            textView.setTextAppearance(i);
            return;
        }
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(R$styleable.TextAppearance_android_textSize, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                int complexUnit = typedValue.getComplexUnit();
                int i2 = typedValue.data;
                iRound = complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i2) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i2, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m15185j(View view) {
        if (this.f47230v0 != null) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                x70 x70Var = this.f47230v0;
                if (x70Var != null) {
                    if (x70Var.m24327d() != null) {
                        x70Var.m24327d().setForeground(null);
                    } else {
                        view.getOverlay().remove(x70Var);
                    }
                }
            }
            this.f47230v0 = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m15186k(int i) {
        if (i > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.f47223o0, i - (this.f47228t0 * 2));
            int iMax = this.f47224p0;
            if (this.f47231w0 == 1) {
                int measuredWidth = i - (this.f47229u0 * 2);
                int i2 = this.f47225q0;
                if (i2 != -1) {
                    measuredWidth = i2 == -2 ? this.f47184K.getMeasuredWidth() : Math.min(i2, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.f47226r0, this.f47185L.getMeasuredHeight());
            }
            View view = this.f47186M;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f47227s0 && this.f47182I == 2) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m15187l(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        m15184h(textView, i);
        m15178a();
        textView.setMinimumHeight(pb1.m19016D(textView.getContext(), i));
        ColorStateList colorStateList = this.f47206e0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.f47191R;
        textView2.setTypeface(textView2.getTypeface(), this.f47208f0 ? 1 : 0);
        TextView textView3 = this.f47194U;
        textView3.setTypeface(textView3.getTypeface(), this.f47208f0 ? 1 : 0);
    }

    /* JADX INFO: renamed from: m */
    public final void m15188m() {
        mw5 mw5Var = this.f47210g0;
        if (mw5Var != null) {
            setVisibility((!mw5Var.isVisible() || (!this.f47234z0 && this.f47177A0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        mw5 mw5Var = this.f47210g0;
        if (mw5Var != null && mw5Var.isCheckable() && this.f47210g0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f47174E0);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x70 x70Var = this.f47230v0;
        if (x70Var != null && x70Var.isVisible()) {
            mw5 mw5Var = this.f47210g0;
            CharSequence charSequence = mw5Var.f51946e;
            if (!TextUtils.isEmpty(mw5Var.f51958q)) {
                charSequence = this.f47210g0.f51958q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            x70 x70Var2 = this.f47230v0;
            c80 c80Var = x70Var2.f67857e;
            Object quantityString = null;
            if (x70Var2.isVisible()) {
                boolean zM4399a = c80Var.m4399a();
                BadgeState$State badgeState$State = c80Var.f9687b;
                if (zM4399a) {
                    quantityString = badgeState$State.f12615J;
                    if (quantityString == null) {
                        quantityString = x70Var2.f67857e.f9687b.f12641j;
                    }
                } else if (!x70Var2.m24330g()) {
                    quantityString = badgeState$State.f12616K;
                } else if (badgeState$State.f12617L != 0 && (context = (Context) x70Var2.f67853a.get()) != null) {
                    if (x70Var2.f67860h != -2) {
                        int iM24328e = x70Var2.m24328e();
                        int i = x70Var2.f67860h;
                        if (iM24328e <= i) {
                            quantityString = context.getResources().getQuantityString(badgeState$State.f12617L, x70Var2.m24328e(), Integer.valueOf(x70Var2.m24328e()));
                        } else {
                            quantityString = context.getString(badgeState$State.f12618M, Integer.valueOf(i));
                        }
                    } else {
                        quantityString = context.getResources().getQuantityString(badgeState$State.f12617L, x70Var2.m24328e(), Integer.valueOf(x70Var2.m24328e()));
                    }
                }
            }
            sb.append(quantityString);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) m58.m16638l(isSelected(), 0, 1, getItemVisiblePosition(), 1).f50618b);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C3671v3.f64755e.f64769a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R$string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new nq2(this, i));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.f47186M.setBackground(drawable);
        m15179b();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.f47222n0 = z;
        m15179b();
        this.f47186M.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.f47226r0 = i;
        m15186k(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i) {
        this.f47229u0 = i;
        if (this.f47231w0 == 1) {
            setPadding(i, 0, i, 0);
        }
        m15186k(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.f47180D0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.f47225q0 = i;
        m15186k(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.f47224p0 = i;
        m15186k(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f47207f != i) {
            this.f47207f = i;
            ((LinearLayout.LayoutParams) this.f47189P.getLayoutParams()).topMargin = i;
            BaselineLayout baselineLayout = this.f47192S;
            if (baselineLayout.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f47228t0 = i;
        m15186k(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f47227s0 = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f47223o0 = i;
        m15186k(getWidth());
    }

    public void setBadge(x70 x70Var) {
        x70 x70Var2 = this.f47230v0;
        if (x70Var2 == x70Var) {
            return;
        }
        ImageView imageView = this.f47188O;
        if (x70Var2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            m15185j(imageView);
        }
        this.f47230v0 = x70Var;
        int i = this.f47232x0;
        c80 c80Var = x70Var.f67857e;
        if (c80Var.f9697l != i) {
            c80Var.f9697l = i;
            x70Var.m24333j();
        }
        if (imageView == null || this.f47230v0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        x70 x70Var3 = this.f47230v0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        x70Var3.setBounds(rect);
        x70Var3.m24332i(imageView, null);
        if (x70Var3.m24327d() != null) {
            x70Var3.m24327d().setForeground(x70Var3);
        } else {
            imageView.getOverlay().add(x70Var3);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.f47191R;
        setLabelPivots(textView);
        TextView textView2 = this.f47190Q;
        setLabelPivots(textView2);
        TextView textView3 = this.f47194U;
        setLabelPivots(textView3);
        TextView textView4 = this.f47193T;
        setLabelPivots(textView4);
        float f = z ? 1.0f : 0.0f;
        if (this.f47222n0 && this.f47197a && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.f47218k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f47218k0 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f47221m0, f);
            this.f47218k0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ig6(this, f));
            this.f47218k0.setInterpolator(r46.m20365H(getContext(), R$attr.motionEasingEmphasizedInterpolator, AbstractC0853cn.f10297b));
            this.f47218k0.setDuration(r46.m20364G(getContext(), R$attr.motionDurationLong2, getResources().getInteger(R$integer.material_motion_duration_long_1)));
            this.f47218k0.start();
        } else {
            m15180d(f, f);
        }
        float f2 = this.f47211h;
        float f3 = this.f47213i;
        float f4 = this.f47215j;
        if (this.f47231w0 == 1) {
            f2 = this.f47217k;
            f3 = this.f47219l;
            f4 = this.f47181H;
            textView = textView3;
            textView2 = textView4;
        }
        int i = this.f47182I;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m15183g();
                    }
                } else if (z) {
                    m15182f(textView, textView2, f3, f2);
                } else {
                    m15182f(textView2, textView, f4, 0.0f);
                }
            } else if (z) {
                m15182f(textView, textView2, f3, 0.0f);
            } else {
                m15183g();
            }
        } else if (this.f47183J) {
            if (z) {
                m15182f(textView, textView2, f3, 0.0f);
            } else {
                m15183g();
            }
        } else if (z) {
            m15182f(textView, textView2, f3, f2);
        } else {
            m15182f(textView2, textView, f4, 0.0f);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f47190Q.setEnabled(z);
        this.f47191R.setEnabled(z);
        this.f47193T.setEnabled(z);
        this.f47194U.setEnabled(z);
        this.f47188O.setEnabled(z);
    }

    @Override // p000.ng6
    public void setExpanded(boolean z) {
        this.f47234z0 = z;
        m15188m();
    }

    public void setHorizontalTextAppearanceActive(int i) {
        this.f47202c0 = i;
        if (i == 0) {
            i = this.f47198a0;
        }
        m15187l(this.f47194U, i);
    }

    public void setHorizontalTextAppearanceInactive(int i) {
        this.f47204d0 = i;
        if (i == 0) {
            i = this.f47200b0;
        }
        TextView textView = this.f47193T;
        if (textView == null) {
            return;
        }
        m15184h(textView, i);
        m15178a();
        textView.setMinimumHeight(pb1.m19016D(textView.getContext(), i));
        ColorStateList colorStateList = this.f47206e0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f47214i0) {
            return;
        }
        this.f47214i0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f47216j0 = drawable;
            ColorStateList colorStateList = this.f47212h0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f47188O.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.f47209g != i) {
            this.f47209g = i;
            m15181e();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f47188O;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        m15181e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f47212h0 = colorStateList;
        if (this.f47210g0 == null || (drawable = this.f47216j0) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f47216j0.invalidateSelf();
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f47201c = drawable;
        m15179b();
    }

    public void setItemGravity(int i) {
        this.f47233y0 = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.f47231w0 != i) {
            this.f47231w0 = i;
            this.f47232x0 = 0;
            BaselineLayout baselineLayout = this.f47189P;
            this.f47195V = baselineLayout;
            BaselineLayout baselineLayout2 = this.f47192S;
            LinearLayout linearLayout = this.f47185L;
            int i8 = 8;
            if (i == 1) {
                if (baselineLayout2.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(baselineLayout2, layoutParams);
                    m15181e();
                }
                Rect rect = this.f47180D0;
                int i9 = rect.left;
                int i10 = rect.right;
                int i11 = rect.top;
                i2 = rect.bottom;
                this.f47232x0 = 1;
                int i12 = this.f47229u0;
                this.f47195V = baselineLayout2;
                i6 = i11;
                i5 = i10;
                i4 = i9;
                i3 = i12;
                i7 = 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 8;
                i8 = 0;
            }
            baselineLayout.setVisibility(i8);
            baselineLayout2.setVisibility(i7);
            ((FrameLayout.LayoutParams) this.f47184K.getLayoutParams()).gravity = this.f47233y0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i5;
            layoutParams2.topMargin = i6;
            layoutParams2.bottomMargin = i2;
            setPadding(i3, 0, i3, 0);
            m15186k(getWidth());
            m15179b();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.f47205e != i) {
            this.f47205e = i;
            mw5 mw5Var = this.f47210g0;
            if (mw5Var != null) {
                setChecked(mw5Var.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f47203d != i) {
            this.f47203d = i;
            mw5 mw5Var = this.f47210g0;
            if (mw5Var != null) {
                setChecked(mw5Var.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.f47196W = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f47199b = colorStateList;
        m15179b();
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.f47179C0 = z;
        setTextAppearanceActive(this.f47198a0);
        setTextAppearanceInactive(this.f47200b0);
        setHorizontalTextAppearanceActive(this.f47202c0);
        setHorizontalTextAppearanceInactive(this.f47204d0);
    }

    public void setLabelMaxLines(int i) {
        TextView textView = this.f47190Q;
        textView.setMaxLines(i);
        TextView textView2 = this.f47191R;
        textView2.setMaxLines(i);
        this.f47193T.setMaxLines(i);
        this.f47194U.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f47182I != i) {
            this.f47182I = i;
            if (this.f47227s0 && i == 2) {
                this.f47220l0 = f47176G0;
            } else {
                this.f47220l0 = f47175F0;
            }
            m15186k(getWidth());
            mw5 mw5Var = this.f47210g0;
            if (mw5Var != null) {
                setChecked(mw5Var.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.f47178B0 = z;
        this.f47189P.setMeasurePaddingFromBaseline(z);
        this.f47190Q.setIncludeFontPadding(z);
        this.f47191R.setIncludeFontPadding(z);
        this.f47192S.setMeasurePaddingFromBaseline(z);
        this.f47193T.setIncludeFontPadding(z);
        this.f47194U.setIncludeFontPadding(z);
        requestLayout();
    }

    @Override // p000.ng6
    public void setOnlyShowWhenExpanded(boolean z) {
        this.f47177A0 = z;
        m15188m();
    }

    public void setShifting(boolean z) {
        if (this.f47183J != z) {
            this.f47183J = z;
            mw5 mw5Var = this.f47210g0;
            if (mw5Var != null) {
                setChecked(mw5Var.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        this.f47198a0 = i;
        m15187l(this.f47191R, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.f47208f0 = z;
        setTextAppearanceActive(this.f47198a0);
        setHorizontalTextAppearanceActive(this.f47202c0);
        TextView textView = this.f47191R;
        textView.setTypeface(textView.getTypeface(), this.f47208f0 ? 1 : 0);
        TextView textView2 = this.f47194U;
        textView2.setTypeface(textView2.getTypeface(), this.f47208f0 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        this.f47200b0 = i;
        TextView textView = this.f47190Q;
        if (textView == null) {
            return;
        }
        m15184h(textView, i);
        m15178a();
        textView.setMinimumHeight(pb1.m19016D(textView.getContext(), i));
        ColorStateList colorStateList = this.f47206e0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f47206e0 = colorStateList;
        if (colorStateList != null) {
            this.f47190Q.setTextColor(colorStateList);
            this.f47191R.setTextColor(colorStateList);
            this.f47193T.setTextColor(colorStateList);
            this.f47194U.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f47190Q.setText(charSequence);
        this.f47191R.setText(charSequence);
        this.f47193T.setText(charSequence);
        this.f47194U.setText(charSequence);
        mw5 mw5Var = this.f47210g0;
        if (mw5Var == null || TextUtils.isEmpty(mw5Var.f51958q)) {
            setContentDescription(charSequence);
        }
        mw5 mw5Var2 = this.f47210g0;
        if (mw5Var2 != null && !TextUtils.isEmpty(mw5Var2.f51959r)) {
            charSequence = this.f47210g0.f51959r;
        }
        a6a.m135a(this, charSequence);
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }
}
