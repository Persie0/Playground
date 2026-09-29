package p000;

import androidx.compose.runtime.internal.C0282a;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qzb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f58431a = new C0282a(1262062512, false, new sd1(27));

    /* JADX INFO: renamed from: a */
    public static final t47 m20222a(Integer num, Integer num2, Integer num3, vn7 vn7Var, String str, boolean z) {
        int iIntValue;
        EmptyList emptyList;
        int iIntValue2 = num.intValue() + (z ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return m20223b(z, vn7Var, str, iIntValue2, iIntValue);
        }
        t47 t47VarM20223b = m20223b(z, vn7Var, str, iIntValue2, iIntValue2);
        while (true) {
            emptyList = EmptyList.f47638a;
            if (iIntValue2 >= iMin) {
                break;
            }
            iIntValue2++;
            t47VarM20223b = new t47(emptyList, vz1.m23605K(m20223b(z, vn7Var, str, iIntValue2, iIntValue2), nzb.m17712a(vz1.m23605K(new t47(vz1.m23604J(new s87(" ")), emptyList), t47VarM20223b))));
        }
        if (iIntValue3 > iIntValue) {
            return nzb.m17712a(vz1.m23605K(new t47(vz1.m23604J(new s87(cl9.m4837T(iIntValue3 - iIntValue, " "))), emptyList), t47VarM20223b));
        }
        return iIntValue3 == iIntValue ? t47VarM20223b : new t47(emptyList, vz1.m23605K(m20223b(z, vn7Var, str, iIntValue3 + 1, iIntValue), t47VarM20223b));
    }

    /* JADX INFO: renamed from: b */
    public static final t47 m20223b(boolean z, vn7 vn7Var, String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            C3386nv.m17633t("Check failed.");
            return null;
        }
        ListBuilder listBuilderM23650t = vz1.m23650t();
        if (z) {
            listBuilderM23650t.add(new s87("-"));
        }
        listBuilderM23650t.add(new zo6(vz1.m23604J(new cha(Integer.valueOf(i - (z ? 1 : 0)), Integer.valueOf(i2 - (z ? 1 : 0)), vn7Var, str, z))));
        return new t47(vz1.m23635i(listBuilderM23650t), EmptyList.f47638a);
    }
}
