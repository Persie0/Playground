package p000;

import android.os.Bundle;
import com.lingq.feature.imports.AbstractC2105b;
import com.lingq.feature.imports.C2108e;
import com.lingq.feature.imports.UserImportSelectionFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zka implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71687a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UserImportSelectionFragment f71688b;

    public /* synthetic */ zka(UserImportSelectionFragment userImportSelectionFragment, int i) {
        this.f71687a = i;
        this.f71688b = userImportSelectionFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f71687a;
        xfa xfaVar = xfa.f68157a;
        UserImportSelectionFragment userImportSelectionFragment = this.f71688b;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                ((C2108e) userImportSelectionFragment.f26030B0.getValue()).m9012V2(userImportSelectionFragment.m2090R());
                break;
            default:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    boolean zM22124i = tj3Var.m22124i(userImportSelectionFragment);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == we1.f66679a) {
                        objM22097O = new gca(userImportSelectionFragment, 3);
                        tj3Var.m22131l0(objM22097O);
                    }
                    AbstractC2105b.m9009g(null, (vi3) objM22097O, tj3Var, 0);
                }
                break;
        }
        return xfaVar;
    }
}
