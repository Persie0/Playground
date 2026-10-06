package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqb {

    /* JADX INFO: renamed from: e */
    private static final mpz f41327e;

    /* JADX INFO: renamed from: a */
    public final int f41328a;

    /* JADX INFO: renamed from: b */
    public final float f41329b;

    /* JADX INFO: renamed from: c */
    public final int f41330c;

    /* JADX INFO: renamed from: d */
    public final int f41331d;

    /* JADX INFO: renamed from: f */
    private final int f41332f;

    /* JADX INFO: renamed from: g */
    private final int f41333g;

    /* JADX INFO: renamed from: h */
    private final mpz f41334h;

    static {
        mpz mpzVar = mpz.MONOCHROME;
        f41327e = mpzVar;
        mqa mqaVarM16800a = m16800a();
        mqaVarM16800a.m16798g(128);
        mqaVarM16800a.m16797f(128);
        mqaVarM16800a.m16796e(mpzVar);
        mqaVarM16800a.m16799h(20);
        mqaVarM16800a.m16795d(16000.0f);
        mqaVarM16800a.m16793b(2);
        mqaVarM16800a.m16794c(1);
        mqaVarM16800a.m16792a();
    }

    public mqb() {
    }

    public mqb(int i, int i2, mpz mpzVar, int i3, float f, int i4, int i5) {
        this.f41332f = i;
        this.f41333g = i2;
        this.f41334h = mpzVar;
        this.f41328a = i3;
        this.f41329b = f;
        this.f41330c = i4;
        this.f41331d = i5;
    }

    /* JADX INFO: renamed from: a */
    public static mqa m16800a() {
        return new mqa();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mqb) {
            mqb mqbVar = (mqb) obj;
            if (this.f41332f == mqbVar.f41332f && this.f41333g == mqbVar.f41333g && this.f41334h.equals(mqbVar.f41334h) && this.f41328a == mqbVar.f41328a && Float.floatToIntBits(this.f41329b) == Float.floatToIntBits(mqbVar.f41329b) && this.f41330c == mqbVar.f41330c && this.f41331d == mqbVar.f41331d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f41332f ^ 1000003) * 1000003) ^ this.f41333g) * 1000003) ^ this.f41334h.hashCode()) * 1000003) ^ this.f41328a) * 1000003) ^ Float.floatToIntBits(this.f41329b)) * 1000003) ^ this.f41330c) * 1000003) ^ this.f41331d;
    }

    public final String toString() {
        return "SpeechEnhancerModelInfo{thumbnailImageWidthPixels=" + this.f41332f + ", thumbnailImageHeightPixels=" + this.f41333g + ", thumbnailImageColorspace=" + String.valueOf(this.f41334h) + ", videoFramesPerSecond=" + this.f41328a + ", audioSampleRateHz=" + this.f41329b + ", audioBytesPerSample=" + this.f41330c + ", audioNumChannels=" + this.f41331d + "}";
    }
}
