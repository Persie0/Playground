package p000;

import android.media.CamcorderProfile;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jyg {

    /* JADX INFO: renamed from: a */
    public final int f35160a;

    /* JADX INFO: renamed from: b */
    public final int f35161b;

    /* JADX INFO: renamed from: c */
    public final int f35162c;

    /* JADX INFO: renamed from: d */
    public final int f35163d;

    /* JADX INFO: renamed from: e */
    public final int f35164e;

    /* JADX INFO: renamed from: f */
    public final int f35165f;

    /* JADX INFO: renamed from: g */
    public final int f35166g;

    /* JADX INFO: renamed from: h */
    public final int f35167h;

    /* JADX INFO: renamed from: i */
    public final int f35168i;

    /* JADX INFO: renamed from: j */
    public final int f35169j;

    /* JADX INFO: renamed from: k */
    public final int f35170k;

    /* JADX INFO: renamed from: l */
    public final int f35171l;

    /* JADX INFO: renamed from: m */
    public final int f35172m;

    public jyg() {
    }

    public jyg(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f35160a = i;
        this.f35161b = i2;
        this.f35162c = i3;
        this.f35163d = i4;
        this.f35164e = i5;
        this.f35165f = i6;
        this.f35166g = i7;
        this.f35167h = i8;
        this.f35168i = i9;
        this.f35169j = i10;
        this.f35170k = i11;
        this.f35171l = i12;
        this.f35172m = i13;
    }

    /* JADX INFO: renamed from: a */
    public static jyf m13715a(CamcorderProfile camcorderProfile) {
        jyf jyfVar = new jyf();
        jyfVar.m13702b(camcorderProfile.audioBitRate);
        jyfVar.m13703c(camcorderProfile.audioChannels);
        jyfVar.m13704d(camcorderProfile.audioCodec);
        jyfVar.m13705e(camcorderProfile.audioSampleRate);
        jyfVar.m13706f(camcorderProfile.fileFormat);
        jyfVar.m13707g(camcorderProfile.quality);
        jyfVar.m13708h(camcorderProfile.videoBitRate);
        jyfVar.m13709i(camcorderProfile.videoCodec);
        jyfVar.m13711k(-1);
        jyfVar.m13710j(-1);
        jyfVar.m13712l(camcorderProfile.videoFrameHeight);
        jyfVar.m13713m(camcorderProfile.videoFrameRate);
        jyfVar.m13714n(camcorderProfile.videoFrameWidth);
        return jyfVar;
    }

    /* JADX INFO: renamed from: b */
    public static jyf m13716b(jyg jygVar) {
        jyf jyfVar = new jyf();
        jyfVar.m13702b(jygVar.f35160a);
        jyfVar.m13703c(jygVar.f35161b);
        jyfVar.m13704d(jygVar.f35162c);
        jyfVar.m13705e(jygVar.f35163d);
        jyfVar.m13706f(jygVar.f35164e);
        jyfVar.m13707g(jygVar.f35165f);
        jyfVar.m13708h(jygVar.f35166g);
        jyfVar.m13709i(jygVar.f35167h);
        jyfVar.m13711k(jygVar.f35168i);
        jyfVar.m13710j(jygVar.f35169j);
        jyfVar.m13712l(jygVar.f35170k);
        jyfVar.m13713m(jygVar.f35171l);
        jyfVar.m13714n(jygVar.f35172m);
        return jyfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jyg) {
            jyg jygVar = (jyg) obj;
            if (this.f35160a == jygVar.f35160a && this.f35161b == jygVar.f35161b && this.f35162c == jygVar.f35162c && this.f35163d == jygVar.f35163d && this.f35164e == jygVar.f35164e && this.f35165f == jygVar.f35165f && this.f35166g == jygVar.f35166g && this.f35167h == jygVar.f35167h && this.f35168i == jygVar.f35168i && this.f35169j == jygVar.f35169j && this.f35170k == jygVar.f35170k && this.f35171l == jygVar.f35171l && this.f35172m == jygVar.f35172m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.f35160a ^ 1000003) * 1000003) ^ this.f35161b) * 1000003) ^ this.f35162c) * 1000003) ^ this.f35163d) * 1000003) ^ this.f35164e) * 1000003) ^ this.f35165f) * 1000003) ^ this.f35166g) * 1000003) ^ this.f35167h) * 1000003) ^ this.f35168i) * 1000003) ^ this.f35169j) * 1000003) ^ this.f35170k) * 1000003) ^ this.f35171l) * 1000003) ^ this.f35172m;
    }

    public final String toString() {
        return "SimpleCamcorderProfileProxy{audioBitRate=" + this.f35160a + ", audioChannels=" + this.f35161b + ", audioCodec=" + this.f35162c + ", audioSampleRate=" + this.f35163d + ", fileFormat=" + this.f35164e + ", quality=" + this.f35165f + ", videoBitRate=" + this.f35166g + ", videoCodec=" + this.f35167h + ", videoCodecProfile=" + this.f35168i + ", videoCodecLevel=" + this.f35169j + ", videoFrameHeight=" + this.f35170k + ", videoFrameRate=" + this.f35171l + aJFPpVSaoDO.AgKQqjXL + this.f35172m + "}";
    }
}
