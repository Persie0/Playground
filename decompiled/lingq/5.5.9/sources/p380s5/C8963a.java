package p380s5;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C2092a;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2100g;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: s5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8963a implements InterfaceC2097d<InputStream> {

    /* JADX INFO: renamed from: a */
    public final Uri f46963a;

    /* JADX INFO: renamed from: b */
    public final C8965c f46964b;

    /* JADX INFO: renamed from: c */
    public InputStream f46965c;

    /* JADX INFO: renamed from: s5.a$a */
    public static class a implements InterfaceC8964b {

        /* JADX INFO: renamed from: b */
        public static final String[] f46966b = {"_data"};

        /* JADX INFO: renamed from: a */
        public final ContentResolver f46967a;

        public a(ContentResolver contentResolver) {
            this.f46967a = contentResolver;
        }

        @Override // p380s5.InterfaceC8964b
        /* JADX INFO: renamed from: a */
        public final Cursor mo17190a(Uri uri) {
            return this.f46967a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f46966b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: s5.a$b */
    public static class b implements InterfaceC8964b {

        /* JADX INFO: renamed from: b */
        public static final String[] f46968b = {"_data"};

        /* JADX INFO: renamed from: a */
        public final ContentResolver f46969a;

        public b(ContentResolver contentResolver) {
            this.f46969a = contentResolver;
        }

        @Override // p380s5.InterfaceC8964b
        /* JADX INFO: renamed from: a */
        public final Cursor mo17190a(Uri uri) {
            return this.f46969a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f46968b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public C8963a(Uri uri, C8965c c8965c) {
        this.f46963a = uri;
        this.f46964b = c8965c;
    }

    /* JADX INFO: renamed from: c */
    public static C8963a m17188c(Context context, Uri uri, InterfaceC8964b interfaceC8964b) {
        return new C8963a(uri, new C8965c(ComponentCallbacks2C2080b.m6235a(context).f10552c.m6240a().m6230d(), interfaceC8964b, ComponentCallbacks2C2080b.m6235a(context).f10553d, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: a */
    public final Class<InputStream> mo6269a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: b */
    public final void mo6272b() {
        InputStream inputStream = this.f46965c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: d */
    public final DataSource mo6274d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2097d
    /* JADX INFO: renamed from: e */
    public final void mo6275e(Priority priority, InterfaceC2097d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamM17189f = m17189f();
            this.f46965c = inputStreamM17189f;
            aVar.mo6278f(inputStreamM17189f);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.mo6277c(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x002c: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:10:0x002c */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.InputStream] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: f */
    public final InputStream m17189f() throws Throwable {
        SecurityException e10;
        Cursor cursorMo17190a;
        Object obj;
        String string;
        File file;
        Uri uriFromFile;
        InputStream inputStreamOpenInputStream;
        int iM6265a;
        Uri uri = this.f46963a;
        C8965c c8965c = this.f46964b;
        c8965c.getClass();
        ?? OpenInputStream = 0;
        boolean z10 = false;
        try {
            try {
                cursorMo17190a = c8965c.f46970a.mo17190a(uri);
                if (cursorMo17190a != null) {
                    try {
                        if (cursorMo17190a.moveToFirst()) {
                            string = cursorMo17190a.getString(0);
                            cursorMo17190a.close();
                        }
                    } catch (SecurityException e11) {
                        e10 = e11;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e10);
                        }
                        if (cursorMo17190a != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                z10 = true;
                            }
                            if (z10) {
                                uriFromFile = Uri.fromFile(file);
                                try {
                                    inputStreamOpenInputStream = c8965c.f46972c.openInputStream(uriFromFile);
                                } catch (NullPointerException e12) {
                                    throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e12));
                                }
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            c8965c.getClass();
                            try {
                                try {
                                    OpenInputStream = c8965c.f46972c.openInputStream(uri);
                                    iM6265a = C2092a.m6265a(c8965c.f46971b, OpenInputStream, c8965c.f46973d);
                                    if (OpenInputStream != 0) {
                                        try {
                                            OpenInputStream.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    if (0 != 0) {
                                        try {
                                            OpenInputStream.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th2;
                                }
                            } catch (IOException | NullPointerException e13) {
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e13);
                                }
                                if (OpenInputStream != 0) {
                                    try {
                                        OpenInputStream.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                iM6265a = -1;
                            }
                        } else {
                            iM6265a = -1;
                        }
                        if (iM6265a != -1) {
                            return new C2100g(iM6265a, inputStreamOpenInputStream);
                        }
                        return inputStreamOpenInputStream;
                    }
                    if (TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() && 0 < file.length()) {
                            z10 = true;
                        }
                        if (z10) {
                            inputStreamOpenInputStream = null;
                        } else {
                            uriFromFile = Uri.fromFile(file);
                            inputStreamOpenInputStream = c8965c.f46972c.openInputStream(uriFromFile);
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        c8965c.getClass();
                        OpenInputStream = c8965c.f46972c.openInputStream(uri);
                        iM6265a = C2092a.m6265a(c8965c.f46971b, OpenInputStream, c8965c.f46973d);
                        if (OpenInputStream != 0) {
                            OpenInputStream.close();
                        }
                    } else {
                        iM6265a = -1;
                    }
                    if (iM6265a != -1) {
                        return new C2100g(iM6265a, inputStreamOpenInputStream);
                    }
                    return inputStreamOpenInputStream;
                }
                if (cursorMo17190a != null) {
                    cursorMo17190a.close();
                }
            } catch (Throwable th3) {
                th = th3;
                OpenInputStream = obj;
                if (OpenInputStream != 0) {
                    OpenInputStream.close();
                }
                throw th;
            }
        } catch (SecurityException e14) {
            e10 = e14;
            cursorMo17190a = null;
        } catch (Throwable th4) {
            th = th4;
            if (OpenInputStream != 0) {
                OpenInputStream.close();
            }
            throw th;
        }
        string = null;
        if (TextUtils.isEmpty(string)) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                z10 = true;
            }
            if (z10) {
                inputStreamOpenInputStream = null;
            } else {
                uriFromFile = Uri.fromFile(file);
                inputStreamOpenInputStream = c8965c.f46972c.openInputStream(uriFromFile);
            }
        }
        if (inputStreamOpenInputStream != null) {
            c8965c.getClass();
            OpenInputStream = c8965c.f46972c.openInputStream(uri);
            iM6265a = C2092a.m6265a(c8965c.f46971b, OpenInputStream, c8965c.f46973d);
            if (OpenInputStream != 0) {
                OpenInputStream.close();
            }
        } else {
            iM6265a = -1;
        }
        if (iM6265a != -1) {
            return new C2100g(iM6265a, inputStreamOpenInputStream);
        }
        return inputStreamOpenInputStream;
    }
}
