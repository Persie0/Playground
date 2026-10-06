package android.support.v7.widget;

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
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0193fr;
import p000.C0197fv;
import p000.C0749jp;
import p000.C0768kh;
import p000.C0845nd;
import p000.C0846ne;
import p000.C0847nf;
import p000.C0864nw;
import p000.abm;
import p000.acv;
import p000.afe;
import p000.afn;
import p000.afo;
import p000.aie;
import p000.aix;
import p000.ajf;
import p000.bkn;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: c */
    private static final Property f1160c = new C0845nd(Float.class);

    /* JADX INFO: renamed from: d */
    private static final int[] f1161d = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    private float f1162A;

    /* JADX INFO: renamed from: B */
    private VelocityTracker f1163B;

    /* JADX INFO: renamed from: C */
    private int f1164C;

    /* JADX INFO: renamed from: D */
    private int f1165D;

    /* JADX INFO: renamed from: E */
    private int f1166E;

    /* JADX INFO: renamed from: F */
    private int f1167F;

    /* JADX INFO: renamed from: G */
    private int f1168G;

    /* JADX INFO: renamed from: H */
    private int f1169H;

    /* JADX INFO: renamed from: I */
    private int f1170I;

    /* JADX INFO: renamed from: J */
    private int f1171J;

    /* JADX INFO: renamed from: K */
    private boolean f1172K;

    /* JADX INFO: renamed from: L */
    private final TextPaint f1173L;

    /* JADX INFO: renamed from: M */
    private ColorStateList f1174M;

    /* JADX INFO: renamed from: N */
    private Layout f1175N;

    /* JADX INFO: renamed from: O */
    private Layout f1176O;

    /* JADX INFO: renamed from: P */
    private TransformationMethod f1177P;

    /* JADX INFO: renamed from: Q */
    private final C0749jp f1178Q;

    /* JADX INFO: renamed from: R */
    private final Rect f1179R;

    /* JADX INFO: renamed from: S */
    private aie f1180S;

    /* JADX INFO: renamed from: a */
    public float f1181a;

    /* JADX INFO: renamed from: b */
    ObjectAnimator f1182b;

    /* JADX INFO: renamed from: e */
    private Drawable f1183e;

    /* JADX INFO: renamed from: f */
    private ColorStateList f1184f;

    /* JADX INFO: renamed from: g */
    private PorterDuff.Mode f1185g;

    /* JADX INFO: renamed from: h */
    private boolean f1186h;

    /* JADX INFO: renamed from: i */
    private boolean f1187i;

    /* JADX INFO: renamed from: j */
    private Drawable f1188j;

    /* JADX INFO: renamed from: k */
    private ColorStateList f1189k;

    /* JADX INFO: renamed from: l */
    private PorterDuff.Mode f1190l;

    /* JADX INFO: renamed from: m */
    private boolean f1191m;

    /* JADX INFO: renamed from: n */
    private boolean f1192n;

    /* JADX INFO: renamed from: o */
    private int f1193o;

    /* JADX INFO: renamed from: p */
    private int f1194p;

    /* JADX INFO: renamed from: q */
    private int f1195q;

    /* JADX INFO: renamed from: r */
    private boolean f1196r;

    /* JADX INFO: renamed from: s */
    private CharSequence f1197s;

    /* JADX INFO: renamed from: t */
    private CharSequence f1198t;

    /* JADX INFO: renamed from: u */
    private CharSequence f1199u;

    /* JADX INFO: renamed from: v */
    private CharSequence f1200v;

    /* JADX INFO: renamed from: w */
    private boolean f1201w;

    /* JADX INFO: renamed from: x */
    private int f1202x;

    /* JADX INFO: renamed from: y */
    private int f1203y;

    /* JADX INFO: renamed from: z */
    private float f1204z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    private final int m1305g() {
        return (int) (((C0864nw.m17748a(this) ? 1.0f - this.f1181a : this.f1181a) * m1306h()) + 0.5f);
    }

    /* JADX INFO: renamed from: h */
    private final int m1306h() {
        Drawable drawable = this.f1188j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1179R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1183e;
        Rect rectM14231b = drawable2 != null ? C0768kh.m14231b(drawable2) : C0768kh.f36003a;
        return ((((this.f1165D - this.f1167F) - rect.left) - rect.right) - rectM14231b.left) - rectM14231b.right;
    }

    /* JADX INFO: renamed from: i */
    private final Layout m1307i(CharSequence charSequence) {
        TextPaint textPaint = this.f1173L;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX INFO: renamed from: j */
    private final CharSequence m1308j(CharSequence charSequence) {
        aie aieVarM1311m = m1311m();
        TransformationMethod transformationMethod = this.f1177P;
        Object obj = aieVarM1311m.f427b;
        ajf.m803d();
        return transformationMethod != null ? transformationMethod.getTransformation(charSequence, this) : charSequence;
    }

    /* JADX INFO: renamed from: k */
    private final void m1309k() {
        if (((ajf) ((bkn) this.f1180S.f427b).f3651a).f487a.f486a) {
            aix aixVar = aix.f474a;
        }
    }

    /* JADX INFO: renamed from: l */
    private final boolean m1310l() {
        return this.f1181a > 0.5f;
    }

    /* JADX INFO: renamed from: m */
    private final aie m1311m() {
        if (this.f1180S == null) {
            this.f1180S = new aie(this);
        }
        return this.f1180S;
    }

    /* JADX INFO: renamed from: a */
    public final void m1312a() {
        CharSequence string = this.f1199u;
        if (string == null) {
            string = getResources().getString(C0100R.string.abc_capital_off);
        }
        afo.m539b(this, string);
    }

    /* JADX INFO: renamed from: b */
    public final void m1313b() {
        CharSequence string = this.f1197s;
        if (string == null) {
            string = getResources().getString(C0100R.string.abc_capital_on);
        }
        afo.m539b(this, string);
    }

    /* JADX INFO: renamed from: c */
    public final void m1314c(Typeface typeface) {
        if ((this.f1173L.getTypeface() == null || this.f1173L.getTypeface().equals(typeface)) && (this.f1173L.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f1173L.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public final void m1315d(CharSequence charSequence) {
        this.f1199u = charSequence;
        this.f1200v = m1308j(charSequence);
        this.f1176O = null;
        if (this.f1201w) {
            m1309k();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f1179R;
        int i3 = this.f1168G;
        int i4 = this.f1169H;
        int i5 = this.f1170I;
        int i6 = this.f1171J;
        int iM1305g = m1305g() + i3;
        Drawable drawable = this.f1183e;
        Rect rectM14231b = drawable != null ? C0768kh.m14231b(drawable) : C0768kh.f36003a;
        Drawable drawable2 = this.f1188j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            iM1305g += rect.left;
            if (rectM14231b != null) {
                if (rectM14231b.left > rect.left) {
                    i3 += rectM14231b.left - rect.left;
                }
                i = rectM14231b.top > rect.top ? (rectM14231b.top - rect.top) + i4 : i4;
                if (rectM14231b.right > rect.right) {
                    i5 -= rectM14231b.right - rect.right;
                }
                if (rectM14231b.bottom > rect.bottom) {
                    i2 = i6 - (rectM14231b.bottom - rect.bottom);
                }
                this.f1188j.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1188j.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1183e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i7 = iM1305g - rect.left;
            int i8 = iM1305g + this.f1167F + rect.right;
            this.f1183e.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                acv.m236e(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1183e;
        if (drawable != null) {
            acv.m235d(drawable, f, f2);
        }
        Drawable drawable2 = this.f1188j;
        if (drawable2 != null) {
            acv.m235d(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1183e;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1188j;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1316e(CharSequence charSequence) {
        this.f1197s = charSequence;
        this.f1198t = m1308j(charSequence);
        this.f1175N = null;
        if (this.f1201w) {
            m1309k();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1317f(float f) {
        this.f1181a = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!C0864nw.m17748a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1165D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1195q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (C0864nw.m17748a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1165D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1195q : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        abm.m140g(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1183e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1188j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1182b;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1182b.end();
        this.f1182b = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f1161d);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1179R;
        Drawable drawable = this.f1188j;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f1169H;
        int i2 = this.f1171J;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f1183e;
        if (drawable != null) {
            if (!this.f1196r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM14231b = C0768kh.m14231b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM14231b.left;
                rect.right -= rectM14231b.right;
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
        Layout layout = m1310l() ? this.f1175N : this.f1176O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1174M;
            if (colorStateList != null) {
                this.f1173L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1173L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
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
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int paddingTop;
        int height;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f1183e != null) {
            Rect rect = this.f1179R;
            Drawable drawable = this.f1188j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM14231b = C0768kh.m14231b(this.f1183e);
            iMax = Math.max(0, rectM14231b.left - rect.left);
            iMax2 = Math.max(0, rectM14231b.right - rect.right);
        } else {
            iMax = 0;
        }
        if (C0864nw.m17748a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f1165D + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f1165D) + iMax + iMax2;
        }
        switch (getGravity() & 112) {
            case 16:
                int paddingTop2 = (getPaddingTop() + getHeight()) - getPaddingBottom();
                int i5 = this.f1166E;
                int i6 = (paddingTop2 / 2) - (i5 / 2);
                int i7 = i5 + i6;
                paddingTop = i6;
                height = i7;
                break;
            case 80:
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f1166E;
                break;
            default:
                paddingTop = getPaddingTop();
                height = this.f1166E + paddingTop;
                break;
        }
        this.f1168G = paddingLeft;
        this.f1169H = paddingTop;
        this.f1171J = height;
        this.f1170I = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int i3;
        int iMax;
        if (this.f1201w) {
            if (this.f1175N == null) {
                this.f1175N = m1307i(this.f1198t);
            }
            if (this.f1176O == null) {
                this.f1176O = m1307i(this.f1200v);
            }
        }
        Rect rect = this.f1179R;
        Drawable drawable = this.f1183e;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1183e.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1183e.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f1201w) {
            int iMax2 = Math.max(this.f1175N.getWidth(), this.f1176O.getWidth());
            int i4 = this.f1193o;
            i3 = iMax2 + i4 + i4;
        } else {
            i3 = 0;
        }
        this.f1167F = Math.max(i3, intrinsicWidth);
        Drawable drawable2 = this.f1188j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1188j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax3 = rect.left;
        int iMax4 = rect.right;
        Drawable drawable3 = this.f1183e;
        if (drawable3 != null) {
            Rect rectM14231b = C0768kh.m14231b(drawable3);
            iMax3 = Math.max(iMax3, rectM14231b.left);
            iMax4 = Math.max(iMax4, rectM14231b.right);
        }
        if (this.f1172K) {
            int i5 = this.f1194p;
            int i6 = this.f1167F;
            iMax = Math.max(i5, i6 + i6 + iMax3 + iMax4);
        } else {
            iMax = this.f1194p;
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f1165D = iMax;
        this.f1166E = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1197s : this.f1199u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cf  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM1310l;
        this.f1163B.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled() && this.f1183e != null) {
                    int iM1305g = m1305g();
                    this.f1183e.getPadding(this.f1179R);
                    int i = this.f1169H;
                    int i2 = this.f1203y;
                    int i3 = i - i2;
                    int i4 = (this.f1168G + iM1305g) - i2;
                    int i5 = this.f1167F + i4 + this.f1179R.left + this.f1179R.right;
                    int i6 = this.f1203y;
                    int i7 = i5 + i6;
                    int i8 = this.f1171J + i6;
                    if (x > i4 && x < i7 && y > i3 && y < i8) {
                        this.f1202x = 1;
                        this.f1204z = x;
                        this.f1162A = y;
                    }
                }
                break;
            case 1:
            case 3:
                if (this.f1202x == 2) {
                    this.f1202x = 0;
                    boolean z = motionEvent.getAction() == 1 && isEnabled();
                    boolean zIsChecked = isChecked();
                    if (z) {
                        this.f1163B.computeCurrentVelocity(1000);
                        float xVelocity = this.f1163B.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f1164C) {
                            zM1310l = m1310l();
                        } else if (C0864nw.m17748a(this)) {
                            if (xVelocity < 0.0f) {
                                zM1310l = true;
                            } else {
                                zM1310l = false;
                            }
                        } else if (xVelocity > 0.0f) {
                            zM1310l = true;
                        } else {
                            zM1310l = false;
                        }
                    } else {
                        zM1310l = zIsChecked;
                    }
                    if (zM1310l != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(zM1310l);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f1202x = 0;
                this.f1163B.clear();
                break;
            case 2:
                switch (this.f1202x) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.f1204z) > this.f1203y || Math.abs(y2 - this.f1162A) > this.f1203y) {
                            this.f1202x = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f1204z = x2;
                            this.f1162A = y2;
                            return true;
                        }
                        break;
                    case 2:
                        float x3 = motionEvent.getX();
                        int iM1306h = m1306h();
                        float f = x3 - this.f1204z;
                        float f2 = iM1306h != 0 ? f / iM1306h : f > 0.0f ? 1.0f : -1.0f;
                        if (C0864nw.m17748a(this)) {
                            f2 = -f2;
                        }
                        float f3 = this.f1181a;
                        float f4 = f2 + f3;
                        float f5 = f4 >= 0.0f ? f4 > 1.0f ? 1.0f : f4 : 0.0f;
                        if (f5 != f3) {
                            this.f1204z = x3;
                            m1317f(f5);
                        }
                        return true;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m1311m();
        ajf.m803d();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            m1313b();
        } else {
            m1312a();
        }
        if (getWindowToken() == null || !afe.m462f(this)) {
            ObjectAnimator objectAnimator = this.f1182b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            m1317f(true == zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f1160c, true == zIsChecked ? 1.0f : 0.0f);
        this.f1182b = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        C0846ne.m17389a(this.f1182b, true);
        this.f1182b.start();
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        m1311m();
        ajf.m803d();
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1183e || drawable == this.f1188j;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        Typeface typeface;
        super(context, attributeSet, i);
        this.f1184f = null;
        this.f1185g = null;
        this.f1186h = false;
        this.f1187i = false;
        this.f1189k = null;
        this.f1190l = null;
        this.f1191m = false;
        this.f1192n = false;
        this.f1163B = VelocityTracker.obtain();
        this.f1172K = true;
        this.f1179R = new Rect();
        C0847nf.m17435d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1173L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        AmbientDelegate ambientDelegateM1568D = AmbientDelegate.m1568D(context, attributeSet, C0193fr.f23278v, i, 0);
        afn.m536c(this, context, C0193fr.f23278v, attributeSet, (TypedArray) ambientDelegateM1568D.f1686b, i, 0);
        Drawable drawableM1618u = ambientDelegateM1568D.m1618u(2);
        this.f1183e = drawableM1618u;
        if (drawableM1618u != null) {
            drawableM1618u.setCallback(this);
        }
        Drawable drawableM1618u2 = ambientDelegateM1568D.m1618u(11);
        this.f1188j = drawableM1618u2;
        if (drawableM1618u2 != null) {
            drawableM1618u2.setCallback(this);
        }
        m1316e(ambientDelegateM1568D.m1620w(0));
        m1315d(ambientDelegateM1568D.m1620w(1));
        this.f1201w = ambientDelegateM1568D.m1623z(3, true);
        this.f1193o = ambientDelegateM1568D.m1612o(8, 0);
        this.f1194p = ambientDelegateM1568D.m1612o(5, 0);
        this.f1195q = ambientDelegateM1568D.m1612o(6, 0);
        this.f1196r = ambientDelegateM1568D.m1623z(4, false);
        ColorStateList colorStateListM1617t = ambientDelegateM1568D.m1617t(9);
        if (colorStateListM1617t != null) {
            this.f1184f = colorStateListM1617t;
            this.f1186h = true;
        }
        PorterDuff.Mode modeM14230a = C0768kh.m14230a(ambientDelegateM1568D.m1613p(10, -1), null);
        if (this.f1185g != modeM14230a) {
            this.f1185g = modeM14230a;
            this.f1187i = true;
        }
        boolean z = this.f1186h;
        if ((z || this.f1187i) && (drawable = this.f1183e) != null && (z || this.f1187i)) {
            Drawable drawableMutate = drawable.mutate();
            this.f1183e = drawableMutate;
            if (this.f1186h) {
                acv.m238g(drawableMutate, this.f1184f);
            }
            if (this.f1187i) {
                acv.m239h(this.f1183e, this.f1185g);
            }
            if (this.f1183e.isStateful()) {
                this.f1183e.setState(getDrawableState());
            }
        }
        ColorStateList colorStateListM1617t2 = ambientDelegateM1568D.m1617t(12);
        if (colorStateListM1617t2 != null) {
            this.f1189k = colorStateListM1617t2;
            this.f1191m = true;
        }
        PorterDuff.Mode modeM14230a2 = C0768kh.m14230a(ambientDelegateM1568D.m1613p(13, -1), null);
        if (this.f1190l != modeM14230a2) {
            this.f1190l = modeM14230a2;
            this.f1192n = true;
        }
        boolean z2 = this.f1191m;
        if ((z2 || this.f1192n) && (drawable2 = this.f1188j) != null && (z2 || this.f1192n)) {
            Drawable drawableMutate2 = drawable2.mutate();
            this.f1188j = drawableMutate2;
            if (this.f1191m) {
                acv.m238g(drawableMutate2, this.f1189k);
            }
            if (this.f1192n) {
                acv.m239h(this.f1188j, this.f1190l);
            }
            if (this.f1188j.isStateful()) {
                this.f1188j.setState(getDrawableState());
            }
        }
        int iM1616s = ambientDelegateM1568D.m1616s(7, 0);
        if (iM1616s != 0) {
            AmbientDelegate ambientDelegateM1566B = AmbientDelegate.m1566B(context, iM1616s, C0193fr.f23279w);
            ColorStateList colorStateListM1617t3 = ambientDelegateM1566B.m1617t(3);
            if (colorStateListM1617t3 != null) {
                this.f1174M = colorStateListM1617t3;
            } else {
                this.f1174M = getTextColors();
            }
            int iM1612o = ambientDelegateM1566B.m1612o(0, 0);
            if (iM1612o != 0) {
                float f = iM1612o;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int iM1613p = ambientDelegateM1566B.m1613p(1, -1);
            int iM1613p2 = ambientDelegateM1566B.m1613p(2, -1);
            switch (iM1613p) {
                case 1:
                    typeface = Typeface.SANS_SERIF;
                    break;
                case 2:
                    typeface = Typeface.SERIF;
                    break;
                case 3:
                    typeface = Typeface.MONOSPACE;
                    break;
                default:
                    typeface = null;
                    break;
            }
            if (iM1613p2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(iM1613p2) : Typeface.create(typeface, iM1613p2);
                m1314c(typefaceDefaultFromStyle);
                int style = ((typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0) ^ (-1)) & iM1613p2;
                textPaint.setFakeBoldText(1 == (style & 1));
                textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                m1314c(typeface);
            }
            if (ambientDelegateM1566B.m1623z(17, false)) {
                this.f1177P = new C0197fv(getContext());
            } else {
                this.f1177P = null;
            }
            m1316e(this.f1197s);
            m1315d(this.f1199u);
            ambientDelegateM1566B.m1622y();
        }
        C0749jp c0749jp = new C0749jp(this);
        this.f1178Q = c0749jp;
        c0749jp.m13417b(attributeSet, i);
        ambientDelegateM1568D.m1622y();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1203y = viewConfiguration.getScaledTouchSlop();
        this.f1164C = viewConfiguration.getScaledMinimumFlingVelocity();
        m1311m().m769n(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
