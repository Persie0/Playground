package p000;

import com.lingq.core.p012ui.R$string;
import com.lingq.feature.reader.R$drawable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rp2 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59677a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f59678b;

    public /* synthetic */ rp2(int i, long j) {
        this.f59677a = i;
        this.f59678b = j;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f59677a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    ty3.m22351a(r7d.m20438b(), vz1.m23620a0(tj3Var, R$string.ui_close), null, this.f59678b, tj3Var, 0, 4);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    p04 p04VarM17721b = h7d.f41925a;
                    if (p04VarM17721b == null) {
                        o04 o04Var = new o04("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = soa.f61116a;
                        pd9 pd9Var = new pd9(aa1.f403b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new q57(9.0f, 16.17f));
                        arrayList.add(new p57(4.83f, 12.0f));
                        arrayList.add(new x57(-1.42f, 1.41f));
                        arrayList.add(new p57(9.0f, 19.0f));
                        arrayList.add(new p57(21.0f, 7.0f));
                        arrayList.add(new x57(-1.41f, -1.41f));
                        arrayList.add(m57.f50613c);
                        o04.m17720a(o04Var, arrayList, pd9Var);
                        p04VarM17721b = o04Var.m17721b();
                        h7d.f41925a = p04VarM17721b;
                    }
                    ty3.m22351a(p04VarM17721b, null, c99.m4422o(b16Var, 20.0f), this.f59678b, tj3Var2, 432, 0);
                }
                break;
            default:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_sentence_review, tj3Var3, 0), null, c99.m4422o(b16Var, 20.0f), this.f59678b, tj3Var3, 440, 0);
                }
                break;
        }
        return xfaVar;
    }
}
