package p500y5;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p236l6.C7283d;
import p338qd.C8573r0;
import p356r5.C8735e;
import p380s5.C8963a;
import p474x5.C10094s;
import p474x5.InterfaceC10090o;
import p474x5.InterfaceC10091p;

/* JADX INFO: renamed from: y5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10293b implements InterfaceC10090o<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    public final Context f51784a;

    /* JADX INFO: renamed from: y5.b$a */
    public static class a implements InterfaceC10091p<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Context f51785a;

        public a(Context context) {
            this.f51785a = context;
        }

        @Override // p474x5.InterfaceC10091p
        /* JADX INFO: renamed from: c */
        public final InterfaceC10090o<Uri, InputStream> mo18922c(C10094s c10094s) {
            return new C10293b(this.f51785a);
        }
    }

    public C10293b(Context context) {
        this.f51784a = context.getApplicationContext();
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: a */
    public final boolean mo18919a(Uri uri) {
        Uri uri2 = uri;
        return C8573r0.m16773z0(uri2) && !uri2.getPathSegments().contains("video");
    }

    @Override // p474x5.InterfaceC10090o
    /* JADX INFO: renamed from: b */
    public final InterfaceC10090o.a<InputStream> mo18920b(Uri uri, int i10, int i11, C8735e c8735e) {
        Uri uri2 = uri;
        if (!(i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384)) {
            return null;
        }
        C7283d c7283d = new C7283d(uri2);
        Context context = this.f51784a;
        return new InterfaceC10090o.a<>(c7283d, C8963a.m17188c(context, uri2, new C8963a.a(context.getContentResolver())));
    }
}
