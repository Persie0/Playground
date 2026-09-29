package androidx.compose.p002ui.text;

import java.util.List;
import p000.C3378nn;
import p000.de5;
import p000.dm8;
import p000.ee5;
import p000.fa4;
import p000.fs6;
import p000.gm5;
import p000.he9;
import p000.ipa;
import p000.j37;
import p000.lja;
import p000.ok9;
import p000.vi3;

/* JADX INFO: renamed from: androidx.compose.ui.text.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0431b implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        j37 j37Var = null;
        de5Var = null;
        de5 de5Var = null;
        ee5Var = null;
        ee5 ee5Var = null;
        ljaVar = null;
        lja ljaVar = null;
        ipaVar = null;
        ipa ipaVar = null;
        he9Var = null;
        he9 he9Var = null;
        j37Var = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        annotationType.getClass();
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        num.getClass();
        int iIntValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        num2.getClass();
        int iIntValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        str.getClass();
        switch (AbstractC0432c.f5042a[annotationType.ordinal()]) {
            case 1:
                Object obj6 = list.get(1);
                fs6 fs6Var = dm8.f35853h;
                if (!fa4.m11650l(obj6, Boolean.FALSE) && obj6 != null) {
                    j37Var = (j37) ((vi3) fs6Var.f39591c).invoke(obj6);
                }
                j37Var.getClass();
                return new C3378nn(j37Var, iIntValue, iIntValue2, str);
            case 2:
                Object obj7 = list.get(1);
                fs6 fs6Var2 = dm8.f35854i;
                if (!fa4.m11650l(obj7, Boolean.FALSE) && obj7 != null) {
                    he9Var = (he9) ((vi3) fs6Var2.f39591c).invoke(obj7);
                }
                he9Var.getClass();
                return new C3378nn(he9Var, iIntValue, iIntValue2, str);
            case 3:
                Object obj8 = list.get(1);
                fs6 fs6Var3 = dm8.f35849d;
                if (!fa4.m11650l(obj8, Boolean.FALSE) && obj8 != null) {
                    ipaVar = (ipa) ((vi3) fs6Var3.f39591c).invoke(obj8);
                }
                ipaVar.getClass();
                return new C3378nn(ipaVar, iIntValue, iIntValue2, str);
            case 4:
                Object obj9 = list.get(1);
                fs6 fs6Var4 = dm8.f35850e;
                if (!fa4.m11650l(obj9, Boolean.FALSE) && obj9 != null) {
                    ljaVar = (lja) ((vi3) fs6Var4.f39591c).invoke(obj9);
                }
                ljaVar.getClass();
                return new C3378nn(ljaVar, iIntValue, iIntValue2, str);
            case 5:
                Object obj10 = list.get(1);
                fs6 fs6Var5 = dm8.f35851f;
                if (!fa4.m11650l(obj10, Boolean.FALSE) && obj10 != null) {
                    ee5Var = (ee5) ((vi3) fs6Var5.f39591c).invoke(obj10);
                }
                ee5Var.getClass();
                return new C3378nn(ee5Var, iIntValue, iIntValue2, str);
            case 6:
                Object obj11 = list.get(1);
                fs6 fs6Var6 = dm8.f35852g;
                if (!fa4.m11650l(obj11, Boolean.FALSE) && obj11 != null) {
                    de5Var = (de5) ((vi3) fs6Var6.f39591c).invoke(obj11);
                }
                de5Var.getClass();
                return new C3378nn(de5Var, iIntValue, iIntValue2, str);
            case 7:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                str2.getClass();
                return new C3378nn(new ok9(str2), iIntValue, iIntValue2, str);
            default:
                gm5.m12750e();
                return null;
        }
    }
}
