package com.lingq.core.domain.library;

import com.lingq.core.data.repository.C1286b;
import com.lingq.core.data.repository.C1294j;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.library.C1387b;
import com.lingq.core.domain.model.language.LanguageProgressInterval;
import com.lingq.core.domain.util.AbstractC1543a;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.c83;
import p000.kad;
import p000.m83;
import p000.oo4;
import p000.ui3;
import p000.vma;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.domain.library.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1387b {

    /* JADX INFO: renamed from: a */
    public final Object f18831a;

    public C1387b(vma vmaVar) {
        vmaVar.getClass();
        this.f18831a = vmaVar;
    }

    /* JADX INFO: renamed from: a */
    public c83 m8001a(int i, String str) {
        str.getClass();
        C1286b c1286b = (C1286b) this.f18831a;
        return AbstractC3224d.m15536o(new m83(new C3228h(c1286b.m7106h(str), c1286b.m7105g(str), new GetBlacklistsUseCase$invoke$1(3, null)), new GetBlacklistsUseCase$invoke$2(this, i, str, null)));
    }

    /* JADX INFO: renamed from: b */
    public c83 m8002b(final String str) {
        str.getClass();
        final int i = 0;
        final int i2 = 1;
        return AbstractC3224d.m15536o(new C3228h(AbstractC1543a.m8226a(new ui3(this) { // from class: nm3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1387b f52956b;

            {
                this.f52956b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i;
                String str2 = str;
                C1387b c1387b = this.f52956b;
                switch (i3) {
                    case 0:
                        return ((C1294j) ((oo4) c1387b.f18831a)).m7238l(str2);
                    default:
                        return ((C1294j) ((oo4) c1387b.f18831a)).m7234h(str2, LanguageProgressInterval.Today);
                }
            }
        }, new GetLibraryStatsUseCase$invoke$2(this, str, null)), AbstractC1543a.m8226a(new ui3(this) { // from class: nm3

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1387b f52956b;

            {
                this.f52956b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i2;
                String str2 = str;
                C1387b c1387b = this.f52956b;
                switch (i3) {
                    case 0:
                        return ((C1294j) ((oo4) c1387b.f18831a)).m7238l(str2);
                    default:
                        return ((C1294j) ((oo4) c1387b.f18831a)).m7234h(str2, LanguageProgressInterval.Today);
                }
            }
        }, new GetLibraryStatsUseCase$invoke$4(this, str, null)), new GetLibraryStatsUseCase$invoke$5(3, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r0).m7971k(r6, r1) == r8) goto L21;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8003c(String str, ContinuationImpl continuationImpl) throws Throwable {
        UpdateStreakInfoUseCase$invoke$1 updateStreakInfoUseCase$invoke$1;
        vma vmaVar = (vma) this.f18831a;
        if (continuationImpl instanceof UpdateStreakInfoUseCase$invoke$1) {
            updateStreakInfoUseCase$invoke$1 = (UpdateStreakInfoUseCase$invoke$1) continuationImpl;
            int i = updateStreakInfoUseCase$invoke$1.f18829d;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateStreakInfoUseCase$invoke$1.f18829d = i - Integer.MIN_VALUE;
            } else {
                updateStreakInfoUseCase$invoke$1 = new UpdateStreakInfoUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateStreakInfoUseCase$invoke$1 = new UpdateStreakInfoUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = updateStreakInfoUseCase$invoke$1.f18827b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updateStreakInfoUseCase$invoke$1.f18829d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1371d) vmaVar).f18588y;
            updateStreakInfoUseCase$invoke$1.f18826a = str;
            updateStreakInfoUseCase$invoke$1.f18829d = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, updateStreakInfoUseCase$invoke$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = updateStreakInfoUseCase$invoke$1.f18826a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        return xfa.f68157a;
        Map mapM15368U = AbstractC3194a.m15368U((Map) objM15541t, new Pair(str, kad.m15049b()));
        updateStreakInfoUseCase$invoke$1.f18826a = null;
        updateStreakInfoUseCase$invoke$1.f18829d = 2;
    }

    public C1387b(C1286b c1286b) {
        c1286b.getClass();
        this.f18831a = c1286b;
    }

    public C1387b(oo4 oo4Var) {
        oo4Var.getClass();
        this.f18831a = oo4Var;
    }
}
