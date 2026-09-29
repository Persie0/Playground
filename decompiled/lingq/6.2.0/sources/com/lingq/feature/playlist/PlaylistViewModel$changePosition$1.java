package com.lingq.feature.playlist;

import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.playlist.Playlist;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.l70;
import p000.td7;
import p000.un1;
import p000.xd7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$changePosition$1", m4291f = "PlaylistViewModel.kt", m4292l = {928}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$changePosition$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27655a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27657c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f27658d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f27659e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$changePosition$1(C2255e c2255e, int i, int i2, int i3, Continuation continuation) {
        super(2, continuation);
        this.f27656b = c2255e;
        this.f27657c = i;
        this.f27658d = i2;
        this.f27659e = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$changePosition$1(this.f27656b, this.f27657c, this.f27658d, this.f27659e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$changePosition$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

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
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27655a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27656b;
            C3244l c3244l = c2255e.f27807B;
            List list = (List) c3244l.getValue();
            list.getClass();
            int i2 = this.f27657c;
            if (i2 >= 0) {
                List list2 = list;
                if (i2 < list2.size()) {
                    obj2 = list;
                    obj2 = list;
                    ArrayList arrayList = new ArrayList(list2);
                    arrayList.add(l70.m15945h(this.f27658d, 0, arrayList.size()), (td7) arrayList.remove(i2));
                    obj2 = arrayList;
                }
            }
            obj2 = list;
            obj2 = list;
            obj2 = list;
            c3244l.m15572j(null, obj2);
            Playlist playlist = (Playlist) c2255e.f27809D.getValue();
            if (playlist != null) {
                xd7 xd7Var = c2255e.f27837n;
                String str = playlist.f19554b;
                String str2 = playlist.f19553a;
                int i3 = playlist.f19556d;
                this.f27655a = 1;
                if (((C1302r) xd7Var).m7346f(this.f27657c, this.f27658d, i3, this.f27659e, str, str2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
