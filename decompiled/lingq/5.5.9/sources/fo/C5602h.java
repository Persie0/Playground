package fo;

import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import mn.C7648e;
import p260m8.C7499b;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8838g;
import p543do.InterfaceC5240k0;

/* JADX INFO: renamed from: fo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C5602h {

    /* JADX INFO: renamed from: a */
    public static final C5602h f34418a = new C5602h();

    /* JADX INFO: renamed from: b */
    public static final C5597c f34419b = C5597c.f34402a;

    /* JADX INFO: renamed from: c */
    public static final C5595a f34420c;

    /* JADX INFO: renamed from: d */
    public static final C5600f f34421d;

    /* JADX INFO: renamed from: e */
    public static final C5600f f34422e;

    /* JADX INFO: renamed from: f */
    public static final Set<InterfaceC8829b0> f34423f;

    static {
        String str = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        C5207g.m11110e(str, "format(this, *args)");
        f34420c = new C5595a(C7648e.m15234o(str));
        f34421d = m11912c(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        f34422e = m11912c(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        f34423f = C7499b.m14972w0(new C5598d());
    }

    /* JADX INFO: renamed from: a */
    public static final C5599e m11910a(ErrorScopeKind errorScopeKind, boolean z10, String... strArr) {
        C5207g.m11111f(errorScopeKind, "kind");
        C5207g.m11111f(strArr, "formatParams");
        return z10 ? new C5603i(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length)) : new C5599e(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: b */
    public static final C5599e m11911b(ErrorScopeKind errorScopeKind, String... strArr) {
        C5207g.m11111f(errorScopeKind, "kind");
        return m11910a(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: c */
    public static final C5600f m11912c(ErrorTypeKind errorTypeKind, String... strArr) {
        C5207g.m11111f(errorTypeKind, "kind");
        EmptyList emptyList = EmptyList.f38032a;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        C5207g.m11111f(emptyList, "arguments");
        C5207g.m11111f(strArr2, "formatParams");
        return m11914e(errorTypeKind, emptyList, m11913d(errorTypeKind, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    /* JADX INFO: renamed from: d */
    public static C5601g m11913d(ErrorTypeKind errorTypeKind, String... strArr) {
        C5207g.m11111f(errorTypeKind, "kind");
        C5207g.m11111f(strArr, "formatParams");
        return new C5601g(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: e */
    public static C5600f m11914e(ErrorTypeKind errorTypeKind, List list, InterfaceC5240k0 interfaceC5240k0, String... strArr) {
        C5207g.m11111f(errorTypeKind, "kind");
        C5207g.m11111f(list, "arguments");
        C5207g.m11111f(strArr, "formatParams");
        return new C5600f(interfaceC5240k0, m11911b(ErrorScopeKind.ERROR_TYPE_SCOPE, interfaceC5240k0.toString()), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m11915f(InterfaceC8838g interfaceC8838g) {
        return interfaceC8838g != null && ((interfaceC8838g instanceof C5595a) || (interfaceC8838g.mo11876g() instanceof C5595a) || interfaceC8838g == f34419b);
    }
}
