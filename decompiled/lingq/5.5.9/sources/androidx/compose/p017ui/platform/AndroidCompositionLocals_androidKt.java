package androidx.compose.p017ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.saveable.C0489c;
import androidx.compose.runtime.saveable.InterfaceC0488b;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.p544savedstate.C1189a;
import androidx.view.InterfaceC1051q;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import p081e0.C5304d1;
import p081e0.C5314h0;
import p081e0.C5328o0;
import p081e0.C5329p;
import p081e0.C5331q;
import p081e0.C5332q0;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5327o;
import p081e0.InterfaceC5336s0;
import p187j1.C6402b;
import p230l0.C7204a;
import p270n4.InterfaceC7706c;
import p338qd.C8573r0;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a */
    public static final C5331q f4083a;

    /* JADX INFO: renamed from: b */
    public static final C5304d1 f4084b;

    /* JADX INFO: renamed from: c */
    public static final C5304d1 f4085c;

    /* JADX INFO: renamed from: d */
    public static final C5304d1 f4086d;

    /* JADX INFO: renamed from: e */
    public static final C5304d1 f4087e;

    /* JADX INFO: renamed from: f */
    public static final C5304d1 f4088f;

    static {
        C5314h0 c5314h0 = C5314h0.f33585a;
        AndroidCompositionLocals_androidKt$LocalConfiguration$1 androidCompositionLocals_androidKt$LocalConfiguration$1 = new InterfaceC2041a<Configuration>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Configuration mo807E() {
                AndroidCompositionLocals_androidKt.m2305b("LocalConfiguration");
                throw null;
            }
        };
        C5207g.m11111f(androidCompositionLocals_androidKt$LocalConfiguration$1, "defaultFactory");
        f4083a = new C5331q(c5314h0, androidCompositionLocals_androidKt$LocalConfiguration$1);
        f4084b = CompositionLocalKt.m1693c(new InterfaceC2041a<Context>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Context mo807E() {
                AndroidCompositionLocals_androidKt.m2305b("LocalContext");
                throw null;
            }
        });
        f4085c = CompositionLocalKt.m1693c(new InterfaceC2041a<C6402b>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C6402b mo807E() {
                AndroidCompositionLocals_androidKt.m2305b("LocalImageVectorCache");
                throw null;
            }
        });
        f4086d = CompositionLocalKt.m1693c(new InterfaceC2041a<InterfaceC1051q>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1051q mo807E() {
                AndroidCompositionLocals_androidKt.m2305b("LocalLifecycleOwner");
                throw null;
            }
        });
        f4087e = CompositionLocalKt.m1693c(new InterfaceC2041a<InterfaceC7706c>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC7706c mo807E() {
                AndroidCompositionLocals_androidKt.m2305b("LocalSavedStateRegistryOwner");
                throw null;
            }
        });
        f4088f = CompositionLocalKt.m1693c(new InterfaceC2041a<View>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final View mo807E() {
                AndroidCompositionLocals_androidKt.m2305b("LocalView");
                throw null;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: a */
    public static final void m2304a(final AndroidComposeView androidComposeView, final InterfaceC2056p<? super InterfaceC0476a, ? super Integer, C9072e> interfaceC2056p, InterfaceC0476a interfaceC0476a, final int i10) {
        LinkedHashMap linkedHashMap;
        final boolean z10;
        C5207g.m11111f(androidComposeView, "owner");
        C5207g.m11111f(interfaceC2056p, "content");
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(1396852028);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        final Context context = androidComposeView.getContext();
        composerImplMo1636j.mo1622c(-492369756);
        Object objM1619a0 = composerImplMo1636j.m1619a0();
        InterfaceC0476a.a.C10586a c10586a = InterfaceC0476a.a.f3122a;
        if (objM1619a0 == c10586a) {
            objM1619a0 = C8573r0.m16682K0(context.getResources().getConfiguration(), C5314h0.f33585a);
            composerImplMo1636j.m1597F0(objM1619a0);
        }
        composerImplMo1636j.m1609Q(false);
        final InterfaceC5312g0 interfaceC5312g0 = (InterfaceC5312g0) objM1619a0;
        composerImplMo1636j.mo1622c(1157296644);
        boolean zMo1665y = composerImplMo1636j.mo1665y(interfaceC5312g0);
        Object objM1619a1 = composerImplMo1636j.m1619a0();
        if (zMo1665y || objM1619a1 == c10586a) {
            objM1619a1 = new InterfaceC2052l<Configuration, C9072e>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Configuration configuration) {
                    Configuration configuration2 = configuration;
                    C5207g.m11111f(configuration2, "it");
                    interfaceC5312g0.setValue(configuration2);
                    return C9072e.f47360a;
                }
            };
            composerImplMo1636j.m1597F0(objM1619a1);
        }
        composerImplMo1636j.m1609Q(false);
        androidComposeView.setConfigurationChangeObserver((InterfaceC2052l) objM1619a1);
        composerImplMo1636j.mo1622c(-492369756);
        Object objM1619a2 = composerImplMo1636j.m1619a0();
        if (objM1619a2 == c10586a) {
            C5207g.m11110e(context, "context");
            objM1619a2 = new C0615d0(context);
            composerImplMo1636j.m1597F0(objM1619a2);
        }
        composerImplMo1636j.m1609Q(false);
        final C0615d0 c0615d0 = (C0615d0) objM1619a2;
        AndroidComposeView.C0551b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        composerImplMo1636j.mo1622c(-492369756);
        Object objM1619a3 = composerImplMo1636j.m1619a0();
        InterfaceC7706c interfaceC7706c = viewTreeOwners.f4006b;
        if (objM1619a3 == c10586a) {
            C5207g.m11111f(interfaceC7706c, "owner");
            Object parent = androidComposeView.getParent();
            C5207g.m11109d(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
            String strValueOf = tag instanceof String ? (String) tag : null;
            if (strValueOf == null) {
                strValueOf = String.valueOf(view.getId());
            }
            C5207g.m11111f(strValueOf, "id");
            final String str = InterfaceC0488b.class.getSimpleName() + ':' + strValueOf;
            final C1189a c1189aMo797q = interfaceC7706c.mo797q();
            Bundle bundleM4584a = c1189aMo797q.m4584a(str);
            if (bundleM4584a != null) {
                linkedHashMap = new LinkedHashMap();
                Set<String> setKeySet = bundleM4584a.keySet();
                C5207g.m11110e(setKeySet, "this.keySet()");
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    Iterator it2 = it;
                    ArrayList parcelableArrayList = bundleM4584a.getParcelableArrayList(str2);
                    C5207g.m11109d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                    C5207g.m11110e(str2, "key");
                    linkedHashMap.put(str2, parcelableArrayList);
                    it = it2;
                    bundleM4584a = bundleM4584a;
                }
            } else {
                linkedHashMap = null;
            }
            C0588xcceb09c3 c0588xcceb09c3 = new InterfaceC2052l<Object, Boolean>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(Object obj) {
                    C5207g.m11111f(obj, "it");
                    return Boolean.valueOf(C0646n0.m2425a(obj));
                }
            };
            C5304d1 c5304d1 = SaveableStateRegistryKt.f3230a;
            C5207g.m11111f(c0588xcceb09c3, "canBeSaved");
            C0489c c0489c = new C0489c(linkedHashMap, c0588xcceb09c3);
            try {
                c1189aMo797q.m4586c(str, new C0643m0(c0489c));
                z10 = true;
            } catch (IllegalArgumentException unused) {
                z10 = false;
            }
            C0640l0 c0640l0 = new C0640l0(c0489c, new InterfaceC2041a<C9072e>() { // from class: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    if (z10) {
                        C1189a c1189a = c1189aMo797q;
                        c1189a.getClass();
                        String str3 = str;
                        C5207g.m11111f(str3, "key");
                        c1189a.f7561a.mo14517g(str3);
                    }
                    return C9072e.f47360a;
                }
            });
            composerImplMo1636j.m1597F0(c0640l0);
            objM1619a3 = c0640l0;
        }
        composerImplMo1636j.m1609Q(false);
        final C0640l0 c0640l1 = (C0640l0) objM1619a3;
        C5333r.m11459a(C9072e.f47360a, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC5327o mo528n(C5329p c5329p) {
                C5207g.m11111f(c5329p, "$this$DisposableEffect");
                return new C0678y(c0640l1);
            }
        }, composerImplMo1636j);
        C5207g.m11110e(context, "context");
        Configuration configuration = (Configuration) interfaceC5312g0.getValue();
        composerImplMo1636j.mo1622c(-485908294);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
        composerImplMo1636j.mo1622c(-492369756);
        Object objM1619a4 = composerImplMo1636j.m1619a0();
        if (objM1619a4 == c10586a) {
            objM1619a4 = new C6402b();
            composerImplMo1636j.m1597F0(objM1619a4);
        }
        composerImplMo1636j.m1609Q(false);
        C6402b c6402b = (C6402b) objM1619a4;
        composerImplMo1636j.mo1622c(-492369756);
        Object objM1619a5 = composerImplMo1636j.m1619a0();
        Object obj = objM1619a5;
        if (objM1619a5 == c10586a) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            composerImplMo1636j.m1597F0(configuration2);
            obj = configuration2;
        }
        composerImplMo1636j.m1609Q(false);
        Configuration configuration3 = (Configuration) obj;
        composerImplMo1636j.mo1622c(-492369756);
        Object objM1619a6 = composerImplMo1636j.m1619a0();
        if (objM1619a6 == c10586a) {
            objM1619a6 = new ComponentCallbacks2C0602a0(configuration3, c6402b);
            composerImplMo1636j.m1597F0(objM1619a6);
        }
        composerImplMo1636j.m1609Q(false);
        final ComponentCallbacks2C0602a0 componentCallbacks2C0602a0 = (ComponentCallbacks2C0602a0) objM1619a6;
        C5333r.m11459a(c6402b, new InterfaceC2052l<C5329p, InterfaceC5327o>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final InterfaceC5327o mo528n(C5329p c5329p) {
                C5207g.m11111f(c5329p, "$this$DisposableEffect");
                Context context2 = context;
                Context applicationContext = context2.getApplicationContext();
                ComponentCallbacks2C0602a0 componentCallbacks2C0602a1 = componentCallbacks2C0602a0;
                applicationContext.registerComponentCallbacks(componentCallbacks2C0602a1);
                return new C0681z(context2, componentCallbacks2C0602a1);
            }
        }, composerImplMo1636j);
        composerImplMo1636j.m1609Q(false);
        Configuration configuration4 = (Configuration) interfaceC5312g0.getValue();
        C5207g.m11110e(configuration4, "configuration");
        CompositionLocalKt.m1691a(new C5328o0[]{f4083a.m11458b(configuration4), f4084b.m11458b(context), f4086d.m11458b(viewTreeOwners.f4005a), f4087e.m11458b(interfaceC7706c), SaveableStateRegistryKt.f3230a.m11458b(c0640l1), f4088f.m11458b(androidComposeView.getView()), f4085c.m11458b(c6402b)}, C7204a.m14522b(composerImplMo1636j, 1471621628, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                InterfaceC0476a interfaceC0476a3 = interfaceC0476a2;
                if ((num.intValue() & 11) == 2 && interfaceC0476a3.mo1642m()) {
                    interfaceC0476a3.mo1650q();
                } else {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                    int i11 = ((i10 << 3) & 896) | 72;
                    CompositionLocalsKt.m2308a(androidComposeView, c0615d0, interfaceC2056p, interfaceC0476a3, i11);
                }
                return C9072e.f47360a;
            }
        }), composerImplMo1636j, 56);
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int iM16737l1 = C8573r0.m16737l1(i10 | 1);
                AndroidCompositionLocals_androidKt.m2304a(androidComposeView, interfaceC2056p, interfaceC0476a2, iM16737l1);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static final void m2305b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
