package p000;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.zoomui.view.ZoomUi;
import com.google.android.clockwork.common.wearable.wearmaterial.list.FadingWearableRecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iws implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f32504a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f32505b;

    public /* synthetic */ iws(ZoomUi zoomUi, int i) {
        this.f32505b = i;
        this.f32504a = zoomUi;
    }

    public /* synthetic */ iws(FadingWearableRecyclerView fadingWearableRecyclerView, int i) {
        this.f32505b = i;
        this.f32504a = fadingWearableRecyclerView;
    }

    public /* synthetic */ iws(ixd ixdVar, int i) {
        this.f32505b = i;
        this.f32504a = ixdVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f32505b) {
            case 0:
                Object obj = this.f32504a;
                int i = iwt.f32506a;
                ((ixd) obj).m11851c();
                break;
            case 1:
                ImageView imageView = (ImageView) ((ZoomUi) this.f32504a).findViewById(C0100R.id.toggle_btn_bk);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                imageView.setLayoutParams(layoutParams);
                break;
            default:
                ((FadingWearableRecyclerView) this.f32504a).f7460ab.m11851c();
                break;
        }
    }
}
