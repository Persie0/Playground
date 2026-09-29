package com.lingq.p055ui.home.vocabulary.filter;

import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.Sort;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p181ii.C6332a;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionViewModel$networkCourseLessons$1", m19206f = "VocabularyFilterSelectionViewModel.kt", m19207l = {403, 405}, m19208m = "invokeSuspend")
final class VocabularyFilterSelectionViewModel$networkCourseLessons$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26473e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ VocabularyFilterSelectionViewModel f26474f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f26475g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSelectionViewModel$networkCourseLessons$1(VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel, int i10, InterfaceC9968c<? super VocabularyFilterSelectionViewModel$networkCourseLessons$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26474f = vocabularyFilterSelectionViewModel;
        this.f26475g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new VocabularyFilterSelectionViewModel$networkCourseLessons$1(this.f26474f, this.f26475g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyFilterSelectionViewModel$networkCourseLessons$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List<String> listM17252r;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26473e;
        VocabularyFilterSelectionViewModel vocabularyFilterSelectionViewModel = this.f26474f;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                vocabularyFilterSelectionViewModel.f26424I.setValue(Boolean.FALSE);
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            InterfaceC7116c<C6332a> interfaceC7116cMo6072r = vocabularyFilterSelectionViewModel.f26440h.mo6072r(this.f26475g);
            this.f26473e = 1;
            obj = FlowKt__ReduceKt.m14362c(interfaceC7116cMo6072r, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            C6332a c6332a = (C6332a) obj;
            InterfaceC2014g interfaceC2014g = vocabularyFilterSelectionViewModel.f26440h;
            String strMo498E1 = vocabularyFilterSelectionViewModel.mo498E1();
            int i11 = this.f26475g;
            Sort sort = Sort.Position;
            if (!C5207g.m11106a(c6332a != null ? c6332a.f36601g : null, "private")) {
                listM17252r = C5207g.m11106a(c6332a != null ? c6332a.f36601g : null, "shared") ? EmptyList.f38032a : C9000b.m17252r("netflix", "youtube");
            }
            this.f26473e = 2;
            if (interfaceC2014g.mo6071q(strMo498E1, i11, sort, listM17252r, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            vocabularyFilterSelectionViewModel.f26424I.setValue(Boolean.FALSE);
        } catch (Exception unused) {
        }
        return C9072e.f47360a;
    }
}
