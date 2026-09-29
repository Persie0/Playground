package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.R$styleable;

/* JADX INFO: loaded from: classes.dex */
public final class us9 {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f64298a;

    /* JADX INFO: renamed from: b */
    public final String f64299b;

    /* JADX INFO: renamed from: c */
    public String f64300c;

    /* JADX INFO: renamed from: d */
    public final int f64301d;

    /* JADX INFO: renamed from: e */
    public final int f64302e;

    /* JADX INFO: renamed from: f */
    public final float f64303f;

    /* JADX INFO: renamed from: g */
    public final float f64304g;

    /* JADX INFO: renamed from: h */
    public final float f64305h;

    /* JADX INFO: renamed from: i */
    public final boolean f64306i;

    /* JADX INFO: renamed from: j */
    public final float f64307j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f64308k;

    /* JADX INFO: renamed from: l */
    public float f64309l;

    /* JADX INFO: renamed from: m */
    public final int f64310m;

    /* JADX INFO: renamed from: n */
    public boolean f64311n = false;

    /* JADX INFO: renamed from: o */
    public boolean f64312o = false;

    /* JADX INFO: renamed from: p */
    public Typeface f64313p;

    public us9(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.TextAppearance);
        this.f64309l = typedArrayObtainStyledAttributes.getDimension(R$styleable.TextAppearance_android_textSize, 0.0f);
        this.f64308k = pb1.m19054x(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
        pb1.m19054x(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColorHint);
        pb1.m19054x(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColorLink);
        this.f64301d = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_textStyle, 0);
        this.f64302e = typedArrayObtainStyledAttributes.getInt(R$styleable.TextAppearance_android_typeface, 1);
        int i2 = R$styleable.TextAppearance_fontFamily;
        i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : R$styleable.TextAppearance_android_fontFamily;
        this.f64310m = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f64299b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
        this.f64298a = pb1.m19054x(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_shadowColor);
        this.f64303f = typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f64304g = typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f64305h = typedArrayObtainStyledAttributes.getFloat(R$styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, com.google.android.material.R$styleable.MaterialTextAppearance);
        this.f64306i = typedArrayObtainStyledAttributes2.hasValue(com.google.android.material.R$styleable.MaterialTextAppearance_android_letterSpacing);
        this.f64307j = typedArrayObtainStyledAttributes2.getFloat(com.google.android.material.R$styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        int i3 = com.google.android.material.R$styleable.MaterialTextAppearance_fontVariationSettings;
        this.f64300c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(i3) ? i3 : com.google.android.material.R$styleable.MaterialTextAppearance_android_fontVariationSettings);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m22900a() {
        String str;
        Typeface typeface = this.f64313p;
        int i = this.f64301d;
        if (typeface == null && (str = this.f64299b) != null) {
            this.f64313p = Typeface.create(str, i);
        }
        if (this.f64313p == null) {
            int i2 = this.f64302e;
            if (i2 == 1) {
                this.f64313p = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f64313p = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f64313p = Typeface.DEFAULT;
            } else {
                this.f64313p = Typeface.MONOSPACE;
            }
            this.f64313p = Typeface.create(this.f64313p, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22901b(Context context, p6d p6dVar) {
        if (!m22902c(context)) {
            m22900a();
        }
        int i = this.f64310m;
        if (i == 0) {
            this.f64311n = true;
        }
        if (this.f64311n) {
            p6dVar.mo34c(this.f64313p, true);
            return;
        }
        try {
            ss9 ss9Var = new ss9(this, p6dVar);
            ThreadLocal threadLocal = f88.f38630a;
            if (context.isRestricted()) {
                ss9Var.m21650v(-4);
            } else {
                f88.m11598b(context, i, new TypedValue(), 0, ss9Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f64311n = true;
            p6dVar.mo33b(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f64299b, e);
            this.f64311n = true;
            p6dVar.mo33b(-3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22902c(Context context) {
        Context context2;
        Typeface typefaceM11598b;
        String string;
        Typeface typefaceCreate;
        if (this.f64311n) {
            return true;
        }
        int i = this.f64310m;
        if (i != 0) {
            ThreadLocal threadLocal = f88.f38630a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceM11598b = null;
            } else {
                context2 = context;
                typefaceM11598b = f88.m11598b(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (typefaceM11598b != null) {
                this.f64313p = typefaceM11598b;
                this.f64311n = true;
                return true;
            }
            if (!this.f64312o) {
                this.f64312o = true;
                Resources resources = context2.getResources();
                int i2 = this.f64310m;
                if (i2 == 0 || !resources.getResourceTypeName(i2).equals("font")) {
                    string = null;
                    break;
                }
                try {
                    XmlResourceParser xml = resources.getXml(i2);
                    while (true) {
                        if (xml.getEventType() == 1) {
                            string = null;
                            break;
                        }
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), androidx.core.R$styleable.FontFamily);
                            string = typedArrayObtainAttributes.getString(androidx.core.R$styleable.FontFamily_fontProviderSystemFontFamily);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                        break;
                    }
                } catch (Throwable unused) {
                }
                if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                    typefaceCreate2 = Typeface.create(typefaceCreate, this.f64301d);
                }
            }
            if (typefaceCreate2 != null) {
                this.f64313p = typefaceCreate2;
                this.f64311n = true;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m22903d(Context context, TextPaint textPaint, p6d p6dVar) {
        m22904e(context, textPaint, p6dVar);
        ColorStateList colorStateList = this.f64308k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f64298a;
        textPaint.setShadowLayer(this.f64305h, this.f64303f, this.f64304g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: e */
    public final void m22904e(Context context, TextPaint textPaint, p6d p6dVar) {
        Typeface typeface;
        if (m22902c(context) && this.f64311n && (typeface = this.f64313p) != null) {
            m22905f(context, textPaint, typeface);
            return;
        }
        m22900a();
        m22905f(context, textPaint, this.f64313p);
        m22901b(context, new ts9(this, context, textPaint, p6dVar));
    }

    /* JADX INFO: renamed from: f */
    public final void m22905f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM25095b = yda.m25095b(context.getResources().getConfiguration(), typeface);
        if (typefaceM25095b != null) {
            typeface = typefaceM25095b;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f64301d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f64309l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.f64300c);
        if (this.f64306i) {
            textPaint.setLetterSpacing(this.f64307j);
        }
    }
}
