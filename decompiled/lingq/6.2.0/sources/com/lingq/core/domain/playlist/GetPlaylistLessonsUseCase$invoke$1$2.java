package com.lingq.core.domain.playlist;

import com.google.android.gms.internal.vision.C1041z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.gm5;
import p000.il9;
import p000.jl9;
import p000.kl9;
import p000.l55;
import p000.rd7;
import p000.sd7;
import p000.td7;
import p000.te7;
import p000.ud7;
import p000.v91;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.playlist.GetPlaylistLessonsUseCase$invoke$1$2", m4291f = "GetPlaylistLessonsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetPlaylistLessonsUseCase$invoke$1$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Map f19921a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f19922b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ te7 f19923c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPlaylistLessonsUseCase$invoke$1$2(te7 te7Var, Continuation continuation) {
        super(3, continuation);
        this.f19923c = te7Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetPlaylistLessonsUseCase$invoke$1$2 getPlaylistLessonsUseCase$invoke$1$2 = new GetPlaylistLessonsUseCase$invoke$1$2(this.f19923c, (Continuation) obj3);
        getPlaylistLessonsUseCase$invoke$1$2.f19921a = (Map) obj;
        getPlaylistLessonsUseCase$invoke$1$2.f19922b = (Map) obj2;
        return getPlaylistLessonsUseCase$invoke$1$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        td7 rd7Var;
        Map map = this.f19921a;
        Map map2 = this.f19922b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        te7 te7Var = this.f19923c;
        te7Var.getClass();
        map.getClass();
        map2.getClass();
        ArrayList<kl9> arrayList = te7Var.f62195a;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        for (kl9 kl9Var : arrayList) {
            if (kl9Var instanceof jl9) {
                ud7 ud7Var = ((jl9) kl9Var).f45679a;
                rd7Var = new sd7(new l55(ud7Var, C1041z.m5823a(ud7Var.f63767a, ud7Var.f63779m, ud7Var.f63780n, map, map2)));
            } else {
                if (!(kl9Var instanceof il9)) {
                    gm5.m12750e();
                    return null;
                }
                il9 il9Var = (il9) kl9Var;
                ud7 ud7Var2 = il9Var.f44278a;
                List<ud7> list = il9Var.f44279b;
                ArrayList arrayList3 = new ArrayList(v91.m23189q0(list, 10));
                for (ud7 ud7Var3 : list) {
                    arrayList3.add(new l55(ud7Var3, C1041z.m5823a(ud7Var3.f63767a, ud7Var3.f63779m, ud7Var3.f63780n, map, map2)));
                }
                rd7Var = new rd7(ud7Var2, arrayList3);
            }
            arrayList2.add(rd7Var);
        }
        return arrayList2;
    }
}
