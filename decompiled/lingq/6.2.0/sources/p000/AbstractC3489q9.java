package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.C0357g;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.SettingsAPIFields;
import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.language.LanguageContextNotification;
import com.lingq.core.domain.model.library.C1469k;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.network.api.result.ResultLanguage;
import com.lingq.core.network.api.result.ResultLanguageContext;
import com.lingq.core.network.api.result.ResultLanguageContextNotification;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import okhttp3.Protocol;

/* JADX INFO: renamed from: q9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3489q9 {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ int f57404A = 0;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ int f57405B = 0;

    /* JADX INFO: renamed from: a */
    public static boolean f57406a;

    /* JADX INFO: renamed from: b */
    public static final C2934dn f57407b = new C2934dn(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    public static final C2970en f57408c = new C2970en(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    public static final C3007fn f57409d = new C3007fn(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    public static final C3044gn f57410e = new C3044gn(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    public static final C2934dn f57411f = new C2934dn(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    public static final C2970en f57412g = new C2970en(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h */
    public static final C3007fn f57413h = new C3007fn(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i */
    public static final C3044gn f57414i = new C3044gn(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: j */
    public static final sy5 f57415j = new sy5(232, 233, 10);

    /* JADX INFO: renamed from: k */
    public static final sy5 f57416k = new sy5(244, 245, 11);

    /* JADX INFO: renamed from: l */
    public static final sy5 f57417l = new sy5(247, 248, 12);

    /* JADX INFO: renamed from: m */
    public static final sy5 f57418m = new sy5(253, 254, 13);

    /* JADX INFO: renamed from: n */
    public static final sy5 f57419n = new sy5(278, 279, 14);

    /* JADX INFO: renamed from: o */
    public static final sy5 f57420o = new sy5(285, 286, 15);

    /* JADX INFO: renamed from: p */
    public static final sy5 f57421p = new sy5(293, 294, 17);

    /* JADX INFO: renamed from: q */
    public static final sy5 f57422q = new sy5(304, 305, 18);

    /* JADX INFO: renamed from: r */
    public static final sy5 f57423r = new sy5(288, 289, 16);

    /* JADX INFO: renamed from: s */
    public static final StackTraceElement[] f57424s = new StackTraceElement[0];

    /* JADX INFO: renamed from: t */
    public static final sz9 f57425t = new sz9(0, new long[0], new Object[0]);

    /* JADX INFO: renamed from: u */
    public static final tnd f57426u;

    /* JADX INFO: renamed from: v */
    public static final und f57427v;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f57428w = 0;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f57429x = 0;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f57430y = 0;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f57431z = 0;

    static {
        int i = 1;
        f57426u = new tnd(i);
        f57427v = new und(i);
    }

    /* JADX INFO: renamed from: A */
    public static LinkedHashSet m19764A(Set set, Iterable iterable) {
        int size;
        set.getClass();
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3194a.m15363P(size));
        linkedHashSet.addAll(set);
        u91.m22630w0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: B */
    public static LinkedHashSet m19765B(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3194a.m15363P(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: C */
    public static Set m19766C(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    /* JADX INFO: renamed from: D */
    public static void m19767D(HashMap map) {
        SharedPreferences sharedPreferences = sy2.m21766a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
        Object obj = map.get(settingsAPIFields.getRawValue());
        SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
        Object obj2 = map.get(settingsAPIFields2.getRawValue());
        SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
        Object obj3 = map.get(settingsAPIFields3.getRawValue());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(settingsAPIFields.getRawValue(), obj.toString());
        editorEdit.putString(settingsAPIFields2.getRawValue(), obj2.toString());
        editorEdit.putString(settingsAPIFields3.getRawValue(), obj3.toString());
        editorEdit.apply();
        iy5 iy5Var = qj5.f57852d;
        iy5.m14198n(LoggingBehavior.APP_EVENTS, "q9".toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }

    /* JADX INFO: renamed from: E */
    public static final wl4 m19768E(ResultLanguage resultLanguage) {
        resultLanguage.getClass();
        String str = resultLanguage.f20864b;
        Integer num = resultLanguage.f20863a;
        Boolean bool = resultLanguage.f20865c;
        String str2 = resultLanguage.f20866d;
        String str3 = resultLanguage.f20867e;
        Integer num2 = resultLanguage.f20868f;
        return new wl4(str, num, bool, str2, str3, Integer.valueOf(num2 != null ? num2.intValue() : 0), resultLanguage.f20869g, resultLanguage.f20870h, resultLanguage.f20871i);
    }

    /* JADX INFO: renamed from: F */
    public static final LanguageContextEntity m19769F(ResultLanguageContext resultLanguageContext, String str) {
        ArrayList arrayList;
        resultLanguageContext.getClass();
        ResultLanguage resultLanguage = resultLanguageContext.f20883k;
        str.getClass();
        Iterable iterable = resultLanguageContext.f20885m;
        if (iterable == null) {
            iterable = EmptyList.f47638a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(((Boolean) it.next()).booleanValue()));
        }
        int i = resultLanguageContext.f20873a;
        String str2 = resultLanguageContext.f20874b;
        int i2 = resultLanguageContext.f20875c;
        List list = resultLanguageContext.f20876d;
        ResultLanguageContextNotification resultLanguageContextNotification = resultLanguageContext.f20877e;
        LanguageContextNotification languageContextNotification = resultLanguageContextNotification != null ? new LanguageContextNotification(resultLanguageContextNotification.f20886a, resultLanguageContextNotification.f20887b) : null;
        ResultLanguageContextNotification resultLanguageContextNotification2 = resultLanguageContext.f20878f;
        LanguageContextNotification languageContextNotification2 = resultLanguageContextNotification2 != null ? new LanguageContextNotification(resultLanguageContextNotification2.f20886a, resultLanguageContextNotification2.f20887b) : null;
        Boolean bool = resultLanguageContext.f20879g;
        String str3 = resultLanguageContext.f20880h;
        Integer num = resultLanguageContext.f20881i;
        List list2 = resultLanguageContext.f20882j;
        Boolean bool2 = resultLanguage != null ? resultLanguage.f20865c : null;
        String str4 = resultLanguage != null ? resultLanguage.f20866d : null;
        String str5 = resultLanguage != null ? resultLanguage.f20867e : null;
        Integer num2 = resultLanguage != null ? resultLanguage.f20868f : null;
        String str6 = resultLanguage != null ? resultLanguage.f20870h : null;
        int i3 = resultLanguageContext.f20884l;
        if (arrayList2.isEmpty()) {
            LibrarySearchQuery.Companion.getClass();
            LinkedHashMap linkedHashMapM8095a = C1469k.m8095a(LearningLevel.Beginner1.ordinal(), LearningLevel.Advanced2.ordinal());
            ArrayList arrayList3 = new ArrayList(linkedHashMapM8095a.size());
            Iterator it2 = linkedHashMapM8095a.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList3.add(String.valueOf(((Boolean) ((Map.Entry) it2.next()).getValue()).booleanValue()));
            }
            arrayList = arrayList3;
        } else {
            arrayList = arrayList2;
        }
        return new LanguageContextEntity(str, i, str2, i2, list, languageContextNotification, languageContextNotification2, bool, str3, num, i3, list2, bool2, str4, str5, num2, str6, arrayList, resultLanguage != null ? resultLanguage.f20871i : null);
    }

    /* JADX INFO: renamed from: G */
    public static vnd m19770G(Set set) {
        vnd vndVar = new vnd();
        vndVar.f65682d = f57427v;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            end endVar = (end) it.next();
            dja.m10418b(endVar, "key");
            boolean z = endVar.f37586c;
            HashMap map = vndVar.f65680b;
            HashMap map2 = vndVar.f65679a;
            if (!z) {
                map.remove(endVar);
                map2.put(endVar, vnd.f65677e);
            } else {
                if (!z) {
                    C3386nv.m17626m("key must be repeating");
                    return null;
                }
                map2.remove(endVar);
                map.put(endVar, vnd.f65678f);
            }
        }
        return vndVar;
    }

    /* JADX INFO: renamed from: a */
    public static C0059a m19771a(float f) {
        return new C0059a(Float.valueOf(f), pk9.f56363h, Float.valueOf(0.01f), 8);
    }

    /* JADX INFO: renamed from: b */
    public static final jb2 m19772b(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        sb3 sb3VarM21931a = tb3.m21931a(f);
        if (sb3VarM21931a == null) {
            sb3VarM21931a = new wc5(f);
        }
        return new jb2(f2, f, sb3VarM21931a);
    }

    /* JADX INFO: renamed from: c */
    public static final void m19773c(long j, vx9 vx9Var, zi3 zi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-684938728);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22118f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(vx9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(zi3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            zf1 zf1Var = lw9.f50220a;
            pvc.m19508d(new a02[]{AbstractC3393o1.m17727b(j, sk1.f60948a), zf1Var.mo1265a(((vx9) tj3Var.m22128k(zf1Var)).m23588e(vx9Var))}, zi3Var, tj3Var, ((i2 >> 3) & 112) | 8);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new po7(j, vx9Var, zi3Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final d16 m19774d(ea2 ea2Var, int i) {
        d16 d16Var = ((d16) ea2Var).f34837a.f34842f;
        if (d16Var == null || (d16Var.f34840d & i) == 0) {
            return null;
        }
        while (d16Var != null) {
            int i2 = d16Var.f34839c;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return d16Var;
            }
            d16Var = d16Var.f34842f;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m19775e(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z) {
                if (z) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z ? i3 - i2 <= i : i2 > i) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            return i - i2;
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    public static SetBuilder m19776f(SetBuilder setBuilder) {
        MapBuilder mapBuilder = setBuilder.f47677a;
        mapBuilder.m15392b();
        return mapBuilder.f47669i > 0 ? setBuilder : SetBuilder.f47676b;
    }

    /* JADX INFO: renamed from: g */
    public static final float m19777g(f32 f32Var, float f, float f2) {
        h73 h73Var = f32Var.f38334a;
        C2934dn c2934dn = new C2934dn(0.0f);
        int iMo10484b = c2934dn.mo10484b();
        int i = 0;
        while (i < iMo10484b) {
            c2934dn.mo10487e(i, h73Var.mo13113p(i == 0 ? f : 0.0f, i == 0 ? f2 : 0.0f));
            i++;
        }
        return c2934dn.f35886a;
    }

    /* JADX INFO: renamed from: h */
    public static void m19778h(Object obj, Object obj2) {
        if (obj == null) {
            C3386nv.m17635v(AbstractC3393o1.m17733h(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m19779i(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    /* JADX INFO: renamed from: j */
    public static final ya3 m19780j(Context context) {
        return new ya3(new C3002fi(context, 0), new C3039gi(Build.VERSION.SDK_INT >= 31 ? cc3.f9880a.m4503a(context) : 0));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m19781k(xg3 xg3Var, String str, String str2) {
        xg3Var.getClass();
        Cursor cursorM24501r = xg3Var.m24501r("PRAGMA table_info(" + str + ")");
        while (cursorM24501r.moveToNext()) {
            int columnIndex = cursorM24501r.getColumnIndex("name");
            if (columnIndex != -1 && fa4.m11650l(cursorM24501r.getString(columnIndex), str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:114:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0111, B:62:0x012e, B:64:0x0134, B:67:0x0140, B:69:0x0144, B:70:0x014d, B:58:0x011b, B:60:0x0126, B:92:0x01b0, B:93:0x01b7), top: B:113:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0106 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0111, B:62:0x012e, B:64:0x0134, B:67:0x0140, B:69:0x0144, B:70:0x014d, B:58:0x011b, B:60:0x0126, B:92:0x01b0, B:93:0x01b7), top: B:113:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0111, B:62:0x012e, B:64:0x0134, B:67:0x0140, B:69:0x0144, B:70:0x014d, B:58:0x011b, B:60:0x0126, B:92:0x01b0, B:93:0x01b7), top: B:113:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x011b A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0111, B:62:0x012e, B:64:0x0134, B:67:0x0140, B:69:0x0144, B:70:0x014d, B:58:0x011b, B:60:0x0126, B:92:0x01b0, B:93:0x01b7), top: B:113:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:5:0x000e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0126 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0111, B:62:0x012e, B:64:0x0134, B:67:0x0140, B:69:0x0144, B:70:0x014d, B:58:0x011b, B:60:0x0126, B:92:0x01b0, B:93:0x01b7), top: B:113:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0134 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0111, B:62:0x012e, B:64:0x0134, B:67:0x0140, B:69:0x0144, B:70:0x014d, B:58:0x011b, B:60:0x0126, B:92:0x01b0, B:93:0x01b7), top: B:113:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0140 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0111, B:62:0x012e, B:64:0x0134, B:67:0x0140, B:69:0x0144, B:70:0x014d, B:58:0x011b, B:60:0x0126, B:92:0x01b0, B:93:0x01b7), top: B:113:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0144 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0111, B:62:0x012e, B:64:0x0134, B:67:0x0140, B:69:0x0144, B:70:0x014d, B:58:0x011b, B:60:0x0126, B:92:0x01b0, B:93:0x01b7), top: B:113:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x014d A[Catch: all -> 0x00e3, Exception -> 0x00e7, TRY_LEAVE, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0111, B:62:0x012e, B:64:0x0134, B:67:0x0140, B:69:0x0144, B:70:0x014d, B:58:0x011b, B:60:0x0126, B:92:0x01b0, B:93:0x01b7), top: B:113:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:75:0x0161 A[Catch: all -> 0x018e, Exception -> 0x0192, TryCatch #8 {Exception -> 0x0192, all -> 0x018e, blocks: (B:72:0x015a, B:75:0x0161, B:78:0x0177, B:80:0x017d, B:88:0x01a2), top: B:114:0x015a }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b0 A[Catch: all -> 0x00e3, Exception -> 0x00e7, TRY_ENTER, TryCatch #9 {Exception -> 0x00e7, all -> 0x00e3, blocks: (B:40:0x00c2, B:42:0x00d0, B:44:0x00d4, B:51:0x00ec, B:53:0x0106, B:55:0x0111, B:62:0x012e, B:64:0x0134, B:67:0x0140, B:69:0x0144, B:70:0x014d, B:58:0x011b, B:60:0x0126, B:92:0x01b0, B:93:0x01b7), top: B:113:0x00c2 }] */
    /* JADX INFO: renamed from: l */
    public static C3388nx m19782l(Context context) throws Throwable {
        C3388nx c3388nx;
        Exception exc;
        Cursor cursor;
        Throwable th;
        C3388nx c3388nx2;
        String[] strArr;
        ProviderInfo providerInfoResolveContentProvider;
        ProviderInfo providerInfoResolveContentProvider2;
        Uri uri;
        String str;
        Uri uri2;
        PackageManager packageManager;
        String installerPackageName;
        Cursor cursorQuery;
        int columnIndex;
        int columnIndex2;
        String str2;
        Method methodM3935X;
        Object objM3937Z;
        Cursor cursor2 = null;
        try {
            if (!m19791u(context) || (methodM3935X = bna.m3935X("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (objM3937Z = bna.m3937Z(null, methodM3935X, context)) == null) {
                c3388nx = null;
            } else {
                Method methodM3934W = bna.m3934W(objM3937Z.getClass(), "getId", new Class[0]);
                Method methodM3934W2 = bna.m3934W(objM3937Z.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodM3934W == null || methodM3934W2 == null) {
                    c3388nx = null;
                } else {
                    c3388nx = new C3388nx();
                    c3388nx.f53346a = (String) bna.m3937Z(objM3937Z, methodM3934W, new Object[0]);
                    Boolean bool = (Boolean) bna.m3937Z(objM3937Z, methodM3934W2, new Object[0]);
                    c3388nx.f53350e = bool != null ? bool.booleanValue() : false;
                }
            }
        } catch (Exception unused) {
            sy2 sy2Var = sy2.f61585a;
        }
        if (c3388nx == null) {
            if (m19791u(context)) {
                ServiceConnectionC3351mx serviceConnectionC3351mx = new ServiceConnectionC3351mx();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (context.bindService(intent, serviceConnectionC3351mx, 1)) {
                        try {
                            try {
                                C3314lx c3314lx = new C3314lx(serviceConnectionC3351mx.m17080a());
                                C3388nx c3388nx3 = new C3388nx();
                                c3388nx3.f53346a = c3314lx.m16560F();
                                c3388nx3.f53350e = c3314lx.m16561G();
                                context.unbindService(serviceConnectionC3351mx);
                                c3388nx = c3388nx3;
                            } catch (Exception unused2) {
                                sy2 sy2Var2 = sy2.f61585a;
                                context.unbindService(serviceConnectionC3351mx);
                                c3388nx = null;
                                if (c3388nx == null) {
                                    c3388nx = new C3388nx();
                                }
                                if (!fa4.m11650l(Looper.myLooper(), Looper.getMainLooper())) {
                                    throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                                }
                                c3388nx2 = C3388nx.f53345f;
                                if (c3388nx2 == null) {
                                }
                                strArr = new String[]{"aid", "androidid", "limit_tracking"};
                                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                                providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                                if (providerInfoResolveContentProvider != null) {
                                    str2 = providerInfoResolveContentProvider.packageName;
                                    str2.getClass();
                                    if (ty2.m22350a(context, str2)) {
                                        uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                                    } else {
                                        if (providerInfoResolveContentProvider2 != null) {
                                            str = providerInfoResolveContentProvider2.packageName;
                                            str.getClass();
                                            if (ty2.m22350a(context, str)) {
                                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                            }
                                        }
                                        uri = null;
                                    }
                                    uri = uri2;
                                } else {
                                    if (providerInfoResolveContentProvider2 != null) {
                                        str = providerInfoResolveContentProvider2.packageName;
                                        str.getClass();
                                        if (ty2.m22350a(context, str)) {
                                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                            uri = uri2;
                                        }
                                    }
                                    uri = null;
                                }
                                packageManager = context.getPackageManager();
                                if (packageManager != null) {
                                    installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                                } else {
                                    installerPackageName = null;
                                }
                                if (installerPackageName != null) {
                                    c3388nx.f53349d = installerPackageName;
                                }
                                if (uri == null) {
                                    c3388nx.f53347b = System.currentTimeMillis();
                                    C3388nx.f53345f = c3388nx;
                                } else {
                                    cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                                    if (cursorQuery != null) {
                                        try {
                                            if (!cursorQuery.moveToFirst()) {
                                                int columnIndex3 = cursorQuery.getColumnIndex("aid");
                                                columnIndex = cursorQuery.getColumnIndex("androidid");
                                                columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                                                c3388nx.f53348c = cursorQuery.getString(columnIndex3);
                                                if (columnIndex > 0) {
                                                    c3388nx.f53346a = cursorQuery.getString(columnIndex);
                                                    c3388nx.f53350e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                                                }
                                                cursorQuery.close();
                                                c3388nx.f53347b = System.currentTimeMillis();
                                                C3388nx.f53345f = c3388nx;
                                                return c3388nx;
                                            }
                                        } catch (Exception e) {
                                            cursor = cursorQuery;
                                            exc = e;
                                            try {
                                                exc.toString();
                                                sy2 sy2Var3 = sy2.f61585a;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                return null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor2 = cursor;
                                                if (cursor2 != null) {
                                                    throw th;
                                                }
                                                cursor2.close();
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursorQuery;
                                            th = th;
                                            if (cursor2 != null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    }
                                    c3388nx.f53347b = System.currentTimeMillis();
                                    C3388nx.f53345f = c3388nx;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                }
                                return c3388nx;
                            }
                        } catch (Throwable th4) {
                            context.unbindService(serviceConnectionC3351mx);
                            throw th4;
                        }
                    } else {
                        c3388nx = null;
                    }
                } catch (SecurityException unused3) {
                }
            } else {
                c3388nx = null;
            }
            if (c3388nx == null) {
                c3388nx = new C3388nx();
            }
        }
        try {
            if (!fa4.m11650l(Looper.myLooper(), Looper.getMainLooper())) {
                throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
            }
            c3388nx2 = C3388nx.f53345f;
            if (c3388nx2 == null && System.currentTimeMillis() - c3388nx2.f53347b < 3600000) {
                return c3388nx2;
            }
            strArr = new String[]{"aid", "androidid", "limit_tracking"};
            providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
            providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
            if (providerInfoResolveContentProvider != null) {
                str2 = providerInfoResolveContentProvider.packageName;
                str2.getClass();
                if (ty2.m22350a(context, str2)) {
                    uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                } else {
                    if (providerInfoResolveContentProvider2 != null) {
                        str = providerInfoResolveContentProvider2.packageName;
                        str.getClass();
                        if (ty2.m22350a(context, str)) {
                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        }
                    }
                    uri = null;
                }
                uri = uri2;
            } else {
                if (providerInfoResolveContentProvider2 != null) {
                    str = providerInfoResolveContentProvider2.packageName;
                    str.getClass();
                    if (ty2.m22350a(context, str)) {
                        uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        uri = uri2;
                    }
                }
                uri = null;
            }
            packageManager = context.getPackageManager();
            if (packageManager != null) {
                installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
            } else {
                installerPackageName = null;
            }
            if (installerPackageName != null) {
                c3388nx.f53349d = installerPackageName;
            }
            if (uri == null) {
                c3388nx.f53347b = System.currentTimeMillis();
                C3388nx.f53345f = c3388nx;
            } else {
                cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    if (!cursorQuery.moveToFirst()) {
                        int columnIndex4 = cursorQuery.getColumnIndex("aid");
                        columnIndex = cursorQuery.getColumnIndex("androidid");
                        columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                        c3388nx.f53348c = cursorQuery.getString(columnIndex4);
                        if (columnIndex > 0 && columnIndex2 > 0 && c3388nx.m17663a() == null) {
                            c3388nx.f53346a = cursorQuery.getString(columnIndex);
                            c3388nx.f53350e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                        }
                        cursorQuery.close();
                        c3388nx.f53347b = System.currentTimeMillis();
                        C3388nx.f53345f = c3388nx;
                        return c3388nx;
                    }
                }
                c3388nx.f53347b = System.currentTimeMillis();
                C3388nx.f53345f = c3388nx;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return c3388nx;
        } catch (Exception e2) {
            exc = e2;
            cursor = null;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final ArrayList m19783m(aa4 aa4Var) {
        aa4Var.getClass();
        C0357g c0357gMo1622J0 = ((AbstractC0359i) aa4Var).mo1622J0();
        boolean zM19792v = m19792v(c0357gMo1622J0);
        List listM1603p = c0357gMo1622J0.m1603p();
        f66 f66Var = (f66) listM1603p;
        ArrayList arrayList = new ArrayList(((x66) f66Var.f38520b).f67832c);
        int size = listM1603p.size();
        for (int i = 0; i < size; i++) {
            C0357g c0357g = (C0357g) f66Var.get(i);
            arrayList.add(zM19792v ? c0357g.m1600m() : c0357g.m1601n());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static final C3419on m19784n(vv9 vv9Var) {
        C3419on c3419on = vv9Var.f65990a;
        long j = vv9Var.f65991b;
        c3419on.getClass();
        return c3419on.subSequence(cx9.m9924f(j), cx9.m9923e(j));
    }

    /* JADX INFO: renamed from: o */
    public static final C3419on m19785o(vv9 vv9Var, int i) {
        C3419on c3419on = vv9Var.f65990a;
        C3419on c3419on2 = vv9Var.f65990a;
        long j = vv9Var.f65991b;
        int iM9923e = cx9.m9923e(j);
        int iM9923e2 = cx9.m9923e(j);
        int length = iM9923e2 + i;
        if (((i ^ length) & (iM9923e2 ^ length)) < 0) {
            length = c3419on2.f54604b.length();
        }
        return c3419on.subSequence(iM9923e, Math.min(length, c3419on2.f54604b.length()));
    }

    /* JADX INFO: renamed from: p */
    public static final C3419on m19786p(vv9 vv9Var, int i) {
        C3419on c3419on = vv9Var.f65990a;
        long j = vv9Var.f65991b;
        int iM9924f = cx9.m9924f(j);
        int i2 = iM9924f - i;
        if (((iM9924f ^ i2) & (i ^ iM9924f)) < 0) {
            i2 = 0;
        }
        return c3419on.subSequence(Math.max(0, i2), cx9.m9924f(j));
    }

    /* JADX INFO: renamed from: q */
    public static final int m19787q(bk8 bk8Var) throws Exception {
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT changes()");
        try {
            ik8VarMo2873e0.mo2876a0();
            int i = (int) ik8VarMo2873e0.getLong(0);
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static HashSet m19788r(Object... objArr) {
        HashSet hashSet = new HashSet(AbstractC3194a.m15363P(objArr.length));
        AbstractC3550rv.m20848p0(objArr, hashSet);
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static final void m19789s(ll2 ll2Var) {
        if (((d16) ll2Var).f34837a.f34836I) {
            te1.m21976I(ll2Var, 1).m1690m1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0031  */
    /* JADX WARN: Code duplicated, block: B:26:0x003b  */
    /* JADX INFO: renamed from: t */
    public static boolean m19790t(j88 j88Var, co7 co7Var) {
        String strM20121d;
        co7Var.getClass();
        int i = j88Var.f45204d;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i == 307) {
                strM20121d = j88Var.f45206f.m20121d("Expires");
                if (strM20121d == null) {
                    strM20121d = null;
                }
                if (strM20121d == null && j88Var.m14325a().f40928c == -1 && !j88Var.m14325a().f40931f && !j88Var.m14325a().f40930e) {
                    return false;
                }
            } else if (i != 308 && i != 404 && i != 405) {
                switch (i) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        strM20121d = j88Var.f45206f.m20121d("Expires");
                        if (strM20121d == null) {
                            strM20121d = null;
                        }
                        if (strM20121d == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return (j88Var.m14325a().f40927b || co7Var.m4934j().f40927b) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m19791u(Context context) {
        Method methodM3935X = bna.m3935X("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodM3935X != null) {
            Object objM3937Z = bna.m3937Z(null, methodM3935X, context);
            if ((objM3937Z instanceof Integer) && objM3937Z.equals(0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m19792v(C0357g c0357g) {
        int i = kt5.f48413a[c0357g.f4337b0.f58058d.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            if (i == 5) {
                C0357g c0357gM1610w = c0357g.m1610w();
                if (c0357gM1610w != null) {
                    return m19792v(c0357gM1610w);
                }
                C3386nv.m17626m("no parent for idle node");
                return false;
            }
            gm5.m12750e();
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static LinkedHashSet m19793w(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC3194a.m15363P(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && fa4.m11650l(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: x */
    public static final e16 m19794x(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new fi4(vi3Var, null));
    }

    /* JADX INFO: renamed from: y */
    public static final e16 m19795y(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new fi4(null, vi3Var));
    }

    /* JADX INFO: renamed from: z */
    public static C3047gq m19796z(String str) throws ProtocolException {
        Protocol protocol;
        int i;
        String strSubstring;
        if (cl9.m4842Y(str, "HTTP/1.", false)) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else if (cl9.m4842Y(str, "ICY ", false)) {
            protocol = Protocol.HTTP_1_0;
            i = 4;
        } else {
            if (!cl9.m4842Y(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            protocol = Protocol.HTTP_1_1;
            i = 12;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numM4844a0 = cl9.m4844a0(str.substring(i, i2));
        if (numM4844a0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numM4844a0.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new C3047gq(protocol, iIntValue, strSubstring);
    }
}
