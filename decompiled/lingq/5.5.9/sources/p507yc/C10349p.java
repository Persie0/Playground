package p507yc;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

/* JADX INFO: renamed from: yc.p */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class C10349p extends ImageButton {

    /* JADX INFO: renamed from: a */
    public int f52057a;

    /* JADX INFO: renamed from: b */
    public final void m19367b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f52057a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f52057a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        m19367b(i10, true);
    }
}
