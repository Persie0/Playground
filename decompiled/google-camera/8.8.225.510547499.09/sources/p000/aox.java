package p000;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.wear.ambient.AmbientMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aox {

    /* JADX INFO: renamed from: a */
    public final AssetManager f1941a;

    /* JADX INFO: renamed from: b */
    public final byte[] f1942b;

    /* JADX INFO: renamed from: c */
    public final File f1943c;

    /* JADX INFO: renamed from: d */
    public final String f1944d;

    /* JADX INFO: renamed from: h */
    public aoy[] f1948h;

    /* JADX INFO: renamed from: i */
    public byte[] f1949i;

    /* JADX INFO: renamed from: j */
    public final AmbientMode.AmbientController f1950j;

    /* JADX INFO: renamed from: k */
    private final Executor f1951k;

    /* JADX INFO: renamed from: g */
    public boolean f1947g = false;

    /* JADX INFO: renamed from: e */
    public final String f1945e = "dexopt/baseline.prof";

    /* JADX INFO: renamed from: f */
    public final String f1946f = "dexopt/baseline.profm";

    public aox(AssetManager assetManager, Executor executor, AmbientMode.AmbientController ambientController, String str, File file, byte[] bArr) {
        this.f1941a = assetManager;
        this.f1951k = executor;
        this.f1950j = ambientController;
        this.f1944d = str;
        this.f1943c = file;
        byte[] bArr2 = null;
        if (Build.VERSION.SDK_INT <= 33) {
            switch (Build.VERSION.SDK_INT) {
                case 33:
                    bArr2 = ape.f1982a;
                    break;
            }
        }
        this.f1942b = bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static final InputStream m1782c(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            return (message == null || !message.contains("compressed")) ? null : null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1783a() {
        if (!this.f1947g) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1784b(int i, Object obj) {
        this.f1951k.execute(new RunnableC0904pi(this, i, obj, 3));
    }
}
