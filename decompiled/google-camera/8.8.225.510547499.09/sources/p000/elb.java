package p000;

import android.opengl.Matrix;
import com.google.android.libraries.vision.opengl.Texture;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elb {

    /* JADX INFO: renamed from: a */
    public static final FloatBuffer f14539a = lle.m15690j(lku.m15631a(-1.0f, -1.0f));

    /* JADX INFO: renamed from: b */
    public static final FloatBuffer f14540b = lle.m15690j(lku.m15631a(0.0f, 0.0f));

    /* JADX INFO: renamed from: c */
    public Texture f14541c = null;

    /* JADX INFO: renamed from: d */
    public final float[] f14542d;

    /* JADX INFO: renamed from: e */
    public final float[] f14543e;

    /* JADX INFO: renamed from: f */
    public luq f14544f;

    /* JADX INFO: renamed from: g */
    public oyo f14545g;

    /* JADX INFO: renamed from: h */
    public oyo f14546h;

    /* JADX INFO: renamed from: i */
    public oyo f14547i;

    /* JADX INFO: renamed from: j */
    public oyo f14548j;

    /* JADX INFO: renamed from: k */
    public oyo f14549k;

    public elb() {
        float[] fArr = new float[16];
        this.f14542d = fArr;
        float[] fArr2 = new float[16];
        this.f14543e = fArr2;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
    }
}
