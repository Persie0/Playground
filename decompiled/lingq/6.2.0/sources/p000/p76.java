package p000;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class p76 extends r76 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f55695b;

    public /* synthetic */ p76(int i) {
        this.f55695b = i;
    }

    @Override // p000.r76
    /* JADX INFO: renamed from: b */
    public final String mo18933b() {
        switch (this.f55695b) {
            case 0:
                return null;
            case 1:
                return "com.facebook.katana.ProxyAuth";
            case 2:
                return null;
            default:
                return "com.facebook.katana.ProxyAuth";
        }
    }

    @Override // p000.r76
    /* JADX INFO: renamed from: c */
    public final String mo18934c() {
        switch (this.f55695b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.facebook.katana";
            case 2:
                return "com.facebook.orca";
            default:
                return "com.facebook.wakizashi";
        }
    }

    @Override // p000.r76
    /* JADX INFO: renamed from: e */
    public void mo18935e() {
        switch (this.f55695b) {
            case 1:
                if (sy2.m21766a().getApplicationInfo().targetSdkVersion >= 30) {
                    Log.w(lp1.f49971a.contains(s76.class) ? null : "s76", "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
                }
                break;
        }
    }
}
