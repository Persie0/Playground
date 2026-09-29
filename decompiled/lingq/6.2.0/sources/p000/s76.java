package p000;

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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class s76 {

    /* JADX INFO: renamed from: a */
    public static final s76 f60467a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList f60468b;

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f60469c;

    /* JADX INFO: renamed from: d */
    public static final Integer[] f60470d;

    static {
        s76 s76Var = new s76();
        f60467a = s76Var;
        f60468b = s76Var.m21143a();
        int i = 0;
        ArrayList arrayList = null;
        if (!lp1.f49971a.contains(s76Var)) {
            try {
                ArrayList arrayListM23627e = vz1.m23627e(new p76(i));
                arrayListM23627e.addAll(s76Var.m21143a());
                arrayList = arrayListM23627e;
            } catch (Throwable th) {
                lp1.m16420a(s76Var, th);
            }
        }
        s76 s76Var2 = f60467a;
        if (!lp1.f49971a.contains(s76Var2)) {
            try {
                HashMap map = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new p76(2));
                ArrayList arrayList3 = f60468b;
                map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                map.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th2) {
                lp1.m16420a(s76Var2, th2);
            }
        }
        f60469c = new AtomicBoolean(false);
        f60470d = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    /* JADX INFO: renamed from: b */
    public static final int m21135b(TreeSet treeSet, int i, int[] iArr) {
        if (lp1.f49971a.contains(s76.class)) {
            return 0;
        }
        if (treeSet != null) {
            try {
                int length = iArr.length - 1;
                Iterator itDescendingIterator = treeSet.descendingIterator();
                int iMax = -1;
                while (itDescendingIterator.hasNext()) {
                    Integer num = (Integer) itDescendingIterator.next();
                    num.getClass();
                    iMax = Math.max(iMax, num.intValue());
                    while (length >= 0 && iArr[length] > num.intValue()) {
                        length--;
                    }
                    if (length < 0) {
                        break;
                    }
                    if (iArr[length] == num.intValue()) {
                        if (length % 2 != 0) {
                            break;
                        }
                        return Math.min(iMax, i);
                    }
                }
            } catch (Throwable th) {
                lp1.m16420a(s76.class, th);
                return 0;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static final Intent m21136d(Context context) {
        if (!lp1.f49971a.contains(s76.class)) {
            try {
                context.getClass();
                Iterator it = f60468b.iterator();
                while (it.hasNext()) {
                    Intent intentAddCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((r76) it.next()).mo18934c()).addCategory("android.intent.category.DEFAULT");
                    if (lp1.f49971a.contains(s76.class) || intentAddCategory == null) {
                        intentAddCategory = null;
                    } else {
                        try {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intentAddCategory, 0);
                            if (resolveInfoResolveService != null) {
                                String str = resolveInfoResolveService.serviceInfo.packageName;
                                str.getClass();
                                if (!ty2.m22350a(context, str)) {
                                }
                            }
                        } catch (Throwable th) {
                            lp1.m16420a(s76.class, th);
                        }
                        intentAddCategory = null;
                    }
                    if (intentAddCategory != null) {
                        return intentAddCategory;
                    }
                }
            } catch (Throwable th2) {
                lp1.m16420a(s76.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048 A[Catch: all -> 0x0093, TryCatch #0 {all -> 0x0093, blocks: (B:5:0x000c, B:26:0x0048, B:28:0x0064, B:37:0x008f, B:36:0x008b, B:40:0x0095, B:42:0x009a, B:23:0x0041, B:31:0x0070, B:33:0x0082, B:9:0x0018, B:11:0x0022, B:13:0x0028, B:19:0x0039, B:21:0x003e, B:17:0x0031), top: B:46:0x000c, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064 A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:5:0x000c, B:26:0x0048, B:28:0x0064, B:37:0x008f, B:36:0x008b, B:40:0x0095, B:42:0x009a, B:23:0x0041, B:31:0x0070, B:33:0x0082, B:9:0x0018, B:11:0x0022, B:13:0x0028, B:19:0x0039, B:21:0x003e, B:17:0x0031), top: B:46:0x000c, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #2 {all -> 0x008a, blocks: (B:31:0x0070, B:33:0x0082), top: B:50:0x0070, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009a A[Catch: all -> 0x0093, TRY_LEAVE, TryCatch #0 {all -> 0x0093, blocks: (B:5:0x000c, B:26:0x0048, B:28:0x0064, B:37:0x008f, B:36:0x008b, B:40:0x0095, B:42:0x009a, B:23:0x0041, B:31:0x0070, B:33:0x0082, B:9:0x0018, B:11:0x0022, B:13:0x0028, B:19:0x0039, B:21:0x003e, B:17:0x0031), top: B:46:0x000c, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: e */
    public static final Intent m21137e(Intent intent, Bundle bundle, FacebookException facebookException) {
        String stringExtra;
        UUID uuidFromString;
        Intent intent2;
        Bundle bundle2;
        Bundle bundle3;
        Set set = lp1.f49971a;
        if (!set.contains(s76.class)) {
            try {
                if (set.contains(s76.class)) {
                    uuidFromString = null;
                    if (uuidFromString != null) {
                        intent2 = new Intent();
                        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m21140j(intent));
                        bundle2 = new Bundle();
                        bundle2.putString("action_id", uuidFromString.toString());
                        if (facebookException != null) {
                            if (lp1.f49971a.contains(s76.class)) {
                                bundle3 = null;
                                bundle2.putBundle("error", bundle3);
                            } else {
                                try {
                                    bundle3 = new Bundle();
                                    bundle3.putString("error_description", facebookException.toString());
                                    if (facebookException instanceof FacebookOperationCanceledException) {
                                        bundle3.putString("error_type", "UserCanceled");
                                    }
                                } catch (Throwable th) {
                                    lp1.m16420a(s76.class, th);
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
                } else {
                    try {
                        if (m21141k(m21140j(intent))) {
                            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
                        } else {
                            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                        }
                        if (stringExtra != null) {
                            try {
                                uuidFromString = UUID.fromString(stringExtra);
                            } catch (IllegalArgumentException unused) {
                                sy2 sy2Var = sy2.f61585a;
                                uuidFromString = null;
                                if (uuidFromString != null) {
                                    intent2 = new Intent();
                                    intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m21140j(intent));
                                    bundle2 = new Bundle();
                                    bundle2.putString("action_id", uuidFromString.toString());
                                    if (facebookException != null) {
                                        if (lp1.f49971a.contains(s76.class)) {
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
                                }
                                return null;
                            }
                            if (uuidFromString != null) {
                                intent2 = new Intent();
                                intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m21140j(intent));
                                bundle2 = new Bundle();
                                bundle2.putString("action_id", uuidFromString.toString());
                                if (facebookException != null) {
                                    if (lp1.f49971a.contains(s76.class)) {
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
                            }
                        } else {
                            uuidFromString = null;
                            if (uuidFromString != null) {
                                intent2 = new Intent();
                                intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", m21140j(intent));
                                bundle2 = new Bundle();
                                bundle2.putString("action_id", uuidFromString.toString());
                                if (facebookException != null) {
                                    if (lp1.f49971a.contains(s76.class)) {
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
                            }
                        }
                    } catch (Throwable th2) {
                        lp1.m16420a(s76.class, th2);
                        uuidFromString = null;
                    }
                }
            } catch (Throwable th3) {
                lp1.m16420a(s76.class, th3);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final int m21138h() {
        if (lp1.f49971a.contains(s76.class)) {
            return 0;
        }
        try {
            return f60470d[0].intValue();
        } catch (Throwable th) {
            lp1.m16420a(s76.class, th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final Bundle m21139i(Intent intent) {
        if (lp1.f49971a.contains(s76.class)) {
            return null;
        }
        try {
            return !m21141k(m21140j(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            lp1.m16420a(s76.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final int m21140j(Intent intent) {
        if (lp1.f49971a.contains(s76.class)) {
            return 0;
        }
        try {
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            lp1.m16420a(s76.class, th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m21141k(int i) {
        if (lp1.f49971a.contains(s76.class)) {
            return false;
        }
        try {
            return AbstractC3550rv.m20823Q(f60470d, Integer.valueOf(i)) && i >= 20140701;
        } catch (Throwable th) {
            lp1.m16420a(s76.class, th);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m21142l() {
        if (lp1.f49971a.contains(s76.class)) {
            return;
        }
        try {
            if (f60469c.compareAndSet(false, true)) {
                sy2.m21768c().execute(new RunnableC3637u6(11));
            }
        } catch (Throwable th) {
            lp1.m16420a(s76.class, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m21143a() {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            return vz1.m23627e(new p76(1), new p76(3));
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Intent m21144c(r76 r76Var, String str, Collection collection, String str2, boolean z, DefaultAudience defaultAudience, String str3, String str4, boolean z2, String str5, boolean z3, LoginTargetApp loginTargetApp, boolean z4, boolean z5, String str6, String str7, String str8) {
        String strConcat;
        Set set = lp1.f49971a;
        if (!set.contains(this)) {
            try {
                String strMo18933b = r76Var.mo18933b();
                if (strMo18933b != null) {
                    Intent intentPutExtra = new Intent().setClassName(r76Var.mo18934c(), strMo18933b).putExtra("client_id", str);
                    intentPutExtra.getClass();
                    sy2 sy2Var = sy2.f61585a;
                    intentPutExtra.putExtra("facebook_sdk_version", "18.2.3");
                    if (!(collection == null || collection.isEmpty())) {
                        intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
                    }
                    if (!bna.m3945d0(str2)) {
                        intentPutExtra.putExtra("e2e", str2);
                    }
                    intentPutExtra.putExtra("state", str3);
                    intentPutExtra.putExtra("response_type", r76Var.mo19702d());
                    intentPutExtra.putExtra("nonce", str6);
                    intentPutExtra.putExtra("return_scopes", "true");
                    if (z) {
                        intentPutExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
                    }
                    intentPutExtra.putExtra("legacy_override", sy2.m21769d());
                    intentPutExtra.putExtra("auth_type", str4);
                    if (z2) {
                        intentPutExtra.putExtra("fail_on_logged_out", true);
                    }
                    intentPutExtra.putExtra("messenger_page_id", str5);
                    intentPutExtra.putExtra("reset_messenger_state", z3);
                    if (z4) {
                        intentPutExtra.putExtra("fx_app", loginTargetApp.toString());
                    }
                    if (z5) {
                        intentPutExtra.putExtra("skip_dedupe", true);
                    }
                    if (str7 != null && str7.length() != 0) {
                        intentPutExtra.putExtra("https_redirect_uri", str7);
                        return intentPutExtra;
                    }
                    if (str8 != null && str8.length() != 0) {
                        if (set.contains(this)) {
                            strConcat = null;
                        } else {
                            try {
                                strConcat = "intent://".concat(str8);
                            } catch (Throwable th) {
                                lp1.m16420a(this, th);
                                strConcat = null;
                            }
                        }
                        intentPutExtra.putExtra("intent_uri_package_target", strConcat);
                    }
                    return intentPutExtra;
                }
            } catch (Throwable th2) {
                lp1.m16420a(this, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final TreeSet m21145f(r76 r76Var) {
        Uri uri;
        Cursor cursorQuery;
        ProviderInfo providerInfoResolveContentProvider;
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = sy2.m21766a().getContentResolver();
            String[] strArr = {"version"};
            if (set.contains(this)) {
                uri = null;
            } else {
                try {
                    Uri uri2 = Uri.parse("content://" + r76Var.mo18934c() + ".provider.PlatformProvider/versions");
                    uri2.getClass();
                    uri = uri2;
                } catch (Throwable th) {
                    lp1.m16420a(this, th);
                    uri = null;
                }
            }
            try {
                try {
                    providerInfoResolveContentProvider = sy2.m21766a().getPackageManager().resolveContentProvider(r76Var.mo18934c().concat(".provider.PlatformProvider"), 0);
                } catch (RuntimeException e) {
                    Log.e("s76", "Failed to query content resolver.", e);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        try {
                            cursorQuery = contentResolver.query(uri, strArr, null, null, null);
                        } catch (IllegalArgumentException unused) {
                            Log.e("s76", "Failed to query content resolver.");
                            cursorQuery = null;
                        }
                    } catch (NullPointerException unused2) {
                        Log.e("s76", "Failed to query content resolver.");
                        cursorQuery = null;
                    } catch (SecurityException unused3) {
                        Log.e("s76", "Failed to query content resolver.");
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
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
            } catch (Throwable th3) {
                th = th3;
                cursorQuery = null;
            }
        } catch (Throwable th4) {
            lp1.m16420a(this, th4);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final cp3 m21146g(List list, int[] iArr) {
        if (lp1.f49971a.contains(this)) {
            return null;
        }
        try {
            m21142l();
            if (list == null) {
                return qqb.m20120b();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r76 r76Var = (r76) it.next();
                TreeSet treeSet = r76Var.f58856a;
                if (treeSet == null || treeSet.isEmpty()) {
                    r76Var.m20434a(false);
                }
                int iM21135b = m21135b(r76Var.f58856a, m21138h(), iArr);
                if (iM21135b != -1) {
                    return qqb.m20119a(iM21135b);
                }
            }
            return qqb.m20120b();
        } catch (Throwable th) {
            lp1.m16420a(this, th);
            return null;
        }
    }
}
