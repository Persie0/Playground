package com.lingq.core.database.dao;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.entity.PlaylistEntity;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C2951e4;
import p000.C3386nv;
import p000.bl2;
import p000.bq1;
import p000.d32;
import p000.ed7;
import p000.id7;
import p000.md0;
import p000.p85;
import p000.q85;
import p000.rp0;
import p000.ss5;
import p000.ui5;
import p000.ux5;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.database.dao.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1322j extends bq1 {
    public static final id7 Companion = new id7();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f17045K;

    /* JADX INFO: renamed from: L */
    public final q85 f17046L;

    /* JADX INFO: renamed from: M */
    public final p85 f17047M;

    /* JADX INFO: renamed from: N */
    public final bl2 f17048N;

    /* JADX INFO: renamed from: O */
    public final bl2 f17049O;

    /* JADX INFO: renamed from: P */
    public final bl2 f17050P;

    public C1322j(AbstractC0746d abstractC0746d) {
        int i = 14;
        ss5.m21704c(new C2951e4(i));
        this.f17045K = abstractC0746d;
        this.f17046L = new q85(10);
        this.f17047M = new p85(i);
        this.f17048N = new bl2(new q85(11), new p85(15));
        this.f17049O = new bl2(new q85(12), new p85(16));
        int i2 = 13;
        this.f17050P = new bl2(new q85(i2), new p85(i2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A0 */
    public static Object m7513A0(C1322j c1322j, String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        PlaylistDao$updatePlaylistName$1 playlistDao$updatePlaylistName$1;
        if (continuationImpl instanceof PlaylistDao$updatePlaylistName$1) {
            playlistDao$updatePlaylistName$1 = (PlaylistDao$updatePlaylistName$1) continuationImpl;
            int i = playlistDao$updatePlaylistName$1.f16986g;
            if ((i & Integer.MIN_VALUE) != 0) {
                playlistDao$updatePlaylistName$1.f16986g = i - Integer.MIN_VALUE;
            } else {
                playlistDao$updatePlaylistName$1 = new PlaylistDao$updatePlaylistName$1(c1322j, continuationImpl);
            }
        } else {
            playlistDao$updatePlaylistName$1 = new PlaylistDao$updatePlaylistName$1(c1322j, continuationImpl);
        }
        Object obj = playlistDao$updatePlaylistName$1.f16984e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = playlistDao$updatePlaylistName$1.f16986g;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            playlistDao$updatePlaylistName$1.f16980a = c1322j;
            playlistDao$updatePlaylistName$1.f16981b = str;
            playlistDao$updatePlaylistName$1.f16982c = str2;
            playlistDao$updatePlaylistName$1.f16983d = str3;
            playlistDao$updatePlaylistName$1.f16986g = 1;
            Object objM2861d = AbstractC0758a.m2861d(new md0(str, 15, str2), c1322j.f17045K, playlistDao$updatePlaylistName$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str3 = playlistDao$updatePlaylistName$1.f16983d;
        str2 = playlistDao$updatePlaylistName$1.f16982c;
        str = playlistDao$updatePlaylistName$1.f16981b;
        c1322j = playlistDao$updatePlaylistName$1.f16980a;
        AbstractC3193b.m15359b(obj);
        playlistDao$updatePlaylistName$1.f16980a = null;
        playlistDao$updatePlaylistName$1.f16981b = null;
        playlistDao$updatePlaylistName$1.f16982c = null;
        playlistDao$updatePlaylistName$1.f16983d = null;
        playlistDao$updatePlaylistName$1.f16986g = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new rp0(str, 3, str3, str2), c1322j.f17045K, playlistDao$updatePlaylistName$1, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: v0 */
    public final Object mo4095v0(Object obj, Continuation continuation) {
        return AbstractC0758a.m2861d(new ed7(this, (PlaylistEntity) obj, 1), this.f17045K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m7514y0(List list, ContinuationImpl continuationImpl) {
        StringBuilder sbM22997t = ux5.m22997t("DELETE FROM LessonsWithPlaylistJoin WHERE contentId IN (");
        d32.m10005B(list.size(), sbM22997t);
        sbM22997t.append(")");
        Object objM2861d = AbstractC0758a.m2861d(new ui5(8, sbM22997t.toString(), list), this.f17045K, continuationImpl, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }

    /* JADX INFO: renamed from: z0 */
    public final Object m7515z0(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        Object objM2860c = AbstractC0758a.m2860c(new PlaylistDao_Impl$updatePlaylistName$2(this, str, str2, str3, null), this.f17045K, continuationImpl);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }
}
