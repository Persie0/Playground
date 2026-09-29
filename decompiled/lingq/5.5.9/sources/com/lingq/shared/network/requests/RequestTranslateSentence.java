package com.lingq.shared.network.requests;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/RequestTranslateSentence;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class RequestTranslateSentence {

    /* JADX INFO: renamed from: a */
    public final String f18194a;

    /* JADX INFO: renamed from: b */
    @InterfaceC9303g(name = "is_google_translate")
    public final boolean f18195b;

    /* JADX INFO: renamed from: c */
    public final int f18196c;

    public RequestTranslateSentence(String str, int i10, boolean z10) {
        C5207g.m11111f(str, "language");
        this.f18194a = str;
        this.f18195b = z10;
        this.f18196c = i10;
    }

    public /* synthetic */ RequestTranslateSentence(String str, boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, (i11 & 2) != 0 ? true : z10);
    }
}
