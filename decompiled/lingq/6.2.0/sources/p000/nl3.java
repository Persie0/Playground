package p000;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.LanguageLearn;

/* JADX INFO: loaded from: classes2.dex */
public final class nl3 {

    /* JADX INFO: renamed from: a */
    public final si7 f52909a;

    public nl3(si7 si7Var, int i) {
        si7Var.getClass();
        switch (i) {
            case 1:
                this.f52909a = si7Var;
                break;
            case 2:
                this.f52909a = si7Var;
                break;
            case 3:
                this.f52909a = si7Var;
                break;
            case 4:
                this.f52909a = si7Var;
                break;
            default:
                this.f52909a = si7Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public c83 m17484a(String str) {
        str.getClass();
        boolean zEquals = str.equals(LanguageLearn.Mandarin.getCode());
        si7 si7Var = this.f52909a;
        if (zEquals) {
            return ((C1368a) si7Var).f18389Z0;
        }
        if (str.equals(LanguageLearn.ChineseTraditional.getCode())) {
            return ((C1368a) si7Var).f18395b1;
        }
        if (str.equals(LanguageLearn.Japanese.getCode())) {
            return ((C1368a) si7Var).f18392a1;
        }
        if (str.equals(LanguageLearn.Cantonese.getCode())) {
            return ((C1368a) si7Var).f18398c1;
        }
        if (AbstractC3184kh.m15230y(str)) {
            return ((C1368a) si7Var).f18401d1;
        }
        return new i83("Off", 1);
    }
}
