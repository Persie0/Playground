package com.lingq.core.data.profile;

import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import com.lingq.core.domain.model.user.ProfileSettingType;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {795}, m4293m = "updateSimpleActivitySettings", m4294v = 2)
final class ProfileRepositoryImpl$updateSimpleActivitySettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ProfileSettingType f14543a;

    /* JADX INFO: renamed from: b */
    public ReviewSettingsKeys f14544b;

    /* JADX INFO: renamed from: c */
    public Map f14545c;

    /* JADX INFO: renamed from: d */
    public Map f14546d;

    /* JADX INFO: renamed from: e */
    public Map f14547e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f14548f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1267a f14549g;

    /* JADX INFO: renamed from: h */
    public int f14550h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateSimpleActivitySettings$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14549g = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14548f = obj;
        this.f14550h |= Integer.MIN_VALUE;
        return this.f14549g.m7064E(null, null, null, null, null, null, this);
    }
}
