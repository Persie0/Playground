package p042c6;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.p017ui.platform.C0653p1;
import com.bumptech.glide.load.C2092a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p007a6.C0024c;
import p258m6.C7481a;
import p258m6.C7492l;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9451b;
import p525z5.C10443b;

/* JADX INFO: renamed from: c6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1729a {

    /* JADX INFO: renamed from: a */
    public final List<ImageHeaderParser> f9571a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9451b f9572b;

    /* JADX INFO: renamed from: c6.a$a */
    public static final class a implements InterfaceC9207m<Drawable> {

        /* JADX INFO: renamed from: a */
        public final AnimatedImageDrawable f9573a;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f9573a = animatedImageDrawable;
        }

        @Override // p392t5.InterfaceC9207m
        /* JADX INFO: renamed from: b */
        public final void mo157b() {
            AnimatedImageDrawable animatedImageDrawable = this.f9573a;
            animatedImageDrawable.stop();
            animatedImageDrawable.clearAnimationCallbacks();
        }

        @Override // p392t5.InterfaceC9207m
        /* JADX INFO: renamed from: c */
        public final int mo158c() {
            AnimatedImageDrawable animatedImageDrawable = this.f9573a;
            int intrinsicHeight = animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            char[] cArr = C7492l.f41383a;
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            int i10 = C7492l.a.f41386a[config.ordinal()];
            int i11 = 1;
            if (i10 != 1) {
                if (i10 == 2 || i10 == 3) {
                    i11 = 2;
                } else {
                    i11 = 4;
                    if (i10 == 4) {
                        i11 = 8;
                    }
                }
            }
            return i11 * intrinsicHeight * 2;
        }

        @Override // p392t5.InterfaceC9207m
        /* JADX INFO: renamed from: d */
        public final Class<Drawable> mo159d() {
            return Drawable.class;
        }

        @Override // p392t5.InterfaceC9207m
        public final Drawable get() {
            return this.f9573a;
        }
    }

    /* JADX INFO: renamed from: c6.a$b */
    public static final class b implements InterfaceC8736f<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: a */
        public final C1729a f9574a;

        public b(C1729a c1729a) {
            this.f9574a = c1729a;
        }

        @Override // p356r5.InterfaceC8736f
        /* JADX INFO: renamed from: a */
        public final InterfaceC9207m<Drawable> mo68a(ByteBuffer byteBuffer, int i10, int i11, C8735e c8735e) throws IOException {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(byteBuffer);
            this.f9574a.getClass();
            return C1729a.m5468a(sourceCreateSource, i10, i11, c8735e);
        }

        @Override // p356r5.InterfaceC8736f
        /* JADX INFO: renamed from: b */
        public final boolean mo69b(ByteBuffer byteBuffer, C8735e c8735e) throws IOException {
            ImageHeaderParser.ImageType imageTypeM6266b = C2092a.m6266b(this.f9574a.f9571a, byteBuffer);
            return imageTypeM6266b == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageTypeM6266b == ImageHeaderParser.ImageType.ANIMATED_AVIF);
        }
    }

    /* JADX INFO: renamed from: c6.a$c */
    public static final class c implements InterfaceC8736f<InputStream, Drawable> {

        /* JADX INFO: renamed from: a */
        public final C1729a f9575a;

        public c(C1729a c1729a) {
            this.f9575a = c1729a;
        }

        @Override // p356r5.InterfaceC8736f
        /* JADX INFO: renamed from: a */
        public final InterfaceC9207m<Drawable> mo68a(InputStream inputStream, int i10, int i11, C8735e c8735e) throws IOException {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(C7481a.m14865b(inputStream));
            this.f9575a.getClass();
            return C1729a.m5468a(sourceCreateSource, i10, i11, c8735e);
        }

        @Override // p356r5.InterfaceC8736f
        /* JADX INFO: renamed from: b */
        public final boolean mo69b(InputStream inputStream, C8735e c8735e) throws IOException {
            C1729a c1729a = this.f9575a;
            ImageHeaderParser.ImageType imageTypeM6267c = C2092a.m6267c(c1729a.f9572b, inputStream, c1729a.f9571a);
            return imageTypeM6267c == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageTypeM6267c == ImageHeaderParser.ImageType.ANIMATED_AVIF);
        }
    }

    public C1729a(List<ImageHeaderParser> list, InterfaceC9451b interfaceC9451b) {
        this.f9571a = list;
        this.f9572b = interfaceC9451b;
    }

    /* JADX INFO: renamed from: a */
    public static a m5468a(ImageDecoder.Source source, int i10, int i11, C8735e c8735e) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C10443b(i10, i11, c8735e));
        if (C0653p1.m2451y(drawableDecodeDrawable)) {
            return new a(C0024c.m85j(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }
}
