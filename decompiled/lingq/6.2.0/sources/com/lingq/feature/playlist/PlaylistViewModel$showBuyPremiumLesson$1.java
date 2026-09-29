package com.lingq.feature.playlist;

import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.Profile;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.l55;
import p000.q2c;
import p000.qm7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$showBuyPremiumLesson$1", m4291f = "PlaylistViewModel.kt", m4292l = {878}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$showBuyPremiumLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27761a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27762b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27763c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$showBuyPremiumLesson$1(C2255e c2255e, int i, Continuation continuation) {
        super(2, continuation);
        this.f27762b = c2255e;
        this.f27763c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$showBuyPremiumLesson$1(this.f27762b, this.f27763c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$showBuyPremiumLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f27761a;
        Object obj2 = null;
        C2255e c2255e = this.f27762b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            qm7 qm7Var = ((C1369b) c2255e.f27844u).f18480m;
            this.f27761a = 1;
            obj = AbstractC3224d.m15541t(qm7Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        int i3 = ((Profile) obj).f19671t;
        Iterator it = q2c.m19624a((List) c2255e.f27807B.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i = this.f27763c;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (((l55) next).f49081a.f63767a == i) {
                obj2 = next;
                break;
            }
        }
        l55 l55Var = (l55) obj2;
        int i4 = l55Var != null ? l55Var.f49081a.f63784r : 0;
        if (i3 < i4) {
            C3244l c3244l = c2255e.f27818M;
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, new Pair(new Integer(i4), new Integer(i3))));
        } else {
            C3244l c3244l2 = c2255e.f27817L;
            do {
                value = c3244l2.getValue();
            } while (!c3244l2.m15570h(value, new Triple(new Integer(i4), new Integer(i3), new Integer(i))));
        }
        return xfa.f68157a;
    }
}
