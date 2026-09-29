package com.lingq.core.playlists;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3676v8;
import p000.c32;
import p000.cma;
import p000.hm5;
import p000.kd7;
import p000.md7;
import p000.un1;
import p000.vf7;
import p000.vk9;
import p000.web;
import p000.xd7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.playlists.PlaylistsSheetViewModel$createPlaylist$1", m4291f = "PlaylistsSheetViewModel.kt", m4292l = {167, 169}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistsSheetViewModel$createPlaylist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public String f22251a;

    /* JADX INFO: renamed from: b */
    public int f22252b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f22253c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1833i f22254d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1828d f22255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsSheetViewModel$createPlaylist$1(String str, C1833i c1833i, C1828d c1828d, Continuation continuation) {
        super(2, continuation);
        this.f22253c = str;
        this.f22254d = c1833i;
        this.f22255e = c1828d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistsSheetViewModel$createPlaylist$1(this.f22253c, this.f22254d, this.f22255e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistsSheetViewModel$createPlaylist$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        Object objM23163a;
        String str;
        C1833i c1833i = this.f22254d;
        C3244l c3244l = c1833i.f22317o;
        vf7 vf7Var = c1833i.f22304b;
        cma cmaVar = c1833i.f22314l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22252b;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            string = vk9.m23376L0(this.f22253c).toString();
            C3676v8 c3676v8 = c1833i.f22311i;
            String strMo4589b2 = cmaVar.mo4589b2();
            this.f22251a = string;
            this.f22252b = 1;
            objM23163a = c3676v8.m23163a(strMo4589b2, string, this);
            if (objM23163a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            string = this.f22251a;
            AbstractC3193b.m15359b(obj);
            objM23163a = obj;
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.f22251a;
            AbstractC3193b.m15359b(obj);
        }
        hm5 hm5Var = c1833i.f22312j;
        Bundle bundle = new Bundle();
        bundle.putString("Language", cmaVar.mo4589b2());
        bundle.putString("playlist name", str);
        ((C1240a) hm5Var).m7025f("Playlist created", bundle);
        c3244l.getClass();
        c3244l.m15572j(null, md7.f51107a);
        this.f22255e.mo0a();
        return xfaVar;
        if (((Playlist) objM23163a) == null) {
            web webVar = c1833i.f22309g;
            String strMo4589b3 = cmaVar.mo4589b2();
            Integer num = new Integer(vf7Var.f65316a);
            if (num.intValue() == -1) {
                num = null;
            }
            String str2 = vf7Var.f65317b;
            if (vk9.m23391n0(str2)) {
                str2 = null;
            }
            this.f22251a = string;
            this.f22252b = 2;
            String str3 = string;
            Object objM7343c = ((C1302r) ((xd7) webVar.f66742a)).m7343c(strMo4589b3, str3, num, str2, this);
            if (objM7343c != coroutineSingletons) {
                objM7343c = xfaVar;
            }
            if (objM7343c != coroutineSingletons) {
                str = str3;
                hm5 hm5Var2 = c1833i.f22312j;
                Bundle bundle2 = new Bundle();
                bundle2.putString("Language", cmaVar.mo4589b2());
                bundle2.putString("playlist name", str);
                ((C1240a) hm5Var2).m7025f("Playlist created", bundle2);
                c3244l.getClass();
                c3244l.m15572j(null, md7.f51107a);
                this.f22255e.mo0a();
            }
            return coroutineSingletons;
        }
        kd7 kd7Var = new kd7("playlist_exists");
        c3244l.getClass();
        c3244l.m15572j(null, kd7Var);
        return xfaVar;
    }
}
