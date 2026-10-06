package p000;

import android.util.Log;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.YuvWriteView;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nsz {

    /* JADX INFO: renamed from: a */
    private static final String f44462a = nsz.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public final mrm m17648a(kpw kpwVar) {
        int i;
        int i2;
        int i3;
        int iMo7245a = kpwVar.mo7245a();
        List listMo7251g = kpwVar.mo7251g();
        if (iMo7245a != 257 && iMo7245a != 4098 && iMo7245a != 4099) {
            Log.e(f44462a, "Unsupported PD format: " + iMo7245a);
            return mqu.f41450a;
        }
        lku.m15672z(listMo7251g.size() == 1, "Should have a single PD plane, has: %s", listMo7251g.size());
        ByteBuffer buffer = ((kpv) listMo7251g.get(0)).getBuffer();
        int iRemaining = buffer.remaining();
        if (iMo7245a == 257) {
            if (iRemaining % 8064 != 0) {
                Log.e(f44462a, "The row stride in bytes (8064) should evenly divide the PD buffer capacity (" + iRemaining + IuyLAqNmW.mNNvYkfvW);
                return mqu.f41450a;
            }
            i = iRemaining / 8064;
            i2 = 2016;
            if (i != 756 && i != 758) {
                Log.e(f44462a, "The inferred PD data height for DEPTH_POINT_CLOUD formatted Images should be one of 756 or 758, but is " + i);
                return mqu.f41450a;
            }
            i3 = 4032;
        } else {
            if (iMo7245a == 4099) {
                return mrm.m16829i(m17649b(kpwVar));
            }
            lku.m15670x(kpwVar.mo7247c() % 2 == 0, "Image width should be divisible by the number of channels.");
            int pixelStride = ((kpv) listMo7251g.get(0)).getPixelStride();
            lku.m15670x(pixelStride == 2, "Pixel stride should be two bytes.");
            int iMo7247c = kpwVar.mo7247c() / 2;
            int iMo7246b = kpwVar.mo7246b();
            int rowStride = ((kpv) listMo7251g.get(0)).getRowStride();
            int i4 = rowStride / 2;
            int i5 = (iMo7247c + iMo7247c) * pixelStride;
            lku.m15608C(rowStride >= i5, "The row stride (%s bytes) should be greater than or equal to the width (%s bytes)", rowStride, i5);
            lku.m15611F(iRemaining == rowStride * iMo7246b, "The buffer capacity (%s) should be equal to the row stride in bytes (%s) multiplied by the height (%s).", Integer.valueOf(iRemaining), Integer.valueOf(rowStride), Integer.valueOf(iMo7246b));
            i = iMo7246b;
            i2 = iMo7247c;
            i3 = i4;
        }
        return mrm.m16829i(new RawWriteView(i2 + i2, i, i3, nrz.f44326b, new nsd(BufferUtils.m4902a(buffer))));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX INFO: renamed from: b */
    public final RawWriteView m17649b(kpw kpwVar) {
        boolean z;
        boolean z2;
        nrz nrzVar;
        int i;
        int iMo7247c = kpwVar.mo7247c();
        int iMo7246b = kpwVar.mo7246b();
        int iMo7245a = kpwVar.mo7245a();
        List listMo7251g = kpwVar.mo7251g();
        int pixelStride = ((kpv) listMo7251g.get(0)).getPixelStride();
        int rowStride = ((kpv) listMo7251g.get(0)).getRowStride();
        lku.m15672z(m17651d(iMo7245a), "Unsupported raw format: %s. Should must be a compatible image format.", iMo7245a);
        lku.m15608C(iMo7247c % 2 == 0 && iMo7246b % 2 == 0, "Should have even dimensions, but was: %sx%s", iMo7247c, iMo7246b);
        lku.m15672z(listMo7251g.size() == 1, "Should have a single RAW_SENSOR plane, has: %s", listMo7251g.size());
        if (iMo7245a == 32) {
            lku.m15672z(pixelStride == 2, "Unexpected RAW_SENSOR pixel stride: %s", pixelStride);
        } else if (iMo7245a == 37) {
            if (iMo7247c % 4 == 0) {
                z = true;
            } else {
                z = false;
            }
            lku.m15608C(z, "RAW10 image width should be divisible by 4, but was: %sx%s", iMo7247c, iMo7246b);
            if (pixelStride == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            lku.m15672z(z2, "Unexpected RAW10 pixel stride: %s", pixelStride);
            int i2 = (iMo7247c * 5) / 4;
            lku.m15608C(rowStride >= i2, "RAW10 row stride %s should be at least %s", rowStride, i2);
        } else if (iMo7245a == 4099) {
            iMo7245a = 4099;
            if (iMo7247c % 4 == 0) {
                z = true;
            } else {
                z = false;
            }
            lku.m15608C(z, "RAW10 image width should be divisible by 4, but was: %sx%s", iMo7247c, iMo7246b);
            if (pixelStride == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            lku.m15672z(z2, "Unexpected RAW10 pixel stride: %s", pixelStride);
            int i3 = (iMo7247c * 5) / 4;
            lku.m15608C(rowStride >= i3, "RAW10 row stride %s should be at least %s", rowStride, i3);
        }
        nsd nsdVar = new nsd(BufferUtils.m4902a(((kpv) listMo7251g.get(0)).getBuffer()));
        if (iMo7245a == 37 || iMo7245a == 4099) {
            nrzVar = nrz.f44325a;
            i = rowStride;
        } else {
            nrzVar = nrz.f44326b;
            i = rowStride / 2;
        }
        return new RawWriteView(iMo7247c, iMo7246b, i, nrzVar, nsdVar);
    }

    /* JADX INFO: renamed from: c */
    public final YuvWriteView m17650c(kpw kpwVar) {
        int iMo7247c = kpwVar.mo7247c();
        int iMo7246b = kpwVar.mo7246b();
        int iMo7247c2 = kpwVar.mo7247c() % 2;
        int iMo7246b2 = kpwVar.mo7246b();
        lku.m15670x(iMo7247c2 == 0, "A YUV image must have even width.");
        lku.m15670x(iMo7246b2 % 2 == 0, "A YUV image must have even height.");
        lku.m15670x(kpwVar.mo7245a() == 35, "Format is not YUV_420_888");
        List listMo7251g = kpwVar.mo7251g();
        lku.m15672z(listMo7251g.size() == 3, "A YUV image must have %s planes.", 3);
        kpv kpvVar = (kpv) listMo7251g.get(0);
        kpv kpvVar2 = (kpv) listMo7251g.get(1);
        kpv kpvVar3 = (kpv) listMo7251g.get(2);
        long jM4902a = BufferUtils.m4902a(kpvVar.getBuffer());
        long jM4902a2 = BufferUtils.m4902a(kpvVar2.getBuffer());
        long jM4902a3 = BufferUtils.m4902a(kpvVar3.getBuffer());
        lku.m15670x(kpvVar.getPixelStride() == 1, "Y plane's pixel stride is not 1");
        lku.m15670x(kpvVar.getRowStride() >= kpwVar.mo7247c(), "Y plane's row stride smaller than image width");
        lku.m15670x(kpvVar2.getRowStride() >= kpwVar.mo7247c(), "U plane's row stride smaller than image width");
        lku.m15670x(kpvVar2.getRowStride() == kpvVar3.getRowStride(), "U and V planes have different row strides");
        lku.m15670x(jM4902a != 0, "luma plane address cannot be 0 (NULL).");
        lku.m15670x(jM4902a2 != 0, "chroma U plane address cannot be 0 (NULL).");
        lku.m15670x(jM4902a3 != 0, "chroma V plane address cannot be 0 (NULL).");
        lku.m15670x(kpvVar2.getPixelStride() == 2 && kpvVar3.getPixelStride() == 2 && Math.abs(jM4902a2 - jM4902a3) == 1, "UV planes not tightly interleaved");
        nsh nshVar = jM4902a2 < jM4902a3 ? nsh.f44394b : nsh.f44395c;
        List listMo7251g2 = kpwVar.mo7251g();
        nsd nsdVar = new nsd(BufferUtils.m4902a(((kpv) listMo7251g2.get(0)).getBuffer()));
        int i = nshVar == nsh.f44394b ? 1 : 2;
        nsd nsdVar2 = new nsd(BufferUtils.m4902a(((kpv) listMo7251g2.get(i)).getBuffer()));
        return new YuvWriteView(GcamModuleJNI.new_YuvWriteView__SWIG_2(iMo7247c, iMo7246b, ((kpv) listMo7251g2.get(0)).getRowStride(), nsd.m17642a(nsdVar), iMo7247c / 2, iMo7246b / 2, ((kpv) listMo7251g2.get(i)).getRowStride(), nsd.m17642a(nsdVar2), nshVar.f44398d));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17651d(int i) {
        return i == 37 || i == 32 || i == 4099;
    }
}
