package p000;

import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xa0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67985a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f67986b;

    public /* synthetic */ xa0(int i, ui3 ui3Var) {
        this.f67985a = i;
        this.f67986b = ui3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f67985a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f67986b;
        switch (i) {
            case 0:
                ui3Var.mo0a();
                return xfaVar;
            case 1:
                ui3Var.mo0a();
                return Boolean.TRUE;
            case 2:
                ui3Var.mo0a();
                return xfaVar;
            case 3:
                ui3Var.mo0a();
                return xfaVar;
            case 4:
                ui3Var.mo0a();
                return xfaVar;
            case 5:
                ui3Var.mo0a();
                return xfaVar;
            case 6:
                ui3Var.mo0a();
                return xfaVar;
            case 7:
                ui3Var.mo0a();
                return xfaVar;
            case 8:
                ui3Var.mo0a();
                return xfaVar;
            case 9:
                ui3Var.mo0a();
                return xfaVar;
            case 10:
                ui3Var.mo0a();
                return xfaVar;
            case 11:
                ui3Var.mo0a();
                return xfaVar;
            case 12:
                ui3Var.mo0a();
                return xfaVar;
            case 13:
                ui3Var.mo0a();
                return xfaVar;
            case 14:
                ui3Var.mo0a();
                return xfaVar;
            case 15:
                ui3Var.mo0a();
                return xfaVar;
            case 16:
                ui3Var.mo0a();
                return xfaVar;
            case 17:
                ui3Var.mo0a();
                return xfaVar;
            case 18:
                ui3Var.mo0a();
                return xfaVar;
            case 19:
                ui3Var.mo0a();
                return xfaVar;
            case 20:
                ui3Var.mo0a();
                return xfaVar;
            case 21:
                ui3Var.mo0a();
                return xfaVar;
            case 22:
                ui3Var.mo0a();
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ui3Var.mo0a();
                return xfaVar;
            case 24:
                ui3Var.mo0a();
                return xfaVar;
            case 25:
                ui3Var.mo0a();
                return xfaVar;
            case 26:
                return PreferenceDataStoreFactory.createWithPath$lambda$0(ui3Var);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                float fFloatValue = ((Number) ui3Var.mo0a()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(fFloatValue);
            case 28:
                ui3Var.mo0a();
                return xfaVar;
            default:
                ui3Var.mo0a();
                return xfaVar;
        }
    }
}
