package com.lingq.shared.uimodel.language;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserActivityLevel;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserActivityLevel {

    /* JADX INFO: renamed from: a */
    public final int f21693a;

    public UserActivityLevel() {
        this(0, 1, null);
    }

    public UserActivityLevel(int i10) {
        this.f21693a = i10;
    }

    public /* synthetic */ UserActivityLevel(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserActivityLevel) && this.f21693a == ((UserActivityLevel) obj).f21693a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21693a);
    }

    public final String toString() {
        return C0166e.m768o(new StringBuilder("UserActivityLevel(id="), this.f21693a, ")");
    }
}
