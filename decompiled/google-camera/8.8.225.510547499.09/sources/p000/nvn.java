package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.Log;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvn {

    /* JADX INFO: renamed from: a */
    public final Uri f44759a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f44760b;

    /* JADX INFO: renamed from: c */
    public final Long f44761c;

    /* JADX INFO: renamed from: d */
    public final nvg f44762d;

    /* JADX INFO: renamed from: e */
    public final Integer f44763e;

    /* JADX INFO: renamed from: f */
    public final Integer f44764f;

    /* JADX INFO: renamed from: g */
    public final PointF f44765g;

    /* JADX INFO: renamed from: h */
    private final byte[] f44766h;

    public nvn() {
    }

    public nvn(Uri uri, Bitmap bitmap, Long l, nvg nvgVar, Integer num, Integer num2, PointF pointF) {
        this.f44759a = uri;
        this.f44760b = bitmap;
        this.f44766h = null;
        this.f44761c = l;
        this.f44762d = nvgVar;
        this.f44763e = num;
        this.f44764f = num2;
        this.f44765g = pointF;
    }

    /* JADX INFO: renamed from: c */
    public static ofk m17743c() {
        return new ofk();
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m17744a(ivk ivkVar) {
        Bundle bundle = new Bundle();
        Uri uri = this.f44759a;
        if (uri != null) {
            bundle.putParcelable("uri", uri);
        }
        Bitmap bitmapCreateBitmap = this.f44760b;
        int i = 0;
        if (bitmapCreateBitmap != null) {
            int i2 = (ivkVar.f32280a & 4) != 0 ? ivkVar.f32283d : 33554432;
            if (bitmapCreateBitmap.getByteCount() > i2) {
                Log.w("LensMetadata", String.format(DNTdN.nmYqzcljjHaWcKD, Integer.valueOf(bitmapCreateBitmap.getByteCount()), Integer.valueOf(i2)));
                float fSqrt = (float) Math.sqrt(i2 / bitmapCreateBitmap.getByteCount());
                Matrix matrix = new Matrix();
                matrix.setScale(fSqrt, fSqrt);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
            }
            bundle.putParcelable("bitmap", bitmapCreateBitmap);
        }
        Integer num = this.f44763e;
        if (num != null) {
            num.intValue();
            i = 1;
        }
        bundle.putInt("lens_transition_type", i);
        PointF pointF = this.f44765g;
        if (pointF != null) {
            bundle.putParcelable("lens_tap_location", pointF);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public final Bundle m17745b() {
        Bundle bundle = new Bundle();
        Long l = this.f44761c;
        if (l != null) {
            bundle.putLong("activity_launch_timestamp_nanos", l.longValue());
        }
        nvg nvgVar = this.f44762d;
        if (nvgVar != null) {
            bundle.putByteArray("lens_initial_parameters", nvgVar.mo17760J());
        }
        Integer num = this.f44764f;
        if (num != null) {
            bundle.putInt(rmwTRjObXLGH.kvPTYq, num.intValue());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: d */
    public final ofk m17746d() {
        return new ofk(this);
    }

    public final boolean equals(Object obj) {
        Long l;
        nvg nvgVar;
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nvn)) {
            return false;
        }
        nvn nvnVar = (nvn) obj;
        Uri uri = this.f44759a;
        if (uri != null ? uri.equals(nvnVar.f44759a) : nvnVar.f44759a == null) {
            Bitmap bitmap = this.f44760b;
            if (bitmap != null ? bitmap.equals(nvnVar.f44760b) : nvnVar.f44760b == null) {
                if (nvnVar instanceof nvn) {
                    byte[] bArr = nvnVar.f44766h;
                }
                if (Arrays.equals((byte[]) null, (byte[]) null) && ((l = this.f44761c) != null ? l.equals(nvnVar.f44761c) : nvnVar.f44761c == null) && ((nvgVar = this.f44762d) != null ? nvgVar.equals(nvnVar.f44762d) : nvnVar.f44762d == null) && ((num = this.f44763e) != null ? num.equals(nvnVar.f44763e) : nvnVar.f44763e == null) && ((num2 = this.f44764f) != null ? num2.equals(nvnVar.f44764f) : nvnVar.f44764f == null)) {
                    PointF pointF = this.f44765g;
                    PointF pointF2 = nvnVar.f44765g;
                    if (pointF != null ? pointF.equals(pointF2) : pointF2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return "LensMetadata{bitmapUri=" + String.valueOf(this.f44759a) + ", bitmap=" + String.valueOf(this.f44760b) + ", imageLocationOnScreen=null, account=null, imageLocation=null, imagePlaceId=null, imagePayload=" + Arrays.toString((byte[]) null) + ", lensActivityLaunchTimestampNanos=" + this.f44761c + ", hideLensCloseButton=" + ((Object) null) + ", disableArtLookalike=" + ((Object) null) + ", lensInitParams=" + String.valueOf(this.f44762d) + ", transitionType=" + this.f44763e + ", intentType=" + this.f44764f + voNZjxiJou.WrQdcZ + String.valueOf(this.f44765g) + ", lensTheme=" + ((Object) null) + ", fifeUrl=null, promoAddShortcut=" + ((Object) null) + "}";
    }

    public final int hashCode() {
        int iM18134L;
        Uri uri = this.f44759a;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        Bitmap bitmap = this.f44760b;
        int iHashCode2 = (((((iHashCode ^ 1000003) * 1000003) ^ (bitmap == null ? 0 : bitmap.hashCode())) * (-429739981)) ^ Arrays.hashCode((byte[]) null)) * 1000003;
        Long l = this.f44761c;
        int iHashCode3 = iHashCode2 ^ (l == null ? 0 : l.hashCode());
        nvg nvgVar = this.f44762d;
        if (nvgVar == null) {
            iM18134L = 0;
        } else if (nvgVar.m18142ac()) {
            iM18134L = nvgVar.m18134L();
        } else {
            int iM18134L2 = nvgVar.f44820aG;
            if (iM18134L2 == 0) {
                iM18134L2 = nvgVar.m18134L();
                nvgVar.f44820aG = iM18134L2;
            }
            iM18134L = iM18134L2;
        }
        int i = ((iHashCode3 * 583896283) ^ iM18134L) * 1000003;
        Integer num = this.f44763e;
        int iHashCode4 = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.f44764f;
        int iHashCode5 = (iHashCode4 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        PointF pointF = this.f44765g;
        return (iHashCode5 ^ (pointF != null ? pointF.hashCode() : 0)) * 583896283;
    }
}
