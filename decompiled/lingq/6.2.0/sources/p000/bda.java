package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bda {

    /* JADX INFO: renamed from: a */
    public final boolean f8394a;

    /* JADX INFO: renamed from: b */
    public final boolean f8395b;

    /* JADX INFO: renamed from: c */
    public final boolean f8396c;

    /* JADX INFO: renamed from: d */
    public final Map f8397d;

    /* JADX INFO: renamed from: e */
    public final String f8398e;

    /* JADX INFO: renamed from: f */
    public final Map f8399f;

    public bda(boolean z, boolean z2, boolean z3, Map map, String str, Map map2) {
        this.f8394a = z;
        this.f8395b = z2;
        this.f8396c = z3;
        this.f8397d = map;
        this.f8398e = str;
        this.f8399f = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bda)) {
            return false;
        }
        bda bdaVar = (bda) obj;
        return this.f8394a == bdaVar.f8394a && this.f8395b == bdaVar.f8395b && this.f8396c == bdaVar.f8396c && fa4.m11650l(this.f8397d, bdaVar.f8397d) && fa4.m11650l(this.f8398e, bdaVar.f8398e) && fa4.m11650l(this.f8399f, bdaVar.f8399f);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f8394a) * 31, 31, this.f8395b), 31, this.f8396c);
        Map map = this.f8397d;
        int iHashCode = (iM12428e + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f8398e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map2 = this.f8399f;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("TtsPreferences(autoTts=", ", stopAudioToPlayTTS=", ", useWebVoices=", this.f8394a, this.f8395b);
        sbM13357g.append(this.f8396c);
        sbM13357g.append(", ttsVoiceName=");
        sbM13357g.append(this.f8397d);
        sbM13357g.append(", activeVoiceTitle=");
        sbM13357g.append(this.f8398e);
        sbM13357g.append(", localTTSVoice=");
        sbM13357g.append(this.f8399f);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
