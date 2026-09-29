package com.amplitude.core.utilities;

import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.pj5;
import p000.u91;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.amplitude.core.utilities.FileResponseHandler$handleBadRequestResponse$5", m4291f = "FileResponseHandler.kt", m4292l = {}, m4293m = "invokeSuspend")
final class FileResponseHandler$handleBadRequestResponse$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0915c f11223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f11224b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f11225c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ArrayList f11226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileResponseHandler$handleBadRequestResponse$5(C0915c c0915c, String str, ArrayList arrayList, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.f11223a = c0915c;
        this.f11224b = str;
        this.f11225c = arrayList;
        this.f11226d = arrayList2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FileResponseHandler$handleBadRequestResponse$5(this.f11223a, this.f11224b, this.f11225c, this.f11226d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FileResponseHandler$handleBadRequestResponse$5 fileResponseHandler$handleBadRequestResponse$5 = (FileResponseHandler$handleBadRequestResponse$5) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        fileResponseHandler$handleBadRequestResponse$5.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0915c c0915c = this.f11223a;
        pj5 pj5Var = c0915c.f11268e;
        String str = this.f11224b;
        if (pj5Var != null) {
            pj5Var.mo16256b("--> remove file: " + u91.m22616h1(2, vk9.m23365A0(str, new String[]{"-"}, 0, 6)) + ", dropped events: " + this.f11225c.size() + ", retry events: " + this.f11226d.size());
        }
        c0915c.f11264a.m5100e(str);
        return xfa.f68157a;
    }
}
