package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import p021j$.nio.file.Paths;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dkc {

    /* JADX INFO: renamed from: f */
    private final ContentResolver f11872f;

    /* JADX INFO: renamed from: g */
    private final String f11873g;

    /* JADX INFO: renamed from: h */
    private final dhv f11874h;

    /* JADX INFO: renamed from: e */
    private static final nbh f11871e = nbh.m17259h("com/google/android/apps/camera/data/MediaStoreDataLoader");

    /* JADX INFO: renamed from: a */
    static final String f11867a = String.format(Locale.US, "CASE WHEN %s IS NULL THEN %s ELSE %s / 1000 END DESC, %s DESC", "datetaken", "date_modified", "datetaken", "_id");

    /* JADX INFO: renamed from: b */
    static final String f11868b = String.format(Locale.US, "%s LIKE ? AND (%s > ? OR (%s > ? AND (%s = ? OR %s / 1000 = ? / 1000)))", "relative_path", "datetaken", "date_modified", "datetaken", "datetaken");

    /* JADX INFO: renamed from: c */
    public static final String[] f11869c = {"_id", "title", "mime_type", "datetaken", "date_modified", "orientation", "width", BcwGDRhrTsnlj.UQtmGiCQJ, "is_pending"};

    /* JADX INFO: renamed from: d */
    static final String[] f11870d = {"_id"};

    public dkc(ContentResolver contentResolver, kqv kqvVar, dhv dhvVar) {
        this.f11872f = contentResolver;
        this.f11873g = Paths.get(Environment.DIRECTORY_DCIM, kqvVar.f36970o, "%").toString();
        this.f11874h = dhvVar;
    }

    /* JADX INFO: renamed from: a */
    public static Uri m6286a(long j, boolean z) {
        return (z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI).buildUpon().appendPath(String.valueOf(j)).build();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009d  */
    /* JADX INFO: renamed from: b */
    public final dka m6287b(Cursor cursor) throws IllegalAccessException, InvocationTargetException {
        kbc kbcVarM13903h;
        InputStream inputStreamOpenInputStream;
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("title"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("datetaken"));
        long j3 = cursor.getLong(cursor.getColumnIndexOrThrow("date_modified"));
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j2);
        Instant instantOfEpochSecond = Instant.ofEpochSecond(j3);
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("orientation"));
        Uri uriM6286a = m6286a(j, kxk.m15013f(string2));
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
        if (i3 == 0) {
            dhv dhvVar = this.f11874h;
            dhx dhxVar = dib.f11240a;
            dhvVar.mo6178f();
            if ("image/jpeg".equals(string2) || "image/bmp".equals(string2) || "image/gif".equals(string2) || "image/png".equals(string2) || "image/webp".equals(string2)) {
                try {
                    inputStreamOpenInputStream = this.f11872f.openInputStream(uriM6286a);
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        inputStreamOpenInputStream.getClass();
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        kbcVarM13903h = kbc.m13903h(options.outWidth, options.outHeight);
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th) {
                        if (inputStreamOpenInputStream == null) {
                            throw th;
                        }
                        try {
                            inputStreamOpenInputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    ((nbe) ((nbe) ((nbe) f11871e.m17252c()).mo17283h(e)).mo17276G((char) 935)).mo17290o("Exception in getting dimensions by BitmapFactory.");
                    kbcVarM13903h = kbc.m13903h(0, 0);
                }
                int i4 = kbcVarM13903h.f35517a;
                i3 = kbcVarM13903h.f35518b;
                i2 = i4;
            }
        } else if (i2 == 0) {
            i2 = 0;
            dhv dhvVar2 = this.f11874h;
            dhx dhxVar2 = dib.f11240a;
            dhvVar2.mo6178f();
            if ("image/jpeg".equals(string2)) {
                inputStreamOpenInputStream = this.f11872f.openInputStream(uriM6286a);
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                inputStreamOpenInputStream.getClass();
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options2);
                kbcVarM13903h = kbc.m13903h(options2.outWidth, options2.outHeight);
                inputStreamOpenInputStream.close();
                int i5 = kbcVarM13903h.f35517a;
                i3 = kbcVarM13903h.f35518b;
                i2 = i5;
            } else {
                inputStreamOpenInputStream = this.f11872f.openInputStream(uriM6286a);
                BitmapFactory.Options options3 = new BitmapFactory.Options();
                options3.inJustDecodeBounds = true;
                inputStreamOpenInputStream.getClass();
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options3);
                kbcVarM13903h = kbc.m13903h(options3.outWidth, options3.outHeight);
                inputStreamOpenInputStream.close();
                int i6 = kbcVarM13903h.f35517a;
                i3 = kbcVarM13903h.f35518b;
                i2 = i6;
            }
        }
        kbc kbcVarM13903h2 = kbc.m13903h(i2, i3);
        int i7 = cursor.getInt(cursor.getColumnIndexOrThrow("is_pending"));
        lku.m15658l(i7 == 0, "Item is still pending. Perhaps scan failed, look for MediaProvider logs: %s", uriM6286a);
        lku.m15658l(!mro.m16832b(string), "Item has empty title. Perhaps scan failed, look for MediaProvider logs: %s", uriM6286a);
        lku.m15658l(j3 > 0, "Item has unset DATE_MODIFIED. Perhaps scan failed, look for MediaProvider logs: %s", uriM6286a);
        if (j2 <= 0) {
            throw new mso(lku.m15665s("Item has unset DATE_TAKEN (%s). Perhaps scan failed, look for MediaProvider logs: %s", Long.valueOf(j2), uriM6286a));
        }
        lku.m15660n(i2 > 0 && i3 > 0, "Item has invalid dimensions (%s). Perhaps scan failed, look for MediaProvider logs: %s", kbcVarM13903h2, uriM6286a);
        dka dkaVarM6285k = dkb.m6285k();
        dkaVarM6285k.m6277b(j);
        dkaVarM6285k.m6283h(string);
        dkaVarM6285k.m6281f(string2);
        dkaVarM6285k.m6278c(instantOfEpochMilli);
        dkaVarM6285k.m6280e(instantOfEpochSecond);
        dkaVarM6285k.m6284i(uriM6286a);
        dkaVarM6285k.m6279d(i7 != 0);
        dkaVarM6285k.f11845b = kbcVarM13903h2;
        dkaVarM6285k.m6282g(i);
        return dkaVarM6285k;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0024 A[Catch: all -> 0x001b, TRY_ENTER, TryCatch #2 {all -> 0x001b, blocks: (B:4:0x000d, B:6:0x0013, B:18:0x002f, B:15:0x0024), top: B:38:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #2 {all -> 0x001b, blocks: (B:4:0x000d, B:6:0x0013, B:18:0x002f, B:15:0x0024), top: B:38:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:22:0x003c, B:25:0x004a, B:26:0x0060), top: B:35:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004a A[Catch: all -> 0x0061, TRY_ENTER, TryCatch #0 {all -> 0x0061, blocks: (B:22:0x003c, B:25:0x004a, B:26:0x0060), top: B:35:0x003a }] */
    /* JADX INFO: renamed from: c */
    final dkb m6288c(Uri uri, gyu gyuVar) throws Throwable {
        boolean z;
        String string;
        Object objValueOf;
        Cursor cursor = null;
        Cursor cursorQuery = this.f11872f.query(uri, f11869c, null, null);
        if (cursorQuery == null) {
            z = false;
            string = "null";
            if (cursorQuery == null) {
                objValueOf = "null";
            } else {
                objValueOf = Integer.valueOf(cursorQuery.getCount());
            }
            if (cursorQuery == null) {
                string = Arrays.toString(cursorQuery.getColumnNames());
                cursor = cursorQuery;
            }
            if (z) {
                throw new IllegalArgumentException(lku.m15665s("Uri %s for shot(%s) not found in MediaStore. ContentResolver returned the cursor with count=%s, columns=%s", uri, gyuVar, objValueOf, string));
            }
            dka dkaVarM6287b = m6287b(cursorQuery);
            dkaVarM6287b.f11844a = gyuVar;
            dkb dkbVarM6276a = dkaVarM6287b.m6276a();
            cursorQuery.close();
            return dkbVarM6276a;
        }
        try {
            if (cursorQuery.moveToFirst() && cursorQuery.getCount() == 1) {
                z = true;
            } else {
                z = false;
            }
            string = "null";
            if (cursorQuery == null) {
                objValueOf = "null";
            } else {
                objValueOf = Integer.valueOf(cursorQuery.getCount());
            }
            if (cursorQuery == null) {
                string = Arrays.toString(cursorQuery.getColumnNames());
                cursor = cursorQuery;
            }
            try {
                if (z) {
                    throw new IllegalArgumentException(lku.m15665s("Uri %s for shot(%s) not found in MediaStore. ContentResolver returned the cursor with count=%s, columns=%s", uri, gyuVar, objValueOf, string));
                }
                dka dkaVarM6287b2 = m6287b(cursorQuery);
                dkaVarM6287b2.f11844a = gyuVar;
                dkb dkbVarM6276a2 = dkaVarM6287b2.m6276a();
                cursorQuery.close();
                return dkbVarM6276a2;
            } catch (Throwable th) {
                th = th;
                cursorQuery = cursor;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursorQuery != null) {
            try {
                cursorQuery.close();
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th3);
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final List m6289d(Uri uri, String[] strArr, long j, long j2, int i, Function function) throws IllegalAccessException, InvocationTargetException {
        boolean z = strArr == f11870d || strArr == f11869c;
        lku.m15670x(z, "Invalid projection specified.");
        Cursor cursorQuery = this.f11872f.query(uri, strArr, f11868b, new String[]{this.f11873g, Long.toString(j), Long.toString(j2), Long.toString(j), Long.toString(j)}, f11867a);
        try {
            mwn mwnVarM17090e = mws.m17090e();
            if (cursorQuery != null) {
                int i2 = i;
                while (i2 > 0 && cursorQuery.moveToNext()) {
                    int i3 = i2 - 1;
                    try {
                        mwnVarM17090e.m17082g(function.apply(cursorQuery));
                    } catch (mso e) {
                        ((nbe) ((nbe) ((nbe) f11871e.m17251b()).mo17283h(e)).mo17276G(938)).mo17290o("QueryAfter gets exception in transforming a cursor.");
                        dhv dhvVar = this.f11874h;
                        dhx dhxVar = dib.f11240a;
                        dhvVar.mo6178f();
                    }
                    i2 = i3;
                }
            }
            mws mwsVarM17081f = mwnVarM17090e.m17081f();
            int i4 = ((mzr) mwsVarM17081f).f41859c;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return mwsVarM17081f;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final List m6290e(Instant instant, Instant instant2, boolean z) {
        return m6289d(z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, f11870d, instant.minusMillis(1L).toEpochMilli(), instant2.minusSeconds(1L).getEpochSecond(), Integer.MAX_VALUE, new igk(z, 1));
    }
}
