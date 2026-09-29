package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0837e0 implements InterfaceC0834d0 {
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0834d0
    /* JADX INFO: renamed from: a */
    public final MapFieldLite mo3201a(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteM3151d = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteM3151d.f5815a) {
                mapFieldLiteM3151d = mapFieldLiteM3151d.m3151d();
            }
            mapFieldLiteM3151d.m3150c();
            if (!mapFieldLite.isEmpty()) {
                mapFieldLiteM3151d.putAll(mapFieldLite);
            }
        }
        return mapFieldLiteM3151d;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0834d0
    /* JADX INFO: renamed from: b */
    public final Object mo3202b(Object obj) {
        ((MapFieldLite) obj).f5815a = false;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0834d0
    /* JADX INFO: renamed from: c */
    public final C0831c0.a<?, ?> mo3203c(Object obj) {
        return ((C0831c0) obj).f5823a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0834d0
    /* JADX INFO: renamed from: d */
    public final MapFieldLite mo3204d() {
        return MapFieldLite.f5814b.m3151d();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0834d0
    /* JADX INFO: renamed from: e */
    public final MapFieldLite mo3205e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0834d0
    /* JADX INFO: renamed from: f */
    public final int mo3206f(Object obj, int i10, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        C0831c0 c0831c0 = (C0831c0) obj2;
        int iM3086v = 0;
        if (!mapFieldLite.isEmpty()) {
            for (Map.Entry entry : mapFieldLite.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                c0831c0.getClass();
                int iM3084t = CodedOutputStream.m3084t(i10);
                int iM3195a = C0831c0.m3195a(c0831c0.f5823a, key, value);
                iM3086v += CodedOutputStream.m3086v(iM3195a) + iM3195a + iM3084t;
            }
        }
        return iM3086v;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0834d0
    /* JADX INFO: renamed from: g */
    public final boolean mo3207g(Object obj) {
        return !((MapFieldLite) obj).f5815a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0834d0
    /* JADX INFO: renamed from: h */
    public final MapFieldLite mo3208h(Object obj) {
        return (MapFieldLite) obj;
    }
}
