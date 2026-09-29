package com.lingq.shared.repository;

import bi.AbstractC1529t0;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LanguageContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl$updateUserLanguages$2$1", m19206f = "LanguageRepository.kt", m19207l = {156, 157}, m19208m = "invokeSuspend")
public final class LanguageRepositoryImpl$updateUserLanguages$2$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f19783e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageRepositoryImpl f19784f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<LanguageContext> f19785g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$updateUserLanguages$2$1(LanguageRepositoryImpl languageRepositoryImpl, List<LanguageContext> list, InterfaceC9968c<? super LanguageRepositoryImpl$updateUserLanguages$2$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f19784f = languageRepositoryImpl;
        this.f19785g = list;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageRepositoryImpl$updateUserLanguages$2$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageRepositoryImpl$updateUserLanguages$2$1(this.f19784f, this.f19785g, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f19783e;
        List<LanguageContext> list = this.f19785g;
        LanguageRepositoryImpl languageRepositoryImpl = this.f19784f;
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
        AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
        this.f19783e = 1;
        if (abstractC1529t0.mo599i0(list, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        AbstractC1529t0 abstractC1529t1 = languageRepositoryImpl.f19682b;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LanguageContext) it.next()).f16994a);
        }
        this.f19783e = 2;
        if (abstractC1529t1.mo5174k0(arrayList, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
