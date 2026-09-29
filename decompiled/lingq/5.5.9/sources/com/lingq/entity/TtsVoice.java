package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/TtsVoice;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TtsVoice {

    /* JADX INFO: renamed from: a */
    public final String f17566a;

    /* JADX INFO: renamed from: b */
    public final String f17567b;

    /* JADX INFO: renamed from: c */
    public final List<TtsAppVoice> f17568c;

    /* JADX INFO: renamed from: d */
    public final Boolean f17569d;

    /* JADX INFO: renamed from: e */
    public final List<String> f17570e;

    public TtsVoice(String str, String str2, List<TtsAppVoice> list, Boolean bool, List<String> list2) {
        this.f17566a = str;
        this.f17567b = str2;
        this.f17568c = list;
        this.f17569d = bool;
        this.f17570e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsVoice)) {
            return false;
        }
        TtsVoice ttsVoice = (TtsVoice) obj;
        return C5207g.m11106a(this.f17566a, ttsVoice.f17566a) && C5207g.m11106a(this.f17567b, ttsVoice.f17567b) && C5207g.m11106a(this.f17568c, ttsVoice.f17568c) && C5207g.m11106a(this.f17569d, ttsVoice.f17569d) && C5207g.m11106a(this.f17570e, ttsVoice.f17570e);
    }

    public final int hashCode() {
        int iM848g = C0204c.m848g(this.f17568c, C0166e.m758d(this.f17567b, this.f17566a.hashCode() * 31, 31), 31);
        Boolean bool = this.f17569d;
        return this.f17570e.hashCode() + ((iM848g + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TtsVoice(name=");
        sb2.append(this.f17566a);
        sb2.append(", title=");
        sb2.append(this.f17567b);
        sb2.append(", voicesByApp=");
        sb2.append(this.f17568c);
        sb2.append(", alternative=");
        sb2.append(this.f17569d);
        sb2.append(", priority=");
        return C0009a.m24m(sb2, this.f17570e, ")");
    }
}
