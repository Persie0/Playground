package com.lingq.shared.network.requests;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/shared/network/requests/Receipt;", "", "<init>", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class Receipt {

    /* JADX INFO: renamed from: a */
    public String f18010a;

    /* JADX INFO: renamed from: b */
    public String f18011b;

    /* JADX INFO: renamed from: c */
    public String f18012c;

    /* JADX INFO: renamed from: d */
    public long f18013d;

    /* JADX INFO: renamed from: e */
    public int f18014e;

    /* JADX INFO: renamed from: f */
    public String f18015f;

    /* JADX INFO: renamed from: g */
    public boolean f18016g;

    public final String toString() {
        String str = this.f18010a;
        String str2 = this.f18011b;
        String str3 = this.f18012c;
        long j10 = this.f18013d;
        int i10 = this.f18014e;
        String str4 = this.f18015f;
        boolean z10 = this.f18016g;
        StringBuilder sbM855o = C0204c.m855o("Receipt{orderId='", str, "', packageName='", str2, "', productId='");
        sbM855o.append(str3);
        sbM855o.append("', purchaseTime=");
        sbM855o.append(j10);
        sbM855o.append(", purchaseState=");
        sbM855o.append(i10);
        sbM855o.append(", purchaseToken='");
        sbM855o.append(str4);
        sbM855o.append("', autoRenewing=");
        sbM855o.append(z10);
        sbM855o.append("}");
        return sbM855o.toString();
    }
}
