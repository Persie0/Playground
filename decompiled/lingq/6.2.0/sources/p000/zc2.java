package p000;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.compose.runtime.AbstractC0278f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zc2 {

    /* JADX INFO: renamed from: a */
    public boolean f71348a;

    /* JADX INFO: renamed from: b */
    public final Object f71349b;

    /* JADX INFO: renamed from: c */
    public Object f71350c;

    /* JADX INFO: renamed from: d */
    public final Object f71351d;

    /* JADX INFO: renamed from: e */
    public Object f71352e;

    /* JADX INFO: renamed from: f */
    public final Object f71353f;

    /* JADX INFO: renamed from: g */
    public Object f71354g;

    /* JADX INFO: renamed from: h */
    public Object f71355h;

    public zc2(int[] iArr, int[] iArr2, zi3 zi3Var) {
        Integer numValueOf;
        this.f71349b = zi3Var;
        this.f71350c = iArr;
        this.f71351d = AbstractC0278f.m1257g(m25549a(iArr));
        this.f71352e = iArr2;
        this.f71353f = AbstractC0278f.m1257g(m25550b(iArr, iArr2));
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    i = i > i3 ? i3 : i;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        this.f71355h = new eu4(numValueOf != null ? numValueOf.intValue() : 0, 90, 200);
    }

    /* JADX INFO: renamed from: a */
    public static int m25549a(int[] iArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 <= 0) {
                return 0;
            }
            if (i > i2) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static int m25550b(int[] iArr, int[] iArr2) {
        int iM25549a = m25549a(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == iM25549a) {
                iMin = Math.min(iMin, iArr2[i]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: c */
    public FileInputStream m25551c(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((bm7) this.f71350c).mo3877i();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m25552d(int i, Serializable serializable) {
        ((Executor) this.f71349b).execute(new yc2(this, i, 0, serializable));
    }

    public zc2(pk7[] pk7VarArr, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, boolean z, String[] strArr5, w83 w83Var) {
        this.f71349b = pk7VarArr;
        this.f71350c = strArr;
        this.f71351d = strArr2;
        this.f71352e = strArr3;
        this.f71353f = strArr4;
        this.f71348a = z;
        this.f71354g = strArr5;
        this.f71355h = w83Var;
    }

    public zc2() {
        this.f71349b = new pk7[0];
        this.f71350c = new String[0];
        this.f71351d = new String[0];
        this.f71352e = new String[0];
        this.f71353f = new String[0];
        this.f71348a = false;
        this.f71354g = new String[0];
        this.f71355h = new w83();
    }

    public zc2(AssetManager assetManager, Executor executor, bm7 bm7Var, String str, File file) {
        byte[] bArr;
        this.f71348a = false;
        this.f71349b = executor;
        this.f71350c = bm7Var;
        this.f71354g = str;
        this.f71353f = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = b34.f7842c;
        } else {
            bArr = (i == 29 || i == 30) ? b34.f7843d : null;
        }
        this.f71351d = bArr;
    }
}
