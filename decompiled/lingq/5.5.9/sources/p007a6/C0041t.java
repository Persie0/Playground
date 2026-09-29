package p007a6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
import p042c6.AbstractC1731c;
import p042c6.C1733e;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: a6.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0041t implements InterfaceC8736f<Uri, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C1733e f47a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9452c f48b;

    public C0041t(C1733e c1733e, InterfaceC9452c interfaceC9452c) {
        this.f47a = c1733e;
        this.f48b = interfaceC9452c;
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m<Bitmap> mo68a(Uri uri, int i10, int i11, C8735e c8735e) throws IOException {
        InterfaceC9207m interfaceC9207mM5471c = this.f47a.m5471c(uri, c8735e);
        if (interfaceC9207mM5471c == null) {
            return null;
        }
        return C0035n.m163a(this.f48b, (Drawable) ((AbstractC1731c) interfaceC9207mM5471c).get(), i10, i11);
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final boolean mo69b(Uri uri, C8735e c8735e) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }
}
