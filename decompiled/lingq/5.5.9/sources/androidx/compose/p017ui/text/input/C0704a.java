package androidx.compose.p017ui.text.input;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p017ui.platform.AndroidComposeView;
import cm.InterfaceC2041a;
import dm.C5207g;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import p352r1.C8708i;
import p352r1.C8709j;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0704a {

    /* JADX INFO: renamed from: a */
    public final View f4655a;

    public C0704a(AndroidComposeView androidComposeView) {
        C5207g.m11111f(androidComposeView, "view");
        this.f4655a = androidComposeView;
        C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InputMethodManager mo807E() {
                Object systemService = this.f4645b.f4655a.getContext().getSystemService("input_method");
                C5207g.m11109d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            }
        });
        if (Build.VERSION.SDK_INT < 30) {
            new C8708i(androidComposeView);
        } else {
            new C8709j(androidComposeView);
        }
    }
}
