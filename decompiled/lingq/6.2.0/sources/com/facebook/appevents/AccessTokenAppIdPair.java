package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import p000.bna;

/* JADX INFO: loaded from: classes.dex */
public final class AccessTokenAppIdPair implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f11376a;

    /* JADX INFO: renamed from: b */
    public final String f11377b;

    public static final class SerializationProxyV1 implements Serializable {

        /* JADX INFO: renamed from: a */
        public final String f11378a;

        public SerializationProxyV1(String str) {
            this.f11378a = str;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new AccessTokenAppIdPair(null, this.f11378a);
        }
    }

    public AccessTokenAppIdPair(String str, String str2) {
        this.f11376a = str2;
        this.f11377b = bna.m3945d0(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new SerializationProxyV1(this.f11376a);
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj instanceof AccessTokenAppIdPair) {
            AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
            String str = accessTokenAppIdPair.f11377b;
            String str2 = this.f11377b;
            if (str == null) {
                zEquals = str2 == null;
            } else {
                zEquals = str.equals(str2);
            }
            if (zEquals && accessTokenAppIdPair.f11376a.equals(this.f11376a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f11377b;
        return this.f11376a.hashCode() ^ (str != null ? str.hashCode() : 0);
    }
}
