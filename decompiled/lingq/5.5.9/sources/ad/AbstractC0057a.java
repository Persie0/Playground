package ad;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.view.menu.InterfaceC0229k;
import androidx.appcompat.widget.C0309e1;
import com.google.android.material.badge.C2947a;
import java.util.WeakHashMap;
import lc.C7298a;
import p093ed.C5397a;
import p153hc.C6031a;
import p177ic.C6308a;
import p254m2.C7472a;
import p329q2.C8488a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10068v;
import p497y2.C10284f;
import p531zc.C10477a;

/* JADX INFO: renamed from: ad.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0057a extends FrameLayout implements InterfaceC0229k.a {

    /* JADX INFO: renamed from: c0 */
    public static final int[] f71c0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: d0 */
    public static final c f72d0 = new c();

    /* JADX INFO: renamed from: e0 */
    public static final d f73e0 = new d();

    /* JADX INFO: renamed from: H */
    public final ImageView f74H;

    /* JADX INFO: renamed from: I */
    public final ViewGroup f75I;

    /* JADX INFO: renamed from: J */
    public final TextView f76J;

    /* JADX INFO: renamed from: K */
    public final TextView f77K;

    /* JADX INFO: renamed from: L */
    public int f78L;

    /* JADX INFO: renamed from: M */
    public C0226h f79M;

    /* JADX INFO: renamed from: N */
    public ColorStateList f80N;

    /* JADX INFO: renamed from: O */
    public Drawable f81O;

    /* JADX INFO: renamed from: P */
    public Drawable f82P;

    /* JADX INFO: renamed from: Q */
    public ValueAnimator f83Q;

    /* JADX INFO: renamed from: R */
    public c f84R;

    /* JADX INFO: renamed from: S */
    public float f85S;

    /* JADX INFO: renamed from: T */
    public boolean f86T;

    /* JADX INFO: renamed from: U */
    public int f87U;

    /* JADX INFO: renamed from: V */
    public int f88V;

    /* JADX INFO: renamed from: W */
    public boolean f89W;

    /* JADX INFO: renamed from: a */
    public boolean f90a;

    /* JADX INFO: renamed from: a0 */
    public int f91a0;

    /* JADX INFO: renamed from: b */
    public ColorStateList f92b;

    /* JADX INFO: renamed from: b0 */
    public C2947a f93b0;

    /* JADX INFO: renamed from: c */
    public Drawable f94c;

    /* JADX INFO: renamed from: d */
    public int f95d;

    /* JADX INFO: renamed from: e */
    public int f96e;

    /* JADX INFO: renamed from: f */
    public float f97f;

    /* JADX INFO: renamed from: g */
    public float f98g;

    /* JADX INFO: renamed from: h */
    public float f99h;

    /* JADX INFO: renamed from: i */
    public int f100i;

    /* JADX INFO: renamed from: j */
    public boolean f101j;

    /* JADX INFO: renamed from: k */
    public final FrameLayout f102k;

    /* JADX INFO: renamed from: l */
    public final View f103l;

    /* JADX INFO: renamed from: ad.a$a */
    public class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0057a f104a;

        public a(C7298a c7298a) {
            this.f104a = c7298a;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            AbstractC0057a abstractC0057a = this.f104a;
            if (abstractC0057a.f74H.getVisibility() == 0) {
                C2947a c2947a = abstractC0057a.f93b0;
                if (!(c2947a != null)) {
                    return;
                }
                Rect rect = new Rect();
                ImageView imageView = abstractC0057a.f74H;
                imageView.getDrawingRect(rect);
                c2947a.setBounds(rect);
                c2947a.m8579h(imageView, null);
            }
        }
    }

    /* JADX INFO: renamed from: ad.a$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f105a;

        public b(int i10) {
            this.f105a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractC0057a.this.m233g(this.f105a);
        }
    }

    /* JADX INFO: renamed from: ad.a$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public float mo234a(float f3, float f10) {
            return 1.0f;
        }
    }

    /* JADX INFO: renamed from: ad.a$d */
    public static class d extends c {
        @Override // ad.AbstractC0057a.c
        /* JADX INFO: renamed from: a */
        public final float mo234a(float f3, float f10) {
            LinearInterpolator linearInterpolator = C6308a.f36523a;
            return (f3 * 0.6f) + 0.4f;
        }
    }

    public AbstractC0057a(Context context) {
        super(context);
        this.f90a = false;
        this.f78L = -1;
        this.f84R = f72d0;
        this.f85S = 0.0f;
        this.f86T = false;
        this.f87U = 0;
        this.f88V = 0;
        this.f89W = false;
        this.f91a0 = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f102k = (FrameLayout) findViewById(com.linguist.R.id.navigation_bar_item_icon_container);
        this.f103l = findViewById(com.linguist.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.linguist.R.id.navigation_bar_item_icon_view);
        this.f74H = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.linguist.R.id.navigation_bar_item_labels_group);
        this.f75I = viewGroup;
        TextView textView = (TextView) findViewById(com.linguist.R.id.navigation_bar_item_small_label_view);
        this.f76J = textView;
        TextView textView2 = (TextView) findViewById(com.linguist.R.id.navigation_bar_item_large_label_view);
        this.f77K = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f95d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f96e = viewGroup.getPaddingBottom();
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18682s(textView, 2);
        C10029b0.d.m18682s(textView2, 2);
        setFocusable(true);
        float textSize = textView.getTextSize();
        float textSize2 = textView2.getTextSize();
        this.f97f = textSize - textSize2;
        this.f98g = (textSize2 * 1.0f) / textSize;
        this.f99h = (textSize * 1.0f) / textSize2;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a((C7298a) this));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static void m226c(TextView textView, int i10) {
        int iRound;
        textView.setTextAppearance(i10);
        Context context = textView.getContext();
        if (i10 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, C6031a.f35646O);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                iRound = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
            }
            if (iRound != 0) {
                textView.setTextSize(0, iRound);
            }
        }
        iRound = 0;
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m227e(float f3, float f10, int i10, TextView textView) {
        textView.setScaleX(f3);
        textView.setScaleY(f10);
        textView.setVisibility(i10);
    }

    /* JADX INFO: renamed from: f */
    public static void m228f(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f102k;
        return frameLayout != null ? frameLayout : this.f74H;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < iIndexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof AbstractC0057a) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        C2947a c2947a = this.f93b0;
        int minimumHeight = c2947a != null ? c2947a.getMinimumHeight() / 2 : 0;
        return this.f74H.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        C2947a c2947a = this.f93b0;
        int minimumWidth = c2947a == null ? 0 : c2947a.getMinimumWidth() - this.f93b0.f14760e.f14721b.f14737M.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f74H.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    /* JADX INFO: renamed from: h */
    public static void m229h(ViewGroup viewGroup, int i10) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m230a() {
        Drawable rippleDrawable = this.f94c;
        ColorStateList colorStateList = this.f92b;
        FrameLayout frameLayout = this.f102k;
        RippleDrawable rippleDrawable2 = null;
        boolean z10 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f86T && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(C5397a.m11561c(this.f92b), null, activeIndicatorDrawable);
                z10 = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(C5397a.m11559a(this.f92b), null, null);
            }
        }
        if (frameLayout != null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18680q(frameLayout, rippleDrawable2);
        }
        WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
        C10029b0.d.m18680q(this, rippleDrawable);
        setDefaultFocusHighlightEnabled(z10);
    }

    /* JADX INFO: renamed from: b */
    public final void m231b(float f3, float f10) {
        View view = this.f103l;
        if (view != null) {
            c cVar = this.f84R;
            cVar.getClass();
            LinearInterpolator linearInterpolator = C6308a.f36523a;
            view.setScaleX((0.6f * f3) + 0.4f);
            view.setScaleY(cVar.mo234a(f3, f10));
            view.setAlpha(C6308a.m12936a(0.0f, 1.0f, f10 == 0.0f ? 0.8f : 0.0f, f10 == 0.0f ? 1.0f : 0.2f, f3));
        }
        this.f85S = f3;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0229k.a
    /* JADX INFO: renamed from: d */
    public final void mo232d(C0226h c0226h) {
        this.f79M = c0226h;
        setCheckable(c0226h.isCheckable());
        setChecked(c0226h.isChecked());
        setEnabled(c0226h.isEnabled());
        setIcon(c0226h.getIcon());
        setTitle(c0226h.f727e);
        setId(c0226h.f723a);
        if (!TextUtils.isEmpty(c0226h.f739q)) {
            setContentDescription(c0226h.f739q);
        }
        C0309e1.m1185a(this, !TextUtils.isEmpty(c0226h.f740r) ? c0226h.f740r : c0226h.f727e);
        setVisibility(c0226h.isVisible() ? 0 : 8);
        this.f90a = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f102k;
        if (frameLayout != null && this.f86T) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: g */
    public final void m233g(int i10) {
        View view = this.f103l;
        if (view == null) {
            return;
        }
        int iMin = Math.min(this.f87U, i10 - (this.f91a0 * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = this.f89W && this.f100i == 2 ? iMin : this.f88V;
        layoutParams.width = iMin;
        view.setLayoutParams(layoutParams);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f103l;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C2947a getBadge() {
        return this.f93b0;
    }

    public int getItemBackgroundResId() {
        return com.linguist.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0229k.a
    public C0226h getItemData() {
        return this.f79M;
    }

    public int getItemDefaultMarginResId() {
        return com.linguist.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f78L;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f75I;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f75I;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        C0226h c0226h = this.f79M;
        if (c0226h != null && c0226h.isCheckable() && this.f79M.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f71c0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2947a c2947a = this.f93b0;
        if (c2947a != null && c2947a.isVisible()) {
            C0226h c0226h = this.f79M;
            CharSequence charSequence = c0226h.f727e;
            if (!TextUtils.isEmpty(c0226h.f739q)) {
                charSequence = this.f79M.f739q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.f93b0.m8574c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C10284f.c.m19275a(0, 1, getItemVisiblePosition(), 1, isSelected()).f51760a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C10284f.a.f51742e.f51755a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.linguist.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new b(i10));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f103l;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        m230a();
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.f86T = z10;
        m230a();
        View view = this.f103l;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.f88V = i10;
        m233g(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.f91a0 = i10;
        m233g(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.f89W = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.f87U = i10;
        m233g(getWidth());
    }

    public void setBadge(C2947a c2947a) {
        C2947a c2947a2 = this.f93b0;
        if (c2947a2 == c2947a) {
            return;
        }
        boolean z10 = true;
        boolean z11 = c2947a2 != null;
        ImageView imageView = this.f74H;
        if (z11 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.f93b0 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C2947a c2947a3 = this.f93b0;
                if (c2947a3 != null) {
                    if (c2947a3.m8575d() != null) {
                        c2947a3.m8575d().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(c2947a3);
                    }
                }
                this.f93b0 = null;
            }
        }
        this.f93b0 = c2947a;
        if (imageView != null) {
            if (c2947a == null) {
                z10 = false;
            }
            if (z10) {
                setClipChildren(false);
                setClipToPadding(false);
                C2947a c2947a4 = this.f93b0;
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                c2947a4.setBounds(rect);
                c2947a4.m8579h(imageView, null);
                if (c2947a4.m8575d() != null) {
                    c2947a4.m8575d().setForeground(c2947a4);
                } else {
                    imageView.getOverlay().add(c2947a4);
                }
            }
        }
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f77K;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.f76J;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f3 = z10 ? 1.0f : 0.0f;
        if (this.f86T && this.f90a) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.g.m18698b(this)) {
                ValueAnimator valueAnimator = this.f83Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f83Q = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f85S, f3);
                this.f83Q = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new C0058b(this, f3));
                this.f83Q.setInterpolator(C10477a.m19429d(getContext(), com.linguist.R.attr.motionEasingEmphasizedInterpolator, C6308a.f36524b));
                this.f83Q.setDuration(C10477a.m19428c(com.linguist.R.attr.motionDurationLong2, getContext(), getResources().getInteger(com.linguist.R.integer.material_motion_duration_long_1)));
                this.f83Q.start();
            } else {
                m231b(f3, f3);
            }
        } else {
            m231b(f3, f3);
        }
        int i10 = this.f100i;
        ViewGroup viewGroup = this.f75I;
        if (i10 != -1) {
            if (i10 == 0) {
                if (z10) {
                    m228f(getIconOrContainer(), this.f95d, 49);
                    m229h(viewGroup, this.f96e);
                    textView.setVisibility(0);
                } else {
                    m228f(getIconOrContainer(), this.f95d, 17);
                    m229h(viewGroup, 0);
                    textView.setVisibility(4);
                }
                textView2.setVisibility(4);
            } else if (i10 == 1) {
                m229h(viewGroup, this.f96e);
                if (z10) {
                    m228f(getIconOrContainer(), (int) (this.f95d + this.f97f), 49);
                    m227e(1.0f, 1.0f, 0, textView);
                    float f10 = this.f98g;
                    m227e(f10, f10, 4, textView2);
                } else {
                    m228f(getIconOrContainer(), this.f95d, 49);
                    float f11 = this.f99h;
                    m227e(f11, f11, 4, textView);
                    m227e(1.0f, 1.0f, 0, textView2);
                }
            } else if (i10 == 2) {
                m228f(getIconOrContainer(), this.f95d, 17);
                textView.setVisibility(8);
                textView2.setVisibility(8);
            }
        } else if (this.f101j) {
            if (z10) {
                m228f(getIconOrContainer(), this.f95d, 49);
                m229h(viewGroup, this.f96e);
                textView.setVisibility(0);
            } else {
                m228f(getIconOrContainer(), this.f95d, 17);
                m229h(viewGroup, 0);
                textView.setVisibility(4);
            }
            textView2.setVisibility(4);
        } else {
            m229h(viewGroup, this.f96e);
            if (z10) {
                m228f(getIconOrContainer(), (int) (this.f95d + this.f97f), 49);
                m227e(1.0f, 1.0f, 0, textView);
                float f12 = this.f98g;
                m227e(f12, f12, 4, textView2);
            } else {
                m228f(getIconOrContainer(), this.f95d, 49);
                float f13 = this.f99h;
                m227e(f13, f13, 4, textView);
                m227e(1.0f, 1.0f, 0, textView2);
            }
        }
        refreshDrawableState();
        setSelected(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f76J.setEnabled(z10);
        this.f77K.setEnabled(z10);
        this.f74H.setEnabled(z10);
        if (!z10) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.k.m18740d(this, null);
        } else {
            PointerIcon pointerIconM18914b = C10068v.m18914b(getContext(), 1002);
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            C10029b0.k.m18740d(this, pointerIconM18914b);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f81O) {
            return;
        }
        this.f81O = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f82P = drawable;
            ColorStateList colorStateList = this.f80N;
            if (colorStateList != null) {
                C8488a.b.m16570h(drawable, colorStateList);
            }
        }
        this.f74H.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        ImageView imageView = this.f74H;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f80N = colorStateList;
        if (this.f79M != null && (drawable = this.f82P) != null) {
            C8488a.b.m16570h(drawable, colorStateList);
            this.f82P.invalidateSelf();
        }
    }

    public void setItemBackground(int i10) {
        Drawable drawableM14849b;
        if (i10 == 0) {
            drawableM14849b = null;
        } else {
            Context context = getContext();
            Object obj = C7472a.f41322a;
            drawableM14849b = C7472a.c.m14849b(context, i10);
        }
        setItemBackground(drawableM14849b);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f94c = drawable;
        m230a();
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f96e != i10) {
            this.f96e = i10;
            C0226h c0226h = this.f79M;
            if (c0226h != null) {
                setChecked(c0226h.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f95d != i10) {
            this.f95d = i10;
            C0226h c0226h = this.f79M;
            if (c0226h != null) {
                setChecked(c0226h.isChecked());
            }
        }
    }

    public void setItemPosition(int i10) {
        this.f78L = i10;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f92b = colorStateList;
        m230a();
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f100i != i10) {
            this.f100i = i10;
            if (this.f89W && i10 == 2) {
                this.f84R = f73e0;
            } else {
                this.f84R = f72d0;
            }
            m233g(getWidth());
            C0226h c0226h = this.f79M;
            if (c0226h != null) {
                setChecked(c0226h.isChecked());
            }
        }
    }

    public void setShifting(boolean z10) {
        if (this.f101j != z10) {
            this.f101j = z10;
            C0226h c0226h = this.f79M;
            if (c0226h != null) {
                setChecked(c0226h.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i10) {
        TextView textView = this.f77K;
        m226c(textView, i10);
        float textSize = this.f76J.getTextSize();
        float textSize2 = textView.getTextSize();
        this.f97f = textSize - textSize2;
        this.f98g = (textSize2 * 1.0f) / textSize;
        this.f99h = (textSize * 1.0f) / textSize2;
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(int i10) {
        TextView textView = this.f76J;
        m226c(textView, i10);
        float textSize = textView.getTextSize();
        float textSize2 = this.f77K.getTextSize();
        this.f97f = textSize - textSize2;
        this.f98g = (textSize2 * 1.0f) / textSize;
        this.f99h = (textSize * 1.0f) / textSize2;
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f76J.setTextColor(colorStateList);
            this.f77K.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f76J.setText(charSequence);
        this.f77K.setText(charSequence);
        C0226h c0226h = this.f79M;
        if (c0226h == null || TextUtils.isEmpty(c0226h.f739q)) {
            setContentDescription(charSequence);
        }
        C0226h c0226h2 = this.f79M;
        if (c0226h2 != null && !TextUtils.isEmpty(c0226h2.f740r)) {
            charSequence = this.f79M.f740r;
        }
        C0309e1.m1185a(this, charSequence);
    }
}
