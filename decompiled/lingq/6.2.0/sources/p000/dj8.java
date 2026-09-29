package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.glance.layout.AbstractC0686a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dj8 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f35729a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0282a f35730b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f35731c;

    public dj8(ArrayList arrayList, C0282a c0282a, int i) {
        this.f35729a = arrayList;
        this.f35730b = c0282a;
        this.f35731c = i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        cv4 cv4Var = (cv4) obj;
        int iIntValue = ((Number) obj2).intValue();
        ye1 ye1Var = (ye1) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = ((iIntValue2 & 8) == 0 ? ((tj3) ye1Var).m22120g(cv4Var) : ((tj3) ye1Var).m22124i(cv4Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
        }
        if ((i & 147) == 146) {
            tj3 tj3Var = (tj3) ye1Var;
            if (tj3Var.m22086D()) {
                tj3Var.m22102U();
            } else {
                Object obj5 = this.f35729a.get(iIntValue);
                tj3 tj3Var2 = (tj3) ye1Var;
                tj3Var2.m22111b0(511703203);
                AbstractC0686a.m2486b(ci8.m4735t(mn3.f51554a), 0, 0, ci8.m4703P(-943993647, new cj8(this.f35730b, obj5, iIntValue, this.f35731c), tj3Var2), tj3Var2, 3072, 6);
                tj3Var2.m22139q(false);
            }
        } else {
            Object obj6 = this.f35729a.get(iIntValue);
            tj3 tj3Var3 = (tj3) ye1Var;
            tj3Var3.m22111b0(511703203);
            AbstractC0686a.m2486b(ci8.m4735t(mn3.f51554a), 0, 0, ci8.m4703P(-943993647, new cj8(this.f35730b, obj6, iIntValue, this.f35731c), tj3Var3), tj3Var3, 3072, 6);
            tj3Var3.m22139q(false);
        }
        return xfa.f68157a;
    }
}
