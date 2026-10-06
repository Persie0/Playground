package p000;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearChipButton;
import com.google.android.clockwork.common.wearable.wearmaterial.list.FadingWearableRecyclerView;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.CenteredRecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwk implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewGroup f32482a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f32483b;

    public iwk(CoordinatorLayout coordinatorLayout, int i) {
        this.f32483b = i;
        this.f32482a = coordinatorLayout;
    }

    public iwk(WearChipButton wearChipButton, int i) {
        this.f32483b = i;
        this.f32482a = wearChipButton;
    }

    public iwk(FadingWearableRecyclerView fadingWearableRecyclerView, int i) {
        this.f32483b = i;
        this.f32482a = fadingWearableRecyclerView;
    }

    public /* synthetic */ iwk(CenteredRecyclerView centeredRecyclerView, int i) {
        this.f32483b = i;
        this.f32482a = centeredRecyclerView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f32483b) {
            case 0:
                ((WearChipButton) this.f32482a).getRootView().getViewTreeObserver().removeOnPreDrawListener(this);
                ((WearChipButton) this.f32482a).f7439l = true;
                return true;
            case 1:
                ((CoordinatorLayout) this.f32482a).m1425i(0);
                return true;
            case 2:
                FadingWearableRecyclerView fadingWearableRecyclerView = (FadingWearableRecyclerView) this.f32482a;
                if (!fadingWearableRecyclerView.f7461ac || fadingWearableRecyclerView.getChildCount() <= 0) {
                    return true;
                }
                ((FadingWearableRecyclerView) this.f32482a).m4604aB();
                ((FadingWearableRecyclerView) this.f32482a).f7461ac = false;
                return false;
            default:
                ViewGroup viewGroup = this.f32482a;
                CenteredRecyclerView centeredRecyclerView = (CenteredRecyclerView) viewGroup;
                if (!centeredRecyclerView.f7488ad || centeredRecyclerView.f7486ab.mo11891c(viewGroup) == centeredRecyclerView.f7489ae) {
                    centeredRecyclerView.getRootView().getViewTreeObserver().removeOnPreDrawListener(centeredRecyclerView.f7487ac);
                }
                return false;
        }
    }
}
