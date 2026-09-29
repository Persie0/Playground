package p081e0;

import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.internal.C7155e;
import no.C7879x0;
import no.InterfaceC7875v0;
import p260m8.C7499b;
import sl.C9072e;

/* JADX INFO: renamed from: e0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C5333r {

    /* JADX INFO: renamed from: a */
    public static final C5329p f33609a = new C5329p();

    /* JADX INFO: renamed from: a */
    public static final void m11459a(Object obj, InterfaceC2052l interfaceC2052l, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(interfaceC2052l, "effect");
        interfaceC0476a.mo1622c(-1371986847);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y = interfaceC0476a.mo1665y(obj);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
            interfaceC0476a.mo1655t(new C5325n(interfaceC2052l));
        }
        interfaceC0476a.mo1661w();
        interfaceC0476a.mo1661w();
    }

    /* JADX INFO: renamed from: b */
    public static final void m11460b(Object obj, InterfaceC2056p interfaceC2056p, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(interfaceC2056p, "block");
        interfaceC0476a.mo1622c(1179185413);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        CoroutineContext coroutineContextMo1651r = interfaceC0476a.mo1651r();
        interfaceC0476a.mo1622c(1157296644);
        boolean zMo1665y = interfaceC0476a.mo1665y(obj);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
            interfaceC0476a.mo1655t(new C5349z(coroutineContextMo1651r, interfaceC2056p));
        }
        interfaceC0476a.mo1661w();
        interfaceC0476a.mo1661w();
    }

    /* JADX INFO: renamed from: c */
    public static final void m11461c(Object obj, Object obj2, InterfaceC2056p interfaceC2056p, InterfaceC0476a interfaceC0476a) {
        interfaceC0476a.mo1622c(590241125);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        CoroutineContext coroutineContextMo1651r = interfaceC0476a.mo1651r();
        interfaceC0476a.mo1622c(511388516);
        boolean zMo1665y = interfaceC0476a.mo1665y(obj) | interfaceC0476a.mo1665y(obj2);
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
            interfaceC0476a.mo1655t(new C5349z(coroutineContextMo1651r, interfaceC2056p));
        }
        interfaceC0476a.mo1661w();
        interfaceC0476a.mo1661w();
    }

    /* JADX INFO: renamed from: d */
    public static final void m11462d(Object[] objArr, InterfaceC2056p interfaceC2056p, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(objArr, "keys");
        interfaceC0476a.mo1622c(-139560008);
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
        CoroutineContext coroutineContextMo1651r = interfaceC0476a.mo1651r();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        interfaceC0476a.mo1622c(-568225417);
        boolean zMo1665y = false;
        for (Object obj : objArrCopyOf) {
            zMo1665y |= interfaceC0476a.mo1665y(obj);
        }
        Object objMo1624d = interfaceC0476a.mo1624d();
        if (zMo1665y || objMo1624d == InterfaceC0476a.a.f3122a) {
            interfaceC0476a.mo1655t(new C5349z(coroutineContextMo1651r, interfaceC2056p));
        }
        interfaceC0476a.mo1661w();
        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
        interfaceC0476a.mo1661w();
    }

    /* JADX INFO: renamed from: e */
    public static final C7155e m11463e(EmptyCoroutineContext emptyCoroutineContext, InterfaceC0476a interfaceC0476a) {
        C5207g.m11111f(emptyCoroutineContext, "coroutineContext");
        C5207g.m11111f(interfaceC0476a, "composer");
        InterfaceC7875v0.b bVar = InterfaceC7875v0.b.f42976a;
        CoroutineContext coroutineContextMo1651r = interfaceC0476a.mo1651r();
        return C7499b.m14930b(coroutineContextMo1651r.mo1471C(new C7879x0((InterfaceC7875v0) coroutineContextMo1651r.mo1474w(bVar))).mo1471C(emptyCoroutineContext));
    }
}
