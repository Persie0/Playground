package com.lingq.shared.uimodel;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/UserReferral;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserReferral {

    /* JADX INFO: renamed from: a */
    public final String f21630a;

    public UserReferral(String str) {
        this.f21630a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserReferral) && C5207g.m11106a(this.f21630a, ((UserReferral) obj).f21630a);
    }

    public final int hashCode() {
        String str = this.f21630a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("UserReferral(photo="), this.f21630a, ")");
    }
}
