package p000;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.ShotParams;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eea {

    /* JADX INFO: renamed from: a */
    public final InterleavedImageU8 f13584a;

    /* JADX INFO: renamed from: b */
    public final eev f13585b;

    /* JADX INFO: renamed from: c */
    public final HardwareBuffer f13586c;

    /* JADX INFO: renamed from: d */
    public final ShotMetadata f13587d;

    /* JADX INFO: renamed from: e */
    public final kay f13588e;

    /* JADX INFO: renamed from: f */
    public final kpp f13589f;

    /* JADX INFO: renamed from: g */
    public final long f13590g;

    /* JADX INFO: renamed from: h */
    public final nps f13591h;

    /* JADX INFO: renamed from: i */
    public final drn f13592i;

    /* JADX INFO: renamed from: j */
    public final InterleavedImageU8 f13593j;

    /* JADX INFO: renamed from: k */
    public final gug f13594k;

    /* JADX INFO: renamed from: l */
    public final ShotParams f13595l;

    /* JADX INFO: renamed from: m */
    public final ebn f13596m;

    /* JADX INFO: renamed from: n */
    public final glk f13597n;

    /* JADX INFO: renamed from: o */
    public final gtd f13598o;

    public eea() {
    }

    public eea(InterleavedImageU8 interleavedImageU8, eev eevVar, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, kay kayVar, kpp kppVar, long j, ebn ebnVar, gtd gtdVar, nps npsVar, glk glkVar, drn drnVar, InterleavedImageU8 interleavedImageU9, gug gugVar, ShotParams shotParams, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f13584a = interleavedImageU8;
        this.f13585b = eevVar;
        this.f13586c = hardwareBuffer;
        this.f13587d = shotMetadata;
        this.f13588e = kayVar;
        this.f13589f = kppVar;
        this.f13590g = j;
        this.f13596m = ebnVar;
        this.f13598o = gtdVar;
        this.f13591h = npsVar;
        this.f13597n = glkVar;
        this.f13592i = drnVar;
        this.f13593j = interleavedImageU9;
        this.f13594k = gugVar;
        this.f13595l = shotParams;
    }

    /* JADX INFO: renamed from: a */
    public static edz m7202a() {
        return new edz();
    }

    /* JADX INFO: renamed from: b */
    public final edz m7203b() {
        return new edz(this);
    }

    public final boolean equals(Object obj) {
        gtd gtdVar;
        drn drnVar;
        InterleavedImageU8 interleavedImageU8;
        gug gugVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eea)) {
            return false;
        }
        eea eeaVar = (eea) obj;
        InterleavedImageU8 interleavedImageU9 = this.f13584a;
        if (interleavedImageU9 != null ? interleavedImageU9.equals(eeaVar.f13584a) : eeaVar.f13584a == null) {
            eev eevVar = this.f13585b;
            if (eevVar != null ? eevVar.equals(eeaVar.f13585b) : eeaVar.f13585b == null) {
                HardwareBuffer hardwareBuffer = this.f13586c;
                if (hardwareBuffer != null ? hardwareBuffer.equals(eeaVar.f13586c) : eeaVar.f13586c == null) {
                    if (this.f13587d.equals(eeaVar.f13587d) && this.f13588e.equals(eeaVar.f13588e) && this.f13589f.equals(eeaVar.f13589f) && this.f13590g == eeaVar.f13590g && this.f13596m.equals(eeaVar.f13596m) && ((gtdVar = this.f13598o) != null ? gtdVar.equals(eeaVar.f13598o) : eeaVar.f13598o == null) && this.f13591h.equals(eeaVar.f13591h) && this.f13597n.equals(eeaVar.f13597n) && ((drnVar = this.f13592i) != null ? drnVar.equals(eeaVar.f13592i) : eeaVar.f13592i == null) && ((interleavedImageU8 = this.f13593j) != null ? interleavedImageU8.equals(eeaVar.f13593j) : eeaVar.f13593j == null) && ((gugVar = this.f13594k) != null ? gugVar.equals(eeaVar.f13594k) : eeaVar.f13594k == null)) {
                        ShotParams shotParams = this.f13595l;
                        ShotParams shotParams2 = eeaVar.f13595l;
                        if (shotParams != null ? shotParams.equals(shotParams2) : shotParams2 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "PostprocessingImage{rgbImage=" + String.valueOf(this.f13584a) + ", yuvImage=" + String.valueOf(this.f13585b) + ", rgbHwBufferImage=" + String.valueOf(this.f13586c) + ", shotMetadata=" + String.valueOf(this.f13587d) + ", orientation=" + String.valueOf(this.f13588e) + ", metadata=" + String.valueOf(this.f13589f) + ", timestampNs=" + this.f13590g + ", gcaShotSettings=" + String.valueOf(this.f13596m) + ", portraitShotParams=" + String.valueOf(this.f13598o) + ", mergedPdData=" + String.valueOf(this.f13591h) + ", pictureTakerParameters=" + String.valueOf(this.f13597n) + ", faceMetadata=" + String.valueOf(this.f13592i) + ", warpedSegmentationMaskImage=" + String.valueOf(this.f13593j) + ", rectifaceWarpfield=" + String.valueOf(this.f13594k) + ", shotParams=" + String.valueOf(this.f13595l) + "}";
    }

    public final int hashCode() {
        InterleavedImageU8 interleavedImageU8 = this.f13584a;
        int iHashCode = interleavedImageU8 == null ? 0 : interleavedImageU8.hashCode();
        eev eevVar = this.f13585b;
        int iHashCode2 = eevVar == null ? 0 : eevVar.hashCode();
        int i = iHashCode ^ 1000003;
        HardwareBuffer hardwareBuffer = this.f13586c;
        int iHashCode3 = ((((((((((i * 1000003) ^ iHashCode2) * 1000003) ^ (hardwareBuffer == null ? 0 : hardwareBuffer.hashCode())) * 1000003) ^ this.f13587d.hashCode()) * 1000003) ^ this.f13588e.hashCode()) * 1000003) ^ this.f13589f.hashCode()) * 1000003;
        long j = this.f13590g;
        int iHashCode4 = (((iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f13596m.hashCode()) * 1000003;
        gtd gtdVar = this.f13598o;
        int iHashCode5 = (((((iHashCode4 ^ (gtdVar == null ? 0 : gtdVar.hashCode())) * 1000003) ^ this.f13591h.hashCode()) * 1000003) ^ this.f13597n.hashCode()) * 1000003;
        drn drnVar = this.f13592i;
        int iHashCode6 = (iHashCode5 ^ (drnVar == null ? 0 : drnVar.hashCode())) * 1000003;
        InterleavedImageU8 interleavedImageU9 = this.f13593j;
        int iHashCode7 = (iHashCode6 ^ (interleavedImageU9 == null ? 0 : interleavedImageU9.hashCode())) * 1000003;
        gug gugVar = this.f13594k;
        int iHashCode8 = (iHashCode7 ^ (gugVar == null ? 0 : gugVar.hashCode())) * 1000003;
        ShotParams shotParams = this.f13595l;
        return iHashCode8 ^ (shotParams != null ? shotParams.hashCode() : 0);
    }
}
