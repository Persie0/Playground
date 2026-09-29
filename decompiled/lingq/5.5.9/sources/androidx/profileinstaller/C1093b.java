package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import p169i4.C6176b;
import p169i4.C6181g;
import p208k.ExecutorC6558a;

/* JADX INFO: renamed from: androidx.profileinstaller.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1093b {

    /* JADX INFO: renamed from: a */
    public final Executor f6883a;

    /* JADX INFO: renamed from: b */
    public final C1094c.c f6884b;

    /* JADX INFO: renamed from: c */
    public final byte[] f6885c;

    /* JADX INFO: renamed from: d */
    public final File f6886d;

    /* JADX INFO: renamed from: e */
    public final String f6887e;

    /* JADX INFO: renamed from: f */
    public boolean f6888f = false;

    /* JADX INFO: renamed from: g */
    public C6176b[] f6889g;

    /* JADX INFO: renamed from: h */
    public byte[] f6890h;

    public C1093b(AssetManager assetManager, ExecutorC6558a executorC6558a, C1094c.c cVar, String str, File file) {
        byte[] bArr;
        this.f6883a = executorC6558a;
        this.f6884b = cVar;
        this.f6887e = str;
        this.f6886d = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 33) {
            switch (i10) {
                case 26:
                    bArr = C6181g.f36035d;
                    break;
                case 27:
                    bArr = C6181g.f36034c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C6181g.f36033b;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = C6181g.f36032a;
                    break;
            }
            this.f6885c = bArr;
        }
        bArr = null;
        this.f6885c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m4046a(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f6884b.mo4041a();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4047b(final int i10, final Serializable serializable) {
        this.f6883a.execute(new Runnable() { // from class: i4.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f36014a.f6884b.mo4042b(i10, serializable);
            }
        });
    }
}
