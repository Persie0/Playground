package com.lingq.core.data.profile;

import com.lingq.core.domain.model.user.ProfileSetting;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {815, 825}, m4293m = "updateTransliterationScripts", m4294v = 2)
final class ProfileRepositoryImpl$updateTransliterationScripts$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ProfileSetting f14559a;

    /* JADX INFO: renamed from: b */
    public String f14560b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14561c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1267a f14562d;

    /* JADX INFO: renamed from: e */
    public int f14563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateTransliterationScripts$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14562d = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14561c = obj;
        this.f14563e |= Integer.MIN_VALUE;
        return this.f14562d.m7067H(null, null, this);
    }
}
