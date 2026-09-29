package p260m8;

import ae.C0062b;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import androidx.activity.result.C0204c;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.TypographyKt;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.framework.FrameworkSQLiteOpenHelper;
import androidx.view.C1052r;
import androidx.view.InterfaceC1051q;
import androidx.view.LifecycleCoroutineScopeImpl;
import bo.C1629g;
import cc.C1985y2;
import cc.InterfaceC1967w2;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import co.InterfaceC2075g;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.internal.measurement.C2592a9;
import com.lingq.util.CoroutineJobManager;
import dm.C5201a;
import dm.C5206f;
import dm.C5207g;
import fo.C5600f;
import gn.InterfaceC5824d;
import in.AbstractC6364h;
import in.C6373q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import jm.C6525h;
import jm.C6526i;
import jo.C6532d;
import kh.C6675b;
import kn.InterfaceC6733c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.p228io.C6763a;
import kotlin.random.Random;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6821b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.C6994e;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.text.C7076b;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C7155e;
import kotlinx.coroutines.internal.C7162l;
import kotlinx.coroutines.internal.C7166p;
import kotlinx.coroutines.internal.C7168r;
import kotlinx.coroutines.scheduling.C7178b;
import kotlinx.coroutines.sync.C7197a;
import mm.AbstractC7640c;
import mm.AbstractC7642e;
import mm.C7641d;
import mm.C7643f;
import mm.InterfaceC7638a;
import mm.InterfaceC7639b;
import mn.C7645b;
import mn.C7648e;
import mo.C7653a;
import mo.C7661i;
import no.C7832g0;
import no.C7844k0;
import no.C7851m1;
import no.C7865r0;
import no.C7879x0;
import no.InterfaceC7862q0;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import om.C8085b;
import org.json.JSONObject;
import p003a2.C0009a;
import p036c0.C1648d;
import p036c0.C1655k;
import p036c0.C1656l;
import p040c4.C1690o;
import p040c4.C1691p;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5336s0;
import p102eo.AbstractC5439d;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5745a;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5853g;
import p139go.InterfaceC5856j;
import p139go.InterfaceC5858l;
import p212k3.AbstractC6579a;
import p213k4.ExecutorC6598r;
import p214k5.C6610l;
import p214k5.C6617s;
import p216k7.C6627b;
import p247lm.AbstractC7389b;
import p247lm.C7397j;
import p247lm.C7398k;
import p248ln.AbstractC7403d;
import p248ln.C7407h;
import p259m7.C7493a;
import p262mb.InterfaceC7528a;
import p266n.C7669f;
import p288o4.InterfaceC7917c;
import p291o7.C8004n;
import p306on.C8096e;
import p338qd.C8573r0;
import p361ra.C8758f;
import p372rm.AbstractC8852n;
import p372rm.AbstractC8859q0;
import p372rm.C8850m;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8831c0;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p372rm.InterfaceC8855o0;
import p372rm.InterfaceC8865w;
import p375s0.C8940b;
import p375s0.C8941c;
import p385sf.C9000b;
import p420um.AbstractC9557b;
import p464wl.InterfaceC9968c;
import p479xa.C10134c0;
import p504y9.C10317j;
import p516ym.InterfaceC10418c;
import p543do.AbstractC5244m0;
import p543do.AbstractC5249p;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5242l0;
import p543do.C5247o;
import p543do.C5258t0;
import pn.C8413d;
import pn.C8414e;
import sl.C9072e;
import tl.C9325m;
import tl.C9327o;
import zm.C10527l;

/* JADX INFO: renamed from: m8.b */
/* JADX INFO: loaded from: classes.dex */
public class C7499b implements InterfaceC1967w2, InterfaceC2075g, InterfaceC5745a, InterfaceC7528a, InterfaceC7917c.c {

    /* JADX INFO: renamed from: H */
    public static final C7168r f41418H;

    /* JADX INFO: renamed from: I */
    public static final C7168r f41419I;

    /* JADX INFO: renamed from: J */
    public static final C7168r f41420J;

    /* JADX INFO: renamed from: K */
    public static final C7168r f41421K;

    /* JADX INFO: renamed from: L */
    public static final C7168r f41422L;

    /* JADX INFO: renamed from: M */
    public static final C7844k0 f41423M;

    /* JADX INFO: renamed from: N */
    public static final C7844k0 f41424N;

    /* JADX INFO: renamed from: O */
    public static final C7499b f41425O;

    /* JADX INFO: renamed from: d */
    public static C8573r0 f41429d;

    /* JADX INFO: renamed from: h */
    public static final C7168r f41433h;

    /* JADX INFO: renamed from: i */
    public static final C7168r f41434i;

    /* JADX INFO: renamed from: j */
    public static final C7197a f41435j;

    /* JADX INFO: renamed from: k */
    public static final C7197a f41436k;

    /* JADX INFO: renamed from: l */
    public static final C7499b f41437l;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C7499b f41426a = new C7499b();

    /* JADX INFO: renamed from: b */
    public static final C7499b f41427b = new C7499b();

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C7499b f41428c = new C7499b();

    /* JADX INFO: renamed from: e */
    public static final C7168r f41430e = new C7168r("NO_DECISION");

    /* JADX INFO: renamed from: f */
    public static final C7168r f41431f = new C7168r("RETRY_ATOMIC");

    /* JADX INFO: renamed from: g */
    public static final C7168r f41432g = new C7168r("UNLOCK_FAIL");

    static {
        C7168r c7168r = new C7168r("LOCKED");
        f41433h = c7168r;
        C7168r c7168r2 = new C7168r("UNLOCKED");
        f41434i = c7168r2;
        f41435j = new C7197a(c7168r);
        f41436k = new C7197a(c7168r2);
        f41437l = new C7499b();
        f41418H = new C7168r("COMPLETING_ALREADY");
        f41419I = new C7168r("COMPLETING_WAITING_CHILDREN");
        f41420J = new C7168r("COMPLETING_RETRY");
        f41421K = new C7168r("TOO_LATE_TO_CANCEL");
        f41422L = new C7168r("SEALED");
        f41423M = new C7844k0(false);
        f41424N = new C7844k0(true);
        f41425O = new C7499b();
    }

    /* JADX INFO: renamed from: A */
    public static final C6610l m14892A(C6617s c6617s) {
        C5207g.m11111f(c6617s, "<this>");
        return new C6610l(c6617s.f37524a, c6617s.f37543t);
    }

