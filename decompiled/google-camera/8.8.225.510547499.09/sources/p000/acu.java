package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class acu {
    /* JADX INFO: renamed from: a */
    public static int m226a(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* JADX INFO: renamed from: b */
    static Drawable m227b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    /* JADX INFO: renamed from: c */
    static Drawable m228c(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    /* JADX INFO: renamed from: d */
    public static void m229d(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m230e(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* JADX INFO: renamed from: f */
    public static final ByteBuffer m231f(MediaFormat mediaFormat) {
        switch (mediaFormat.getString("mime")) {
            case "audio/mp4a-latm":
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(mediaFormat.getByteBuffer("csd-0").limit() + 200);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.putShort((short) 0);
                byteBufferAllocate.putShort((short) 1);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.putShort((short) mediaFormat.getInteger("channel-count"));
                byteBufferAllocate.putShort((short) 16);
                byteBufferAllocate.putShort((short) 0);
                byteBufferAllocate.putShort((short) 0);
                byteBufferAllocate.putInt(mediaFormat.getInteger("sample-rate") << 16);
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                int iLimit = byteBuffer.limit();
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iLimit + 200);
                byteBufferAllocate2.putInt(0);
                byteBufferAllocate2.put((byte) 3);
                lku.m15670x(iLimit + 21 < 127, "CSD too long; we might need variable-length encoding?");
                byteBufferAllocate2.put((byte) (iLimit + 23));
                byteBufferAllocate2.putShort((short) 0);
                byteBufferAllocate2.put((byte) 0);
                byteBufferAllocate2.put((byte) 4);
                byteBufferAllocate2.put((byte) (iLimit + 15));
                byteBufferAllocate2.put((byte) 64);
                byteBufferAllocate2.put((byte) 21);
                byteBufferAllocate2.putShort((short) 3);
                byteBufferAllocate2.put((byte) 0);
                byteBufferAllocate2.putInt(mediaFormat.getInteger("max-bitrate"));
                byteBufferAllocate2.putInt(mediaFormat.getInteger("bitrate"));
                byteBufferAllocate2.put((byte) 5);
                byteBufferAllocate2.put((byte) iLimit);
                byteBufferAllocate2.put(byteBuffer);
                byteBuffer.rewind();
                byteBufferAllocate2.put((byte) 6);
                byteBufferAllocate2.put((byte) 1);
                byteBufferAllocate2.put((byte) 2);
                byteBufferAllocate2.flip();
                byteBufferAllocate.put(acv.m242k("esds", byteBufferAllocate2));
                byteBufferAllocate.flip();
                return acv.m242k("mp4a", byteBufferAllocate);
            default:
                throw new UnsupportedOperationException("Unsupported audio format: ".concat(String.valueOf(mediaFormat.getString("mime"))));
        }
    }
}
