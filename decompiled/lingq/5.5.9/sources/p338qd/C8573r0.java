package p338qd;

import ae.C0062b;
import af.InterfaceC0070c;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.activity.InterfaceC0209s;
import androidx.compose.animation.core.C0369a;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.graphics.C0512a;
import androidx.compose.p017ui.input.pointer.util.C0519a;
import androidx.compose.p017ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.core.view.C0782a;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l;
import androidx.fragment.app.Fragment;
import androidx.navigation.C1084b;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import androidx.view.AbstractC1036h0;
import androidx.view.C1027d;
import androidx.view.C1038i0;
import androidx.view.InterfaceC1048n0;
import bj.C1603z;
import cc.C1843i4;
import cc.C1985y2;
import cc.InterfaceC1793d;
import cc.InterfaceC1967w2;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.manager.InterfaceC2151g;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.internal.measurement.C2592a9;
import com.lingq.entity.LibraryCounter;
import com.lingq.entity.Translation;
import com.lingq.entity.TranslationSentence;
import com.lingq.shared.network.result.ResultLibraryCounter;
import com.lingq.shared.network.result.ResultTranslation;
import com.lingq.shared.network.result.ResultTranslationSentence;
import com.linguist.R;
import dm.C5206f;
import dm.C5207g;
import dm.C5212l;
import fo.C5602h;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh.C6688o;
import km.InterfaceC6719b;
import kotlin.Pair;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlinx.coroutines.C7079a;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.C7151a;
import kotlinx.coroutines.internal.C7156f;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.C7178b;
import mn.C7645b;
import mn.C7646c;
import mn.C7647d;
import mo.C7661i;
import no.AbstractC7826e0;
import no.AbstractC7847l0;
import no.C7832g0;
import no.C7851m1;
import no.C7857o1;
import no.C7863q1;
import no.C7869s1;
import no.InterfaceC7878x;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p022b1.C1288a;
import p023b2.C1292a;
import p026b5.AbstractC1314g;
import p040c4.C1688m;
import p041c5.C1698a;
import p041c5.C1726x;
import p060d1.C5018e;
import p060d1.C5028o;
import p062d3.C5042b;
import p062d3.InterfaceC5041a;
import p080e.C5288t;
import p081e0.C5295a1;
import p081e0.C5298b1;
import p081e0.C5310f1;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p081e0.InterfaceC5350z0;
import p082e1.C5351a;
import p082e1.C5352b;
import p087e6.C5374c;
import p088e7.C5383c;
import p105f0.C5458f;
import p124fp.C5608e;
import p127g1.C5637a0;
import p142h1.C5877h;
import p148h7.C5899b;
import p148h7.InterfaceC5898a;
import p166i1.InterfaceC6154k0;
import p176ib.C6272i;
import p231l1.C7208b;
import p232l2.C7227f;
import p232l2.C7228g;
import p234l4.InterfaceC7251a;
import p249lo.C7416i;
import p258m6.C7481a;
import p260m8.C7499b;
import p288o4.InterfaceC7919e;
import p290o6.C7951d0;
import p290o6.C7967l0;
import p290o6.C7968m;
import p302oi.C8056g;
import p325po.C8427c;
import p325po.C8433i;
import p325po.C8434j;
import p325po.C8440p;
import p325po.InterfaceC8428d;
import p328q1.C8475l;
import p328q1.C8476m;
import p328q1.C8481r;
import p328q1.InterfaceC8474k;
import p347qm.C8646c;
import p349qo.C8656b;
import p356r5.C8735e;
import p356r5.InterfaceC8737g;
import p372rm.InterfaceC8830c;
import p374s.AbstractC8911i;
import p374s.C8904e0;
import p374s.C8927q;
import p374s.C8936x;
import p374s.InterfaceC8925p;
import p375s0.C8939a;
import p375s0.C8941c;
import p375s0.C8944f;
import p385sf.C9000b;
import p387t0.C9151j;
import p387t0.InterfaceC9154k0;
import p392t5.InterfaceC9207m;
import p446w2.C9804b;
import p450w6.C9818e;
import p450w6.InterfaceC9814a;
import p454wa.InterfaceC9882g;
import p457wd.InterfaceC9900a;
import p464wl.InterfaceC9968c;
import p468x.C9993a;
import p470x1.C10016d;
import p470x1.C10020h;
import p470x1.C10022j;
import p470x1.C10023k;
import p470x1.C10024l;
import p479xa.C10151t;
import p541zn.InterfaceC10549m;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import pf.C8241d;
import pf.InterfaceC8240c;
import pn.C8413d;
import sl.C9072e;
import sl.InterfaceC9070c;
import tl.C9322j;
import tl.C9325m;

/* JADX INFO: renamed from: qd.r0 */
/* JADX INFO: loaded from: classes.dex */
public class C8573r0 implements InterfaceC0070c, InterfaceC7251a, InterfaceC1793d, InterfaceC1967w2, InterfaceC10549m, InterfaceC8737g, InterfaceC2151g, InterfaceC5898a, InterfaceC8240c, InterfaceC9900a {

    /* JADX INFO: renamed from: a */
    public static C8540g0 f45964a;

    /* JADX INFO: renamed from: h */
    public static C8573r0 f45971h;

    /* JADX INFO: renamed from: i */
    public static C8573r0 f45972i;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C8573r0 f45965b = new C8573r0();

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C8573r0 f45966c = new C8573r0();

    /* JADX INFO: renamed from: d */
    public static final String[] f45967d = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* JADX INFO: renamed from: e */
    public static final String[] f45968e = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* JADX INFO: renamed from: f */
    public static final Object[] f45969f = new Object[0];

    /* JADX INFO: renamed from: g */
    public static final C8573r0 f45970g = new C8573r0();

    /* JADX INFO: renamed from: j */
    public static final C7168r f45973j = new C7168r("CONDITION_FALSE");

    /* JADX INFO: renamed from: k */
    public static final C7168r f45974k = new C7168r("LIST_EMPTY");

    /* JADX INFO: renamed from: l */
    public static final C7168r f45975l = new C7168r("EMPTY");

    /* JADX INFO: renamed from: H */
    public static final C7168r f45956H = new C7168r("OFFER_SUCCESS");

    /* JADX INFO: renamed from: I */
    public static final C7168r f45957I = new C7168r("OFFER_FAILED");

    /* JADX INFO: renamed from: J */
    public static final C7168r f45958J = new C7168r("POLL_FAILED");

    /* JADX INFO: renamed from: K */
    public static final C7168r f45959K = new C7168r("ENQUEUE_FAILED");

