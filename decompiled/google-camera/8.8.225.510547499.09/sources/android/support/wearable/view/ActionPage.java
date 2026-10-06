package android.support.wearable.view;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C0866ny;
import p000.C0889ou;
import p000.C0892ox;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ActionPage extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private final C0889ou f1351a;

    /* JADX INFO: renamed from: b */
    private C0892ox f1352b;

    /* JADX INFO: renamed from: c */
    private int f1353c;

    /* JADX INFO: renamed from: d */
    private float f1354d;

    /* JADX INFO: renamed from: e */
    private final Point f1355e;

    /* JADX INFO: renamed from: f */
    private int f1356f;

    /* JADX INFO: renamed from: g */
    private int f1357g;

    /* JADX INFO: renamed from: h */
    private boolean f1358h;

    /* JADX INFO: renamed from: i */
    private int f1359i;

    /* JADX INFO: renamed from: j */
    private boolean f1360j;

    public ActionPage(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.f1360j = true;
        if (this.f1358h != windowInsets.isRound()) {
            this.f1358h = windowInsets.isRound();
            requestLayout();
        }
        int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
        if (this.f1359i != systemWindowInsetBottom) {
            this.f1359i = systemWindowInsetBottom;
            requestLayout();
        }
        if (this.f1358h) {
            this.f1359i = (int) Math.max(this.f1359i, getMeasuredHeight() * 0.09375f);
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1360j) {
            return;
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1352b.layout((int) (this.f1355e.x - this.f1354d), (int) (this.f1355e.y - this.f1354d), (int) (this.f1355e.x + this.f1354d), (int) (this.f1355e.y + this.f1354d));
        int i5 = (int) (((i3 - i) - this.f1356f) / 2.0f);
        this.f1351a.layout(i5, this.f1352b.getBottom(), this.f1356f + i5, this.f1352b.getBottom() + this.f1357g);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        C0892ox c0892ox = this.f1352b;
        if (c0892ox.f46754e != 1 || c0892ox.f46752c == null) {
            int iMin = (int) (Math.min(measuredWidth, measuredHeight) * 0.45f);
            this.f1353c = iMin;
            this.f1354d = iMin / 2.0f;
            this.f1352b.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1353c, 1073741824));
        } else {
            c0892ox.measure(0, 0);
            int iMin2 = Math.min(this.f1352b.getMeasuredWidth(), this.f1352b.getMeasuredHeight());
            this.f1353c = iMin2;
            this.f1354d = iMin2 / 2.0f;
        }
        if (this.f1358h) {
            this.f1355e.set(measuredWidth / 2, measuredHeight / 2);
            this.f1356f = (int) (measuredWidth * 0.625f);
            this.f1359i = (int) (measuredHeight * 0.09375f);
        } else {
            this.f1355e.set(measuredWidth / 2, (int) (measuredHeight * 0.43f));
            this.f1356f = (int) (measuredWidth * 0.892f);
        }
        this.f1357g = (int) ((measuredHeight - (this.f1355e.y + this.f1354d)) - this.f1359i);
        this.f1351a.measure(View.MeasureSpec.makeMeasureSpec(this.f1356f, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1357g, 1073741824));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        C0892ox c0892ox = this.f1352b;
        if (c0892ox != null) {
            c0892ox.setEnabled(z);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        C0892ox c0892ox = this.f1352b;
        if (c0892ox != null) {
            c0892ox.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public final void setStateListAnimator(StateListAnimator stateListAnimator) {
        C0892ox c0892ox = this.f1352b;
        if (c0892ox != null) {
            c0892ox.setStateListAnimator(stateListAnimator);
        }
    }

    public ActionPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionPage(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C0100R.style.Widget_ActionPage);
    }

    public ActionPage(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1355e = new Point();
        this.f1352b = new C0892ox(context);
        C0889ou c0889ou = new C0889ou(context);
        this.f1351a = c0889ou;
        c0889ou.m19075a(17);
        c0889ou.m19076b(2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0866ny.f44989b, i, i2);
        float dimension = 1.0f;
        String string = null;
        float dimension2 = 0.0f;
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 < typedArrayObtainStyledAttributes.getIndexCount(); i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            if (index == 7) {
                C0892ox c0892ox = this.f1352b;
                c0892ox.f46751b = typedArrayObtainStyledAttributes.getColorStateList(7);
                c0892ox.f46750a.getPaint().setColor(c0892ox.f46751b.getDefaultColor());
            } else if (index == 4) {
                C0892ox c0892ox2 = this.f1352b;
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(4);
                Drawable drawable2 = c0892ox2.f46752c;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                if (c0892ox2.f46752c != drawable) {
                    c0892ox2.f46752c = drawable;
                    c0892ox2.requestLayout();
                    c0892ox2.invalidate();
                }
                Drawable drawable3 = c0892ox2.f46752c;
                if (drawable3 != null) {
                    drawable3.setCallback(c0892ox2);
                }
            } else if (index == 14) {
                C0892ox c0892ox3 = this.f1352b;
                c0892ox3.f46754e = typedArrayObtainStyledAttributes.getInt(14, 0);
                if (c0892ox3.f46752c != null) {
                    c0892ox3.invalidate();
                    c0892ox3.requestLayout();
                }
            } else if (index == 13) {
                this.f1352b.m19120b(typedArrayObtainStyledAttributes.getColor(13, -1));
            } else if (index == 17) {
                this.f1352b.m19119a(typedArrayObtainStyledAttributes.getDimension(17, 0.0f));
            } else if (index == 5) {
                C0889ou c0889ou2 = this.f1351a;
                CharSequence text = typedArrayObtainStyledAttributes.getText(5);
                if (text == null) {
                    throw new RuntimeException("Can not set ActionLabel text to null");
                }
                if (!Objects.equals(c0889ou2.f46556c, text)) {
                    c0889ou2.f46554a = null;
                    c0889ou2.f46556c = text;
                    c0889ou2.requestLayout();
                    c0889ou2.invalidate();
                }
            } else if (index == 16) {
                C0889ou c0889ou3 = this.f1351a;
                float fApplyDimension = TypedValue.applyDimension(0, typedArrayObtainStyledAttributes.getDimension(16, 10.0f), c0889ou3.getContext().getResources().getDisplayMetrics());
                if (fApplyDimension != c0889ou3.f46559f) {
                    c0889ou3.f46554a = null;
                    c0889ou3.f46559f = fApplyDimension;
                    c0889ou3.requestLayout();
                    c0889ou3.invalidate();
                }
            } else if (index == 15) {
                C0889ou c0889ou4 = this.f1351a;
                float fApplyDimension2 = TypedValue.applyDimension(0, typedArrayObtainStyledAttributes.getDimension(15, 60.0f), c0889ou4.getContext().getResources().getDisplayMetrics());
                if (fApplyDimension2 != c0889ou4.f46560g) {
                    c0889ou4.f46554a = null;
                    c0889ou4.f46560g = fApplyDimension2;
                    c0889ou4.requestLayout();
                    c0889ou4.invalidate();
                }
            } else if (index == 2) {
                C0889ou c0889ou5 = this.f1351a;
                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(2);
                if (colorStateList == null) {
                    throw null;
                }
                c0889ou5.f46555b = colorStateList;
                c0889ou5.m19079e();
            } else if (index == 6) {
                this.f1351a.m19076b(typedArrayObtainStyledAttributes.getInt(6, 2));
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(10);
            } else if (index == 0) {
                i3 = typedArrayObtainStyledAttributes.getInt(0, i3);
            } else if (index == 1) {
                i4 = typedArrayObtainStyledAttributes.getInt(1, i4);
            } else if (index == 3) {
                this.f1351a.m19075a(typedArrayObtainStyledAttributes.getInt(3, 17));
            } else if (index == 8) {
                dimension2 = typedArrayObtainStyledAttributes.getDimension(8, dimension2);
            } else if (index == 9) {
                dimension = typedArrayObtainStyledAttributes.getDimension(9, dimension);
            } else if (index == 12) {
                this.f1352b.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayObtainStyledAttributes.getResourceId(12, 0)));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        C0889ou c0889ou6 = this.f1351a;
        if (c0889ou6.f46558e != dimension2 || c0889ou6.f46557d != dimension) {
            c0889ou6.f46558e = dimension2;
            c0889ou6.f46557d = dimension;
            if (c0889ou6.f46554a != null) {
                c0889ou6.f46554a = null;
                c0889ou6.requestLayout();
                c0889ou6.invalidate();
            }
        }
        this.f1351a.m19078d(string, i3, i4);
        addView(this.f1351a);
        addView(this.f1352b);
    }
}
