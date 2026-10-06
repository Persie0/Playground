package p000;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.SparseIntArray;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lcl extends kzk {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lct f37927a;

    public lcl(lct lctVar) {
        this.f37927a = lctVar;
    }

    @Override // p000.kzk
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo15084b(Object obj) {
        int i;
        ldi ldiVar = (ldi) obj;
        ldiVar.mo15188k();
        int[] iArr = this.f37927a.f37947h;
        if (iArr != null) {
            GLES30.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        lds ldsVar = (lds) this.f37927a.f37950k.mo15164c();
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(35725, iArr2, 0);
        int i2 = iArr2[0];
        int i3 = ldsVar.f37998b;
        if (i2 != i3) {
            GLES20.glUseProgram(i3);
        }
        Iterator it = this.f37927a.f37944e.values().iterator();
        while (it.hasNext()) {
            ((lcs) it.next()).mo15168a(ldsVar);
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (lcr lcrVar : this.f37927a.f37946g) {
            int i4 = ((ldv) lcrVar.f37937a.mo15164c()).f38000c;
            int i5 = sparseIntArray.get(i4, 0);
            int[] iArr3 = new int[1];
            GLES20.glGetIntegerv(35661, iArr3, 0);
            int i6 = iArr3[0];
            if (i5 > i6) {
                throw new IllegalStateException("Attempting to bind " + (i5 + 1) + " textures at once, but only up to " + i6 + " are supported!");
            }
            int i7 = lct.f37940a;
            if (i7 <= 0) {
                int[] iArr4 = new int[1];
                GLES20.glGetTexParameteriv(((ldv) lcrVar.f37937a.mo15164c()).f38000c, 36200, iArr4, 0);
                i7 = iArr4[0];
                if (i7 < 0 || i7 > 3) {
                    throw new IndexOutOfBoundsException("Unit count returned by OpenGL is outside of valid range!");
                }
            }
            sparseIntArray.put(i4, i7 + i5);
            GLES20.glActiveTexture(33984 + i5);
            ((ldv) lcrVar.f37937a.mo15164c()).m15215e();
            GLES20.glUniform1i(((lds) lcrVar.f37939c.f37950k.mo15164c()).m15210b(lcrVar.f37938b), i5);
        }
        ((ldh) this.f37927a.f37942c.f38019a.mo15164c()).m15201b();
        kzg kzgVarM15871p = lqi.m15871p(this.f37927a.f37945f.size());
        try {
            int i8 = ldsVar.f37998b;
            for (Map.Entry entry : this.f37927a.f37945f.entrySet()) {
                String str = (String) entry.getKey();
                int iIntValue = ((Integer) entry.getValue()).intValue();
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(i8, str);
                if (iGlGetAttribLocation != -1) {
                    kzgVarM15871p.add(new lcq(iGlGetAttribLocation));
                    GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
                    boolean z = this.f37927a.f37942c.m15242d(iIntValue).mo15135c() == 4;
                    int iM15241c = this.f37927a.f37942c.m15241c(iIntValue);
                    lay layVarM15242d = this.f37927a.f37942c.m15242d(iIntValue);
                    if (layVarM15242d == lbk.f37868a) {
                        i = 5120;
                    } else if (layVarM15242d == lbk.f37871d) {
                        i = 5121;
                    } else if (layVarM15242d == lbk.f37869b) {
                        i = 5122;
                    } else if (layVarM15242d == lbk.f37872e) {
                        i = 5123;
                    } else if (layVarM15242d == lbk.f37870c) {
                        i = 5124;
                    } else if (layVarM15242d == lbk.f37873f) {
                        i = 5125;
                    } else if (layVarM15242d == lbk.f37874g) {
                        i = 5131;
                    } else {
                        if (layVarM15242d != lbk.f37875h) {
                            throw new IllegalStateException("No Gl type for attribute type ".concat(String.valueOf(String.valueOf(layVarM15242d))));
                        }
                        i = 5126;
                    }
                    int iM15240b = this.f37927a.f37942c.m15240b(iIntValue);
                    lec lecVar = this.f37927a.f37942c;
                    int iM15240b2 = 0;
                    for (int i9 = 0; i9 < iIntValue; i9++) {
                        iM15240b2 += lecVar.m15240b(i9) * lecVar.f38021c;
                    }
                    GLES20.glVertexAttribPointer(iGlGetAttribLocation, iM15241c, i, z, iM15240b, iM15240b2);
                }
            }
            lct lctVar = this.f37927a;
            ldf ldfVar = lctVar.f37943d;
            if (ldfVar != null) {
                ((ldh) ldfVar.f37976a.mo15164c()).m15201b();
                lct lctVar2 = this.f37927a;
                GLES20.glDrawElements(lctVar2.f37941b, lctVar2.f37943d.f37977b, 5123, 0);
            } else {
                GLES20.glDrawArrays(lctVar.f37941b, 0, lctVar.f37942c.f38021c);
            }
            kzgVarM15871p.close();
            if (this.f37927a.f37949j) {
                ldiVar.mo15190m();
            }
        } catch (Throwable th) {
            try {
                kzgVarM15871p.close();
                throw th;
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                } catch (Exception e) {
                    throw th;
                }
            }
        }
    }
}
