package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;

/* JADX INFO: renamed from: yk */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3799yk implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69923a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f69924b;

    public /* synthetic */ C3799yk(int i, t66 t66Var) {
        this.f69923a = i;
        this.f69924b = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f69923a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f69924b;
        switch (i) {
            case 0:
                aq4 aq4Var = (aq4) t66Var.getValue();
                if (aq4Var != null) {
                    return aq4Var;
                }
                l54.m15817d("Required value was null.");
                C3386nv.m17631r();
                return null;
            case 1:
                aq4 aq4Var2 = (aq4) t66Var.getValue();
                if (aq4Var2 != null) {
                    return aq4Var2;
                }
                l54.m15817d("Required value was null.");
                C3386nv.m17631r();
                return null;
            case 2:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 3:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 4:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 5:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 6:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 7:
                return Integer.valueOf(((String) t66Var.getValue()).length());
            case 8:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 9:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 10:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 11:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 12:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 13:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 14:
                t66Var.setValue(Boolean.valueOf(!((Boolean) t66Var.getValue()).booleanValue()));
                return xfaVar;
            case 15:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 16:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 17:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 18:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 19:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 20:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 21:
                t66Var.setValue(null);
                return xfaVar;
            case 22:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 24:
                t66Var.setValue(null);
                return xfaVar;
            case 25:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 26:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 28:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            default:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
        }
    }
}
