package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.camera.p014ui.views.ToggleUi;
import com.google.android.apps.camera.p014ui.zoomlock.ZoomLockView;
import com.google.android.apps.camera.wear.wearappv2.p016ui.WearZoomUi;
import com.google.android.apps.camera.zoomui.view.ZoomUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ija implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f31165a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f31166b;

    public /* synthetic */ ija(TextView textView, int i) {
        this.f31166b = i;
        this.f31165a = textView;
    }

    public /* synthetic */ ija(ToggleUi toggleUi, int i) {
        this.f31166b = i;
        this.f31165a = toggleUi;
    }

    public ija(ZoomLockView zoomLockView, int i) {
        this.f31166b = i;
        this.f31165a = zoomLockView;
    }

    public /* synthetic */ ija(WearZoomUi wearZoomUi, int i) {
        this.f31166b = i;
        this.f31165a = wearZoomUi;
    }

    public /* synthetic */ ija(ZoomUi zoomUi, int i) {
        this.f31166b = i;
        this.f31165a = zoomUi;
    }

    public /* synthetic */ ija(isp ispVar, int i) {
        this.f31166b = i;
        this.f31165a = ispVar;
    }

    public /* synthetic */ ija(itx itxVar, int i) {
        this.f31166b = i;
        this.f31165a = itxVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31166b) {
            case 0:
                ToggleUi toggleUi = (ToggleUi) this.f31165a;
                toggleUi.f7279c.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                toggleUi.f7279c.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                ((ToggleUi) this.f31165a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ((GradientDrawable) ((ZoomLockView) this.f31165a).f7304b.getBackground()).setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 3:
                WearZoomUi wearZoomUi = (WearZoomUi) this.f31165a;
                wearZoomUi.f7314a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wearZoomUi.invalidate();
                break;
            case 4:
                ((isp) this.f31165a).f31996a.mo3415bf(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 5:
                itx itxVar = (itx) this.f31165a;
                ViewGroup.LayoutParams layoutParams = itxVar.f32207s.m4566n().getLayoutParams();
                layoutParams.getClass();
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                itxVar.f32207s.m4566n().setLayoutParams(layoutParams2);
                break;
            case 6:
                itx itxVar2 = (itx) this.f31165a;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) itxVar2.f32207s.m4559g().getLayoutParams();
                layoutParams3.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                itxVar2.f32207s.m4559g().setLayoutParams(layoutParams3);
                break;
            case 7:
                ((itx) this.f31165a).f32208t.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                ((itx) this.f31165a).f32207s.m4556d().setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 9:
                itx itxVar3 = (itx) this.f31165a;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) itxVar3.f32207s.m4559g().getLayoutParams();
                layoutParams4.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                itxVar3.f32207s.m4559g().setLayoutParams(layoutParams4);
                break;
            case 10:
                ((itx) this.f31165a).f32208t.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                ((itx) this.f31165a).f32207s.m4556d().setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 12:
                TextView textView = (TextView) this.f31165a;
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) textView.getLayoutParams();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                layoutParams5.height = iIntValue;
                layoutParams5.width = iIntValue;
                textView.setLayoutParams(layoutParams5);
                break;
            case 13:
                TextView textView2 = (TextView) this.f31165a;
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams6.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                textView2.setLayoutParams(layoutParams6);
                break;
            case 14:
                ((TextView) this.f31165a).setTextSize(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                itx itxVar4 = (itx) this.f31165a;
                FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) itxVar4.f32207s.m4562j().getLayoutParams();
                layoutParams7.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                itxVar4.f32207s.m4562j().setLayoutParams(layoutParams7);
                break;
            case 16:
                ((itx) this.f31165a).f32198j.mo3415bf(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 17:
                ZoomUi zoomUi = (ZoomUi) this.f31165a;
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) zoomUi.m4559g().getLayoutParams();
                if (layoutParams8 != null) {
                    layoutParams8.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    zoomUi.m4559g().setLayoutParams(layoutParams8);
                }
                break;
            case 18:
                ZoomUi zoomUi2 = (ZoomUi) this.f31165a;
                FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) zoomUi2.m4559g().getLayoutParams();
                if (layoutParams9 != null) {
                    layoutParams9.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    zoomUi2.m4559g().setLayoutParams(layoutParams9);
                }
                break;
            case 19:
                ZoomUi zoomUi3 = (ZoomUi) this.f31165a;
                FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) zoomUi3.m4559g().getLayoutParams();
                if (layoutParams10 != null) {
                    layoutParams10.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    zoomUi3.m4559g().setLayoutParams(layoutParams10);
                }
                break;
            default:
                ZoomUi zoomUi4 = (ZoomUi) this.f31165a;
                FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) zoomUi4.m4559g().getLayoutParams();
                layoutParams11.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                zoomUi4.m4559g().setLayoutParams(layoutParams11);
                break;
        }
    }
}
