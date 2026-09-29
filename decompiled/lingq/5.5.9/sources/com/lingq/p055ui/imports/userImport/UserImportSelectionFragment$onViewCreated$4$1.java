package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter;
import java.util.List;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionFragment$onViewCreated$4$1", m19206f = "UserImportSelectionFragment.kt", m19207l = {82}, m19208m = "invokeSuspend")
public final class UserImportSelectionFragment$onViewCreated$4$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26696e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportSelectionFragment f26697f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ VocabularyFilterSelectionAdapter f26698g;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionFragment$onViewCreated$4$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/vocabulary/filter/VocabularyFilterSelectionAdapter$a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionFragment$onViewCreated$4$1$1", m19206f = "UserImportSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41041 extends SuspendLambda implements InterfaceC2056p<List<? extends VocabularyFilterSelectionAdapter.AbstractC4037a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26699e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ VocabularyFilterSelectionAdapter f26700f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41041(VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter, InterfaceC9968c<? super C41041> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26700f = vocabularyFilterSelectionAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41041 c41041 = new C41041(this.f26700f, interfaceC9968c);
            c41041.f26699e = obj;
            return c41041;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends VocabularyFilterSelectionAdapter.AbstractC4037a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41041) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26700f.m4529q((List) this.f26699e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportSelectionFragment$onViewCreated$4$1(VocabularyFilterSelectionAdapter vocabularyFilterSelectionAdapter, UserImportSelectionFragment userImportSelectionFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26697f = userImportSelectionFragment;
        this.f26698g = vocabularyFilterSelectionAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportSelectionFragment$onViewCreated$4$1(this.f26698g, this.f26697f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportSelectionFragment$onViewCreated$4$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26696e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportSelectionFragment.f26680E0;
            UserImportSelectionViewModel userImportSelectionViewModelM10094o0 = this.f26697f.m10094o0();
            C41041 c41041 = new C41041(this.f26698g, null);
            this.f26696e = 1;
            if (C0062b.m369m0(userImportSelectionViewModelM10094o0.f26725H, c41041, this) == coroutineSingletons) {
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
