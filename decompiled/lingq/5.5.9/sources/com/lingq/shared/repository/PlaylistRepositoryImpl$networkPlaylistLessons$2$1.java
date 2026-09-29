package com.lingq.shared.repository;

import bi.AbstractC1454i2;
import bi.AbstractC1495o1;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LibraryData;
import com.lingq.shared.network.result.ResultPlaylist;
import com.lingq.shared.persistent.dao.PlaylistDao;
import com.lingq.shared.uimodel.library.LibraryItemType;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p003a2.C0009a;
import p260m8.C7499b;
import p367rh.C8801o;
import p367rh.C8805s;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.PlaylistRepositoryImpl$networkPlaylistLessons$2$1", m19206f = "PlaylistRepository.kt", m19207l = {604, 605, 606, 608, 613}, m19208m = "invokeSuspend")
final class PlaylistRepositoryImpl$networkPlaylistLessons$2$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public List f20304e;

    /* JADX INFO: renamed from: f */
    public ArrayList f20305f;

    /* JADX INFO: renamed from: g */
    public int f20306g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List<ResultPlaylist> f20307h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f20308i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f20309j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f20310k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ PlaylistRepositoryImpl f20311l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$networkPlaylistLessons$2$1(List<ResultPlaylist> list, String str, String str2, int i10, PlaylistRepositoryImpl playlistRepositoryImpl, InterfaceC9968c<? super PlaylistRepositoryImpl$networkPlaylistLessons$2$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f20307h = list;
        this.f20308i = str;
        this.f20309j = str2;
        this.f20310k = i10;
        this.f20311l = playlistRepositoryImpl;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((PlaylistRepositoryImpl$networkPlaylistLessons$2$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new PlaylistRepositoryImpl$networkPlaylistLessons$2$1(this.f20307h, this.f20308i, this.f20309j, this.f20310k, this.f20311l, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x01bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x01d5 A[LOOP:1: B:36:0x01cf->B:38:0x01d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x01ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0214 A[LOOP:0: B:51:0x020e->B:53:0x0214, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0229 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        boolean z10;
        List<C8805s> list;
        List<C8801o> list2;
        List list3;
        PlaylistDao playlistDao;
        ArrayList arrayList;
        Iterator<T> it;
        Object objMo5190D0;
        List list4;
        boolean z11;
        PlaylistDao playlistDao2;
        ArrayList arrayList2;
        Iterator it2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f20306g;
        String str = this.f20309j;
        String str2 = this.f20308i;
        List<ResultPlaylist> list5 = this.f20307h;
        PlaylistRepositoryImpl playlistRepositoryImpl = this.f20311l;
        if (i10 != 0) {
            if (i10 == 1) {
                list = this.f20305f;
                List<C8801o> list6 = this.f20304e;
                C7499b.m14977z0(obj);
                z10 = true;
                list2 = list6;
            } else if (i10 == 2) {
                list = this.f20304e;
                C7499b.m14977z0(obj);
                list3 = null;
                z10 = true;
                playlistDao = playlistRepositoryImpl.f20199c;
                this.f20304e = list3;
                this.f20306g = 3;
                if (playlistDao.mo5206T0(list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                PlaylistDao playlistDao3 = playlistRepositoryImpl.f20199c;
                arrayList = new ArrayList(C9325m.m17681z(list5, 10));
                it = list5.iterator();
                while (it.hasNext()) {
                    C0009a.m30s(((ResultPlaylist) it.next()).f18847a, arrayList);
                }
                this.f20306g = 4;
                objMo5190D0 = playlistDao3.mo5190D0(str2, arrayList, str, this);
                if (objMo5190D0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list4 = (List) objMo5190D0;
                if (list4 != null) {
                    z11 = z10;
                } else {
                    z11 = z10;
                }
                if (!z11) {
                    playlistDao2 = playlistRepositoryImpl.f20199c;
                    arrayList2 = new ArrayList(C9325m.m17681z(list4, 10));
                    it2 = list4.iterator();
                    while (it2.hasNext()) {
                        C0009a.m30s(((C8805s) it2.next()).f46675c, arrayList2);
                    }
                    this.f20306g = 5;
                    if (playlistDao2.mo5217o0(str2, arrayList2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i10 == 3) {
                C7499b.m14977z0(obj);
                z10 = true;
                PlaylistDao playlistDao4 = playlistRepositoryImpl.f20199c;
                arrayList = new ArrayList(C9325m.m17681z(list5, 10));
                it = list5.iterator();
                while (it.hasNext()) {
                    C0009a.m30s(((ResultPlaylist) it.next()).f18847a, arrayList);
                }
                this.f20306g = 4;
                objMo5190D0 = playlistDao4.mo5190D0(str2, arrayList, str, this);
                if (objMo5190D0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list4 = (List) objMo5190D0;
                if (list4 != null) {
                    z11 = z10;
                } else {
                    z11 = z10;
                }
                if (!z11) {
                    playlistDao2 = playlistRepositoryImpl.f20199c;
                    arrayList2 = new ArrayList(C9325m.m17681z(list4, 10));
                    it2 = list4.iterator();
                    while (it2.hasNext()) {
                        C0009a.m30s(((C8805s) it2.next()).f46675c, arrayList2);
                    }
                    this.f20306g = 5;
                    if (playlistDao2.mo5217o0(str2, arrayList2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i10 == 4) {
                C7499b.m14977z0(obj);
                objMo5190D0 = obj;
                z10 = true;
                list4 = (List) objMo5190D0;
                if (list4 != null || list4.isEmpty()) {
                    z11 = z10;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    playlistDao2 = playlistRepositoryImpl.f20199c;
                    arrayList2 = new ArrayList(C9325m.m17681z(list4, 10));
                    it2 = list4.iterator();
                    while (it2.hasNext()) {
                        C0009a.m30s(((C8805s) it2.next()).f46675c, arrayList2);
                    }
                    this.f20306g = 5;
                    if (playlistDao2.mo5217o0(str2, arrayList2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator<ResultPlaylist> it3 = list5.iterator();
        int i11 = 0;
        while (it3.hasNext()) {
            int i12 = i11 + 1;
            ResultPlaylist next = it3.next();
            if (C5207g.m11106a(next.f18874n0, LibraryItemType.Collection.getValue())) {
                arrayList5.add(new C8805s(next.f18847a, new Integer(i11), this.f20308i, this.f20309j, true));
            } else {
                int i13 = next.f18847a;
                String str3 = next.f18853d;
                String str4 = next.f18855e;
                int i14 = next.f18851c;
                String str5 = next.f18849b;
                String str6 = next.f18859g;
                String str7 = next.f18846Z;
                String str8 = next.f18848a0;
                String str9 = next.f18854d0;
                String str10 = next.f18844X;
                String str11 = next.f18866j0;
                int i15 = next.f18829I;
                int i16 = next.f18833M;
                int i17 = next.f18830J;
                int i18 = next.f18877q;
                String str12 = next.f18852c0;
                List<String> list7 = next.f18868k0;
                String str13 = next.f18865j;
                arrayList3.add(new LibraryData(i13, next.f18874n0, str3, str4, i14, str5, null, str6, null, str10, null, str7, str8, next.f18850b0, str12, str9, next.f18856e0, str11, i15, 0, null, i16, i17, i18, Integer.valueOf(next.f18863i), Integer.valueOf(next.f18880t), next.f18881u, 0.0d, false, list7, str13, null, null, null, null, null, next.f18861h, next.f18827G, 0.0d, false, false, next.f18839S, -1743256256, 463, null));
                arrayList4.add(new C8801o(str, this.f20310k, next.f18847a));
                arrayList5.add(new C8805s(next.f18847a, new Integer(i11), this.f20308i, this.f20309j, false));
            }
            it3 = it3;
            i11 = i12;
        }
        AbstractC1454i2 abstractC1454i2 = playlistRepositoryImpl.f20202f;
        this.f20304e = arrayList4;
        this.f20305f = arrayList5;
        z10 = true;
        this.f20306g = 1;
        if (abstractC1454i2.mo599i0(arrayList3, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        list = arrayList5;
        list2 = arrayList4;
        AbstractC1495o1 abstractC1495o1 = playlistRepositoryImpl.f20198b;
        this.f20304e = list;
        this.f20305f = null;
        this.f20306g = 2;
        if (abstractC1495o1.mo5137J0(list2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        list3 = null;
        playlistDao = playlistRepositoryImpl.f20199c;
        this.f20304e = list3;
        this.f20306g = 3;
        if (playlistDao.mo5206T0(list, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        PlaylistDao playlistDao5 = playlistRepositoryImpl.f20199c;
        arrayList = new ArrayList(C9325m.m17681z(list5, 10));
        it = list5.iterator();
        while (it.hasNext()) {
            C0009a.m30s(((ResultPlaylist) it.next()).f18847a, arrayList);
        }
        this.f20306g = 4;
        objMo5190D0 = playlistDao5.mo5190D0(str2, arrayList, str, this);
        if (objMo5190D0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        list4 = (List) objMo5190D0;
        if (list4 != null) {
            z11 = z10;
        } else {
            z11 = z10;
        }
        if (!z11) {
            playlistDao2 = playlistRepositoryImpl.f20199c;
            arrayList2 = new ArrayList(C9325m.m17681z(list4, 10));
            it2 = list4.iterator();
            while (it2.hasNext()) {
                C0009a.m30s(((C8805s) it2.next()).f46675c, arrayList2);
            }
            this.f20306g = 5;
            if (playlistDao2.mo5217o0(str2, arrayList2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
