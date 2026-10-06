package p000;

import android.opengl.GLES20;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ldw implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f38005a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f38006b;

    public ldw(int i, String str) {
        this.f38005a = i;
        this.f38006b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        lgb lgbVarM14876o = kua.m14876o(new ldt(GLES20.glCreateShader(this.f38005a), this.f38006b));
        try {
            ldt ldtVar = (ldt) lgbVarM14876o.mo15294c();
            GLES20.glCompileShader(ldtVar.f37998b);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(ldtVar.f37998b, 35713, iArr, 0);
            if (iArr[0] == 0) {
                throw new lef(GLES20.glGetShaderInfoLog(ldtVar.f37998b));
            }
            ldt ldtVar2 = (ldt) lgbVarM14876o.mo15295cm();
            lgbVarM14876o.close();
            return ldtVar2;
        } catch (Throwable th) {
            try {
                lgbVarM14876o.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception e) {
                }
            }
            throw th;
        }
    }

    public final String toString() {
        return "createShader(" + this.f38005a + ")";
    }
}
