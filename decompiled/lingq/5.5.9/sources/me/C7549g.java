package me;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import me.C7548f.b;

/* JADX INFO: renamed from: me.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7549g implements InterfaceC7543a {

    /* JADX INFO: renamed from: d */
    public static final Charset f41642d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final File f41643a;

    /* JADX INFO: renamed from: b */
    public final int f41644b = 65536;

    /* JADX INFO: renamed from: c */
    public C7548f f41645c;

    /* JADX INFO: renamed from: me.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final byte[] f41646a;

        /* JADX INFO: renamed from: b */
        public final int f41647b;

        public a(byte[] bArr, int i10) {
            this.f41646a = bArr;
            this.f41647b = i10;
        }
    }

    public C7549g(File file) {
        this.f41643a = file;
    }

    @Override // me.InterfaceC7543a
    /* JADX INFO: renamed from: a */
    public final void mo15049a() {
        CommonUtils.m9149a(this.f41645c, "There was a problem closing the Crashlytics log file.");
        this.f41645c = null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    @Override // me.InterfaceC7543a
    /* JADX INFO: renamed from: b */
    public final String mo15050b() {
        a aVar;
        byte[] bArr;
        if (this.f41643a.exists()) {
            m15069d();
            C7548f c7548f = this.f41645c;
            if (c7548f != null) {
                int[] iArr = {0};
                byte[] bArr2 = new byte[c7548f.m15061E()];
                try {
                    C7548f c7548f2 = this.f41645c;
                    synchronized (c7548f2) {
                        try {
                            int iM15062G = c7548f2.f41633d.f41637a;
                            for (int i10 = 0; i10 < c7548f2.f41632c; i10++) {
                                C7548f.a aVarM15066l = c7548f2.m15066l(iM15062G);
                                C7548f.b bVar = c7548f2.new b(aVarM15066l);
                                int i11 = aVarM15066l.f41638b;
                                try {
                                    bVar.read(bArr2, iArr[0], i11);
                                    iArr[0] = iArr[0] + i11;
                                    bVar.close();
                                    iM15062G = c7548f2.m15062G(aVarM15066l.f41637a + 4 + aVarM15066l.f41638b);
                                } catch (Throwable th2) {
                                    bVar.close();
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } catch (IOException e10) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e10);
                }
                aVar = new a(bArr2, iArr[0]);
            }
            if (aVar == null) {
                bArr = null;
            } else {
                int i12 = aVar.f41647b;
                bArr = new byte[i12];
                System.arraycopy(aVar.f41646a, 0, bArr, 0, i12);
            }
            return bArr != null ? new String(bArr, f41642d) : null;
        }
        aVar = null;
        if (aVar == null) {
            bArr = null;
        } else {
            int i13 = aVar.f41647b;
            bArr = new byte[i13];
            System.arraycopy(aVar.f41646a, 0, bArr, 0, i13);
        }
        if (bArr != null) {
        }
        return bArr != null ? new String(bArr, f41642d) : null;
    }

    @Override // me.InterfaceC7543a
    /* JADX INFO: renamed from: c */
    public final void mo15051c(String str, long j10) {
        boolean z10;
        m15069d();
        int i10 = this.f41644b;
        if (this.f41645c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i11 = i10 / 4;
            if (str.length() > i11) {
                str = "..." + str.substring(str.length() - i11);
            }
            this.f41645c.m15064a(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f41642d));
            while (true) {
                C7548f c7548f = this.f41645c;
                synchronized (c7548f) {
                    try {
                        z10 = c7548f.f41632c == 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10 || this.f41645c.m15061E() <= i10) {
                    return;
                } else {
                    this.f41645c.m15067r();
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15069d() {
        File file = this.f41643a;
        if (this.f41645c == null) {
            try {
                this.f41645c = new C7548f(file);
            } catch (IOException e10) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e10);
            }
        }
    }
}
