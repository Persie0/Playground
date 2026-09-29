package com.lingq.core.data.profile;

import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.ProfileSetting;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {715, 716, 717, 719, 721, 722, 723, 727, 731, 735, 736, 737, 739, 740, 741, 743}, m4293m = "updateReviewSettings", m4294v = 2)
final class ProfileRepositoryImpl$updateReviewSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Profile f14533a;

    /* JADX INFO: renamed from: b */
    public String f14534b;

    /* JADX INFO: renamed from: c */
    public Map f14535c;

    /* JADX INFO: renamed from: d */
    public Map f14536d;

    /* JADX INFO: renamed from: e */
    public Map f14537e;

    /* JADX INFO: renamed from: f */
    public ProfileSetting f14538f;

    /* JADX INFO: renamed from: g */
    public int f14539g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f14540h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1267a f14541i;

    /* JADX INFO: renamed from: j */
    public int f14542j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$updateReviewSettings$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14541i = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14540h = obj;
        this.f14542j |= Integer.MIN_VALUE;
        return this.f14541i.m7063D(null, null, this);
    }
}
