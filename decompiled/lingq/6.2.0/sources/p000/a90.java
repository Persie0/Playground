package p000;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class a90 {

    /* JADX INFO: renamed from: d */
    public static final z80 f371d;

    /* JADX INFO: renamed from: e */
    public static final y80 f372e;

    /* JADX INFO: renamed from: a */
    public final x80 f373a;

    /* JADX INFO: renamed from: b */
    public final Character f374b;

    /* JADX INFO: renamed from: c */
    public volatile a90 f375c;

    static {
        new z80("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        f371d = new z80("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new a90("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new a90("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f372e = new y80(new x80("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public a90(x80 x80Var, Character ch) {
        boolean z;
        this.f373a = x80Var;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = x80Var.f67918g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        bna.m3971r(z, "Padding character %s was already in alphabet", ch);
        this.f374b = ch;
    }

    /* JADX INFO: renamed from: a */
    public final String m183a(byte[] bArr) {
        int length = bArr.length;
        bna.m3983x(0, length, bArr.length);
        x80 x80Var = this.f373a;
        int i = x80Var.f67916e;
        int i2 = x80Var.f67917f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(ggd.m12592b(length, i2) * i);
        try {
            mo185c(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m184b(int i, int i2, StringBuilder sb, byte[] bArr) {
        bna.m3983x(i, i + i2, bArr.length);
        x80 x80Var = this.f373a;
        int i3 = x80Var.f67917f;
        int i4 = x80Var.f67915d;
        int i5 = 0;
        bna.m3969q(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(x80Var.f67913b[((int) (j >>> (i7 - i5))) & x80Var.f67914c]);
            i5 += i4;
        }
        Character ch = this.f374b;
        if (ch != null) {
            while (i5 < x80Var.f67917f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo185c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        bna.m3983x(0, i, bArr.length);
        while (i2 < i) {
            x80 x80Var = this.f373a;
            m184b(i2, Math.min(x80Var.f67917f, i - i2), sb, bArr);
            i2 += x80Var.f67917f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a90) {
            a90 a90Var = (a90) obj;
            if (this.f373a.equals(a90Var.f373a) && Objects.equals(this.f374b, a90Var.f374b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f374b) ^ this.f373a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        x80 x80Var = this.f373a;
        sb.append(x80Var);
        if (8 % x80Var.f67915d != 0) {
            Character ch = this.f374b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public a90(String str, String str2) {
        this(new x80(str, str2.toCharArray()), (Character) '=');
    }
}
