package com.lingq.core.data.profile;

import com.lingq.core.domain.model.user.ProfileSettings;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {890, 891}, m4293m = "networkProfileSettings", m4294v = 2)
final class ProfileRepositoryImpl$networkProfileSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ProfileSettings f14461a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14463c;

    /* JADX INFO: renamed from: d */
    public int f14464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$networkProfileSettings$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14463c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14462b = obj;
        this.f14464d |= Integer.MIN_VALUE;
        return this.f14463c.m7081j(null, this);
    }
}
