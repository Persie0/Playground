package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Matrix;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Patterns;
import android.util.Xml;
import android.webkit.URLUtil;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;
import androidx.core.R$styleable;
import androidx.lifecycle.Lifecycle$Event;
import com.google.android.datatransport.Priority;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C1154a;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.reporting.MessagingClientEvent$Event;
import com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType;
import com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.network.api.result.ResultLessonMediaSource;
import com.lingq.core.network.api.result.ResultLibraryItem;
import com.lingq.core.p012ui.R$string;
import java.io.EOFException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlin.text.Regex;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.C3244l;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: my */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3352my {

    /* JADX INFO: renamed from: a */
    public static AudioManager f52014a;

    /* JADX INFO: renamed from: b */
    public static final float[] f52015b = new float[91];

    /* JADX INFO: renamed from: c */
    public static final es6 f52016c = new es6(4);

    /* JADX INFO: renamed from: d */
    public static final gr7 f52017d = new gr7(12);

    /* JADX INFO: renamed from: e */
    public static final StackTraceElement[] f52018e = new StackTraceElement[0];

    /* JADX INFO: renamed from: f */
    public static final C0842cc f52019f;

    /* JADX INFO: renamed from: g */
    public static final C0842cc f52020g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f52021h = 0;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f52022i = 0;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f52023j = 0;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f52024k = 0;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f52025l = 0;

    static {
        int i = 5;
        f52019f = new C0842cc("NONE", i);
        f52020g = new C0842cc("PENDING", i);
    }

    /* JADX INFO: renamed from: A */
    public static final String m17082A(double d) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance(Locale.getDefault());
        percentInstance.setMinimumFractionDigits((d % 1.0d == 0.0d ? 1 : 0) ^ 1);
        percentInstance.setMaximumFractionDigits(2);
        String str = percentInstance.format(d / 100.0d);
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: B */
    public static synchronized AudioManager m17083B(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f52014a = null;
            }
            AudioManager audioManager = f52014a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                hg1 hg1Var = new hg1();
                l70.m15956s().execute(new RunnableC3470pr(3, applicationContext, hg1Var));
                hg1Var.m13224a();
                AudioManager audioManager2 = f52014a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f52014a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: C */
    public static final String m17084C(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case 689615:
                return !str.equals("副詞") ? "" : "adverbs";
            case 692777:
                return !str.equals("動詞") ? "" : "verb-tenses";
            case 702449:
                return str.equals("名詞") ? "nouns" : "";
            case 20109844:
                return !str.equals("代名詞") ? "" : "pronouns";
            case 24229031:
                return !str.equals("形容詞") ? "" : "adjectives";
            case 25359787:
                return !str.equals("指示詞") ? "" : "determiners";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: D */
    public static final ArrayList m17085D(Matcher matcher) {
        int i;
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            int iGroupCount = matcher.groupCount();
            if (1 <= iGroupCount) {
                while (true) {
                    String strGroup = matcher.group(i);
                    if (strGroup != null) {
                        arrayList.add(strGroup);
                    }
                    i = i != iGroupCount ? i + 1 : 1;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public static final sm0 m17086E(Continuation continuation) {
        if (!(continuation instanceof kh2)) {
            return new sm0(1, continuation);
        }
        sm0 sm0VarM15236k = ((kh2) continuation).m15236k();
        if (sm0VarM15236k != null) {
            if (!sm0VarM15236k.m21456D()) {
                sm0VarM15236k = null;
            }
            if (sm0VarM15236k != null) {
                return sm0VarM15236k;
            }
        }
        return new sm0(2, continuation);
    }

    /* JADX INFO: renamed from: F */
    public static SharedPreferences m17087F(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX INFO: renamed from: G */
    public static final boolean m17088G(aj0 aj0Var) {
        aj0Var.getClass();
        try {
            e18 e18Var = new e18(new s67(aj0Var));
            for (long j = 0; j < 16 && !e18Var.m10787a(); j++) {
                e18Var.mo475b0(1L);
                aj0 aj0Var2 = e18Var.f36575b;
                byte bM494q = aj0Var2.m494q(0L);
                if ((bM494q & 224) == 192) {
                    e18Var.mo475b0(2L);
                } else if ((bM494q & 240) == 224) {
                    e18Var.mo475b0(3L);
                } else if ((bM494q & 248) == 240) {
                    e18Var.mo475b0(4L);
                }
                int iM481g0 = aj0Var2.m481g0();
                if (Character.isISOControl(iM481g0) && !Character.isWhitespace(iM481g0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m17089H(String str) {
        str.getClass();
        return Patterns.WEB_URL.matcher(str).matches() && URLUtil.isValidUrl(str);
    }

    /* JADX INFO: renamed from: I */
    public static int m17090I(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        v63.m23133k(wq1.m24115k("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
        return 0;
    }

    /* JADX INFO: renamed from: J */
    public static final String m17091J(String str) {
        str.getClass();
        if (str.equals(LanguageLearn.ChineseTraditional.getCode()) || str.equals("zh-tw")) {
            str = "zh_t";
        }
        if (str.equals("zh-cn")) {
            str = "zh";
        }
        if (str.equals("sr")) {
            str = LanguageLearn.Serbian.getCode();
        }
        if (fa4.m11650l(str, "hr")) {
            str = LanguageLearn.Croatian.getCode();
        }
        return AbstractC3393o1.m17734i("ic_flag_", str);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX INFO: renamed from: K */
    public static final String m17092K(Context context, String str, Locale locale) {
        context.getClass();
        str.getClass();
        String strReplace = str.replace('_', '-');
        strReplace.getClass();
        String displayName = Locale.forLanguageTag(strReplace).getDisplayName(locale);
        int iHashCode = str.hashCode();
        if (iHashCode != 3290) {
            if (iHashCode != 3331) {
                if (iHashCode != 3886) {
                    if (iHashCode != 3735957) {
                        if (iHashCode != 115814250) {
                            if (iHashCode == 115814786 && str.equals("zh-tw")) {
                                displayName = context.getString(R$string.language_zh_t);
                            }
                        } else if (str.equals("zh-cn")) {
                            displayName = context.getString(R$string.language_zh);
                        }
                    } else if (str.equals("zh-t")) {
                        displayName = context.getString(R$string.language_zh_t);
                    }
                } else if (str.equals("zh")) {
                    displayName = context.getString(R$string.language_zh);
                }
            } else if (str.equals("hk")) {
                displayName = context.getString(R$string.language_hk);
            }
        } else if (str.equals("ga")) {
            displayName = context.getString(R$string.language_ga);
        }
        displayName.getClass();
        if (displayName.length() <= 0) {
            return displayName;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = displayName.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? ci8.m4711X(cCharAt, locale) : String.valueOf(cCharAt)));
        sb.append(displayName.substring(1));
        return sb.toString();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ String m17093L(Context context, String str) {
        Locale locale = Locale.getDefault();
        locale.getClass();
        return m17092K(context, str, locale);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:90:0x0187  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public static void m17094M(Intent intent) {
        int iIntValue;
        Object[] objArr;
        long j;
        q43 q43VarM19641c;
        a53 a53Var;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        if (m17109a0(intent)) {
            m17095N("_nr", intent.getExtras());
        }
        int i = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : m17143v()) {
            MessagingClientEvent$Event messagingClientEvent$Event = MessagingClientEvent$Event.MESSAGE_DELIVERED;
            fba fbaVar = (fba) FirebaseMessaging.f13719k.get();
            if (fbaVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            int i2 = 10;
            wx5 wx5VarM23566a = null;
            str = null;
            String str4 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                vx5 vx5VarM24201a = wx5.m24201a();
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        iIntValue = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = 0;
                }
                vx5VarM24201a.m23579n(iIntValue);
                vx5VarM24201a.m23570e(messagingClientEvent$Event);
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        q43 q43VarM19641c2 = q43.m19641c();
                        Object obj2 = C1154a.f13703m;
                        string = (String) Tasks.await(((C1154a) q43VarM19641c2.m19645b(x43.class)).m6697c());
                    } catch (InterruptedException | ExecutionException e) {
                        v63.m23141s(e);
                        return;
                    }
                }
                vx5VarM24201a.m23571f(string);
                q43 q43VarM19641c3 = q43.m19641c();
                q43VarM19641c3.m19644a();
                vx5VarM24201a.m23574i(q43VarM19641c3.f57252a.getPackageName());
                vx5VarM24201a.m23577l(MessagingClientEvent$SDKPlatform.ANDROID);
                vx5VarM24201a.m23573h(web.m23860H(extras) ? MessagingClientEvent$MessageType.DISPLAY_NOTIFICATION : MessagingClientEvent$MessageType.DATA_MESSAGE);
                String string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    objArr = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                }
                if (objArr == 2) {
                    i = 5;
                } else if (objArr == 1) {
                    i = 10;
                }
                vx5VarM24201a.m23575j(i);
                String string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    vx5VarM24201a.m23572g(string3);
                }
                String string4 = extras.getString("from");
                if (string4 != null && string4.startsWith("/topics/")) {
                    str4 = string4;
                }
                if (str4 != null) {
                    vx5VarM24201a.m23578m(str4);
                }
                String string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    vx5VarM24201a.m23568c(string5);
                }
                String string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    vx5VarM24201a.m23567b(string6);
                }
                String string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    vx5VarM24201a.m23569d(string7);
                }
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        j = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e2) {
                        Log.w("FirebaseMessaging", "error parsing project number", e2);
                        q43VarM19641c = q43.m19641c();
                        a53Var = q43VarM19641c.f57254c;
                        q43VarM19641c.m19644a();
                        str = a53Var.f264e;
                        if (str != null) {
                            try {
                                j = Long.parseLong(str);
                            } catch (NumberFormatException e3) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e3);
                                q43VarM19641c.m19644a();
                                str2 = a53Var.f261b;
                                if (str2.startsWith("1:")) {
                                    strArrSplit = str2.split(":");
                                    if (strArrSplit.length < 2) {
                                        j = 0;
                                    } else {
                                        str3 = strArrSplit[1];
                                        if (str3.isEmpty()) {
                                            j = 0;
                                        } else {
                                            try {
                                                j = Long.parseLong(str3);
                                            } catch (NumberFormatException e4) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", e4);
                                                j = 0;
                                            }
                                        }
                                    }
                                } else {
                                    try {
                                        j = Long.parseLong(str2);
                                    } catch (NumberFormatException e5) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                        j = 0;
                                    }
                                }
                            }
                        } else {
                            q43VarM19641c.m19644a();
                            str2 = a53Var.f261b;
                            if (str2.startsWith("1:")) {
                                j = Long.parseLong(str2);
                            } else {
                                strArrSplit = str2.split(":");
                                if (strArrSplit.length < 2) {
                                    j = 0;
                                } else {
                                    str3 = strArrSplit[1];
                                    if (str3.isEmpty()) {
                                        j = 0;
                                    } else {
                                        j = Long.parseLong(str3);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    q43VarM19641c = q43.m19641c();
                    a53Var = q43VarM19641c.f57254c;
                    q43VarM19641c.m19644a();
                    str = a53Var.f264e;
                    if (str != null) {
                        j = Long.parseLong(str);
                    } else {
                        q43VarM19641c.m19644a();
                        str2 = a53Var.f261b;
                        if (str2.startsWith("1:")) {
                            j = Long.parseLong(str2);
                        } else {
                            strArrSplit = str2.split(":");
                            if (strArrSplit.length < 2) {
                                j = 0;
                            } else {
                                str3 = strArrSplit[1];
                                if (str3.isEmpty()) {
                                    j = 0;
                                } else {
                                    j = Long.parseLong(str3);
                                }
                            }
                        }
                    }
                }
                if (j > 0) {
                    vx5VarM24201a.m23576k(j);
                }
                wx5VarM23566a = vx5VarM24201a.m23566a();
            }
            if (wx5VarM23566a == null) {
                return;
            }
            try {
                d50 d50Var = new d50(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                hba hbaVarM12466a = ((gba) fbaVar).m12466a("FCM_CLIENT_EVENT_LOGGING", new bs2("proto"), new fg2(i2));
                vqb vqbVarM24790a = xx5.m24790a();
                vqbVarM24790a.m23469A(wx5VarM23566a);
                hbaVarM12466a.m13185a(new j40(vqbVarM24790a.m23475r(), Priority.DEFAULT, d50Var), new uk9(8));
            } catch (RuntimeException e6) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m17095N(String str, Bundle bundle) {
        try {
            q43.m19641c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = web.m23860H(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC3036gf interfaceC3036gf = (InterfaceC3036gf) q43.m19641c().m19645b(InterfaceC3036gf.class);
            if (interfaceC3036gf != null) {
                ((C3182kf) interfaceC3036gf).m15167a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m17096O(String str, String str2) {
        str.getClass();
        str2.getClass();
        HashSet hashSetM19788r = AbstractC3489q9.m19788r("接尾辞", "接頭辞", "接続詞", "助詞", "助動詞", "連体詞", "んだ", "ていねいだ", "られる", "元気だ", "好きだ", "ビジュアルだ", "新ただ", "スリリングだ", "べきだ", "たつ", "ぬ", "のだ", "判定詞");
        if (!str2.equals(LanguageLearn.Japanese.getCode()) || hashSetM19788r.isEmpty()) {
            return false;
        }
        Iterator it = hashSetM19788r.iterator();
        while (it.hasNext()) {
            if (cl9.m4834Q((String) it.next(), str, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public static ob3 m17097P(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i;
        ArrayList arrayList;
        List list;
        TypedArray typedArray;
        Throwable th;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        ob3 ob3Var = null;
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m17111b0(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.FontFamily);
        String string = typedArrayObtainAttributes.getString(R$styleable.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(R$styleable.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(R$styleable.FontFamily_fontProviderQuery);
        String string4 = typedArrayObtainAttributes.getString(R$styleable.FontFamily_fontProviderFallbackQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(R$styleable.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(R$styleable.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = typedArrayObtainAttributes.getString(R$styleable.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList2 = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.FontFamilyFont);
                        int i2 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_fontWeight) ? R$styleable.FontFamilyFont_fontWeight : R$styleable.FontFamilyFont_android_fontWeight, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_fontStyle) ? R$styleable.FontFamilyFont_fontStyle : R$styleable.FontFamilyFont_android_fontStyle, 0);
                        int i3 = typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_ttcIndex) ? R$styleable.FontFamilyFont_ttcIndex : R$styleable.FontFamilyFont_android_ttcIndex;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_fontVariationSettings) ? R$styleable.FontFamilyFont_fontVariationSettings : R$styleable.FontFamilyFont_android_fontVariationSettings);
                        int i4 = typedArrayObtainAttributes2.getInt(i3, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(R$styleable.FontFamilyFont_font) ? R$styleable.FontFamilyFont_font : R$styleable.FontFamilyFont_android_font;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i5, 0);
                        typedArrayObtainAttributes2.getString(i5);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m17111b0(xmlResourceParser);
                        }
                        arrayList2.add(new qb3(i2, i4, resourceId2, string6, z));
                    } else {
                        m17111b0(xmlResourceParser);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new pb3((qb3[]) arrayList2.toArray(new qb3[0]));
        }
        List listM17100S = m17100S(resources, resourceId);
        ArrayList arrayList3 = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.FontFamilyProviderFallback);
                    try {
                        String string7 = typedArrayObtainAttributes3.getString(R$styleable.FontFamilyProviderFallback_fontProviderQuery);
                        String string8 = typedArrayObtainAttributes3.getString(R$styleable.FontFamilyProviderFallback_fontProviderSystemFontFamily);
                        String string9 = typedArrayObtainAttributes3.getString(R$styleable.FontFamilyProviderFallback_fontVariationSettings);
                        if (string7 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                m17111b0(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                typedArray = typedArrayObtainAttributes3;
                            }
                        }
                        arrayList = arrayList3;
                        list = listM17100S;
                        typedArray = typedArrayObtainAttributes3;
                        try {
                            hb3 hb3Var = new hb3(string, string2, string7, list, string8, string9);
                            hn1.m13363m(typedArray);
                            arrayList.add(hb3Var);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        th = th3;
                    } catch (Throwable th4) {
                        th = th4;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    th = th;
                    if (typedArray == null) {
                        throw th;
                    }
                    try {
                        hn1.m13363m(typedArray);
                        throw th;
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                        throw th;
                    }
                }
                arrayList = arrayList3;
                list = listM17100S;
                m17111b0(xmlResourceParser);
                string5 = string5;
                arrayList3 = arrayList;
                listM17100S = list;
                i = 2;
                integer2 = integer2;
                ob3Var = ob3Var;
            }
        }
        ob3 ob3Var2 = ob3Var;
        ArrayList arrayList4 = arrayList3;
        int i6 = integer2;
        List list2 = listM17100S;
        String str = string5;
        if (!arrayList4.isEmpty()) {
            return new rb3(integer, i6, str, arrayList4);
        }
        if (string3 == null) {
            C3386nv.m17626m("The provider font XML requires query attribute or fallback children.");
            return ob3Var2;
        }
        arrayList4.add(new hb3(string, string2, string3, list2, null, null));
        if (string4 != null) {
            arrayList4.add(new hb3(string, string2, string4, list2, null, null));
        }
        return new rb3(integer, i6, str, arrayList4);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x017a A[LOOP:5: B:102:0x0178->B:103:0x017a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x0190  */
    /* JADX WARN: Code duplicated, block: B:108:0x019a  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b3 A[LOOP:7: B:112:0x01b1->B:113:0x01b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:142:0x023d  */
    /* JADX WARN: Code duplicated, block: B:144:0x0241  */
    /* JADX WARN: Code duplicated, block: B:146:0x0245  */
    /* JADX WARN: Code duplicated, block: B:148:0x0249  */
    /* JADX WARN: Code duplicated, block: B:149:0x024b  */
    /* JADX WARN: Code duplicated, block: B:150:0x024e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0251  */
    /* JADX WARN: Code duplicated, block: B:152:0x0254  */
    /* JADX WARN: Code duplicated, block: B:154:0x0258  */
    /* JADX WARN: Code duplicated, block: B:155:0x025a  */
    /* JADX WARN: Code duplicated, block: B:162:0x026b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x026d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0279 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x027b  */
    /* JADX WARN: Code duplicated, block: B:169:0x028e  */
    /* JADX WARN: Code duplicated, block: B:201:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0231 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x02a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0173 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x01ac A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0130  */
    /* JADX WARN: Code duplicated, block: B:88:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x0159  */
    /* JADX WARN: Code duplicated, block: B:98:0x0161  */
    /* JADX INFO: renamed from: Q */
    public static long m17098Q(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        int i8;
        long j2;
        char cCharAt;
        DurationUnit durationUnit;
        long jM17120g;
        int i9;
        int iMin;
        int i10;
        int i11;
        int i12;
        int iMin2;
        int i13;
        int i14;
        double d;
        long jM21694U;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        lk5 lk5Var;
        int i15;
        char cCharAt6;
        int i16;
        if (str.length() == 0) {
            C3386nv.m17626m("The string is empty");
            return 0L;
        }
        char cCharAt7 = str.charAt(0);
        int i17 = 1;
        char c = '-';
        char c2 = '+';
        if (cCharAt7 != '+') {
            i2 = cCharAt7 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            C3386nv.m17626m("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            C3386nv.m17626m("");
            return 0L;
        }
        int i18 = i2 + 1;
        if (i18 == str.length()) {
            C3386nv.m17626m("");
            return 0L;
        }
        int i19 = 0;
        DurationUnit durationUnit2 = null;
        long jM15950m = 0;
        long j3 = 0;
        while (i18 < str.length()) {
            char cCharAt8 = str.charAt(i18);
            if (cCharAt8 != 'T') {
                lk5 lk5Var2 = lk5.f49762d;
                enb.m11275a();
                lk5 lk5Var3 = lk5.f49762d;
                if (lk5Var3.f49763a) {
                    i3 = i17;
                    char cCharAt9 = str.charAt(i18);
                    if (cCharAt9 == c2) {
                        i4 = i18 + 1;
                        i5 = i3;
                    } else if (cCharAt9 == c) {
                        i4 = i18 + 1;
                        i5 = -1;
                    }
                    while (i4 < str.length() && str.charAt(i4) == '0') {
                        i4++;
                    }
                    j = 0;
                    while (true) {
                        if (i4 < str.length()) {
                            cCharAt5 = str.charAt(i4);
                            lk5Var = lk5Var3;
                            if ('0' > cCharAt5 && cCharAt5 < ':') {
                                i15 = cCharAt5 - '0';
                                if (j <= lk5Var.f49764b) {
                                    if (j == lk5Var.f49764b) {
                                        i16 = i;
                                        if (i15 > lk5Var.f49765c) {
                                            i7 = i16;
                                        }
                                    } else {
                                        i16 = i;
                                    }
                                    int i20 = i16;
                                    j = (j << 3) + (j << i3) + ((long) i15);
                                    i4++;
                                    lk5Var3 = lk5Var;
                                    i18 = i18;
                                    i = i20;
                                } else {
                                    i7 = i;
                                }
                                int i21 = i18;
                                while (i4 < str.length() && '0' <= (cCharAt6 = str.charAt(i4)) && cCharAt6 < ':') {
                                    i4++;
                                }
                                if (i4 != str.length()) {
                                    if (i4 != i21 + ((cCharAt8 == '+' || cCharAt8 == '-') ? i3 : 0)) {
                                        lk5 lk5Var4 = lk5.f49762d;
                                        j = 4611686018427387903L;
                                    }
                                }
                                C3386nv.m17626m("");
                                return 0L;
                            }
                            j2 = j;
                            if (str.charAt(i4) == '.') {
                                i9 = i4 + 1;
                                iMin = Math.min(i4 + 7, str.length());
                                i11 = 0;
                                for (i10 = i9; i10 < iMin; i10++) {
                                    cCharAt4 = str.charAt(i10);
                                    if ('0' <= cCharAt4 || cCharAt4 >= ':') {
                                        for (i12 = 0; i12 < 6 - (i10 - i9); i12++) {
                                            i11 = (i11 << 1) + (i11 << 3);
                                        }
                                        iMin2 = Math.min(i10 + 9, str.length());
                                        i4 = i10;
                                        i13 = 0;
                                        while (i4 < iMin2) {
                                            cCharAt3 = str.charAt(i4);
                                            int i22 = iMin2;
                                            if ('0' <= cCharAt3 || cCharAt3 >= ':') {
                                                for (i14 = 0; i14 < 9 - (i4 - i10); i14++) {
                                                    i13 = (i13 << 1) + (i13 << 3);
                                                }
                                                while (i4 < str.length() && '0' <= (cCharAt2 = str.charAt(i4)) && cCharAt2 < ':') {
                                                    i4++;
                                                }
                                                if (i4 != i9 || i4 == str.length() || str.charAt(i4) != 'S') {
                                                    C3386nv.m17626m("");
                                                    return 0L;
                                                }
                                                long j4 = (((long) i11) * 1000000000) + ((long) i13);
                                                long j5 = i5;
                                                DurationUnit durationUnit3 = DurationUnit.SECONDS;
                                                double d2 = j4;
                                                switch (gn2.f41045a[durationUnit3.ordinal()]) {
                                                    case 1:
                                                        d = 1.0E-12d;
                                                        jM21694U = ss5.m21694U(d2 * d);
                                                        break;
                                                    case 2:
                                                        d = 1.0E-15d;
                                                        jM21694U = ss5.m21694U(d2 * d);
                                                        break;
                                                    case 3:
                                                        d = 1.0E-9d;
                                                        jM21694U = ss5.m21694U(d2 * d);
                                                        break;
                                                    case 4:
                                                        d = 1.0E-6d;
                                                        jM21694U = ss5.m21694U(d2 * d);
                                                        break;
                                                    case 5:
                                                        d = 6.0E-5d;
                                                        jM21694U = ss5.m21694U(d2 * d);
                                                        break;
                                                    case 6:
                                                        d = 0.0036d;
                                                        jM21694U = ss5.m21694U(d2 * d);
                                                        break;
                                                    case 7:
                                                        d = 0.0864d;
                                                        jM21694U = ss5.m21694U(d2 * d);
                                                        break;
                                                    default:
                                                        C3386nv.m17632s(durationUnit3, "Unknown unit: ");
                                                        jM21694U = 0;
                                                        break;
                                                }
                                                j3 = jM21694U * j5;
                                            } else {
                                                i13 = (cCharAt3 - '0') + (i13 << 3) + (i13 << 1);
                                                i4++;
                                                iMin2 = i22;
                                            }
                                        }
                                        while (i14 < 9 - (i4 - i10)) {
                                            i13 = (i13 << 1) + (i13 << 3);
                                        }
                                        while (i4 < str.length()) {
                                            i4++;
                                        }
                                        if (i4 != i9) {
                                        }
                                        C3386nv.m17626m("");
                                        return 0L;
                                    }
                                    i11 = (cCharAt4 - '0') + (i11 << 3) + (i11 << 1);
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 1) + (i11 << 3);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i4 = i10;
                                i13 = 0;
                                while (i4 < iMin2) {
                                    cCharAt3 = str.charAt(i4);
                                    int i23 = iMin2;
                                    if ('0' <= cCharAt3) {
                                    }
                                    while (i14 < 9 - (i4 - i10)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    while (i4 < str.length()) {
                                        i4++;
                                    }
                                    if (i4 != i9) {
                                    }
                                    C3386nv.m17626m("");
                                    return 0L;
                                }
                                while (i14 < 9 - (i4 - i10)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                while (i4 < str.length()) {
                                    i4++;
                                }
                                if (i4 != i9) {
                                }
                                C3386nv.m17626m("");
                                return 0L;
                            }
                            cCharAt = str.charAt(i4);
                            if (cCharAt == 'D') {
                                durationUnit = DurationUnit.DAYS;
                            } else if (cCharAt == 'H') {
                                durationUnit = DurationUnit.HOURS;
                            } else if (cCharAt == 'M') {
                                durationUnit = DurationUnit.MINUTES;
                            } else if (cCharAt != 'S') {
                                durationUnit = null;
                            } else {
                                durationUnit = DurationUnit.SECONDS;
                            }
                            if (durationUnit == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                            }
                            if (durationUnit2 == null && durationUnit2.compareTo(durationUnit) <= 0) {
                                C3386nv.m17626m("Unexpected order of duration components");
                                return 0L;
                            }
                            if (durationUnit == DurationUnit.DAYS) {
                                if (i19 != 0) {
                                    C3386nv.m17626m("");
                                    return 0L;
                                }
                                jM15950m = l70.m15950m(j2, durationUnit) * ((long) i5);
                            } else {
                                if (i19 == 0) {
                                    C3386nv.m17626m("");
                                    return 0L;
                                }
                                jM17120g = m17120g(jM15950m, l70.m15950m(j2, durationUnit) * ((long) i5));
                                if (jM17120g == 9223372036854759646L) {
                                    C3386nv.m17626m("");
                                    return 0L;
                                }
                                jM15950m = jM17120g;
                            }
                            i18 = i4 + 1;
                            durationUnit2 = durationUnit;
                            i17 = i3;
                            i = i7;
                            c = '-';
                            c2 = '+';
                        }
                        i6 = i18;
                        i7 = i;
                        if (i4 == str.length()) {
                            if (cCharAt8 != '+' || cCharAt8 == '-') {
                                i8 = i3;
                            } else {
                                i8 = 0;
                            }
                            if (i4 == i6 + i8) {
                            }
                            j2 = j;
                            if (str.charAt(i4) == '.') {
                                i9 = i4 + 1;
                                iMin = Math.min(i4 + 7, str.length());
                                i11 = 0;
                                while (i10 < iMin) {
                                    cCharAt4 = str.charAt(i10);
                                    if ('0' <= cCharAt4) {
                                    }
                                    while (i12 < 6 - (i10 - i9)) {
                                        i11 = (i11 << 1) + (i11 << 3);
                                    }
                                    iMin2 = Math.min(i10 + 9, str.length());
                                    i4 = i10;
                                    i13 = 0;
                                    while (i4 < iMin2) {
                                        cCharAt3 = str.charAt(i4);
                                        int i24 = iMin2;
                                        if ('0' <= cCharAt3) {
                                        }
                                        while (i14 < 9 - (i4 - i10)) {
                                            i13 = (i13 << 1) + (i13 << 3);
                                        }
                                        while (i4 < str.length()) {
                                            i4++;
                                        }
                                        if (i4 != i9) {
                                        }
                                        C3386nv.m17626m("");
                                        return 0L;
                                    }
                                    while (i14 < 9 - (i4 - i10)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    while (i4 < str.length()) {
                                        i4++;
                                    }
                                    if (i4 != i9) {
                                    }
                                    C3386nv.m17626m("");
                                    return 0L;
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 1) + (i11 << 3);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i4 = i10;
                                i13 = 0;
                                while (i4 < iMin2) {
                                    cCharAt3 = str.charAt(i4);
                                    int i25 = iMin2;
                                    if ('0' <= cCharAt3) {
                                    }
                                    while (i14 < 9 - (i4 - i10)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    while (i4 < str.length()) {
                                        i4++;
                                    }
                                    if (i4 != i9) {
                                    }
                                    C3386nv.m17626m("");
                                    return 0L;
                                }
                                while (i14 < 9 - (i4 - i10)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                while (i4 < str.length()) {
                                    i4++;
                                }
                                if (i4 != i9) {
                                }
                                C3386nv.m17626m("");
                                return 0L;
                            }
                            cCharAt = str.charAt(i4);
                            if (cCharAt == 'D') {
                                durationUnit = DurationUnit.DAYS;
                            } else if (cCharAt == 'H') {
                                durationUnit = DurationUnit.HOURS;
                            } else if (cCharAt == 'M') {
                                durationUnit = DurationUnit.MINUTES;
                            } else if (cCharAt != 'S') {
                                durationUnit = null;
                            } else {
                                durationUnit = DurationUnit.SECONDS;
                            }
                            if (durationUnit == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                            }
                            if (durationUnit2 == null) {
                            }
                            if (durationUnit == DurationUnit.DAYS) {
                                if (i19 != 0) {
                                    C3386nv.m17626m("");
                                    return 0L;
                                }
                                jM15950m = l70.m15950m(j2, durationUnit) * ((long) i5);
                            } else {
                                if (i19 == 0) {
                                    C3386nv.m17626m("");
                                    return 0L;
                                }
                                jM17120g = m17120g(jM15950m, l70.m15950m(j2, durationUnit) * ((long) i5));
                                if (jM17120g == 9223372036854759646L) {
                                    C3386nv.m17626m("");
                                    return 0L;
                                }
                                jM15950m = jM17120g;
                            }
                            i18 = i4 + 1;
                            durationUnit2 = durationUnit;
                            i17 = i3;
                            i = i7;
                            c = '-';
                            c2 = '+';
                        }
                        C3386nv.m17626m("");
                        return 0L;
                    }
                }
                i3 = i17;
                i4 = i18;
                i5 = i3;
                while (i4 < str.length()) {
                    i4++;
                }
                j = 0;
                while (true) {
                    if (i4 < str.length()) {
                        cCharAt5 = str.charAt(i4);
                        lk5Var = lk5Var3;
                        if ('0' > cCharAt5) {
                        }
                    }
                    i6 = i18;
                    i7 = i;
                    if (i4 == str.length()) {
                        if (cCharAt8 != '+') {
                            i8 = i3;
                        } else {
                            i8 = i3;
                        }
                        if (i4 == i6 + i8) {
                        }
                        j2 = j;
                        if (str.charAt(i4) == '.') {
                            i9 = i4 + 1;
                            iMin = Math.min(i4 + 7, str.length());
                            i11 = 0;
                            while (i10 < iMin) {
                                cCharAt4 = str.charAt(i10);
                                if ('0' <= cCharAt4) {
                                }
                                while (i12 < 6 - (i10 - i9)) {
                                    i11 = (i11 << 1) + (i11 << 3);
                                }
                                iMin2 = Math.min(i10 + 9, str.length());
                                i4 = i10;
                                i13 = 0;
                                while (i4 < iMin2) {
                                    cCharAt3 = str.charAt(i4);
                                    int i26 = iMin2;
                                    if ('0' <= cCharAt3) {
                                    }
                                    while (i14 < 9 - (i4 - i10)) {
                                        i13 = (i13 << 1) + (i13 << 3);
                                    }
                                    while (i4 < str.length()) {
                                        i4++;
                                    }
                                    if (i4 != i9) {
                                    }
                                    C3386nv.m17626m("");
                                    return 0L;
                                }
                                while (i14 < 9 - (i4 - i10)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                while (i4 < str.length()) {
                                    i4++;
                                }
                                if (i4 != i9) {
                                }
                                C3386nv.m17626m("");
                                return 0L;
                            }
                            while (i12 < 6 - (i10 - i9)) {
                                i11 = (i11 << 1) + (i11 << 3);
                            }
                            iMin2 = Math.min(i10 + 9, str.length());
                            i4 = i10;
                            i13 = 0;
                            while (i4 < iMin2) {
                                cCharAt3 = str.charAt(i4);
                                int i27 = iMin2;
                                if ('0' <= cCharAt3) {
                                }
                                while (i14 < 9 - (i4 - i10)) {
                                    i13 = (i13 << 1) + (i13 << 3);
                                }
                                while (i4 < str.length()) {
                                    i4++;
                                }
                                if (i4 != i9) {
                                }
                                C3386nv.m17626m("");
                                return 0L;
                            }
                            while (i14 < 9 - (i4 - i10)) {
                                i13 = (i13 << 1) + (i13 << 3);
                            }
                            while (i4 < str.length()) {
                                i4++;
                            }
                            if (i4 != i9) {
                            }
                            C3386nv.m17626m("");
                            return 0L;
                        }
                        cCharAt = str.charAt(i4);
                        if (cCharAt == 'D') {
                            durationUnit = DurationUnit.DAYS;
                        } else if (cCharAt == 'H') {
                            durationUnit = DurationUnit.HOURS;
                        } else if (cCharAt == 'M') {
                            durationUnit = DurationUnit.MINUTES;
                        } else if (cCharAt != 'S') {
                            durationUnit = null;
                        } else {
                            durationUnit = DurationUnit.SECONDS;
                        }
                        if (durationUnit == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                        }
                        if (durationUnit2 == null) {
                        }
                        if (durationUnit == DurationUnit.DAYS) {
                            if (i19 != 0) {
                                C3386nv.m17626m("");
                                return 0L;
                            }
                            jM15950m = l70.m15950m(j2, durationUnit) * ((long) i5);
                        } else {
                            if (i19 == 0) {
                                C3386nv.m17626m("");
                                return 0L;
                            }
                            jM17120g = m17120g(jM15950m, l70.m15950m(j2, durationUnit) * ((long) i5));
                            if (jM17120g == 9223372036854759646L) {
                                C3386nv.m17626m("");
                                return 0L;
                            }
                            jM15950m = jM17120g;
                        }
                        i18 = i4 + 1;
                        durationUnit2 = durationUnit;
                        i17 = i3;
                        i = i7;
                        c = '-';
                        c2 = '+';
                    }
                    C3386nv.m17626m("");
                    return 0L;
                    int i28 = i16;
                    j = (j << 3) + (j << i3) + ((long) i15);
                    i4++;
                    lk5Var3 = lk5Var;
                    i18 = i18;
                    i = i28;
                }
            } else {
                if (i19 != 0 || (i18 = i18 + 1) == str.length()) {
                    C3386nv.m17626m("");
                    return 0L;
                }
                i19 = i17;
            }
        }
        int i29 = i;
        long jM4889g = cn2.m4889g(m17119f0(jM15950m, DurationUnit.MILLISECONDS), m17119f0(j3, DurationUnit.NANOSECONDS));
        return (i29 == 0 || jM4889g == cn2.f10318e) ? jM4889g : cn2.m4892j(jM4889g);
    }

    /* JADX INFO: renamed from: R */
    public static boolean m17099R(Parcel parcel, int i) {
        m17133m0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: S */
    public static List m17100S(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: T */
    public static float m17101T(Parcel parcel, int i) {
        m17133m0(parcel, i, 4);
        return parcel.readFloat();
    }

    /* JADX INFO: renamed from: U */
    public static IBinder m17102U(Parcel parcel, int i) {
        int iM17105X = m17105X(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM17105X == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM17105X);
        return strongBinder;
    }

    /* JADX INFO: renamed from: V */
    public static int m17103V(Parcel parcel, int i) {
        m17133m0(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: W */
    public static long m17104W(Parcel parcel, int i) {
        m17133m0(parcel, i, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: X */
    public static int m17105X(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: Y */
    public static final yw9 m17106Y(ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        wa3 wa3Var = (wa3) tj3Var.m22128k(AbstractC0402n.f4819k);
        fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
        LayoutDirection layoutDirection = (LayoutDirection) tj3Var.m22128k(AbstractC0402n.f4822n);
        boolean zM22120g = tj3Var.m22120g(wa3Var) | tj3Var.m22120g(fb2Var) | tj3Var.m22116e(layoutDirection.ordinal()) | tj3Var.m22116e(8);
        Object objM22097O = tj3Var.m22097O();
        if (zM22120g || objM22097O == we1.f66679a) {
            objM22097O = new yw9(wa3Var, fb2Var, layoutDirection);
            tj3Var.m22131l0(objM22097O);
        }
        return (yw9) objM22097O;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m17107Z(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    /* JADX INFO: renamed from: a */
    public static final void m17108a(Lifecycle$Event lifecycle$Event, ub5 ub5Var, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-709389590);
        int i2 = i | 16 | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                ub5Var = (ub5) tj3Var.m22128k(gi5.f40854a);
            } else {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                C3386nv.m17626m("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            t66 t66VarM1263m = AbstractC0278f.m1263m(ui3Var, tj3Var);
            boolean zM22120g = tj3Var.m22120g(t66VarM1263m) | tj3Var.m22124i(ub5Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new C3485q5(ub5Var, lifecycle$Event, t66VarM1263m, 25);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10041h(ub5Var, (vi3) objM22097O, tj3Var);
        } else {
            tj3Var.m22102U();
        }
        ub5 ub5Var2 = ub5Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 22, lifecycle$Event, ub5Var2, ui3Var);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m17109a0(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* JADX INFO: renamed from: b */
    public static final void m17110b(Boolean bool, Object obj, ub5 ub5Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(696924721);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                ub5Var = (ub5) tj3Var.m22128k(gi5.f40854a);
            } else {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-897);
            tj3Var.m22140r();
            boolean zM22120g = tj3Var.m22120g(bool) | tj3Var.m22120g(obj) | tj3Var.m22120g(ub5Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new ac5(ub5Var.mo256K());
                tj3Var.m22131l0(objM22097O);
            }
            m17112c(ub5Var, (ac5) objM22097O, vi3Var, tj3Var, (i3 >> 3) & 896);
        } else {
            tj3Var.m22102U();
        }
        ub5 ub5Var2 = ub5Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new hd1(bool, obj, ub5Var2, vi3Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m17111b0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m17112c(ub5 ub5Var, ac5 ac5Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(228371534);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(ub5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ac5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            boolean zM22124i = tj3Var.m22124i(ac5Var) | ((i2 & 896) == 256) | tj3Var.m22124i(ub5Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new bb0(ub5Var, ac5Var, vi3Var);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10043i(ub5Var, ac5Var, (vi3) objM22097O, tj3Var);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gd1(i, 3, ub5Var, ac5Var, vi3Var);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m17113c0(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m17105X(parcel, i));
    }

    /* JADX INFO: renamed from: d */
    public static final C3244l m17114d(Object obj) {
        if (obj == null) {
            obj = thb.f62314j;
        }
        return new C3244l(obj);
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m17115d0(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public static final void m17116e(e16 e16Var, int i, int i2, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i3) {
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(836914774);
        int i4 = i3 | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22116e(i2) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var2) ? 16384 : 8192);
        int i5 = 0;
        if (tj3Var.m22099R(i4 & 1, (i4 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i3 & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            x17 x17Var = wj0.f66899a;
            vh9 vh9Var = ps5.f56764b;
            vj0 vj0VarM24002g = wj0.m24002g(((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55868n, 0L, tj3Var, 14);
            boolean z = (i4 & 7168) == 2048;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new k92(19, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0231g.m1151d((ui3) objM22097O, e16Var, false, null, vj0VarM24002g, null, null, ci8.m4703P(-1388327900, new rw6(i, i5), tj3Var), tj3Var, 805306416, 492);
            thb.m22044c(tj3Var, c99.m4426s(b16.f7762a, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a));
            vj0 vj0VarM24002g2 = wj0.m24002g(((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55868n, 0L, tj3Var, 14);
            boolean z2 = (i4 & 57344) == 16384;
            Object objM22097O2 = tj3Var.m22097O();
            if (z2 || objM22097O2 == p84Var) {
                objM22097O2 = new k92(20, ui3Var2);
                tj3Var.m22131l0(objM22097O2);
            }
            AbstractC0231g.m1151d((ui3) objM22097O2, e16Var, false, null, vj0VarM24002g2, null, null, ci8.m4703P(935250765, new rw6(i2, 1), tj3Var), tj3Var, 805306416, 492);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ph0(e16Var, i, i2, ui3Var, ui3Var2, i3);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final long m17117e0(int i, DurationUnit durationUnit) {
        durationUnit.getClass();
        if (durationUnit.compareTo(DurationUnit.SECONDS) > 0) {
            return m17119f0(i, durationUnit);
        }
        long j = i;
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        durationUnit2.getClass();
        long jConvert = durationUnit2.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib());
        iy5 iy5Var = cn2.f10315b;
        long j2 = jConvert << 1;
        int i2 = fn2.f39331a;
        return j2;
    }

    /* JADX INFO: renamed from: f */
    public static final int m17118f(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX INFO: renamed from: f0 */
    public static final long m17119f0(long j, DurationUnit durationUnit) {
        durationUnit.getClass();
        DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
        durationUnit2.getClass();
        long jConvert = durationUnit.getTimeUnit$kotlin_stdlib().convert(4611686018426999999L, durationUnit2.getTimeUnit$kotlin_stdlib());
        if ((-jConvert) <= j && j <= jConvert) {
            long jConvert2 = durationUnit2.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib());
            iy5 iy5Var = cn2.f10315b;
            long j2 = jConvert2 << 1;
            int i = fn2.f39331a;
            return j2;
        }
        DurationUnit durationUnit3 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit3) < 0) {
            durationUnit3.getClass();
            return m17144w(l70.m15947j(durationUnit3.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib()), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return m17144w(l70.m15950m(Math.abs(j), durationUnit) * jSignum);
    }

    /* JADX INFO: renamed from: g */
    public static final long m17120g(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : l70.m15947j(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    /* JADX INFO: renamed from: g0 */
    public static final u85 m17121g0(ResultLibraryItem resultLibraryItem, int i) {
        String str;
        resultLibraryItem.getClass();
        int i2 = resultLibraryItem.f21256a;
        String str2 = resultLibraryItem.f21262d;
        String str3 = resultLibraryItem.f21264e;
        String str4 = resultLibraryItem.f21260c;
        String str5 = resultLibraryItem.f21268g;
        String str6 = resultLibraryItem.f21247R;
        String str7 = resultLibraryItem.f21248S;
        String str8 = resultLibraryItem.f21251V;
        String str9 = resultLibraryItem.f21245P;
        String str10 = resultLibraryItem.f21259b0;
        int i3 = resultLibraryItem.f21230A;
        int i4 = resultLibraryItem.f21271h0;
        String str11 = resultLibraryItem.f21273i0;
        int i5 = resultLibraryItem.f21234E;
        int i6 = resultLibraryItem.f21231B;
        int i7 = resultLibraryItem.f21284o;
        int i8 = resultLibraryItem.f21272i;
        double d = resultLibraryItem.f21263d0;
        Float f = resultLibraryItem.f21277k0;
        boolean z = resultLibraryItem.f21279l0;
        String str12 = resultLibraryItem.f21250U;
        List list = resultLibraryItem.f21261c0;
        String str13 = resultLibraryItem.f21274j;
        String str14 = resultLibraryItem.f21258b;
        ResultLessonMediaSource resultLessonMediaSource = resultLibraryItem.f21296u;
        String str15 = resultLessonMediaSource != null ? resultLessonMediaSource.f21090a : null;
        String str16 = resultLessonMediaSource != null ? resultLessonMediaSource.f21091b : null;
        String str17 = resultLessonMediaSource != null ? resultLessonMediaSource.f21092c : null;
        int i9 = resultLibraryItem.f21290r;
        String str18 = resultLibraryItem.f21292s;
        List list2 = resultLibraryItem.f21267f0;
        Boolean bool = resultLibraryItem.f21265e0;
        String str19 = resultLibraryItem.f21287p0;
        if (str19 == null) {
            str19 = "";
        }
        String str20 = str19;
        String str21 = resultLibraryItem.f21285o0;
        String str22 = resultLibraryItem.f21270h;
        String str23 = resultLibraryItem.f21252W;
        String str24 = resultLibraryItem.f21249T;
        String str25 = resultLibraryItem.f21240K;
        String str26 = resultLibraryItem.f21289q0;
        String str27 = resultLibraryItem.f21291r0;
        Boolean bool2 = resultLibraryItem.f21295t0;
        if (resultLessonMediaSource == null || (str = resultLessonMediaSource.f21092c) == null) {
            str = resultLibraryItem.f21278l;
        }
        return new u85(i2, str14, str2, str3, i, str4, str15, str16, str17, str5, str9, str6, str7, str24, str12, str8, str23, str10, i3, i4, str11, i5, i6, i7, Integer.valueOf(i8), Integer.valueOf(i9), str18, d, z, list, str13, list2, f, bool, str20, str21, str22, 0.0d, str25, str26, str27, bool2, str, resultLibraryItem.f21275j0, 5120, 1920);
    }

    /* JADX INFO: renamed from: h */
    public static final String m17122h(String str, String str2, List list) {
        String strValueOf;
        str.getClass();
        str2.getClass();
        list.getClass();
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (cl9.m4834Q((String) it.next(), "noun", true)) {
                    if (!fa4.m11650l(u91.m22589G0(vk9.m23365A0(str, new String[]{"_"}, 0, 6)), LanguageLearn.German.getCode()) || str2.length() <= 0) {
                        break;
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = str2.charAt(0);
                    if (Character.isLowerCase(cCharAt)) {
                        Locale locale = Locale.GERMAN;
                        locale.getClass();
                        strValueOf = ci8.m4711X(cCharAt, locale);
                    } else {
                        strValueOf = String.valueOf(cCharAt);
                    }
                    sb.append((Object) strValueOf);
                    sb.append(str2.substring(1));
                    return sb.toString();
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: h0 */
    public static String m17123h0(int i) {
        long j = i;
        long j2 = j / 60000;
        return String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf((j / 1000) - TimeUnit.MINUTES.toSeconds(j2))}, 2));
    }

    /* JADX INFO: renamed from: i */
    public static final String m17124i(String str) {
        str.getClass();
        Regex regex = new Regex("\\p{Punct}");
        String string = vk9.m23376L0(str).toString();
        if (string.length() <= 0) {
            return string;
        }
        if (string.length() == 0) {
            uk9.m22775i("Char sequence is empty.");
            return null;
        }
        if (!regex.m15427f(String.valueOf(string.charAt(0)))) {
            return string;
        }
        String strReplaceFirst = regex.f47727a.matcher(string).replaceFirst("");
        strReplaceFirst.getClass();
        return strReplaceFirst;
    }

    /* JADX INFO: renamed from: i0 */
    public static final float m17125i0(int i) {
        return ((long) i) / 1000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m17126j(ik8 ik8Var, Throwable th) throws Exception {
        boolean zIsTerminated;
        if (ik8Var != 0) {
            if (th != null) {
                try {
                    AbstractC3393o1.m17724B(ik8Var);
                    return;
                } catch (Throwable th2) {
                    lda.m16117c(th, th2);
                    return;
                }
            }
            if (ik8Var instanceof AutoCloseable) {
                ik8Var.close();
                return;
            }
            if (!(ik8Var instanceof ExecutorService)) {
                if (ik8Var instanceof TypedArray) {
                    ((TypedArray) ik8Var).recycle();
                    return;
                } else {
                    ij6.m13959q();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) ik8Var;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static String m17127j0(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + do7.m10521H(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + do7.m10521H(Float.intBitsToFloat(i)) + ", " + do7.m10521H(Float.intBitsToFloat(i2)) + ')';
    }

    /* JADX INFO: renamed from: k */
    public static jb3 m17128k(Context context) {
        ProviderInfo providerInfo;
        hb3 hb3Var;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        xwc.m24776n(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            hb3Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                hb3Var = new hb3(str, str2, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                hb3Var = null;
            }
        }
        if (hb3Var == null) {
            return null;
        }
        return new jb3(new ib3(context, hb3Var));
    }

    /* JADX INFO: renamed from: k0 */
    public static int m17129k0(Parcel parcel) {
        int i = parcel.readInt();
        int iM17105X = m17105X(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iM17105X + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    /* JADX INFO: renamed from: l */
    public static Bundle m17130l(Parcel parcel, int i) {
        int iM17105X = m17105X(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM17105X == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM17105X);
        return bundle;
    }

    /* JADX INFO: renamed from: l0 */
    public static final String m17131l0(String str) {
        str.getClass();
        Matcher matcher = Pattern.compile("^.*(?:(?:youtu\\.be/|v/|e/|vi/|u/\\w/|embed/|live/|shorts/)|(?:(?:watch)?\\?vi?=|&vi?=))([^#&?]*).*").matcher(str);
        matcher.getClass();
        String str2 = (String) u91.m22591I0(m17085D(matcher));
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: m */
    public static byte[] m17132m(Parcel parcel, int i) {
        int iM17105X = m17105X(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM17105X == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM17105X);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: m0 */
    public static void m17133m0(Parcel parcel, int i, int i2) {
        int iM17105X = m17105X(parcel, i);
        if (iM17105X == i2) {
            return;
        }
        String hexString = Integer.toHexString(iM17105X);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iM17105X).length() + 4 + 1);
        wq1.m24127w(i2, iM17105X, "Expected size ", " got ", sb);
        throw new SafeParcelReader$ParseException(AbstractC3393o1.m17739n(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: n */
    public static byte[][] m17134n(Parcel parcel, int i) {
        int iM17105X = m17105X(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM17105X == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iM17105X);
        return bArr;
    }

    /* JADX INFO: renamed from: n0 */
    public static void m17135n0(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        wq1.m24127w(i2, i, "Expected size ", " got ", sb);
        throw new SafeParcelReader$ParseException(AbstractC3393o1.m17739n(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: o */
    public static int[] m17136o(Parcel parcel, int i) {
        int iM17105X = m17105X(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM17105X == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iM17105X);
        return iArrCreateIntArray;
    }

    /* JADX INFO: renamed from: p */
    public static Parcelable m17137p(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM17105X = m17105X(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM17105X == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM17105X);
        return parcelable;
    }

    /* JADX INFO: renamed from: q */
    public static String m17138q(Parcel parcel, int i) {
        int iM17105X = m17105X(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM17105X == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM17105X);
        return string;
    }

    /* JADX INFO: renamed from: r */
    public static String[] m17139r(Parcel parcel, int i) {
        int iM17105X = m17105X(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM17105X == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM17105X);
        return strArrCreateStringArray;
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList m17140s(Parcel parcel, int i) {
        int iM17105X = m17105X(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM17105X == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM17105X);
        return arrayListCreateStringArrayList;
    }

    /* JADX INFO: renamed from: t */
    public static Object[] m17141t(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM17105X = m17105X(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM17105X == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM17105X);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: renamed from: u */
    public static ArrayList m17142u(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM17105X = m17105X(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM17105X == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM17105X);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m17143v() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            q43.m19641c();
            q43 q43VarM19641c = q43.m19641c();
            q43VarM19641c.m19644a();
            Context context = q43VarM19641c.f57252a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX INFO: renamed from: w */
    public static final long m17144w(long j) {
        long j2 = (j << 1) + 1;
        cn2.f10315b.getClass();
        int i = fn2.f39331a;
        return j2;
    }

    /* JADX INFO: renamed from: x */
    public static void m17145x(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader$ParseException(wq1.m24124t(new StringBuilder(String.valueOf(i).length() + 26), "Overread allowed size end=", i), parcel);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m17146y(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: z */
    public static final bl3 m17147z(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new bl3(Regex.m15422c(new Regex(wq1.m24118n("\\b", str2, "\\b")), str), new ow8(6), 1);
    }
}
