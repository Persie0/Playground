package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.C3463pk;
import p000.C3651uk;
import p000.C3688vk;
import p000.RunnableC3725wk;
import p000.RunnableC3781y2;
import p000.a83;
import p000.c32;
import p000.dt9;
import p000.ed9;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", m4291f = "AndroidTextContextMenuToolbarProvider.android.kt", m4292l = {183}, m4293m = "invokeSuspend", m4294v = 1)
final class AndroidTextContextMenuToolbarProvider$showTextContextMenu$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f2857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0170a f2858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dt9 f2859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(C0170a c0170a, dt9 dt9Var, Continuation continuation) {
        super(1, continuation);
        this.f2858b = c0170a;
        this.f2859c = dt9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this.f2858b, this.f2859c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((AndroidTextContextMenuToolbarProvider$showTextContextMenu$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3651uk c3651uk;
        C0170a c0170a = this.f2858b;
        ed9 ed9Var = c0170a.f2864e;
        View view = c0170a.f2860a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2857a;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C3688vk c3688vk = new C3688vk();
                dt9 dt9Var = this.f2859c;
                C3651uk c3651uk2 = new C3651uk(c3688vk, new C3463pk(c0170a, dt9Var, 0), new C3463pk(c0170a, dt9Var, 1), view);
                vi3 vi3Var = c0170a.f2861b;
                if (vi3Var != null && (c3651uk = (C3651uk) vi3Var.invoke(c3651uk2)) != null) {
                    c3651uk2 = c3651uk;
                }
                Looper looperMyLooper = Looper.myLooper();
                Handler handler = view.getHandler();
                if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                    RunnableC3725wk runnableC3725wk = c0170a.f2868i;
                    if (runnableC3725wk == null) {
                        runnableC3725wk = new RunnableC3725wk(c0170a, c3651uk2, c3688vk, 0);
                        c0170a.f2868i = runnableC3725wk;
                    }
                    view.post(runnableC3725wk);
                } else {
                    ActionMode actionModeStartActionMode = view.startActionMode(new a83(c3651uk2), 1);
                    if (actionModeStartActionMode == null) {
                        return xfaVar;
                    }
                    c0170a.f2867h = actionModeStartActionMode;
                }
                this.f2857a = 1;
                C3211a c3211a = c3688vk.f65523a;
                c3211a.getClass();
                Object objM15448I = C3211a.m15448I(c3211a, this);
                if (objM15448I != coroutineSingletons) {
                    objM15448I = xfaVar;
                }
                if (objM15448I == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            ed9Var.m11065a();
            Looper looperMyLooper2 = Looper.myLooper();
            Handler handler2 = view.getHandler();
            if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                Runnable runnableC3781y2 = c0170a.f2869j;
                if (runnableC3781y2 == null) {
                    runnableC3781y2 = new RunnableC3781y2(c0170a, 1);
                    c0170a.f2869j = runnableC3781y2;
                }
                view.post(runnableC3781y2);
            } else {
                ActionMode actionMode = c0170a.f2867h;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            RunnableC3725wk runnableC3725wk2 = c0170a.f2868i;
            if (runnableC3725wk2 != null) {
                view.removeCallbacks(runnableC3725wk2);
            }
            c0170a.f2867h = null;
            return xfaVar;
        } catch (Throwable th) {
            ed9Var.m11065a();
            Looper looperMyLooper3 = Looper.myLooper();
            Handler handler3 = view.getHandler();
            if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                Runnable runnableC3781y3 = c0170a.f2869j;
                if (runnableC3781y3 == null) {
                    runnableC3781y3 = new RunnableC3781y2(c0170a, 1);
                    c0170a.f2869j = runnableC3781y3;
                }
                view.post(runnableC3781y3);
            } else {
                ActionMode actionMode2 = c0170a.f2867h;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            RunnableC3725wk runnableC3725wk3 = c0170a.f2868i;
            if (runnableC3725wk3 != null) {
                view.removeCallbacks(runnableC3725wk3);
            }
            c0170a.f2867h = null;
            throw th;
        }
    }
}
