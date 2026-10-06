package p000;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.p014ui.breadcrumbs.BreadcrumbsView;
import com.google.android.apps.camera.p014ui.modeswitcher.ModeSwitcher;
import com.google.android.apps.camera.p014ui.modeswitcher.MoreModesGrid;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.android.apps.camera.p014ui.views.GradientBar;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.apps.camera.p014ui.views.ViewfinderCover;
import com.google.android.apps.camera.p014ui.zoomlock.ZoomLockView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iid {

    /* JADX INFO: renamed from: a */
    final ViewStub f31064a;

    /* JADX INFO: renamed from: b */
    final ViewStub f31065b;

    /* JADX INFO: renamed from: c */
    public final MainActivityLayout f31066c;

    /* JADX INFO: renamed from: d */
    public final FrameLayout f31067d;

    /* JADX INFO: renamed from: e */
    public final ViewfinderCover f31068e;

    /* JADX INFO: renamed from: f */
    public final BottomBar f31069f;

    /* JADX INFO: renamed from: g */
    public final RoundedThumbnailView f31070g;

    /* JADX INFO: renamed from: h */
    public final View f31071h;

    /* JADX INFO: renamed from: i */
    public final View f31072i;

    /* JADX INFO: renamed from: j */
    public final ModeSwitcher f31073j;

    /* JADX INFO: renamed from: k */
    public final BreadcrumbsView f31074k;

    /* JADX INFO: renamed from: l */
    public final ShutterButton f31075l;

    /* JADX INFO: renamed from: m */
    public final MoreModesGrid f31076m;

    /* JADX INFO: renamed from: n */
    public final GradientBar f31077n;

    /* JADX INFO: renamed from: o */
    public final ShutterButtonProgressOverlay f31078o;

    /* JADX INFO: renamed from: p */
    public final ZoomLockView f31079p;

    /* JADX INFO: renamed from: q */
    public final jfs f31080q;

    public iid(jfs jfsVar, byte[] bArr, byte[] bArr2) {
        jvd.m13538a();
        this.f31080q = jfsVar;
        this.f31066c = (MainActivityLayout) jfsVar.m13100f(C0100R.id.activity_root_view);
        this.f31064a = (ViewStub) jfsVar.m13100f(C0100R.id.camera_frame_bottom_layout_stub);
        this.f31065b = (ViewStub) jfsVar.m13100f(C0100R.id.camera_frame_overlay_layout_stub);
        this.f31067d = (FrameLayout) jfsVar.m13100f(C0100R.id.viewfinder_frame);
        this.f31068e = (ViewfinderCover) jfsVar.m13100f(C0100R.id.viewfinder_cover);
        this.f31073j = (ModeSwitcher) jfsVar.m13100f(C0100R.id.mode_switcher);
        this.f31074k = (BreadcrumbsView) jfsVar.m13100f(C0100R.id.breadcrumbs_ui);
        this.f31075l = (ShutterButton) jfsVar.m13100f(C0100R.id.shutter_button);
        this.f31076m = (MoreModesGrid) jfsVar.m13100f(C0100R.id.more_modes_grid);
        this.f31071h = (View) jfsVar.m13100f(C0100R.id.options_menu_container);
        this.f31072i = (View) jfsVar.m13100f(C0100R.id.timer_widget);
        BottomBar bottomBar = (BottomBar) jfsVar.m13100f(C0100R.id.bottom_bar);
        this.f31069f = bottomBar;
        this.f31077n = (GradientBar) jfsVar.m13100f(C0100R.id.gradient_bar);
        this.f31070g = bottomBar.getThumbnailButton();
        this.f31078o = (ShutterButtonProgressOverlay) jfsVar.m13100f(C0100R.id.shutter_progress_overlay);
        this.f31079p = (ZoomLockView) jfsVar.m13100f(C0100R.id.zoom_lock_view);
    }
}
