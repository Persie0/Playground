package p525z5;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C2140a;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import p007a6.C0039r;
import p356r5.C8734d;
import p356r5.C8735e;

/* JADX INFO: renamed from: z5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10443b implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    public final C0039r f52284a;

    /* JADX INFO: renamed from: b */
    public final int f52285b;

    /* JADX INFO: renamed from: c */
    public final int f52286c;

    /* JADX INFO: renamed from: d */
    public final DecodeFormat f52287d;

    /* JADX INFO: renamed from: e */
    public final DownsampleStrategy f52288e;

    /* JADX INFO: renamed from: f */
    public final boolean f52289f;

    /* JADX INFO: renamed from: g */
    public final PreferredColorSpace f52290g;

    /* JADX INFO: renamed from: z5.b$a */
    public class a implements ImageDecoder.OnPartialImageListener {
        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C10443b(int i10, int i11, C8735e c8735e) {
        if (C0039r.f38j == null) {
            synchronized (C0039r.class) {
                if (C0039r.f38j == null) {
                    C0039r.f38j = new C0039r();
                }
            }
        }
        this.f52284a = C0039r.f38j;
        this.f52285b = i10;
        this.f52286c = i11;
        this.f52287d = (DecodeFormat) c8735e.m16963c(C2140a.f10824f);
        this.f52288e = (DownsampleStrategy) c8735e.m16963c(DownsampleStrategy.f10807f);
        C8734d<Boolean> c8734d = C2140a.f10827i;
        this.f52289f = c8735e.m16963c(c8734d) != null && ((Boolean) c8735e.m16963c(c8734d)).booleanValue();
        this.f52290g = (PreferredColorSpace) c8735e.m16963c(C2140a.f10825g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z10 = false;
        if (this.f52284a.m169a(this.f52285b, this.f52286c, this.f52289f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f52287d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f52285b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f52286c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fMo6341b = this.f52288e.mo6341b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fMo6341b);
        int iRound2 = Math.round(size.getHeight() * fMo6341b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fMo6341b);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        PreferredColorSpace preferredColorSpace = this.f52290g;
        if (preferredColorSpace != null) {
            if (Build.VERSION.SDK_INT < 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                return;
            }
            if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z10 = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z10 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
