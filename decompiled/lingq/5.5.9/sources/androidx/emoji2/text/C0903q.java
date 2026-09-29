package androidx.emoji2.text;

import java.nio.ByteBuffer;
import p255m3.C7475a;
import p255m3.C7476b;

/* JADX INFO: renamed from: androidx.emoji2.text.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0903q {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<C7475a> f6046d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public final int f6047a;

    /* JADX INFO: renamed from: b */
    public final C0901o f6048b;

    /* JADX INFO: renamed from: c */
    public volatile int f6049c = 0;

    public C0903q(C0901o c0901o, int i10) {
        this.f6048b = c0901o;
        this.f6047a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final int m3550a(int i10) {
        C7475a c7475aM3552c = m3552c();
        int iM14859a = c7475aM3552c.m14859a(16);
        if (iM14859a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c7475aM3552c.f41325b;
        int i11 = iM14859a + c7475aM3552c.f41324a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final int m3551b() {
        C7475a c7475aM3552c = m3552c();
        int iM14859a = c7475aM3552c.m14859a(16);
        if (iM14859a == 0) {
            return 0;
        }
        int i10 = iM14859a + c7475aM3552c.f41324a;
        return c7475aM3552c.f41325b.getInt(c7475aM3552c.f41325b.getInt(i10) + i10);
    }

    /* JADX INFO: renamed from: c */
    public final C7475a m3552c() {
        ThreadLocal<C7475a> threadLocal = f6046d;
        C7475a c7475a = threadLocal.get();
        if (c7475a == null) {
            c7475a = new C7475a();
            threadLocal.set(c7475a);
        }
        C7476b c7476b = this.f6048b.f6036a;
        int iM14859a = c7476b.m14859a(6);
        if (iM14859a != 0) {
            int i10 = iM14859a + c7476b.f41324a;
            int i11 = (this.f6047a * 4) + c7476b.f41325b.getInt(i10) + i10 + 4;
            c7475a.m14860b(c7476b.f41325b.getInt(i11) + i11, c7476b.f41325b);
        }
        return c7475a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        C7475a c7475aM3552c = m3552c();
        int iM14859a = c7475aM3552c.m14859a(4);
        sb2.append(Integer.toHexString(iM14859a != 0 ? c7475aM3552c.f41325b.getInt(iM14859a + c7475aM3552c.f41324a) : 0));
        sb2.append(", codepoints:");
        int iM3551b = m3551b();
        for (int i10 = 0; i10 < iM3551b; i10++) {
            sb2.append(Integer.toHexString(m3550a(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
