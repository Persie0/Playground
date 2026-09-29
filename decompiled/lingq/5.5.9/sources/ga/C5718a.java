package ga;

import android.net.Uri;
import com.google.android.exoplayer2.source.InterfaceC2495l;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import p261m9.C7504e;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7511l;
import p454wa.InterfaceC9882g;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ga.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5718a implements InterfaceC2495l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7511l f34735a;

    /* JADX INFO: renamed from: b */
    public InterfaceC7507h f34736b;

    /* JADX INFO: renamed from: c */
    public C7504e f34737c;

    public C5718a(InterfaceC7511l interfaceC7511l) {
        this.f34735a = interfaceC7511l;
    }

    /* JADX INFO: renamed from: a */
    public final long m12077a() {
        C7504e c7504e = this.f34737c;
        if (c7504e != null) {
            return c7504e.f41477d;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX INFO: renamed from: b */
    public final void m12078b(InterfaceC9882g interfaceC9882g, Uri uri, Map map, long j10, long j11, InterfaceC7509j interfaceC7509j) throws IOException {
        C7504e c7504e = new C7504e(interfaceC9882g, j10, j11);
        this.f34737c = c7504e;
        if (this.f34736b != null) {
            return;
        }
        InterfaceC7507h[] interfaceC7507hArrMo15008c = this.f34735a.mo15008c(uri, map);
        boolean z10 = true;
        if (interfaceC7507hArrMo15008c.length == 1) {
            this.f34736b = interfaceC7507hArrMo15008c[0];
        } else {
            for (InterfaceC7507h interfaceC7507h : interfaceC7507hArrMo15008c) {
                try {
                    if (interfaceC7507h.mo12868g(c7504e)) {
                        this.f34736b = interfaceC7507h;
                        c7504e.f41479f = 0;
                        break;
                    }
                    boolean z11 = this.f34736b != null || c7504e.f41477d == j10;
                    C10129a.m18992d(z11);
                    c7504e.f41479f = 0;
                } catch (EOFException unused) {
                    if (this.f34736b != null || c7504e.f41477d == j10) {
                    }
                } catch (Throwable th2) {
                    if (this.f34736b == null && c7504e.f41477d != j10) {
                        z10 = false;
                    }
                    C10129a.m18992d(z10);
                    c7504e.f41479f = 0;
                    throw th2;
                }
                C10129a.m18992d(z11);
                c7504e.f41479f = 0;
            }
            if (this.f34736b == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i10 = C10134c0.f51354a;
                StringBuilder sb3 = new StringBuilder();
                for (int i11 = 0; i11 < interfaceC7507hArrMo15008c.length; i11++) {
                    sb3.append(interfaceC7507hArrMo15008c[i11].getClass().getSimpleName());
                    if (i11 < interfaceC7507hArrMo15008c.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                String string = sb2.toString();
                uri.getClass();
                throw new UnrecognizedInputFormatException(string);
            }
        }
        this.f34736b.mo12867f(interfaceC7509j);
    }
}
