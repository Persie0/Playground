package p000;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amr {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f724a = 0;

    static {
        mws.m17102q((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);
    }

    /* JADX INFO: renamed from: a */
    public static int m966a(long j) {
        return (int) ((j / 1000) + 2082844800);
    }

    /* JADX INFO: renamed from: b */
    public static final ByteBuffer m967b(amy amyVar) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        if (acm.m205d(amyVar.f759a)) {
            byteBufferAllocate.put("vide".getBytes(mrd.f41463a));
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.put("VideoHandle".getBytes(mrd.f41463a));
        } else if (acm.m204c(amyVar.f759a)) {
            byteBufferAllocate.put("soun".getBytes(mrd.f41463a));
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.put("SoundHandle".getBytes(mrd.f41463a));
        } else {
            byteBufferAllocate.put("meta".getBytes(mrd.f41463a));
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.putInt(0);
            byteBufferAllocate.put("MetaHandle".getBytes(mrd.f41463a));
        }
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return acv.m242k("hdlr", byteBufferAllocate);
    }

    /* JADX INFO: renamed from: c */
    public static final ByteBuffer m968c(List list) {
        ByteBuffer byteBufferAllocate;
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(200);
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1;
            Object obj = list.get(i);
            if (obj instanceof String) {
                byte[] bytes = ((String) obj).getBytes(mrd.f41463a);
                byteBufferAllocate = ByteBuffer.allocate(bytes.length + 8);
                byteBufferAllocate.putInt(1);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.put(bytes);
            } else {
                if (!(obj instanceof Float)) {
                    throw new IllegalArgumentException("Unknown metadata type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
                }
                byteBufferAllocate = ByteBuffer.allocate(12);
                byteBufferAllocate.putInt(23);
                byteBufferAllocate.putInt(0);
                byteBufferAllocate.putFloat(((Float) obj).floatValue());
            }
            byteBufferAllocate.flip();
            ByteBuffer byteBufferM242k = acv.m242k("data", byteBufferAllocate);
            byteBufferAllocate2.putInt(byteBufferM242k.remaining() + 8);
            byteBufferAllocate2.putInt(i2);
            byteBufferAllocate2.put(byteBufferM242k);
            i = i2;
        }
        byteBufferAllocate2.flip();
        return acv.m242k("ilst", byteBufferAllocate2);
    }

    /* JADX INFO: renamed from: d */
    public static final ByteBuffer m969d(int i, int i2, long j, int i3, MediaFormat mediaFormat) {
        byte[] bArr;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(7);
        byteBufferAllocate.putInt(m966a(j));
        byteBufferAllocate.putInt(m966a(j));
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 256);
        byteBufferAllocate.putShort((short) 0);
        switch (i3) {
            case 0:
                bArr = new byte[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0};
                break;
            case 90:
                bArr = new byte[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0};
                break;
            case 180:
                bArr = new byte[]{-1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0};
                break;
            case 270:
                bArr = new byte[]{0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0};
                break;
            default:
                throw new IllegalArgumentException("invalid orientation " + i3);
        }
        byteBufferAllocate.put(bArr);
        int integer = mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : 0;
        int integer2 = mediaFormat.containsKey("height") ? mediaFormat.getInteger("height") : 0;
        byteBufferAllocate.putInt(integer << 16);
        byteBufferAllocate.putInt(integer2 << 16);
        byteBufferAllocate.flip();
        return acv.m242k("tkhd", byteBufferAllocate);
    }
}
