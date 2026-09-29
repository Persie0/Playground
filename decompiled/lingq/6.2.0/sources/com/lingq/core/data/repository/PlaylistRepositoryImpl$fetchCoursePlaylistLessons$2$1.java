package com.lingq.core.data.repository;

import com.lingq.core.database.dao.C1321i;
import com.lingq.core.network.api.result.ResultLibraryItem;
import com.lingq.core.network.api.result.Results;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.c32;
import p000.cp1;
import p000.u85;
import p000.v91;
import p000.vi3;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl$fetchCoursePlaylistLessons$2$1", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {821, 826}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistRepositoryImpl$fetchCoursePlaylistLessons$2$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public Object f15948a;

    /* JADX INFO: renamed from: b */
    public List f15949b;

    /* JADX INFO: renamed from: c */
    public List f15950c;

    /* JADX INFO: renamed from: d */
    public int f15951d;

    /* JADX INFO: renamed from: e */
    public int f15952e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Results f15953f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1302r f15954g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List f15955h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f15956i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$fetchCoursePlaylistLessons$2$1(Results results, C1302r c1302r, List list, int i, Continuation continuation) {
        super(1, continuation);
        this.f15953f = results;
        this.f15954g = c1302r;
        this.f15955h = list;
        this.f15956i = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistRepositoryImpl$fetchCoursePlaylistLessons$2$1(this.f15953f, this.f15954g, this.f15955h, this.f15956i, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistRepositoryImpl$fetchCoursePlaylistLessons$2$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00eb A[LOOP:0: B:36:0x00e5->B:38:0x00eb, LOOP_END] */
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
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1302r c1302r;
        List list;
        int i;
        List list2;
        List list3;
        List list4;
        ArrayList arrayList;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f15952e;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = this.f15951d;
                List list5 = this.f15950c;
                list = this.f15949b;
                c1302r = (C1302r) this.f15948a;
                AbstractC3193b.m15359b(obj);
                i = i3;
                list2 = list5;
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list6 = this.f15950c;
                List list7 = this.f15949b;
                list4 = (List) this.f15948a;
                AbstractC3193b.m15359b(obj);
                list3 = list6;
            }
            List list8 = list3;
            arrayList = new ArrayList(v91.m23189q0(list8, 10));
            it = list8.iterator();
            while (it.hasNext()) {
                AbstractC3393o1.m17749x(((u85) it.next()).f63562a, arrayList);
            }
            return Boolean.valueOf(list4.addAll(arrayList));
        }
        AbstractC3193b.m15359b(obj);
        List list9 = this.f15953f.f21739d;
        if (list9 == null) {
            return null;
        }
        List list10 = list9;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list10, 10));
        int i4 = 0;
        for (Object obj2 : list10) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                vz1.m23628e0();
                throw null;
            }
            arrayList2.add(AbstractC3352my.m17121g0((ResultLibraryItem) obj2, i4));
            i4 = i5;
        }
        c1302r = this.f15954g;
        C1321i c1321i = c1302r.f16536e;
        this.f15948a = c1302r;
        list = this.f15955h;
        this.f15949b = list;
        this.f15950c = arrayList2;
        i = this.f15956i;
        this.f15951d = i;
        this.f15952e = 1;
        Object objMo4096w0 = c1321i.mo4096w0(arrayList2, this);
        list2 = arrayList2;
        if (objMo4096w0 != coroutineSingletons) {
        }
        return coroutineSingletons;
        List list11 = list2;
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(list11, 10));
        int i6 = 0;
        for (Object obj3 : list11) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                vz1.m23628e0();
                throw null;
            }
            arrayList3.add(new cp1(i, ((u85) obj3).f63562a, i6));
            i6 = i7;
        }
        C1321i c1321i2 = c1302r.f16536e;
        this.f15948a = list;
        this.f15949b = null;
        this.f15950c = list2;
        this.f15951d = 0;
        this.f15952e = 2;
        if (c1321i2.m7509G0(arrayList3, this) != coroutineSingletons) {
            list3 = list2;
            list4 = list;
            List list12 = list3;
            arrayList = new ArrayList(v91.m23189q0(list12, 10));
            it = list12.iterator();
            while (it.hasNext()) {
                AbstractC3393o1.m17749x(((u85) it.next()).f63562a, arrayList);
            }
            return Boolean.valueOf(list4.addAll(arrayList));
        }
        return coroutineSingletons;
    }
}
