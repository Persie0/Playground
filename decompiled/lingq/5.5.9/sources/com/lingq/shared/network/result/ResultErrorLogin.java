package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultErrorLogin;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ResultErrorLogin {

    /* JADX INFO: renamed from: a */
    public final String f18417a;

    /* JADX INFO: renamed from: b */
    @InterfaceC9303g(name = "non_field_errors")
    public final List<String> f18418b;

    public ResultErrorLogin() {
        this(null, null, 3, null);
    }

    public ResultErrorLogin(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 2) != 0 ? EmptyList.f38032a : list, (i10 & 1) != 0 ? "" : str);
    }

    public ResultErrorLogin(List list, String str) {
        C5207g.m11111f(str, "detail");
        C5207g.m11111f(list, "nonFieldErrors");
        this.f18417a = str;
        this.f18418b = list;
    }
}
