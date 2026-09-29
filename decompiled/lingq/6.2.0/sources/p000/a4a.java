package p000;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.google.android.material.R$id;
import com.lingq.core.token.TokenParentFragment;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class a4a extends rg0 {

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ TokenParentFragment f245M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4a(TokenParentFragment tokenParentFragment, Context context, int i) {
        super(context, i);
        this.f245M = tokenParentFragment;
    }

    @Override // p000.rg0, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            kaa.m15044f(window, false);
        }
        View viewFindViewById = findViewById(R$id.container);
        if (viewFindViewById != null) {
            viewFindViewById.setFitsSystemWindows(false);
            vg1 vg1Var = new vg1(17, new iz4(24, viewFindViewById, this.f245M), new mua(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom(), viewFindViewById.getPaddingStart(), viewFindViewById.getPaddingEnd()));
            WeakHashMap weakHashMap = dta.f36217a;
            wsa.m24145c(viewFindViewById, vg1Var);
            if (viewFindViewById.isAttachedToWindow()) {
                viewFindViewById.requestApplyInsets();
            } else {
                viewFindViewById.addOnAttachStateChangeListener(new hfa());
            }
        }
    }
}
