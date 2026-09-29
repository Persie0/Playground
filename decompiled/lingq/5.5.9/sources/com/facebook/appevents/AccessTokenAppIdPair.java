package com.facebook.appevents;

import dm.C5207g;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.Metadata;
import p067d8.C5086z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0005"}, m13365d2 = {"Lcom/facebook/appevents/AccessTokenAppIdPair;", "Ljava/io/Serializable;", "", "writeReplace", "SerializationProxyV1", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class AccessTokenAppIdPair implements Serializable {

    /* JADX INFO: renamed from: a */
    public final String f11475a;

    /* JADX INFO: renamed from: b */
    public final String f11476b;

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, m13365d2 = {"Lcom/facebook/appevents/AccessTokenAppIdPair$SerializationProxyV1;", "Ljava/io/Serializable;", "", "readResolve", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
    public static final class SerializationProxyV1 implements Serializable {

        /* JADX INFO: renamed from: a */
        public final String f11477a;

        /* JADX INFO: renamed from: b */
        public final String f11478b;

        public SerializationProxyV1(String str, String str2) {
            C5207g.m11111f(str2, "appId");
            this.f11477a = str;
            this.f11478b = str2;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new AccessTokenAppIdPair(this.f11477a, this.f11478b);
        }
    }

    public AccessTokenAppIdPair(String str, String str2) {
        C5207g.m11111f(str2, "applicationId");
        this.f11475a = str2;
        this.f11476b = C5086z.m10802A(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new SerializationProxyV1(this.f11476b, this.f11475a);
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        C5086z c5086z = C5086z.f33015a;
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        if (C5086z.m10816a(accessTokenAppIdPair.f11476b, this.f11476b) && C5086z.m10816a(accessTokenAppIdPair.f11475a, this.f11475a)) {
            z10 = true;
        }
        return z10;
    }

    public final int hashCode() {
        String str = this.f11476b;
        return (str == null ? 0 : str.hashCode()) ^ this.f11475a.hashCode();
    }
}
