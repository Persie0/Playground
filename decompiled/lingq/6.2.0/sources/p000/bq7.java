package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class bq7 implements q33 {

    /* JADX INFO: renamed from: c */
    public static final Charset f8870c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final File f8871a;

    /* JADX INFO: renamed from: b */
    public aq7 f8872b;

    public bq7(File file) {
        this.f8871a = file;
    }

    /* JADX INFO: renamed from: a */
    public final void m4100a() {
        File file = this.f8871a;
        if (this.f8872b == null) {
            try {
                this.f8872b = new aq7(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // p000.q33
    /* JADX INFO: renamed from: b */
    public final void mo4101b() {
        pb1.m19047q(this.f8872b, "There was a problem closing the Crashlytics log file.");
        this.f8872b = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // p000.q33
    /* JADX INFO: renamed from: d */
    public final String mo4102d() {
        C3126ix c3126ix;
        byte[] bArr;
        if (this.f8871a.exists()) {
            m4100a();
            aq7 aq7Var = this.f8872b;
            if (aq7Var == null) {
                c3126ix = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[aq7Var.m2990x()];
                try {
                    this.f8872b.m2984c(new fs6(11, bArr2, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                c3126ix = new C3126ix(bArr2, iArr[0], 10);
            }
        } else {
            c3126ix = null;
        }
        if (c3126ix == null) {
            bArr = null;
        } else {
            int i = c3126ix.f44720b;
            bArr = new byte[i];
            System.arraycopy((byte[]) c3126ix.f44721c, 0, bArr, 0, i);
        }
        if (bArr != null) {
            return new String(bArr, f8870c);
        }
        return null;
    }

    @Override // p000.q33
    /* JADX INFO: renamed from: e */
    public final void mo4103e(String str, long j) {
        m4100a();
        if (this.f8872b == null) {
            return;
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.f8872b.m2982a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f8870c));
            while (!this.f8872b.m2985e() && this.f8872b.m2990x() > 65536) {
                this.f8872b.m2987q();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
