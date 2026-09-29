package p000;

import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.feature.dictionary.AbstractC2059d;

/* JADX INFO: loaded from: classes2.dex */
public final class cf2 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DictionaryData f9998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f9999b;

    public cf2(DictionaryData dictionaryData, vi3 vi3Var) {
        this.f9998a = dictionaryData;
        this.f9999b = vi3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((bi0) obj).getClass();
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
            vi3 vi3Var = this.f9999b;
            boolean zM22120g = tj3Var.m22120g(vi3Var);
            DictionaryData dictionaryData = this.f9998a;
            boolean zM22124i = zM22120g | tj3Var.m22124i(dictionaryData);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new bf2(vi3Var, dictionaryData, 0);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC2059d.m8965a(dictionaryData, (ui3) objM22097O, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }
}
