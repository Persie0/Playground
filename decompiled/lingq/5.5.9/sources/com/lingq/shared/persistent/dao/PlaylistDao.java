package com.lingq.shared.persistent.dao;

import android.support.v4.media.AbstractC0140a;
import com.lingq.entity.LibraryData;
import com.lingq.entity.Playlist;
import com.lingq.shared.uimodel.CoursePlaylistSort;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import java.util.ArrayList;
import java.util.List;
import ki.C6698d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C7136q;
import p260m8.C7499b;
import p288o4.C7915a;
import p367rh.C8798l;
import p367rh.C8805s;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlaylistDao extends AbstractC0140a {

    /* JADX INFO: renamed from: com.lingq.shared.persistent.dao.PlaylistDao$a */
    public /* synthetic */ class C3315a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19381a;

        static {
            int[] iArr = new int[CoursePlaylistSort.values().length];
            try {
                iArr[CoursePlaylistSort.Completed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoursePlaylistSort.Opened.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19381a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: a1 */
    public static Object m9474a1(PlaylistDao playlistDao, String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        PlaylistDao$updatePlaylistName$1 playlistDao$updatePlaylistName$1;
        PlaylistDao playlistDao2 = playlistDao;
        if (interfaceC9968c instanceof PlaylistDao$updatePlaylistName$1) {
            playlistDao$updatePlaylistName$1 = (PlaylistDao$updatePlaylistName$1) interfaceC9968c;
            int i10 = playlistDao$updatePlaylistName$1.f19388j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                playlistDao$updatePlaylistName$1.f19388j = i10 - Integer.MIN_VALUE;
            } else {
                playlistDao$updatePlaylistName$1 = new PlaylistDao$updatePlaylistName$1(playlistDao2, interfaceC9968c);
            }
        } else {
            playlistDao$updatePlaylistName$1 = new PlaylistDao$updatePlaylistName$1(playlistDao2, interfaceC9968c);
        }
        Object obj = playlistDao$updatePlaylistName$1.f19386h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = playlistDao$updatePlaylistName$1.f19388j;
        if (i11 != 0) {
            if (i11 == 1) {
                str3 = playlistDao$updatePlaylistName$1.f19385g;
                str2 = playlistDao$updatePlaylistName$1.f19384f;
                str = playlistDao$updatePlaylistName$1.f19383e;
                playlistDao2 = playlistDao$updatePlaylistName$1.f19382d;
                C7499b.m14977z0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        playlistDao$updatePlaylistName$1.f19382d = playlistDao2;
        playlistDao$updatePlaylistName$1.f19383e = str;
        playlistDao$updatePlaylistName$1.f19384f = str2;
        playlistDao$updatePlaylistName$1.f19385g = str3;
        playlistDao$updatePlaylistName$1.f19388j = 1;
        if (playlistDao2.mo5209W0(str, str2, playlistDao$updatePlaylistName$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        playlistDao$updatePlaylistName$1.f19382d = null;
        playlistDao$updatePlaylistName$1.f19383e = null;
        playlistDao$updatePlaylistName$1.f19384f = null;
        playlistDao$updatePlaylistName$1.f19385g = null;
        playlistDao$updatePlaylistName$1.f19388j = 2;
        if (playlistDao2.mo5208V0(str, str2, str3, playlistDao$updatePlaylistName$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX INFO: renamed from: A0 */
    public abstract Object mo5187A0(String str, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: B0 */
    public abstract Object mo5188B0(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: C0 */
    public abstract Object mo5189C0(String str, InterfaceC9968c<? super List<C6698d>> interfaceC9968c);

    /* JADX INFO: renamed from: D0 */
    public abstract Object mo5190D0(String str, ArrayList arrayList, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: E0 */
    public abstract Object mo5191E0(String str, ArrayList arrayList, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: F0 */
    public abstract Object mo5192F0(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: G0 */
    public abstract Object mo5193G0(int i10, InterfaceC9968c<? super UserPlaylist> interfaceC9968c);

    /* JADX INFO: renamed from: H0 */
    public abstract Object mo5194H0(String str, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: I0 */
    public abstract Object mo5195I0(int i10, String str, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: J0 */
    public abstract Object mo5196J0(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: K0 */
    public abstract Object mo5197K0(int i10, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: L0 */
    public abstract Object mo5198L0(int i10, InterfaceC9968c<? super LibraryData> interfaceC9968c);

    /* JADX INFO: renamed from: M0 */
    public abstract Object mo5199M0(int i10, String str, InterfaceC9968c<? super List<C8805s>> interfaceC9968c);

    /* JADX INFO: renamed from: N0 */
    public abstract Object mo5200N0(InterfaceC9968c<? super Integer> interfaceC9968c);

    /* JADX INFO: renamed from: O0 */
    public abstract Object mo5201O0(String str, InterfaceC9968c<? super UserPlaylist> interfaceC9968c);

    /* JADX INFO: renamed from: P0 */
    public abstract Object mo5202P0(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: Q0 */
    public abstract Object mo5203Q0(Playlist playlist, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: R0 */
    public abstract Object mo5204R0(C8805s c8805s, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: S0 */
    public abstract Object mo5205S0(C8798l c8798l, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: T0 */
    public abstract Object mo5206T0(List<C8805s> list, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: U0 */
    public abstract Object mo5207U0(int i10, String str, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: V0 */
    public abstract Object mo5208V0(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: W0 */
    public abstract Object mo5209W0(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: X0 */
    public abstract Object mo5210X0(List<C8805s> list, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: Y0 */
    public abstract Object mo5211Y0(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: Z0 */
    public Object mo5212Z0(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        return m9474a1(this, str, str2, str3, continuationImpl);
    }

    /* JADX INFO: renamed from: k0 */
    public abstract Object mo5213k0(InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: l0 */
    public abstract Object mo5214l0(int i10, int i11, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: m0 */
    public abstract Object mo5215m0(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: n0 */
    public abstract Object mo5216n0(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: o0 */
    public abstract Object mo5217o0(String str, ArrayList arrayList, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: p0 */
    public abstract Object mo5218p0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: q0 */
    public abstract C7136q mo5219q0(C7915a c7915a);

    /* JADX INFO: renamed from: r0 */
    public abstract C7136q mo5220r0(String str, int i10);

    /* JADX INFO: renamed from: s0 */
    public abstract C7136q mo5221s0(String str);

    /* JADX INFO: renamed from: t0 */
    public abstract C7136q mo5222t0(String str, int i10);

    /* JADX INFO: renamed from: u0 */
    public abstract C7136q mo5223u0(String str);

    /* JADX INFO: renamed from: v0 */
    public abstract C7136q mo5224v0(String str);

    /* JADX INFO: renamed from: w0 */
    public abstract C7136q mo5225w0(String str);

    /* JADX INFO: renamed from: x0 */
    public abstract C7136q mo5226x0(String str, int i10);

    /* JADX INFO: renamed from: y0 */
    public abstract C7136q mo5227y0(String str);

    /* JADX INFO: renamed from: z0 */
    public abstract Object mo5228z0(String str, InterfaceC9968c<? super UserPlaylist> interfaceC9968c);
}
