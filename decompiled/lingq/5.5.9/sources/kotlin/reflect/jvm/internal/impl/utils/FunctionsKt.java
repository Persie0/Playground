package kotlin.reflect.jvm.internal.impl.utils;

import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FunctionsKt {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2052l<Object, Boolean> f39944a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2057q<Object, Object, Object, C9072e> f39945b;

    static {
        int i10 = FunctionsKt$IDENTITY$1.f39951b;
        f39944a = new InterfaceC2052l<Object, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_TRUE$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(Object obj) {
                return Boolean.TRUE;
            }
        };
        int i11 = FunctionsKt$ALWAYS_NULL$1.f39946b;
        int i12 = FunctionsKt$DO_NOTHING$1.f39948b;
        int i13 = FunctionsKt$DO_NOTHING_2$1.f39949b;
        f39945b = new InterfaceC2057q<Object, Object, Object, C9072e>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING_3$1
            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final /* bridge */ /* synthetic */ C9072e mo1343M(Object obj, Object obj2, Object obj3) {
                return C9072e.f47360a;
            }
        };
    }
}
