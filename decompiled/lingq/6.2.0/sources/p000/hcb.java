package p000;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hcb {

    /* JADX INFO: renamed from: a */
    public static final Logger f42193a = Logger.getLogger("okio.Okio");

    /* JADX INFO: renamed from: b */
    public static final boolean m13198b(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? vk9.m23380c0(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
