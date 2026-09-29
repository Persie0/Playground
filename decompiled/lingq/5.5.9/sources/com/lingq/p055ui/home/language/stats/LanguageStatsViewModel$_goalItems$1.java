package com.lingq.p055ui.home.language.stats;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import dk.C5196a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p278nh.AbstractC7791r;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lnh/r$g;", "Lkotlin/Triple;", "", "Ldk/a;", "", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$_goalItems$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {143}, m19208m = "invokeSuspend")
final class LanguageStatsViewModel$_goalItems$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super AbstractC7791r.g>, Triple<? extends List<? extends C5196a>, ? extends Integer, ? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24322e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f24323f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Triple f24324g;

    public LanguageStatsViewModel$_goalItems$1(InterfaceC9968c<? super LanguageStatsViewModel$_goalItems$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super AbstractC7791r.g> interfaceC7117d, Triple<? extends List<? extends C5196a>, ? extends Integer, ? extends Boolean> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LanguageStatsViewModel$_goalItems$1 languageStatsViewModel$_goalItems$1 = new LanguageStatsViewModel$_goalItems$1(interfaceC9968c);
        languageStatsViewModel$_goalItems$1.f24323f = interfaceC7117d;
        languageStatsViewModel$_goalItems$1.f24324g = triple;
        return languageStatsViewModel$_goalItems$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24322e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f24323f;
            Triple triple = this.f24324g;
            AbstractC7791r.g gVar = new AbstractC7791r.g(((Number) triple.f38022b).intValue(), (List) triple.f38021a, ((Boolean) triple.f38023c).booleanValue());
            this.f24323f = null;
            this.f24322e = 1;
            if (interfaceC7117d.mo1339r(gVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
