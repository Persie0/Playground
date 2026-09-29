package com.lingq.core.data.profile;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {473, 478}, m4293m = "updateActiveLocales", m4294v = 2)
final class ProfileRepositoryImpl$updateActiveLocales$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ArrayList f14507a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14508b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1267a f14509c;

    /* JADX INFO: renamed from: d */
    public int f14510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateActiveLocales$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14509c = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14508b = obj;
        this.f14510d |= Integer.MIN_VALUE;
        return this.f14509c.m7094x(null, this);
    }
}
