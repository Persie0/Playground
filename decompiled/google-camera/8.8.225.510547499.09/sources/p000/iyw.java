package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyw extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f32692a;

    public iyw(int i) {
        this.f32692a = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f32692a);
    }
}
