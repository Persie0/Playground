package com.lingq.shared.network.requests;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestHintUpdate;", "", "<init>", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestHintUpdate {

    /* JADX INFO: renamed from: a */
    public String f18070a;

    /* JADX INFO: renamed from: b */
    public String f18071b;

    /* JADX INFO: renamed from: c */
    public String f18072c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "is_google_translate")
    public boolean f18073d;

    public final String toString() {
        String str = this.f18070a;
        String str2 = this.f18071b;
        String str3 = this.f18072c;
        boolean z10 = this.f18073d;
        StringBuilder sbM855o = C0204c.m855o("RequestHintModel(locale=", str, ", text=", str2, ", term=");
        sbM855o.append(str3);
        sbM855o.append(", isGoogleTranslate=");
        sbM855o.append(z10);
        sbM855o.append(")");
        return sbM855o.toString();
    }
}
