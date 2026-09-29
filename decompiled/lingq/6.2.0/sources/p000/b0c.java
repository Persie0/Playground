package p000;

import androidx.compose.runtime.internal.C0282a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f7741a = new C0282a(-418583062, false, new wd1(0));

    /* JADX INFO: renamed from: b */
    public static final C0282a f7742b = new C0282a(1508107217, false, new wd1(1));

    /* JADX WARN: Code duplicated, block: B:39:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x014e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0152  */
    /* JADX WARN: Code duplicated, block: B:49:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0158  */
    /* JADX WARN: Code duplicated, block: B:51:0x0161  */
    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0185  */
    /* JADX WARN: Code duplicated, block: B:56:0x0198  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:72:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x001b A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static ByteBuffer m3149a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        double d;
        int i5;
        byte b;
        int i6;
        int i7;
        int i8;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int iPosition = byteBuffer.position();
        int i9 = i3;
        while (byteBuffer.hasRemaining() && i9 < i4) {
            if (i != 2) {
                if (i == 3) {
                    d = -2.147483648E9d;
                    i7 = (byteBuffer.get() & 255) << 24;
                } else if (i == 4) {
                    d = -2.147483648E9d;
                    float fM22811f = uma.m22811f(byteBuffer.getFloat(), -1.0f, 1.0f);
                    i7 = (int) (fM22811f < 0.0f ? (-fM22811f) * (-2.1474836E9f) : fM22811f * 2.1474836E9f);
                } else if (i == 21) {
                    d = -2.147483648E9d;
                    i5 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                    b = byteBuffer.get();
                } else if (i != 22) {
                    if (i == 268435456) {
                        d = -2.147483648E9d;
                        i5 = (byteBuffer.get() & 255) << 24;
                        i6 = (byteBuffer.get() & 255) << 16;
                    } else if (i == 1342177280) {
                        d = -2.147483648E9d;
                        i5 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                        i6 = (byteBuffer.get() & 255) << 8;
                    } else if (i == 1610612736) {
                        d = -2.147483648E9d;
                        i5 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                        i6 = byteBuffer.get() & 255;
                    } else {
                        if (i != 1879048192) {
                            uk9.m22770c();
                            return null;
                        }
                        d = -2.147483648E9d;
                        double d2 = byteBuffer.getDouble();
                        String str = uma.f64080a;
                        double dMax = Math.max(-1.0d, Math.min(d2, 1.0d));
                        i7 = (int) (dMax < 0.0d ? (-dMax) * (-2.147483648E9d) : dMax * 2.147483647E9d);
                    }
                    i7 = i5 | i6;
                } else {
                    d = -2.147483648E9d;
                    i5 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                    b = byteBuffer.get();
                }
                i8 = (int) ((((long) i7) * ((long) i9)) / ((long) i4));
                if (i != 2) {
                    byteBufferOrder.put((byte) (i8 >> 16));
                    byteBufferOrder.put((byte) (i8 >> 24));
                } else if (i != 3) {
                    byteBufferOrder.put((byte) (i8 >> 24));
                } else if (i != 4) {
                    if (i != 21) {
                        byteBufferOrder.put((byte) (i8 >> 8));
                        byteBufferOrder.put((byte) (i8 >> 16));
                        byteBufferOrder.put((byte) (i8 >> 24));
                    } else if (i != 22) {
                        byteBufferOrder.put((byte) i8);
                        byteBufferOrder.put((byte) (i8 >> 8));
                        byteBufferOrder.put((byte) (i8 >> 16));
                        byteBufferOrder.put((byte) (i8 >> 24));
                    } else if (i != 268435456) {
                        byteBufferOrder.put((byte) (i8 >> 24));
                        byteBufferOrder.put((byte) (i8 >> 16));
                    } else if (i != 1342177280) {
                        byteBufferOrder.put((byte) (i8 >> 24));
                        byteBufferOrder.put((byte) (i8 >> 16));
                        byteBufferOrder.put((byte) (i8 >> 8));
                    } else if (i != 1610612736) {
                        byteBufferOrder.put((byte) (i8 >> 24));
                        byteBufferOrder.put((byte) (i8 >> 16));
                        byteBufferOrder.put((byte) (i8 >> 8));
                        byteBufferOrder.put((byte) i8);
                    } else {
                        if (i == 1879048192) {
                            uk9.m22770c();
                            return null;
                        }
                        if (i8 < 0) {
                            byteBufferOrder.putDouble((-i8) / d);
                        } else {
                            byteBufferOrder.putDouble(((double) i8) / 2.147483647E9d);
                        }
                    }
                } else if (i8 < 0) {
                    byteBufferOrder.putFloat((-i8) / (-2.1474836E9f));
                } else {
                    byteBufferOrder.putFloat(i8 / 2.1474836E9f);
                }
                if (byteBuffer.position() == iPosition + i2) {
                    i9++;
                    iPosition = byteBuffer.position();
                }
            } else {
                d = -2.147483648E9d;
                i5 = (byteBuffer.get() & 255) << 16;
                b = byteBuffer.get();
            }
            i6 = (b & 255) << 24;
            i7 = i5 | i6;
            i8 = (int) ((((long) i7) * ((long) i9)) / ((long) i4));
            if (i != 2) {
                byteBufferOrder.put((byte) (i8 >> 16));
                byteBufferOrder.put((byte) (i8 >> 24));
            } else if (i != 3) {
                byteBufferOrder.put((byte) (i8 >> 24));
            } else if (i != 4) {
                if (i != 21) {
                    byteBufferOrder.put((byte) (i8 >> 8));
                    byteBufferOrder.put((byte) (i8 >> 16));
                    byteBufferOrder.put((byte) (i8 >> 24));
                } else if (i != 22) {
                    byteBufferOrder.put((byte) i8);
                    byteBufferOrder.put((byte) (i8 >> 8));
                    byteBufferOrder.put((byte) (i8 >> 16));
                    byteBufferOrder.put((byte) (i8 >> 24));
                } else if (i != 268435456) {
                    byteBufferOrder.put((byte) (i8 >> 24));
                    byteBufferOrder.put((byte) (i8 >> 16));
                } else if (i != 1342177280) {
                    byteBufferOrder.put((byte) (i8 >> 24));
                    byteBufferOrder.put((byte) (i8 >> 16));
                    byteBufferOrder.put((byte) (i8 >> 8));
                } else if (i != 1610612736) {
                    byteBufferOrder.put((byte) (i8 >> 24));
                    byteBufferOrder.put((byte) (i8 >> 16));
                    byteBufferOrder.put((byte) (i8 >> 8));
                    byteBufferOrder.put((byte) i8);
                } else {
                    if (i == 1879048192) {
                        uk9.m22770c();
                        return null;
                    }
                    if (i8 < 0) {
                        byteBufferOrder.putDouble((-i8) / d);
                    } else {
                        byteBufferOrder.putDouble(((double) i8) / 2.147483647E9d);
                    }
                }
            } else if (i8 < 0) {
                byteBufferOrder.putFloat((-i8) / (-2.1474836E9f));
            } else {
                byteBufferOrder.putFloat(i8 / 2.1474836E9f);
            }
            if (byteBuffer.position() == iPosition + i2) {
                i9++;
                iPosition = byteBuffer.position();
            }
        }
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.flip();
        return byteBufferOrder;
    }
}
