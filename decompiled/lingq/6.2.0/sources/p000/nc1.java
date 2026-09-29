package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc1 implements wr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uc1 f52589b;

    public /* synthetic */ nc1(uc1 uc1Var, int i) {
        this.f52588a = i;
        this.f52589b = uc1Var;
    }

    @Override // p000.wr6
    /* JADX INFO: renamed from: a */
    public final void mo9822a(uc1 uc1Var) {
        int i = this.f52588a;
        uc1 uc1Var2 = this.f52589b;
        switch (i) {
            case 0:
                uc1Var.getClass();
                Bundle bundleM12108m = ((fs6) uc1Var2.f63700d.f39591c).m12108m("android:support:activity-result");
                if (bundleM12108m != null) {
                    sc1 sc1Var = uc1Var2.f63705i;
                    LinkedHashMap linkedHashMap = sc1Var.f60658b;
                    LinkedHashMap linkedHashMap2 = sc1Var.f60657a;
                    Bundle bundle = sc1Var.f60663g;
                    ArrayList<Integer> integerArrayList = bundleM12108m.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM12108m.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleM12108m.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            sc1Var.f60660d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleM12108m.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    lda.m16118d(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            sc1Var.f60658b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                hd3 hd3Var = (hd3) ((id3) uc1Var2).f43959Q.f50618b;
                hd3Var.f42212N.m2156b(hd3Var, hd3Var, null);
                break;
        }
    }
}
