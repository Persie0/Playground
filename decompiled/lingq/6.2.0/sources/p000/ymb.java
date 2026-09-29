package p000;

import android.os.Bundle;
import android.util.Base64;
import androidx.compose.runtime.internal.C0282a;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ymb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f70080a = new C0282a(935020324, false, new z70(9));

    /* JADX INFO: renamed from: a */
    public static AccessToken m25199a(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        String string;
        bundle.getClass();
        str.getClass();
        Date dateM3929R = bna.m3929R(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date dateM3929R2 = bna.m3929R(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new AccessToken(string2, str, string, stringArrayList, null, null, accessTokenSource, dateM3929R, new Date(), dateM3929R2, bundle.getString("graph_domain"));
    }

    /* JADX INFO: renamed from: b */
    public static AccessToken m25200b(Collection collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        ArrayList arrayListM23627e;
        ArrayList arrayListM23627e2;
        bundle.getClass();
        str.getClass();
        Date dateM3929R = bna.m3929R(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string != null) {
            Date dateM3929R2 = bna.m3929R(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 != null && string2.length() > 0) {
                String[] strArr = (String[]) vk9.m23365A0(string2, new String[]{","}, 0, 6).toArray(new String[0]);
                collection = vz1.m23627e(Arrays.copyOf(strArr, strArr.length));
            }
            Collection collection2 = collection;
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayListM23627e = null;
            } else {
                String[] strArr2 = (String[]) vk9.m23365A0(string3, new String[]{","}, 0, 6).toArray(new String[0]);
                arrayListM23627e = vz1.m23627e(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayListM23627e2 = null;
            } else {
                String[] strArr3 = (String[]) vk9.m23365A0(string4, new String[]{","}, 0, 6).toArray(new String[0]);
                arrayListM23627e2 = vz1.m23627e(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (!bna.m3945d0(string)) {
                String string5 = bundle.getString("graph_domain");
                String string6 = bundle.getString("signed_request");
                if (string6 == null || string6.length() == 0) {
                    throw new FacebookException("Authorization response does not contain the signed_request");
                }
                try {
                    String[] strArr4 = (String[]) vk9.m23365A0(string6, new String[]{"."}, 0, 6).toArray(new String[0]);
                    if (strArr4.length == 2) {
                        byte[] bArrDecode = Base64.decode(strArr4[1], 0);
                        bArrDecode.getClass();
                        String string7 = new JSONObject(new String(bArrDecode, yu0.f70463a)).getString("user_id");
                        string7.getClass();
                        return new AccessToken(string, str, string7, collection2, arrayListM23627e, arrayListM23627e2, accessTokenSource, dateM3929R, new Date(), dateM3929R2, string5);
                    }
                } catch (UnsupportedEncodingException | JSONException unused) {
                }
                throw new FacebookException("Failed to retrieve user_id from signed_request");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static AuthenticationToken m25201c(String str, Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("id_token");
        if (string == null || string.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        try {
            return new AuthenticationToken(string, str);
        } catch (Exception e) {
            throw new FacebookException(e.getMessage(), e);
        }
    }
}
