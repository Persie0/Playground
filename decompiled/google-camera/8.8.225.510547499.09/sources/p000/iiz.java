package p000;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iiz extends iek {

    /* JADX INFO: renamed from: b */
    public final MainActivityLayout f31158b;

    public iiz(MainActivityLayout mainActivityLayout, FrameLayout frameLayout) {
        super(frameLayout);
        this.f31158b = mainActivityLayout;
    }

    @Override // p000.iek
    /* JADX INFO: renamed from: a */
    public final void mo11144a(View view) {
        jvd.m13538a();
        this.f30551a.removeView(view);
        this.f31158b.m4464e();
    }
}
