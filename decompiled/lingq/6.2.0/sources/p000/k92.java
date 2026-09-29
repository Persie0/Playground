package p000;

import androidx.compose.material3.AbstractC0218a;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k92 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46886a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f46887b;

    public /* synthetic */ k92(int i, ui3 ui3Var) {
        this.f46886a = i;
        this.f46887b = ui3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f46886a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f46887b;
        switch (i) {
            case 0:
                return Float.valueOf(AbstractC0218a.f3363c.mo12780a(((Number) ui3Var.mo0a()).floatValue()));
            case 1:
                return Float.valueOf(1.0f - ((Number) ui3Var.mo0a()).floatValue());
            case 2:
                return Boolean.valueOf(((Number) ui3Var.mo0a()).floatValue() < 0.5f);
            case 3:
                try {
                    return (List) ui3Var.mo0a();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.f47638a;
                }
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
                return PreferenceDataStoreFactory.create$lambda$0(ui3Var);
            default:
                float fFloatValue = ((Number) ui3Var.mo0a()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue <= 1.0f ? fFloatValue : 1.0f);
        }
    }
}
