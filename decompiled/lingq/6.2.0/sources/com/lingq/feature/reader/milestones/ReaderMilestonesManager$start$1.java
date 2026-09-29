package com.lingq.feature.reader.milestones;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3502ql;
import p000.c32;
import p000.eh9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.milestones.ReaderMilestonesManager$start$1", m4291f = "ReaderMilestonesManager.kt", m4292l = {DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderMilestonesManager$start$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28154a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2268b f28155b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28156c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f28157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderMilestonesManager$start$1(C2268b c2268b, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.f28155b = c2268b;
        this.f28156c = i;
        this.f28157d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderMilestonesManager$start$1(this.f28155b, this.f28156c, this.f28157d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderMilestonesManager$start$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28154a;
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
        C2268b c2268b = this.f28155b;
        eh9 eh9VarMo7006Q1 = c2268b.f28168a.mo7006Q1();
        C2267a c2267a = new C2267a(c2268b, this.f28156c, this.f28157d);
        this.f28154a = 1;
        Object objCollect = eh9VarMo7006Q1.collect(new C3502ql(c2267a, 7), this);
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
