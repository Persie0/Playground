package kotlin.reflect.jvm.internal.impl.util;

import cm.InterfaceC2052l;
import dm.C5207g;
import io.InterfaceC6378e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.text.Regex;
import mn.C7648e;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7068a {

    /* JADX INFO: renamed from: a */
    public final C7648e f39939a;

    /* JADX INFO: renamed from: b */
    public final Regex f39940b;

    /* JADX INFO: renamed from: c */
    public final Collection<C7648e> f39941c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2052l<InterfaceC6822c, String> f39942d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6378e[] f39943e;

    public C7068a() {
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7068a(Collection<C7648e> collection, InterfaceC6378e[] interfaceC6378eArr, InterfaceC2052l<? super InterfaceC6822c, String> interfaceC2052l) {
        this(null, null, collection, interfaceC2052l, (InterfaceC6378e[]) Arrays.copyOf(interfaceC6378eArr, interfaceC6378eArr.length));
        C5207g.m11111f(collection, "nameList");
        C5207g.m11111f(interfaceC2052l, "additionalChecks");
    }

    public /* synthetic */ C7068a(Set set, InterfaceC6378e[] interfaceC6378eArr) {
        this(set, interfaceC6378eArr, new InterfaceC2052l() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks$4
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Object mo528n(Object obj) {
                C5207g.m11111f((InterfaceC6822c) obj, "$this$null");
                return null;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7068a(C7648e c7648e, Regex regex, Collection<C7648e> collection, InterfaceC2052l<? super InterfaceC6822c, String> interfaceC2052l, InterfaceC6378e... interfaceC6378eArr) {
        this.f39939a = c7648e;
        this.f39940b = regex;
        this.f39941c = collection;
        this.f39942d = interfaceC2052l;
        this.f39943e = interfaceC6378eArr;
    }

    public /* synthetic */ C7068a(C7648e c7648e, InterfaceC6378e[] interfaceC6378eArr) {
        this(c7648e, interfaceC6378eArr, new InterfaceC2052l() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Object mo528n(Object obj) {
                C5207g.m11111f((InterfaceC6822c) obj, "$this$null");
                return null;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7068a(C7648e c7648e, InterfaceC6378e[] interfaceC6378eArr, InterfaceC2052l<? super InterfaceC6822c, String> interfaceC2052l) {
        this(c7648e, null, null, interfaceC2052l, (InterfaceC6378e[]) Arrays.copyOf(interfaceC6378eArr, interfaceC6378eArr.length));
        C5207g.m11111f(c7648e, "name");
        C5207g.m11111f(interfaceC2052l, "additionalChecks");
    }
}
