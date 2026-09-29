package p000;

import com.lingq.feature.review.views.speaking.SpeechRecognitionState;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class xe9 {

    /* JADX INFO: renamed from: a */
    public final boolean f68134a;

    /* JADX INFO: renamed from: b */
    public final int f68135b;

    /* JADX INFO: renamed from: c */
    public final String f68136c;

    /* JADX INFO: renamed from: d */
    public final String f68137d;

    /* JADX INFO: renamed from: e */
    public final SpeechRecognitionState f68138e;

    /* JADX INFO: renamed from: f */
    public final C3329mb f68139f;

    /* JADX INFO: renamed from: g */
    public final List f68140g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ xe9() {
        SpeechRecognitionState speechRecognitionState = SpeechRecognitionState.IDLE;
        Locale localeForLanguageTag = Locale.forLanguageTag("en");
        localeForLanguageTag.getClass();
        this(true, 0, "", "", speechRecognitionState, new C3329mb("", "", localeForLanguageTag), EmptyList.f47638a);
    }

    /* JADX INFO: renamed from: a */
    public static xe9 m24478a(xe9 xe9Var, boolean z, int i, String str, String str2, SpeechRecognitionState speechRecognitionState, C3329mb c3329mb, List list, int i2) {
        if ((i2 & 1) != 0) {
            z = xe9Var.f68134a;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i = xe9Var.f68135b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = xe9Var.f68136c;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = xe9Var.f68137d;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            speechRecognitionState = xe9Var.f68138e;
        }
        SpeechRecognitionState speechRecognitionState2 = speechRecognitionState;
        if ((i2 & 32) != 0) {
            c3329mb = xe9Var.f68139f;
        }
        C3329mb c3329mb2 = c3329mb;
        if ((i2 & 64) != 0) {
            list = xe9Var.f68140g;
        }
        List list2 = list;
        xe9Var.getClass();
        str3.getClass();
        str4.getClass();
        speechRecognitionState2.getClass();
        c3329mb2.getClass();
        list2.getClass();
        return new xe9(z2, i3, str3, str4, speechRecognitionState2, c3329mb2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe9)) {
            return false;
        }
        xe9 xe9Var = (xe9) obj;
        return this.f68134a == xe9Var.f68134a && this.f68135b == xe9Var.f68135b && fa4.m11650l(this.f68136c, xe9Var.f68136c) && fa4.m11650l(this.f68137d, xe9Var.f68137d) && this.f68138e == xe9Var.f68138e && fa4.m11650l(this.f68139f, xe9Var.f68139f) && fa4.m11650l(this.f68140g, xe9Var.f68140g);
    }

    public final int hashCode() {
        return this.f68140g.hashCode() + ((this.f68139f.hashCode() + ((this.f68138e.hashCode() + ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f68135b, Boolean.hashCode(this.f68134a) * 31, 31), this.f68136c, 31), this.f68137d, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeakingViewState(hasTts=");
        sb.append(this.f68134a);
        sb.append(", score=");
        sb.append(this.f68135b);
        sb.append(", text=");
        AbstractC3393o1.m17725C(sb, this.f68136c, ", spokenText=", this.f68137d, ", listeningState=");
        sb.append(this.f68138e);
        sb.append(", textDiffWithSpokenText=");
        sb.append(this.f68139f);
        sb.append(", textTokens=");
        return hn1.m13356f(sb, this.f68140g, ")");
    }

    public xe9(boolean z, int i, String str, String str2, SpeechRecognitionState speechRecognitionState, C3329mb c3329mb, List list) {
        speechRecognitionState.getClass();
        this.f68134a = z;
        this.f68135b = i;
        this.f68136c = str;
        this.f68137d = str2;
        this.f68138e = speechRecognitionState;
        this.f68139f = c3329mb;
        this.f68140g = list;
    }
}
