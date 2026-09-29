package p266n;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import p000a.InterfaceC0000a;
import p232l2.C7229h;
import p260m8.C7499b;

/* JADX INFO: renamed from: n.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7667d {

    /* JADX INFO: renamed from: a */
    public final Intent f42139a;

    /* JADX INFO: renamed from: n.d$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static String m15264a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: n.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Intent f42140a;

        /* JADX INFO: renamed from: b */
        public final C7499b f42141b;

        /* JADX INFO: renamed from: c */
        public Bundle f42142c;

        /* JADX INFO: renamed from: d */
        public int f42143d;

        /* JADX INFO: renamed from: e */
        public final boolean f42144e;

        public b() {
            this.f42140a = new Intent("android.intent.action.VIEW");
            this.f42141b = new C7499b();
            this.f42143d = 0;
            this.f42144e = true;
        }

        public b(C7669f c7669f) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f42140a = intent;
            this.f42141b = new C7499b();
            this.f42143d = 0;
            this.f42144e = true;
            if (c7669f != null) {
                intent.setPackage(((ComponentName) c7669f.f42149d).getPackageName());
                InterfaceC0000a.a aVar = (InterfaceC0000a.a) ((InterfaceC0000a) c7669f.f42148c);
                aVar.getClass();
                PendingIntent pendingIntent = (PendingIntent) c7669f.f42150e;
                Bundle bundle = new Bundle();
                C7229h.m14561b(bundle, "android.support.customtabs.extra.SESSION", aVar);
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                intent.putExtras(bundle);
            }
        }

        /* JADX INFO: renamed from: a */
        public final C7667d m15265a() {
            Intent intent = this.f42140a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                C7229h.m14561b(bundle, "android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f42144e);
            this.f42141b.getClass();
            intent.putExtras(new Bundle());
            Bundle bundle2 = this.f42142c;
            if (bundle2 != null) {
                intent.putExtras(bundle2);
            }
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f42143d);
            String strM15264a = a.m15264a();
            if (!TextUtils.isEmpty(strM15264a)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strM15264a);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
            return new C7667d(intent);
        }

        /* JADX INFO: renamed from: b */
        public final void m15266b() {
            this.f42143d = 1;
            this.f42140a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        }
    }

    public C7667d(Intent intent) {
        this.f42139a = intent;
    }
}
