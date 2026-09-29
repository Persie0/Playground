package p474x5;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.File;
import java.io.FileNotFoundException;
import p236l6.C7283d;
import p338qd.C8573r0;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C10086k implements InterfaceC10090o<Uri, File> {

    /* JADX INFO: renamed from: a */
    public final Context f51169a;

    /* JADX INFO: renamed from: x5.k$a */
    public static final class a implements InterfaceC10091p<Uri, File> {

        /* JADX INFO: renamed from: a */
        public final Context f51170a;

        public a(Context context) {
            this.f51170a = context;
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, File> mo18922c(C10094s c10094s) {
            return new C10086k(this.f51170a);
        }
    }

    /* JADX INFO: renamed from: x5.k$b */
    public static class b implements InterfaceC2097d<File> {

        /* JADX INFO: renamed from: c */
        public static final String[] f51171c = {"_data"};

        /* JADX INFO: renamed from: a */
        public final Context f51172a;

        /* JADX INFO: renamed from: b */
        public final Uri f51173b;

        public b(Context context, Uri uri) {
            this.f51172a = context;
            this.f51173b = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: a */
        public final Class<File> mo6269a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: b */
        public final void mo6272b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: d */
        public final DataSource mo6274d() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: e */
        public final void mo6275e(Priority priority, InterfaceC2097d.a<? super File> aVar) {
            Cursor cursorQuery = this.f51172a.getContentResolver().query(this.f51173b, f51171c, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    }
                    cursorQuery.close();
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.mo6278f(new File(string));
                return;
            }
            aVar.mo6277c(new FileNotFoundException("Failed to find file path for: " + this.f51173b));
        }
    }

    public C10086k(Context context) {
        this.f51169a = context;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final boolean mo18919a(Uri uri) {
        return C8573r0.m16773z0(uri);
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a<File> mo18920b(Uri uri, int i10, int i11, C8735e c8735e) {
        Uri uri2 = uri;
        return new InterfaceC10090o.a<>(new C7283d(uri2), new b(this.f51169a, uri2));
    }
}
