package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import android.widget.Toast;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$11", m19206f = "VocabularyFragment.kt", m19207l = {365}, m19208m = "invokeSuspend")
public final class VocabularyFragment$onViewCreated$3$11 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26170e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyFragment f26171f;

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$11$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/a;", "exportMessageType", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyFragment$onViewCreated$3$11$1", m19206f = "VocabularyFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40091 extends SuspendLambda implements InterfaceC2056p<InterfaceC4029a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26172e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyFragment f26173f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40091(VocabularyFragment vocabularyFragment, InterfaceC9968c<? super C40091> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26173f = vocabularyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40091 c40091 = new C40091(this.f26173f, interfaceC9968c);
            c40091.f26172e = obj;
            return c40091;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC4029a interfaceC4029a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40091) mo1336a(interfaceC4029a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            int i10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC4029a interfaceC4029a = (InterfaceC4029a) this.f26172e;
            if (C5207g.m11106a(interfaceC4029a, InterfaceC4029a.a.f26330a)) {
                i10 = R.string.export_error;
            } else if (C5207g.m11106a(interfaceC4029a, InterfaceC4029a.c.f26332a)) {
                i10 = R.string.export_csv_message;
            } else {
                if (!C5207g.m11106a(interfaceC4029a, InterfaceC4029a.b.f26331a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = R.string.export_anki_message;
            }
            Toast.makeText(this.f26173f.m3578a0(), i10, 1).show();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFragment$onViewCreated$3$11(VocabularyFragment vocabularyFragment, InterfaceC9968c<? super VocabularyFragment$onViewCreated$3$11> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26171f = vocabularyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyFragment$onViewCreated$3$11(this.f26171f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyFragment$onViewCreated$3$11) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26170e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = VocabularyFragment.f26133G0;
            VocabularyFragment vocabularyFragment = this.f26171f;
            VocabularyViewModel vocabularyViewModelM10022q0 = vocabularyFragment.m10022q0();
            C40091 c40091 = new C40091(vocabularyFragment, null);
            this.f26170e = 1;
            if (C0062b.m369m0(vocabularyViewModelM10022q0.f26242c0, c40091, this) == coroutineSingletons) {
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
