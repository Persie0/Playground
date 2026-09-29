package p453w9;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p261m9.InterfaceC7509j;
import p479xa.C10130a0;
import p479xa.C10151t;

/* JADX INFO: renamed from: w9.d0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9852d0 {

    /* JADX INFO: renamed from: w9.d0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f50132a;

        /* JADX INFO: renamed from: b */
        public final byte[] f50133b;

        public a(String str, byte[] bArr) {
            this.f50132a = str;
            this.f50133b = bArr;
        }
    }

    /* JADX INFO: renamed from: w9.d0$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f50134a;

        /* JADX INFO: renamed from: b */
        public final List<a> f50135b;

        /* JADX INFO: renamed from: c */
        public final byte[] f50136c;

        public b(int i10, String str, ArrayList arrayList, byte[] bArr) {
            this.f50134a = str;
            this.f50135b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f50136c = bArr;
        }
    }

    /* JADX INFO: renamed from: w9.d0$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC9852d0 mo18347a(int i10, b bVar);
    }

    /* JADX INFO: renamed from: w9.d0$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final String f50137a;

        /* JADX INFO: renamed from: b */
        public final int f50138b;

        /* JADX INFO: renamed from: c */
        public final int f50139c;

        /* JADX INFO: renamed from: d */
        public int f50140d;

        /* JADX INFO: renamed from: e */
        public String f50141e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f50137a = str;
            this.f50138b = i11;
            this.f50139c = i12;
            this.f50140d = Integer.MIN_VALUE;
            this.f50141e = "";
        }

        /* JADX INFO: renamed from: a */
        public final void m18348a() {
            int i10 = this.f50140d;
            this.f50140d = i10 == Integer.MIN_VALUE ? this.f50138b : i10 + this.f50139c;
            this.f50141e = this.f50137a + this.f50140d;
        }

        /* JADX INFO: renamed from: b */
        public final void m18349b() {
            if (this.f50140d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo18344a(int i10, C10151t c10151t) throws ParserException;

    /* JADX INFO: renamed from: b */
    void mo18345b();

    /* JADX INFO: renamed from: c */
    void mo18346c(C10130a0 c10130a0, InterfaceC7509j interfaceC7509j, d dVar);
}
