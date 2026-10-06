package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmd extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f41022a;

    /* JADX INFO: renamed from: b */
    public ImageView f41023b;

    /* JADX INFO: renamed from: c */
    public final Drawable f41024c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ TabLayout f41025d;

    /* JADX INFO: renamed from: e */
    private mmb f41026e;

    /* JADX INFO: renamed from: f */
    private int f41027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmd(TabLayout tabLayout, Context context) {
        GradientDrawable gradientDrawable;
        super(context);
        this.f41025d = tabLayout;
        this.f41027f = 2;
        int i = tabLayout.f8208o;
        if (i != 0) {
            Drawable drawableM8752a = C0194fs.m8752a(context, i);
            this.f41024c = drawableM8752a;
            if (drawableM8752a != null && drawableM8752a.isStateful()) {
                drawableM8752a.setState(getDrawableState());
            }
        } else {
            this.f41024c = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        Drawable rippleDrawable = gradientDrawable2;
        if (tabLayout.f8204k != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateList = tabLayout.f8204k;
            int[] iArr = mkq.f40863a;
            int iM16489a = mkq.m16489a(colorStateList, mkq.f40865c);
            int[] iArr2 = mkq.f40864b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{mkq.f40866d, iArr2, StateSet.NOTHING}, new int[]{iM16489a, mkq.m16489a(colorStateList, iArr2), mkq.m16489a(colorStateList, mkq.f40863a)});
            boolean z = tabLayout.f8217x;
            if (true == z) {
                gradientDrawable = gradientDrawable2;
                gradientDrawable = null;
            }
            rippleDrawable = new RippleDrawable(colorStateList2, gradientDrawable, true != z ? gradientDrawable3 : null);
        }
        afb.m432m(this, rippleDrawable);
        tabLayout.invalidate();
        afc.m449j(this, tabLayout.f8196c, tabLayout.f8197d, tabLayout.f8198e, tabLayout.f8199f);
        setGravity(17);
        setOrientation(!tabLayout.f8214u ? 1 : 0);
        setClickable(true);
        afj.m504d(this, aey.m406b(getContext(), 1002));
    }

    /* JADX INFO: renamed from: d */
    private static final void m16619d(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new hdf(view, 8));
    }

    /* JADX INFO: renamed from: a */
    public final void m16620a(mmb mmbVar) {
        if (mmbVar != this.f41026e) {
            this.f41026e = mmbVar;
            m16621b();
        }
    }

    /* JADX INFO: renamed from: b */
    final void m16621b() {
        m16622c();
        mmb mmbVar = this.f41026e;
        boolean z = false;
        if (mmbVar != null) {
            TabLayout tabLayout = mmbVar.f41016g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int iM4856a = tabLayout.m4856a();
            if (iM4856a != -1 && iM4856a == mmbVar.f41013d) {
                z = true;
            }
        }
        setSelected(z);
    }

    /* JADX INFO: renamed from: c */
    public final void m16622c() {
        boolean z;
        int i;
        mmb mmbVar = this.f41026e;
        if (this.f41023b == null) {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C0100R.layout.design_layout_tab_icon, (ViewGroup) this, false);
            this.f41023b = imageView;
            addView(imageView, 0);
        }
        if (this.f41022a == null) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0100R.layout.design_layout_tab_text, (ViewGroup) this, false);
            this.f41022a = textView;
            addView(textView);
            this.f41027f = ahq.m685a(this.f41022a);
        }
        this.f41022a.setTextAppearance(this.f41025d.f8200g);
        if (!isSelected() || (i = this.f41025d.f8202i) == -1) {
            this.f41022a.setTextAppearance(this.f41025d.f8201h);
        } else {
            this.f41022a.setTextAppearance(i);
        }
        ColorStateList colorStateList = this.f41025d.f8203j;
        if (colorStateList != null) {
            this.f41022a.setTextColor(colorStateList);
        }
        TextView textView2 = this.f41022a;
        ImageView imageView2 = this.f41023b;
        mmb mmbVar2 = this.f41026e;
        CharSequence charSequence = mmbVar2 != null ? mmbVar2.f41011b : null;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setImageDrawable(null);
        }
        boolean z2 = !TextUtils.isEmpty(charSequence);
        if (textView2 != null) {
            if (z2) {
                int i2 = this.f41026e.f41015f;
                z = true;
            } else {
                z = false;
            }
            textView2.setText(true != z2 ? null : charSequence);
            textView2.setVisibility(true != z ? 8 : 0);
            if (z2) {
                setVisibility(0);
            }
        } else {
            z = false;
        }
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            int iM15399G = (z && imageView2.getVisibility() == 0) ? (int) lij.m15399G(getContext(), 8) : 0;
            if (this.f41025d.f8214u) {
                if (iM15399G != aeo.m356b(marginLayoutParams)) {
                    aeo.m360f(marginLayoutParams, iM15399G);
                    marginLayoutParams.bottomMargin = 0;
                    imageView2.setLayoutParams(marginLayoutParams);
                    imageView2.requestLayout();
                }
            } else if (iM15399G != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iM15399G;
                aeo.m360f(marginLayoutParams, 0);
                imageView2.setLayoutParams(marginLayoutParams);
                imageView2.requestLayout();
            }
        }
        mmb mmbVar3 = this.f41026e;
        CharSequence charSequence2 = mmbVar3 != null ? mmbVar3.f41012c : null;
        if (true != z2) {
            charSequence = charSequence2;
        }
        C0861nt.m17652a(this, charSequence);
        m16619d(this.f41023b);
        m16619d(this.f41022a);
        if (mmbVar == null || TextUtils.isEmpty(mmbVar.f41012c)) {
            return;
        }
        setContentDescription(mmbVar.f41012c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f41024c;
        if (drawable != null && drawable.isStateful() && this.f41024c.setState(drawableState)) {
            invalidate();
            this.f41025d.invalidate();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        agt agtVarM622a = agt.m622a(accessibilityNodeInfo);
        agtVarM622a.m634l(bkn.m2552z(0, 1, this.f41026e.f41013d, 1, isSelected()));
        if (isSelected()) {
            agtVarM622a.m632j(false);
            agtVarM622a.m642t(agr.f329e);
        }
        ags.m621a(agtVarM622a.f355a).putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(C0100R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.f41025d.f8209p;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f41022a != null) {
            float f = this.f41025d.f8206m;
            int i4 = this.f41027f;
            ImageView imageView = this.f41023b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f41022a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.f41025d.f8207n;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.f41022a.getTextSize();
            int lineCount = this.f41022a.getLineCount();
            int iM685a = ahq.m685a(this.f41022a);
            if (f != textSize || (iM685a >= 0 && i4 != iM685a)) {
                if (this.f41025d.f8213t != 1 || f <= textSize || lineCount != 1 || ((layout = this.f41022a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    this.f41022a.setTextSize(0, f);
                    this.f41022a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f41026e == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.f41026e.m16616a();
        return true;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.f41022a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f41023b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }
}
