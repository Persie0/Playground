package p000;

import android.net.Uri;
import kotlin.Result;

/* JADX INFO: loaded from: classes.dex */
public final class t32 {
    /* JADX INFO: renamed from: a */
    public static boolean m21826a(String str) {
        Object failure;
        if (str == null || vk9.m23391n0(str)) {
            return false;
        }
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Uri uri = (Uri) failure;
        if (uri != null && cl9.m4834Q(uri.getScheme(), "lingq", true)) {
            return cl9.m4834Q(uri.getHost(), "web2wave", true) || cl9.m4834Q(uri.getLastPathSegment(), "web2wave", true);
        }
        return false;
    }
}
