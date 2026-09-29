package androidx.media3.p004ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p000.InterfaceC3699vv;
import p000.RunnableC3736wv;

/* JADX INFO: loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f6515d = 0;

    /* JADX INFO: renamed from: a */
    public final RunnableC3736wv f6516a;

    /* JADX INFO: renamed from: b */
    public float f6517b;

    /* JADX INFO: renamed from: c */
    public int f6518c;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6518c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.f6518c = typedArrayObtainStyledAttributes.getInt(R$styleable.AspectRatioFrameLayout_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f6516a = new RunnableC3736wv(this);
    }

    public int getResizeMode() {
        return this.f6518c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r4 > 0.0f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r2 = r2 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r1 = r1 / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r4 > 0.0f) goto L23;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        if (this.f6517b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = measuredWidth;
        float f3 = measuredHeight;
        float f4 = (this.f6517b / (f2 / f3)) - 1.0f;
        float fAbs = Math.abs(f4);
        RunnableC3736wv runnableC3736wv = this.f6516a;
        if (fAbs <= 0.01f) {
            if (runnableC3736wv.f67327b) {
                return;
            }
            runnableC3736wv.f67327b = true;
            ((AspectRatioFrameLayout) runnableC3736wv.f67328c).post(runnableC3736wv);
            return;
        }
        int i3 = this.f6518c;
        if (i3 == 0) {
            f = this.f6517b;
        } else if (i3 == 1) {
            float f5 = f2 / this.f6517b;
            measuredHeight = (int) f5;
        } else if (i3 == 2) {
            float f6 = f3 * this.f6517b;
            measuredWidth = (int) f6;
        } else if (i3 == 4) {
            f = this.f6517b;
        }
        if (!runnableC3736wv.f67327b) {
            runnableC3736wv.f67327b = true;
            ((AspectRatioFrameLayout) runnableC3736wv.f67328c).post(runnableC3736wv);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f6517b != f) {
            this.f6517b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC3699vv interfaceC3699vv) {
    }

    public void setResizeMode(int i) {
        if (this.f6518c != i) {
            this.f6518c = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }
}
