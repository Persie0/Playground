package com.facebook.appevents;

import dm.C5207g;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import p173i8.C6205a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, m13365d2 = {"Lcom/facebook/appevents/PersistedEvents;", "Ljava/io/Serializable;", "", "writeReplace", "<init>", "()V", "SerializationProxyV1", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class PersistedEvents implements Serializable {

    /* JADX INFO: renamed from: a */
    public final HashMap<AccessTokenAppIdPair, List<AppEvent>> f11489a;

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, m13365d2 = {"Lcom/facebook/appevents/PersistedEvents$SerializationProxyV1;", "Ljava/io/Serializable;", "", "readResolve", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public static final class SerializationProxyV1 implements Serializable {

        /* JADX INFO: renamed from: a */
        public final HashMap<AccessTokenAppIdPair, List<AppEvent>> f11490a;

        public SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> map) {
            C5207g.m11111f(map, "proxyEvents");
            this.f11490a = map;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new PersistedEvents(this.f11490a);
        }
    }

    public PersistedEvents() {
        this.f11489a = new HashMap<>();
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> map) {
        C5207g.m11111f(map, "appEventMap");
        HashMap<AccessTokenAppIdPair, List<AppEvent>> map2 = new HashMap<>();
        this.f11489a = map2;
        map2.putAll(map);
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            return new SerializationProxyV1(this.f11489a);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6642a(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> list) {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            C5207g.m11111f(list, "appEvents");
            HashMap<AccessTokenAppIdPair, List<AppEvent>> map = this.f11489a;
            if (!map.containsKey(accessTokenAppIdPair)) {
                map.put(accessTokenAppIdPair, C6752c.m13454v0(list));
                return;
            }
            List<AppEvent> list2 = map.get(accessTokenAppIdPair);
            if (list2 == null) {
                return;
            }
            list2.addAll(list);
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
