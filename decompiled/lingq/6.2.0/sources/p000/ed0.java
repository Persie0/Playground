package p000;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.C0713b;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ed0 extends o79 {

    /* JADX INFO: renamed from: n */
    public final Context f37030n;

    /* JADX INFO: renamed from: o */
    public final int f37031o;

    public ed0(Context context) {
        super(new m32[1], new dd0[1]);
        this.f37030n = context;
        this.f37031o = -1;
    }

    @Override // p000.o79
    /* JADX INFO: renamed from: g */
    public final m32 mo11041g() {
        return new m32(1);
    }

    @Override // p000.o79
    /* JADX INFO: renamed from: h */
    public final n32 mo11042h() {
        return new dd0(this);
    }

    @Override // p000.o79
    /* JADX INFO: renamed from: i */
    public final DecoderException mo11043i(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // p000.o79
    /* JADX INFO: renamed from: j */
    public final DecoderException mo11044j(m32 m32Var, n32 n32Var, boolean z) {
        dd0 dd0Var = (dd0) n32Var;
        ByteBuffer byteBuffer = m32Var.f50500e;
        byteBuffer.getClass();
        bna.m3987z(byteBuffer.hasArray());
        bna.m3969q(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f37031o;
            if (iMax == -1) {
                Context context = this.f37030n;
                if (context != null) {
                    Point pointM22820o = uma.m22820o(context);
                    int i = pointM22820o.x;
                    int i2 = pointM22820o.y;
                    C0713b c0713b = m32Var.f50498c;
                    if (c0713b != null) {
                        int i3 = c0713b.f6388N;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = c0713b.f6389O;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            dd0Var.f35416e = r4d.m20403b(byteBuffer.array(), byteBuffer.remaining(), iMax);
            dd0Var.f52260c = m32Var.f50502g;
            return null;
        } catch (ParserException e) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ImageDecoderException(e2);
        }
    }
}
