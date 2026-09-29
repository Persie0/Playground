package com.lingq.shared.repository;

import bi.AbstractC1485m5;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.TtsVoice;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p367rh.C8795i;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.TtsRepositoryImpl$updateTtsVoices$2", m19206f = "TtsRepository.kt", m19207l = {70, 71}, m19208m = "invokeSuspend")
public final class TtsRepositoryImpl$updateTtsVoices$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f20613e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TtsRepositoryImpl f20614f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<TtsVoice> f20615g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f20616h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$updateTtsVoices$2(TtsRepositoryImpl ttsRepositoryImpl, List<TtsVoice> list, String str, InterfaceC9968c<? super TtsRepositoryImpl$updateTtsVoices$2> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f20614f = ttsRepositoryImpl;
        this.f20615g = list;
        this.f20616h = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TtsRepositoryImpl$updateTtsVoices$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new TtsRepositoryImpl$updateTtsVoices$2(this.f20614f, this.f20615g, this.f20616h, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f20613e;
        List<TtsVoice> list = this.f20615g;
        TtsRepositoryImpl ttsRepositoryImpl = this.f20614f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        AbstractC1485m5 abstractC1485m5 = ttsRepositoryImpl.f20565b;
        this.f20613e = 1;
        if (abstractC1485m5.mo599i0(list, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        AbstractC1485m5 abstractC1485m6 = ttsRepositoryImpl.f20565b;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        int i11 = 0;
        for (Object obj2 : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C9000b.m17257w();
                throw null;
            }
            arrayList.add(new C8795i(this.f20616h, i11, ((TtsVoice) obj2).f17566a));
            i11 = i12;
        }
        this.f20613e = 2;
        if (abstractC1485m6.mo5106p0(arrayList, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
