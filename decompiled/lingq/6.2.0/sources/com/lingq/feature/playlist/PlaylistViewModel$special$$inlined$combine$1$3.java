package com.lingq.feature.playlist;

import com.lingq.core.player.data.PlayerState;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3473pu;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.hc7;
import p000.tb7;
import p000.td7;
import p000.ud7;
import p000.we7;
import p000.xe7;
import p000.xfa;
import p000.y25;
import p000.ye7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$special$$inlined$combine$1$3", m4291f = "PlaylistViewModel.kt", m4292l = {234}, m4293m = "invokeSuspend", m4294v = 2)
public final class PlaylistViewModel$special$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f27767a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f27768b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f27769c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2255e f27770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$special$$inlined$combine$1$3(C2255e c2255e, Continuation continuation) {
        super(3, continuation);
        this.f27770d = c2255e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlaylistViewModel$special$$inlined$combine$1$3 playlistViewModel$special$$inlined$combine$1$3 = new PlaylistViewModel$special$$inlined$combine$1$3(this.f27770d, (Continuation) obj3);
        playlistViewModel$special$$inlined$combine$1$3.f27768b = (e83) obj;
        playlistViewModel$special$$inlined$combine$1$3.f27769c = (Object[]) obj2;
        return playlistViewModel$special$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x0173  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Triple triple;
        Pair pair;
        Object ye7Var;
        String str;
        String str2;
        e83 e83Var = this.f27768b;
        Object[] objArr = this.f27769c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27767a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Object obj2 = objArr[0];
            List list2 = obj2 instanceof List ? (List) obj2 : null;
            if (list2 == null) {
                list = EmptyList.f47638a;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (!(obj3 instanceof td7)) {
                        obj3 = null;
                    }
                    td7 td7Var = (td7) obj3;
                    if (td7Var != null) {
                        arrayList.add(td7Var);
                    }
                }
                list = arrayList;
            }
            Object obj4 = objArr[1];
            obj4.getClass();
            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
            Object obj5 = objArr[2];
            obj5.getClass();
            boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
            Object obj6 = objArr[3];
            obj6.getClass();
            boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
            Object obj7 = objArr[4];
            obj7.getClass();
            int iIntValue = ((Integer) obj7).intValue();
            Object obj8 = objArr[5];
            obj8.getClass();
            boolean zBooleanValue4 = ((Boolean) obj8).booleanValue();
            Object obj9 = objArr[6];
            Triple triple2 = obj9 instanceof Triple ? (Triple) obj9 : null;
            if (triple2 == null) {
                triple = null;
            } else {
                Object obj10 = triple2.f47633a;
                if (!(obj10 instanceof Integer)) {
                    obj10 = null;
                }
                Integer num = (Integer) obj10;
                if (num == null) {
                    triple = null;
                } else {
                    Object obj11 = triple2.f47634b;
                    if (!(obj11 instanceof Integer)) {
                        obj11 = null;
                    }
                    Integer num2 = (Integer) obj11;
                    if (num2 == null) {
                        triple = null;
                    } else {
                        Object obj12 = triple2.f47635c;
                        if (!(obj12 instanceof Integer)) {
                            obj12 = null;
                        }
                        Integer num3 = (Integer) obj12;
                        if (num3 == null) {
                            triple = null;
                        } else {
                            triple = new Triple(num, num2, num3);
                        }
                    }
                }
            }
            Object obj13 = objArr[7];
            Pair pair2 = obj13 instanceof Pair ? (Pair) obj13 : null;
            if (pair2 == null) {
                pair = null;
            } else {
                Object obj14 = pair2.f47623a;
                if (!(obj14 instanceof Integer)) {
                    obj14 = null;
                }
                Integer num4 = (Integer) obj14;
                if (num4 == null) {
                    pair = null;
                } else {
                    Object obj15 = pair2.f47624b;
                    if (!(obj15 instanceof Integer)) {
                        obj15 = null;
                    }
                    Integer num5 = (Integer) obj15;
                    if (num5 == null) {
                        pair = null;
                    } else {
                        pair = new Pair(num4, num5);
                    }
                }
            }
            Object obj16 = objArr[8];
            obj16.getClass();
            boolean zBooleanValue5 = ((Boolean) obj16).booleanValue();
            Object obj17 = objArr[9];
            obj17.getClass();
            hc7 hc7Var = (hc7) obj17;
            Object obj18 = objArr[10];
            obj18.getClass();
            y25 y25Var = (y25) obj18;
            Object obj19 = objArr[11];
            obj19.getClass();
            C3473pu c3473pu = (C3473pu) obj19;
            if (zBooleanValue && list.isEmpty()) {
                ye7Var = new we7(c3473pu.f56790a, c3473pu.f56792c, c3473pu.f56791b);
            } else if (list.isEmpty()) {
                ye7Var = xe7.f68130a;
            } else {
                C2255e c2255e = this.f27770d;
                boolean zM8444G = c2255e.f27845v.m8444G();
                boolean zBooleanValue6 = ((Boolean) c2255e.f27806A.getValue()).booleanValue();
                tb7 tb7Var = hc7Var.f42182j;
                if (tb7Var != null) {
                    ud7 ud7VarM9234V2 = C2255e.m9234V2(c2255e, tb7Var.f62101a);
                    if ((ud7VarM9234V2 != null ? ud7VarM9234V2.f63779m : null) != null) {
                        str2 = null;
                    } else if ((ud7VarM9234V2 != null ? ud7VarM9234V2.f63780n : null) != null) {
                        str2 = ud7VarM9234V2.f63780n;
                    } else {
                        str2 = null;
                    }
                    str = str2;
                } else {
                    str = null;
                }
                ye7Var = new ye7(zM8444G, zBooleanValue2, zBooleanValue6, zBooleanValue3, iIntValue, zBooleanValue4, zBooleanValue5, str, hc7Var.f42174b == PlayerState.Playing, c2255e.f27825b.mo4589b2(), triple, pair, hc7Var, list, y25Var, c3473pu.f56790a, c3473pu.f56792c, c3473pu.f56791b);
            }
            this.f27768b = null;
            this.f27769c = null;
            this.f27767a = 1;
            if (e83Var.emit(ye7Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
