package com.lingq.shared.repository;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.persistent.dao.PlaylistDao;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p367rh.C8805s;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl$changePosition$2", m19206f = "PlaylistRepository.kt", m19207l = {813, 814, 815}, m19208m = "invokeSuspend")
public final class PlaylistRepositoryImpl$changePosition$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public C8805s f20249e;

    /* JADX INFO: renamed from: f */
    public int f20250f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<C8805s> f20251g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List<C8805s> f20252h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PlaylistRepositoryImpl f20253i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f20254j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f20255k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$changePosition$2(List<C8805s> list, List<C8805s> list2, PlaylistRepositoryImpl playlistRepositoryImpl, int i10, int i11, InterfaceC9968c<? super PlaylistRepositoryImpl$changePosition$2> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f20251g = list;
        this.f20252h = list2;
        this.f20253i = playlistRepositoryImpl;
        this.f20254j = i10;
        this.f20255k = i11;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistRepositoryImpl$changePosition$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistRepositoryImpl$changePosition$2(this.f20251g, this.f20252h, this.f20253i, this.f20254j, this.f20255k, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x008e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        C8805s c8805s;
        PlaylistDao playlistDao;
        PlaylistRepositoryImpl playlistRepositoryImpl;
        String str;
        int i10;
        boolean z10;
        int i11;
        int i12;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = this.f20250f;
        PlaylistRepositoryImpl playlistRepositoryImpl2 = this.f20253i;
        List<C8805s> list = this.f20252h;
        if (i13 == 0) {
            C7499b.m14977z0(obj);
            List<C8805s> list2 = this.f20251g;
            if ((!list2.isEmpty()) && (!list.isEmpty())) {
                c8805s = (C8805s) C6752c.m13423Q(list2);
                Integer num = c8805s.f46676d;
                c8805s.f46676d = ((C8805s) C6752c.m13423Q(list)).f46676d;
                ((C8805s) C6752c.m13423Q(list)).f46676d = num;
                PlaylistDao playlistDao2 = playlistRepositoryImpl2.f20199c;
                this.f20249e = c8805s;
                this.f20250f = 1;
                if (playlistDao2.mo5210X0(list2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlistDao = playlistRepositoryImpl2.f20199c;
                this.f20249e = c8805s;
                this.f20250f = 2;
                if (playlistDao.mo5210X0(list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                playlistRepositoryImpl = this.f20253i;
                str = c8805s.f46674b;
                i10 = c8805s.f46675c;
                z10 = c8805s.f46677e;
                i11 = this.f20254j + 1;
                i12 = this.f20255k;
                this.f20249e = null;
                this.f20250f = 3;
                if (PlaylistRepositoryImpl.m9542L(playlistRepositoryImpl, str, i10, z10, i11, i12, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i13 == 1) {
            c8805s = this.f20249e;
            C7499b.m14977z0(obj);
            playlistDao = playlistRepositoryImpl2.f20199c;
            this.f20249e = c8805s;
            this.f20250f = 2;
            if (playlistDao.mo5210X0(list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            playlistRepositoryImpl = this.f20253i;
            str = c8805s.f46674b;
            i10 = c8805s.f46675c;
            z10 = c8805s.f46677e;
            i11 = this.f20254j + 1;
            i12 = this.f20255k;
            this.f20249e = null;
            this.f20250f = 3;
            if (PlaylistRepositoryImpl.m9542L(playlistRepositoryImpl, str, i10, z10, i11, i12, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i13 == 2) {
            c8805s = this.f20249e;
            C7499b.m14977z0(obj);
            playlistRepositoryImpl = this.f20253i;
            str = c8805s.f46674b;
            i10 = c8805s.f46675c;
            z10 = c8805s.f46677e;
            i11 = this.f20254j + 1;
            i12 = this.f20255k;
            this.f20249e = null;
            this.f20250f = 3;
            if (PlaylistRepositoryImpl.m9542L(playlistRepositoryImpl, str, i10, z10, i11, i12, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
