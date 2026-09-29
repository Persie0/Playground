package p334q8;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import java.io.File;
import java.io.FileNotFoundException;
import mo.C7661i;
import p067d8.C5066f0;
import p067d8.C5086z;

/* JADX INFO: renamed from: q8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8504a {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final GraphRequest m16609a(AccessToken accessToken, Uri uri, C5066f0 c5066f0) throws FileNotFoundException {
        String path = uri.getPath();
        C5086z c5086z = C5086z.f33015a;
        if (C7661i.m15249O2("file", uri.getScheme()) && path != null) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, c5066f0, 32);
        }
        if (!C7661i.m15249O2("content", uri.getScheme())) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType2 = new GraphRequest.ParcelableResourceWithMimeType(uri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("file", parcelableResourceWithMimeType2);
        return new GraphRequest(accessToken, "me/staging_resources", bundle2, HttpMethod.POST, c5066f0, 32);
    }
}
