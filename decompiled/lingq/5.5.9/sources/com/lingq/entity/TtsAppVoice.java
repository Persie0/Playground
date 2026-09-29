package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/TtsAppVoice;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TtsAppVoice {

    /* JADX INFO: renamed from: a */
    public final String f17555a;

    /* JADX INFO: renamed from: b */
    public final String f17556b;

    public TtsAppVoice(String str, String str2) {
        this.f17555a = str;
        this.f17556b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsAppVoice)) {
            return false;
        }
        TtsAppVoice ttsAppVoice = (TtsAppVoice) obj;
        if (C5207g.m11106a(this.f17555a, ttsAppVoice.f17555a) && C5207g.m11106a(this.f17556b, ttsAppVoice.f17556b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17556b.hashCode() + (this.f17555a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TtsAppVoice(name=");
        sb2.append(this.f17555a);
        sb2.append(", appName=");
        return C0009a.m23l(sb2, this.f17556b, ")");
    }
}
