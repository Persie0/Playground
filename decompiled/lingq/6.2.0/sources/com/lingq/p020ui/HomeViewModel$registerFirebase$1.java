package com.lingq.p020ui;

import android.os.Build;
import com.lingq.core.data.profile.C1267a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.km7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel$registerFirebase$1", m4291f = "HomeViewModel.kt", m4292l = {179}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeViewModel$registerFirebase$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33977a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2888d f33978b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33979c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f33980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$registerFirebase$1(C2888d c2888d, String str, String str2, Continuation continuation) {
        super(2, continuation);
        String str3 = Build.MODEL;
        this.f33978b = c2888d;
        this.f33979c = str;
        this.f33980d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        String str = Build.MODEL;
        return new HomeViewModel$registerFirebase$1(this.f33978b, this.f33979c, this.f33980d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeViewModel$registerFirebase$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33977a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                km7 km7Var = this.f33978b.f34170e;
                String str = this.f33979c;
                String str2 = this.f33980d;
                String str3 = Build.MODEL;
                this.f33977a = 1;
                if (((C1267a) km7Var).m7082k(str, str2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }
}
