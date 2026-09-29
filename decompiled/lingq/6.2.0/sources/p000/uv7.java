package p000;

import com.lingq.feature.reader.content.state.C2264a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class uv7 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2264a f64408a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LinkedHashMap f64409b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f64410c;

    public uv7(C2264a c2264a, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        this.f64408a = c2264a;
        this.f64409b = linkedHashMap;
        this.f64410c = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iIntValue;
        String strMo8037d = ((w65) obj).mo8037d();
        C2264a c2264a = this.f64408a;
        String strM23610P = vz1.m23610P(strMo8037d, c2264a.m9267i());
        LinkedHashMap linkedHashMap = this.f64409b;
        Integer num = (Integer) linkedHashMap.get(strM23610P);
        int iIntValue2 = -1;
        int i = 0;
        ArrayList arrayList = this.f64410c;
        if (num == null) {
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIntValue = -1;
                    break;
                }
                if (fa4.m11650l((String) it.next(), strM23610P)) {
                    iIntValue = i2;
                    break;
                }
                i2++;
            }
        } else {
            iIntValue = num.intValue();
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        String strM23610P2 = vz1.m23610P(((w65) obj2).mo8037d(), c2264a.m9267i());
        Integer num2 = (Integer) linkedHashMap.get(strM23610P2);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (fa4.m11650l((String) it2.next(), strM23610P2)) {
                    iIntValue2 = i;
                    break;
                }
                i++;
            }
        }
        return ss5.m21718o(numValueOf, Integer.valueOf(iIntValue2));
    }
}
