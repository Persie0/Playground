package com.lingq.shared.network.requests;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestTranslate;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestTranslate {

    /* JADX INFO: renamed from: a */
    public final String f18189a;

    /* JADX INFO: renamed from: b */
    public final String f18190b;

    /* JADX INFO: renamed from: c */
    public final String f18191c;

    public RequestTranslate(String str, String str2, String str3) {
        C5207g.m11111f(str, "source");
        C5207g.m11111f(str2, "target");
        C5207g.m11111f(str3, "text");
        this.f18189a = str;
        this.f18190b = str2;
        this.f18191c = str3;
    }
}
