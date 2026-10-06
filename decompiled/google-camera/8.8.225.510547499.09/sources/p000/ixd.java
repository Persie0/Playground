package p000;

import android.graphics.Rect;
import android.provider.Settings;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BaseInterpolator;
import android.view.animation.PathInterpolator;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ixd {

    /* JADX INFO: renamed from: a */
    protected final ViewGroup f32535a;

    /* JADX INFO: renamed from: c */
    final boolean f32537c;

    /* JADX INFO: renamed from: e */
    private float f32539e;

    /* JADX INFO: renamed from: f */
    private float f32540f;

    /* JADX INFO: renamed from: i */
    private final AmbientMode.AmbientController f32543i;

    /* JADX INFO: renamed from: b */
    protected final Rect f32536b = new Rect();

    /* JADX INFO: renamed from: d */
    private final Rect f32538d = new Rect();

    /* JADX INFO: renamed from: g */
    private final BaseInterpolator f32541g = new PathInterpolator(0.3f, 0.0f, 0.7f, 1.0f);

    /* JADX INFO: renamed from: h */
    private final BaseInterpolator f32542h = new PathInterpolator(0.3f, 0.0f, 0.7f, 1.0f);

    public ixd(ViewGroup viewGroup, AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f32535a = viewGroup;
        this.f32543i = ambientController;
        this.f32537c = Settings.Global.getInt(viewGroup.getContext().getContentResolver(), "reduce_motion", 0) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final void m11847e(View view, float f) {
        view.setAlpha((f * 0.5f) + 0.5f);
        float f2 = (f * 0.3f) + 0.7f;
        view.setScaleX(f2);
        view.setScaleY(f2);
    }

    /* JADX INFO: renamed from: f */
    private final void m11848f(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    m11848f((ViewGroup) childAt, childAt instanceof iwr);
                }
                if (z) {
                    m11850b(childAt);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
    /* JADX INFO: renamed from: a */
    public final float m11849a(View view) {
        ViewGroup viewGroup = this.f32535a;
        Rect rect = this.f32538d;
        view.getDrawingRect(rect);
        boolean z = false;
        rect.offset(0, (int) view.getTranslationY());
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        Rect rect2 = new Rect();
        viewGroup.getGlobalVisibleRect(rect2);
        rect.offset(rect2.left, rect2.top);
        Rect rect3 = this.f32538d;
        view.getWidth();
        view.getHeight();
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
        float f = 0.35f;
        if (view.getHeight() < this.f32539e && view.getHeight() > this.f32540f) {
            float height = view.getHeight();
            float f2 = this.f32540f;
            f = 0.35f + (((height - f2) / (this.f32539e - f2)) * 0.20000002f);
        } else if (view.getHeight() >= this.f32540f) {
            f = 0.55f;
        }
        float fHeight = this.f32536b.height();
        AmbientMode.AmbientController ambientController = this.f32543i;
        if (!ambientController.m1650w(view) || ((RecyclerView) ambientController.f1697a).m1251c(view) != 0) {
            z = true;
        }
        int iMin = (int) (fHeight * f);
        if (z) {
            AmbientMode.AmbientController ambientController2 = this.f32543i;
            if (ambientController2.m1650w(view)) {
                int iM1251c = ((RecyclerView) ambientController2.f1697a).m1251c(view);
                AbstractC0806ls abstractC0806ls = ((RecyclerView) ambientController2.f1697a).f1123m;
                abstractC0806ls.getClass();
                if (iM1251c == abstractC0806ls.mo1762a() - 1) {
                    iMin = Math.min(iMin, view.getHeight());
                }
            }
        } else {
            iMin = Math.min(iMin, view.getHeight());
        }
        int i = this.f32536b.top + iMin;
        int i2 = this.f32536b.bottom - iMin;
        float scaleX = view.getScaleX();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.setPivotX((this.f32535a.getWidth() * 0.5f) - view.getLeft());
        if (marginLayoutParams == null) {
            return 1.0f;
        }
        if (rect3.top > i2) {
            view.setPivotY(-marginLayoutParams.topMargin);
            return this.f32542h.getInterpolation((this.f32536b.bottom - rect3.top) / iMin);
        }
        if (rect3.bottom >= i) {
            return scaleX == 1.0f ? 1.0f : 1.0f;
        }
        view.setPivotY(view.getMeasuredHeight() + marginLayoutParams.bottomMargin);
        return this.f32541g.getInterpolation((rect3.bottom - this.f32536b.top) / iMin);
    }

    /* JADX INFO: renamed from: b */
    final void m11850b(View view) {
        if (this.f32537c) {
            throw new IllegalStateException("Unexpected call when reduce_motion is activated");
        }
        if (m11852d(view)) {
            float fM11849a = m11849a(view);
            Object tag = view.getTag(C0100R.id.animating_item);
            if (tag == null || !((Boolean) tag).booleanValue()) {
                m11847e(view, fM11849a);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11851c() {
        if (this.f32537c) {
            return;
        }
        ViewGroup viewGroup = this.f32535a;
        this.f32536b.set(0, 0, viewGroup.getResources().getDisplayMetrics().widthPixels, viewGroup.getResources().getDisplayMetrics().heightPixels);
        this.f32539e = this.f32536b.height() * 0.6f;
        this.f32540f = this.f32536b.height() * 0.2f;
        m11848f(this.f32535a, true);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11852d(View view) {
        Object parent = view.getParent();
        if (parent == this.f32535a) {
            return true;
        }
        if (parent instanceof View) {
            return m11852d((View) parent);
        }
        return false;
    }
}
