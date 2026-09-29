package p241le;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: le.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7330e {

    /* JADX INFO: renamed from: a */
    public static final AtomicLong f41040a = new AtomicLong(0);

    /* JADX INFO: renamed from: b */
    public static String f41041b;

    public C7330e(C7331e0 c7331e0) {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArrM14744a = m14744a(time % 1000);
        byte[] bArrM14744a2 = m14744a(f41040a.incrementAndGet());
        byte[] bArrM14744a3 = m14744a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {bArrArray[0], bArrArray[1], bArrArray[2], bArrArray[3], bArrM14744a[0], bArrM14744a[1], bArrM14744a2[0], bArrM14744a2[1], bArrM14744a3[0], bArrM14744a3[1]};
        String strM9159k = CommonUtils.m9159k(c7331e0.m14747c());
        String strM9156h = CommonUtils.m9156h(bArr);
        Locale locale = Locale.US;
        f41041b = String.format(locale, "%s%s%s%s", strM9156h.substring(0, 12), strM9156h.substring(12, 16), strM9156h.subSequence(16, 20), strM9159k.substring(0, 12)).toUpperCase(locale);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m14744a(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j10);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return f41041b;
    }
}
