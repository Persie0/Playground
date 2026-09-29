package com.google.firebase.messaging;

import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.util.HashMap;
import p178if.C6325a;
import ye.C10354c;
import ye.C10355d;

/* JADX INFO: renamed from: com.google.firebase.messaging.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3254q {

    /* JADX INFO: renamed from: a */
    public static final C10355d f16415a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C10354c c10354c = C10355d.a.f52064a;
        map.put(AbstractC3254q.class, C3235c.f16361a);
        map2.remove(AbstractC3254q.class);
        map.put(C6325a.class, C3233b.f16349a);
        map2.remove(C6325a.class);
        map.put(MessagingClientEvent.class, C3231a.f16328a);
        map2.remove(MessagingClientEvent.class);
        f16415a = new C10355d(new HashMap(map), new HashMap(map2), c10354c);
    }

    /* JADX INFO: renamed from: a */
    public abstract C6325a m9289a();
}
