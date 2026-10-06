package p000;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class exq extends ewx {

    /* JADX INFO: renamed from: f */
    public exa f20863f;

    /* JADX INFO: renamed from: g */
    private int f20864g;

    public exq() {
        this.f20864g = 0;
        try {
            exa exaVar = new exa();
            this.f20863f = exaVar;
            exaVar.m7973j(ews.f20686d);
            this.f20697a = ByteBuffer.allocateDirect(58800).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f20699c = ByteBuffer.allocateDirect(9800).order(ByteOrder.nativeOrder()).asShortBuffer();
            this.f20698b = ByteBuffer.allocateDirect(39200).order(ByteOrder.nativeOrder()).asFloatBuffer();
            short s = 0;
            float f = -5.1000004f;
            short s2 = 0;
            for (int i = 0; i < 35; i++) {
                float f2 = -5.1000004f;
                for (int i2 = 0; i2 < 35; i2++) {
                    m7962d(s2, f - 0.030000001f, f2);
                    short s3 = (short) (s2 + 1);
                    m7962d(s3, f + 0.030000001f, f2);
                    short s4 = (short) (s3 + 1);
                    m7962d(s4, f, (-0.030000001f) + f2);
                    short s5 = (short) (s4 + 1);
                    int i3 = s5 + 1;
                    m7962d(s5, f, 0.030000001f + f2);
                    for (int i4 = 0; i4 < 4; i4++) {
                        this.f20699c.put(s, (short) (s2 + i4));
                        s = (short) (s + 1);
                    }
                    s2 = (short) i3;
                    f2 += 0.3f;
                }
                f += 0.3f;
            }
            this.f20864g = s;
        } catch (ewy e) {
            e.printStackTrace();
        }
    }

    @Override // p000.ewx
    /* JADX INFO: renamed from: c */
    public final void mo7961c(float[] fArr) {
        this.f20863f.m7968c();
        this.f20863f.m7973j(ews.f20686d);
        this.f20863f.m7972g(this.f20697a);
        this.f20863f.m7970e(this.f20698b);
        this.f20863f.m7971f(fArr);
        this.f20699c.position(0);
        GLES20.glDrawElements(1, this.f20864g, 5123, this.f20699c);
    }
}
