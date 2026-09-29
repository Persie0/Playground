package p000;

import com.lingq.core.domain.store.AudioUnderlineMode;

/* JADX INFO: loaded from: classes3.dex */
public final class wz7 {

    /* JADX INFO: renamed from: a */
    public final Integer f67564a;

    /* JADX INFO: renamed from: b */
    public final Integer f67565b;

    /* JADX INFO: renamed from: c */
    public final Integer f67566c;

    /* JADX INFO: renamed from: d */
    public final Integer f67567d;

    /* JADX INFO: renamed from: e */
    public final f00 f67568e;

    /* JADX INFO: renamed from: f */
    public final AudioUnderlineMode f67569f;

    /* JADX INFO: renamed from: g */
    public final boolean f67570g;

    /* JADX INFO: renamed from: h */
    public final String f67571h;

    /* JADX INFO: renamed from: i */
    public final boolean f67572i;

    public wz7(Integer num, Integer num2, Integer num3, Integer num4, f00 f00Var, AudioUnderlineMode audioUnderlineMode, boolean z, String str, boolean z2) {
        audioUnderlineMode.getClass();
        this.f67564a = num;
        this.f67565b = num2;
        this.f67566c = num3;
        this.f67567d = num4;
        this.f67568e = f00Var;
        this.f67569f = audioUnderlineMode;
        this.f67570g = z;
        this.f67571h = str;
        this.f67572i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz7)) {
            return false;
        }
        wz7 wz7Var = (wz7) obj;
        return fa4.m11650l(this.f67564a, wz7Var.f67564a) && fa4.m11650l(this.f67565b, wz7Var.f67565b) && fa4.m11650l(this.f67566c, wz7Var.f67566c) && fa4.m11650l(this.f67567d, wz7Var.f67567d) && fa4.m11650l(this.f67568e, wz7Var.f67568e) && this.f67569f == wz7Var.f67569f && this.f67570g == wz7Var.f67570g && this.f67571h.equals(wz7Var.f67571h) && this.f67572i == wz7Var.f67572i;
    }

    public final int hashCode() {
        Integer num = this.f67564a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f67565b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f67566c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f67567d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        f00 f00Var = this.f67568e;
        return Boolean.hashCode(this.f67572i) + ux5.m22980c(g9a.m12428e((this.f67569f.hashCode() + ((iHashCode4 + (f00Var != null ? f00Var.hashCode() : 0)) * 31)) * 31, 31, this.f67570g), this.f67571h, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderTextState(activeSentenceIndex=");
        sb.append(this.f67564a);
        sb.append(", activeScrollIndex=");
        sb.append(this.f67565b);
        sb.append(", activeTappedTokenIndex=");
        e65.m10883o(sb, this.f67566c, ", activeTappedPhraseIndex=", this.f67567d, ", audioWaveState=");
        sb.append(this.f67568e);
        sb.append(", audioUnderlineMode=");
        sb.append(this.f67569f);
        sb.append(", isVideoPlaying=");
        hn1.m13367q(", language=", this.f67571h, ", isRtl=", sb, this.f67570g);
        return AbstractC3393o1.m17740o(sb, this.f67572i, ")");
    }
}
