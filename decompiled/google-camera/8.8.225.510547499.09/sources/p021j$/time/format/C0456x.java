package p021j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: j$.time.format.x */
/* JADX INFO: loaded from: classes3.dex */
final class C0456x {

    /* JADX INFO: renamed from: a */
    private final Map f32991a;

    C0456x(Map map) {
        this.f32991a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l = (Long) entry2.getKey();
                int i = C0457y.f32995d;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, C0457y.f32993b);
            map2.put((EnumC0432C) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, C0457y.f32993b);
    }

    /* JADX INFO: renamed from: a */
    final String m12316a(long j, EnumC0432C enumC0432C) {
        Map map = (Map) this.f32991a.get(enumC0432C);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
