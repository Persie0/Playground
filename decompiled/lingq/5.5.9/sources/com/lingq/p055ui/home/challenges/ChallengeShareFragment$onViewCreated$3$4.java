package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.C0204c;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeShareFragment$onViewCreated$3$4", m19206f = "ChallengeShareFragment.kt", m19207l = {110}, m19208m = "invokeSuspend")
public final class ChallengeShareFragment$onViewCreated$3$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23010e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengeShareFragment f23011f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengeShareFragment$onViewCreated$3$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "url", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengeShareFragment$onViewCreated$3$4$1", m19206f = "ChallengeShareFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35091 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23012e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengeShareFragment f23013f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35091(ChallengeShareFragment challengeShareFragment, InterfaceC9968c<? super C35091> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23013f = challengeShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35091 c35091 = new C35091(this.f23013f, interfaceC9968c);
            c35091.f23012e = obj;
            return c35091;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35091) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            ChallengeShareFragment challengeShareFragment = this.f23013f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f23012e;
            try {
                Intent intent = new Intent();
                intent.setPackage("com.facebook.katana");
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", str);
                challengeShareFragment.m3595l0(intent);
            } catch (Exception unused) {
                challengeShareFragment.m3595l0(new Intent("android.intent.action.VIEW", Uri.parse(C0204c.m852k("https://www.facebook.com/sharer/sharer.php?u=", str))));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeShareFragment$onViewCreated$3$4(ChallengeShareFragment challengeShareFragment, InterfaceC9968c<? super ChallengeShareFragment$onViewCreated$3$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23011f = challengeShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengeShareFragment$onViewCreated$3$4(this.f23011f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengeShareFragment$onViewCreated$3$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23010e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ChallengeShareFragment.f22987T0;
            ChallengeShareFragment challengeShareFragment = this.f23011f;
            ChallengeShareViewModel challengeShareViewModelM9790u0 = challengeShareFragment.m9790u0();
            C35091 c35091 = new C35091(challengeShareFragment, null);
            this.f23010e = 1;
            if (C0062b.m369m0(challengeShareViewModelM9790u0.f23035j, c35091, this) == coroutineSingletons) {
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
