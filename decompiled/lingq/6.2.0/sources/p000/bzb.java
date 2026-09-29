package p000;

import android.util.Base64;
import androidx.compose.runtime.internal.C0282a;
import com.facebook.FacebookException;
import com.facebook.login.CodeChallengeMethod;
import java.security.MessageDigest;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bzb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f9207a = new C0282a(-570799864, false, new sd1(23));

    /* JADX INFO: renamed from: a */
    public static final String m4241a(String str, CodeChallengeMethod codeChallengeMethod) {
        str.getClass();
        codeChallengeMethod.getClass();
        if (!m4242b(str)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(yu0.f70466d);
            bytes.getClass();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            strEncodeToString.getClass();
            return strEncodeToString;
        } catch (Exception e) {
            throw new FacebookException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m4242b(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").m15427f(str);
    }
}
