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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultRegistrationError;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultRegistrationError {

    /* JADX INFO: renamed from: a */
    @InterfaceC9303g(name = "email")
    public final List<String> f18918a;

    /* JADX INFO: renamed from: b */
    @InterfaceC9303g(name = "username")
    public final List<String> f18919b;

    public ResultRegistrationError() {
        this(null, null, 3, null);
    }

    public ResultRegistrationError(List<String> list, List<String> list2) {
        C5207g.m11111f(list, "emailError");
        C5207g.m11111f(list2, "usernameError");
        this.f18918a = list;
        this.f18919b = list2;
    }

    public ResultRegistrationError(List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EmptyList.f38032a : list, (i10 & 2) != 0 ? EmptyList.f38032a : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultRegistrationError)) {
            return false;
        }
        ResultRegistrationError resultRegistrationError = (ResultRegistrationError) obj;
        return C5207g.m11106a(this.f18918a, resultRegistrationError.f18918a) && C5207g.m11106a(this.f18919b, resultRegistrationError.f18919b);
    }

    public final int hashCode() {
        return this.f18919b.hashCode() + (this.f18918a.hashCode() * 31);
    }

    public final String toString() {
        return "ResponseRegistrationError{emailError=" + this.f18918a + ", usernameError=" + this.f18919b + "}";
    }
}
