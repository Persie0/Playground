package p500y5;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import java.io.InputStream;
import p236l6.C7283d;
import p338qd.C8573r0;
import p356r5.C8735e;
import p380s5.C8963a;
import p474x5.C10094s;
import p474x5.InterfaceC10090o;
import p474x5.InterfaceC10091p;

/* JADX INFO: renamed from: y5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10294c implements InterfaceC10090o<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    public final Context f51786a;

    /* JADX INFO: renamed from: y5.c$a */
    public static class a implements InterfaceC10091p<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Context f51787a;

        public a(Context context) {
            this.f51787a = context;
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, InputStream> mo18922c(C10094s c10094s) {
            return new C10294c(this.f51787a);
        }
    }

    public C10294c(Context context) {
        this.f51786a = context.getApplicationContext();
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final boolean mo18919a(Uri uri) {
        Uri uri2 = uri;
        return C8573r0.m16773z0(uri2) && uri2.getPathSegments().contains("video");
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a<InputStream> mo18920b(Uri uri, int i10, int i11, C8735e c8735e) {
        Uri uri2 = uri;
        boolean z10 = true;
        if (i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384) {
            Long l10 = (Long) c8735e.m16963c(VideoDecoder.f10815d);
            if (l10 == null || l10.longValue() != -1) {
                z10 = false;
            }
            if (z10) {
                C7283d c7283d = new C7283d(uri2);
                Context context = this.f51786a;
                return new InterfaceC10090o.a<>(c7283d, C8963a.m17188c(context, uri2, new C8963a.b(context.getContentResolver())));
            }
        }
        return null;
    }
}
