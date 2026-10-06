package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: ox */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C0892ox extends View {

    /* JADX INFO: renamed from: f */
    private static final double f46749f = Math.sqrt(2.0d);

    /* JADX INFO: renamed from: a */
    public final ShapeDrawable f46750a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f46751b;

    /* JADX INFO: renamed from: c */
    public Drawable f46752c;

    /* JADX INFO: renamed from: d */
    public int f46753d;

    /* JADX INFO: renamed from: e */
    public int f46754e;

    /* JADX INFO: renamed from: g */
    private RippleDrawable f46755g;

    /* JADX INFO: renamed from: h */
    private final Interpolator f46756h;

    public C0892ox(Context context) {
        super(context, null, 0, 0);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.f46750a = shapeDrawable;
        shapeDrawable.getPaint().setColor(-3355444);
        super.setBackgroundDrawable(shapeDrawable);
        setOutlineProvider(new C0891ow(this));
        this.f46756h = new AccelerateInterpolator(2.0f);
        this.f46754e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C0866ny.f44991d, 0, 0);
        boolean z = true;
        for (int i = 0; i < typedArrayObtainStyledAttributes.getIndexCount(); i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.f46751b = typedArrayObtainStyledAttributes.getColorStateList(2);
                this.f46750a.getPaint().setColor(this.f46751b.getDefaultColor());
            } else if (index == 1) {
                this.f46752c = typedArrayObtainStyledAttributes.getDrawable(1);
            } else if (index == 5) {
                m19120b(typedArrayObtainStyledAttributes.getColor(5, -1));
            } else if (index == 7) {
                m19119a(typedArrayObtainStyledAttributes.getDimension(7, 0.0f));
            } else if (index == 6) {
                this.f46754e = typedArrayObtainStyledAttributes.getInt(6, this.f46754e);
            } else if (index == 0) {
                z = typedArrayObtainStyledAttributes.getBoolean(0, z);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        setClickable(z);
    }

    /* JADX INFO: renamed from: c */
    private static boolean m19117c(Drawable drawable) {
        return drawable != null && drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0;
    }

    /* JADX INFO: renamed from: d */
    private final void m19118d(Animator animator) {
        animator.setInterpolator(this.f46756h);
    }

    /* JADX INFO: renamed from: a */
    public final void m19119a(float f) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        int[] iArr = PRESSED_ENABLED_STATE_SET;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationZ", f);
        m19118d(objectAnimatorOfFloat);
        stateListAnimator.addState(iArr, objectAnimatorOfFloat);
        int[] iArr2 = ENABLED_FOCUSED_STATE_SET;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "translationZ", f);
        m19118d(objectAnimatorOfFloat2);
        stateListAnimator.addState(iArr2, objectAnimatorOfFloat2);
        int[] iArr3 = EMPTY_STATE_SET;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "translationZ", getElevation());
        m19118d(objectAnimatorOfFloat3);
        stateListAnimator.addState(iArr3, objectAnimatorOfFloat3);
        setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: renamed from: b */
    public final void m19120b(int i) {
        RippleDrawable rippleDrawable = this.f46755g;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ColorStateList.valueOf(i));
            return;
        }
        if (i == -1 || isInEditMode()) {
            this.f46755g = null;
            super.setBackgroundDrawable(this.f46750a);
            return;
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        ShapeDrawable shapeDrawable = this.f46750a;
        RippleDrawable rippleDrawable2 = new RippleDrawable(colorStateListValueOf, shapeDrawable, shapeDrawable);
        this.f46755g = rippleDrawable2;
        super.setBackgroundDrawable(rippleDrawable2);
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.f46751b;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        this.f46750a.getPaint().setColor(this.f46751b.getColorForState(getDrawableState(), this.f46751b.getDefaultColor()));
        this.f46750a.invalidateSelf();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.f46752c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        Drawable drawable = this.f46752c;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.f46752c.getIntrinsicHeight();
            if (this.f46754e != 0 && m19117c(this.f46752c)) {
                int i7 = (int) (((i3 - i) - intrinsicWidth) / 2.0f);
                int i8 = (int) (((i4 - i2) - intrinsicHeight) / 2.0f);
                this.f46752c.setBounds(i7, i8, intrinsicWidth + i7, intrinsicHeight + i8);
                return;
            }
            double d = this.f46753d / 2;
            double d2 = f46749f;
            Double.isNaN(d);
            int iFloor = (int) Math.floor(d * d2);
            int i9 = (this.f46753d - iFloor) / 2;
            if (!m19117c(this.f46752c)) {
                int i10 = iFloor + i9;
                this.f46752c.setBounds(i9, i9, i10, i10);
                return;
            }
            if (intrinsicWidth == intrinsicHeight) {
                i5 = iFloor;
                i6 = i9;
            } else {
                float f = intrinsicWidth / intrinsicHeight;
                if (intrinsicWidth > intrinsicHeight) {
                    i5 = (int) (iFloor / f);
                    i6 = (int) ((iFloor - i5) / 2.0f);
                } else {
                    int i11 = (int) (iFloor * f);
                    int i12 = (int) ((iFloor - i11) / 2.0f);
                    iFloor = i11;
                    i5 = iFloor;
                    i6 = i9;
                    i9 = i12;
                }
            }
            this.f46752c.setBounds(i9, i6, iFloor + i9, i5 + i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iCeil;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (mode == 1073741824) {
                this.f46753d = size;
            } else if (mode2 == 1073741824) {
                this.f46753d = size2;
                size = size2;
            } else {
                if (m19117c(this.f46752c)) {
                    iCeil = Math.max(this.f46752c.getIntrinsicHeight(), this.f46752c.getIntrinsicWidth());
                } else {
                    iCeil = (int) Math.ceil(TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
                }
                if (mode != Integer.MIN_VALUE || mode2 == Integer.MIN_VALUE) {
                    if (mode != Integer.MIN_VALUE) {
                        size = size2;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        size = Math.min(size, size2);
                    }
                    double d = iCeil;
                    double d2 = f46749f;
                    Double.isNaN(d);
                    int iFloor = (int) Math.floor(d / d2);
                    size = Math.min(size, iFloor + iFloor);
                    this.f46753d = size;
                } else {
                    this.f46753d = iCeil;
                    size = iCeil;
                }
            }
        } else if (mode2 == 1073741824) {
            size = Math.min(size, size2);
            this.f46753d = size;
        } else {
            mode = 1073741824;
            if (mode == 1073741824) {
                this.f46753d = size;
            } else if (mode2 == 1073741824) {
                this.f46753d = size2;
                size = size2;
            } else {
                if (m19117c(this.f46752c)) {
                    iCeil = Math.max(this.f46752c.getIntrinsicHeight(), this.f46752c.getIntrinsicWidth());
                } else {
                    iCeil = (int) Math.ceil(TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
                }
                if (mode != Integer.MIN_VALUE) {
                    if (mode != Integer.MIN_VALUE) {
                        size = size2;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        size = Math.min(size, size2);
                    }
                    double d3 = iCeil;
                    double d4 = f46749f;
                    Double.isNaN(d3);
                    int iFloor2 = (int) Math.floor(d3 / d4);
                    size = Math.min(size, iFloor2 + iFloor2);
                    this.f46753d = size;
                } else {
                    if (mode != Integer.MIN_VALUE) {
                        size = size2;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        size = Math.min(size, size2);
                    }
                    double d5 = iCeil;
                    double d6 = f46749f;
                    Double.isNaN(d5);
                    int iFloor3 = (int) Math.floor(d5 / d6);
                    size = Math.min(size, iFloor3 + iFloor3);
                    this.f46753d = size;
                }
            }
        }
        setMeasuredDimension(size, size);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            switch (motionEvent.getAction() & 255) {
                case 0:
                    getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
                    return true;
            }
        }
        return zOnTouchEvent;
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return this.f46752c == drawable || super.verifyDrawable(drawable);
    }
}
