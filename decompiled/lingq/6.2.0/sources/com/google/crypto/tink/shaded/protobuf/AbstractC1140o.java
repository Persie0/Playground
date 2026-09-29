package com.google.crypto.tink.shaded.protobuf;

import p000.m80;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1140o {
    /* JADX INFO: renamed from: a */
    public abstract C1141p mo6651a(Object obj);

    /* JADX INFO: renamed from: b */
    public final boolean m6652b(Object obj, C1130e c1130e) throws InvalidProtocolBufferException {
        int i = c1130e.f13583b;
        m80 m80Var = c1130e.f13582a;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            c1130e.m6499v(0);
            ((C1141p) obj).m6656d(i2 << 3, Long.valueOf(m80Var.mo6459v()));
            return true;
        }
        if (i3 == 1) {
            c1130e.m6499v(1);
            ((C1141p) obj).m6656d((i2 << 3) | 1, Long.valueOf(m80Var.mo6456r()));
            return true;
        }
        if (i3 == 2) {
            ((C1141p) obj).m6656d((i2 << 3) | 2, c1130e.m6482e());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.m6417c();
            }
            c1130e.m6499v(5);
            ((C1141p) obj).m6656d(5 | (i2 << 3), Integer.valueOf(m80Var.mo6455q()));
            return true;
        }
        C1141p c1141pM6653c = C1141p.m6653c();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        while (c1130e.m6478a() != Integer.MAX_VALUE && m6652b(c1141pM6653c, c1130e)) {
        }
        if (i5 != c1130e.f13583b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        c1141pM6653c.f13625e = false;
        ((C1141p) obj).m6656d(i4 | 3, c1141pM6653c);
        return true;
    }
}
