package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/SocialSettingsType;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class SocialSettingsType {

    /* JADX INFO: renamed from: a */
    public final String f17452a;

    /* JADX INFO: renamed from: b */
    public final String f17453b;

    public SocialSettingsType(String str, String str2) {
        this.f17452a = str;
        this.f17453b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialSettingsType)) {
            return false;
        }
        SocialSettingsType socialSettingsType = (SocialSettingsType) obj;
        return C5207g.m11106a(this.f17452a, socialSettingsType.f17452a) && C5207g.m11106a(this.f17453b, socialSettingsType.f17453b);
    }

    public final int hashCode() {
        String str = this.f17452a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17453b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SocialSettingsType(description=");
        sb2.append(this.f17452a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f17453b, ")");
    }
}
