package p232l2;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import p003a2.C0009a;
import p254m2.C7472a;
import p389t2.C9182a;

/* JADX INFO: renamed from: l2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7222a extends C7472a {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f40604c = 0;

    /* JADX INFO: renamed from: l2.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m14547a(Activity activity) {
            activity.finishAffinity();
        }

        /* JADX INFO: renamed from: b */
        public static void m14548b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        /* JADX INFO: renamed from: c */
        public static void m14549c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* JADX INFO: renamed from: l2.a$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m14550a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* JADX INFO: renamed from: b */
        public static void m14551b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        /* JADX INFO: renamed from: c */
        public static boolean m14552c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: l2.a$c */
    public interface c {
        /* JADX INFO: renamed from: z */
        void mo3806z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static void m14545c(Activity activity, String[] strArr, int i10) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (TextUtils.isEmpty(strArr[i11])) {
                throw new IllegalArgumentException(C0009a.m23l(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (!C9182a.m17515a() && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr2[i12] = strArr[i13];
                    i12++;
                }
            }
        }
        if (activity instanceof c) {
            ((c) activity).mo3806z();
        }
        b.m14551b(activity, strArr, i10);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m14546d(Activity activity, String str) {
        if (C9182a.m17515a() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return b.m14552c(activity, str);
        }
        return false;
    }
}
