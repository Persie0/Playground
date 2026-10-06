package p000;

import com.google.android.apps.camera.facemetadata.jni.FaceMetadataNative;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class drn implements kba {

    /* JADX INFO: renamed from: a */
    public final float f12413a;

    /* JADX INFO: renamed from: b */
    public final long[] f12414b;

    /* JADX INFO: renamed from: c */
    public final long[] f12415c;

    /* JADX INFO: renamed from: d */
    private final long f12416d;

    public drn(long j, float f, long[] jArr, long[] jArr2) {
        this.f12416d = j;
        this.f12413a = f;
        if (jArr == null) {
            throw new NullPointerException("Null faceThumbnails");
        }
        this.f12414b = jArr;
        this.f12415c = jArr2;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        FaceMetadataNative.releaseFaceThumbnails(this.f12414b);
        FaceMetadataNative.releaseFaceInfos(this.f12415c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof drn) {
            drn drnVar = (drn) obj;
            if (this.f12416d == drnVar.f12416d && Float.floatToIntBits(this.f12413a) == Float.floatToIntBits(drnVar.f12413a)) {
                if (Arrays.equals(this.f12414b, drnVar instanceof drn ? drnVar.f12414b : drnVar.f12414b) && Arrays.equals(this.f12415c, drnVar.f12415c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f12416d;
        return ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f12413a)) * 1000003) ^ Arrays.hashCode(this.f12414b)) * 1000003) ^ Arrays.hashCode(this.f12415c);
    }

    public final String toString() {
        return "FaceMetadata{timestampNs=" + this.f12416d + DNTdN.UhKwmReB + this.f12413a + ", faceThumbnails=" + Arrays.toString(this.f12414b) + ", faceInfos=" + Arrays.toString(this.f12415c) + hIAHJKEnGsNbz.KwBJxUMvvdV;
    }

    public drn() {
    }
}
