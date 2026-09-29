package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import p000.e73;
import p000.fk5;
import p000.if0;
import p000.iw4;
import p000.m80;
import p000.o94;
import p000.ox2;
import p000.t74;
import p000.ui2;
import p000.wm8;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1130e {

    /* JADX INFO: renamed from: a */
    public final m80 f13582a;

    /* JADX INFO: renamed from: b */
    public int f13583b;

    /* JADX INFO: renamed from: c */
    public int f13584c;

    /* JADX INFO: renamed from: d */
    public int f13585d = 0;

    public C1130e(m80 m80Var) {
        o94.m17872a(m80Var, "input");
        this.f13582a = m80Var;
        m80Var.f50744b = this;
    }

    /* JADX INFO: renamed from: w */
    public static void m6476w(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m6420f();
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m6477x(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m6420f();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m6478a() {
        int i = this.f13585d;
        if (i != 0) {
            this.f13583b = i;
            this.f13585d = 0;
        } else {
            this.f13583b = this.f13582a.mo6437C();
        }
        int i2 = this.f13583b;
        if (i2 == 0 || i2 == this.f13584c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public final void m6479b(Object obj, wm8 wm8Var, ox2 ox2Var) {
        int i = this.f13584c;
        this.f13584c = ((this.f13583b >>> 3) << 3) | 4;
        try {
            wm8Var.mo6586a(obj, this, ox2Var);
            if (this.f13583b != this.f13584c) {
                throw InvalidProtocolBufferException.m6420f();
            }
            this.f13584c = i;
        } catch (Throwable th) {
            this.f13584c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6480c(Object obj, wm8 wm8Var, ox2 ox2Var) throws InvalidProtocolBufferException {
        m80 m80Var = this.f13582a;
        int iMo6438D = m80Var.mo6438D();
        if (m80Var.f50743a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo6450l = m80Var.mo6450l(iMo6438D);
        m80Var.f50743a++;
        wm8Var.mo6586a(obj, this, ox2Var);
        m80Var.mo6446a(0);
        m80Var.f50743a--;
        m80Var.mo6449k(iMo6450l);
    }

    /* JADX INFO: renamed from: d */
    public final void m6481d(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof if0;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(m80Var.mo6451m()));
                    if (m80Var.mo6448e()) {
                        return;
                    } else {
                        iMo6437C = m80Var.mo6437C();
                    }
                } while (iMo6437C == this.f13583b);
                this.f13585d = iMo6437C;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m6417c();
            }
            int iMo6447d = m80Var.mo6447d() + m80Var.mo6438D();
            do {
                list.add(Boolean.valueOf(m80Var.mo6451m()));
            } while (m80Var.mo6447d() < iMo6447d);
            m6498u(iMo6447d);
            return;
        }
        if0 if0Var = (if0) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                if0Var.addBoolean(m80Var.mo6451m());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        int iMo6447d2 = m80Var.mo6447d() + m80Var.mo6438D();
        do {
            if0Var.addBoolean(m80Var.mo6451m());
        } while (m80Var.mo6447d() < iMo6447d2);
        m6498u(iMo6447d2);
    }

    /* JADX INFO: renamed from: e */
    public final ByteString m6482e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m6499v(2);
        return this.f13582a.mo6452n();
    }

    /* JADX INFO: renamed from: f */
    public final void m6483f(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo6437C;
        if ((this.f13583b & 7) != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        do {
            list.add(m6482e());
            m80 m80Var = this.f13582a;
            if (m80Var.mo6448e()) {
                return;
            } else {
                iMo6437C = m80Var.mo6437C();
            }
        } while (iMo6437C == this.f13583b);
        this.f13585d = iMo6437C;
    }

    /* JADX INFO: renamed from: g */
    public final void m6484g(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof ui2;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(m80Var.mo6453o()));
                    if (m80Var.mo6448e()) {
                        return;
                    } else {
                        iMo6437C = m80Var.mo6437C();
                    }
                } while (iMo6437C == this.f13583b);
                this.f13585d = iMo6437C;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m6417c();
            }
            int iMo6438D = m80Var.mo6438D();
            m6477x(iMo6438D);
            int iMo6447d = m80Var.mo6447d() + iMo6438D;
            do {
                list.add(Double.valueOf(m80Var.mo6453o()));
            } while (m80Var.mo6447d() < iMo6447d);
            return;
        }
        ui2 ui2Var = (ui2) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                ui2Var.addDouble(m80Var.mo6453o());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        int iMo6438D2 = m80Var.mo6438D();
        m6477x(iMo6438D2);
        int iMo6447d2 = m80Var.mo6447d() + iMo6438D2;
        do {
            ui2Var.addDouble(m80Var.mo6453o());
        } while (m80Var.mo6447d() < iMo6447d2);
    }

    /* JADX INFO: renamed from: h */
    public final void m6485h(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof t74;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(m80Var.mo6454p()));
                    if (m80Var.mo6448e()) {
                        return;
                    } else {
                        iMo6437C = m80Var.mo6437C();
                    }
                } while (iMo6437C == this.f13583b);
                this.f13585d = iMo6437C;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m6417c();
            }
            int iMo6447d = m80Var.mo6447d() + m80Var.mo6438D();
            do {
                list.add(Integer.valueOf(m80Var.mo6454p()));
            } while (m80Var.mo6447d() < iMo6447d);
            m6498u(iMo6447d);
            return;
        }
        t74 t74Var = (t74) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                t74Var.addInt(m80Var.mo6454p());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        int iMo6447d2 = m80Var.mo6447d() + m80Var.mo6438D();
        do {
            t74Var.addInt(m80Var.mo6454p());
        } while (m80Var.mo6447d() < iMo6447d2);
        m6498u(iMo6447d2);
    }

    /* JADX INFO: renamed from: i */
    public final void m6486i(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof t74;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo6438D = m80Var.mo6438D();
                m6476w(iMo6438D);
                int iMo6447d = m80Var.mo6447d() + iMo6438D;
                do {
                    list.add(Integer.valueOf(m80Var.mo6455q()));
                } while (m80Var.mo6447d() < iMo6447d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m6417c();
            }
            do {
                list.add(Integer.valueOf(m80Var.mo6455q()));
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C = m80Var.mo6437C();
                }
            } while (iMo6437C == this.f13583b);
            this.f13585d = iMo6437C;
            return;
        }
        t74 t74Var = (t74) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo6438D2 = m80Var.mo6438D();
            m6476w(iMo6438D2);
            int iMo6447d2 = m80Var.mo6447d() + iMo6438D2;
            do {
                t74Var.addInt(m80Var.mo6455q());
            } while (m80Var.mo6447d() < iMo6447d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m6417c();
        }
        do {
            t74Var.addInt(m80Var.mo6455q());
            if (m80Var.mo6448e()) {
                return;
            } else {
                iMo6437C2 = m80Var.mo6437C();
            }
        } while (iMo6437C2 == this.f13583b);
        this.f13585d = iMo6437C2;
    }

    /* JADX INFO: renamed from: j */
    public final void m6487j(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof fk5;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(m80Var.mo6456r()));
                    if (m80Var.mo6448e()) {
                        return;
                    } else {
                        iMo6437C = m80Var.mo6437C();
                    }
                } while (iMo6437C == this.f13583b);
                this.f13585d = iMo6437C;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m6417c();
            }
            int iMo6438D = m80Var.mo6438D();
            m6477x(iMo6438D);
            int iMo6447d = m80Var.mo6447d() + iMo6438D;
            do {
                list.add(Long.valueOf(m80Var.mo6456r()));
            } while (m80Var.mo6447d() < iMo6447d);
            return;
        }
        fk5 fk5Var = (fk5) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                fk5Var.addLong(m80Var.mo6456r());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        int iMo6438D2 = m80Var.mo6438D();
        m6477x(iMo6438D2);
        int iMo6447d2 = m80Var.mo6447d() + iMo6438D2;
        do {
            fk5Var.addLong(m80Var.mo6456r());
        } while (m80Var.mo6447d() < iMo6447d2);
    }

    /* JADX INFO: renamed from: k */
    public final void m6488k(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof e73;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo6438D = m80Var.mo6438D();
                m6476w(iMo6438D);
                int iMo6447d = m80Var.mo6447d() + iMo6438D;
                do {
                    list.add(Float.valueOf(m80Var.mo6457t()));
                } while (m80Var.mo6447d() < iMo6447d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m6417c();
            }
            do {
                list.add(Float.valueOf(m80Var.mo6457t()));
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C = m80Var.mo6437C();
                }
            } while (iMo6437C == this.f13583b);
            this.f13585d = iMo6437C;
            return;
        }
        e73 e73Var = (e73) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo6438D2 = m80Var.mo6438D();
            m6476w(iMo6438D2);
            int iMo6447d2 = m80Var.mo6447d() + iMo6438D2;
            do {
                e73Var.addFloat(m80Var.mo6457t());
            } while (m80Var.mo6447d() < iMo6447d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m6417c();
        }
        do {
            e73Var.addFloat(m80Var.mo6457t());
            if (m80Var.mo6448e()) {
                return;
            } else {
                iMo6437C2 = m80Var.mo6437C();
            }
        } while (iMo6437C2 == this.f13583b);
        this.f13585d = iMo6437C2;
    }

    /* JADX INFO: renamed from: l */
    public final void m6489l(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof t74;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(m80Var.mo6458u()));
                    if (m80Var.mo6448e()) {
                        return;
                    } else {
                        iMo6437C = m80Var.mo6437C();
                    }
                } while (iMo6437C == this.f13583b);
                this.f13585d = iMo6437C;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m6417c();
            }
            int iMo6447d = m80Var.mo6447d() + m80Var.mo6438D();
            do {
                list.add(Integer.valueOf(m80Var.mo6458u()));
            } while (m80Var.mo6447d() < iMo6447d);
            m6498u(iMo6447d);
            return;
        }
        t74 t74Var = (t74) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                t74Var.addInt(m80Var.mo6458u());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        int iMo6447d2 = m80Var.mo6447d() + m80Var.mo6438D();
        do {
            t74Var.addInt(m80Var.mo6458u());
        } while (m80Var.mo6447d() < iMo6447d2);
        m6498u(iMo6447d2);
    }

    /* JADX INFO: renamed from: m */
    public final void m6490m(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof fk5;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(m80Var.mo6459v()));
                    if (m80Var.mo6448e()) {
                        return;
                    } else {
                        iMo6437C = m80Var.mo6437C();
                    }
                } while (iMo6437C == this.f13583b);
                this.f13585d = iMo6437C;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m6417c();
            }
            int iMo6447d = m80Var.mo6447d() + m80Var.mo6438D();
            do {
                list.add(Long.valueOf(m80Var.mo6459v()));
            } while (m80Var.mo6447d() < iMo6447d);
            m6498u(iMo6447d);
            return;
        }
        fk5 fk5Var = (fk5) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                fk5Var.addLong(m80Var.mo6459v());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        int iMo6447d2 = m80Var.mo6447d() + m80Var.mo6438D();
        do {
            fk5Var.addLong(m80Var.mo6459v());
        } while (m80Var.mo6447d() < iMo6447d2);
        m6498u(iMo6447d2);
    }

    /* JADX INFO: renamed from: n */
    public final void m6491n(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof t74;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iMo6438D = m80Var.mo6438D();
                m6476w(iMo6438D);
                int iMo6447d = m80Var.mo6447d() + iMo6438D;
                do {
                    list.add(Integer.valueOf(m80Var.mo6460w()));
                } while (m80Var.mo6447d() < iMo6447d);
                return;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m6417c();
            }
            do {
                list.add(Integer.valueOf(m80Var.mo6460w()));
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C = m80Var.mo6437C();
                }
            } while (iMo6437C == this.f13583b);
            this.f13585d = iMo6437C;
            return;
        }
        t74 t74Var = (t74) list;
        int i3 = i & 7;
        if (i3 == 2) {
            int iMo6438D2 = m80Var.mo6438D();
            m6476w(iMo6438D2);
            int iMo6447d2 = m80Var.mo6447d() + iMo6438D2;
            do {
                t74Var.addInt(m80Var.mo6460w());
            } while (m80Var.mo6447d() < iMo6447d2);
            return;
        }
        if (i3 != 5) {
            throw InvalidProtocolBufferException.m6417c();
        }
        do {
            t74Var.addInt(m80Var.mo6460w());
            if (m80Var.mo6448e()) {
                return;
            } else {
                iMo6437C2 = m80Var.mo6437C();
            }
        } while (iMo6437C2 == this.f13583b);
        this.f13585d = iMo6437C2;
    }

    /* JADX INFO: renamed from: o */
    public final void m6492o(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof fk5;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(m80Var.mo6461x()));
                    if (m80Var.mo6448e()) {
                        return;
                    } else {
                        iMo6437C = m80Var.mo6437C();
                    }
                } while (iMo6437C == this.f13583b);
                this.f13585d = iMo6437C;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m6417c();
            }
            int iMo6438D = m80Var.mo6438D();
            m6477x(iMo6438D);
            int iMo6447d = m80Var.mo6447d() + iMo6438D;
            do {
                list.add(Long.valueOf(m80Var.mo6461x()));
            } while (m80Var.mo6447d() < iMo6447d);
            return;
        }
        fk5 fk5Var = (fk5) list;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                fk5Var.addLong(m80Var.mo6461x());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        int iMo6438D2 = m80Var.mo6438D();
        m6477x(iMo6438D2);
        int iMo6447d2 = m80Var.mo6447d() + iMo6438D2;
        do {
            fk5Var.addLong(m80Var.mo6461x());
        } while (m80Var.mo6447d() < iMo6447d2);
    }

    /* JADX INFO: renamed from: p */
    public final void m6493p(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof t74;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(m80Var.mo6462y()));
                    if (m80Var.mo6448e()) {
                        return;
                    } else {
                        iMo6437C = m80Var.mo6437C();
                    }
                } while (iMo6437C == this.f13583b);
                this.f13585d = iMo6437C;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m6417c();
            }
            int iMo6447d = m80Var.mo6447d() + m80Var.mo6438D();
            do {
                list.add(Integer.valueOf(m80Var.mo6462y()));
            } while (m80Var.mo6447d() < iMo6447d);
            m6498u(iMo6447d);
            return;
        }
        t74 t74Var = (t74) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                t74Var.addInt(m80Var.mo6462y());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        int iMo6447d2 = m80Var.mo6447d() + m80Var.mo6438D();
        do {
            t74Var.addInt(m80Var.mo6462y());
        } while (m80Var.mo6447d() < iMo6447d2);
        m6498u(iMo6447d2);
    }

    /* JADX INFO: renamed from: q */
    public final void m6494q(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof fk5;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(m80Var.mo6463z()));
                    if (m80Var.mo6448e()) {
                        return;
                    } else {
                        iMo6437C = m80Var.mo6437C();
                    }
                } while (iMo6437C == this.f13583b);
                this.f13585d = iMo6437C;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m6417c();
            }
            int iMo6447d = m80Var.mo6447d() + m80Var.mo6438D();
            do {
                list.add(Long.valueOf(m80Var.mo6463z()));
            } while (m80Var.mo6447d() < iMo6447d);
            m6498u(iMo6447d);
            return;
        }
        fk5 fk5Var = (fk5) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                fk5Var.addLong(m80Var.mo6463z());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        int iMo6447d2 = m80Var.mo6447d() + m80Var.mo6438D();
        do {
            fk5Var.addLong(m80Var.mo6463z());
        } while (m80Var.mo6447d() < iMo6447d2);
        m6498u(iMo6447d2);
    }

    /* JADX INFO: renamed from: r */
    public final void m6495r(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strMo6435A;
        int iMo6437C;
        int iMo6437C2;
        if ((this.f13583b & 7) != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        boolean z2 = list instanceof iw4;
        m80 m80Var = this.f13582a;
        if (z2 && !z) {
            iw4 iw4Var = (iw4) list;
            do {
                iw4Var.mo6553T(m6482e());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        do {
            if (z) {
                m6499v(2);
                strMo6435A = m80Var.mo6436B();
            } else {
                m6499v(2);
                strMo6435A = m80Var.mo6435A();
            }
            list.add(strMo6435A);
            if (m80Var.mo6448e()) {
                return;
            } else {
                iMo6437C = m80Var.mo6437C();
            }
        } while (iMo6437C == this.f13583b);
        this.f13585d = iMo6437C;
    }

    /* JADX INFO: renamed from: s */
    public final void m6496s(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof t74;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(m80Var.mo6438D()));
                    if (m80Var.mo6448e()) {
                        return;
                    } else {
                        iMo6437C = m80Var.mo6437C();
                    }
                } while (iMo6437C == this.f13583b);
                this.f13585d = iMo6437C;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m6417c();
            }
            int iMo6447d = m80Var.mo6447d() + m80Var.mo6438D();
            do {
                list.add(Integer.valueOf(m80Var.mo6438D()));
            } while (m80Var.mo6447d() < iMo6447d);
            m6498u(iMo6447d);
            return;
        }
        t74 t74Var = (t74) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                t74Var.addInt(m80Var.mo6438D());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        int iMo6447d2 = m80Var.mo6447d() + m80Var.mo6438D();
        do {
            t74Var.addInt(m80Var.mo6438D());
        } while (m80Var.mo6447d() < iMo6447d2);
        m6498u(iMo6447d2);
    }

    /* JADX INFO: renamed from: t */
    public final void m6497t(List list) throws InvalidProtocolBufferException {
        int iMo6437C;
        int iMo6437C2;
        boolean z = list instanceof fk5;
        int i = this.f13583b;
        m80 m80Var = this.f13582a;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(m80Var.mo6439E()));
                    if (m80Var.mo6448e()) {
                        return;
                    } else {
                        iMo6437C = m80Var.mo6437C();
                    }
                } while (iMo6437C == this.f13583b);
                this.f13585d = iMo6437C;
                return;
            }
            if (i2 != 2) {
                throw InvalidProtocolBufferException.m6417c();
            }
            int iMo6447d = m80Var.mo6447d() + m80Var.mo6438D();
            do {
                list.add(Long.valueOf(m80Var.mo6439E()));
            } while (m80Var.mo6447d() < iMo6447d);
            m6498u(iMo6447d);
            return;
        }
        fk5 fk5Var = (fk5) list;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                fk5Var.addLong(m80Var.mo6439E());
                if (m80Var.mo6448e()) {
                    return;
                } else {
                    iMo6437C2 = m80Var.mo6437C();
                }
            } while (iMo6437C2 == this.f13583b);
            this.f13585d = iMo6437C2;
            return;
        }
        if (i3 != 2) {
            throw InvalidProtocolBufferException.m6417c();
        }
        int iMo6447d2 = m80Var.mo6447d() + m80Var.mo6438D();
        do {
            fk5Var.addLong(m80Var.mo6439E());
        } while (m80Var.mo6447d() < iMo6447d2);
        m6498u(iMo6447d2);
    }

    /* JADX INFO: renamed from: u */
    public final void m6498u(int i) throws InvalidProtocolBufferException {
        if (this.f13582a.mo6447d() != i) {
            throw InvalidProtocolBufferException.m6421g();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m6499v(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f13583b & 7) != i) {
            throw InvalidProtocolBufferException.m6417c();
        }
    }
}
