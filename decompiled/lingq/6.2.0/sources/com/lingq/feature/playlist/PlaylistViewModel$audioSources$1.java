package com.lingq.feature.playlist;

import com.lingq.core.player.data.PlayerType;
import com.lingq.core.player.data.PlayingSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.l55;
import p000.q2c;
import p000.tb7;
import p000.ud7;
import p000.v91;
import p000.vd7;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$audioSources$1", m4291f = "PlaylistViewModel.kt", m4292l = {160}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$audioSources$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f27647a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f27648b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f27649c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2255e f27650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$audioSources$1(C2255e c2255e, Continuation continuation) {
        super(3, continuation);
        this.f27650d = c2255e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlaylistViewModel$audioSources$1 playlistViewModel$audioSources$1 = new PlaylistViewModel$audioSources$1(this.f27650d, (Continuation) obj3);
        playlistViewModel$audioSources$1.f27648b = (e83) obj;
        playlistViewModel$audioSources$1.f27649c = (List) obj2;
        return playlistViewModel$audioSources$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2255e c2255e;
        boolean z;
        e83 e83Var = this.f27648b;
        List list = this.f27649c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27647a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM19624a = q2c.m19624a(list);
            ArrayList<l55> arrayList = new ArrayList();
            Iterator it = arrayListM19624a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c2255e = this.f27650d;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                l55 l55Var = (l55) next;
                if (!c2255e.m9242d3(l55Var.f49081a.f63767a) && !l55Var.f49081a.f63782p) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            for (l55 l55Var2 : arrayList) {
                ud7 ud7Var = l55Var2.f49081a;
                String str = ud7Var.f63779m;
                String str2 = str != null ? str : "";
                if (ud7Var.f63780n == null || str != null) {
                    vd7 vd7Var = l55Var2.f49082b;
                    if (vd7Var != null && vd7Var.f65237b) {
                        z = c2255e.f27827d.mo8231E0(ud7Var.f63767a);
                    }
                }
                int i2 = ud7Var.f63767a;
                String str3 = ud7Var.f63774h;
                String str4 = ud7Var.f63785s;
                String str5 = str4 == null ? "" : str4;
                String str6 = ud7Var.f63775i;
                String str7 = str6 == null ? "" : str6;
                int i3 = ud7Var.f63778l;
                String str8 = ud7Var.f63772f;
                arrayList2.add(new tb7(i2, str2, str3, str5, str7, i3, str8 == null ? "" : str8, z, ud7Var.f63776j, c2255e.f27825b.mo4589b2(), PlayingSource.Playlist, (ud7Var.f63780n == null || ud7Var.f63779m != null) ? PlayerType.Audio : PlayerType.Video, ud7Var.f63789w, ud7Var.f63790x));
            }
            this.f27648b = null;
            this.f27649c = null;
            this.f27647a = 1;
            if (e83Var.emit(arrayList2, this) == coroutineSingletons) {
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
