package com.lingq.feature.playlist;

import com.lingq.core.player.data.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.hc7;
import p000.l55;
import p000.q2c;
import p000.tb7;
import p000.td7;
import p000.to1;
import p000.ud7;
import p000.uo1;
import p000.vo1;
import p000.xfa;
import p000.y25;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$special$$inlined$combine$1$3", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {234}, m4293m = "invokeSuspend", m4294v = 2)
public final class CollectionPlaylistViewModel$special$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f27578a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f27579b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f27580c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2251a f27581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPlaylistViewModel$special$$inlined$combine$1$3(C2251a c2251a, Continuation continuation) {
        super(3, continuation);
        this.f27581d = c2251a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CollectionPlaylistViewModel$special$$inlined$combine$1$3 collectionPlaylistViewModel$special$$inlined$combine$1$3 = new CollectionPlaylistViewModel$special$$inlined$combine$1$3(this.f27581d, (Continuation) obj3);
        collectionPlaylistViewModel$special$$inlined$combine$1$3.f27579b = (e83) obj;
        collectionPlaylistViewModel$special$$inlined$combine$1$3.f27580c = (Object[]) obj2;
        return collectionPlaylistViewModel$special$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x0164  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Triple triple;
        Pair pair;
        Object vo1Var;
        String str;
        Object next;
        String str2;
        e83 e83Var = this.f27579b;
        Object[] objArr = this.f27580c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27578a;
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
            int iIntValue = ((Integer) obj5).intValue();
            Object obj6 = objArr[3];
            obj6.getClass();
            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
            Object obj7 = objArr[4];
            Triple triple2 = obj7 instanceof Triple ? (Triple) obj7 : null;
            if (triple2 == null) {
                triple = null;
            } else {
                Object obj8 = triple2.f47633a;
                if (!(obj8 instanceof Integer)) {
                    obj8 = null;
                }
                Integer num = (Integer) obj8;
                if (num == null) {
                    triple = null;
                } else {
                    Object obj9 = triple2.f47634b;
                    if (!(obj9 instanceof Integer)) {
                        obj9 = null;
                    }
                    Integer num2 = (Integer) obj9;
                    if (num2 == null) {
                        triple = null;
                    } else {
                        Object obj10 = triple2.f47635c;
                        if (!(obj10 instanceof Integer)) {
                            obj10 = null;
                        }
                        Integer num3 = (Integer) obj10;
                        if (num3 == null) {
                            triple = null;
                        } else {
                            triple = new Triple(num, num2, num3);
                        }
                    }
                }
            }
            Object obj11 = objArr[5];
            Pair pair2 = obj11 instanceof Pair ? (Pair) obj11 : null;
            if (pair2 == null) {
                pair = null;
            } else {
                Object obj12 = pair2.f47623a;
                if (!(obj12 instanceof Integer)) {
                    obj12 = null;
                }
                Integer num4 = (Integer) obj12;
                if (num4 == null) {
                    pair = null;
                } else {
                    Object obj13 = pair2.f47624b;
                    if (!(obj13 instanceof Integer)) {
                        obj13 = null;
                    }
                    Integer num5 = (Integer) obj13;
                    if (num5 == null) {
                        pair = null;
                    } else {
                        pair = new Pair(num4, num5);
                    }
                }
            }
            Object obj14 = objArr[6];
            obj14.getClass();
            boolean zBooleanValue3 = ((Boolean) obj14).booleanValue();
            Object obj15 = objArr[7];
            obj15.getClass();
            hc7 hc7Var = (hc7) obj15;
            Object obj16 = objArr[8];
            obj16.getClass();
            y25 y25Var = (y25) obj16;
            if (zBooleanValue && list.isEmpty()) {
                vo1Var = to1.f62630a;
            } else if (list.isEmpty()) {
                vo1Var = uo1.f64126a;
            } else {
                C2251a c2251a = this.f27581d;
                boolean zM8444G = c2251a.f27784m.m8444G();
                tb7 tb7Var = hc7Var.f42182j;
                if (tb7Var != null) {
                    int i2 = tb7Var.f62101a;
                    Iterator it = q2c.m19624a((List) c2251a.f27786o.getValue()).iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((l55) next).f49081a.f63767a != i2);
                    l55 l55Var = (l55) next;
                    ud7 ud7Var = l55Var != null ? l55Var.f49081a : null;
                    if ((ud7Var != null ? ud7Var.f63779m : null) != null) {
                        str2 = null;
                    } else if ((ud7Var != null ? ud7Var.f63780n : null) != null) {
                        str2 = ud7Var.f63780n;
                    } else {
                        str2 = null;
                    }
                    str = str2;
                } else {
                    str = null;
                }
                vo1Var = new vo1(zM8444G, iIntValue, zBooleanValue3, zBooleanValue2, str, hc7Var.f42174b == PlayerState.Playing, c2251a.f27773b.mo4589b2(), triple, pair, hc7Var, list, y25Var);
            }
            this.f27579b = null;
            this.f27580c = null;
            this.f27578a = 1;
            if (e83Var.emit(vo1Var, this) == coroutineSingletons) {
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
