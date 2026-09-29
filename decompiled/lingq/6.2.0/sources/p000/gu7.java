package p000;

import android.os.Bundle;
import com.lingq.feature.reader.reader.AbstractC2501g;
import com.lingq.feature.reader.reader.C2493a;
import com.lingq.feature.reader.reader.ReaderComposeFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gu7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderComposeFragment f41346b;

    public /* synthetic */ gu7(ReaderComposeFragment readerComposeFragment, int i) {
        this.f41345a = i;
        this.f41346b = readerComposeFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f41345a;
        xfa xfaVar = xfa.f68157a;
        ReaderComposeFragment readerComposeFragment = this.f41346b;
        switch (i) {
            case 0:
                Bundle bundle = (Bundle) obj2;
                ((String) obj).getClass();
                bundle.getClass();
                if (bundle.getBoolean("lessonEdit")) {
                    ((C2493a) readerComposeFragment.f29941D0.getValue()).m9389V2(ps7.f56765a);
                }
                return xfaVar;
            default:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ud6 ud6VarM3244j = b34.m3244j(readerComposeFragment);
                    w41 w41Var = readerComposeFragment.f29939B0;
                    if (w41Var == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    AbstractC2501g.m9403d(null, null, null, ud6VarM3244j, w41Var, tj3Var, 0);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
        }
    }
}
