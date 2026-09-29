package p310p0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import dm.C5207g;

/* JADX INFO: renamed from: p0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8164e extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a */
    public static final C8164e f44289a = new C8164e();

    /* JADX INFO: renamed from: a */
    public final void m16199a(C8160a c8160a) {
        C5207g.m11111f(c8160a, "autofill");
        c8160a.f44286c.registerCallback(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m16200b(C8160a c8160a) {
        C5207g.m11111f(c8160a, "autofill");
        c8160a.f44286c.unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i10, int i11) {
        String str;
        C5207g.m11111f(view, "view");
        super.onAutofillEvent(view, i10, i11);
        if (i11 == 1) {
            str = "Autofill popup was shown.";
        } else if (i11 != 2) {
            str = i11 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        } else {
            str = "Autofill popup was hidden.";
        }
        Log.d("Autofill Status", str);
    }
}
