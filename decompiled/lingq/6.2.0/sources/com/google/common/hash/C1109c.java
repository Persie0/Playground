package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.common.hash.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1109c {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f13488a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);

    /* JADX INFO: renamed from: b */
    public final int f13489b = 16;

    /* JADX INFO: renamed from: c */
    public final int f13490c = 16;

    /* JADX INFO: renamed from: d */
    public long f13491d = 0;

    /* JADX INFO: renamed from: e */
    public long f13492e = 0;

    /* JADX INFO: renamed from: f */
    public int f13493f = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    public final AbstractC1107a m6357a() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        m6358b();
        ByteBuffer byteBuffer = this.f13488a;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            this.f13493f = byteBuffer.remaining() + this.f13493f;
            long j8 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j = 0;
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 2:
                    j2 = 0;
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 3:
                    j3 = 0;
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 4:
                    j4 = 0;
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 5:
                    j5 = 0;
                    j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 6:
                    j6 = 0;
                    j5 = (((long) (byteBuffer.get(5) & 255)) << 40) ^ j6;
                    j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 7:
                    j6 = ((long) (byteBuffer.get(6) & 255)) << 48;
                    j5 = (((long) (byteBuffer.get(5) & 255)) << 40) ^ j6;
                    j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 8:
                    j7 = byteBuffer.getLong();
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 9:
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 10:
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 11:
                    j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 12:
                    j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 13:
                    j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                    j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 14:
                    j8 ^= ((long) (byteBuffer.get(13) & 255)) << 40;
                    j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                    j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 15:
                    j8 = ((long) (byteBuffer.get(14) & 255)) << 48;
                    j8 ^= ((long) (byteBuffer.get(13) & 255)) << 40;
                    j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                    j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.f13491d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
                    this.f13492e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
        long j9 = this.f13491d;
        long j10 = this.f13493f;
        long j11 = j9 ^ j10;
        long j12 = j10 ^ this.f13492e;
        long j13 = j11 + j12;
        long j14 = j12 + j13;
        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
        long j19 = j18 ^ (j18 >>> 33);
        long j20 = (j16 ^ (j16 >>> 33)) + j19;
        this.f13491d = j20;
        this.f13492e = j19 + j20;
        return new HashCode$BytesHashCode(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f13491d).putLong(this.f13492e).array());
    }

    /* JADX INFO: renamed from: b */
    public final void m6358b() {
        ByteBuffer byteBuffer = this.f13488a;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.f13490c) {
            m6359c(byteBuffer);
        }
        byteBuffer.compact();
    }

    /* JADX INFO: renamed from: c */
    public final void m6359c(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f13491d;
        this.f13491d = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.f13492e;
        this.f13491d = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.f13492e = jRotateLeft3;
        this.f13492e = ((Long.rotateLeft(jRotateLeft3, 31) + this.f13491d) * 5) + 944331445;
        this.f13493f += 16;
    }

    /* JADX INFO: renamed from: d */
    public final C1109c m6360d(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.f13488a;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                m6358b();
            }
            return this;
        }
        int iPosition = this.f13489b - byteBuffer.position();
        for (int i = 0; i < iPosition; i++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        m6358b();
        while (byteBufferOrder.remaining() >= this.f13490c) {
            m6359c(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }
}
