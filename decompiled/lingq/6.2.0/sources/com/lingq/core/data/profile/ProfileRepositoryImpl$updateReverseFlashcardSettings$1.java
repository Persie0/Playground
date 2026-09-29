package com.lingq.core.data.profile;

import com.lingq.core.domain.model.user.ProfileSettingType;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782}, m4293m = "updateReverseFlashcardSettings", m4294v = 2)
final class ProfileRepositoryImpl$updateReverseFlashcardSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ProfileSettingType f14527a;

    /* JADX INFO: renamed from: b */
    public Map f14528b;

    /* JADX INFO: renamed from: c */
    public Map f14529c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14530d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1267a f14531e;

    /* JADX INFO: renamed from: f */
    public int f14532f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateReverseFlashcardSettings$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14531e = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14530d = obj;
        this.f14532f |= Integer.MIN_VALUE;
        return this.f14531e.m7062C(null, null, null, this);
    }
}
