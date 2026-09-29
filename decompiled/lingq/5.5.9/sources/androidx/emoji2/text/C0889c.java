package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import dm.C5212l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p404u2.C9386f;

/* JADX INFO: renamed from: androidx.emoji2.text.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0889c {

    /* JADX INFO: renamed from: androidx.emoji2.text.c$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public Signature[] mo3516a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$b */
    public static class b extends a {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.c$c */
    public static class c extends b {
        @Override // androidx.emoji2.text.C0889c.a
        /* JADX INFO: renamed from: a */
        public final Signature[] mo3516a(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    /* JADX INFO: renamed from: a */
    public static C0899m m3515a(Context context) {
        ProviderInfo providerInfo;
        C9386f c9386f;
        boolean z10;
        ApplicationInfo applicationInfo;
        a cVar = Build.VERSION.SDK_INT >= 28 ? new c() : new b();
        PackageManager packageManager = context.getPackageManager();
        C5212l.m11132C(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        do {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null) {
                z10 = false;
            } else {
                z10 = true;
                if ((applicationInfo.flags & 1) != 1) {
                    z10 = false;
                }
            }
        } while (!z10);
        if (providerInfo == null) {
            c9386f = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo3516a = cVar.mo3516a(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo3516a) {
                    arrayList.add(signature.toByteArray());
                }
                c9386f = new C9386f(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
                c9386f = null;
            }
        }
        if (c9386f == null) {
            return null;
        }
        return new C0899m(context, c9386f);
    }
}
