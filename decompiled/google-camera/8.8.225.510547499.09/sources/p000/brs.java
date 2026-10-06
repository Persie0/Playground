package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brs implements brt {

    /* JADX INFO: renamed from: a */
    private static final String[] f4235a = {"_data"};

    /* JADX INFO: renamed from: b */
    private final ContentResolver f4236b;

    public brs(ContentResolver contentResolver) {
        this.f4236b = contentResolver;
    }

    @Override // p000.brt
    /* JADX INFO: renamed from: a */
    public final Cursor mo2959a(Uri uri) {
        return this.f4236b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f4235a, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
