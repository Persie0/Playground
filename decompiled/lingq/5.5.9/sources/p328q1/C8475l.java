package p328q1;

import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6752c;
import p003a2.C0009a;
import tl.C9327o;

/* JADX INFO: renamed from: q1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C8475l {

    /* JADX INFO: renamed from: a */
    public final ArrayList f45645a;

    public C8475l(InterfaceC8474k... interfaceC8474kArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC8474k interfaceC8474k : interfaceC8474kArr) {
            String strM16551c = interfaceC8474k.m16551c();
            Object arrayList = linkedHashMap.get(strM16551c);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strM16551c, arrayList);
            }
            ((List) arrayList).add(interfaceC8474k);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (!(list.size() != 1 ? false : true)) {
                throw new IllegalArgumentException(C0009a.m22j(C0204c.m854m("'", str, "' must be unique. Actual [ ["), C6752c.m13430X(list, null, null, null, null, 63), ']').toString());
            }
            C9327o.m17684D(list, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.f45645a = arrayList3;
        int size = arrayList3.size();
        for (int i10 = 0; i10 < size && !((InterfaceC8474k) arrayList3.get(i10)).m16549a(); i10++) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C8475l) && C5207g.m11106a(this.f45645a, ((C8475l) obj).f45645a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45645a.hashCode();
    }
}
