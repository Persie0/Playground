package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLessonUpload;", "", "", "accent", "audio", "", "duration", "externalAudio", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/lingq/shared/network/result/ResultLessonUpload;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultLessonUpload {

    /* JADX INFO: renamed from: a */
    public final String f18658a;

    /* JADX INFO: renamed from: b */
    public final String f18659b;

    /* JADX INFO: renamed from: c */
    public final Integer f18660c;

    /* JADX INFO: renamed from: d */
    public final String f18661d;

    public ResultLessonUpload() {
        this(null, null, null, null, 15, null);
    }

    public ResultLessonUpload(String str, String str2, Integer num, @InterfaceC9303g(name = "external_audio") String str3) {
        C5207g.m11111f(str2, "audio");
        this.f18658a = str;
        this.f18659b = str2;
        this.f18660c = num;
        this.f18661d = str3;
    }

    public /* synthetic */ ResultLessonUpload(String str, String str2, Integer num, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str3);
    }

    public final ResultLessonUpload copy(String accent, String audio, Integer duration, @InterfaceC9303g(name = "external_audio") String externalAudio) {
        C5207g.m11111f(audio, "audio");
        return new ResultLessonUpload(accent, audio, duration, externalAudio);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLessonUpload)) {
            return false;
        }
        ResultLessonUpload resultLessonUpload = (ResultLessonUpload) obj;
        return C5207g.m11106a(this.f18658a, resultLessonUpload.f18658a) && C5207g.m11106a(this.f18659b, resultLessonUpload.f18659b) && C5207g.m11106a(this.f18660c, resultLessonUpload.f18660c) && C5207g.m11106a(this.f18661d, resultLessonUpload.f18661d);
    }

    public final int hashCode() {
        String str = this.f18658a;
        int iM758d = C0166e.m758d(this.f18659b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Integer num = this.f18660c;
        int iHashCode = (iM758d + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f18661d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultLessonUpload(accent=");
        sb2.append(this.f18658a);
        sb2.append(", audio=");
        sb2.append(this.f18659b);
        sb2.append(", duration=");
        sb2.append(this.f18660c);
        sb2.append(", externalAudio=");
        return C0009a.m23l(sb2, this.f18661d, ")");
    }
}
