package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class exb extends ewx {

    /* JADX INFO: renamed from: f */
    public static final nbh f20711f = nbh.m17259h("com/google/android/apps/camera/legacy/lightcycle/opengl/Sprite");

    /* JADX INFO: renamed from: h */
    public float f20713h;

    /* JADX INFO: renamed from: i */
    public float f20714i;

    /* JADX INFO: renamed from: k */
    public int f20716k;

    /* JADX INFO: renamed from: n */
    private int f20719n;

    /* JADX INFO: renamed from: g */
    public final Point f20712g = new Point();

    /* JADX INFO: renamed from: j */
    public final float[] f20715j = new float[16];

    /* JADX INFO: renamed from: m */
    private final float[] f20718m = new float[16];

    /* JADX INFO: renamed from: l */
    public boolean f20717l = false;

    /* JADX INFO: renamed from: o */
    private final ArrayList f20720o = new ArrayList();

    @Override // p000.ewx
    /* JADX INFO: renamed from: c */
    public final void mo7961c(float[] fArr) {
    }

    /* JADX INFO: renamed from: e */
    public final void m7974e() {
        ArrayList arrayList = this.f20720o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            luc lucVar = (luc) arrayList.get(i);
            if (lucVar != null) {
                lucVar.m15987e();
            }
        }
        this.f20720o.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m7975f(float[] fArr, float f, float f2, float f3) throws ewy {
        if (!this.f20717l) {
            ((nbe) ((nbe) f20711f.m17251b()).mo17276G((char) 2029)).mo17290o(zuAgeeF.nUToqlJuSlawp);
            return;
        }
        ewz ewzVar = this.f20701e;
        if (ewzVar == null) {
            return;
        }
        ewzVar.m7968c();
        this.f20697a.position(0);
        this.f20698b.position(0);
        this.f20701e.m7972g(this.f20697a);
        this.f20701e.m7970e(this.f20698b);
        Matrix.translateM(this.f20715j, 0, fArr, 0, f, f2, 0.0f);
        Matrix.rotateM(this.f20715j, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        if (f3 != 1.0f) {
            Matrix.scaleM(this.f20715j, 0, f3, f3, f3);
        }
        this.f20701e.m7971f(this.f20715j);
        if (this.f20700d.isEmpty()) {
            return;
        }
        ((luc) this.f20700d.get(0)).m15988f();
        this.f20699c.position(0);
        GLES20.glDrawElements(4, this.f20716k, 5123, this.f20699c);
    }

    /* JADX INFO: renamed from: g */
    public final void m7976g(Context context, int i, float f) {
        luc lucVar = new luc(null, null);
        this.f20700d.add(0, lucVar);
        this.f20720o.add(lucVar);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i, options);
        if (bitmapDecodeResource == null) {
            return;
        }
        this.f20712g.set(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
        try {
            luc lucVar2 = (luc) this.f20700d.get(0);
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i2 = iArr[0];
            lucVar2.f39211a = i2;
            GLES20.glBindTexture(3553, i2);
            GLES20.glTexParameterf(3553, 10241, 9728.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, bitmapDecodeResource, 0);
            ewy.m7963a("Texture : loadBitmap");
            bitmapDecodeResource.recycle();
        } catch (ewy e) {
            e.printStackTrace();
        }
        bitmapDecodeResource.recycle();
        this.f20716k = 6;
        this.f20719n = 4;
        this.f20697a = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i3 = this.f20719n;
        this.f20698b = ByteBuffer.allocateDirect((i3 + i3) * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i4 = this.f20716k;
        this.f20699c = ByteBuffer.allocateDirect(i4 + i4).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.f20697a.clear();
        this.f20698b.clear();
        this.f20699c.clear();
        this.f20713h = this.f20712g.x / 2.0f;
        this.f20714i = this.f20712g.y / 2.0f;
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
        for (int i5 = 0; i5 < 8; i5++) {
            this.f20698b.put(i5, fArr[i5]);
        }
        short[] sArr = {0, 1, 2, 0, 2, 3};
        for (int i6 = 0; i6 < 6; i6++) {
            this.f20699c.put(i6, sArr[i6]);
        }
        Matrix.setIdentityM(this.f20718m, 0);
        float f2 = this.f20713h;
        float f3 = this.f20714i;
        float f4 = -f2;
        float f5 = -f3;
        float[] fArr2 = {f4, f3, f, f2, f3, f, f2, f5, f, f4, f5, f};
        for (int i7 = 0; i7 < 12; i7++) {
            this.f20697a.put(i7, fArr2[i7]);
        }
        this.f20717l = true;
    }
}
