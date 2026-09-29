package com.tonyodev.fetch2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.tonyodev.fetch2core.Extras;
import dm.C5207g;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import p099el.C5427b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/tonyodev/fetch2/RequestInfo;", "Ljava/io/Serializable;", "<init>", "()V", "fetch2_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public class RequestInfo implements Serializable {

    /* JADX INFO: renamed from: a */
    public long f32309a;

    /* JADX INFO: renamed from: b */
    public int f32310b;

    /* JADX INFO: renamed from: f */
    public String f32314f;

    /* JADX INFO: renamed from: i */
    public int f32317i;

    /* JADX INFO: renamed from: j */
    public Extras f32318j;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f32311c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public Priority f32312d = C5427b.f33966c;

    /* JADX INFO: renamed from: e */
    public NetworkType f32313e = C5427b.f33964a;

    /* JADX INFO: renamed from: g */
    public EnqueueAction f32315g = C5427b.f33970g;

    /* JADX INFO: renamed from: h */
    public boolean f32316h = true;

    public RequestInfo() {
        Extras.INSTANCE.getClass();
        this.f32318j = Extras.f32540b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2.RequestInfo");
        }
        RequestInfo requestInfo = (RequestInfo) obj;
        if (this.f32309a == requestInfo.f32309a && this.f32310b == requestInfo.f32310b && !(!C5207g.m11106a(this.f32311c, requestInfo.f32311c)) && this.f32312d == requestInfo.f32312d && this.f32313e == requestInfo.f32313e && !(!C5207g.m11106a(this.f32314f, requestInfo.f32314f)) && this.f32315g == requestInfo.f32315g && this.f32316h == requestInfo.f32316h && !(!C5207g.m11106a(this.f32318j, requestInfo.f32318j)) && this.f32317i == requestInfo.f32317i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f32313e.hashCode() + ((this.f32312d.hashCode() + ((this.f32311c.hashCode() + (((Long.valueOf(this.f32309a).hashCode() * 31) + this.f32310b) * 31)) * 31)) * 31)) * 31;
        String str = this.f32314f;
        return ((this.f32318j.hashCode() + ((Boolean.valueOf(this.f32316h).hashCode() + ((this.f32315g.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31) + this.f32317i;
    }

    public String toString() {
        return "RequestInfo(identifier=" + this.f32309a + ", groupId=" + this.f32310b + ", headers=" + this.f32311c + ", priority=" + this.f32312d + ", networkType=" + this.f32313e + ", tag=" + this.f32314f + ", enqueueAction=" + this.f32315g + ", downloadOnEnqueue=" + this.f32316h + ", autoRetryMaxAttempts=" + this.f32317i + ", extras=" + this.f32318j + ')';
    }
}
