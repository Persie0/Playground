package com.lingq.core.domain.web2wave;

import com.lingq.core.data.repository.C1309y;
import com.lingq.core.datastore.C1372e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.pk9;
import p000.s2b;
import p000.vk9;
import p000.xfa;
import p000.y2b;
import p000.ym5;

/* JADX INFO: renamed from: com.lingq.core.domain.web2wave.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1545b {

    /* JADX INFO: renamed from: a */
    public final s2b f20175a;

    /* JADX INFO: renamed from: b */
    public final C1309y f20176b;

    public C1545b(s2b s2bVar, C1309y c1309y) {
        s2bVar.getClass();
        c1309y.getClass();
        this.f20175a = s2bVar;
        this.f20176b = c1309y;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m8229a(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        HandleWeb2WaveDeeplinkUseCase$invoke$1 handleWeb2WaveDeeplinkUseCase$invoke$1;
        y2b y2bVar;
        boolean zM24909a;
        if (continuationImpl instanceof HandleWeb2WaveDeeplinkUseCase$invoke$1) {
            handleWeb2WaveDeeplinkUseCase$invoke$1 = (HandleWeb2WaveDeeplinkUseCase$invoke$1) continuationImpl;
            int i = handleWeb2WaveDeeplinkUseCase$invoke$1.f20170d;
            if ((i & Integer.MIN_VALUE) != 0) {
                handleWeb2WaveDeeplinkUseCase$invoke$1.f20170d = i - Integer.MIN_VALUE;
            } else {
                handleWeb2WaveDeeplinkUseCase$invoke$1 = new HandleWeb2WaveDeeplinkUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            handleWeb2WaveDeeplinkUseCase$invoke$1 = new HandleWeb2WaveDeeplinkUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7420a = handleWeb2WaveDeeplinkUseCase$invoke$1.f20168b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = handleWeb2WaveDeeplinkUseCase$invoke$1.f20170d;
        s2b s2bVar = this.f20175a;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7420a);
            handleWeb2WaveDeeplinkUseCase$invoke$1.f20167a = str;
            handleWeb2WaveDeeplinkUseCase$invoke$1.f20170d = 1;
            if (((C1372e) s2bVar).m7978d(str, str2, handleWeb2WaveDeeplinkUseCase$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = handleWeb2WaveDeeplinkUseCase$invoke$1.f20167a;
            AbstractC3193b.m15359b(objM7420a);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM7420a);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7420a);
        }
        y2bVar = (y2b) pk9.m19381x((ym5) objM7420a);
        if (y2bVar != null) {
            zM24909a = y2bVar.m24909a();
            handleWeb2WaveDeeplinkUseCase$invoke$1.f20167a = null;
            handleWeb2WaveDeeplinkUseCase$invoke$1.f20170d = 3;
            if (((C1372e) s2bVar).m7977c(zM24909a, handleWeb2WaveDeeplinkUseCase$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        if (!vk9.m23391n0(str)) {
            handleWeb2WaveDeeplinkUseCase$invoke$1.f20167a = null;
            handleWeb2WaveDeeplinkUseCase$invoke$1.f20170d = 2;
            objM7420a = this.f20176b.m7420a(str, handleWeb2WaveDeeplinkUseCase$invoke$1);
            if (objM7420a != coroutineSingletons) {
                y2bVar = (y2b) pk9.m19381x((ym5) objM7420a);
                if (y2bVar != null) {
                    zM24909a = y2bVar.m24909a();
                    handleWeb2WaveDeeplinkUseCase$invoke$1.f20167a = null;
                    handleWeb2WaveDeeplinkUseCase$invoke$1.f20170d = 3;
                    if (((C1372e) s2bVar).m7977c(zM24909a, handleWeb2WaveDeeplinkUseCase$invoke$1) == coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
