package p513yj;

import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.review.views.speaking.SpeechRecognitionState;
import com.lingq.util.C4925b;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import p003a2.C0009a;
import p265mj.C7570d;

/* JADX INFO: renamed from: yj.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C10408j {

    /* JADX INFO: renamed from: a */
    public final boolean f52209a;

    /* JADX INFO: renamed from: b */
    public final int f52210b;

    /* JADX INFO: renamed from: c */
    public final String f52211c;

    /* JADX INFO: renamed from: d */
    public final String f52212d;

    /* JADX INFO: renamed from: e */
    public final SpeechRecognitionState f52213e;

    /* JADX INFO: renamed from: f */
    public final C4925b f52214f;

    /* JADX INFO: renamed from: g */
    public final List<C7570d> f52215g;

    public C10408j() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10408j(int i10) {
        SpeechRecognitionState speechRecognitionState = SpeechRecognitionState.IDLE;
        Locale localeForLanguageTag = Locale.forLanguageTag("en");
        C5207g.m11110e(localeForLanguageTag, "forLanguageTag(\"en\")");
        this(true, 0, "", "", speechRecognitionState, new C4925b(localeForLanguageTag, "", ""), EmptyList.f38032a);
    }

    public C10408j(boolean z10, int i10, String str, String str2, SpeechRecognitionState speechRecognitionState, C4925b c4925b, List<C7570d> list) {
        C5207g.m11111f(str, "text");
        C5207g.m11111f(str2, "spokenText");
        C5207g.m11111f(speechRecognitionState, "listeningState");
        C5207g.m11111f(c4925b, "textDiffWithSpokenText");
        C5207g.m11111f(list, "textTokens");
        this.f52209a = z10;
        this.f52210b = i10;
        this.f52211c = str;
        this.f52212d = str2;
        this.f52213e = speechRecognitionState;
        this.f52214f = c4925b;
        this.f52215g = list;
    }

    /* JADX INFO: renamed from: a */
    public static C10408j m19394a(C10408j c10408j, boolean z10, int i10, String str, String str2, SpeechRecognitionState speechRecognitionState, C4925b c4925b, List list, int i11) {
        boolean z11 = (i11 & 1) != 0 ? c10408j.f52209a : z10;
        int i12 = (i11 & 2) != 0 ? c10408j.f52210b : i10;
        String str3 = (i11 & 4) != 0 ? c10408j.f52211c : str;
        String str4 = (i11 & 8) != 0 ? c10408j.f52212d : str2;
        SpeechRecognitionState speechRecognitionState2 = (i11 & 16) != 0 ? c10408j.f52213e : speechRecognitionState;
        C4925b c4925b2 = (i11 & 32) != 0 ? c10408j.f52214f : c4925b;
        List list2 = (i11 & 64) != 0 ? c10408j.f52215g : list;
        c10408j.getClass();
        C5207g.m11111f(str3, "text");
        C5207g.m11111f(str4, "spokenText");
        C5207g.m11111f(speechRecognitionState2, "listeningState");
        C5207g.m11111f(c4925b2, "textDiffWithSpokenText");
        C5207g.m11111f(list2, "textTokens");
        return new C10408j(z11, i12, str3, str4, speechRecognitionState2, c4925b2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10408j)) {
            return false;
        }
        C10408j c10408j = (C10408j) obj;
        return this.f52209a == c10408j.f52209a && this.f52210b == c10408j.f52210b && C5207g.m11106a(this.f52211c, c10408j.f52211c) && C5207g.m11106a(this.f52212d, c10408j.f52212d) && this.f52213e == c10408j.f52213e && C5207g.m11106a(this.f52214f, c10408j.f52214f) && C5207g.m11106a(this.f52215g, c10408j.f52215g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public final int hashCode() {
        boolean z10 = this.f52209a;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f52215g.hashCode() + ((this.f52214f.hashCode() + ((this.f52213e.hashCode() + C0166e.m758d(this.f52212d, C0166e.m758d(this.f52211c, C0009a.m16d(this.f52210b, r10 * 31, 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpeakingViewState(hasTts=");
        sb2.append(this.f52209a);
        sb2.append(", score=");
        sb2.append(this.f52210b);
        sb2.append(", text=");
        sb2.append(this.f52211c);
        sb2.append(", spokenText=");
        sb2.append(this.f52212d);
        sb2.append(", listeningState=");
        sb2.append(this.f52213e);
        sb2.append(", textDiffWithSpokenText=");
        sb2.append(this.f52214f);
        sb2.append(", textTokens=");
        return C0009a.m24m(sb2, this.f52215g, ")");
    }
}
