package com.lingq.feature.playlist;

import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.playlist.Playlist;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.fa4;
import p000.u91;
import p000.vi3;
import p000.vk9;
import p000.xd7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$getPlaylists$1", m4291f = "PlaylistViewModel.kt", m4292l = {454}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$getPlaylists$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f27697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27698b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$getPlaylists$1$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$getPlaylists$1$1", m4291f = "PlaylistViewModel.kt", m4292l = {457, 460, 462, 467}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22461 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f27699a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f27700b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2255e f27701c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22461(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27701c = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22461 c22461 = new C22461(this.f27701c, continuation);
            c22461.f27700b = obj;
            return c22461;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C22461) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0066  */
        /* JADX WARN: Code duplicated, block: B:23:0x0069  */
        /* JADX WARN: Code duplicated, block: B:27:0x0075  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
        
            if (com.lingq.feature.playlist.C2255e.m9235W2(r0, r12, r11) == r4) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
        
            if (com.lingq.feature.playlist.C2255e.m9235W2(r0, (com.lingq.core.domain.model.playlist.Playlist) r2, r11) == r4) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
        
            if (com.lingq.feature.playlist.C2255e.m9235W2(r0, r12, r11) == r4) goto L46;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Object next;
            Playlist playlist;
            String str2;
            C2255e c2255e = this.f27701c;
            cma cmaVar = c2255e.f27825b;
            C3244l c3244l = c2255e.f27809D;
            List list = (List) this.f27700b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f27699a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (!list.isEmpty()) {
                    c83 c83Var = ((C1371d) c2255e.f27843t).f18582s;
                    this.f27700b = list;
                    this.f27699a = 1;
                    obj = AbstractC3224d.m15541t(c83Var, this);
                    if (obj != coroutineSingletons) {
                        str = (String) ((Map) obj).get(cmaVar.mo4589b2());
                        if (c3244l.getValue() != null) {
                            playlist = (Playlist) c3244l.getValue();
                            if (playlist != null) {
                                str2 = playlist.f19554b;
                            } else {
                                str2 = null;
                            }
                            if (fa4.m11650l(str2, cmaVar.mo4589b2())) {
                                Playlist playlist2 = (Playlist) c3244l.getValue();
                                this.f27700b = null;
                                this.f27699a = 4;
                            }
                        }
                        if (str != null) {
                        }
                        Playlist playlist3 = (Playlist) u91.m22589G0(list);
                        this.f27700b = null;
                        this.f27699a = 2;
                    }
                    return coroutineSingletons;
                }
                C2255e.m9237Y2(c2255e);
                return xfa.f68157a;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                str = (String) ((Map) obj).get(cmaVar.mo4589b2());
                if (c3244l.getValue() != null && str != null) {
                    playlist = (Playlist) c3244l.getValue();
                    if (playlist != null) {
                        str2 = playlist.f19554b;
                    } else {
                        str2 = null;
                    }
                    if (fa4.m11650l(str2, cmaVar.mo4589b2())) {
                        Playlist playlist4 = (Playlist) c3244l.getValue();
                        this.f27700b = null;
                        this.f27699a = 4;
                    }
                }
                if (str != null || vk9.m23391n0(str)) {
                    Playlist playlist5 = (Playlist) u91.m22589G0(list);
                    this.f27700b = null;
                    this.f27699a = 2;
                } else {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!fa4.m11650l(((Playlist) next).f19553a, str));
                    this.f27700b = null;
                    this.f27699a = 3;
                }
            } else {
                if (i != 2 && i != 3 && i != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$getPlaylists$1(C2255e c2255e, Continuation continuation) {
        super(1, continuation);
        this.f27698b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistViewModel$getPlaylists$1(this.f27698b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistViewModel$getPlaylists$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27697a;
        C2255e c2255e = this.f27698b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM24465a = xd7.m24465a(c2255e.f27837n, c2255e.f27825b.mo4589b2());
            C22461 c22461 = new C22461(c2255e, null);
            this.f27697a = 1;
            if (AbstractC3224d.m15529h(c83VarM24465a, c22461, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        c2255e.f27809D.getValue();
        return xfa.f68157a;
    }
}
