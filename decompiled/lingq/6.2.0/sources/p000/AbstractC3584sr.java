package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.R$string;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.C0423c;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.room.AbstractC0746d;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.PersistedEvents;
import com.google.android.gms.tasks.Task;
import com.lingq.core.domain.model.repo.NetworkErrorType;
import com.lingq.core.p012ui.R$drawable;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.serialization.KSerializer;
import p000.C3386nv;
import p000.lda;
import p000.zi3;

/* JADX INFO: renamed from: sr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3584sr {

    /* JADX INFO: renamed from: e */
    public static final C0842cc f61278e;

    /* JADX INFO: renamed from: f */
    public static final C0842cc f61279f;

    /* JADX INFO: renamed from: g */
    public static final C0842cc f61280g;

    /* JADX INFO: renamed from: h */
    public static final C0842cc f61281h;

    /* JADX INFO: renamed from: i */
    public static final C0842cc f61282i;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f61288o = 0;

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f61289p = 0;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f61290q = 0;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f61291r = 0;

    /* JADX INFO: renamed from: a */
    public static final s46 f61274a = new s46(6);

    /* JADX INFO: renamed from: b */
    public static final ho5 f61275b = new ho5(11);

    /* JADX INFO: renamed from: c */
    public static final g9c f61276c = new g9c(6);

    /* JADX INFO: renamed from: d */
    public static final ExecutorC3014fu f61277d = new ExecutorC3014fu(1);

    /* JADX INFO: renamed from: j */
    public static final jr2 f61283j = new jr2(false);

    /* JADX INFO: renamed from: k */
    public static final jr2 f61284k = new jr2(true);

    /* JADX INFO: renamed from: l */
    public static final Object f61285l = new Object();

    /* JADX INFO: renamed from: m */
    public static final String[] f61286m = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* JADX INFO: renamed from: n */
    public static final String[] f61287n = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    static {
        int i = 5;
        f61278e = new C0842cc("COMPLETING_ALREADY", i);
        f61279f = new C0842cc("COMPLETING_WAITING_CHILDREN", i);
        f61280g = new C0842cc("COMPLETING_RETRY", i);
        f61281h = new C0842cc("TOO_LATE_TO_CANCEL", i);
        f61282i = new C0842cc("SEALED", i);
    }

    /* JADX INFO: renamed from: A */
    public static final i93 m21590A(AbstractC0746d abstractC0746d, boolean z, String[] strArr, vi3 vi3Var) {
        abstractC0746d.getClass();
        return new i93(AbstractC3224d.m15525d(abstractC0746d.m2836i().m2808a((String[]) Arrays.copyOf(strArr, strArr.length)), -1), abstractC0746d, z, vi3Var);
    }

    /* JADX INFO: renamed from: B */
    public static final nt3 m21591B(dua duaVar, ye1 ye1Var) {
        if (!(duaVar instanceof gr3)) {
            tj3 tj3Var = (tj3) ye1Var;
            tj3Var.m22111b0(-1968008324);
            tj3Var.m22139q(false);
            return null;
        }
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22111b0(-1968186822);
        Context baseContext = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
        zta ztaVarMo2102d = ((gr3) duaVar).mo2102d();
        baseContext.getClass();
        ztaVarMo2102d.getClass();
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof uc1) {
                cy1 cy1Var = (cy1) ((lt3) ci8.m4741z((uc1) baseContext, lt3.class));
                nt3 nt3Var = new nt3(cy1Var.m9932a(), ztaVarMo2102d, new b64(cy1Var.f34704a, cy1Var.f34705b));
                tj3Var2.m22139q(false);
                return nt3Var;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            baseContext.getClass();
        }
        ij6.m13966x(baseContext, "Expected an activity context for creating a HiltViewModelFactory but instead found: ");
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static final File m21592C(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    /* JADX INFO: renamed from: D */
    public static boolean m21593D(String str, String str2) {
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static final C0357g m21594E(C0357g c0357g, vi3 vi3Var) {
        for (C0357g c0357gM1610w = c0357g.m1610w(); c0357gM1610w != null; c0357gM1610w = c0357gM1610w.m1610w()) {
            if (((Boolean) vi3Var.invoke(c0357gM1610w)).booleanValue()) {
                return c0357gM1610w;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m21595F(C0423c c0423c) {
        ToggleableState toggleableState = (ToggleableState) AbstractC0422b.m1838a(c0423c.f4974d, AbstractC0424d.f4987K);
        kv8 kv8Var = c0423c.f4974d;
        uh8 uh8Var = (uh8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5019z);
        boolean z = toggleableState != null;
        if (((Boolean) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4986J)) == null || (uh8Var != null && uh8Var.f63934a == 4)) {
            return z;
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public static final String m21596G(C0423c c0423c, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        int iM15945h;
        Object objM1838a = AbstractC0422b.m1838a(c0423c.f4974d, AbstractC0424d.f4995b);
        kv8 kv8Var = c0423c.f4974d;
        ToggleableState toggleableState = (ToggleableState) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4987K);
        uh8 uh8Var = (uh8) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f5019z);
        Object string = null;
        if (toggleableState != null) {
            int i = AbstractC0847ch.f10060a[toggleableState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        gm5.m12750e();
                        return null;
                    }
                    if (objM1838a == null) {
                        objM1838a = resources.getString(R$string.indeterminate);
                    }
                } else if (uh8Var != null && uh8Var.f63934a == 2 && objM1838a == null) {
                    objM1838a = resources.getString(R$string.state_off);
                }
            } else if (uh8Var != null && uh8Var.f63934a == 2 && objM1838a == null) {
                objM1838a = resources.getString(R$string.state_on);
            }
        }
        Boolean bool = (Boolean) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4986J);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((uh8Var == null || uh8Var.f63934a != 4) && objM1838a == null) {
                objM1838a = zBooleanValue ? resources.getString(R$string.selected) : resources.getString(R$string.not_selected);
            }
        }
        tm7 tm7Var = (tm7) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4996c);
        if (tm7Var != null) {
            if (tm7Var != tm7.f62530d) {
                if (objM1838a == null) {
                    h41 h41Var = tm7Var.f62532b;
                    float f = h41Var.f41766b;
                    float f2 = h41Var.f41765a;
                    float f3 = f - f2 == 0.0f ? 0.0f : (tm7Var.f62531a - f2) / (h41Var.f41766b - f2);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    if (f3 == 0.0f) {
                        iM15945h = 0;
                    } else {
                        iM15945h = f3 == 1.0f ? 100 : l70.m15945h(Math.round(f3 * 100.0f), 1, 99);
                    }
                    objM1838a = resources.getString(R$string.template_percent, Integer.valueOf(iM15945h));
                }
            } else if (objM1838a == null) {
                objM1838a = resources.getString(R$string.in_progress);
            }
        }
        C0427g c0427g = AbstractC0424d.f4983G;
        if (kv8Var.f48471a.m17251c(c0427g)) {
            kv8 kv8VarM1849k = new C0423c(c0423c.f4971a, true, c0423c.f4973c, kv8Var).m1849k();
            Collection collection2 = (Collection) AbstractC0422b.m1838a(kv8VarM1849k, AbstractC0424d.f4994a);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) AbstractC0422b.m1838a(kv8VarM1849k, AbstractC0424d.f4979C)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) AbstractC0422b.m1838a(kv8VarM1849k, c0427g)) == null || charSequence.length() == 0))) {
                string = resources.getString(R$string.state_empty);
            }
            objM1838a = string;
        }
        return (String) objM1838a;
    }

    /* JADX INFO: renamed from: H */
    public static final C3419on m21597H(C0423c c0423c) {
        C3419on c3419on = (C3419on) AbstractC0422b.m1838a(c0423c.f4974d, AbstractC0424d.f4983G);
        List list = (List) AbstractC0422b.m1838a(c0423c.f4974d, AbstractC0424d.f4979C);
        return c3419on == null ? list != null ? (C3419on) u91.m22591I0(list) : null : c3419on;
    }

    /* JADX INFO: renamed from: I */
    public static final lh9 m21598I(SnapshotStateList snapshotStateList) {
        lh9 lh9Var = snapshotStateList.f3798a;
        lh9Var.getClass();
        return (lh9) nc9.m17368t(lh9Var, snapshotStateList);
    }

    /* JADX INFO: renamed from: J */
    public static final int m21599J(SnapshotStateList snapshotStateList) {
        lh9 lh9Var = snapshotStateList.f3798a;
        lh9Var.getClass();
        return ((lh9) nc9.m17356h(lh9Var)).f49674e;
    }

    /* JADX INFO: renamed from: K */
    public static Continuation m21600K(Continuation continuation) {
        Continuation<Object> continuationIntercepted;
        continuation.getClass();
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return (continuationImpl == null || (continuationIntercepted = continuationImpl.intercepted()) == null) ? continuation : continuationIntercepted;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m21601L(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("off");
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m21602M(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("on");
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public static boolean m21603N(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX INFO: renamed from: O */
    public static final NetworkErrorType m21604O(int i) {
        if (i == 400) {
            return NetworkErrorType.BAD_REQUEST;
        }
        if (i == 401) {
            return NetworkErrorType.UNAUTHORIZED;
        }
        if (i == 403) {
            return NetworkErrorType.FORBIDDEN;
        }
        if (i == 404) {
            return NetworkErrorType.NOT_FOUND;
        }
        if (i == 408) {
            return NetworkErrorType.TIMEOUT;
        }
        if (i == 429) {
            return NetworkErrorType.TOO_MANY_REQUESTS;
        }
        if (i == 500) {
            return NetworkErrorType.INTERNAL_SERVER_ERROR;
        }
        switch (i) {
            case 502:
                return NetworkErrorType.BAD_GATEWAY;
            case 503:
                return NetworkErrorType.SERVICE_UNAVAILABLE;
            case 504:
                return NetworkErrorType.GATEWAY_TIMEOUT;
            default:
                return NetworkErrorType.UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m21605P(SnapshotStateList snapshotStateList, vi3 vi3Var) {
        int i;
        AbstractC3096i1 abstractC3096i1;
        Object objInvoke;
        jc9 jc9VarM17358j;
        boolean zM21641s;
        do {
            synchronized (f61285l) {
                lh9 lh9Var = snapshotStateList.f3798a;
                lh9Var.getClass();
                lh9 lh9Var2 = (lh9) nc9.m17356h(lh9Var);
                i = lh9Var2.f49673d;
                abstractC3096i1 = lh9Var2.f49672c;
            }
            abstractC3096i1.getClass();
            x77 x77VarMo13607i = abstractC3096i1.mo13607i();
            objInvoke = vi3Var.invoke(x77VarMo13607i);
            AbstractC3096i1 abstractC3096i1M24385g = x77VarMo13607i.m24385g();
            if (fa4.m11650l(abstractC3096i1M24385g, abstractC3096i1)) {
                break;
            }
            lh9 lh9Var3 = snapshotStateList.f3798a;
            lh9Var3.getClass();
            synchronized (nc9.f52602c) {
                jc9VarM17358j = nc9.m17358j();
                zM21641s = m21641s((lh9) nc9.m17371w(lh9Var3, snapshotStateList, jc9VarM17358j), i, abstractC3096i1M24385g, true);
            }
            nc9.m17362n(jc9VarM17358j, snapshotStateList);
        } while (!zM21641s);
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX INFO: renamed from: S */
    public static final e16 m21606S(e16 e16Var, t17 t17Var) {
        return e16Var.mo3161g(new w17(t17Var, new kv4(t17Var, 15)));
    }

    /* JADX INFO: renamed from: T */
    public static final e16 m21607T(e16 e16Var, final float f) {
        return e16Var.mo3161g(new o17(f, f, f, f, new vi3() { // from class: q17
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                y64 y64Var = (y64) obj;
                y64Var.f69365a = "padding";
                y64Var.f69366b = new xj2(f);
                return xfa.f68157a;
            }
        }));
    }

    /* JADX INFO: renamed from: U */
    public static final e16 m21608U(e16 e16Var, float f, float f2) {
        return e16Var.mo3161g(new o17(f, f2, f, f2, new kq6(f, f2, 1)));
    }

    /* JADX INFO: renamed from: V */
    public static e16 m21609V(e16 e16Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m21608U(e16Var, f, f2);
    }

    /* JADX INFO: renamed from: W */
    public static final e16 m21610W(e16 e16Var, final float f, final float f2, final float f3, final float f4) {
        return e16Var.mo3161g(new o17(f, f2, f3, f4, new vi3() { // from class: p17
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                y64 y64Var = (y64) obj;
                y64Var.f69365a = "padding";
                z91 z91Var = y64Var.f69367c;
                z91Var.m25511b(new xj2(f), "start");
                z91Var.m25511b(new xj2(f2), "top");
                z91Var.m25511b(new xj2(f3), "end");
                z91Var.m25511b(new xj2(f4), "bottom");
                return xfa.f68157a;
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public static e16 m21611X(e16 e16Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return m21610W(e16Var, f, f2, f3, f4);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x006a A[EDGE_INSN: B:109:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x004c->B:20:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:2: B:16:0x004c->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0124  */
    /* JADX WARN: Code duplicated, block: B:63:0x012d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x016d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0183  */
    /* JADX WARN: Code duplicated, block: B:83:0x018c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX INFO: renamed from: Y */
    public static gl0 m21612Y(qr3 qr3Var) {
        int i;
        int length;
        int length2;
        int i2;
        String string;
        String string2;
        qr3 qr3Var2 = qr3Var;
        qr3Var2.getClass();
        int size = qr3Var2.size();
        int i3 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iM13779o = -1;
        int iM13779o2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iM13779o3 = -1;
        int iM13779o4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < size) {
            String strM20122f = qr3Var2.m20122f(i3);
            String strM20124h = qr3Var2.m20124h(i3);
            if (strM20122f.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strM20124h;
                }
                i = 0;
                while (i < strM20124h.length()) {
                    length = strM20124h.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strM20124h.length();
                            break;
                        }
                        i2 = size;
                        if (vk9.m23381d0("=,;", strM20124h.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = vk9.m23376L0(strM20124h.substring(i, length2)).toString();
                    if (length2 != strM20124h.length() || strM20124h.charAt(length2) == ',' || strM20124h.charAt(length2) == ';') {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = icb.f43946a;
                        int length4 = strM20124h.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strM20124h.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strM20124h.length();
                                break;
                            }
                        }
                        if (length3 >= strM20124h.length() || strM20124h.charAt(length3) != '\"') {
                            int length5 = strM20124h.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strM20124h.length();
                                    break;
                                }
                                int i4 = length5;
                                if (vk9.m23381d0(",;", strM20124h.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i4;
                            }
                            int i5 = length6;
                            string2 = vk9.m23376L0(strM20124h.substring(length3, length6)).toString();
                            i = i5;
                        } else {
                            int i6 = length3 + 1;
                            int iM23388k0 = vk9.m23388k0(strM20124h, '\"', i6, 4);
                            string2 = strM20124h.substring(i6, iM23388k0);
                            i = iM23388k0 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iM13779o = icb.m13779o(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iM13779o2 = icb.m13779o(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iM13779o3 = icb.m13779o(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iM13779o4 = icb.m13779o(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                    size = i2;
                }
                i3++;
                qr3Var2 = qr3Var;
                size = size;
            } else {
                if (strM20122f.equalsIgnoreCase("Pragma")) {
                }
                i3++;
                qr3Var2 = qr3Var;
                size = size;
            }
            z = false;
            i = 0;
            while (i < strM20124h.length()) {
                length = strM20124h.length();
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        i2 = size;
                        length2 = strM20124h.length();
                        break;
                    }
                    i2 = size;
                    if (vk9.m23381d0("=,;", strM20124h.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i2;
                }
                string = vk9.m23376L0(strM20124h.substring(i, length2)).toString();
                if (length2 != strM20124h.length()) {
                    i = length2 + 1;
                    string2 = null;
                } else {
                    i = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iM13779o = icb.m13779o(-1, string2);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iM13779o2 = icb.m13779o(-1, string2);
                } else if ("private".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iM13779o3 = icb.m13779o(Integer.MAX_VALUE, string2);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iM13779o4 = icb.m13779o(-1, string2);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z9 = true;
                }
                size = i2;
            }
            i3++;
            qr3Var2 = qr3Var;
            size = size;
        }
        return new gl0(z2, z3, iM13779o, iM13779o2, z4, z5, z6, iM13779o3, iM13779o4, z7, z8, z9, !z ? null : str);
    }

    /* JADX INFO: renamed from: Z */
    public static final synchronized void m21613Z(qn3 qn3Var) {
        cz8 cz8Var;
        if (lp1.f49971a.contains(AbstractC3584sr.class)) {
            return;
        }
        try {
            qn3Var.getClass();
            PersistedEvents persistedEventsM18237V = AbstractC3423or.m18237V();
            for (AccessTokenAppIdPair accessTokenAppIdPair : qn3Var.m20077w()) {
                synchronized (qn3Var) {
                    accessTokenAppIdPair.getClass();
                    cz8Var = (cz8) ((HashMap) qn3Var.f57974a).get(accessTokenAppIdPair);
                }
                if (cz8Var == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                persistedEventsM18237V.m5185a(accessTokenAppIdPair, cz8Var.m9942c());
            }
            AbstractC3423or.m18240Y(persistedEventsM18237V);
        } catch (Throwable th) {
            lp1.m16420a(AbstractC3584sr.class, th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final long m21614a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: a0 */
    public static final synchronized void m21615a0(AccessTokenAppIdPair accessTokenAppIdPair, cz8 cz8Var) {
        if (lp1.f49971a.contains(AbstractC3584sr.class)) {
            return;
        }
        try {
            PersistedEvents persistedEventsM18237V = AbstractC3423or.m18237V();
            persistedEventsM18237V.m5185a(accessTokenAppIdPair, cz8Var.m9942c());
            AbstractC3423or.m18240Y(persistedEventsM18237V);
        } catch (Throwable th) {
            lp1.m16420a(AbstractC3584sr.class, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m21616b(f95 f95Var, e16 e16Var, ui3 ui3Var, n4b n4bVar, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(145831923);
        int i2 = (tj3Var2.m22120g(f95Var) ? 4 : 2) | i | 48 | (tj3Var2.m22124i(ui3Var) ? 256 : 128) | (tj3Var2.m22120g(n4bVar) ? 2048 : 1024);
        int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                e16Var = b16.f7762a;
            } else {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            e16 e16VarM21609V = m21609V(c99.m4412e(e16Var, 1.0f), ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38960i, 0.0f, 2);
            boolean z = (i2 & 896) == 256;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new k92(5, ui3Var);
                tj3Var2.m22131l0(objM22097O);
            }
            r46.m20381f(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM21609V, 15), null, null, te1.m21999m(0, 14, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var2), ci8.m4703P(-1882511287, new ia5(i3, f95Var, n4bVar), tj3Var2), tj3Var2, 24576, 6);
            tj3Var = tj3Var2;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        e16 e16Var2 = e16Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new au4(f95Var, e16Var2, ui3Var, n4bVar, i);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final Class m21617b0(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return m21617b0(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object objM20838f0 = AbstractC3550rv.m20838f0(upperBounds);
            objM20838f0.getClass();
            return m21617b0((Type) objM20838f0);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return m21617b0(genericComponentType);
        }
        StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb.append(type);
        uk9.m22778m(sb, " has type ", y38.m24933a(type.getClass()));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m21618c(e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1849328109);
        int i2 = i & 1;
        if (tj3Var.m22099R(i2, i2 != 0)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4417j = c99.m4417j(b16Var, 32.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4417j);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (0.7f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            e16 e16VarM4414g = c99.m4414g(new as4(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true), 18.0f);
            vh9 vh9Var = ps5.f56764b;
            qh0.m19963a(x74.m24341H(pb1.m19045o(e16VarM4414g, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d)), tj3Var, 0);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e));
            if (0.3f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(new as4(0.3f <= Float.MAX_VALUE ? 0.3f : Float.MAX_VALUE, true), 18.0f), ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d)), tj3Var, 0);
            tj3Var.m22139q(true);
            e16Var = b16Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3186kj(e16Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static tld m21619c0(Task task, Task task2) {
        m58 m58Var = new m58(11);
        wr9 wr9Var = new wr9((gw9) m58Var.f50618b);
        ar1 ar1Var = new ar1(wr9Var, new AtomicBoolean(false), m58Var, 0);
        ExecutorC3014fu executorC3014fu = f61277d;
        task.mo5965g(executorC3014fu, ar1Var);
        task2.mo5965g(executorC3014fu, ar1Var);
        return wr9Var.f67208a;
    }

    /* JADX INFO: renamed from: d */
    public static final x17 m21620d(float f, float f2) {
        return new x17(f, f2, f, f2);
    }

    /* JADX INFO: renamed from: d0 */
    public static final KSerializer m21621d0(w41 w41Var, Class cls, List list) {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer kSerializerM11132l = eh0.m11132l(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerM11132l != null) {
            return kSerializerM11132l;
        }
        z21 z21VarM24933a = y38.m24933a(cls);
        KSerializer kSerializer = (KSerializer) kk7.f47455a.get(z21VarM24933a);
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer kSerializerM23727o = w41Var.m23727o(z21VarM24933a, list);
        if (kSerializerM23727o != null) {
            return kSerializerM23727o;
        }
        if (cls.isInterface()) {
            return new xg7(y38.m24933a(cls));
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static x17 m21622e(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new x17(f, f2, f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r7 == null) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer m21623e0(w41 w41Var, Type type, boolean z) {
        ArrayList<KSerializer> arrayList;
        KSerializer kSerializerM21623e0;
        Type type2;
        KSerializer kSerializerM21623e1;
        z21 z21VarM24933a;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                type2 = genericComponentType;
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                upperBounds.getClass();
                type2 = (Type) AbstractC3550rv.m20838f0(upperBounds);
            }
            type2 = genericComponentType;
            type2.getClass();
            if (z) {
                kSerializerM21623e1 = AbstractC3423or.m18245b0(w41Var, type2);
            } else {
                w41Var.getClass();
                kSerializerM21623e1 = m21623e0(w41Var, type2, false);
            }
            if (type2 instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type2).getRawType();
                rawType.getClass();
                z21VarM24933a = y38.m24933a((Class) rawType);
            } else {
                if (!(type2 instanceof z21)) {
                    v63.m23127A(y38.m24933a(type2.getClass()), "unsupported type in GenericArray: ");
                    return null;
                }
                z21VarM24933a = (z21) type2;
            }
            z21VarM24933a.getClass();
            return new s38(z21VarM24933a, kSerializerM21623e1);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return m21621d0(w41Var, cls, EmptyList.f47638a);
            }
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            if (z) {
                kSerializerM21623e0 = AbstractC3423or.m18245b0(w41Var, componentType);
            } else {
                w41Var.getClass();
                kSerializerM21623e0 = m21623e0(w41Var, componentType, false);
            }
            return new s38(y38.m24933a(componentType), kSerializerM21623e0);
        }
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof WildcardType)) {
                StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
                sb.append(type);
                uk9.m22778m(sb, " has type ", y38.m24933a(type.getClass()));
                return null;
            }
            Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
            upperBounds2.getClass();
            Object objM20838f0 = AbstractC3550rv.m20838f0(upperBounds2);
            objM20838f0.getClass();
            return m21623e0(w41Var, (Type) objM20838f0, true);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        rawType2.getClass();
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        if (z) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                type3.getClass();
                arrayList.add(AbstractC3423or.m18245b0(w41Var, type3));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type4 : actualTypeArguments) {
                type4.getClass();
                w41Var.getClass();
                KSerializer kSerializerM21623e2 = m21623e0(w41Var, type4, false);
                if (kSerializerM21623e2 != null) {
                    arrayList.add(kSerializerM21623e2);
                }
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer = (KSerializer) arrayList.get(0);
            kSerializer.getClass();
            return new ke5(kSerializer);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer2 = (KSerializer) arrayList.get(0);
            kSerializer2.getClass();
            return new C2978ev(kSerializer2);
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return thb.m22043b((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
            kSerializer3.getClass();
            kSerializer4.getClass();
            return new vp5(kSerializer3, kSerializer4, 0);
        }
        if (Pair.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
            kSerializer5.getClass();
            kSerializer6.getClass();
            return new vp5(kSerializer5, kSerializer6, 1);
        }
        if (Triple.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer7 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer8 = (KSerializer) arrayList.get(1);
            KSerializer kSerializer9 = (KSerializer) arrayList.get(2);
            kSerializer7.getClass();
            kSerializer8.getClass();
            kSerializer9.getClass();
            return new hca(kSerializer7, kSerializer8, kSerializer9);
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        for (KSerializer kSerializer10 : arrayList) {
            kSerializer10.getClass();
            arrayList2.add(kSerializer10);
        }
        return m21621d0(w41Var, cls2, arrayList2);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final x17 m21624f(float f, float f2, float f3, float f4) {
        return new x17(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: f0 */
    public static String m21625f0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m21603N(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m21603N(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX INFO: renamed from: g */
    public static x17 m21626g(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return new x17(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: g0 */
    public static String m21627g0(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public static C3300lj m21628h(String str, vx9 vx9Var, long j, fb2 fb2Var, wa3 wa3Var, int i, int i2) {
        EmptyList emptyList = EmptyList.f47638a;
        return new C3300lj(new C3462pj(str, vx9Var, emptyList, emptyList, wa3Var, fb2Var), i, 1, j);
    }

    /* JADX INFO: renamed from: h0 */
    public static final Object m21629h0(Object obj) {
        e34 e34Var;
        i34 i34Var = obj instanceof i34 ? (i34) obj : null;
        return (i34Var == null || (e34Var = i34Var.f43399a) == null) ? obj : e34Var;
    }

    /* JADX INFO: renamed from: i */
    public static final void m21630i(f95 f95Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        int i3 = f95Var.f38673g;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-7166893);
        int i4 = (tj3Var.m22120g(f95Var) ? 4 : 2) | i | (tj3Var.m22120g(e16Var) ? 32 : 16);
        if (tj3Var.m22099R(i4 & 1, (i4 & 19) != 18)) {
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            bq1.m4042R(AbstractC3423or.m18236U(ss5.m21728z(i3), tj3Var, 0), null, wq1.m24108d(tj3Var, b16Var, 32.0f), null, null, 0.0f, null, tj3Var, 56, 120);
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_coin_lingq, tj3Var, 0), null, wq1.m24108d(tj3Var, b16Var, 16.0f), null, null, 0.0f, new qd0(5, ss5.m21677B(i3)), tj3Var, 56, 56);
            tj3Var.m22139q(true);
            String strM23618Z = vz1.m23618Z(com.lingq.core.achievements.R$string.stats_coins_goal, new Object[]{Integer.valueOf(f95Var.f38669c), Integer.valueOf(f95Var.f38670d)}, tj3Var);
            tj3Var.m22111b0(-247999021);
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            sb.append(strM23618Z);
            int i5 = 8;
            arrayList.add(new C3304ln(new he9(0L, p58.m18902j(tj3Var).f71404h.f66065a.f42265b, bc3.f8322h, p58.m18902j(tj3Var).f71404h.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65521), 0, vk9.m23371G0(strM23618Z, "/").length(), i5));
            arrayList.add(new C3304ln(new he9(0L, p58.m18902j(tj3Var).f71407k.f66065a.f42265b, bc3.f8321g, p58.m18902j(tj3Var).f71407k.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65521), vk9.m23371G0(strM23618Z, "/").length(), strM23618Z.length(), i5));
            String string = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList2.add(((C3304ln) arrayList.get(i6)).m16392a(sb.length()));
            }
            C3419on c3419on = new C3419on(string, arrayList2);
            tj3Var.m22139q(false);
            i2 = 1;
            lw9.m16555c(c3419on, c99.m4430w(b16Var, null, 3), 0L, null, 0L, null, null, 0L, new ks9(5), 0L, 2, false, 1, 0, null, null, p58.m18902j(tj3Var).f71407k, tj3Var, 48, 24960, 240636);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            i2 = 1;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ga5(f95Var, e16Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static Object m21631i0(zi3 zi3Var, Object obj, final Continuation continuation) {
        zi3Var.getClass();
        final kn1 context = continuation.getContext();
        Object obj2 = context == EmptyCoroutineContext.f47685a ? new RestrictedContinuationImpl(continuation) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuation);
                continuation.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj3) throws Throwable {
                AbstractC3193b.m15359b(obj3);
                return obj3;
            }
        } : new ContinuationImpl(context, continuation) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2
            {
                continuation.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj3) throws Throwable {
                AbstractC3193b.m15359b(obj3);
                return obj3;
            }
        };
        lda.m16119e(2, zi3Var);
        return zi3Var.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: j */
    public static final void m21632j(f95 f95Var, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1612958085);
        int i2 = (tj3Var.m22120g(f95Var) ? 4 : 2) | i | (tj3Var.m22120g(e16Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            b16 b16Var = b16.f7762a;
            lw9.m16554b("🎧", c99.m4430w(b16Var, null, 3), 0L, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 54, 0, 130044);
            tj3Var.m22111b0(1369174803);
            C3341mn c3341mn = new C3341mn();
            String str = String.format("%s ", Arrays.copyOf(new Object[]{f95Var.f38672f}, 1));
            c3341mn.m16929d(str);
            c3341mn.m16927b(new he9(0L, p58.m18902j(tj3Var).f71404h.f66065a.f42265b, bc3.f8322h, p58.m18902j(tj3Var).f71404h.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65521), 0, str.length());
            String strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.stats_hours);
            c3341mn.m16929d(strM23620a0);
            c3341mn.m16927b(new he9(0L, p58.m18902j(tj3Var).f71407k.f66065a.f42265b, bc3.f8321g, p58.m18902j(tj3Var).f71407k.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65521), str.length(), strM23620a0.length() + str.length());
            C3419on c3419onM16933h = c3341mn.m16933h();
            tj3Var.m22139q(false);
            lw9.m16555c(c3419onM16933h, c99.m4430w(b16Var, null, 3), 0L, null, 0L, null, null, 0L, new ks9(5), 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var).f71407k, tj3Var, 48, 0, 261116);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ha5(f95Var, e16Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m21633k(f95 f95Var, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(120167744);
        int i2 = (tj3Var.m22120g(f95Var) ? 4 : 2) | i | (tj3Var.m22120g(e16Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            b16 b16Var = b16.f7762a;
            e16 e16VarM24108d = wq1.m24108d(tj3Var, b16Var, 32.0f);
            int i3 = f95Var.f38669c;
            int i4 = f95Var.f38670d;
            a5d.m126a(e16VarM24108d, i3, i4, i4 == 0, true, 0.0f, tj3Var, 24576, 32);
            tj3Var.m22111b0(1914240117);
            C3341mn c3341mn = new C3341mn();
            String str = String.format("%d ", Arrays.copyOf(new Object[]{Integer.valueOf(f95Var.f38668b)}, 1));
            c3341mn.m16929d(str);
            c3341mn.m16927b(new he9(0L, p58.m18902j(tj3Var).f71404h.f66065a.f42265b, bc3.f8322h, p58.m18902j(tj3Var).f71404h.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65521), 0, str.length());
            String strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.feature.library.R$string.stats_day_streak);
            c3341mn.m16929d(strM23620a0);
            c3341mn.m16927b(new he9(0L, p58.m18902j(tj3Var).f71407k.f66065a.f42265b, bc3.f8321g, p58.m18902j(tj3Var).f71407k.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65521), str.length(), strM23620a0.length() + str.length());
            C3419on c3419onM16933h = c3341mn.m16933h();
            tj3Var.m22139q(false);
            lw9.m16555c(c3419onM16933h, c99.m4430w(b16Var, null, 3), 0L, null, 0L, null, null, 0L, new ks9(5), 0L, 2, false, 1, 0, null, null, p58.m18902j(tj3Var).f71407k, tj3Var, 48, 24960, 240636);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ga5(f95Var, e16Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m21634l(f95 f95Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-753755799);
        int i3 = (tj3Var.m22120g(f95Var) ? 4 : 2) | i | (tj3Var.m22120g(e16Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            b16 b16Var = b16.f7762a;
            i2 = 1;
            lw9.m16554b("📖", c99.m4430w(b16Var, null, 3), 0L, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 54, 0, 130044);
            tj3Var.m22111b0(1151844477);
            C3341mn c3341mn = new C3341mn();
            String str = String.format("%d ", Arrays.copyOf(new Object[]{Integer.valueOf(f95Var.f38671e)}, 1));
            c3341mn.m16929d(str);
            c3341mn.m16927b(new he9(0L, p58.m18902j(tj3Var).f71404h.f66065a.f42265b, bc3.f8322h, p58.m18902j(tj3Var).f71404h.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65521), 0, str.length());
            String strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.stats_words);
            c3341mn.m16929d(strM23620a0);
            c3341mn.m16927b(new he9(0L, p58.m18902j(tj3Var).f71407k.f66065a.f42265b, bc3.f8321g, p58.m18902j(tj3Var).f71407k.f66065a.f42267d, null, null, null, 0L, null, null, null, 0L, null, null, 65521), str.length(), strM23620a0.length() + str.length());
            C3419on c3419onM16933h = c3341mn.m16933h();
            tj3Var.m22139q(false);
            lw9.m16555c(c3419onM16933h, c99.m4430w(b16Var, null, 3), 0L, null, 0L, null, null, 0L, new ks9(5), 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var).f71407k, tj3Var, 48, 0, 261116);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            i2 = 1;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ha5(f95Var, e16Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x010a  */
    /* JADX INFO: renamed from: m */
    public static final void m21635m(boolean z, ResolvedTextDirection resolvedTextDirection, C0205f c0205f, ye1 ye1Var, int i) {
        int i2;
        float fM19551h;
        sw9 sw9VarM25363d;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22116e(resolvedTextDirection.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(c0205f) ? 256 : 128;
        }
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 14;
            boolean zM22120g = (i4 == 4) | tj3Var.m22120g(c0205f);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new ov9(c0205f, z);
                tj3Var.m22131l0(objM22097O);
            }
            xt9 xt9Var = (xt9) objM22097O;
            boolean zM22124i = (i4 == 4) | tj3Var.m22124i(c0205f);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new qv9(c0205f, z);
                tj3Var.m22131l0(objM22097O2);
            }
            oq6 oq6Var = (oq6) objM22097O2;
            boolean zM9925g = cx9.m9925g(c0205f.m1114o().f65991b);
            int i5 = (int) (z ? c0205f.m1114o().f65991b >> 32 : c0205f.m1114o().f65991b & 4294967295L);
            yw4 yw4Var = c0205f.f3079d;
            if (yw4Var == null || (sw9VarM25363d = yw4Var.m25363d()) == null) {
                fM19551h = 0.0f;
            } else {
                rw9 rw9Var = sw9VarM25363d.f61519a;
                if (i5 >= 0) {
                    qw9 qw9Var = rw9Var.f59975a;
                    w46 w46Var = rw9Var.f59976b;
                    if (qw9Var.f58295a.f54604b.length() == 0) {
                        fM19551h = 0.0f;
                    } else {
                        int iMin = Math.min(w46Var.m23743d(i5), Math.min(w46Var.f66377b - 1, w46Var.f66381f - 1));
                        if (i5 > w46Var.m23742c(iMin, false)) {
                            fM19551h = 0.0f;
                        } else {
                            w46Var.m23750m(iMin);
                            ArrayList arrayList = w46Var.f66383h;
                            f37 f37Var = (f37) arrayList.get(ci8.m4738w(iMin, arrayList));
                            fM19551h = f37Var.f38358a.f49728d.m19551h(iMin - f37Var.f38361d);
                        }
                    }
                } else {
                    fM19551h = 0.0f;
                }
            }
            boolean zM22124i2 = tj3Var.m22124i(xt9Var);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O3 == p84Var) {
                objM22097O3 = new gv9(xt9Var, i3);
                tj3Var.m22131l0(objM22097O3);
            }
            bq1.m4045U(oq6Var, z, resolvedTextDirection, zM9925g, 0L, fM19551h, mo9.m16957a(b16.f7762a, xt9Var, (PointerInputEventHandler) objM22097O3), tj3Var, (i2 << 3) & 1008);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3493qd(z, resolvedTextDirection, c0205f, i);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final float m21636n(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m21637o(C0423c c0423c) {
        return !c0423c.m1849k().f48471a.m17251c(AbstractC0424d.f5003j);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m21638p(C0423c c0423c, Resources resources) {
        List list = (List) AbstractC0422b.m1838a(c0423c.f4974d, AbstractC0424d.f4994a);
        return !xwc.m24735H(c0423c) && (c0423c.f4974d.f48473c || (c0423c.m1854p() && ((list != null ? (String) u91.m22591I0(list) : null) != null || m21597H(c0423c) != null || m21596G(c0423c, resources) != null || m21595F(c0423c))));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX INFO: renamed from: q */
    public static final float m21639q(AbstractC0343j abstractC0343j, boolean z, kv3[] kv3VarArr, float f) {
        float f2 = Float.NaN;
        for (kv3 kv3Var : kv3VarArr) {
            float fMo1527c = abstractC0343j.mo1527c(kv3Var);
            if (Float.isNaN(f2)) {
                f2 = fMo1527c;
            } else if (z == (fMo1527c > f2)) {
                f2 = fMo1527c;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    /* JADX INFO: renamed from: r */
    public static final void m21640r(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m21641s(lh9 lh9Var, int i, AbstractC3096i1 abstractC3096i1, boolean z) {
        boolean z2;
        synchronized (f61285l) {
            try {
                int i2 = lh9Var.f49673d;
                if (i2 == i) {
                    lh9Var.f49672c = abstractC3096i1;
                    z2 = true;
                    if (z) {
                        lh9Var.f49674e++;
                    }
                    lh9Var.f49673d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: t */
    public static final float m21642t(t17 t17Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? t17Var.mo14020c(layoutDirection) : t17Var.mo14019b(layoutDirection);
    }

    /* JADX INFO: renamed from: u */
    public static final float m21643u(t17 t17Var, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? t17Var.mo14019b(layoutDirection) : t17Var.mo14020c(layoutDirection);
    }

    /* JADX INFO: renamed from: w */
    public static float m21644w(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    /* JADX INFO: renamed from: x */
    public static int m21645x(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: y */
    public static final void m21646y(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                lda.m16117c(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static Continuation m21647z(final zi3 zi3Var, final Object obj, final Continuation continuation) {
        zi3Var.getClass();
        continuation.getClass();
        if (zi3Var instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) zi3Var).create(obj, continuation);
        }
        final kn1 context = continuation.getContext();
        return context == EmptyCoroutineContext.f47685a ? new RestrictedContinuationImpl(obj, continuation) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3

            /* JADX INFO: renamed from: a */
            public int f47686a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Object f47688c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(continuation);
                continuation.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj2) throws Throwable {
                int i = this.f47686a;
                if (i != 0) {
                    if (i != 1) {
                        C3386nv.m17633t("This coroutine had already completed");
                        return null;
                    }
                    this.f47686a = 2;
                    AbstractC3193b.m15359b(obj2);
                    return obj2;
                }
                this.f47686a = 1;
                AbstractC3193b.m15359b(obj2);
                zi3 zi3Var2 = this.f47687b;
                zi3Var2.getClass();
                lda.m16119e(2, zi3Var2);
                return zi3Var2.invoke(this.f47688c, this);
            }
        } : new ContinuationImpl(continuation, context, zi3Var, obj) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4

            /* JADX INFO: renamed from: a */
            public int f47689a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ zi3 f47690b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Object f47691c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, continuation);
                this.f47690b = zi3Var;
                this.f47691c = obj;
                continuation.getClass();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj2) throws Throwable {
                int i = this.f47689a;
                if (i != 0) {
                    if (i != 1) {
                        C3386nv.m17633t("This coroutine had already completed");
                        return null;
                    }
                    this.f47689a = 2;
                    AbstractC3193b.m15359b(obj2);
                    return obj2;
                }
                this.f47689a = 1;
                AbstractC3193b.m15359b(obj2);
                zi3 zi3Var2 = this.f47690b;
                zi3Var2.getClass();
                lda.m16119e(2, zi3Var2);
                return zi3Var2.invoke(this.f47691c, this);
            }
        };
    }

    /* JADX INFO: renamed from: Q */
    public abstract void mo21648Q(int i);

    /* JADX INFO: renamed from: R */
    public abstract void mo21649R(Typeface typeface);

    /* JADX INFO: renamed from: v */
    public void m21650v(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC2971eo(this, i, 5));
    }
}
