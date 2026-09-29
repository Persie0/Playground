package com.lingq.core.data.profile;

import com.lingq.core.domain.model.user.ProfileSetting;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {515, 528}, m4293m = "syncProfileSettings", m4294v = 2)
final class ProfileRepositoryImpl$syncProfileSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f14494a;

    /* JADX INFO: renamed from: b */
    public ProfileSetting f14495b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14496c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1267a f14497d;

    /* JADX INFO: renamed from: e */
    public int f14498e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$syncProfileSettings$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14497d = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14496c = obj;
        this.f14498e |= Integer.MIN_VALUE;
        return this.f14497d.m7091u(0, null, this);
    }
}
