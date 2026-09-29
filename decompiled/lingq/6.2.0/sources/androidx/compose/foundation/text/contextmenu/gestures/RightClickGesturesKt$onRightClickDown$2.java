package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.gq6;
import p000.kg7;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", m4291f = "RightClickGestures.kt", m4292l = {32, DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 1)
final class RightClickGesturesKt$onRightClickDown$2 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public int f2854b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f2855c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f2856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightClickGesturesKt$onRightClickDown$2(vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f2856d = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RightClickGesturesKt$onRightClickDown$2 rightClickGesturesKt$onRightClickDown$2 = new RightClickGesturesKt$onRightClickDown$2(this.f2856d, continuation);
        rightClickGesturesKt$onRightClickDown$2.f2855c = obj;
        return rightClickGesturesKt$onRightClickDown$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RightClickGesturesKt$onRightClickDown$2) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0332f c0332f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2854b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c0332f = (C0332f) this.f2855c;
            this.f2855c = c0332f;
            this.f2854b = 1;
            obj = AbstractC0168a.m1062a(c0332f, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            c0332f = (C0332f) this.f2855c;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        kg7 kg7Var = (kg7) obj;
        if (kg7Var != null) {
            kg7Var.m15189a();
        }
        return xfa.f68157a;
        kg7 kg7Var2 = (kg7) obj;
        kg7Var2.m15189a();
        this.f2856d.invoke(new gq6(kg7Var2.f47237c));
        this.f2855c = null;
        this.f2854b = 2;
        aj3 aj3Var = AbstractC0117w.f2373a;
        obj = AbstractC0117w.m947j(c0332f, PointerEventPass.Main, this);
    }
}
