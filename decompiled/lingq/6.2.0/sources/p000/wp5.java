package p000;

import com.google.crypto.tink.shaded.protobuf.MapFieldLite;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wp5 {
    /* JADX INFO: renamed from: a */
    public static void m24098a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        g9a.m12435l(obj2);
        if (mapFieldLite.isEmpty()) {
            return;
        }
        Iterator it = mapFieldLite.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static MapFieldLite m24099b(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteM6428g = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteM6428g.m6425d()) {
                mapFieldLiteM6428g = mapFieldLiteM6428g.m6428g();
            }
            mapFieldLiteM6428g.m6427f(mapFieldLite);
        }
        return mapFieldLiteM6428g;
    }
}
