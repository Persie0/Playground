package ae;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Trace;
import android.support.v4.media.session.C0166e;
import android.text.Spanned;
import android.util.Base64;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.activity.result.C0204c;
import androidx.appcompat.widget.InterfaceC0321i1;
import androidx.compose.foundation.layout.SpacerMeasurePolicy;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.C0520a;
import androidx.compose.p017ui.node.ComposeUiNode;
import androidx.compose.p017ui.node.InterfaceC0549h;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.platform.CompositionLocalsKt;
import androidx.compose.p017ui.platform.InspectableValueKt;
import androidx.compose.p017ui.platform.InterfaceC0647n1;
import androidx.compose.p017ui.unit.LayoutDirection;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.impl.WorkDatabase;
import bm.C1615a;
import cc.C1985y2;
import cc.InterfaceC1967w2;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import cm.InterfaceC2058r;
import cm.InterfaceC2059s;
import cm.InterfaceC2060t;
import co.InterfaceC2073e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.AbstractC2708j;
import com.google.android.gms.internal.measurement.C2592a9;
import com.google.android.gms.internal.measurement.C2601b4;
import com.google.android.gms.internal.measurement.C2684h3;
import com.google.android.gms.internal.measurement.C2842t;
import com.google.android.gms.internal.measurement.C2915y7;
import com.google.android.gms.internal.measurement.C2928z7;
import com.google.android.gms.internal.measurement.InterfaceC2736l;
import com.google.android.gms.internal.measurement.InterfaceC2790p;
import com.google.android.gms.internal.measurement.zzka;
import com.google.android.gms.tasks.Tasks;
import com.lingq.entity.DictionaryData;
import com.lingq.entity.LibraryData;
import com.lingq.entity.Meaning;
import com.lingq.entity.MediaSource;
import com.lingq.entity.Word;
import com.lingq.shared.network.result.ResultDictionaryData;
import com.lingq.shared.network.result.ResultLibraryItem;
import com.lingq.shared.network.result.ResultWord;
import com.lingq.shared.util.LessonPath;
import dm.C5206f;
import dm.C5207g;
import dm.C5212l;
import dm.C5213m;
import ga.InterfaceC5731n;
import gb.InterfaceC5740d;
import gd.C5765d;
import gd.C5768g;
import gd.C5771j;
import in.InterfaceC6366j;
import in.InterfaceC6367k;
import io.C6385l;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.net.IDN;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import jm.C6524g;
import jm.C6526i;
import kh.C6680g;
import km.InterfaceC6727j;
import kn.C6735e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C6899b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.C7076b;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7109xd7c321e6;
import kotlinx.coroutines.flow.C7110xd7c321e7;
import kotlinx.coroutines.flow.C7111xd7c321e8;
import kotlinx.coroutines.flow.C7112xd7c321e9;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7130k;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.C7145z;
import kotlinx.coroutines.flow.DistinctFlowImpl;
import kotlinx.coroutines.flow.FlowKt__DistinctKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7140u;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.C7127c;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.internal.C7166p;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.C7169s;
import mn.C7645b;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import mo.C7660h;
import mo.C7661i;
import no.C7851m1;
import no.C7853n0;
import no.C7870t;
import no.ExecutorC7829f0;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import okio.SegmentedByteString;
import org.joda.time.IllegalFieldValueException;
import p003a2.C0009a;
import p016an.C0127a;
import p072dd.C5149b;
import p081e0.C5296b;
import p081e0.C5340u0;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p102eo.InterfaceC5436a;
import p110f6.InterfaceC5471b;
import p115fb.C5486b;
import p122fl.AbstractC5588k;
import p122fl.C5579b;
import p122fl.C5590m;
import p122fl.C5591n;
import p122fl.InterfaceC5586i;
import p124fp.C5608e;
import p127g1.AbstractC5636a;
import p127g1.C5642f;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5750f;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5853g;
import p139go.InterfaceC5856j;
import p163hp.AbstractC6095b;
import p166i1.AbstractC6164s;
import p173i8.C6205a;
import p176ib.InterfaceC6270h;
import p214k5.C6602d;
import p231l1.C7217k;
import p254m2.C7472a;
import p260m8.C7499b;
import p290o6.C7968m;
import p312p2.C8169a;
import p317p7.C8201h;
import p325po.InterfaceC8438n;
import p328q1.C8476m;
import p328q1.C8477n;
import p328q1.InterfaceC8480q;
import p338qd.C8573r0;
import p347qm.C8646c;
import p349qo.C8658d;
import p349qo.C8663i;
import p349qo.InterfaceC8661g;
import p356r5.C8735e;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8866x;
import p372rm.InterfaceC8867y;
import p373rn.AbstractC8875g;
import p373rn.C8880l;
import p373rn.C8887s;
import p374s.C8915k;
import p385sf.C9000b;
import p386t.C9110b;
import p387t0.C9169u;
import p387t0.InterfaceC9154k0;
import p389t2.C9183b;
import p389t2.C9184c;
import p392t5.InterfaceC9207m;
import p393t6.C9213c;
import p420um.C9576k0;
import p421un.C9595b;
import p436vf.C9718b;
import p442vo.AbstractC9765a;
import p442vo.C9767c;
import p442vo.C9768d;
import p464wl.InterfaceC9968c;
import p470x1.C10020h;
import p470x1.C10025m;
import p470x1.InterfaceC10015c;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p479xa.C10134c0;
import p490xl.InterfaceC10224c;
import p491xm.C10229d;
import p541zn.InterfaceC10548l;
import p543do.AbstractC5234h0;
import p543do.AbstractC5244m0;
import p543do.AbstractC5249p;
import p543do.AbstractC5252q0;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5219a;
import p543do.C5220a0;
import p543do.C5225d;
import p543do.C5227e;
import p543do.C5237j;
import p543do.C5238j0;
import p543do.C5242l0;
import p543do.C5250p0;
import p543do.C5253r;
import p543do.C5254r0;
import p543do.C5258t0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import p543do.InterfaceC5260u0;
import sl.C9072e;
import sm.C9078f;
import sm.InterfaceC9075c;
import sm.InterfaceC9077e;
import tl.C9322j;
import tl.C9325m;
import tl.C9338z;
import to.C9347b;
import vc.C9709a;

/* JADX INFO: renamed from: ae.b */
/* JADX INFO: loaded from: classes.dex */
public class C0062b implements InterfaceC1967w2, InterfaceC5471b, InterfaceC5750f, InterfaceC5586i, InterfaceC5731n, InterfaceC6270h, InterfaceC8480q {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C0062b f154a = new C0062b();

    /* JADX INFO: renamed from: b */
    public static final String[] f155b = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* JADX INFO: renamed from: c */
    public static final String[] f156c = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* JADX INFO: renamed from: d */
    public static final String[] f157d = {"items"};

    /* JADX INFO: renamed from: e */
    public static final String[] f158e = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* JADX INFO: renamed from: f */
    public static final C2915y7 f159f = new C2915y7();

    /* JADX INFO: renamed from: g */
    public static final C2928z7 f160g = new C2928z7();

    /* JADX INFO: renamed from: h */
    public static final C0062b f161h = new C0062b();

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ C0062b f162i = new C0062b();

    /* JADX INFO: renamed from: j */
    public static final C7168r f163j = new C7168r("NO_VALUE");

    /* JADX INFO: renamed from: k */
    public static final C7168r f164k = new C7168r("UNDEFINED");

