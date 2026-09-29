package com.tonyodev.fetch2;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.tonyodev.fetch2core.Extras;
import dm.C5207g;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C6753d;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00042\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/tonyodev/fetch2/Request;", "Lcom/tonyodev/fetch2/RequestInfo;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "CREATOR", "a", "fetch2_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public class Request extends RequestInfo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: H */
    public final String f32306H;

    /* JADX INFO: renamed from: k */
    public final int f32307k;

    /* JADX INFO: renamed from: l */
    public final String f32308l;

    /* JADX INFO: renamed from: com.tonyodev.fetch2.Request$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<Request> {
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // android.os.Parcelable.Creator
        public final Request createFromParcel(Parcel parcel) {
            C5207g.m11112g(parcel, "input");
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            String string2 = parcel.readString();
            String str = string2 != null ? string2 : "";
            long j10 = parcel.readLong();
            int i10 = parcel.readInt();
            Serializable serializable = parcel.readSerializable();
            if (serializable == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            }
            Map map = (Map) serializable;
            Priority.Companion companion = Priority.INSTANCE;
            int i11 = parcel.readInt();
            companion.getClass();
            Priority priorityM10596a = Priority.Companion.m10596a(i11);
            NetworkType.Companion companion2 = NetworkType.INSTANCE;
            int i12 = parcel.readInt();
            companion2.getClass();
            NetworkType networkTypeM10595a = NetworkType.Companion.m10595a(i12);
            String string3 = parcel.readString();
            EnqueueAction.Companion companion3 = EnqueueAction.INSTANCE;
            int i13 = parcel.readInt();
            companion3.getClass();
            EnqueueAction enqueueActionM10593a = EnqueueAction.Companion.m10593a(i13);
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            Serializable serializable2 = parcel.readSerializable();
            if (serializable2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            }
            Map map2 = (Map) serializable2;
            int i14 = parcel.readInt();
            Request request = new Request(string, str);
            request.f32309a = j10;
            request.f32310b = i10;
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                C5207g.m11112g(str2, "key");
                C5207g.m11112g(str3, "value");
                request.f32311c.put(str2, str3);
            }
            C5207g.m11112g(priorityM10596a, "<set-?>");
            request.f32312d = priorityM10596a;
            C5207g.m11112g(networkTypeM10595a, "<set-?>");
            request.f32313e = networkTypeM10595a;
            request.f32314f = string3;
            C5207g.m11112g(enqueueActionM10593a, "<set-?>");
            request.f32315g = enqueueActionM10593a;
            request.f32316h = z10;
            request.f32318j = new Extras(C6753d.m13465R0(new Extras(map2).f32541a));
            if (i14 < 0) {
                throw new IllegalArgumentException("The maximum number of attempts has to be greater than -1");
            }
            request.f32317i = i14;
            return request;
        }

        @Override // android.os.Parcelable.Creator
        public final Request[] newArray(int i10) {
            return new Request[i10];
        }
    }

    public Request(String str, String str2) {
        C5207g.m11112g(str, "url");
        C5207g.m11112g(str2, "file");
        this.f32308l = str;
        this.f32306H = str2;
        this.f32307k = str2.hashCode() + (str.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.tonyodev.fetch2.RequestInfo
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((!C5207g.m11106a(getClass(), obj != null ? obj.getClass() : null)) || !super.equals(obj)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2.Request");
        }
        Request request = (Request) obj;
        return (this.f32307k != request.f32307k || (C5207g.m11106a(this.f32308l, request.f32308l) ^ true) || (C5207g.m11106a(this.f32306H, request.f32306H) ^ true)) ? false : true;
    }

    @Override // com.tonyodev.fetch2.RequestInfo
    public final int hashCode() {
        return this.f32306H.hashCode() + C0166e.m758d(this.f32308l, ((super.hashCode() * 31) + this.f32307k) * 31, 31);
    }

    @Override // com.tonyodev.fetch2.RequestInfo
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request(url='");
        sb2.append(this.f32308l);
        sb2.append("', file='");
        sb2.append(this.f32306H);
        sb2.append("', id=");
        sb2.append(this.f32307k);
        sb2.append(", groupId=");
        sb2.append(this.f32310b);
        sb2.append(", headers=");
        sb2.append(this.f32311c);
        sb2.append(", priority=");
        sb2.append(this.f32312d);
        sb2.append(", networkType=");
        sb2.append(this.f32313e);
        sb2.append(", tag=");
        return C0009a.m22j(sb2, this.f32314f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11112g(parcel, "parcel");
        parcel.writeString(this.f32308l);
        parcel.writeString(this.f32306H);
        parcel.writeLong(this.f32309a);
        parcel.writeInt(this.f32310b);
        parcel.writeSerializable(new HashMap(this.f32311c));
        parcel.writeInt(this.f32312d.getValue());
        parcel.writeInt(this.f32313e.getValue());
        parcel.writeString(this.f32314f);
        parcel.writeInt(this.f32315g.getValue());
        parcel.writeInt(this.f32316h ? 1 : 0);
        parcel.writeSerializable(new HashMap(C6753d.m13465R0(this.f32318j.f32541a)));
        parcel.writeInt(this.f32317i);
    }
}
