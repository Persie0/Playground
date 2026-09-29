package p310p0;

import android.view.View;
import android.view.autofill.AutofillManager;
import dm.C5207g;

/* JADX INFO: renamed from: p0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8160a implements InterfaceC8161b {

    /* JADX INFO: renamed from: a */
    public final View f44284a;

    /* JADX INFO: renamed from: b */
    public final C8166g f44285b;

    /* JADX INFO: renamed from: c */
    public final AutofillManager f44286c;

    public C8160a(View view, C8166g c8166g) {
        C5207g.m11111f(view, "view");
        C5207g.m11111f(c8166g, "autofillTree");
        this.f44284a = view;
        this.f44285b = c8166g;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.f44286c = autofillManager;
        view.setImportantForAutofill(1);
    }
}
