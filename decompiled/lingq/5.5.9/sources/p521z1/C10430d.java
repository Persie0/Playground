package p521z1;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import dm.C5207g;

/* JADX INFO: renamed from: z1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10430d extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C5207g.m11111f(view, "view");
        C5207g.m11111f(outline, "result");
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(0.0f);
    }
}
