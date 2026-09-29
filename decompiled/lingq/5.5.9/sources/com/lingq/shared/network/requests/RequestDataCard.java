package com.lingq.shared.network.requests;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestDataCard;", "", "<init>", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestDataCard {

    /* JADX INFO: renamed from: a */
    public String f18047a;

    /* JADX INFO: renamed from: b */
    public String f18048b;

    /* JADX INFO: renamed from: c */
    public int f18049c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "extended_status")
    public Integer f18050d;

    /* JADX INFO: renamed from: e */
    public String f18051e;

    /* JADX INFO: renamed from: f */
    public List<RequestHintUpdate> f18052f;

    /* JADX INFO: renamed from: g */
    public List<String> f18053g;

    public final String toString() {
        String str = this.f18047a;
        String str2 = this.f18048b;
        int i10 = this.f18049c;
        Integer num = this.f18050d;
        String str3 = this.f18051e;
        List<RequestHintUpdate> list = this.f18052f;
        List<String> list2 = this.f18053g;
        StringBuilder sbM855o = C0204c.m855o("RequestDataCard(term=", str, ", fragment=", str2, ", status=");
        sbM855o.append(i10);
        sbM855o.append(", extendedStatus=");
        sbM855o.append(num);
        sbM855o.append(", notes=");
        sbM855o.append(str3);
        sbM855o.append(", hints=");
        sbM855o.append(list);
        sbM855o.append(", tags=");
        return C0009a.m24m(sbM855o, list2, ")");
    }
}
