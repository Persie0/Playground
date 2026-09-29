package p500y5;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p236l6.C7283d;
import p338qd.C8573r0;
import p356r5.C8735e;
import p474x5.C10094s;
import p474x5.InterfaceC10090o;
import p474x5.InterfaceC10091p;

/* JADX INFO: renamed from: y5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10295d<DataT> implements InterfaceC10090o<Uri, DataT> {

    /* JADX INFO: renamed from: a */
    public final Context f51788a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o<File, DataT> f51789b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10090o<Uri, DataT> f51790c;

    /* JADX INFO: renamed from: d */
    public final Class<DataT> f51791d;

    /* JADX INFO: renamed from: y5.d$a */
    public static abstract class a<DataT> implements InterfaceC10091p<Uri, DataT> {

        /* JADX INFO: renamed from: a */
        public final Context f51792a;

        /* JADX INFO: renamed from: b */
        public final Class<DataT> f51793b;

        public a(Context context, Class<DataT> cls) {
            this.f51792a = context;
            this.f51793b = cls;
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, DataT> mo18922c(C10094s c10094s) {
            Class<DataT> cls = this.f51793b;
            return new C10295d(this.f51792a, c10094s.m18941b(File.class, cls), c10094s.m18941b(Uri.class, cls), cls);
        }
    }

    /* JADX INFO: renamed from: y5.d$b */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: renamed from: y5.d$c */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: y5.d$d */
    public static final class d<DataT> implements InterfaceC2097d<DataT> {

        /* JADX INFO: renamed from: k */
        public static final String[] f51794k = {"_data"};

        /* JADX INFO: renamed from: a */
        public final Context f51795a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC10090o<File, DataT> f51796b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, DataT> f51797c;

        /* JADX INFO: renamed from: d */
        public final Uri f51798d;

        /* JADX INFO: renamed from: e */
        public final int f51799e;

        /* JADX INFO: renamed from: f */
        public final int f51800f;

        /* JADX INFO: renamed from: g */
        public final C8735e f51801g;

        /* JADX INFO: renamed from: h */
        public final Class<DataT> f51802h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f51803i;

        /* JADX INFO: renamed from: j */
        public volatile InterfaceC2097d<DataT> f51804j;

        public d(Context context, InterfaceC10090o<File, DataT> interfaceC10090o, InterfaceC10090o<Uri, DataT> interfaceC10090o2, Uri uri, int i10, int i11, C8735e c8735e, Class<DataT> cls) {
            this.f51795a = context.getApplicationContext();
            this.f51796b = interfaceC10090o;
            this.f51797c = interfaceC10090o2;
            this.f51798d = uri;
            this.f51799e = i10;
            this.f51800f = i11;
            this.f51801g = c8735e;
            this.f51802h = cls;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: a */
        public final Class<DataT> mo6269a() {
            return this.f51802h;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: b */
        public final void mo6272b() {
            InterfaceC2097d<DataT> interfaceC2097d = this.f51804j;
            if (interfaceC2097d != null) {
                interfaceC2097d.mo6272b();
            }
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC2097d<DataT> m19285c() throws Throwable {
            InterfaceC10090o.a<DataT> aVarMo18920b;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            C8735e c8735e = this.f51801g;
            int i10 = this.f51800f;
            int i11 = this.f51799e;
            Context context = this.f51795a;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.f51798d;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, f51794k, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                aVarMo18920b = this.f51796b.mo18920b(file, i11, i10, c8735e);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                boolean z10 = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
                Uri requireOriginal = this.f51798d;
                if (z10) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                aVarMo18920b = this.f51797c.mo18920b(requireOriginal, i11, i10, c8735e);
            }
            if (aVarMo18920b != null) {
                return aVarMo18920b.f51181c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        public final void cancel() {
            this.f51803i = true;
            InterfaceC2097d<DataT> interfaceC2097d = this.f51804j;
            if (interfaceC2097d != null) {
                interfaceC2097d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: d */
        public final DataSource mo6274d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2097d
        /* JADX INFO: renamed from: e */
        public final void mo6275e(Priority priority, InterfaceC2097d.a<? super DataT> aVar) throws Throwable {
            try {
                InterfaceC2097d<DataT> interfaceC2097dM19285c = m19285c();
                if (interfaceC2097dM19285c == null) {
                    aVar.mo6277c(new IllegalArgumentException("Failed to build fetcher for: " + this.f51798d));
                } else {
                    this.f51804j = interfaceC2097dM19285c;
                    if (this.f51803i) {
                        cancel();
                    } else {
                        interfaceC2097dM19285c.mo6275e(priority, aVar);
                    }
                }
            } catch (FileNotFoundException e10) {
                aVar.mo6277c(e10);
            }
        }
    }

    public C10295d(Context context, InterfaceC10090o<File, DataT> interfaceC10090o, InterfaceC10090o<Uri, DataT> interfaceC10090o2, Class<DataT> cls) {
        this.f51788a = context.getApplicationContext();
        this.f51789b = interfaceC10090o;
        this.f51790c = interfaceC10090o2;
        this.f51791d = cls;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final boolean mo18919a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C8573r0.m16773z0(uri);
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a mo18920b(Uri uri, int i10, int i11, C8735e c8735e) {
        Uri uri2 = uri;
        return new InterfaceC10090o.a(new C7283d(uri2), new d(this.f51788a, this.f51789b, this.f51790c, uri2, i10, i11, c8735e, this.f51791d));
    }
}
