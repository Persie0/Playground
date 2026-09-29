package com.lingq.feature.reader.reader.domain;

import com.lingq.core.domain.model.library.LibraryItem;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.ap1;
import p000.bj3;
import p000.c32;
import p000.vk9;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.domain.ObserveCourseSubscriptionStateUseCase$invoke$2", m4291f = "ObserveCourseSubscriptionStateUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ObserveCourseSubscriptionStateUseCase$invoke$2 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ LibraryItem f30271a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Set f30272b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f30273c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f30274d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveCourseSubscriptionStateUseCase$invoke$2(int i, Continuation continuation) {
        super(4, continuation);
        this.f30274d = i;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        ObserveCourseSubscriptionStateUseCase$invoke$2 observeCourseSubscriptionStateUseCase$invoke$2 = new ObserveCourseSubscriptionStateUseCase$invoke$2(this.f30274d, (Continuation) obj4);
        observeCourseSubscriptionStateUseCase$invoke$2.f30271a = (LibraryItem) obj;
        observeCourseSubscriptionStateUseCase$invoke$2.f30272b = (Set) obj2;
        observeCourseSubscriptionStateUseCase$invoke$2.f30273c = (String) obj3;
        return observeCourseSubscriptionStateUseCase$invoke$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        LibraryItem libraryItem = this.f30271a;
        Set set = this.f30272b;
        String str = this.f30273c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (libraryItem != null) {
            String str2 = libraryItem.f19412M;
            if (libraryItem.m8088c() || vk9.m23391n0(str) || str2 == null || vk9.m23391n0(str2) || str.equalsIgnoreCase(str2)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        return new ap1(z, set.contains(new Integer(this.f30274d)));
    }
}
