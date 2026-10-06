package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzl implements jyr {

    /* JADX INFO: renamed from: d */
    private static final Long f35298d = 4000L;

    /* JADX INFO: renamed from: a */
    public final double f35299a;

    /* JADX INFO: renamed from: e */
    private final jys f35302e;

    /* JADX INFO: renamed from: f */
    private final jzh f35303f;

    /* JADX INFO: renamed from: g */
    private final npu f35304g;

    /* JADX INFO: renamed from: h */
    private final jww f35305h;

    /* JADX INFO: renamed from: i */
    private final jxv f35306i;

    /* JADX INFO: renamed from: l */
    private kba f35309l;

    /* JADX INFO: renamed from: n */
    private long f35311n;

    /* JADX INFO: renamed from: p */
    private int f35313p;

    /* JADX INFO: renamed from: j */
    private final AtomicLong f35307j = new AtomicLong(0);

    /* JADX INFO: renamed from: k */
    private final Queue f35308k = new ArrayDeque(1000);

    /* JADX INFO: renamed from: b */
    public final Queue f35300b = new ArrayDeque();

    /* JADX INFO: renamed from: m */
    private final Deque f35310m = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public mrm f35301c = mqu.f41450a;

    /* JADX INFO: renamed from: o */
    private final Object f35312o = new Object();

    public jzl(jys jysVar, jzh jzhVar, jww jwwVar, jxv jxvVar) {
        this.f35302e = jysVar;
        this.f35303f = jzhVar;
        this.f35305h = jwwVar;
        double dM13669a = jxvVar.m13669a();
        double dM13671c = jxvVar.m13671c();
        Double.isNaN(dM13669a);
        Double.isNaN(dM13671c);
        this.f35299a = dM13669a / dM13671c;
        this.f35306i = jxvVar;
        this.f35304g = kxk.m15032y(jzn.m13824l("MEncOutput"));
        this.f35313p = 1;
    }

    /* JADX INFO: renamed from: e */
    private final long m13796e(long j) {
        double d = j;
        double d2 = this.f35299a;
        Double.isNaN(d);
        return (long) (d * d2);
    }

    /* JADX INFO: renamed from: a */
    public final void m13797a(long j, int i) {
        long j2;
        byte[] bArrM15908e;
        byte[] bArrM15908e2;
        byte[] bArrM15908e3;
        boolean z = false;
        while (!this.f35308k.isEmpty()) {
            long j3 = ((jzk) this.f35308k.peek()).f35296a;
            Long l = f35298d;
            l.longValue();
            if (j3 - 4000 > j) {
                break;
            }
            jzk jzkVar = (jzk) this.f35308k.poll();
            if (z) {
                Log.w("MetaEncoder", String.format("Multiple metadata (%d) found for video frame (%d)", Long.valueOf(jzkVar.f35296a), Long.valueOf(j)));
            } else {
                long j4 = jzkVar.f35296a;
                if (this.f35299a > 1.0d) {
                    l.longValue();
                    j2 = 8000;
                } else {
                    l.longValue();
                    j2 = 4000;
                }
                if (Math.abs(j4 - j) <= j2) {
                    byte[][] bArr = new byte[4][];
                    lrd lrdVar = (lrd) jzkVar.f35297b;
                    Object obj = lrdVar.f39060e;
                    if (obj == null) {
                        bArrM15908e = new byte[0];
                    } else {
                        if (!lrdVar.f39056a) {
                            lku.m15614I(((byte[]) obj).length < 256, "AF data too large.");
                        }
                        boolean z2 = lrdVar.f39056a;
                        bArrM15908e = lrd.m15908e((byte[]) lrdVar.f39060e, true != z2 ? (byte) 1 : (byte) 4, z2);
                    }
                    bArr[0] = bArrM15908e;
                    Object obj2 = lrdVar.f39057b;
                    if (obj2 == null) {
                        bArrM15908e2 = new byte[0];
                    } else {
                        if (!lrdVar.f39056a) {
                            lku.m15614I(((byte[]) obj2).length < 256, "AE data too large.");
                        }
                        boolean z3 = lrdVar.f39056a;
                        bArrM15908e2 = lrd.m15908e((byte[]) lrdVar.f39057b, true != z3 ? (byte) 2 : (byte) 5, z3);
                    }
                    bArr[1] = bArrM15908e2;
                    Object obj3 = lrdVar.f39059d;
                    if (obj3 == null) {
                        bArrM15908e3 = new byte[0];
                    } else {
                        if (!lrdVar.f39056a) {
                            lku.m15614I(((byte[]) obj3).length < 256, "AWB data too large.");
                        }
                        boolean z4 = lrdVar.f39056a;
                        bArrM15908e3 = lrd.m15908e((byte[]) lrdVar.f39059d, true != z4 ? (byte) 3 : (byte) 6, z4);
                    }
                    bArr[2] = bArrM15908e3;
                    Object obj4 = lrdVar.f39058c;
                    bArr[3] = obj4 == null ? new byte[0] : lrd.m15908e((byte[]) obj4, (byte) 7, true);
                    int length = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        length += bArr[i2].length;
                    }
                    byte[] bArr2 = new byte[length];
                    int i3 = 0;
                    for (int i4 = 0; i4 < 4; i4++) {
                        byte[] bArr3 = bArr[i4];
                        int length2 = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i3, length2);
                        i3 += length2;
                    }
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    bufferInfo.size = byteBufferWrap.remaining();
                    bufferInfo.offset = 0;
                    bufferInfo.presentationTimeUs = j;
                    if (this.f35306i.f35099c == jxn.FPS_30 && bufferInfo.size == 0) {
                        long j5 = jzkVar.f35296a;
                    }
                    this.f35302e.mo13732m(byteBufferWrap, bufferInfo, i);
                    z = true;
                } else {
                    Log.w("MetaEncoder", "Found one metadata (" + jzkVar.f35296a + ") that doesn't match with current video frame (" + j + ")");
                }
            }
        }
        if (z) {
            return;
        }
        Log.w("MetaEncoder", "No metadata found for video frame: " + j);
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: b */
    public final void mo5576b(long j) {
        synchronized (this.f35312o) {
            if (this.f35313p != 2) {
                Log.e("MetaEncoder", "It is not recording now");
            } else {
                this.f35313p = 5;
                this.f35310m.add(mzj.m17173c(Long.valueOf(m13796e(j))));
            }
        }
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: c */
    public final void mo5577c() {
        synchronized (this.f35312o) {
            if (this.f35313p == 4) {
                return;
            }
            kba kbaVar = this.f35309l;
            if (kbaVar != null) {
                kbaVar.close();
            }
            this.f35304g.shutdown();
            this.f35313p = 4;
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: d */
    public final void mo5578d(long j) {
        synchronized (this.f35312o) {
            if (this.f35313p != 5) {
                Log.e("MetaEncoder", "It is not paused now");
                return;
            }
            this.f35313p = 2;
            long jM13796e = m13796e(j);
            mzj mzjVar = (mzj) this.f35310m.removeLast();
            this.f35310m.add(mzj.m17175e((Long) mzjVar.m17180i(), Long.valueOf(jM13796e)));
            this.f35311n += jM13796e - ((Long) mzjVar.m17180i()).longValue();
        }
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: j */
    public final void mo5579j() {
        String str;
        synchronized (this.f35312o) {
            int i = this.f35313p;
            if (i == 1) {
                this.f35311n = 0L;
                this.f35309l = this.f35305h.mo3830a(new jzj(this, 0), this.f35304g);
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "application/meta");
                this.f35301c = this.f35302e.mo13720a(mediaFormat);
                this.f35302e.mo13730k();
                this.f35313p = 2;
                return;
            }
            switch (i) {
                case 1:
                    str = yTyWiTtGtnBhy.GVzUynk;
                    break;
                case 2:
                    str = "STARTED";
                    break;
                case 3:
                    str = "STOPPED";
                    break;
                case 4:
                    str = "CLOSED";
                    break;
                case 5:
                    str = "PAUSED";
                    break;
                default:
                    str = JrxsYuVZZqnFC.HRLsaQgHkfM;
                    break;
            }
            Log.e("MetaEncoder", "illegal state as " + str);
        }
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: k */
    public final void mo5580k() {
        synchronized (this.f35312o) {
            while (!this.f35300b.isEmpty()) {
                m13797a(((Long) this.f35300b.poll()).longValue(), ((Integer) this.f35301c.mo16809c()).intValue());
            }
            this.f35313p = 3;
        }
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: l */
    public final void mo5581l(lrd lrdVar, long j) {
        synchronized (this.f35312o) {
            this.f35307j.set(j);
            if (!this.f35303f.m13795d(jyv.METADATA)) {
                this.f35303f.m13793b(jyv.METADATA, this.f35307j);
            }
            if (this.f35308k.size() < 1000) {
                long jM13796e = m13796e(j);
                Deque deque = this.f35310m;
                while (!deque.isEmpty()) {
                    mzj mzjVar = (mzj) deque.peek();
                    mzjVar.getClass();
                    if (!mzjVar.mo8324a(Long.valueOf(jM13796e))) {
                        if (mzjVar.m17183l() && ((Long) mzjVar.m17180i()).longValue() > jM13796e) {
                            break;
                        }
                        mzjVar.toString();
                        deque.poll();
                    }
                }
                this.f35308k.offer(new jzk(lrdVar, jM13796e - this.f35311n, null, null));
            } else {
                Log.w("MetaEncoder", "Video frame timestamp is very off. Possibly no metadata is written.");
            }
        }
    }
}
