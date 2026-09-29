package p451w7;

import com.facebook.appevents.p050ml.ModelManager;
import dm.C5207g;
import p173i8.C6205a;

/* JADX INFO: renamed from: w7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9819a {

    /* JADX INFO: renamed from: a */
    public static final C9819a f49984a = new C9819a();

    /* JADX INFO: renamed from: b */
    public static boolean f49985b;

    /* JADX INFO: renamed from: c */
    public static boolean f49986c;

    /* JADX INFO: renamed from: a */
    public final boolean m18304a(String str) {
        String str2;
        if (C6205a.m12742b(this)) {
            return false;
        }
        try {
            String str3 = null;
            if (!C6205a.m12742b(this)) {
                try {
                    float[] fArr = new float[30];
                    for (int i10 = 0; i10 < 30; i10++) {
                        fArr[i10] = 0.0f;
                    }
                    ModelManager modelManager = ModelManager.f11524a;
                    String[] strArrM6650f = ModelManager.m6650f(ModelManager.Task.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
                    str3 = (strArrM6650f == null || (str2 = strArrM6650f[0]) == null) ? "none" : str2;
                } catch (Throwable th2) {
                    C6205a.m12741a(this, th2);
                }
            }
            return !C5207g.m11106a("none", str3);
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
            return false;
        }
    }
}
