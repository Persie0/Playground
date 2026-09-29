package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.premium.R$string;
import com.lingq.core.premium.upgrade.UpgradeBadgeTier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qnb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f57993a = new C0282a(1684525801, false, new jx0(21));

    /* JADX INFO: renamed from: b */
    public static final C0282a f57994b = new C0282a(1265215049, false, new jx0(22));

    /* JADX INFO: renamed from: c */
    public static final C0282a f57995c = new C0282a(1262878467, false, new z70(21));

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m20084a(int i, int i2, ye1 ye1Var, ui3 ui3Var, e16 e16Var) {
        int i3;
        e16 e16Var2;
        boolean z;
        x18 x18VarM22143u;
        e16 e16Var3;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1482712869);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                e16Var2 = e16Var;
                i3 |= tj3Var.m22120g(e16Var2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i3 & 1, z)) {
                if (i4 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var2;
                }
                int i5 = i3 << 9;
                s9d.m21184c(UpgradeBadgeTier.Premium, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_chatbot_title), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_chatbot_button), ui3Var, e16Var3, null, false, false, bzb.f9207a, tj3Var, (i5 & 7168) | 100663302 | (i5 & 57344), 224);
                e16Var2 = e16Var3;
            } else {
                tj3Var.m22102U();
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new en5(ui3Var, e16Var2, i, i2);
            }
        }
        i3 |= 48;
        e16Var2 = e16Var;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i3 & 1, z)) {
            if (i4 != 0) {
                e16Var3 = b16.f7762a;
            } else {
                e16Var3 = e16Var2;
            }
            int i6 = i3 << 9;
            s9d.m21184c(UpgradeBadgeTier.Premium, vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_chatbot_title), vz1.m23620a0(tj3Var, R$string.upgrade_prompt_lynx_chatbot_button), ui3Var, e16Var3, null, false, false, bzb.f9207a, tj3Var, (i6 & 7168) | 100663302 | (i6 & 57344), 224);
            e16Var2 = e16Var3;
        } else {
            tj3Var.m22102U();
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new en5(ui3Var, e16Var2, i, i2);
        }
    }
}
