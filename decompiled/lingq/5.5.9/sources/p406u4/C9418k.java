package p406u4;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.linguist.R;

/* JADX INFO: renamed from: u4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9418k extends AbstractC9447y0 {

    /* JADX INFO: renamed from: b0 */
    public static final DecelerateInterpolator f48345b0 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: c0 */
    public static final AccelerateInterpolator f48346c0 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: a0 */
    public final int[] f48347a0;

    public C9418k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48347a0 = new int[2];
        this.f48288S = new C9416j();
    }

    /* JADX INFO: renamed from: S */
    private void m17817S(C9425n0 c9425n0) {
        View view = c9425n0.f48373b;
        int[] iArr = this.f48347a0;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        c9425n0.f48372a.put("android:explode:screenBounds", new Rect(i10, i11, view.getWidth() + i10, view.getHeight() + i11));
    }

    @Override // p406u4.AbstractC9447y0
    /* JADX INFO: renamed from: V */
    public final Animator mo16372V(ViewGroup viewGroup, View view, C9425n0 c9425n0, C9425n0 c9425n1) {
        if (c9425n1 == null) {
            return null;
        }
        Rect rect = (Rect) c9425n1.f48372a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = this.f48347a0;
        m17818X(viewGroup, rect, iArr);
        return C9429p0.m17828a(view, c9425n1, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f48345b0, this);
    }

    @Override // p406u4.AbstractC9447y0
    /* JADX INFO: renamed from: W */
    public final Animator mo16373W(ViewGroup viewGroup, View view, C9425n0 c9425n0) {
        float f3;
        float f10;
        if (c9425n0 == null) {
            return null;
        }
        Rect rect = (Rect) c9425n0.f48372a.get("android:explode:screenBounds");
        int i10 = rect.left;
        int i11 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c9425n0.f48373b.getTag(R.id.transition_position);
        if (iArr != null) {
            int i12 = iArr[0];
            f3 = (i12 - rect.left) + translationX;
            int i13 = iArr[1];
            f10 = (i13 - rect.top) + translationY;
            rect.offsetTo(i12, i13);
        } else {
            f3 = translationX;
            f10 = translationY;
        }
        int[] iArr2 = this.f48347a0;
        m17818X(viewGroup, rect, iArr2);
        return C9429p0.m17828a(view, c9425n0, i10, i11, translationX, translationY, f3 + iArr2[0], f10 + iArr2[1], f48346c0, this);
    }

    /* JADX INFO: renamed from: X */
    public final void m17818X(View view, Rect rect, int[] iArr) {
        int iCenterX;
        int iCenterY;
        int[] iArr2 = this.f48347a0;
        view.getLocationOnScreen(iArr2);
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        AbstractC9409f0.d dVar = this.f48289T;
        Rect rectMo17809a = dVar == null ? null : dVar.mo17809a();
        if (rectMo17809a == null) {
            iCenterX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i10;
            iCenterY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i11;
        } else {
            iCenterX = rectMo17809a.centerX();
            iCenterY = rectMo17809a.centerY();
        }
        float fCenterX = rect.centerX() - iCenterX;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
        int i12 = iCenterX - i10;
        int i13 = iCenterY - i11;
        float fMax = Math.max(i12, view.getWidth() - i12);
        float fMax2 = Math.max(i13, view.getHeight() - i13);
        float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
        iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
        iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
    }

    @Override // p406u4.AbstractC9447y0, p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: h */
    public final void mo17761h(C9425n0 c9425n0) {
        m17843S(c9425n0);
        m17817S(c9425n0);
    }

    @Override // p406u4.AbstractC9447y0, p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: k */
    public final void mo17762k(C9425n0 c9425n0) {
        m17843S(c9425n0);
        m17817S(c9425n0);
    }
}
