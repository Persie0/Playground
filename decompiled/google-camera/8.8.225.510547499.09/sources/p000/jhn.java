package p000;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jhn {

    /* JADX INFO: renamed from: a */
    private static final Uri f34084a;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f34084a = uri;
        uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
