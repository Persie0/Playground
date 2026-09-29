package dm;

import ae.C0062b;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.compose.foundation.layout.PaddingModifier;
import androidx.compose.material3.C0463b;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.C0543b;
import androidx.compose.p017ui.node.NodeCoordinator;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.datastore.preferences.C0799a;
import androidx.navigation.NavDestination;
import cc.C1985y2;
import cc.InterfaceC1967w2;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentData;
import com.google.android.gms.internal.measurement.C2592a9;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.lingq.entity.Card;
import com.lingq.entity.LessonTransliteration;
import com.lingq.entity.Meaning;
import com.lingq.shared.network.result.CardLessonTransliteration;
import com.lingq.shared.network.result.ResultCard;
import com.lingq.shared.network.result.ResultVocabularyCard;
import in.InterfaceC6372p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kh.C6677d;
import kotlin.collections.C6752c;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import mn.C7645b;
import mo.C7661i;
import nf.C7770a;
import nf.C7771b;
import no.C7832g0;
import no.C7851m1;
import org.json.JSONArray;
import org.json.JSONObject;
import p036c0.C1647c;
import p036c0.C1648d;
import p059d0.C5002c;
import p059d0.C5005f;
import p067d8.C5086z;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p118fe.C5528t;
import p118fe.InterfaceC5514f;
import p127g1.InterfaceC5647k;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5853g;
import p139go.InterfaceC5855i;
import p139go.InterfaceC5858l;
import p165i0.C6111d;
import p210k1.C6574l;
import p260m8.C7499b;
import p261m9.C7506g;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;
import p289o5.C7940t;
import p291o7.C7993c0;
import p291o7.C8004n;
import p291o7.C8012v;
import p299of.C8039a;
import p328q1.C8476m;
import p328q1.C8477n;
import p328q1.InterfaceC8480q;
import p338qd.C8573r0;
import p338qd.C8584v;
import p338qd.InterfaceC8581u;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8836f;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p374s.AbstractC8911i;
import p374s.InterfaceC8906f0;
import p375s0.C8941c;
import p375s0.C8942d;
import p375s0.C8944f;
import p387t0.C9162o0;
import p387t0.C9169u;
import p470x1.C10022j;
import p543do.AbstractC5249p;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.C5224c0;
import p543do.InterfaceC5240k0;
import sl.C9072e;
import td.InterfaceC9258f;
import tl.C9325m;
import zm.InterfaceC10529n;

