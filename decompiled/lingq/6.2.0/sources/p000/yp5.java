package p000;

import androidx.glance.appwidget.protobuf.MapFieldLite;

/* JADX INFO: loaded from: classes2.dex */
public final class yp5 {
    /* JADX INFO: renamed from: a */
    public static MapFieldLite m25242a(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteM2276c = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteM2276c.f6046a) {
                mapFieldLiteM2276c = mapFieldLiteM2276c.m2276c();
            }
            mapFieldLiteM2276c.m2275b();
            if (!mapFieldLite.isEmpty()) {
                mapFieldLiteM2276c.putAll(mapFieldLite);
            }
        }
        return mapFieldLiteM2276c;
    }
}
