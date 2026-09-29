package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: pn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3466pn {

    /* JADX INFO: renamed from: a */
    public static final C3419on f56487a = new C3419on("");

    /* JADX INFO: renamed from: a */
    public static final List m19403a(C3419on c3419on, int i, int i2, C2951e4 c2951e4) {
        List list;
        if (i == i2 || (list = c3419on.f54603a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= c3419on.f54604b.length()) {
            if (c2951e4 == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) c2951e4.invoke(((C3378nn) obj).f52979a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            C3378nn c3378nn = (C3378nn) list.get(i3);
            if (c2951e4 != null ? ((Boolean) c2951e4.invoke(c3378nn.f52979a)).booleanValue() : true) {
                int i4 = c3378nn.f52980b;
                int i5 = c3378nn.f52981c;
                if (m19404b(i, i2, i4, i5)) {
                    arrayList2.add(new C3378nn((InterfaceC3190kn) c3378nn.f52979a, l70.m15945h(c3378nn.f52980b, i, i2) - i, l70.m15945h(i5, i, i2) - i, c3378nn.f52982d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m19404b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
