package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.cup.CupClaim;
import com.lingq.core.domain.model.cup.CupPrize;
import com.lingq.core.domain.model.cup.CupPrizeKind;
import com.lingq.core.domain.model.cup.CupPrizeSource;
import com.lingq.core.network.api.result.worldcup.ResultCupClaimState;
import com.lingq.core.network.api.result.worldcup.ResultCupPrize;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vqc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f65803a = new C0282a(-492499069, false, new ee1(28));

    /* JADX INFO: renamed from: b */
    public static final C0282a f65804b = new C0282a(800446317, false, new ee1(29));

    /* JADX INFO: renamed from: c */
    public static final C0282a f65805c = new C0282a(123118743, false, new fe1(27));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX INFO: renamed from: a */
    public static final CupPrize m23482a(ResultCupPrize resultCupPrize) {
        CupPrizeKind cupPrizeKind;
        CupPrizeSource cupPrizeSource;
        resultCupPrize.getClass();
        String str = resultCupPrize.f21791a;
        ku1 ku1Var = CupPrizeKind.Companion;
        String str2 = resultCupPrize.f21792b;
        ku1Var.getClass();
        if (fa4.m11650l(str2, "multiplier")) {
            cupPrizeKind = CupPrizeKind.Multiplier;
        } else {
            cupPrizeKind = fa4.m11650l(str2, "flat_gift") ? CupPrizeKind.FlatGift : CupPrizeKind.Unknown;
        }
        CupPrizeKind cupPrizeKind2 = cupPrizeKind;
        lu1 lu1Var = CupPrizeSource.Companion;
        String str3 = resultCupPrize.f21793c;
        lu1Var.getClass();
        if (str3 != null) {
            switch (str3) {
                case "listening":
                    cupPrizeSource = CupPrizeSource.Listening;
                    break;
                case "all":
                    cupPrizeSource = CupPrizeSource.All;
                    break;
                case "lingq":
                    cupPrizeSource = CupPrizeSource.LingQ;
                    break;
                case "known_word":
                    cupPrizeSource = CupPrizeSource.KnownWord;
                    break;
                case "reading":
                    cupPrizeSource = CupPrizeSource.Reading;
                    break;
                default:
                    cupPrizeSource = CupPrizeSource.None;
                    break;
            }
        } else {
            cupPrizeSource = CupPrizeSource.None;
        }
        CupPrizeSource cupPrizeSource2 = cupPrizeSource;
        int i = resultCupPrize.f21794d;
        String str4 = resultCupPrize.f21795e;
        ResultCupClaimState resultCupClaimState = resultCupPrize.f21796f;
        return new CupPrize(str, cupPrizeKind2, cupPrizeSource2, i, str4, resultCupClaimState != null ? new CupClaim(resultCupClaimState.m8414a(), resultCupClaimState.m8415b()) : null);
    }
}
