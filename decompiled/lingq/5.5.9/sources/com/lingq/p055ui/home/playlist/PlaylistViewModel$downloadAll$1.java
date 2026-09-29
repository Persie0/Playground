package com.lingq.p055ui.home.playlist;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.PlayerContentController;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$downloadAll$1", m19206f = "PlaylistViewModel.kt", m19207l = {1047, 1053}, m19208m = "invokeSuspend")
final class PlaylistViewModel$downloadAll$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public PlaylistViewModel f25723e;

    /* JADX INFO: renamed from: f */
    public Iterator f25724f;

    /* JADX INFO: renamed from: g */
    public PlayerContentController.PlayerContentItem f25725g;

    /* JADX INFO: renamed from: h */
    public int f25726h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PlaylistViewModel f25727i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$downloadAll$1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super PlaylistViewModel$downloadAll$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f25727i = playlistViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistViewModel$downloadAll$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistViewModel$downloadAll$1(this.f25727i, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:14:0x004e->B:31:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ae -> B:14:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:25:0x00ae
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r15) {
        /*
            r14 = this;
            r11 = r14
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r13 = 6
            int r1 = r11.f25726h
            r13 = 4
            r13 = 2
            r2 = r13
            r3 = 1
            if (r1 == 0) goto L2f
            r13 = 6
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1a
            java.util.Iterator r1 = r11.f25724f
            com.lingq.ui.home.playlist.PlaylistViewModel r4 = r11.f25723e
            p260m8.C7499b.m14977z0(r15)
            r15 = r4
            goto L4d
        L1a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
            r13 = 1
        L23:
            com.lingq.player.PlayerContentController$PlayerContentItem r1 = r11.f25725g
            java.util.Iterator r4 = r11.f25724f
            com.lingq.ui.home.playlist.PlaylistViewModel r5 = r11.f25723e
            r13 = 1
            p260m8.C7499b.m14977z0(r15)
            r15 = r11
            goto L89
        L2f:
            r13 = 2
            p260m8.C7499b.m14977z0(r15)
            com.lingq.ui.home.playlist.PlaylistViewModel r15 = r11.f25727i
            r13 = 4
            kotlinx.coroutines.flow.StateFlowImpl r1 = r15.f25633y0
            r13 = 6
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r13 = 7
            r1.setValue(r4)
            kotlinx.coroutines.flow.p r1 = r15.f25618k0
            r13 = 4
            java.lang.Object r13 = r1.getValue()
            r1 = r13
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L4d:
            r4 = r11
        L4e:
            boolean r13 = r1.hasNext()
            r5 = r13
            if (r5 == 0) goto Lb2
            r13 = 2
            java.lang.Object r5 = r1.next()
            com.lingq.player.PlayerContentController$PlayerContentItem r5 = (com.lingq.player.PlayerContentController.PlayerContentItem) r5
            r13 = 3
            java.lang.String r6 = r5.f17601b
            boolean r13 = mo.C7661i.m15250P2(r6)
            r6 = r13
            r6 = r6 ^ r3
            if (r6 == 0) goto L4e
            r13 = 4
            com.lingq.shared.repository.a r6 = r15.f25605e
            java.lang.String r13 = r15.mo498E1()
            r7 = r13
            r4.f25723e = r15
            r13 = 5
            r4.f25724f = r1
            r4.f25725g = r5
            r13 = 4
            r4.f25726h = r3
            int r8 = r5.f17600a
            java.lang.Object r13 = r6.mo9511d(r8, r7, r4)
            r6 = r13
            if (r6 != r0) goto L83
            return r0
        L83:
            r13 = 6
            r10 = r5
            r5 = r15
            r15 = r4
            r4 = r1
            r1 = r10
        L89:
            com.lingq.shared.download.DownloadItem r6 = new com.lingq.shared.download.DownloadItem
            r13 = 3
            java.lang.String r7 = r1.f17608i
            java.lang.String r8 = r1.f17601b
            r13 = 4
            boolean r9 = r1.f17606g
            r13 = 5
            int r1 = r1.f17600a
            r13 = 6
            r6.<init>(r7, r1, r8, r9)
            r13 = 5
            r15.f25723e = r5
            r13 = 3
            r15.f25724f = r4
            r13 = 1
            r1 = 0
            r15.f25725g = r1
            r13 = 5
            r15.f25726h = r2
            java.lang.Object r1 = r5.mo9405S1(r6, r15)
            if (r1 != r0) goto Lae
            return r0
        Lae:
            r1 = r4
            r4 = r15
            r15 = r5
            goto L4e
        Lb2:
            sl.e r15 = sl.C9072e.f47360a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.home.playlist.PlaylistViewModel$downloadAll$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
