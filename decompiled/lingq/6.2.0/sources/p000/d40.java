package p000;

import androidx.media3.common.C0713b;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d40 {

    /* JADX INFO: renamed from: a */
    public List f34980a;

    public d40(List list) {
        this.f34980a = list;
    }

    /* JADX INFO: renamed from: a */
    public e40 m10081a() {
        List list = this.f34980a;
        if (list != null) {
            return new e40(list);
        }
        C3386nv.m17633t("Missing required properties: rolloutAssignments");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX INFO: renamed from: b */
    public List m10082b(C3299li c3299li) {
        String str;
        int i;
        List listSingletonList;
        List list = this.f34980a;
        k47 k47Var = new k47((byte[]) c3299li.f49692c);
        ArrayList arrayList = list;
        while (k47Var.m14820a() > 0) {
            int iM14842z = k47Var.m14842z();
            int iM14842z2 = k47Var.f46701b + k47Var.m14842z();
            if (iM14842z == 134) {
                arrayList = new ArrayList();
                int iM14842z3 = k47Var.m14842z() & 31;
                for (int i2 = 0; i2 < iM14842z3; i2++) {
                    String strM14840x = k47Var.m14840x(3, StandardCharsets.UTF_8);
                    int iM14842z4 = k47Var.m14842z();
                    boolean z = (iM14842z4 & 128) != 0;
                    if (z) {
                        i = iM14842z4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM14842z = (byte) k47Var.m14842z();
                    k47Var.m14819N(1);
                    if (z) {
                        boolean z2 = (bM14842z & 64) != 0;
                        byte[] bArr = m41.f50559a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    lc3 lc3Var = new lc3();
                    lc3Var.f49453n = ez5.m11402l(str);
                    lc3Var.f49443d = strM14840x;
                    lc3Var.f49435K = i;
                    lc3Var.f49456q = listSingletonList;
                    arrayList.add(new C0713b(lc3Var));
                }
            }
            k47Var.m14818M(iM14842z2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public void m10083c(List list) {
        if (list != null) {
            this.f34980a = list;
        } else {
            C3386nv.m17635v("Null rolloutAssignments");
        }
    }

    public d40() {
    }
}
