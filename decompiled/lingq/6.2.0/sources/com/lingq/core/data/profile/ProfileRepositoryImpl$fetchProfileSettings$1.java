package com.lingq.core.data.profile;

import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.ProfileSettings;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zz7;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.profile.ProfileRepositoryImpl", m4291f = "ProfileRepositoryImpl.kt", m4292l = {572, 573, 579, 582, 583, 584, 585, 588, 589, 594, 595, 600, 633, 639, 640, 641, 642, 643, 644, 646, 650, 652, 654, 667, 690, 692, 693, 696, 698, 700, 704}, m4293m = "fetchProfileSettings", m4294v = 2)
final class ProfileRepositoryImpl$fetchProfileSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Profile f14428a;

    /* JADX INFO: renamed from: b */
    public ProfileSettings f14429b;

    /* JADX INFO: renamed from: c */
    public ProfileSettings f14430c;

    /* JADX INFO: renamed from: d */
    public LqTheme f14431d;

    /* JADX INFO: renamed from: e */
    public zz7 f14432e;

    /* JADX INFO: renamed from: f */
    public int f14433f;

    /* JADX INFO: renamed from: g */
    public int f14434g;

    /* JADX INFO: renamed from: h */
    public int f14435h;

    /* JADX INFO: renamed from: i */
    public int f14436i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f14437j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C1267a f14438k;

    /* JADX INFO: renamed from: l */
    public int f14439l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileRepositoryImpl$fetchProfileSettings$1(C1267a c1267a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14438k = c1267a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14437j = obj;
        this.f14439l |= Integer.MIN_VALUE;
        return this.f14438k.m7074c(this);
    }
}
