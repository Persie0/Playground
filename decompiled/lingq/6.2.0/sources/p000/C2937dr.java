package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: dr */
/* JADX INFO: loaded from: classes.dex */
public final class C2937dr {

    /* JADX INFO: renamed from: a */
    public final TextView f36061a;

    /* JADX INFO: renamed from: b */
    public l1a f36062b;

    /* JADX INFO: renamed from: c */
    public l1a f36063c;

    /* JADX INFO: renamed from: d */
    public l1a f36064d;

    /* JADX INFO: renamed from: e */
    public l1a f36065e;

    /* JADX INFO: renamed from: f */
    public l1a f36066f;

    /* JADX INFO: renamed from: g */
    public l1a f36067g;

    /* JADX INFO: renamed from: h */
    public l1a f36068h;

    /* JADX INFO: renamed from: i */
    public final C3271kr f36069i;

    /* JADX INFO: renamed from: j */
    public int f36070j = 0;

    /* JADX INFO: renamed from: k */
    public int f36071k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f36072l;

    /* JADX INFO: renamed from: m */
    public boolean f36073m;

    public C2937dr(TextView textView) {
        this.f36061a = textView;
        this.f36069i = new C3271kr(textView);
    }

    /* JADX INFO: renamed from: c */
    public static l1a m10593c(Context context, C2893cq c2893cq, int i) {
        ColorStateList colorStateListM178g;
        synchronized (c2893cq) {
            colorStateListM178g = c2893cq.f34366a.m178g(context, i);
        }
        if (colorStateListM178g == null) {
            return null;
        }
        l1a l1aVar = new l1a();
        l1aVar.f48904d = true;
        l1aVar.f48901a = colorStateListM178g;
        return l1aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m10594a(Drawable drawable, l1a l1aVar) {
        if (drawable == null || l1aVar == null) {
            return;
        }
        C2893cq.m9846e(drawable, l1aVar, this.f36061a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m10595b() {
        l1a l1aVar = this.f36062b;
        TextView textView = this.f36061a;
        if (l1aVar != null || this.f36063c != null || this.f36064d != null || this.f36065e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m10594a(compoundDrawables[0], this.f36062b);
            m10594a(compoundDrawables[1], this.f36063c);
            m10594a(compoundDrawables[2], this.f36064d);
            m10594a(compoundDrawables[3], this.f36065e);
        }
        if (this.f36066f == null && this.f36067g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m10594a(compoundDrawablesRelative[0], this.f36066f);
        m10594a(compoundDrawablesRelative[2], this.f36067g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m10596d() {
        l1a l1aVar = this.f36068h;
        if (l1aVar != null) {
            return l1aVar.f48901a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m10597e() {
        l1a l1aVar = this.f36068h;
        if (l1aVar != null) {
            return l1aVar.f48902b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:249:0x046c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0474  */
    /* JADX WARN: Code duplicated, block: B:253:0x0485  */
    /* JADX WARN: Code duplicated, block: B:254:0x0488  */
    /* JADX WARN: Code duplicated, block: B:257:0x0490  */
    /* JADX WARN: Code duplicated, block: B:260:0x04a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:261:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:263:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:265:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:267:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final void m10598f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        float f;
        float dimensionPixelSize;
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        TextView textView = this.f36061a;
        Context context = textView.getContext();
        C2893cq c2893cqM9843a = C2893cq.m9843a();
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, context, attributeSet, R$styleable.AppCompatTextHelper);
        Context context2 = textView.getContext();
        int[] iArr = R$styleable.AppCompatTextHelper;
        TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
        WeakHashMap weakHashMap = dta.f36217a;
        ata.m3035b(textView, context2, iArr, attributeSet, typedArray, i, 0);
        int i4 = R$styleable.AppCompatTextHelper_android_textAppearance;
        TypedArray typedArray2 = (TypedArray) sq5VarM21551w.f61249c;
        int resourceId3 = typedArray2.getResourceId(i4, -1);
        if (typedArray2.hasValue(R$styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.f36062b = m10593c(context, c2893cqM9843a, typedArray2.getResourceId(R$styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (typedArray2.hasValue(R$styleable.AppCompatTextHelper_android_drawableTop)) {
            this.f36063c = m10593c(context, c2893cqM9843a, typedArray2.getResourceId(R$styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (typedArray2.hasValue(R$styleable.AppCompatTextHelper_android_drawableRight)) {
            this.f36064d = m10593c(context, c2893cqM9843a, typedArray2.getResourceId(R$styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (typedArray2.hasValue(R$styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.f36065e = m10593c(context, c2893cqM9843a, typedArray2.getResourceId(R$styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (typedArray2.hasValue(R$styleable.AppCompatTextHelper_android_drawableStart)) {
            this.f36066f = m10593c(context, c2893cqM9843a, typedArray2.getResourceId(R$styleable.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (typedArray2.hasValue(R$styleable.AppCompatTextHelper_android_drawableEnd)) {
            this.f36067g = m10593c(context, c2893cqM9843a, typedArray2.getResourceId(R$styleable.AppCompatTextHelper_android_drawableEnd, 0));
        }
        sq5VarM21551w.m21582y();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int i5 = 17;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, R$styleable.TextAppearance);
            sq5 sq5Var = new sq5(i5, context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            m10602j(context, sq5Var);
            string2 = typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_textLocale) ? typedArrayObtainStyledAttributes.getString(R$styleable.TextAppearance_textLocale) : null;
            string = typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_fontVariationSettings) ? typedArrayObtainStyledAttributes.getString(R$styleable.TextAppearance_fontVariationSettings) : null;
            sq5Var.m21582y();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.TextAppearance, i, 0);
        sq5 sq5Var2 = new sq5(i5, context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(R$styleable.TextAppearance_textAllCaps)) {
            z = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
            z2 = true;
        }
        if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.TextAppearance_textLocale)) {
            string2 = typedArrayObtainStyledAttributes2.getString(R$styleable.TextAppearance_textLocale);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.TextAppearance_fontVariationSettings)) {
            string = typedArrayObtainStyledAttributes2.getString(R$styleable.TextAppearance_fontVariationSettings);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m10602j(context, sq5Var2);
        sq5Var2.m21582y();
        if (!z3 && z2) {
            textView.setAllCaps(z);
        }
        Typeface typeface = this.f36072l;
        if (typeface != null) {
            if (this.f36071k == -1) {
                textView.setTypeface(typeface, this.f36070j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0821br.m4114d(textView, string);
        }
        if (string2 != null) {
            AbstractC0783ar.m2996b(textView, AbstractC0783ar.m2995a(string2));
        }
        C3271kr c3271kr = this.f36069i;
        Context context3 = c3271kr.f48353h;
        TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView, i, 0);
        TextView textView2 = c3271kr.f48352g;
        ata.m3035b(textView2, textView2.getContext(), R$styleable.AppCompatTextView, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(R$styleable.AppCompatTextView_autoSizeTextType)) {
            c3271kr.f48346a = typedArrayObtainStyledAttributes3.getInt(R$styleable.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(R$styleable.AppCompatTextView_autoSizeStepGranularity) ? typedArrayObtainStyledAttributes3.getDimension(R$styleable.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(R$styleable.AppCompatTextView_autoSizeMinTextSize) ? typedArrayObtainStyledAttributes3.getDimension(R$styleable.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(R$styleable.AppCompatTextView_autoSizeMaxTextSize) ? typedArrayObtainStyledAttributes3.getDimension(R$styleable.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(R$styleable.AppCompatTextView_autoSizePresetSizes) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(R$styleable.AppCompatTextView_autoSizePresetSizes, 0)) <= 0) {
            f = 0.0f;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr2 = new int[length];
            if (length > 0) {
                f = 0.0f;
                for (int i6 = 0; i6 < length; i6++) {
                    iArr2[i6] = typedArrayObtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                int[] iArrM15649a = C3271kr.m15649a(iArr2);
                c3271kr.f48350e = iArrM15649a;
                int length2 = iArrM15649a.length;
                boolean z4 = length2 > 0;
                c3271kr.f48351f = z4;
                if (z4) {
                    c3271kr.f48346a = 1;
                    c3271kr.f48348c = iArrM15649a[0];
                    c3271kr.f48349d = iArrM15649a[length2 - 1];
                    c3271kr.f48347b = -1.0f;
                }
            } else {
                f = 0.0f;
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c3271kr.m15650b()) {
            c3271kr.f48346a = 0;
        } else if (c3271kr.f48346a == 1) {
            if (!c3271kr.f48351f) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    ij6.m13953k("Maximum auto-size text size (", dimension3, "px) is less or equal to minimum auto-size text size (", dimension2, "px)");
                    return;
                }
                if (dimension <= f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c3271kr.f48346a = 1;
                c3271kr.f48348c = dimension2;
                c3271kr.f48349d = dimension3;
                c3271kr.f48347b = dimension;
                c3271kr.f48351f = false;
            }
            if (c3271kr.m15650b() && c3271kr.f48346a == 1 && (!c3271kr.f48351f || c3271kr.f48350e.length == 0)) {
                int iFloor = ((int) Math.floor((c3271kr.f48349d - c3271kr.f48348c) / c3271kr.f48347b)) + 1;
                int[] iArr3 = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr3[i7] = Math.round((i7 * c3271kr.f48347b) + c3271kr.f48348c);
                }
                c3271kr.f48350e = C3271kr.m15649a(iArr3);
            }
        }
        if (c3271kr.f48346a != 0) {
            int[] iArr4 = c3271kr.f48350e;
            if (iArr4.length > 0) {
                if (AbstractC0821br.m4111a(textView) != -1.0f) {
                    AbstractC0821br.m4112b(textView, Math.round(c3271kr.f48348c), Math.round(c3271kr.f48349d), Math.round(c3271kr.f48347b), 0);
                } else {
                    AbstractC0821br.m4113c(textView, iArr4, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, R$styleable.AppCompatTextView);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawableM9847b = resourceId4 != -1 ? c2893cqM9843a.m9847b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawableM9847b2 = resourceId5 != -1 ? c2893cqM9843a.m9847b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawableM9847b3 = resourceId6 != -1 ? c2893cqM9843a.m9847b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawableM9847b4 = resourceId7 != -1 ? c2893cqM9843a.m9847b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawableM9847b5 = resourceId8 != -1 ? c2893cqM9843a.m9847b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(R$styleable.AppCompatTextView_drawableEndCompat, -1);
        Drawable drawableM9847b6 = resourceId9 != -1 ? c2893cqM9843a.m9847b(context, resourceId9) : null;
        if (drawableM9847b5 != null || drawableM9847b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM9847b5 == null) {
                drawableM9847b5 = compoundDrawablesRelative[0];
            }
            if (drawableM9847b2 == null) {
                drawableM9847b2 = compoundDrawablesRelative[1];
            }
            if (drawableM9847b6 == null) {
                drawableM9847b6 = compoundDrawablesRelative[2];
            }
            if (drawableM9847b4 == null) {
                drawableM9847b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM9847b5, drawableM9847b2, drawableM9847b6, drawableM9847b4);
        } else if (drawableM9847b != null || drawableM9847b2 != null || drawableM9847b3 != null || drawableM9847b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM9847b == null) {
                    drawableM9847b = compoundDrawables[0];
                }
                if (drawableM9847b2 == null) {
                    drawableM9847b2 = compoundDrawables[1];
                }
                if (drawableM9847b3 == null) {
                    drawableM9847b3 = compoundDrawables[2];
                }
                if (drawableM9847b4 == null) {
                    drawableM9847b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM9847b, drawableM9847b2, drawableM9847b3, drawableM9847b4);
            } else {
                if (drawableM9847b2 == null) {
                    drawableM9847b2 = compoundDrawablesRelative2[1];
                }
                if (drawableM9847b4 == null) {
                    drawableM9847b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM9847b2, compoundDrawablesRelative2[2], drawableM9847b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(R$styleable.AppCompatTextView_drawableTint)) {
            int i8 = R$styleable.AppCompatTextView_drawableTint;
            if (!typedArrayObtainStyledAttributes4.hasValue(i8) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(i8, 0)) == 0 || (colorStateList = do7.m10540p(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(i8);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(R$styleable.AppCompatTextView_drawableTintMode)) {
            textView.setCompoundDrawableTintMode(wl2.m24048c(typedArrayObtainStyledAttributes4.getInt(R$styleable.AppCompatTextView_drawableTintMode, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(R$styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(R$styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(R$styleable.AppCompatTextView_lineHeight)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(R$styleable.AppCompatTextView_lineHeight);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(R$styleable.AppCompatTextView_lineHeight, -1);
            } else {
                int i9 = typedValuePeekValue.data;
                i2 = i9 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i9);
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != -1) {
                xwc.m24775m(dimensionPixelSize2);
                d7d.m10145c(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != -1) {
                xwc.m24775m(dimensionPixelSize3);
                fontMetricsInt = textView.getPaint().getFontMetricsInt();
                if (textView.getIncludeFontPadding()) {
                    i3 = fontMetricsInt.bottom;
                } else {
                    i3 = fontMetricsInt.descent;
                }
                if (dimensionPixelSize3 > Math.abs(i3)) {
                    textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i3);
                }
            }
            if (dimensionPixelSize != -1.0f) {
                if (i2 == -1) {
                    x74.m24340G(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC3521r3.m20275g(textView, i2, dimensionPixelSize);
                } else {
                    x74.m24340G(textView, Math.round(TypedValue.applyDimension(i2, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        dimensionPixelSize = -1.0f;
        i2 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            xwc.m24775m(dimensionPixelSize2);
            d7d.m10145c(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            xwc.m24775m(dimensionPixelSize3);
            fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i3 = fontMetricsInt.bottom;
            } else {
                i3 = fontMetricsInt.descent;
            }
            if (dimensionPixelSize3 > Math.abs(i3)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i3);
            }
        }
        if (dimensionPixelSize != -1.0f) {
            if (i2 == -1) {
                x74.m24340G(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC3521r3.m20275g(textView, i2, dimensionPixelSize);
            } else {
                x74.m24340G(textView, Math.round(TypedValue.applyDimension(i2, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10599g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
        sq5 sq5Var = new sq5(17, context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_textAllCaps);
        TextView textView = this.f36061a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m10602j(context, sq5Var);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TextAppearance_fontVariationSettings) && (string = typedArrayObtainStyledAttributes.getString(R$styleable.TextAppearance_fontVariationSettings)) != null) {
            AbstractC0821br.m4114d(textView, string);
        }
        sq5Var.m21582y();
        Typeface typeface = this.f36072l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f36070j);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10600h(ColorStateList colorStateList) {
        if (this.f36068h == null) {
            this.f36068h = new l1a();
        }
        l1a l1aVar = this.f36068h;
        l1aVar.f48901a = colorStateList;
        l1aVar.f48904d = colorStateList != null;
        this.f36062b = l1aVar;
        this.f36063c = l1aVar;
        this.f36064d = l1aVar;
        this.f36065e = l1aVar;
        this.f36066f = l1aVar;
        this.f36067g = l1aVar;
    }

    /* JADX INFO: renamed from: i */
    public final void m10601i(PorterDuff.Mode mode) {
        if (this.f36068h == null) {
            this.f36068h = new l1a();
        }
        l1a l1aVar = this.f36068h;
        l1aVar.f48902b = mode;
        l1aVar.f48903c = mode != null;
        this.f36062b = l1aVar;
        this.f36063c = l1aVar;
        this.f36064d = l1aVar;
        this.f36065e = l1aVar;
        this.f36066f = l1aVar;
        this.f36067g = l1aVar;
    }

    /* JADX INFO: renamed from: j */
    public final void m10602j(Context context, sq5 sq5Var) {
        String string;
        int i = R$styleable.TextAppearance_android_textStyle;
        int i2 = this.f36070j;
        TypedArray typedArray = (TypedArray) sq5Var.f61249c;
        this.f36070j = typedArray.getInt(i, i2);
        int i3 = typedArray.getInt(R$styleable.TextAppearance_android_textFontWeight, -1);
        this.f36071k = i3;
        if (i3 != -1) {
            this.f36070j &= 2;
        }
        if (!typedArray.hasValue(R$styleable.TextAppearance_android_fontFamily) && !typedArray.hasValue(R$styleable.TextAppearance_fontFamily)) {
            if (typedArray.hasValue(R$styleable.TextAppearance_android_typeface)) {
                this.f36073m = false;
                int i4 = typedArray.getInt(R$styleable.TextAppearance_android_typeface, 1);
                if (i4 == 1) {
                    this.f36072l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f36072l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f36072l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f36072l = null;
        int i5 = typedArray.hasValue(R$styleable.TextAppearance_fontFamily) ? R$styleable.TextAppearance_fontFamily : R$styleable.TextAppearance_android_fontFamily;
        int i6 = this.f36071k;
        int i7 = this.f36070j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM21571m = sq5Var.m21571m(i5, this.f36070j, new C3805yq(this, i6, i7, new WeakReference(this.f36061a)));
                if (typefaceM21571m != null) {
                    if (this.f36071k != -1) {
                        this.f36072l = AbstractC2894cr.m9854a(Typeface.create(typefaceM21571m, 0), this.f36071k, (this.f36070j & 2) != 0);
                    } else {
                        this.f36072l = typefaceM21571m;
                    }
                }
                this.f36073m = this.f36072l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f36072l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (this.f36071k != -1) {
            this.f36072l = AbstractC2894cr.m9854a(Typeface.create(string, 0), this.f36071k, (this.f36070j & 2) != 0);
        } else {
            this.f36072l = Typeface.create(string, this.f36070j);
        }
    }
}
