package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brr implements brt {

    /* JADX INFO: renamed from: a */
    private static final String[] f4233a = {VzWFSVj.yapKlzwVLdjbe};

    /* JADX INFO: renamed from: b */
    private final ContentResolver f4234b;

    public brr(ContentResolver contentResolver) {
        this.f4234b = contentResolver;
    }

    @Override // p000.brt
    /* JADX INFO: renamed from: a */
    public final Cursor mo2959a(Uri uri) {
        return this.f4234b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f4233a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
