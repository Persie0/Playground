package p000;

import android.content.res.TypedArray;
import android.util.SparseArray;
import com.google.android.material.R$styleable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class xh0 {

    /* JADX INFO: renamed from: a */
    public int f68192a;

    /* JADX INFO: renamed from: b */
    public int f68193b;

    /* JADX INFO: renamed from: c */
    public final Object f68194c;

    /* JADX INFO: renamed from: d */
    public Object f68195d;

    public xh0(xh0 xh0Var) {
        float[] fArr = (float[]) xh0Var.f68194c;
        this.f68192a = fArr.length / 3;
        this.f68194c = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        float[] fArr2 = (float[]) xh0Var.f68195d;
        this.f68195d = (FloatBuffer) ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr2).flip();
        int i = xh0Var.f68193b;
        if (i == 1) {
            this.f68193b = 5;
        } else if (i != 2) {
            this.f68193b = 4;
        } else {
            this.f68193b = 6;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24515a(int i, int i2, int i3, int i4) {
        int i5 = this.f68193b;
        if (i < 0) {
            int i6 = this.f68192a;
            i += i6;
            i2 += 4 - ((i6 + 4) % 8);
        }
        if (i2 < 0) {
            i2 += i5;
            i += 4 - ((i5 + 4) % 8);
        }
        ((byte[]) this.f68195d)[(i * i5) + i2] = (byte) ((((String) this.f68194c).charAt(i3) & (1 << (8 - i4))) == 0 ? 0 : 1);
    }

    /* JADX INFO: renamed from: b */
    public void m24516b(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m24515a(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m24515a(i4, i6, i3, 2);
        int i7 = i - 1;
        m24515a(i7, i5, i3, 3);
        m24515a(i7, i6, i3, 4);
        m24515a(i7, i2, i3, 5);
        m24515a(i, i5, i3, 6);
        m24515a(i, i6, i3, 7);
        m24515a(i, i2, i3, 8);
    }

    public xh0(int i, int i2, float[] fArr, float[] fArr2) {
        this.f68192a = i;
        bna.m3969q(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f68194c = fArr;
        this.f68195d = fArr2;
        this.f68193b = i2;
    }

    public xh0(String str, int i, int i2) {
        this.f68194c = str;
        this.f68193b = i;
        this.f68192a = i2;
        byte[] bArr = new byte[i * i2];
        this.f68195d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public xh0(is2 is2Var, sq5 sq5Var) {
        this.f68194c = new SparseArray();
        this.f68195d = is2Var;
        int i = R$styleable.TextInputLayout_endIconDrawable;
        TypedArray typedArray = (TypedArray) sq5Var.f61249c;
        this.f68192a = typedArray.getResourceId(i, 0);
        this.f68193b = typedArray.getResourceId(R$styleable.TextInputLayout_passwordToggleDrawable, 0);
    }

    public xh0(int i) {
        this.f68194c = new h8a[i];
        this.f68193b = 0;
    }
}
