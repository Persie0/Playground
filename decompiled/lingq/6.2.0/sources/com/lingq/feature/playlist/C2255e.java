package com.lingq.feature.playlist;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.playlist.C1519b;
import com.lingq.core.domain.playlist.C1520c;
import com.lingq.core.domain.playlist.C1524g;
import com.lingq.core.domain.premiumlessons.C1525a;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.service.PlayingFrom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.C3509qs;
import p000.InterfaceC3812yx;
import p000.af7;
import p000.bia;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.d65;
import p000.dc7;
import p000.eh9;
import p000.em3;
import p000.fa4;
import p000.g41;
import p000.gh1;
import p000.hc7;
import p000.hf6;
import p000.l55;
import p000.lda;
import p000.nl8;
import p000.nm7;
import p000.nn1;
import p000.pd7;
import p000.q2c;
import p000.r32;
import p000.si7;
import p000.sq5;
import p000.tb7;
import p000.ud7;
import p000.vk9;
import p000.vma;
import p000.wfb;
import p000.wta;
import p000.wz0;
import p000.xd7;
import p000.xe7;
import p000.xfa;
import p000.xi9;
import p000.y25;

/* JADX INFO: renamed from: com.lingq.feature.playlist.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2255e extends wta implements cma, dc7, InterfaceC3812yx, af7, bia, r32 {

    /* JADX INFO: renamed from: A */
    public final C3244l f27806A;

    /* JADX INFO: renamed from: B */
    public final C3244l f27807B;

    /* JADX INFO: renamed from: C */
    public final c18 f27808C;

    /* JADX INFO: renamed from: D */
    public final C3244l f27809D;

    /* JADX INFO: renamed from: E */
    public final c18 f27810E;

    /* JADX INFO: renamed from: F */
    public final C3244l f27811F;

    /* JADX INFO: renamed from: G */
    public final C3244l f27812G;

    /* JADX INFO: renamed from: H */
    public final C3244l f27813H;

    /* JADX INFO: renamed from: I */
    public final C3244l f27814I;

    /* JADX INFO: renamed from: J */
    public final C3244l f27815J;

    /* JADX INFO: renamed from: K */
    public final C3244l f27816K;

    /* JADX INFO: renamed from: L */
    public final C3244l f27817L;

    /* JADX INFO: renamed from: M */
    public final C3244l f27818M;

    /* JADX INFO: renamed from: N */
    public final C3244l f27819N;

    /* JADX INFO: renamed from: O */
    public final C3244l f27820O;

    /* JADX INFO: renamed from: P */
    public final C3244l f27821P;

    /* JADX INFO: renamed from: Q */
    public final C3244l f27822Q;

    /* JADX INFO: renamed from: R */
    public final C3244l f27823R;

    /* JADX INFO: renamed from: S */
    public final c18 f27824S;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f27825b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dc7 f27826c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC3812yx f27827d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ af7 f27828e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ bia f27829f;

    /* JADX INFO: renamed from: g */
    public final C1524g f27830g;

    /* JADX INFO: renamed from: h */
    public final C1520c f27831h;

    /* JADX INFO: renamed from: i */
    public final C1525a f27832i;

    /* JADX INFO: renamed from: j */
    public final em3 f27833j;

    /* JADX INFO: renamed from: k */
    public final C1519b f27834k;

    /* JADX INFO: renamed from: l */
    public final C1381c f27835l;

    /* JADX INFO: renamed from: m */
    public final sq5 f27836m;

    /* JADX INFO: renamed from: n */
    public final xd7 f27837n;

    /* JADX INFO: renamed from: o */
    public final d65 f27838o;

    /* JADX INFO: renamed from: p */
    public final C1307w f27839p;

    /* JADX INFO: renamed from: q */
    public final nn1 f27840q;

    /* JADX INFO: renamed from: r */
    public final nn1 f27841r;

    /* JADX INFO: renamed from: s */
    public final si7 f27842s;

    /* JADX INFO: renamed from: t */
    public final vma f27843t;

    /* JADX INFO: renamed from: u */
    public final nm7 f27844u;

    /* JADX INFO: renamed from: v */
    public final C1808b f27845v;

    /* JADX INFO: renamed from: w */
    public final C3509qs f27846w;

    /* JADX INFO: renamed from: x */
    public final r32 f27847x;

    /* JADX INFO: renamed from: y */
    public final pd7 f27848y;

    /* JADX INFO: renamed from: z */
    public final C3244l f27849z;

    public C2255e(C1524g c1524g, C1520c c1520c, C1525a c1525a, em3 em3Var, C1519b c1519b, C1381c c1381c, sq5 sq5Var, xd7 xd7Var, d65 d65Var, C1307w c1307w, nn1 nn1Var, nn1 nn1Var2, si7 si7Var, vma vmaVar, nm7 nm7Var, C1808b c1808b, C3509qs c3509qs, r32 r32Var, cma cmaVar, dc7 dc7Var, InterfaceC3812yx interfaceC3812yx, af7 af7Var, bia biaVar, nl8 nl8Var) {
        String str;
        xd7Var.getClass();
        d65Var.getClass();
        c1307w.getClass();
        si7Var.getClass();
        vmaVar.getClass();
        nm7Var.getClass();
        c1808b.getClass();
        c3509qs.getClass();
        r32Var.getClass();
        cmaVar.getClass();
        dc7Var.getClass();
        interfaceC3812yx.getClass();
        af7Var.getClass();
        biaVar.getClass();
        nl8Var.getClass();
        this.f27825b = cmaVar;
        this.f27826c = dc7Var;
        this.f27827d = interfaceC3812yx;
        this.f27828e = af7Var;
        this.f27829f = biaVar;
        this.f27830g = c1524g;
        this.f27831h = c1520c;
        this.f27832i = c1525a;
        this.f27833j = em3Var;
        this.f27834k = c1519b;
        this.f27835l = c1381c;
        this.f27836m = sq5Var;
        this.f27837n = xd7Var;
        this.f27838o = d65Var;
        this.f27839p = c1307w;
        this.f27840q = nn1Var;
        this.f27841r = nn1Var2;
        this.f27842s = si7Var;
        this.f27843t = vmaVar;
        this.f27844u = nm7Var;
        this.f27845v = c1808b;
        this.f27846w = c3509qs;
        this.f27847x = r32Var;
        pd7.Companion.getClass();
        if (nl8Var.m17487a("playlistLanguageFromDeeplink")) {
            str = (String) nl8Var.m17488b("playlistLanguageFromDeeplink");
            if (str == null) {
                C3386nv.m17626m("Argument \"playlistLanguageFromDeeplink\" is marked as non-null but was passed a null value");
                throw null;
            }
        } else {
            str = "";
        }
        this.f27848y = new pd7(str);
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(bool);
        this.f27849z = c3244lM17114d;
        this.f27806A = AbstractC3352my.m17114d(bool);
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(emptyList);
        this.f27807B = c3244lM17114d2;
        C3235e c3235eM15521C = AbstractC3224d.m15521C(c3244lM17114d2, new PlaylistViewModel$audioSources$1(this, null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(c3235eM15521C, g41VarM16103C, c3243k, emptyList);
        this.f27808C = c18VarM15520B;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(null);
        this.f27809D = c3244lM17114d3;
        this.f27810E = AbstractC3224d.m15520B(c3244lM17114d3, lda.m16103C(this), c3243k, null);
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(bool);
        this.f27811F = c3244lM17114d4;
        this.f27812G = AbstractC3352my.m17114d(bool);
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(bool);
        this.f27813H = c3244lM17114d5;
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(AbstractC3224d.m15531j(c18VarM15520B, c3244lM17114d5, c1808b.f21946D, c3244lM17114d, new PlaylistViewModel$showPlayer$1(5, null)), lda.m16103C(this), c3243k, bool);
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(0);
        this.f27814I = c3244lM17114d6;
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(bool);
        this.f27815J = c3244lM17114d7;
        this.f27816K = AbstractC3352my.m17114d(Boolean.TRUE);
        C3244l c3244lM17114d8 = AbstractC3352my.m17114d(null);
        this.f27817L = c3244lM17114d8;
        C3244l c3244lM17114d9 = AbstractC3352my.m17114d(null);
        this.f27818M = c3244lM17114d9;
        this.f27819N = AbstractC3352my.m17114d(null);
        C3244l c3244lM17114d10 = AbstractC3352my.m17114d(new y25());
        this.f27820O = c3244lM17114d10;
        this.f27821P = AbstractC3352my.m17114d(null);
        C3244l c3244lM17114d11 = AbstractC3352my.m17114d(bool);
        this.f27822Q = c3244lM17114d11;
        C3244l c3244lM17114d12 = AbstractC3352my.m17114d(bool);
        this.f27823R = c3244lM17114d12;
        this.f27824S = AbstractC3224d.m15520B(new wz0(19, new c83[]{c3244lM17114d2, c3244lM17114d4, c3244lM17114d5, c3244lM17114d, c3244lM17114d6, c3244lM17114d7, c3244lM17114d8, c3244lM17114d9, c18VarM15520B2, c1808b.f21946D, c3244lM17114d10, AbstractC3224d.m15532k(c3244lM17114d11, c3244lM17114d12, c3244lM17114d3, new PlaylistViewModel$archiveState$1(4, null))}, this), lda.m16103C(this), c3243k, xe7.f68130a);
        wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$3(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$4(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$5(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$6(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$7(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$observePendingAutoPlay$1(this, null), 3);
    }

    /* JADX INFO: renamed from: V2 */
    public static final ud7 m9234V2(C2255e c2255e, int i) {
        Object next;
        Iterator it = q2c.m19624a((List) c2255e.f27807B.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((l55) next).f49081a.f63767a != i);
        l55 l55Var = (l55) next;
        if (l55Var != null) {
            return l55Var.f49081a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r2).m7970j(r14, r3) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r2).m7970j(r13, r3) == r4) goto L37;
     */
    /* JADX INFO: renamed from: W2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9235W2(C2255e c2255e, Playlist playlist, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistViewModel$setCurrentPlaylist$1 playlistViewModel$setCurrentPlaylist$1;
        int i;
        cma cmaVar = c2255e.f27825b;
        nn1 nn1Var = c2255e.f27840q;
        vma vmaVar = c2255e.f27843t;
        if (continuationImpl instanceof PlaylistViewModel$setCurrentPlaylist$1) {
            playlistViewModel$setCurrentPlaylist$1 = (PlaylistViewModel$setCurrentPlaylist$1) continuationImpl;
            int i2 = playlistViewModel$setCurrentPlaylist$1.f27740e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                playlistViewModel$setCurrentPlaylist$1.f27740e = i2 - Integer.MIN_VALUE;
            } else {
                playlistViewModel$setCurrentPlaylist$1 = new PlaylistViewModel$setCurrentPlaylist$1(c2255e, continuationImpl);
            }
        } else {
            playlistViewModel$setCurrentPlaylist$1 = new PlaylistViewModel$setCurrentPlaylist$1(c2255e, continuationImpl);
        }
        Object objM15541t = playlistViewModel$setCurrentPlaylist$1.f27738c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = playlistViewModel$setCurrentPlaylist$1.f27740e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            if (playlist == null || vk9.m23391n0(playlist.f19555c)) {
                c83 c83Var = ((C1371d) vmaVar).f18582s;
                playlistViewModel$setCurrentPlaylist$1.f27736a = null;
                playlistViewModel$setCurrentPlaylist$1.f27740e = 1;
                objM15541t = AbstractC3224d.m15541t(c83Var, playlistViewModel$setCurrentPlaylist$1);
                if (objM15541t != coroutineSingletons) {
                    LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
                    linkedHashMapM15372Y.put(cmaVar.mo4589b2(), "");
                    playlistViewModel$setCurrentPlaylist$1.f27736a = null;
                    playlistViewModel$setCurrentPlaylist$1.f27740e = 2;
                }
            } else {
                c83 c83Var2 = ((C1371d) vmaVar).f18582s;
                playlistViewModel$setCurrentPlaylist$1.f27736a = playlist;
                i = 0;
                playlistViewModel$setCurrentPlaylist$1.f27737b = 0;
                playlistViewModel$setCurrentPlaylist$1.f27740e = 3;
                objM15541t = AbstractC3224d.m15541t(c83Var2, playlistViewModel$setCurrentPlaylist$1);
                if (objM15541t != coroutineSingletons) {
                    LinkedHashMap linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) objM15541t);
                    linkedHashMapM15372Y2.put(cmaVar.mo4589b2(), playlist.f19553a);
                    playlistViewModel$setCurrentPlaylist$1.f27736a = playlist;
                    playlistViewModel$setCurrentPlaylist$1.f27737b = i;
                    playlistViewModel$setCurrentPlaylist$1.f27740e = 4;
                }
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            AbstractC3193b.m15359b(objM15541t);
            LinkedHashMap linkedHashMapM15372Y3 = AbstractC3194a.m15372Y((Map) objM15541t);
            linkedHashMapM15372Y3.put(cmaVar.mo4589b2(), "");
            playlistViewModel$setCurrentPlaylist$1.f27736a = null;
            playlistViewModel$setCurrentPlaylist$1.f27740e = 2;
        } else if (i3 != 2) {
            if (i3 == 3) {
                int i4 = playlistViewModel$setCurrentPlaylist$1.f27737b;
                Playlist playlist2 = playlistViewModel$setCurrentPlaylist$1.f27736a;
                AbstractC3193b.m15359b(objM15541t);
                i = i4;
                playlist = playlist2;
                LinkedHashMap linkedHashMapM15372Y4 = AbstractC3194a.m15372Y((Map) objM15541t);
                linkedHashMapM15372Y4.put(cmaVar.mo4589b2(), playlist.f19553a);
                playlistViewModel$setCurrentPlaylist$1.f27736a = playlist;
                playlistViewModel$setCurrentPlaylist$1.f27737b = i;
                playlistViewModel$setCurrentPlaylist$1.f27740e = 4;
            } else {
                if (i3 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                playlist = playlistViewModel$setCurrentPlaylist$1.f27736a;
                AbstractC3193b.m15359b(objM15541t);
            }
            c2255e.f27809D.m15571i(playlist);
            AbstractC1263a.m7047b(lda.m16103C(c2255e), nn1Var, "getUseCasePlaylistLessons", new PlaylistViewModel$getUseCasePlaylistLessons$1(c2255e, playlist, null));
            AbstractC1263a.m7047b(lda.m16103C(c2255e), nn1Var, "fetchPlaylist", new PlaylistViewModel$fetchPlaylist$1(c2255e, playlist, null));
        } else {
            AbstractC3193b.m15359b(objM15541t);
        }
        AbstractC1263a.m7047b(lda.m16103C(c2255e), nn1Var, "playlists", new PlaylistViewModel$getPlaylists$1(c2255e, null));
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: X2 */
    public static final Object m9236X2(C2255e c2255e, List list, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistViewModel$setupAudioSources$1 playlistViewModel$setupAudioSources$1;
        C3509qs c3509qs = c2255e.f27846w;
        dc7 dc7Var = c2255e.f27826c;
        C1808b c1808b = c2255e.f27845v;
        if (continuationImpl instanceof PlaylistViewModel$setupAudioSources$1) {
            playlistViewModel$setupAudioSources$1 = (PlaylistViewModel$setupAudioSources$1) continuationImpl;
            int i = playlistViewModel$setupAudioSources$1.f27760d;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistViewModel$setupAudioSources$1.f27760d = i - Integer.MIN_VALUE;
            } else {
                playlistViewModel$setupAudioSources$1 = new PlaylistViewModel$setupAudioSources$1(c2255e, continuationImpl);
            }
        } else {
            playlistViewModel$setupAudioSources$1 = new PlaylistViewModel$setupAudioSources$1(c2255e, continuationImpl);
        }
        Object objM8195a = playlistViewModel$setupAudioSources$1.f27758b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistViewModel$setupAudioSources$1.f27760d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM8195a);
            Object value = dc7Var.mo9214t2().getValue();
            PlayingFrom playingFrom = PlayingFrom.Playlist;
            if (value == playingFrom || dc7Var.mo9214t2().getValue() == null) {
                c2255e.mo9211g0(playingFrom);
                if (list.isEmpty()) {
                    c1808b.m8450M(true);
                } else if (((Boolean) c2255e.f27816K.getValue()).booleanValue()) {
                    C1519b c1519b = c2255e.f27834k;
                    playlistViewModel$setupAudioSources$1.f27757a = list;
                    playlistViewModel$setupAudioSources$1.f27760d = 1;
                    objM8195a = c1519b.m8195a(playlistViewModel$setupAudioSources$1);
                    if (objM8195a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return xfa.f68157a;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = playlistViewModel$setupAudioSources$1.f27757a;
        AbstractC3193b.m15359b(objM8195a);
        if (!((Boolean) objM8195a).booleanValue()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((tb7) obj).f62108h) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        c1808b.m8461a0(list);
        AbstractC1263a.m7048c(lda.m16103C(c2255e), "tracksDownload", new PlaylistViewModel$setupAndDownloadTracks$1(list, c2255e, null));
        if (!c1808b.m8445H(c3509qs.f58118b.getInt("playlistTrack", 0))) {
            c2255e.m9244f3(c3509qs.f58118b.getInt("playlistTrack", 0), false);
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: Y2 */
    public static final void m9237Y2(C2255e c2255e) {
        c2255e.getClass();
        AbstractC1263a.m7047b(lda.m16103C(c2255e), c2255e.f27840q, "updatePlaylists", new PlaylistViewModel$updatePlaylists$1(c2255e, null));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f27825b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f27825b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f27825b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f27825b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f27825b.mo4575D0(continuation);
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: E0 */
    public final boolean mo8231E0(int i) {
        return this.f27827d.mo8231E0(i);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: E2 */
    public final void mo8240E2() {
        this.f27847x.mo8240E2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f27825b.mo4576F1(str, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: G0 */
    public final void mo8241G0() {
        this.f27847x.mo8241G0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f27825b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f27825b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f27825b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f27825b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f27825b.mo4581L0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: M0 */
    public final eh9 mo9201M0() {
        return this.f27826c.mo9201M0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f27829f.mo3737M1(upgradeReason);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: M2 */
    public final Object mo8242M2(hf6 hf6Var, long j, Continuation continuation) {
        return this.f27847x.mo8242M2(hf6Var, 500L, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f27825b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f27825b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f27825b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f27825b.mo4585R();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: R1 */
    public final void mo8243R1(hf6 hf6Var) {
        hf6Var.getClass();
        this.f27847x.mo8243R1(hf6Var);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: S1 */
    public final eh9 mo8244S1() {
        return this.f27847x.mo8244S1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f27825b.mo4586T0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: T1 */
    public final void mo9202T1(int i, long j, boolean z) {
        this.f27826c.mo9202T1(i, j, z);
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: V1 */
    public final void mo343V1(Playlist playlist) {
        playlist.getClass();
        this.f27828e.mo343V1(playlist);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f27825b.mo4587X();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f27829f.mo3738Z();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: Z1 */
    public final void mo8245Z1(hf6 hf6Var) {
        this.f27847x.mo8245Z1(hf6Var);
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m9238Z2() {
        dc7 dc7Var = this.f27826c;
        Object value = dc7Var.mo9214t2().getValue();
        EmptyList emptyList = EmptyList.f47638a;
        if (value == null || dc7Var.mo9214t2().getValue() == PlayingFrom.Playlist) {
            m9244f3(-1, false);
            this.f27845v.m8461a0(emptyList);
        }
        C3244l c3244l = this.f27807B;
        c3244l.getClass();
        c3244l.m15572j(null, emptyList);
        Boolean bool = Boolean.FALSE;
        C3244l c3244l2 = this.f27811F;
        c3244l2.getClass();
        c3244l2.m15572j(null, bool);
        this.f27821P.m15571i(null);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f27825b.mo4588a0();
    }

    /* JADX INFO: renamed from: a3 */
    public final void m9239a3() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f27820O;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, new y25()));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f27825b.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m9240b3(ud7 ud7Var) {
        Object next;
        ud7Var.getClass();
        int i = ud7Var.f63767a;
        Boolean bool = Boolean.TRUE;
        C3244l c3244l = this.f27816K;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        Iterator it = ((Iterable) ((C3244l) this.f27808C.f9311a).getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((tb7) next).f62101a != i);
        tb7 tb7Var = (tb7) next;
        if (tb7Var == null) {
            return;
        }
        if (tb7Var.f62108h) {
            if (this.f27827d.mo8231E0(tb7Var.f62101a)) {
                return;
            }
        }
        if (!vk9.m23391n0(tb7Var.f62102b)) {
            wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$findTrackAndDownload$1(tb7Var, this, null), 3);
        } else if (ud7Var.f63780n == null) {
            m9246h3(i);
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final void m9241c3() {
        C3244l c3244l;
        Object value;
        C3244l c3244l2;
        Object value2;
        C3244l c3244l3;
        Object value3;
        C3244l c3244l4;
        Object value4;
        do {
            c3244l = this.f27814I;
            value = c3244l.getValue();
            ((Number) value).intValue();
        } while (!c3244l.m15570h(value, 0));
        do {
            c3244l2 = this.f27815J;
            value2 = c3244l2.getValue();
            ((Boolean) value2).getClass();
        } while (!c3244l2.m15570h(value2, Boolean.FALSE));
        do {
            c3244l3 = this.f27818M;
            value3 = c3244l3.getValue();
        } while (!c3244l3.m15570h(value3, null));
        do {
            c3244l4 = this.f27817L;
            value4 = c3244l4.getValue();
        } while (!c3244l4.m15570h(value4, null));
        Boolean bool = Boolean.FALSE;
        C3244l c3244l5 = this.f27822Q;
        c3244l5.getClass();
        c3244l5.m15572j(null, bool);
        C3244l c3244l6 = this.f27823R;
        c3244l6.getClass();
        c3244l6.m15572j(null, bool);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f27825b.mo4590d0();
    }

    /* JADX INFO: renamed from: d3 */
    public final boolean m9242d3(int i) {
        Object next;
        Iterator it = q2c.m19624a((List) this.f27807B.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((l55) next).f49081a.f63767a != i);
        l55 l55Var = (l55) next;
        ud7 ud7Var = l55Var != null ? l55Var.f49081a : null;
        return (ud7Var == null || ud7Var.f63787u || ud7Var.f63784r <= 0) ? false : true;
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: e0 */
    public final void mo8247e0(String str, long j) {
        str.getClass();
        this.f27847x.mo8247e0(str, j);
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: e2 */
    public final void mo8233e2(String str, List list) {
        str.getClass();
        this.f27827d.mo8233e2(str, list);
    }

    /* JADX INFO: renamed from: e3 */
    public final void m9243e3(Playlist playlist) {
        playlist.getClass();
        m9238Z2();
        C1808b c1808b = this.f27845v;
        C3244l c3244l = c1808b.f21943A;
        c3244l.getClass();
        EmptyList emptyList = EmptyList.f47638a;
        c3244l.m15572j(null, emptyList);
        C3244l c3244l2 = c1808b.f21945C;
        while (true) {
            Object value = c3244l2.getValue();
            EmptyList emptyList2 = emptyList;
            if (c3244l2.m15570h(value, hc7.m13196a((hc7) value, null, null, null, 0L, 0, 0L, false, false, null, null, false, emptyList2, null, 6143))) {
                gh1 gh1Var = c1808b.f21961n;
                ((ArrayList) gh1Var.f40792d).clear();
                ((ArrayList) gh1Var.f40793e).clear();
                gh1Var.f40790b = 0;
                gh1Var.f40791c = 0;
                wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$onPlaylistSelected$1(this, playlist, null), 3);
                return;
            }
            emptyList = emptyList2;
        }
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: f2 */
    public final void mo344f2(Playlist playlist) {
        playlist.getClass();
        this.f27828e.mo344f2(playlist);
    }

    /* JADX INFO: renamed from: f3 */
    public final void m9244f3(int i, boolean z) {
        Boolean bool = Boolean.TRUE;
        C3244l c3244l = this.f27816K;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$setSelectedLesson$1(this, i, z, null), 3);
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: g0 */
    public final void mo9211g0(PlayingFrom playingFrom) {
        playingFrom.getClass();
        this.f27826c.mo9211g0(playingFrom);
    }

    /* JADX INFO: renamed from: g3 */
    public final void m9245g3(int i) {
        wfb.m23926u(lda.m16103C(this), null, null, new PlaylistViewModel$showBuyPremiumLesson$1(this, i, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f27825b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: h1 */
    public final eh9 mo8248h1() {
        return this.f27847x.mo8248h1();
    }

    /* JADX INFO: renamed from: h3 */
    public final void m9246h3(int i) {
        C3244l c3244l;
        Object value;
        C3244l c3244l2;
        Object value2;
        if (fa4.m11650l(this.f27819N.getValue(), Boolean.TRUE)) {
            do {
                c3244l2 = this.f27814I;
                value2 = c3244l2.getValue();
                ((Number) value2).intValue();
            } while (!c3244l2.m15570h(value2, Integer.valueOf(i)));
            return;
        }
        do {
            c3244l = this.f27815J;
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.TRUE));
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: j1 */
    public final void mo9212j1() {
        this.f27826c.mo9212j1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f27829f.mo3739j2();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: k */
    public final eh9 mo8249k() {
        return this.f27847x.mo8249k();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f27829f.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f27825b.mo4592m0();
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: m2 */
    public final c83 mo345m2() {
        return this.f27828e.mo345m2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f27825b.mo4593p0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: q */
    public final c83 mo9213q() {
        return this.f27826c.mo9213q();
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: r */
    public final Object mo8234r(DownloadItem downloadItem, Continuation continuation) {
        return this.f27827d.mo8234r(downloadItem, continuation);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f27829f.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f27825b.mo4594r1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f27829f.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f27825b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f27825b.mo4596t();
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: t1 */
    public final c83 mo346t1() {
        return this.f27828e.mo346t1();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: t2 */
    public final eh9 mo9214t2() {
        return this.f27826c.mo9214t2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f27825b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f27825b.mo4598w2();
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: x */
    public final c83 mo347x() {
        return this.f27828e.mo347x();
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: x0 */
    public final void mo348x0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f27828e.mo348x0(str, str2);
    }
}
