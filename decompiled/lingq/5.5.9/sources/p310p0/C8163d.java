package p310p0;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import dm.C5207g;

/* JADX INFO: renamed from: p0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8163d {

    /* JADX INFO: renamed from: a */
    public static final C8163d f44288a = new C8163d();

    /* JADX INFO: renamed from: a */
    public final AutofillId m16190a(ViewStructure viewStructure) {
        C5207g.m11111f(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m16191b(AutofillValue autofillValue) {
        C5207g.m11111f(autofillValue, "value");
        return autofillValue.isDate();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16192c(AutofillValue autofillValue) {
        C5207g.m11111f(autofillValue, "value");
        return autofillValue.isList();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16193d(AutofillValue autofillValue) {
        C5207g.m11111f(autofillValue, "value");
        return autofillValue.isText();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16194e(AutofillValue autofillValue) {
        C5207g.m11111f(autofillValue, "value");
        return autofillValue.isToggle();
    }

    /* JADX INFO: renamed from: f */
    public final void m16195f(ViewStructure viewStructure, String[] strArr) {
        C5207g.m11111f(viewStructure, "structure");
        C5207g.m11111f(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: g */
    public final void m16196g(ViewStructure viewStructure, AutofillId autofillId, int i10) {
        C5207g.m11111f(viewStructure, "structure");
        C5207g.m11111f(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i10);
    }

    /* JADX INFO: renamed from: h */
    public final void m16197h(ViewStructure viewStructure, int i10) {
        C5207g.m11111f(viewStructure, "structure");
        viewStructure.setAutofillType(i10);
    }

    /* JADX INFO: renamed from: i */
    public final CharSequence m16198i(AutofillValue autofillValue) {
        C5207g.m11111f(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        C5207g.m11110e(textValue, "value.textValue");
        return textValue;
    }
}
