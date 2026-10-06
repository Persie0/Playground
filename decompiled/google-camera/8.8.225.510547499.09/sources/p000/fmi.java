package p000;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.wirers.PreviewOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fmi {

    /* JADX INFO: renamed from: a */
    public PreviewOverlay f22558a;

    /* JADX INFO: renamed from: b */
    public iiu f22559b;

    /* JADX INFO: renamed from: c */
    private final View f22560c;

    public fmi(View view) {
        this.f22560c = view;
        m8583d();
    }

    /* JADX INFO: renamed from: a */
    public final void m8580a() {
        iiu iiuVar = this.f22559b;
        AnimatorSet animatorSet = iiuVar.f31141m;
        if (animatorSet != null && animatorSet.isRunning()) {
            iiuVar.f31141m.cancel();
        }
        iiuVar.m11388a();
        this.f22558a.f7299c = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m8581b() {
        this.f22558a.f7299c = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m8582c() {
        this.f22558a.f7299c = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m8583d() {
        jfs jfsVarM13066o = jfs.m13066o(this.f22560c);
        FrameLayout frameLayout = (FrameLayout) jfsVarM13066o.m13100f(C0100R.id.uncovered_preview_layout);
        iiu iiuVar = this.f22559b;
        if (iiuVar != null) {
            frameLayout.removeView(iiuVar);
        }
        this.f22558a = (PreviewOverlay) jfsVarM13066o.m13100f(C0100R.id.preview_overlay);
        iiu iiuVar2 = new iiu(frameLayout.getContext());
        jvh.m13572t(iiuVar2);
        frameLayout.addView(iiuVar2);
        this.f22559b = iiuVar2;
    }

    /* JADX INFO: renamed from: e */
    public final void m8584e(boolean z) {
        this.f22559b.f31138j = z;
    }

    /* JADX INFO: renamed from: f */
    public final void m8585f(int i) {
        PreviewOverlay previewOverlay;
        boolean z;
        this.f22559b.m11389b(i);
        if (i >= 100) {
            previewOverlay = this.f22558a;
            z = true;
        } else {
            previewOverlay = this.f22558a;
            z = false;
        }
        previewOverlay.f7299c = z;
    }
}
