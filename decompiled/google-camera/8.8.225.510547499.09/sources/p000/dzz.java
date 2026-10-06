package p000;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzz implements dzv {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f13029a;

    public dzz(int i) {
        this.f13029a = i;
    }

    @Override // p000.dzv
    /* JADX INFO: renamed from: a */
    public final ByteArrayOutputStream mo6976a(Bitmap bitmap) {
        switch (this.f13029a) {
            case 0:
                ByteArrayOutputStream byteArrayOutputStreamM7076b = ebr.m7076b();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
                bitmap.copyPixelsToBuffer(byteBufferAllocate);
                byte[] bArrArray = byteBufferAllocate.array();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStreamM7076b);
                try {
                    try {
                        dataOutputStream.writeInt(bArrArray.length);
                        dataOutputStream.writeInt(bitmap.getWidth());
                        dataOutputStream.writeInt(bitmap.getHeight());
                        dataOutputStream.writeUTF(bitmap.getConfig().toString());
                        dataOutputStream.write(bArrArray);
                        dataOutputStream.close();
                        return byteArrayOutputStreamM7076b;
                    } catch (IOException e) {
                        throw new IOException("Could not write into ByteArrayOutputStream", e);
                    }
                } catch (Throwable th) {
                    dataOutputStream.close();
                    throw th;
                }
            default:
                ByteArrayOutputStream byteArrayOutputStreamM7076b2 = ebr.m7076b();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStreamM7076b2);
                return byteArrayOutputStreamM7076b2;
        }
    }
}
