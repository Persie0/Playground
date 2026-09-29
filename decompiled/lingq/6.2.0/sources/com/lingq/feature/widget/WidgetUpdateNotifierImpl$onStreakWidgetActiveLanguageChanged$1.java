package com.lingq.feature.widget;

import android.content.Context;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.feature.widget.streak.C2870a;
import com.lingq.feature.widget.streak.StreakDataUpdateWorker;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.widget.WidgetUpdateNotifierImpl$onStreakWidgetActiveLanguageChanged$1", m4291f = "WidgetUpdateNotifierImpl.kt", m4292l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 28}, m4293m = "invokeSuspend", m4294v = 2)
final class WidgetUpdateNotifierImpl$onStreakWidgetActiveLanguageChanged$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2864b f33829b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetUpdateNotifierImpl$onStreakWidgetActiveLanguageChanged$1(C2864b c2864b, String str, Continuation continuation) {
        super(2, continuation);
        this.f33829b = c2864b;
        this.f33830c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WidgetUpdateNotifierImpl$onStreakWidgetActiveLanguageChanged$1(this.f33829b, this.f33830c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WidgetUpdateNotifierImpl$onStreakWidgetActiveLanguageChanged$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r8.m9790e(r1, r7) == r2) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2864b c2864b = this.f33829b;
        Context context = c2864b.f33834a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33828a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f33828a = 1;
            obj = C2864b.m9777a(c2864b, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        StreakDataUpdateWorker.Companion.getClass();
        C2870a.m9788c(context, this.f33830c);
        return xfaVar;
        if (!((Boolean) obj).booleanValue()) {
            return xfaVar;
        }
        C2870a c2870a = StreakDataUpdateWorker.Companion;
        this.f33828a = 2;
    }
}
