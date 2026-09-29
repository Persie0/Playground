package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageFragment$onViewCreated$2$1", m19206f = "SentenceEditPageFragment.kt", m19207l = {102}, m19208m = "invokeSuspend")
public final class SentenceEditPageFragment$onViewCreated$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28002e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SentenceEditPageFragment f28003f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageFragment$onViewCreated$2$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/lesson/edit/SentenceEditPageAdapter$a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageFragment$onViewCreated$2$1$1", m19206f = "SentenceEditPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42981 extends SuspendLambda implements InterfaceC2056p<List<? extends SentenceEditPageAdapter.AbstractC4290a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28004e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SentenceEditPageFragment f28005f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42981(SentenceEditPageFragment sentenceEditPageFragment, InterfaceC9968c<? super C42981> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28005f = sentenceEditPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42981 c42981 = new C42981(this.f28005f, interfaceC9968c);
            c42981.f28004e = obj;
            return c42981;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends SentenceEditPageAdapter.AbstractC4290a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42981) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f28004e;
            SentenceEditPageAdapter sentenceEditPageAdapter = this.f28005f.f27990C0;
            if (sentenceEditPageAdapter != null) {
                sentenceEditPageAdapter.m4529q(list);
                return C9072e.f47360a;
            }
            C5207g.m11117l("adapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceEditPageFragment$onViewCreated$2$1(SentenceEditPageFragment sentenceEditPageFragment, InterfaceC9968c<? super SentenceEditPageFragment$onViewCreated$2$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28003f = sentenceEditPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SentenceEditPageFragment$onViewCreated$2$1(this.f28003f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SentenceEditPageFragment$onViewCreated$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28002e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            SentenceEditPageFragment.C4294a c4294a = SentenceEditPageFragment.f27986E0;
            SentenceEditPageFragment sentenceEditPageFragment = this.f28003f;
            SentenceEditPageViewModel sentenceEditPageViewModelM10179o0 = sentenceEditPageFragment.m10179o0();
            C42981 c42981 = new C42981(sentenceEditPageFragment, null);
            this.f28002e = 1;
            if (C0062b.m369m0(sentenceEditPageViewModelM10179o0.f28019L, c42981, this) == coroutineSingletons) {
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
