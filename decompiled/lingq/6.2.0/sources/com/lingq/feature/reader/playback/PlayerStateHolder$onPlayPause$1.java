package com.lingq.feature.reader.playback;

import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.feature.reader.playback.domain.C2466a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.InterfaceC3812yx;
import p000.c32;
import p000.ea7;
import p000.fa4;
import p000.gm5;
import p000.jy7;
import p000.nx4;
import p000.ox4;
import p000.px4;
import p000.qx4;
import p000.rx4;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.playback.PlayerStateHolder$onPlayPause$1", m4291f = "PlayerStateHolder.kt", m4292l = {393, 406, 424}, m4293m = "invokeSuspend", m4294v = 2)
final class PlayerStateHolder$onPlayPause$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29732a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2465a f29733b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerStateHolder$onPlayPause$1(C2465a c2465a, Continuation continuation) {
        super(2, continuation);
        this.f29733b = c2465a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlayerStateHolder$onPlayPause$1(this.f29733b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlayerStateHolder$onPlayPause$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00eb A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM9368a;
        Object value;
        Object value2;
        ea7 ea7Var = ea7.f36943k;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29732a;
        xfa xfaVar = xfa.f68157a;
        C2465a c2465a = this.f29733b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (c2465a.f29769c.mo8231E0(c2465a.f29786t)) {
                C3244l c3244l = c2465a.f29789w;
                Boolean bool = Boolean.FALSE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
                c2465a.m9364g();
                c2465a.f29767a.m8442C(ea7Var);
                return xfaVar;
            }
            C2466a c2466a = c2465a.f29770d;
            String str = c2465a.f29787u;
            int i2 = c2465a.f29786t;
            String str2 = (String) c2465a.f29784r.getValue();
            boolean zMo4593p0 = c2465a.f29779m.mo4593p0();
            this.f29732a = 1;
            objM9368a = c2466a.m9368a(i2, str, str2, this, zMo4593p0);
            if (objM9368a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 3) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        objM9368a = obj;
        rx4 rx4Var = (rx4) objM9368a;
        if (rx4Var instanceof ox4) {
            InterfaceC3812yx interfaceC3812yx = c2465a.f29769c;
            C3244l c3244l2 = c2465a.f29789w;
            int i3 = ((ox4) rx4Var).f55125a;
            if (interfaceC3812yx.mo8231E0(i3)) {
                Boolean bool2 = Boolean.FALSE;
                c3244l2.getClass();
                c3244l2.m15572j(null, bool2);
                c2465a.m9364g();
                c2465a.f29767a.m8442C(ea7Var);
                return xfaVar;
            }
            String str3 = (String) c2465a.f29784r.getValue();
            if (str3 == null || vk9.m23391n0(str3)) {
                Boolean bool3 = Boolean.FALSE;
                c3244l2.getClass();
                c3244l2.m15572j(null, bool3);
                return xfaVar;
            }
            Boolean bool4 = Boolean.TRUE;
            c3244l2.getClass();
            c3244l2.m15572j(null, bool4);
            InterfaceC3812yx interfaceC3812yx2 = c2465a.f29769c;
            DownloadItem downloadItem = new DownloadItem(c2465a.f29787u, i3, str3);
            this.f29732a = 2;
            if (interfaceC3812yx2.mo8234r(downloadItem, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        if (rx4Var instanceof nx4) {
            C3244l c3244l3 = c2465a.f29789w;
            Boolean bool5 = Boolean.TRUE;
            c3244l3.getClass();
            c3244l3.m15572j(null, bool5);
            InterfaceC3812yx interfaceC3812yx3 = c2465a.f29769c;
            nx4 nx4Var = (nx4) rx4Var;
            DownloadItem downloadItem2 = new DownloadItem(c2465a.f29787u, nx4Var.f53359a, nx4Var.f53360b);
            this.f29732a = 3;
            if (interfaceC3812yx3.mo8234r(downloadItem2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (fa4.m11650l(rx4Var, px4.f56944a)) {
            C3244l c3244l4 = c2465a.f29789w;
            Boolean bool6 = Boolean.FALSE;
            c3244l4.getClass();
            c3244l4.m15572j(null, bool6);
            C3244l c3244l5 = c2465a.f29782p;
            do {
                value2 = c3244l5.getValue();
            } while (!c3244l5.m15570h(value2, jy7.m14750a((jy7) value2, false, false, 0L, 0L, 0.0f, null, false, false, false, false, true, null, false, false, null, null, 64511)));
        } else {
            if (!fa4.m11650l(rx4Var, qx4.f58335a)) {
                gm5.m12750e();
                return null;
            }
            C3244l c3244l6 = c2465a.f29789w;
            Boolean bool7 = Boolean.FALSE;
            c3244l6.getClass();
            c3244l6.m15572j(null, bool7);
            C3244l c3244l7 = c2465a.f29782p;
            do {
                value = c3244l7.getValue();
            } while (!c3244l7.m15570h(value, jy7.m14750a((jy7) value, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, true, null, null, 57343)));
        }
        return xfaVar;
    }
}