    /* JADX INFO: renamed from: L */
    public static final C7168r f45960L = new C7168r("ON_CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ C8573r0 f45961M = new C8573r0();

    /* JADX INFO: renamed from: N */
    public static final C8564o0 f45962N = new C8564o0(1);

    /* JADX INFO: renamed from: O */
    public static final C8573r0 f45963O = new C8573r0();

    public /* synthetic */ C8573r0() {
    }

    public /* synthetic */ C8573r0(int i10) {
    }

    public /* synthetic */ C8573r0(Object obj) {
    }

    /* JADX INFO: renamed from: A */
    public static C8056g m16661A() {
        return new C8056g(null, 0);
    }

    /* JADX INFO: renamed from: A0 */
    public static boolean m16662A0(String str) {
        return str == null || str.trim().isEmpty();
    }

    /* JADX INFO: renamed from: B */
    public static C6688o m16663B(int i10, String str, boolean z10, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        C5207g.m11111f(str, "itemURL");
        return new C6688o(str, i10, z10, z11);
    }

    /* JADX INFO: renamed from: B0 */
    public static final boolean m16664B0(C5028o c5028o, long j10) {
        C5207g.m11111f(c5028o, "$this$isOutOfBounds");
        long j11 = c5028o.f32837c;
        float fM17164c = C8941c.m17164c(j11);
        float fM17165d = C8941c.m17165d(j11);
        int i10 = (int) (j10 >> 32);
        int iM18628b = C10022j.m18628b(j10);
        if (fM17164c >= 0.0f && fM17164c <= i10 && fM17165d >= 0.0f) {
            if (fM17165d <= iM18628b) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public static final void m16665C(C0519a c0519a, C5028o c5028o) {
        C5207g.m11111f(c0519a, "<this>");
        C5207g.m11111f(c5028o, "event");
        boolean zM16675H = m16675H(c5028o);
        int i10 = 0;
        VelocityTracker1D velocityTracker1D = c0519a.f3657b;
        VelocityTracker1D velocityTracker1D2 = c0519a.f3656a;
        long j10 = c5028o.f32837c;
        if (zM16675H) {
            c0519a.f3658c = j10;
            C9322j.m17679g0(velocityTracker1D2.f3653d, null);
            velocityTracker1D2.f3654e = 0;
            C9322j.m17679g0(velocityTracker1D.f3653d, null);
            velocityTracker1D.f3654e = 0;
        }
        List list = c5028o.f32845k;
        if (list == null) {
            list = EmptyList.f38032a;
        }
        int size = list.size();
        long j11 = c5028o.f32840f;
        while (i10 < size) {
            C5018e c5018e = (C5018e) list.get(i10);
            long jM17167f = C8941c.m17167f(c0519a.f3658c, C8941c.m17166e(c5018e.f32811b, j11));
            c0519a.f3658c = jM17167f;
            float fM17164c = C8941c.m17164c(jM17167f);
            int i11 = (velocityTracker1D2.f3654e + 1) % 20;
            velocityTracker1D2.f3654e = i11;
            C5351a[] c5351aArr = velocityTracker1D2.f3653d;
            C5351a c5351a = c5351aArr[i11];
            List list2 = list;
            long j12 = c5018e.f32810a;
            if (c5351a == null) {
                c5351aArr[i11] = new C5351a(fM17164c, j12);
            } else {
                c5351a.f33654a = j12;
                c5351a.f33655b = fM17164c;
            }
            float fM17165d = C8941c.m17165d(jM17167f);
            int i12 = (velocityTracker1D.f3654e + 1) % 20;
            velocityTracker1D.f3654e = i12;
            C5351a[] c5351aArr2 = velocityTracker1D.f3653d;
            C5351a c5351a2 = c5351aArr2[i12];
            if (c5351a2 == null) {
                c5351aArr2[i12] = new C5351a(fM17165d, j12);
            } else {
                c5351a2.f33654a = j12;
                c5351a2.f33655b = fM17165d;
            }
            i10++;
            j11 = c5018e.f32811b;
            list = list2;
        }
        long jM17167f2 = C8941c.m17167f(c0519a.f3658c, C8941c.m17166e(j10, j11));
        c0519a.f3658c = jM17167f2;
        float fM17164c2 = C8941c.m17164c(jM17167f2);
        int i13 = (velocityTracker1D2.f3654e + 1) % 20;
        velocityTracker1D2.f3654e = i13;
        C5351a[] c5351aArr3 = velocityTracker1D2.f3653d;
        C5351a c5351a3 = c5351aArr3[i13];
        long j13 = c5028o.f32836b;
        if (c5351a3 == null) {
            c5351aArr3[i13] = new C5351a(fM17164c2, j13);
        } else {
            c5351a3.f33654a = j13;
            c5351a3.f33655b = fM17164c2;
        }
        float fM17165d2 = C8941c.m17165d(jM17167f2);
        int i14 = (velocityTracker1D.f3654e + 1) % 20;
        velocityTracker1D.f3654e = i14;
        C5351a[] c5351aArr4 = velocityTracker1D.f3653d;
        C5351a c5351a4 = c5351aArr4[i14];
        if (c5351a4 == null) {
            c5351aArr4[i14] = new C5351a(fM17165d2, j13);
        } else {
            c5351a4.f33654a = j13;
            c5351a4.f33655b = fM17165d2;
        }
    }

    /* JADX INFO: renamed from: C0 */
    public static final boolean m16666C0(C5028o c5028o, long j10, long j11) {
        C5207g.m11111f(c5028o, "$this$isOutOfBounds");
        if (!(c5028o.f32842h == 1)) {
            return m16664B0(c5028o, j10);
        }
        long j12 = c5028o.f32837c;
        float fM17164c = C8941c.m17164c(j12);
        float fM17165d = C8941c.m17165d(j12);
        float f3 = -C8944f.m17177d(j11);
        float fM17177d = C8944f.m17177d(j11) + ((int) (j10 >> 32));
        float f10 = -C8944f.m17175b(j11);
        float fM17175b = C8944f.m17175b(j11) + C10022j.m18628b(j10);
        if (fM17164c >= f3 && fM17164c <= fM17177d && fM17165d >= f10 && fM17165d <= fM17175b) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public static String m16667D(String str, int i10, int i11) {
        if (i10 < 0) {
            return C0062b.m254C1("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C0062b.m254C1("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: D0 */
    public static final boolean m16668D0(C5608e c5608e) {
        C5207g.m11111f(c5608e, "<this>");
        try {
            C5608e c5608e2 = new C5608e();
            long j10 = c5608e.f34435b;
            c5608e.m11928E(c5608e2, 0L, j10 > 64 ? 64L : j10);
            int i10 = 0;
            while (i10 < 16) {
                i10++;
                if (c5608e2.mo11936L()) {
                    break;
                }
                int iM11941P0 = c5608e2.m11941P0();
                if (Character.isISOControl(iM11941P0) && !Character.isWhitespace(iM11941P0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: E */
    public static ArrayList m16669E(byte[] bArr) {
        long j10 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX INFO: renamed from: E0 */
    public static final boolean m16670E0(long j10) {
        C10024l[] c10024lArr = C10023k.f50981b;
        return (j10 & 1095216660480L) == 0;
    }

    /* JADX INFO: renamed from: F */
    public static void m16671F(Object obj, StringBuilder sb2) {
        int iLastIndexOf;
        if (obj == null) {
            sb2.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    /* JADX INFO: renamed from: F0 */
    public static void m16672F0(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    /* JADX INFO: renamed from: G */
    public static final void m16673G(View view) {
        C5207g.m11111f(view, "<this>");
        Iterator<Object> it = C0782a.m2980b(view).iterator();
        while (true) {
            C7416i c7416i = (C7416i) it;
            if (!c7416i.hasNext()) {
                return;
            }
            ArrayList<InterfaceC5041a> arrayList = m16756s0((View) c7416i.next()).f32873a;
            for (int iM17249o = C9000b.m17249o(arrayList); -1 < iM17249o; iM17249o--) {
                arrayList.get(iM17249o).mo2423a();
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static void m16674G0(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m16675H(C5028o c5028o) {
        C5207g.m11111f(c5028o, "<this>");
        return !c5028o.f32841g && c5028o.f32838d;
    }

    /* JADX INFO: renamed from: H0 */
    public static InterfaceC8830c m16676H0(C8573r0 c8573r0, C7646c c7646c, AbstractC6795c abstractC6795c) {
        c8573r0.getClass();
        C5207g.m11111f(abstractC6795c, "builtIns");
        String str = C8646c.f46201a;
        C7645b c7645bM16868f = C8646c.m16868f(c7646c);
        if (c7645bM16868f != null) {
            return abstractC6795c.m13553j(c7645bM16868f.m15204b());
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m16677I(C5028o c5028o) {
        C5207g.m11111f(c5028o, "<this>");
        return c5028o.f32841g && !c5028o.f32838d;
    }

    /* JADX INFO: renamed from: I0 */
    public static final void m16678I0(Context context) {
        Map mapM14943h0;
        C5207g.m11111f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        C5207g.m11110e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            AbstractC1314g.m4867d().mo4869a(C1726x.f9566a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            C5207g.m11110e(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(C1698a.f9471a.m5429a(context), "androidx.work.workdb");
            String[] strArr = C1726x.f9567b;
            int iM14941g0 = C7499b.m14941g0(strArr.length);
            if (iM14941g0 < 16) {
                iM14941g0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            Pair pair = new Pair(databasePath2, file);
            if (linkedHashMap.isEmpty()) {
                mapM14943h0 = C7499b.m14943h0(pair);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                mapM14943h0 = linkedHashMap2;
            }
            for (Map.Entry entry : mapM14943h0.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        AbstractC1314g.m4867d().mo4873g(C1726x.f9566a, "Over-writing contents of " + file3);
                    }
                    AbstractC1314g.m4867d().mo4869a(C1726x.f9566a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m16679J(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static final C5877h m16680J0(InterfaceC2041a interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "defaultFactory");
        return new C5877h(interfaceC2041a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: K */
    public static void m16681K(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static final ParcelableSnapshotMutableState m16682K0(Object obj, InterfaceC5350z0 interfaceC5350z0) {
        C5207g.m11111f(interfaceC5350z0, "policy");
        int i10 = ActualAndroid_androidKt.f2870a;
        return new ParcelableSnapshotMutableState(obj, interfaceC5350z0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: L */
    public static void m16683L(int i10, int i11) {
        String strM254C1;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM254C1 = C0062b.m254C1("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    StringBuilder sb2 = new StringBuilder(26);
                    sb2.append("negative size: ");
                    sb2.append(i11);
                    throw new IllegalArgumentException(sb2.toString());
                }
                strM254C1 = C0062b.m254C1("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM254C1);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ ParcelableSnapshotMutableState m16684L0(Object obj) {
        return m16682K0(obj, C5310f1.f33583a);
    }

    /* JADX INFO: renamed from: M */
    public static void m16685M(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public static final AbstractC8911i m16686M0(AbstractC8911i abstractC8911i) {
        C5207g.m11111f(abstractC8911i, "<this>");
        AbstractC8911i abstractC8911iMo17137c = abstractC8911i.mo17137c();
        C5207g.m11109d(abstractC8911iMo17137c, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return abstractC8911iMo17137c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public static void m16687N(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m16667D("index", i10, i11));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N0 */
    public static final void m16688N0(InterfaceC2041a interfaceC2041a, InterfaceC2052l interfaceC2052l, InterfaceC2052l interfaceC2052l2) {
        C5298b1 c5298b1 = C5295a1.f33567a;
        C5207g.m11111f(interfaceC2052l, "start");
        C5207g.m11111f(interfaceC2052l2, "done");
        C5298b1 c5298b2 = C5295a1.f33568b;
        C5458f c5458f = (C5458f) c5298b2.m11437d();
        if (c5458f == null) {
            c5458f = new C5458f(new Pair[16]);
            c5298b2.m11439h(c5458f);
        }
        try {
            c5458f.m11687b(new Pair(interfaceC2052l, interfaceC2052l2));
            interfaceC2041a.mo807E();
            int i10 = c5458f.f34019c - 1;
        } finally {
            c5458f.m11697n(c5458f.f34019c - 1);
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m16689O(int i10, int i11, int i12) {
        String strM16667D;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM16667D = m16667D("start index", i10, i12);
            } else {
                strM16667D = (i11 < 0 || i11 > i12) ? m16667D("end index", i11, i12) : C0062b.m254C1("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM16667D);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public static final long m16690O0(float f3, long j10) {
        long jFloatToIntBits = j10 | (((long) Float.floatToIntBits(f3)) & 4294967295L);
        C10024l[] c10024lArr = C10023k.f50981b;
        return jFloatToIntBits;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX INFO: renamed from: P */
    public static int m16691P(Context context, String str) {
        int iMyUid;
        boolean z10;
        int iM14555c;
        int i10;
        int iMyPid = Process.myPid();
        int iMyUid2 = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid2) == -1) {
            return -1;
        }
        String strM14556d = C7227f.m14556d(str);
        if (strM14556d != null) {
            if (packageName != null) {
                iMyUid = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid == iMyUid2 || !C9804b.m18286a(packageName2, packageName)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10 && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManagerM14559c = C7228g.m14559c(context);
                    iM14555c = C7228g.m14557a(appOpsManagerM14559c, strM14556d, Binder.getCallingUid(), packageName);
                    if (iM14555c == 0) {
                        iM14555c = C7228g.m14557a(appOpsManagerM14559c, strM14556d, iMyUid2, C7228g.m14558b(context));
                    }
                }
                i10 = iM14555c != 0 ? -2 : -1;
            } else {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid2);
                if (packagesForUid != null) {
                    if (packagesForUid.length <= 0) {
                        return -1;
                    }
                    packageName = packagesForUid[0];
                    iMyUid = Process.myUid();
                    String packageName3 = context.getPackageName();
                    if (iMyUid == iMyUid2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    iM14555c = !z10 ? C7227f.m14555c((AppOpsManager) C7227f.m14553a(context, AppOpsManager.class), strM14556d, packageName) : C7227f.m14555c((AppOpsManager) C7227f.m14553a(context, AppOpsManager.class), strM14556d, packageName);
                    if (iM14555c != 0) {
                    }
                }
            }
            return i10;
        }
        return 0;
    }

    /* JADX INFO: renamed from: P0 */
    public static final Object m16692P0(Object obj, LockFreeLinkedListNode lockFreeLinkedListNode) {
        if (obj == null) {
            return lockFreeLinkedListNode;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(lockFreeLinkedListNode);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(lockFreeLinkedListNode);
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: Q */
    public static void m16693Q(Object obj, String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(C0062b.m254C1(str, obj));
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static final ArrayList m16694Q0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalArgumentException("x and y must be the same length");
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        int size = 2 >= arrayList.size() ? arrayList.size() - 1 : 2;
        ArrayList arrayList3 = new ArrayList(3);
        for (int i10 = 0; i10 < 3; i10++) {
            arrayList3.add(Float.valueOf(0.0f));
        }
        int size2 = arrayList.size();
        int i11 = size + 1;
        C5288t c5288t = new C5288t(i11, size2);
        for (int i12 = 0; i12 < size2; i12++) {
            c5288t.m11408g(1.0f, 0, i12);
            for (int i13 = 1; i13 < i11; i13++) {
                c5288t.m11408g(((Number) arrayList.get(i12)).floatValue() * c5288t.m11404c(i13 - 1, i12), i13, i12);
            }
        }
        C5288t c5288t2 = new C5288t(i11, size2);
        C5288t c5288t3 = new C5288t(i11, i11);
        int i14 = 0;
        while (i14 < i11) {
            for (int i15 = 0; i15 < size2; i15++) {
                c5288t2.m11408g(c5288t.m11404c(i14, i15), i14, i15);
            }
            for (int i16 = 0; i16 < i14; i16++) {
                float fM11476a = c5288t2.m11405d(i14).m11476a(c5288t2.m11405d(i16));
                for (int i17 = 0; i17 < size2; i17++) {
                    c5288t2.m11408g(c5288t2.m11404c(i14, i17) - (c5288t2.m11404c(i16, i17) * fM11476a), i14, i17);
                }
            }
            C5352b c5352bM11405d = c5288t2.m11405d(i14);
            float fSqrt = (float) Math.sqrt(c5352bM11405d.m11476a(c5352bM11405d));
            if (fSqrt < 1.0E-6d) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f3 = 1.0f / fSqrt;
            for (int i18 = 0; i18 < size2; i18++) {
                c5288t2.m11408g(c5288t2.m11404c(i14, i18) * f3, i14, i18);
            }
            int i19 = 0;
            while (i19 < i11) {
                c5288t3.m11408g(i19 < i14 ? 0.0f : c5288t2.m11405d(i14).m11476a(c5288t.m11405d(i19)), i14, i19);
                i19++;
            }
            i14++;
        }
        C5352b c5352b = new C5352b(size2, 0);
        for (int i20 = 0; i20 < size2; i20++) {
            ((Float[]) c5352b.f33657b)[i20] = Float.valueOf(((Number) arrayList2.get(i20)).floatValue() * 1.0f);
        }
        int i21 = i11 - 1;
        for (int i22 = i21; -1 < i22; i22--) {
            arrayList3.set(i22, Float.valueOf(c5288t2.m11405d(i22).m11476a(c5352b)));
            int i23 = i22 + 1;
            if (i23 <= i21) {
                int i24 = i21;
                while (true) {
                    arrayList3.set(i22, Float.valueOf(((Number) arrayList3.get(i22)).floatValue() - (((Number) arrayList3.get(i24)).floatValue() * c5288t3.m11404c(i22, i24))));
                    if (i24 != i23) {
                        i24--;
                    }
                }
            }
            arrayList3.set(i22, Float.valueOf(((Number) arrayList3.get(i22)).floatValue() / c5288t3.m11404c(i22, i22)));
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: R */
    public static void m16695R(String str, int i10, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(C0062b.m254C1(str, Integer.valueOf(i10)));
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static final long m16696R0(C5028o c5028o, boolean z10) {
        long jM17166e = C8941c.m17166e(c5028o.f32837c, c5028o.f32840f);
        if (z10 || !c5028o.m10714b()) {
            return jM17166e;
        }
        int i10 = C8941c.f46891e;
        return C8941c.f46888b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: S */
    public static void m16697S(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static final Cursor m16698S0(RoomDatabase roomDatabase, InterfaceC7919e interfaceC7919e) {
        C5207g.m11111f(roomDatabase, "db");
        C5207g.m11111f(interfaceC7919e, "sqLiteQuery");
        return roomDatabase.m4566q(interfaceC7919e, null);
    }

    /* JADX INFO: renamed from: T */
    public static int m16699T(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    /* JADX INFO: renamed from: T0 */
    public static long m16700T0(int i10, int i11, C10151t c10151t) {
        c10151t.m19124E(i10);
        if (c10151t.f51440c - c10151t.f51439b < 5) {
            return -9223372036854775807L;
        }
        int iM19129d = c10151t.m19129d();
        if ((8388608 & iM19129d) != 0 || ((2096896 & iM19129d) >> 8) != i11) {
            return -9223372036854775807L;
        }
        if (((iM19129d & 32) != 0) && c10151t.m19145t() >= 7 && c10151t.f51440c - c10151t.f51439b >= 7) {
            if ((c10151t.m19145t() & 16) == 16) {
                byte[] bArr = new byte[6];
                c10151t.m19127b(bArr, 0, 6);
                return ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: U */
    public static final InterfaceC0500b m16701U(InterfaceC0500b interfaceC0500b, InterfaceC9154k0 interfaceC9154k0) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        C5207g.m11111f(interfaceC9154k0, "shape");
        return C0512a.m2001b(interfaceC0500b, 0.0f, interfaceC9154k0, true, 124927);
    }

    /* JADX INFO: renamed from: U0 */
    public static final C9993a m16702U0(InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(-1031410916);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        View view = (View) interfaceC0476a.mo1648p(AndroidCompositionLocals_androidKt.f4088f);
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y = interfaceC0476a.mo1665y(view);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
            objMo1624d = new C9993a(view);
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        C9993a c9993a = (C9993a) objMo1624d;
        interfaceC0476a.mo1661w();
        return c9993a;
    }

    /* JADX INFO: renamed from: V */
    public static final InterfaceC0500b m16703V(InterfaceC0500b interfaceC0500b) {
        C5207g.m11111f(interfaceC0500b, "<this>");
        return C0512a.m2001b(interfaceC0500b, 0.0f, null, true, 126975);
    }

    /* JADX INFO: renamed from: V0 */
    public static final InterfaceC5312g0 m16704V0(Object obj, InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(-1058319986);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(-492369756);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (objMo1624d == InterfaceC0476a.a.f3122a) {
            objMo1624d = m16684L0(obj);
            interfaceC0476a.mo1655t(objMo1624d);
        }
        interfaceC0476a.mo1661w();
        InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objMo1624d;
        interfaceC5312g0.setValue(obj);
        interfaceC0476a.mo1661w();
        return interfaceC5312g0;
    }

    /* JADX INFO: renamed from: W */
    public static void m16705W(InterfaceC9882g interfaceC9882g) {
        if (interfaceC9882g != null) {
            try {
                interfaceC9882g.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: W0 */
    public static final void m16706W0(AbstractC7826e0 abstractC7826e0, InterfaceC9968c interfaceC9968c, boolean z10) {
        Object objMo14442i = abstractC7826e0.mo14442i();
        Throwable thMo15563f = abstractC7826e0.mo15563f(objMo14442i);
        Object objM14967u = thMo15563f != null ? C7499b.m14967u(thMo15563f) : abstractC7826e0.mo15564g(objMo14442i);
        if (!z10) {
            interfaceC9968c.mo2031y(objM14967u);
            return;
        }
        C7156f c7156f = (C7156f) interfaceC9968c;
        InterfaceC9968c<T> interfaceC9968c2 = c7156f.f40421e;
        CoroutineContext coroutineContextMo2029e = interfaceC9968c2.mo2029e();
        Object objM14435c = ThreadContextKt.m14435c(coroutineContextMo2029e, c7156f.f40423g);
        C7863q1<?> c7863q1M14309c = objM14435c != ThreadContextKt.f40405a ? CoroutineContextKt.m14309c(interfaceC9968c2, coroutineContextMo2029e, objM14435c) : null;
        try {
            c7156f.f40421e.mo2031y(objM14967u);
            C9072e c9072e = C9072e.f47360a;
            if (c7863q1M14309c == null || c7863q1M14309c.m15611l0()) {
                ThreadContextKt.m14433a(coroutineContextMo2029e, objM14435c);
            }
        } catch (Throwable th2) {
            if (c7863q1M14309c == null || c7863q1M14309c.m15611l0()) {
                ThreadContextKt.m14433a(coroutineContextMo2029e, objM14435c);
            }
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: X */
    public static InterfaceC8830c m16707X(InterfaceC8830c interfaceC8830c) {
        C7647d c7647dM16448g = C8413d.m16448g(interfaceC8830c);
        String str = C8646c.f46201a;
        C7646c c7646c = C8646c.f46211k.get(c7647dM16448g);
        if (c7646c != null) {
            return DescriptorUtilsKt.m14108e(interfaceC8830c).m13553j(c7646c);
        }
        throw new IllegalArgumentException("Given class " + interfaceC8830c + " is not a read-only collection");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: X0 */
    public static final int m16708X0(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d10 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d10);
    }

    /* JADX INFO: renamed from: Y */
    public static final AbstractC8911i m16709Y(AbstractC8911i abstractC8911i) {
        C5207g.m11111f(abstractC8911i, "<this>");
        AbstractC8911i abstractC8911iM16686M0 = m16686M0(abstractC8911i);
        int iMo17136b = abstractC8911iM16686M0.mo17136b();
        for (int i10 = 0; i10 < iMo17136b; i10++) {
            abstractC8911iM16686M0.mo17139e(i10, abstractC8911i.mo17135a(i10));
        }
        return abstractC8911iM16686M0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: Y0 */
    public static final int m16710Y0(float f3) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f3);
    }

    /* JADX INFO: renamed from: Z */
    public static final C1038i0 m16711Z(Fragment fragment, InterfaceC6719b interfaceC6719b, InterfaceC2041a interfaceC2041a, InterfaceC2041a interfaceC2041a2, InterfaceC2041a interfaceC2041a3) {
        C5207g.m11111f(fragment, "<this>");
        C5207g.m11111f(interfaceC6719b, "viewModelClass");
        return new C1038i0(interfaceC6719b, interfaceC2041a, interfaceC2041a3, interfaceC2041a2);
    }

    /* JADX INFO: renamed from: Z0 */
    public static final void m16712Z0(View view, InterfaceC0209s interfaceC0209s) {
        C5207g.m11111f(view, "<this>");
        C5207g.m11111f(interfaceC0209s, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC0209s);
    }

    /* JADX INFO: renamed from: a0 */
    public static final DerivedSnapshotState m16713a0(InterfaceC2041a interfaceC2041a) {
        C5298b1 c5298b1 = C5295a1.f33567a;
        return new DerivedSnapshotState(interfaceC2041a);
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m16714a1(InterfaceC0476a interfaceC0476a, Object obj, InterfaceC2056p interfaceC2056p) {
        C5207g.m11111f(interfaceC2056p, "block");
        if (!interfaceC0476a.mo1632h() && C5207g.m11106a(interfaceC0476a.mo1624d(), obj)) {
            return;
        }
        interfaceC0476a.mo1655t(obj);
        interfaceC0476a.mo1630g(obj, interfaceC2056p);
    }

    /* JADX INFO: renamed from: b0 */
    public static final LibraryCounter m16715b0(ResultLibraryCounter resultLibraryCounter, int i10, String str) {
        C5207g.m11111f(resultLibraryCounter, "<this>");
        C5207g.m11111f(str, "type");
        return new LibraryCounter(i10, str, resultLibraryCounter.f18667a, resultLibraryCounter.f18668b, resultLibraryCounter.f18669c, resultLibraryCounter.f18670d, resultLibraryCounter.f18671e, resultLibraryCounter.f18672f, resultLibraryCounter.f18673g, resultLibraryCounter.f18674h, resultLibraryCounter.f18675i, resultLibraryCounter.f18676j, resultLibraryCounter.f18677k, resultLibraryCounter.f18678l);
    }

    /* JADX INFO: renamed from: b1 */
    public static final void m16716b1(Matrix matrix, float[] fArr) {
        C5207g.m11111f(fArr, "$this$setFrom");
        C5207g.m11111f(matrix, "matrix");
        matrix.getValues(fArr);
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        fArr[0] = f3;
        fArr[1] = f12;
        fArr[2] = 0.0f;
        fArr[3] = f15;
        fArr[4] = f10;
        fArr[5] = f13;
        fArr[6] = 0.0f;
        fArr[7] = f16;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f11;
        fArr[13] = f14;
        fArr[14] = 0.0f;
        fArr[15] = f17;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c0 */
    public static final void m16717c0(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
        ListBuilder listBuilder = new ListBuilder();
        Cursor cursorMo4599o0 = frameworkSQLiteDatabase.mo4599o0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            Cursor cursor = cursorMo4599o0;
            while (cursor.moveToNext()) {
                listBuilder.add(cursor.getString(0));
            }
            C9072e c9072e = C9072e.f47360a;
            C5206f.m11032z0(cursorMo4599o0, null);
            C9000b.m17239e(listBuilder);
            Iterator it = listBuilder.iterator();
            while (true) {
                ListBuilder.C6745a c6745a = (ListBuilder.C6745a) it;
                if (!c6745a.hasNext()) {
                    return;
                }
                String str = (String) c6745a.next();
                C5207g.m11110e(str, "triggerName");
                if (C7661i.m15256V2(str, "room_fts_content_sync_", false)) {
                    frameworkSQLiteDatabase.mo4600u("DROP TRIGGER IF EXISTS ".concat(str));
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C5206f.m11032z0(cursorMo4599o0, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public static final String m16718c1(Object obj) {
        C5207g.m11111f(obj, "obj");
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append('@');
        String str = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        C5207g.m11110e(str, "format(format, *args)");
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d0 */
    public static String m16719d0(ArrayList arrayList, String str, InterfaceC2052l interfaceC2052l, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        CharSequence charSequence = (i10 & 2) != 0 ? "" : null;
        String str2 = (i10 & 4) == 0 ? null : "";
        int i11 = (i10 & 8) != 0 ? -1 : 0;
        String str3 = (i10 & 16) != 0 ? "..." : null;
        if ((i10 & 32) != 0) {
            interfaceC2052l = null;
        }
        C5207g.m11111f(arrayList, "<this>");
        C5207g.m11111f(str, "separator");
        C5207g.m11111f(charSequence, "prefix");
        C5207g.m11111f(str2, "postfix");
        C5207g.m11111f(str3, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence);
        int size = arrayList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            i12++;
            if (i12 > 1) {
                sb2.append((CharSequence) str);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (interfaceC2052l != null) {
                sb2.append((CharSequence) interfaceC2052l.mo528n(obj));
            } else {
                if (obj != null ? obj instanceof CharSequence : true) {
                    sb2.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    sb2.append(((Character) obj).charValue());
                } else {
                    sb2.append((CharSequence) String.valueOf(obj));
                }
            }
        }
        if (i11 >= 0 && i12 > i11) {
            sb2.append((CharSequence) str3);
        }
        sb2.append((CharSequence) str2);
        String string = sb2.toString();
        C5207g.m11110e(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    /* JADX INFO: renamed from: d1 */
    public static int m16720d1(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: e0 */
    public static String m16721e0(List list) {
        C5207g.m11111f(list, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) ",");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        String string = sb2.toString();
        C5207g.m11110e(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    /* JADX INFO: renamed from: e1 */
    public static int m16722e1(Object obj) {
        return m16720d1(obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: f0 */
    public static final LayoutNode m16723f0(LayoutNode layoutNode, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(layoutNode, "<this>");
        C5207g.m11111f(interfaceC2052l, "selector");
        for (LayoutNode layoutNodeM2128r = layoutNode.m2128r(); layoutNodeM2128r != null; layoutNodeM2128r = layoutNodeM2128r.m2128r()) {
            if (((Boolean) interfaceC2052l.mo528n(layoutNodeM2128r)).booleanValue()) {
                return layoutNodeM2128r;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f1 */
    public static C8936x m16724f1(float f3, Object obj, int i10) {
        float f10 = (i10 & 1) != 0 ? 1.0f : 0.0f;
        if ((i10 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new C8936x(f10, f3, obj);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g0 */
    public static final NavController m16725g0(Fragment fragment) {
        Dialog dialog;
        Window window;
        C5207g.m11111f(fragment, "<this>");
        int i10 = NavHostFragment.f6860A0;
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.f6080R) {
            if (fragment2 instanceof NavHostFragment) {
                C1688m c1688m = ((NavHostFragment) fragment2).f6861v0;
                if (c1688m != null) {
                    return c1688m;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
            Fragment fragment3 = fragment2.m3598r().f6181x;
            if (fragment3 instanceof NavHostFragment) {
                C1688m c1688m2 = ((NavHostFragment) fragment3).f6861v0;
                if (c1688m2 != null) {
                    return c1688m2;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
        }
        View view = fragment.f6094c0;
        if (view != null) {
            return C1084b.m4034a(view);
        }
        View decorView = null;
        DialogInterfaceOnCancelListenerC0962l dialogInterfaceOnCancelListenerC0962l = fragment instanceof DialogInterfaceOnCancelListenerC0962l ? (DialogInterfaceOnCancelListenerC0962l) fragment : null;
        if (dialogInterfaceOnCancelListenerC0962l != null && (dialog = dialogInterfaceOnCancelListenerC0962l.f6328G0) != null && (window = dialog.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            return C1084b.m4034a(decorView);
        }
        throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " does not have a NavController set"));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g1 */
    public static final long m16726g1(long j10, long j11) {
        float fM17177d = C8944f.m17177d(j10);
        long j12 = C5637a0.f34484a;
        if (!(j11 != j12)) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * fM17177d;
        float fM17175b = C8944f.m17175b(j10);
        if (j11 != j12) {
            return C8584v.m16788m(fIntBitsToFloat, Float.intBitsToFloat((int) (j11 & 4294967295L)) * fM17175b);
        }
        throw new IllegalStateException("ScaleFactor is unspecified".toString());
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m16727h0(LayoutNode layoutNode, List list) {
        C5458f<LayoutNode> c5458fM2129s = layoutNode.m2129s();
        int i10 = c5458fM2129s.f34019c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2129s.f34017a;
            int i11 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                InterfaceC6154k0 interfaceC6154k0M16750q0 = m16750q0(layoutNode2);
                if (interfaceC6154k0M16750q0 != null) {
                    list.add(interfaceC6154k0M16750q0);
                } else {
                    m16727h0(layoutNode2, list);
                }
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h1 */
    public static final Object[] m16728h1(Collection collection) {
        C5207g.m11111f(collection, "collection");
        int size = collection.size();
        Object[] objArr = f45969f;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            objArrCopyOf[i10] = it.next();
            if (i11 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = 2147483645;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                C5207g.m11110e(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i11);
                C5207g.m11110e(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final int m16729i0(int i10, ArrayList arrayList) {
        byte b10;
        C5207g.m11111f(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C7208b c7208b = (C7208b) arrayList.get(i12);
            if (c7208b.f40549b > i10) {
                b10 = 1;
            } else {
                b10 = c7208b.f40550c <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: renamed from: i1 */
    public static final Object[] m16730i1(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        C5207g.m11111f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    C5207g.m11109d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i11 = i10 + 1;
                    objArrCopyOf[i10] = it.next();
                    if (i11 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            i12 = 2147483645;
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                        C5207g.m11110e(objArrCopyOf, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i11] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i11);
                        C5207g.m11110e(objArrCopyOf2, "copyOf(result, size)");
                        objArr = objArrCopyOf2;
                    }
                    i10 = i11;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: j0 */
    public static final int m16731j0(int i10, ArrayList arrayList) {
        int i11;
        byte b10;
        C5207g.m11111f(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            i11 = (i12 + size) >>> 1;
            C7208b c7208b = (C7208b) arrayList.get(i11);
            if (c7208b.f40551d > i10) {
                b10 = 1;
            } else {
                b10 = c7208b.f40552e <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i12 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        i11 = -(i12 + 1);
        return i11;
    }

    /* JADX INFO: renamed from: j1 */
    public static final TranslationSentence m16732j1(ResultTranslationSentence resultTranslationSentence, int i10) {
        C5207g.m11111f(resultTranslationSentence, "<this>");
        int i11 = resultTranslationSentence.f18993a;
        List<Double> list = resultTranslationSentence.f18994b;
        Double d10 = (Double) C6752c.m13425S(list);
        Double d11 = (Double) C6752c.m13426T(1, list);
        String str = resultTranslationSentence.f18995c;
        List<ResultTranslation> list2 = resultTranslationSentence.f18996d;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list2, 10));
        for (ResultTranslation resultTranslation : list2) {
            arrayList.add(new Translation(resultTranslation.f18988a, resultTranslation.f18989b, C5207g.m11106a(resultTranslation.f18990c, "Google")));
        }
        return new TranslationSentence(i11, i10, d10, d11, str, arrayList);
    }

    /* JADX INFO: renamed from: k0 */
    public static final int m16733k0(ArrayList arrayList, float f3) {
        int i10;
        byte b10;
        C5207g.m11111f(arrayList, "paragraphInfoList");
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            i10 = (i11 + size) >>> 1;
            C7208b c7208b = (C7208b) arrayList.get(i10);
            if (c7208b.f40553f > f3) {
                b10 = 1;
            } else {
                b10 = c7208b.f40554g <= f3 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i11 = i10 + 1;
            } else {
                if (b10 <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        i10 = -(i11 + 1);
        return i10;
    }

    /* JADX INFO: renamed from: k1 */
    public static C8904e0 m16734k1(int i10, int i11, InterfaceC8925p interfaceC8925p, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            interfaceC8925p = C8927q.f46847a;
        }
        C5207g.m11111f(interfaceC8925p, "easing");
        return new C8904e0(i10, i11, interfaceC8925p);
    }

    /* JADX INFO: renamed from: l */
    public static C0369a m16735l() {
        return new C0369a(Float.valueOf(0.0f), VectorConvertersKt.f1626a, Float.valueOf(0.01f), "Animatable");
    }

    /* JADX INFO: renamed from: l0 */
    public static Charset m16736l0() {
        return Charset.isSupported("UTF-8") ? Charset.forName("UTF-8") : Charset.defaultCharset();
    }

    /* JADX INFO: renamed from: l1 */
    public static final int m16737l1(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }

    /* JADX INFO: renamed from: m */
    public static AbstractChannel m16738m(int i10, BufferOverflow bufferOverflow, int i11) {
        boolean z10 = false;
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        int i12 = 1;
        if (i10 == -2) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                InterfaceC8428d.f45562D.getClass();
                i12 = InterfaceC8428d.a.f45564b;
            }
            return new C8427c(i12, bufferOverflow, null);
        }
        if (i10 != -1) {
            if (i10 == 0) {
                return bufferOverflow == BufferOverflow.SUSPEND ? new C8440p(null) : new C8427c(1, bufferOverflow, null);
            }
            if (i10 != Integer.MAX_VALUE) {
                return (i10 == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) ? new C8433i(null) : new C8427c(i10, bufferOverflow, null);
            }
            return new C8434j(null);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            z10 = true;
        }
        if (z10) {
            return new C8433i(null);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }

    /* JADX INFO: renamed from: m0 */
    public static final int m16739m0(Cursor cursor, String str) {
        C5207g.m11111f(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m1 */
    public static final Object m16740m1(ContinuationImpl continuationImpl) {
        Object obj;
        CoroutineContext coroutineContextMo2029e = continuationImpl.mo2029e();
        C0062b.m286L0(coroutineContextMo2029e);
        InterfaceC9968c interfaceC9968cM16874A = C8656b.m16874A(continuationImpl);
        C7156f c7156f = interfaceC9968cM16874A instanceof C7156f ? (C7156f) interfaceC9968cM16874A : null;
        if (c7156f == null) {
            obj = C9072e.f47360a;
        } else {
            CoroutineDispatcher coroutineDispatcher = c7156f.f40420d;
            boolean z10 = true;
            if (coroutineDispatcher.mo3964B1(coroutineContextMo2029e)) {
                c7156f.f40422f = C9072e.f47360a;
                c7156f.f42924c = 1;
                coroutineDispatcher.mo14310A1(coroutineContextMo2029e, c7156f);
            } else {
                C7869s1 c7869s1 = new C7869s1();
                CoroutineContext coroutineContextMo1471C = coroutineContextMo2029e.mo1471C(c7869s1);
                C9072e c9072e = C9072e.f47360a;
                c7156f.f40422f = c9072e;
                c7156f.f42924c = 1;
                coroutineDispatcher.mo14310A1(coroutineContextMo1471C, c7156f);
                if (c7869s1.f42967b) {
                    AbstractC7847l0 abstractC7847l0M15607a = C7857o1.m15607a();
                    C7151a<AbstractC7826e0<?>> c7151a = abstractC7847l0M15607a.f42949e;
                    if (!(c7151a == null || c7151a.f40413b == c7151a.f40414c)) {
                        if (abstractC7847l0M15607a.m15603F1()) {
                            c7156f.f40422f = c9072e;
                            c7156f.f42924c = 1;
                            abstractC7847l0M15607a.m15601D1(c7156f);
                        } else {
                            abstractC7847l0M15607a.m15602E1(true);
                            try {
                                c7156f.run();
                                do {
                                } while (abstractC7847l0M15607a.m15604H1());
                            } catch (Throwable th2) {
                                try {
                                    c7156f.m15565h(th2, null);
                                } catch (Throwable th3) {
                                    abstractC7847l0M15607a.m15600C1(true);
                                    throw th3;
                                }
                            }
                            abstractC7847l0M15607a.m15600C1(true);
                        }
                        if (z10) {
                            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                        } else {
                            obj = C9072e.f47360a;
                        }
                    }
                    z10 = false;
                    if (z10) {
                        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                    } else {
                        obj = C9072e.f47360a;
                    }
                }
            }
            obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        return obj == CoroutineSingletons.COROUTINE_SUSPENDED ? obj : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: n */
    public static final long m16741n(float f3, float f10) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(f3) << 32);
        int i10 = C8939a.f46883b;
        return jFloatToIntBits;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n0 */
    public static final int m16742n0(Cursor cursor, String str) {
        String strM13385q0;
        C5207g.m11111f(cursor, "c");
        int iM16739m0 = m16739m0(cursor, str);
        if (iM16739m0 >= 0) {
            return iM16739m0;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            C5207g.m11110e(columnNames, "c.columnNames");
            strM13385q0 = C6744b.m13385q0(columnNames, null, null, null, null, 63);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            strM13385q0 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strM13385q0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n1 */
    public static int m16743n1(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: o0 */
    public static final int m16744o0(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: o1 */
    public static void m16745o1(int i10, int i11) {
        String strM14911J0;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 < 0) {
            strM14911J0 = C7499b.m14911J0("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(C0166e.m761g("negative size: ", i11));
            }
            strM14911J0 = C7499b.m14911J0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strM14911J0);
    }

    /* JADX INFO: renamed from: p */
    public static final C10016d m16746p(Context context) {
        C5207g.m11111f(context, "context");
        return new C10016d(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }

    /* JADX INFO: renamed from: p0 */
    public static final InterfaceC6154k0 m16747p0(LayoutNode layoutNode) {
        Object obj;
        C5207g.m11111f(layoutNode, "<this>");
        InterfaceC0500b.c cVar = layoutNode.f3758U.f35999e;
        int i10 = cVar.f3328c & 8;
        if (i10 != 0) {
            for (InterfaceC0500b.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.f3330e) {
                if ((cVar2.f3327b & 8) != 0 && (cVar2 instanceof InterfaceC6154k0) && ((InterfaceC6154k0) cVar2).mo2078C().f37392b) {
                    obj = cVar2;
                } else {
                    if ((cVar2.f3328c & 8) == 0) {
                        break;
                    }
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        return (InterfaceC6154k0) obj;
    }

    /* JADX INFO: renamed from: p1 */
    public static final boolean m16748p1() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* JADX INFO: renamed from: q */
    public static C8481r m16749q(int i10, C8476m c8476m, int i11, int i12) {
        if ((i12 & 2) != 0) {
            c8476m = C8476m.f45650f;
        }
        C8476m c8476m2 = c8476m;
        int i13 = (i12 & 4) != 0 ? 0 : i11;
        C5207g.m11111f(c8476m2, "weight");
        return new C8481r(i10, c8476m2, i13, new C8475l(new InterfaceC8474k[0]), 0);
    }

    /* JADX INFO: renamed from: q0 */
    public static final InterfaceC6154k0 m16750q0(LayoutNode layoutNode) {
        Object obj;
        InterfaceC0500b.c cVar;
        C5207g.m11111f(layoutNode, "<this>");
        InterfaceC0500b.c cVar2 = layoutNode.f3758U.f35999e;
        if ((cVar2.f3328c & 8) != 0) {
            while (true) {
                if (cVar == null) {
                    cVar = cVar2;
                    break;
                }
                if ((cVar.f3327b & 8) == 0 || !(cVar instanceof InterfaceC6154k0)) {
                    cVar = cVar2;
                    cVar = cVar2;
                    if ((cVar.f3328c & 8) == 0) {
                        break;
                    }
                    cVar = cVar.f3330e;
                } else {
                    cVar = cVar2;
                    obj = cVar;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        return (InterfaceC6154k0) obj;
    }

    /* JADX INFO: renamed from: q1 */
    public static String m16751q1(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            String str2 = strArr[i10];
            if (str != null || str2 != null) {
                if (str != null && str.equals(str2)) {
                }
            }
            return strArr2[i10];
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final long m16752r(int i10, int i11) {
        long j10 = (((long) i11) & 4294967295L) | (((long) i10) << 32);
        int i12 = C10020h.f50974c;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX INFO: renamed from: r0 */
    public static long m16753r0(byte b10, byte b11) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = b10 & 255;
        int i15 = i14 & 3;
        if (i15 != 0) {
            i10 = 2;
            if (i15 != 1 && i15 != 2) {
                i10 = b11 & 63;
            }
            i11 = i14 >> 3;
            i12 = i11 & 3;
            if (i11 >= 16) {
                i13 = 2500 << i12;
            } else if (i11 >= 12) {
                i13 = 10000 << (i12 & 1);
            } else if (i12 == 3) {
                i13 = 60000;
            } else {
                i13 = 10000 << i12;
            }
            return ((long) i10) * ((long) i13);
        }
        i10 = 1;
        i11 = i14 >> 3;
        i12 = i11 & 3;
        if (i11 >= 16) {
            i13 = 2500 << i12;
        } else if (i11 >= 12) {
            i13 = 10000 << (i12 & 1);
        } else if (i12 == 3) {
            i13 = 60000;
        } else {
            i13 = 10000 << i12;
        }
        return ((long) i10) * ((long) i13);
    }

    /* JADX INFO: renamed from: r1 */
    public static void m16754r1(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m16763u1("index", i10, i11));
        }
    }

    /* JADX INFO: renamed from: s */
    public static final long m16755s(int i10) {
        long j10 = (((long) i10) << 32) | (((long) 0) & 4294967295L);
        int i11 = C1288a.f7998l;
        return j10;
    }

    /* JADX INFO: renamed from: s0 */
    public static final C5042b m16756s0(View view) {
        C5042b c5042b = (C5042b) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c5042b != null) {
            return c5042b;
        }
        C5042b c5042b2 = new C5042b();
        view.setTag(R.id.pooling_container_listener_holder_tag, c5042b2);
        return c5042b2;
    }

    /* JADX INFO: renamed from: s1 */
    public static String m16757s1(Context context, String str) {
        C6272i.m12915i(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = C1843i4.m5627a(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final C9151j m16758t() {
        return new C9151j(0);
    }

    /* JADX INFO: renamed from: t0 */
    public static InterfaceC9814a m16759t0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C7951d0 c7951d0, C5383c c5383c) {
        C9818e c9818e = new C9818e(context, cleverTapInstanceConfig, c7951d0);
        boolean z10 = c9818e.m18297b().length() > 0 && TextUtils.isEmpty(c9818e.m18298c());
        cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "isLegacyProfileLoggedIn:" + z10);
        InterfaceC9814a c7968m = z10 ? new C7968m(cleverTapInstanceConfig) : new C1292a(context, cleverTapInstanceConfig, c7951d0, c5383c);
        cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "Repo provider: ".concat(c7968m.getClass().getSimpleName()));
        return c7968m;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t1 */
    public static void m16760t1(int i10, int i11, int i12) {
        String strM16763u1;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM16763u1 = m16763u1("start index", i10, i12);
            } else {
                strM16763u1 = (i11 < 0 || i11 > i12) ? m16763u1("end index", i11, i12) : C7499b.m14911J0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM16763u1);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final long m16761u(float f3, float f10) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(f3) << 32);
        int i10 = C5637a0.f34485b;
        return jFloatToIntBits;
    }

    /* JADX INFO: renamed from: u0 */
    public static final long m16762u0(double d10) {
        return m16690O0((float) d10, 4294967296L);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: u1 */
    public static String m16763u1(String str, int i10, int i11) {
        if (i10 < 0) {
            return C7499b.m14911J0("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C7499b.m14911J0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(C0166e.m761g("negative size: ", i11));
    }

    /* JADX INFO: renamed from: v */
    public static final void m16764v(int i10, List list) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException(C0009a.m20h("Index ", i10, " is out of bounds. The list has ", size, " elements."));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static final long m16765v0(int i10) {
        return m16690O0(i10, 4294967296L);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public static final void m16766w(int i10, int i11, List list) {
        int size = list.size();
        if (i10 > i11) {
            throw new IllegalArgumentException(C0009a.m20h("Indices are out of order. fromIndex (", i10, ") is greater than toIndex (", i11, ")."));
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(C0166e.m762h("fromIndex (", i10, ") is less than 0."));
        }
        if (i11 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w0 */
    public static final InterfaceC7882z m16767w0(AbstractC1036h0 abstractC1036h0) {
        Object obj;
        Object obj2;
        C5207g.m11111f(abstractC1036h0, "<this>");
        HashMap map = abstractC1036h0.f6655a;
        if (map == null) {
            obj2 = null;
        } else {
            synchronized (map) {
                obj = abstractC1036h0.f6655a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
            obj2 = obj;
        }
        InterfaceC7882z interfaceC7882z = (InterfaceC7882z) obj2;
        if (interfaceC7882z != null) {
            return interfaceC7882z;
        }
        C7851m1 c7851m1M380p = C0062b.m380p();
        C7178b c7178b = C7832g0.f42930a;
        return (InterfaceC7882z) abstractC1036h0.m3941k2(new C1027d(c7851m1M380p.mo1471C(C7162l.f40438a.mo14316C1())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    /* JADX INFO: renamed from: x */
    public static final void m16768x(LayoutNode layoutNode, C5458f c5458f, InterfaceC2052l interfaceC2052l) {
        C5458f<LayoutNode> c5458fM2130t = layoutNode.m2130t();
        int i10 = c5458fM2130t.f34019c;
        if (i10 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            int i11 = 0;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i11];
                if (c5458f.f34019c <= i11) {
                    c5458f.m11687b(interfaceC2052l.mo528n(layoutNode2));
                } else {
                    Object objMo528n = interfaceC2052l.mo528n(layoutNode2);
                    Object[] objArr = c5458f.f34017a;
                    Object obj = objArr[i11];
                    objArr[i11] = objMo528n;
                }
                i11++;
            } while (i11 < i10);
        }
        c5458f.m11698o(layoutNode.m2127q().size(), c5458f.f34019c);
    }

    /* JADX INFO: renamed from: x0 */
    public static final void m16769x0(CoroutineContext coroutineContext, Throwable th2) {
        try {
            InterfaceC7878x interfaceC7878x = (InterfaceC7878x) coroutineContext.mo1474w(InterfaceC7878x.a.f42977a);
            if (interfaceC7878x != null) {
                interfaceC7878x.mo2598p1(coroutineContext, th2);
            } else {
                C7079a.m14315a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                C8656b.m16899g(runtimeException, th2);
                th2 = runtimeException;
            }
            C7079a.m14315a(coroutineContext, th2);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC1048n0 m16770y(InterfaceC9070c interfaceC9070c) {
        return (InterfaceC1048n0) interfaceC9070c.getValue();
    }

    /* JADX INFO: renamed from: y0 */
    public static final void m16771y0() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    /* JADX INFO: renamed from: z */
    public static C1603z m16772z(String str, int i10, String str2, int i11) {
        String str3 = str;
        if ((i11 & 1) != 0) {
            str3 = "";
        }
        boolean z10 = (i11 & 2) != 0;
        if ((i11 & 4) != 0) {
            i10 = -1;
        }
        if ((i11 & 8) != 0) {
            str2 = "";
        }
        C5207g.m11111f(str3, "oldName");
        C5207g.m11111f(str2, "itemURL");
        return new C1603z(str3, i10, str2, z10);
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m16773z0(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // p148h7.InterfaceC5898a
    /* JADX INFO: renamed from: a */
    public void mo5435a(C5899b c5899b) {
    }

    @Override // p457wd.InterfaceC9900a
    /* JADX INFO: renamed from: b */
    public void mo16774b(Exception exc) {
        C7967l0 c7967l0 = C8571q1.f45948e;
        C8571q1.f45948e.m15815p(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }

    @Override // p541zn.InterfaceC10549m
    /* JADX INFO: renamed from: c */
    public AbstractC5257t mo16775c(ProtoBuf$Type protoBuf$Type, String str, AbstractC5265x abstractC5265x, AbstractC5265x abstractC5265x2) {
        C5207g.m11111f(protoBuf$Type, "proto");
        C5207g.m11111f(str, "flexibleId");
        C5207g.m11111f(abstractC5265x, "lowerBound");
        C5207g.m11111f(abstractC5265x2, "upperBound");
        if (C5207g.m11106a(str, "kotlin.jvm.PlatformType")) {
            return protoBuf$Type.m13922s(JvmProtoBuf.f39404g) ? new RawTypeImpl(abstractC5265x, abstractC5265x2) : KotlinTypeFactory.m14184c(abstractC5265x, abstractC5265x2);
        }
        return C5602h.m11912c(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, str, abstractC5265x.toString(), abstractC5265x2.toString());
    }

    @Override // p148h7.InterfaceC5898a
    /* JADX INFO: renamed from: d */
    public void mo5437d(int i10, long j10, long j11) {
    }

    @Override // p356r5.InterfaceC8731a
    /* JADX INFO: renamed from: e */
    public boolean mo70e(Object obj, File file, C8735e c8735e) throws Throwable {
        try {
            C7481a.m14867d(((C5374c) ((InterfaceC9207m) obj).get()).f33757a.f33767a.f33769a.mo16581a().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    @Override // p148h7.InterfaceC5898a
    /* JADX INFO: renamed from: f */
    public List mo5439f(int i10) {
        return null;
    }

    @Override // p356r5.InterfaceC8737g
    /* JADX INFO: renamed from: g */
    public EncodeStrategy mo71g(C8735e c8735e) {
        return EncodeStrategy.SOURCE;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // pf.InterfaceC8240c
    /* JADX INFO: renamed from: h */
    public void mo15557h(C8241d c8241d) {
        int i10;
        int i11 = c8241d.f44515f;
        String str = c8241d.f44510a;
        int length = str.length();
        boolean z10 = true;
        if (i11 < length) {
            char cCharAt = str.charAt(i11);
            i10 = 0;
            while (true) {
                if (!(cCharAt >= '0' && cCharAt <= '9') || i11 >= length) {
                    break;
                }
                i10++;
                i11++;
                if (i11 < length) {
                    cCharAt = str.charAt(i11);
                }
            }
        } else {
            i10 = 0;
        }
        if (i10 >= 2) {
            char cCharAt2 = str.charAt(c8241d.f44515f);
            char cCharAt3 = str.charAt(c8241d.f44515f + 1);
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                if (cCharAt3 < '0' || cCharAt3 > '9') {
                    z10 = false;
                }
                if (z10) {
                    c8241d.m16388e((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + 130));
                    c8241d.f44515f += 2;
                    return;
                }
            }
            throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
        }
        char cM16385b = c8241d.m16385b();
        int iM11154a0 = C5212l.m11154a0(str, c8241d.f44515f, 0);
        if (iM11154a0 == 0) {
            if (!C5212l.m11151X(cM16385b)) {
                c8241d.m16388e((char) (cM16385b + 1));
                c8241d.f44515f++;
                return;
            } else {
                c8241d.m16388e((char) 235);
                c8241d.m16388e((char) ((cM16385b - 128) + 1));
                c8241d.f44515f++;
                return;
            }
        }
        if (iM11154a0 == 1) {
            c8241d.m16388e((char) 230);
            c8241d.f44516g = 1;
            return;
        }
        if (iM11154a0 == 2) {
            c8241d.m16388e((char) 239);
            c8241d.f44516g = 2;
            return;
        }
        if (iM11154a0 == 3) {
            c8241d.m16388e((char) 238);
            c8241d.f44516g = 3;
        } else if (iM11154a0 == 4) {
            c8241d.m16388e((char) 240);
            c8241d.f44516g = 4;
        } else {
            if (iM11154a0 != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iM11154a0)));
            }
            c8241d.m16388e((char) 231);
            c8241d.f44516g = 5;
        }
    }

    @Override // cc.InterfaceC1793d
    /* JADX INFO: renamed from: i */
    public String mo5570i(String str, String str2) {
        return null;
    }

    @Override // p148h7.InterfaceC5898a
    /* JADX INFO: renamed from: k */
    public C5899b mo5443k(int i10) {
        return null;
    }

    @Override // com.bumptech.glide.manager.InterfaceC2151g
    /* JADX INFO: renamed from: o */
    public void mo6367o() {
    }

    @Override // p148h7.InterfaceC5898a
    public void remove(int i10) {
    }

    @Override // cc.InterfaceC1967w2
    public Object zza() {
        List list = C1985y2.f10339a;
        return Long.valueOf(C2592a9.f14056b.zza().mo7706E());
    }
}
