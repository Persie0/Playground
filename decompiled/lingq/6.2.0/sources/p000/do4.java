package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class do4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35949a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f35950b;

    public /* synthetic */ do4(int i, t66 t66Var) {
        this.f35949a = i;
        this.f35950b = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f35949a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f35950b;
        switch (i) {
            case 0:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 1:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 2:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 3:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 4:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 5:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 6:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 7:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 8:
                w35 w35Var = (w35) t66Var.getValue();
                v35 v35Var = w35Var instanceof v35 ? (v35) w35Var : null;
                return v35Var != null ? v35Var.f64787e.f63315d : "";
            case 9:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 10:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 11:
                return Integer.valueOf(((String) t66Var.getValue()).length());
            case 12:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 13:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 14:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 15:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 16:
                t66Var.setValue(Boolean.valueOf(!((Boolean) t66Var.getValue()).booleanValue()));
                return xfaVar;
            case 17:
                t66Var.setValue(Boolean.valueOf(!((Boolean) t66Var.getValue()).booleanValue()));
                return xfaVar;
            case 18:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 19:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 20:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 21:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 22:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 24:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 25:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 26:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                t66Var.setValue(Boolean.valueOf(!((Boolean) t66Var.getValue()).booleanValue()));
                return xfaVar;
            case 28:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            default:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
        }
    }
}
