package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.airbnb.lottie.parser.moshi.C0877c;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.facebook.HttpMethod;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v2d {
    /* JADX INFO: renamed from: a */
    public static final mp3 m23069a(AccessToken accessToken, Uri uri, d3b d3bVar) {
        String path = uri.getPath();
        if ("file".equalsIgnoreCase(uri.getScheme()) && path != null) {
            GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType = new GraphRequest$ParcelableResourceWithMimeType(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", graphRequest$ParcelableResourceWithMimeType);
            return new mp3(accessToken, "me/staging_resources", bundle, HttpMethod.POST, d3bVar);
        }
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType2 = new GraphRequest$ParcelableResourceWithMimeType(uri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("file", graphRequest$ParcelableResourceWithMimeType2);
        return new mp3(accessToken, "me/staging_resources", bundle2, HttpMethod.POST, d3bVar);
    }

    /* JADX INFO: renamed from: b */
    public static C3726wl m23070b(C0877c c0877c, gl5 gl5Var) {
        return new C3726wl(0, nj4.m17476a(c0877c, gl5Var, 1.0f, a3d.f190b, false));
    }

    /* JADX INFO: renamed from: c */
    public static C3763xl m23071c(AbstractC0875a abstractC0875a, gl5 gl5Var, boolean z) {
        return new C3763xl(nj4.m17476a(abstractC0875a, gl5Var, z ? fna.m11957c() : 1.0f, wkd.f66984b, false), 0);
    }

    /* JADX INFO: renamed from: d */
    public static C3726wl m23072d(C0877c c0877c, gl5 gl5Var, int i) {
        cp3 cp3Var = new cp3(0);
        cp3Var.f34342b = i;
        ArrayList arrayListM17476a = nj4.m17476a(c0877c, gl5Var, 1.0f, cp3Var, false);
        for (int i2 = 0; i2 < arrayListM17476a.size(); i2++) {
            kj4 kj4Var = (kj4) arrayListM17476a.get(i2);
            ap3 ap3Var = (ap3) kj4Var.f47378b;
            ap3 ap3Var2 = (ap3) kj4Var.f47379c;
            if (ap3Var != null && ap3Var2 != null) {
                float[] fArr = ap3Var.f7321a;
                int length = fArr.length;
                float[] fArr2 = ap3Var2.f7321a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f2 = fArr3[i4];
                        if (f2 != f) {
                            fArr3[i3] = f2;
                            i3++;
                            f = fArr3[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    kj4Var = new kj4(ap3Var.m2967b(fArrCopyOfRange), ap3Var2.m2967b(fArrCopyOfRange));
                }
            }
            arrayListM17476a.set(i2, kj4Var);
        }
        return new C3726wl(1, arrayListM17476a);
    }

    /* JADX INFO: renamed from: e */
    public static C3726wl m23073e(AbstractC0875a abstractC0875a, gl5 gl5Var) {
        return new C3726wl(2, nj4.m17476a(abstractC0875a, gl5Var, 1.0f, q41.f57243d, false));
    }

    /* JADX INFO: renamed from: f */
    public static C3726wl m23074f(C0877c c0877c, gl5 gl5Var) {
        return new C3726wl(3, nj4.m17476a(c0877c, gl5Var, fna.m11957c(), gna.f41055c, true));
    }
}
