package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class avl extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean f2526a;

    public avl(boolean z) {
        this.f2526a = z;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (this.f2526a) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        } else {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
        outline.setAlpha(0.0f);
    }
}
