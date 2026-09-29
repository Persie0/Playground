package com.lingq.core.data.profile;

import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import com.lingq.core.domain.model.user.ProfileSettingType;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {807}, m4293m = "updateAutoplayOnlyActivity", m4294v = 2)
final class ProfileRepositoryImpl$updateAutoplayOnlyActivity$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ProfileSettingType f14511a;

    /* JADX INFO: renamed from: b */
    public ReviewSettingsKeys f14512b;

    /* JADX INFO: renamed from: c */
    public Map f14513c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14514d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1267a f14515e;

    /* JADX INFO: renamed from: f */
    public int f14516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateAutoplayOnlyActivity$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14515e = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14514d = obj;
        this.f14516f |= Integer.MIN_VALUE;
        return this.f14515e.m7095y(null, null, null, null, this);
    }
}
