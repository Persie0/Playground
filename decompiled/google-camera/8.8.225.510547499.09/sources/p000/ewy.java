package p000;

import android.opengl.GLES20;
import android.opengl.GLU;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ewy extends Exception {

    /* JADX INFO: renamed from: a */
    private static final nbh f20704a = nbh.m17259h("com/google/android/apps/camera/legacy/lightcycle/opengl/OpenGLException");

    public ewy(String str) {
        super(str);
        ((nbe) ((nbe) ((nbe) f20704a.m17251b()).mo17283h(this)).mo17276G((char) 2027)).mo17293r("%s", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m7963a(String str) throws ewy {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new ewy(str + ": glError " + GLU.gluErrorString(iGlGetError) + " " + iGlGetError);
    }

    public ewy(String str, String str2) {
        super(str);
        ((nbe) ((nbe) ((nbe) f20704a.m17251b()).mo17283h(this)).mo17276G(2028)).mo17301z("%s : %s", str, str2);
    }
}
