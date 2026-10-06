package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class atn extends asp {

    /* JADX INFO: renamed from: m */
    protected acs[] f2334m;

    /* JADX INFO: renamed from: n */
    String f2335n;

    /* JADX INFO: renamed from: o */
    int f2336o;

    /* JADX INFO: renamed from: p */
    int f2337p;

    public atn() {
        this.f2334m = null;
        this.f2336o = 0;
    }

    public atn(atn atnVar) {
        this.f2334m = null;
        this.f2336o = 0;
        this.f2335n = atnVar.f2335n;
        int i = atnVar.f2337p;
        this.f2337p = 0;
        this.f2334m = aau.m57f(atnVar.f2334m);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo1985d() {
        return false;
    }

    public acs[] getPathData() {
        return this.f2334m;
    }

    public String getPathName() {
        return this.f2335n;
    }

    public void setPathData(acs[] acsVarArr) {
        acs[] acsVarArr2 = this.f2334m;
        if (acsVarArr2 != null && acsVarArr != null) {
            if (acsVarArr2.length == acsVarArr.length) {
                for (int i = 0; i < acsVarArr2.length; i++) {
                    acs acsVar = acsVarArr2[i];
                    char c = acsVar.f107a;
                    acs acsVar2 = acsVarArr[i];
                    if (c == acsVar2.f107a && acsVar.f108b.length == acsVar2.f108b.length) {
                    }
                }
                acs[] acsVarArr3 = this.f2334m;
                for (int i2 = 0; i2 < acsVarArr.length; i2++) {
                    acsVarArr3[i2].f107a = acsVarArr[i2].f107a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = acsVarArr[i2].f108b;
                        if (i3 < fArr.length) {
                            acsVarArr3[i2].f108b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.f2334m = aau.m57f(acsVarArr);
    }
}
