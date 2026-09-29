package p474x5;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.data.C2101h;
import com.bumptech.glide.load.data.C2106m;
import com.bumptech.glide.load.data.InterfaceC2097d;
import java.io.InputStream;
import p236l6.C7283d;
import p356r5.C8735e;

/* JADX INFO: renamed from: x5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10076a<Data> implements InterfaceC10090o<Uri, Data> {

    /* JADX INFO: renamed from: a */
    public final AssetManager f51128a;

    /* JADX INFO: renamed from: b */
    public final a<Data> f51129b;

    /* JADX INFO: renamed from: x5.a$a */
    public interface a<Data> {
        /* JADX INFO: renamed from: a */
        InterfaceC2097d<Data> mo18921a(AssetManager assetManager, String str);
    }

    /* JADX INFO: renamed from: x5.a$b */
    public static class b implements InterfaceC10091p<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final AssetManager f51130a;

        public b(AssetManager assetManager) {
            this.f51130a = assetManager;
        }

        @Override // p474x5.C10076a.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC2097d<AssetFileDescriptor> mo18921a(AssetManager assetManager, String str) {
            return new C2101h(assetManager, str);
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, AssetFileDescriptor> mo18922c(C10094s c10094s) {
            return new C10076a(this.f51130a, this);
        }
    }

    /* JADX INFO: renamed from: x5.a$c */
    public static class c implements InterfaceC10091p<Uri, InputStream>, a<InputStream> {

        /* JADX INFO: renamed from: a */
        public final AssetManager f51131a;

        public c(AssetManager assetManager) {
            this.f51131a = assetManager;
        }

        @Override // p474x5.C10076a.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC2097d<InputStream> mo18921a(AssetManager assetManager, String str) {
            return new C2106m(assetManager, str);
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, InputStream> mo18922c(C10094s c10094s) {
            return new C10076a(this.f51131a, this);
        }
    }

    public C10076a(AssetManager assetManager, a<Data> aVar) {
        this.f51128a = assetManager;
        this.f51129b = aVar;
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final boolean mo18919a(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a mo18920b(Uri uri, int i10, int i11, C8735e c8735e) {
        Uri uri2 = uri;
        return new InterfaceC10090o.a(new C7283d(uri2), this.f51129b.mo18921a(this.f51128a, uri2.toString().substring(22)));
    }
}
