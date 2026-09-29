package com.lingq.shared.uimodel.library;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/FastSearchData;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class FastSearchData {

    /* JADX INFO: renamed from: a */
    public final String f21941a;

    /* JADX INFO: renamed from: b */
    public final String f21942b;

    /* JADX INFO: renamed from: c */
    public final String f21943c;

    /* JADX INFO: renamed from: d */
    public final String f21944d;

    /* JADX INFO: renamed from: e */
    public final String f21945e;

    public FastSearchData(String str, String str2, String str3, String str4, String str5) {
        C5207g.m11111f(str, "id");
        C5207g.m11111f(str2, "language");
        C5207g.m11111f(str3, "type");
        C5207g.m11111f(str4, "title");
        this.f21941a = str;
        this.f21942b = str2;
        this.f21943c = str3;
        this.f21944d = str4;
        this.f21945e = str5;
    }

    public /* synthetic */ FastSearchData(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FastSearchData)) {
            return false;
        }
        FastSearchData fastSearchData = (FastSearchData) obj;
        return C5207g.m11106a(this.f21941a, fastSearchData.f21941a) && C5207g.m11106a(this.f21942b, fastSearchData.f21942b) && C5207g.m11106a(this.f21943c, fastSearchData.f21943c) && C5207g.m11106a(this.f21944d, fastSearchData.f21944d) && C5207g.m11106a(this.f21945e, fastSearchData.f21945e);
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f21944d, C0166e.m758d(this.f21943c, C0166e.m758d(this.f21942b, this.f21941a.hashCode() * 31, 31), 31), 31);
        String str = this.f21945e;
        return iM758d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FastSearchData(id=");
        sb2.append(this.f21941a);
        sb2.append(", language=");
        sb2.append(this.f21942b);
        sb2.append(", type=");
        sb2.append(this.f21943c);
        sb2.append(", title=");
        sb2.append(this.f21944d);
        sb2.append(", imageUrl=");
        return C0009a.m23l(sb2, this.f21945e, ")");
    }
}
