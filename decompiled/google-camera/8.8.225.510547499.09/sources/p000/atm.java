package p000;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class atm extends asp {

    /* JADX INFO: renamed from: a */
    final Matrix f2321a;

    /* JADX INFO: renamed from: b */
    final ArrayList f2322b;

    /* JADX INFO: renamed from: c */
    float f2323c;

    /* JADX INFO: renamed from: d */
    public float f2324d;

    /* JADX INFO: renamed from: e */
    public float f2325e;

    /* JADX INFO: renamed from: f */
    public float f2326f;

    /* JADX INFO: renamed from: g */
    public float f2327g;

    /* JADX INFO: renamed from: h */
    public float f2328h;

    /* JADX INFO: renamed from: i */
    public float f2329i;

    /* JADX INFO: renamed from: j */
    final Matrix f2330j;

    /* JADX INFO: renamed from: k */
    int f2331k;

    /* JADX INFO: renamed from: l */
    public int[] f2332l;

    /* JADX INFO: renamed from: m */
    public String f2333m;

    public atm() {
        this.f2321a = new Matrix();
        this.f2322b = new ArrayList();
        this.f2323c = 0.0f;
        this.f2324d = 0.0f;
        this.f2325e = 0.0f;
        this.f2326f = 1.0f;
        this.f2327g = 1.0f;
        this.f2328h = 0.0f;
        this.f2329i = 0.0f;
        this.f2330j = new Matrix();
        this.f2333m = null;
    }

    @Override // p000.asp
    /* JADX INFO: renamed from: b */
    public final boolean mo1969b() {
        for (int i = 0; i < this.f2322b.size(); i++) {
            if (((asp) this.f2322b.get(i)).mo1969b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.asp
    /* JADX INFO: renamed from: c */
    public final boolean mo1970c(int[] iArr) {
        boolean zMo1970c = false;
        for (int i = 0; i < this.f2322b.size(); i++) {
            zMo1970c |= ((asp) this.f2322b.get(i)).mo1970c(iArr);
        }
        return zMo1970c;
    }

    /* JADX INFO: renamed from: d */
    public final void m1986d() {
        this.f2330j.reset();
        this.f2330j.postTranslate(-this.f2324d, -this.f2325e);
        this.f2330j.postScale(this.f2326f, this.f2327g);
        this.f2330j.postRotate(this.f2323c, 0.0f, 0.0f);
        this.f2330j.postTranslate(this.f2328h + this.f2324d, this.f2329i + this.f2325e);
    }

    public String getGroupName() {
        return this.f2333m;
    }

    public Matrix getLocalMatrix() {
        return this.f2330j;
    }

    public float getPivotX() {
        return this.f2324d;
    }

    public float getPivotY() {
        return this.f2325e;
    }

    public float getRotation() {
        return this.f2323c;
    }

    public float getScaleX() {
        return this.f2326f;
    }

    public float getScaleY() {
        return this.f2327g;
    }

    public float getTranslateX() {
        return this.f2328h;
    }

    public float getTranslateY() {
        return this.f2329i;
    }

    public void setPivotX(float f) {
        if (f != this.f2324d) {
            this.f2324d = f;
            m1986d();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f2325e) {
            this.f2325e = f;
            m1986d();
        }
    }

    public void setRotation(float f) {
        if (f != this.f2323c) {
            this.f2323c = f;
            m1986d();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f2326f) {
            this.f2326f = f;
            m1986d();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f2327g) {
            this.f2327g = f;
            m1986d();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f2328h) {
            this.f2328h = f;
            m1986d();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f2329i) {
            this.f2329i = f;
            m1986d();
        }
    }

    public atm(atm atmVar, C1109wy c1109wy) {
        atn atkVar;
        this.f2321a = new Matrix();
        this.f2322b = new ArrayList();
        this.f2323c = 0.0f;
        this.f2324d = 0.0f;
        this.f2325e = 0.0f;
        this.f2326f = 1.0f;
        this.f2327g = 1.0f;
        this.f2328h = 0.0f;
        this.f2329i = 0.0f;
        Matrix matrix = new Matrix();
        this.f2330j = matrix;
        this.f2333m = null;
        this.f2323c = atmVar.f2323c;
        this.f2324d = atmVar.f2324d;
        this.f2325e = atmVar.f2325e;
        this.f2326f = atmVar.f2326f;
        this.f2327g = atmVar.f2327g;
        this.f2328h = atmVar.f2328h;
        this.f2329i = atmVar.f2329i;
        int[] iArr = atmVar.f2332l;
        this.f2332l = null;
        String str = atmVar.f2333m;
        this.f2333m = str;
        int i = atmVar.f2331k;
        this.f2331k = 0;
        if (str != null) {
            c1109wy.put(str, this);
        }
        matrix.set(atmVar.f2330j);
        ArrayList arrayList = atmVar.f2322b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof atm) {
                this.f2322b.add(new atm((atm) obj, c1109wy));
            } else {
                if (obj instanceof atl) {
                    atkVar = new atl((atl) obj);
                } else if (obj instanceof atk) {
                    atkVar = new atk((atk) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f2322b.add(atkVar);
                Object obj2 = atkVar.f2335n;
                if (obj2 != null) {
                    c1109wy.put(obj2, atkVar);
                }
            }
        }
    }
}
