package p000;

import android.graphics.Path;

/* JADX INFO: loaded from: classes2.dex */
public abstract class loa extends koa {

    /* JADX INFO: renamed from: a */
    public f67[] f49949a;

    /* JADX INFO: renamed from: b */
    public String f49950b;

    /* JADX INFO: renamed from: c */
    public int f49951c;

    public loa(loa loaVar) {
        this.f49949a = null;
        this.f49951c = 0;
        this.f49950b = loaVar.f49950b;
        f67[] f67VarArr = loaVar.f49949a;
        f67[] f67VarArr2 = new f67[f67VarArr.length];
        for (int i = 0; i < f67VarArr.length; i++) {
            f67VarArr2[i] = new f67(f67VarArr[i]);
        }
        this.f49949a = f67VarArr2;
    }

    /* JADX INFO: renamed from: c */
    public boolean m16415c() {
        return this instanceof hoa;
    }

    /* JADX INFO: renamed from: d */
    public final void m16416d(Path path) {
        path.reset();
        f67[] f67VarArr = this.f49949a;
        if (f67VarArr != null) {
            f67.m11566b(f67VarArr, path);
        }
    }

    public f67[] getPathData() {
        return this.f49949a;
    }

    public String getPathName() {
        return this.f49950b;
    }

    public void setPathData(f67[] f67VarArr) {
        f67[] f67VarArr2 = this.f49949a;
        if (f67VarArr2 != null && f67VarArr != null && f67VarArr2.length == f67VarArr.length) {
            int i = 0;
            while (true) {
                if (i >= f67VarArr2.length) {
                    f67[] f67VarArr3 = this.f49949a;
                    for (int i2 = 0; i2 < f67VarArr.length; i2++) {
                        f67VarArr3[i2].f38521a = f67VarArr[i2].f38521a;
                        int i3 = 0;
                        while (true) {
                            float[] fArr = f67VarArr[i2].f38522b;
                            if (i3 < fArr.length) {
                                f67VarArr3[i2].f38522b[i3] = fArr[i3];
                                i3++;
                            }
                        }
                    }
                    return;
                }
                f67 f67Var = f67VarArr2[i];
                char c = f67Var.f38521a;
                f67 f67Var2 = f67VarArr[i];
                if (c != f67Var2.f38521a || f67Var.f38522b.length != f67Var2.f38522b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        f67[] f67VarArr4 = new f67[f67VarArr.length];
        for (int i4 = 0; i4 < f67VarArr.length; i4++) {
            f67VarArr4[i4] = new f67(f67VarArr[i4]);
        }
        this.f49949a = f67VarArr4;
    }

    public loa() {
        this.f49949a = null;
        this.f49951c = 0;
    }
}
