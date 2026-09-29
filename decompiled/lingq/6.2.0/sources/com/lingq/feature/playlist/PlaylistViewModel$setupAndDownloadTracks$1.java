package com.lingq.feature.playlist;

import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.l55;
import p000.lda;
import p000.q2c;
import p000.tb7;
import p000.ud7;
import p000.vd7;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$setupAndDownloadTracks$1", m4291f = "PlaylistViewModel.kt", m4292l = {403, 418}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$setupAndDownloadTracks$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public C2255e f27748a;

    /* JADX INFO: renamed from: b */
    public Iterator f27749b;

    /* JADX INFO: renamed from: c */
    public int f27750c;

    /* JADX INFO: renamed from: d */
    public int f27751d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f27752e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2255e f27753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$setupAndDownloadTracks$1(List list, C2255e c2255e, Continuation continuation) {
        super(1, continuation);
        this.f27752e = list;
        this.f27753f = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistViewModel$setupAndDownloadTracks$1(this.f27752e, this.f27753f, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistViewModel$setupAndDownloadTracks$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        C2255e c2255e;
        int i;
        Object next;
        Triple triple;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f27751d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            it = this.f27752e.iterator();
            c2255e = this.f27753f;
            i = 0;
        } else {
            if (i2 != 1 && i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f27750c;
            it = this.f27749b;
            c2255e = this.f27748a;
            AbstractC3193b.m15359b(obj);
        }
        while (it.hasNext()) {
            tb7 tb7Var = (tb7) it.next();
            if (!((Boolean) c2255e.f27806A.getValue()).booleanValue()) {
                Iterator it2 = q2c.m19624a((List) c2255e.f27807B.getValue()).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((l55) next).f49081a.f63767a != tb7Var.f62101a);
                l55 l55Var = (l55) next;
                if (l55Var != null) {
                    ud7 ud7Var = l55Var.f49081a;
                    triple = new Triple(l55Var.f49082b, Boolean.valueOf(ud7Var.f63780n != null && ud7Var.f63779m == null), Boolean.valueOf(c2255e.f27827d.mo8231E0(ud7Var.f63767a)));
                } else {
                    triple = null;
                }
                vd7 vd7Var = triple != null ? (vd7) triple.f47633a : null;
                boolean z2 = triple != null && ((Boolean) triple.f47634b).booleanValue();
                boolean z3 = triple != null && ((Boolean) triple.f47635c).booleanValue();
                if (fa4.m11650l(vd7Var != null ? vd7Var.f65239d : null, "downloading")) {
                    z = true;
                } else {
                    if (fa4.m11650l(vd7Var != null ? vd7Var.f65239d : null, "generating")) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z2 || ((vd7Var != null && vd7Var.f65237b && z3) || z)) {
                    this.f27748a = c2255e;
                    this.f27749b = it;
                    this.f27750c = i;
                    this.f27751d = 1;
                    if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    wfb.m23926u(lda.m16103C(c2255e), null, null, new PlaylistViewModel$setupAndDownloadTracks$1$1$1(tb7Var, c2255e, null), 3);
                    this.f27748a = c2255e;
                    this.f27749b = it;
                    this.f27750c = i;
                    this.f27751d = 2;
                    if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        }
        return xfa.f68157a;
    }
}
