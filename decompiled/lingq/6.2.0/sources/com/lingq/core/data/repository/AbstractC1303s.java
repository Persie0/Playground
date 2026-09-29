package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.network.api.result.Results;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.aj3;
import p000.u91;

/* JADX INFO: renamed from: com.lingq.core.data.repository.s */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1303s {
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0063 -> B:21:0x0066). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    public static final Object m7367a(aj3 aj3Var, ContinuationImpl continuationImpl) {
        PlaylistRepositoryImplKt$fetchAllPlaylistLessonPages$1 playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1;
        List arrayList;
        aj3 aj3Var2;
        int i;
        Object objInvoke;
        aj3 aj3Var3;
        if (continuationImpl instanceof PlaylistRepositoryImplKt$fetchAllPlaylistLessonPages$1) {
            playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1 = (PlaylistRepositoryImplKt$fetchAllPlaylistLessonPages$1) continuationImpl;
            int i2 = playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16084e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16084e = i2 - Integer.MIN_VALUE;
            } else {
                playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1 = new PlaylistRepositoryImplKt$fetchAllPlaylistLessonPages$1(continuationImpl);
            }
        } else {
            playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1 = new PlaylistRepositoryImplKt$fetchAllPlaylistLessonPages$1(continuationImpl);
        }
        Object obj = playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16083d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16084e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            arrayList = new ArrayList();
            aj3Var2 = aj3Var;
            i = 1;
            if (i <= 20) {
                Integer num = new Integer(i);
                Integer num2 = new Integer(DescriptorProtos.Edition.EDITION_2023_VALUE);
                playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16080a = aj3Var2;
                playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16081b = arrayList;
                playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16082c = i;
                playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16084e = 1;
                objInvoke = aj3Var2.invoke(num, num2, playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aj3Var3 = aj3Var2;
                obj = objInvoke;
            }
            return null;
        }
        if (i3 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16082c;
        arrayList = playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16081b;
        aj3Var3 = playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16080a;
        AbstractC3193b.m15359b(obj);
        Results results = (Results) obj;
        List list = results.f21739d;
        if (list != null) {
            u91.m22630w0(list, arrayList);
            if (results.f21737b != null || list.isEmpty()) {
                return arrayList;
            }
            i++;
            aj3Var2 = aj3Var3;
            if (i <= 20) {
                Integer num3 = new Integer(i);
                Integer num4 = new Integer(DescriptorProtos.Edition.EDITION_2023_VALUE);
                playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16080a = aj3Var2;
                playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16081b = arrayList;
                playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16082c = i;
                playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1.f16084e = 1;
                objInvoke = aj3Var2.invoke(num3, num4, playlistRepositoryImplKt$fetchAllPlaylistLessonPages$1);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aj3Var3 = aj3Var2;
                obj = objInvoke;
                Results results2 = (Results) obj;
                List list2 = results2.f21739d;
                if (list2 != null) {
                    u91.m22630w0(list2, arrayList);
                    if (results2.f21737b != null) {
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }
}
