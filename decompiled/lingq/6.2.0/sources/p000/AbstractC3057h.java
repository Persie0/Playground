package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import coil.base.R$id;
import coil.size.Scale;
import java.io.Closeable;
import java.util.ArrayList;

/* JADX INFO: renamed from: h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3057h {

    /* JADX INFO: renamed from: a */
    public static final Bitmap.Config[] f41581a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* JADX INFO: renamed from: b */
    public static final Bitmap.Config f41582b = Bitmap.Config.HARDWARE;

    /* JADX INFO: renamed from: c */
    public static final qr3 f41583c = new qr3((String[]) new ArrayList(20).toArray(new String[0]));

    /* JADX INFO: renamed from: a */
    public static final void m12986a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m12987b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || vk9.m23391n0(str)) {
            return null;
        }
        String strM23373I0 = vk9.m23373I0(vk9.m23373I0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(vk9.m23369E0('.', vk9.m23369E0('/', strM23373I0, strM23373I0), ""));
    }

    /* JADX INFO: renamed from: c */
    public static final mva m12988c(ImageView imageView) {
        mva mvaVar;
        Object tag = imageView.getTag(R$id.coil_request_manager);
        mva mvaVar2 = tag instanceof mva ? (mva) tag : null;
        if (mvaVar2 != null) {
            return mvaVar2;
        }
        synchronized (imageView) {
            try {
                Object tag2 = imageView.getTag(R$id.coil_request_manager);
                mvaVar = tag2 instanceof mva ? (mva) tag2 : null;
                if (mvaVar == null) {
                    mvaVar = new mva();
                    imageView.addOnAttachStateChangeListener(mvaVar);
                    imageView.setTag(R$id.coil_request_manager, mvaVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mvaVar;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m12989d(Uri uri) {
        return fa4.m11650l(uri.getScheme(), "file") && fa4.m11650l((String) u91.m22591I0(uri.getPathSegments()), "android_asset");
    }

    /* JADX INFO: renamed from: e */
    public static final int m12990e(pvc pvcVar, Scale scale) {
        if (pvcVar instanceof lg2) {
            return ((lg2) pvcVar).f49621n;
        }
        int i = AbstractC3020g.f39979b[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        gm5.m12750e();
        return 0;
    }
}
