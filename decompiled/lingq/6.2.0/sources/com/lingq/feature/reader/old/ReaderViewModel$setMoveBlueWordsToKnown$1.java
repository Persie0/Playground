package com.lingq.feature.reader.old;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$ValueOnOrNot;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.user.ProfileSettings;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.hm5;
import p000.km7;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$setMoveBlueWordsToKnown$1", m4291f = "ReaderViewModel.kt", m4292l = {2492, 2493}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$setMoveBlueWordsToKnown$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f29038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$setMoveBlueWordsToKnown$1(C2412n c2412n, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f29037b = c2412n;
        this.f29038c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$setMoveBlueWordsToKnown$1(this.f29037b, this.f29038c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$setMoveBlueWordsToKnown$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b6, code lost:
    
        if (r3 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29036a;
        xfa xfaVar = xfa.f68157a;
        boolean z = this.f29038c;
        C2412n c2412n = this.f29037b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = c2412n.f29271E;
            this.f29036a = 1;
            if (((C1368a) si7Var).m7852K(z, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        hm5 hm5Var = c2412n.f29292L;
        C1240a c1240a = (C1240a) hm5Var;
        c1240a.m7025f("Reader setting changed", c1240a.m7022c("paging_moves_to_known", (z ? LqAnalyticsValues$ValueOnOrNot.Yes : LqAnalyticsValues$ValueOnOrNot.No).getValue()));
        return xfaVar;
        km7 km7Var = c2412n.f29418x;
        ProfileSettings profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, 16777215);
        this.f29036a = 2;
        ((C1267a) km7Var).m7061B(profileSettings);
    }
}
