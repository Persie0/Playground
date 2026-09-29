package com.lingq.feature.playlist;

import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.data.PlayerType;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.InterfaceC3812yx;
import p000.c18;
import p000.c32;
import p000.l55;
import p000.q2c;
import p000.tb7;
import p000.ud7;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$setSelectedLesson$1", m4291f = "PlaylistViewModel.kt", m4292l = {675}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$setSelectedLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27745b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27746c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f27747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$setSelectedLesson$1(C2255e c2255e, int i, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f27745b = c2255e;
        this.f27746c = i;
        this.f27747d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$setSelectedLesson$1(this.f27745b, this.f27746c, this.f27747d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$setSelectedLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0126 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num;
        Object next;
        Object objMo8234r;
        Object next2;
        C2255e c2255e = this.f27745b;
        c18 c18Var = c2255e.f27808C;
        C1808b c1808b = c2255e.f27845v;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27744a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        if (!((Boolean) c2255e.f27812G.getValue()).booleanValue()) {
            List list = (List) ((C3244l) c18Var.f9311a).getValue();
            if (!list.isEmpty() && c1808b.f21961n.m12625d() == null) {
                c1808b.m8461a0(list);
            }
            int i2 = this.f27746c;
            ud7 ud7VarM9234V2 = C2255e.m9234V2(c2255e, i2);
            if (ud7VarM9234V2 == null || !ud7VarM9234V2.f63782p) {
                num = new Integer(i2);
            } else {
                Iterator it = q2c.m19624a((List) c2255e.f27807B.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    ud7 ud7Var = ((l55) next2).f49081a;
                    if (ud7Var.f63783q && ud7Var.f63776j == i2) {
                        break;
                    }
                }
                l55 l55Var = (l55) next2;
                num = l55Var != null ? new Integer(l55Var.f49081a.f63767a) : null;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                Iterator it2 = ((Iterable) ((C3244l) c18Var.f9311a).getValue()).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((tb7) next).f62101a != iIntValue);
                tb7 tb7Var = (tb7) next;
                if (tb7Var != null) {
                    if (c2255e.m9242d3(iIntValue)) {
                        c2255e.m9245g3(iIntValue);
                        return xfaVar;
                    }
                    this.f27744a = 1;
                    InterfaceC3812yx interfaceC3812yx = c2255e.f27827d;
                    C3244l c3244l = c2255e.f27821P;
                    PlayerType playerType = tb7Var.f62112l;
                    String str = tb7Var.f62102b;
                    int i3 = tb7Var.f62101a;
                    PlayerType playerType2 = PlayerType.Video;
                    boolean z = this.f27747d;
                    if (playerType == playerType2) {
                        c3244l.m15571i(null);
                        c1808b.m8446I(i3, z);
                    } else if (tb7Var.f62108h && interfaceC3812yx.mo8231E0(i3)) {
                        c3244l.m15571i(null);
                        c1808b.m8446I(i3, z);
                    } else {
                        c1808b.m8446I(i3, false);
                        if (!z || vk9.m23391n0(str)) {
                            c3244l.m15571i(null);
                        } else {
                            Integer num2 = new Integer(i3);
                            c3244l.getClass();
                            c3244l.m15572j(null, num2);
                            objMo8234r = interfaceC3812yx.mo8234r(new DownloadItem(tb7Var.f62110j, i3, str), this);
                            if (objMo8234r != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                            if (objMo8234r == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    objMo8234r = xfaVar;
                    if (objMo8234r == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        }
        return xfaVar;
    }
}
