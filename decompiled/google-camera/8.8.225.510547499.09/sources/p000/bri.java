package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bri extends brm {
    public bri(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        return ParcelFileDescriptor.class;
    }

    @Override // p000.brm
    /* JADX INFO: renamed from: b */
    protected final /* bridge */ /* synthetic */ Object mo2935b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // p000.brm
    /* JADX INFO: renamed from: c */
    protected final /* synthetic */ void mo2936c(Object obj) throws IOException {
        ((ParcelFileDescriptor) obj).close();
    }
}