    /* JADX INFO: renamed from: A0 */
    public static String m14893A0(int i10) {
        return C10134c0.m19045l("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d));
    }

    /* JADX INFO: renamed from: B */
    public static final Object m14894B(KPropertyImpl.AbstractC6780a abstractC6780a) {
        C5207g.m11111f(abstractC6780a, "<this>");
        KPropertyImpl kPropertyImplMo13509j = abstractC6780a.mo13509j();
        return m14947k(kPropertyImplMo13509j.f38256e, kPropertyImplMo13509j.mo13488e());
    }

    /* JADX INFO: renamed from: B0 */
    public static final AbstractC8852n m14895B0(AbstractC8859q0 abstractC8859q0) {
        C5207g.m11111f(abstractC8859q0, "<this>");
        AbstractC8852n abstractC8852nM17104g = (AbstractC8852n) C10527l.f52523d.get(abstractC8859q0);
        if (abstractC8852nM17104g == null) {
            abstractC8852nM17104g = C8850m.m17104g(abstractC8859q0);
        }
        return abstractC8852nM17104g;
    }

    /* JADX INFO: renamed from: C */
    public static final C7645b m14896C(InterfaceC6733c interfaceC6733c, int i10) {
        C5207g.m11111f(interfaceC6733c, "<this>");
        return C7645b.m15202f(interfaceC6733c.mo13352b(i10), interfaceC6733c.mo13353c(i10));
    }

    /* JADX INFO: renamed from: C0 */
    public static final Class m14897C0(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        Class clsM14899D0 = m14899D0(abstractC5257t.mo11250X0().mo11235q());
        if (clsM14899D0 == null) {
            return null;
        }
        if (!C5258t0.m11296g(abstractC5257t)) {
            return clsM14899D0;
        }
        AbstractC5265x abstractC5265xM16468e = C8414e.m16468e(abstractC5257t);
        if (abstractC5265xM16468e == null) {
            return null;
        }
        if (C5258t0.m11296g(abstractC5265xM16468e) || AbstractC6795c.m13535H(abstractC5265xM16468e)) {
            return null;
        }
        return clsM14899D0;
    }

    /* JADX INFO: renamed from: D */
    public static C1648d m14898D(InterfaceC0476a interfaceC0476a) {
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        return (C1648d) interfaceC0476a.mo1648p(ColorSchemeKt.f2735a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: D0 */
    public static final Class m14899D0(InterfaceC8838g interfaceC8838g) {
        if (!(interfaceC8838g instanceof InterfaceC8830c) || !C8414e.m16465b(interfaceC8838g)) {
            return null;
        }
        InterfaceC8830c interfaceC8830c = (InterfaceC8830c) interfaceC8838g;
        Class<?> clsM14797h = C7398k.m14797h(interfaceC8830c);
        if (clsM14797h != null) {
            return clsM14797h;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + interfaceC8830c.mo11874a() + " cannot be found (classId=" + DescriptorUtilsKt.m14109f((InterfaceC8834e) interfaceC8838g) + ')');
    }

    /* JADX INFO: renamed from: E */
    public static final AbstractC5257t m14900E(CallableMemberDescriptor callableMemberDescriptor) {
        InterfaceC8835e0 interfaceC8835e0Mo11896s0 = callableMemberDescriptor.mo11896s0();
        InterfaceC8835e0 interfaceC8835e0Mo11892m0 = callableMemberDescriptor.mo11892m0();
        if (interfaceC8835e0Mo11896s0 != null) {
            return interfaceC8835e0Mo11896s0.mo11884c();
        }
        if (interfaceC8835e0Mo11892m0 != null) {
            if (callableMemberDescriptor instanceof InterfaceC6821b) {
                return interfaceC8835e0Mo11892m0.mo11884c();
            }
            InterfaceC8838g interfaceC8838gMo11876g = callableMemberDescriptor.mo11876g();
            InterfaceC8830c interfaceC8830c = interfaceC8838gMo11876g instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8838gMo11876g : null;
            if (interfaceC8830c != null) {
                return interfaceC8830c.mo5316v();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: E0 */
    public static final Map m14901E0(Map map) {
        C5207g.m11111f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C5207g.m11110e(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: F */
    public static final Object m14902F(GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.C6985e c6985e) {
        C5207g.m11111f(extendableMessage, "<this>");
        C5207g.m11111f(c6985e, "extension");
        if (extendableMessage.m13922s(c6985e)) {
            return extendableMessage.m13921r(c6985e);
        }
        return null;
    }

    /* JADX INFO: renamed from: F0 */
    public static String m14903F0(int i10) {
        if (i10 == 0) {
            return "Blocking";
        }
        if (i10 == 1) {
            return "Optional";
        }
        if (i10 == 2) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: G */
    public static final Object m14904G(GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.C6985e c6985e, int i10) {
        C5207g.m11111f(extendableMessage, "<this>");
        extendableMessage.m13926y(c6985e);
        C6994e<GeneratedMessageLite.C6984d> c6994e = extendableMessage.f39488a;
        c6994e.getClass();
        GeneratedMessageLite.C6984d c6984d = c6985e.f39504d;
        if (!c6984d.f39499d) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objM13968e = c6994e.m13968e(c6984d);
        if (i10 >= (objM13968e == null ? 0 : ((List) objM13968e).size())) {
            return null;
        }
        extendableMessage.m13926y(c6985e);
        if (!c6984d.f39499d) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objM13968e2 = c6994e.m13968e(c6984d);
        if (objM13968e2 != null) {
            return c6985e.m13933a(((List) objM13968e2).get(i10));
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: G0 */
    public static void m14905G0(float[] fArr, float f3, float f10) {
        float f11 = (fArr[8] * 0.0f) + (fArr[4] * f10) + (fArr[0] * f3) + fArr[12];
        float f12 = (fArr[9] * 0.0f) + (fArr[5] * f10) + (fArr[1] * f3) + fArr[13];
        float f13 = (fArr[10] * 0.0f) + (fArr[6] * f10) + (fArr[2] * f3) + fArr[14];
        float f14 = (fArr[11] * 0.0f) + (fArr[7] * f10) + (fArr[3] * f3) + fArr[15];
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        fArr[15] = f14;
    }

    /* JADX INFO: renamed from: H */
    public static final LifecycleCoroutineScopeImpl m14906H(InterfaceC1051q interfaceC1051q) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z10;
        C5207g.m11111f(interfaceC1051q, "<this>");
        C1052r c1052rMo786G = interfaceC1051q.mo786G();
        C5207g.m11111f(c1052rMo786G, "<this>");
        do {
            AtomicReference<Object> atomicReference = c1052rMo786G.f6521a;
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl == null) {
                C7851m1 c7851m1M380p = C0062b.m380p();
                C7178b c7178b = C7832g0.f42930a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(c1052rMo786G, c7851m1M380p.mo1471C(C7162l.f40438a.mo14316C1()));
                while (true) {
                    if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReference.get() != null) {
                        z10 = false;
                        break;
                    }
                }
            }
            return lifecycleCoroutineScopeImpl;
        } while (!z10);
        lifecycleCoroutineScopeImpl.m3891f();
        return lifecycleCoroutineScopeImpl;
    }

    /* JADX INFO: renamed from: H0 */
    public static final Object m14907H0(Object obj) {
        InterfaceC7862q0 interfaceC7862q0;
        C7865r0 c7865r0 = obj instanceof C7865r0 ? (C7865r0) obj : null;
        if (c7865r0 != null && (interfaceC7862q0 = c7865r0.f42958a) != null) {
            return interfaceC7862q0;
        }
        return obj;
    }

    /* JADX INFO: renamed from: I */
    public static String m14908I(CleverTapInstanceConfig cleverTapInstanceConfig) {
        return C0009a.m23l(new StringBuilder(), cleverTapInstanceConfig != null ? cleverTapInstanceConfig.f10995a : "", "[Product Config]");
    }

    /* JADX INFO: renamed from: I0 */
    public static final boolean m14909I0(PublicKey publicKey, String str, String str2) {
        C5207g.m11111f(str, "data");
        C5207g.m11111f(str2, "signature");
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(C7653a.f42116b);
            C5207g.m11110e(bytes, "(this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            byte[] bArrDecode = Base64.decode(str2, 8);
            C5207g.m11110e(bArrDecode, "decode(signature, Base64.URL_SAFE)");
            return signature.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: J */
    public static final C7648e m14910J(InterfaceC6733c interfaceC6733c, int i10) {
        C5207g.m11111f(interfaceC6733c, "<this>");
        return C7648e.m15231i(interfaceC6733c.mo13351a(i10));
    }

    /* JADX INFO: renamed from: J0 */
    public static String m14911J0(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e10);
                    StringBuilder sbM854m = C0204c.m854m("<", str2, " threw ");
                    sbM854m.append(e10.getClass().getName());
                    sbM854m.append(">");
                    string = sbM854m.toString();
                }
            }
            objArr[i11] = string;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: K */
    public static final PublicKey m14912K(String str) throws InvalidKeySpecException {
        byte[] bArrDecode = Base64.decode(C7661i.m15254T2(C7661i.m15254T2(C7661i.m15254T2(str, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
        C5207g.m11110e(bArrDecode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        C5207g.m11110e(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ boolean m14913K0(String str, Object obj) {
        boolean z10;
        if (str != obj) {
            z10 = false;
            if (str != null) {
                if (!str.equals(obj)) {
                    return false;
                }
                z10 = true;
            }
        } else {
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: L */
    public static final CoroutineDispatcher m14914L(RoomDatabase roomDatabase) {
        C5207g.m11111f(roomDatabase, "<this>");
        Map<String, Object> map = roomDatabase.f7520k;
        Object objM313U0 = map.get("QueryDispatcher");
        if (objM313U0 == null) {
            Executor executor = roomDatabase.f7511b;
            if (executor == null) {
                C5207g.m11117l("internalQueryExecutor");
                throw null;
            }
            objM313U0 = C0062b.m313U0(executor);
            map.put("QueryDispatcher", objM313U0);
        }
        return (CoroutineDispatcher) objM313U0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: M */
    public static final String m14915M(final String str) {
        C5207g.m11111f(str, "kid");
        C8004n c8004n = C8004n.f43550a;
        final URL url = new URL("https", C5207g.m11116k(C8004n.f43569t, "www."), "/.well-known/oauth/openid/keys/");
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        C8004n.m15873c().execute(new Runnable() { // from class: m8.a
            /* JADX WARN: Type inference failed for: r8v7, types: [T, java.lang.String] */
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                Condition condition = conditionNewCondition;
                URL url2 = url;
                C5207g.m11111f(url2, "$openIdKeyUrl");
                Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                C5207g.m11111f(ref$ObjectRef2, "$result");
                String str2 = str;
                C5207g.m11111f(str2, "$kid");
                ReentrantLock reentrantLock2 = reentrantLock;
                C5207g.m11111f(reentrantLock2, "$lock");
                URLConnection uRLConnectionOpenConnection = url2.openConnection();
                if (uRLConnectionOpenConnection == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        C5207g.m11110e(inputStream, "connection.inputStream");
                        Reader inputStreamReader = new InputStreamReader(inputStream, C7653a.f42116b);
                        String strM13477b = C6763a.m13477b(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                        httpURLConnection.getInputStream().close();
                        ref$ObjectRef2.f38127a = new JSONObject(strM13477b).optString(str2);
                        httpURLConnection.disconnect();
                        reentrantLock2.lock();
                        try {
                            condition.signal();
                            C9072e c9072e = C9072e.f47360a;
                        } catch (Throwable th2) {
                            reentrantLock2.unlock();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        httpURLConnection.disconnect();
                        reentrantLock2.lock();
                        try {
                            condition.signal();
                            C9072e c9072e2 = C9072e.f47360a;
                            reentrantLock2.unlock();
                            throw th3;
                        } catch (Throwable th4) {
                            reentrantLock2.unlock();
                            throw th4;
                        }
                    }
                } catch (Exception e10) {
                    String name = C7499b.class.getName();
                    String message = e10.getMessage();
                    if (message == null) {
                        message = "Error getting public key";
                    }
                    Log.d(name, message);
                    httpURLConnection.disconnect();
                    reentrantLock2.lock();
                    try {
                        condition.signal();
                        C9072e c9072e3 = C9072e.f47360a;
                    } catch (Throwable th5) {
                        reentrantLock2.unlock();
                        throw th5;
                    }
                }
                reentrantLock2.unlock();
            }
        });
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) ref$ObjectRef.f38127a;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: N */
    public static C1655k m14916N(InterfaceC0476a interfaceC0476a) {
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        return (C1655k) interfaceC0476a.mo1648p(ShapesKt.f2783a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: O */
    public static final CoroutineDispatcher m14917O(RoomDatabase roomDatabase) {
        C5207g.m11111f(roomDatabase, "<this>");
        Map<String, Object> map = roomDatabase.f7520k;
        Object objM313U0 = map.get("TransactionDispatcher");
        if (objM313U0 == null) {
            ExecutorC6598r executorC6598r = roomDatabase.f7512c;
            if (executorC6598r == null) {
                C5207g.m11117l("internalTransactionExecutor");
                throw null;
            }
            objM313U0 = C0062b.m313U0(executorC6598r);
            map.put("TransactionDispatcher", objM313U0);
        }
        return (CoroutineDispatcher) objM313U0;
    }

    /* JADX INFO: renamed from: P */
    public static C1656l m14918P(InterfaceC0476a interfaceC0476a) {
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        return (C1656l) interfaceC0476a.mo1648p(TypographyKt.f2857a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: Q */
    public static final Method m14919Q(Class cls, CallableMemberDescriptor callableMemberDescriptor) {
        C5207g.m11111f(callableMemberDescriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            C5207g.m11110e(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    /* JADX INFO: renamed from: R */
    public static boolean m14920R(TypeCheckerState typeCheckerState, InterfaceC5853g interfaceC5853g, TypeCheckerState.AbstractC7055b abstractC7055b) {
        boolean z10;
        C5207g.m11111f(typeCheckerState, "<this>");
        C5207g.m11111f(interfaceC5853g, "type");
        C5207g.m11111f(abstractC7055b, "supertypesPolicy");
        InterfaceC5858l interfaceC5858l = typeCheckerState.f39884c;
        if (!((interfaceC5858l.mo11039F(interfaceC5853g) && !interfaceC5858l.mo11083k(interfaceC5853g)) || interfaceC5858l.mo11048O(interfaceC5853g))) {
            typeCheckerState.m14192c();
            ArrayDeque<InterfaceC5853g> arrayDeque = typeCheckerState.f39888g;
            C5207g.m11108c(arrayDeque);
            C6532d c6532d = typeCheckerState.f39889h;
            C5207g.m11108c(c6532d);
            arrayDeque.push(interfaceC5853g);
            while (!arrayDeque.isEmpty()) {
                if (c6532d.f37195b > 1000) {
                    throw new IllegalStateException(("Too many supertypes for type: " + interfaceC5853g + ". Supertypes = " + C6752c.m13430X(c6532d, null, null, null, null, 63)).toString());
                }
                InterfaceC5853g interfaceC5853gPop = arrayDeque.pop();
                C5207g.m11110e(interfaceC5853gPop, "current");
                if (c6532d.add(interfaceC5853gPop)) {
                    TypeCheckerState.AbstractC7055b abstractC7055b2 = interfaceC5858l.mo11083k(interfaceC5853gPop) ? TypeCheckerState.AbstractC7055b.c.f39892a : abstractC7055b;
                    if (!(!C5207g.m11106a(abstractC7055b2, TypeCheckerState.AbstractC7055b.c.f39892a))) {
                        abstractC7055b2 = null;
                    }
                    if (abstractC7055b2 != null) {
                        Iterator<InterfaceC5852f> it = interfaceC5858l.mo11081i0(interfaceC5858l.mo11077h(interfaceC5853gPop)).iterator();
                        while (it.hasNext()) {
                            InterfaceC5853g interfaceC5853gMo11656a = abstractC7055b2.mo11656a(typeCheckerState, it.next());
                            if (!interfaceC5858l.mo11039F(interfaceC5853gMo11656a) || interfaceC5858l.mo11083k(interfaceC5853gMo11656a)) {
                                z10 = interfaceC5858l.mo11048O(interfaceC5853gMo11656a);
                            }
                            if (z10) {
                                typeCheckerState.m14190a();
                            } else {
                                arrayDeque.add(interfaceC5853gMo11656a);
                            }
                        }
                    }
                }
            }
            typeCheckerState.m14190a();
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public static final HashSet m14921S(Object... objArr) {
        HashSet hashSet = new HashSet(m14941g0(objArr.length));
        C6744b.m13390v0(hashSet, objArr);
        return hashSet;
    }

    /* JADX INFO: renamed from: T */
    public static final AbstractC6579a.a m14922T(String str) {
        C5207g.m11111f(str, "name");
        return new AbstractC6579a.a(str);
    }

    /* JADX INFO: renamed from: U */
    public static final boolean m14923U(InterfaceC7882z interfaceC7882z) {
        CoroutineContext coroutineContextMo3889G0 = interfaceC7882z.getF6528b();
        int i10 = InterfaceC7875v0.f42975B;
        InterfaceC7875v0 interfaceC7875v0 = (InterfaceC7875v0) coroutineContextMo3889G0.mo1474w(InterfaceC7875v0.b.f42976a);
        if (interfaceC7875v0 != null) {
            return interfaceC7875v0.mo15547b();
        }
        return true;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m14924V(TypeCheckerState typeCheckerState, InterfaceC5853g interfaceC5853g, InterfaceC5856j interfaceC5856j) {
        InterfaceC5858l interfaceC5858l = typeCheckerState.f39884c;
        if (interfaceC5858l.mo11063b(interfaceC5853g)) {
            return true;
        }
        if (interfaceC5858l.mo11083k(interfaceC5853g)) {
            return false;
        }
        if (typeCheckerState.f39883b && interfaceC5858l.mo11065c(interfaceC5853g)) {
            return true;
        }
        return interfaceC5858l.mo11092p0(interfaceC5858l.mo11077h(interfaceC5853g), interfaceC5856j);
    }

    /* JADX INFO: renamed from: W */
    public static final boolean m14925W(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        return abstractC5257t.mo11288a1() instanceof C5247o;
    }

    /* JADX INFO: renamed from: X */
    public static final boolean m14926X(AbstractC5257t abstractC5257t) {
        C5207g.m11111f(abstractC5257t, "<this>");
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        if (!(abstractC5262v0Mo11288a1 instanceof C5600f) && (!(abstractC5262v0Mo11288a1 instanceof AbstractC5249p) || !(((AbstractC5249p) abstractC5262v0Mo11288a1).mo11283e1() instanceof C5600f))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public static final boolean m14927Y(InterfaceC8830c interfaceC8830c) {
        LinkedHashSet linkedHashSet = C8085b.f43903a;
        if (C8413d.m16453l(interfaceC8830c)) {
            LinkedHashSet linkedHashSet2 = C8085b.f43903a;
            C7645b c7645bM14109f = DescriptorUtilsKt.m14109f(interfaceC8830c);
            if (C6752c.m13415I(linkedHashSet2, c7645bM14109f != null ? c7645bM14109f.m15207g() : null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public static final boolean m14928Z(Throwable th2) {
        Class<?> superclass = th2.getClass();
        while (!C5207g.m11106a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public static final boolean m14929a0(AbstractC5257t abstractC5257t) {
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        InterfaceC8847k0 interfaceC8847k0 = interfaceC8834eMo11235q instanceof InterfaceC8847k0 ? (InterfaceC8847k0) interfaceC8834eMo11235q : null;
        if (interfaceC8847k0 == null) {
            return false;
        }
        return m14964s0(TypeUtilsKt.m14231h(interfaceC8847k0));
    }

    /* JADX INFO: renamed from: b */
    public static final C7155e m14930b(CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextMo1471C = coroutineContext;
        if (coroutineContextMo1471C.mo1474w(InterfaceC7875v0.b.f42976a) == null) {
            coroutineContextMo1471C = coroutineContextMo1471C.mo1471C(new C7879x0(null));
        }
        return new C7155e(coroutineContextMo1471C);
    }

    /* JADX INFO: renamed from: b0 */
    public static final C5201a m14931b0(Object[] objArr) {
        C5207g.m11111f(objArr, "array");
        return new C5201a(objArr);
    }

    /* JADX INFO: renamed from: c */
    public static final long m14932c(float f3, float f10) {
        long jFloatToIntBits = (((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(f3) << 32);
        int i10 = C8941c.f46891e;
        return jFloatToIntBits;
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m14933c0(InterfaceC7882z interfaceC7882z, CoroutineJobManager coroutineJobManager, CoroutineDispatcher coroutineDispatcher, String str, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(coroutineJobManager, "coroutineJobManager");
        C5207g.m11111f(coroutineDispatcher, "dispatcher");
        C5207g.m11111f(str, "key");
        coroutineJobManager.m10414a(interfaceC7882z, coroutineDispatcher, str, interfaceC2052l);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC7639b m14934d(KPropertyImpl.AbstractC6780a abstractC6780a, boolean z10) {
        JvmFunctionSignature.C6768c c6768c;
        Method method;
        InterfaceC7639b aVar;
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature;
        InterfaceC7639b cVar;
        if (KDeclarationContainerImpl.f38196a.m14271b(abstractC6780a.mo13509j().f38255d)) {
            return C7643f.f42068a;
        }
        C7645b c7645b = C7397j.f41210a;
        AbstractC7389b abstractC7389bM14788b = C7397j.m14788b(abstractC6780a.mo13509j().mo13488e());
        if (abstractC7389bM14788b instanceof AbstractC7389b.c) {
            AbstractC7389b.c cVar2 = (AbstractC7389b.c) abstractC7389bM14788b;
            boolean z11 = true;
            Method methodM13502c = null;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = cVar2.f41196c;
            if (z10) {
                if ((jvmPropertySignature.f39437b & 4) == 4) {
                    jvmMethodSignature = jvmPropertySignature.f39440e;
                } else {
                    jvmMethodSignature = null;
                }
            } else {
                if ((jvmPropertySignature.f39437b & 8) != 8) {
                    z11 = false;
                }
                if (z11) {
                    jvmMethodSignature = jvmPropertySignature.f39441f;
                } else {
                    jvmMethodSignature = null;
                }
            }
            if (jvmMethodSignature != null) {
                KDeclarationContainerImpl kDeclarationContainerImpl = abstractC6780a.mo13509j().f38253b;
                int i10 = jvmMethodSignature.f39427c;
                InterfaceC6733c interfaceC6733c = cVar2.f41197d;
                methodM13502c = kDeclarationContainerImpl.m13502c(interfaceC6733c.mo13351a(i10), interfaceC6733c.mo13351a(jvmMethodSignature.f39428d));
            }
            if (methodM13502c != null) {
                if (!Modifier.isStatic(methodM13502c.getModifiers())) {
                    cVar = abstractC6780a.mo13490g() ? new AbstractC7640c.g.a(m14894B(abstractC6780a), methodM13502c) : new AbstractC7640c.g.d(methodM13502c);
                } else if (abstractC6780a.mo13509j().mo13488e().mo11289w().mo5292x(C7398k.f41211a)) {
                    cVar = abstractC6780a.mo13490g() ? new AbstractC7640c.g.b(methodM13502c) : new AbstractC7640c.g.e(methodM13502c);
                } else {
                    cVar = abstractC6780a.mo13490g() ? new AbstractC7640c.g.c(m14894B(abstractC6780a), methodM13502c) : new AbstractC7640c.g.f(methodM13502c);
                }
                aVar = cVar;
            } else if (C8414e.m16467d(abstractC6780a.mo13509j().mo13488e()) && C5207g.m11106a(abstractC6780a.mo13509j().mo13488e().mo11886f(), C8850m.f46737d)) {
                Class clsM14899D0 = m14899D0(abstractC6780a.mo13509j().mo13488e().mo11876g());
                if (clsM14899D0 == null) {
                    throw new KotlinReflectionInternalError("Underlying property of inline class " + abstractC6780a.mo13509j() + " should have a field");
                }
                Method methodM14919Q = m14919Q(clsM14899D0, abstractC6780a.mo13509j().mo13488e());
                aVar = abstractC6780a.mo13490g() ? new AbstractC7642e.a(m14894B(abstractC6780a), methodM14919Q) : new AbstractC7642e.b(methodM14919Q);
            } else {
                Field fieldM14786E = abstractC6780a.mo13509j().f38257f.m14786E();
                if (fieldM14786E == null) {
                    throw new KotlinReflectionInternalError("No accessors or field is found for property " + abstractC6780a.mo13509j());
                }
                aVar = m14953n(abstractC6780a, z10, fieldM14786E);
            }
        } else if (abstractC7389bM14788b instanceof AbstractC7389b.a) {
            aVar = m14953n(abstractC6780a, z10, ((AbstractC7389b.a) abstractC7389bM14788b).f41191a);
        } else {
            if (!(abstractC7389bM14788b instanceof AbstractC7389b.b)) {
                if (!(abstractC7389bM14788b instanceof AbstractC7389b.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z10) {
                    c6768c = ((AbstractC7389b.d) abstractC7389bM14788b).f41200a;
                } else {
                    c6768c = ((AbstractC7389b.d) abstractC7389bM14788b).f41201b;
                    if (c6768c == null) {
                        throw new KotlinReflectionInternalError("No setter found for property " + abstractC6780a.mo13509j());
                    }
                }
                KDeclarationContainerImpl kDeclarationContainerImpl2 = abstractC6780a.mo13509j().f38253b;
                AbstractC7403d.b bVar = c6768c.f38140a;
                Method methodM13502c2 = kDeclarationContainerImpl2.m13502c(bVar.f41220a, bVar.f41221b);
                if (methodM13502c2 != null) {
                    Modifier.isStatic(methodM13502c2.getModifiers());
                    return abstractC6780a.mo13490g() ? new AbstractC7640c.g.a(m14894B(abstractC6780a), methodM13502c2) : new AbstractC7640c.g.d(methodM13502c2);
                }
                throw new KotlinReflectionInternalError("No accessor found for property " + abstractC6780a.mo13509j());
            }
            if (z10) {
                method = ((AbstractC7389b.b) abstractC7389bM14788b).f41192a;
            } else {
                AbstractC7389b.b bVar2 = (AbstractC7389b.b) abstractC7389bM14788b;
                method = bVar2.f41193b;
                if (method == null) {
                    throw new KotlinReflectionInternalError("No source found for setter of Java method property: " + bVar2.f41192a);
                }
            }
            aVar = abstractC6780a.mo13490g() ? new AbstractC7640c.g.a(m14894B(abstractC6780a), method) : new AbstractC7640c.g.d(method);
        }
        return m14969v(aVar, abstractC6780a.mo13514i(), false);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m14935d0(InterfaceC7882z interfaceC7882z, CoroutineJobManager coroutineJobManager, String str, InterfaceC2052l interfaceC2052l) {
        m14933c0(interfaceC7882z, coroutineJobManager, C7832g0.f42930a, str, interfaceC2052l);
    }

    /* JADX INFO: renamed from: e */
    public static C6675b m14936e(String str, boolean z10) {
        C5207g.m11111f(str, "challengeCode");
        return new C6675b(str, "", z10);
    }

    /* JADX INFO: renamed from: e0 */
    public static final long m14937e0(long j10, float[] fArr) {
        float fM17164c = C8941c.m17164c(j10);
        float fM17165d = C8941c.m17165d(j10);
        float f3 = 1 / (((fArr[7] * fM17165d) + (fArr[3] * fM17164c)) + fArr[15]);
        if (!((Float.isInfinite(f3) || Float.isNaN(f3)) ? false : true)) {
            f3 = 0.0f;
        }
        return m14932c(((fArr[4] * fM17165d) + (fArr[0] * fM17164c) + fArr[12]) * f3, ((fArr[5] * fM17165d) + (fArr[1] * fM17164c) + fArr[13]) * f3);
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC6579a.a m14938f(String str) {
        C5207g.m11111f(str, "name");
        return new AbstractC6579a.a(str);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m14939f0(float[] fArr, C8940b c8940b) {
        long jM14937e0 = m14937e0(m14932c(c8940b.f46884a, c8940b.f46885b), fArr);
        long jM14937e1 = m14937e0(m14932c(c8940b.f46884a, c8940b.f46887d), fArr);
        long jM14937e2 = m14937e0(m14932c(c8940b.f46886c, c8940b.f46885b), fArr);
        long jM14937e3 = m14937e0(m14932c(c8940b.f46886c, c8940b.f46887d), fArr);
        c8940b.f46884a = Math.min(Math.min(C8941c.m17164c(jM14937e0), C8941c.m17164c(jM14937e1)), Math.min(C8941c.m17164c(jM14937e2), C8941c.m17164c(jM14937e3)));
        c8940b.f46885b = Math.min(Math.min(C8941c.m17165d(jM14937e0), C8941c.m17165d(jM14937e1)), Math.min(C8941c.m17165d(jM14937e2), C8941c.m17165d(jM14937e3)));
        c8940b.f46886c = Math.max(Math.max(C8941c.m17164c(jM14937e0), C8941c.m17164c(jM14937e1)), Math.max(C8941c.m17164c(jM14937e2), C8941c.m17164c(jM14937e3)));
        c8940b.f46887d = Math.max(Math.max(C8941c.m17165d(jM14937e0), C8941c.m17165d(jM14937e1)), Math.max(C8941c.m17165d(jM14937e2), C8941c.m17165d(jM14937e3)));
    }

    /* JADX INFO: renamed from: g */
    public static final SetBuilder m14940g(SetBuilder setBuilder) {
        MapBuilder<E, ?> mapBuilder = setBuilder.f38078a;
        mapBuilder.m13403b();
        mapBuilder.f38069l = true;
        return setBuilder;
    }

    /* JADX INFO: renamed from: g0 */
    public static final int m14941g0(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: h */
    public static void m14942h(String str) {
        C6627b c6627bM13257b = C6627b.m13257b();
        Iterator it = c6627bM13257b.f37573a.entrySet().iterator();
        while (it.hasNext()) {
            C7493a c7493a = (C7493a) ((Map.Entry) it.next()).getValue();
            Object obj = c7493a.f41388b;
            if ((obj instanceof String) && (str instanceof String)) {
                if (((String) obj).equals(str)) {
                    c6627bM13257b.m13258a(c7493a);
                }
            } else if (obj.equals(str)) {
                c6627bM13257b.m13258a(c7493a);
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static final Map m14943h0(Pair pair) {
        C5207g.m11111f(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f38012a, pair.f38013b);
        C5207g.m11110e(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: i0 */
    public static final AbstractC6364h m14944i0(AbstractC5257t abstractC5257t) {
        return (AbstractC6364h) C5206f.m11010i1(abstractC5257t, C6373q.f36761k, FunctionsKt.f39945b);
    }

    /* JADX INFO: renamed from: j */
    public static void m14945j(InterfaceC7882z interfaceC7882z) {
        InterfaceC7875v0 interfaceC7875v0 = (InterfaceC7875v0) interfaceC7882z.getF6528b().mo1474w(InterfaceC7875v0.b.f42976a);
        if (interfaceC7875v0 != null) {
            interfaceC7875v0.mo15618a(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC7882z).toString());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static final Set m14946j0(Object... objArr) {
        C5207g.m11111f(objArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(m14941g0(objArr.length));
        C6744b.m13390v0(linkedHashSet, objArr);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: k */
    public static final Object m14947k(Object obj, CallableMemberDescriptor callableMemberDescriptor) throws IllegalAccessException, InvocationTargetException {
        Class clsM14897C0;
        if ((callableMemberDescriptor instanceof InterfaceC8829b0) && C8414e.m16467d((InterfaceC8855o0) callableMemberDescriptor)) {
            return obj;
        }
        AbstractC5257t abstractC5257tM14900E = m14900E(callableMemberDescriptor);
        if (abstractC5257tM14900E != null && (clsM14897C0 = m14897C0(abstractC5257tM14900E)) != null) {
            obj = m14919Q(clsM14897C0, callableMemberDescriptor).invoke(obj, new Object[0]);
        }
        return obj;
    }

    /* JADX INFO: renamed from: k0 */
    public static final C1690o m14948k0(InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "optionsBuilder");
        C1691p c1691p = new C1691p();
        interfaceC2052l.mo528n(c1691p);
        boolean z10 = c1691p.f9439b;
        C1690o.a aVar = c1691p.f9438a;
        aVar.getClass();
        aVar.getClass();
        int i10 = c1691p.f9440c;
        boolean z11 = c1691p.f9441d;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        return new C1690o(z10, false, i10, false, z11, aVar.f9434a, aVar.f9435b, aVar.f9436c, aVar.f9437d);
    }

    /* JADX INFO: renamed from: l */
    public static final C10317j m14949l(InterfaceC2052l... interfaceC2052lArr) {
        int i10 = 1;
        if (interfaceC2052lArr.length > 0) {
            return new C10317j(i10, interfaceC2052lArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l0 */
    public static final int m14950l0(Random.Default r10, C6526i c6526i) {
        if (c6526i.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + c6526i);
        }
        int i10 = c6526i.f37163a;
        int i11 = c6526i.f37164b;
        if (i11 < Integer.MAX_VALUE) {
            return r10.mo12968d(i10, i11 + 1);
        }
        return i10 > Integer.MIN_VALUE ? r10.mo12968d(i10 - 1, i11) + 1 : r10.mo12510b();
    }

    /* JADX INFO: renamed from: m */
    public static final int m14951m(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: m0 */
    public static void m14952m0(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX INFO: renamed from: n */
    public static final AbstractC7640c m14953n(KPropertyImpl.AbstractC6780a abstractC6780a, boolean z10, Field field) {
        boolean z11;
        AbstractC7640c aVar;
        InterfaceC8829b0 interfaceC8829b0M13513j = abstractC6780a.mo13509j().mo13488e();
        InterfaceC8838g interfaceC8838gMo11876g = interfaceC8829b0M13513j.mo11876g();
        C5207g.m11110e(interfaceC8838gMo11876g, "containingDeclaration");
        if (C8413d.m16453l(interfaceC8838gMo11876g)) {
            InterfaceC8838g interfaceC8838gMo11876g2 = interfaceC8838gMo11876g.mo11876g();
            if ((C8413d.m16455n(interfaceC8838gMo11876g2, ClassKind.INTERFACE) || C8413d.m16455n(interfaceC8838gMo11876g2, ClassKind.ANNOTATION_CLASS)) && !((interfaceC8829b0M13513j instanceof C1629g) && C7407h.m14810d(((C1629g) interfaceC8829b0M13513j).f9155W))) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11 || !Modifier.isStatic(field.getModifiers())) {
            if (!z10) {
                aVar = abstractC6780a.mo13490g() ? new AbstractC7640c.f.a(field, m14955o(abstractC6780a), m14894B(abstractC6780a)) : new AbstractC7640c.f.c(field, m14955o(abstractC6780a));
            } else {
                if (!abstractC6780a.mo13490g()) {
                    return new AbstractC7640c.e.c(field);
                }
                aVar = new AbstractC7640c.e.a(field, m14894B(abstractC6780a));
            }
        } else if (abstractC6780a.mo13509j().mo13488e().mo11289w().mo5292x(C7398k.f41211a)) {
            if (z10) {
                return abstractC6780a.mo13490g() ? new AbstractC7640c.e.b(field) : new AbstractC7640c.e.d(field);
            }
            aVar = abstractC6780a.mo13490g() ? new AbstractC7640c.f.b(field, m14955o(abstractC6780a)) : new AbstractC7640c.f.d(field, m14955o(abstractC6780a));
        } else {
            if (z10) {
                return new AbstractC7640c.e.C10652e(field);
            }
            aVar = new AbstractC7640c.f.e(field, m14955o(abstractC6780a));
        }
        return aVar;
    }

    /* JADX INFO: renamed from: n0 */
    public static C7648e m14954n0(C7648e c7648e, String str, String str2, int i10) {
        Object next;
        boolean z10 = false;
        boolean z11 = (i10 & 4) != 0;
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if (!c7648e.f42087b) {
            String strM15236g = c7648e.m15236g();
            C5207g.m11110e(strM15236g, "methodName.identifier");
            if (C7661i.m15256V2(strM15236g, str, false) && strM15236g.length() != str.length()) {
                char cCharAt = strM15236g.charAt(str.length());
                if (!('a' <= cCharAt && cCharAt < '{')) {
                    if (str2 != null) {
                        return C7648e.m15232l(str2.concat(C7076b.m14292l3(str, strM15236g)));
                    }
                    if (!z11) {
                        return c7648e;
                    }
                    String strM14292l3 = C7076b.m14292l3(str, strM15236g);
                    if (!(strM14292l3.length() == 0)) {
                        if (C0062b.m246A1(strM14292l3, 0)) {
                            if (strM14292l3.length() == 1 || !C0062b.m246A1(strM14292l3, 1)) {
                                if (!(strM14292l3.length() == 0)) {
                                    char cCharAt2 = strM14292l3.charAt(0);
                                    if ('A' <= cCharAt2 && cCharAt2 < '[') {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        char lowerCase = Character.toLowerCase(cCharAt2);
                                        String strSubstring = strM14292l3.substring(1);
                                        C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                                        strM14292l3 = lowerCase + strSubstring;
                                    }
                                }
                            } else {
                                C6525h c6525hM13104g = new C6526i(0, strM14292l3.length() - 1).iterator();
                                do {
                                    if (!c6525hM13104g.f37168c) {
                                        next = null;
                                        break;
                                    }
                                    next = c6525hM13104g.next();
                                } while (!(!C0062b.m246A1(strM14292l3, ((Number) next).intValue())));
                                Integer num = (Integer) next;
                                if (num != null) {
                                    int iIntValue = num.intValue() - 1;
                                    String strSubstring2 = strM14292l3.substring(0, iIntValue);
                                    C5207g.m11110e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    String strM387q2 = C0062b.m387q2(strSubstring2);
                                    String strSubstring3 = strM14292l3.substring(iIntValue);
                                    C5207g.m11110e(strSubstring3, "this as java.lang.String).substring(startIndex)");
                                    strM14292l3 = strM387q2.concat(strSubstring3);
                                } else {
                                    strM14292l3 = C0062b.m387q2(strM14292l3);
                                }
                            }
                        }
                    }
                    if (C7648e.m15233m(strM14292l3)) {
                        return C7648e.m15232l(strM14292l3);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m14955o(KPropertyImpl.AbstractC6780a abstractC6780a) {
        return !C5258t0.m11296g(abstractC6780a.mo13509j().mo13488e().mo11884c());
    }

    /* JADX INFO: renamed from: o0 */
    public static final void m14956o0(InterfaceC10418c interfaceC10418c, NoLookupLocation noLookupLocation, InterfaceC8830c interfaceC8830c, C7648e c7648e) {
        C5207g.m11111f(interfaceC10418c, "<this>");
        C5207g.m11111f(noLookupLocation, "from");
        C5207g.m11111f(interfaceC8830c, "scopeOwner");
        C5207g.m11111f(c7648e, "name");
        if (interfaceC10418c == InterfaceC10418c.a.f52220a) {
            return;
        }
        noLookupLocation.getLocation();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX INFO: renamed from: p */
    public static String m14957p(InterfaceC6822c interfaceC6822c, int i10) {
        String strM15235f;
        boolean z10 = false;
        boolean z11 = (i10 & 1) != 0;
        boolean z12 = (i10 & 2) != 0;
        C5207g.m11111f(interfaceC6822c, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z12) {
            if (interfaceC6822c instanceof InterfaceC6821b) {
                strM15235f = "<init>";
            } else {
                strM15235f = interfaceC6822c.mo11874a().m15235f();
                C5207g.m11110e(strM15235f, "name.asString()");
            }
            sb2.append(strM15235f);
        }
        sb2.append("(");
        InterfaceC8835e0 interfaceC8835e0Mo11896s0 = interfaceC6822c.mo11896s0();
        if (interfaceC8835e0Mo11896s0 != null) {
            AbstractC5257t abstractC5257tMo11884c = interfaceC8835e0Mo11896s0.mo11884c();
            C5207g.m11110e(abstractC5257tMo11884c, "it.type");
            sb2.append(m14944i0(abstractC5257tMo11884c));
        }
        Iterator<InterfaceC8853n0> it = interfaceC6822c.mo11889i().iterator();
        while (it.hasNext()) {
            AbstractC5257t abstractC5257tMo11884c2 = it.next().mo11884c();
            C5207g.m11110e(abstractC5257tMo11884c2, "parameter.type");
            sb2.append(m14944i0(abstractC5257tMo11884c2));
        }
        sb2.append(")");
        if (z11) {
            if (!(interfaceC6822c instanceof InterfaceC6821b)) {
                AbstractC5257t abstractC5257tMo11900y = interfaceC6822c.mo11900y();
                C5207g.m11108c(abstractC5257tMo11900y);
                C7648e c7648e = AbstractC6795c.f38322e;
                if (AbstractC6795c.m13532E(abstractC5257tMo11900y, C6797e.a.f38381d)) {
                    AbstractC5257t abstractC5257tMo11900y2 = interfaceC6822c.mo11900y();
                    C5207g.m11108c(abstractC5257tMo11900y2);
                    if (C5258t0.m11296g(abstractC5257tMo11900y2) || (interfaceC6822c instanceof InterfaceC8831c0)) {
                    }
                }
                if (z10) {
                    sb2.append("V");
                } else {
                    AbstractC5257t abstractC5257tMo11900y3 = interfaceC6822c.mo11900y();
                    C5207g.m11108c(abstractC5257tMo11900y3);
                    sb2.append(m14944i0(abstractC5257tMo11900y3));
                }
            }
            z10 = true;
            if (z10) {
                sb2.append("V");
            } else {
                AbstractC5257t abstractC5257tMo11900y4 = interfaceC6822c.mo11900y();
                C5207g.m11108c(abstractC5257tMo11900y4);
                sb2.append(m14944i0(abstractC5257tMo11900y4));
            }
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m14958p0(InterfaceC10418c interfaceC10418c, NoLookupLocation noLookupLocation, InterfaceC8865w interfaceC8865w, C7648e c7648e) {
        C5207g.m11111f(interfaceC10418c, "<this>");
        C5207g.m11111f(noLookupLocation, "from");
        C5207g.m11111f(interfaceC8865w, "scopeOwner");
        C5207g.m11111f(c7648e, "name");
        interfaceC8865w.mo17120e().m15214b();
        C5207g.m11110e(c7648e.m15235f(), "name.asString()");
        if (interfaceC10418c == InterfaceC10418c.a.f52220a) {
            return;
        }
        noLookupLocation.getLocation();
    }

    /* JADX INFO: renamed from: q */
    public static final String m14959q(InterfaceC6816a interfaceC6816a) {
        C5207g.m11111f(interfaceC6816a, "<this>");
        if (C8413d.m16456o(interfaceC6816a)) {
            return null;
        }
        InterfaceC8838g interfaceC8838gMo11876g = interfaceC6816a.mo11876g();
        InterfaceC8830c interfaceC8830c = interfaceC8838gMo11876g instanceof InterfaceC8830c ? (InterfaceC8830c) interfaceC8838gMo11876g : null;
        if (interfaceC8830c == null || interfaceC8830c.mo11874a().f42087b) {
            return null;
        }
        InterfaceC6816a interfaceC6816aMo11875b = interfaceC6816a.mo18004P0();
        InterfaceC6824e interfaceC6824e = interfaceC6816aMo11875b instanceof InterfaceC6824e ? (InterfaceC6824e) interfaceC6816aMo11875b : null;
        if (interfaceC6824e == null) {
            return null;
        }
        return C0062b.m344e2(interfaceC8830c, m14957p(interfaceC6824e, 3));
    }

    /* JADX INFO: renamed from: q0 */
    public static final String m14960q0(C7648e c7648e) {
        boolean z10;
        C5207g.m11111f(c7648e, "<this>");
        String strM15235f = c7648e.m15235f();
        C5207g.m11110e(strM15235f, "asString()");
        boolean z11 = true;
        if (!C8096e.f43919a.contains(strM15235f)) {
            int i10 = 0;
            while (true) {
                if (i10 >= strM15235f.length()) {
                    z10 = false;
                    break;
                }
                char cCharAt = strM15235f.charAt(i10);
                if ((Character.isLetterOrDigit(cCharAt) || cCharAt == '_') ? false : true) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            z11 = z10;
        }
        if (!z11) {
            String strM15235f2 = c7648e.m15235f();
            C5207g.m11110e(strM15235f2, "asString()");
            return strM15235f2;
        }
        StringBuilder sb2 = new StringBuilder();
        String strM15235f3 = c7648e.m15235f();
        C5207g.m11110e(strM15235f3, "asString()");
        sb2.append("`".concat(strM15235f3));
        sb2.append('`');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: r */
    public static float[] m14961r() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX INFO: renamed from: r0 */
    public static final String m14962r0(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7648e c7648e = (C7648e) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(m14960q0(c7648e));
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m14963s(InterfaceC2056p interfaceC2056p, InterfaceC9968c interfaceC9968c) throws Throwable {
        C7166p c7166p = new C7166p(interfaceC9968c, interfaceC9968c.mo2029e());
        Object objM350g2 = C0062b.m350g2(c7166p, c7166p, interfaceC2056p);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM350g2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX INFO: renamed from: s0 */
    public static final boolean m14964s0(AbstractC5257t abstractC5257t) {
        boolean z10;
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        boolean z11 = true;
        if (interfaceC8834eMo11235q == null) {
            z10 = false;
        } else {
            if (C8414e.m16465b(interfaceC8834eMo11235q) && !C5207g.m11106a(DescriptorUtilsKt.m14110g((InterfaceC8830c) interfaceC8834eMo11235q), C6797e.f38340f)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10) {
            z11 = m14929a0(abstractC5257t);
        }
        return z11;
    }

    /* JADX INFO: renamed from: t */
    public static TypeCheckerState m14965t(boolean z10, boolean z11, C5206f c5206f, KotlinTypePreparator kotlinTypePreparator, AbstractC5439d abstractC5439d, int i10) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 4) != 0) {
            c5206f = C5206f.f33268c;
        }
        C5206f c5206f2 = c5206f;
        if ((i10 & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.C7059a.f39903a;
        }
        KotlinTypePreparator kotlinTypePreparator2 = kotlinTypePreparator;
        if ((i10 & 16) != 0) {
            abstractC5439d = AbstractC5439d.a.f33983a;
        }
        AbstractC5439d abstractC5439d2 = abstractC5439d;
        C5207g.m11111f(c5206f2, "typeSystemContext");
        C5207g.m11111f(kotlinTypePreparator2, "kotlinTypePreparator");
        C5207g.m11111f(abstractC5439d2, "kotlinTypeRefiner");
        return new TypeCheckerState(z10, z12, c5206f2, kotlinTypePreparator2, abstractC5439d2);
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m14966t0(float[] fArr) {
        int i10 = 0;
        while (i10 < 4) {
            int i11 = 0;
            while (i11 < 4) {
                fArr[(i11 * 4) + i10] = i10 == i11 ? 1.0f : 0.0f;
                i11++;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static final Result.Failure m14967u(Throwable th2) {
        C5207g.m11111f(th2, "exception");
        return new Result.Failure(th2);
    }

    /* JADX INFO: renamed from: u0 */
    public static final LazyJavaAnnotations m14968u0(C7669f c7669f, InterfaceC5824d interfaceC5824d) {
        C5207g.m11111f(c7669f, "<this>");
        C5207g.m11111f(interfaceC5824d, "annotationsOwner");
        return new LazyJavaAnnotations(c7669f, interfaceC5824d, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX INFO: renamed from: v */
    public static final InterfaceC7639b m14969v(InterfaceC7639b interfaceC7639b, InterfaceC6822c interfaceC6822c, boolean z10) {
        boolean z11;
        AbstractC5257t abstractC5257tMo11900y;
        boolean z12;
        AbstractC5257t abstractC5257tM14900E;
        boolean z13;
        C5207g.m11111f(interfaceC6822c, "descriptor");
        boolean z14 = true;
        if (!C8414e.m16464a(interfaceC6822c)) {
            List<InterfaceC8853n0> listMo11889i = interfaceC6822c.mo11889i();
            C5207g.m11110e(listMo11889i, "descriptor.valueParameters");
            if (!listMo11889i.isEmpty()) {
                Iterator<T> it = listMo11889i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        AbstractC5257t abstractC5257tMo11884c = ((InterfaceC8853n0) it.next()).mo11884c();
                        C5207g.m11110e(abstractC5257tMo11884c, "it.type");
                        if (C8414e.m16466c(abstractC5257tMo11884c)) {
                            z11 = true;
                            break;
                        }
                    }
                }
                if (!z11) {
                    abstractC5257tMo11900y = interfaceC6822c.mo11900y();
                    if (abstractC5257tMo11900y == null && C8414e.m16466c(abstractC5257tMo11900y)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (interfaceC7639b instanceof InterfaceC7638a) {
                            z14 = false;
                        } else {
                            abstractC5257tM14900E = m14900E(interfaceC6822c);
                            if (abstractC5257tM14900E == null && C8414e.m16466c(abstractC5257tM14900E)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                z14 = false;
                            }
                        }
                    }
                }
            }
            z11 = false;
            if (!z11) {
                abstractC5257tMo11900y = interfaceC6822c.mo11900y();
                if (abstractC5257tMo11900y == null) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    if (interfaceC7639b instanceof InterfaceC7638a) {
                        z14 = false;
                    } else {
                        abstractC5257tM14900E = m14900E(interfaceC6822c);
                        if (abstractC5257tM14900E == null) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            z14 = false;
                        }
                    }
                }
            }
        }
        return z14 ? new C7641d(interfaceC7639b, interfaceC6822c, z10) : interfaceC7639b;
    }

    /* JADX INFO: renamed from: v0 */
    public static C8758f m14970v0(C8758f c8758f, String[] strArr, Map map) {
        int i10 = 0;
        if (c8758f == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C8758f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C8758f c8758f2 = new C8758f();
                int length = strArr.length;
                while (i10 < length) {
                    c8758f2.m17010a((C8758f) map.get(strArr[i10]));
                    i10++;
                }
                return c8758f2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c8758f.m17010a((C8758f) map.get(strArr[0]));
                return c8758f;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    c8758f.m17010a((C8758f) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return c8758f;
    }

    /* JADX INFO: renamed from: w */
    public static final C5242l0 m14971w(InterfaceC8830c interfaceC8830c, AbstractC9557b abstractC9557b) {
        C5207g.m11111f(abstractC9557b, "to");
        interfaceC8830c.mo13604z().size();
        abstractC9557b.mo13604z().size();
        AbstractC5244m0.a aVar = AbstractC5244m0.f33335b;
        List<InterfaceC8847k0> listMo13604z = interfaceC8830c.mo13604z();
        C5207g.m11110e(listMo13604z, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo13604z, 10));
        Iterator<T> it = listMo13604z.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8847k0) it.next()).mo13600k());
        }
        List<InterfaceC8847k0> listMo13604z2 = abstractC9557b.mo13604z();
        C5207g.m11110e(listMo13604z2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listMo13604z2, 10));
        Iterator<T> it2 = listMo13604z2.iterator();
        while (it2.hasNext()) {
            AbstractC5265x abstractC5265xMo5316v = ((InterfaceC8847k0) it2.next()).mo5316v();
            C5207g.m11110e(abstractC5265xMo5316v, "it.defaultType");
            arrayList2.add(TypeUtilsKt.m14224a(abstractC5265xMo5316v));
        }
        return new C5242l0(C6753d.m13464Q0(C6752c.m13412A0(arrayList, arrayList2)), false);
    }

    /* JADX INFO: renamed from: w0 */
    public static final Set m14972w0(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        C5207g.m11110e(setSingleton, "singleton(element)");
        return setSingleton;
    }

    /* JADX INFO: renamed from: x0 */
    public static final Set m14973x0(Object... objArr) {
        return objArr.length > 0 ? C6744b.m13393y0(objArr) : EmptySet.f38034a;
    }

    /* JADX INFO: renamed from: y */
    public static final HashSet m14974y(Iterable iterable) {
        C5207g.m11111f(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set<C7648e> setMo11907f = ((MemberScope) it.next()).mo11907f();
            if (setMo11907f == null) {
                return null;
            }
            C9327o.m17684D(setMo11907f, hashSet);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: y0 */
    public static final AbstractC6579a.a m14975y0(String str) {
        C5207g.m11111f(str, "name");
        return new AbstractC6579a.a(str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: z */
    public static final Object m14976z(Context context, Class cls) {
        Application application;
        C5207g.m11111f(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            Context baseContext = applicationContext;
            while (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                if (baseContext instanceof Application) {
                    application = (Application) baseContext;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: " + applicationContext);
        }
        application = (Application) applicationContext;
        return C9000b.m17245k(cls, application);
    }

    /* JADX INFO: renamed from: z0 */
    public static final void m14977z0(Object obj) throws Throwable {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f38014a;
        }
    }

    @Override // p288o4.InterfaceC7917c.c
    /* JADX INFO: renamed from: a */
    public InterfaceC7917c mo5467a(InterfaceC7917c.b bVar) {
        return new FrameworkSQLiteOpenHelper(bVar.f43146a, bVar.f43147b, bVar.f43148c, bVar.f43149d, bVar.f43150e);
    }

    @Override // p136gc.InterfaceC5745a
    /* JADX INFO: renamed from: i */
    public Object mo5485i(AbstractC5751g abstractC5751g) throws IOException {
        if (abstractC5751g.mo12111m()) {
            return (Bundle) abstractC5751g.mo12107i();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(abstractC5751g.mo12106h());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
            sb2.append("Error making request: ");
            sb2.append(strValueOf);
            Log.d("Rpc", sb2.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", abstractC5751g.mo12106h());
    }

    @Override // co.InterfaceC2075g
    public void lock() {
    }

    @Override // co.InterfaceC2075g
    public void unlock() {
    }

    /* JADX INFO: renamed from: x */
    public long m14978x() {
        return System.currentTimeMillis();
    }

    @Override // cc.InterfaceC1967w2
    public Object zza() {
        List list = C1985y2.f10339a;
        return Long.valueOf(C2592a9.f14056b.zza().mo7722j());
    }
}
