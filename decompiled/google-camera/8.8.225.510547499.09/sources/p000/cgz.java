package p000;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.aizoom.previewpanel.PolyView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgz extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final SurfaceView f5710a;

    /* JADX INFO: renamed from: b */
    public final PolyView f5711b;

    /* JADX INFO: renamed from: c */
    private final View f5712c;

    public cgz(Context context) {
        super(context);
        View viewInflate = inflate(getContext(), C0100R.layout.previewpanel, null);
        this.f5712c = viewInflate;
        this.f5710a = (SurfaceView) viewInflate.findViewById(C0100R.id.preview_viewfinder);
        this.f5711b = (PolyView) viewInflate.findViewById(C0100R.id.preview_roi);
        addView(viewInflate);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(getVisibility());
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            this.f5710a.requestLayout();
        } else {
            this.f5710a.layout(0, 0, 1, 1);
        }
    }
}
