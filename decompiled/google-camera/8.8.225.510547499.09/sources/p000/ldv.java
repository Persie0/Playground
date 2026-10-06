package p000;

import android.graphics.Bitmap;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ldv extends ldr implements ldq {

    /* JADX INFO: renamed from: a */
    public final leb f37999a;

    /* JADX INFO: renamed from: c */
    public final int f38000c;

    /* JADX INFO: renamed from: d */
    public final ldd f38001d;

    /* JADX INFO: renamed from: e */
    public boolean f38002e;

    /* JADX INFO: renamed from: f */
    public final lbl f38003f;

    /* JADX INFO: renamed from: g */
    private final int f38004g;

    public ldv(leb lebVar, int i, int i2, lbl lblVar) {
        super(i);
        this.f38002e = false;
        lku.m15669w(true);
        this.f37999a = lebVar;
        this.f38003f = lblVar;
        this.f38000c = i2;
        this.f38001d = ldd.m15198a();
        if (!ldd.m15199b()) {
            this.f38004g = 1;
            return;
        }
        kzh kzhVar = lblVar.f37877a;
        int iM17515a = kzhVar.f37770a.m17515a(0);
        int i3 = 1;
        while (true) {
            nnb nnbVar = kzhVar.f37770a;
            if (i3 >= nnbVar.f43928a) {
                this.f38004g = kxk.m14999aq(iM17515a, RoundingMode.DOWN) + 1;
                return;
            } else {
                if (nnbVar.m17515a(i3) > iM17515a) {
                    iM17515a = kzhVar.f37770a.m17515a(i3);
                }
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m15211b() {
        int[] iArr = new int[1];
        GLES30.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    /* JADX INFO: renamed from: g */
    public static void m15212g(boolean z) {
        if (z) {
            GLES30.glTexParameteri(3553, 10240, 9729);
            GLES30.glTexParameteri(3553, 10241, 9729);
        } else {
            GLES30.glTexParameteri(3553, 10240, 9728);
            GLES30.glTexParameteri(3553, 10241, 9728);
        }
        GLES30.glTexParameteri(3553, 10242, 33071);
        GLES30.glTexParameteri(3553, 10243, 33071);
    }

    /* JADX INFO: renamed from: h */
    public static ldv m15213h(leb lebVar, lbl lblVar) {
        return new ldv(lebVar, m15211b(), 3553, lblVar);
    }

    @Override // p000.ldr
    /* JADX INFO: renamed from: c */
    protected void mo15202c() {
        GLES30.glDeleteTextures(1, new int[]{this.f37998b}, 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m15214d() {
        lku.m15613H(!this.f38002e);
        GLES30.glTexStorage2D(this.f38000c, this.f38004g, 32856, this.f38003f.f37877a.m15089b(), this.f38003f.f37877a.m15088a());
        this.f38002e = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m15215e() {
        GLES30.glBindTexture(this.f38000c, this.f37998b);
    }

    /* JADX INFO: renamed from: f */
    public final void m15216f(Bitmap bitmap) {
        lku.m15613H(this.f38002e);
        GLUtils.texSubImage2D(this.f38000c, 0, 0, 0, bitmap);
    }
}
