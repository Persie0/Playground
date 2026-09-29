package com.lingq.core.playlists;

import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3676v8;
import p000.C3713w8;
import p000.c32;
import p000.fa4;
import p000.ld7;
import p000.md7;
import p000.un1;
import p000.vk9;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.playlists.PlaylistsSheetViewModel$updatePlaylistName$1", m4291f = "PlaylistsSheetViewModel.kt", m4292l = {197, 204}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistsSheetViewModel$updatePlaylistName$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public String f22265a;

    /* JADX INFO: renamed from: b */
    public String f22266b;

    /* JADX INFO: renamed from: c */
    public int f22267c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1833i f22268d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f22269e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f22270f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsSheetViewModel$updatePlaylistName$1(C1833i c1833i, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f22268d = c1833i;
        this.f22269e = str;
        this.f22270f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistsSheetViewModel$updatePlaylistName$1(this.f22268d, this.f22269e, this.f22270f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistsSheetViewModel$updatePlaylistName$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        String str;
        String str2;
        C1833i c1833i = this.f22268d;
        C3244l c3244l = c1833i.f22317o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22267c;
        xfa xfaVar = xfa.f68157a;
        md7 md7Var = md7.f51107a;
        String str3 = this.f22270f;
        if (i != 0) {
            if (i == 1) {
                string = this.f22266b;
                str = this.f22265a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = this.f22266b;
                AbstractC3193b.m15359b(obj);
            }
            c1833i.mo348x0(str3, str2);
            c3244l.getClass();
            c3244l.m15572j(null, md7Var);
            return xfaVar;
        }
        AbstractC3193b.m15359b(obj);
        String strMo4589b2 = c1833i.f22314l.mo4589b2();
        string = vk9.m23376L0(this.f22269e).toString();
        if (fa4.m11650l(string, str3)) {
            c3244l.getClass();
            c3244l.m15572j(null, md7Var);
            return xfaVar;
        }
        C3676v8 c3676v8 = c1833i.f22311i;
        this.f22265a = strMo4589b2;
        this.f22266b = string;
        this.f22267c = 1;
        Object objM23163a = c3676v8.m23163a(strMo4589b2, string, this);
        if (objM23163a != coroutineSingletons) {
            str = strMo4589b2;
            obj = objM23163a;
        }
        return coroutineSingletons;
        if (((Playlist) obj) != null) {
            ld7 ld7Var = new ld7(str3, "playlist_exists");
            c3244l.getClass();
            c3244l.m15572j(null, ld7Var);
            return xfaVar;
        }
        C3713w8 c3713w8 = c1833i.f22310h;
        String strM23629f = vz1.m23629f(str3, str);
        this.f22265a = null;
        this.f22266b = string;
        this.f22267c = 2;
        Object objM7341B = ((C1302r) c3713w8.f66505a).m7341B(str, strM23629f, string, this);
        if (objM7341B != coroutineSingletons) {
            objM7341B = xfaVar;
        }
        if (objM7341B != coroutineSingletons) {
            str2 = string;
            c1833i.mo348x0(str3, str2);
            c3244l.getClass();
            c3244l.m15572j(null, md7Var);
            return xfaVar;
        }
        return coroutineSingletons;
    }
}
