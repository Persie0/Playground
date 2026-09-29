package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Tab;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Tab {

    /* JADX INFO: renamed from: a */
    public final String f17493a;

    /* JADX INFO: renamed from: b */
    public final String f17494b;

    /* JADX INFO: renamed from: c */
    public final String f17495c;

    /* JADX INFO: renamed from: d */
    public final String f17496d;

    /* JADX INFO: renamed from: e */
    public final Boolean f17497e;

    /* JADX INFO: renamed from: f */
    public final Integer f17498f;

    public Tab(Boolean bool, Integer num, String str, String str2, String str3, String str4) {
        this.f17493a = str;
        this.f17494b = str2;
        this.f17495c = str3;
        this.f17496d = str4;
        this.f17497e = bool;
        this.f17498f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tab)) {
            return false;
        }
        Tab tab = (Tab) obj;
        return C5207g.m11106a(this.f17493a, tab.f17493a) && C5207g.m11106a(this.f17494b, tab.f17494b) && C5207g.m11106a(this.f17495c, tab.f17495c) && C5207g.m11106a(this.f17496d, tab.f17496d) && C5207g.m11106a(this.f17497e, tab.f17497e) && C5207g.m11106a(this.f17498f, tab.f17498f);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f17493a;
        int iM758d = C0166e.m758d(this.f17495c, C0166e.m758d(this.f17494b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f17496d;
        int iHashCode2 = (iM758d + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f17497e;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f17498f;
        if (num != null) {
            iHashCode = num.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    public final String toString() {
        return "Tab(preview=" + this.f17493a + ", apiUrl=" + this.f17494b + ", display=" + this.f17495c + ", title=" + this.f17496d + ", selected=" + this.f17497e + ", level=" + this.f17498f + ")";
    }
}
