package p000;

import androidx.compose.material3.AbstractC0231g;
import com.lingq.core.domain.model.status.CardExtendedStatus;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.TokenStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y7d {
    /* JADX INFO: renamed from: a */
    public static final void m24982a(t61 t61Var, ui3 ui3Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        ui3 ui3Var2;
        tj3 tj3Var;
        t61Var.getClass();
        ui3Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(91723862);
        int i2 = (tj3Var2.m22120g(t61Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            ui3Var2 = ui3Var;
            i2 |= tj3Var2.m22124i(ui3Var2) ? 32 : 16;
        } else {
            ui3Var2 = ui3Var;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 2048 : 1024;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c(ui3Var2, null, null, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(508494900, new ik0(t61Var, vi3Var2, vi3Var, 7), tj3Var2), tj3Var, (i2 >> 3) & 14, 3072, 8190);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(t61Var, ui3Var, vi3Var, vi3Var2, i, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m24983b(int i, Integer num) {
        if (i != CardStatus.Learned.getValue() || num == null) {
            return i;
        }
        return num.intValue() == CardExtendedStatus.Known.getValue() ? CardStatus.Known.getValue() : i;
    }

    /* JADX INFO: renamed from: c */
    public static final TokenStatus m24984c(int i, Integer num) {
        if (i == CardStatus.Ignored.getValue()) {
            return TokenStatus.Ignored;
        }
        if (i == CardStatus.New.getValue()) {
            return TokenStatus.New;
        }
        if (i == CardStatus.Recognized.getValue()) {
            return TokenStatus.Recognized;
        }
        if (i == CardStatus.Familiar.getValue()) {
            return TokenStatus.Familiar;
        }
        if (i != CardStatus.Learned.getValue()) {
            return TokenStatus.New;
        }
        if (num != null) {
            if (num.intValue() == CardExtendedStatus.Known.getValue()) {
                return TokenStatus.Known;
            }
        }
        return TokenStatus.Learned;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m24985d(String str) {
        str.getClass();
        return vk9.m23380c0(str, " ", false);
    }

    /* JADX INFO: renamed from: e */
    public static final int m24986e(TokenStatus tokenStatus) {
        tokenStatus.getClass();
        switch (c5a.f9591a[tokenStatus.ordinal()]) {
            case 1:
                return CardStatus.Ignored.getValue();
            case 2:
                return CardStatus.New.getValue();
            case 3:
                return CardStatus.Recognized.getValue();
            case 4:
                return CardStatus.Familiar.getValue();
            case 5:
                return CardStatus.Learned.getValue();
            case 6:
                return CardStatus.Known.getValue();
            default:
                gm5.m12750e();
                return 0;
        }
    }
}
