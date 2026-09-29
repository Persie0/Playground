package com.lingq.core.premium.upgrade;

import android.media.MediaPlayer;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3143jd;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.upgrade.AiVoiceSampleViewModel$watchForEnd$1", m4291f = "AiVoiceSampleViewModel.kt", m4292l = {95, 99, 104}, m4293m = "invokeSuspend", m4294v = 2)
final class AiVoiceSampleViewModel$watchForEnd$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22552a;

    /* JADX INFO: renamed from: b */
    public int f22553b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22554c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3143jd f22555d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ MediaPlayer f22556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiVoiceSampleViewModel$watchForEnd$1(C3143jd c3143jd, MediaPlayer mediaPlayer, Continuation continuation) {
        super(2, continuation);
        this.f22555d = c3143jd;
        this.f22556e = mediaPlayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AiVoiceSampleViewModel$watchForEnd$1 aiVoiceSampleViewModel$watchForEnd$1 = new AiVoiceSampleViewModel$watchForEnd$1(this.f22555d, this.f22556e, continuation);
        aiVoiceSampleViewModel$watchForEnd$1.f22554c = obj;
        return aiVoiceSampleViewModel$watchForEnd$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AiVoiceSampleViewModel$watchForEnd$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0 A[EDGE_INSN: B:63:0x00d0->B:51:0x00d0 BREAK  A[LOOP:0: B:37:0x009e->B:66:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[LOOP:0: B:37:0x009e->B:66:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15437d(r12 + 400, r16) == r3) goto L50;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object failure;
        int iIntValue;
        Object failure2;
        Object failure3;
        Object obj2;
        un1 un1Var = (un1) this.f22554c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22553b;
        C3143jd c3143jd = this.f22555d;
        MediaPlayer mediaPlayer = this.f22556e;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f22554c = un1Var;
                this.f22553b = 1;
                if (AbstractC3208a.m15437d(400L, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else if (i == 2) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i2 = this.f22552a;
                AbstractC3193b.m15359b(obj);
                iIntValue = i2;
                while (c3143jd.f45433e == mediaPlayer) {
                    try {
                        failure3 = Boolean.valueOf(mediaPlayer.isPlaying());
                    } catch (Throwable th) {
                        failure3 = new Result.Failure(th);
                    }
                    obj2 = Boolean.FALSE;
                    if (failure3 instanceof Result.Failure) {
                        failure3 = obj2;
                    }
                    if (((Boolean) failure3).booleanValue()) {
                        break;
                    }
                    this.f22554c = un1Var;
                    this.f22552a = iIntValue;
                    this.f22553b = 3;
                    if (AbstractC3208a.m15437d(300L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            if (c3143jd.f45433e == mediaPlayer) {
                c3143jd.m14400W2();
            }
            return xfa.f68157a;
            failure = new Integer(mediaPlayer.getDuration());
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        Object num = new Integer(0);
        if (failure instanceof Result.Failure) {
            failure = num;
        }
        iIntValue = ((Number) failure).intValue();
        if (iIntValue > 0) {
            try {
                failure2 = new Integer(mediaPlayer.getCurrentPosition());
            } catch (Throwable th3) {
                failure2 = new Result.Failure(th3);
            }
            Object num2 = new Integer(0);
            if (failure2 instanceof Result.Failure) {
                failure2 = num2;
            }
            long jIntValue = iIntValue - ((Number) failure2).intValue();
            if (jIntValue < 0) {
                jIntValue = 0;
            }
            this.f22554c = null;
            this.f22552a = iIntValue;
            this.f22553b = 2;
        }
        while (c3143jd.f45433e == mediaPlayer) {
            failure3 = Boolean.valueOf(mediaPlayer.isPlaying());
            obj2 = Boolean.FALSE;
            if (failure3 instanceof Result.Failure) {
                failure3 = obj2;
            }
            if (((Boolean) failure3).booleanValue()) {
                break;
                break;
            }
            this.f22554c = un1Var;
            this.f22552a = iIntValue;
            this.f22553b = 3;
            if (AbstractC3208a.m15437d(300L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (c3143jd.f45433e == mediaPlayer) {
            c3143jd.m14400W2();
        }
        return xfa.f68157a;
    }
}
