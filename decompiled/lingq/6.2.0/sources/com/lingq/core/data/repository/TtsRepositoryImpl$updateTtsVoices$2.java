package com.lingq.core.data.repository;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.network.api.result.ResultTtsVoice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.eh0;
import p000.kl4;
import p000.v91;
import p000.vi3;
import p000.vz1;
import p000.wca;
import p000.xfa;
import p000.zca;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl$updateTtsVoices$2", m4291f = "TtsRepositoryImpl.kt", m4292l = {DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsRepositoryImpl$updateTtsVoices$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1307w f16328b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f16329c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f16330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$updateTtsVoices$2(C1307w c1307w, List list, String str, Continuation continuation) {
        super(1, continuation);
        this.f16328b = c1307w;
        this.f16329c = list;
        this.f16330d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TtsRepositoryImpl$updateTtsVoices$2(this.f16328b, this.f16329c, this.f16330d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((TtsRepositoryImpl$updateTtsVoices$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        zca zcaVar = this.f16328b.f16564b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16327a;
        xfa xfaVar = xfa.f68157a;
        List list = this.f16329c;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        }
        AbstractC3193b.m15359b(obj);
        List list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(eh0.m11119P((ResultTtsVoice) it.next()));
        }
        this.f16327a = 1;
        if (zcaVar.mo4096w0(arrayList, this) != coroutineSingletons) {
        }
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
        int i3 = 0;
        for (Object obj2 : list3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                vz1.m23628e0();
                throw null;
            }
            arrayList2.add(new kl4(this.f16330d, i3, ((ResultTtsVoice) obj2).f21651a));
            i3 = i4;
        }
        this.f16327a = 2;
        Object objM2861d = AbstractC0758a.m2861d(new wca(zcaVar, arrayList2, i2), zcaVar.f71369K, this, false, true);
        if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objM2861d = xfaVar;
        }
        return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
