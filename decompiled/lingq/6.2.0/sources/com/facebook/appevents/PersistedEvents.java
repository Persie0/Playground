package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p000.lp1;

/* JADX INFO: loaded from: classes.dex */
public final class PersistedEvents implements Serializable {

    /* JADX INFO: renamed from: a */
    public final HashMap f11389a;

    public static final class SerializationProxyV1 implements Serializable {

        /* JADX INFO: renamed from: a */
        public final HashMap f11390a;

        public SerializationProxyV1(HashMap map) {
            map.getClass();
            this.f11390a = map;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new PersistedEvents(this.f11390a);
        }
    }

    public PersistedEvents(HashMap map) {
        map.getClass();
        HashMap map2 = new HashMap();
        this.f11389a = map2;
        map2.putAll(map);
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            return new SerializationProxyV1(this.f11389a);
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5185a(AccessTokenAppIdPair accessTokenAppIdPair, List list) {
        HashMap map = this.f11389a;
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            list.getClass();
            if (!map.containsKey(accessTokenAppIdPair)) {
                map.put(accessTokenAppIdPair, new ArrayList(list));
                return;
            }
            List list2 = (List) map.get(accessTokenAppIdPair);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    public PersistedEvents() {
        this.f11389a = new HashMap();
    }
}
