package com.lingq.entity;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/LanguageProgressChartEntry;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LanguageProgressChartEntry {

    /* JADX INFO: renamed from: a */
    public final String f17050a;

    /* JADX INFO: renamed from: b */
    public final String f17051b;

    /* JADX INFO: renamed from: c */
    public final String f17052c;

    /* JADX INFO: renamed from: d */
    public final String f17053d;

    /* JADX INFO: renamed from: e */
    public final double f17054e;

    /* JADX INFO: renamed from: f */
    public final double f17055f;

    /* JADX INFO: renamed from: g */
    public final int f17056g;

    public LanguageProgressChartEntry(String str, String str2, String str3, String str4, double d10, double d11, int i10) {
        C5207g.m11111f(str4, "name");
        this.f17050a = str;
        this.f17051b = str2;
        this.f17052c = str3;
        this.f17053d = str4;
        this.f17054e = d10;
        this.f17055f = d11;
        this.f17056g = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageProgressChartEntry)) {
            return false;
        }
        LanguageProgressChartEntry languageProgressChartEntry = (LanguageProgressChartEntry) obj;
        return C5207g.m11106a(this.f17050a, languageProgressChartEntry.f17050a) && C5207g.m11106a(this.f17051b, languageProgressChartEntry.f17051b) && C5207g.m11106a(this.f17052c, languageProgressChartEntry.f17052c) && C5207g.m11106a(this.f17053d, languageProgressChartEntry.f17053d) && Double.compare(this.f17054e, languageProgressChartEntry.f17054e) == 0 && Double.compare(this.f17055f, languageProgressChartEntry.f17055f) == 0 && this.f17056g == languageProgressChartEntry.f17056g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17056g) + C0141b.m609e(this.f17055f, C0141b.m609e(this.f17054e, C0166e.m758d(this.f17053d, C0166e.m758d(this.f17052c, C0166e.m758d(this.f17051b, this.f17050a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LanguageProgressChartEntry(metric=");
        sb2.append(this.f17050a);
        sb2.append(", languageCode=");
        sb2.append(this.f17051b);
        sb2.append(", period=");
        sb2.append(this.f17052c);
        sb2.append(", name=");
        sb2.append(this.f17053d);
        sb2.append(", daily=");
        sb2.append(this.f17054e);
        sb2.append(", cumulative=");
        sb2.append(this.f17055f);
        sb2.append(", position=");
        return C0166e.m768o(sb2, this.f17056g, ")");
    }
}
