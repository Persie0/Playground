package p000;

import androidx.compose.runtime.internal.C0282a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dtb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f36221a = new C0282a(987173513, false, new td1(5));

    /* JADX INFO: renamed from: b */
    public static final C0282a f36222b = new C0282a(-1230871767, false, new td1(6));

    /* JADX INFO: renamed from: c */
    public static final C0282a f36223c = new C0282a(1219601239, false, new sd1(6));

    /* JADX INFO: renamed from: d */
    public static final C0282a f36224d = new C0282a(129403337, false, new sd1(7));

    /* JADX INFO: renamed from: e */
    public static final C0282a f36225e = new C0282a(68194893, false, new sd1(8));

    /* JADX INFO: renamed from: a */
    public static ArrayList m10643a(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            try {
                byte b = byteBufferAsReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                if (((b >> 1) & 1) != 0) {
                    iRemaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b2 = byteBufferAsReadOnlyBuffer.get();
                        iRemaining |= (b2 & 127) << (i2 * 7);
                        if ((b2 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                }
                if (byteBufferAsReadOnlyBuffer.position() + iRemaining > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                arrayList.add(new tp6(i, byteBufferDuplicate));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }
}
