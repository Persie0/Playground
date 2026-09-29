package p000;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class bl0 {

    /* JADX INFO: renamed from: b */
    public static final String f8651b = pb1.m19028P(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: c */
    public static final AtomicLong f8652c = new AtomicLong(0);

    /* JADX INFO: renamed from: a */
    public final String f8653a;

    public bl0() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b = bArrArray[0];
        byte b2 = bArrArray[1];
        byte b3 = bArrArray[2];
        byte b4 = bArrArray[3];
        byte[] bArrM3815a = m3815a(time % 1000);
        byte b5 = bArrM3815a[0];
        byte b6 = bArrM3815a[1];
        byte[] bArrM3815a2 = m3815a(f8652c.incrementAndGet());
        byte b7 = bArrM3815a2[0];
        byte b8 = bArrM3815a2[1];
        byte[] bArrM3815a3 = m3815a(Integer.valueOf(Process.myPid()).shortValue());
        String strM19017E = pb1.m19017E(new byte[]{b, b2, b3, b4, b5, b6, b7, b8, bArrM3815a3[0], bArrM3815a3[1]});
        Locale locale = Locale.US;
        this.f8653a = String.format(locale, "%s%s%s%s", strM19017E.substring(0, 12), strM19017E.substring(12, 16), strM19017E.subSequence(16, 20), f8651b.substring(0, 12)).toUpperCase(locale);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m3815a(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.f8653a;
    }
}
