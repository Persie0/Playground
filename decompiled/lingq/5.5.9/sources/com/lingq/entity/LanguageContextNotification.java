package com.lingq.entity;

import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/LanguageContextNotification;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LanguageContextNotification {

    /* JADX INFO: renamed from: a */
    public String f17021a;

    /* JADX INFO: renamed from: b */
    public final String f17022b;

    public LanguageContextNotification(String str, String str2) {
        this.f17021a = str;
        this.f17022b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageContextNotification)) {
            return false;
        }
        LanguageContextNotification languageContextNotification = (LanguageContextNotification) obj;
        return C5207g.m11106a(this.f17021a, languageContextNotification.f17021a) && C5207g.m11106a(this.f17022b, languageContextNotification.f17022b);
    }

    public final int hashCode() {
        String str = this.f17021a;
        int iHashCode = 0;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17022b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return C0009a.m23l(C0204c.m854m("LanguageContextNotification(lotd=", this.f17021a, ", weekly="), this.f17022b, ")");
    }
}
