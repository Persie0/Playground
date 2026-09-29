package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.glance.layout.AbstractC0686a;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iyc {

    /* JADX INFO: renamed from: a */
    public static final Feature f44788a;

    /* JADX INFO: renamed from: b */
    public static final Feature f44789b;

    /* JADX INFO: renamed from: c */
    public static final Feature[] f44790c;

    static {
        Feature feature = new Feature(-1, 9L, "auth_api_credentials_begin_sign_in", true);
        Feature feature2 = new Feature(-1, 2L, "auth_api_credentials_sign_out", true);
        f44788a = feature2;
        Feature feature3 = new Feature(-1, 1L, "auth_api_credentials_authorize", true);
        f44789b = feature3;
        f44790c = new Feature[]{feature, feature2, feature3, new Feature(-1, 1L, "auth_api_credentials_revoke_access", true), new Feature(-1, 1L, "auth_api_credentials_clear_token", true), new Feature(-1, 4L, "auth_api_credentials_save_password", true), new Feature(-1, 6L, "auth_api_credentials_get_sign_in_intent", true), new Feature(-1, 3L, "auth_api_credentials_save_account_linking_token", true), new Feature(-1, 3L, "auth_api_credentials_get_phone_number_hint_intent", true), new Feature(-1, 1L, "auth_api_credentials_verify_with_google", true), new Feature(-1, 1L, "auth_api_credentials_credential_provider", true), new Feature(-1, 1L, "auth_api_credentials_save_webauthn_credential_specifics", true), new Feature(-1, 1L, "auth_api_credentials_delete_webauthn_credential_specifics", false), new Feature(-1, 1L, "auth_api_credentials_list_webauthn_credential_specifics", true), new Feature(-1, 2L, "auth_api_credentials_get_google_passkey_for_export", true), new Feature(-1, 1L, "auth_api_credentials_get_authentication_intent", true), new Feature(-1, 1L, "auth_api_credentials_get_registration_intent", true), new Feature(-1, 1L, "auth_api_credentials_check_key_availability", true), new Feature(-1, 1L, "auth_api_credentials_has_discoverable_key", true), new Feature(-1, 1L, "auth_api_credentials_validate_calling_browser", true), new Feature(-1, 1L, "auth_api_credentials_validate_rp_id_and_calling_package", true), new Feature(-1, 1L, "auth_api_credentials_get_credential_list_for_browser", true), new Feature(-1, 1L, "auth_api_credentials_update_webauthn_credential_specifics", true)};
    }

    /* JADX INFO: renamed from: a */
    public static final void m14209a(on3 on3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-42699039);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(on3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22116e(0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            AbstractC0686a.m2485a(l70.m15951n(ci8.m4734s(on3Var), 16.0f), null, ci8.m4703P(2049191487, new ks3(vi3Var, 28), tj3Var), tj3Var, 384, 2);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(on3Var, i, 24, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14210b(ArrayList arrayList, C0282a c0282a, on3 on3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1400553714);
        int i2 = (tj3Var.m22124i(arrayList) ? 4 : 2) | i | (tj3Var.m22120g(on3Var) ? 256 : 128) | 1024;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-7169);
            tj3Var.m22140r();
            int size = arrayList.size() - 1;
            boolean zM22124i = tj3Var.m22124i(arrayList) | tj3Var.m22116e(size);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ek2(arrayList, size, 5, c0282a);
                tj3Var.m22131l0(objM22097O);
            }
            m14209a(on3Var, (vi3) objM22097O, tj3Var, (i3 >> 6) & 126);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 16, arrayList, c0282a, on3Var);
        }
    }
}
