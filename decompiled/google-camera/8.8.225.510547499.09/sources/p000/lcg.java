package p000;

import android.opengl.GLES20;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lcg implements Runnable {

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f37919d;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ lcg f37918c = new lcg(3);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ lcg f37917b = new lcg(2);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ lcg f37916a = new lcg(0);

    public /* synthetic */ lcg(int i) {
        this.f37919d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37919d) {
            case 0:
                GLES20.glFlush();
                return;
            case 1:
                return;
            case 2:
                lpv.m15842g();
                return;
            case 3:
                throw new IllegalStateException(hsSUWRJfoeC.ADIBszwLKJZO);
            case 4:
            default:
                return;
        }
    }
}
