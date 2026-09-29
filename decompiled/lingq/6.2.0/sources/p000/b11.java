package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes2.dex */
public final class b11 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f7757a;

    public b11(Chip chip) {
        this.f7757a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        f11 f11Var = this.f7757a.f12866e;
        if (f11Var != null) {
            f11Var.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
