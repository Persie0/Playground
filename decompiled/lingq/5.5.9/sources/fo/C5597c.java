package fo;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6793a;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import mn.C7646c;
import mn.C7648e;
import p080e.C5288t;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8868z;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: fo.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C5597c implements InterfaceC8863u {

    /* JADX INFO: renamed from: a */
    public static final C5597c f34402a = new C5597c();

    /* JADX INFO: renamed from: b */
    public static final C7648e f34403b = C7648e.m15234o(ErrorEntity.ERROR_MODULE.getDebugText());

    /* JADX INFO: renamed from: c */
    public static final EmptyList f34404c = EmptyList.f38032a;

    /* JADX INFO: renamed from: d */
    public static final C6793a f34405d;

    static {
        EmptySet emptySet = EmptySet.f38034a;
        f34405d = C6793a.f38320f;
    }

    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: A0 */
    public final List<InterfaceC8863u> mo11870A0() {
        return f34404c;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return null;
    }

    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: O */
    public final <T> T mo11872O(C5288t c5288t) {
        C5207g.m11111f(c5288t, "capability");
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: R */
    public final InterfaceC8868z mo11873R(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: a */
    public final C7648e mo11874a() {
        return f34403b;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8838g mo18004P0() {
        return this;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        return null;
    }

    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: o */
    public final AbstractC6795c mo11877o() {
        return f34405d;
    }

    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: t */
    public final Collection<C7646c> mo11878t(C7646c c7646c, InterfaceC2052l<? super C7648e, Boolean> interfaceC2052l) {
        C5207g.m11111f(c7646c, "fqName");
        C5207g.m11111f(interfaceC2052l, "nameFilter");
        return EmptyList.f38032a;
    }

    @Override // p372rm.InterfaceC8863u
    /* JADX INFO: renamed from: t0 */
    public final boolean mo11879t0(InterfaceC8863u interfaceC8863u) {
        C5207g.m11111f(interfaceC8863u, "targetModule");
        return false;
    }

    @Override // sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public final InterfaceC9077e mo11289w() {
        return InterfaceC9077e.a.f47365a;
    }
}
