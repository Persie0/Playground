package com.lingq.core.premium.upgrade;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import com.lingq.core.data.repository.C1307w;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C2960ed;
import p000.C3143jd;
import p000.C3156jq;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.eda;
import p000.lda;
import p000.un1;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.upgrade.AiVoiceSampleViewModel$loadAndPlay$1", m4291f = "AiVoiceSampleViewModel.kt", m4292l = {eda.f37086g}, m4293m = "invokeSuspend", m4294v = 2)
final class AiVoiceSampleViewModel$loadAndPlay$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22549a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3143jd f22550b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f22551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiVoiceSampleViewModel$loadAndPlay$1(C3143jd c3143jd, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f22550b = c3143jd;
        this.f22551c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiVoiceSampleViewModel$loadAndPlay$1(this.f22550b, this.f22551c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AiVoiceSampleViewModel$loadAndPlay$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        final C3143jd c3143jd = this.f22550b;
        C3244l c3244l = c3143jd.f45431c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22549a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3156jq c3156jq = c3143jd.f45430b;
            this.f22549a = 1;
            obj = ((C1307w) c3156jq.f45990a).m7389d(((cma) c3156jq.f45991b).mo4589b2(), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C2960ed c2960ed = (C2960ed) obj;
        if (c2960ed != null) {
            str = c2960ed.f37028b;
            String str2 = c2960ed.f37027a;
            String str3 = this.f22551c ? str2 : str;
            if (vk9.m23391n0(str3)) {
                str3 = null;
            }
            if (str3 == null) {
                if (vk9.m23391n0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    str = str2;
                } else if (vk9.m23391n0(str)) {
                    str = null;
                }
            } else {
                str = str3;
            }
        } else {
            str = null;
        }
        if (str == null) {
            c3244l.m15571i(AiVoiceSampleState.Idle);
        } else {
            c3143jd.m14399V2();
            MediaPlayer mediaPlayer = new MediaPlayer();
            try {
                try {
                    mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build());
                    mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.lingq.core.premium.upgrade.a
                        @Override // android.media.MediaPlayer.OnPreparedListener
                        public final void onPrepared(MediaPlayer mediaPlayer2) {
                            mediaPlayer2.start();
                            C3143jd c3143jd2 = c3143jd;
                            c3143jd2.f45431c.m15571i(AiVoiceSampleState.Playing);
                            wfb.m23926u(lda.m16103C(c3143jd2), null, null, new AiVoiceSampleViewModel$watchForEnd$1(c3143jd2, mediaPlayer2, null), 3);
                        }
                    });
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: fd
                        @Override // android.media.MediaPlayer.OnCompletionListener
                        public final void onCompletion(MediaPlayer mediaPlayer2) {
                            c3143jd.m14400W2();
                        }
                    });
                    mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: gd
                        @Override // android.media.MediaPlayer.OnErrorListener
                        public final boolean onError(MediaPlayer mediaPlayer2, int i2, int i3) {
                            c3143jd.m14400W2();
                            return true;
                        }
                    });
                    mediaPlayer.setDataSource(str);
                    c3143jd.f45433e = mediaPlayer;
                    mediaPlayer.prepareAsync();
                } catch (Throwable th) {
                    new Result.Failure(th);
                    c3143jd.f45433e = null;
                    c3244l.m15571i(AiVoiceSampleState.Idle);
                }
            } catch (Exception unused) {
                mediaPlayer.release();
                c3143jd.f45433e = null;
                c3244l.m15571i(AiVoiceSampleState.Idle);
                return xfa.f68157a;
            }
        }
        return xfa.f68157a;
    }
}
