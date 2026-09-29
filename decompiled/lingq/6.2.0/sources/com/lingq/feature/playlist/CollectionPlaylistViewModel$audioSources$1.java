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
@c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$audioSources$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {113}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionPlaylistViewModel$audioSources$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f27542a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f27543b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f27544c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2251a f27545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPlaylistViewModel$audioSources$1(C2251a c2251a, Continuation continuation) {
        super(3, continuation);
        this.f27545d = c2251a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CollectionPlaylistViewModel$audioSources$1 collectionPlaylistViewModel$audioSources$1 = new CollectionPlaylistViewModel$audioSources$1(this.f27545d, (Continuation) obj3);
        collectionPlaylistViewModel$audioSources$1.f27543b = (e83) obj;
        collectionPlaylistViewModel$audioSources$1.f27544c = (List) obj2;
        return collectionPlaylistViewModel$audioSources$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2251a c2251a;
        e83 e83Var = this.f27543b;
        List list = this.f27544c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27542a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM19624a = q2c.m19624a(list);
            ArrayList<l55> arrayList = new ArrayList();
            Iterator it = arrayListM19624a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c2251a = this.f27545d;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                l55 l55Var = (l55) next;
                if (!c2251a.m9207Z2(l55Var.f49081a.f63767a) && !l55Var.f49081a.f63782p) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            for (l55 l55Var2 : arrayList) {
                ud7 ud7Var = l55Var2.f49081a;
                String str = ud7Var.f63779m;
                String str2 = str != null ? str : "";
                int i2 = ud7Var.f63767a;
                String str3 = ud7Var.f63774h;
                String str4 = ud7Var.f63785s;
                String str5 = str4 == null ? "" : str4;
                String str6 = ud7Var.f63775i;
                String str7 = str6 == null ? "" : str6;
                int i3 = ud7Var.f63778l;
                String str8 = ud7Var.f63772f;
                String str9 = str8 == null ? "" : str8;
                vd7 vd7Var = l55Var2.f49082b;
                boolean z = vd7Var != null ? vd7Var.f65237b : false;
                int i4 = ud7Var.f63776j;
                String strMo4589b2 = c2251a.f27773b.mo4589b2();
                PlayingSource playingSource = PlayingSource.Playlist;
                ud7 ud7Var2 = l55Var2.f49081a;
                arrayList2.add(new tb7(i2, str2, str3, str5, str7, i3, str9, z, i4, strMo4589b2, playingSource, (ud7Var2.f63780n == null || ud7Var2.f63779m != null) ? PlayerType.Audio : PlayerType.Video, ud7Var2.f63789w, ud7Var2.f63790x));
            }
            this.f27543b = null;
            this.f27544c = null;
            this.f27542a = 1;
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
