package p000;

import android.util.Log;
import com.airbnb.lottie.AsyncUpdates;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tj5 {

    /* JADX INFO: renamed from: a */
    public static final nj5 f62414a = new nj5();

    /* JADX INFO: renamed from: a */
    public static void m22149a() {
        f62414a.getClass();
        AsyncUpdates asyncUpdates = wk4.f66962a;
    }

    /* JADX INFO: renamed from: b */
    public static void m22150b() {
        f62414a.getClass();
        AsyncUpdates asyncUpdates = wk4.f66962a;
    }

    /* JADX INFO: renamed from: c */
    public static void m22151c(String str) {
        f62414a.getClass();
        HashSet hashSet = nj5.f52843a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m22152d(String str, Throwable th) {
        f62414a.getClass();
        HashSet hashSet = nj5.f52843a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
