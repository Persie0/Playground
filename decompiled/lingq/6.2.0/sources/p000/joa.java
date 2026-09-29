package p000;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class joa extends koa {

    /* JADX INFO: renamed from: a */
    public final Matrix f45925a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f45926b;

    /* JADX INFO: renamed from: c */
    public float f45927c;

    /* JADX INFO: renamed from: d */
    public float f45928d;

    /* JADX INFO: renamed from: e */
    public float f45929e;

    /* JADX INFO: renamed from: f */
    public float f45930f;

    /* JADX INFO: renamed from: g */
    public float f45931g;

    /* JADX INFO: renamed from: h */
    public float f45932h;

    /* JADX INFO: renamed from: i */
    public float f45933i;

    /* JADX INFO: renamed from: j */
    public final Matrix f45934j;

    /* JADX INFO: renamed from: k */
    public String f45935k;

    public joa(joa joaVar, C3275kv c3275kv) {
        loa hoaVar;
        this.f45925a = new Matrix();
        this.f45926b = new ArrayList();
        this.f45927c = 0.0f;
        this.f45928d = 0.0f;
        this.f45929e = 0.0f;
        this.f45930f = 1.0f;
        this.f45931g = 1.0f;
        this.f45932h = 0.0f;
        this.f45933i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45934j = matrix;
        this.f45935k = null;
        this.f45927c = joaVar.f45927c;
        this.f45928d = joaVar.f45928d;
        this.f45929e = joaVar.f45929e;
        this.f45930f = joaVar.f45930f;
        this.f45931g = joaVar.f45931g;
        this.f45932h = joaVar.f45932h;
        this.f45933i = joaVar.f45933i;
        String str = joaVar.f45935k;
        this.f45935k = str;
        if (str != null) {
            c3275kv.put(str, this);
        }
        matrix.set(joaVar.f45934j);
        ArrayList arrayList = joaVar.f45926b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof joa) {
                this.f45926b.add(new joa((joa) obj, c3275kv));
            } else {
                if (obj instanceof ioa) {
                    hoaVar = new ioa((ioa) obj);
                } else {
                    if (!(obj instanceof hoa)) {
                        C3386nv.m17633t("Unknown object in the tree!");
                        throw null;
                    }
                    hoaVar = new hoa((hoa) obj);
                }
                this.f45926b.add(hoaVar);
                Object obj2 = hoaVar.f49950b;
                if (obj2 != null) {
                    c3275kv.put(obj2, hoaVar);
                }
            }
        }
    }

    @Override // p000.koa
    /* JADX INFO: renamed from: a */
    public final boolean mo14054a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f45926b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((koa) arrayList.get(i)).mo14054a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p000.koa
    /* JADX INFO: renamed from: b */
    public final boolean mo14055b(int[] iArr) {
        int i = 0;
        boolean zMo14055b = false;
        while (true) {
            ArrayList arrayList = this.f45926b;
            if (i >= arrayList.size()) {
                return zMo14055b;
            }
            zMo14055b |= ((koa) arrayList.get(i)).mo14055b(iArr);
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14573c() {
        Matrix matrix = this.f45934j;
        matrix.reset();
        matrix.postTranslate(-this.f45928d, -this.f45929e);
        matrix.postScale(this.f45930f, this.f45931g);
        matrix.postRotate(this.f45927c, 0.0f, 0.0f);
        matrix.postTranslate(this.f45932h + this.f45928d, this.f45933i + this.f45929e);
    }

    public String getGroupName() {
        return this.f45935k;
    }

    public Matrix getLocalMatrix() {
        return this.f45934j;
    }

    public float getPivotX() {
        return this.f45928d;
    }

    public float getPivotY() {
        return this.f45929e;
    }

    public float getRotation() {
        return this.f45927c;
    }

    public float getScaleX() {
        return this.f45930f;
    }

    public float getScaleY() {
        return this.f45931g;
    }

    public float getTranslateX() {
        return this.f45932h;
    }

    public float getTranslateY() {
        return this.f45933i;
    }

    public void setPivotX(float f) {
        if (f != this.f45928d) {
            this.f45928d = f;
            m14573c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f45929e) {
            this.f45929e = f;
            m14573c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f45927c) {
            this.f45927c = f;
            m14573c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f45930f) {
            this.f45930f = f;
            m14573c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f45931g) {
            this.f45931g = f;
            m14573c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f45932h) {
            this.f45932h = f;
            m14573c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f45933i) {
            this.f45933i = f;
            m14573c();
        }
    }

    public joa() {
        this.f45925a = new Matrix();
        this.f45926b = new ArrayList();
        this.f45927c = 0.0f;
        this.f45928d = 0.0f;
        this.f45929e = 0.0f;
        this.f45930f = 1.0f;
        this.f45931g = 1.0f;
        this.f45932h = 0.0f;
        this.f45933i = 0.0f;
        this.f45934j = new Matrix();
        this.f45935k = null;
    }
}
