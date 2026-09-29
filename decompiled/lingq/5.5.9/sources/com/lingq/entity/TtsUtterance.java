package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/TtsUtterance;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TtsUtterance {

    /* JADX INFO: renamed from: a */
    public final String f17559a;

    /* JADX INFO: renamed from: b */
    public final int f17560b;

    /* JADX INFO: renamed from: c */
    public final String f17561c;

    /* JADX INFO: renamed from: d */
    public final String f17562d;

    public TtsUtterance(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "idWithLanguageAndData");
        C5207g.m11111f(str2, "audio");
        C5207g.m11111f(str3, "text");
        this.f17559a = str;
        this.f17560b = i10;
        this.f17561c = str2;
        this.f17562d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsUtterance)) {
            return false;
        }
        TtsUtterance ttsUtterance = (TtsUtterance) obj;
        return C5207g.m11106a(this.f17559a, ttsUtterance.f17559a) && this.f17560b == ttsUtterance.f17560b && C5207g.m11106a(this.f17561c, ttsUtterance.f17561c) && C5207g.m11106a(this.f17562d, ttsUtterance.f17562d);
    }

    public final int hashCode() {
        return this.f17562d.hashCode() + C0166e.m758d(this.f17561c, C0009a.m16d(this.f17560b, this.f17559a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TtsUtterance(idWithLanguageAndData=");
        sb2.append(this.f17559a);
        sb2.append(", utteranceId=");
        sb2.append(this.f17560b);
        sb2.append(", audio=");
        sb2.append(this.f17561c);
        sb2.append(", text=");
        return C0009a.m23l(sb2, this.f17562d, ")");
    }
}
