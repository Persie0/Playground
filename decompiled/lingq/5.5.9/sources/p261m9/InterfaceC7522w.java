package p261m9;

import com.google.android.exoplayer2.C2416m;
import java.io.IOException;
import java.util.Arrays;
import p454wa.InterfaceC9880e;
import p479xa.C10151t;

/* JADX INFO: renamed from: m9.w */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7522w {

    /* JADX INFO: renamed from: m9.w$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f41524a;

        /* JADX INFO: renamed from: b */
        public final byte[] f41525b;

        /* JADX INFO: renamed from: c */
        public final int f41526c;

        /* JADX INFO: renamed from: d */
        public final int f41527d;

        public a(int i10, int i11, int i12, byte[] bArr) {
            this.f41524a = i10;
            this.f41525b = bArr;
            this.f41526c = i11;
            this.f41527d = i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                return this.f41524a == aVar.f41524a && this.f41526c == aVar.f41526c && this.f41527d == aVar.f41527d && Arrays.equals(this.f41525b, aVar.f41525b);
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f41525b) + (this.f41524a * 31)) * 31) + this.f41526c) * 31) + this.f41527d;
        }
    }

    /* JADX INFO: renamed from: a */
    int mo7385a(InterfaceC9880e interfaceC9880e, int i10, boolean z10) throws IOException;

    /* JADX INFO: renamed from: b */
    void mo7386b(int i10, C10151t c10151t);

    /* JADX INFO: renamed from: c */
    default void m15021c(int i10, C10151t c10151t) {
        mo7386b(i10, c10151t);
    }

    /* JADX INFO: renamed from: d */
    default int m15022d(InterfaceC9880e interfaceC9880e, int i10, boolean z10) throws IOException {
        return mo7385a(interfaceC9880e, i10, z10);
    }

    /* JADX INFO: renamed from: e */
    void mo7387e(long j10, int i10, int i11, int i12, a aVar);

    /* JADX INFO: renamed from: f */
    void mo7388f(C2416m c2416m);
}
