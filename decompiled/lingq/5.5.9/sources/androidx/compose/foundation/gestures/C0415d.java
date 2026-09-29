package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$FloatRef;
import p260m8.C7499b;
import p374s.InterfaceC8901d;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0415d {
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: a */
    public static final Object m1492a(ScrollState scrollState, float f3, InterfaceC8901d interfaceC8901d, InterfaceC9968c interfaceC9968c) throws Throwable {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        Ref$FloatRef ref$FloatRef;
        if (interfaceC9968c instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) interfaceC9968c;
            int i10 = scrollExtensionsKt$animateScrollBy$1.f2158f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.f2158f = i10 - Integer.MIN_VALUE;
            } else {
                scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(interfaceC9968c);
            }
        } else {
            scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(interfaceC9968c);
        }
        Object obj = scrollExtensionsKt$animateScrollBy$1.f2157e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = scrollExtensionsKt$animateScrollBy$1.f2158f;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(f3, interfaceC8901d, ref$FloatRef2, null);
            scrollExtensionsKt$animateScrollBy$1.f2156d = ref$FloatRef2;
            scrollExtensionsKt$animateScrollBy$1.f2158f = 1;
            if (scrollState.mo1417b(MutatePriority.Default, scrollExtensionsKt$animateScrollBy$2, scrollExtensionsKt$animateScrollBy$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$FloatRef = scrollExtensionsKt$animateScrollBy$1.f2156d;
            C7499b.m14977z0(obj);
        }
        return new Float(ref$FloatRef.f38124a);
    }
}
