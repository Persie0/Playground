package com.lingq.shared.uimodel;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/TextToSpeechVoice;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TextToSpeechVoice {

    /* JADX INFO: renamed from: a */
    public final String f21616a;

    /* JADX INFO: renamed from: b */
    public final String f21617b;

    /* JADX INFO: renamed from: c */
    public final List<TextToSpeechAppVoice> f21618c;

    /* JADX INFO: renamed from: d */
    public final Boolean f21619d;

    /* JADX INFO: renamed from: e */
    public final List<String> f21620e;

    public TextToSpeechVoice(String str, String str2, List<TextToSpeechAppVoice> list, Boolean bool, List<String> list2) {
        C5207g.m11111f(str, "name");
        C5207g.m11111f(str2, "title");
        C5207g.m11111f(list2, "priority");
        this.f21616a = str;
        this.f21617b = str2;
        this.f21618c = list;
        this.f21619d = bool;
        this.f21620e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextToSpeechVoice)) {
            return false;
        }
        TextToSpeechVoice textToSpeechVoice = (TextToSpeechVoice) obj;
        return C5207g.m11106a(this.f21616a, textToSpeechVoice.f21616a) && C5207g.m11106a(this.f21617b, textToSpeechVoice.f21617b) && C5207g.m11106a(this.f21618c, textToSpeechVoice.f21618c) && C5207g.m11106a(this.f21619d, textToSpeechVoice.f21619d) && C5207g.m11106a(this.f21620e, textToSpeechVoice.f21620e);
    }

    public final int hashCode() {
        int iM848g = C0204c.m848g(this.f21618c, C0166e.m758d(this.f21617b, this.f21616a.hashCode() * 31, 31), 31);
        Boolean bool = this.f21619d;
        return this.f21620e.hashCode() + ((iM848g + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextToSpeechVoice(name=");
        sb2.append(this.f21616a);
        sb2.append(", title=");
        sb2.append(this.f21617b);
        sb2.append(", voicesByApp=");
        sb2.append(this.f21618c);
        sb2.append(", alternative=");
        sb2.append(this.f21619d);
        sb2.append(", priority=");
        return C0009a.m24m(sb2, this.f21620e, ")");
    }
}
