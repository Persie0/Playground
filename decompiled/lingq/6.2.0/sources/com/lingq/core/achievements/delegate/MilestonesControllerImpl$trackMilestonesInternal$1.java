package com.lingq.core.achievements.delegate;

import com.lingq.core.domain.model.language.LanguageStudyStats;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zy5;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.achievements.delegate.MilestonesControllerImpl", m4291f = "MilestonesController.kt", m4292l = {50, 53, 55, 58, 64, 65, 68, 84, 108}, m4293m = "trackMilestonesInternal", m4294v = 2)
final class MilestonesControllerImpl$trackMilestonesInternal$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public Collection f14246H;

    /* JADX INFO: renamed from: I */
    public int f14247I;

    /* JADX INFO: renamed from: J */
    public int f14248J;

    /* JADX INFO: renamed from: K */
    public /* synthetic */ Object f14249K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C1239b f14250L;

    /* JADX INFO: renamed from: M */
    public int f14251M;

    /* JADX INFO: renamed from: a */
    public long f14252a;

    /* JADX INFO: renamed from: b */
    public String f14253b;

    /* JADX INFO: renamed from: c */
    public String f14254c;

    /* JADX INFO: renamed from: d */
    public zy5 f14255d;

    /* JADX INFO: renamed from: e */
    public List f14256e;

    /* JADX INFO: renamed from: f */
    public LanguageStudyStats f14257f;

    /* JADX INFO: renamed from: g */
    public List f14258g;

    /* JADX INFO: renamed from: h */
    public List f14259h;

    /* JADX INFO: renamed from: i */
    public Collection f14260i;

    /* JADX INFO: renamed from: j */
    public Iterator f14261j;

    /* JADX INFO: renamed from: k */
    public DailyGoalMet f14262k;

    /* JADX INFO: renamed from: l */
    public List f14263l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestonesControllerImpl$trackMilestonesInternal$1(C1239b c1239b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f14250L = c1239b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f14249K = obj;
        this.f14251M |= Integer.MIN_VALUE;
        return this.f14250L.m7017b(0L, this);
    }
}
