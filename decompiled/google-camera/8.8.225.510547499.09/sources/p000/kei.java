package p000;

import android.util.Log;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum kei {
    TOP_LEFT(1),
    TOP_RIGHT(2),
    BOTTOM_RIGHT(3),
    BOTTOM_LEFT(4),
    LEFT_TOP(5),
    RIGHT_TOP(6),
    RIGHT_BOTTOM(7),
    LEFT_BOTTOM(8);


    /* JADX INFO: renamed from: j */
    private static final mwx f35730j;

    /* JADX INFO: renamed from: i */
    public final short f35732i;

    static {
        List listAsList = Arrays.asList(values());
        cev cevVar = new cev(7);
        f35730j = listAsList instanceof Collection ? mkv.m16559x(listAsList.iterator(), cevVar, mwx.m17116j(listAsList.size())) : mkv.m16559x(listAsList.iterator(), cevVar, mwx.m17115i());
    }

    kei(short s) {
        this.f35732i = s;
    }

    /* JADX INFO: renamed from: a */
    public static kay m14032a(kei keiVar) {
        if (keiVar == null) {
            Log.w("CAM_ExifOrientation", "Computing rotation for an null exif orientation, returning 0");
            return kay.CLOCKWISE_0;
        }
        kay kayVar = kay.CLOCKWISE_0;
        switch (keiVar.ordinal()) {
            case 0:
                return kay.CLOCKWISE_0;
            case 2:
                return kay.CLOCKWISE_180;
            case 5:
                return kay.CLOCKWISE_90;
            case 7:
                return kay.CLOCKWISE_270;
            default:
                Log.w("CAM_ExifOrientation", "Computing rotation for an invalid orientation: ".concat(keiVar.toString()));
                return kay.CLOCKWISE_0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static kei m14033b(kay kayVar) {
        kayVar.getClass();
        kay kayVar2 = kay.CLOCKWISE_0;
        switch (kayVar) {
            case CLOCKWISE_0:
                return TOP_LEFT;
            case CLOCKWISE_90:
                return RIGHT_TOP;
            case CLOCKWISE_180:
                return BOTTOM_RIGHT;
            case CLOCKWISE_270:
                return LEFT_BOTTOM;
            default:
                throw new IllegalArgumentException("Orientation must be one of 4 defined values!");
        }
    }

    /* JADX INFO: renamed from: c */
    public static kei m14034c(ExifInterface exifInterface) {
        Integer numMo4681b = exifInterface.mo4681b(ExifInterface.f7901j);
        if (numMo4681b == null) {
            return null;
        }
        return (kei) f35730j.get(Short.valueOf(numMo4681b.shortValue()));
    }
}
