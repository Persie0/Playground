package com.lingq.feature.imports;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.dt2;
import p000.e24;
import p000.et2;
import p000.f24;
import p000.ika;
import p000.m14;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$importUiState$1", m4291f = "UserImportViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportViewModel$importUiState$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f26119a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ m14 f26120b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ et2 f26121c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Pair f26122d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f26123e;

    public UserImportViewModel$importUiState$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        UserImportViewModel$importUiState$1 userImportViewModel$importUiState$1 = new UserImportViewModel$importUiState$1((Continuation) obj6);
        userImportViewModel$importUiState$1.f26119a = zBooleanValue;
        userImportViewModel$importUiState$1.f26120b = (m14) obj2;
        userImportViewModel$importUiState$1.f26121c = (et2) obj3;
        userImportViewModel$importUiState$1.f26122d = (Pair) obj4;
        userImportViewModel$importUiState$1.f26123e = zBooleanValue2;
        return userImportViewModel$importUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f26119a;
        m14 m14Var = this.f26120b;
        et2 dt2Var = this.f26121c;
        Pair pair = this.f26122d;
        boolean z2 = this.f26123e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Object obj2 = pair.f47623a;
        Object obj3 = pair.f47624b;
        boolean z3 = ((Number) obj2).intValue() > 0 || ((CharSequence) obj3).length() > 0;
        if (z && dt2Var == null && !z3) {
            return f24.f38306a;
        }
        ika ikaVar = m14Var.f50430a;
        boolean z4 = m14Var.f50431b;
        if (dt2Var == null) {
            dt2Var = z3 ? new dt2(((Number) pair.f47623a).intValue(), (String) obj3) : null;
        }
        return new e24(ikaVar, z2, z4, dt2Var);
    }
}
