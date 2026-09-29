package p338qd;

import com.google.android.play.core.assetpacks.C3112c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import p290o6.C7967l0;
import sd.C8990a;

/* JADX INFO: renamed from: qd.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8544h1 {

    /* JADX INFO: renamed from: d */
    public static final C7967l0 f45872d = new C7967l0("PackMetadataManager");

    /* JADX INFO: renamed from: a */
    public final C3112c f45873a;

    /* JADX INFO: renamed from: b */
    public final C8547i1 f45874b;

    /* JADX INFO: renamed from: c */
    public final C8990a f45875c;

    public C8544h1(C3112c c3112c, C8547i1 c8547i1, C8990a c8990a) {
        this.f45873a = c3112c;
        this.f45874b = c8547i1;
        this.f45875c = c8990a;
    }

    /* JADX INFO: renamed from: a */
    public final String m16650a(String str) {
        boolean z10;
        if (this.f45875c.m17232a()) {
            C3112c c3112c = this.f45873a;
            c3112c.getClass();
            try {
                z10 = c3112c.m8977m(str) != null;
            } catch (IOException unused) {
            }
            if (z10) {
                int iM16652a = this.f45874b.m16652a();
                File file = new File(new File(c3112c.m8974j(str, iM16652a, c3112c.m8973i(str)), "_metadata"), "properties.dat");
                try {
                    if (!file.exists()) {
                        return String.valueOf(iM16652a);
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        Properties properties = new Properties();
                        properties.load(fileInputStream);
                        fileInputStream.close();
                        String property = properties.getProperty("moduleVersionTag");
                        return property == null ? String.valueOf(iM16652a) : property;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused2) {
                        }
                        throw th2;
                    }
                } catch (IOException unused3) {
                    f45872d.m15812m("Failed to read pack version tag for pack %s", str);
                }
            }
        }
        return "";
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m16651b(String str, int i10, long j10, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i10);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        C3112c c3112c = this.f45873a;
        c3112c.getClass();
        File file = new File(new File(c3112c.m8974j(str, i10, j10), "_metadata"), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }
}
