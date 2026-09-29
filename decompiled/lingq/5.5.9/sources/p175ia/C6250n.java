package p175ia;

import android.text.TextUtils;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p261m9.C7504e;
import p261m9.C7519t;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7508i;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p397ta.C9238f;
import p397ta.C9240h;
import p479xa.C10130a0;
import p479xa.C10151t;

/* JADX INFO: renamed from: ia.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6250n implements InterfaceC7507h {

    /* JADX INFO: renamed from: g */
    public static final Pattern f36391g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h */
    public static final Pattern f36392h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a */
    public final String f36393a;

    /* JADX INFO: renamed from: b */
    public final C10130a0 f36394b;

    /* JADX INFO: renamed from: d */
    public InterfaceC7509j f36396d;

    /* JADX INFO: renamed from: f */
    public int f36398f;

    /* JADX INFO: renamed from: c */
    public final C10151t f36395c = new C10151t();

    /* JADX INFO: renamed from: e */
    public byte[] f36397e = new byte[1024];

    public C6250n(String str, C10130a0 c10130a0) {
        this.f36393a = str;
        this.f36394b = c10130a0;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: a */
    public final InterfaceC7522w m12864a(long j10) {
        InterfaceC7522w interfaceC7522wMo7366q = this.f36396d.mo7366q(0, 3);
        C2416m.a aVar = new C2416m.a();
        aVar.f12501k = "text/vtt";
        aVar.f12493c = this.f36393a;
        aVar.f12505o = j10;
        interfaceC7522wMo7366q.mo7388f(aVar.m7128a());
        this.f36396d.mo7365i();
        return interfaceC7522wMo7366q;
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: d */
    public final int mo12865d(InterfaceC7508i interfaceC7508i, C7519t c7519t) throws IOException {
        String strM19130e;
        this.f36396d.getClass();
        C7504e c7504e = (C7504e) interfaceC7508i;
        int i10 = (int) c7504e.f41476c;
        int i11 = this.f36398f;
        byte[] bArr = this.f36397e;
        if (i11 == bArr.length) {
            this.f36397e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f36397e;
        int i12 = this.f36398f;
        int i13 = c7504e.read(bArr2, i12, bArr2.length - i12);
        if (i13 != -1) {
            int i14 = this.f36398f + i13;
            this.f36398f = i14;
            if (i10 == -1 || i14 != i10) {
                return 0;
            }
        }
        C10151t c10151t = new C10151t(this.f36397e);
        C9240h.m17606d(c10151t);
        String strM19130e2 = c10151t.m19130e();
        long j10 = 0;
        long jM17605c = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strM19130e2)) {
                while (true) {
                    String strM19130e3 = c10151t.m19130e();
                    if (strM19130e3 == null) {
                        break;
                    }
                    if (C9240h.f47927a.matcher(strM19130e3).matches()) {
                        do {
                            strM19130e = c10151t.m19130e();
                            if (strM19130e == null) {
                                break;
                            }
                        } while (!strM19130e.isEmpty());
                    } else {
                        Matcher matcher2 = C9238f.f47901a.matcher(strM19130e3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    m12864a(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jM17605c2 = C9240h.m17605c(strGroup);
                long jM19004b = this.f36394b.m19004b(((((j10 + jM17605c2) - jM17605c) * 90000) / 1000000) % 8589934592L);
                InterfaceC7522w interfaceC7522wM12864a = m12864a(jM19004b - jM17605c2);
                byte[] bArr3 = this.f36397e;
                int i15 = this.f36398f;
                C10151t c10151t2 = this.f36395c;
                c10151t2.m19122C(bArr3, i15);
                interfaceC7522wM12864a.m15021c(this.f36398f, c10151t2);
                interfaceC7522wM12864a.mo7387e(jM19004b, 1, this.f36398f, 0, null);
                return -1;
            }
            if (strM19130e2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f36391g.matcher(strM19130e2);
                if (!matcher3.find()) {
                    throw ParserException.m6770a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM19130e2), null);
                }
                Matcher matcher4 = f36392h.matcher(strM19130e2);
                if (!matcher4.find()) {
                    throw ParserException.m6770a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM19130e2), null);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jM17605c = C9240h.m17605c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j10 = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strM19130e2 = c10151t.m19130e();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: e */
    public final void mo12866e(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: f */
    public final void mo12867f(InterfaceC7509j interfaceC7509j) {
        this.f36396d = interfaceC7509j;
        interfaceC7509j.mo7364c(new InterfaceC7520u.b(-9223372036854775807L));
    }

    @Override // p261m9.InterfaceC7507h
    /* JADX INFO: renamed from: g */
    public final boolean mo12868g(InterfaceC7508i interfaceC7508i) throws IOException {
        C7504e c7504e = (C7504e) interfaceC7508i;
        c7504e.mo14994c(this.f36397e, 0, 6, false);
        byte[] bArr = this.f36397e;
        C10151t c10151t = this.f36395c;
        c10151t.m19122C(bArr, 6);
        if (C9240h.m17603a(c10151t)) {
            return true;
        }
        c7504e.mo14994c(this.f36397e, 6, 3, false);
        c10151t.m19122C(this.f36397e, 9);
        return C9240h.m17603a(c10151t);
    }

    @Override // p261m9.InterfaceC7507h
    public final void release() {
    }
}