/* JADX INFO: renamed from: dm.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C5212l implements InterfaceC1967w2, InterfaceC5514f, InterfaceC10529n, InterfaceC6372p, InterfaceC7509j, C5086z.a, InterfaceC8480q, InterfaceC8581u, InterfaceC9258f {

    /* JADX INFO: renamed from: g */
    public static boolean f33288g;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C5212l f33282a = new C5212l();

    /* JADX INFO: renamed from: b */
    public static final String[] f33283b = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_background", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "firebase_campaign"};

    /* JADX INFO: renamed from: c */
    public static final String[] f33284c = {"ad_impression"};

    /* JADX INFO: renamed from: d */
    public static final String[] f33285d = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_ab", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_cmp"};

    /* JADX INFO: renamed from: e */
    public static final String[] f33286e = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ C5212l f33287f = new C5212l();

    /* JADX INFO: renamed from: h */
    public static final C5212l f33289h = new C5212l();

    /* JADX INFO: renamed from: i */
    public static final C5212l f33290i = new C5212l();

    /* JADX INFO: renamed from: j */
    public static final int[] f33291j = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* JADX INFO: renamed from: k */
    public static final C7168r f33292k = new C7168r("RESUME_TOKEN");

    /* JADX INFO: renamed from: l */
    public static final int[] f33293l = new int[0];

    /* JADX INFO: renamed from: H */
    public static final Object[] f33279H = new Object[0];

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ C5212l f33280I = new C5212l();

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ C5212l f33281J = new C5212l();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: A */
    public static void m11130A(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: B */
    public static void m11131B(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: C */
    public static void m11132C(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: E */
    public static Typeface m11133E(String str, C8476m c8476m, int i10) {
        boolean z10 = true;
        if ((i10 == 0) && C5207g.m11106a(c8476m, C8476m.f45650f)) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                C5207g.m11110e(typeface, "DEFAULT");
                return typeface;
            }
        }
        Typeface typefaceCreate = str == null ? Typeface.DEFAULT : Typeface.create(str, 0);
        int i11 = c8476m.f45655a;
        if (i10 != 1) {
            z10 = false;
        }
        Typeface typefaceCreate2 = Typeface.create(typefaceCreate, i11, z10);
        C5207g.m11110e(typefaceCreate2, "create(\n            fami…ontStyle.Italic\n        )");
        return typefaceCreate2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: F */
    public static Object m11134F(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            return i10 <= 65536 ? new short[i10] : new int[i10];
        }
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: G */
    public static final AbstractC8911i m11135G(InterfaceC8906f0 interfaceC8906f0, Object obj) {
        C5207g.m11111f(interfaceC8906f0, "<this>");
        return C8573r0.m16686M0((AbstractC8911i) interfaceC8906f0.mo17140a().mo528n(obj));
    }

    /* JADX INFO: renamed from: I */
    public static final String m11136I(InterfaceC5240k0 interfaceC5240k0) {
        StringBuilder sb2 = new StringBuilder();
        m11137J("type: " + interfaceC5240k0, sb2);
        m11137J("hashCode: " + interfaceC5240k0.hashCode(), sb2);
        m11137J("javaClass: " + interfaceC5240k0.getClass().getCanonicalName(), sb2);
        for (InterfaceC8838g interfaceC8838gMo11235q = interfaceC5240k0.mo11235q(); interfaceC8838gMo11235q != null; interfaceC8838gMo11235q = interfaceC8838gMo11235q.mo11876g()) {
            m11137J("fqName: ".concat(DescriptorRenderer.f39546a.m14003G(interfaceC8838gMo11235q)), sb2);
            m11137J("javaClass: " + interfaceC8838gMo11235q.getClass().getCanonicalName(), sb2);
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: J */
    public static final void m11137J(String str, StringBuilder sb2) {
        C5207g.m11111f(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
    }

    /* JADX INFO: renamed from: K */
    public static void m11138K(C7771b c7771b, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    c7771b.m15477c(i14, i13);
                    c7771b.m15477c(i14, i15);
                    c7771b.m15477c(i13, i14);
                    c7771b.m15477c(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        c7771b.m15477c(i16, i16);
        int i17 = i16 + 1;
        c7771b.m15477c(i17, i16);
        c7771b.m15477c(i16, i17);
        int i18 = i10 + i11;
        c7771b.m15477c(i18, i16);
        c7771b.m15477c(i18, i17);
        c7771b.m15477c(i18, i18 - 1);
    }

    /* JADX INFO: renamed from: L */
    public static C0463b m11139L(InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(1154241939);
        float f3 = C5002c.f32643a;
        float f10 = C5002c.f32648f;
        float f11 = C5002c.f32646d;
        float f12 = C5002c.f32647e;
        float f13 = C5002c.f32645c;
        float f14 = C5002c.f32644b;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C0463b c0463b = new C0463b(f3, f10, f11, f12, f13, f14);
        interfaceC0476a.mo1661w();
        return c0463b;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m11140M(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public static final void m11141N(Throwable th2) {
        HashMap map;
        FeatureManager.Feature feature;
        if (f33288g) {
            if (th2 == null) {
                return;
            }
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            C5207g.m11110e(stackTrace, "e.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                FeatureManager featureManager = FeatureManager.f11546a;
                String className = stackTraceElement.getClassName();
                C5207g.m11110e(className, "it.className");
                synchronized (FeatureManager.f11546a) {
                    try {
                        map = FeatureManager.f11547b;
                        if (map.isEmpty()) {
                            map.put(FeatureManager.Feature.AAM, new String[]{"com.facebook.appevents.aam."});
                            map.put(FeatureManager.Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                            map.put(FeatureManager.Feature.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                            map.put(FeatureManager.Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                            map.put(FeatureManager.Feature.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                            map.put(FeatureManager.Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                            map.put(FeatureManager.Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                            map.put(FeatureManager.Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                            map.put(FeatureManager.Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                            map.put(FeatureManager.Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                            map.put(FeatureManager.Feature.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                            map.put(FeatureManager.Feature.IapLogging, new String[]{"com.facebook.appevents.iap."});
                            map.put(FeatureManager.Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                        }
                    } finally {
                    }
                }
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        feature = FeatureManager.Feature.Unknown;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    feature = (FeatureManager.Feature) entry.getKey();
                    String[] strArr = (String[]) entry.getValue();
                    int length = strArr.length;
                    int i10 = 0;
                    while (i10 < length) {
                        String str = strArr[i10];
                        i10++;
                        if (C7661i.m15256V2(className, str, false)) {
                            break;
                        }
                    }
                }
                if (feature != FeatureManager.Feature.Unknown) {
                    FeatureManager featureManager2 = FeatureManager.f11546a;
                    C5207g.m11111f(feature, "feature");
                    C8004n.m15871a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.toKey(), "16.0.1").apply();
                    hashSet.add(feature.toString());
                }
            }
            C8004n c8004n = C8004n.f43550a;
            if (C7993c0.m15849b() && (!hashSet.isEmpty())) {
                new InstrumentData(new JSONArray((Collection) hashSet)).m6680c();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public static int m11142O(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < 6; i11++) {
            int iCeil = (int) Math.ceil(fArr[i11]);
            iArr[i11] = iCeil;
            if (i10 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i10 = iCeil;
            }
            if (i10 == iCeil) {
                bArr[i11] = (byte) (bArr[i11] + 1);
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: P */
    public static final InterfaceC5647k m11143P(NodeCoordinator nodeCoordinator) {
        NodeCoordinator nodeCoordinator2;
        NodeCoordinator nodeCoordinatorMo2156A = nodeCoordinator.mo2156A();
        while (true) {
            NodeCoordinator nodeCoordinator3 = nodeCoordinatorMo2156A;
            nodeCoordinator2 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator3;
            if (nodeCoordinator == null) {
                break;
            }
            nodeCoordinatorMo2156A = nodeCoordinator.mo2156A();
        }
        NodeCoordinator nodeCoordinator4 = nodeCoordinator2.f3846i;
        while (true) {
            NodeCoordinator nodeCoordinator5 = nodeCoordinator2;
            nodeCoordinator2 = nodeCoordinator4;
            if (nodeCoordinator2 == null) {
                return nodeCoordinator5;
            }
            nodeCoordinator4 = nodeCoordinator2.f3846i;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: Q */
    public static C7770a m11144Q(C7770a c7770a, int i10, int i11) {
        C8039a c8039a;
        int i12 = c7770a.f42693b / i11;
        if (i11 == 4) {
            c8039a = C8039a.f43694j;
        } else if (i11 == 6) {
            c8039a = C8039a.f43693i;
        } else if (i11 == 8) {
            c8039a = C8039a.f43696l;
        } else if (i11 == 10) {
            c8039a = C8039a.f43692h;
        } else {
            if (i11 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i11)));
            }
            c8039a = C8039a.f43691g;
        }
        C7940t c7940t = new C7940t(c8039a);
        int i13 = i10 / i11;
        int[] iArr = new int[i13];
        int i14 = c7770a.f42693b / i11;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                i16 |= c7770a.m15475e((i15 * i11) + i17) ? 1 << ((i11 - i17) - 1) : 0;
            }
            iArr[i15] = i16;
        }
        c7940t.m15750a(iArr, i13 - i12);
        C7770a c7770a2 = new C7770a();
        c7770a2.m15473c(0, i10 % i11);
        for (int i18 = 0; i18 < i13; i18++) {
            c7770a2.m15473c(iArr[i18], i11);
        }
        return c7770a2;
    }

    /* JADX INFO: renamed from: R */
    public static Object m11145R(Class cls, String str) {
        try {
            return cls.getField(str).get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: S */
    public static final long m11146S(KeyEvent keyEvent) {
        return C8573r0.m16755s(keyEvent.getKeyCode());
    }

    /* JADX INFO: renamed from: T */
    public static final int m11147T(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: U */
    public static void m11148U(char c10) {
        String hexString = Integer.toHexString(c10);
        throw new IllegalArgumentException("Illegal character: " + c10 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* JADX INFO: renamed from: V */
    public static final void m11149V(InterfaceC0476a interfaceC0476a, InterfaceC2056p interfaceC2056p) {
        C5207g.m11111f(interfaceC0476a, "composer");
        C5207g.m11111f(interfaceC2056p, "composable");
        C5213m.m11200e(2, interfaceC2056p);
        interfaceC2056p.mo1337m0(interfaceC0476a, 1);
    }

    /* JADX INFO: renamed from: W */
    public static boolean m11150W(String str) {
        try {
            return !Class.forName(str).getName().isEmpty();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: X */
    public static boolean m11151X(char c10) {
        return c10 >= 128 && c10 <= 255;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m11152Y(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m11153Z(char c10) {
        if (!(c10 == '\r' || c10 == '*' || c10 == '>') && c10 != ' ' && (c10 < '0' || c10 > '9')) {
            if (c10 < 'A' || c10 > 'Z') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public static int m11154a0(String str, int i10, int i11) {
        float[] fArr;
        int i12;
        if (i10 >= str.length()) {
            return i11;
        }
        if (i11 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i11] = 0.0f;
        }
        int i13 = 0;
        while (true) {
            int i14 = i10 + i13;
            if (i14 == str.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iM11142O = m11142O(fArr, iArr, bArr);
                int i15 = 0;
                for (int i16 = 0; i16 < 6; i16++) {
                    i15 += bArr[i16];
                }
                if (iArr[0] == iM11142O) {
                    return 0;
                }
                if (i15 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i15 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i15 != 1 || bArr[2] <= 0) {
                    return (i15 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = str.charAt(i14);
            i13++;
            if (cCharAt >= '0' && cCharAt <= '9') {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m11151X(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + 2.0f;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + 1.0f;
            }
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m11151X(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m11151X(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m11153Z(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m11151X(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (cCharAt >= ' ' && cCharAt <= '^') {
                i12 = 4;
                fArr[4] = fArr[4] + 0.75f;
            } else {
                i12 = 4;
                if (m11151X(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i13 >= i12) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m11142O(fArr, iArr2, bArr2);
                int i17 = 0;
                for (int i18 = 0; i18 < 6; i18++) {
                    i17 += bArr2[i18];
                }
                int i19 = iArr2[0];
                int i20 = iArr2[5];
                if (i19 < i20 && i19 < iArr2[1] && i19 < iArr2[2] && i19 < iArr2[3] && i19 < iArr2[4]) {
                    return 0;
                }
                if (i20 >= i19) {
                    byte b10 = bArr2[1];
                    byte b11 = bArr2[2];
                    byte b12 = bArr2[3];
                    byte b13 = bArr2[4];
                    if (b10 + b11 + b12 + b13 != 0) {
                        if (i17 == 1 && b13 > 0) {
                            return 4;
                        }
                        if (i17 == 1 && b11 > 0) {
                            return 2;
                        }
                        if (i17 == 1 && b12 > 0) {
                            return 3;
                        }
                        int i21 = iArr2[1];
                        int i22 = i21 + 1;
                        if (i22 < i19 && i22 < i20 && i22 < iArr2[4] && i22 < iArr2[2]) {
                            int i23 = iArr2[3];
                            if (i21 < i23) {
                                return 1;
                            }
                            if (i21 == i23) {
                                for (int i24 = i10 + i13 + 1; i24 < str.length(); i24++) {
                                    char cCharAt2 = str.charAt(i24);
                                    if (cCharAt2 == '\r' || cCharAt2 == '*' || cCharAt2 == '>') {
                                        return 3;
                                    }
                                    if (!m11153Z(cCharAt2)) {
                                        break;
                                    }
                                }
                                return 1;
                            }
                        }
                    }
                }
                return 5;
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final boolean m11155b0(NavDestination navDestination, int i10) {
        boolean z10;
        C5207g.m11111f(navDestination, "<this>");
        int i11 = NavDestination.f6826j;
        Iterator it = NavDestination.Companion.m4021b(navDestination).iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            if (((NavDestination) it.next()).f6834h == i10) {
                z10 = true;
            }
        } while (!z10);
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public static final InterfaceC0500b m11156c0(InterfaceC0500b interfaceC0500b, float f3) {
        C5207g.m11111f(interfaceC0500b, "$this$padding");
        return interfaceC0500b.mo1929K(new PaddingModifier(f3, f3, f3, f3, InspectableValueKt.f4184a));
    }

    /* JADX INFO: renamed from: d0 */
    public static InterfaceC0500b m11157d0(InterfaceC0500b interfaceC0500b, float f3, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f3 = 0;
        }
        float f11 = f3;
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        float f12 = f10;
        C5207g.m11111f(interfaceC0500b, "$this$padding");
        return interfaceC0500b.mo1929K(new PaddingModifier(f11, f12, f11, f12, InspectableValueKt.f4184a));
    }

    /* JADX INFO: renamed from: e0 */
    public static final InterfaceC0500b m11158e0(InterfaceC0500b interfaceC0500b, float f3, float f10, float f11, float f12) {
        C5207g.m11111f(interfaceC0500b, "$this$padding");
        return interfaceC0500b.mo1929K(new PaddingModifier(f3, f10, f11, f12, InspectableValueKt.f4184a));
    }

    /* JADX INFO: renamed from: f0 */
    public static InterfaceC0500b m11159f0(InterfaceC0500b interfaceC0500b, float f3, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f3 = 0;
        }
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        if ((i10 & 4) != 0) {
            f11 = 0;
        }
        if ((i10 & 8) != 0) {
            f12 = 0;
        }
        return m11158e0(interfaceC0500b, f3, f10, f11, f12);
    }

    /* JADX INFO: renamed from: g0 */
    public static final C6111d m11160g0() {
        C6111d c6111d = C6111d.f35924c;
        C5207g.m11109d(c6111d, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        return c6111d;
    }

    /* JADX INFO: renamed from: h0 */
    public static C0799a m11161h0(InterfaceC2052l interfaceC2052l) {
        ExecutorC7177a executorC7177a = C7832g0.f42931b;
        C7851m1 c7851m1M380p = C0062b.m380p();
        executorC7177a.getClass();
        return new C0799a(interfaceC2052l, C7499b.m14930b(CoroutineContext.DefaultImpls.m13470a(executorC7177a, c7851m1M380p)));
    }

    /* JADX INFO: renamed from: i0 */
    public static int m11162i0(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM16722e1 = C8573r0.m16722e1(obj);
        int i11 = iM16722e1 & i10;
        int iM11172o0 = m11172o0(i11, obj3);
        if (iM11172o0 == 0) {
            return -1;
        }
        int i12 = ~i10;
        int i13 = iM16722e1 & i12;
        int i14 = -1;
        while (true) {
            int i15 = iM11172o0 - 1;
            int i16 = iArr[i15];
            if ((i16 & i12) == i13 && m11140M(obj, objArr[i15]) && (objArr2 == null || m11140M(obj2, objArr2[i15]))) {
                int i17 = i16 & i10;
                if (i14 == -1) {
                    m11174p0(i11, i17, obj3);
                } else {
                    iArr[i14] = (i17 & i10) | (iArr[i14] & i12);
                }
                return i15;
            }
            int i18 = i16 & i10;
            if (i18 == 0) {
                return -1;
            }
            i14 = i15;
            iM11172o0 = i18;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static final InterfaceC0500b m11163j0(InterfaceC0500b interfaceC0500b, boolean z10, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(interfaceC2052l, "properties");
        return interfaceC0500b.mo1929K(new C6574l(z10, interfaceC2052l, InspectableValueKt.f4184a));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k0 */
    public static final AbstractC5257t m11164k0(InterfaceC8847k0 interfaceC8847k0) {
        C5207g.m11111f(interfaceC8847k0, "<this>");
        InterfaceC8838g interfaceC8838gMo11876g = interfaceC8847k0.mo11876g();
        C5207g.m11110e(interfaceC8838gMo11876g, "this.containingDeclaration");
        if (interfaceC8838gMo11876g instanceof InterfaceC8836f) {
            List<InterfaceC8847k0> listMo11260r = ((InterfaceC8836f) interfaceC8838gMo11876g).mo13600k().mo11260r();
            C5207g.m11110e(listMo11260r, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo11260r, 10));
            Iterator<T> it = listMo11260r.iterator();
            while (it.hasNext()) {
                InterfaceC5240k0 interfaceC5240k0Mo13600k = ((InterfaceC8847k0) it.next()).mo13600k();
                C5207g.m11110e(interfaceC5240k0Mo13600k, "it.typeConstructor");
                arrayList.add(interfaceC5240k0Mo13600k);
            }
            List<AbstractC5257t> upperBounds = interfaceC8847k0.getUpperBounds();
            C5207g.m11110e(upperBounds, "upperBounds");
            return m11182v(arrayList, upperBounds, DescriptorUtilsKt.m14108e(interfaceC8847k0));
        }
        if (!(interfaceC8838gMo11876g instanceof InterfaceC6822c)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<InterfaceC8847k0> listMo11895r = ((InterfaceC6822c) interfaceC8838gMo11876g).mo11895r();
        C5207g.m11110e(listMo11895r, "descriptor.typeParameters");
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listMo11895r, 10));
        Iterator<T> it2 = listMo11895r.iterator();
        while (it2.hasNext()) {
            InterfaceC5240k0 interfaceC5240k0Mo13600k2 = ((InterfaceC8847k0) it2.next()).mo13600k();
            C5207g.m11110e(interfaceC5240k0Mo13600k2, "it.typeConstructor");
            arrayList2.add(interfaceC5240k0Mo13600k2);
        }
        List<AbstractC5257t> upperBounds2 = interfaceC8847k0.getUpperBounds();
        C5207g.m11110e(upperBounds2, "upperBounds");
        return m11182v(arrayList2, upperBounds2, DescriptorUtilsKt.m14108e(interfaceC8847k0));
    }

    /* JADX INFO: renamed from: l */
    public static final C8942d m11165l(long j10, long j11) {
        return new C8942d(C8941c.m17164c(j10), C8941c.m17165d(j10), C8944f.m17177d(j11) + C8941c.m17164c(j10), C8944f.m17175b(j11) + C8941c.m17165d(j10));
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m11166l0(InterfaceC5858l interfaceC5858l, InterfaceC5853g interfaceC5853g, InterfaceC5853g interfaceC5853g2) {
        int i10;
        if (interfaceC5858l.mo11046M(interfaceC5853g) == interfaceC5858l.mo11046M(interfaceC5853g2) && interfaceC5858l.mo11083k(interfaceC5853g) == interfaceC5858l.mo11083k(interfaceC5853g2)) {
            if ((interfaceC5858l.mo11082j(interfaceC5853g) == null) == (interfaceC5858l.mo11082j(interfaceC5853g2) == null) && interfaceC5858l.mo11092p0(interfaceC5858l.mo11077h(interfaceC5853g), interfaceC5858l.mo11077h(interfaceC5853g2))) {
                if (interfaceC5858l.mo11053S(interfaceC5853g, interfaceC5853g2)) {
                    return true;
                }
                int iMo11046M = interfaceC5858l.mo11046M(interfaceC5853g);
                for (0; i10 < iMo11046M; i10 + 1) {
                    InterfaceC5855i interfaceC5855iMo11061a = interfaceC5858l.mo11061a(interfaceC5853g, i10);
                    InterfaceC5855i interfaceC5855iMo11061a2 = interfaceC5858l.mo11061a(interfaceC5853g2, i10);
                    if (interfaceC5858l.mo11078h0(interfaceC5855iMo11061a) != interfaceC5858l.mo11078h0(interfaceC5855iMo11061a2)) {
                        return false;
                    }
                    i10 = (interfaceC5858l.mo11078h0(interfaceC5855iMo11061a) || (interfaceC5858l.mo11038E(interfaceC5855iMo11061a) == interfaceC5858l.mo11038E(interfaceC5855iMo11061a2) && m11168m0(interfaceC5858l, interfaceC5858l.mo11044K(interfaceC5855iMo11061a), interfaceC5858l.mo11044K(interfaceC5855iMo11061a2)))) ? i10 + 1 : 0;
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final long m11167m(float f3, float f10) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(f3) << 32);
        int i10 = C9162o0.f47690c;
        return jFloatToIntBits;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m11168m0(InterfaceC5858l interfaceC5858l, InterfaceC5852f interfaceC5852f, InterfaceC5852f interfaceC5852f2) {
        if (interfaceC5852f == interfaceC5852f2) {
            return true;
        }
        AbstractC5265x abstractC5265xMo11036C = interfaceC5858l.mo11036C(interfaceC5852f);
        AbstractC5265x abstractC5265xMo11036C2 = interfaceC5858l.mo11036C(interfaceC5852f2);
        if (abstractC5265xMo11036C != null && abstractC5265xMo11036C2 != null) {
            return m11166l0(interfaceC5858l, abstractC5265xMo11036C, abstractC5265xMo11036C2);
        }
        AbstractC5249p abstractC5249pMo11037D = interfaceC5858l.mo11037D(interfaceC5852f);
        AbstractC5249p abstractC5249pMo11037D2 = interfaceC5858l.mo11037D(interfaceC5852f2);
        if (abstractC5249pMo11037D == null || abstractC5249pMo11037D2 == null) {
            return false;
        }
        return m11166l0(interfaceC5858l, interfaceC5858l.mo11087m(abstractC5249pMo11037D), interfaceC5858l.mo11087m(abstractC5249pMo11037D2)) && m11166l0(interfaceC5858l, interfaceC5858l.mo11069d0(abstractC5249pMo11037D), interfaceC5858l.mo11069d0(abstractC5249pMo11037D2));
    }

    /* JADX INFO: renamed from: n */
    public static final long m11169n(float f3, boolean z10) {
        return ((z10 ? 1L : 0L) & 4294967295L) | (((long) Float.floatToIntBits(f3)) << 32);
    }

    /* JADX INFO: renamed from: n0 */
    public static C7770a m11170n0(int i10, C7770a c7770a) {
        C7770a c7770a2 = new C7770a();
        int i11 = c7770a.f42693b;
        int i12 = (1 << i10) - 2;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = i13 + i15;
                if (i16 >= i11 || c7770a.m15475e(i16)) {
                    i14 |= 1 << ((i10 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 == i12) {
                c7770a2.m15473c(i17, i10);
            } else {
                if (i17 == 0) {
                    c7770a2.m15473c(i14 | 1, i10);
                } else {
                    c7770a2.m15473c(i14, i10);
                }
                i13 += i10;
            }
            i13--;
            i13 += i10;
        }
        return c7770a2;
    }

    /* JADX INFO: renamed from: o */
    public static C6677d m11171o() {
        return new C6677d("");
    }

    /* JADX INFO: renamed from: o0 */
    public static int m11172o0(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    /* JADX INFO: renamed from: p */
    public static final Card m11173p(ResultCard resultCard, String str, boolean z10) {
        C5207g.m11111f(str, "termWithLanguage");
        int i10 = resultCard.f18283b;
        String str2 = resultCard.f18282a;
        String str3 = resultCard.f18291j;
        List<Meaning> list = resultCard.f18293l;
        List<String> list2 = resultCard.f18294m;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList.add(lowerCase);
        }
        List listM13416J = C6752c.m13416J(arrayList);
        List<String> list3 = resultCard.f18295n;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            C5207g.m11110e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList2.add(lowerCase2);
        }
        List listM13416J2 = C6752c.m13416J(arrayList2);
        LessonTransliteration lessonTransliteration = resultCard.f18297p;
        int i11 = resultCard.f18286e;
        Integer num = resultCard.f18287f;
        String str4 = resultCard.f18285d;
        int i12 = resultCard.f18292k;
        String str5 = resultCard.f18288g;
        String str6 = resultCard.f18290i;
        return new Card(str2, str, i10, resultCard.f18284c, str4, i11, num, str5, resultCard.f18289h, str6, str3, i12, list, null, listM13416J, listM13416J2, null, lessonTransliteration, z10, 73728, null);
    }

    /* JADX INFO: renamed from: p0 */
    public static void m11174p0(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final Card m11175r(ResultVocabularyCard resultVocabularyCard, String str, boolean z10) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        List<String> list5;
        List<String> list6;
        C5207g.m11111f(str, "termWithLanguage");
        int i10 = resultVocabularyCard.f19051b;
        String str2 = resultVocabularyCard.f19050a;
        String str3 = resultVocabularyCard.f19059j;
        List<Meaning> list7 = resultVocabularyCard.f19061l;
        List<String> list8 = resultVocabularyCard.f19062m;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list8, 10));
        Iterator<T> it = list8.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList.add(lowerCase);
        }
        List listM13416J = C6752c.m13416J(arrayList);
        List<String> list9 = resultVocabularyCard.f19063n;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list9, 10));
        Iterator<T> it2 = list9.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            C5207g.m11110e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList2.add(lowerCase2);
        }
        List listM13416J2 = C6752c.m13416J(arrayList2);
        String strM13430X = null;
        CardLessonTransliteration cardLessonTransliteration = resultVocabularyCard.f19065p;
        String strM13430X2 = (cardLessonTransliteration == null || (list6 = cardLessonTransliteration.f18247b) == null) ? null : C6752c.m13430X(list6, null, null, null, null, 63);
        String strM13430X3 = (cardLessonTransliteration == null || (list5 = cardLessonTransliteration.f18246a) == null) ? null : C6752c.m13430X(list5, null, null, null, null, 63);
        String strM13430X4 = (cardLessonTransliteration == null || (list4 = cardLessonTransliteration.f18248c) == null) ? null : C6752c.m13430X(list4, null, null, null, null, 63);
        String strM13430X5 = (cardLessonTransliteration == null || (list3 = cardLessonTransliteration.f18249d) == null) ? null : C6752c.m13430X(list3, null, null, null, null, 63);
        String strM13430X6 = (cardLessonTransliteration == null || (list2 = cardLessonTransliteration.f18250e) == null) ? null : C6752c.m13430X(list2, null, null, null, null, 63);
        if (cardLessonTransliteration != null && (list = cardLessonTransliteration.f18251f) != null) {
            strM13430X = C6752c.m13430X(list, null, null, null, null, 63);
        }
        LessonTransliteration lessonTransliteration = new LessonTransliteration(strM13430X2, strM13430X3, strM13430X4, strM13430X5, strM13430X6, strM13430X);
        int i11 = resultVocabularyCard.f19054e;
        Integer num = resultVocabularyCard.f19055f;
        return new Card(str2, str, i10, resultVocabularyCard.f19052c, resultVocabularyCard.f19053d, i11, num, resultVocabularyCard.f19056g, resultVocabularyCard.f19057h, resultVocabularyCard.f19058i, str3, resultVocabularyCard.f19060k, list7, null, listM13416J, listM13416J2, null, lessonTransliteration, z10, 73728, null);
    }

    /* JADX INFO: renamed from: s */
    public static final int m11176s(int i10, int i11, int[] iArr) {
        C5207g.m11111f(iArr, "<this>");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    /* JADX INFO: renamed from: s0 */
    public static int m11177s0(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    /* JADX INFO: renamed from: t */
    public static final C8942d m11178t(C0543b c0543b) {
        C5207g.m11111f(c0543b, "<this>");
        NodeCoordinator nodeCoordinatorMo2156A = c0543b.mo2156A();
        if (nodeCoordinatorMo2156A != null) {
            return nodeCoordinatorMo2156A.mo2194t(c0543b, true);
        }
        long j10 = c0543b.f3688c;
        return new C8942d(0.0f, 0.0f, (int) (j10 >> 32), C10022j.m18628b(j10));
    }

    /* JADX INFO: renamed from: t0 */
    public static String m11179t0(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public static final C8942d m11180u(NodeCoordinator nodeCoordinator) {
        return ((NodeCoordinator) m11143P(nodeCoordinator)).mo2194t(nodeCoordinator, true);
    }

    /* JADX INFO: renamed from: u0 */
    public static String m11181u0(String str, String str2, String str3) {
        int length = String.valueOf(str2).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + length + String.valueOf(str3).length());
        C0166e.m777x(sb2, str, ":", str2, ":");
        sb2.append(str3);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: v */
    public static final AbstractC5257t m11182v(ArrayList arrayList, List list, AbstractC6795c abstractC6795c) {
        AbstractC5257t abstractC5257tM14205k = TypeSubstitutor.m14199e(new C5224c0(arrayList)).m14205k((AbstractC5257t) C6752c.m13423Q(list), Variance.OUT_VARIANCE);
        return abstractC5257tM14205k == null ? abstractC6795c.m13559p() : abstractC5257tM14205k;
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m11183v0(byte b10) {
        return b10 > -65;
    }

    /* JADX INFO: renamed from: x */
    public static C1647c m11184x(InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(-1589582123);
        long jM1563e = ColorSchemeKt.m1563e(C5005f.f32664a, interfaceC0476a);
        long jM1559a = ColorSchemeKt.m1559a(jM1563e, interfaceC0476a);
        long jM17496b = C9169u.m17496b(ColorSchemeKt.m1563e(C5005f.f32667d, interfaceC0476a), 0.38f);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C1647c c1647c = new C1647c(jM1563e, jM1559a, C8584v.m16792q(jM17496b, ColorSchemeKt.m1562d((C1648d) interfaceC0476a.mo1648p(ColorSchemeKt.f2735a), C5005f.f32668e)), C9169u.m17496b(ColorSchemeKt.m1559a(jM1563e, interfaceC0476a), 0.38f));
        interfaceC0476a.mo1661w();
        return c1647c;
    }

    /* JADX INFO: renamed from: y */
    public static C0463b m11185y(float f3, InterfaceC0476a interfaceC0476a, int i10) {
        interfaceC0476a.mo1622c(-574898487);
        if ((i10 & 1) != 0) {
            f3 = C5005f.f32665b;
        }
        float f10 = f3;
        float f11 = (i10 & 2) != 0 ? C5005f.f32672i : 0.0f;
        float f12 = (i10 & 4) != 0 ? C5005f.f32670g : 0.0f;
        float f13 = (i10 & 8) != 0 ? C5005f.f32671h : 0.0f;
        float f14 = (i10 & 16) != 0 ? C5005f.f32669f : 0.0f;
        float f15 = (i10 & 32) != 0 ? C5005f.f32668e : 0.0f;
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        C0463b c0463b = new C0463b(f10, f11, f12, f13, f14, f15);
        interfaceC0476a.mo1661w();
        return c0463b;
    }

    /* JADX INFO: renamed from: z */
    public static final int m11186z(float f3) {
        return C8573r0.m16710Y0((float) Math.ceil(f3));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: D */
    public AbstractC5257t m11187D(LinkedHashSet linkedHashSet) {
        C5207g.m11111f(linkedHashSet, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: ".concat(C6752c.m13430X(linkedHashSet, null, null, null, null, 63)));
    }

    /* JADX INFO: renamed from: H */
    public void m11188H(String str) {
        if (m11195w(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // p338qd.InterfaceC8581u
    /* JADX INFO: renamed from: a */
    public int mo11189a(int i10) {
        return i10;
    }

    @Override // in.InterfaceC6372p
    /* JADX INFO: renamed from: b */
    public void mo11190b(InterfaceC8830c interfaceC8830c) {
        C5207g.m11111f(interfaceC8830c, "classDescriptor");
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: c */
    public void mo7364c(InterfaceC7520u interfaceC7520u) {
    }

    @Override // p067d8.C5086z.a
    /* JADX INFO: renamed from: d */
    public void mo10842d(JSONObject jSONObject) {
        String strOptString = jSONObject == null ? null : jSONObject.optString("id");
        if (strOptString == null) {
            Log.w("Profile", "No user ID returned on Me request");
            return;
        }
        String strOptString2 = jSONObject.optString("link");
        String strOptString3 = jSONObject.optString("profile_picture", null);
        C8012v.f43591d.m15888a().m15887a(new Profile(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null), true);
    }

    @Override // zm.InterfaceC10529n
    /* JADX INFO: renamed from: e */
    public void mo11191e(C7645b c7645b) {
    }

    @Override // p067d8.C5086z.a
    /* JADX INFO: renamed from: f */
    public void mo10843f(FacebookException facebookException) {
        Log.e("Profile", C5207g.m11116k(facebookException, "Got unexpected exception: "));
    }

    @Override // p328q1.InterfaceC8480q
    /* JADX INFO: renamed from: g */
    public Typeface mo429g(C8477n c8477n, C8476m c8476m, int i10) {
        C5207g.m11111f(c8477n, "name");
        C5207g.m11111f(c8476m, "fontWeight");
        return m11133E(c8477n.f45656c, c8476m, i10);
    }

    @Override // in.InterfaceC6372p
    /* JADX INFO: renamed from: h */
    public void mo11192h(InterfaceC8830c interfaceC8830c) {
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: i */
    public void mo7365i() {
    }

    @Override // p328q1.InterfaceC8480q
    /* JADX INFO: renamed from: j */
    public Typeface mo432j(C8476m c8476m, int i10) {
        C5207g.m11111f(c8476m, "fontWeight");
        return m11133E(null, c8476m, i10);
    }

    @Override // p118fe.InterfaceC5514f
    /* JADX INFO: renamed from: k */
    public Object mo35k(C5528t c5528t) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(c5528t);
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: q */
    public InterfaceC7522w mo7366q(int i10, int i11) {
        return new C7506g();
    }

    /* JADX INFO: renamed from: q0 */
    public void m11193q0(String str) {
        if (m11195w(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m11194r0(String str, Exception exc) {
        if (m11195w(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    /* JADX INFO: renamed from: w */
    public boolean m11195w(int i10) {
        return 4 <= i10 || Log.isLoggable("FirebaseCrashlytics", i10);
    }

    @Override // cc.InterfaceC1967w2
    public Object zza() {
        List list = C1985y2.f10339a;
        return Long.valueOf(C2592a9.f14056b.zza().mo7710I());
    }
}
