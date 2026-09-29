package p000;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes2.dex */
public final class gx1 extends js2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f41461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx1(is2 is2Var, int i) {
        super(is2Var);
        this.f41461e = i;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: q */
    public void mo3308q() {
        switch (this.f41461e) {
            case 0:
                is2 is2Var = this.f46062b;
                is2Var.f44484J = null;
                CheckableImageButton checkableImageButton = is2Var.f44498g;
                checkableImageButton.setOnLongClickListener(null);
                jfd.m14436d(checkableImageButton, null);
                break;
        }
    }
}
