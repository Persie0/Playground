package p274n8;

import android.util.Base64;
import com.facebook.FacebookException;
import com.facebook.login.CodeChallengeMethod;
import dm.C5207g;
import java.security.MessageDigest;
import kotlin.text.Regex;
import mo.C7653a;

/* JADX INFO: renamed from: n8.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7730o {
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public static final String m15323a(String str, CodeChallengeMethod codeChallengeMethod) throws FacebookException {
        C5207g.m11111f(str, "codeVerifier");
        C5207g.m11111f(codeChallengeMethod, "codeChallengeMethod");
        if (!m15324b(str)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(C7653a.f42117c);
            C5207g.m11110e(bytes, "(this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            C5207g.m11110e(strEncodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return strEncodeToString;
        } catch (Exception e10) {
            throw new FacebookException(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m15324b(String str) {
        if (!(str == null || str.length() == 0) && str.length() >= 43 && str.length() <= 128) {
            return new Regex("^[-._~A-Za-z0-9]+$").m14271b(str);
        }
        return false;
    }
}
