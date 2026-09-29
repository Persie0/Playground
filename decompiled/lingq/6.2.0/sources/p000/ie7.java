package p000;

import com.lingq.core.p012ui.R$string;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ie7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44022a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f44023b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f44024c;

    public /* synthetic */ ie7(int i, int i2, int i3) {
        this.f44022a = i3;
        this.f44023b = i;
        this.f44024c = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f44022a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f44024c;
        int i3 = this.f44023b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    lw9.m16554b(vz1.m23618Z(R$string.not_enough_balance_purchase_lesson_details, new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}, tj3Var), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    lw9.m16554b(vz1.m23618Z(R$string.purchase_item_details, new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}, tj3Var2), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    lw9.m16554b(String.format(Locale.getDefault(), vz1.m23620a0(tj3Var3, R$string.not_enough_balance_purchase_lesson_details), Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}, 2)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                }
                break;
            default:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    lw9.m16554b(String.format(Locale.getDefault(), vz1.m23620a0(tj3Var4, R$string.purchase_item_details), Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}, 2)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                }
                break;
        }
        return xfaVar;
    }
}
