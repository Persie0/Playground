package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ofr {
    GVR_BETA_FEATURE_DAYDREAM_6DOF_CONTROLLER(1000, "com.google.vr.beta.daydream_6dof_controller"),
    GVR_BETA_FEATURE_SEE_THROUGH(1001, "com.google.vr.beta.cameraSeeThrough");


    /* JADX INFO: renamed from: c */
    public final int f45873c;

    /* JADX INFO: renamed from: d */
    public final String f45874d;

    ofr(int i, String str) {
        this.f45873c = i;
        this.f45874d = str;
    }

    /* JADX INFO: renamed from: a */
    public static ofr[] m18468a(int[] iArr) {
        ofr ofrVar;
        if (iArr == null) {
            return new ofr[0];
        }
        int length = iArr.length;
        ofr[] ofrVarArr = new ofr[length];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            ofr[] ofrVarArrValues = values();
            int length2 = ofrVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    ofrVar = null;
                    break;
                }
                ofrVar = ofrVarArrValues[i3];
                if (ofrVar.f45873c == i2) {
                    break;
                }
                i3++;
            }
            ofrVarArr[i] = ofrVar;
        }
        return ofrVarArr;
    }
}
