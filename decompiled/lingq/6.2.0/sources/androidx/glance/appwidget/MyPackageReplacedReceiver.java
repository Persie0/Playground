package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lz5;
import p000.ped;
import p000.ph2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
public class MyPackageReplacedReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5965a = 0;

    /* JADX INFO: renamed from: androidx.glance.appwidget.MyPackageReplacedReceiver$onReceive$3 */
    @c32(m4290c = "androidx.glance.appwidget.MyPackageReplacedReceiver$onReceive$3", m4291f = "MyPackageReplacedReceiver.kt", m4292l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 1)
    final class C06493 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f5966a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f5967b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06493(Context context, Continuation continuation) {
            super(2, continuation);
            this.f5967b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C06493(this.f5967b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C06493) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f5966a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C0660h c0660h = new C0660h(this.f5967b);
                this.f5966a = 1;
                if (c0660h.m2238a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            C3386nv.m17633t("onReceive context is null");
            return;
        }
        if (intent == null) {
            C3386nv.m17633t("onReceive intent is null");
        } else {
            if (ped.m19084b(new lz5(6), context)) {
                return;
            }
            AbstractC0658f.m2229b(this, ph2.f56212a, new C06493(context, null));
        }
    }
}
