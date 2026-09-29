package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p195j9.C6437n;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2377k implements AudioProcessor {

    /* JADX INFO: renamed from: b */
    public int f12014b;

    /* JADX INFO: renamed from: c */
    public float f12015c = 1.0f;

    /* JADX INFO: renamed from: d */
    public float f12016d = 1.0f;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.C2354a f12017e;

    /* JADX INFO: renamed from: f */
    public AudioProcessor.C2354a f12018f;

    /* JADX INFO: renamed from: g */
    public AudioProcessor.C2354a f12019g;

    /* JADX INFO: renamed from: h */
    public AudioProcessor.C2354a f12020h;

    /* JADX INFO: renamed from: i */
    public boolean f12021i;

    /* JADX INFO: renamed from: j */
    public C6437n f12022j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f12023k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f12024l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f12025m;

    /* JADX INFO: renamed from: n */
    public long f12026n;

    /* JADX INFO: renamed from: o */
    public long f12027o;

    /* JADX INFO: renamed from: p */
    public boolean f12028p;

    public C2377k() {
        AudioProcessor.C2354a c2354a = AudioProcessor.C2354a.f11836e;
        this.f12017e = c2354a;
        this.f12018f = c2354a;
        this.f12019g = c2354a;
        this.f12020h = c2354a;
        ByteBuffer byteBuffer = AudioProcessor.f11835a;
        this.f12023k = byteBuffer;
        this.f12024l = byteBuffer.asShortBuffer();
        this.f12025m = byteBuffer;
        this.f12014b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: b */
    public final boolean mo6787b() {
        if (this.f12018f.f11837a == -1 || (Math.abs(this.f12015c - 1.0f) < 1.0E-4f && Math.abs(this.f12016d - 1.0f) < 1.0E-4f && this.f12018f.f11837a == this.f12017e.f11837a)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: c */
    public final void mo6788c() {
        this.f12015c = 1.0f;
        this.f12016d = 1.0f;
        AudioProcessor.C2354a c2354a = AudioProcessor.C2354a.f11836e;
        this.f12017e = c2354a;
        this.f12018f = c2354a;
        this.f12019g = c2354a;
        this.f12020h = c2354a;
        ByteBuffer byteBuffer = AudioProcessor.f11835a;
        this.f12023k = byteBuffer;
        this.f12024l = byteBuffer.asShortBuffer();
        this.f12025m = byteBuffer;
        this.f12014b = -1;
        this.f12021i = false;
        this.f12022j = null;
        this.f12026n = 0L;
        this.f12027o = 0L;
        this.f12028p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: d */
    public final boolean mo6789d() {
        C6437n c6437n;
        if (!this.f12028p || ((c6437n = this.f12022j) != null && c6437n.f36977m * c6437n.f36966b * 2 != 0)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: e */
    public final ByteBuffer mo6790e() {
        C6437n c6437n = this.f12022j;
        if (c6437n != null) {
            int i10 = c6437n.f36977m;
            int i11 = c6437n.f36966b;
            int i12 = i10 * i11 * 2;
            if (i12 > 0) {
                if (this.f12023k.capacity() < i12) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                    this.f12023k = byteBufferOrder;
                    this.f12024l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f12023k.clear();
                    this.f12024l.clear();
                }
                ShortBuffer shortBuffer = this.f12024l;
                int iMin = Math.min(shortBuffer.remaining() / i11, c6437n.f36977m);
                int i13 = iMin * i11;
                shortBuffer.put(c6437n.f36976l, 0, i13);
                int i14 = c6437n.f36977m - iMin;
                c6437n.f36977m = i14;
                short[] sArr = c6437n.f36976l;
                System.arraycopy(sArr, i13, sArr, 0, i14 * i11);
                this.f12027o += (long) i12;
                this.f12023k.limit(i12);
                this.f12025m = this.f12023k;
            }
        }
        ByteBuffer byteBuffer = this.f12025m;
        this.f12025m = AudioProcessor.f11835a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: f */
    public final void mo6791f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C6437n c6437n = this.f12022j;
            c6437n.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f12026n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = c6437n.f36966b;
            int i11 = iRemaining2 / i10;
            short[] sArrM13063b = c6437n.m13063b(c6437n.f36974j, c6437n.f36975k, i11);
            c6437n.f36974j = sArrM13063b;
            shortBufferAsShortBuffer.get(sArrM13063b, c6437n.f36975k * i10, ((i11 * i10) * 2) / 2);
            c6437n.f36975k += i11;
            c6437n.m13065e();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (mo6787b()) {
            AudioProcessor.C2354a c2354a = this.f12017e;
            this.f12019g = c2354a;
            AudioProcessor.C2354a c2354a2 = this.f12018f;
            this.f12020h = c2354a2;
            if (this.f12021i) {
                this.f12022j = new C6437n(c2354a.f11837a, c2354a.f11838b, this.f12015c, this.f12016d, c2354a2.f11837a);
            } else {
                C6437n c6437n = this.f12022j;
                if (c6437n != null) {
                    c6437n.f36975k = 0;
                    c6437n.f36977m = 0;
                    c6437n.f36979o = 0;
                    c6437n.f36980p = 0;
                    c6437n.f36981q = 0;
                    c6437n.f36982r = 0;
                    c6437n.f36983s = 0;
                    c6437n.f36984t = 0;
                    c6437n.f36985u = 0;
                    c6437n.f36986v = 0;
                }
            }
        }
        this.f12025m = AudioProcessor.f11835a;
        this.f12026n = 0L;
        this.f12027o = 0L;
        this.f12028p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: g */
    public final AudioProcessor.C2354a mo6792g(AudioProcessor.C2354a c2354a) throws AudioProcessor.UnhandledAudioFormatException {
        if (c2354a.f11839c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(c2354a);
        }
        int i10 = this.f12014b;
        if (i10 == -1) {
            i10 = c2354a.f11837a;
        }
        this.f12017e = c2354a;
        AudioProcessor.C2354a c2354a2 = new AudioProcessor.C2354a(i10, c2354a.f11838b, 2);
        this.f12018f = c2354a2;
        this.f12021i = true;
        return c2354a2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: h */
    public final void mo6793h() {
        C6437n c6437n = this.f12022j;
        if (c6437n != null) {
            int i10 = c6437n.f36975k;
            float f3 = c6437n.f36967c;
            float f10 = c6437n.f36968d;
            int i11 = c6437n.f36977m + ((int) ((((i10 / (f3 / f10)) + c6437n.f36979o) / (c6437n.f36969e * f10)) + 0.5f));
            short[] sArr = c6437n.f36974j;
            int i12 = c6437n.f36972h * 2;
            c6437n.f36974j = c6437n.m13063b(sArr, i10, i12 + i10);
            int i13 = 0;
            while (true) {
                int i14 = c6437n.f36966b;
                if (i13 >= i12 * i14) {
                    break;
                }
                c6437n.f36974j[(i14 * i10) + i13] = 0;
                i13++;
            }
            c6437n.f36975k = i12 + c6437n.f36975k;
            c6437n.m13065e();
            if (c6437n.f36977m > i11) {
                c6437n.f36977m = i11;
            }
            c6437n.f36975k = 0;
            c6437n.f36982r = 0;
            c6437n.f36979o = 0;
        }
        this.f12028p = true;
    }
}
