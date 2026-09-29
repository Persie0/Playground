package p067d8;

import p291o7.C8004n;

/* JADX INFO: renamed from: d8.p */
/* JADX INFO: loaded from: classes.dex */
public final class C5076p {

    /* JADX INFO: renamed from: d8.p$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo10775a(String str);
    }

    /* JADX INFO: renamed from: a */
    public static final void m10774a() {
        C8004n.m15871a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
