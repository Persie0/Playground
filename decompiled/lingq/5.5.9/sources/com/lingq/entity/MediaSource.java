package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/MediaSource;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class MediaSource {

    /* JADX INFO: renamed from: a */
    public final String f17293a;

    /* JADX INFO: renamed from: b */
    public final String f17294b;

    /* JADX INFO: renamed from: c */
    public final String f17295c;

    public MediaSource() {
        this(null, null, null, 7, null);
    }

    public MediaSource(String str, String str2, String str3) {
        this.f17293a = str;
        this.f17294b = str2;
        this.f17295c = str3;
    }

    public /* synthetic */ MediaSource(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSource)) {
            return false;
        }
        MediaSource mediaSource = (MediaSource) obj;
        return C5207g.m11106a(this.f17293a, mediaSource.f17293a) && C5207g.m11106a(this.f17294b, mediaSource.f17294b) && C5207g.m11106a(this.f17295c, mediaSource.f17295c);
    }

    public final int hashCode() {
        String str = this.f17293a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17294b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17295c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSource(type=");
        sb2.append(this.f17293a);
        sb2.append(", name=");
        sb2.append(this.f17294b);
        sb2.append(", url=");
        return C0009a.m23l(sb2, this.f17295c, ")");
    }
}
