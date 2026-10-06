package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jxv {

    /* JADX INFO: renamed from: a */
    public final jxo f35097a;

    /* JADX INFO: renamed from: b */
    public final jxp f35098b;

    /* JADX INFO: renamed from: c */
    public final jxn f35099c;

    /* JADX INFO: renamed from: d */
    public final int f35100d;

    /* JADX INFO: renamed from: e */
    public final int f35101e;

    /* JADX INFO: renamed from: f */
    public final int f35102f;

    /* JADX INFO: renamed from: g */
    public final float f35103g;

    /* JADX INFO: renamed from: h */
    private final int f35104h;

    public jxv(jxo jxoVar, jxp jxpVar, int i, jxn jxnVar, int i2, int i3, int i4, float f) {
        if (jxoVar == null) {
            throw new NullPointerException(NptsKnlVczSZ.xAFKmVmdw);
        }
        this.f35097a = jxoVar;
        if (jxpVar == null) {
            throw new NullPointerException("Null videoResolution");
        }
        this.f35098b = jxpVar;
        this.f35104h = i;
        if (jxnVar == null) {
            throw new NullPointerException("Null camcorderCaptureRate");
        }
        this.f35099c = jxnVar;
        this.f35100d = i2;
        this.f35101e = i3;
        this.f35102f = i4;
        this.f35103g = f;
    }

    /* JADX INFO: renamed from: a */
    public final int m13669a() {
        return this.f35099c.f35058i;
    }

    /* JADX INFO: renamed from: b */
    public final int m13670b() {
        jxn jxnVar = this.f35099c;
        return jxnVar.m13658f() ? this.f35104h : this.f35104h / jxnVar.m13655a();
    }

    /* JADX INFO: renamed from: c */
    public final int m13671c() {
        return this.f35099c.f35059j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jxv) {
            jxv jxvVar = (jxv) obj;
            if (this.f35097a.equals(jxvVar.f35097a) && this.f35098b.equals(jxvVar.f35098b) && this.f35104h == jxvVar.f35104h && this.f35099c.equals(jxvVar.f35099c) && this.f35100d == jxvVar.f35100d && this.f35101e == jxvVar.f35101e && this.f35102f == jxvVar.f35102f && Float.floatToIntBits(this.f35103g) == Float.floatToIntBits(jxvVar.f35103g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f35097a.hashCode() ^ 1000003) * 1000003) ^ this.f35098b.hashCode()) * 1000003) ^ this.f35104h) * 1000003) ^ this.f35099c.hashCode()) * 1000003) ^ this.f35100d) * 1000003) ^ this.f35101e) * 1000003) ^ this.f35102f) * 1000003) ^ Float.floatToIntBits(this.f35103g);
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16823b("camcorderVideoFileFormat", this.f35097a);
        mrlVarM16765d.m16823b("camcorderVideoResolution", this.f35098b);
        mrlVarM16765d.m16826e("videoCaptureBitRate", this.f35104h);
        mrlVarM16765d.m16826e("videoCaptureFrameRate", m13669a());
        mrlVarM16765d.m16826e("videoEncoder", this.f35100d);
        mrlVarM16765d.m16826e("videoEncodingFrameRate", m13671c());
        mrlVarM16765d.m16825d("videoKeyFrameInterval", this.f35103g);
        return mrlVarM16765d.toString();
    }

    public jxv() {
    }
}
