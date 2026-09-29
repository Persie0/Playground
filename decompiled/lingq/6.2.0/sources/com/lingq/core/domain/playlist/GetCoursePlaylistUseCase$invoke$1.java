package com.lingq.core.domain.playlist;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0790ay;
import p000.C2907cy;
import p000.C2944dy;
import p000.C2981ey;
import p000.C3018fy;
import p000.InterfaceC3055gy;
import p000.bj3;
import p000.c32;
import p000.gm5;
import p000.l55;
import p000.sd7;
import p000.ud7;
import p000.v91;
import p000.vd7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.playlist.GetCoursePlaylistUseCase$invoke$1", m4291f = "GetCoursePlaylistUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetCoursePlaylistUseCase$invoke$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f19909a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Map f19910b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f19911c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        GetCoursePlaylistUseCase$invoke$1 getCoursePlaylistUseCase$invoke$1 = new GetCoursePlaylistUseCase$invoke$1(4, (Continuation) obj4);
        getCoursePlaylistUseCase$invoke$1.f19909a = (List) obj;
        getCoursePlaylistUseCase$invoke$1.f19910b = (Map) obj2;
        getCoursePlaylistUseCase$invoke$1.f19911c = (List) obj3;
        return getCoursePlaylistUseCase$invoke$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        vd7 vd7Var;
        List list = this.f19909a;
        Map map = this.f19910b;
        List list2 = this.f19911c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List<ud7> list3 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list3, 10));
        for (ud7 ud7Var : list3) {
            Double d = ud7Var.f63786t;
            ud7 ud7VarM22692a = ud7.m22692a(ud7Var, new Double((d == null && (d = ud7Var.f63777k) == null) ? 0.0d : d.doubleValue()), ud7Var.f63778l * DescriptorProtos.Edition.EDITION_2023_VALUE, false, 16774143);
            int i = ud7Var.f63767a;
            String str = ud7Var.f63779m;
            String str2 = ud7Var.f63780n;
            map.getClass();
            list2.getClass();
            if (str != null || str2 == null) {
                InterfaceC3055gy interfaceC3055gy = (InterfaceC3055gy) map.get(Integer.valueOf(i));
                Object obj2 = null;
                vd7Var = null;
                if (interfaceC3055gy == null) {
                    for (Object obj3 : list2) {
                        vd7 vd7Var2 = (vd7) obj3;
                        if (vd7Var2 != null && vd7Var2.f65236a == i) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    vd7Var = (vd7) obj2;
                } else if (interfaceC3055gy instanceof C2907cy) {
                    vd7Var = new vd7("downloading", i, ((C2907cy) interfaceC3055gy).f34700c, 48, false, (String) null);
                } else if (interfaceC3055gy instanceof C2981ey) {
                    vd7Var = new vd7("generating", i, 0, 48, false, (String) null);
                } else if (interfaceC3055gy instanceof C0790ay) {
                    vd7Var = new vd7("completed", i, 100, 48, true, (String) null);
                } else if (interfaceC3055gy instanceof C2944dy) {
                    vd7Var = new vd7("error", i, 0, 32, false, ((C2944dy) interfaceC3055gy).f36412c.name());
                } else if (!(interfaceC3055gy instanceof C3018fy)) {
                    gm5.m12750e();
                    return null;
                }
            } else {
                vd7Var = new vd7("completed", i, 100, 48, true, (String) null);
            }
            arrayList.add(new sd7(new l55(ud7VarM22692a, vd7Var)));
        }
        return arrayList;
    }
}
