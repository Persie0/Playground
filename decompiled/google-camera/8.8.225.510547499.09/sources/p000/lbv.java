package p000;

import android.opengl.GLES20;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lbv implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f37895a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f37896b;

    public lbv(Runnable runnable, int i) {
        this.f37896b = i;
        this.f37895a = runnable;
    }

    public lbv(lgb lgbVar, int i) {
        this.f37896b = i;
        this.f37895a = lgbVar;
    }

    public lbv(lpe lpeVar, int i, byte[] bArr, byte[] bArr2) {
        this.f37896b = i;
        this.f37895a = lpeVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lgb] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lgb] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f37896b) {
            case 0:
                return ldp.m15206c(this.f37895a);
            case 1:
                this.f37895a.run();
                return kyy.f37751a;
            case 2:
                return ldp.m15206c(this.f37895a);
            default:
                lds ldsVar = new lds(GLES20.glCreateProgram());
                try {
                    try {
                        Iterator it = ((kzd) ((lpe) this.f37895a).f38883b).iterator();
                        while (it.hasNext()) {
                            GLES20.glAttachShader(ldsVar.f37998b, ((ldt) ((ldx) ((lgb) it.next()).mo15294c()).mo15164c()).f37998b);
                        }
                        GLES20.glLinkProgram(ldsVar.f37998b);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(ldsVar.f37998b, 35714, iArr, 0);
                        if (iArr[0] == 0) {
                            throw new lee(GLES20.glGetProgramInfoLog(ldsVar.f37998b));
                        }
                        Iterator it2 = ((kzd) ((lpe) this.f37895a).f38883b).iterator();
                        while (it2.hasNext()) {
                            GLES20.glDetachShader(ldsVar.f37998b, ((ldt) ((ldx) ((lgb) it2.next()).mo15294c()).mo15164c()).f37998b);
                        }
                        ((kzg) ((lpe) this.f37895a).f38883b).close();
                        return ldsVar;
                    } catch (Exception e) {
                        ldsVar.close();
                        throw e;
                    }
                } catch (Throwable th) {
                    ((kzg) ((lpe) this.f37895a).f38883b).close();
                    throw th;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lgb] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, lgb] */
    public final String toString() {
        switch (this.f37896b) {
            case 0:
                ((ldz) this.f37895a.mo15294c()).m15229b();
                return "createCanvasForTexture(RGBA8888)";
            case 1:
                return this.f37895a.toString();
            case 2:
                ((ldz) this.f37895a.mo15294c()).m15229b();
                return "createCanvasForTexture(RGBA8888)";
            default:
                return "linkProgram(n=" + ((kzd) ((lpe) this.f37895a).f38883b).size() + ")";
        }
    }
}
