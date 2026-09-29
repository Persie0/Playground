package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class un7 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64109a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f64110b;

    public /* synthetic */ un7(int i, t66 t66Var) {
        this.f64109a = i;
        this.f64110b = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f64109a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f64110b;
        switch (i) {
            case 0:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 1:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 2:
                t66Var.setValue(null);
                return xfaVar;
            case 3:
                t66Var.setValue(jbb.f45386a);
                return xfaVar;
            case 4:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 5:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 6:
                t66Var.setValue(null);
                return xfaVar;
            case 7:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 8:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 9:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 10:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 11:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
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
                if (!((Boolean) t66Var.getValue()).booleanValue()) {
                    t66Var.setValue(Boolean.TRUE);
                }
                return xfaVar;
            case 16:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 17:
                t66Var.setValue(Boolean.TRUE);
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
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 24:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 25:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 26:
                return (aq4) t66Var.getValue();
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                t66Var.setValue(Boolean.FALSE);
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
