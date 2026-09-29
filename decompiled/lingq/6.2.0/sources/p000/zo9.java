package p000;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.core.R$id;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zo9 extends CompoundButton {

    /* JADX INFO: renamed from: p0 */
    public static final r90 f71863p0 = new r90(Float.class, "thumbPos", 12);

    /* JADX INFO: renamed from: q0 */
    public static final int[] f71864q0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: H */
    public int f71865H;

    /* JADX INFO: renamed from: I */
    public boolean f71866I;

    /* JADX INFO: renamed from: J */
    public CharSequence f71867J;

    /* JADX INFO: renamed from: K */
    public CharSequence f71868K;

    /* JADX INFO: renamed from: L */
    public CharSequence f71869L;

    /* JADX INFO: renamed from: M */
    public CharSequence f71870M;

    /* JADX INFO: renamed from: N */
    public boolean f71871N;

    /* JADX INFO: renamed from: O */
    public int f71872O;

    /* JADX INFO: renamed from: P */
    public final int f71873P;

    /* JADX INFO: renamed from: Q */
    public float f71874Q;

    /* JADX INFO: renamed from: R */
    public float f71875R;

    /* JADX INFO: renamed from: S */
    public final VelocityTracker f71876S;

    /* JADX INFO: renamed from: T */
    public final int f71877T;

    /* JADX INFO: renamed from: U */
    public float f71878U;

    /* JADX INFO: renamed from: V */
    public int f71879V;

    /* JADX INFO: renamed from: W */
    public int f71880W;

    /* JADX INFO: renamed from: a */
    public Drawable f71881a;

    /* JADX INFO: renamed from: a0 */
    public int f71882a0;

    /* JADX INFO: renamed from: b */
    public ColorStateList f71883b;

    /* JADX INFO: renamed from: b0 */
    public int f71884b0;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f71885c;

    /* JADX INFO: renamed from: c0 */
    public int f71886c0;

    /* JADX INFO: renamed from: d */
    public boolean f71887d;

    /* JADX INFO: renamed from: d0 */
    public int f71888d0;

    /* JADX INFO: renamed from: e */
    public boolean f71889e;

    /* JADX INFO: renamed from: e0 */
    public int f71890e0;

    /* JADX INFO: renamed from: f */
    public Drawable f71891f;

    /* JADX INFO: renamed from: f0 */
    public boolean f71892f0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f71893g;

    /* JADX INFO: renamed from: g0 */
    public final TextPaint f71894g0;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f71895h;

    /* JADX INFO: renamed from: h0 */
    public final ColorStateList f71896h0;

    /* JADX INFO: renamed from: i */
    public boolean f71897i;

    /* JADX INFO: renamed from: i0 */
    public StaticLayout f71898i0;

    /* JADX INFO: renamed from: j */
    public boolean f71899j;

    /* JADX INFO: renamed from: j0 */
    public StaticLayout f71900j0;

    /* JADX INFO: renamed from: k */
    public int f71901k;

    /* JADX INFO: renamed from: k0 */
    public final C3793ye f71902k0;

    /* JADX INFO: renamed from: l */
    public int f71903l;

    /* JADX INFO: renamed from: l0 */
    public ObjectAnimator f71904l0;

    /* JADX INFO: renamed from: m0 */
    public C2973eq f71905m0;

    /* JADX INFO: renamed from: n0 */
    public yo9 f71906n0;

    /* JADX INFO: renamed from: o0 */
    public final Rect f71907o0;

    public zo9(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, i);
        this.f71883b = null;
        this.f71885c = null;
        this.f71887d = false;
        this.f71889e = false;
        this.f71893g = null;
        this.f71895h = null;
        this.f71897i = false;
        this.f71899j = false;
        this.f71876S = VelocityTracker.obtain();
        this.f71892f0 = true;
        this.f71907o0 = new Rect();
        oz9.m18842a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f71894g0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, context, attributeSet, R$styleable.SwitchCompat);
        TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
        int[] iArr = R$styleable.SwitchCompat;
        WeakHashMap weakHashMap = dta.f36217a;
        ata.m3035b(this, context, iArr, attributeSet, typedArray, i, 0);
        Drawable drawableM21568j = sq5VarM21551w.m21568j(R$styleable.SwitchCompat_android_thumb);
        this.f71881a = drawableM21568j;
        if (drawableM21568j != null) {
            drawableM21568j.setCallback(this);
        }
        Drawable drawableM21568j2 = sq5VarM21551w.m21568j(R$styleable.SwitchCompat_track);
        this.f71891f = drawableM21568j2;
        if (drawableM21568j2 != null) {
            drawableM21568j2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(R$styleable.SwitchCompat_android_textOn));
        setTextOffInternal(typedArray.getText(R$styleable.SwitchCompat_android_textOff));
        this.f71871N = typedArray.getBoolean(R$styleable.SwitchCompat_showText, true);
        this.f71901k = typedArray.getDimensionPixelSize(R$styleable.SwitchCompat_thumbTextPadding, 0);
        this.f71903l = typedArray.getDimensionPixelSize(R$styleable.SwitchCompat_switchMinWidth, 0);
        this.f71865H = typedArray.getDimensionPixelSize(R$styleable.SwitchCompat_switchPadding, 0);
        this.f71866I = typedArray.getBoolean(R$styleable.SwitchCompat_splitTrack, false);
        ColorStateList colorStateListM21567i = sq5VarM21551w.m21567i(R$styleable.SwitchCompat_thumbTint);
        if (colorStateListM21567i != null) {
            this.f71883b = colorStateListM21567i;
            this.f71887d = true;
        }
        PorterDuff.Mode modeM24048c = wl2.m24048c(typedArray.getInt(R$styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.f71885c != modeM24048c) {
            this.f71885c = modeM24048c;
            this.f71889e = true;
        }
        if (this.f71887d || this.f71889e) {
            m25726a();
        }
        ColorStateList colorStateListM21567i2 = sq5VarM21551w.m21567i(R$styleable.SwitchCompat_trackTint);
        if (colorStateListM21567i2 != null) {
            this.f71893g = colorStateListM21567i2;
            this.f71897i = true;
        }
        PorterDuff.Mode modeM24048c2 = wl2.m24048c(typedArray.getInt(R$styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.f71895h != modeM24048c2) {
            this.f71895h = modeM24048c2;
            this.f71899j = true;
        }
        if (this.f71897i || this.f71899j) {
            m25727b();
        }
        int resourceId2 = typedArray.getResourceId(R$styleable.SwitchCompat_switchTextAppearance, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, R$styleable.TextAppearance);
            int i2 = R$styleable.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0)) == 0 || (colorStateList = do7.m10540p(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(i2) : colorStateList;
            if (colorStateList != null) {
                this.f71896h0 = colorStateList;
            } else {
                this.f71896h0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, -1);
            int i4 = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, -1);
            if (i3 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i3 != 2) {
                typeface = i3 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i4 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i5 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i4;
                textPaint.setFakeBoldText((i5 & 1) != 0);
                textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false)) {
                Context context2 = getContext();
                C3793ye c3793ye = new C3793ye();
                c3793ye.f69703a = context2.getResources().getConfiguration().locale;
                this.f71902k0 = c3793ye;
            } else {
                this.f71902k0 = null;
            }
            setTextOnInternal(this.f71867J);
            setTextOffInternal(this.f71869L);
            typedArrayObtainStyledAttributes.recycle();
        }
        new C2937dr(this).m10598f(attributeSet, i);
        sq5VarM21551w.m21582y();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f71873P = viewConfiguration.getScaledTouchSlop();
        this.f71877T = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m11316b(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C2973eq getEmojiTextViewHelper() {
        if (this.f71905m0 == null) {
            this.f71905m0 = new C2973eq(this);
        }
        return this.f71905m0;
    }

    private boolean getTargetCheckedState() {
        return this.f71878U > 0.5f;
    }

    private int getThumbOffset() {
        int layoutDirection = getLayoutDirection();
        float f = this.f71878U;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f71891f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f71907o0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f71881a;
        Rect rectM24047b = drawable2 != null ? wl2.m24047b(drawable2) : wl2.f66996c;
        return ((((this.f71879V - this.f71882a0) - rect.left) - rect.right) - rectM24047b.left) - rectM24047b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f71869L = charSequence;
        TransformationMethod transformationMethodMo3261d0 = ((b34) getEmojiTextViewHelper().f37699b.f57974a).mo3261d0(this.f71902k0);
        if (transformationMethodMo3261d0 != null) {
            charSequence = transformationMethodMo3261d0.getTransformation(charSequence, this);
        }
        this.f71870M = charSequence;
        this.f71900j0 = null;
        if (this.f71871N) {
            m25729d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f71867J = charSequence;
        TransformationMethod transformationMethodMo3261d0 = ((b34) getEmojiTextViewHelper().f37699b.f57974a).mo3261d0(this.f71902k0);
        if (transformationMethodMo3261d0 != null) {
            charSequence = transformationMethodMo3261d0.getTransformation(charSequence, this);
        }
        this.f71868K = charSequence;
        this.f71898i0 = null;
        if (this.f71871N) {
            m25729d();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m25726a() {
        Drawable drawable = this.f71881a;
        if (drawable != null) {
            if (this.f71887d || this.f71889e) {
                Drawable drawableMutate = drawable.mutate();
                this.f71881a = drawableMutate;
                if (this.f71887d) {
                    drawableMutate.setTintList(this.f71883b);
                }
                if (this.f71889e) {
                    this.f71881a.setTintMode(this.f71885c);
                }
                if (this.f71881a.isStateful()) {
                    this.f71881a.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m25727b() {
        Drawable drawable = this.f71891f;
        if (drawable != null) {
            if (this.f71897i || this.f71899j) {
                Drawable drawableMutate = drawable.mutate();
                this.f71891f = drawableMutate;
                if (this.f71897i) {
                    drawableMutate.setTintList(this.f71893g);
                }
                if (this.f71899j) {
                    this.f71891f.setTintMode(this.f71895h);
                }
                if (this.f71891f.isStateful()) {
                    this.f71891f.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m25728c() {
        setTextOnInternal(this.f71867J);
        setTextOffInternal(this.f71869L);
        requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m25729d() {
        if (this.f71906n0 == null && ((b34) this.f71905m0.f37699b.f57974a).mo3263u() && pq2.m19449d()) {
            pq2 pq2VarM19448a = pq2.m19448a();
            int iM19451c = pq2VarM19448a.m19451c();
            if (iM19451c == 3 || iM19451c == 0) {
                yo9 yo9Var = new yo9(this);
                this.f71906n0 = yo9Var;
                pq2VarM19448a.m19455h(yo9Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.f71884b0;
        int i4 = this.f71886c0;
        int i5 = this.f71888d0;
        int i6 = this.f71890e0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f71881a;
        Rect rectM24047b = drawable != null ? wl2.m24047b(drawable) : wl2.f66996c;
        Drawable drawable2 = this.f71891f;
        Rect rect = this.f71907o0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectM24047b != null) {
                int i8 = rectM24047b.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectM24047b.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectM24047b.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectM24047b.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f71891f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f71891f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f71881a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f71882a0 + rect.right;
            this.f71881a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f71881a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f71891f;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f71881a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f71891f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f71879V;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f71865H : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f71879V;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f71865H : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public boolean getShowText() {
        return this.f71871N;
    }

    public boolean getSplitTrack() {
        return this.f71866I;
    }

    public int getSwitchMinWidth() {
        return this.f71903l;
    }

    public int getSwitchPadding() {
        return this.f71865H;
    }

    public CharSequence getTextOff() {
        return this.f71869L;
    }

    public CharSequence getTextOn() {
        return this.f71867J;
    }

    public Drawable getThumbDrawable() {
        return this.f71881a;
    }

    public final float getThumbPosition() {
        return this.f71878U;
    }

    public int getThumbTextPadding() {
        return this.f71901k;
    }

    public ColorStateList getThumbTintList() {
        return this.f71883b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f71885c;
    }

    public Drawable getTrackDrawable() {
        return this.f71891f;
    }

    public ColorStateList getTrackTintList() {
        return this.f71893g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f71895h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f71881a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f71891f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f71904l0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f71904l0.end();
        this.f71904l0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f71864q0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f71891f;
        Rect rect = this.f71907o0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f71886c0;
        int i2 = this.f71890e0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f71881a;
        if (drawable != null) {
            if (!this.f71866I || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM24047b = wl2.m24047b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM24047b.left;
                rect.right -= rectM24047b.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f71898i0 : this.f71900j0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.f71894g0;
            ColorStateList colorStateList = this.f71896h0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f71867J : this.f71869L;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f71881a != null) {
            Drawable drawable = this.f71891f;
            Rect rect = this.f71907o0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM24047b = wl2.m24047b(this.f71881a);
            iMax = Math.max(0, rectM24047b.left - rect.left);
            iMax2 = Math.max(0, rectM24047b.right - rect.right);
        } else {
            iMax = 0;
        }
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f71879V + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f71879V) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.f71880W;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f71880W + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f71880W;
        }
        this.f71884b0 = paddingLeft;
        this.f71886c0 = paddingTop;
        this.f71890e0 = height;
        this.f71888d0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.f71871N) {
            StaticLayout staticLayout = this.f71898i0;
            TextPaint textPaint = this.f71894g0;
            if (staticLayout == null) {
                CharSequence charSequence = this.f71868K;
                this.f71898i0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f71900j0 == null) {
                CharSequence charSequence2 = this.f71870M;
                this.f71900j0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f71881a;
        Rect rect = this.f71907o0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f71881a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f71881a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f71871N) {
            iMax = (this.f71901k * 2) + Math.max(this.f71898i0.getWidth(), this.f71900j0.getWidth());
        } else {
            iMax = 0;
        }
        this.f71882a0 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f71891f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f71891f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f71881a;
        if (drawable3 != null) {
            Rect rectM24047b = wl2.m24047b(drawable3);
            iMax2 = Math.max(iMax2, rectM24047b.left);
            iMax3 = Math.max(iMax3, rectM24047b.right);
        }
        boolean z = this.f71892f0;
        int iMax4 = this.f71903l;
        if (z) {
            iMax4 = Math.max(iMax4, (this.f71882a0 * 2) + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f71879V = iMax4;
        this.f71880W = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f71867J : this.f71869L;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.f71876S;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f71873P;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.f71872O == 2) {
                    this.f71872O = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f71877T) {
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f71872O = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.f71872O;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.f71874Q) > f3 || Math.abs(y - this.f71875R) > f3) {
                        this.f71872O = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f71874Q = x;
                        this.f71875R = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.f71874Q;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this.f71878U;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.f71874Q = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f71872O == 2) {
                    this.f71872O = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(DescriptorProtos.Edition.EDITION_2023_VALUE);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f71877T) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (getLayoutDirection() == 1) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f71872O = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f71881a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f71881a;
                Rect rect = this.f71907o0;
                drawable.getPadding(rect);
                int i3 = this.f71886c0 - i;
                int i4 = (this.f71884b0 + thumbOffset) - i;
                int i5 = this.f71882a0 + i4 + rect.left + rect.right + i;
                int i6 = this.f71890e0 + i;
                if (x3 > i4 && x3 < i5 && y2 > i3 && y2 < i6) {
                    this.f71872O = 1;
                    this.f71874Q = x3;
                    this.f71875R = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m11317c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f71867J;
                if (string == null) {
                    string = getResources().getString(R$string.abc_capital_on);
                }
                WeakHashMap weakHashMap = dta.f36217a;
                new ssa(R$id.tag_state_description, 2).m22871e(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f71869L;
            if (string2 == null) {
                string2 = getResources().getString(R$string.abc_capital_off);
            }
            WeakHashMap weakHashMap2 = dta.f36217a;
            new ssa(R$id.tag_state_description, 2).m22871e(this, string2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f71904l0;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f71863p0, zIsChecked ? 1.0f : 0.0f);
        this.f71904l0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f71904l0.setAutoCancel(true);
        this.f71904l0.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m11318d(z);
        setTextOnInternal(this.f71867J);
        setTextOffInternal(this.f71869L);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f71892f0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m11315a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f71871N != z) {
            this.f71871N = z;
            requestLayout();
            if (z) {
                m25729d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f71866I = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f71903l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f71865H = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f71894g0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f71869L;
        if (string == null) {
            string = getResources().getString(R$string.abc_capital_off);
        }
        WeakHashMap weakHashMap = dta.f36217a;
        new ssa(R$id.tag_state_description, 2).m22871e(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f71867J;
        if (string == null) {
            string = getResources().getString(R$string.abc_capital_on);
        }
        WeakHashMap weakHashMap = dta.f36217a;
        new ssa(R$id.tag_state_description, 2).m22871e(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f71881a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f71881a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f71878U = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(bna.m3932U(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f71901k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f71883b = colorStateList;
        this.f71887d = true;
        m25726a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f71885c = mode;
        this.f71889e = true;
        m25726a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f71891f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f71891f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(bna.m3932U(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f71893g = colorStateList;
        this.f71897i = true;
        m25727b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f71895h = mode;
        this.f71899j = true;
        m25727b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f71881a || drawable == this.f71891f;
    }
}
