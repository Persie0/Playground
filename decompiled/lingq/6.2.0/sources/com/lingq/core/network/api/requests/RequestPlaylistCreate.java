package com.lingq.core.network.api.requests;

import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class RequestPlaylistCreate {
    public static final C1589n0 Companion = new C1589n0();

    /* JADX INFO: renamed from: a */
    public String f20415a;

    /* JADX INFO: renamed from: b */
    public String f20416b;

    public RequestPlaylistCreate(String str, String str2) {
        this.f20415a = str;
        this.f20416b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestPlaylistCreate)) {
            return false;
        }
        RequestPlaylistCreate requestPlaylistCreate = (RequestPlaylistCreate) obj;
        return fa4.m11650l(this.f20415a, requestPlaylistCreate.f20415a) && fa4.m11650l(this.f20416b, requestPlaylistCreate.f20416b);
    }

    public final int hashCode() {
        String str = this.f20415a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20416b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ux5.m22991n("RequestPlaylistCreate(title=", this.f20415a, ", titleLanguage=", this.f20416b, ")");
    }
}
