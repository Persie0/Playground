package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import com.google.lens.sdk.LensApi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acx {
    /* JADX INFO: renamed from: a */
    static Drawable m247a(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX INFO: renamed from: b */
    public static Icon m248b(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        String strM257d;
        Uri uriM249c;
        int i = iconCompat.f1475b;
        switch (i) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                return (Icon) iconCompat.f1476c;
            case 0:
            default:
                throw new IllegalArgumentException(qQLA.fsglDdBxjEmy);
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f1476c);
                break;
            case 2:
                if (i == -1) {
                    strM257d = acz.m257d(iconCompat.f1476c);
                } else {
                    if (i != 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("called getResPackage() on ");
                        sb.append(iconCompat);
                        throw new IllegalStateException("called getResPackage() on ".concat(iconCompat.toString()));
                    }
                    String str = iconCompat.f1484k;
                    strM257d = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.f1476c).split(VzWFSVj.QJJTqwQEdM, -1)[0] : iconCompat.f1484k;
                }
                iconCreateWithBitmap = Icon.createWithResource(strM257d, iconCompat.f1479f);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f1476c, iconCompat.f1479f, iconCompat.f1480g);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f1476c);
                break;
            case 5:
                iconCreateWithBitmap = acy.m252b((Bitmap) iconCompat.f1476c);
                break;
            case 6:
                if (i == -1) {
                    uriM249c = m249c(iconCompat.f1476c);
                } else {
                    if (i != 4 && i != 6) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("called getUri() on ");
                        sb2.append(iconCompat);
                        throw new IllegalStateException("called getUri() on ".concat(iconCompat.toString()));
                    }
                    uriM249c = Uri.parse((String) iconCompat.f1476c);
                }
                iconCreateWithBitmap = ada.m260a(uriM249c);
                break;
        }
        ColorStateList colorStateList = iconCompat.f1481h;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f1482i;
        if (mode != IconCompat.f1474a) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    /* JADX INFO: renamed from: c */
    static Uri m249c(Object obj) {
        return acz.m256c(obj);
    }

    /* JADX INFO: renamed from: d */
    public static final oyo m250d(int i) {
        return new oyo(i);
    }
}
