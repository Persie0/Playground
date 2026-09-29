package p000;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes2.dex */
public final class a11 extends p6d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f53a;

    public a11(Chip chip) {
        this.f53a = chip;
    }

    @Override // p000.p6d
    /* JADX INFO: renamed from: b */
    public final void mo33b(int i) {
    }

    @Override // p000.p6d
    /* JADX INFO: renamed from: c */
    public final void mo34c(Typeface typeface, boolean z) {
        Chip chip = this.f53a;
        f11 f11Var = chip.f12866e;
        chip.setText(f11Var.f38212h1 ? f11Var.f38215j0 : chip.getText());
        chip.requestLayout();
        chip.invalidate();
    }
}
