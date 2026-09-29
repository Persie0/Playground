package com.lingq.shared.repository;

import ae.C0062b;
import bi.AbstractC1454i2;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LibraryData;
import com.lingq.shared.network.result.ResultLibraryItem;
import com.lingq.shared.network.result.Results;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p367rh.C8793g;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1", m19206f = "PlaylistRepository.kt", m19207l = {911, 916}, m19208m = "invokeSuspend")
final class PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public PlaylistRepositoryImpl f20290e;

    /* JADX INFO: renamed from: f */
    public ArrayList f20291f;

    /* JADX INFO: renamed from: g */
    public int f20292g;

    /* JADX INFO: renamed from: h */
    public int f20293h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Results<ResultLibraryItem> f20294i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ PlaylistRepositoryImpl f20295j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f20296k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1(Results<ResultLibraryItem> results, PlaylistRepositoryImpl playlistRepositoryImpl, int i10, InterfaceC9968c<? super PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f20294i = results;
        this.f20295j = playlistRepositoryImpl;
        this.f20296k = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistRepositoryImpl$networkCoursePlaylistLessons$2$1(this.f20294i, this.f20295j, this.f20296k, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        PlaylistRepositoryImpl playlistRepositoryImpl;
        ArrayList arrayList;
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f20293h;
        C9072e c9072e = null;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = this.f20292g;
                arrayList = this.f20291f;
                playlistRepositoryImpl = this.f20290e;
                C7499b.m14977z0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            c9072e = C9072e.f47360a;
            return c9072e;
        }
        C7499b.m14977z0(obj);
        List<? extends ResultLibraryItem> list = this.f20294i.f19136d;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(C0062b.m294O((ResultLibraryItem) it.next()));
            }
            playlistRepositoryImpl = this.f20295j;
            AbstractC1454i2 abstractC1454i2 = playlistRepositoryImpl.f20202f;
            this.f20290e = playlistRepositoryImpl;
            this.f20291f = arrayList2;
            int i12 = this.f20296k;
            this.f20292g = i12;
            this.f20293h = 1;
            if (abstractC1454i2.mo599i0(arrayList2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            arrayList = arrayList2;
            i10 = i12;
        }
        return c9072e;
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList, 10));
        int i13 = 0;
        for (Object obj2 : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C9000b.m17257w();
                throw null;
            }
            arrayList3.add(new C8793g(i10, ((LibraryData) obj2).f17238a, i13));
            i13 = i14;
        }
        AbstractC1454i2 abstractC1454i3 = playlistRepositoryImpl.f20202f;
        this.f20290e = null;
        this.f20291f = null;
        this.f20293h = 2;
        if (abstractC1454i3.mo5056G0(arrayList3, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        c9072e = C9072e.f47360a;
        return c9072e;
    }
}
