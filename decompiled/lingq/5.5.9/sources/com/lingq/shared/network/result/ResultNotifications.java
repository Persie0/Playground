package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultNotifications;", "", "", "count", "", "next", "previous", "unreadNotifications", "", "Lcom/lingq/shared/network/result/ResultNotification;", "results", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/lingq/shared/network/result/ResultNotifications;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultNotifications {

    /* JADX INFO: renamed from: a */
    public final int f18810a;

    /* JADX INFO: renamed from: b */
    public final String f18811b;

    /* JADX INFO: renamed from: c */
    public final String f18812c;

    /* JADX INFO: renamed from: d */
    public final Integer f18813d;

    /* JADX INFO: renamed from: e */
    public final List<ResultNotification> f18814e;

    public ResultNotifications(int i10, String str, String str2, @InterfaceC9303g(name = "new_notifications") Integer num, List<ResultNotification> list) {
        this.f18810a = i10;
        this.f18811b = str;
        this.f18812c = str2;
        this.f18813d = num;
        this.f18814e = list;
    }

    public ResultNotifications(int i10, String str, String str2, Integer num, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, str, str2, num, (i11 & 16) != 0 ? EmptyList.f38032a : list);
    }

    public final ResultNotifications copy(int count, String next, String previous, @InterfaceC9303g(name = "new_notifications") Integer unreadNotifications, List<ResultNotification> results) {
        return new ResultNotifications(count, next, previous, unreadNotifications, results);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultNotifications)) {
            return false;
        }
        ResultNotifications resultNotifications = (ResultNotifications) obj;
        return this.f18810a == resultNotifications.f18810a && C5207g.m11106a(this.f18811b, resultNotifications.f18811b) && C5207g.m11106a(this.f18812c, resultNotifications.f18812c) && C5207g.m11106a(this.f18813d, resultNotifications.f18813d) && C5207g.m11106a(this.f18814e, resultNotifications.f18814e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18810a) * 31;
        String str = this.f18811b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18812c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f18813d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<ResultNotification> list = this.f18814e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultNotifications(count=");
        sb2.append(this.f18810a);
        sb2.append(", next=");
        sb2.append(this.f18811b);
        sb2.append(", previous=");
        sb2.append(this.f18812c);
        sb2.append(", unreadNotifications=");
        sb2.append(this.f18813d);
        sb2.append(", results=");
        return C0009a.m24m(sb2, this.f18814e, ")");
    }
}
