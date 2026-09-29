package se;

import org.json.JSONObject;
import p241le.C7341l;

/* JADX INFO: renamed from: se.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8991a implements InterfaceC8995e {
    /* JADX INFO: renamed from: b */
    public static C8992b m17233b(C7341l c7341l) {
        C8992b.b bVar = new C8992b.b(8);
        C8992b.a aVar = new C8992b.a(true, false, false);
        c7341l.getClass();
        return new C8992b(System.currentTimeMillis() + ((long) 3600000), bVar, aVar, 10.0d, 1.2d, 60);
    }

    @Override // se.InterfaceC8995e
    /* JADX INFO: renamed from: a */
    public final C8992b mo17234a(C7341l c7341l, JSONObject jSONObject) {
        return m17233b(c7341l);
    }
}
