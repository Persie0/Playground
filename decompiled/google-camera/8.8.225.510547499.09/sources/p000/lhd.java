package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lhd {

    /* JADX INFO: renamed from: a */
    private static final nbh f38253a = nbh.m17259h("com/google/android/libraries/performance/primes/debug/Intents");

    /* JADX INFO: renamed from: a */
    public static void m15332a(Context context) {
        try {
            Intent intent = new Intent("com.google.android.primes.action.DEBUG_PRIMES_EVENTS");
            intent.setPackage(context.getPackageName());
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((nbe) ((nbe) f38253a.m17252c()).mo17276G((char) 4492)).mo17290o("PrimesEventActivity not found: primes/debug is not included in the app.");
        }
    }
}
