package com.google.android.datatransport.cct.internal;

import p432v8.AbstractC9668a;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2340b extends ClientInfo {

    /* JADX INFO: renamed from: a */
    public final ClientInfo.ClientType f11771a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9668a f11772b;

    public C2340b(ClientInfo.ClientType clientType, AbstractC9668a abstractC9668a) {
        this.f11771a = clientType;
        this.f11772b = abstractC9668a;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    /* JADX INFO: renamed from: a */
    public final AbstractC9668a mo6752a() {
        return this.f11772b;
    }

    @Override // com.google.android.datatransport.cct.internal.ClientInfo
    /* JADX INFO: renamed from: b */
    public final ClientInfo.ClientType mo6753b() {
        return this.f11771a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        AbstractC9668a abstractC9668a;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        ClientInfo.ClientType clientType = this.f11771a;
        if (clientType == null) {
            if (clientInfo.mo6753b() == null) {
                abstractC9668a = this.f11772b;
                if (abstractC9668a == null) {
                    if (clientInfo.mo6752a() == null) {
                        return true;
                    }
                } else if (abstractC9668a.equals(clientInfo.mo6752a())) {
                    return true;
                }
            }
        } else if (clientType.equals(clientInfo.mo6753b())) {
            abstractC9668a = this.f11772b;
            if (abstractC9668a == null) {
                if (clientInfo.mo6752a() == null) {
                    return true;
                }
            } else if (abstractC9668a.equals(clientInfo.mo6752a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ClientInfo.ClientType clientType = this.f11771a;
        int iHashCode = ((clientType == null ? 0 : clientType.hashCode()) ^ 1000003) * 1000003;
        AbstractC9668a abstractC9668a = this.f11772b;
        return (abstractC9668a != null ? abstractC9668a.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f11771a + ", androidClientInfo=" + this.f11772b + "}";
    }
}
