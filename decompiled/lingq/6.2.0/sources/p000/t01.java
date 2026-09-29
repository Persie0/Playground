package p000;

import android.view.autofill.AutofillValue;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.state.ToggleableState;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t01 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tv8 f61698b;

    public /* synthetic */ t01(tv8 tv8Var, int i) {
        this.f61697a = i;
        this.f61698b = tv8Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        int i = this.f61697a;
        boolean z = false;
        tv8 tv8Var = this.f61698b;
        switch (i) {
            case 0:
                pba pbaVar = (pba) obj;
                pbaVar.getClass();
                ((g47) pbaVar).m12356Z0(tv8Var);
                return Boolean.FALSE;
            case 1:
                AutofillValue autofillValue = ((C0848ci) obj).f10108a;
                boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    AbstractC0426f.m1866j(tv8Var, boolValueOf.booleanValue() ? ToggleableState.On : ToggleableState.Off);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                AutofillValue autofillValue2 = ((C0848ci) obj).f10108a;
                boolValueOf = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (boolValueOf != null) {
                    AbstractC0426f.m1866j(tv8Var, boolValueOf.booleanValue() ? ToggleableState.On : ToggleableState.Off);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
