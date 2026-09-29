package p067d8;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C6744b;
import p173i8.C6205a;
import p291o7.C8004n;
import p317p7.RunnableC8194a;
import p385sf.C9000b;

/* JADX INFO: renamed from: d8.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5079s {

    /* JADX INFO: renamed from: a */
    public static final C5079s f32992a;

    /* JADX INFO: renamed from: b */
    public static final String f32993b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f32994c;

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f32995d;

    /* JADX INFO: renamed from: e */
    public static final Integer[] f32996e;

    /* JADX INFO: renamed from: d8.s$a */
    public static final class a extends e {
        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: b */
        public final /* bridge */ /* synthetic */ String mo10794b() {
            return null;
        }

        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: c */
        public final String mo10795c() {
            return "com.facebook.arstudio.player";
        }
    }

    /* JADX INFO: renamed from: d8.s$b */
    public static final class b extends e {
        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: b */
        public final String mo10794b() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: c */
        public final String mo10795c() {
            return "com.instagram.android";
        }

        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: d */
        public final String mo10796d() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* JADX INFO: renamed from: d8.s$c */
    public static final class c extends e {
        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: b */
        public final String mo10794b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: c */
        public final String mo10795c() {
            return "com.facebook.katana";
        }

        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: e */
        public final void mo10797e() {
            if (C8004n.m15871a().getApplicationInfo().targetSdkVersion >= 30) {
                String str = null;
                if (!C6205a.m12742b(C5079s.class)) {
                    try {
                        str = C5079s.f32993b;
                    } catch (Throwable th2) {
                        C6205a.m12741a(C5079s.class, th2);
                    }
                }
                Log.w(str, "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* JADX INFO: renamed from: d8.s$d */
    public static final class d extends e {
        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: b */
        public final /* bridge */ /* synthetic */ String mo10794b() {
            return null;
        }

        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: c */
        public final String mo10795c() {
            return "com.facebook.orca";
        }
    }

    /* JADX INFO: renamed from: d8.s$e */
    public static abstract class e {

        /* JADX INFO: renamed from: a */
        public TreeSet<Integer> f32997a;

        /* JADX WARN: Code duplicated, block: B:13:0x0021 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:11:0x0018, B:21:0x003a, B:23:0x003f, B:29:0x004f, B:10:0x000f, B:13:0x0021, B:20:0x0038, B:19:0x0035, B:16:0x002d), top: B:40:0x0005, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x003f A[Catch: all -> 0x0056, TryCatch #1 {, blocks: (B:5:0x0005, B:11:0x0018, B:21:0x003a, B:23:0x003f, B:29:0x004f, B:10:0x000f, B:13:0x0021, B:20:0x0038, B:19:0x0035, B:16:0x002d), top: B:40:0x0005, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x004b  */
        /* JADX WARN: Code duplicated, block: B:29:0x004f A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:11:0x0018, B:21:0x003a, B:23:0x003f, B:29:0x004f, B:10:0x000f, B:13:0x0021, B:20:0x0038, B:19:0x0035, B:16:0x002d), top: B:40:0x0005, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final synchronized void m10798a(boolean z10) {
            TreeSet<Integer> treeSet;
            boolean z11;
            C5079s c5079s;
            TreeSet<Integer> treeSetM10792f = null;
            if (z10) {
                c5079s = C5079s.f32992a;
                if (!C6205a.m12742b(C5079s.class)) {
                    treeSetM10792f = c5079s.m10792f(this);
                }
                this.f32997a = treeSetM10792f;
                treeSet = this.f32997a;
                if (treeSet != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (z11) {
                    mo10797e();
                }
            } else {
                TreeSet<Integer> treeSet2 = this.f32997a;
                if (treeSet2 == null) {
                    c5079s = C5079s.f32992a;
                    if (!C6205a.m12742b(C5079s.class)) {
                        try {
                            treeSetM10792f = c5079s.m10792f(this);
                        } catch (Throwable th2) {
                            C6205a.m12741a(C5079s.class, th2);
                        }
                    }
                    this.f32997a = treeSetM10792f;
                    treeSet = this.f32997a;
                    if (treeSet != null || treeSet.isEmpty()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        mo10797e();
                    }
                } else {
                    if (C5207g.m11106a(treeSet2 == null ? treeSetM10792f : Boolean.valueOf(treeSet2.isEmpty()), Boolean.FALSE)) {
                        treeSet = this.f32997a;
                        if (treeSet != null) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            mo10797e();
                        }
                    } else {
                        c5079s = C5079s.f32992a;
                        if (!C6205a.m12742b(C5079s.class)) {
                            treeSetM10792f = c5079s.m10792f(this);
                        }
                        this.f32997a = treeSetM10792f;
                        treeSet = this.f32997a;
                        if (treeSet != null) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            mo10797e();
                        }
                    }
                }
            }
            throw th;
        }

        /* JADX INFO: renamed from: b */
        public abstract String mo10794b();

        /* JADX INFO: renamed from: c */
        public abstract String mo10795c();

        /* JADX INFO: renamed from: d */
        public String mo10796d() {
            return "id_token,token,signed_request,graph_domain";
        }

        /* JADX INFO: renamed from: e */
        public void mo10797e() {
        }
    }

    /* JADX INFO: renamed from: d8.s$f */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public int f32998a;
    }

    /* JADX INFO: renamed from: d8.s$g */
    public static final class g extends e {
        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: b */
        public final String mo10794b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // p067d8.C5079s.e
        /* JADX INFO: renamed from: c */
        public final String mo10795c() {
            return "com.facebook.wakizashi";
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    static {
        ArrayList arrayListM17237c;
        C5079s c5079s;
        C5079s c5079s2 = new C5079s();
        f32992a = c5079s2;
        f32993b = C5079s.class.getName();
        f32994c = c5079s2.m10790a();
        if (!C6205a.m12742b(c5079s2)) {
            try {
                arrayListM17237c = C9000b.m17237c(new a());
                arrayListM17237c.addAll(c5079s2.m10790a());
            } catch (Throwable th2) {
                C6205a.m12741a(c5079s2, th2);
                arrayListM17237c = null;
            }
            c5079s = f32992a;
            c5079s.getClass();
            if (!C6205a.m12742b(c5079s)) {
                try {
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new d());
                    ArrayList arrayList2 = f32994c;
                    map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList2);
                    map.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList2);
                    map.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList2);
                    map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList2);
                    map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
                    map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
                    map.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayListM17237c);
                    map.put("com.facebook.platform.action.request.SHARE_STORY", arrayList2);
                } catch (Throwable th3) {
                    C6205a.m12741a(c5079s, th3);
                }
            }
            f32995d = new AtomicBoolean(false);
            f32996e = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
        }
        arrayListM17237c = null;
        c5079s = f32992a;
        c5079s.getClass();
        if (!C6205a.m12742b(c5079s)) {
            HashMap map2 = new HashMap();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new d());
            ArrayList arrayList4 = f32994c;
            map2.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList4);
            map2.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList4);
            map2.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList4);
            map2.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList4);
            map2.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList3);
            map2.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList3);
            map2.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayListM17237c);
            map2.put("com.facebook.platform.action.request.SHARE_STORY", arrayList4);
        }
        f32995d = new AtomicBoolean(false);
        f32996e = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    /* JADX INFO: renamed from: b */
    public static final int m10783b(TreeSet<Integer> treeSet, int i10, int[] iArr) {
        if (C6205a.m12742b(C5079s.class)) {
            return 0;
        }
        if (treeSet == null) {
            return -1;
        }
        try {
            int length = iArr.length - 1;
            Iterator<Integer> itDescendingIterator = treeSet.descendingIterator();
            int iMax = -1;
            while (itDescendingIterator.hasNext()) {
                Integer next = itDescendingIterator.next();
                C5207g.m11110e(next, "fbAppVersion");
                iMax = Math.max(iMax, next.intValue());
                while (length >= 0 && iArr[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == next.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(iMax, i10);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th2) {
            C6205a.m12741a(C5079s.class, th2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Intent m10784d(Context context) {
        if (C6205a.m12742b(C5079s.class)) {
            return null;
        }
        try {
            C5207g.m11111f(context, "context");
            Iterator it = f32994c.iterator();
            while (it.hasNext()) {
                Intent intentAddCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((e) it.next()).mo10795c()).addCategory("android.intent.category.DEFAULT");
                if (C6205a.m12742b(C5079s.class) || intentAddCategory == null) {
                    intentAddCategory = null;
                } else {
                    try {
                        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intentAddCategory, 0);
                        if (resolveInfoResolveService != null) {
                            HashSet<String> hashSet = C5070j.f32956a;
                            String str = resolveInfoResolveService.serviceInfo.packageName;
                            C5207g.m11110e(str, "resolveInfo.serviceInfo.packageName");
                            if (!C5070j.m10766a(context, str)) {
                            }
                        }
                    } catch (Throwable th2) {
                        C6205a.m12741a(C5079s.class, th2);
                    }
                    intentAddCategory = null;
                }
                if (intentAddCategory != null) {
                    return intentAddCategory;
                }
            }
            return null;
        } catch (Throwable th3) {
            C6205a.m12741a(C5079s.class, th3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0053 A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:6:0x000d, B:27:0x0053, B:29:0x0072, B:40:0x00a5, B:38:0x009f, B:41:0x00a8, B:43:0x00ae, B:22:0x004a, B:10:0x001d, B:12:0x0028, B:14:0x0030, B:19:0x0042, B:16:0x0038, B:33:0x007f, B:35:0x0094), top: B:52:0x000d, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:6:0x000d, B:27:0x0053, B:29:0x0072, B:40:0x00a5, B:38:0x009f, B:41:0x00a8, B:43:0x00ae, B:22:0x004a, B:10:0x001d, B:12:0x0028, B:14:0x0030, B:19:0x0042, B:16:0x0038, B:33:0x007f, B:35:0x0094), top: B:52:0x000d, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094 A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #3 {all -> 0x009e, blocks: (B:33:0x007f, B:35:0x0094), top: B:55:0x007f, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #1 {all -> 0x00b6, blocks: (B:6:0x000d, B:27:0x0053, B:29:0x0072, B:40:0x00a5, B:38:0x009f, B:41:0x00a8, B:43:0x00ae, B:22:0x004a, B:10:0x001d, B:12:0x0028, B:14:0x0030, B:19:0x0042, B:16:0x0038, B:33:0x007f, B:35:0x0094), top: B:52:0x000d, inners: #2, #3 }] */
    /* JADX INFO: renamed from: e */
    public static final Intent m10785e(Intent intent, Bundle bundle, FacebookException facebookException) {
        String stringExtra;
        UUID uuidFromString;
        Intent intent2;
        Bundle bundle2;
        Bundle bundle3;
        if (C6205a.m12742b(C5079s.class)) {
            return null;
        }
        try {
            if (!C6205a.m12742b(C5079s.class)) {
                try {
                    if (m10788j(m10787i(intent))) {
                        Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                        stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
                    } else {
                        stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                    }
                    if (stringExtra != null) {
                        try {
                            uuidFromString = UUID.fromString(stringExtra);
                        } catch (IllegalArgumentException unused) {
                            uuidFromString = null;
                        }
                        if (uuidFromString == null) {
                            return null;
                        }
                        intent2 = new Intent();
                        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m10787i(intent));
                        bundle2 = new Bundle();
                        bundle2.putString("action_id", uuidFromString.toString());
                        if (facebookException != null) {
                            if (C6205a.m12742b(C5079s.class)) {
                                bundle3 = null;
                                bundle2.putBundle("error", bundle3);
                            } else {
                                try {
                                    bundle3 = new Bundle();
                                    bundle3.putString("error_description", facebookException.toString());
                                    if (facebookException instanceof FacebookOperationCanceledException) {
                                        bundle3.putString("error_type", "UserCanceled");
                                    }
                                } catch (Throwable th2) {
                                    C6205a.m12741a(C5079s.class, th2);
                                    bundle3 = null;
                                }
                                bundle2.putBundle("error", bundle3);
                            }
                        }
                        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                        if (bundle != null) {
                            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                        }
                        return intent2;
                    }
                } catch (Throwable th3) {
                    C6205a.m12741a(C5079s.class, th3);
                }
            }
            uuidFromString = null;
            if (uuidFromString == null) {
                return null;
            }
            intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m10787i(intent));
            bundle2 = new Bundle();
            bundle2.putString("action_id", uuidFromString.toString());
            if (facebookException != null) {
                if (C6205a.m12742b(C5079s.class)) {
                    bundle3 = null;
                    bundle2.putBundle("error", bundle3);
                } else {
                    bundle3 = new Bundle();
                    bundle3.putString("error_description", facebookException.toString());
                    if (facebookException instanceof FacebookOperationCanceledException) {
                        bundle3.putString("error_type", "UserCanceled");
                    }
                    bundle2.putBundle("error", bundle3);
                }
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th4) {
            C6205a.m12741a(C5079s.class, th4);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Bundle m10786h(Intent intent) {
        if (C6205a.m12742b(C5079s.class)) {
            return null;
        }
        try {
            return !m10788j(m10787i(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            C6205a.m12741a(C5079s.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final int m10787i(Intent intent) {
        if (C6205a.m12742b(C5079s.class)) {
            return 0;
        }
        try {
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            C6205a.m12741a(C5079s.class, th2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m10788j(int i10) {
        if (C6205a.m12742b(C5079s.class)) {
            return false;
        }
        try {
            return C6744b.m13377i0(Integer.valueOf(i10), f32996e) && i10 >= 20140701;
        } catch (Throwable th2) {
            C6205a.m12741a(C5079s.class, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m10789k() {
        if (C6205a.m12742b(C5079s.class)) {
            return;
        }
        try {
            if (f32995d.compareAndSet(false, true)) {
                C8004n.m15873c().execute(new RunnableC8194a(4));
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C5079s.class, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m10790a() {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            return C9000b.m17237c(new c(), new g());
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Intent m10791c(e eVar, String str, Set set, String str2, boolean z10, DefaultAudience defaultAudience, String str3, String str4, boolean z11, String str5, boolean z12, LoginTargetApp loginTargetApp, boolean z13, boolean z14, String str6) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            String strMo10794b = eVar.mo10794b();
            if (strMo10794b == null) {
                return null;
            }
            Intent intentPutExtra = new Intent().setClassName(eVar.mo10795c(), strMo10794b).putExtra("client_id", str);
            C5207g.m11110e(intentPutExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            C8004n c8004n = C8004n.f43550a;
            intentPutExtra.putExtra("facebook_sdk_version", "16.0.1");
            C5086z c5086z = C5086z.f33015a;
            if (!(set.isEmpty())) {
                intentPutExtra.putExtra("scope", TextUtils.join(",", set));
            }
            if (!C5086z.m10802A(str2)) {
                intentPutExtra.putExtra("e2e", str2);
            }
            intentPutExtra.putExtra("state", str3);
            intentPutExtra.putExtra("response_type", eVar.mo10796d());
            intentPutExtra.putExtra("nonce", str6);
            intentPutExtra.putExtra("return_scopes", "true");
            if (z10) {
                intentPutExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
            }
            intentPutExtra.putExtra("legacy_override", C8004n.m15874d());
            intentPutExtra.putExtra("auth_type", str4);
            if (z11) {
                intentPutExtra.putExtra("fail_on_logged_out", true);
            }
            intentPutExtra.putExtra("messenger_page_id", str5);
            intentPutExtra.putExtra("reset_messenger_state", z12);
            if (z13) {
                intentPutExtra.putExtra("fx_app", loginTargetApp.toString());
            }
            if (z14) {
                intentPutExtra.putExtra("skip_dedupe", true);
            }
            return intentPutExtra;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4 A[Catch: all -> 0x00c9, TryCatch #3 {all -> 0x00c9, blocks: (B:5:0x0012, B:46:0x00c8, B:45:0x00c4, B:39:0x00b9, B:11:0x0054, B:8:0x0030), top: B:54:0x0012, inners: #1 }] */
    /* JADX INFO: renamed from: f */
    public final TreeSet<Integer> m10792f(e eVar) {
        Uri uri;
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        String str = f32993b;
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            ContentResolver contentResolver = C8004n.m15871a().getContentResolver();
            String[] strArr = {"version"};
            if (C6205a.m12742b(this)) {
                uri = null;
            } else {
                try {
                    Uri uri2 = Uri.parse("content://" + eVar.mo10795c() + ".provider.PlatformProvider/versions");
                    C5207g.m11110e(uri2, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
                    uri = uri2;
                } catch (Throwable th2) {
                    C6205a.m12741a(this, th2);
                    uri = null;
                }
            }
            try {
                try {
                    providerInfoResolveContentProvider = C8004n.m15871a().getPackageManager().resolveContentProvider(C5207g.m11116k(".provider.PlatformProvider", eVar.mo10795c()), 0);
                } catch (RuntimeException e10) {
                    Log.e(str, "Failed to query content resolver.", e10);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                    } catch (IllegalArgumentException unused) {
                        Log.e(str, "Failed to query content resolver.");
                        cursorQuery = null;
                    } catch (NullPointerException unused2) {
                        Log.e(str, "Failed to query content resolver.");
                        cursorQuery = null;
                    } catch (SecurityException unused3) {
                        Log.e(str, "Failed to query content resolver.");
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th3) {
                                cursor = cursorQuery;
                                th = th3;
                                if (cursor == null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
                if (cursor == null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th5) {
            C6205a.m12741a(this, th5);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final f m10793g(ArrayList arrayList, int[] iArr) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            m10789k();
            if (arrayList == null) {
                f fVar = new f();
                fVar.f32998a = -1;
                return fVar;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                TreeSet<Integer> treeSet = eVar.f32997a;
                int iIntValue = 0;
                if (treeSet == null || !C5207g.m11106a(Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    eVar.m10798a(false);
                }
                TreeSet<Integer> treeSet2 = eVar.f32997a;
                if (!C6205a.m12742b(C5079s.class)) {
                    try {
                        iIntValue = f32996e[0].intValue();
                    } catch (Throwable th2) {
                        C6205a.m12741a(C5079s.class, th2);
                    }
                }
                int iM10783b = m10783b(treeSet2, iIntValue, iArr);
                if (iM10783b != -1) {
                    f fVar2 = new f();
                    fVar2.f32998a = iM10783b;
                    return fVar2;
                }
            }
            f fVar3 = new f();
            fVar3.f32998a = -1;
            return fVar3;
        } catch (Throwable th3) {
            C6205a.m12741a(this, th3);
            return null;
        }
    }
}
