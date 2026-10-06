package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class iwi extends ConstraintLayout implements Checkable {

    /* JADX INFO: renamed from: a */
    static final int[] f32469a = {-16842910};

    /* JADX INFO: renamed from: b */
    static final int[] f32470b = {R.attr.state_enabled, -16842912};

    /* JADX INFO: renamed from: c */
    static final int[] f32471c = {R.attr.state_enabled, R.attr.state_checked};

    /* JADX INFO: renamed from: j */
    private static final int[] f32472j = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    protected ColorStateList f32473d;

    /* JADX INFO: renamed from: e */
    protected ColorStateList f32474e;

    /* JADX INFO: renamed from: f */
    public ImageView f32475f;

    /* JADX INFO: renamed from: g */
    protected boolean f32476g;

    /* JADX INFO: renamed from: h */
    protected boolean f32477h;

    /* JADX INFO: renamed from: i */
    protected boolean f32478i;

    /* JADX INFO: renamed from: k */
    private ColorStateList f32479k;

    /* JADX INFO: renamed from: l */
    private ColorStateList f32480l;

    /* JADX INFO: renamed from: m */
    private final Set f32481m;

    public iwi(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m11822a(int i, int i2) {
        return new ColorStateList(new int[][]{f32470b, f32471c, f32469a}, new int[]{i2, i, i2});
    }

    /* JADX INFO: renamed from: g */
    private static int m11823g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        return colorStateList.getColorForState(f32471c, 0);
    }

    /* JADX INFO: renamed from: h */
    private static int m11824h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        return colorStateList.getColorForState(f32470b, 0);
    }

    /* JADX INFO: renamed from: b */
    public final String m11825b() {
        return (true != this.f32477h ? Button.class : CompoundButton.class).getName();
    }

    /* JADX INFO: renamed from: c */
    protected void mo4591c(ColorStateList colorStateList) {
        Drawable background = getBackground();
        if (background != null) {
            background.mutate().setTintList(colorStateList);
        }
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: d */
    protected final void m11826d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM11822a;
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, iwf.f32464a, i, C0100R.style.WearButtonDefault);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(4) || typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(3) || typedArrayObtainStyledAttributes.hasValue(7);
            if (typedArrayObtainStyledAttributes.hasValue(10)) {
                mo4592f(typedArrayObtainStyledAttributes.getResourceId(10, 0));
            }
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(6);
            if (colorStateList == null) {
                colorStateList = this.f32473d;
            }
            this.f32479k = colorStateList;
            ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(5);
            if (colorStateList2 == null) {
                colorStateList2 = this.f32474e;
            }
            this.f32480l = colorStateList2;
            if (z) {
                int color = typedArrayObtainStyledAttributes.getColor(4, m11823g(this.f32479k));
                int color2 = typedArrayObtainStyledAttributes.getColor(8, m11824h(this.f32479k));
                if (color != 0) {
                    colorStateListM11822a = m11822a(color, color2);
                } else if (color2 == 0) {
                    colorStateListM11822a = null;
                } else {
                    color = 0;
                    colorStateListM11822a = m11822a(color, color2);
                }
                this.f32479k = colorStateListM11822a;
                this.f32480l = m11822a(typedArrayObtainStyledAttributes.getColor(3, m11823g(this.f32480l)), typedArrayObtainStyledAttributes.getColor(7, m11824h(this.f32480l)));
            }
            this.f32475f.setImageTintList(this.f32479k);
            mo4591c(this.f32480l);
            int dimension = (int) typedArrayObtainStyledAttributes.getDimension(9, 0.0f);
            Drawable background = getBackground();
            if (background instanceof LayerDrawable) {
                background = ((LayerDrawable) background).findDrawableByLayerId(R.id.background);
            }
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setCornerRadius(dimension);
            }
            setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
            m11827e(typedArrayObtainStyledAttributes.getBoolean(2, false));
            setChecked(typedArrayObtainStyledAttributes.getBoolean(1, false));
            this.f32478i = typedArrayObtainStyledAttributes.getBoolean(12, false);
            setClipToOutline(true);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11827e(boolean z) {
        this.f32477h = z | (getParent() instanceof iwj);
        refreshDrawableState();
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo4592f(int i);

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f32476g;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof iwj) {
            m11827e(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f32476g) {
            mergeDrawableStates(iArrOnCreateDrawableState, f32472j);
        }
        ColorStateList colorStateList = this.f32480l;
        double dM209a = acp.m209a(acp.m211c(colorStateList == null ? 0 : colorStateList.getColorForState(iArrOnCreateDrawableState, 0), -16777216));
        int length = iArrOnCreateDrawableState.length;
        int i2 = length - 1;
        int i3 = i2;
        while (i3 >= 0 && iArrOnCreateDrawableState[i3] == 0) {
            i3--;
        }
        if (i3 == i2) {
            int[] iArr = new int[length + 1];
            System.arraycopy(iArrOnCreateDrawableState, 0, iArr, 0, length);
            iArrOnCreateDrawableState = iArr;
        }
        iArrOnCreateDrawableState[i3 + 1] = dM209a >= 0.5d ? C0100R.attr.state_light : -2130970110;
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f32477h && isEnabled() && this.f32478i) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate().setTintMode(PorterDuff.Mode.SRC_ATOP);
        }
        super.setBackground(drawable);
        mo4591c(this.f32480l);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        this.f32480l = colorStateListValueOf;
        mo4591c(colorStateListValueOf);
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        if (!this.f32477h || z == this.f32476g) {
            return;
        }
        this.f32476g = z;
        refreshDrawableState();
        for (jzn jznVar : Collections.unmodifiableSet(this.f32481m)) {
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f32476g);
    }

    public iwi(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.wearButtonStyle);
    }

    public iwi(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32476g = false;
        HashSet hashSet = new HashSet();
        this.f32481m = hashSet;
        this.f32473d = null;
        int iM12862g = jbx.m12862g(context, C0100R.attr.colorOnPrimary);
        this.f32474e = m11822a(iM12862g, iM12862g);
        hashSet.add(new jzn());
        afq.m547g(this, new iwh(this));
    }
}
