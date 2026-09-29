package com.lingq.shared.network.requests;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestLessonUpdateTimestamps;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class RequestLessonUpdateTimestamps {

    /* JADX INFO: renamed from: a */
    public final Integer f18121a;

    /* JADX INFO: renamed from: b */
    public final List<Double> f18122b;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestLessonUpdateTimestamps() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public RequestLessonUpdateTimestamps(Integer num, List<Double> list) {
        this.f18121a = num;
        this.f18122b = list;
    }

    public /* synthetic */ RequestLessonUpdateTimestamps(Integer num, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestLessonUpdateTimestamps)) {
            return false;
        }
        RequestLessonUpdateTimestamps requestLessonUpdateTimestamps = (RequestLessonUpdateTimestamps) obj;
        return C5207g.m11106a(this.f18121a, requestLessonUpdateTimestamps.f18121a) && C5207g.m11106a(this.f18122b, requestLessonUpdateTimestamps.f18122b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        Integer num = this.f18121a;
        int iHashCode2 = (num == null ? 0 : num.hashCode()) * 31;
        List<Double> list = this.f18122b;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "RequestLessonUpdateTimestamps(index=" + this.f18121a + ", timestamp=" + this.f18122b + ")";
    }
}
