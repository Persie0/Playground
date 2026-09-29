package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.C3386nv;
import p000.bo8;
import p000.e16;
import p000.f63;
import p000.gq6;
import p000.lv9;
import p000.u27;
import p000.v56;
import p000.zl8;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0110r {

    /* JADX INFO: renamed from: a */
    public static final zl8 f2310a = new zl8(28);

    /* JADX INFO: renamed from: b */
    public static final bo8 f2311b = new bo8();

    /* JADX INFO: renamed from: c */
    public static final f63 f2312c = new f63(1);

    /* JADX INFO: renamed from: d */
    public static final u27 f2313d = new u27(1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m917a(C0116v c0116v, long j, ContinuationImpl continuationImpl) throws Throwable {
        ScrollableKt$semanticsScrollBy$1 scrollableKt$semanticsScrollBy$1;
        Ref$FloatRef ref$FloatRef;
        C0116v c0116v2;
        if (continuationImpl instanceof ScrollableKt$semanticsScrollBy$1) {
            scrollableKt$semanticsScrollBy$1 = (ScrollableKt$semanticsScrollBy$1) continuationImpl;
            int i = scrollableKt$semanticsScrollBy$1.f2053d;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollableKt$semanticsScrollBy$1.f2053d = i - Integer.MIN_VALUE;
            } else {
                scrollableKt$semanticsScrollBy$1 = new ScrollableKt$semanticsScrollBy$1(continuationImpl);
            }
        } else {
            scrollableKt$semanticsScrollBy$1 = new ScrollableKt$semanticsScrollBy$1(continuationImpl);
        }
        Object obj = scrollableKt$semanticsScrollBy$1.f2052c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = scrollableKt$semanticsScrollBy$1.f2053d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            ref$FloatRef = new Ref$FloatRef();
            MutatePriority mutatePriority = MutatePriority.Default;
            ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(c0116v, j, ref$FloatRef, null);
            scrollableKt$semanticsScrollBy$1.f2050a = c0116v;
            scrollableKt$semanticsScrollBy$1.f2051b = ref$FloatRef;
            scrollableKt$semanticsScrollBy$1.f2053d = 1;
            if (c0116v.m934f(mutatePriority, scrollableKt$semanticsScrollBy$2, scrollableKt$semanticsScrollBy$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c0116v2 = c0116v;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$FloatRef ref$FloatRef2 = scrollableKt$semanticsScrollBy$1.f2051b;
            C0116v c0116v3 = scrollableKt$semanticsScrollBy$1.f2050a;
            AbstractC3193b.m15359b(obj);
            ref$FloatRef = ref$FloatRef2;
            c0116v2 = c0116v3;
        }
        return new gq6(c0116v2.m936h(ref$FloatRef.f47715a));
    }

    /* JADX INFO: renamed from: b */
    public static e16 m918b(lv9 lv9Var, Orientation orientation, boolean z, boolean z2, v56 v56Var) {
        return new C0109q(lv9Var, orientation, z, z2, v56Var);
    }
}
