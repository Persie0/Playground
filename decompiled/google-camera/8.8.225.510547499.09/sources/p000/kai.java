package p000;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kai {

    /* JADX INFO: renamed from: a */
    public static final int[] f35480a = new int[0];

    /* JADX INFO: renamed from: a */
    public static final kmq m13867a(InterfaceC0953rd interfaceC0953rd) {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Integer num = (Integer) interfaceC0953rd.mo19374a(key);
        if (num != null) {
            switch (num.intValue()) {
                case 0:
                    return kmq.f36557a;
                case 1:
                    return kmq.BACK;
                default:
                    return kmq.EXTERNAL;
            }
        }
        CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_FACING;
        StringBuilder sb = new StringBuilder();
        sb.append("CameraMetadata missing value for key-");
        sb.append(key2);
        throw new kam("CameraMetadata missing value for key-".concat(String.valueOf(key2)));
    }
}
