package com.lingq.shared.uimodel;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.C7076b;
import ni.C7793a;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/uimodel/TextToSpeechTokenUtterance;", "", "a", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class TextToSpeechTokenUtterance {

    /* JADX INFO: renamed from: a */
    public final String f21609a;

    /* JADX INFO: renamed from: b */
    public final int f21610b;

    /* JADX INFO: renamed from: c */
    public final String f21611c;

    /* JADX INFO: renamed from: d */
    public final String f21612d;

    /* JADX INFO: renamed from: com.lingq.shared.uimodel.TextToSpeechTokenUtterance$a */
    public static final class C3401a {
        /* JADX INFO: renamed from: a */
        public static String m9701a(Locale locale, String str, String str2, String str3, String str4) {
            C5207g.m11111f(str, "language");
            C5207g.m11111f(str2, "text");
            C5207g.m11111f(str3, "appName");
            C5207g.m11111f(str4, "voice");
            String string = C7076b.m14277B3(C7793a.m15502f(str2, locale)).toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("_");
            sb2.append(string);
            sb2.append("_");
            sb2.append(str3);
            return C0009a.m23l(sb2, "_", str4);
        }
    }

    public TextToSpeechTokenUtterance(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "idWithLanguageAndData");
        C5207g.m11111f(str2, "audio");
        C5207g.m11111f(str3, "text");
        this.f21609a = str;
        this.f21610b = i10;
        this.f21611c = str2;
        this.f21612d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextToSpeechTokenUtterance)) {
            return false;
        }
        TextToSpeechTokenUtterance textToSpeechTokenUtterance = (TextToSpeechTokenUtterance) obj;
        return C5207g.m11106a(this.f21609a, textToSpeechTokenUtterance.f21609a) && this.f21610b == textToSpeechTokenUtterance.f21610b && C5207g.m11106a(this.f21611c, textToSpeechTokenUtterance.f21611c) && C5207g.m11106a(this.f21612d, textToSpeechTokenUtterance.f21612d);
    }

    public final int hashCode() {
        return this.f21612d.hashCode() + C0166e.m758d(this.f21611c, C0009a.m16d(this.f21610b, this.f21609a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextToSpeechTokenUtterance(idWithLanguageAndData=");
        sb2.append(this.f21609a);
        sb2.append(", utteranceId=");
        sb2.append(this.f21610b);
        sb2.append(", audio=");
        sb2.append(this.f21611c);
        sb2.append(", text=");
        return C0009a.m23l(sb2, this.f21612d, ")");
    }
}
