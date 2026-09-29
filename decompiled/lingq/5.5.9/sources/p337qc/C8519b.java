package p337qc;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.C2988a;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: qc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8519b extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f45784a;

    public C8519b(Chip chip) {
        this.f45784a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, Outline outline) {
        C2988a c2988a = this.f45784a.f15023e;
        if (c2988a != null) {
            c2988a.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