    /* JADX INFO: renamed from: l */
    public static final C7168r f165l = new C7168r("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: H */
    public static final char[] f146H = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: I */
    public static final char[] f147I = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: J */
    public static final float[][] f148J = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: K */
    public static final float[][] f149K = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: L */
    public static final float[] f150L = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: M */
    public static final float[][] f151M = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: N */
    public static final int[] f152N = new int[0];

    /* JADX INFO: renamed from: O */
    public static final Object[] f153O = new Object[0];

    /* JADX INFO: renamed from: A */
    public static final void m244A(AbstractC9765a abstractC9765a, C9767c c9767c, String str) {
        C9768d.f49840h.getClass();
        Logger logger = C9768d.f49842j;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c9767c.f49835b);
        sb2.append(' ');
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C5207g.m11110e(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(abstractC9765a.f49829a);
        logger.fine(sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A0 */
    public static final int m245A0(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        InterfaceC9075c interfaceC9075cMo5291h = abstractC5257t.mo11289w().mo5291h(C6797e.a.f38394q);
        if (interfaceC9075cMo5291h == null) {
            return 0;
        }
        AbstractC8875g abstractC8875g = (AbstractC8875g) C6753d.m13460M0(C6797e.f38337c, interfaceC9075cMo5291h.mo12513a());
        C5207g.m11109d(abstractC8875g, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((C8880l) abstractC8875g).f46772a).intValue();
    }

    /* JADX INFO: renamed from: A1 */
    public static final boolean m246A1(String str, int i10) {
        char cCharAt = str.charAt(i10);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: A2 */
    public static final AbstractC5262v0 m247A2(AbstractC5262v0 abstractC5262v0, AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5262v0, "<this>");
        if (abstractC5262v0 instanceof InterfaceC5260u0) {
            return m247A2(((InterfaceC5260u0) abstractC5262v0).mo11227P0(), abstractC5257t);
        }
        if (abstractC5257t != null && !C5207g.m11106a(abstractC5257t, abstractC5262v0)) {
            if (abstractC5262v0 instanceof AbstractC5265x) {
                return new C5220a0((AbstractC5265x) abstractC5262v0, abstractC5257t);
            }
            if (abstractC5262v0 instanceof AbstractC5249p) {
                return new C5253r((AbstractC5249p) abstractC5262v0, abstractC5257t);
            }
            throw new NoWhenBranchMatchedException();
        }
        return abstractC5262v0;
    }

    /* JADX INFO: renamed from: B */
    public static final int m248B(long j10) {
        int i10;
        if ((4294967295L & j10) == 0) {
            i10 = 32;
            j10 >>= 32;
        } else {
            i10 = 0;
        }
        if ((65535 & j10) == 0) {
            i10 += 16;
            j10 >>= 16;
        }
        if ((255 & j10) == 0) {
            i10 += 8;
            j10 >>= 8;
        }
        if ((15 & j10) == 0) {
            i10 += 4;
            j10 >>= 4;
        }
        if ((1 & j10) != 0) {
            return i10;
        }
        if ((2 & j10) != 0) {
            return i10 + 1;
        }
        if ((4 & j10) != 0) {
            return i10 + 2;
        }
        if ((j10 & 8) != 0) {
            return i10 + 3;
        }
        return -1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: B0 */
    public static final int m249B0(int i10) {
        int i11 = 2;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                i11 = 0;
                break;
            case 1:
            case 2:
            case 4:
                i11 = 1;
                break;
            case 3:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            default:
                i11 = 3;
                break;
        }
        return i11;
    }

    /* JADX INFO: renamed from: B1 */
    public static int m250B1(float f3, int i10, int i11) {
        return C8169a.m16215g(C8169a.m16216h(i11, Math.round(Color.alpha(i11) * f3)), i10);
    }

    /* JADX INFO: renamed from: B2 */
    public static float m251B2() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: C */
    public static final int m252C(WorkDatabase workDatabase, String str) {
        Long lMo13207a = workDatabase.mo4714v().mo13207a(str);
        int iLongValue = lMo13207a != null ? (int) lMo13207a.longValue() : 0;
        workDatabase.mo4714v().mo13208b(new C6602d(str, Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
        return iLongValue;
    }

    /* JADX INFO: renamed from: C0 */
    public static Typeface m253C0(String str, C8476m c8476m, int i10) {
        boolean z10 = true;
        if ((i10 == 0) && C5207g.m11106a(c8476m, C8476m.f45650f)) {
            if (str == null || str.length() == 0) {
                Typeface typeface = Typeface.DEFAULT;
                C5207g.m11110e(typeface, "DEFAULT");
                return typeface;
            }
        }
        int iM319W0 = m319W0(c8476m, i10);
        if (str != null && str.length() != 0) {
            z10 = false;
        }
        if (z10) {
            Typeface typefaceDefaultFromStyle = Typeface.defaultFromStyle(iM319W0);
            C5207g.m11110e(typefaceDefaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return typefaceDefaultFromStyle;
        }
        Typeface typefaceCreate = Typeface.create(str, iM319W0);
        C5207g.m11110e(typefaceCreate, "{\n            Typeface.c…y, targetStyle)\n        }");
        return typefaceCreate;
    }

    /* JADX INFO: renamed from: C1 */
    public static String m254C1(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String string2 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(name2.length() + String.valueOf(string2).length() + 9);
                    sb3.append("<");
                    sb3.append(string2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    string = sb3.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb4 = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = str.indexOf("%s", i12)) != -1) {
            sb4.append((CharSequence) str, i12, iIndexOf);
            sb4.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb4.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
            sb4.append(" [");
            sb4.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb4.append(", ");
                sb4.append(objArr[i13]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: C2 */
    public static int m255C2(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: D */
    public static final int m256D(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: D0 */
    public static C5206f m257D0(int i10) {
        if (i10 != 0 && i10 == 1) {
            return new C5765d();
        }
        return new C5771j();
    }

    /* JADX INFO: renamed from: D1 */
    public static float m258D1(int i10) {
        float f3 = i10 / 255.0f;
        return (f3 <= 0.04045f ? f3 / 12.92f : (float) Math.pow((f3 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: D2 */
    public static InterfaceC2790p m259D2(InterfaceC2736l interfaceC2736l, C2842t c2842t, C2684h3 c2684h3, ArrayList arrayList) {
        String str = c2842t.f14432a;
        if (interfaceC2736l.mo7785g(str)) {
            InterfaceC2790p interfaceC2790pMo7789o = interfaceC2736l.mo7789o(str);
            if (interfaceC2790pMo7789o instanceof AbstractC2708j) {
                return ((AbstractC2708j) interfaceC2790pMo7789o).mo7646b(c2684h3, arrayList);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", str));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(String.format("Object has no function %s", str));
        }
        C2601b4.m7692h(1, "hasOwnProperty", arrayList);
        return interfaceC2736l.mo7785g(c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f()) ? InterfaceC2790p.f14380w : InterfaceC2790p.f14381x;
    }

    /* JADX INFO: renamed from: E */
    public static final Object[] m260E(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        C9322j.m17675c0(objArr, objArr2, 0, 0, i10, 6);
        C9322j.m17673a0(i10, i10 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: E0 */
    public static final AbstractC5265x m261E0(AbstractC6795c abstractC6795c, InterfaceC9077e interfaceC9077e, AbstractC5257t abstractC5257t, List list, ArrayList arrayList, AbstractC5257t abstractC5257t2, boolean z10) {
        InterfaceC8830c interfaceC8830cM13554k;
        C5207g.m11111f(list, "contextReceiverTypes");
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (abstractC5257t != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(TypeUtilsKt.m14224a((AbstractC5257t) it.next()));
        }
        arrayList2.addAll(arrayList3);
        m282K(abstractC5257t != null ? TypeUtilsKt.m14224a(abstractC5257t) : null, arrayList2);
        Iterator it2 = arrayList.iterator();
        int i10 = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            InterfaceC9077e c9078f = InterfaceC9077e.a.f47365a;
            if (!zHasNext) {
                arrayList2.add(TypeUtilsKt.m14224a(abstractC5257t2));
                int size = list.size() + arrayList.size() + (abstractC5257t != null ? 1 : 0);
                if (z10) {
                    interfaceC8830cM13554k = abstractC6795c.m13564w(size);
                } else {
                    C7648e c7648e = C6797e.f38335a;
                    interfaceC8830cM13554k = abstractC6795c.m13554k("Function" + size);
                }
                C5207g.m11110e(interfaceC8830cM13554k, "if (isSuspendFunction) b…tFunction(parameterCount)");
                if (abstractC5257t != null) {
                    C7646c c7646c = C6797e.a.f38393p;
                    if (!interfaceC9077e.mo5292x(c7646c)) {
                        ArrayList arrayListM13437e0 = C6752c.m13437e0(interfaceC9077e, new BuiltInAnnotationDescriptor(abstractC6795c, c7646c, C6753d.m13459L0()));
                        interfaceC9077e = arrayListM13437e0.isEmpty() ? c9078f : new C9078f(arrayListM13437e0);
                    }
                }
                if (!list.isEmpty()) {
                    int size2 = list.size();
                    C7646c c7646c2 = C6797e.a.f38394q;
                    if (interfaceC9077e.mo5292x(c7646c2)) {
                        c9078f = interfaceC9077e;
                    } else {
                        ArrayList arrayListM13437e1 = C6752c.m13437e0(interfaceC9077e, new BuiltInAnnotationDescriptor(abstractC6795c, c7646c2, C7499b.m14943h0(new Pair(C6797e.f38337c, new C8880l(size2)))));
                        if (!arrayListM13437e1.isEmpty()) {
                            c9078f = new C9078f(arrayListM13437e1);
                        }
                    }
                    interfaceC9077e = c9078f;
                }
                return KotlinTypeFactory.m14186e(m379o2(interfaceC9077e), interfaceC8830cM13554k, arrayList2);
            }
            Object next = it2.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                C9000b.m17257w();
                throw null;
            }
            arrayList2.add(TypeUtilsKt.m14224a((AbstractC5257t) next));
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: E1 */
    public static final AbstractC5265x m262E1(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5249p) {
            return ((AbstractC5249p) abstractC5262v0Mo11288a1).f33340b;
        }
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5265x) {
            return (AbstractC5265x) abstractC5262v0Mo11288a1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: E2 */
    public static Object m263E2(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), obj2.getClass().getCanonicalName()));
    }

    /* JADX INFO: renamed from: F */
    public static final Object[] m264F(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C9322j.m17675c0(objArr, objArr2, 0, 0, i10, 6);
        C9322j.m17673a0(i10, i10 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    /* JADX INFO: renamed from: F0 */
    public static final String m265F0(String str, boolean z10) {
        C5207g.m11112g(str, "filePath");
        if (!z10) {
            C5579b.m11813e(new File(str));
            return str;
        }
        File file = new File(str);
        if (file.exists()) {
            String str2 = file.getParent() + '/';
            String strM5274L0 = C1615a.m5274L0(file);
            String name = file.getName();
            C5207g.m11110e(name, "name");
            String strM14276A3 = C7076b.m14276A3(name, name);
            int i10 = 0;
            while (file.exists()) {
                i10++;
                file = new File(str2 + (strM14276A3 + " (" + i10 + ')') + '.' + strM5274L0);
            }
        }
        C5579b.m11813e(file);
        String absolutePath = file.getAbsolutePath();
        C5207g.m11107b(absolutePath, "getIncrementedFileIfOrig…ts(filePath).absolutePath");
        return absolutePath;
    }

    /* JADX INFO: renamed from: F1 */
    public static final AbstractC5262v0 m266F1(AbstractC5262v0 abstractC5262v0, boolean z10) {
        C5207g.m11111f(abstractC5262v0, "<this>");
        C5237j c5237jM11271a = C5237j.a.m11271a(abstractC5262v0, z10);
        if (c5237jM11271a != null) {
            return c5237jM11271a;
        }
        AbstractC5265x abstractC5265xM270G1 = m270G1(abstractC5262v0);
        return abstractC5265xM270G1 != null ? abstractC5265xM270G1 : abstractC5262v0.mo11217b1(false);
    }

    /* JADX INFO: renamed from: F2 */
    public static String m267F2(zzka zzkaVar) {
        StringBuilder sb2 = new StringBuilder(zzkaVar.mo8492q());
        for (int i10 = 0; i10 < zzkaVar.mo8492q(); i10++) {
            byte bMo8490a = zzkaVar.mo8490a(i10);
            if (bMo8490a == 34) {
                sb2.append("\\\"");
            } else if (bMo8490a == 39) {
                sb2.append("\\'");
            } else if (bMo8490a != 92) {
                switch (bMo8490a) {
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bMo8490a < 32 || bMo8490a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo8490a >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo8490a >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo8490a & 7) + 48));
                        } else {
                            sb2.append((char) bMo8490a);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: G */
    public static final int m268G(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return m249B0(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8 A[LOOP:1: B:60:0x00b9->B:64:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ce A[EDGE_INSN: B:87:0x00ce->B:65:0x00ce BREAK  A[LOOP:1: B:60:0x00b9->B:64:0x00c8], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX INFO: renamed from: G0 */
    public static final InetAddress m269G0(String str, int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int iM17711r;
        int i16 = 16;
        byte[] bArr = new byte[16];
        boolean z11 = false;
        int i17 = -1;
        int i18 = i10;
        int i19 = 0;
        int i20 = -1;
        int i21 = -1;
        while (true) {
            if (i18 >= i11) {
                i12 = i16;
                break;
            }
            if (i19 == i16) {
                return null;
            }
            int i22 = i18 + 2;
            if (i22 <= i11 && C7661i.m15255U2(str, i18, "::", z11)) {
                if (i20 != i17) {
                    return null;
                }
                i19 += 2;
                if (i22 == i11) {
                    i12 = i16;
                    i20 = i19;
                    break;
                }
                i20 = i19;
                i21 = i22;
                i18 = i21;
                i14 = 0;
                while (i18 < i11) {
                    iM17711r = C9347b.m17711r(str.charAt(i18));
                    if (iM17711r == -1) {
                        break;
                        break;
                    }
                    i14 = (i14 << 4) + iM17711r;
                    i18++;
                }
                i15 = i18 - i21;
                if (i15 != 0) {
                }
                return null;
            }
            if (i19 != 0) {
                if (!C7661i.m15255U2(str, i18, ":", z11)) {
                    if (!C7661i.m15255U2(str, i18, ".", z11)) {
                        return null;
                    }
                    int i23 = i19 - 2;
                    int i24 = i23;
                    loop2: while (true) {
                        if (i21 >= i11) {
                            if (i24 != i23 + 4) {
                                z10 = false;
                                break loop2;
                            }
                            z10 = true;
                            break;
                        }
                        if (i24 != i16) {
                            if (i24 != i23) {
                                if (str.charAt(i21) == '.') {
                                    i21++;
                                }
                            }
                            ?? r15 = z11;
                            int i25 = i21;
                            while (true) {
                                if (i25 < i11) {
                                    char cCharAt = str.charAt(i25);
                                    if (C5207g.m11113h(cCharAt, 48) >= 0 && C5207g.m11113h(cCharAt, 57) <= 0) {
                                        if ((r15 != 0 || i21 == i25) && (i13 = ((r15 * 10) + cCharAt) - 48) <= 255) {
                                            i25++;
                                            r15 = i13;
                                        }
                                    }
                                    z10 = false;
                                    break loop2;
                                }
                                if (i25 - i21 == 0) {
                                    z10 = false;
                                    break loop2;
                                }
                                bArr[i24] = (byte) r15;
                                i24++;
                                i21 = i25;
                                i16 = 16;
                                z11 = false;
                            }
                        }
                        z10 = z11;
                        break;
                    }
                    if (!z10) {
                        return null;
                    }
                    i19 += 2;
                    i12 = 16;
                    break;
                }
                i18++;
            }
            i21 = i18;
            i18 = i21;
            i14 = 0;
            while (i18 < i11) {
                iM17711r = C9347b.m17711r(str.charAt(i18));
                if (iM17711r == -1) {
                    break;
                }
                i14 = (i14 << 4) + iM17711r;
                i18++;
            }
            i15 = i18 - i21;
            if (i15 != 0 || i15 > 4) {
                return null;
            }
            int i26 = i19 + 1;
            bArr[i19] = (byte) ((i14 >>> 8) & 255);
            i19 = i26 + 1;
            bArr[i26] = (byte) (i14 & 255);
            i16 = 16;
            z11 = false;
            i17 = -1;
        }
        if (i19 != i12) {
            if (i20 == -1) {
                return null;
            }
            int i27 = i19 - i20;
            System.arraycopy(bArr, i20, bArr, 16 - i27, i27);
            Arrays.fill(bArr, i20, (16 - i19) + i20, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    /* JADX INFO: renamed from: G1 */
    public static final AbstractC5265x m270G1(AbstractC5257t abstractC5257t) {
        IntersectionTypeConstructor intersectionTypeConstructor;
        InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5257t.mo11250X0();
        IntersectionTypeConstructor intersectionTypeConstructor2 = interfaceC5240k0Mo11250X0 instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) interfaceC5240k0Mo11250X0 : null;
        if (intersectionTypeConstructor2 == null) {
            return null;
        }
        LinkedHashSet<AbstractC5257t> linkedHashSet = intersectionTypeConstructor2.f39864b;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(linkedHashSet, 10));
        boolean z10 = false;
        for (AbstractC5257t abstractC5257tM266F1 : linkedHashSet) {
            if (C5258t0.m11296g(abstractC5257tM266F1)) {
                abstractC5257tM266F1 = m266F1(abstractC5257tM266F1.mo11288a1(), false);
                z10 = true;
            }
            arrayList.add(abstractC5257tM266F1);
        }
        if (z10) {
            AbstractC5257t abstractC5257tM266F2 = intersectionTypeConstructor2.f39863a;
            if (abstractC5257tM266F2 == null) {
                abstractC5257tM266F2 = null;
            } else if (C5258t0.m11296g(abstractC5257tM266F2)) {
                abstractC5257tM266F2 = m266F1(abstractC5257tM266F2.mo11288a1(), false);
            }
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            intersectionTypeConstructor = new IntersectionTypeConstructor(linkedHashSet2, abstractC5257tM266F2);
        } else {
            intersectionTypeConstructor = null;
        }
        if (intersectionTypeConstructor == null) {
            return null;
        }
        return intersectionTypeConstructor.m14179c();
    }

    /* JADX INFO: renamed from: G2 */
    public static void m271G2(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m272H(int i10, int i11, int[] iArr) {
        ComposerKt.m1690f(i11 >= 0);
        iArr[(i10 * 5) + 3] = i11;
    }

    /* JADX INFO: renamed from: H0 */
    public static final InterfaceC7116c m273H0(InterfaceC7116c interfaceC7116c) {
        InterfaceC2052l<Object, Object> interfaceC2052l = FlowKt__DistinctKt.f40083a;
        if (interfaceC7116c instanceof InterfaceC7142w) {
            return interfaceC7116c;
        }
        InterfaceC2052l<Object, Object> interfaceC2052l2 = FlowKt__DistinctKt.f40083a;
        InterfaceC2056p<Object, Object, Boolean> interfaceC2056p = FlowKt__DistinctKt.f40084b;
        if (interfaceC7116c instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) interfaceC7116c;
            if (distinctFlowImpl.f40041b == interfaceC2052l2 && distinctFlowImpl.f40042c == interfaceC2056p) {
                return interfaceC7116c;
            }
        }
        return new DistinctFlowImpl(interfaceC7116c, interfaceC2052l2, interfaceC2056p);
    }

    /* JADX INFO: renamed from: H1 */
    public static void m274H1(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof InterfaceC0321i1) {
                    editorInfo.hintText = ((InterfaceC0321i1) parent).m1212a();
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H2 */
    public static void m275H2(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m276I(int i10, int i11, int[] iArr) {
        ComposerKt.m1690f(i11 >= 0 && i11 < 67108863);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    /* JADX INFO: renamed from: I0 */
    public static final DictionaryData m277I0(ResultDictionaryData resultDictionaryData) {
        C5207g.m11111f(resultDictionaryData, "<this>");
        int i10 = resultDictionaryData.f18395a;
        String str = resultDictionaryData.f18396b;
        if (str == null) {
            str = "";
        }
        int i11 = resultDictionaryData.f18397c;
        String str2 = resultDictionaryData.f18398d;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = resultDictionaryData.f18399e;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = resultDictionaryData.f18401g;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = resultDictionaryData.f18402h;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = resultDictionaryData.f18403i;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = resultDictionaryData.f18404j;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = resultDictionaryData.f18405k;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = resultDictionaryData.f18406l;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = resultDictionaryData.f18407m;
        return new DictionaryData(i10, str, i11, str2, str3, false, str4, str5, str6, str7, str8, str9, str10 == null ? "" : str10);
    }

    /* JADX INFO: renamed from: I1 */
    public static final ProtoBuf$Type m278I1(ProtoBuf$Type protoBuf$Type, C6735e c6735e) {
        C5207g.m11111f(protoBuf$Type, "<this>");
        C5207g.m11111f(c6735e, "typeTable");
        int i10 = protoBuf$Type.f39256c;
        boolean z10 = true;
        if ((i10 & 256) == 256) {
            return protoBuf$Type.f39248H;
        }
        if ((i10 & 512) != 512) {
            z10 = false;
        }
        if (z10) {
            return c6735e.m13355a(protoBuf$Type.f39249I);
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static C6680g m279J(int i10, int i11, String str, LessonPath lessonPath, int i12) {
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        int i13 = i11;
        String str2 = (i12 & 4) != 0 ? "" : str;
        String str3 = (i12 & 16) != 0 ? "" : null;
        LessonPath lessonPath2 = (i12 & 32) != 0 ? null : lessonPath;
        C5207g.m11111f(str2, "courseTitle");
        C5207g.m11111f(str3, "lessonLanguageFromDeeplink");
        return new C6680g(i10, i13, str2, false, str3, lessonPath2);
    }

    /* JADX INFO: renamed from: J0 */
    public static final Object m280J0(InterfaceC9968c interfaceC9968c, InterfaceC7116c interfaceC7116c, InterfaceC7117d interfaceC7117d) throws Throwable {
        m289M0(interfaceC7117d);
        Object objMo9539a = interfaceC7116c.mo9539a(interfaceC7117d, interfaceC9968c);
        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: J1 */
    public static final ArrayList m281J1(InterfaceC8866x interfaceC8866x, C7646c c7646c) {
        C5207g.m11111f(interfaceC8866x, "<this>");
        C5207g.m11111f(c7646c, "fqName");
        ArrayList arrayList = new ArrayList();
        m373n0(interfaceC8866x, c7646c, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public static final void m282K(Object obj, AbstractCollection abstractCollection) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static void m283K0() {
        if (C10134c0.f51354a >= 18) {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: K1 */
    public static int m284K1(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        loop1: while (true) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 >= -32) {
                        if (b10 >= -16) {
                            if (i12 < i11 - 2) {
                                int i13 = i12 + 1;
                                byte b11 = bArr[i12];
                                if (b11 > -65) {
                                    break loop1;
                                }
                                if ((((b11 + 112) + (b10 << 28)) >> 30) != 0) {
                                    break loop1;
                                }
                                int i14 = i13 + 1;
                                if (bArr[i13] > -65) {
                                    break loop1;
                                }
                                i12 = i14 + 1;
                                if (bArr[i14] > -65) {
                                }
                            } else {
                                return m378o1(bArr, i12, i11);
                            }
                        } else {
                            if (i12 >= i11 - 1) {
                                return m378o1(bArr, i12, i11);
                            }
                            int i15 = i12 + 1;
                            byte b12 = bArr[i12];
                            if (b12 > -65 || ((b10 == -32 && b12 < -96) || (b10 == -19 && b12 >= -96))) {
                                break;
                            }
                            i10 = i15 + 1;
                            if (bArr[i15] > -65) {
                            }
                        }
                    } else if (i12 < i11) {
                        if (b10 < -62) {
                            break;
                        }
                        i10 = i12 + 1;
                        if (bArr[i12] > -65) {
                            break;
                        }
                    } else {
                        return b10;
                    }
                    return -1;
                }
                i10 = i12;
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: L */
    public static final void m285L(File file, long j10) throws IOException {
        if (!file.exists()) {
            C5579b.m11813e(file);
        }
        if (file.length() != j10 && j10 > 0) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.setLength(j10);
                randomAccessFile.close();
            } catch (Exception unused) {
                throw new IOException("file_allocation_error");
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: L0 */
    public static final void m286L0(CoroutineContext coroutineContext) {
        InterfaceC7875v0 interfaceC7875v0 = (InterfaceC7875v0) coroutineContext.mo1474w(InterfaceC7875v0.b.f42976a);
        if (interfaceC7875v0 != null && !interfaceC7875v0.mo15547b()) {
            throw interfaceC7875v0.mo15617Q();
        }
    }

    /* JADX INFO: renamed from: L1 */
    public static final C7114a m287L1(AbstractChannel abstractChannel) {
        return new C7114a(abstractChannel, false);
    }

    /* JADX INFO: renamed from: M */
    public static final void m288M(Appendable appendable, Object obj, InterfaceC2052l interfaceC2052l) throws IOException {
        C5207g.m11111f(appendable, "<this>");
        if (interfaceC2052l != null) {
            appendable.append((CharSequence) interfaceC2052l.mo528n(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: M0 */
    public static final void m289M0(InterfaceC7117d interfaceC7117d) throws Throwable {
        if (interfaceC7117d instanceof C7145z) {
            throw ((C7145z) interfaceC7117d).f40390a;
        }
    }

    /* JADX INFO: renamed from: M1 */
    public static final ProtoBuf$Type m290M1(ProtoBuf$Function protoBuf$Function, C6735e c6735e) {
        C5207g.m11111f(protoBuf$Function, "<this>");
        C5207g.m11111f(c6735e, "typeTable");
        int i10 = protoBuf$Function.f39124c;
        boolean z10 = true;
        if ((i10 & 32) == 32) {
            return protoBuf$Function.f39131j;
        }
        if ((i10 & 64) != 64) {
            z10 = false;
        }
        if (z10) {
            return c6735e.m13355a(protoBuf$Function.f39132k);
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public static int m291N(C9718b c9718b, boolean z10) {
        int i10 = c9718b.f49727c;
        int i11 = c9718b.f49726b;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte b10 = -1;
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                byte[][] bArr = c9718b.f49725a;
                byte b11 = z10 ? bArr[i14][i16] : bArr[i16][i14];
                if (b11 == b10) {
                    i15++;
                } else {
                    if (i15 >= 5) {
                        i13 += (i15 - 5) + 3;
                    }
                    i15 = 1;
                    b10 = b11;
                }
            }
            if (i15 >= 5) {
                i13 = (i15 - 5) + 3 + i13;
            }
        }
        return i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N0 */
    public static final C7648e m292N0(AbstractC5257t abstractC5257t) {
        String str;
        InterfaceC9075c interfaceC9075cMo5291h = abstractC5257t.mo11289w().mo5291h(C6797e.a.f38395r);
        if (interfaceC9075cMo5291h == null) {
            return null;
        }
        Object objM13444l0 = C6752c.m13444l0(interfaceC9075cMo5291h.mo12513a().values());
        C8887s c8887s = objM13444l0 instanceof C8887s ? (C8887s) objM13444l0 : null;
        if (c8887s != null && (str = (String) c8887s.f46772a) != null) {
            if (!C7648e.m15233m(str)) {
                str = null;
            }
            if (str != null) {
                return C7648e.m15232l(str);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: N1 */
    public static final C5238j0 m293N1(C5238j0 c5238j0, InterfaceC9077e interfaceC9077e) {
        C5238j0 c5238j0M11272c;
        C5207g.m11111f(c5238j0, "<this>");
        if (C5227e.m11251a(c5238j0) == interfaceC9077e) {
            return c5238j0;
        }
        InterfaceC6727j<Object> interfaceC6727j = C5227e.f33313a[0];
        C6385l c6385l = C5227e.f33314b;
        c6385l.getClass();
        C5207g.m11111f(interfaceC6727j, "property");
        C5225d c5225d = (C5225d) c5238j0.mo13005a().get(c6385l.f36774b);
        if (c5225d != null) {
            if (!c5238j0.isEmpty()) {
                Iterable iterable = c5238j0.f36779a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!C5207g.m11106a((AbstractC5234h0) obj, c5225d)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() != c5238j0.f36779a.mo13006a()) {
                    C5238j0.f33329b.getClass();
                    c5238j0M11272c = C5238j0.a.m11272c(arrayList);
                }
                if (c5238j0M11272c == null) {
                    c5238j0 = c5238j0M11272c;
                }
            }
            c5238j0M11272c = c5238j0;
            if (c5238j0M11272c == null) {
                c5238j0 = c5238j0M11272c;
            }
        }
        if (!interfaceC9077e.iterator().hasNext() && interfaceC9077e.isEmpty()) {
            return c5238j0;
        }
        C5225d c5225d2 = new C5225d(interfaceC9077e);
        if (c5238j0.f36779a.get(C5238j0.f33329b.m14243b(c5225d2.mo11248b())) != null) {
            return c5238j0;
        }
        return c5238j0.isEmpty() ? new C5238j0(C9000b.m17251q(c5225d2)) : C5238j0.a.m11272c(C6752c.m13439g0(c5225d2, C6752c.m13453u0(c5238j0)));
    }

    /* JADX INFO: renamed from: O */
    public static final LibraryData m294O(ResultLibraryItem resultLibraryItem) {
        C5207g.m11111f(resultLibraryItem, "<this>");
        int i10 = resultLibraryItem.f18712a;
        String str = resultLibraryItem.f18720e;
        String str2 = resultLibraryItem.f18722f;
        int i11 = resultLibraryItem.f18718d;
        String str3 = resultLibraryItem.f18716c;
        String str4 = resultLibraryItem.f18726h;
        String str5 = resultLibraryItem.f18704S;
        String str6 = resultLibraryItem.f18705T;
        String str7 = resultLibraryItem.f18708W;
        String str8 = resultLibraryItem.f18702Q;
        String str9 = resultLibraryItem.f18717c0;
        int i12 = resultLibraryItem.f18687B;
        int i13 = resultLibraryItem.f18729i0;
        String str10 = resultLibraryItem.f18731j0;
        int i14 = resultLibraryItem.f18691F;
        int i15 = resultLibraryItem.f18688C;
        int i16 = resultLibraryItem.f18742p;
        double d10 = resultLibraryItem.f18721e0;
        Float f3 = resultLibraryItem.f18733k0;
        boolean z10 = resultLibraryItem.f18735l0;
        String str11 = resultLibraryItem.f18707V;
        List<String> list = resultLibraryItem.f18719d0;
        String str12 = resultLibraryItem.f18732k;
        String str13 = resultLibraryItem.f18714b;
        MediaSource mediaSource = resultLibraryItem.f18749v;
        String str14 = resultLibraryItem.f18747t;
        List<String> list2 = resultLibraryItem.f18725g0;
        Boolean bool = resultLibraryItem.f18723f0;
        String str15 = resultLibraryItem.f18743p0;
        if (str15 == null) {
            str15 = "";
        }
        String str16 = str15;
        String str17 = resultLibraryItem.f18741o0;
        String str18 = resultLibraryItem.f18728i;
        String str19 = resultLibraryItem.f18709X;
        return new LibraryData(i10, str13, str, str2, i11, str3, mediaSource, str4, null, str8, null, str5, str6, resultLibraryItem.f18706U, str11, str7, str19, str9, i12, i13, str10, i14, i15, i16, Integer.valueOf(resultLibraryItem.f18730j), Integer.valueOf(resultLibraryItem.f18746s), str14, d10, z10, list, str12, list2, f3, bool, str16, str17, str18, 0.0d, 0.0d, false, false, resultLibraryItem.f18697L, 1280, 480, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: O0 */
    public static final C10229d m295O0(Annotation[] annotationArr, C7646c c7646c) {
        C5207g.m11111f(annotationArr, "<this>");
        C5207g.m11111f(c7646c, "fqName");
        for (Annotation annotation : annotationArr) {
            if (C5207g.m11106a(ReflectClassUtilKt.m13648a(C5206f.m10998T0(C5206f.m10995P0(annotation))).m15204b(), c7646c)) {
                if (annotation != null) {
                    return new C10229d(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new C10229d(annotation);
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: O1 */
    public static final InterfaceC0549h m296O1(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "<this>");
        InterfaceC0549h interfaceC0549h = layoutNode.f3774h;
        if (interfaceC0549h != null) {
            return interfaceC0549h;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }

    /* JADX INFO: renamed from: P */
    public static final Word m297P(ResultWord resultWord, String str) {
        String str2 = resultWord.f19116a;
        if (str2 == null) {
            str2 = "";
        }
        List<Meaning> list = resultWord.f19121f;
        List<String> list2 = resultWord.f19122g;
        String str3 = resultWord.f19118c;
        int i10 = resultWord.f19119d;
        return new Word(str, str2, resultWord.f19117b, str3, i10, false, list, list2, null, resultWord.f19124i, resultWord.f19123h, 288, null);
    }

    /* JADX INFO: renamed from: P0 */
    public static View m298P0(View view, int i10) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewFindViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: P1 */
    public static LinkedHashSet m299P1(C7648e c7648e, Collection collection, Collection collection2, InterfaceC8830c interfaceC8830c, InterfaceC10548l interfaceC10548l, OverridingUtil overridingUtil, boolean z10) {
        if (c7648e == null) {
            m360k(12);
            throw null;
        }
        if (collection == null) {
            m360k(13);
            throw null;
        }
        if (collection2 == null) {
            m360k(14);
            throw null;
        }
        if (interfaceC8830c == null) {
            m360k(15);
            throw null;
        }
        if (interfaceC10548l == null) {
            m360k(16);
            throw null;
        }
        if (overridingUtil == null) {
            m360k(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.m14083h(c7648e, collection, collection2, interfaceC8830c, new C0127a(interfaceC10548l, linkedHashSet, z10));
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: Q */
    public static final AbstractC5249p m300Q(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        C5207g.m11109d(abstractC5262v0Mo11288a1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (AbstractC5249p) abstractC5262v0Mo11288a1;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final InterfaceC6367k m301Q0(InterfaceC6366j interfaceC6366j, C7645b c7645b) {
        C5207g.m11111f(interfaceC6366j, "<this>");
        C5207g.m11111f(c7645b, "classId");
        InterfaceC6366j.a.b bVarMo12997a = interfaceC6366j.mo12997a(c7645b);
        if (bVarMo12997a != null) {
            return bVarMo12997a.f36756a;
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: Q1 */
    public static LinkedHashSet m302Q1(C7648e c7648e, AbstractCollection abstractCollection, Collection collection, InterfaceC8830c interfaceC8830c, InterfaceC10548l interfaceC10548l, OverridingUtil overridingUtil) {
        if (c7648e == null) {
            m360k(0);
            throw null;
        }
        if (collection == null) {
            m360k(2);
            throw null;
        }
        if (interfaceC8830c == null) {
            m360k(3);
            throw null;
        }
        if (interfaceC10548l == null) {
            m360k(4);
            throw null;
        }
        if (overridingUtil != null) {
            return m299P1(c7648e, abstractCollection, collection, interfaceC8830c, interfaceC10548l, overridingUtil, false);
        }
        m360k(5);
        throw null;
    }

    /* JADX INFO: renamed from: R */
    public static final C7134o m303R(C7138s c7138s) {
        return new C7134o(c7138s, null);
    }

    /* JADX INFO: renamed from: R0 */
    public static final C7136q m304R0(C7135p c7135p, FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, InterfaceC2058r interfaceC2058r) {
        return new C7136q(new C7109xd7c321e6(new InterfaceC7116c[]{c7135p, flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1}, null, interfaceC2058r));
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: R1 */
    public static LinkedHashSet m305R1(C7648e c7648e, Collection collection, AbstractCollection abstractCollection, LazyJavaClassDescriptor lazyJavaClassDescriptor, InterfaceC10548l interfaceC10548l, OverridingUtil overridingUtil) {
        if (c7648e == null) {
            m360k(6);
            throw null;
        }
        if (collection == null) {
            m360k(7);
            throw null;
        }
        if (lazyJavaClassDescriptor == null) {
            m360k(9);
            throw null;
        }
        if (interfaceC10548l == null) {
            m360k(10);
            throw null;
        }
        if (overridingUtil != null) {
            return m299P1(c7648e, collection, abstractCollection, lazyJavaClassDescriptor, interfaceC10548l, overridingUtil, true);
        }
        m360k(11);
        throw null;
    }

    /* JADX INFO: renamed from: S */
    public static final C7135p m306S(StateFlowImpl stateFlowImpl) {
        return new C7135p(stateFlowImpl, null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: S0 */
    public static final InterfaceC7116c m307S0(InterfaceC7116c interfaceC7116c, CoroutineDispatcher coroutineDispatcher) {
        if (coroutineDispatcher.mo1474w(InterfaceC7875v0.b.f42976a) == null) {
            if (C5207g.m11106a(coroutineDispatcher, EmptyCoroutineContext.f38093a)) {
                return interfaceC7116c;
            }
            return interfaceC7116c instanceof InterfaceC8661g ? InterfaceC8661g.a.m16923a((InterfaceC8661g) interfaceC7116c, coroutineDispatcher, 0, null, 6) : new C8658d(interfaceC7116c, coroutineDispatcher, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineDispatcher).toString());
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00cf -> B:46:0x00d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:48:0x00d7
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: S1 */
    public static final void m308S1(p464wl.InterfaceC9968c r11, java.lang.Object r12, cm.InterfaceC2052l r13) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.C0062b.m308S1(wl.c, java.lang.Object, cm.l):void");
    }

    /* JADX INFO: renamed from: T */
    public static final InterfaceC0500b m309T(InterfaceC0500b interfaceC0500b, long j10, InterfaceC9154k0 interfaceC9154k0) {
        C5207g.m11111f(interfaceC0500b, "$this$background");
        C5207g.m11111f(interfaceC9154k0, "shape");
        return interfaceC0500b.mo1929K(new C9110b(new C9169u(j10), interfaceC9154k0, InspectableValueKt.f4184a));
    }

    /* JADX INFO: renamed from: T0 */
    public static final String m310T0(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j10 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return C0166e.m770q(new Object[]{str}, 1, "%6s", "format(format, *args)");
    }

    /* JADX INFO: renamed from: T1 */
    public static final ProtoBuf$Type m311T1(ProtoBuf$Function protoBuf$Function, C6735e c6735e) {
        C5207g.m11111f(protoBuf$Function, "<this>");
        C5207g.m11111f(c6735e, "typeTable");
        int i10 = protoBuf$Function.f39124c;
        boolean z10 = true;
        if ((i10 & 8) == 8) {
            ProtoBuf$Type protoBuf$Type = protoBuf$Function.f39128g;
            C5207g.m11110e(protoBuf$Type, "returnType");
            return protoBuf$Type;
        }
        if ((i10 & 16) != 16) {
            z10 = false;
        }
        if (z10) {
            return c6735e.m13355a(protoBuf$Function.f39129h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    /* JADX INFO: renamed from: U0 */
    public static final C7853n0 m313U0(Executor executor) {
        if (executor instanceof ExecutorC7829f0) {
        }
        return new C7853n0(executor);
    }

    /* JADX INFO: renamed from: U1 */
    public static final ProtoBuf$Type m314U1(ProtoBuf$Property protoBuf$Property, C6735e c6735e) {
        C5207g.m11111f(protoBuf$Property, "<this>");
        C5207g.m11111f(c6735e, "typeTable");
        int i10 = protoBuf$Property.f39192c;
        boolean z10 = true;
        if ((i10 & 8) == 8) {
            ProtoBuf$Type protoBuf$Type = protoBuf$Property.f39196g;
            C5207g.m11110e(protoBuf$Type, "returnType");
            return protoBuf$Type;
        }
        if ((i10 & 16) != 16) {
            z10 = false;
        }
        if (z10) {
            return c6735e.m13355a(protoBuf$Property.f39197h);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    /* JADX INFO: renamed from: V */
    public static void m315V(String str) {
        if (C10134c0.f51354a >= 18) {
            Trace.beginSection(str);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public static ApiException m316V0(Status status) {
        return status.f13881d != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    /* JADX INFO: renamed from: V1 */
    public static long m317V1(long j10, long j11) {
        long j12 = j10 + j11;
        if ((j10 ^ j12) < 0 && (j10 ^ j11) >= 0) {
            throw new ArithmeticException("The calculation caused an overflow: " + j10 + " + " + j11);
        }
        return j12;
    }

    /* JADX INFO: renamed from: W */
    public static int m318W(int i10, int i11, int[] iArr) {
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

    /* JADX INFO: renamed from: W0 */
    public static final int m319W0(C8476m c8476m, int i10) {
        C5207g.m11111f(c8476m, "fontWeight");
        boolean z10 = c8476m.compareTo(C8476m.f45648d) >= 0;
        boolean z11 = i10 == 1;
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: W1 */
    public static int m320W1(long j10) {
        if (-2147483648L > j10 || j10 > 2147483647L) {
            throw new ArithmeticException(C0166e.m763i("Value cannot fit in an int: ", j10));
        }
        return (int) j10;
    }

    /* JADX INFO: renamed from: X */
    public static final int m321X(int[] iArr, int i10) {
        int length = iArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else {
                if (i10 >= i13) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: X0 */
    public static InterfaceC8853n0 m322X0(C7648e c7648e, InterfaceC8830c interfaceC8830c) {
        if (c7648e == null) {
            m360k(19);
            throw null;
        }
        if (interfaceC8830c == null) {
            m360k(20);
            throw null;
        }
        Collection<InterfaceC8828b> collectionMo13590G = interfaceC8830c.mo13590G();
        if (collectionMo13590G.size() != 1) {
            return null;
        }
        for (InterfaceC8853n0 interfaceC8853n0 : collectionMo13590G.iterator().next().mo11889i()) {
            if (interfaceC8853n0.mo11874a().equals(c7648e)) {
                return interfaceC8853n0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X1 */
    public static final int m323X1(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = ((C5296b) arrayList.get(i13)).f33569a;
            if (i14 < 0) {
                i14 += i11;
            }
            int iM11113h = C5207g.m11113h(i14, i10);
            if (iM11113h < 0) {
                i12 = i13 + 1;
            } else {
                if (iM11113h <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: renamed from: Y */
    public static int m324Y(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = jArr[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else {
                if (j11 <= j10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    /* JADX INFO: renamed from: Y0 */
    public static final ArrayList m325Y0(Annotation[] annotationArr) {
        C5207g.m11111f(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C10229d(annotation));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Y1 */
    public static final int m326Y1(SegmentedByteString segmentedByteString, int i10) {
        int i11;
        C5207g.m11111f(segmentedByteString, "<this>");
        int i12 = i10 + 1;
        int length = segmentedByteString.f43901e.length;
        int[] iArr = segmentedByteString.f43902f;
        C5207g.m11111f(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = iArr[i11];
                if (i15 >= i12) {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        return i11 >= 0 ? i11 : ~i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public static final Bundle m327Z(Pair... pairArr) {
        C5207g.m11111f(pairArr, "pairs");
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f38012a;
            B b10 = pair.f38013b;
            if (b10 == 0) {
                bundle.putString(str, null);
            } else if (b10 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b10).booleanValue());
            } else if (b10 instanceof Byte) {
                bundle.putByte(str, ((Number) b10).byteValue());
            } else if (b10 instanceof Character) {
                bundle.putChar(str, ((Character) b10).charValue());
            } else if (b10 instanceof Double) {
                bundle.putDouble(str, ((Number) b10).doubleValue());
            } else if (b10 instanceof Float) {
                bundle.putFloat(str, ((Number) b10).floatValue());
            } else if (b10 instanceof Integer) {
                bundle.putInt(str, ((Number) b10).intValue());
            } else if (b10 instanceof Long) {
                bundle.putLong(str, ((Number) b10).longValue());
            } else if (b10 instanceof Short) {
                bundle.putShort(str, ((Number) b10).shortValue());
            } else if (b10 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b10);
            } else if (b10 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b10);
            } else if (b10 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b10);
            } else if (b10 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b10);
            } else if (b10 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b10);
            } else if (b10 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b10);
            } else if (b10 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b10);
            } else if (b10 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b10);
            } else if (b10 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b10);
            } else if (b10 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b10);
            } else if (b10 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b10);
            } else if (b10 instanceof Object[]) {
                Class<?> componentType = b10.getClass().getComponentType();
                C5207g.m11108c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b10);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b10);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b10);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) b10);
                }
            } else if (b10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b10);
            } else if (b10 instanceof IBinder) {
                C9183b.m17516a(bundle, str, (IBinder) b10);
            } else if (b10 instanceof Size) {
                C9184c.m17517a(bundle, str, (Size) b10);
            } else {
                if (!(b10 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b10.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                C9184c.m17518b(bundle, str, (SizeF) b10);
            }
        }
        return bundle;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: Z0 */
    public static String m328Z0(Context context) {
        if (C8201h.m16329a() == null) {
            synchronized (C8201h.m16331c()) {
                if (C8201h.m16329a() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!C6205a.m12742b(C8201h.class)) {
                        try {
                            C8201h.f44397g = string;
                        } catch (Throwable th2) {
                            C6205a.m12741a(C8201h.class, th2);
                        }
                    }
                    if (C8201h.m16329a() == null) {
                        UUID uuidRandomUUID = UUID.randomUUID();
                        C5207g.m11110e(uuidRandomUUID, "randomUUID()");
                        String strM11116k = C5207g.m11116k(uuidRandomUUID, "XZ");
                        if (!C6205a.m12742b(C8201h.class)) {
                            try {
                                C8201h.f44397g = strM11116k;
                            } catch (Throwable th3) {
                                C6205a.m12741a(C8201h.class, th3);
                            }
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", C8201h.m16329a()).apply();
                    }
                }
                C9072e c9072e = C9072e.f47360a;
            }
        }
        String strM16329a = C8201h.m16329a();
        if (strM16329a != null) {
            return strM16329a;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX INFO: renamed from: Z1 */
    public static final Object m329Z1(Set set, Enum r10, Enum r11, Object obj, boolean z10) {
        Set setM13457y0;
        Enum r12;
        Set set2 = set;
        if (!z10) {
            if (obj != null && (setM13457y0 = C6752c.m13457y0(C9338z.m17690M0(set2, obj))) != null) {
                set2 = setM13457y0;
            }
            return C6752c.m13444l0(set2);
        }
        if (set2.contains(r10)) {
            r12 = r10;
        } else {
            r12 = set2.contains(r11) ? r11 : null;
        }
        if (C5207g.m11106a(r12, r10) && C5207g.m11106a(obj, r11)) {
            return null;
        }
        return obj == null ? r12 : obj;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m330a0(CoroutineContext coroutineContext, CancellationException cancellationException) {
        int i10 = InterfaceC7875v0.f42975B;
        InterfaceC7875v0 interfaceC7875v0 = (InterfaceC7875v0) coroutineContext.mo1474w(InterfaceC7875v0.b.f42976a);
        if (interfaceC7875v0 != null) {
            interfaceC7875v0.mo15618a(cancellationException);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public static final String m331a1(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb2 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            C5207g.m11110e(signatureArr, "signatures");
            int length = signatureArr.length;
            int i10 = 0;
            while (i10 < length) {
                Signature signature = signatureArr[i10];
                i10++;
                messageDigest.update(signature.toByteArray());
                sb2.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb2.append(":");
            }
            if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            String string = sb2.toString();
            C5207g.m11110e(string, "sb.toString()");
            return string;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static void m332a2(View view, float f3) {
        Drawable background = view.getBackground();
        if (background instanceof C5768g) {
            ((C5768g) background).m12140l(f3);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m333b0(InterfaceC8438n interfaceC8438n, Throwable th2) {
        CancellationException cancellationException = null;
        if (th2 != null) {
            if (th2 instanceof CancellationException) {
                cancellationException = (CancellationException) th2;
            }
            if (cancellationException == null) {
                cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                cancellationException.initCause(th2);
            }
        }
        interfaceC8438n.mo14334a(cancellationException);
    }

    /* JADX INFO: renamed from: b1 */
    public static int m334b1(int i10, Context context, int i11) {
        TypedValue typedValueM10922a = C5149b.m10922a(i10, context);
        if (typedValueM10922a == null) {
            return i11;
        }
        int i12 = typedValueM10922a.resourceId;
        if (i12 == 0) {
            return typedValueM10922a.data;
        }
        Object obj = C7472a.f41322a;
        return C7472a.d.m14851a(context, i12);
    }

    /* JADX INFO: renamed from: b2 */
    public static void m335b2(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C5768g) {
            m338c2(view, (C5768g) background);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final String m336c0(String str) {
        C5207g.m11111f(str, "<this>");
        boolean z10 = false;
        if (str.length() == 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if ('a' <= cCharAt && cCharAt < '{') {
            z10 = true;
        }
        if (!z10) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return upperCase + strSubstring;
    }

    /* JADX INFO: renamed from: c1 */
    public static int m337c1(Context context, int i10, String str) {
        TypedValue typedValueM10924c = C5149b.m10924c(context, i10, str);
        int i11 = typedValueM10924c.resourceId;
        if (i11 == 0) {
            return typedValueM10924c.data;
        }
        Object obj = C7472a.f41322a;
        return C7472a.d.m14851a(context, i11);
    }

    /* JADX INFO: renamed from: c2 */
    public static void m338c2(View view, C5768g c5768g) {
        C9709a c9709a = c5768g.f34857a.f34871b;
        if (c9709a != null && c9709a.f49716a) {
            float fM18715i = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                fM18715i += C10029b0.i.m18715i((View) parent);
            }
            C5768g.b bVar = c5768g.f34857a;
            if (bVar.f34882m != fM18715i) {
                bVar.f34882m = fM18715i;
                c5768g.m12148t();
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static void m339d0(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static int m340d1(View view, int i10) {
        Context context = view.getContext();
        TypedValue typedValueM10924c = C5149b.m10924c(view.getContext(), i10, view.getClass().getCanonicalName());
        int i11 = typedValueM10924c.resourceId;
        if (i11 == 0) {
            return typedValueM10924c.data;
        }
        Object obj = C7472a.f41322a;
        return C7472a.d.m14851a(context, i11);
    }

    /* JADX INFO: renamed from: d2 */
    public static C7134o m341d2(InterfaceC7116c interfaceC7116c, InterfaceC7882z interfaceC7882z, InterfaceC7140u interfaceC7140u) {
        C9213c c9213cM14381c = C7120g.m14381c(interfaceC7116c, 0);
        C7138s c7138sM368m = m368m(0, c9213cM14381c.f47817a, (BufferOverflow) c9213cM14381c.f47819c);
        return new C7134o(c7138sM368m, C7120g.m14382d(interfaceC7882z, (CoroutineContext) c9213cM14381c.f47820d, (InterfaceC7116c) c9213cM14381c.f47818b, c7138sM368m, interfaceC7140u, f163j));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e0 */
    public static final void m342e0(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static final List m343e1(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        m398t1(abstractC5257t);
        int iM245A0 = m245A0(abstractC5257t);
        if (iM245A0 == 0) {
            return EmptyList.f38032a;
        }
        List<InterfaceC5246n0> listSubList = abstractC5257t.mo11240V0().subList(0, iM245A0);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            AbstractC5257t abstractC5257tMo11236c = ((InterfaceC5246n0) it.next()).mo11236c();
            C5207g.m11110e(abstractC5257tMo11236c, "it.type");
            arrayList.add(abstractC5257tMo11236c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e2 */
    public static final String m344e2(InterfaceC8830c interfaceC8830c, String str) {
        String strM10979A0;
        C5207g.m11111f(interfaceC8830c, "classDescriptor");
        C5207g.m11111f(str, "jvmDescriptor");
        String str2 = C8646c.f46201a;
        C7647d c7647dM15221i = DescriptorUtilsKt.m14110g(interfaceC8830c).m15221i();
        C5207g.m11110e(c7647dM15221i, "fqNameSafe.toUnsafe()");
        C7645b c7645bM16869g = C8646c.m16869g(c7647dM15221i);
        if (c7645bM16869g != null) {
            strM10979A0 = C9595b.m18064b(c7645bM16869g).m18067e();
            C5207g.m11110e(strM10979A0, "byClassId(it).internalName");
        } else {
            strM10979A0 = C5206f.m10979A0(interfaceC8830c, C5212l.f33290i);
        }
        return C6899b.m13778f(strM10979A0, str);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m345f0(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f1 */
    public static final AbstractC5257t m346f1(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        if (abstractC5257t instanceof InterfaceC5260u0) {
            return ((InterfaceC5260u0) abstractC5257t).mo11226P();
        }
        return null;
    }

    /* JADX INFO: renamed from: f2 */
    public static final void m347f2(InterfaceC2056p interfaceC2056p, Object obj, InterfaceC9968c interfaceC9968c) {
        C5207g.m11111f(interfaceC9968c, "completion");
        try {
            C5213m.m11200e(2, interfaceC2056p);
            Object objMo1337m0 = interfaceC2056p.mo1337m0(obj, interfaceC9968c);
            if (objMo1337m0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                interfaceC9968c.mo2031y(objMo1337m0);
            }
        } catch (Throwable th2) {
            interfaceC9968c.mo2031y(C7499b.m14967u(th2));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g0 */
    public static final void m348g0(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(C0204c.m851j("index: ", i10, ", size: ", i11));
        }
    }

    /* JADX INFO: renamed from: g1 */
    public static final FunctionClassKind m349g1(InterfaceC8834e interfaceC8834e) {
        FunctionClassKind functionClassKind = null;
        if ((interfaceC8834e instanceof InterfaceC8830c) && AbstractC6795c.m13539L(interfaceC8834e)) {
            C7647d c7647dM14111h = DescriptorUtilsKt.m14111h(interfaceC8834e);
            if (c7647dM14111h.m15226e() && !c7647dM14111h.m15225d()) {
                FunctionClassKind.C6798a c6798a = FunctionClassKind.Companion;
                String strM15235f = c7647dM14111h.m15228g().m15235f();
                C5207g.m11110e(strM15235f, "shortName().asString()");
                C7646c c7646cM15217e = c7647dM14111h.m15229h().m15217e();
                C5207g.m11110e(c7646cM15217e, "toSafe().parent()");
                c6798a.getClass();
                FunctionClassKind.C6798a.a aVarM13571a = FunctionClassKind.C6798a.m13571a(strM15235f, c7646cM15217e);
                if (aVarM13571a != null) {
                    functionClassKind = aVarM13571a.f38404a;
                }
            }
            return functionClassKind;
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g2 */
    public static final Object m350g2(C7166p c7166p, C7166p c7166p2, InterfaceC2056p interfaceC2056p) throws Throwable {
        Object c7870t;
        Object objM15638V;
        try {
            C5213m.m11200e(2, interfaceC2056p);
            c7870t = interfaceC2056p.mo1337m0(c7166p2, c7166p);
        } catch (Throwable th2) {
            c7870t = new C7870t(th2, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (c7870t != coroutineSingletons && (objM15638V = c7166p.m15638V(c7870t)) != C7499b.f41419I) {
            if (objM15638V instanceof C7870t) {
                throw ((C7870t) objM15638V).f42969a;
            }
            return C7499b.m14907H0(objM15638V);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h0 */
    public static final void m351h0(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbM25n = C0009a.m25n("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbM25n.append(i12);
            throw new IndexOutOfBoundsException(sbM25n.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(C0204c.m851j("fromIndex: ", i10, " > toIndex: ", i11));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h1 */
    public static final InterfaceC7875v0 m352h1(CoroutineContext coroutineContext) {
        int i10 = InterfaceC7875v0.f42975B;
        InterfaceC7875v0 interfaceC7875v0 = (InterfaceC7875v0) coroutineContext.mo1474w(InterfaceC7875v0.b.f42976a);
        if (interfaceC7875v0 != null) {
            return interfaceC7875v0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    /* JADX INFO: renamed from: h2 */
    public static final C7135p m353h2(InterfaceC7116c interfaceC7116c, InterfaceC7882z interfaceC7882z, InterfaceC7140u interfaceC7140u, Object obj) {
        C9213c c9213cM14381c = C7120g.m14381c(interfaceC7116c, 1);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(obj);
        return new C7135p(stateFlowImplM14379a, C7120g.m14382d(interfaceC7882z, (CoroutineContext) c9213cM14381c.f47820d, (InterfaceC7116c) c9213cM14381c.f47818b, stateFlowImplM14379a, interfaceC7140u, obj));
    }

    /* JADX INFO: renamed from: i0 */
    public static final double m354i0(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            return d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i1 */
    public static final AbstractC5588k m355i1(String str, ContentResolver contentResolver) throws FileNotFoundException {
        C5207g.m11112g(str, "filePath");
        if (!C5579b.m11827s(str)) {
            return m358j1(new File(str));
        }
        Uri uri = Uri.parse(str);
        C5207g.m11107b(uri, "Uri.parse(filePath)");
        if (C5207g.m11106a(uri.getScheme(), "content")) {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "w");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                C5207g.m11107b(fileDescriptor, "parcelFileDescriptor.fileDescriptor");
                return new C5590m(new FileOutputStream(fileDescriptor));
            }
            throw new FileNotFoundException(uri + " file_not_found");
        }
        if (!C5207g.m11106a(uri.getScheme(), "file")) {
            throw new FileNotFoundException(uri + " file_not_found");
        }
        File file = new File(uri.getPath());
        if (file.exists() && file.canWrite()) {
            return m358j1(file);
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2 = contentResolver.openFileDescriptor(uri, "w");
        if (parcelFileDescriptorOpenFileDescriptor2 != null) {
            FileDescriptor fileDescriptor2 = parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor();
            C5207g.m11107b(fileDescriptor2, "parcelFileDescriptor.fileDescriptor");
            return new C5590m(new FileOutputStream(fileDescriptor2));
        }
        throw new FileNotFoundException(uri + " file_not_found");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i2 */
    public static final C6524g m356i2(C6526i c6526i, int i10) {
        C5207g.m11111f(c6526i, "<this>");
        boolean z10 = i10 > 0;
        Integer numValueOf = Integer.valueOf(i10);
        C5207g.m11111f(numValueOf, "step");
        if (z10) {
            if (c6526i.f37165c <= 0) {
                i10 = -i10;
            }
            return new C6524g(c6526i.f37163a, c6526i.f37164b, i10);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    /* JADX INFO: renamed from: j0 */
    public static final float m357j0(float f3, float f10, float f11) {
        if (f10 <= f11) {
            if (f3 < f10) {
                return f10;
            }
            return f3 > f11 ? f11 : f3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    /* JADX INFO: renamed from: j1 */
    public static final C5591n m358j1(File file) throws FileNotFoundException {
        if (file.exists()) {
            return new C5591n(new RandomAccessFile(file, "rw"));
        }
        throw new FileNotFoundException(file.getCanonicalPath() + " file_not_found");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: j2 */
    public static TypeSubstitutor m359j2(List list, AbstractC5252q0 abstractC5252q0, InterfaceC8838g interfaceC8838g, List list2) {
        if (abstractC5252q0 == null) {
            m364l(1);
            throw null;
        }
        if (interfaceC8838g == null) {
            m364l(2);
            throw null;
        }
        if (list2 == null) {
            m364l(3);
            throw null;
        }
        TypeSubstitutor typeSubstitutorM363k2 = m363k2(list, abstractC5252q0, interfaceC8838g, list2, null);
        if (typeSubstitutorM363k2 != null) {
            return typeSubstitutorM363k2;
        }
        throw new AssertionError("Substitution failed");
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m360k(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k0 */
    public static final int m361k0(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    /* JADX INFO: renamed from: k1 */
    public static final AbstractC5257t m362k1(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        m398t1(abstractC5257t);
        if (abstractC5257t.mo11289w().mo5291h(C6797e.a.f38393p) != null) {
            return abstractC5257t.mo11240V0().get(m245A0(abstractC5257t)).mo11236c();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b9  */
    /* JADX INFO: renamed from: k2 */
    public static TypeSubstitutor m363k2(List list, AbstractC5252q0 abstractC5252q0, InterfaceC8838g interfaceC8838g, List list2, boolean[] zArr) {
        TypeSubstitutor typeSubstitutor;
        if (abstractC5252q0 == null) {
            m364l(6);
            throw null;
        }
        if (interfaceC8838g == null) {
            m364l(7);
            throw null;
        }
        if (list2 == null) {
            m364l(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            InterfaceC8847k0 interfaceC8847k0 = (InterfaceC8847k0) it.next();
            C9576k0 c9576k0M18033Y0 = C9576k0.m18033Y0(interfaceC8838g, interfaceC8847k0.mo11289w(), interfaceC8847k0.mo17087L(), interfaceC8847k0.mo17088n(), interfaceC8847k0.mo11874a(), i10, interfaceC8847k0.mo17089o0());
            map.put(interfaceC8847k0.mo13600k(), new C5250p0(c9576k0M18033Y0.mo5316v()));
            map2.put(interfaceC8847k0, c9576k0M18033Y0);
            list2.add(c9576k0M18033Y0);
            i10++;
        }
        AbstractC5244m0.a aVar = AbstractC5244m0.f33335b;
        C5242l0 c5242l0 = new C5242l0(map, false);
        TypeSubstitutor typeSubstitutorM14200f = TypeSubstitutor.m14200f(abstractC5252q0, c5242l0);
        TypeSubstitutor typeSubstitutorM14200f2 = TypeSubstitutor.m14200f(new C5254r0(abstractC5252q0), c5242l0);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC8847k0 interfaceC8847k1 = (InterfaceC8847k0) it2.next();
            C9576k0 c9576k0 = (C9576k0) map2.get(interfaceC8847k1);
            for (AbstractC5257t abstractC5257t : interfaceC8847k1.getUpperBounds()) {
                InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
                if (interfaceC8834eMo11235q instanceof InterfaceC8847k0) {
                    InterfaceC8847k0 interfaceC8847k2 = (InterfaceC8847k0) interfaceC8834eMo11235q;
                    C5207g.m11111f(interfaceC8847k2, "typeParameter");
                    if (TypeUtilsKt.m14233j(interfaceC8847k2, null, 6)) {
                        typeSubstitutor = typeSubstitutorM14200f;
                    } else {
                        typeSubstitutor = typeSubstitutorM14200f2;
                    }
                } else {
                    typeSubstitutor = typeSubstitutorM14200f2;
                }
                AbstractC5257t abstractC5257tM14205k = typeSubstitutor.m14205k(abstractC5257t, Variance.OUT_VARIANCE);
                if (abstractC5257tM14205k == null) {
                    return null;
                }
                if (abstractC5257tM14205k != abstractC5257t && zArr != null) {
                    zArr[0] = true;
                }
                c9576k0.m18035X0();
                if (!C7499b.m14926X(abstractC5257tM14205k)) {
                    c9576k0.f49211l.add(abstractC5257tM14205k);
                }
            }
            c9576k0.m18035X0();
            c9576k0.f49209H = true;
        }
        return typeSubstitutorM14200f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m364l(int i10) {
        String str = i10 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 4 ? 3 : 2];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i10 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l0 */
    public static final long m365l0(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            return j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    /* JADX INFO: renamed from: l1 */
    public static final Object m366l1(InterfaceC2073e interfaceC2073e, InterfaceC6727j interfaceC6727j) {
        C5207g.m11111f(interfaceC2073e, "<this>");
        C5207g.m11111f(interfaceC6727j, "p");
        return interfaceC2073e.mo807E();
    }

    /* JADX INFO: renamed from: l2 */
    public static final long m367l2(String str, long j10, long j11, long j12) {
        String property;
        int i10 = C7169s.f40443a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j10;
        }
        Long lM15247M2 = C7660h.m15247M2(property);
        if (lM15247M2 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM15247M2.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: m */
    public static final C7138s m368m(int i10, int i11, BufferOverflow bufferOverflow) {
        boolean z10 = true;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m761g("replay cannot be negative, but was ", i10).toString());
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(C0166e.m761g("extraBufferCapacity cannot be negative, but was ", i11).toString());
        }
        if (i10 <= 0 && i11 <= 0) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                z10 = false;
            }
        }
        if (!z10) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + bufferOverflow).toString());
        }
        int i12 = i11 + i10;
        if (i12 < 0) {
            i12 = Integer.MAX_VALUE;
        }
        return new C7138s(i10, i12, bufferOverflow);
    }

    /* JADX INFO: renamed from: m0 */
    public static final Object m369m0(InterfaceC7116c interfaceC7116c, InterfaceC2056p interfaceC2056p, InterfaceC9968c interfaceC9968c) {
        Object objMo9539a = InterfaceC8661g.a.m16923a(C7130k.m14387a(interfaceC2056p, interfaceC7116c), null, 0, BufferOverflow.SUSPEND, 1).mo9539a(C8663i.f46242a, interfaceC9968c);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objMo9539a != coroutineSingletons) {
            objMo9539a = C9072e.f47360a;
        }
        return objMo9539a == coroutineSingletons ? objMo9539a : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: m1 */
    public static final List m370m1(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        m398t1(abstractC5257t);
        List<InterfaceC5246n0> listMo11240V0 = abstractC5257t.mo11240V0();
        int iM245A0 = m245A0(abstractC5257t);
        int i10 = 0;
        if (m398t1(abstractC5257t)) {
            if (abstractC5257t.mo11289w().mo5291h(C6797e.a.f38393p) != null) {
                i10 = 1;
            }
        }
        return listMo11240V0.subList(i10 + iM245A0, listMo11240V0.size() - 1);
    }

    /* JADX INFO: renamed from: m2 */
    public static int m371m2(String str, int i10, int i11, int i12, int i13) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return (int) m367l2(str, i10, i11, i12);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ C7138s m372n(int i10, int i11, BufferOverflow bufferOverflow, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return m368m(i10, i11, bufferOverflow);
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m373n0(InterfaceC8866x interfaceC8866x, C7646c c7646c, ArrayList arrayList) {
        C5207g.m11111f(interfaceC8866x, "<this>");
        C5207g.m11111f(c7646c, "fqName");
        if (interfaceC8866x instanceof InterfaceC8867y) {
            ((InterfaceC8867y) interfaceC8866x).mo13607c(c7646c, arrayList);
        } else {
            arrayList.addAll(interfaceC8866x.mo13606b(c7646c));
        }
    }

    /* JADX INFO: renamed from: n1 */
    public static final boolean m374n1(Spanned spanned, Class cls) {
        C5207g.m11111f(spanned, "<this>");
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX INFO: renamed from: n2 */
    public static final String m375n2(String str) {
        C5207g.m11111f(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (!C7076b.m14278X2(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                C5207g.m11110e(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                C5207g.m11110e(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i12 = 0;
                while (i12 < length) {
                    int i13 = i12 + 1;
                    char cCharAt = lowerCase.charAt(i12);
                    if (C5207g.m11113h(cCharAt, 31) > 0 && C5207g.m11113h(cCharAt, 127) < 0 && C7076b.m14284d3(" #%/:?@[\\]", cCharAt, 0, false, 6) == -1) {
                        i12 = i13;
                    }
                    i10 = 1;
                    break;
                }
                if (i10 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM269G0 = (C7661i.m15256V2(str, "[", false) && C7661i.m15248N2(str, "]")) ? m269G0(str, 1, str.length() - 1) : m269G0(str, 0, str.length());
        if (inetAddressM269G0 == null) {
            return null;
        }
        byte[] address = inetAddressM269G0.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressM269G0.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < address.length) {
            int i16 = i14;
            while (i16 < 16 && address[i16] == 0 && address[i16 + 1] == 0) {
                i16 += 2;
            }
            int i17 = i16 - i14;
            if (i17 > i15 && i17 >= 4) {
                i11 = i14;
                i15 = i17;
            }
            i14 = i16 + 2;
        }
        C5608e c5608e = new C5608e();
        while (true) {
            while (i10 < address.length) {
                if (i10 == i11) {
                    c5608e.m11954d1(58);
                    i10 += i15;
                    if (i10 == 16) {
                        c5608e.m11954d1(58);
                    }
                } else {
                    if (i10 > 0) {
                        c5608e.m11954d1(58);
                    }
                    byte b10 = address[i10];
                    byte[] bArr = C9347b.f48082a;
                    c5608e.m11961p1(((b10 & 255) << 8) | (address[i10 + 1] & 255));
                    i10 += 2;
                }
            }
            return c5608e.m11934I0();
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m376o(InterfaceC0500b interfaceC0500b, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(interfaceC0500b, "modifier");
        interfaceC0476a.mo1622c(-72882467);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        SpacerMeasurePolicy spacerMeasurePolicy = SpacerMeasurePolicy.f2415a;
        interfaceC0476a.mo1622c(-1323940314);
        InterfaceC10015c interfaceC10015c = (InterfaceC10015c) interfaceC0476a.mo1648p(CompositionLocalsKt.f4137e);
        LayoutDirection layoutDirection = (LayoutDirection) interfaceC0476a.mo1648p(CompositionLocalsKt.f4143k);
        InterfaceC0647n1 interfaceC0647n1 = (InterfaceC0647n1) interfaceC0476a.mo1648p(CompositionLocalsKt.f4148p);
        ComposeUiNode.f3726n.getClass();
        InterfaceC2041a<ComposeUiNode> interfaceC2041a = ComposeUiNode.Companion.f3728b;
        ComposableLambdaImpl composableLambdaImplM2036a = C0520a.m2036a(interfaceC0500b);
        if (!(interfaceC0476a.mo1646o() instanceof InterfaceC5299c)) {
            C8573r0.m16771y0();
            throw null;
        }
        interfaceC0476a.mo1640l();
        if (interfaceC0476a.mo1632h()) {
            interfaceC0476a.mo1634i(interfaceC2041a);
        } else {
            interfaceC0476a.mo1653s();
        }
        interfaceC0476a.mo1644n();
        C8573r0.m16714a1(interfaceC0476a, spacerMeasurePolicy, ComposeUiNode.Companion.f3731e);
        C8573r0.m16714a1(interfaceC0476a, interfaceC10015c, ComposeUiNode.Companion.f3730d);
        C8573r0.m16714a1(interfaceC0476a, layoutDirection, ComposeUiNode.Companion.f3732f);
        C8573r0.m16714a1(interfaceC0476a, interfaceC0647n1, ComposeUiNode.Companion.f3733g);
        interfaceC0476a.mo1626e();
        composableLambdaImplM2036a.mo1343M(new C5340u0(interfaceC0476a), interfaceC0476a, 0);
        interfaceC0476a.mo1622c(2058660585);
        interfaceC0476a.mo1661w();
        interfaceC0476a.mo1663x();
        interfaceC0476a.mo1661w();
        interfaceC0476a.mo1661w();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1] */
    /* JADX INFO: renamed from: o0 */
    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 m377o0(InterfaceC7133n interfaceC7133n, InterfaceC7116c interfaceC7116c, InterfaceC7116c interfaceC7116c2, final InterfaceC2058r interfaceC2058r) {
        final InterfaceC7116c[] interfaceC7116cArr = {interfaceC7133n, interfaceC7116c, interfaceC7116c2};
        return new InterfaceC7116c<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 */
            @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m19206f = "Zip.kt", m19207l = {333, 333}, m19208m = "invokeSuspend")
            public static final class C71062 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<Object>, Object[], InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f40189e;

                /* JADX INFO: renamed from: f */
                public /* synthetic */ InterfaceC7117d f40190f;

                /* JADX INFO: renamed from: g */
                public /* synthetic */ Object[] f40191g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ InterfaceC2058r f40192h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C71062(InterfaceC9968c interfaceC9968c, InterfaceC2058r interfaceC2058r) {
                    super(3, interfaceC9968c);
                    this.f40192h = interfaceC2058r;
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final Object mo1343M(InterfaceC7117d<Object> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    C71062 c71062 = new C71062(interfaceC9968c, this.f40192h);
                    c71062.f40190f = interfaceC7117d;
                    c71062.f40191g = objArr;
                    return c71062.mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    InterfaceC7117d interfaceC7117d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f40189e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            interfaceC7117d = this.f40190f;
                            C7499b.m14977z0(obj);
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C7499b.m14977z0(obj);
                        }
                        return C9072e.f47360a;
                    }
                    C7499b.m14977z0(obj);
                    interfaceC7117d = this.f40190f;
                    Object[] objArr = this.f40191g;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f40190f = interfaceC7117d;
                    this.f40189e = 1;
                    obj = this.f40192h.mo1851T(obj2, obj3, obj4, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    this.f40190f = null;
                    this.f40189e = 2;
                    if (interfaceC7117d.mo1339r(obj, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                Object objM14386a = C7127c.m14386a(interfaceC9968c, FlowKt__ZipKt$nullArrayFactory$1.f40241b, new C71062(null, interfaceC2058r), interfaceC7117d, interfaceC7116cArr);
                return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o1 */
    public static int m378o1(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        int i13 = -1;
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            byte b11 = bArr[i10];
            if (b10 <= -12) {
                i13 = b11 <= -65 ? b10 ^ (b11 << 8) : -1;
            }
            return i13;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i10];
        byte b13 = bArr[i10 + 1];
        if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
            return ((b12 << 8) ^ b10) ^ (b13 << 16);
        }
        return -1;
    }

    /* JADX INFO: renamed from: o2 */
    public static final C5238j0 m379o2(InterfaceC9077e interfaceC9077e) {
        C5207g.m11111f(interfaceC9077e, "<this>");
        if (interfaceC9077e.isEmpty()) {
            C5238j0.f33329b.getClass();
            return C5238j0.f33330c;
        }
        C5238j0.a aVar = C5238j0.f33329b;
        List listM17251q = C9000b.m17251q(new C5225d(interfaceC9077e));
        aVar.getClass();
        return C5238j0.a.m11272c(listM17251q);
    }

    /* JADX INFO: renamed from: p */
    public static C7851m1 m380p() {
        return new C7851m1(null);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2] */
    /* JADX INFO: renamed from: p0 */
    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 m381p0(InterfaceC7116c interfaceC7116c, InterfaceC7116c interfaceC7116c2, InterfaceC7116c interfaceC7116c3, InterfaceC7116c interfaceC7116c4, final InterfaceC2059s interfaceC2059s) {
        final InterfaceC7116c[] interfaceC7116cArr = {interfaceC7116c, interfaceC7116c2, interfaceC7116c3, interfaceC7116c4};
        return new InterfaceC7116c<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2 */
            @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", m19206f = "Zip.kt", m19207l = {333, 333}, m19208m = "invokeSuspend")
            public static final class C71072 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<Object>, Object[], InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f40195e;

                /* JADX INFO: renamed from: f */
                public /* synthetic */ InterfaceC7117d f40196f;

                /* JADX INFO: renamed from: g */
                public /* synthetic */ Object[] f40197g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ InterfaceC2059s f40198h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C71072(InterfaceC9968c interfaceC9968c, InterfaceC2059s interfaceC2059s) {
                    super(3, interfaceC9968c);
                    this.f40198h = interfaceC2059s;
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final Object mo1343M(InterfaceC7117d<Object> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    C71072 c71072 = new C71072(interfaceC9968c, this.f40198h);
                    c71072.f40196f = interfaceC7117d;
                    c71072.f40197g = objArr;
                    return c71072.mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    InterfaceC7117d interfaceC7117d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f40195e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            interfaceC7117d = this.f40196f;
                            C7499b.m14977z0(obj);
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C7499b.m14977z0(obj);
                        }
                    }
                    C7499b.m14977z0(obj);
                    interfaceC7117d = this.f40196f;
                    Object[] objArr = this.f40197g;
                    InterfaceC2059s interfaceC2059s = this.f40198h;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f40196f = interfaceC7117d;
                    this.f40195e = 1;
                    obj = interfaceC2059s.mo1501o0(obj2, obj3, obj4, obj5, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    this.f40196f = null;
                    this.f40195e = 2;
                    return interfaceC7117d.mo1339r(obj, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super Object> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                Object objM14386a = C7127c.m14386a(interfaceC9968c, FlowKt__ZipKt$nullArrayFactory$1.f40241b, new C71072(null, interfaceC2059s), interfaceC7117d, interfaceC7116cArr);
                return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
            }
        };
    }

    /* JADX INFO: renamed from: p1 */
    public static final AbstractC5262v0 m382p1(AbstractC5262v0 abstractC5262v0, AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5262v0, "<this>");
        C5207g.m11111f(abstractC5257t, "origin");
        return m247A2(abstractC5262v0, m346f1(abstractC5257t));
    }

    /* JADX INFO: renamed from: p2 */
    public static String m383p2(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: q */
    public static final long m384q(int i10, int i11) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
        if (i11 >= 0) {
            long j10 = (((long) i11) & 4294967295L) | (((long) i10) << 32);
            int i12 = C7217k.f40597c;
            return j10;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
    }

    /* JADX INFO: renamed from: q0 */
    public static final C7136q m385q0(InterfaceC7116c interfaceC7116c, InterfaceC7116c interfaceC7116c2, InterfaceC2058r interfaceC2058r) {
        return new C7136q(new C7110xd7c321e7(new InterfaceC7116c[]{interfaceC7116c, interfaceC7116c2}, null, interfaceC2058r));
    }

    /* JADX INFO: renamed from: q1 */
    public static int m386q1(float f3) {
        if (f3 < 1.0f) {
            return -16777216;
        }
        if (f3 > 99.0f) {
            return -1;
        }
        float f10 = (f3 + 16.0f) / 116.0f;
        float f11 = (f3 > 8.0f ? 1 : (f3 == 8.0f ? 0 : -1)) > 0 ? f10 * f10 * f10 : f3 / 903.2963f;
        float f12 = f10 * f10 * f10;
        boolean z10 = f12 > 0.008856452f;
        float f13 = z10 ? f12 : ((f10 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f12 = ((f10 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f150L;
        return C8169a.m16210b(f13 * fArr[0], f11 * fArr[1], f12 * fArr[2]);
    }

    /* JADX INFO: renamed from: q2 */
    public static final String m387q2(String str) {
        C5207g.m11111f(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "builder.toString()");
        return string;
    }

    /* JADX INFO: renamed from: r */
    public static final long m388r(float f3, float f10) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(f3) << 32);
        int i10 = C10025m.f50986c;
        return jFloatToIntBits;
    }

    /* JADX INFO: renamed from: r0 */
    public static final C7136q m389r0(InterfaceC7116c interfaceC7116c, InterfaceC7116c interfaceC7116c2, InterfaceC7116c interfaceC7116c3, InterfaceC2059s interfaceC2059s) {
        return new C7136q(new C7111xd7c321e8(new InterfaceC7116c[]{interfaceC7116c, interfaceC7116c2, interfaceC7116c3}, null, interfaceC2059s));
    }

    /* JADX INFO: renamed from: r1 */
    public static final boolean m390r1(float[] fArr, float[] fArr2) {
        C5207g.m11111f(fArr, "$this$invertTo");
        C5207g.m11111f(fArr2, "other");
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[9];
        float f19 = fArr[10];
        float f20 = fArr[11];
        float f21 = fArr[12];
        float f22 = fArr[13];
        float f23 = fArr[14];
        float f24 = fArr[15];
        float f25 = (f3 * f14) - (f10 * f13);
        float f26 = (f3 * f15) - (f11 * f13);
        float f27 = (f3 * f16) - (f12 * f13);
        float f28 = (f10 * f15) - (f11 * f14);
        float f29 = (f10 * f16) - (f12 * f14);
        float f30 = (f11 * f16) - (f12 * f15);
        float f31 = (f17 * f22) - (f18 * f21);
        float f32 = (f17 * f23) - (f19 * f21);
        float f33 = (f17 * f24) - (f20 * f21);
        float f34 = (f18 * f23) - (f19 * f22);
        float f35 = (f18 * f24) - (f20 * f22);
        float f36 = (f19 * f24) - (f20 * f23);
        float f37 = (f30 * f31) + (((f28 * f33) + ((f27 * f34) + ((f25 * f36) - (f26 * f35)))) - (f29 * f32));
        if (f37 == 0.0f) {
            return false;
        }
        float f38 = 1.0f / f37;
        fArr2[0] = ((f16 * f34) + ((f14 * f36) - (f15 * f35))) * f38;
        fArr2[1] = (((f11 * f35) + ((-f10) * f36)) - (f12 * f34)) * f38;
        fArr2[2] = ((f24 * f28) + ((f22 * f30) - (f23 * f29))) * f38;
        fArr2[3] = (((f19 * f29) + ((-f18) * f30)) - (f20 * f28)) * f38;
        float f39 = -f13;
        fArr2[4] = (((f15 * f33) + (f39 * f36)) - (f16 * f32)) * f38;
        fArr2[5] = ((f12 * f32) + ((f36 * f3) - (f11 * f33))) * f38;
        float f40 = -f21;
        fArr2[6] = (((f23 * f27) + (f40 * f30)) - (f24 * f26)) * f38;
        fArr2[7] = ((f20 * f26) + ((f30 * f17) - (f19 * f27))) * f38;
        fArr2[8] = ((f16 * f31) + ((f13 * f35) - (f14 * f33))) * f38;
        fArr2[9] = (((f33 * f10) + ((-f3) * f35)) - (f12 * f31)) * f38;
        fArr2[10] = ((f24 * f25) + ((f21 * f29) - (f22 * f27))) * f38;
        fArr2[11] = (((f27 * f18) + ((-f17) * f29)) - (f20 * f25)) * f38;
        fArr2[12] = (((f14 * f32) + (f39 * f34)) - (f15 * f31)) * f38;
        fArr2[13] = ((f11 * f31) + ((f3 * f34) - (f10 * f32))) * f38;
        fArr2[14] = (((f22 * f26) + (f40 * f28)) - (f23 * f25)) * f38;
        fArr2[15] = ((f19 * f25) + ((f17 * f28) - (f18 * f26))) * f38;
        return true;
    }

    /* JADX INFO: renamed from: r2 */
    public static final String m391r2(float f3) {
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f10 = f3 * fPow;
        int i10 = (int) f10;
        if (f10 - i10 >= 0.5f) {
            i10++;
        }
        float f11 = i10 / fPow;
        return iMax > 0 ? String.valueOf(f11) : String.valueOf((int) f11);
    }

    /* JADX INFO: renamed from: s */
    public static final int m392s(AbstractC6164s abstractC6164s, AbstractC5636a abstractC5636a) {
        int iM18625a;
        AbstractC6164s abstractC6164sMo2157L0 = abstractC6164s.mo2157L0();
        if (!(abstractC6164sMo2157L0 != null)) {
            throw new IllegalStateException(("Child of " + abstractC6164s + " cannot be null when calculating alignment line").toString());
        }
        if (abstractC6164s.mo2162P0().mo2040e().containsKey(abstractC5636a)) {
            Integer num = abstractC6164s.mo2162P0().mo2040e().get(abstractC5636a);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int iM12682K0 = abstractC6164sMo2157L0.m12682K0(abstractC5636a);
        if (iM12682K0 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        abstractC6164sMo2157L0.f35993e = true;
        abstractC6164s.f35994f = true;
        abstractC6164s.mo2165T0();
        abstractC6164sMo2157L0.f35993e = false;
        abstractC6164s.f35994f = false;
        if (abstractC5636a instanceof C5642f) {
            iM18625a = C10020h.m18625a(abstractC6164sMo2157L0.mo2164R0());
        } else {
            long jMo2164R0 = abstractC6164sMo2157L0.mo2164R0();
            int i10 = C10020h.f50974c;
            iM18625a = (int) (jMo2164R0 >> 32);
        }
        return iM18625a + iM12682K0;
    }

    /* JADX INFO: renamed from: s0 */
    public static final C7136q m393s0(StateFlowImpl stateFlowImpl, InterfaceC7116c interfaceC7116c, InterfaceC7116c interfaceC7116c2, InterfaceC7116c interfaceC7116c3, InterfaceC2060t interfaceC2060t) {
        return new C7136q(new C7112xd7c321e9(new InterfaceC7116c[]{stateFlowImpl, interfaceC7116c, interfaceC7116c2, interfaceC7116c3}, null, interfaceC2060t));
    }

    /* JADX INFO: renamed from: s1 */
    public static final boolean m394s1(CoroutineContext coroutineContext) {
        int i10 = InterfaceC7875v0.f42975B;
        InterfaceC7875v0 interfaceC7875v0 = (InterfaceC7875v0) coroutineContext.mo1474w(InterfaceC7875v0.b.f42976a);
        return interfaceC7875v0 != null && interfaceC7875v0.mo15547b();
    }

    /* JADX INFO: renamed from: s2 */
    public static String m395s2(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    /* JADX INFO: renamed from: t */
    public static final C7646c m396t(C7647d c7647d, String str) {
        C7646c c7646cM15229h = c7647d.m15223b(C7648e.m15232l(str)).m15229h();
        C5207g.m11110e(c7646cM15229h, "child(Name.identifier(name)).toSafe()");
        return c7646cM15229h;
    }

    /* JADX INFO: renamed from: t0 */
    public static final List m397t0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return EmptyList.f38032a;
        }
        if (size == 1) {
            return C9000b.m17251q(C6752c.m13423Q(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: renamed from: t1 */
    public static final boolean m398t1(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        if (interfaceC8834eMo11235q == null) {
            return false;
        }
        FunctionClassKind functionClassKindM349g1 = m349g1(interfaceC8834eMo11235q);
        return functionClassKindM349g1 == FunctionClassKind.Function || functionClassKindM349g1 == FunctionClassKind.SuspendFunction;
    }

    /* JADX INFO: renamed from: t2 */
    public static final ChannelFlowTransformLatest m399t2(InterfaceC7116c interfaceC7116c, InterfaceC2057q interfaceC2057q) {
        int i10 = C7130k.f40363a;
        return new ChannelFlowTransformLatest(interfaceC2057q, interfaceC7116c, EmptyCoroutineContext.f38093a, -2, BufferOverflow.SUSPEND);
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m400u(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: u0 */
    public static final int m401u0(long j10, long j11) {
        boolean zM414x1 = m414x1(j10);
        if (zM414x1 != m414x1(j11)) {
            return zM414x1 ? -1 : 1;
        }
        return (int) Math.signum(Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32)));
    }

    /* JADX INFO: renamed from: u1 */
    public static boolean m402u1(int i10) {
        return i10 != 0 && C8169a.m16213e(i10) > 0.5d;
    }

    /* JADX INFO: renamed from: u2 */
    public static final Class m403u2(ClassLoader classLoader, String str) {
        C5207g.m11111f(classLoader, "<this>");
        C5207g.m11111f(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static final int m404v(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* JADX INFO: renamed from: v0 */
    public static final C8915k m405v0(double d10) {
        return d10 < 0.0d ? new C8915k(0.0d, Math.sqrt(Math.abs(d10))) : new C8915k(Math.sqrt(d10), 0.0d);
    }

    /* JADX INFO: renamed from: v1 */
    public static final boolean m406v1(InterfaceC8866x interfaceC8866x, C7646c c7646c) {
        C5207g.m11111f(interfaceC8866x, "<this>");
        C5207g.m11111f(c7646c, "fqName");
        return interfaceC8866x instanceof InterfaceC8867y ? ((InterfaceC8867y) interfaceC8866x).mo13605a(c7646c) : m281J1(interfaceC8866x, c7646c).isEmpty();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: v2 */
    public static final ProtoBuf$Type m407v2(ProtoBuf$ValueParameter protoBuf$ValueParameter, C6735e c6735e) {
        C5207g.m11111f(c6735e, "typeTable");
        int i10 = protoBuf$ValueParameter.f39355c;
        boolean z10 = true;
        if ((i10 & 4) == 4) {
            ProtoBuf$Type protoBuf$Type = protoBuf$ValueParameter.f39358f;
            C5207g.m11110e(protoBuf$Type, "type");
            return protoBuf$Type;
        }
        if ((i10 & 8) != 8) {
            z10 = false;
        }
        if (z10) {
            return c6735e.m13355a(protoBuf$ValueParameter.f39359g);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m408w(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0;
    }

    /* JADX INFO: renamed from: w0 */
    public static final InterfaceC9077e m409w0(InterfaceC9077e interfaceC9077e, InterfaceC9077e interfaceC9077e2) {
        C5207g.m11111f(interfaceC9077e, "first");
        C5207g.m11111f(interfaceC9077e2, "second");
        if (interfaceC9077e.isEmpty()) {
            return interfaceC9077e2;
        }
        return interfaceC9077e2.isEmpty() ? interfaceC9077e : new CompositeAnnotations(interfaceC9077e, interfaceC9077e2);
    }

    /* JADX INFO: renamed from: w1 */
    public static final boolean m410w1(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        return abstractC5257t.mo11288a1() instanceof AbstractC5249p;
    }

    /* JADX INFO: renamed from: w2 */
    public static final C6526i m411w2(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new C6526i(i10, i11 - 1);
        }
        C6526i c6526i = C6526i.f37170d;
        return C6526i.f37170d;
    }

    /* JADX INFO: renamed from: x */
    public static final Object[] m412x(int i10, Object obj, Object obj2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length + 2];
        C9322j.m17675c0(objArr, objArr2, 0, 0, i10, 6);
        C9322j.m17673a0(i10 + 2, i10, objArr.length, objArr, objArr2);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: x0 */
    public static int m413x0(int i10, int i11) {
        return C8169a.m16216h(i10, (Color.alpha(i10) * i11) / 255);
    }

    /* JADX INFO: renamed from: x1 */
    public static final boolean m414x1(long j10) {
        return ((int) (j10 & 4294967295L)) != 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: x2 */
    public static final AbstractC5265x m415x2(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5249p) {
            return ((AbstractC5249p) abstractC5262v0Mo11288a1).f33341c;
        }
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5265x) {
            return (AbstractC5265x) abstractC5262v0Mo11288a1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m416y(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: y0 */
    public static final InterfaceC5852f m417y0(InterfaceC5852f interfaceC5852f, HashSet hashSet) {
        InterfaceC5852f interfaceC5852fM417y0;
        C5206f c5206f = C5206f.f33268c;
        InterfaceC5856j interfaceC5856jM11636l0 = InterfaceC5436a.a.m11636l0(c5206f, interfaceC5852f);
        if (!hashSet.add(interfaceC5856jM11636l0)) {
            return null;
        }
        InterfaceC8847k0 interfaceC8847k0M11654y = InterfaceC5436a.a.m11654y(interfaceC5856jM11636l0);
        if (interfaceC8847k0M11654y == null) {
            if (!InterfaceC5436a.a.m11600N(interfaceC5856jM11636l0)) {
                return interfaceC5852f;
            }
            AbstractC5265x abstractC5265xM11655z = InterfaceC5436a.a.m11655z(interfaceC5852f);
            if (abstractC5265xM11655z != null && (interfaceC5852fM417y0 = m417y0(abstractC5265xM11655z, hashSet)) != null) {
                if (InterfaceC5436a.a.m11605S(interfaceC5852f)) {
                    if (InterfaceC5436a.a.m11605S(interfaceC5852fM417y0)) {
                        return interfaceC5852f;
                    }
                    return ((interfaceC5852fM417y0 instanceof InterfaceC5853g) && InterfaceC5436a.a.m11606T((InterfaceC5853g) interfaceC5852fM417y0)) ? interfaceC5852f : c5206f.m11079h1(interfaceC5852fM417y0);
                }
            }
            return null;
        }
        InterfaceC5852f interfaceC5852fM11651v = InterfaceC5436a.a.m11651v(interfaceC8847k0M11654y);
        interfaceC5852fM417y0 = m417y0(interfaceC5852fM11651v, hashSet);
        if (interfaceC5852fM417y0 == null) {
            return null;
        }
        boolean z10 = InterfaceC5436a.a.m11600N(InterfaceC5436a.a.m11636l0(c5206f, interfaceC5852fM11651v)) || ((interfaceC5852fM11651v instanceof InterfaceC5853g) && InterfaceC5436a.a.m11606T((InterfaceC5853g) interfaceC5852fM11651v));
        if ((interfaceC5852fM417y0 instanceof InterfaceC5853g) && InterfaceC5436a.a.m11606T((InterfaceC5853g) interfaceC5852fM417y0) && InterfaceC5436a.a.m11605S(interfaceC5852f) && z10) {
            return c5206f.m11079h1(interfaceC5852fM11651v);
        }
        if (!InterfaceC5436a.a.m11605S(interfaceC5852fM417y0) && c5206f.m11067c1(interfaceC5852f)) {
            return c5206f.m11079h1(interfaceC5852fM417y0);
        }
        return interfaceC5852fM417y0;
    }

    /* JADX INFO: renamed from: y1 */
    public static final boolean m418y1(InterfaceC8829b0 interfaceC8829b0) {
        C5207g.m11111f(interfaceC8829b0, "<this>");
        return interfaceC8829b0.mo11888h() == null;
    }

    /* JADX INFO: renamed from: y2 */
    public static void m419y2(AbstractC6095b abstractC6095b, int i10, int i11, int i12) {
        if (i10 < i11 || i10 > i12) {
            throw new IllegalFieldValueException(abstractC6095b.mo12585w(), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
    }

    /* JADX INFO: renamed from: z */
    public static final int m420z(ArrayList arrayList, int i10, int i11) {
        int iM323X1 = m323X1(arrayList, i10, i11);
        return iM323X1 >= 0 ? iM323X1 : -(iM323X1 + 1);
    }

    /* JADX INFO: renamed from: z0 */
    public static final long m421z0(int i10, long j10) {
        int i11 = C7217k.f40597c;
        int i12 = (int) (j10 >> 32);
        int iM361k0 = m361k0(i12, 0, i10);
        int iM361k1 = m361k0(C7217k.m14539a(j10), 0, i10);
        if (iM361k0 == i12 && iM361k1 == C7217k.m14539a(j10)) {
            return j10;
        }
        return m384q(iM361k0, iM361k1);
    }

    /* JADX INFO: renamed from: z1 */
    public static final boolean m422z1(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        return (interfaceC8834eMo11235q != null ? m349g1(interfaceC8834eMo11235q) : null) == FunctionClassKind.SuspendFunction;
    }

    /* JADX INFO: renamed from: z2 */
    public static final AbstractC5265x m423z2(AbstractC5265x abstractC5265x, AbstractC5265x abstractC5265x2) {
        C5207g.m11111f(abstractC5265x, "<this>");
        C5207g.m11111f(abstractC5265x2, "abbreviatedType");
        return C7499b.m14926X(abstractC5265x) ? abstractC5265x : new C5219a(abstractC5265x, abstractC5265x2);
    }

    @Override // p176ib.InterfaceC6270h
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Object mo424a(InterfaceC5740d interfaceC5740d) {
        return null;
    }

    @Override // p110f6.InterfaceC5471b
    /* JADX INFO: renamed from: b */
    public InterfaceC9207m mo65b(InterfaceC9207m interfaceC9207m, C8735e c8735e) {
        return interfaceC9207m;
    }

    @Override // ga.InterfaceC5731n
    /* JADX INFO: renamed from: c */
    public void mo425c() {
    }

    @Override // ga.InterfaceC5731n
    /* JADX INFO: renamed from: d */
    public int mo426d(long j10) {
        return 0;
    }

    @Override // ga.InterfaceC5731n
    /* JADX INFO: renamed from: e */
    public boolean mo427e() {
        return true;
    }

    @Override // p136gc.InterfaceC5750f
    /* JADX INFO: renamed from: f */
    public AbstractC5751g mo428f(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i10 = C5486b.f34071h;
        return bundle != null && bundle.containsKey("google.messenger") ? Tasks.m8539c(null) : Tasks.m8539c(bundle);
    }

    @Override // p328q1.InterfaceC8480q
    /* JADX INFO: renamed from: g */
    public Typeface mo429g(C8477n c8477n, C8476m c8476m, int i10) {
        String strConcat;
        C5207g.m11111f(c8477n, "name");
        C5207g.m11111f(c8476m, "fontWeight");
        String str = c8477n.f45656c;
        C5207g.m11111f(str, "name");
        int i11 = c8476m.f45655a / 100;
        boolean z10 = false;
        if (i11 >= 0 && i11 < 2) {
            strConcat = str.concat("-thin");
        } else {
            if (2 <= i11 && i11 < 4) {
                strConcat = str.concat("-light");
            } else {
                if (i11 != 4) {
                    if (i11 == 5) {
                        strConcat = str.concat("-medium");
                    } else {
                        if (!(6 <= i11 && i11 < 8)) {
                            if (8 <= i11 && i11 < 11) {
                                strConcat = str.concat("-black");
                            }
                        }
                    }
                }
                strConcat = str;
            }
        }
        Typeface typefaceM253C0 = null;
        if (!(strConcat.length() == 0)) {
            Typeface typefaceM253C1 = m253C0(strConcat, c8476m, i10);
            if (!C5207g.m11106a(typefaceM253C1, Typeface.create(Typeface.DEFAULT, m319W0(c8476m, i10))) && !C5207g.m11106a(typefaceM253C1, m253C0(null, c8476m, i10))) {
                z10 = true;
            }
            if (z10) {
                typefaceM253C0 = typefaceM253C1;
            }
        }
        if (typefaceM253C0 == null) {
            typefaceM253C0 = m253C0(str, c8476m, i10);
        }
        return typefaceM253C0;
    }

    @Override // ga.InterfaceC5731n
    /* JADX INFO: renamed from: h */
    public int mo430h(C7968m c7968m, DecoderInputBuffer decoderInputBuffer, int i10) {
        decoderInputBuffer.f37591a = 4;
        return -4;
    }

    @Override // p122fl.InterfaceC5586i
    /* JADX INFO: renamed from: i */
    public boolean mo431i() {
        return false;
    }

    @Override // p328q1.InterfaceC8480q
    /* JADX INFO: renamed from: j */
    public Typeface mo432j(C8476m c8476m, int i10) {
        C5207g.m11111f(c8476m, "fontWeight");
        return m253C0(null, c8476m, i10);
    }

    @Override // cc.InterfaceC1967w2
    public Object zza() {
        List list = C1985y2.f10339a;
        return Long.valueOf(C2592a9.f14056b.zza().mo7714b());
    }
}
