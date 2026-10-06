package p000;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ket {

    /* JADX INFO: renamed from: b */
    public final ked f35792b;

    /* JADX INFO: renamed from: c */
    public final OutputStream f35793c;

    /* JADX INFO: renamed from: f */
    private int f35796f = 0;

    /* JADX INFO: renamed from: d */
    public int f35794d = 0;

    /* JADX INFO: renamed from: e */
    public int f35795e = 0;

    /* JADX INFO: renamed from: a */
    private int f35791a = 0;

    public ket(OutputStream outputStream, ked kedVar) {
        this.f35793c = outputStream;
        this.f35792b = kedVar;
    }

    /* JADX INFO: renamed from: a */
    protected abstract int mo14062a(int i);

    /* JADX INFO: renamed from: b */
    protected final short m14081b(int i) throws kes {
        m14083d();
        m14082c(2, i);
        m14083d();
        ked kedVar = this.f35792b;
        int i2 = kedVar.f35713b;
        if (i2 + 2 > kedVar.f35714c) {
            throw new IllegalStateException("Byte queue is too short");
        }
        byte[] bArr = kedVar.f35712a;
        int i3 = i2 + 1;
        kedVar.f35713b = i3;
        int i4 = bArr[i2] & 255;
        kedVar.f35713b = i3 + 1;
        return (short) ((i4 << 8) + (bArr[i3] & 255));
    }

    /* JADX INFO: renamed from: c */
    public final void m14082c(int i, int i2) throws kes {
        if (this.f35792b.m14012a() < i || this.f35795e != 0 || this.f35794d != 0) {
            throw new kes(i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m14083d() {
        if (this.f35795e != 0 || this.f35794d != 0) {
            throw new IllegalStateException("Can not read or write bytes while forwarding or skipping");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14084e(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f35794d;
        if (i3 >= i2 || i3 < 0) {
            if (i3 > 0) {
                this.f35794d = i3 - i2;
                return;
            }
            return;
        }
        int i4 = this.f35795e;
        if (i4 >= i2 || i4 < 0) {
            this.f35793c.write(bArr, i, i2);
            int i5 = this.f35795e;
            if (i5 > 0) {
                this.f35795e = i5 - i2;
                return;
            }
            return;
        }
        if (i3 > 0) {
            i += i3;
            i2 -= i3;
            this.f35794d = 0;
        } else if (i4 > 0) {
            this.f35793c.write(bArr, i, i4);
            int i6 = this.f35795e;
            i += i6;
            i2 -= i6;
            this.f35795e = 0;
        }
        ked kedVar = this.f35792b;
        kedVar.m14013b(i2);
        System.arraycopy(bArr, i, kedVar.f35712a, kedVar.f35714c, i2);
        kedVar.f35714c += i2;
        m14085f();
    }

    /* JADX INFO: renamed from: f */
    public final void m14085f() {
        while (this.f35792b.m14012a() >= this.f35796f && this.f35795e == 0 && this.f35794d == 0) {
            try {
                this.f35796f = 0;
                this.f35791a = mo14062a(this.f35791a);
            } catch (kes e) {
                this.f35796f = e.f35789a;
                this.f35791a = e.f35790b;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    protected final void m14086g(byte[] bArr) throws IOException {
        m14083d();
        this.f35793c.write(bArr);
    }

    /* JADX INFO: renamed from: h */
    protected final void m14087h(short s) throws IOException {
        m14083d();
        this.f35793c.write((s >> 8) & 255);
        this.f35793c.write(s & 255);
    }

    /* JADX INFO: renamed from: i */
    protected final void m14088i(int i) throws IOException {
        m14083d();
        ked kedVar = this.f35792b;
        if (kedVar.m14012a() >= i) {
            kedVar.m14014c(this.f35793c, i);
        } else {
            this.f35795e = i - kedVar.m14012a();
            kedVar.m14014c(this.f35793c, kedVar.m14012a());
        }
    }

    /* JADX INFO: renamed from: j */
    protected final void m14089j(int i) {
        m14083d();
        ked kedVar = this.f35792b;
        if (kedVar.m14012a() >= i) {
            kedVar.m14015d(i);
        } else {
            this.f35794d = i - kedVar.m14012a();
            kedVar.m14015d(kedVar.m14012a());
        }
    }
}
