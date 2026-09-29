package com.lingq.core.player;

import com.lingq.core.domain.lesson.AbstractC1379a;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.core.player.data.PlayerState;
import com.lingq.core.player.data.PlayerType;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.cc4;
import p000.e65;
import p000.fa4;
import p000.g2c;
import p000.h0a;
import p000.hc7;
import p000.hn1;
import p000.jw2;
import p000.m97;
import p000.rm5;
import p000.sm5;
import p000.tb7;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$observeBookmarkAndSeek$1", m4291f = "PlayerController.kt", m4292l = {380}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerControllerImpl$observeBookmarkAndSeek$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f21910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1808b f21911b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tb7 f21912c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f21913d;

    /* JADX INFO: renamed from: com.lingq.core.player.PlayerControllerImpl$observeBookmarkAndSeek$1$1 */
    @c32(m4290c = "com.lingq.core.player.PlayerControllerImpl$observeBookmarkAndSeek$1$1", m4291f = "PlayerController.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18031 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ LessonBookmark f21914a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ boolean f21915b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1808b f21916c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ tb7 f21917d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f21918e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18031(C1808b c1808b, tb7 tb7Var, boolean z, Continuation continuation) {
            super(3, continuation);
            this.f21916c = c1808b;
            this.f21917d = tb7Var;
            this.f21918e = z;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            tb7 tb7Var = this.f21917d;
            boolean z = this.f21918e;
            C18031 c18031 = new C18031(this.f21916c, tb7Var, z, (Continuation) obj3);
            c18031.f21914a = (LessonBookmark) obj;
            c18031.f21915b = zBooleanValue;
            xfa xfaVar = xfa.f68157a;
            c18031.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Object value2;
            m97 m97VarM12305a;
            Integer num;
            Double d;
            tb7 tb7Var = this.f21917d;
            PlayerType playerType = tb7Var.f62112l;
            int i = tb7Var.f62101a;
            C1808b c1808b = this.f21916c;
            C3244l c3244l = c1808b.f21945C;
            LessonBookmark lessonBookmark = this.f21914a;
            boolean z = this.f21915b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int iDoubleValue = (int) (((lessonBookmark == null || (d = lessonBookmark.f19174g) == null) ? 0.0d : d.doubleValue()) * 1000.0d);
            boolean z2 = z && (num = (Integer) e65.m10872d(i, (Map) c1808b.f21947E.getValue())) != null && num.intValue() == 0;
            int iM16701e = z2 ? 0 : iDoubleValue;
            if (z && playerType == PlayerType.Video && (m97VarM12305a = g2c.m12305a(tb7Var)) != null) {
                iM16701e = (int) m97VarM12305a.m16701e(iM16701e);
            }
            rm5 rm5Var = sm5.Companion;
            String str = lessonBookmark != null ? lessonBookmark.f19171d : null;
            StringBuilder sbM22994q = ux5.m22994q(i, iM16701e, "[LessonTracking] PLAYER_LISTEN observeBookmarkAndSeek lessonId=", " positionMs=", " bookmarkMs=");
            hn1.m13368r(sbM22994q, iDoubleValue, " justReset=", z2, " client=");
            sbM22994q.append(str);
            sbM22994q.append(" isInitial=");
            sbM22994q.append(z);
            String string = sbM22994q.toString();
            rm5Var.getClass();
            h0a.f41641a.mo11431b(string, new Object[0]);
            if (playerType == PlayerType.Video) {
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, hc7.m13196a((hc7) value2, null, null, null, 0L, iM16701e, 0L, false, false, null, null, true, null, null, 7151)));
            } else {
                jw2 jw2Var = c1808b.f21960m;
                if (jw2Var == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                jw2Var.m14727y(iM16701e);
            }
            c1808b.f21965r = 0L;
            c1808b.f21966s = 0L;
            c1808b.f21968u = new Integer(i);
            c1808b.f21967t = Integer.valueOf(iM16701e);
            if (z) {
                PlayerType playerType2 = PlayerType.Video;
                boolean z3 = this.f21918e;
                if (playerType == playerType2) {
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, z3 ? PlayerState.Playing : PlayerState.Paused, null, 0L, 0, 0L, false, false, null, null, false, null, null, 8189)));
                    c1808b.m8459X(iM16701e);
                } else {
                    jw2 jw2Var2 = c1808b.f21960m;
                    if (z3) {
                        if (jw2Var2 == null) {
                            fa4.m11636J("player");
                            throw null;
                        }
                        jw2Var2.m14696B(true);
                    } else {
                        if (jw2Var2 == null) {
                            fa4.m11636J("player");
                            throw null;
                        }
                        jw2Var2.m14696B(false);
                    }
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerControllerImpl$observeBookmarkAndSeek$1(C1808b c1808b, tb7 tb7Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f21911b = c1808b;
        this.f21912c = tb7Var;
        this.f21913d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerControllerImpl$observeBookmarkAndSeek$1(this.f21911b, this.f21912c, this.f21913d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerControllerImpl$observeBookmarkAndSeek$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f21910a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1808b c1808b = this.f21911b;
            cc4 cc4Var = c1808b.f21958k;
            tb7 tb7Var = this.f21912c;
            c83 c83VarM4513n = cc4Var.m4513n(tb7Var.f62101a);
            C18031 c18031 = new C18031(c1808b, tb7Var, this.f21913d, null);
            this.f21910a = 1;
            if (AbstractC1379a.m7986a(c83VarM4513n, c18031, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
