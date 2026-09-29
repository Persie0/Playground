package com.lingq.shared.uimodel;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/LocalTextToSpeechVoice;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LocalTextToSpeechVoice {

    /* JADX INFO: renamed from: a */
    public final String f21601a;

    /* JADX INFO: renamed from: b */
    public final String f21602b;

    public LocalTextToSpeechVoice(String str, String str2) {
        this.f21601a = str;
        this.f21602b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalTextToSpeechVoice)) {
            return false;
        }
        LocalTextToSpeechVoice localTextToSpeechVoice = (LocalTextToSpeechVoice) obj;
        return C5207g.m11106a(this.f21601a, localTextToSpeechVoice.f21601a) && C5207g.m11106a(this.f21602b, localTextToSpeechVoice.f21602b);
    }

    public final int hashCode() {
        return this.f21602b.hashCode() + (this.f21601a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalTextToSpeechVoice(name=");
        sb2.append(this.f21601a);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f21602b, ")");
    }
}
