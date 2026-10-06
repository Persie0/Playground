package p000;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.ViewfinderCover;
import com.google.android.apps.camera.p014ui.widget.ReviewImageView;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evf {

    /* JADX INFO: renamed from: a */
    public static final nbh f20381a = nbh.m17259h(KMNlNMe.wtYQMEIexE);

    /* JADX INFO: renamed from: b */
    public final chm f20382b;

    /* JADX INFO: renamed from: c */
    public final hwx f20383c;

    /* JADX INFO: renamed from: d */
    public final Executor f20384d;

    /* JADX INFO: renamed from: e */
    public final ReviewImageView f20385e;

    /* JADX INFO: renamed from: f */
    public final ProgressOverlay f20386f;

    /* JADX INFO: renamed from: g */
    public boolean f20387g = false;

    public evf(chm chmVar, View view, Executor executor, hwx hwxVar) {
        this.f20382b = chmVar;
        this.f20383c = hwxVar;
        this.f20384d = executor;
        ((ViewStub) view.findViewById(C0100R.id.camera_intent_layout_stub)).inflate();
        this.f20385e = (ReviewImageView) view.findViewById(C0100R.id.intent_review_imageview);
        this.f20386f = (ProgressOverlay) view.findViewById(C0100R.id.intent_progress_bar);
        ((ViewfinderCover) view.findViewById(C0100R.id.viewfinder_cover)).f7290e = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m7924a(boolean z) {
        jvd.m13538a();
        this.f20382b.mo3720j(z);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f A[Catch: all -> 0x0045, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x000a, B:11:0x000f, B:13:0x002b, B:12:0x001d), top: B:19:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x001d A[Catch: all -> 0x0045, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x000a, B:11:0x000f, B:13:0x002b, B:12:0x001d), top: B:19:0x0003 }] */
    /* JADX INFO: renamed from: b */
    public final synchronized void m7925b(Bitmap bitmap, boolean z) {
        if (!z) {
            jvd.m13538a();
            if (z) {
                this.f20386f.setVisibility(0);
                this.f20386f.f6881a.start();
            } else {
                this.f20386f.f6881a.stop();
                this.f20386f.setVisibility(8);
            }
            this.f20387g = true;
            this.f20385e.m4504b(bitmap);
            ReviewImageView reviewImageView = this.f20385e;
            reviewImageView.announceForAccessibility(reviewImageView.getContext().getString(C0100R.string.photo_accessibility_peek));
            return;
        }
        if (this.f20387g) {
            return;
        }
        jvd.m13538a();
        if (z) {
            this.f20386f.setVisibility(0);
            this.f20386f.f6881a.start();
        } else {
            this.f20386f.f6881a.stop();
            this.f20386f.setVisibility(8);
        }
        this.f20387g = true;
        this.f20385e.m4504b(bitmap);
        ReviewImageView reviewImageView2 = this.f20385e;
        reviewImageView2.announceForAccessibility(reviewImageView2.getContext().getString(C0100R.string.photo_accessibility_peek));
        return;
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7926c() {
        return this.f20383c.m10792e();
    }
}
