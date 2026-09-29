package com.lingq.p020ui;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.ProfileSettings;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.km7;
import p000.nm7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$setIgnoreTimestamp$1", m4291f = "MainViewModel.kt", m4292l = {264, 265, 267}, m4293m = "invokeSuspend", m4294v = 2)
final class MainViewModel$setIgnoreTimestamp$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f34138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2889e f34139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f34140c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f34141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$setIgnoreTimestamp$1(C2889e c2889e, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f34139b = c2889e;
        this.f34140c = str;
        this.f34141d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$setIgnoreTimestamp$1(this.f34139b, this.f34140c, this.f34141d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MainViewModel$setIgnoreTimestamp$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0132  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2889e c2889e;
        String str;
        km7 km7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f34138a;
        xfa xfaVar = xfa.f68157a;
        String str2 = this.f34140c;
        C2889e c2889e2 = this.f34139b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            nm7 nm7Var = c2889e2.f34215q;
            this.f34138a = 1;
            if (((C1369b) nm7Var).m7918e(str2, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            str = str2;
            c2889e = c2889e2;
        }
        if (this.f34141d) {
            km7Var = c2889e.f34212n;
            this.f34138a = 3;
            if (((C1267a) km7Var).m7066G(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        km7 km7Var2 = c2889e2.f34212n;
        c2889e = c2889e2;
        ProfileSettings profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str2, null, null, null, null, -1, -1, 16646143);
        str = str2;
        this.f34138a = 2;
        ((C1267a) km7Var2).m7061B(profileSettings);
        if (xfaVar != coroutineSingletons) {
            if (this.f34141d) {
                km7Var = c2889e.f34212n;
                this.f34138a = 3;
                if (((C1267a) km7Var).m7066G(str, this) == coroutineSingletons) {
                }
            }
            return xfaVar;
        }
        return coroutineSingletons;
    }
}
