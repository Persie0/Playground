package p000;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.evcomp.EvCompSlider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dou implements View.OnHoverListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f12160a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12161b;

    public /* synthetic */ dou(EvCompSlider evCompSlider, int i) {
        this.f12161b = i;
        this.f12160a = evCompSlider;
    }

    public /* synthetic */ dou(dov dovVar, int i) {
        this.f12161b = i;
        this.f12160a = dovVar;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        switch (this.f12161b) {
            case 0:
                if (!((dov) this.f12160a).f12162a.isTouchExplorationEnabled()) {
                    return false;
                }
                view.sendAccessibilityEvent(8);
                return true;
            default:
                if (!((EvCompSlider) this.f12160a).f6636a.isTouchExplorationEnabled()) {
                    return false;
                }
                view.sendAccessibilityEvent(8);
                return true;
        }
    }
}
