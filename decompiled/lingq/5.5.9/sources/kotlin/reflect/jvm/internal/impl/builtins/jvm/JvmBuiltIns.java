package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import ae.C0062b;
import cm.InterfaceC2041a;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.collections.C6752c;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p372rm.InterfaceC8863u;
import tm.InterfaceC9339a;
import tm.InterfaceC9340b;
import tm.InterfaceC9341c;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmBuiltIns extends AbstractC6795c {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f38409h = {C5209i.m11120c(new PropertyReference1Impl(C5209i.m11118a(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* JADX INFO: renamed from: f */
    public InterfaceC2041a<C6799a> f38410f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2073e f38411g;

    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a */
    public static final class C6799a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8863u f38412a;

        /* JADX INFO: renamed from: b */
        public final boolean f38413b;

        public C6799a(InterfaceC8863u interfaceC8863u, boolean z10) {
            C5207g.m11111f(interfaceC8863u, "ownerModuleDescriptor");
            this.f38412a = interfaceC8863u;
            this.f38413b = z10;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$b */
    public /* synthetic */ class C6800b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38414a;

        static {
            int[] iArr = new int[Kind.values().length];
            iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[Kind.FALLBACK.ordinal()] = 3;
            f38414a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(final LockBasedStorageManager lockBasedStorageManager, Kind kind) {
        super(lockBasedStorageManager);
        C5207g.m11111f(kind, "kind");
        this.f38411g = lockBasedStorageManager.mo6217b(new InterfaceC2041a<JvmBuiltInsCustomizer>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final JvmBuiltInsCustomizer mo807E() {
                final JvmBuiltIns jvmBuiltIns = this.f38415b;
                C6829c c6829cM13555l = jvmBuiltIns.m13555l();
                C5207g.m11110e(c6829cM13555l, "builtInsModule");
                return new JvmBuiltInsCustomizer(c6829cM13555l, lockBasedStorageManager, new InterfaceC2041a<JvmBuiltIns.C6799a>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$customizer$2.1
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final JvmBuiltIns.C6799a mo807E() {
                        JvmBuiltIns jvmBuiltIns2 = jvmBuiltIns;
                        InterfaceC2041a<JvmBuiltIns.C6799a> interfaceC2041a = jvmBuiltIns2.f38410f;
                        if (interfaceC2041a == null) {
                            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                        }
                        JvmBuiltIns.C6799a c6799aMo807E = interfaceC2041a.mo807E();
                        jvmBuiltIns2.f38410f = null;
                        return c6799aMo807E;
                    }
                });
            }
        });
        int i10 = C6800b.f38414a[kind.ordinal()];
        if (i10 == 2) {
            m13547d(false);
        } else {
            if (i10 != 3) {
                return;
            }
            m13547d(true);
        }
    }

    /* JADX INFO: renamed from: M */
    public final JvmBuiltInsCustomizer m13572M() {
        return (JvmBuiltInsCustomizer) C0062b.m366l1(this.f38411g, f38409h[0]);
    }

    /* JADX INFO: renamed from: N */
    public final void m13573N(final C6829c c6829c) {
        this.f38410f = new InterfaceC2041a<C6799a>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$initialize$1

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f38419c = true;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final JvmBuiltIns.C6799a mo807E() {
                return new JvmBuiltIns.C6799a(c6829c, this.f38419c);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c
    /* JADX INFO: renamed from: e */
    public final InterfaceC9339a mo13548e() {
        return m13572M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c
    /* JADX INFO: renamed from: m */
    public final Iterable mo13556m() {
        Iterable<InterfaceC9340b> iterableMo13556m = super.mo13556m();
        InterfaceC2076h interfaceC2076h = this.f38326d;
        if (interfaceC2076h == null) {
            AbstractC6795c.m13540a(6);
            throw null;
        }
        C6829c c6829cM13555l = m13555l();
        C5207g.m11110e(c6829cM13555l, "builtInsModule");
        return C6752c.m13437e0(iterableMo13556m, new C6805a(interfaceC2076h, c6829cM13555l));
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c
    /* JADX INFO: renamed from: q */
    public final InterfaceC9341c mo13560q() {
        return m13572M();
    }
}
