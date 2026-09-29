package com.lingq.p055ui.imports.userImport;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p278nh.C7785l;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/ui/home/vocabulary/filter/VocabularyFilterSelectionAdapter$a;", "", "Lnh/l;", "items", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionViewModel$selectionItems$1", m19206f = "UserImportSelectionViewModel.kt", m19207l = {60}, m19208m = "invokeSuspend")
final class UserImportSelectionViewModel$selectionItems$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<VocabularyFilterSelectionAdapter.AbstractC4037a>>, List<? extends C7785l>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26754e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f26755f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f26756g;

    public UserImportSelectionViewModel$selectionItems$1(InterfaceC9968c<? super UserImportSelectionViewModel$selectionItems$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<VocabularyFilterSelectionAdapter.AbstractC4037a>> interfaceC7117d, List<? extends C7785l> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        UserImportSelectionViewModel$selectionItems$1 userImportSelectionViewModel$selectionItems$1 = new UserImportSelectionViewModel$selectionItems$1(interfaceC9968c);
        userImportSelectionViewModel$selectionItems$1.f26755f = interfaceC7117d;
        userImportSelectionViewModel$selectionItems$1.f26756g = list;
        return userImportSelectionViewModel$selectionItems$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26754e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f26755f;
            List list = this.f26756g;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new VocabularyFilterSelectionAdapter.AbstractC4037a.a((C7785l) it.next()));
            }
            arrayList.addAll(arrayList2);
            this.f26755f = null;
            this.f26754e = 1;
            if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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
