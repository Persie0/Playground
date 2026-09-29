package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultErrorUpgrade;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultErrorUpgrade {

    /* JADX INFO: renamed from: a */
    public final String f18423a;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultErrorUpgrade() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ResultErrorUpgrade(String str) {
        C5207g.m11111f(str, "detail");
        this.f18423a = str;
    }

    public /* synthetic */ ResultErrorUpgrade(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
