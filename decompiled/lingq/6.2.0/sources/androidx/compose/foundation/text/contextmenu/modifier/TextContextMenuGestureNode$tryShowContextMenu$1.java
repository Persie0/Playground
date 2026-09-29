package androidx.compose.foundation.text.contextmenu.modifier;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.gq6;
import p000.gt9;
import p000.ht9;
import p000.kt9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", m4291f = "TextContextMenuGesturesModifier.kt", m4292l = {107, 108}, m4293m = "invokeSuspend", m4294v = 1)
final class TextContextMenuGestureNode$tryShowContextMenu$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2872a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ht9 f2873b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f2874c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kt9 f2875d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gt9 f2876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuGestureNode$tryShowContextMenu$1(ht9 ht9Var, long j, kt9 kt9Var, gt9 gt9Var, Continuation continuation) {
        super(2, continuation);
        this.f2873b = ht9Var;
        this.f2874c = j;
        this.f2875d = kt9Var;
        this.f2876e = gt9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextContextMenuGestureNode$tryShowContextMenu$1(this.f2873b, this.f2874c, this.f2875d, this.f2876e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TextContextMenuGestureNode$tryShowContextMenu$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r6.f2875d.mo1064a(r6.f2876e, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2872a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        zi3 zi3Var = this.f2873b.f42932L;
        if (zi3Var != null) {
            gq6 gq6Var = new gq6(this.f2874c);
            this.f2872a = 1;
            if (zi3Var.invoke(gq6Var, this) != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
        this.f2872a = 2;
    }
}
