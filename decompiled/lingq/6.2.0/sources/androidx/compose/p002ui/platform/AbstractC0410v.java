package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.node.Owner;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.ho2;
import p000.l77;
import p000.te1;
import p000.tw4;
import p000.vh9;
import p000.xwc;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.platform.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0410v {

    /* JADX INFO: renamed from: a */
    public static final vh9 f4867a = new vh9(C0382x724ffdd5.f4586b);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final CoroutineSingletons m1820a(tw4 tw4Var, zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        PlatformTextInputModifierNodeKt$establishTextInputSession$1 platformTextInputModifierNodeKt$establishTextInputSession$1;
        if (continuationImpl instanceof PlatformTextInputModifierNodeKt$establishTextInputSession$1) {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = (PlatformTextInputModifierNodeKt$establishTextInputSession$1) continuationImpl;
            int i = platformTextInputModifierNodeKt$establishTextInputSession$1.f4588b;
            if ((i & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$establishTextInputSession$1.f4588b = i - Integer.MIN_VALUE;
            } else {
                platformTextInputModifierNodeKt$establishTextInputSession$1 = new PlatformTextInputModifierNodeKt$establishTextInputSession$1(continuationImpl);
            }
        } else {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = new PlatformTextInputModifierNodeKt$establishTextInputSession$1(continuationImpl);
        }
        Object obj = platformTextInputModifierNodeKt$establishTextInputSession$1.f4587a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = platformTextInputModifierNodeKt$establishTextInputSession$1.f4588b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (!tw4Var.f34837a.f34836I) {
                C3386nv.m17626m("establishTextInputSession called from an unattached node");
                return null;
            }
            Owner ownerM21980M = te1.m21980M(tw4Var);
            l77 l77Var = (l77) te1.m21979L(tw4Var).f4330W;
            l77Var.getClass();
            if (xwc.m24743P(l77Var, f4867a) != null) {
                ho2.m13383c();
                return null;
            }
            platformTextInputModifierNodeKt$establishTextInputSession$1.f4588b = 1;
            if (m1821b(ownerM21980M, zi3Var, platformTextInputModifierNodeKt$establishTextInputSession$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final CoroutineSingletons m1821b(Owner owner, zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 platformTextInputModifierNodeKt$interceptedTextInputSession$1;
        if (continuationImpl instanceof PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) {
            platformTextInputModifierNodeKt$interceptedTextInputSession$1 = (PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) continuationImpl;
            int i = platformTextInputModifierNodeKt$interceptedTextInputSession$1.f4590b;
            if ((i & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1.f4590b = i - Integer.MIN_VALUE;
            } else {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1 = new PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(continuationImpl);
            }
        } else {
            platformTextInputModifierNodeKt$interceptedTextInputSession$1 = new PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(continuationImpl);
        }
        Object obj = platformTextInputModifierNodeKt$interceptedTextInputSession$1.f4589a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = platformTextInputModifierNodeKt$interceptedTextInputSession$1.f4590b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            platformTextInputModifierNodeKt$interceptedTextInputSession$1.f4590b = 1;
            if (((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1741Q(zi3Var, platformTextInputModifierNodeKt$interceptedTextInputSession$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                C3386nv.m17631r();
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }
}
