package com.lingq.feature.playlist;

import com.lingq.core.player.data.PlayerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cf7;
import p000.cj3;
import p000.hc7;
import p000.tb7;
import p000.vk9;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$showPlayer$1", m4291f = "PlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$showPlayer$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f27764a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f27765b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ hc7 f27766c;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Boolean) obj4).getClass();
        PlaylistViewModel$showPlayer$1 playlistViewModel$showPlayer$1 = new PlaylistViewModel$showPlayer$1(5, (Continuation) obj5);
        playlistViewModel$showPlayer$1.f27764a = (List) obj;
        playlistViewModel$showPlayer$1.f27765b = zBooleanValue;
        playlistViewModel$showPlayer$1.f27766c = (hc7) obj3;
        return playlistViewModel$showPlayer$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f27764a;
        boolean z = this.f27765b;
        hc7 hc7Var = this.f27766c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        tb7 tb7Var = hc7Var.f42185m;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            boolean z4 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            tb7 tb7Var2 = (tb7) next;
            PlayerType playerType = tb7Var2.f62112l;
            boolean z5 = tb7Var2.f62108h;
            if (playerType == PlayerType.Audio) {
                if (tb7Var != null && tb7Var.f62101a == tb7Var2.f62101a) {
                    z3 = z5;
                }
                if (vk9.m23391n0(tb7Var2.f62102b) || !z5) {
                    z4 = false;
                }
            }
            if (z4) {
                arrayList.add(next);
            }
        }
        PlayerType playerType2 = tb7Var != null ? tb7Var.f62112l : null;
        boolean z6 = ((playerType2 == null ? -1 : cf7.f10004a[playerType2.ordinal()]) == 1 && vk9.m23391n0(tb7Var.f62102b) && !z3) ? false : true;
        if (!arrayList.isEmpty() && !z && z6) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
