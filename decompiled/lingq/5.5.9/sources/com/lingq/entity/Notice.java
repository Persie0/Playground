package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Notice;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Notice {

    /* JADX INFO: renamed from: a */
    public final int f17323a;

    /* JADX INFO: renamed from: b */
    public final String f17324b;

    /* JADX INFO: renamed from: c */
    public final String f17325c;

    /* JADX INFO: renamed from: d */
    public final String f17326d;

    /* JADX INFO: renamed from: e */
    public final String f17327e;

    /* JADX INFO: renamed from: f */
    public final String f17328f;

    /* JADX INFO: renamed from: g */
    public final boolean f17329g;

    public Notice(int i10, String str, String str2, String str3, String str4, String str5, boolean z10) {
        C5207g.m11111f(str2, "title");
        C5207g.m11111f(str3, "startDate");
        C5207g.m11111f(str4, "endDate");
        C5207g.m11111f(str5, "noticeType");
        this.f17323a = i10;
        this.f17324b = str;
        this.f17325c = str2;
        this.f17326d = str3;
        this.f17327e = str4;
        this.f17328f = str5;
        this.f17329g = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notice)) {
            return false;
        }
        Notice notice = (Notice) obj;
        return this.f17323a == notice.f17323a && C5207g.m11106a(this.f17324b, notice.f17324b) && C5207g.m11106a(this.f17325c, notice.f17325c) && C5207g.m11106a(this.f17326d, notice.f17326d) && C5207g.m11106a(this.f17327e, notice.f17327e) && C5207g.m11106a(this.f17328f, notice.f17328f) && this.f17329g == notice.f17329g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f17328f, C0166e.m758d(this.f17327e, C0166e.m758d(this.f17326d, C0166e.m758d(this.f17325c, C0166e.m758d(this.f17324b, Integer.hashCode(this.f17323a) * 31, 31), 31), 31), 31), 31);
        boolean z10 = this.f17329g;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM758d + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Notice(id=");
        sb2.append(this.f17323a);
        sb2.append(", language=");
        sb2.append(this.f17324b);
        sb2.append(", title=");
        sb2.append(this.f17325c);
        sb2.append(", startDate=");
        sb2.append(this.f17326d);
        sb2.append(", endDate=");
        sb2.append(this.f17327e);
        sb2.append(", noticeType=");
        sb2.append(this.f17328f);
        sb2.append(", isShown=");
        return C0166e.m769p(sb2, this.f17329g, ")");
    }
}
