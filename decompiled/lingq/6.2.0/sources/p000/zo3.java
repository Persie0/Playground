package p000;

import android.content.Context;
import android.os.Bundle;
import kotlin.random.Random$Default;

/* JADX INFO: loaded from: classes.dex */
public final class zo3 {

    /* JADX INFO: renamed from: b */
    public static final boolean f71820b;

    /* JADX INFO: renamed from: a */
    public final m58 f71821a;

    static {
        Random$Default random$Default = jq7.f46010a;
        f71820b = jq7.f46011b.mo14246d().nextDouble() <= 1.0E-4d;
    }

    public zo3(Context context) {
        this.f71821a = new m58(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m25724a(String str, Bundle bundle) {
        if (f71820b && vk9.m23380c0(str, "gps", false)) {
            this.f71821a.m16645i(str, bundle);
        }
    }
}
