package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.C3340mm;
import p000.C3479q;
import p000.da3;
import p000.ea3;
import p000.fs5;
import p000.p39;
import p000.r39;
import p000.to2;
import p000.vi8;
import p000.wv5;
import p000.xwc;

/* JADX INFO: loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {

    /* JADX INFO: renamed from: K */
    public static final ColorDrawable f12977K = new ColorDrawable(0);

    /* JADX INFO: renamed from: L */
    public static final int[] f12978L = {R.attr.state_focused, R.attr.state_window_focused};

    /* JADX INFO: renamed from: M */
    public static final OvershootInterpolator f12979M = new OvershootInterpolator(4.0f);

    /* JADX INFO: renamed from: N */
    public static final da3 f12980N = new da3("interpolation");

    /* JADX INFO: renamed from: H */
    public boolean f12981H;

    /* JADX INFO: renamed from: I */
    public boolean f12982I;

    /* JADX INFO: renamed from: J */
    public ea3 f12983J;

    /* JADX INFO: renamed from: a */
    public final Paint f12984a;

    /* JADX INFO: renamed from: b */
    public final RectF f12985b;

    /* JADX INFO: renamed from: c */
    public final Rect f12986c;

    /* JADX INFO: renamed from: d */
    public final Path f12987d;

    /* JADX INFO: renamed from: e */
    public final Path f12988e;

    /* JADX INFO: renamed from: f */
    public final Matrix f12989f;

    /* JADX INFO: renamed from: g */
    public final wv5 f12990g;

    /* JADX INFO: renamed from: h */
    public WeakReference f12991h;

    /* JADX INFO: renamed from: i */
    public float f12992i;

    /* JADX INFO: renamed from: j */
    public ObjectAnimator f12993j;

    /* JADX INFO: renamed from: k */
    public float f12994k;

    /* JADX INFO: renamed from: l */
    public boolean f12995l;

    public FocusRingDrawable(ea3 ea3Var, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.f12984a = paint;
        this.f12985b = new RectF();
        this.f12986c = new Rect();
        this.f12987d = new Path();
        this.f12988e = new Path();
        this.f12989f = new Matrix();
        this.f12990g = wv5.m24163e();
        this.f12992i = -1.0f;
        this.f12994k = 1.0f;
        this.f12981H = false;
        this.f12982I = false;
        ea3 ea3Var2 = new ea3(ea3Var);
        this.f12983J = ea3Var2;
        Drawable.ConstantState constantState = ea3Var2.f36899a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.f12983J.f36908j)) {
            return;
        }
        paint.setStrokeWidth(this.f12983J.f36908j);
    }

    /* JADX INFO: renamed from: c */
    public static FocusRingDrawable m6145c(Drawable drawable) {
        if (drawable instanceof FocusRingDrawable) {
            return (FocusRingDrawable) drawable;
        }
        if (drawable instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) drawable).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable2;
            }
        }
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            Drawable drawable3 = layerDrawable.getDrawable(i);
            if (drawable3 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable3;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m6146d(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: f */
    public static FocusRingDrawable m6147f(Context context, LayerDrawable layerDrawable, fs5 fs5Var) {
        if (!xwc.m24749V(context.getTheme(), R$attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, f12977K);
        if (fs5Var != null) {
            focusRingDrawable.f12991h = new WeakReference(fs5Var);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    /* JADX INFO: renamed from: g */
    public static float m6148g(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    /* JADX INFO: renamed from: a */
    public final void m6149a(RectF rectF) {
        if (this.f12983J.f36921w != null) {
            rectF.set(this.f12983J.f36921w);
            return;
        }
        WeakReference weakReference = this.f12991h;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((fs5) this.f12991h.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect = this.f12986c;
        rippleDrawable.getHotspotBounds(rect);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect.inset(Math.max(0, (rect.width() / 2) - radius), Math.max(0, (rect.height() / 2) - radius));
        }
        rectF.set(rect);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        m6151e(theme);
    }

    /* JADX INFO: renamed from: b */
    public final void m6150b(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.f12985b;
        m6149a(rectF);
        float f3 = f * 2.0f;
        float fWidth = 1.0f - (f3 / rectF.width());
        float fHeight = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.f12989f;
        matrix.reset();
        matrix.postScale(fWidth, fHeight, rectF.centerX(), rectF.centerY());
        Path path2 = this.f12987d;
        path.transform(matrix, path2);
        float f4 = f2 * this.f12994k;
        Paint paint = this.f12984a;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f6  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fMax;
        Drawable drawable;
        int radius;
        super.draw(canvas);
        if (this.f12983J.f36901c && this.f12981H) {
            float f = ((this.f12983J.f36908j / 2.0f) * this.f12994k) + this.f12983J.f36914p;
            float f2 = ((this.f12983J.f36910l / 2.0f) * this.f12994k) + this.f12983J.f36916r + this.f12983J.f36914p;
            Path path = this.f12988e;
            if (path.isEmpty()) {
                WeakReference weakReference = this.f12991h;
                if (weakReference == null || weakReference.get() == null) {
                    path = null;
                } else {
                    path = ((fs5) this.f12991h.get()).f39585i;
                    if (path.isEmpty()) {
                        path = null;
                    }
                }
            }
            Path path2 = path;
            ea3 ea3Var = this.f12983J;
            if (path2 != null) {
                m6150b(canvas, path2, f2, ea3Var.f36910l, this.f12983J.f36906h);
                m6150b(canvas, path2, f, this.f12983J.f36908j, this.f12983J.f36904f);
                return;
            }
            if (Float.isNaN(ea3Var.f36912n)) {
                fMax = this.f12992i;
                if (fMax < 0.0f) {
                    WeakReference weakReference2 = this.f12991h;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        drawable = getDrawable();
                        if ((drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) {
                            fMax = 0.0f;
                        } else {
                            fMax = radius;
                        }
                    } else {
                        fs5 fs5Var = (fs5) this.f12991h.get();
                        float fM12059c = fs5Var.m12059c(fs5Var.m12065i(), fs5Var.f39578b.f36160a.mo13920d(), fs5Var.f39574X);
                        if (fM12059c >= 0.0f) {
                            fM12059c *= fs5Var.f39578b.f36169j;
                        }
                        if (fM12059c >= 0.0f) {
                            fMax = Math.max(0.0f, fM12059c - (this.f12983J.f36908j / 2.0f));
                        } else {
                            drawable = getDrawable();
                            if (drawable instanceof RippleDrawable) {
                                fMax = 0.0f;
                            } else {
                                fMax = 0.0f;
                            }
                        }
                    }
                }
            } else {
                fMax = this.f12983J.f36912n;
            }
            float fMax2 = Math.max(0.0f, fMax - (this.f12983J.f36908j / 2.0f));
            float f3 = this.f12983J.f36910l;
            int i = this.f12983J.f36906h;
            RectF rectF = this.f12985b;
            m6149a(rectF);
            rectF.inset(f2, f2);
            float f4 = f3 * this.f12994k;
            Paint paint = this.f12984a;
            paint.setStrokeWidth(f4);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, fMax2, fMax2, paint);
            float f5 = this.f12983J.f36908j;
            int i2 = this.f12983J.f36904f;
            m6149a(rectF);
            rectF.inset(f, f);
            paint.setStrokeWidth(f5 * this.f12994k);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, fMax, fMax, paint);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX INFO: renamed from: e */
    public final void m6151e(Resources.Theme theme) {
        TypedValue typedValueM24748U;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(R$styleable.FocusRingDrawable);
        if (this.f12983J.f36902d != Integer.MIN_VALUE && (typedValueM24748U = xwc.m24748U(theme, this.f12983J.f36902d)) != null) {
            this.f12983J.f36901c = typedValueM24748U.data != 0;
            this.f12983J.f36903e = true;
        }
        if (!this.f12983J.f36903e) {
            ea3 ea3Var = this.f12983J;
            ea3Var.f36901c = xwc.m24749V(theme, R$attr.focusRingsEnabled, ea3Var.f36901c);
        }
        if (this.f12983J.f36901c) {
            ea3 ea3Var2 = this.f12983J;
            int color = ea3Var2.f36904f;
            int i = this.f12983J.f36905g;
            int i2 = R$styleable.FocusRingDrawable_focusRingsOuterStrokeColor;
            if (color == Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i, typedValue, true)) {
                        color = typedValue.data;
                    } else {
                        color = typedArrayObtainStyledAttributes.getColor(i2, -16777216);
                    }
                } else {
                    color = typedArrayObtainStyledAttributes.getColor(i2, -16777216);
                }
            }
            ea3Var2.f36904f = color;
            ea3 ea3Var3 = this.f12983J;
            int color2 = ea3Var3.f36906h;
            int i3 = this.f12983J.f36907i;
            int i4 = R$styleable.FocusRingDrawable_focusRingsInnerStrokeColor;
            if (color2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue2, true)) {
                        color2 = typedValue2.data;
                    } else {
                        color2 = typedArrayObtainStyledAttributes.getColor(i4, -1);
                    }
                } else {
                    color2 = typedArrayObtainStyledAttributes.getColor(i4, -1);
                }
            }
            ea3Var3.f36906h = color2;
            ea3 ea3Var4 = this.f12983J;
            ea3Var4.f36908j = m6148g(ea3Var4.f36908j, theme, this.f12983J.f36909k, typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsOuterStrokeWidth, R$dimen.mtrl_focus_ring_outer_stroke_width);
            ea3 ea3Var5 = this.f12983J;
            ea3Var5.f36910l = m6148g(ea3Var5.f36910l, theme, this.f12983J.f36911m, typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsInnerStrokeWidth, R$dimen.mtrl_focus_ring_inner_stroke_width);
            ea3 ea3Var6 = this.f12983J;
            ea3Var6.f36912n = m6148g(ea3Var6.f36912n, theme, this.f12983J.f36913o, typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsRadius, 0);
            ea3 ea3Var7 = this.f12983J;
            ea3Var7.f36914p = m6148g(ea3Var7.f36914p, theme, this.f12983J.f36915q, typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsInset, 0);
            if (Float.isNaN(this.f12983J.f36914p)) {
                this.f12983J.f36914p = 0.0f;
            }
            ea3 ea3Var8 = this.f12983J;
            ea3Var8.f36916r = m6148g(ea3Var8.f36916r, theme, this.f12983J.f36917s, typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsInnerStrokeInset, R$dimen.mtrl_focus_ring_inner_stroke_inset);
            int i5 = this.f12983J.f36919u;
            ea3 ea3Var9 = this.f12983J;
            if (i5 != Integer.MIN_VALUE) {
                ea3Var9.f36918t = r39.m20282i(theme.obtainStyledAttributes(ea3Var9.f36919u, R$styleable.ShapeAppearance), new C3479q(0.0f)).m19627a();
            } else {
                TypedValue typedValueM24748U2 = xwc.m24748U(theme, ea3Var9.f36920v != Integer.MIN_VALUE ? this.f12983J.f36920v : R$attr.focusRingsShapeAppearance);
                if (typedValueM24748U2 != null) {
                    this.f12983J.f36918t = r39.m20282i(theme.obtainStyledAttributes(typedValueM24748U2.resourceId, R$styleable.ShapeAppearance), new C3479q(0.0f)).m19627a();
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f12984a;
        paint.setStyle(style);
        if (Float.isNaN(this.f12983J.f36908j)) {
            return;
        }
        paint.setStrokeWidth(this.f12983J.f36908j);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f12983J.m10994Q()) {
            return null;
        }
        this.f12983J.f36900b = getChangingConfigurations();
        return this.f12983J;
    }

    /* JADX INFO: renamed from: h */
    public final void m6152h(p39 p39Var) {
        RectF rectF = this.f12985b;
        m6149a(rectF);
        r39 r39VarMo13918b = p39Var.mo13918b(f12978L);
        boolean zM20284k = r39VarMo13918b.m20284k(rectF);
        Path path = this.f12988e;
        if (!zM20284k) {
            this.f12990g.m24165b(r39VarMo13918b, null, 1.0f, rectF, null, path);
            this.f12992i = -1.0f;
            return;
        }
        float f = ((this.f12983J.f36908j / 2.0f) * this.f12994k) + this.f12983J.f36914p;
        rectF.inset(f, f);
        this.f12992i = r39VarMo13918b.f58566e.mo11947a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            return super.hasFocusStateSpecified() || this.f12983J.f36901c;
        } catch (NoSuchMethodError unused) {
            return this.f12983J.f36901c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, R$styleable.FocusRingDrawable, 0, 0) : resources.obtainAttributes(attributeSet, R$styleable.FocusRingDrawable);
        this.f12983J.f36902d = m6146d(typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsEnabled);
        if (this.f12983J.f36902d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(R$styleable.FocusRingDrawable_focusRingsEnabled)) {
            ea3 ea3Var = this.f12983J;
            ea3Var.f36901c = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FocusRingDrawable_focusRingsEnabled, ea3Var.f36901c);
            this.f12983J.f36903e = true;
        }
        this.f12983J.f36905g = m6146d(typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsOuterStrokeColor);
        if (this.f12983J.f36905g == Integer.MIN_VALUE) {
            this.f12983J.f36904f = typedArrayObtainStyledAttributes.getColor(R$styleable.FocusRingDrawable_focusRingsOuterStrokeColor, Integer.MIN_VALUE);
        }
        this.f12983J.f36907i = m6146d(typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsInnerStrokeColor);
        if (this.f12983J.f36907i == Integer.MIN_VALUE) {
            this.f12983J.f36906h = typedArrayObtainStyledAttributes.getColor(R$styleable.FocusRingDrawable_focusRingsInnerStrokeColor, Integer.MIN_VALUE);
        }
        this.f12983J.f36909k = m6146d(typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsOuterStrokeWidth);
        if (this.f12983J.f36909k == Integer.MIN_VALUE) {
            this.f12983J.f36908j = typedArrayObtainStyledAttributes.getDimension(R$styleable.FocusRingDrawable_focusRingsOuterStrokeWidth, Float.NaN);
        }
        this.f12983J.f36911m = m6146d(typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsInnerStrokeWidth);
        if (this.f12983J.f36911m == Integer.MIN_VALUE) {
            this.f12983J.f36910l = typedArrayObtainStyledAttributes.getDimension(R$styleable.FocusRingDrawable_focusRingsInnerStrokeWidth, Float.NaN);
        }
        this.f12983J.f36911m = m6146d(typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsInnerStrokeWidth);
        if (this.f12983J.f36911m == Integer.MIN_VALUE) {
            this.f12983J.f36910l = typedArrayObtainStyledAttributes.getDimension(R$styleable.FocusRingDrawable_focusRingsInnerStrokeWidth, Float.NaN);
        }
        this.f12983J.f36913o = m6146d(typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsRadius);
        if (this.f12983J.f36913o == Integer.MIN_VALUE) {
            this.f12983J.f36912n = typedArrayObtainStyledAttributes.getDimension(R$styleable.FocusRingDrawable_focusRingsRadius, Float.NaN);
        }
        this.f12983J.f36915q = m6146d(typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsInset);
        if (this.f12983J.f36915q == Integer.MIN_VALUE) {
            this.f12983J.f36914p = typedArrayObtainStyledAttributes.getDimension(R$styleable.FocusRingDrawable_focusRingsInset, Float.NaN);
        }
        this.f12983J.f36917s = m6146d(typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsInnerStrokeInset);
        if (this.f12983J.f36917s == Integer.MIN_VALUE) {
            this.f12983J.f36916r = typedArrayObtainStyledAttributes.getDimension(R$styleable.FocusRingDrawable_focusRingsInnerStrokeInset, Float.NaN);
        }
        this.f12983J.f36920v = m6146d(typedArrayObtainStyledAttributes, R$styleable.FocusRingDrawable_focusRingsShapeAppearance);
        ea3 ea3Var2 = this.f12983J;
        int i = R$styleable.FocusRingDrawable_focusRingsShapeAppearance;
        ea3Var2.f36919u = typedArrayObtainStyledAttributes.getType(i) == 1 ? typedArrayObtainStyledAttributes.getResourceId(i, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawableCreateFromXmlInner = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawableCreateFromXmlInner != null) {
            setDrawable(drawableCreateFromXmlInner);
            this.f12983J.f36899a = drawableCreateFromXmlInner.getConstantState();
        } else {
            ColorDrawable colorDrawable = f12977K;
            setDrawable(colorDrawable);
            this.f12983J.f36899a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.f12983J.f36901c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.f12993j;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.f12993j = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f12982I && super.mutate() == this) {
            this.f12983J = new ea3(this.f12983J);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.f12983J.f36899a = drawable.getConstantState();
            }
            this.f12982I = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float[] cornerRadii;
        float cornerRadius;
        r39 r39Var;
        super.onBoundsChange(rect);
        if (this.f12983J.f36901c) {
            if (this.f12983J.f36918t != null) {
                m6152h(this.f12983J.f36918t);
                return;
            }
            Drawable drawable = getDrawable();
            p39 p39Var = null;
            if (drawable instanceof ShapeDrawable) {
                Outline outline = new Outline();
                ((ShapeDrawable) drawable).getOutline(outline);
                if (outline.getRadius() > 0.0f) {
                    vi8 vi8Var = new vi8();
                    vi8 vi8Var2 = new vi8();
                    vi8 vi8Var3 = new vi8();
                    vi8 vi8Var4 = new vi8();
                    to2 to2Var = new to2();
                    to2 to2Var2 = new to2();
                    to2 to2Var3 = new to2();
                    to2 to2Var4 = new to2();
                    float radius = outline.getRadius();
                    C3479q c3479q = new C3479q(radius);
                    C3479q c3479q2 = new C3479q(radius);
                    C3479q c3479q3 = new C3479q(radius);
                    C3479q c3479q4 = new C3479q(radius);
                    r39Var = new r39();
                    r39Var.f58562a = vi8Var;
                    r39Var.f58563b = vi8Var2;
                    r39Var.f58564c = vi8Var3;
                    r39Var.f58565d = vi8Var4;
                    r39Var.f58566e = c3479q;
                    r39Var.f58567f = c3479q2;
                    r39Var.f58568g = c3479q3;
                    r39Var.f58569h = c3479q4;
                    r39Var.f58570i = to2Var;
                    r39Var.f58571j = to2Var2;
                    r39Var.f58572k = to2Var3;
                    r39Var.f58573l = to2Var4;
                    p39Var = r39Var;
                }
            } else if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                try {
                    cornerRadii = gradientDrawable.getCornerRadii();
                } catch (NullPointerException unused) {
                    cornerRadii = null;
                }
                if (cornerRadii != null) {
                    vi8 vi8Var5 = new vi8();
                    vi8 vi8Var6 = new vi8();
                    vi8 vi8Var7 = new vi8();
                    vi8 vi8Var8 = new vi8();
                    to2 to2Var5 = new to2();
                    to2 to2Var6 = new to2();
                    to2 to2Var7 = new to2();
                    to2 to2Var8 = new to2();
                    C3479q c3479q5 = new C3479q(Math.min(cornerRadii[0], cornerRadii[1]));
                    C3479q c3479q6 = new C3479q(Math.min(cornerRadii[2], cornerRadii[3]));
                    C3479q c3479q7 = new C3479q(Math.min(cornerRadii[4], cornerRadii[5]));
                    C3479q c3479q8 = new C3479q(Math.min(cornerRadii[6], cornerRadii[7]));
                    r39Var = new r39();
                    r39Var.f58562a = vi8Var5;
                    r39Var.f58563b = vi8Var6;
                    r39Var.f58564c = vi8Var7;
                    r39Var.f58565d = vi8Var8;
                    r39Var.f58566e = c3479q5;
                    r39Var.f58567f = c3479q6;
                    r39Var.f58568g = c3479q7;
                    r39Var.f58569h = c3479q8;
                    r39Var.f58570i = to2Var5;
                    r39Var.f58571j = to2Var6;
                    r39Var.f58572k = to2Var7;
                    r39Var.f58573l = to2Var8;
                    p39Var = r39Var;
                } else {
                    try {
                        cornerRadius = gradientDrawable.getCornerRadius();
                    } catch (NullPointerException unused2) {
                        cornerRadius = -1.0f;
                    }
                    if (cornerRadius > 0.0f) {
                        vi8 vi8Var9 = new vi8();
                        vi8 vi8Var10 = new vi8();
                        vi8 vi8Var11 = new vi8();
                        vi8 vi8Var12 = new vi8();
                        to2 to2Var9 = new to2();
                        to2 to2Var10 = new to2();
                        to2 to2Var11 = new to2();
                        to2 to2Var12 = new to2();
                        C3479q c3479q9 = new C3479q(cornerRadius);
                        C3479q c3479q10 = new C3479q(cornerRadius);
                        C3479q c3479q11 = new C3479q(cornerRadius);
                        C3479q c3479q12 = new C3479q(cornerRadius);
                        r39 r39Var2 = new r39();
                        r39Var2.f58562a = vi8Var9;
                        r39Var2.f58563b = vi8Var10;
                        r39Var2.f58564c = vi8Var11;
                        r39Var2.f58565d = vi8Var12;
                        r39Var2.f58566e = c3479q9;
                        r39Var2.f58567f = c3479q10;
                        r39Var2.f58568g = c3479q11;
                        r39Var2.f58569h = c3479q12;
                        r39Var2.f58570i = to2Var9;
                        r39Var2.f58571j = to2Var10;
                        r39Var2.f58572k = to2Var11;
                        r39Var2.f58573l = to2Var12;
                        p39Var = r39Var2;
                    }
                }
            }
            if (p39Var != null) {
                m6152h(p39Var);
            } else {
                this.f12992i = -1.0f;
                this.f12988e.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (!this.f12983J.f36901c) {
            this.f12981H = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = StateSet.stateSetMatches(this.f12983J.f36922x, iArr);
        boolean z = this.f12981H != zStateSetMatches;
        this.f12981H = zStateSetMatches;
        if (z && iArr.length > 0 && !this.f12995l) {
            ObjectAnimator objectAnimator = this.f12993j;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.f12993j = null;
            }
            if (zStateSetMatches) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f12980N, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(f12979M);
                objectAnimatorOfFloat.addListener(new C3340mm(this, 5));
                this.f12993j = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.f12994k = 1.0f;
            }
        }
        this.f12995l = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable() {
        super(null);
        this.f12984a = new Paint(1);
        this.f12985b = new RectF();
        this.f12986c = new Rect();
        this.f12987d = new Path();
        this.f12988e = new Path();
        this.f12989f = new Matrix();
        this.f12990g = wv5.m24163e();
        this.f12992i = -1.0f;
        this.f12994k = 1.0f;
        this.f12981H = false;
        this.f12982I = false;
        this.f12983J = new ea3(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f12984a = new Paint(1);
        this.f12985b = new RectF();
        this.f12986c = new Rect();
        this.f12987d = new Path();
        this.f12988e = new Path();
        this.f12989f = new Matrix();
        this.f12990g = wv5.m24163e();
        this.f12992i = -1.0f;
        this.f12994k = 1.0f;
        this.f12981H = false;
        this.f12982I = false;
        ea3 ea3Var = new ea3(null);
        this.f12983J = ea3Var;
        if (drawable != null) {
            ea3Var.f36899a = drawable.getConstantState();
        }
        m6151e(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(ea3 ea3Var, Resources resources, da3 da3Var) {
        this(ea3Var, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
