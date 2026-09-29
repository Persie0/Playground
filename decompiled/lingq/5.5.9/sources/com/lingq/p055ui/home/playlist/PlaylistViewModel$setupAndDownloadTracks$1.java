package com.lingq.p055ui.home.playlist;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.PlayerContentController;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$setupAndDownloadTracks$1", m19206f = "PlaylistViewModel.kt", m19207l = {410}, m19208m = "invokeSuspend")
final class PlaylistViewModel$setupAndDownloadTracks$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public PlaylistViewModel f25823e;

    /* JADX INFO: renamed from: f */
    public Iterator f25824f;

    /* JADX INFO: renamed from: g */
    public int f25825g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List<PlayerContentController.PlayerContentItem> f25826h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PlaylistViewModel f25827i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$setupAndDownloadTracks$1(PlaylistViewModel playlistViewModel, List list, InterfaceC9968c interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f25826h = list;
        this.f25827i = playlistViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$setupAndDownloadTracks$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$setupAndDownloadTracks$1(this.f25827i, this.f25826h, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r9 = 3
            int r1 = r11.f25825g
            r9 = 2
            r7 = 1
            r2 = r7
            if (r1 == 0) goto L21
            r10 = 5
            if (r1 != r2) goto L17
            java.util.Iterator r1 = r11.f25824f
            r10 = 6
            com.lingq.ui.home.playlist.PlaylistViewModel r3 = r11.f25823e
            r10 = 3
            p260m8.C7499b.m14977z0(r12)
            goto L2f
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r10 = 6
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            r10 = 3
            throw r12
        L21:
            p260m8.C7499b.m14977z0(r12)
            java.util.List<com.lingq.player.PlayerContentController$PlayerContentItem> r12 = r11.f25826h
            r8 = 2
            java.util.Iterator r1 = r12.iterator()
            com.lingq.ui.home.playlist.PlaylistViewModel r3 = r11.f25827i
            r10 = 3
        L2e:
            r10 = 3
        L2f:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L6c
            java.lang.Object r12 = r1.next()
            com.lingq.player.PlayerContentController$PlayerContentItem r12 = (com.lingq.player.PlayerContentController.PlayerContentItem) r12
            r9 = 7
            kotlinx.coroutines.flow.StateFlowImpl r4 = r3.f25610g0
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r8 = 3
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L2e
            no.z r7 = p338qd.C8573r0.m16767w0(r3)
            r4 = r7
            com.lingq.ui.home.playlist.PlaylistViewModel$setupAndDownloadTracks$1$1$1 r5 = new com.lingq.ui.home.playlist.PlaylistViewModel$setupAndDownloadTracks$1$1$1
            r7 = 0
            r6 = r7
            r5.<init>(r12, r3, r6)
            r12 = 3
            no.C7828f.m15570d(r4, r6, r6, r5, r12)
            r11.f25823e = r3
            r11.f25824f = r1
            r11.f25825g = r2
            r8 = 4
            r4 = 1000(0x3e8, double:4.94E-321)
            r10 = 6
            java.lang.Object r12 = no.C7828f.m15567a(r4, r11)
            if (r12 != r0) goto L2e
            return r0
        L6c:
            sl.e r12 = sl.C9072e.f47360a
            r10 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.home.playlist.PlaylistViewModel$setupAndDownloadTracks$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
