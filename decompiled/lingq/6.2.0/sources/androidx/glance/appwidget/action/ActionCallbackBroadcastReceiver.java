package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.glance.appwidget.AbstractC0658f;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0785at;
import p000.C3386nv;
import p000.C3485q5;
import p000.InterfaceC3448p5;
import p000.c32;
import p000.d1d;
import p000.o56;
import p000.ped;
import p000.ph2;
import p000.un1;
import p000.xfa;
import p000.y2d;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
public class ActionCallbackBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5981a = 0;

    /* JADX INFO: renamed from: androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver$onReceive$4 */
    @c32(m4290c = "androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver$onReceive$4", m4291f = "ActionCallbackBroadcastReceiver.kt", m4292l = {70}, m4293m = "invokeSuspend", m4294v = 1)
    final class C06514 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f5982a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f5983b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f5984c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0785at f5985d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ o56 f5986e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06514(Context context, String str, C0785at c0785at, o56 o56Var, Continuation continuation) {
            super(2, continuation);
            this.f5983b = context;
            this.f5984c = str;
            this.f5985d = c0785at;
            this.f5986e = o56Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C06514(this.f5983b, this.f5984c, this.f5985d, this.f5986e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C06514) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f5982a;
            xfa xfaVar = xfa.f68157a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            this.f5982a = 1;
            Class<?> cls = Class.forName(this.f5984c);
            if (!InterfaceC3448p5.class.isAssignableFrom(cls)) {
                C3386nv.m17633t("Provided class must implement ActionCallback.");
                return null;
            }
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            Object objOnAction = ((InterfaceC3448p5) objNewInstance).onAction(this.f5983b, this.f5985d, this.f5986e, this);
            if (objOnAction != coroutineSingletons) {
                objOnAction = xfaVar;
            }
            return objOnAction == coroutineSingletons ? coroutineSingletons : xfaVar;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context is null");
            }
            if (intent == null) {
                throw new IllegalArgumentException("Intent is null");
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalArgumentException("The intent must have action parameters extras.");
            }
            o56 o56VarM9994b = d1d.m9994b(extras);
            String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
            if (string == null) {
                throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
            }
            if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
            }
            C0785at c0785at = new C0785at(extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId"));
            if (ped.m19084b(new C3485q5(string, c0785at, o56VarM9994b, 0), context)) {
                return;
            }
            AbstractC0658f.m2229b(this, ph2.f56212a, new C06514(context, string, c0785at, o56VarM9994b, null));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            y2d.m24916g(th);
        }
    }
}
