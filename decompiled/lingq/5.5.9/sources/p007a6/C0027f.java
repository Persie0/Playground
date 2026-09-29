package p007a6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;
import p407u5.C9453d;
import p525z5.C10443b;

/* JADX INFO: renamed from: a6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0027f implements InterfaceC8736f<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final C9453d f21a = new C9453d();

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC9207m<Bitmap> mo68a(ImageDecoder.Source source, int i10, int i11, C8735e c8735e) throws IOException {
        return m154c(C0024c.m83h(source), i10, i11, c8735e);
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo69b(ImageDecoder.Source source, C8735e c8735e) throws IOException {
        C0025d.m127x(source);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final C0028g m154c(ImageDecoder.Source source, int i10, int i11, C8735e c8735e) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C10443b(i10, i11, c8735e));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new C0028g(bitmapDecodeBitmap, this.f21a);
    }
}
