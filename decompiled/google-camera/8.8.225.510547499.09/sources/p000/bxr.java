package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bxr implements bqp {

    /* JADX INFO: renamed from: a */
    private final ByteBuffer f4720a = ByteBuffer.allocate(4);

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4721b;

    public bxr(int i, byte[] bArr) {
        this.f4721b = i;
    }

    public bxr(int i) {
        this.f4721b = i;
    }

    @Override // p000.bqp
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo2923a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f4721b) {
            case 0:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f4720a) {
                    this.f4720a.position(0);
                    messageDigest.update(this.f4720a.putInt(num.intValue()).array());
                    break;
                }
                return;
            default:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f4720a) {
                    this.f4720a.position(0);
                    messageDigest.update(this.f4720a.putLong(l.longValue()).array());
                    break;
                }
                return;
        }
    }
}
