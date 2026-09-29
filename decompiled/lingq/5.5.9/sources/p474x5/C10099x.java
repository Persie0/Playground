package p474x5;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.C2094a;
import com.bumptech.glide.load.data.C2102i;
import com.bumptech.glide.load.data.C2107n;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p236l6.C7283d;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.x */
/* JADX INFO: loaded from: classes.dex */
public final class C10099x<Data> implements InterfaceC10090o<Uri, Data> {

    /* JADX INFO: renamed from: b */
    public static final Set<String> f51217b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* JADX INFO: renamed from: a */
    public final c<Data> f51218a;

    /* JADX INFO: renamed from: x5.x$a */
    public static final class a implements InterfaceC10091p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f51219a;

        public a(ContentResolver contentResolver) {
            this.f51219a = contentResolver;
        }

        @Override // p474x5.C10099x.c
        /* JADX INFO: renamed from: a */
        public final InterfaceC2097d<AssetFileDescriptor> mo18944a(Uri uri) {
            return new C2094a(this.f51219a, uri);
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, AssetFileDescriptor> mo18922c(C10094s c10094s) {
            return new C10099x(this);
        }
    }

    /* JADX INFO: renamed from: x5.x$b */
    public static class b implements InterfaceC10091p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f51220a;

        public b(ContentResolver contentResolver) {
            this.f51220a = contentResolver;
        }

        @Override // p474x5.C10099x.c
        /* JADX INFO: renamed from: a */
        public final InterfaceC2097d<ParcelFileDescriptor> mo18944a(Uri uri) {
            return new C2102i(this.f51220a, uri);
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, ParcelFileDescriptor> mo18922c(C10094s c10094s) {
            return new C10099x(this);
        }
    }

    /* JADX INFO: renamed from: x5.x$c */
    public interface c<Data> {
        /* JADX INFO: renamed from: a */
        InterfaceC2097d<Data> mo18944a(Uri uri);
    }

    /* JADX INFO: renamed from: x5.x$d */
    public static class d implements InterfaceC10091p<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f51221a;

        public d(ContentResolver contentResolver) {
            this.f51221a = contentResolver;
        }

        @Override // p474x5.C10099x.c
        /* JADX INFO: renamed from: a */
        public final InterfaceC2097d<InputStream> mo18944a(Uri uri) {
            return new C2107n(this.f51221a, uri);
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, InputStream> mo18922c(C10094s c10094s) {
            return new C10099x(this);
        }
    }

    public C10099x(c<Data> cVar) {
        this.f51218a = cVar;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final boolean mo18919a(Uri uri) {
        return f51217b.contains(uri.getScheme());
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a mo18920b(Uri uri, int i10, int i11, C8735e c8735e) {
        Uri uri2 = uri;
        return new InterfaceC10090o.a(new C7283d(uri2), this.f51218a.mo18944a(uri2));
    }
}
