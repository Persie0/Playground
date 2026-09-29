package com.lingq.feature.reader.video;

import com.lingq.core.domain.model.language.AppUsageType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.InterfaceC3733ws;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f31222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$2(C2583a c2583a, Continuation continuation) {
        super(2, continuation);
        this.f31223b = c2583a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$2 readerVideoComposeViewModel$observeAppUsageAgainstPlayback$2 = new ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$2(this.f31223b, continuation);
        readerVideoComposeViewModel$observeAppUsageAgainstPlayback$2.f31222a = ((Boolean) obj).booleanValue();
        return readerVideoComposeViewModel$observeAppUsageAgainstPlayback$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$2 readerVideoComposeViewModel$observeAppUsageAgainstPlayback$2 = (ReaderVideoComposeViewModel$observeAppUsageAgainstPlayback$2) create(bool, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerVideoComposeViewModel$observeAppUsageAgainstPlayback$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f31222a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2583a c2583a = this.f31223b;
        int i = c2583a.f31348G;
        InterfaceC3733ws interfaceC3733ws = c2583a.f31393z;
        boolean z2 = c2583a.f31350I;
        xfa xfaVar = xfa.f68157a;
        if (z2) {
            boolean z3 = c2583a.f31352K;
            if (z) {
                if (!z3) {
                    interfaceC3733ws.mo9033o1(AppUsageType.Listening, Integer.valueOf(i));
                    c2583a.f31352K = true;
                }
            } else if (z3) {
                interfaceC3733ws.mo9034v0(AppUsageType.Listening);
                c2583a.f31352K = false;
            }
            if (!c2583a.f31351J) {
                interfaceC3733ws.mo9033o1(AppUsageType.Reading, Integer.valueOf(i));
                c2583a.f31351J = true;
                return xfaVar;
            }
        }
        return xfaVar;
    }
}
