package com.lingq.p055ui.home.playlist;

import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import ki.C6696b;
import ki.C6697c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, m13365d2 = {"", "Lki/c;", "lessons", "Lki/b;", "courses", "", "editing", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$showPlayer$1", m19206f = "PlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class PlaylistViewModel$showPlayer$1 extends SuspendLambda implements InterfaceC2058r<List<? extends C6697c>, List<? extends C6696b>, Boolean, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f25836e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f25837f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ boolean f25838g;

    public PlaylistViewModel$showPlayer$1(InterfaceC9968c<? super PlaylistViewModel$showPlayer$1> interfaceC9968c) {
        super(4, interfaceC9968c);
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final Object mo1851T(List<? extends C6697c> list, List<? extends C6696b> list2, Boolean bool, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        PlaylistViewModel$showPlayer$1 playlistViewModel$showPlayer$1 = new PlaylistViewModel$showPlayer$1(interfaceC9968c);
        playlistViewModel$showPlayer$1.f25836e = list;
        playlistViewModel$showPlayer$1.f25837f = list2;
        playlistViewModel$showPlayer$1.f25838g = zBooleanValue;
        return playlistViewModel$showPlayer$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f25836e;
        List list2 = this.f25837f;
        boolean z11 = this.f25838g;
        if ((!list.isEmpty()) || (!list2.isEmpty())) {
            z10 = z11 ? false : true;
        }
        return Boolean.valueOf(z10);
    }
}
