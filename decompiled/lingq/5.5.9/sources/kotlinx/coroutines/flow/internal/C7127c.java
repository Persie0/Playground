package kotlinx.coroutines.flow.internal;

import ae.C0062b;
import cm.InterfaceC2041a;
import cm.InterfaceC2057q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p349qo.C8660f;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C7127c {
    /* JADX INFO: renamed from: a */
    public static final Object m14386a(InterfaceC9968c interfaceC9968c, InterfaceC2041a interfaceC2041a, InterfaceC2057q interfaceC2057q, InterfaceC7117d interfaceC7117d, InterfaceC7116c[] interfaceC7116cArr) throws Throwable {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(null, interfaceC2041a, interfaceC2057q, interfaceC7117d, interfaceC7116cArr);
        C8660f c8660f = new C8660f(interfaceC9968c, interfaceC9968c.mo2029e());
        Object objM350g2 = C0062b.m350g2(c8660f, c8660f, combineKt$combineInternal$2);
        return objM350g2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM350g2 : C9072e.f47360a;
    }
}
