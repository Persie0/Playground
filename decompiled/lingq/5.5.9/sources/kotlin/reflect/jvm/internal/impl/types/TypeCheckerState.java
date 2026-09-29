package kotlin.reflect.jvm.internal.impl.types;

import android.support.v4.media.AbstractC0140a;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.ArrayDeque;
import jo.C6532d;
import p139go.InterfaceC5852f;
import p139go.InterfaceC5853g;
import p139go.InterfaceC5858l;

/* JADX INFO: loaded from: classes2.dex */
public class TypeCheckerState {

    /* JADX INFO: renamed from: a */
    public final boolean f39882a;

    /* JADX INFO: renamed from: b */
    public final boolean f39883b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5858l f39884c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0140a f39885d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0140a f39886e;

    /* JADX INFO: renamed from: f */
    public int f39887f;

    /* JADX INFO: renamed from: g */
    public ArrayDeque<InterfaceC5853g> f39888g;

    /* JADX INFO: renamed from: h */
    public C6532d f39889h;

    public enum LowerCapturedTypePolicy {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a */
    public interface InterfaceC7054a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$a */
        public static final class a implements InterfaceC7054a {

            /* JADX INFO: renamed from: a */
            public boolean f39890a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.InterfaceC7054a
            /* JADX INFO: renamed from: a */
            public final void mo14194a(InterfaceC2041a<Boolean> interfaceC2041a) {
                if (this.f39890a) {
                    return;
                }
                this.f39890a = ((Boolean) ((AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4.C70501) interfaceC2041a).mo807E()).booleanValue();
            }
        }

        /* JADX INFO: renamed from: a */
        void mo14194a(InterfaceC2041a<Boolean> interfaceC2041a);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b */
    public static abstract class AbstractC7055b {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$a */
        public static abstract class a extends AbstractC7055b {
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b */
        public static final class b extends AbstractC7055b {

            /* JADX INFO: renamed from: a */
            public static final b f39891a = new b();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.AbstractC7055b
            /* JADX INFO: renamed from: a */
            public final InterfaceC5853g mo11656a(TypeCheckerState typeCheckerState, InterfaceC5852f interfaceC5852f) {
                C5207g.m11111f(typeCheckerState, "state");
                C5207g.m11111f(interfaceC5852f, "type");
                return typeCheckerState.f39884c.mo11071e(interfaceC5852f);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$c */
        public static final class c extends AbstractC7055b {

            /* JADX INFO: renamed from: a */
            public static final c f39892a = new c();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.AbstractC7055b
            /* JADX INFO: renamed from: a */
            public final InterfaceC5853g mo11656a(TypeCheckerState typeCheckerState, InterfaceC5852f interfaceC5852f) {
                C5207g.m11111f(typeCheckerState, "state");
                C5207g.m11111f(interfaceC5852f, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$d */
        public static final class d extends AbstractC7055b {

            /* JADX INFO: renamed from: a */
            public static final d f39893a = new d();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.AbstractC7055b
            /* JADX INFO: renamed from: a */
            public final InterfaceC5853g mo11656a(TypeCheckerState typeCheckerState, InterfaceC5852f interfaceC5852f) {
                C5207g.m11111f(typeCheckerState, "state");
                C5207g.m11111f(interfaceC5852f, "type");
                return typeCheckerState.f39884c.mo11090n0(interfaceC5852f);
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract InterfaceC5853g mo11656a(TypeCheckerState typeCheckerState, InterfaceC5852f interfaceC5852f);
    }

    public TypeCheckerState(boolean z10, boolean z11, InterfaceC5858l interfaceC5858l, AbstractC0140a abstractC0140a, AbstractC0140a abstractC0140a2) {
        C5207g.m11111f(interfaceC5858l, "typeSystemContext");
        C5207g.m11111f(abstractC0140a, "kotlinTypePreparator");
        C5207g.m11111f(abstractC0140a2, "kotlinTypeRefiner");
        this.f39882a = z10;
        this.f39883b = z11;
        this.f39884c = interfaceC5858l;
        this.f39885d = abstractC0140a;
        this.f39886e = abstractC0140a2;
    }

    /* JADX INFO: renamed from: a */
    public final void m14190a() {
        ArrayDeque<InterfaceC5853g> arrayDeque = this.f39888g;
        C5207g.m11108c(arrayDeque);
        arrayDeque.clear();
        C6532d c6532d = this.f39889h;
        C5207g.m11108c(c6532d);
        c6532d.clear();
    }

    /* JADX INFO: renamed from: b */
    public boolean mo14191b(InterfaceC5852f interfaceC5852f, InterfaceC5852f interfaceC5852f2) {
        C5207g.m11111f(interfaceC5852f, "subType");
        C5207g.m11111f(interfaceC5852f2, "superType");
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m14192c() {
        if (this.f39888g == null) {
            this.f39888g = new ArrayDeque<>(4);
        }
        if (this.f39889h == null) {
            this.f39889h = new C6532d();
        }
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC5852f m14193d(InterfaceC5852f interfaceC5852f) {
        C5207g.m11111f(interfaceC5852f, "type");
        return this.f39885d.mo590a0(interfaceC5852f);
    }
}
