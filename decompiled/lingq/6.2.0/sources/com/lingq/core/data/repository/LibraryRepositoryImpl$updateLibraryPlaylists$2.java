package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.network.api.result.ResultPlaylistFolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.da5;
import p000.jd0;
import p000.k85;
import p000.u85;
import p000.v91;
import p000.vi3;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl$updateLibraryPlaylists$2", m4291f = "LibraryRepositoryImpl.kt", m4292l = {237, 240, 243}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryRepositoryImpl$updateLibraryPlaylists$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public List f15793a;

    /* JADX INFO: renamed from: b */
    public int f15794b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f15795c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1296l f15796d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f15797e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f15798f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f15799g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$updateLibraryPlaylists$2(List list, C1296l c1296l, int i, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f15795c = list;
        this.f15796d = c1296l;
        this.f15797e = i;
        this.f15798f = str;
        this.f15799g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LibraryRepositoryImpl$updateLibraryPlaylists$2(this.f15795c, this.f15796d, this.f15797e, this.f15798f, this.f15799g, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LibraryRepositoryImpl$updateLibraryPlaylists$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0108 A[PHI: r3
      0x0108: PHI (r3v7 java.util.List) = (r3v6 java.util.List), (r3v6 java.util.List), (r3v14 java.util.List) binds: [B:24:0x00ef, B:26:0x0105, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x011d A[LOOP:0: B:29:0x0117->B:31:0x011d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x014e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0152 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        ArrayList arrayList;
        Object objM2861d;
        C1321i c1321i = this.f15796d.f16514d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15794b;
        xfa xfaVar = xfa.f68157a;
        String str = this.f15798f;
        int i2 = this.f15797e;
        int i3 = 1;
        if (i != 0) {
            if (i == 1) {
                list = this.f15793a;
                AbstractC3193b.m15359b(obj);
            } else if (i == 2) {
                list = this.f15793a;
                AbstractC3193b.m15359b(obj);
                List<u85> list2 = list;
                arrayList = new ArrayList(v91.m23189q0(list2, 10));
                for (u85 u85Var : list2) {
                    arrayList.add(new da5(u85Var.f63562a, u85Var.f63566e, str, u85Var.f63563b, this.f15799g));
                }
                this.f15793a = null;
                this.f15794b = 3;
                objM2861d = AbstractC0758a.m2861d(new k85(c1321i, arrayList, i3), c1321i.f17034K, this, false, true);
                if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d = xfaVar;
                }
                if (objM2861d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list3 = this.f15793a;
                AbstractC3193b.m15359b(obj);
            }
            return xfaVar;
        }
        AbstractC3193b.m15359b(obj);
        List list4 = this.f15795c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list4, 10));
        int i4 = 0;
        for (Object obj2 : list4) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                vz1.m23628e0();
                throw null;
            }
            ResultPlaylistFolder resultPlaylistFolder = (ResultPlaylistFolder) obj2;
            resultPlaylistFolder.getClass();
            arrayList2.add(new u85(resultPlaylistFolder.f21460a, LibraryItemType.Folder.getValue(), resultPlaylistFolder.f21461b, null, ((i2 - 1) * 18) + i4, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, 0, 0, null, null, null, 0.0d, false, null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, null, false, -24, 131071));
            i4 = i5;
        }
        this.f15793a = arrayList2;
        this.f15794b = 1;
        if (c1321i.mo4096w0(arrayList2, this) != coroutineSingletons) {
            list = arrayList2;
        }
        return coroutineSingletons;
        if (i2 == 1) {
            this.f15793a = list;
            this.f15794b = 2;
            if (AbstractC0758a.m2861d(new jd0(str, 13), c1321i.f17034K, this, false, true) != coroutineSingletons) {
                List<u85> list5 = list;
                arrayList = new ArrayList(v91.m23189q0(list5, 10));
                while (r3.hasNext()) {
                    arrayList.add(new da5(u85Var.f63562a, u85Var.f63566e, str, u85Var.f63563b, this.f15799g));
                }
                this.f15793a = null;
                this.f15794b = 3;
                objM2861d = AbstractC0758a.m2861d(new k85(c1321i, arrayList, i3), c1321i.f17034K, this, false, true);
                if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d = xfaVar;
                }
                if (objM2861d == coroutineSingletons) {
                    return xfaVar;
                }
            }
        } else {
            List<u85> list6 = list;
            arrayList = new ArrayList(v91.m23189q0(list6, 10));
            while (r3.hasNext()) {
                arrayList.add(new da5(u85Var.f63562a, u85Var.f63566e, str, u85Var.f63563b, this.f15799g));
            }
            this.f15793a = null;
            this.f15794b = 3;
            objM2861d = AbstractC0758a.m2861d(new k85(c1321i, arrayList, i3), c1321i.f17034K, this, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfaVar;
            }
            if (objM2861d == coroutineSingletons) {
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }
}
