package p338qd;

import java.util.Arrays;

/* JADX INFO: renamed from: qd.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8528c0 extends AbstractC8568p1 {

    /* JADX INFO: renamed from: a */
    public final String f45801a;

    /* JADX INFO: renamed from: b */
    public final long f45802b;

    /* JADX INFO: renamed from: c */
    public final int f45803c;

    /* JADX INFO: renamed from: d */
    public final boolean f45804d;

    /* JADX INFO: renamed from: e */
    public final boolean f45805e;

    /* JADX INFO: renamed from: f */
    public final byte[] f45806f;

    public C8528c0(String str, long j10, int i10, boolean z10, boolean z11, byte[] bArr) {
        this.f45801a = str;
        this.f45802b = j10;
        this.f45803c = i10;
        this.f45804d = z10;
        this.f45805e = z11;
        this.f45806f = bArr;
    }

    @Override // p338qd.AbstractC8568p1
    /* JADX INFO: renamed from: a */
    public final int mo16641a() {
        return this.f45803c;
    }

    @Override // p338qd.AbstractC8568p1
    /* JADX INFO: renamed from: b */
    public final long mo16642b() {
        return this.f45802b;
    }

    @Override // p338qd.AbstractC8568p1
    /* JADX INFO: renamed from: c */
    public final String mo16643c() {
        return this.f45801a;
    }

    @Override // p338qd.AbstractC8568p1
    /* JADX INFO: renamed from: d */
    public final boolean mo16644d() {
        return this.f45805e;
    }

    @Override // p338qd.AbstractC8568p1
    /* JADX INFO: renamed from: e */
    public final boolean mo16645e() {
        return this.f45804d;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    public final boolean equals(Object obj) {
        byte[] bArrMo16646f;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8568p1) {
            AbstractC8568p1 abstractC8568p1 = (AbstractC8568p1) obj;
            String str = this.f45801a;
            if (str == null) {
                if (abstractC8568p1.mo16643c() == null) {
                    if (this.f45802b == abstractC8568p1.mo16642b() && this.f45803c == abstractC8568p1.mo16641a() && this.f45804d == abstractC8568p1.mo16645e() && this.f45805e == abstractC8568p1.mo16644d()) {
                        if (abstractC8568p1 instanceof C8528c0) {
                            bArrMo16646f = ((C8528c0) abstractC8568p1).f45806f;
                        } else {
                            bArrMo16646f = abstractC8568p1.mo16646f();
                        }
                        if (Arrays.equals(this.f45806f, bArrMo16646f)) {
                            return true;
                        }
                    }
                }
            } else if (str.equals(abstractC8568p1.mo16643c())) {
                if (this.f45802b == abstractC8568p1.mo16642b()) {
                    if (abstractC8568p1 instanceof C8528c0) {
                        bArrMo16646f = ((C8528c0) abstractC8568p1).f45806f;
                    } else {
                        bArrMo16646f = abstractC8568p1.mo16646f();
                    }
                    if (Arrays.equals(this.f45806f, bArrMo16646f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p338qd.AbstractC8568p1
    /* JADX INFO: renamed from: f */
    public final byte[] mo16646f() {
        return this.f45806f;
    }

    public final int hashCode() {
        String str = this.f45801a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f45802b;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f45803c) * 1000003) ^ (true != this.f45804d ? 1237 : 1231)) * 1000003) ^ (true == this.f45805e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f45806f);
    }

    public final String toString() {
        String string = Arrays.toString(this.f45806f);
        String str = this.f45801a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(string).length());
        sb2.append("ZipEntry{name=");
        sb2.append(str);
        sb2.append(", size=");
        sb2.append(this.f45802b);
        sb2.append(", compressionMethod=");
        sb2.append(this.f45803c);
        sb2.append(", isPartial=");
        sb2.append(this.f45804d);
        sb2.append(", isEndOfArchive=");
        sb2.append(this.f45805e);
        sb2.append(", headerBytes=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
