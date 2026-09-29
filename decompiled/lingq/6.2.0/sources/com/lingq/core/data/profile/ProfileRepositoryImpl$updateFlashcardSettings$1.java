package com.lingq.core.data.profile;

import com.lingq.core.domain.model.user.ProfileSettingType;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {751, 752, 753, 754, 755, 756, 757, 758, 759, 760, 761, 762}, m4293m = "updateFlashcardSettings", m4294v = 2)
final class ProfileRepositoryImpl$updateFlashcardSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ProfileSettingType f14517a;

    /* JADX INFO: renamed from: b */
    public Map f14518b;

    /* JADX INFO: renamed from: c */
    public Map f14519c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14520d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1267a f14521e;

    /* JADX INFO: renamed from: f */
    public int f14522f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateFlashcardSettings$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14521e = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14520d = obj;
        this.f14522f |= Integer.MIN_VALUE;
        return this.f14521e.m7096z(null, null, null, this);
    }
}
