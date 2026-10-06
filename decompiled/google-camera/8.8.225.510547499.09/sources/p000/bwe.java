package p000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwe implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    private final bxh f4642a = bxh.m3154a();

    /* JADX INFO: renamed from: b */
    private final int f4643b;

    /* JADX INFO: renamed from: c */
    private final int f4644c;

    /* JADX INFO: renamed from: d */
    private final bqe f4645d;

    /* JADX INFO: renamed from: e */
    private final bwy f4646e;

    /* JADX INFO: renamed from: f */
    private final boolean f4647f;

    /* JADX INFO: renamed from: g */
    private final bqs f4648g;

    public bwe(int i, int i2, bqr bqrVar) {
        this.f4643b = i;
        this.f4644c = i2;
        this.f4645d = (bqe) bqrVar.m2927b(bxb.f4677a);
        this.f4646e = (bwy) bqrVar.m2927b(bwy.f4673f);
        boolean z = false;
        if (bqrVar.m2927b(bxb.f4680d) != null && ((Boolean) bqrVar.m2927b(bxb.f4680d)).booleanValue()) {
            z = true;
        }
        this.f4647f = z;
        this.f4648g = (bqs) bqrVar.m2927b(bxb.f4678b);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f4642a.m3156b(this.f4643b, this.f4644c, this.f4647f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f4645d == bqe.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new bwd());
        Size size = imageInfo.getSize();
        int width = this.f4643b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f4644c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fMo3139a = this.f4646e.mo3139a(size.getWidth(), size.getHeight(), width, height);
        imageDecoder.setTargetSize(Math.round(size.getWidth() * fMo3139a), Math.round(fMo3139a * size.getHeight()));
        bqs bqsVar = this.f4648g;
        if (bqsVar != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((bqsVar == bqs.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
