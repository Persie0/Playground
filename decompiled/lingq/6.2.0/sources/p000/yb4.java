package p000;

import android.app.Dialog;
import com.iterable.iterableapi.C1209e;
import com.iterable.iterableapi.IterableInAppCloseAction;

/* JADX INFO: loaded from: classes2.dex */
public final class yb4 extends Dialog {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1209e f69597a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb4(C1209e c1209e, id3 id3Var, int i) {
        super(id3Var, i);
        this.f69597a = c1209e;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        C1209e c1209e = this.f69597a;
        fb4.f38769t.m11701n(c1209e.f14006R0, "itbl://backButton");
        fb4.f38769t.m11702o(c1209e.f14006R0, "itbl://backButton", IterableInAppCloseAction.BACK, C1209e.f14000b1);
        c1209e.m6909r0();
        this.f69597a.m6908q0();
    }
}
