package com.lingq.core.data.profile;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {243}, m4293m = "registrationValidateFields", m4294v = 2)
final class ProfileRepositoryImpl$registrationValidateFields$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f14487a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1267a f14488b;

    /* JADX INFO: renamed from: c */
    public int f14489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$registrationValidateFields$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14488b = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14487a = obj;
        this.f14489c |= Integer.MIN_VALUE;
        return this.f14488b.m7089r(null, null, this);
    }
}
