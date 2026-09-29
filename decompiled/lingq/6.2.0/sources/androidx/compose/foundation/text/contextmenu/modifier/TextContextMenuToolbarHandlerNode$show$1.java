package androidx.compose.foundation.text.contextmenu.modifier;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.kt9;
import p000.qt9;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1", m4291f = "TextContextMenuToolbarHandlerModifier.kt", m4292l = {205, 206, 208, 208}, m4293m = "invokeSuspend", m4294v = 1)
final class TextContextMenuToolbarHandlerNode$show$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Throwable f2877a;

    /* JADX INFO: renamed from: b */
    public int f2878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qt9 f2879c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kt9 f2880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuToolbarHandlerNode$show$1(qt9 qt9Var, kt9 kt9Var, Continuation continuation) {
        super(2, continuation);
        this.f2879c = qt9Var;
        this.f2880d = kt9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextContextMenuToolbarHandlerNode$show$1(this.f2879c, this.f2880d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TextContextMenuToolbarHandlerNode$show$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        vi3 vi3Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2878b;
        xfa xfaVar = xfa.f68157a;
        qt9 qt9Var = this.f2879c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                vi3 vi3Var2 = qt9Var.f58193M;
                if (vi3Var2 != null) {
                    this.f2878b = 1;
                    if (vi3Var2.invoke(this) == coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else if (i == 2) {
                AbstractC3193b.m15359b(obj);
                vi3Var = qt9Var.f58194N;
                if (vi3Var != null) {
                    this.f2878b = 3;
                    vi3Var.invoke(this);
                    if (xfaVar == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = this.f2877a;
                    AbstractC3193b.m15359b(obj);
                    throw th;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfaVar;
            kt9 kt9Var = this.f2880d;
            this.f2878b = 2;
            if (kt9Var.mo1064a(qt9Var, this) != coroutineSingletons) {
                vi3Var = qt9Var.f58194N;
                if (vi3Var != null) {
                    this.f2878b = 3;
                    vi3Var.invoke(this);
                    if (xfaVar == coroutineSingletons) {
                    }
                }
                return xfaVar;
            }
        } catch (Throwable th2) {
            vi3 vi3Var3 = qt9Var.f58194N;
            if (vi3Var3 == null) {
                throw th2;
            }
            this.f2877a = th2;
            this.f2878b = 4;
            vi3Var3.invoke(this);
            if (xfaVar != coroutineSingletons) {
                th = th2;
            }
            return coroutineSingletons;
        }
        return coroutineSingletons;
    }
}
